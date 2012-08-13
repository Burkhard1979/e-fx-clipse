/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Param;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ant Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory <em>Build Directory</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getManifestEntries <em>Manifest Entries</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#isCssToBin <em>Css To Bin</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask()
 * @model
 * @generated
 */
public interface AntTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' reference.
	 * @see #setDeploy(Deploy)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Deploy()
	 * @model
	 * @generated
	 */
	Deploy getDeploy();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deploy value);

	/**
	 * Returns the value of the '<em><b>Jar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar</em>' reference.
	 * @see #setJar(Jar)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Jar()
	 * @model
	 * @generated
	 */
	Jar getJar();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jar</em>' reference.
	 * @see #getJar()
	 * @generated
	 */
	void setJar(Jar value);

	/**
	 * Returns the value of the '<em><b>Signjar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signjar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signjar</em>' reference.
	 * @see #setSignjar(SignJar)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Signjar()
	 * @model
	 * @generated
	 */
	SignJar getSignjar();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signjar</em>' reference.
	 * @see #getSignjar()
	 * @generated
	 */
	void setSignjar(SignJar value);

	/**
	 * Returns the value of the '<em><b>Build Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Directory</em>' attribute.
	 * @see #setBuildDirectory(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_BuildDirectory()
	 * @model
	 * @generated
	 */
	String getBuildDirectory();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory <em>Build Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Directory</em>' attribute.
	 * @see #getBuildDirectory()
	 * @generated
	 */
	void setBuildDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Manifest Entries</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Entries</em>' reference list.
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_ManifestEntries()
	 * @model
	 * @generated
	 */
	EList<Param> getManifestEntries();

	/**
	 * Returns the value of the '<em><b>Css To Bin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css To Bin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css To Bin</em>' attribute.
	 * @see #setCssToBin(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_CssToBin()
	 * @model
	 * @generated
	 */
	boolean isCssToBin();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#isCssToBin <em>Css To Bin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css To Bin</em>' attribute.
	 * @see #isCssToBin()
	 * @generated
	 */
	void setCssToBin(boolean value);

} // AntTask
