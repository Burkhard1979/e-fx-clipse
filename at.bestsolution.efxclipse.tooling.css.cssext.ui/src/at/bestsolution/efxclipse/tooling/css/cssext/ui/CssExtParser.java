package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.ui.PlatformUI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.DialogProposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationStatus;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FuncTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NumberTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SymbolTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcatWithoutSpace;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSType;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.util.TokUtil;

import com.google.inject.Inject;

public class CssExtParser {

	private @Inject CssExtManager manager;
	
	private static void log(String string) {
		System.err.println("PARSER: " + string);
	}
	private static void logf(String format, Object...args) {
		System.err.printf("PARSER: " + format , args);
		System.err.println();
	}
	
	
	enum Status {
		MATCH,
		INVALID,
		SKIP,
		PROPOSE
		
	}
	
	private class ParseResult {
		Input remainingInput;
//		Set<Input> remainingInput = new HashSet<CssExtParser.Input>();;
		Status status;
		
		Proposal proposal;
		
		String message;
		
		boolean partial = false;
		
		@Override
		public String toString() {
			return status+"|"+remainingInput+"|"+proposal + "|" + partial;
		}
	}
	
	private class GlobalData {
		List<Proposal> proposals = new ArrayList<Proposal>();
		int depth = 0;
		int node = 0;
	}
	
	private class Input {
		
		Queue<CssTok> input;
		
		public boolean isConsumed() {
			return input.isEmpty();
		}
		
		public Input(Queue<CssTok> tokens) {
			this.input = new LinkedList<CssTok>(tokens);
		}
		
		
		public Input(List<CssTok> tokens) {
			this.input = new LinkedList<CssTok>(tokens);
		}


		public CssTok getNextTok() {
			
			CssTok consume = input.poll();
			logf("INPUT: consuming %s", TokUtil.toString(consume));
			return consume;
		}
		
		public CssTok peekNextTok() {
			return input.peek();
		}


		public Input copy() {
			Input clonedData = new Input(input);
			return clonedData;
		}
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((input == null) ? 0 : input.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Input other = (Input) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (input == null) {
				if (other.input != null)
					return false;
			} else if (!input.equals(other.input))
				return false;
			return true;
		}

		@Override
		public String toString() {
			if (input.isEmpty()) {
				return "EMPTY";
			}
			StringBuffer out = new StringBuffer();
			Iterator<CssTok> it = input.iterator();
			while (it.hasNext()) {
				CssTok tok = it.next();
				if (tok instanceof WSTok) {
					out.append("WS");
				}
				else if (tok instanceof IdentifierTok) {
					out.append("'");
					out.append(((IdentifierTok) tok).getName());
					out.append("'");
				}
				else {
					out.append(tok.getClass().getSimpleName());
				}
				
				if (it.hasNext()) {
					out.append(" / ");
				}
			}
			return out.toString();
		}

		private CssExtParser getOuterType() {
			return CssExtParser.this;
		}
	}
	
	private List<ParseResult> createSingletonList(ParseResult r) {
		List<ParseResult> result = new ArrayList<ParseResult>();
		result.add(r);
		return result;
	}
	
	private boolean relevant(CSSRule r) {
		return r instanceof CSSRuleConcat ||
				r instanceof CSSRuleOr ||
				r instanceof CSSRuleLiteral ||
				r instanceof CSSRuleSymbol ||
				r instanceof CSSRulePostfix || 
				r instanceof CSSType;
	}
	
