/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.StraightLine#getPoints <em>Points</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.StraightLine#getStartConnector <em>Start Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getStraightLine()
 * @model
 * @generated
 */
public interface StraightLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.gefx.scene.LinePoint}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.LinePoint#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getStraightLine_Points()
	 * @see at.bestsolution.efxclipse.gefx.scene.LinePoint#getLine
	 * @model opposite="line" containment="true" lower="2"
	 * @generated
	 */
	EList<LinePoint> getPoints();

	/**
	 * Returns the value of the '<em><b>Start Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Connector</em>' reference.
	 * @see #setStartConnector(Connector)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getStraightLine_StartConnector()
	 * @model
	 * @generated
	 */
	Connector getStartConnector();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.StraightLine#getStartConnector <em>Start Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Connector</em>' reference.
	 * @see #getStartConnector()
	 * @generated
	 */
	void setStartConnector(Connector value);

} // Line
