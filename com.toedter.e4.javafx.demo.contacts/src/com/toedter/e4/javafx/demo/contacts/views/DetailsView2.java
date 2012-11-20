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

package com.toedter.e4.javafx.demo.contacts.views;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;

import com.toedter.e4.javafx.demo.contacts.model.ContactsManager;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;

@SuppressWarnings("restriction")
public class DetailsView2 {

	DetailsViewController controller;

	@Inject
	ContactsManager contactsManager;
	
	@Inject
	public DetailsView2(BorderPane parent, final MApplication application) {
		
		URL location = getClass().getResource("details.fxml");
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(location);
    	controller = new DetailsViewController();
		fxmlLoader.setController(controller);

    	Pane root = null;
    	try {
			root = (Pane)fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		parent.setCenter(root);
	}
	
	@Inject
	public void setSelection(@Optional Contact contact) {
		if (contact != null)
			controller.updateBindings(contact, contactsManager.getEditingDomain());
	}

}
