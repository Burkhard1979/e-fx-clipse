package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
//import org.eclipse.swt.graphics.RGB;
//import org.eclipse.swt.widgets.ColorDialog;
//import org.eclipse.ui.PlatformUI;

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
import at.bestsolution.efxclipse.tooling.css.cssext.ICssExtManager;
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
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.ResultNode;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.State;
import at.bestsolution.efxclipse.tooling.css.util.TokUtil;

import com.google.inject.Inject;

public class CssExtParser {

	private @Inject ICssExtManager manager;
	
	private @Log("cssext.parser") Logger logger;
	
	
	private boolean relevant(CSSRule r) {
		return r instanceof CSSRuleConcat ||
				r instanceof CSSRuleOr ||
				r instanceof CSSRuleLiteral ||
				r instanceof CSSRuleSymbol ||
				r instanceof CSSRulePostfix || 
				r instanceof CSSType;
	}
	
	private ResultNode parse(ParserInputCursor input, CSSRule rule, boolean mayConsumeWS) {
		Assert.isNotNull(rule, "rule must not be null");
		Assert.isNotNull(input, "input must not be null");
//		if (relevant(rule)) {
//			g.depth++;
//			g.node++;
//			print(g.depth, g.node, "-> " + l + " (rule = " + rule + ")");
//		}	
		ResultNode result = null;
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result = parseBracket(input, (CSSRuleBracket)rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_REF: result = parseRef(path, input, (CSSRuleRef)rule, mayConsumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_OR: result = parseOr(input, (CSSRuleOr) rule, mayConsumeWS); 
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
	
	private void parseOr(ResultNode<CSSRuleOr> result) {
		for (CSSRule orRule : result.rule.getOrs()) {
			ResultNode r = new ResultNode();
			r.rule = orRule;
			r.input = result.remainingInput.copy();
			parse(r);
			
			
			result.next.add(r);
		}
		
		ResultNode result = new ResultNode();
		result.nodeSymbol = "|";
		result.nodeName = "Or";
		for (CSSRule orRule : rule.getOrs()) {
			
			result.next.add(parse(in.copy(), rule, mayConsumeWS));
		}
		return result;
	}
	
	private ResultNode parseBracket(ParserInputCursor in, CSSRuleBracket rule, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		result.nodeSymbol = "[]";
		result.nodeName = "Bracket";
		result.next.add(parse(in.copy(), rule.getInner(), mayConsumeWS));
		return result;
	}
	
	private ResultNode parsePostfix(ParserInputCursor in, CSSRulePostfix r, boolean mayConsumeWS) {
		ResultNode result = null;
		if( r.getCardinality() != null && ! r.getCardinality().isEmpty() ) {
			switch (r.getCardinality().charAt(0)) {
			case '?':
				//execute 0-1
				result = parseOptional(in, r.getRule(), mayConsumeWS);
				break;
			case '*':
				// TODO execute 0-n
				result = parseStar(in, r.getRule(), result, 0, mayConsumeWS);
				break;
			case '+':
				// TODO execute 1-n
				result = parsePlus(in, r.getRule(), result, 0, mayConsumeWS);
				break;
			}	
		}
		return result;
	}
	
	private ResultNode parseOptional(ParserInputCursor in, CSSRule rule, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		
		
		return result;
	}
	
	private ResultNode parseType(ParsePath g, ParserInputCursor l, CSSType type, boolean mayConsumeWS) {
		ResultNode result = null;
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
	
	private ResultNode parseBracket(ParsePath g, ParserInputCursor input, CSSRuleBracket r, boolean mayConsumeWS) {
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
					// needs to stay in gui bundle
//					ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//					RGB rgb = dialog.open();
//					if( rgb != null ) {
//						return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
//					}
					return null;
				}
			};
			c.proposal = p;
			rv.add(c);
		}
		
		return rv;
	}
	
	// Or
	private ResultNode parseOr(ParsePath g, ParserInputCursor l, CSSRuleOr r, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		for (CSSRule orRule : r.getOrs()) {
			result.next.add(parse(g.newSubPath(r), l, orRule, mayConsumeWS));
		}
		return result;
	}
	
	// Xor
	private ResultNode parseConcatOr(ParsePath g, ParserInputCursor l, CSSRuleXor r, boolean mayConsumeWS) {
		
		ResultNode result = new ResultNode();
		// TODO impl this
		for (CSSRule rule : r.getXors()) {
			parse(g, l, rule, mayConsumeWS);
		}
				
		return result;
	}
	
	// Concat without space
	private ResultNode parseConcatWithoutSpace(ParsePath g, ParserInputCursor l, CSSRuleConcatWithoutSpace r, boolean mayConsumeWS) {
		ResultNode finalResult = new ResultNode();
		
		List<ParserInputCursor> currentInput = new ArrayList<ParserInputCursor>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
			ResultNode perRuleResult = new ResultNode();
			
			for (ParserInputCursor in : currentInput) {
				logger.debug("going into " + rule);
				perRuleResult.next.add(parse(g, in, rule, false));
			}
			
			currentInput.clear();
			for (ResultNode res : perRuleResult.next) {
				if (res.status == State.MATCH || res.status == State.SKIP) {
					currentInput.add(res.remainingInput);
				}
				
				if (res.status == State.PROPOSE) {
					finalResult.next.add(res);
				}
			}
			
			if (!ruleIt.hasNext()) {
				finalResult.next.add(perRuleResult);
			}
		}
		
		return finalResult;
	}
	
