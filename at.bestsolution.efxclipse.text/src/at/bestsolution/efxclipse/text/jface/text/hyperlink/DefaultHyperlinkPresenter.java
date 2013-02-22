/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.text.jface.text.hyperlink;

import java.awt.Color;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;

import at.bestsolution.efxclipse.text.jface.text.ITextInputListener;
import at.bestsolution.efxclipse.text.jface.text.ITextPresentationListener;
import at.bestsolution.efxclipse.text.jface.text.ITextViewer;
import at.bestsolution.efxclipse.text.jface.text.TextPresentation;
import at.bestsolution.efxclipse.text.jface.util.IPropertyChangeListener;
import at.bestsolution.efxclipse.text.jface.util.PropertyChangeEvent;

public class DefaultHyperlinkPresenter implements IHyperlinkPresenter, IHyperlinkPresenterExtension, ITextPresentationListener, ITextInputListener, IDocumentListener,
IPropertyChangeListener {
	
	
	
	public DefaultHyperlinkPresenter(Color color) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void documentAboutToBeChanged(DocumentEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void documentChanged(DocumentEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputDocumentAboutToBeChanged(IDocument oldInput,
			IDocument newInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyTextPresentation(TextPresentation textPresentation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canHideHyperlinks() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canShowMultipleHyperlinks() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showHyperlinks(IHyperlink[] hyperlinks)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideHyperlinks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void install(ITextViewer textViewer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uninstall() {
		// TODO Auto-generated method stub
		
	}


}
