/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Connection#getStart <em>Start</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Connection#getEnd <em>End</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Connection#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Connector)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnection_Start()
	 * @model
	 * @generated
	 */
	Connector getStart();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Connector value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Connector)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnection_End()
	 * @model
	 * @generated
	 */
	Connector getEnd();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Connector value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.System#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(at.bestsolution.efxclipse.gefx.scene.System)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnection_System()
	 * @see at.bestsolution.efxclipse.gefx.scene.System#getConnections
	 * @model opposite="connections" transient="false"
	 * @generated
	 */
	at.bestsolution.efxclipse.gefx.scene.System getSystem();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(at.bestsolution.efxclipse.gefx.scene.System value);

} // Connection
