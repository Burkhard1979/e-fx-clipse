/**
 */
package at.bestsolution.efxclipse.gefx.scene.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import at.bestsolution.efxclipse.gefx.scene.Block;
import at.bestsolution.efxclipse.gefx.scene.Connection;
import at.bestsolution.efxclipse.gefx.scene.Connector;
import at.bestsolution.efxclipse.gefx.scene.LinePoint;
import at.bestsolution.efxclipse.gefx.scene.SceneFactory;
import at.bestsolution.efxclipse.gefx.scene.ScenePackage;
import at.bestsolution.efxclipse.gefx.scene.StraightLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SceneFactoryImpl extends EFactoryImpl implements SceneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SceneFactory init() {
		try {
			SceneFactory theSceneFactory = (SceneFactory)EPackage.Registry.INSTANCE.getEFactory("http://bestsolution.at/GEFX/Scene/1.0"); 
			if (theSceneFactory != null) {
				return theSceneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SceneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScenePackage.SYSTEM: return createSystem();
			case ScenePackage.BLOCK: return createBlock();
			case ScenePackage.CONNECTION: return createConnection();
			case ScenePackage.CONNECTOR: return createConnector();
			case ScenePackage.LINE_POINT: return createLinePoint();
			case ScenePackage.STRAIGHT_LINE: return createStraightLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.bestsolution.efxclipse.gefx.scene.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinePoint createLinePoint() {
		LinePointImpl linePoint = new LinePointImpl();
		return linePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StraightLine createStraightLine() {
		StraightLineImpl straightLine = new StraightLineImpl();
		return straightLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenePackage getScenePackage() {
		return (ScenePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenePackage getPackage() {
		return ScenePackage.eINSTANCE;
	}

} //SceneFactoryImpl
