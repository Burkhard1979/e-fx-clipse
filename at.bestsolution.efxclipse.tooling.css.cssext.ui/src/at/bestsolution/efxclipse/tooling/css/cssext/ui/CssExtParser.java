package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.core.runtime.Assert;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NumberTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SymbolTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;

import com.google.inject.Inject;

public class CssExtParser {

	private @Inject CssExtManager manager;
	
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
			return input.poll();
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
					out.append(((IdentifierTok) tok).getId());
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
				"double".equals(r.getType());
	}
	
	private List<ParseResult> parse(GlobalData g, Input l, CSSRule rule) {
		Assert.isNotNull(rule, "rule must not be null");
		Assert.isNotNull(l, "input must not be null");
		if (relevant(rule)) {
			g.depth++;
			g.node++;
			print(g.depth, g.node, "-> " + l + " (rule = " + rule + ")");
		}	
		List<ParseResult> result = null;
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result = parseBracket(g, l, (CSSRuleBracket)rule); 
			break;
		case CssExtDslPackage.CSS_RULE_REF: result = parseRef(g, l, (CSSRuleRef)rule); 
			break;
		case CssExtDslPackage.CSS_RULE_OR: result = parseOr(g, l, (CSSRuleOr) rule); 
			break;
		case CssExtDslPackage.CSS_RULE_XOR: result = parseConcatOr(g, l, (CSSRuleXor) rule); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result = parseConcat(g, l, (CSSRuleConcat) rule); 
			break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result = parseLiteral(g, l, (CSSRuleLiteral) rule); 
			break;
		case CssExtDslPackage.CSS_RULE_SYMBOL: result = parseSymbol(g, l, (CSSRuleSymbol) rule);
			break;
		case CssExtDslPackage.CSS_RULE_POSTFIX: result = parsePostfix(g, l, (CSSRulePostfix) rule);
			break;
		default:
			if ("double".equals(rule.getType())) result = parseDouble(g, l, rule);
			else System.err.println("WARINING " + rule + " not implemented! (classifierID="+rule.eClass().getClassifierID()+")");
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
		
		System.err.println(d+ depth+" "+string);
	}
	
	private List<ParseResult> parseBracket(GlobalData g, Input l, CSSRuleBracket r) {
		return parse(g, l, r.getInner());
	}
	
	private List<ParseResult> parseRef(GlobalData g, Input l, CSSRuleRef r) {
		CSSRule rule =  manager.resolveReference(r);
		if (rule == null) {
			System.err.println("resolving rule ref " + r.getRef().getName() + " returned null (maybe a function?) !!!!!");
			ParseResult inv = new ParseResult();
			inv.status = Status.INVALID;
			return createSingletonList(inv);
		}
		return parse(g, l, rule);
	}
	
	// Or
	private List<ParseResult> parseOr(GlobalData g, Input l, CSSRuleOr r) {
		
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		for (CSSRule orRule : r.getOrs()) {
			result.addAll(parse(g, l, orRule));
		}
		
		return result;
	}
	
	// Xor
	private List<ParseResult> parseConcatOr(GlobalData g, Input l, CSSRuleXor r) {
		
		ParseResult result = new ParseResult();
		// TODO impl this
		for (CSSRule rule : r.getXors()) {
			parse(g, l, rule);
		}
				
		return createSingletonList(result);
	}
	
	// Concat
	private List<ParseResult> parseConcat(GlobalData g, Input l, CSSRuleConcat r) {
		List<ParseResult> finalResult = new ArrayList<ParseResult>();
		
		List<Input> currentInput = new ArrayList<Input>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
			System.err.println("rule " + rule);
			List<ParseResult> perRuleResult = new ArrayList<ParseResult>();
			
			for (Input in : currentInput) {
				System.err.println(" in " + in);
				perRuleResult.addAll(parse(g, in, rule));
				
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
	
	private void parseOptional(GlobalData g, Input in, CSSRule rule, List<ParseResult> result) {
		
		boolean maySkip = true;
		List<ParseResult> ruleResult = parse(g, in.copy(), rule);
		
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
	
	private void parseStar(GlobalData g, Input in, CSSRule rule, List<ParseResult> result, int count) {
		
		// first iteraton
		if (count == 0) {
			System.err.println("1st");
			ParseResult skip = new ParseResult();
			skip.status = Status.SKIP;
			skip.remainingInput = in.copy();
			result.add(skip);
			
			List<ParseResult> firstResult = new ArrayList<ParseResult>();
			
			firstResult.addAll(parse(g, in, rule));
			
			result.addAll(firstResult);
			
			for (ParseResult r : firstResult) {
				if (r.status == Status.MATCH || r.status == Status.SKIP) {
					parseStar(g, r.remainingInput, rule, result, count+1);
				}
			}
			
		}
		// nth iteration
		else {
			System.err.println("nth");
			List<ParseResult> nResult = new ArrayList<ParseResult>();
			nResult = parse(g, in, rule);
			
			for (ParseResult r : nResult){
				result.add(r);
				if (r.status == Status.MATCH || r.status == Status.SKIP) {
					parseStar(g, r.remainingInput, rule, result, count+1);
				}
			}
			
		}
		
		
	}
	private void parsePlus(GlobalData g, Input in, CSSRule rule, List<ParseResult> result, int count) {
	
		// first iteraton
		if (count == 0) {
			List<ParseResult> firstResult = new ArrayList<ParseResult>();
			
			firstResult.addAll(parse(g, in, rule));
			
			result.addAll(firstResult);
			
			for (ParseResult r : firstResult) {
				if (r.status != Status.INVALID) {
					parsePlus(g, r.remainingInput, rule, result, count+1);
				}
			}
			
		}
		// nth iteration
		else {
			List<ParseResult> nResult = new ArrayList<ParseResult>();
			nResult = parse(g, in, rule);
			
			for (ParseResult r : nResult){
				result.add(r);
				if (r.status != Status.INVALID) {
					parsePlus(g, r.remainingInput, rule, result, count+1);
				}
			}
			
		}
		
		
	}
	
	
	private List<ParseResult> parsePostfix(GlobalData g, Input in, CSSRulePostfix r) {
		
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		switch (r.getCardinality()) {
		case "?":
			//execute 0-1
			parseOptional(g, in, r.getRule(), result);
			break;
		case "*":
			// TODO execute 0-n
			parseStar(g, in, r.getRule(), result, 0);
			break;
		case "+":
			// TODO execute 1-n
			parsePlus(g, in, r.getRule(), result, 0);
			break;
		}
		
		return result;
	}
	
	private List<ParseResult> parseDouble(GlobalData g, Input l, CSSRule rule) {
		ParseResult result = new ParseResult();
		Input local = l.copy();
		
		if (local.isConsumed()) {
			result.status = Status.PROPOSE;
			result.proposal = new Proposal("0.0");
		}
		else {
		
			CssTok tok = local.getNextTok();
			while (tok instanceof WSTok) {
				tok = local.getNextTok();
			}
			
			if (tok instanceof NumberTok) {
				// ok
				result.remainingInput = local;
				result.status = Status.MATCH;
			}
			else {
				// invalid
				result.status = Status.INVALID;
			}
		}
	
		return createSingletonList(result);
	}

	// Literal
	private List<ParseResult> parseLiteral(GlobalData g, Input l, CSSRuleLiteral r) {
		ParseResult result = new ParseResult();
		
		Input local = l.copy();
		
		if (!local.isConsumed()) {
			CssTok cur = local.getNextTok();
			
			while (cur instanceof WSTok) {
				cur = local.getNextTok();
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
	
	private List<ParseResult> parseSymbol(GlobalData g, Input l, CSSRuleSymbol r) {
		ParseResult result = new ParseResult();
		
		Input local = l.copy();
		
		if (!local.isConsumed()) {
			CssTok cur = local.getNextTok();
			
			while (cur instanceof WSTok) {
				cur = local.getNextTok();
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
			return literal.equals(((IdentifierTok)tok).getId());
		}
		else if (tok instanceof SymbolTok) {
			return literal.equals(((SymbolTok)tok).getSymbol());
		}
		System.err.println("problem matching " + tok);
		return false;
	}
	
	public List<Proposal> findProposals(String element, String propertyName, List<CssTok> prefixToks, String prefix) {
		System.err.println("findProposals " + element + ", " + propertyName + ", " + prefix);
		List<Proposal> result = new ArrayList<Proposal>();

		
		
		PropertyDefinition def = manager.findPropertyByName(propertyName);
		if (def != null) {
			GlobalData g = new GlobalData();
			List<ParseResult> res = parse(g, new Input(prefixToks), def.getRule());
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
}
