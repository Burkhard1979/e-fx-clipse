package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.omg.PortableInterceptor.INACTIVE;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class CssExtParser {

	private @Inject CssExtManager manager;
	
	enum Status {
		MATCH,
		INVALID,
		SKIP
		
	}
	
	private class ParseResult {
		Input remainingInput;
//		Set<Input> remainingInput = new HashSet<CssExtParser.Input>();;
		Status status;
	}
	
	private class GlobalData {
		List<Proposal> proposals = new ArrayList<Proposal>();
		int depth = 0;
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


		public Input copy() {
			Input clonedData = new Input(input);
			return clonedData;
		}
		
		@Override
		public String toString() {
			if (input.isEmpty()) {
				return "EMPTY";
			}
			String out = "";
			for (CssTok tok: input) {
				if (tok instanceof WSTok) {
					out += "WS, ";
				}
				else if (tok instanceof IdentifierTok) {
					out += "Id("+((IdentifierTok) tok).getId()+"), ";
				}
				else {
					out += tok.getClass().getSimpleName();
				}
			}
			return out;
		}
	}
	
	private List<ParseResult> parse(GlobalData g, Input l, CSSRule rule) {
		if (rule == null) {
			ParseResult dummy = new ParseResult();
			dummy.status = Status.CANCEL_STATUS;
			return dummy;
		}
		print(g.depth, "paring rule " + rule);
		
		if ("double".equals(rule.getType())) return parseDouble(g, l, rule);
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: return parse(g, l, (CSSRuleBracket)rule);
		case CssExtDslPackage.CSS_RULE_REF: return parse(g, l, (CSSRuleRef)rule);
		case CssExtDslPackage.CSS_RULE_OR: return parse(g, l, (CSSRuleOr) rule);
		case CssExtDslPackage.CSS_RULE_XOR: return parse(g, l, (CSSRuleXor) rule);
		case CssExtDslPackage.CSS_RULE_CONCAT: return parse(g, l, (CSSRuleConcat) rule);
		case CssExtDslPackage.CSS_RULE_LITERAL: return parse(g, l, (CSSRuleLiteral) rule);
		case CssExtDslPackage.CSS_RULE_POSTFIX: return parse(g, l, (CSSRulePostfix) rule);
		default:
			System.err.println("WARINING " + rule + " not implemented!");
			return null;
		}
	}
	
	private List<ParseResult> parseDouble(GlobalData g, Input l, CSSRule rule) {
		ParseResult result = new ParseResult();
		Input local = l.copy();
		
		CssTok tok = local.getNextTok();
		
		System.err.println(" tok = " + tok);
			
		result.remainingInput.add(local);
		result.status = Status.OK_STATUS;
		return result;
	}

	private void print(int depth, String string) {
		String d = "";
		for (int i = 0; i < depth; i++) {
			d += " ";
		}
		
		System.err.println(d+"# "+string);
	}
	
	private List<ParseResult> parse(GlobalData g, Input l, CSSRuleBracket r) {
		return parse(g, l, r.getInner());
	}
	
	private List<ParseResult> parse(GlobalData g, Input l, CSSRuleRef r) {
		return parse(g, l, manager.resolveReference(r));
	}
	
	// Or
	private List<ParseResult> parse(GlobalData g, Input l, CSSRuleOr r) {
		print(g.depth++, "or");
		
		List<ParseResult> result = new ArrayList<ParseResult>();
		
		for (CSSRule orRule : r.getOrs()) {
			result.addAll(parse(g, l, orRule));
		}
		
		g.depth--;
		return result;
	}
	
	// Xor
	private ParseResult parse(GlobalData g, Input l, CSSRuleXor r) {
		print(g.depth++, "xor");
		
		ParseResult result = new ParseResult();
		// TODO impl this
		for (CSSRule rule : r.getXors()) {
			parse(g, l, rule);
		}
				
		g.depth--;
		return result;
	}
	
