/*******************************************************************************
 * Copyright (c) 2011 Kai Toedter and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial API and implementation
 ******************************************************************************/

package at.bestsolution.efxclipse.runtime.demo.contacts.views;

import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryObservableList;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTableCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.ProxyCellValueFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.CellDragAdapter;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.EditingDomainCellDropAdapter;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javax.inject.Inject;
import org.eclipse.e4.ui.model.application.MApplication;

@SuppressWarnings("restriction")
public class ListView {
	
	@Inject
	@SuppressWarnings("unchecked")
	public ListView(BorderPane parent, final MApplication application, ContactsManager contactsManager) {
		TableView<Contact> tableView = new TableView<>();
		TableColumn<Contact, String> firstNameColumn = new TableColumn<>("First Name");
		firstNameColumn.setCellValueFactory(new ProxyCellValueFactory<Contact, String>());
		AdapterFactoryTableCellFactory<Contact, String> firstNameCellFactory = new AdapterFactoryTableCellFactory<>(contactsManager.getAdapterFactory(), 0);
		firstNameCellFactory.addCellCreationListener(new CellDragAdapter());
		firstNameCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(contactsManager.getEditingDomain()));
		firstNameColumn.setCellFactory(firstNameCellFactory);
		firstNameColumn.setSortable(false);

		TableColumn<Contact, String> lastNameColumn = new TableColumn<>("Last Name");
		lastNameColumn.setCellValueFactory(new ProxyCellValueFactory<Contact, String>());
		AdapterFactoryTableCellFactory<Contact, String> lastNameCellFactory = new AdapterFactoryTableCellFactory<>(contactsManager.getAdapterFactory(), 1);
		lastNameCellFactory.addCellCreationListener(new CellDragAdapter());
		lastNameCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(contactsManager.getEditingDomain()));
		lastNameColumn.setCellFactory(lastNameCellFactory);
		lastNameColumn.setSortable(false);
		
		parent.setCenter(tableView);

		tableView.getColumns().addAll(firstNameColumn, lastNameColumn);
		
		tableView.setItems(new AdapterFactoryObservableList<Contact>(contactsManager.getAdapterFactory(), contactsManager.getRootGroup()));

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {

			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				application.getContext().set(Contact.class, (Contact)arg2);
			}
			
		});
	}
}
