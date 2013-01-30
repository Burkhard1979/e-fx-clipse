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
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.NodeImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.RectangleImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.PaintImpl <em>Paint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.PaintImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getPaint()
	 * @generated
	 */
	int PAINT = 3;

	/**
	 * The number of structural features of the '<em>Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ColorImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 4;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = PAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = PAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = PAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__OPACITY = PAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = PAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 5;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Center X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CENTER_X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CENTER_Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RADIUS_X = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RADIUS_Y = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ParentImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__CHILDREN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.GroupImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHILDREN = PARENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = PARENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.SceneImpl
	 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 8;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 1;


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
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape#getFill()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.gefx.scene.Shape#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape#getStroke()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Stroke();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Rectangle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Rectangle#getX()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Rectangle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Rectangle#getY()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Rectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Rectangle#getWidth()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Rectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Rectangle#getHeight()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Height();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Paint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paint</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Paint
	 * @generated
	 */
	EClass getPaint();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Color#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Color#getOpacity()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Opacity();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Ellipse#getCenterX <em>Center X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center X</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Ellipse#getCenterX()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_CenterX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Ellipse#getCenterY <em>Center Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center Y</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Ellipse#getCenterY()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_CenterY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Ellipse#getRadiusX <em>Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius X</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Ellipse#getRadiusX()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_RadiusX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.gefx.scene.Ellipse#getRadiusY <em>Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius Y</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Ellipse#getRadiusY()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_RadiusY();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.gefx.scene.Parent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Parent#getChildren()
	 * @see #getParent()
	 * @generated
	 */
	EReference getParent_Children();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.gefx.scene.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.gefx.scene.Scene#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see at.bestsolution.efxclipse.gefx.scene.Scene#getRoot()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Root();

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
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__FILL = eINSTANCE.getShape_Fill();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__STROKE = eINSTANCE.getShape_Stroke();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.NodeImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.RectangleImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__X = eINSTANCE.getRectangle_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__Y = eINSTANCE.getRectangle_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__WIDTH = eINSTANCE.getRectangle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__HEIGHT = eINSTANCE.getRectangle_Height();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.PaintImpl <em>Paint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.PaintImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getPaint()
		 * @generated
		 */
		EClass PAINT = eINSTANCE.getPaint();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ColorImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__OPACITY = eINSTANCE.getColor_Opacity();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Center X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__CENTER_X = eINSTANCE.getEllipse_CenterX();

		/**
		 * The meta object literal for the '<em><b>Center Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__CENTER_Y = eINSTANCE.getEllipse_CenterY();

		/**
		 * The meta object literal for the '<em><b>Radius X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__RADIUS_X = eINSTANCE.getEllipse_RadiusX();

		/**
		 * The meta object literal for the '<em><b>Radius Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__RADIUS_Y = eINSTANCE.getEllipse_RadiusY();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ParentImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT__CHILDREN = eINSTANCE.getParent_Children();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.GroupImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.gefx.scene.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.SceneImpl
		 * @see at.bestsolution.efxclipse.gefx.scene.impl.ScenePackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__ROOT = eINSTANCE.getScene_Root();

	}

} //ScenePackage
