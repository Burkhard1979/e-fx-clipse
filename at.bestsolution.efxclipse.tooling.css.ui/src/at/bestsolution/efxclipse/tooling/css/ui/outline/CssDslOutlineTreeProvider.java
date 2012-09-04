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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;

import com.google.inject.Inject;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;

/**
 * customization of the default outline structure
 * 
 */
public class CssDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject ILabelProvider lbl;
	
	
//	protected void _createChildren(DocumentRootNode parentNode, EObject modelElement) {
//		System.err.println("Create children for: " + modelElement);
//		super._createChildren(parentNode, modelElement);
//	}
//	@Override
//	protected void _createChildren(EStructuralFeatureNode parentNode,
//			EObject modelElement) {
//		System.err.println("Create children for: " + parentNode.getText() + " => " + modelElement);
//		super._createChildren(parentNode, modelElement);
//	}
//	
//	@Override
//	protected void _createChildren(Object parent, Object element) {
//		System.err.println("create children: " + parent + ", " + element);
//		super._createChildren(parent, element);
//	}
	
	
	protected void _createChildren(DocumentRootNode parentNode, stylesheet stylesheet) {
		System.err.println("do parent");
		for (ruleset ruleset : stylesheet.getRuleset())
			createNode(parentNode, ruleset);
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
	
	protected void xx_createChildren(IOutlineNode parentNode, EObject modelElement) {
		System.err.println("create children: " + parentNode + ", " + modelElement);
		if( modelElement instanceof ruleset ) {
			ruleset s = (ruleset) modelElement;
			
			if( s.getSelectors().size() == 1 ) {
//				System.err.println("Simple: " + s.getSelectors().get(0).getSimpleselectors().size());
//				System.err.println("Sub: " + s.getSelectors().get(0).getSelector());
				if( s.getSelectors().get(0).getSimpleselectors().size() == 1 && s.getSelectors().get(0).getSelector() == null ) {
					for (EObject childElement : modelElement.eContents()) {
//						System.err.println("Child: " + childElement);
						if( !(childElement instanceof selector) ) {
//							System.err.println("creating child");
							createNode(parentNode, childElement);
						}
					}
					return;
				}
				
			}
		} else if( modelElement instanceof selector ) {
			selector s = (selector) modelElement;
			if( s.getSimpleselectors().size() == 1 && s.getSelector() == null ) {
				for (EObject childElement : modelElement.eContents()) {
//					System.err.println("Child: " + childElement);
					if( !(childElement instanceof simple_selector) ) {
//						System.err.println("creating child");
						createNode(parentNode, childElement);
					}
				}
				return;
			}
		} else if( modelElement instanceof css_declaration ) {
			css_declaration dec = (css_declaration) modelElement;
			if( dec.getExpression().getTermGroups().size() == 1 ) {
				for( term t : dec.getExpression().getTermGroups().get(0).getTerms() ) {
					createNode(parentNode, t);
				}
			} else {
				for( termGroup g : dec.getExpression().getTermGroups() ) {
					createNode(parentNode, g);
				}	
			}
			
			return;
		}
		
		super._createChildren(parentNode, modelElement);
	}
}
