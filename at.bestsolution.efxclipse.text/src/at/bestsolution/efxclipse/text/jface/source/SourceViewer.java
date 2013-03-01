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
package at.bestsolution.efxclipse.text.jface.source;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IAnnotationModel;

import at.bestsolution.efxclipse.text.jface.ITextOperationTarget;
import at.bestsolution.efxclipse.text.jface.TextViewer;
import at.bestsolution.efxclipse.text.jface.contentassist.IContentAssistant;
import at.bestsolution.efxclipse.text.jface.presentation.IPresentationReconciler;

public class SourceViewer extends TextViewer implements ISourceViewer {

	private IPresentationReconciler presentationReconciler;
	private IContentAssistant contentAssistant;
	private boolean contentAssistantInstalled;

	@Override
	public void configure(SourceViewerConfiguration configuration) {
		if (getTextWidget() == null)
			return;
		
		setDocumentPartitioning(configuration.getConfiguredDocumentPartitioning(this));
		
		// install content type independent plug-ins
		this.presentationReconciler= configuration.getPresentationReconciler(this);
		if (presentationReconciler != null)
			presentationReconciler.install(this);
		
		contentAssistant= configuration.getContentAssistant(this);
		if (contentAssistant != null) {
			contentAssistant.install(this);
			
			contentAssistantInstalled = true;
		}
	}

	public void setDocument(IDocument document) {
		setDocument(document, null, -1, -1);
	}

	public void setDocument(IDocument document, int visibleRegionOffset, int visibleRegionLength) {
		setDocument(document, null, visibleRegionOffset, visibleRegionLength);
	}

	public void setDocument(IDocument document, IAnnotationModel annotationModel) {
		setDocument(document, annotationModel, -1, -1);
	}

	@Override
	public void setDocument(IDocument document,
			IAnnotationModel annotationModel, int modelRangeOffset,
			int modelRangeLength) {
		//FIXME Port annotation model
		
		if (modelRangeOffset == -1 && modelRangeLength == -1)
			super.setDocument(document);
		else
			super.setDocument(document, modelRangeOffset, modelRangeLength);
		
		//FIXME Port ruler stuff
	}
	
	@Override
	public boolean canDoOperation(int operation) {
		if (operation == CONTENTASSIST_PROPOSALS) {
			return contentAssistant != null && contentAssistantInstalled && isEditable();
		}
		return super.canDoOperation(operation);
	}
	
	@Override
	public void doOperation(int operation) {
		if (getTextWidget() == null || (!redraws() && operation != FORMAT))
			return;
		
		switch (operation) {
		case CONTENTASSIST_PROPOSALS:
			contentAssistant.showPossibleCompletions();
			return;

		default:
			break;
		}
		
		super.doOperation(operation);
	}
	
	@Override
	public IAnnotationModel getAnnotationModel() {
		System.err.println("NEEDS TO BE IMPLEMENTED");
		Thread.dumpStack();
		return null;
	}
}
