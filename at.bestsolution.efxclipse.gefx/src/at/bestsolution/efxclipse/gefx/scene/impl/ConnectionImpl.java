/**
 */
package at.bestsolution.efxclipse.gefx.scene.impl;

import at.bestsolution.efxclipse.gefx.scene.Connection;
import at.bestsolution.efxclipse.gefx.scene.Connector;
import at.bestsolution.efxclipse.gefx.scene.ScenePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.ConnectionImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends EObjectImpl implements Connection {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Connector start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Connector end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Connector)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenePackage.CONNECTION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Connector newStart) {
		Connector oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.CONNECTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Connector)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenePackage.CONNECTION__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Connector newEnd) {
		Connector oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.CONNECTION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.bestsolution.efxclipse.gefx.scene.System getSystem() {
		if (eContainerFeatureID() != ScenePackage.CONNECTION__SYSTEM) return null;
		return (at.bestsolution.efxclipse.gefx.scene.System)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(at.bestsolution.efxclipse.gefx.scene.System newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, ScenePackage.CONNECTION__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(at.bestsolution.efxclipse.gefx.scene.System newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != ScenePackage.CONNECTION__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, ScenePackage.SYSTEM__CONNECTIONS, at.bestsolution.efxclipse.gefx.scene.System.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenePackage.CONNECTION__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenePackage.CONNECTION__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((at.bestsolution.efxclipse.gefx.scene.System)otherEnd, msgs);
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
			case ScenePackage.CONNECTION__SYSTEM:
				return basicSetSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ScenePackage.CONNECTION__SYSTEM:
				return eInternalContainer().eInverseRemove(this, ScenePackage.SYSTEM__CONNECTIONS, at.bestsolution.efxclipse.gefx.scene.System.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenePackage.CONNECTION__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ScenePackage.CONNECTION__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case ScenePackage.CONNECTION__SYSTEM:
				return getSystem();
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
			case ScenePackage.CONNECTION__START:
				setStart((Connector)newValue);
				return;
			case ScenePackage.CONNECTION__END:
				setEnd((Connector)newValue);
				return;
			case ScenePackage.CONNECTION__SYSTEM:
				setSystem((at.bestsolution.efxclipse.gefx.scene.System)newValue);
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
			case ScenePackage.CONNECTION__START:
				setStart((Connector)null);
				return;
			case ScenePackage.CONNECTION__END:
				setEnd((Connector)null);
				return;
			case ScenePackage.CONNECTION__SYSTEM:
				setSystem((at.bestsolution.efxclipse.gefx.scene.System)null);
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
			case ScenePackage.CONNECTION__START:
				return start != null;
			case ScenePackage.CONNECTION__END:
				return end != null;
			case ScenePackage.CONNECTION__SYSTEM:
				return getSystem() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
