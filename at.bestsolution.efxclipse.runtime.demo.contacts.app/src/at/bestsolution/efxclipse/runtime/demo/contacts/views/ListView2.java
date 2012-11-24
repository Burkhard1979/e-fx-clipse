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

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;
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
public class ListView2 {

	@Inject
	public ListView2(BorderPane parent, final MApplication application, final ContactsManager contactsManager) {
		EditingDomain editingDomain = contactsManager.getEditingDomain();

		// TreeView
		TreeView<Object> treeView = new TreeView<>();
		treeView.setRoot(new AdapterFactoryTreeItem(contactsManager.getRootGroup(), contactsManager.getAdapterFactory()));
		AdapterFactoryTreeCellFactory treeCellFactory = new AdapterFactoryTreeCellFactory(contactsManager.getAdapterFactory());

		// add edit support
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ContactsPackage.eINSTANCE.getGroup_Name(), editingDomain));

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		treeCellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));

		treeView.setCellFactory(treeCellFactory);

		parent.setCenter(treeView);

		treeView.setShowRoot(false);

		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {

			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				if (arg2 instanceof AdapterFactoryTreeItem) {
					Object value = ((AdapterFactoryTreeItem) arg2).getValue();
					if (value instanceof Contact)
						application.getContext().set(Contact.class, (Contact) value);
				}
			}

		});

		// add the context menu
		ContextMenuProvider contextMenuProvider = new ContextMenuProvider(editingDomain);
		treeCellFactory.addCellUpdateListener(contextMenuProvider);

		treeView.setEditable(true);
	}
}
