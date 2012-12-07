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

import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;

import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsFactory;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.Group;

import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;

@SuppressWarnings("restriction")
public class AddGroupHandler {

	@Inject
	ContactsManager contactsManager;

	@Execute
	void execute() {
		Group group = ContactsFactory.eINSTANCE.createGroup();
		group.setName("New Group");
		Command command = AddCommand.create(contactsManager.getEditingDomain(), contactsManager.getRootGroup(), ContactsPackage.Literals.GROUP__GROUPS, group); 
		if (command != null && command.canExecute())
			contactsManager.getEditingDomain().getCommandStack().execute(command);
	}

}
