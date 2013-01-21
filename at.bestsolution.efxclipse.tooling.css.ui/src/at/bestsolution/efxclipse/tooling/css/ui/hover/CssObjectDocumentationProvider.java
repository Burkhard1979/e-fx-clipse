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
package at.bestsolution.efxclipse.tooling.css.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDialectExtensionComponent;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDslActivator;

/**
 * @author ccaks
 * 
 */
public class CssObjectDocumentationProvider implements
		IEObjectDocumentationProvider {

	private CssDialectExtensionComponent extension;

	public CssObjectDocumentationProvider() {
		BundleContext context = CssDslActivator.getInstance().getBundle()
				.getBundleContext();
		ServiceReference<CssDialectExtensionComponent> ref = context
				.getServiceReference(CssDialectExtensionComponent.class);
		extension = context.getService(ref);
	}

	@Override
	public String getDocumentation(EObject o) {
		if (o instanceof css_property) {
			// Properties
			return extension.getDocForProperty(o.eResource().getURI(), ((css_property) o).getName());
		}
		
		if (o instanceof ElementSelector) {
			String elementName = ((ElementSelector) o).getName();
			return extension.getDocForElement(o.eResource().getURI(), elementName);
		}
		
		if (o instanceof simple_selector) {
			simple_selector s = ((simple_selector)o);
			String elementName = null;
			if (s.getElement() instanceof ElementSelector) {
				elementName = ((ElementSelector)s.getElement()).getName();
			}
			return extension.getDocForElement(o.eResource().getURI(), elementName);
		}
		
		// css ext rules
		String doku = extension.getDocumentation(o.eResource().getURI(), o);
		
		if (doku == null) {
			return "no docu support for this element :/";
		}
		else {
			return doku;
		}
	}

}
