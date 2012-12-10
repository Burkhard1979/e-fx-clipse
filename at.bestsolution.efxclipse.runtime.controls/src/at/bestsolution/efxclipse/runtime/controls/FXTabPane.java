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

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import javafx.scene.control.SingleSelectionModel;

public abstract class FXTabPane<T extends FXTab> extends Control {
    public enum MinMaxState {
    	NONE,
		RESTORED,
		MINIMIZED,
		MAXIMIZED
	}

	public abstract ObservableList<T> getTabs();
	
	private ObjectProperty<MinMaxState> minMaxState = new SimpleObjectProperty<MinMaxState>(MinMaxState.NONE);

	public void setMinMaxState(MinMaxState minMaxState) {
		this.minMaxState.set(minMaxState);
	}
	
	public MinMaxState getMinMaxState() {
		return this.minMaxState.get();
	}
	
	public ObjectProperty<MinMaxState> minMaxStateProperty() {
		return minMaxState;
	}

	public abstract SingleSelectionModel<T> getSelectionModel();
}
