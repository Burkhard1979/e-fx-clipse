package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.ui.PlatformUI;

import at.bestsolution.efxclipse.runtime.core.log.Log;
import at.bestsolution.efxclipse.runtime.core.log.Logger;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.DialogProposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationStatus;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorTok;
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
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParsePath;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParsePathSegment;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParsePathTerminal;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParseStatus;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParserInput;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParserInputCursor;
import at.bestsolution.efxclipse.tooling.css.util.TokUtil;

import com.google.inject.Inject;

/**
 * @deprecated replaced with {@link at.bestsolution.efxclipse.tooling.css.cssext.parser.CssExtParser}
 */
@Deprecated
public class CssExtParser {

	private @Inject CssExtManager manager;
	
	private @Log("cssext.parser") Logger logger;
	
	enum Status {
		MATCH,
		INVALID,
		SKIP,
		PROPOSE
		
	}
	
	private class ParseResult {
		ParserInputCursor remainingInput;
//		Set<Input> remainingInput = new HashSet<CssExtParser.Input>();;
		Status status;
		
		Proposal proposal;
		
		String message;
		
		boolean partial = false;
		
		@Override
		public String toString() {
			return status+"|"+remainingInput+"|"+proposal + "|" + partial + " (" + message +")";
		}
	}
	
	
	private class Input {
		
		Queue<CssTok> input;
		
		CssTok lastToken;
		
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
			lastToken = consume;
			Formatter f = new Formatter();
			logger.debug(f.format("INPUT: consuming %s", TokUtil.toString(consume)).toString());
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
	
