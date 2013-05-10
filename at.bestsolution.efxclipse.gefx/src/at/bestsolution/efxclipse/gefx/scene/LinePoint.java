/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.LinePoint#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.LinePoint#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getLinePoint()
 * @model
 * @generated
 */
public interface LinePoint extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getLinePoint_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.LinePoint#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getLinePoint_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.LinePoint#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

} // LinePoint
