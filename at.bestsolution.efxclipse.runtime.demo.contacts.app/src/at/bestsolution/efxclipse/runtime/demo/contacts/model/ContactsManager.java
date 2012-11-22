/*******************************************************************************
 *  Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 *  All rights reserved. This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html 
 *  
 *  Contributors: 
 *      Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation
 ******************************************************************************/
package at.bestsolution.efxclipse.runtime.demo.contacts.model;

import at.bestsolution.efxclipse.runtime.demo.contacts.Group;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

public interface ContactsManager {

//	Resource getResource();
	
	Group getRootGroup();

	AdapterFactory getAdapterFactory();

	EditingDomain getEditingDomain();

}