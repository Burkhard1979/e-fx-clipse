package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.core.log.Log;
import at.bestsolution.efxclipse.runtime.core.log.Logger;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FuncTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NumberTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SymbolTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.UrlTok;
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
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.NodeType;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.ResultNode;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.State;
import at.bestsolution.efxclipse.tooling.css.extapi.Proposal;
import at.bestsolution.efxclipse.tooling.css.util.TokUtil;

import com.google.inject.Inject;
//import org.eclipse.swt.graphics.RGB;
//import org.eclipse.swt.widgets.ColorDialog;
//import org.eclipse.ui.PlatformUI;

public class CssExtParser {

	private @Inject ICssExtManager manager;
	
	private @Log("cssext.parser") Logger logger;
	
	private static enum ConsumeWS {
		MAY_CONSUME,
		MUST_CONSUME,
		NO_CONSUME;
	}
	
	private boolean relevant(CSSRule r) {
		return r instanceof CSSRuleConcat ||
				r instanceof CSSRuleOr ||
				r instanceof CSSRuleLiteral ||
				r instanceof CSSRuleSymbol ||
				r instanceof CSSRulePostfix || 
				r instanceof CSSType;
	}
	
	private ResultNode parse(ParserInputCursor input, CSSRule rule, ConsumeWS consumeWS) {
		Assert.isNotNull(rule, "rule must not be null");
		Assert.isNotNull(input, "input must not be null");
//		if (relevant(rule)) {
//			g.depth++;
//			g.node++;
//			print(g.depth, g.node, "-> " + l + " (rule = " + rule + ")");
//		}	
		ResultNode result = null;
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_BRACKET: result = parseBracket(input, (CSSRuleBracket)rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_REF: result = parseRef(input, (CSSRuleRef)rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_OR: result = parseOr(input, (CSSRuleOr) rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_XOR: result = parseConcatOr(input, (CSSRuleXor) rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result = parseConcat(input, (CSSRuleConcat) rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_CONCAT_WITHOUT_SPACE: result = parseConcatWithoutSpace(input, (CSSRuleConcatWithoutSpace) rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result = parseLiteral(input, (CSSRuleLiteral) rule, consumeWS); 
			break;
		case CssExtDslPackage.CSS_RULE_SYMBOL: result = parseSymbol(input, (CSSRuleSymbol) rule, consumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_POSTFIX: result = parsePostfix(input, (CSSRulePostfix) rule, consumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_REGEX: result = parseRegex(input, (CSSRuleRegex)rule, consumeWS);
			break;
		case CssExtDslPackage.CSS_TYPE: 
		case CssExtDslPackage.CSS_RANGED_DOUBLE_TYPE:
		case CssExtDslPackage.CSS_RANGED_INT_TYPE:
			result = parseType(input, (CSSType)rule, consumeWS);
			break;
		case CssExtDslPackage.CSS_RULE_FUNC: result = parseFunction(input, (CSSRuleFunc)rule, consumeWS); break;
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
	
	
	private ResultNode parseOr(ParserInputCursor input, CSSRuleOr or, ConsumeWS consumeWS) {
		ResultNode orResult = new ResultNode(NodeType.OR);
		orResult.remainingInput = input.copy();
		orResult.status = State.FORWARD;
		
		for (CSSRule rule : or.getOrs()) {
			ResultNode result = parse(input.copy(), rule, consumeWS);
			orResult.next.add(result);
		}
		
		return orResult;
	}
	
	// Concat
	private ResultNode parseConcat(ParserInputCursor l, CSSRuleConcat r, ConsumeWS consumeWS) {
		ResultNode concatResult = new ResultNode(NodeType.CONCAT);
		concatResult.remainingInput = l.copy();
		concatResult.status = State.FORWARD;
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			final CSSRule rule = ruleIt.next();
			final boolean isFirstRule = r.getConc().indexOf(rule) == 0;
			for (ResultNode last : concatResult.findLast()) {
				if (last.isValid()) {
					last.next.add(parse(last.remainingInput, rule, isFirstRule?consumeWS:ConsumeWS.MUST_CONSUME));
					
				}
			}

			
		}
		
		return concatResult;
	}
	
	// Concat without space
	private ResultNode parseConcatWithoutSpace(ParserInputCursor l, CSSRuleConcatWithoutSpace r, ConsumeWS consumeWS) {
		ResultNode concatResult = new ResultNode(NodeType.CONCAT_WITHOUT_SPACE);
		concatResult.remainingInput = l.copy();
		concatResult.status = State.FORWARD;
		
		Iterator<CSSRule> ruleIt = r.getConc().iterator();
		while (ruleIt.hasNext()) {
			final CSSRule rule = ruleIt.next();
			final boolean isFirstRule = r.getConc().indexOf(rule) == 0;
			for (ResultNode last : concatResult.findLast()) {
				if (last.isValid()) {
					last.next.add(parse(last.remainingInput, rule, isFirstRule?consumeWS:ConsumeWS.NO_CONSUME));
				}
			}
		}
		
		return concatResult;
	}
	
	private ResultNode parseBracket(ParserInputCursor in, CSSRuleBracket rule, ConsumeWS consumeWS) {
		return parse(in, rule.getInner(), consumeWS);
		
//		ResultNode result = new ResultNode();
//		result.nodeSymbol = "[]";
//		result.nodeName = "Bracket";
//		result.remainingInput = in.copy();
//		result.status = State.FORWARD;
//		
//		result.next.add(parse(in.copy(), rule.getInner(), consumeWS));
//		return result;
	}
	
	private ResultNode parsePostfix(ParserInputCursor in, CSSRulePostfix r, ConsumeWS consumeWS) {
		ResultNode result = null;
		if( r.getCardinality() != null && ! r.getCardinality().isEmpty() ) {
			switch (r.getCardinality().charAt(0)) {
			case '?':
				result = parseOptional(in, r.getRule(), consumeWS);
				break;
			case '*':
				result = parseStar(in, r.getRule(), consumeWS);
				break;
			case '+':
				result = parsePlus(in, r.getRule(), consumeWS);
				break;
			}	
		}
		return result;
	}
	
	private ResultNode parseOptional(ParserInputCursor in, CSSRule rule, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.OPTIONAL);
		result.remainingInput = in.copy();
		result.status = State.FORWARD;
		
		result.next.add(ResultNode.createSkipNode(result));
		result.next.add(parse(in.copy(), rule, consumeWS));
		
		return result;
	}
	
	private ResultNode parseStar(ParserInputCursor in, CSSRule rule, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.STAR);
		result.status = State.FORWARD;
		result.remainingInput = in.copy();
		
		Queue<ResultNode> last = new LinkedList<>();
		last.addAll(result.findLast());
		
		while (!last.isEmpty()) {
			ResultNode cur = last.poll();
			if (cur.isValid()) {
				ResultNode n = parse(cur.remainingInput.copy(), rule, consumeWS);
				
				last.addAll(n.findLast());
				
				cur.next.add(n);
				cur.next.add(ResultNode.createSkipNode(cur));
			}
			
		}
	
		return result;
	}
	
	
	private ResultNode parsePlus(ParserInputCursor in, CSSRule rule, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.PLUS);
		result.status = State.FORWARD;
		result.remainingInput = in.copy();
		
		// 1 - n
		Queue<ResultNode> last = new LinkedList<>();
		last.addAll(result.findLast());
		int iteration = 0;
		while (!last.isEmpty()) {
			ResultNode cur = last.poll();
			if (cur.isValid()) {
				
				ResultNode n = parse(cur.remainingInput.copy(), rule, consumeWS);
				cur.next.add(n);
				
				if (iteration >= 1) {
					cur.next.add(ResultNode.createSkipNode(cur));
				}
				
				iteration ++;
			}
			
		}
	
		return result;
	}
	
	
	private ResultNode parseType(ParserInputCursor l, CSSType type, ConsumeWS consumeWS) {
		ResultNode result = null;
		if ("@NUM".equals(type.getType())) {
			result = parseNUMType(l, type, consumeWS);
		}
		else if ("@INT".equals(type.getType())) {
			result = parseINTType(l, type, consumeWS);
		}
		else if ("@URL".equals(type.getType())) {
			result = parseURLType(l, type, consumeWS);
		}
		else {
			logger.error("type " + type + " not supported");
			throw new UnsupportedOperationException("type " + type + " not supported");
		}
		
		return result;
	}
	
	private ResultNode parseRegex(ParserInputCursor l, CSSRuleRegex r, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.REGEX);
		
		String regex = r.getRegex().replaceAll("\\$", "");
		
		
		ParserInputCursor localInput = l.copy();

		CssTok tok = localInput.pollNextToken();
		int wsConsumed = 0;
		if (consumeWS == ConsumeWS.MAY_CONSUME) {
			while (tok instanceof WSTok) {
				tok = localInput.pollNextToken();
				wsConsumed++;
			}
		}
		
		if (consumeWS == ConsumeWS.MUST_CONSUME) {
			if (wsConsumed > 0) {
				// ok
			}
			else {
				// invalid
				result.status = State.INVALID;
				
				return result;
			}
			
		}
		
		logger.debug("REGEX1 -> " + regex + " / / " + tok);
		
		if (tok instanceof ColorTok) {
			String s = ((ColorTok)tok).getValue();
			logger.debug("REGEX2 -> " + regex + " / / " + s);
			if (s.matches(regex)) {
				result.status = State.MATCH;
				result.matched = tok;
				result.remainingInput = localInput;
			}
			else {
				result.status = State.INVALID;
				result.remainingInput = localInput;
			}
		}
		else {
			result.status = State.INVALID;
			result.message = "expected color token";
		}
		
		return result;
	}
	
	private ResultNode parseRef(ParserInputCursor l, CSSRuleRef r, ConsumeWS consumeWS) {
		CSSRule rule =  manager.resolveReference(r);
		if (rule == null) {
			logger.debug("resolving rule ref " + r.getRef().getName() + " returned null (maybe a function?) !!!!!");
			ResultNode inv = new ResultNode(NodeType.REF);
			inv.status = State.INVALID;
			return inv;
		}
		
		ResultNode rv = parse(l, rule, consumeWS);
		
		//FIXME QnD for getting colors in
//		if( r.getRef() != null && "color".equals(r.getRef().getName())) {
//			ParseResult c = new ParseResult();
//			c.status = Status.PROPOSE;
//			c.remainingInput = l.copy();
//			DialogProposal p = new DialogProposal("Pick color ...") {
//				
//				@Override
//				public String openProposal() {
//					// needs to stay in gui bundle
////					ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
////					RGB rgb = dialog.open();
////					if( rgb != null ) {
////						return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
////					}
//					return null;
//				}
//			};
//			c.proposal = p;
//			rv.add(c);
//		}
		
		return rv;
	}
	
	// Xor
	// TODO check rule
	private ResultNode parseConcatOr(ParserInputCursor l, CSSRuleXor r, ConsumeWS consumeWS) {
		
//		ResultNode result = new ResultNode(NodeType.CONCAT_OR);
//		result.status = State.INVALID;
//		
//		// TODO impl this
//		for (CSSRule rule : r.getXors()) {
//			parse(l, rule, consumeWS);
//		}
//				
//		return result;
		
		ResultNode concatOrResult = new ResultNode(NodeType.CONCAT_OR);
		concatOrResult.remainingInput = l.copy();
		concatOrResult.status = State.FORWARD;
		
		Queue<CSSRule> rulesLeft = new LinkedList<>(r.getXors());
		
		int maxTests = rulesLeft.size();
		int testNo = 1;
		
		while (!rulesLeft.isEmpty() && testNo <= maxTests) {
			System.err.println(testNo + " <= " + maxTests);
			// pick rule
			final CSSRule rule = rulesLeft.poll();
			
			boolean match = false;
			//try on all
			for (ResultNode last : concatOrResult.findLast()) {
				if (last.isValid()) {
					ResultNode path = parse(last.remainingInput, rule, consumeWS);
					for (ResultNode pathEnd : path.findLast()) {
						if (pathEnd.isValid()) {
							match = true;
						}
					}
					last.next.add(path);
					if (!rulesLeft.isEmpty()) {
						// special skip node
						ResultNode skippy = new ResultNode(NodeType.CONCAT_OR);
						skippy.status = State.SKIP;
						skippy.remainingInput = last.remainingInput.copy();
						last.next.add(skippy);
					}
				}
			}

			if (!match) {
				// put the rule back
				rulesLeft.offer(rule);
				testNo++;
			}
			else {
				testNo = 1;
				maxTests = rulesLeft.size();
			}
		}
		
		return concatOrResult;
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
	
//	private boolean checkAllInvalid(List<ParseResult> results) {
//		boolean  invalid = true;
//		
//		for (ParseResult r : results) {
//			if (r.status != Status.INVALID) {
//				invalid = false;
//				break;
//			}
//		}
//		
//		return invalid;
//	}
	
	
	private Proposal createProposal(final String proposal) {
		return new Proposal() {
			
			@Override
			public String getProposal() {
				return proposal;
			}
			
			@Override
			public int getPriority() {
				return 0;
			}
			
			@Override
			public String getLabel() {
				return proposal;
			}
			
			@Override
			public String getImageUrl() {
				return null;
			}
			
			@Override
			public Object getAdditionalInfo() {
				return null;
			}
			
			@Override
			public Type getType() {
				return Type.Value;
			}
		};
	}
	
	private ResultNode parseFunction(ParserInputCursor in, CSSRuleFunc ruleFunc, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.FUNCTION);
		
		ParserInputCursor local = in.copy();
		
		CssTok tok;
		try {
			tok = consumeWS(local, consumeWS);
			
			if (tok == null) {
				result.status = State.PROPOSE;
				result.proposal = createProposal(ruleFunc.getName() + "()");
			}
			else {
				if (tok instanceof FuncTok) {
					// ok
					FuncTok fTok = (FuncTok) tok;
					String funcName = fTok.getName().getName();
					
					if (funcName.equals(ruleFunc.getName())) {
						result.status = State.MATCH; // func name ok, still need to match params
						result.matched = tok;
						ParserInput funcInput = new ParserInput(fTok.getParams());
						
//						List<ParseResult> paramResult = parse(g, funcInput.createCursor(), ruleFunc.getParams(), true);
						
//						logger.debug("paramResult= " + paramResult);
						
//						boolean paramsOk = false;
//						
//						for (ParseResult paramR : paramResult) {
//							if (paramR.status == Status.MATCH && paramR.remainingInput.isConsumed()) {
//								paramsOk = true;
//								break;
//							}
//						}
//						
//						if (paramsOk) {
//							r.remainingInput = local;
//							r.status = Status.MATCH;
//							
//							g.newSegment(ParseStatus.MATCH, fTok);
//						}
//						else {
//							// function parameters wrong
//							r.message = "recheck function params";
//							r.status = Status.INVALID;
//							
//							g.newSegment(ParseStatus.INVALID, fTok, "wrong parameters");
//						}
					}
					else {
						// invalid (wrong func)
						result.message = "expected " + ruleFunc.getName();
						result.status = State.INVALID;
					}
					
					
					
				}
				else {
					// invalid
					result.status = State.INVALID;
					result.message = "expected function";
				}
			}
			
		} catch (Exception e) {
			result.status = State.INVALID;
			result.message = "expected WS";
		}
		
		
		return result;
	}
	
	private ResultNode parseURLType(ParserInputCursor input, CSSType rule, ConsumeWS consumeWS) {
		final ResultNode result = new ResultNode(NodeType.TYPE_URL);
		ParserInputCursor local = input.copy();
		try {
			CssTok tok = consumeWS(local, consumeWS);
			if (tok != null) {
				if (tok instanceof UrlTok) {
					result.status = State.MATCH;
					result.matched = tok;
					result.remainingInput = local.copy();
				}
				else {
					result.status = State.INVALID;
					result.message = "expected url";
				}
			}
			else {
				result.status = State.PROPOSE;
				result.proposal = createProposal("url(http://efxclipse.org/)");
			}
		}
		catch (Exception e) {
			result.status = State.INVALID;
			result.message = "expected WS";
		}
		
		return result;
	}
	
	private ResultNode parseINTType(ParserInputCursor l, CSSType rule, ConsumeWS consumeWS) {
		final ResultNode result = new ResultNode(NodeType.TYPE_INT);

		ParserInputCursor local = l.copy();
		try {
			CssTok tok = consumeWS(local, consumeWS);
			if (tok != null) {
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
							result.matched = tok;
						}
						else {
							// invalid range
							result.status = State.INVALID;
							result.message = "invalid range";
							
						}
					}
					else {
						// ok
						result.remainingInput = local;
						result.status = State.MATCH;
						result.matched = tok;
					}
				}
				else {
					// invalid
					result.status = State.INVALID;
					
				}
			}
			else {
				result.status = State.PROPOSE;
				result.proposal = createProposal("0");
			}
		}
		catch (Exception e) {
			result.status = State.INVALID;
			result.message = e.getMessage();
		}
	
		return result;
	}
	
	private ResultNode parseNUMType(ParserInputCursor l, CSSType rule, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.TYPE_NUM);
		
		ParserInputCursor local = l.copy();
		
		try {
			CssTok tok = consumeWS(local, consumeWS);
			if (tok != null) {
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
							result.matched = tok;
						}
						else {
							// invalid range
							result.status = State.INVALID;
							result.message = "invalid range";
						}
					}
					else {
						// ok
						result.remainingInput = local;
						result.status = State.MATCH;
						result.matched = tok;
					}
				}
				else {
					// invalid
					result.status = State.INVALID;
					
				}
			}
			else {
				result.status = State.PROPOSE;
				result.proposal = createProposal("0.0");
			}
		}
		catch (Exception e) {
			result.status = State.INVALID;
			result.message = e.getMessage();
		}
		
		return result;
	}
	
	private CssTok consumeWS(ParserInputCursor input, ConsumeWS consumeWS) throws Exception {
		
		CssTok tok = input.pollNextToken();
		int wsConsumed = 0;
		if (consumeWS == ConsumeWS.MAY_CONSUME || consumeWS == ConsumeWS.MUST_CONSUME) {
			while (tok instanceof WSTok) {
				tok = input.pollNextToken();
				wsConsumed++;
			}
		}
		
		if (consumeWS == ConsumeWS.MUST_CONSUME) {
			if (wsConsumed > 0) {
				// ok
			}
			else {
				// invalid
				throw new Exception("expected whitespace");
			}
			
		}
		
		return tok;
		
	}

	// Literal
	private ResultNode parseLiteral(ParserInputCursor input, CSSRuleLiteral r, ConsumeWS consumeWS) {
		ResultNode result = new ResultNode(NodeType.LITERAL);
		
		ParserInputCursor local = input.copy();
		
		try {
			CssTok tok = consumeWS(local, consumeWS);
			
			if (tok != null) {
				String literal = r.getValue();
				
				if (matchCssTok(tok, literal)) {
					result.status = State.MATCH;
					System.err.println("setting matched on " + System.identityHashCode(result));
					result.matched = tok;
					result.remainingInput = local.copy();
					
				}
				else {
					result.status = State.INVALID;
					result.message = "expected " + literal;
				}
			}
			else {
				result.status = State.PROPOSE;
				result.proposal = createProposal(r.getValue());
			}
			
		}
		catch (Exception e) {
			result.status = State.INVALID;
			result.message = e.getMessage();
		}
		
		
		
		
		return result;
		
	}
	
	private ResultNode parseSymbol(ParserInputCursor l, CSSRuleSymbol r, ConsumeWS consumeWS) {
		final ResultNode result = new ResultNode(NodeType.SYMBOL);
		
		// This workaround allows symbol concatenation without whitespace
		if (consumeWS == ConsumeWS.MUST_CONSUME) {
			consumeWS = ConsumeWS.MAY_CONSUME;
		}
		
		final ParserInputCursor local = l.copy();
		
		try {
			CssTok tok = consumeWS(local, consumeWS);
			if (tok != null) {
				String symbol = r.getSymbol();
				if (matchCssTok(tok, symbol)) {
					// valid yay!
					result.status = State.MATCH;
					result.matched = tok;
					result.remainingInput = local.copy();
					
				}
				else {
					result.status = State.INVALID;
					result.message = "expected " + symbol;
				}
			}
			else {
				result.status = State.PROPOSE;
				result.proposal = createProposal(r.getSymbol());
			}
		}
		catch (Exception e) {
			result.status = State.INVALID;
			result.message = e.getMessage();
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
		
		// TODO for now we skip the prefixstring queries
		if (prefix.length() > 0) return Collections.emptyList();
		
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
			ParserInput input = new ParserInput(prefixToks);
			
			
			System.err.println("starting with input: " + input.createCursor());
			final long parseBegin = System.nanoTime();
			final ResultNode res = parse(input.createCursor(), def.getRule(), ConsumeWS.MAY_CONSUME);
			final long parseDuration = System.nanoTime() - parseBegin;
			logger.debug("parse needed " + String.format("%2.3f", parseDuration*10e-6) + "ms returned with " + res);
			
			for (ParseResultListener l : resultListener) {
				l.parseFinished(res);
			}
			
			//ResultNode.dbg(res);
			
			result.addAll(mapProposals(res));
//			result.addAll(findProposals(new LinkedList<CssTok>(prefixToks), prefix, def.getRule()));
		}
		else {
			result.add(createProposal("> no rule for " + propertyName + " found!"));
		}
		
		return result;
	}
	
	private List<Proposal> mapProposals(ResultNode result) {
		List<Proposal> proposals = new ArrayList<Proposal>();
		for (ResultNode r : result.findLast()) {
			if (r.status == State.PROPOSE) {
				proposals.add(r.proposal);
			}
		}
		return proposals;
	}
	
	public List<ValidationResult> validateProperty(String element, String propertyName, List<CssTok> tokens) {
		
		if (0==0) return Collections.emptyList();
		
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
			
			ParserInput input = new ParserInput(tokens);
			
			
			ResultNode res = parse(input.createCursor(), def.getRule(), ConsumeWS.MAY_CONSUME);
			
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
			
			
			logger.debug("valid = " + valid);
			logger.debug("lastToken = " + lastToken);
			
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			
//			if (g.getOverallStatus() == ParseStatus.MATCH) {
//				return Collections.emptyList();
//			}
//			else {
//				List<ParsePathTerminal> rr = g.getMessage(g);
//				for (ParsePathTerminal s : rr) {
//					ValidationResult r = new ValidationResult(ValidationStatus.ERROR, s.message, s.inputToken, null, -1);
//					results.add(r);
//				}
//				
//			}
			
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
	
	public static interface ParseResultListener {
		public void parseFinished(ResultNode result);
	}
	
	private Set<ParseResultListener> resultListener = new HashSet<>();
	public void addParseResultListener(ParseResultListener l) {
		resultListener.add(l);
	}
}
