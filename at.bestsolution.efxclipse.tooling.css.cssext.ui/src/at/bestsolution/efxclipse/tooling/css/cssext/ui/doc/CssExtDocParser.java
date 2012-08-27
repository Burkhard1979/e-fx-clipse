package at.bestsolution.efxclipse.tooling.css.cssext.ui.doc;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.ui.label.DeclarativeLabelProvider;
import org.eclipse.xtext.xtext.XtextLinker;
import org.w3c.dom.Element;

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
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.JavaDocParser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.Parser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.internal.CssExtDslActivator;

public class CssExtDocParser {

	@Inject private  XtextElementLinks elementLinks;
	
	@Inject private IQualifiedNameProvider nameProvider;

	@Inject private DeclarativeLabelProvider labelProvider;
	
	@Inject
	private IImageHelper imageHelper;
	
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
		PropertyDefinition property = findPropertyByName(propertyName);
		if (property != null) {
			String rule = "syntax = " +translateRule(property.getRule()) + "<br>";
			String javadoc =  prepareDoku(property.getDoku());
			String defaultVal = property.getDefault()==null?"":"default = " + property.getDefault() + "<br>";
			return "<p style=\"background:rgba(255,255,255,0.7);\">" + rule + "</p>"  + defaultVal + javadoc;
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
		ElementDefinition element = findElementByName(elName);
		if (element != null) {
			String javadoc =  prepareDoku(element.getDoku());
			return javadoc;
		}
		return "no documentation found";
	}
	
		
	private String prepareDoku(Doku doku) {
		if (doku != null) {
			return new JavaDocParser().parse(doku.getContent());
		}
		return "not documented!";
	}

	public String getDocHeadForProperty(String propertyName) {
		PropertyDefinition property = findPropertyByName(propertyName);
		if (property != null) {
			return getDocHeadForProperty(property);
		}
		return "<b>"+propertyName+"</b>";
	}
	
	public String getDocHeadForProperty(PropertyDefinition property) {
		ElementDefinition element = (ElementDefinition) property.eContainer();
		
		StringBuffer out = new StringBuffer();
		out.append("<nobr>");
		printImage(out, "property_16x16.png");
		printName(out, property.getName());
		printDefiningElement(out, element);
		out.append("</nobr>");
		System.err.println(out.toString());
		return out.toString();
	}

	public String getDocHeadForElement(String elName) {
		ElementDefinition element = findElementByName(elName);
		if (element != null) {
			return getDocHeadForElement(element);
		}
		return "<b>"+elName+"</b>";
	}
	
	private void printImage(StringBuffer out, String image) {
		URL bundleUrl = Platform.getBundle("at.bestsolution.efxclipse.tooling.css.ui").getEntry("icons/" + (String) image);
		 URL fileUrl = null;
	      try {
	        fileUrl = FileLocator.toFileURL(bundleUrl);
	      }
	      catch (IOException e) {
	        fileUrl = null;
	      }
		
		String url = fileUrl.toExternalForm();
		out.append("<img class=\"symbol\" src=\""+ url +"\"/>");
	}
	private void printName(StringBuffer out, String name) {
		out.append("<span class=\"name\"><b>" + name + "</b></span>");
	}
	private void printPackageDefinition(StringBuffer out, PackageDefinition pkg) {
		out.append("<span class=\"pkg\">(defined in " + elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, pkg, nameProvider.getFullyQualifiedName(pkg).toString()) + ")</span>");
	}
	private void printDefiningElement(StringBuffer out, ElementDefinition element) {
		out.append("<span class=\"pkg\">(defined in " + elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, element, nameProvider.getFullyQualifiedName(element).toString()) + ")</span>");
	}
	private void printSuperElements(StringBuffer out, List<ElementDefinition> superEls) {
		if (!superEls.isEmpty()) {
			out.append("<br/><span class=\"extends\">extends ");
			Iterator<ElementDefinition> supaIt = superEls.iterator();
			while (supaIt.hasNext()) {
				ElementDefinition supa = supaIt.next();
				out.append(elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, supa, supa.getName()));
				if (supaIt.hasNext()) {
					out.append(", ");
				}
			}
			out.append("</span>");
		}
	}
	
	public String getDocHeadForElement(ElementDefinition element) {
		
		PackageDefinition pkg = findPackage(element);
		
		StringBuffer out = new StringBuffer();
		out.append("<nobr>");
		printImage(out, "selector_16x16.png");
		printName(out, element.getName());
		out.append("&nbsp;");
		printPackageDefinition(out, pkg);
		out.append("</nobr>");
		out.append("<nobr>");
		printSuperElements(out, element.getSuper());
		out.append("</nobr>");
		System.err.println(out.toString());
		return out.toString();
	}
	
	private PackageDefinition findPackage(ElementDefinition element) {
		return (PackageDefinition) element.eContainer();
	}
	
	
	
	private PropertyDefinition findPropertyByName(String propertyName) {
		// TODO use global parser
		Parser parser = new Parser(URI.createPlatformResourceURI("test-project/test.cssext", true));
		
		for (final PropertyDefinition property : parser.findProperties()) {
			if (property.getName().equals(propertyName)) {
				return property;
			}
		}
		
		return null;
	}
	
	private ElementDefinition findElementByName(String elName) {
		// TODO use global parser
		Parser parser = new Parser(URI.createPlatformResourceURI("test-project/test.cssext", true));
		
		for (final ElementDefinition el : parser.findElements()) {
			if (el.getName().equals(elName)) {
				return el;
			}
		}
		return null;
	}

	public String getDocHead(EObject o) {
		if (o instanceof ElementDefinition) {
			return getDocHeadForElement((ElementDefinition)o);
		}
		else if (o instanceof PropertyDefinition) {
			return getDocHeadForProperty((PropertyDefinition)o);
		}
		
		return null;
	}
	
	
//	public static String getDocForPropertyx(String propertyName) {
//		
//		final CssExtDocParser p = new CssExtDocParser(URI.createPlatformResourceURI("test-project/test.cssext", true));
//		
//		return p.getDocForProperty(propertyName);
//		
//	}
	
}
