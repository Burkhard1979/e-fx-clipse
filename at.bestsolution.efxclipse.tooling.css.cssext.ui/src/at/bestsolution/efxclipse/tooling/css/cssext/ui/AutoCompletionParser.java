package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSType;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;

import com.google.inject.Inject;

public class AutoCompletionParser {

	private @Inject CssExtManager manager;
	
	private class RulePath {
		boolean valid;
		List<CSSRule> path = new ArrayList<CSSRule>();
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((path == null) ? 0 : path.hashCode());
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
			RulePath other = (RulePath) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (path == null) {
				if (other.path != null)
					return false;
			} else if (!path.equals(other.path))
				return false;
			return true;
		}
		private AutoCompletionParser getOuterType() {
			return AutoCompletionParser.this;
		}
		
		@Override
		public String toString() {
			String output = "";
			for (CSSRule r : path) {
				output += r.getClass().getSimpleName() + " / ";
			}
			return output;
		}
		
	}
	
	private class ParseData {
		List<Proposal> proposals = new ArrayList<Proposal>();
		List<CssTok> prefixToks;
		String prefix;
		Queue<CssTok> parseToks;
		Map<CSSRule, Object> stateHolder = new HashMap<CSSRule, Object>();
		Set<RulePath> invalidPaths = new HashSet<RulePath>();
		int prefixTokIdx = 0;
		boolean propose = false;
		
		int curPos;
	}
	
	
	private Set<RulePath> parse(ParseData data, int pos, CSSRule rule) {
		Set<RulePath> result = new HashSet<RulePath>();
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result.addAll(parse(data, pos, (CSSRuleBracket)rule)); break;
		case CssExtDslPackage.CSS_RULE_REF: result.addAll(parse(data, pos, (CSSRuleRef)rule)); break;
		case CssExtDslPackage.CSS_RULE_OR: result.addAll(parse(data, pos, (CSSRuleOr) rule)); break;
		case CssExtDslPackage.CSS_RULE_XOR: result.addAll(parse(data, pos, (CSSRuleXor) rule)); break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result.addAll(parse(data, pos, (CSSRuleConcat) rule)); break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result.addAll(parse(data, pos, (CSSRuleLiteral) rule)); break;
		
		default:
			result = null;
		}
		
		return result;
	}
	
	private boolean isPathValid(ParseData data, RulePath path) {
		if (data.invalidPaths.isEmpty()) return true;
		else return !data.invalidPaths.contains(path);
	}
	
	private RulePath currentPath(CSSRule r) {
		RulePath path = new RulePath();
		EObject cur = r;
		while (cur instanceof CSSRule) {
			path.path.add((CSSRule)cur);
			cur = cur.eContainer();
		}
		Collections.reverse(path.path);
		return path;
	}
	
	private Set<RulePath> parse(ParseData data, int pos, CSSRuleBracket r) {
		return parse(data, pos, r.getInner());
	}
	
	private Set<RulePath> parse(ParseData data, int pos, CSSRuleRef r) {
		return parse(data, pos, manager.resolveReference(r));
	}
	
	// Or
	private Set<RulePath> parse(ParseData data, int pos, CSSRuleOr r) {
		System.err.println("#or");
		Set<RulePath> invalidPaths = new HashSet<RulePath>();
		RulePath currentPath = currentPath(r);
		
		
		if (isPathValid(data, currentPath)) {
			Set<RulePath> subresult = new HashSet<RulePath>();
			for (CSSRule rule : r.getOrs()) {
				subresult.addAll(parse(data, pos, rule));
			}
			
			for (RulePath rp : subresult) {
				System.err.println(" or subresult " + rp + " is " + rp.valid );
				if (!rp.valid) {
					invalidPaths.add(rp);
				}
			}
			// if all child paths are invalid, the current path is also invalid
			if (!subresult.isEmpty() && subresult.equals(invalidPaths)) {
				invalidPaths.add(currentPath);
			}
		}
		
		return invalidPaths;
	}
	
	// Xor
	private Set<RulePath> parse(ParseData data, int pos, CSSRuleXor r) {
		System.err.println("#xor -> rename to OrConcat");
		
		Set<RulePath> invalidPaths = new HashSet<RulePath>();
		
		for (CSSRule rule : r.getXors()) {
			parse(data, pos, rule);
		}
				
		return invalidPaths;
	}
	
	private int findNoWSIdx(ParseData data) {
		int nowsidx = 0;
		for (int i = 0; i < data.prefixTokIdx; i++) {
			CssTok tok = data.prefixToks.get(i);
			if (tok instanceof WSTok) continue;
			nowsidx++;
		}
		return nowsidx;
		
	}
	
	// Concat
	private Set<RulePath> parse(ParseData data, int pos, CSSRuleConcat r) {
		System.err.println("#concat");
		
		Set<RulePath> invalidPaths = new HashSet<RulePath>();
		
		invalidPaths.addAll(parse(data, 0, r.getConc().get(findNoWSIdx(data))));
		
		return invalidPaths;
	}
	
	// Literal
	private Set<RulePath> parse(ParseData data, int pos, CSSRuleLiteral r) {
		System.err.println("#literal");
		Set<RulePath> invalidPaths = new HashSet<RulePath>();
		RulePath currentPath = currentPath(r);
		currentPath.valid = true;
		
		if (pos != 0) {
			return invalidPaths;
		}
		
		if (data.prefixTokIdx < data.prefixToks.size()) {
			CssTok cur = data.prefixToks.get(data.prefixTokIdx);
			
			while (cur instanceof WSTok) {
				data.prefixTokIdx++;
				if (data.prefixTokIdx >= data.prefixToks.size()) break;
				cur = data.prefixToks.get(data.prefixTokIdx);
			}
			if (data.prefixTokIdx < data.prefixToks.size()) {
				String literal = r.getValue();
				
				System.err.println(" - tok: " + cur);
				System.err.println(" - literal: " + literal);
				
				if (matchCssTok(cur, literal)) {
					// valid yay!
					System.err.println("  -> valid");
				}
				else {
					System.err.println("  -> invalid");
					currentPath.valid = false;
					invalidPaths.add(currentPath);
				}
			}
		}
		
		if (data.propose) {
			data.proposals.add(new Proposal(r.getValue()));
		}
		
		return invalidPaths;
	}
	
	
	private boolean matchCssTok(CssTok tok, String literal) {
		if (tok instanceof IdentifierTok) {
			return literal.equals(((IdentifierTok)tok).getName());
		}
		System.err.println("problem matching " + tok);
		return false;
	}
	
	
	public List<Proposal> findProposals(String element, String propertyName, List<CssTok> prefixToks, String prefix) {
		System.err.println("findProposals " + element + ", " + propertyName + ", " + prefix);
		List<Proposal> result = new ArrayList<Proposal>();
		ParseData data = new ParseData();
		data.prefix = prefix;
		data.prefixToks = prefixToks;
		data.parseToks = new LinkedList<CssTok>(prefixToks);
		data.curPos = 0;
		PropertyDefinition def = manager.findPropertyByName(propertyName);
		if (def != null) {
			for (CssTok tok : prefixToks) {
				if (data.prefixTokIdx+1 >= prefixToks.size()) {
					break;
				}
				data.prefixTokIdx++;
				data.invalidPaths.addAll(parse(data, findNoWSIdx(data), def.getRule()));
				System.err.println(data.invalidPaths);
			}
			data.propose = true;
			parse(data, findNoWSIdx(data), def.getRule());
			
			result.addAll(data.proposals);
//			result.addAll(findProposals(new LinkedList<CssTok>(prefixToks), prefix, def.getRule()));
		}
		else {
			result.add(new Proposal("> no rule for " + propertyName + " found!"));
		}
		
		return result;
	}
	
	private List<Proposal> findProposals(String prefix, CSSRule rule) {
		List<Proposal> result;
		
		if (rule == null) {
			System.err.println("WARING: rule was null!");
			return new ArrayList<CssDialectExtension.Proposal>();
		}
		
		System.err.println( CssExtDslPackage.CSS_RULE_OR + " vs " + rule.eClass().getClassifierID());
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result = findBracketProposals(prefix, (CSSRuleBracket)rule); break;
		case CssExtDslPackage.CSS_RULE_REF: result = findRefProposals(prefix, (CSSRuleRef)rule); break;
		case CssExtDslPackage.CSS_RULE_OR: result = findOrProposals(prefix, (CSSRuleOr) rule); break;
		case CssExtDslPackage.CSS_RULE_XOR: result = findXorProposals(prefix, (CSSRuleXor) rule); break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result = findConcatProposals(prefix, (CSSRuleConcat) rule); break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result = findLiteralProposals(prefix, (CSSRuleLiteral) rule); break;
		case CssExtDslPackage.CSS_TYPE: result = findTypeProposals(prefix, (CSSType) rule); break;
		
		default:
			result = new ArrayList<CssDialectExtension.Proposal>();
		}
		
		return result;
	}
	
	private List<Proposal> findTypeProposals(String prefix, CSSType type) {
		List<Proposal> result = null;
		if ("@NUM".equals(type.getType())) {
			result = new ArrayList<CssDialectExtension.Proposal>();
			result.add(new Proposal(".0"));
			return result;
		}
		else if ("@INT".equals(type.getType())) {
			result = new ArrayList<CssDialectExtension.Proposal>();
			result.add(new Proposal("0"));
			return result;
		}
		return result;
	}
	
	private List<Proposal> findBracketProposals(String prefix, CSSRuleBracket r) {
		return findProposals(prefix, r.getInner());
	}
	
	private List<Proposal> findRefProposals(String prefix, CSSRuleRef r) {
		return findProposals(prefix, manager.resolveReference(r));
	}
	
	private List<Proposal> findOrProposals(String prefix, CSSRuleOr r) {
		System.err.println("#or");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		for (CSSRule rule : r.getOrs()) {
			result.addAll(findProposals(prefix, rule));
		}
				
		return result;
	}
	
	private List<Proposal> findXorProposals(String prefix, CSSRuleXor r) {
		System.err.println("#xor");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		for (CSSRule rule : r.getXors()) {
			result.addAll(findProposals(prefix, rule));
		}
				
		return result;
	}
	
	private List<Proposal> findConcatProposals(String prefix, CSSRuleConcat r) {
		System.err.println("#concat");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		result.addAll(findProposals(prefix, r.getConc().get(0))); // TODO determine which pos is current
		
		return result;
	}
	
	private List<Proposal> findLiteralProposals(String prefix, CSSRuleLiteral r) {
		System.err.println("#literal");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		result.add(new Proposal(r.getValue()));
		
		return result;
	}
}
