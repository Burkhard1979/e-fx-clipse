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
package at.bestsolution.efxclipse.runtime.viewer;

import javafx.scene.Node;
import javafx.scene.control.ListCell;

public class FXListCell<E> extends ListCell<E> {
	private final CellLabelProvider<E> labelProvider;
	
	private final Cell<E> CACHE_CELL = new Cell<E>(null,0);
	
	public FXListCell(CellLabelProvider<E> labelProvider) {
		this.labelProvider = labelProvider;
	}
	
	@Override
	protected void updateItem(E item, boolean empty) {
		super.updateItem(item, empty);
		if( item != null && ! empty ) {
			CACHE_CELL.updateDomainObject(item);
			setGraphic((Node)labelProvider.getIcon(CACHE_CELL));
			setText(labelProvider.getText(CACHE_CELL));
		}
	}
}