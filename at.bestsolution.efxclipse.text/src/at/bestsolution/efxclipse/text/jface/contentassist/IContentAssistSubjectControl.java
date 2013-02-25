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
package at.bestsolution.efxclipse.text.jface.contentassist;

import org.eclipse.jface.text.IDocument;

import at.bestsolution.efxclipse.styledtext.TextSelection;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public interface IContentAssistSubjectControl {
	public void addKeyListener(EventHandler<KeyEvent> keyListener);
	public TextSelection getSelectedRange();
	/**
	 * Returns this content assist subject control's document.
	 *
	 * @return the viewer's input document
	 */
	IDocument getDocument();
	
	/**
	 * Sets the selected range. Offset and length based on the subject's
	 * model (e.g. document).
	 *
	 * @param offset the offset of the selection based on the subject's model e.g. document
	 * @param length the length of the selection based on the subject's model e.g. document
	 */
	void setSelectedRange(int offset, int length);

	/**
	 * Reveals the given region. Offset and length based on the subject's
	 * model (e.g. document).
	 *
	 * @param offset the offset of the selection based on the subject's model e.g. document
	 * @param length the length of the selection based on the subject's model e.g. document
	 */
	void revealRange(int offset, int length);
}
