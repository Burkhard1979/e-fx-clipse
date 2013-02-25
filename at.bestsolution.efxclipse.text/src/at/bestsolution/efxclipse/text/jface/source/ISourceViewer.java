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
import at.bestsolution.efxclipse.text.jface.ITextViewer;

public interface ISourceViewer extends ITextViewer {
	int CONTENTASSIST_PROPOSALS = ITextOperationTarget.STRIP_PREFIX + 1;
	int FORMAT= ITextOperationTarget.STRIP_PREFIX + 3;
	int INFORMATION= ITextOperationTarget.STRIP_PREFIX + 4;
	
	public void configure(SourceViewerConfiguration configuration);
	public void setDocument(IDocument document, IAnnotationModel annotationModel);
	public void setDocument(IDocument document, IAnnotationModel annotationModel, int modelRangeOffset, int modelRangeLength);
}
