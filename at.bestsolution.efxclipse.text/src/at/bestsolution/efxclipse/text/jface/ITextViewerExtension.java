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

import at.bestsolution.efxclipse.styledtext.VerifyEvent;
import javafx.event.EventHandler;

public interface ITextViewerExtension {
	IRewriteTarget getRewriteTarget();
	
	/**
	 * Inserts the verify key listener at the beginning of the viewer's list of
	 * verify key listeners. If the listener is already registered with the
	 * viewer this call moves the listener to the beginning of the list.
	 *
	 * @param listener the listener to be inserted
	 */
	void prependVerifyKeyListener(EventHandler<VerifyEvent> listener);

	/**
	 * Appends a verify key listener to the viewer's list of verify key
	 * listeners. If the listener is already registered with the viewer this
	 * call moves the listener to the end of the list.
	 *
	 * @param listener the listener to be added
	 */
	void appendVerifyKeyListener(EventHandler<VerifyEvent> listener);

	/**
	 * Removes the verify key listener from the viewer's list of verify key listeners.
	 * If the listener is not registered with this viewer, this call has no effect.
	 *
	 * @param listener the listener to be removed
	 */
	void removeVerifyKeyListener(EventHandler<VerifyEvent> listener);
}
