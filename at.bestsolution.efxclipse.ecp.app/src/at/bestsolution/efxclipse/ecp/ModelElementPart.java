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

import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecp.edit.ControlFactory;
import org.eclipse.emf.ecp.edit.ECPEditorContext;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXConsole;

import at.bestsolution.efxclipse.ecp.ui.FXControlFactory;
import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsFactory;

@SuppressWarnings("restriction")
public class ModelElementPart {
		
	@Inject
	ECPEditorContext modelElementContext;

	@Inject
	ControlFactory controlFactory = FXControlFactory.INSTANCE;

	@Inject
	public ModelElementPart(BorderPane parent, final MApplication application) {
		

		Contact john = ContactsFactory.eINSTANCE.createContact();
		john.setFirstName("John");
		john.setLastName("Doe");
		
		VBox vBox = new VBox();
		
		
		
		parent.setCenter(vBox);

	}

}
