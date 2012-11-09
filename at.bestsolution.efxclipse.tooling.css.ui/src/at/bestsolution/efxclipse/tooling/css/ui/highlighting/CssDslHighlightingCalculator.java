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
package at.bestsolution.efxclipse.tooling.css.ui.highlighting;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FuncTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;

public class CssDslHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if( resource == null ) {
			return;
		}
		
		TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
		
		while( it.hasNext() ) {
			Object o = it.next();
			
			if (o instanceof ElementSelector) {
				ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.ELEMENT);
			}
			else if (o instanceof IdentifierTok) {
				ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.DEFAULT_ID);
			}
			else if( o instanceof css_declaration ) {
				css_declaration dec = (css_declaration) o;
				if( dec.getProperty() != null && dec.getProperty().getName() != null && dec.getProperty().getName().trim().length() > 0 ) {
					ICompositeNode n = NodeModelUtils.getNode(dec);
					if( n.hasChildren() ) {
						acceptor.addPosition(n.getFirstChild().getOffset(), n.getFirstChild().getLength(), CssDslHighlightingConfiguration.DECLARATIONNAME);
					}	
				}
			} else if( o instanceof simple_selector ) {
				simple_selector sec = (simple_selector) o;
				ICompositeNode n = NodeModelUtils.getNode(sec);
								
				acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.SELECTOR);
			}
			else if (o instanceof URLType) {
				URLType url = (URLType) o;
				ICompositeNode n = NodeModelUtils.getNode(url);
				acceptor.addPosition(n.getOffset(), 4, CssDslHighlightingConfiguration.FUNCTION);
				acceptor.addPosition(n.getOffset()+4, n.getLength()-5, CssDslHighlightingConfiguration.URL);
				acceptor.addPosition(n.getOffset() + n.getLength() - 1, 1, CssDslHighlightingConfiguration.FUNCTION);
			}
			else if (o instanceof FuncTok) {
				FuncTok funcTok = (FuncTok) o;
				ICompositeNode n = NodeModelUtils.getNode(funcTok);
				
				int nameLength = funcTok.getName().getName().length();
				acceptor.addPosition(n.getOffset(), nameLength + 1, CssDslHighlightingConfiguration.FUNCTION);
				
				acceptor.addPosition(n.getOffset() + n.getLength() - 1, 1, CssDslHighlightingConfiguration.FUNCTION);
			}
		}
	}
}