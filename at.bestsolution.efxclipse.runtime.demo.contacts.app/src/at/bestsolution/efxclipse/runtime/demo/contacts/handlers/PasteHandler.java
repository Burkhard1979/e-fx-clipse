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
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.Group;
import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;

@SuppressWarnings("restriction")
public class PasteHandler {

	@Inject
	ContactsManager contactsManager;

	Command command;

	@CanExecute
	boolean canExecute(@Optional List<?> selection) {
		if (selection != null && selection.size() == 1) {
			Object item = selection.get(0);

			// get containing Group if selection is a Contact
			if (item instanceof Contact)
				item = ((Contact) item).eContainer();
			
			if (item instanceof Group)
				command = PasteFromClipboardCommand.create(contactsManager.getEditingDomain(), item,
						ContactsPackage.eINSTANCE.getGroup_Contacts());
			
			return command.canExecute();
		}
		return false;
	}

	@Execute
	void execute() {
		if (command != null && command.canExecute())
			contactsManager.getEditingDomain().getCommandStack().execute(command);
	}

}
