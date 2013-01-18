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
package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssext.ICssExtManager;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.doc.CssExtDocParser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.internal.CssExtDslActivator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class CssExtDialectExtension implements CssDialectExtension, CssExtendedDialectExtension {

	private @Inject ICssExtManager cssExtManager;
	private @Inject CssExtDocParser docParser;
	private @Inject at.bestsolution.efxclipse.tooling.css.cssext.parser.CssExtParser parser;
	private @Inject IQualifiedNameProvider nameProvider;
	
	public CssExtDialectExtension() {
		Injector i = CssExtDslActivator.getInstance().getInjector(CssExtDslActivator.AT_BESTSOLUTION_EFXCLIPSE_TOOLING_CSS_CSSEXT_CSSEXTDSL);
		i.injectMembers(this);
	}
	
	private CssProperty wrap(final PropertyDefinition def) {
		System.err.println("eqHash for " + def.getName());
		int eqHash = def.getName().hashCode();
		System.err.println(" - " + eqHash);
		if (def.getDoku() != null && def.getDoku().getClass() != null) {
			eqHash += def.getDoku().getContent().hashCode();
		}
		System.err.println(" - " + eqHash);
		eqHash += docParser.translateRule(def.getRule()).hashCode();
		System.err.println(" - " + eqHash);
		return new CssProperty(def.getName(), nameProvider.getFullyQualifiedName(def).toString(), wrap((ElementDefinition)def.eContainer()), eqHash) {
			@Override
			protected String doGetDoc() {
				return docParser.getDocForProperty(def);
			}
		};
	}
	
	private CssElement wrap(ElementDefinition def) {
		return new CssElement(def.getName(), nameProvider.getFullyQualifiedName(def).toString()) {
			
		};
	}
	 
	@Override
	public List<CssProperty> getAllProperties() {
		ArrayList<CssProperty> result = new ArrayList<CssProperty>();
		
		List<PropertyDefinition> defs = cssExtManager.findAllProperties();
		
		for (PropertyDefinition def : defs) {
			result.add(wrap(def));
		}
		
		return result;
	}
	
	
	@Override
	public List<Property> getProperties() {
		
		ArrayList<Property> result = new ArrayList<CssDialectExtension.Property>();
		
		List<PropertyDefinition> defs = cssExtManager.findAllProperties();
		
		for (PropertyDefinition def : defs) {
			result.add(new Property(def.getName()) {

				@Override
				public List<Proposal> getInitialTermProposals() {
					return null;
				}
				
			});
		}
		
		return result;
//		List<Property> p = new ArrayList<CssDialectExtension.Property>();
//		return Parser.getProperties();
	}

	@Override
	public boolean isActive(URI uri) {
		return true; // TODO for now always on
	}

	
	
	@Override
	public List<CssProperty> getPropertiesForSelector(String selector) {
		
		return null;
	}

	@Override
	public List<CssProperty> getValuesForProperty(String propertyName) {
		Parser.getValuesForProperty(propertyName);
		return null;
	}

	@Override
	public List<CssProperty> getValuesForProperty(String propertyName,
			String... preceedingValueParts) {
		return null;
	}

	@Override
	public String getDocForProperty(String propertyName) {
		
		return docParser.getDocForProperty(propertyName);
	}

	@Override
	public String getDocumentation(EObject o) {
		return docParser.getDocumentation(o);
	}

	@Override
	public String getDocForElement(String element) {
		return docParser.getDocForElement(element);
	}

	@Override
	public String getDocHeadForProperty(String name) {
		return docParser.getDocHeadForProperty(name);
	}

	@Override
	public String getDocHeadForElement(String element) {
		return docParser.getDocHeadForElement(element);
	}

	@Override
	public String getDocHead(EObject o) {
		return docParser.getDocHead(o);
	}
	
	@Override
	public List<Proposal> findProposals(String element, String attribute, List<CssTok> prefixToks, String prefix) {
		return parser.findProposals(element, attribute, prefixToks, prefix);
	}
	
	@Override
	public List<ValidationResult> validateProperty(String element, String attribute, List<CssTok> tokens) {
		return parser.validateProperty(element, attribute, tokens);
	}

	@Override
	public List<CssProperty> getPropertiesForSelector(selector selector) {
		// TODO Auto-generated method stub
		return null;
	}

}
