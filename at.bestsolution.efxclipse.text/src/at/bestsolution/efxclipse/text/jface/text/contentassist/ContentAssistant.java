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
package at.bestsolution.efxclipse.text.jface.text.contentassist;

import org.eclipse.core.commands.IHandler;

import at.bestsolution.efxclipse.text.jface.text.ITextViewer;
import at.bestsolution.efxclipse.text.jface.text.IWidgetTokenKeeper;
import at.bestsolution.efxclipse.text.jface.text.IWidgetTokenKeeperExtension;
import at.bestsolution.efxclipse.text.jface.text.IWidgetTokenOwner;

public class ContentAssistant implements IContentAssistant, IContentAssistantExtension, IContentAssistantExtension2, IContentAssistantExtension3, IContentAssistantExtension4, IWidgetTokenKeeper, IWidgetTokenKeeperExtension {

	@Override
	public boolean requestWidgetToken(IWidgetTokenOwner owner, int priority) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setFocus(IWidgetTokenOwner owner) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean requestWidgetToken(IWidgetTokenOwner owner) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IHandler getHandler(String commandId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompletionListener(ICompletionListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCompletionListener(ICompletionListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRepeatedInvocationMode(boolean cycling) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShowEmptyList(boolean showEmpty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusLineVisible(boolean show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmptyMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDocumentPartitioning() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String completePrefix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void install(ITextViewer textViewer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uninstall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String showPossibleCompletions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showContextInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentAssistProcessor getContentAssistProcessor(String contentType) {
		// TODO Auto-generated method stub
		return null;
	}


}
