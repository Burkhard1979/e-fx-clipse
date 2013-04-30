/**
 */
package at.bestsolution.efxclipse.gefx.scene;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.gefx.scene.SceneFactory
 * @model kind="package"
 * @generated
 */
public interface ScenePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scene";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bestsolution.at/GEFX/Scene/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scene";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenePackage eINSTANCE = at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__Y = 1;

	/**
	 * The feature id for the '<em><b>Scene X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SCENE_X = 2;

	/**
	 * The feature id for the '<em><b>Scene Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SCENE_Y = 3;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BLOCKS = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.BlockImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__X = SHAPE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__Y = SHAPE__Y;

	/**
	 * The feature id for the '<em><b>Scene X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SCENE_X = SHAPE__SCENE_X;

	/**
	 * The feature id for the '<em><b>Scene Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SCENE_Y = SHAPE__SCENE_Y;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONNECTORS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__WIDTH = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HEIGHT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SYSTEM = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__END = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ConnectorImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__X = SHAPE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__Y = SHAPE__Y;

	/**
	 * The feature id for the '<em><b>Scene X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SCENE_X = SHAPE__SCENE_X;

	/**
	 * The feature id for the '<em><b>Scene Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SCENE_Y = SHAPE__SCENE_Y;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BLOCK = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROTATION = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape#getX()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape#getY()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getSceneX <em>Scene X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene X</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape#getSceneX()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_SceneX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getSceneY <em>Scene Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Y</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape#getSceneY()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_SceneY();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.gefx.scene.System#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.System#getConnections()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.gefx.scene.System#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.System#getBlocks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Blocks();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.gefx.scene.Block#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Block#getConnectors()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Block#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Block#getWidth()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Block#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Block#getHeight()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Height();

	/**
	 * Returns the meta object for the container reference '{@link at.bestsolution.efxclipse.gefx.scene.Block#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Block#getSystem()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_System();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connection#getStart()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connection#getEnd()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_End();

	/**
	 * Returns the meta object for the container reference '{@link at.bestsolution.efxclipse.gefx.scene.Connection#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connection#getSystem()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_System();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the container reference '{@link at.bestsolution.efxclipse.gefx.scene.Connector#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connector#getBlock()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Block();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Connector#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connector#getRotation()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Rotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SceneFactory getSceneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__X = eINSTANCE.getShape_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__Y = eINSTANCE.getShape_Y();

		/**
		 * The meta object literal for the '<em><b>Scene X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__SCENE_X = eINSTANCE.getShape_SceneX();

		/**
		 * The meta object literal for the '<em><b>Scene Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__SCENE_Y = eINSTANCE.getShape_SceneY();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONNECTIONS = eINSTANCE.getSystem_Connections();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BLOCKS = eINSTANCE.getSystem_Blocks();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.BlockImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CONNECTORS = eINSTANCE.getBlock_Connectors();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__WIDTH = eINSTANCE.getBlock_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__HEIGHT = eINSTANCE.getBlock_Height();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__SYSTEM = eINSTANCE.getBlock_System();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__START = eINSTANCE.getConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__END = eINSTANCE.getConnection_End();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SYSTEM = eINSTANCE.getConnection_System();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ConnectorImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__BLOCK = eINSTANCE.getConnector_Block();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ROTATION = eINSTANCE.getConnector_Rotation();

	}

} //ScenePackage
