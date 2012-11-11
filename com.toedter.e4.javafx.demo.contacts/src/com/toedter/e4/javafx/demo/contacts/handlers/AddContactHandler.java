/*******************************************************************************
 * Copyright (c) 2009, 2010 Siemens AG and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Tödter - initial implementation
 ******************************************************************************/

package com.toedter.e4.javafx.demo.contacts.handlers;

import com.toedter.e4.demo.contacts.Contact;
import com.toedter.e4.demo.contacts.ContactsFactory;
import com.toedter.e4.javafx.demo.contacts.model.ContactsManager;
import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;

@SuppressWarnings("restriction")
public class AddContactHandler {

	@Inject
	ContactsManager contactsManager;

	@Execute
	void execute() {
		Contact contact = ContactsFactory.eINSTANCE.createContact();
		Command command = new AddCommand(contactsManager.getEditingDomain(),
				contactsManager.getResource().getContents(), contact);
		if (command != null && command.canExecute())
			contactsManager.getEditingDomain().getCommandStack()
					.execute(command);
	}

}
