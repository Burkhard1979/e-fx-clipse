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
package at.bestsolution.efxclipse.runtime.demo.contacts.views;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableRow;
import javafx.scene.control.TreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.CutToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class ContextMenuProvider implements ICellUpdateListener {

	EditingDomain editingDomain;

	public ContextMenuProvider(EditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
	}

	static MultipleSelectionModel<?> getSelectionModel(Cell<?> cell) {
		if (cell instanceof ListCell<?>) {
			return ((ListCell<?>) cell).getListView().getSelectionModel();
		} else if (cell instanceof TreeCell<?>) {
			return ((TreeCell<?>) cell).getTreeView().getSelectionModel();
		} else if (cell instanceof TableCell<?, ?>) {
			return ((TableCell<?, ?>) cell).getTableView().getSelectionModel();
		} else if (cell instanceof TableRow<?>) {
			return ((TableRow<?>) cell).getTableView().getSelectionModel();
		}
		return null;
	}

	@Override
	public void updateItem(Cell<?> cell, final Object item, boolean empty) {

		final MultipleSelectionModel<?> selectionModel = getSelectionModel(cell);

		ContextMenu contextMenu = new ContextMenu();

		if (item instanceof Contact) {

			MenuItem deleteMenuItem = new MenuItem("Delete", getImage("icons/silk/cross.png"));
			deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Command command = DeleteCommand.create(editingDomain, selectionModel.getSelectedItems());
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(deleteMenuItem);

			MenuItem cutMenuItem = new MenuItem("Cut", getImage("icons/silk/cut.png"));
			cutMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Command command = CutToClipboardCommand.create(editingDomain, selectionModel.getSelectedItems());
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(cutMenuItem);

			MenuItem copyMenuItem = new MenuItem("Copy", getImage("icons/silk/page_copy.png"));
			copyMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Command command = CopyToClipboardCommand.create(editingDomain, selectionModel.getSelectedItems());
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(copyMenuItem);

			MenuItem pasteMenuItem = new MenuItem("Paste", getImage("icons/silk/page_paste.png"));
			pasteMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Contact contact = (Contact) item;
					Command command = PasteFromClipboardCommand.create(editingDomain, contact.eContainer(), contact.eContainingFeature());
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(pasteMenuItem);
		}

		if (!contextMenu.getItems().isEmpty())
			cell.setContextMenu(contextMenu);
	}

	private ImageView getImage(String path) {
		try {
			URL url = new URL("platform:/plugin/at.bestsolution.efxclipse.runtime.demo.contacts.app/" + path);
			Image image = new Image(url.toExternalForm());
			return new ImageView(image);
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException(e);
		}
	}

}
