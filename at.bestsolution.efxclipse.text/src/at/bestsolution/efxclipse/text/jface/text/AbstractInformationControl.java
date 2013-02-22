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
package at.bestsolution.efxclipse.text.jface.text;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;

public class AbstractInformationControl implements IInformationControl, IInformationControlExtension, IInformationControlExtension3, IInformationControlExtension4, IInformationControlExtension5 {

	@Override
	public boolean containsControl(Node control) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Point2D computeSizeConstraints(int widthInChars, int heightInChars) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IInformationControlCreator getInformationPresenterControlCreator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatusText(String statusFieldText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle2D getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle2D computeTrim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean restoresSize() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean restoresLocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasContents() {
		// TODO Auto-generated method stub
		return false;
	}

}
