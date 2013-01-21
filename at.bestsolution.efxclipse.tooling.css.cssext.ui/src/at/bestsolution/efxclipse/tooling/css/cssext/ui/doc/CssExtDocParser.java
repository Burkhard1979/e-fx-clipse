/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.cssext.ui.doc;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.ui.label.DeclarativeLabelProvider;

import at.bestsolution.efxclipse.tooling.css.cssDsl.ClassSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssext.ICssExtManager;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcatWithoutSpace;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSType;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.JavaDocParser;

import com.google.inject.Inject;

public class CssExtDocParser {

	private @Inject ICssExtManager cssExtManager;
	private @Inject XtextElementLinks elementLinks;
	private @Inject IQualifiedNameProvider nameProvider;
	private @Inject DeclarativeLabelProvider labelProvider;
	private @Inject IImageHelper imageHelper;
	
	public String translateRule(CSSRule r) {
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
		else if (r instanceof CSSRuleConcatWithoutSpace) {
			Iterator<CSSRule> it =((CSSRuleConcatWithoutSpace) r).getConc().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" ~ ";
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
		else if (r instanceof CSSNumLiteral) {
			result += ((CSSNumLiteral)r).getValue();
		}
		else if (r instanceof CSSRuleRef) {
			result += elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, ((CSSRuleRef) r).getRef(), "&lt;" + ((CSSRuleRef) r).getRef().getName() + "&gt;");
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
		else if (r instanceof CSSType) {
			result = ((CSSType) r).getType();
		}
		else {
			if (r == null) result = "<code>null</code>";
			else result = "UNKNOWN: " + r;
		}
		return result;
	}
	
	public String getDocForProperty(PropertyDefinition property) {
		if (property != null) {
			String rule = "syntax = " +translateRule(property.getRule()) + "<br>";
			String javadoc =  prepareDoku(property.getDoku());
			String defaultVal = property.getDefault()==null?"":"default = " + property.getDefault() + "<br>";
			// TODO complete defaultvalue at language level and add here
			return formatRule(rule)  + javadoc;
		}
		return "no documentation found";
	}
	
	public String getDocForProperty(String propertyName) {
		return getDocForProperty(findPropertyByName(propertyName));
	}

	public String getDocumentation(EObject o) {
		if (o instanceof CSSRuleDefinition) {
			return getDocumentationForRule((CSSRuleDefinition) o);
		}
		else if (o instanceof PropertyDefinition) {
			return getDocumentationForRule((PropertyDefinition)o);
		}
		else if (o instanceof ClassSelector) {
			// TODO impl this
			return "need to test if this is a style-class and show the appropriate doc";
		}
		return "no documentation found";
	}
	
	private String formatRule(String rule) {
		return "<p class=\"rule\">"+rule+"</p>";
	}
	
	private String getDocumentationForRule(CSSRuleDefinition r) {
		String func = "";
		if (r.getFunc() != null) {
			CSSRuleFunc f = (CSSRuleFunc) r.getFunc();
			func = f.getName() + "(" + translateRule(f.getParams()) + ")";
		}
		String rule = "";
		if (r.getRule() != null) {
			rule = r.getName()+" = " +translateRule(r.getRule());
		}
		
		String javadoc = prepareDoku(r.getDoku());
		return formatRule(func +  rule) + javadoc;
	}
	
	private String getDocumentationForRule(PropertyDefinition r) {
		String rule = "";
		if (r.getRule() != null) {
			rule = r.getName()+" = " +translateRule(r.getRule());
		}
		String javadoc = prepareDoku(r.getDoku());
		return formatRule(rule) + javadoc;
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
		out.append("&nbsp;");
		printDefiningElement(out, element);
		out.append("</nobr>");
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
		return out.toString();
	}
	
	private PackageDefinition findPackage(ElementDefinition element) {
		return (PackageDefinition) element.eContainer();
	}
	
	
	
	private PropertyDefinition findPropertyByName(String propertyName) {
		return cssExtManager.findPropertyByName(propertyName);
	}
	
	private ElementDefinition findElementByName(String elName) {
		return cssExtManager.findElementByName(elName);
	}

	public String getDocHead(EObject o) {
		
		// css ext lang elements
		if (o instanceof ElementDefinition) {
			return getDocHeadForElement((ElementDefinition)o);
		}
		else if (o instanceof PropertyDefinition) {
			return getDocHeadForProperty((PropertyDefinition)o);
		}
		
		// css lang elements
		if (o instanceof ClassSelector) {
			return "<b>."+((ClassSelector)o).getName()+"</b>";
		}
		if (o instanceof IdSelector) {
			return "<b>#"+((ClassSelector)o).getName()+"</b>";
		}
		if (o instanceof ElementSelector) {
			return getDocHeadForElement(((ElementSelector) o).getName());
		}
		if (o instanceof css_property) {
			return getDocHeadForProperty(((css_property) o).getName());
		}
		if (o instanceof simple_selector) {
			simple_selector s = ((simple_selector)o);
			String elementName = null;
			if (s.getElement() instanceof ElementSelector) {
				elementName = ((ElementSelector)s.getElement()).getName();
			}
			return getDocHeadForElement(elementName);
		}
		
		return null;
	}
	
}
