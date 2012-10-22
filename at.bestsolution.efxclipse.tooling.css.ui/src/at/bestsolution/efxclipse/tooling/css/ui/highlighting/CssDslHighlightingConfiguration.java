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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CssDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public final static String DECLARATIONNAME = "DeclarationName"; 
	public final static String SELECTOR = "Selector";
	public final static String URL = "Url";
	public final static String FUNCTION = "Function";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(DECLARATIONNAME, "Declaration", crossDeclarationTextStyle());
		acceptor.acceptDefaultHighlighting(SELECTOR, "Selector", crossSelectorTextStyle());
		acceptor.acceptDefaultHighlighting(URL, "Url", urlTextStyle());
		acceptor.acceptDefaultHighlighting(FUNCTION, "Function", functionTextStyle());
	}

	public TextStyle crossDeclarationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0,153,0));
		return textStyle;
	}

	public TextStyle crossSelectorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(206,123,0));
		return textStyle;
	}
	
	public TextStyle urlTextStyle() {
		TextStyle textStyle = stringTextStyle().copy();
		return textStyle;
	}
	
	public TextStyle functionTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}