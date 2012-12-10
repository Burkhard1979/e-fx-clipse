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
package at.bestsolution.efxclipse.runtime.examples.contacts.app;

import java.util.EventObject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsFactory;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.Group;
import at.bestsolution.efxclipse.runtime.demo.contacts.provider.ContactsItemProviderAdapterFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryListCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryObservableList;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTableCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeItem;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.ProxyCellValueFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.CellDragAdapter;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

public class ContactsController {

	@FXML
	private Button undo;

	@FXML
	private Button redo;

	@FXML
	private TreeView<Object> treeView;

	@FXML
	private TableView<Object> tableView;

	@FXML
	private TableColumn<Object, Object> firstNameColumn;

	@FXML
	private TableColumn<Object, Object> lastNameColumn;

	@FXML
	private ListView<Object> listView;

	private BasicCommandStack commandStack;

	private AdapterFactoryEditingDomain editingDomain;

	@FXML
	public void initialize() {
		ContactsItemProviderAdapterFactory adapterFactory = new ContactsItemProviderAdapterFactory();
		commandStack = new BasicCommandStack();
		commandStack.addCommandStackListener(new CommandStackListener() {

			@Override
			public void commandStackChanged(EventObject event) {
				updateUndoRedo();
			}

		});
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);

		final Group contacts = ContactsDummyFactory.createContacts();

		ICellUpdateListener contextMenuProvider = new ContextMenuProvider();

		undo.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				commandStack.undo();
			}

		});

		redo.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				commandStack.redo();
			}

		});

		// TreeView
		treeView.setRoot(new AdapterFactoryTreeItem(contacts, adapterFactory));
		AdapterFactoryTreeCellFactory treeCellFactory = new AdapterFactoryTreeCellFactory(adapterFactory);

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		treeCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));

		// add the context menu
		treeCellFactory.addCellUpdateListener(contextMenuProvider);

		treeView.setCellFactory(treeCellFactory);

		// allow multiple selections
		treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		// ListView
		AdapterFactoryListCellFactory listCellFactory = new AdapterFactoryListCellFactory(adapterFactory);
		listCellFactory.addCellCreationListener(new CellDragAdapter());
		listCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		listCellFactory.addCellUpdateListener(contextMenuProvider);
		listView.setCellFactory(listCellFactory);
		listView.setItems(new AdapterFactoryObservableList(adapterFactory, contacts));
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		// TableView
		firstNameColumn.setCellValueFactory(new ProxyCellValueFactory());
		AdapterFactoryTableCellFactory firstNameCellFactory = new AdapterFactoryTableCellFactory(adapterFactory, 0);
		firstNameCellFactory.addCellCreationListener(new CellDragAdapter());
		firstNameCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		firstNameCellFactory.addCellUpdateListener(contextMenuProvider);
		firstNameColumn.setCellFactory(firstNameCellFactory);
		firstNameColumn.setSortable(false);

		lastNameColumn.setCellValueFactory(new ProxyCellValueFactory());
		AdapterFactoryTableCellFactory lastNameCellFactory = new AdapterFactoryTableCellFactory(adapterFactory, 1);
		lastNameCellFactory.addCellCreationListener(new CellDragAdapter());
		lastNameCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		lastNameCellFactory.addCellUpdateListener(contextMenuProvider);
		lastNameColumn.setCellFactory(lastNameCellFactory);
		lastNameColumn.setSortable(false);

		tableView.setItems(new AdapterFactoryObservableList(adapterFactory, contacts));
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		updateUndoRedo();
	}

	private void updateUndoRedo() {
		undo.setDisable(!commandStack.canUndo());
		redo.setDisable(!commandStack.canRedo());
	}

	private class ContextMenuProvider implements ICellUpdateListener {

		@Override
		public void updateItem(Cell<?> cell, final Object item, boolean empty) {

			ContextMenu contextMenu = new ContextMenu();

			if (item instanceof Group) {
				MenuItem addMenuItem = new MenuItem("Add Contact");
				addMenuItem.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						Contact contact = ContactsFactory.eINSTANCE.createContact();
						contact.setFirstName("Homer");
						contact.setLastName("Simpson");
						Command command = AddCommand.create(editingDomain, item, ContactsPackage.Literals.GROUP__CONTACTS, contact);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}

				});

				contextMenu.getItems().add(addMenuItem);
			} else if (item instanceof Contact) {
				MenuItem deleteMenuItem = new MenuItem("Delete Contact");
				deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						Command command = DeleteCommand.create(editingDomain, item);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}

				});

				contextMenu.getItems().add(deleteMenuItem);
			}

			if (!contextMenu.getItems().isEmpty())
				cell.setContextMenu(contextMenu);
		}
	}

}
