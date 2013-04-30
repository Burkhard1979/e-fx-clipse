/**
 */
package at.bestsolution.efxclipse.gefx.scene;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Connector#getBlock <em>Block</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Connector#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Shape {

	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.Block#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(Block)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnector_Block()
	 * @see at.bestsolution.efxclipse.gefx.scene.Block#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Connector#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(double)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getConnector_Rotation()
	 * @model required="true"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Connector#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);
} // Connector
