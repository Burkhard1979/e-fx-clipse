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

import javafx.scene.control.Cell;
import javafx.scene.control.SelectionMode;

import java.util.ArrayList;

import java.util.List;

import javafx.collections.ListChangeListener;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeItem;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.EAttributeCellEditHandler;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.CellDragAdapter;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.EditingDomainCellDropAdapter;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javax.inject.Inject;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("restriction")
public class ContactsTreeView {

	@Inject
	public ContactsTreeView(BorderPane parent, final MApplication application, final ContactsManager contactsManager) {
		EditingDomain editingDomain = contactsManager.getEditingDomain();

		// TreeView
		TreeView<Object> treeView = new TreeView<>();
		treeView.setRoot(new AdapterFactoryTreeItem(contactsManager.getRootGroup(), treeView, contactsManager.getAdapterFactory()));
		AdapterFactoryTreeCellFactory treeCellFactory = new AdapterFactoryTreeCellFactory(contactsManager.getAdapterFactory());

		// add edit support
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ContactsPackage.eINSTANCE.getGroup_Name(), editingDomain));

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(editingDomain);
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		treeCellFactory.addCellCreationListener(dropAdapter);
		
		treeCellFactory.addCellUpdateListener(new ICellUpdateListener() {
			
			@Override
			public void updateItem(Cell<?> cell, Object item, boolean empty) {
				cell.setStyle("-fx-border-color: green; -fx-border-width: 3; -fx-border-radius: 3;");
			}
			
		});

		treeView.setCellFactory(treeCellFactory);

		parent.setCenter(treeView);

		treeView.setShowRoot(false);
		
		treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {

			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				if (arg2 instanceof AdapterFactoryTreeItem) {
					Object value = ((AdapterFactoryTreeItem) arg2).getValue();
					if (value instanceof Contact)
						application.getContext().set(Object.class, value);
				}
			}

		});
		
		treeView.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<Object>() {

			@Override
			public void onChanged(Change<?> change) {
				ArrayList<Object> selection = new ArrayList<Object>();
				for (Object item : change.getList()) {
					if (item instanceof AdapterFactoryTreeItem) {
						Object value = ((AdapterFactoryTreeItem) item).getValue();
						selection.add(value);
					}
				}
				application.getContext().set(List.class, selection);
			}
			
		});
		
		// add the context menu
		ContextMenuProvider contextMenuProvider = new ContextMenuProvider(contactsManager);
		treeCellFactory.addCellUpdateListener(contextMenuProvider);

		treeView.setEditable(true);
	}
}
