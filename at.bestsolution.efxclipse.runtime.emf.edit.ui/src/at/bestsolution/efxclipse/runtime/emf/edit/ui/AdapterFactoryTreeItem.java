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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import javafx.collections.ObservableList;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * A {@link TreeItem} that wraps an {@link AdapterFactory} and retrieves its
 * children from the adapter-implemented {@link ITreeItemContentProvider}
 * interface.
 */
public class AdapterFactoryTreeItem extends TreeItem<Object> {

	protected ITreeItemContentProvider provider;
	protected AdapterFactory adapterFactory;
	public TreeView<?> treeView;

	public AdapterFactoryTreeItem(Object object, TreeView<?> treeView, AdapterFactory adapterFactory) {
		super(object);
		this.treeView = treeView;
		this.adapterFactory = adapterFactory;

		Object adapter = adapterFactory.adapt(object, ITreeItemContentProvider.class);

		if (adapter instanceof ITreeItemContentProvider)
			provider = (ITreeItemContentProvider) adapter;

		if (object instanceof Notifier) {
			((Notifier) object).eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeature() instanceof EReference)
						updateChildren();
				}

			});
		}

		updateChildren();
	}

	private void updateChildren() {
		ObservableList<TreeItem<Object>> childTreeItems = getChildren();
		List<?> selection = treeView.getSelectionModel().getSelectedItems();
		ArrayList<Object> removedItems = new ArrayList<>();

		for (Object selectedTreeItem : selection) {
			for (TreeItem<Object> childTreeItem : childTreeItems) {
				if (selectedTreeItem == childTreeItem)
					removedItems.add(childTreeItem.getValue());
			}
		}

		for (Object removedItem : removedItems) {
			treeView.getSelectionModel().clearSelection(indexForItem(removedItem));
		}

		Collection<?> newChildren = provider.getChildren(getValue());

		childTreeItems.clear();

		if (provider != null) {
			for (Object child : newChildren) {
				AdapterFactoryTreeItem treeItem = new AdapterFactoryTreeItem(child, treeView, adapterFactory);
				childTreeItems.add(treeItem);
				if (removedItems.contains(child)) {
					MultipleSelectionModel<?> selectionModel = treeView.getSelectionModel();
					Method m;
					try {
						m = selectionModel.getClass().getDeclaredMethod("select", new Class[] { TreeItem.class });
						m.setAccessible(true);
						m.invoke(selectionModel, treeItem);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	private int indexForItem(Object item) {
		MultipleSelectionModel<?> selectionModel = treeView.getSelectionModel();
		ObservableList<?> selectedItems = selectionModel.getSelectedItems();
		ObservableList<Integer> selectedIndices = selectionModel.getSelectedIndices();
		return selectedIndices.get(selectedItems.indexOf(item));
	}

}
