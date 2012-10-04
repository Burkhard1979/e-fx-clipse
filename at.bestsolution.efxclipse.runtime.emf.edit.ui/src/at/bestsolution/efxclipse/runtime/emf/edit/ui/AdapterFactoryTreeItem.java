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

import javafx.scene.control.TreeItem;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * A {@link TreeItem} that wraps an {@link AdapterFactory} and retrieves its children from the
 * adapter-implemented {@link ITreeItemContentProvider} interface.
 */
public class AdapterFactoryTreeItem extends TreeItem<Object> {

	protected ITreeItemContentProvider provider;
	protected AdapterFactory adapterFactory;

	public AdapterFactoryTreeItem(Object object, AdapterFactory adapterFactory) {
		super(object);
		this.adapterFactory = adapterFactory;
		
		Object adapter = adapterFactory.adapt(object,
				ITreeItemContentProvider.class);
		
		if (adapter instanceof ITreeItemContentProvider)
			provider = (ITreeItemContentProvider) adapter;

		
		if(object instanceof Notifier){
			((Notifier) object).eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getFeature() instanceof EReference)
						updateChildren();
				}

			});
		}
		
		updateChildren();
	}

	private void updateChildren() {
		getChildren().clear();
		if (provider != null) {
			for (Object child : provider.getChildren(getValue()))
				getChildren().add(new AdapterFactoryTreeItem(child, adapterFactory));			
		}		
	}

}
