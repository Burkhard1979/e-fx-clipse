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
package at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd;

import java.util.ArrayList;
import java.util.Collection;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Cell;
import javafx.scene.control.TableCell;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.domain.EditingDomain;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellCreationListener;

/**
 * Allows to drop items into viewers backed by an {@link AdapterFactoryCellFactory} using a {@link LocalTransfer}.
 */
public class EditingDomainCellDropAdapter implements ICellCreationListener {

	protected EditingDomain editingDomain;
	protected Command dndCommand;

	public EditingDomainCellDropAdapter(EditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
	}

	@Override
	public void cellCreated(final Cell<?> cell) {

		cell.setOnDragOver(new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent event) {
				Object item = cell.getItem();

				Node node = getRowNode(cell);
				
				double y = event.getY();
				double height = cell.getLayoutBounds().getHeight();

				float position = (float) (y / height);

				Object object = LocalTransfer.INSTANCE.getObject();

				Command command = DragAndDropCommand.create(editingDomain, item, position, /* DragAndDropFeedback.DROP_COPY | */DragAndDropFeedback.DROP_MOVE
						| DragAndDropFeedback.DROP_LINK, DragAndDropFeedback.DROP_MOVE, (Collection<?>) object);

				if (command.canExecute()) {
					dndCommand = command;

					if (command instanceof DragAndDropFeedback) {
						DragAndDropFeedback dndFeedback = (DragAndDropFeedback) command;
						int feedback = dndFeedback.getFeedback();

						if ((feedback & DragAndDropFeedback.FEEDBACK_INSERT_BEFORE) != 0)
							node.setStyle("-fx-border-color: red transparent transparent transparent;");
						else if ((feedback & DragAndDropFeedback.FEEDBACK_INSERT_AFTER) != 0)
							node.setStyle("-fx-border-color: transparent transparent red transparent;");
						else
							node.setStyle("-fx-border-color: transparent;");

						ArrayList<TransferMode> modes = new ArrayList<>();

						if ((feedback & DragAndDropFeedback.DROP_COPY) != 0)
							modes.add(TransferMode.COPY);
						if ((feedback & DragAndDropFeedback.DROP_LINK) != 0)
							modes.add(TransferMode.LINK);
						if ((feedback & DragAndDropFeedback.DROP_MOVE) != 0)
							modes.add(TransferMode.MOVE);

						event.acceptTransferModes(modes.toArray(new TransferMode[modes.size()]));
					}

				} else {
					dndCommand = null;
					node.setStyle("-fx-border-color: transparent;");
				}

			}


		});

		cell.setOnDragExited(new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent event) {
				getRowNode(cell).setStyle("-fx-border-color: transparent;");
			}

		});

		cell.setOnDragDropped(new EventHandler<DragEvent>() {
			public void handle(DragEvent event) {
				if (dndCommand != null)
					editingDomain.getCommandStack().execute(dndCommand);

				event.setDropCompleted(true);
				event.consume();
			}
		});
	}
	
	Cell<?> getRowNode(final Cell<?> cell) {
		return cell instanceof TableCell ? ((TableCell<?, ?>)cell).getTableRow() : cell;
	}

}
