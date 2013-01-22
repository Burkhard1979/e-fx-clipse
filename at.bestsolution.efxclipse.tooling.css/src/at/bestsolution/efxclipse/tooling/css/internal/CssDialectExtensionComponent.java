/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtensionRegistry;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension.CssProperty;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;

public class CssDialectExtensionComponent implements CssDialectExtensionRegistry {
	
	private List<CssDialectExtension> extensions = new ArrayList<CssDialectExtension>();
	
	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#addExtension(at.bestsolution.efxclipse.tooling.css.CssDialectExtension)
	 */
	@Override
	public void addExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.add(extension);
		}
	}
	
	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#removeExtension(at.bestsolution.efxclipse.tooling.css.CssDialectExtension)
	 */
	@Override
	public void removeExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.remove(extension);
		}
	}
	
	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#getAllProperties(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public List<CssProperty> getAllProperties(URI uri) {
		List<CssProperty> rv = new ArrayList<CssProperty>();
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				rv.addAll(((CssExtendedDialectExtension)ext).getAllProperties());
			}
		}
		return rv;
	}
	
	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#getPropertiesForSelector(org.eclipse.emf.common.util.URI, at.bestsolution.efxclipse.tooling.css.cssDsl.selector)
	 */
	@Override
	public List<CssProperty> getPropertiesForSelector(URI uri, selector selector) {
		List<CssProperty> rv = new ArrayList<CssProperty>();
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				rv.addAll(((CssExtendedDialectExtension)ext).getPropertiesForSelector(selector));
			}
		}
		return rv;
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#getProperties(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public List<Property> getProperties(URI uri) {
		List<Property> rv = new ArrayList<Property>();
		
		for( CssDialectExtension ext : getExtensions(uri) ) {
			rv.addAll(ext.getProperties());
		}
		
		return rv;
	}

	public CssDialectExtension[] getExtensions(URI uri) {
		List<CssDialectExtension> exts = new ArrayList<CssDialectExtension>();
		synchronized (extensions) {
			for( CssDialectExtension e : extensions ) {
				if( e.isActive(uri) ) {
					exts.add(e);
				}
			}
		}
		return exts.toArray(new CssDialectExtension[0]);
	}
	
	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#getValuesForProperty(org.eclipse.emf.common.util.URI, java.lang.String)
	 */
	@Override
	public List<CssProperty> getValuesForProperty(URI uri, String propertyName) {
		List<CssProperty> result = new ArrayList<CssProperty>();
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				result.addAll(((CssExtendedDialectExtension)ext).getValuesForProperty(propertyName));
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#getDocumentation(org.eclipse.emf.common.util.URI, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String getDocumentation(URI uri, EObject o) {
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				return ((CssExtendedDialectExtension)ext).getDocumentation(o);
			}
		}
		return "no extension capable :/";
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#getDocHead(org.eclipse.emf.common.util.URI, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String getDocHead(URI uri, EObject o) {
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				return ((CssExtendedDialectExtension)ext).getDocHead(o);
			}
		}
		return "no extension capable :/";
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionRegistry#findProposals(org.eclipse.emf.common.util.URI, java.lang.String, java.lang.String, java.util.List, java.lang.String)
	 */
	@Override
	public List<Proposal> findProposals(URI uri, String element, String property, List<CssTok> prefixToks, String prefix) {
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				result.addAll(((CssExtendedDialectExtension)ext).findProposals(element, property, prefixToks, prefix));
			}
		}
		return result;
	}
	
	@Override
	public List<ValidationResult> validateProperty(URI uri, String element, String attribute, List<CssTok> tokens) {
		List<ValidationResult> rv = new ArrayList<ValidationResult>();
		
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				rv.addAll(((CssExtendedDialectExtension)ext).validateProperty(element, attribute, tokens));
			}
		}
		return rv;
	}
}