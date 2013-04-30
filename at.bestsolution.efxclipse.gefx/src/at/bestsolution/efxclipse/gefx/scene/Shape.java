/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Shape#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Shape#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Shape#getSceneX <em>Scene X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Shape#getSceneY <em>Scene Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends EObject {
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
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getX <em>X</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Scene X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene X</em>' attribute.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape_SceneX()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	double getSceneX();

	/**
	 * Returns the value of the '<em><b>Scene Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Y</em>' attribute.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape_SceneY()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	double getSceneY();

} // Shape
