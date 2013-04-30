/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Block#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Block#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Block#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.Block#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Shape {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.gefx.scene.Connector}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.Connector#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getBlock_Connectors()
	 * @see at.bestsolution.efxclipse.gefx.scene.Connector#getBlock
	 * @model opposite="block" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getBlock_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Block#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getBlock_Height()
	 * @model required="true"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Block#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.System#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(at.bestsolution.efxclipse.gefx.scene.System)
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getBlock_System()
	 * @see at.bestsolution.efxclipse.gefx.scene.System#getBlocks
	 * @model opposite="blocks" transient="false"
	 * @generated
	 */
	at.bestsolution.efxclipse.gefx.scene.System getSystem();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.gefx.scene.Block#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(at.bestsolution.efxclipse.gefx.scene.System value);

} // Block
