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
package at.bestsolution.efxclipse.ecp;

import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;

@SuppressWarnings("restriction")
public class ModelExplorerPart {
	
	@Inject
	public ModelExplorerPart(BorderPane parent, final MApplication application, ECPProjectManager projectManager) {
		
		TreeView<Object> treeView = new TreeView<>();
		
		TreeItem<Object> root = new TreeItem<Object>();
		
		for (ECPProject project : projectManager.getProjects()) {
			TreeItem<Object> treeItem = new TreeItem<>((Object)project);
			root.getChildren().add(treeItem);
		}
		
		treeView.setRoot(root);
		treeView.setShowRoot(false);
		
		treeView.setCellFactory(new Callback<TreeView<Object>, TreeCell<Object>>() {
			
			@Override
			public TreeCell<Object> call(TreeView<Object> arg0) {
				return new TreeCell<Object>() {
					
					@Override
					protected void updateItem(Object item, boolean empty) {
						super.updateItem(item, empty);
						if(item instanceof ECPProject) {
							ECPProject project = (ECPProject) item;
							setText(project.getName());
						} else {
							setText(null);
						}
					}
					
				};
			}
			
		});
		
		parent.setCenter(treeView);

	}

}