	private List<ParseResult> parse(ParsePath path, ParserInputCursor input, CSSRule rule, boolean mayConsumeWS) {
		Assert.isNotNull(rule, "rule must not be null");
		Assert.isNotNull(input, "input must not be null");
//		if (relevant(rule)) {
//			g.depth++;
//			g.node++;
//			print(g.depth, g.node, "-> " + l + " (rule = " + rule + ")");
//		}	
		List<ParseResult> result = null;
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result = parseBracket(path, input, (CSSRuleBracket)rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_REF: result = parseRef(path, input, (CSSRuleRef)rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_OR: result = parseOr(path, input, (CSSRuleOr) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_XOR: result = parseConcatOr(path, input, (CSSRuleXor) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result = parseConcat(path, input, (CSSRuleConcat) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT_WITHOUT_SPACE: result = parseConcatWithoutSpace(path, input, (CSSRuleConcatWithoutSpace) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result = parseLiteral(path, input, (CSSRuleLiteral) rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_SYMBOL: result = parseSymbol(path, input, (CSSRuleSymbol) rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_POSTFIX: result = parsePostfix(path, input, (CSSRulePostfix) rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_REGEX: result = parseRegex(path, input, (CSSRuleRegex)rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_TYPE: 
		case CssExtDslPackage.CSS_RANGED_DOUBLE_TYPE:
		case CssExtDslPackage.CSS_RANGED_INT_TYPE:
			result = parseType(path, input, (CSSType)rule, mayConsumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_FUNC: result = parseFunction(path, input, (CSSRuleFunc)rule, mayConsumeWS); break;
		default:
			logger.warning(rule + " not implemented! (classifierID="+rule.eClass().getClassifierID()+")");
		}
//		if (relevant(rule)) {
//			print(g.depth, g.node, "<- " + result);
//			g.depth--;
//		}
		return result;
	}
	
	private void print(int depth, int node, String string) {
		String d = "";
		for (int i = 0; i < depth; i++) {
			d += " ";
		}
		
		logger.debug(d + depth + " " + string);
	}
	
	private List<ParseResult> parseType(ParsePath g, ParserInputCursor l, CSSType type, boolean mayConsumeWS) {
		List<ParseResult> result = null;
		if ("@NUM".equals(type.getType())) {
			result = parseNUMType(g, l, type, mayConsumeWS);
		}
		else if ("@INT".equals(type.getType())) {
			result = parseINTType(g, l, type, mayConsumeWS);
		}
		else {
			logger.error("type " + type + " not supported");
		}
		
		return result;
	}
	
	private List<ParseResult> parseRegex(ParsePath g, ParserInputCursor l, CSSRuleRegex r, boolean mayConsumeWS) {
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		String regex = r.getRegex().replaceAll("\\$", "");
		
		
		ParserInputCursor localInput = l.copy();
		
		
		CssTok tok = localInput.pollNextToken();
		if (mayConsumeWS) {
			while (tok instanceof WSTok) {
				g.newSegment(ParseStatus.MATCH, tok);
				tok = localInput.pollNextToken();
			}
		}
		logger.debug("REGEX1 -> " + regex + " / / " + tok);
		
		if (tok instanceof ColorTok) {
			String s = ((ColorTok)tok).getValue();
			logger.debug("REGEX2 -> " + regex + " / / " + s);
			if (s.matches(regex)) {
				ParseResult r1 = new ParseResult();
				r1.status = Status.MATCH;
				r1.remainingInput = localInput;
				result.add(r1);
				
				g.newSegment(ParseStatus.MATCH, tok);
			}
			else {
				ParseResult r1 = new ParseResult();
				r1.status = Status.INVALID;
				r1.remainingInput = localInput;
				result.add(r1);
				
				g.newSegment(ParseStatus.INVALID, tok);
			}
		}
		else {
			
			// expected color token
			g.newSegment(ParseStatus.INVALID, tok, "expected color hash");
		}
		
		return result;
	}
	
	private List<ParseResult> parseBracket(ParsePath g, ParserInputCursor input, CSSRuleBracket r, boolean mayConsumeWS) {
		return parse(g, input, r.getInner(), mayConsumeWS);
	}
	
	private List<ParseResult> parseRef(ParsePath g, ParserInputCursor l, CSSRuleRef r, boolean mayConsumeWS) {
		CSSRule rule =  manager.resolveReference(r);
		if (rule == null) {
			logger.debug("resolving rule ref " + r.getRef().getName() + " returned null (maybe a function?) !!!!!");
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
	private List<ParseResult> parseOr(ParsePath g, ParserInputCursor l, CSSRuleOr r, boolean mayConsumeWS) {
		
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		for (CSSRule orRule : r.getOrs()) {
			result.addAll(parse(g.newSubPath(r), l, orRule, mayConsumeWS));
		}
		
		return result;
	}
	
	// Xor
	private List<ParseResult> parseConcatOr(ParsePath g, ParserInputCursor l, CSSRuleXor r, boolean mayConsumeWS) {
		
		ParseResult result = new ParseResult();
		// TODO impl this
		for (CSSRule rule : r.getXors()) {
			parse(g, l, rule, mayConsumeWS);
		}
				
		return createSingletonList(result);
	}
	
	// Concat without space
	private List<ParseResult> parseConcatWithoutSpace(ParsePath g, ParserInputCursor l, CSSRuleConcatWithoutSpace r, boolean mayConsumeWS) {
		List<ParseResult> finalResult = new ArrayList<ParseResult>();
		
		List<ParserInputCursor> currentInput = new ArrayList<ParserInputCursor>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
			List<ParseResult> perRuleResult = new ArrayList<ParseResult>();
			
			for (ParserInputCursor in : currentInput) {
				logger.debug("going into " + rule);
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
	private List<ParseResult> parseConcat(ParsePath g, ParserInputCursor l, CSSRuleConcat r, boolean mayConsumeWS) {
		List<ParseResult> finalResult = new ArrayList<ParseResult>();
		
		List<ParserInputCursor> currentInput = new ArrayList<ParserInputCursor>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
			List<ParseResult> perRuleResult = new ArrayList<ParseResult>();
			
			for (ParserInputCursor in : currentInput) {
				
				// consume whitespaces
				CssTok peekTok = in.peekNextToken();
				while (peekTok instanceof WSTok) {
					WSTok tok = (WSTok) in.pollNextToken();
					g.newSegment(ParseStatus.MATCH, tok);
					peekTok = in.peekNextToken();
				}
				
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
	
//	private boolean recParsePostfix(ParsePath g, Set<Input> input, CSSRule rule, int min, int cur,  int max, Set<ParseResult> result) {
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
	
	private void parseOptional(ParsePath g, ParserInputCursor in, CSSRule rule, List<ParseResult> result, boolean mayConsumeWS) {
		
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
	
	private void parseStar(ParsePath g, ParserInputCursor in, CSSRule rule, List<ParseResult> result, int count, boolean mayConsumeWS) {
		
		// first iteraton
		if (count == 0) {
			logger.debug("1st");
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
			logger.debug("nth");
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
	private void parsePlus(ParsePath g, ParserInputCursor in, CSSRule rule, List<ParseResult> result, int count, boolean mayConsumeWS) {
	
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
	
	private List<ParseResult> parseFunction(ParsePath g, ParserInputCursor in, CSSRuleFunc ruleFunc, boolean mayConsumeWS) {
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		ParserInputCursor local = in.copy();
		
		ParseResult r = new ParseResult();
		if (local.isConsumed()) {
			r.status = Status.PROPOSE;
			r.proposal = new Proposal(ruleFunc.getName() + "()");
			result.add(r);
		}
		else {
			CssTok tok = local.pollNextToken();
			
			if (mayConsumeWS) {
				while (tok instanceof WSTok) {
					tok = local.pollNextToken();
				}
			}
			
			if (tok instanceof FuncTok) {
				// ok
				FuncTok fTok = (FuncTok) tok;
				String funcName = fTok.getName().getName();
				
				if (funcName.equals(ruleFunc.getName())) {
					
					g.newSegment(ParseStatus.MATCH, fTok);
					
					ParserInput funcInput = new ParserInput(fTok.getParams());
					
					List<ParseResult> paramResult = parse(g, funcInput.createCursor(), ruleFunc.getParams(), true);
					
					logger.debug("paramResult= " + paramResult);
					
//					boolean paramsOk = false;
//					
//					for (ParseResult paramR : paramResult) {
//						if (paramR.status == Status.MATCH && paramR.remainingInput.isConsumed()) {
//							paramsOk = true;
//							break;
//						}
//					}
//					
//					if (paramsOk) {
//						r.remainingInput = local;
//						r.status = Status.MATCH;
//						
//						g.newSegment(ParseStatus.MATCH, fTok);
//					}
//					else {
//						// function parameters wrong
//						r.message = "recheck function params";
//						r.status = Status.INVALID;
//						
//						g.newSegment(ParseStatus.INVALID, fTok, "wrong parameters");
//					}
					result.add(r);
				}
				else {
					// invalid (wrong func)
					r.message = "expected " + ruleFunc.getName();
					r.status = Status.INVALID;
					
					g.newSegment(ParseStatus.INVALID, fTok, "expected " + ruleFunc.getName() + "()");
					result.add(r);
				}
				
				
				
			}
			else {
				// invalid
				r.status = Status.INVALID;
				
				g.newSegment(ParseStatus.INVALID, null);
				result.add(r);
			}
		}
		
		
		
		
		
		return result;
	}
	
	private List<ParseResult> parsePostfix(ParsePath g, ParserInputCursor in, CSSRulePostfix r, boolean mayConsumeWS) {
		
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
	
	private List<ParseResult> parseINTType(ParsePath g, ParserInputCursor l, CSSType rule, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		ParserInputCursor local = l.copy();
		
		if (local.isConsumed()) {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal("0");
		}
		else {
		
				CssTok tok = local.pollNextToken();
			if (mayConsumeWS) {
				while (tok instanceof WSTok) {
					tok = local.pollNextToken();
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
						
						g.newSegment(ParseStatus.MATCH, numberTok);
					}
					else {
						// invalid range
						result.status = Status.INVALID;
						result.message = "invalid range";
						
						g.newSegment(ParseStatus.INVALID, numberTok);
					}
				}
				else {
					// ok
					result.remainingInput = local;
					result.status = Status.MATCH;
					
					g.newSegment(ParseStatus.MATCH, numberTok);
				}
			}
			else {
				// invalid
				result.status = Status.INVALID;
				
				g.newSegment(ParseStatus.INVALID, null);
			}
		}
	
		return createSingletonList(result);
	}
	
	private List<ParseResult> parseNUMType(ParsePath g, ParserInputCursor l, CSSType rule, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		ParserInputCursor local = l.copy();
		
		if (local.isConsumed()) {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal("0.0");
		}
		else {
		
			CssTok tok = local.pollNextToken();
			if (mayConsumeWS) {
				while (tok instanceof WSTok) {
					tok = local.pollNextToken();
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
						
						g.newSegment(ParseStatus.MATCH, numberTok);
					}
					else {
						// invalid range
						result.status = Status.INVALID;
						result.message = "invalid range";
						
						g.newSegment(ParseStatus.INVALID, numberTok);
					}
				}
				else {
					// ok
					result.remainingInput = local;
					result.status = Status.MATCH;
					
					g.newSegment(ParseStatus.MATCH, numberTok);
				}
			}
			else {
				// invalid
				result.status = Status.INVALID;
				
				g.newSegment(ParseStatus.INVALID, null);
			}
		}
	
		return createSingletonList(result);
	}

	// Literal
	private List<ParseResult> parseLiteral(ParsePath g, ParserInputCursor l, CSSRuleLiteral r, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		
		ParserInputCursor local = l.copy();
		
		if (!local.isConsumed()) {
			CssTok cur = local.pollNextToken();
			if (mayConsumeWS) {
				while (cur instanceof WSTok) {
					g.newSegment(ParseStatus.MATCH, cur);
					cur = local.pollNextToken();
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
				
				g.newSegment(ParseStatus.MATCH, cur);
			}
			else {
//				System.err.println("  -> invalid");
				result.status = Status.INVALID;
				
				g.newSegment(ParseStatus.INVALID, cur, "expected '" + literal + "'");
			}
		}
		else {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal(r.getValue());
		}
		
		return createSingletonList(result);
		
	}
	
	private List<ParseResult> parseSymbol(ParsePath g, ParserInputCursor l, CSSRuleSymbol r, boolean mayConsumeWS) {
		ParseResult result = new ParseResult();
		
		ParserInputCursor local = l.copy();
		
		if (!local.isConsumed()) {
			CssTok cur = local.pollNextToken();
			
			if (mayConsumeWS) {
				while (cur instanceof WSTok) {
					cur = local.pollNextToken();
				}
			}
			String symbol = r.getSymbol();
			
			if (matchCssTok(cur, symbol)) {
				// valid yay!
				result.status = Status.MATCH;
				result.remainingInput = local.copy();
				
				g.newSegment(ParseStatus.MATCH, cur);
			}
			else {
				result.status = Status.INVALID;
				
				g.newSegment(ParseStatus.INVALID, cur);
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
//		System.err.println("problem matching " + tok);
		return false;
	}
	
	public List<Proposal> findProposals(String element, String propertyName, List<CssTok> prefixToks, String prefix) {
		// debug output
		logger.debugf("findProposals( %s, %s )", element, propertyName, prefix);
		logger.debugf("prefixString: '%s'", prefix);
		if (prefixToks.isEmpty()) {
			logger.debug("prefixToks: none");
		}
		else {
			logger.debugf("prefixToks: \n *");
			Iterator<CssTok> iterator = prefixToks.iterator();
			while (iterator.hasNext()) {
				logger.debugf(" * %s", TokUtil.toString(iterator.next()));
			}
		}
		

		List<Proposal> result = new ArrayList<Proposal>();

		
		
		PropertyDefinition def = manager.findPropertyByName(propertyName);
		if (def != null) {
			ParsePath g = new ParsePath();
			
			ParserInput input = new ParserInput(prefixToks);
			
			List<ParseResult> res = parse(g, input.createCursor(), def.getRule(), true);
			logger.debug("parse returned with " + res);
			
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
		logger.debugf("validateProperty( %s, %s )", element, propertyName);
		if (tokens.isEmpty()) {
			logger.debugf("tokens: none");
		}
		else {
			logger.debug("tokens:");
			Iterator<CssTok> iterator = tokens.iterator();
			while (iterator.hasNext()) {
				logger.debugf(" * %s", TokUtil.toString(iterator.next()));
			}
		}
		
		PropertyDefinition def = manager.findPropertyByName(propertyName);
		if (def != null) {
			ParsePath g = new ParsePath();
			
			ParserInput input = new ParserInput(tokens);
			
			
			List<ParseResult> res = parse(g, input.createCursor(), def.getRule(), true);
			
			boolean valid = false;
			
			int lastInputIndex = -1;
			EObject lastToken = null;
			String msg = "so ned!";
			
//			for (ParseResult p : res) {
//				if (p.status == Status.PROPOSE) continue;
//				logger.debugf(" * %s", p.toString());
//				if (p.remainingInput != null) {
//					if (p.remainingInput.isConsumed()) {
//						logger.debug("  -> der da!");
//						if (p.status == Status.MATCH || p.status == Status.SKIP) {
//							valid = true;
//							break;
//						}
//					}
//					else {
//						int newlastInputIndex = p.remainingInput.getPosition();
//						lastInputIndex = Math.max(newlastInputIndex, lastInputIndex);
//						msg = p.message;
//						lastToken = p.remainingInput.peekNextToken();
//					}
//				}
//			}
			
			logger.debug(g.toString());
			
			logger.debug("valid = " + valid);
			logger.debug("lastToken = " + lastToken);
			
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			
			if (g.getOverallStatus() == ParseStatus.MATCH) {
				return Collections.emptyList();
			}
			else {
				List<ParsePathTerminal> rr = g.getMessage(g);
				for (ParsePathTerminal s : rr) {
					ValidationResult r = new ValidationResult(ValidationStatus.ERROR, s.message, s.inputToken, null, -1);
					results.add(r);
				}
				
			}
			
			return results;
			
//			if (valid) {
//				return Collections.emptyList();
//			}
//			else {
//				List<ValidationResult> results = new ArrayList<ValidationResult>();
//				logger.debug("returning validation result");
//				if (lastToken != null) {
//					
//					ValidationResult r = new ValidationResult(ValidationStatus.ERROR, msg, lastToken, null, 0);
//					results.add(r);
//				}
//				else {
//					ValidationResult r = new ValidationResult(ValidationStatus.ERROR, msg, null, null, lastInputIndex);
//					results.add(r);
//				}
//				
//				return results;
//			}
			
		}
		
		
		return null;
	}
}
