/**
 */
package at.bestsolution.efxclipse.gefx.scene.impl;

import at.bestsolution.efxclipse.gefx.scene.ScenePackage;
import at.bestsolution.efxclipse.gefx.scene.Shape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getSceneX <em>Scene X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getSceneY <em>Scene Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getMinSceneX <em>Min Scene X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getMaxSceneX <em>Max Scene X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getMinSceneY <em>Min Scene Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ShapeImpl#getMaxSceneY <em>Max Scene Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeImpl extends EObjectImpl implements Shape {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSceneX() <em>Scene X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneX()
	 * @generated
	 * @ordered
	 */
	protected static final double SCENE_X_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getSceneY() <em>Scene Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneY()
	 * @generated
	 * @ordered
	 */
	protected static final double SCENE_Y_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinSceneX() <em>Min Scene X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSceneX()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_SCENE_X_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxSceneX() <em>Max Scene X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSceneX()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SCENE_X_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinSceneY() <em>Min Scene Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSceneY()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_SCENE_Y_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxSceneY() <em>Max Scene Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSceneY()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SCENE_Y_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenePackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.SHAPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.SHAPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getSceneX() {
		EObject container = eContainer(); 
		
		double sceneX = x;
		
		while (container instanceof Shape) {
			Shape shape = (Shape) eContainer;
			sceneX += shape.getX();
			container = shape.eContainer();
		}
		
		return sceneX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getSceneY() {
		EObject container = eContainer(); 
		
		double sceneY = y;
		
		while (container instanceof Shape) {
			Shape shape = (Shape) eContainer;
			sceneY += shape.getY();
			container = shape.eContainer();
		}
		
		return sceneY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinSceneX() {
		// TODO: implement this method to return the 'Min Scene X' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxSceneX() {
		// TODO: implement this method to return the 'Max Scene X' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinSceneY() {
		// TODO: implement this method to return the 'Min Scene Y' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxSceneY() {
		// TODO: implement this method to return the 'Max Scene Y' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenePackage.SHAPE__X:
				return getX();
			case ScenePackage.SHAPE__Y:
				return getY();
			case ScenePackage.SHAPE__SCENE_X:
				return getSceneX();
			case ScenePackage.SHAPE__SCENE_Y:
				return getSceneY();
			case ScenePackage.SHAPE__MIN_SCENE_X:
				return getMinSceneX();
			case ScenePackage.SHAPE__MAX_SCENE_X:
				return getMaxSceneX();
			case ScenePackage.SHAPE__MIN_SCENE_Y:
				return getMinSceneY();
			case ScenePackage.SHAPE__MAX_SCENE_Y:
				return getMaxSceneY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenePackage.SHAPE__X:
				setX((Double)newValue);
				return;
			case ScenePackage.SHAPE__Y:
				setY((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenePackage.SHAPE__X:
				setX(X_EDEFAULT);
				return;
			case ScenePackage.SHAPE__Y:
				setY(Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenePackage.SHAPE__X:
				return x != X_EDEFAULT;
			case ScenePackage.SHAPE__Y:
				return y != Y_EDEFAULT;
			case ScenePackage.SHAPE__SCENE_X:
				return getSceneX() != SCENE_X_EDEFAULT;
			case ScenePackage.SHAPE__SCENE_Y:
				return getSceneY() != SCENE_Y_EDEFAULT;
			case ScenePackage.SHAPE__MIN_SCENE_X:
				return getMinSceneX() != MIN_SCENE_X_EDEFAULT;
			case ScenePackage.SHAPE__MAX_SCENE_X:
				return getMaxSceneX() != MAX_SCENE_X_EDEFAULT;
			case ScenePackage.SHAPE__MIN_SCENE_Y:
				return getMinSceneY() != MIN_SCENE_Y_EDEFAULT;
			case ScenePackage.SHAPE__MAX_SCENE_Y:
				return getMaxSceneY() != MAX_SCENE_Y_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
