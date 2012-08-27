package at.bestsolution.efxclipse.tooling.css.cssext.ui.doc;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.xtext.XtextLinker;

import com.google.inject.Inject;
import com.google.inject.Injector;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.JavaDocParser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.Parser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.internal.CssExtDslActivator;

public class CssExtDocParser {

	@Inject XtextElementLinks elementLinks;
	
	public CssExtDocParser() {
		Injector i = CssExtDslActivator.getInstance().getInjector(CssExtDslActivator.AT_BESTSOLUTION_EFXCLIPSE_TOOLING_CSS_CSSEXT_CSSEXTDSL);
		i.injectMembers(this);
	}
	
	public String translateRule(CSSRule r) {
		System.err.println("translateRule " + r);
		String result = "";
		if (r instanceof CSSRuleOr) {
			Iterator<CSSRule> it =((CSSRuleOr) r).getOrs().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" | ";
				}
			}
		}
		else if (r instanceof CSSRuleConcat) {
			Iterator<CSSRule> it =((CSSRuleConcat) r).getConc().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" ";
				}
			}
		}
		else if (r instanceof CSSRuleBracket) {
			result +="[ " + translateRule(((CSSRuleBracket) r).getInner()) + " ]";
		}
		else if (r instanceof CSSRuleXor) {
			Iterator<CSSRule> it =((CSSRuleXor) r).getXors().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" || ";
				}
			}
		}
		else if (r instanceof CSSRuleLiteral) {
			result += ((CSSRuleLiteral) r).getValue();
		}
		else if (r instanceof CSSRuleRef) {
			result += elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, ((CSSRuleRef) r).getRef().eContainer(), "&lt;" + ((CSSRuleRef) r).getRef().getName() + "&gt;");
		}
		else if (r instanceof CSSRulePostfix) {
			result += translateRule(((CSSRulePostfix) r).getRule()) + ((CSSRulePostfix) r).getCardinality();
		}
		else if (r instanceof CSSRuleRegex) {
			result += ((CSSRuleRegex) r).getRegex();
		}
		else if (r instanceof CSSRuleSymbol) {
			result += ((CSSRuleSymbol) r).getSymbol();
		}
		else {
			if (r == null) result = "<code>null</code>";
			else result = r.getType();
		}
		return result;
	}
	
	public String getDocForProperty(String propertyName) {
		
		Parser parser = new Parser(URI.createPlatformResourceURI("test-project/test.cssext", true));
		
		for (final PropertyDefinition property : parser.findProperties()) {
			if (property.getName().equals(propertyName)) {
				String rule = "syntax = " +translateRule(property.getRule()) + "<br>";
				String javadoc =  prepareDoku(property.getDoku());
				String defaultVal = property.getDefault()==null?"":"default = " + property.getDefault() + "<br>";
				return "<p style=\"background:rgba(255,255,255,0.7);\">" + rule + "</p>"  + defaultVal + javadoc;
			}
		}
		
		return "no documentation found";
	}

	public String getDocumentation(EObject o) {
		if (o instanceof CSSRuleDefinition) {
			return getDocumentationForRule((CSSRuleDefinition) o);
		}
		return "no docs for " + o.eClass();
	}
	
	private String getDocumentationForRule(CSSRuleDefinition r) {
		String func = "";
		if (r.getFunc() != null) {
			CSSRuleFunc f = (CSSRuleFunc) r.getFunc();
			func = f.getName() + "(" + translateRule(f.getParams()) + ")";
		}
		String rule = "";
		if (r.getRule() != null) {
			rule = r.getName().getName()+" = " +translateRule(r.getRule());
		}
		
		String javadoc = prepareDoku(r.getDoku());
		return "<p style=\"background:rgba(255,255,255,0.7);\">" + func +  rule + "</p>" + javadoc;
	}

	public String getDocForElement(String elName) {
		Parser parser = new Parser(URI.createPlatformResourceURI("test-project/test.cssext", true));
		
		for (final ElementDefinition el : parser.findElements()) {
			if (el.getName().equals(elName)) {
				String javadoc =  prepareDoku(el.getDoku());
				return javadoc;
			}
		}
		
		return "no documentation found";
	}
	
		
	private String prepareDoku(Doku doku) {
		if (doku != null) {
			return new JavaDocParser().parse(doku.getContent());
		}
		return "not documented!";
	}
	
	
//	public static String getDocForPropertyx(String propertyName) {
//		
//		final CssExtDocParser p = new CssExtDocParser(URI.createPlatformResourceURI("test-project/test.cssext", true));
//		
//		return p.getDocForProperty(propertyName);
//		
//	}
	
}
