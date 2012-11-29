/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Start Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ProductStartConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ProductStartConfigImpl#isAutoStart <em>Auto Start</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ProductStartConfigImpl#getStartLevel <em>Start Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductStartConfigImpl extends EObjectImpl implements ProductStartConfig {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoStart() <em>Auto Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoStart() <em>Auto Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStart()
	 * @generated
	 * @ordered
	 */
	protected boolean autoStart = AUTO_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLevel()
	 * @generated
	 * @ordered
	 */
	protected int startLevel = START_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStartConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.PRODUCT_START_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_START_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoStart() {
		return autoStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoStart(boolean newAutoStart) {
		boolean oldAutoStart = autoStart;
		autoStart = newAutoStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_START_CONFIG__AUTO_START, oldAutoStart, autoStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLevel() {
		return startLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLevel(int newStartLevel) {
		int oldStartLevel = startLevel;
		startLevel = newStartLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_START_CONFIG__START_LEVEL, oldStartLevel, startLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BundlePackage.PRODUCT_START_CONFIG__ID:
				return getId();
			case BundlePackage.PRODUCT_START_CONFIG__AUTO_START:
				return isAutoStart();
			case BundlePackage.PRODUCT_START_CONFIG__START_LEVEL:
				return getStartLevel();
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
			case BundlePackage.PRODUCT_START_CONFIG__ID:
				setId((String)newValue);
				return;
			case BundlePackage.PRODUCT_START_CONFIG__AUTO_START:
				setAutoStart((Boolean)newValue);
				return;
			case BundlePackage.PRODUCT_START_CONFIG__START_LEVEL:
				setStartLevel((Integer)newValue);
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
			case BundlePackage.PRODUCT_START_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_START_CONFIG__AUTO_START:
				setAutoStart(AUTO_START_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_START_CONFIG__START_LEVEL:
				setStartLevel(START_LEVEL_EDEFAULT);
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
			case BundlePackage.PRODUCT_START_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BundlePackage.PRODUCT_START_CONFIG__AUTO_START:
				return autoStart != AUTO_START_EDEFAULT;
			case BundlePackage.PRODUCT_START_CONFIG__START_LEVEL:
				return startLevel != START_LEVEL_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", autoStart: ");
		result.append(autoStart);
		result.append(", startLevel: ");
		result.append(startLevel);
		result.append(')');
		return result.toString();
	}

} //ProductStartConfigImpl
