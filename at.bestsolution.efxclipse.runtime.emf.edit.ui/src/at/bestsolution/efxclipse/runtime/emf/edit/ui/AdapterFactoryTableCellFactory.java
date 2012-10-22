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

import javafx.scene.Node;
import javafx.scene.control.Cell;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;

/**
 * This list cell factory wraps an {@link AdapterFactory} and delegates calls to its {@link TableCell}s to the
 * corresponding adapter-implemented item provider interfaces.
 * 
 * <ul>
 * <li>{@link Cell#setText(String)} and {@link Cell#setGraphic(Node)} are delegated to
 * {@link ITableItemLabelProvider}</li>
 * <li>{@link Cell#setTextFill(javafx.scene.paint.Paint)} and the CSS property
 * <code>-fx-background-color</code> are delegated to {@link ITableItemColorProvider}</li>
 * <li>{@link Cell#setFont(javafx.scene.text.Font)} is delegated to {@link ITableItemFontProvider}</li>
 * </ul>
 */
public class AdapterFactoryTableCellFactory extends AdapterFactoryCellFactory implements
		Callback<TableColumn<Object, Object>, TableCell<Object, Object>> {

	protected int columnIndex;

	public AdapterFactoryTableCellFactory(AdapterFactory adapterFactory, int columnIndex) {
		super(adapterFactory);
		this.columnIndex = columnIndex;
	}

	@Override
	public TableCell<Object, Object> call(TableColumn<Object, Object> arg0) {

		final TableCell<Object, Object> tableCell = new TableCell<Object, Object>() {

			Object currentItem = null;

			AdapterImpl adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					update(msg.getNotifier());
				}
			};

			@Override
			protected void updateItem(Object item, boolean empty) {
				super.updateItem(item, empty);

				// check if the item changed
				if (item != currentItem) {
					
					// remove the adapter if attached
					if(currentItem instanceof Notifier)						
						((Notifier) currentItem).eAdapters().remove(adapter);
					
					// update the current item
					currentItem = item;

					// attach the adapter to the new item
					if (currentItem instanceof Notifier)
						((Notifier) currentItem).eAdapters().add(adapter);
				}

				// notify the listeners
				for (ICellUpdateListener cellUpdateListener : cellUpdateListeners)
					cellUpdateListener.updateItem(this, item, empty);
				
				update(item);				
			}

			private void update(Object item) {
				CellFactoryUtil.applyTableItemProviderStyle(item, columnIndex, this, adapterFactory);
			}

		};

		for (ICellCreationListener cellCreationListener : cellCreationListeners)
			cellCreationListener.cellCreated(tableCell);

		return tableCell;
	}

}
