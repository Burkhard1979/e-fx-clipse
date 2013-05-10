/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage
 * @generated
 */
public interface SceneFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SceneFactory eINSTANCE = at.bestsolution.efxclipse.gefx.scene.impl.SceneFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Line Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Point</em>'.
	 * @generated
	 */
	LinePoint createLinePoint();

	/**
	 * Returns a new object of class '<em>Straight Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Straight Line</em>'.
	 * @generated
	 */
	StraightLine createStraightLine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenePackage getScenePackage();

} //SceneFactory
