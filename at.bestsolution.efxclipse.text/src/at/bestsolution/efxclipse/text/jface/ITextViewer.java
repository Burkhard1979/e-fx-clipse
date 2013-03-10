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
package at.bestsolution.efxclipse.text.jface;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.styledtext.TextSelection;

public interface ITextViewer {

	void removeTextListener(ITextListener listener);

	void addTextListener(ITextListener listener);

	void addTextInputListener(ITextInputListener listener);

	IDocument getDocument();
	
	public void setDocument(IDocument document);
	
	public void setDocument(IDocument document, int visibleRegionOffset, int visibleRegionLength);

	void removeTextInputListener(ITextInputListener listener);

	void changeTextPresentation(TextPresentation presentation, boolean b);

	IRegion getVisibleRegion();

	public StyledTextArea getTextWidget();

	void setSelectedRange(int offset, int length);

	void revealRange(int offset, int length);
	
	TextSelection getSelectedRange();

	void invalidateTextPresentation();
	
	/**
	 * Registers an event consumer with this viewer. This method has been
	 * replaces with the {@link org.eclipse.swt.custom.VerifyKeyListener}
	 * management methods in {@link ITextViewerExtension}.
	 *
	 * @param consumer the viewer's event consumer. <code>null</code> is a
	 *            valid argument.
	 */
	void setEventConsumer(IEventConsumer consumer);
}