	private List<ParseResult> parse(GlobalData g, Input l, CSSRule rule, boolean mayConsumeWS) {
		Assert.isNotNull(rule, "rule must not be null");
		Assert.isNotNull(l, "input must not be null");
		if (relevant(rule)) {
			g.depth++;
			g.node++;
			print(g.depth, g.node, "-> " + l + " (rule = " + rule + ")");
		}	
		List<ParseResult> result = null;
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result = parseBracket(g, l, (CSSRuleBracket)rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_REF: result = parseRef(g, l, (CSSRuleRef)rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_OR: result = parseOr(g, l, (CSSRuleOr) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_XOR: result = parseConcatOr(g, l, (CSSRuleXor) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result = parseConcat(g, l, (CSSRuleConcat) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT_WITHOUT_SPACE: result = parseConcatWithoutSpace(g, l, (CSSRuleConcatWithoutSpace) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result = parseLiteral(g, l, (CSSRuleLiteral) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_SYMBOL: result = parseSymbol(g, l, (CSSRuleSymbol) rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_POSTFIX: result = parsePostfix(g, l, (CSSRulePostfix) rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_REGEX: result = parseRegex(g, l, (CSSRuleRegex)rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_TYPE: 
		case CssExtDslPackage.CSS_RANGED_DOUBLE_TYPE:
		case CssExtDslPackage.CSS_RANGED_INT_TYPE:
			result = parseType(g, l, (CSSType)rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_FUNC: result = parseFunction(g, l, (CSSRuleFunc)rule, mayConsumeWS); break;
		default:
			System.err.println("WARINING " + rule + " not implemented! (classifierID="+rule.eClass().getClassifierID()+")");
		}
		if (relevant(rule)) {
			print(g.depth, g.node, "<- " + result);
			g.depth--;
		}
		return result;
	}
	
	private void print(int depth, int node, String string) {
		String d = "";
		for (int i = 0; i < depth; i++) {
			d += " ";
		}
		
		logf("%s%d %s", d, depth, string);
	}
	
	private List<ParseResult> parseType(GlobalData g, Input l, CSSType type, boolean mayConsumeWS) {
		List<ParseResult> result = null;
		if ("@NUM".equals(type.getType())) {
			result = parseNUMType(g, l, type, mayConsumeWS);
		}
		else if ("@INT".equals(type.getType())) {
			result = parseINTType(g, l, type, mayConsumeWS);
		}
		else {
			System.err.println("ERROR: type " + type + " not supported");
		}
		
		return result;
	}
	
	private List<ParseResult> parseRegex(GlobalData g, Input l, CSSRuleRegex r, boolean mayConsumeWS) {
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		String regex = r.getRegex().replaceAll("\\$", "");
		
		
		Input localInput = l.copy();
		
		
		CssTok tok = localInput.getNextTok();
		if (mayConsumeWS) {
			while (tok instanceof WSTok) {
				tok = localInput.getNextTok();
			}
		}
		System.err.println("REGEX1 -> " + regex + " / / " + tok);
		
		if (tok instanceof ColorTok) {
			String s = ((ColorTok)tok).getValue();
			System.err.println("REGEX2 -> " + regex + " / / " + s);
			if (s.matches(regex)) {
				ParseResult r1 = new ParseResult();
				r1.status = Status.MATCH;
				r1.remainingInput = localInput;
				result.add(r1);
			}
			else {
				ParseResult r1 = new ParseResult();
				r1.status = Status.INVALID;
				r1.remainingInput = localInput;
				result.add(r1);
			}
		}
		
		return result;
	}
	
	private List<ParseResult> parseBracket(GlobalData g, Input l, CSSRuleBracket r, boolean mayConsumeWS) {
		return parse(g, l, r.getInner(), mayConsumeWS);
	}
	
	private List<ParseResult> parseRef(GlobalData g, Input l, CSSRuleRef r, boolean mayConsumeWS) {
		CSSRule rule =  manager.resolveReference(r);
		if (rule == null) {
			System.err.println("resolving rule ref " + r.getRef().getName() + " returned null (maybe a function?) !!!!!");
			ParseResult inv = new ParseResult();
			inv.status = Status.INVALID;
			return createSingletonList(inv);
		}
		
		List<ParseResult> rv = parse(g, l, rule, mayConsumeWS);
		
		//FIXME QnD for getting colors in
		if( r.getRef() != null && "color".equals(r.getRef().getName())) {
			ParseResult c = new ParseResult();
			c.status = Status.PROPOSE;
			c.remainingInput = l.copy();
			DialogProposal p = new DialogProposal("Pick color ...") {
				
				@Override
				public String openProposal() {
					ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
					RGB rgb = dialog.open();
					if( rgb != null ) {
						return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
					}
					return null;
				}
			};
			c.proposal = p;
			rv.add(c);
		}
		
		return rv;
	}
	
	// Or
	private List<ParseResult> parseOr(GlobalData g, Input l, CSSRuleOr r, boolean mayConsumeWS) {
		
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		for (CSSRule orRule : r.getOrs()) {
			result.addAll(parse(g, l, orRule, mayConsumeWS));
		}
		
		return result;
	}
	
	// Xor
	private List<ParseResult> parseConcatOr(GlobalData g, Input l, CSSRuleXor r, boolean mayConsumeWS) {
		
		ParseResult result = new ParseResult();
		// TODO impl this
		for (CSSRule rule : r.getXors()) {
			parse(g, l, rule, mayConsumeWS);
		}
				
		return createSingletonList(result);
	}
	
	// Concat without space
	private List<ParseResult> parseConcatWithoutSpace(GlobalData g, Input l, CSSRuleConcatWithoutSpace r, boolean mayConsumeWS) {
		List<ParseResult> finalResult = new ArrayList<ParseResult>();
		
		List<Input> currentInput = new ArrayList<Input>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
//			System.err.println("rule " + rule);
			List<ParseResult> perRuleResult = new ArrayList<ParseResult>();
			
			for (Input in : currentInput) {
//				logf(" consuming input " + in);
				System.err.println("going into " + rule);
				perRuleResult.addAll(parse(g, in, rule, false));
				
			}
			
			currentInput.clear();
			for (ParseResult res : perRuleResult) {
				if (res.status == Status.MATCH || res.status == Status.SKIP) {
					currentInput.add(res.remainingInput);
				}
				
				if (res.status == Status.PROPOSE) {
					finalResult.add(res);
				}
			}
			
			if (!ruleIt.hasNext()) {
				finalResult.addAll(perRuleResult);
			}
		}
		
		return finalResult;
	}
	
	// Concat
	private List<ParseResult> parseConcat(GlobalData g, Input l, CSSRuleConcat r, boolean mayConsumeWS) {
		List<ParseResult> finalResult = new ArrayList<ParseResult>();
		
		List<Input> currentInput = new ArrayList<Input>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
//			System.err.println("rule " + rule);
			List<ParseResult> perRuleResult = new ArrayList<ParseResult>();
			
			for (Input in : currentInput) {
				
				// consume whitespaces
				CssTok nextTok = in.peekNextTok();
				while (nextTok instanceof WSTok) {
					in.getNextTok();
					nextTok = in.peekNextTok();
				}
				
//				System.err.println(" in " + in);
				perRuleResult.addAll(parse(g, in, rule, mayConsumeWS));
				
			}
			
			currentInput.clear();
			for (ParseResult res : perRuleResult) {
				if (res.status == Status.MATCH || res.status == Status.SKIP) {
					currentInput.add(res.remainingInput);
				}
				
				if (res.status == Status.PROPOSE) {
					finalResult.add(res);
				}
			}
			
			if (!ruleIt.hasNext()) {
				finalResult.addAll(perRuleResult);
			}
		}
		
		return finalResult;
	}
	
	private final int n = Integer.MAX_VALUE;
	
//	private boolean recParsePostfix(GlobalData g, Set<Input> input, CSSRule rule, int min, int cur,  int max, Set<ParseResult> result) {
//		if (cur > max) return true;
//		
//		print(g.depth, "recPostfix for " + input);
//			for (Input in : input) {
//				print(g.depth, "recPostfix " + in);
//				ParseResult localResult = parse(g, in, rule);
//				
//				if (localResult.status.getCode() == IStatus.CANCEL) {
//					result.add(localResult);
//				}
//				
//				if (!in.isConsumed()) {
//					// consume ws
//					print(g.depth, "consuming ws");
//					CssTok ws = in.getNextTok();
//					if (!(ws instanceof WSTok)) {
//						localResult.status = Status.CANCEL_STATUS;
////						continue;
//					}
//				}
//				
//				boolean done = recParsePostfix(g, localResult.remainingInput, rule, min, cur + 1, max, result);
//				
//				if (done) {
//					
//				}
//		}
//			
//		return false;
//	}
	
	private void parseOptional(GlobalData g, Input in, CSSRule rule, List<ParseResult> result, boolean mayConsumeWS) {
		
		boolean maySkip = true;
		List<ParseResult> ruleResult = parse(g, in.copy(), rule, mayConsumeWS);
		
		if (!in.isConsumed()) {
			for (ParseResult r : ruleResult) {
				if (r.status == Status.PROPOSE && r.partial) {
					maySkip = false;
				} 
			}
		}
		
		if (maySkip) {
			ParseResult skip = new ParseResult();
			skip.status = Status.SKIP;
			skip.remainingInput = in.copy();
			result.add(skip);
		}
		
		result.addAll(ruleResult);
	}
	
	private boolean checkAllInvalid(List<ParseResult> results) {
		boolean  invalid = true;
		
		for (ParseResult r : results) {
			if (r.status != Status.INVALID) {
				invalid = false;
				break;
			}
		}
		
		return invalid;
	}
	
	private void parseStar(GlobalData g, Input in, CSSRule rule, List<ParseResult> result, int count, boolean mayConsumeWS) {
		
		// first iteraton
		if (count == 0) {
			System.err.println("1st");
			ParseResult skip = new ParseResult();
			skip.status = Status.SKIP;
			skip.remainingInput = in.copy();
			result.add(skip);
			
			List<ParseResult> firstResult = new ArrayList<ParseResult>();
			
			firstResult.addAll(parse(g, in, rule, mayConsumeWS));
			
			result.addAll(firstResult);
			
			for (ParseResult r : firstResult) {
				if (r.status == Status.MATCH || r.status == Status.SKIP) {
					parseStar(g, r.remainingInput, rule, result, count+1, mayConsumeWS);
				}
			}
			
		}
		// nth iteration
		else {
			System.err.println("nth");
			List<ParseResult> nResult = new ArrayList<ParseResult>();
			nResult = parse(g, in, rule, mayConsumeWS);
			
			for (ParseResult r : nResult){
				result.add(r);
				if (r.status == Status.MATCH || r.status == Status.SKIP) {
					parseStar(g, r.remainingInput, rule, result, count+1, mayConsumeWS);
				}
			}
			
		}
		
		
	}
	private void parsePlus(GlobalData g, Input in, CSSRule rule, List<ParseResult> result, int count, boolean mayConsumeWS) {
	
		// first iteraton
		if (count == 0) {
			List<ParseResult> firstResult = new ArrayList<ParseResult>();
			
			firstResult.addAll(parse(g, in, rule, mayConsumeWS));
			
			result.addAll(firstResult);
			
			for (ParseResult r : firstResult) {
				if (r.status != Status.INVALID) {
					parsePlus(g, r.remainingInput, rule, result, count+1, mayConsumeWS);
				}
			}
			
		}
		// nth iteration
		else {
			List<ParseResult> nResult = new ArrayList<ParseResult>();
			nResult = parse(g, in, rule, mayConsumeWS);
			
			for (ParseResult r : nResult){
				result.add(r);
				if (r.status != Status.INVALID) {
					parsePlus(g, r.remainingInput, rule, result, count+1, mayConsumeWS);
				}
			}
			
		}
		
		
	}
	
	private List<ParseResult> parseFunction(GlobalData g, Input in, CSSRuleFunc ruleFunc, boolean mayConsumeWS) {
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		Input local = in.copy();
		
		ParseResult r = new ParseResult();
		if (local.isConsumed()) {
			r.status = Status.PROPOSE;
			r.proposal = new Proposal("0");
		}
		else {
			CssTok tok = local.getNextTok();
			
			if (mayConsumeWS) {
				while (tok instanceof WSTok) {
					tok = local.getNextTok();
				}
			}
			
			if (tok instanceof FuncTok) {
				// ok
				FuncTok fTok = (FuncTok) tok;
				String funcName = fTok.getName().getName();
				
				if (funcName.equals(ruleFunc.getName())) {
					
					Input paramInput = new Input(fTok.getParams());
					
					List<ParseResult> paramResult = parse(g, paramInput, ruleFunc.getParams(), true);
					
					System.err.println("paramResult= " + paramResult);
					
					r.remainingInput = local;
					r.status = Status.MATCH;
					
				}
				else {
					// invalid (wrong func)
					r.status = Status.INVALID;
				}
				
				
				
			}
			else {
				// invalid
				r.status = Status.INVALID;
			}
		}
		
		
		
		
		
		return result;
	}
	
	private List<ParseResult> parsePostfix(GlobalData g, Input in, CSSRulePostfix r, boolean mayConsumeWS) {
		
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		if( r.getCardinality() != null && ! r.getCardinality().isEmpty() ) {
			switch (r.getCardinality().charAt(0)) {
			case '?':
				//execute 0-1
				parseOptional(g, in, r.getRule(), result, mayConsumeWS);
				break;
			case '*':
				// TODO execute 0-n
				parseStar(g, in, r.getRule(), result, 0, mayConsumeWS);
				break;
			case '+':
				// TODO execute 1-n
				parsePlus(g, in, r.getRule(), result, 0, mayConsumeWS);
				break;
			}	
		}
		
		
		return result;
	}
	
	private List<ParseResult> parseINTType(GlobalData g, Input l, CSSType rule, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		Input local = l.copy();
		
		if (local.isConsumed()) {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal("0");
		}
		else {
		
				CssTok tok = local.getNextTok();
			if (mayConsumeWS) {
				while (tok instanceof WSTok) {
					tok = local.getNextTok();
				}
			}
			
			if (tok instanceof NumberTok) {
				
				NumberTok numberTok = (NumberTok) tok;
				double number = numberTok.getVal();
				
				if (rule instanceof CSSRangedIntType) {
					CSSRangedIntType ranged = (CSSRangedIntType) rule;
					int min = ranged.getFrom();
					int max = ranged.getTo();
					
					if (min <= number && number <= max) {
						// ok
						result.remainingInput = local;
						result.status = Status.MATCH;
					}
					else {
						// invalid range
						result.status = Status.INVALID;
						result.message = "invalid range";
					}
				}
				else {
					// ok
					result.remainingInput = local;
					result.status = Status.MATCH;
				}
			}
			else {
				// invalid
				result.status = Status.INVALID;
			}
		}
	
		return createSingletonList(result);
	}
	
	private List<ParseResult> parseNUMType(GlobalData g, Input l, CSSType rule, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		Input local = l.copy();
		
		if (local.isConsumed()) {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal("0.0");
		}
		else {
		
			CssTok tok = local.getNextTok();
			if (mayConsumeWS) {
				while (tok instanceof WSTok) {
					tok = local.getNextTok();
				}
			}
			
			if (tok instanceof NumberTok) {
				// ok
				NumberTok numberTok = (NumberTok) tok;
				double number = numberTok.getVal();
				
				if (rule instanceof CSSRangedDoubleType) {
					CSSRangedDoubleType ranged = (CSSRangedDoubleType) rule;
					double min = ranged.getFrom();
					double max = ranged.getTo();
					
					if (min <= number && number <= max) {
						// ok
						result.remainingInput = local;
						result.status = Status.MATCH;
					}
					else {
						// invalid range
						result.status = Status.INVALID;
						result.message = "invalid range";
					}
				}
				else {
					// ok
					result.remainingInput = local;
					result.status = Status.MATCH;
				}
			}
			else {
				// invalid
				result.status = Status.INVALID;
			}
		}
	
		return createSingletonList(result);
	}

	// Literal
	private List<ParseResult> parseLiteral(GlobalData g, Input l, CSSRuleLiteral r, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		
		Input local = l.copy();
		
		if (!local.isConsumed()) {
			CssTok cur = local.getNextTok();
			if (mayConsumeWS) {
				while (cur instanceof WSTok) {
					cur = local.getNextTok();
				}
			}
			String literal = r.getValue();
			
//			System.err.println(" - tok: " + cur);
//			System.err.println(" - literal: " + literal);
			
			if (matchCssTok(cur, literal)) {
				// valid yay!
//				System.err.println("  -> valid");
				result.status = Status.MATCH;
				result.remainingInput = local.copy();
			}
			else {
//				System.err.println("  -> invalid");
				result.status = Status.INVALID;
			}
		}
		else {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal(r.getValue());
		}
		
		return createSingletonList(result);
		
	}
	
	private List<ParseResult> parseSymbol(GlobalData g, Input l, CSSRuleSymbol r, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		
		Input local = l.copy();
		
		if (!local.isConsumed()) {
			CssTok cur = local.getNextTok();
			
			if (mayConsumeWS) {
				while (cur instanceof WSTok) {
					cur = local.getNextTok();
				}
			}
			String symbol = r.getSymbol();
			
			if (matchCssTok(cur, symbol)) {
				// valid yay!
				result.status = Status.MATCH;
				result.remainingInput = local.copy();
			}
			else {
				result.status = Status.INVALID;
			}
		}
		else {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal(r.getSymbol());
		}
		
		return createSingletonList(result);
		
	}
	
	private boolean matchCssTok(CssTok tok, String literal) {
		if (tok instanceof IdentifierTok) {
			return literal.equals(((IdentifierTok)tok).getName());
		}
		else if (tok instanceof SymbolTok) {
			return literal.equals(((SymbolTok)tok).getSymbol());
		}
		System.err.println("problem matching " + tok);
		return false;
	}
	
	public List<Proposal> findProposals(String element, String propertyName, List<CssTok> prefixToks, String prefix) {
		// debug output
		logf("findProposals( %s, %s )", element, propertyName, prefix);
		logf("prefixString: '%s'", prefix);
		if (prefixToks.isEmpty()) {
			logf("prefixToks: none");
		}
		else {
			logf("prefixToks: \n * %s", TokUtil.toString(prefixToks, "\n * "));
		}
		

		List<Proposal> result = new ArrayList<Proposal>();

		
		
		PropertyDefinition def = manager.findPropertyByName(propertyName);
		if (def != null) {
			GlobalData g = new GlobalData();
			List<ParseResult> res = parse(g, new Input(prefixToks), def.getRule(), true);
			System.err.println("parse returned with " + res);
			
			result.addAll(mapProposals(res));
//			result.addAll(findProposals(new LinkedList<CssTok>(prefixToks), prefix, def.getRule()));
		}
		else {
			result.add(new Proposal("> no rule for " + propertyName + " found!"));
		}
		
		return result;
	}
	
	private List<Proposal> mapProposals(List<ParseResult> result) {
		List<Proposal> proposals = new ArrayList<Proposal>();
		for (ParseResult r : result) {
			if (r.status == Status.PROPOSE) {
				proposals.add(r.proposal);
			}
		}
		return proposals;
	}
	public List<ValidationResult> validateProperty(String element, String propertyName, List<CssTok> tokens) {
		// debug output
		logf("validateProperty( %s, %s )", element, propertyName);
		if (tokens.isEmpty()) {
			logf("tokens: none");
		}
		else {
			logf("tokens: \n * %s", TokUtil.toString(tokens, "\n * "));
		}
		
		PropertyDefinition def = manager.findPropertyByName(propertyName);
		if (def != null) {
			GlobalData g = new GlobalData();
			List<ParseResult> res = parse(g, new Input(tokens), def.getRule(), true);
			
			boolean valid = false;
			
			int lastInputIndex = -1;
			
			
			for (ParseResult p : res) {
				if (p.status == Status.PROPOSE) continue;
				logf(" * %s", p.toString());
				if (p.remainingInput != null) {
					if (p.remainingInput.isConsumed()) {
						log("  -> der da!");
						if (p.status == Status.MATCH || p.status == Status.SKIP) {
							valid = true;
							break;
						}
					}
					else {
						int newlastInputIndex = tokens.size() - p.remainingInput.input.size();
						lastInputIndex = Math.max(newlastInputIndex, lastInputIndex);
					}
				}
			}
			
			if (valid) {
				return Collections.emptyList();
			}
			else {
				System.err.println("returning validation result");
				ValidationResult r = new ValidationResult(ValidationStatus.ERROR, "so nicht mein freund", null, null, lastInputIndex);
				
				return Collections.singletonList(r);
			}
			
		}
		
		
		return null;
	}
}
