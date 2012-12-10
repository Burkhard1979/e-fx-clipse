/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.controls;

import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.util.Callback;

public abstract class FXTab implements EventTarget {
	public abstract Object getUserData();

	public abstract void setUserData(Object value);

	public abstract Node getContent();

	public abstract void setContent(Node value);

	private Callback<FXTab, Boolean> closeVetoHandler;

	/**
	 * Set a handler who can veto the closing of a tab through user interaction
	 * <p>
	 * The callback returns <code>false</code> if the closing can proceed and
	 * <code>true</code> if the close operation should be skipped
	 * </p>
	 * 
	 * @param closeVetoHandler
	 *            handler to consult before closing the tab
	 */
	public void setCloseVetoHandler(Callback<FXTab, Boolean> closeVetoHandler) {
		this.closeVetoHandler = closeVetoHandler;
	}

	/**
	 * @return the current veto handler or <code>null</code>
	 */
	public Callback<FXTab, Boolean> getCloseVetoHandler() {
		return closeVetoHandler;
	}
	
	public abstract void setText(String value);
	public abstract void setClosable(boolean value);
	public abstract void setGraphic(Node value);
}
