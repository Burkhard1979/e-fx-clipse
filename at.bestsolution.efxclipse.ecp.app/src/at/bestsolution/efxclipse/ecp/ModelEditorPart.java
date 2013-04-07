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

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecp.core.ECPRepositoryManager;
//import org.eclipse.emf.ecp.edit.ControlFactory;

import at.bestsolution.efxclipse.ecp.ui.FXControlFactory;
import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsFactory;

@SuppressWarnings("restriction")
public class ModelEditorPart {

//	ControlFactory controlFactory = FXControlFactory.INSTANCE;

	@Inject
	public ModelEditorPart(BorderPane parent, final MApplication application, ECPRepositoryManager repositoryManager) {
		

		Contact john = ContactsFactory.eINSTANCE.createContact();
		john.setFirstName("John");
		john.setLastName("Doe");
		
		VBox vBox = new VBox();
		
		Button deleteButton = new Button("delete");
		vBox.getChildren().add(deleteButton);
		
		
		parent.setCenter(vBox);

	}

}
