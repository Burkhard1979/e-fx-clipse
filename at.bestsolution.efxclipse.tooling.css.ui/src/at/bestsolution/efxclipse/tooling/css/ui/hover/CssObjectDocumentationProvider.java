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

import at.bestsolution.efxclipse.tooling.css.CssDialectExtensionRegistry;

import com.google.inject.Inject;

/**
 * @author ccaks
 * 
 */
public class CssObjectDocumentationProvider implements
		IEObjectDocumentationProvider {

	private @Inject CssDialectExtensionRegistry extension;

	@Override
	public String getDocumentation(EObject o) {
		String doku = extension.getDocumentation(o.eResource().getURI(), o);
		
		if (doku == null) {
			return "no docu support for this element :/";
		}
		else {
			return doku;
		}
	}

}
