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
package at.bestsolution.efxclipse.tooling.css.ui.outline;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;

import com.google.inject.Inject;

/**
 * customization of the default outline structure
 * 
 */
public class CssDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject ILabelProvider lbl;
	
	protected void _createChildren(DocumentRootNode parentNode, stylesheet stylesheet) {
		System.err.println("do parent");
		for (ruleset ruleset : stylesheet.getRuleset()) {
			for (selector s : ruleset.getSelectors()) {
				IOutlineNode selectorNode = new EObjectNode(s, parentNode, lbl.getImage(s), lbl.getText(s), ruleset.getDeclarations().isEmpty());
				if (!ruleset.getDeclarations().isEmpty()) {
					createChildren(selectorNode, ruleset);
				}
			}
			
		}
	}
	
	protected void _createChildren(IOutlineNode parentNode, ruleset ruleset) {
		System.err.println("do ruleset");
		for (css_declaration d : ruleset.getDeclarations()) {
			createNode(parentNode, d.getProperty());
		}
	}
	
	protected Image _image(ruleset ruleset) {
		return lbl.getImage(ruleset);
	}
	
	protected Image _image(css_property property) {
		System.err.println("LBL is " + lbl);
		return lbl.getImage(property);
	}
	
	protected boolean _isLeaf(css_property property) {
		return true;
	}
	
	protected boolean _isLeaf(ruleset ruleset) {
		return ruleset.getDeclarations().isEmpty();
	}
		
}
