/**
 */
package at.bestsolution.efxclipse.gefx.scene.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.bestsolution.efxclipse.gefx.scene.Connector;
import at.bestsolution.efxclipse.gefx.scene.LinePoint;
import at.bestsolution.efxclipse.gefx.scene.ScenePackage;
import at.bestsolution.efxclipse.gefx.scene.StraightLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Straight Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.StraightLineImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.StraightLineImpl#getStartConnector <em>Start Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StraightLineImpl extends EObjectImpl implements StraightLine {
	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<LinePoint> points;

	/**
	 * The cached value of the '{@link #getStartConnector() <em>Start Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector startConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StraightLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenePackage.Literals.STRAIGHT_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinePoint> getPoints() {
		if (points == null) {
			points = new EObjectContainmentWithInverseEList<LinePoint>(LinePoint.class, this, ScenePackage.STRAIGHT_LINE__POINTS, ScenePackage.LINE_POINT__LINE);
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getStartConnector() {
		if (startConnector != null && startConnector.eIsProxy()) {
			InternalEObject oldStartConnector = (InternalEObject)startConnector;
			startConnector = (Connector)eResolveProxy(oldStartConnector);
			if (startConnector != oldStartConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenePackage.STRAIGHT_LINE__START_CONNECTOR, oldStartConnector, startConnector));
			}
		}
		return startConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetStartConnector() {
		return startConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartConnector(Connector newStartConnector) {
		Connector oldStartConnector = startConnector;
		startConnector = newStartConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.STRAIGHT_LINE__START_CONNECTOR, oldStartConnector, startConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenePackage.STRAIGHT_LINE__POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPoints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenePackage.STRAIGHT_LINE__POINTS:
				return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenePackage.STRAIGHT_LINE__POINTS:
				return getPoints();
			case ScenePackage.STRAIGHT_LINE__START_CONNECTOR:
				if (resolve) return getStartConnector();
				return basicGetStartConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenePackage.STRAIGHT_LINE__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends LinePoint>)newValue);
				return;
			case ScenePackage.STRAIGHT_LINE__START_CONNECTOR:
				setStartConnector((Connector)newValue);
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
			case ScenePackage.STRAIGHT_LINE__POINTS:
				getPoints().clear();
				return;
			case ScenePackage.STRAIGHT_LINE__START_CONNECTOR:
				setStartConnector((Connector)null);
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
			case ScenePackage.STRAIGHT_LINE__POINTS:
				return points != null && !points.isEmpty();
			case ScenePackage.STRAIGHT_LINE__START_CONNECTOR:
				return startConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //StraightLineImpl
