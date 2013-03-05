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
import org.eclipse.jface.text.IDocumentExtension3;

import at.bestsolution.efxclipse.text.jface.contentassist.IContentAssistant;
import at.bestsolution.efxclipse.text.jface.presentation.IPresentationReconciler;
import at.bestsolution.efxclipse.text.jface.presentation.PresentationReconciler;
import at.bestsolution.efxclipse.text.jface.reconciler.IReconciler;

public class SourceViewerConfiguration {
	/**
	 * Returns all configured content types for the given source viewer. This list
	 * tells the caller which content types must be configured for the given source
	 * viewer, i.e. for which content types the given source viewer's functionalities
	 * must be specified. This implementation always returns <code>
	 * new String[] { IDocument.DEFAULT_CONTENT_TYPE }</code>.
	 *
	 * @param sourceViewer the source viewer to be configured by this configuration
	 * @return the configured content types for the given viewer
	 */
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE };
	}

	/**
	 * Returns the configured partitioning for the given source viewer. The partitioning is
	 * used when the querying content types from the source viewer's input document.  This
	 * implementation always returns <code>IDocumentExtension3.DEFAULT_PARTITIONING</code>.
	 *
	 * @param sourceViewer the source viewer to be configured by this configuration
	 * @return the configured partitioning
	 * @see #getConfiguredContentTypes(ISourceViewer)
	 * @since 3.0
	 */
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return IDocumentExtension3.DEFAULT_PARTITIONING;
	}
	
	/**
	 * Returns the presentation reconciler ready to be used with the given source viewer.
	 *
	 * @param sourceViewer the source viewer
	 * @return the presentation reconciler or <code>null</code> if presentation reconciling should not be supported
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler= new PresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		return reconciler;
	}
	
	/**
	 * Returns the content assistant ready to be used with the given source viewer.
	 * This implementation always returns <code>null</code>.
	 *
	 * @param sourceViewer the source viewer to be configured by this configuration
	 * @return a content assistant or <code>null</code> if content assist should not be supported
	 */
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		return null;
	}
	
	/**
	 * Returns the reconciler ready to be used with the given source viewer.
	 * This implementation always returns <code>null</code>.
	 *
	 * @param sourceViewer the source viewer to be configured by this configuration
	 * @return a reconciler or <code>null</code> if reconciling should not be supported
	 */
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		return null;
	}
}
