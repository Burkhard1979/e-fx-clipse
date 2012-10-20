/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Cell;

import org.eclipse.emf.common.notify.AdapterFactory;

/**
 * Base class for the AdapterFactoryCellFactories
 */
public abstract class AdapterFactoryCellFactory {

	/**
	 * A listener interface for callbacks that process newly created
	 * {@link Cell}s
	 */
	public interface ICellCreationListener {

		/**
		 * @param cell
		 *            the newly created {@link Cell}
		 */
		void cellCreated(Cell<?> cell);

	}

	/**
	 * A listener interface for callbacks that process {@link Cell}s being
	 * updated during {@link Cell#updateItem}.
	 */
	public interface ICellUpdateListener {

		/**
		 * @param cell
		 *            the {@link Cell} being updated
		 * @param item
		 *            as defined in {@link Cell#updateItem}
		 * @param empty
		 *            as defined in {@link Cell#updateItem}
		 */
		void updateItem(Cell<?> cell, Object item, boolean empty);

	}

	final protected AdapterFactory adapterFactory;
	final/* package */List<ICellCreationListener> cellCreationListeners = new ArrayList<>();
	final/* package */List<ICellUpdateListener> cellUpdateListeners = new ArrayList<>();

	public AdapterFactoryCellFactory(AdapterFactory adapterFactory) {
		super();

		if (adapterFactory == null)
			throw new IllegalArgumentException("AdapterFactory must not be null.");

		this.adapterFactory = adapterFactory;
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public void addCellCreationListener(ICellCreationListener listener) {
		cellCreationListeners.add(listener);
	}

	public void removeCellCreationListener(ICellCreationListener listener) {
		cellCreationListeners.remove(listener);
	}

	public void addCellUpdateListener(ICellUpdateListener listener) {
		cellUpdateListeners.add(listener);
	}

	public void removeCellUpdateListener(ICellUpdateListener listener) {
		cellUpdateListeners.remove(listener);
	}

}
