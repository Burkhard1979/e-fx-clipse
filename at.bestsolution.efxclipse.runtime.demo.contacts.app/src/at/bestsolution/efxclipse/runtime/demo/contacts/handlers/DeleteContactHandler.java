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

package at.bestsolution.efxclipse.runtime.demo.contacts.handlers;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;
import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DeleteCommand;

@SuppressWarnings("restriction")
public class DeleteContactHandler {
	
	@Inject
	ContactsManager contactsManager;
	
	Command command;
	
	@CanExecute
	boolean canExecute(@Optional Contact contact) {
		if(contact != null) {
			command = DeleteCommand.create(contactsManager.getEditingDomain(), contact);
					//new RemoveCommand(contactsManager.getEditingDomain(), contactsManager.getResource().getContents(), contact);
			return command.canExecute();			
		}
		return false;
	}

	@Execute
	void execute(@Optional final Contact contact) {
		if(command != null && command.canExecute())
			contactsManager.getEditingDomain().getCommandStack().execute(command);
	}
	
	
}
