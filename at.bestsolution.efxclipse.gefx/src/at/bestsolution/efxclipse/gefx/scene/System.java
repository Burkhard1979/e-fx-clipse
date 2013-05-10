/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.System#getConnections <em>Connections</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.System#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.System#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.gefx.scene.Connection}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getSystem_Connections()
	 * @see at.bestsolution.efxclipse.gefx.scene.Connection#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.gefx.scene.Block}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.efxclipse.gefx.scene.Block#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getSystem_Blocks()
	 * @see at.bestsolution.efxclipse.gefx.scene.Block#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.gefx.scene.StraightLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage#getSystem_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StraightLine> getLines();

} // System
