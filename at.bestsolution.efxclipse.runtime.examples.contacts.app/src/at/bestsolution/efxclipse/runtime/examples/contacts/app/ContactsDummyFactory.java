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
package at.bestsolution.efxclipse.runtime.examples.contacts.app;

import at.bestsolution.efxclipse.runtime.examples.contacts.Contact;
import at.bestsolution.efxclipse.runtime.examples.contacts.ContactsFactory;
import at.bestsolution.efxclipse.runtime.examples.contacts.Group;

public class ContactsDummyFactory {

	public static Group createContacts() {
		Group contacts = ContactsFactory.eINSTANCE.createGroup();
		contacts.setName("Contacts");
		
		Group group1 = ContactsFactory.eINSTANCE.createGroup();
		group1.setName("Group 1");
		contacts.getGroups().add(group1);
		
		Contact hans = ContactsFactory.eINSTANCE.createContact();
		hans.setFirstName("Hans");
		hans.setLastName("Wurst");
		group1.getContacts().add(hans);

		Group group2 = ContactsFactory.eINSTANCE.createGroup();
		group2.setName("Group 2");
		contacts.getGroups().add(group2);

		Contact peter = ContactsFactory.eINSTANCE.createContact();
		peter.setFirstName("Peter");
		peter.setLastName("Lustig");
		group2.getContacts().add(peter);

		return contacts;
	}

}