	// Concat
	private ResultNode parseConcat(ParsePath g, ParserInputCursor l, CSSRuleConcat r, boolean mayConsumeWS) {
		ResultNode finalResult = new ResultNode();
		
		List<ParserInputCursor> currentInput = new ArrayList<ParserInputCursor>();
		currentInput.add(l);
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			CSSRule rule = ruleIt.next();
			ResultNode perRuleResult = new ResultNode();
			
			for (ParserInputCursor in : currentInput) {
				
				// consume whitespaces
				CssTok peekTok = in.peekNextToken();
				while (peekTok instanceof WSTok) {
					WSTok tok = (WSTok) in.pollNextToken();
					g.newSegment(ParseStatus.MATCH, tok);
					peekTok = in.peekNextToken();
				}
				
				perRuleResult.next.add(parse(g, in, rule, mayConsumeWS));
				
			}
			
			currentInput.clear();
			for (ResultNode res : perRuleResult.next) {
				if (res.status == State.MATCH || res.status == State.SKIP) {
					currentInput.add(res.remainingInput);
				}
				
				if (res.status == State.PROPOSE) {
					finalResult.next.add(res);
				}
			}
			
			if (!ruleIt.hasNext()) {
				finalResult.next.add(perRuleResult);
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
	
	private ResultNode parseINTType(ParsePath g, ParserInputCursor l, CSSType rule, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		ParserInputCursor local = l.copy();
		
		if (local.isConsumed()) {
			result.status = State.PROPOSE;
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
						result.status = State.MATCH;
						
						g.newSegment(ParseStatus.MATCH, numberTok);
					}
					else {
						// invalid range
						result.status = State.INVALID;
						result.message = "invalid range";
						
						g.newSegment(ParseStatus.INVALID, numberTok);
					}
				}
				else {
					// ok
					result.remainingInput = local;
					result.status = State.MATCH;
					
					g.newSegment(ParseStatus.MATCH, numberTok);
				}
			}
			else {
				// invalid
				result.status = State.INVALID;
				
				g.newSegment(ParseStatus.INVALID, null);
			}
		}
	
		return result;
	}
	
	private ResultNode parseNUMType(ParsePath g, ParserInputCursor l, CSSType rule, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		
		ParserInputCursor local = l.copy();
		
		if (local.isConsumed()) {
			result.status = State.PROPOSE;
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
						result.status = State.MATCH;
						
						g.newSegment(ParseStatus.MATCH, numberTok);
					}
					else {
						// invalid range
						result.status = State.INVALID;
						result.message = "invalid range";
						
						g.newSegment(ParseStatus.INVALID, numberTok);
					}
				}
				else {
					// ok
					result.remainingInput = local;
					result.status = State.MATCH;
					
					g.newSegment(ParseStatus.MATCH, numberTok);
				}
			}
			else {
				// invalid
				result.status = State.INVALID;
				
				g.newSegment(ParseStatus.INVALID, null);
			}
		}
	
		return result;
	}

	// Literal
	private ResultNode parseLiteral(ParsePath g, ParserInputCursor l, CSSRuleLiteral r, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		
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
				result.status = State.MATCH;
				result.remainingInput = local.copy();
				
				g.newSegment(ParseStatus.MATCH, cur);
			}
			else {
//				System.err.println("  -> invalid");
				result.status = State.INVALID;
				
				g.newSegment(ParseStatus.INVALID, cur, "expected '" + literal + "'");
			}
		}
		else {
			result.status = State.PROPOSE;
			result.proposal = new Proposal(r.getValue());
		}
		
		return result;
		
	}
	
	private ResultNode parseSymbol(ParsePath g, ParserInputCursor l, CSSRuleSymbol r, boolean mayConsumeWS) {
		ResultNode result = new ResultNode();
		
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
				result.status = State.MATCH;
				result.remainingInput = local.copy();
				
				g.newSegment(ParseStatus.MATCH, cur);
			}
			else {
				result.status = State.INVALID;
				
				g.newSegment(ParseStatus.INVALID, cur);
			}
		}
		else {
			result.status = State.PROPOSE;
			result.proposal = new Proposal(r.getSymbol());
		}
		
		return result;
		
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
