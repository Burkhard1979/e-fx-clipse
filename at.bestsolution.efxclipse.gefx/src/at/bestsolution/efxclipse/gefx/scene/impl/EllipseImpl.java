/**
 */
package at.bestsolution.efxclipse.gefx.scene.impl;

import at.bestsolution.efxclipse.gefx.scene.Ellipse;
import at.bestsolution.efxclipse.gefx.scene.ScenePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl#getCenterX <em>Center X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl#getCenterY <em>Center Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl#getRadiusX <em>Radius X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.EllipseImpl#getRadiusY <em>Radius Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EllipseImpl extends ShapeImpl implements Ellipse {
	/**
	 * The default value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterX()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTER_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterX()
	 * @generated
	 * @ordered
	 */
	protected double centerX = CENTER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterY()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTER_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterY()
	 * @generated
	 * @ordered
	 */
	protected double centerY = CENTER_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadiusX() <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusX()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadiusX() <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusX()
	 * @generated
	 * @ordered
	 */
	protected double radiusX = RADIUS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadiusY() <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusY()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadiusY() <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusY()
	 * @generated
	 * @ordered
	 */
	protected double radiusY = RADIUS_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenePackage.Literals.ELLIPSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCenterX() {
		return centerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterX(double newCenterX) {
		double oldCenterX = centerX;
		centerX = newCenterX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.ELLIPSE__CENTER_X, oldCenterX, centerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCenterY() {
		return centerY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterY(double newCenterY) {
		double oldCenterY = centerY;
		centerY = newCenterY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.ELLIPSE__CENTER_Y, oldCenterY, centerY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadiusX() {
		return radiusX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiusX(double newRadiusX) {
		double oldRadiusX = radiusX;
		radiusX = newRadiusX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.ELLIPSE__RADIUS_X, oldRadiusX, radiusX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadiusY() {
		return radiusY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiusY(double newRadiusY) {
		double oldRadiusY = radiusY;
		radiusY = newRadiusY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.ELLIPSE__RADIUS_Y, oldRadiusY, radiusY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenePackage.ELLIPSE__CENTER_X:
				return getCenterX();
			case ScenePackage.ELLIPSE__CENTER_Y:
				return getCenterY();
			case ScenePackage.ELLIPSE__RADIUS_X:
				return getRadiusX();
			case ScenePackage.ELLIPSE__RADIUS_Y:
				return getRadiusY();
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
			case ScenePackage.ELLIPSE__CENTER_X:
				setCenterX((Double)newValue);
				return;
			case ScenePackage.ELLIPSE__CENTER_Y:
				setCenterY((Double)newValue);
				return;
			case ScenePackage.ELLIPSE__RADIUS_X:
				setRadiusX((Double)newValue);
				return;
			case ScenePackage.ELLIPSE__RADIUS_Y:
				setRadiusY((Double)newValue);
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
			case ScenePackage.ELLIPSE__CENTER_X:
				setCenterX(CENTER_X_EDEFAULT);
				return;
			case ScenePackage.ELLIPSE__CENTER_Y:
				setCenterY(CENTER_Y_EDEFAULT);
				return;
			case ScenePackage.ELLIPSE__RADIUS_X:
				setRadiusX(RADIUS_X_EDEFAULT);
				return;
			case ScenePackage.ELLIPSE__RADIUS_Y:
				setRadiusY(RADIUS_Y_EDEFAULT);
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
			case ScenePackage.ELLIPSE__CENTER_X:
				return centerX != CENTER_X_EDEFAULT;
			case ScenePackage.ELLIPSE__CENTER_Y:
				return centerY != CENTER_Y_EDEFAULT;
			case ScenePackage.ELLIPSE__RADIUS_X:
				return radiusX != RADIUS_X_EDEFAULT;
			case ScenePackage.ELLIPSE__RADIUS_Y:
				return radiusY != RADIUS_Y_EDEFAULT;
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
		result.append(" (centerX: ");
		result.append(centerX);
		result.append(", centerY: ");
		result.append(centerY);
		result.append(", radiusX: ");
		result.append(radiusX);
		result.append(", radiusY: ");
		result.append(radiusY);
		result.append(')');
		return result.toString();
	}

} //EllipseImpl
