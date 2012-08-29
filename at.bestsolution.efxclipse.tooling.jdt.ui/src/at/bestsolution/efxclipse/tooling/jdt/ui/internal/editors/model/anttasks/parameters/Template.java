/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Template#getFile <em>File</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Template#getToFile <em>To File</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getTemplate_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Template#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>To File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To File</em>' attribute.
	 * @see #setToFile(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getTemplate_ToFile()
	 * @model
	 * @generated
	 */
	String getToFile();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Template#getToFile <em>To File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To File</em>' attribute.
	 * @see #getToFile()
	 * @generated
	 */
	void setToFile(String value);

} // Template
