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


/**
 * Extends {@link IHyperlinkDetector} with ability
 * to dispose a hyperlink detector.
 * <p>
 * Clients may implement this interface.
 * </p>
 *
 * @since 3.3
 */
public interface IHyperlinkDetectorExtension {

	/**
	 * Disposes this hyperlink detector.
	 */
	void dispose();

}