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
package at.bestsolution.efxclipse.tooling.css.extapi;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;

/**
 * @author ccaks
 *
 */
public interface CssExt {

	public List<Proposal> getPropertyProposalsForSelector(selector selector);
	public List<Proposal> getValueProposalsForProperty(selector selector, css_property property, List<CssTok> prefixTok, String prefixString);
	
	public String getDocumentationHeader(EObject obj);
	public String getDocumentation(EObject obj);
}
