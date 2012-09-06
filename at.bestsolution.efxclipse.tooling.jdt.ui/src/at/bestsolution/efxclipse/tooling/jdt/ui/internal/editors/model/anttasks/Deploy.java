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
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Application;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Callback;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Info;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Permissions;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Platform;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isEmbedjnlp <em>Embedjnlp</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isExtension <em>Extension</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isIncludeDT <em>Include DT</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isOfflineAllowed <em>Offline Allowed</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderref <em>Placeholderref</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderid <em>Placeholderid</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getUpdatemode <em>Updatemode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlatform <em>Platform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getApplication <em>Application</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getTemplate <em>Template</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getCallbacks <em>Callbacks</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getInfo <em>Info</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isNativePackage <em>Native Package</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getSplashImage <em>Splash Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy()
 * @model
 * @generated
 */
public interface Deploy extends EObject {
	/**
	 * Returns the value of the '<em><b>Embedjnlp</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedjnlp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedjnlp</em>' attribute.
	 * @see #setEmbedjnlp(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Embedjnlp()
	 * @model default="false"
	 * @generated
	 */
	boolean isEmbedjnlp();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isEmbedjnlp <em>Embedjnlp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedjnlp</em>' attribute.
	 * @see #isEmbedjnlp()
	 * @generated
	 */
	void setEmbedjnlp(boolean value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Extension()
	 * @model default="false"
	 * @generated
	 */
	boolean isExtension();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #isExtension()
	 * @generated
	 */
	void setExtension(boolean value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Height()
	 * @model
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Include DT</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include DT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include DT</em>' attribute.
	 * @see #setIncludeDT(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_IncludeDT()
	 * @model default="false"
	 * @generated
	 */
	boolean isIncludeDT();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isIncludeDT <em>Include DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include DT</em>' attribute.
	 * @see #isIncludeDT()
	 * @generated
	 */
	void setIncludeDT(boolean value);

	/**
	 * Returns the value of the '<em><b>Offline Allowed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offline Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offline Allowed</em>' attribute.
	 * @see #setOfflineAllowed(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_OfflineAllowed()
	 * @model default="true"
	 * @generated
	 */
	boolean isOfflineAllowed();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isOfflineAllowed <em>Offline Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offline Allowed</em>' attribute.
	 * @see #isOfflineAllowed()
	 * @generated
	 */
	void setOfflineAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Placeholderref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholderref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholderref</em>' attribute.
	 * @see #setPlaceholderref(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Placeholderref()
	 * @model
	 * @generated
	 */
	String getPlaceholderref();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderref <em>Placeholderref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholderref</em>' attribute.
	 * @see #getPlaceholderref()
	 * @generated
	 */
	void setPlaceholderref(String value);

	/**
	 * Returns the value of the '<em><b>Placeholderid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholderid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholderid</em>' attribute.
	 * @see #setPlaceholderid(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Placeholderid()
	 * @model
	 * @generated
	 */
	String getPlaceholderid();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderid <em>Placeholderid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholderid</em>' attribute.
	 * @see #getPlaceholderid()
	 * @generated
	 */
	void setPlaceholderid(String value);

	/**
	 * Returns the value of the '<em><b>Updatemode</b></em>' attribute.
	 * The default value is <code>"background"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updatemode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatemode</em>' attribute.
	 * @see #setUpdatemode(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Updatemode()
	 * @model default="background"
	 * @generated
	 */
	String getUpdatemode();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getUpdatemode <em>Updatemode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updatemode</em>' attribute.
	 * @see #getUpdatemode()
	 * @generated
	 */
	void setUpdatemode(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Width()
	 * @model
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(Platform)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Platform()
	 * @model containment="true"
	 * @generated
	 */
	Platform getPlatform();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(Platform value);

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferences</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference.
	 * @see #setPreferences(Preferences)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Preferences()
	 * @model containment="true"
	 * @generated
	 */
	Preferences getPreferences();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPreferences <em>Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferences</em>' containment reference.
	 * @see #getPreferences()
	 * @generated
	 */
	void setPreferences(Preferences value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(Application)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Application()
	 * @model containment="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Template)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Template()
	 * @model containment="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Callbacks</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Callback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callbacks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callbacks</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Callbacks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Callback> getCallbacks();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(Info value);

	/**
	 * Returns the value of the '<em><b>Native Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Package</em>' attribute.
	 * @see #setNativePackage(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_NativePackage()
	 * @model
	 * @generated
	 */
	boolean isNativePackage();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#isNativePackage <em>Native Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Package</em>' attribute.
	 * @see #isNativePackage()
	 * @generated
	 */
	void setNativePackage(boolean value);

	/**
	 * Returns the value of the '<em><b>Splash Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Splash Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splash Image</em>' attribute.
	 * @see #setSplashImage(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getDeploy_SplashImage()
	 * @model
	 * @generated
	 */
	String getSplashImage();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy#getSplashImage <em>Splash Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Splash Image</em>' attribute.
	 * @see #getSplashImage()
	 * @generated
	 */
	void setSplashImage(String value);

} // Deploy
