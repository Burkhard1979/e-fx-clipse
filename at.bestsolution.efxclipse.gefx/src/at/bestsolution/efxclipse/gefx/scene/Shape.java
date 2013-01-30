/**
 */
package at.bestsolution.efxclipse.gefx.scene;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Shape#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Shape#getStroke <em>Stroke</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends Node {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Paint)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape_Fill()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paint getFill();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Paint value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #setStroke(Paint)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getShape_Stroke()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paint getStroke();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Paint value);

} // Shape
