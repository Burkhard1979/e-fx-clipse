/**
 *  Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 *  All rights reserved. This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html 
 *  
 *  Contributors: 
 *      Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation
 */
package at.bestsolution.efxclipse.runtime.examples.contacts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.examples.contacts.Contact#getFirstName <em>First Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.examples.contacts.Contact#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.examples.contacts.ContactsPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see at.bestsolution.efxclipse.runtime.examples.contacts.ContactsPackage#getContact_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.examples.contacts.Contact#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see at.bestsolution.efxclipse.runtime.examples.contacts.ContactsPackage#getContact_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.examples.contacts.Contact#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

} // Contact
