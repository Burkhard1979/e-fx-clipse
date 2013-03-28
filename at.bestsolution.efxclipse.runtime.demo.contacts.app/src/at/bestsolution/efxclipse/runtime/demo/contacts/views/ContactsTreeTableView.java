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

import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableValueBase;
import javafx.collections.ListChangeListener;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;

import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryObservableList;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTableCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeItem;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeTableCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.EAttributeCellEditHandler;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.ProxyCellValueFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.CellDragAdapter;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

@SuppressWarnings("restriction")
public class ContactsTreeTableView {

	@Inject
	@SuppressWarnings("unchecked")
	public ContactsTreeTableView(BorderPane parent, final MApplication application, final ContactsManager contactsManager) {
		EditingDomain editingDomain = contactsManager.getEditingDomain();
		AdapterFactory adapterFactory = contactsManager.getAdapterFactory();

		TreeTableView<Object> tableView = new TreeTableView<>();

		parent.setCenter(tableView);

		TreeTableColumn<Object, Object> firstNameColumn = new TreeTableColumn<>("First Name");
		TreeTableColumn<Object, Object> lastNameColumn = new TreeTableColumn<>("Last Name");

		tableView.getColumns().addAll(firstNameColumn, lastNameColumn);

		
		AdapterFactoryTreeTableCellFactory<Object, Object> firstNameCellFactory = new AdapterFactoryTreeTableCellFactory<>(adapterFactory, 0);
//		firstNameCellFactory.addCellCreationListener(new CellDragAdapter());
//		firstNameCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		firstNameColumn.setCellFactory(firstNameCellFactory);
//		firstNameColumn.setSortable(false);
		firstNameColumn.setCellValueFactory(new TreeTableProxyCellValueFactory());

		AdapterFactoryTreeTableCellFactory<Object, Object> lastNameCellFactory = new AdapterFactoryTreeTableCellFactory<>(adapterFactory, 1);
//		lastNameCellFactory.addCellCreationListener(new CellDragAdapter());
//		lastNameCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		lastNameColumn.setCellFactory(lastNameCellFactory);
//		lastNameColumn.setSortable(false);
		lastNameColumn.setCellValueFactory(new TreeTableProxyCellValueFactory());

//		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		tableView.setRoot(new AdapterFactoryTreeItem(contactsManager.getRootGroup(), tableView, adapterFactory));

		tableView.setShowRoot(false);
		
//
//		// add edit support
//		tableView.setEditable(true);
//		firstNameCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ContactsPackage.eINSTANCE.getContact_FirstName(),
//				editingDomain));
//		lastNameCellFactory
//				.addCellEditHandler(new EAttributeCellEditHandler(ContactsPackage.eINSTANCE.getContact_LastName(), editingDomain));
//
//		// add the context menu
//		ContextMenuProvider contextMenuProvider = new ContextMenuProvider(contactsManager);
//		firstNameCellFactory.addCellUpdateListener(contextMenuProvider);
//		lastNameCellFactory.addCellUpdateListener(contextMenuProvider);
//
//		tableView.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<Object>() {
//
//			@Override
//			public void onChanged(Change<?> change) {
//				application.getContext().set(List.class, change.getList());
//			}
//
//		});
//
//		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {
//
//			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
//				application.getContext().set(Object.class, arg2);
//			}
//
//		});

	}

}