//	private void recParseConcat(GlobalData g, Set<Input> input, Queue<CSSRule> rules, Set<ParseResult> result) {
//		if (rules.isEmpty()) {
//			return;
//		}
//		else {
//			CSSRule r = rules.poll();
//			print(g.depth, "recConc for " + input);
//			for (Input in : input) {
//				print(g.depth, "recConc " + in + " / " + r);
//				List<ParseResult> localResult = parse(g, in, r);
//				
//				if (rules.isEmpty()) {
//					// only add the last result
//					result.addAll(localResult);
//				}
//				
//				if (!rules.isEmpty() &&  !in.isConsumed()) {
//					// consume ws
//					print(g.depth, "consuming ws");
//					CssTok ws = in.getNextTok();
//					if (!(ws instanceof WSTok)) {
//						for (ParseResult concResult : localResult) {
//							concResult.status = Status.INVALID;
//						}
//					}
//				}
//				
//				recParseConcat(g, localResult.remainingInput, new LinkedList<CSSRule>(rules), result);
//			}
//		}
//	}
	
	
	private void rPConcat(GlobalData g, List<Input> input, Queue<CSSRule> rules, List<ParseResult> finalResult) {
		if (rules.isEmpty()) {
			return;
		}
		else {
			CSSRule rule = rules.poll();
			for (Input in : input) {
				List<ParseResult> curResults = parse(g, in, rule); 
				
				List<Input> nextInput = new ArrayList<CssExtParser.Input>();
				
				for (ParseResult curResult : curResults) {
					
					if (rules.isEmpty()) {
						// only add the last results
						finalResult.add(curResult);
					}
					if (curResult.status != Status.INVALID) {
						
						if (!rules.isEmpty() &&  !in.isConsumed()) {
							// consume ws
							print(g.depth, "consuming ws");
							CssTok ws = in.getNextTok();
							if (!(ws instanceof WSTok)) {
								curResult.status = Status.INVALID;
							}
						}
						nextInput.add(curResult.remainingInput);
					}
				}
				
				rPConcat(g, nextInput, rules, finalResult);
			}
		}
		
	}
	
	// Concat
	private List<ParseResult> parse(GlobalData g, Input l, CSSRuleConcat r) {
		print(g.depth++, "concat");

		List<Input> in = new ArrayList<CssExtParser.Input>();
		in.add(l);
		
		List<ParseResult> childResults = new ArrayList<CssExtParser.ParseResult>();
		
		rPConcat(g, in, new LinkedList<CSSRule>(r.getConc()), childResults);
		
		
		g.depth--;
		return childResults;
	}
	
	private final int n = Integer.MAX_VALUE;
	
	private boolean recParsePostfix(GlobalData g, Set<Input> input, CSSRule rule, int min, int cur,  int max, Set<ParseResult> result) {
		if (cur > max) return true;
		
		print(g.depth, "recPostfix for " + input);
			for (Input in : input) {
				print(g.depth, "recPostfix " + in);
				ParseResult localResult = parse(g, in, rule);
				
				if (localResult.status.getCode() == IStatus.CANCEL) {
					result.add(localResult);
				}
				
				if (!in.isConsumed()) {
					// consume ws
					print(g.depth, "consuming ws");
					CssTok ws = in.getNextTok();
					if (!(ws instanceof WSTok)) {
						localResult.status = Status.CANCEL_STATUS;
//						continue;
					}
				}
				
				boolean done = recParsePostfix(g, localResult.remainingInput, rule, min, cur + 1, max, result);
				
				if (done) {
					
				}
		}
			
		return false;
	}
	
	private ParseResult parse(GlobalData g, Input in, CSSRulePostfix r) {
		
		ParseResult result = new ParseResult();
		
		switch (r.getCardinality()) {
		case "?":
			// TODO execute 0-1
			parse(g, in, r.getRule());
			break;
		case "*":
			// TODO execute 0-n
			parse(g, in, r.getRule());
			break;
		case "+":
			// TODO execute 1-n
			parse(g, in, r.getRule());
			break;
		}
		
		return result;
	}
	
	// Literal
	private ParseResult parse(GlobalData g, Input l, CSSRuleLiteral r) {
		print(g.depth++, "literal (input is '" + l + "')");
		ParseResult result = new ParseResult();
		
		Input local = l.copy();
		
		if (!local.isConsumed()) {
			print(g.depth, "-> matching input token");
			CssTok cur = local.getNextTok();
			
			while (cur instanceof WSTok) {
				cur = local.getNextTok();
			}
			
			String literal = r.getValue();
			
			System.err.println(" - tok: " + cur);
			System.err.println(" - literal: " + literal);
			
			if (matchCssTok(cur, literal)) {
				// valid yay!
				System.err.println("  -> valid");
				result.status = Status.OK_STATUS;
				result.remainingInput.add(local.copy());
			}
			else {
				System.err.println("  -> invalid");
				result.status = Status.CANCEL_STATUS;
			}
		}
		else {
			print(g.depth, "-> only proposal");
			result.status = Status.OK_STATUS;
			g.proposals.add(new Proposal(r.getValue()));
		}
		
		print(g.depth, "literal returns input " + result.remainingInput);
		
		g.depth--;
		return result;
		
	}
	
	private boolean matchCssTok(CssTok tok, String literal) {
		if (tok instanceof IdentifierTok) {
			return literal.equals(((IdentifierTok)tok).getId());
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
			ParseResult res = parse(g, new Input(prefixToks), def.getRule());
			result.addAll(g.proposals);
//			result.addAll(findProposals(new LinkedList<CssTok>(prefixToks), prefix, def.getRule()));
		}
		else {
			result.add(new Proposal("> no rule for " + propertyName + " found!"));
		}
		
		return result;
	}
}
