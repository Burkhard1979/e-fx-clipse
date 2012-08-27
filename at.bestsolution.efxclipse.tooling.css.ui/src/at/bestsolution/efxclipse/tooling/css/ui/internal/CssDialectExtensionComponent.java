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
package at.bestsolution.efxclipse.tooling.css.ui.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension.CssProperty;

public class CssDialectExtensionComponent {
	private List<CssDialectExtension> extensions = new ArrayList<CssDialectExtension>();
	
	public void addExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.add(extension);
		}
	}
	
	public void removeExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.remove(extension);
		}
	}

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
	
	public String getDocForProperty(URI uri, String propertyName) {
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				return ((CssExtendedDialectExtension)ext).getDocForProperty(propertyName);
			}
		}
		return "no extension capable :/";
	}
	
	public List<CssProperty> getValuesForProperty(URI uri, String propertyName) {
		List<CssProperty> result = new ArrayList<CssProperty>();
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				result.addAll(((CssExtendedDialectExtension)ext).getValuesForProperty(propertyName));
			}
		}
		return result;
	}

	/**
	 * @param o
	 * @return
	 */
	public String getDocumentation(URI uri, EObject o) {
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				return ((CssExtendedDialectExtension)ext).getDocumentation(o);
			}
		}
		return "no extension capable :/";
	}

	/**
	 * @param uri
	 * @param element
	 * @return
	 */
	public String getDocForElement(URI uri, String element) {
		for( CssDialectExtension ext : getExtensions(uri) ) {
			if (ext instanceof CssExtendedDialectExtension) {
				return ((CssExtendedDialectExtension)ext).getDocForElement(element);
			}
		}
		return "no extension capable :/";
	}

}