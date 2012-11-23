/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl#getMinVersion <em>Min Version</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl#getMaxVersion <em>Max Version</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl#isMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl#isMaxExclusive <em>Max Exclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredBundleImpl extends EObjectImpl implements RequiredBundle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVersion() <em>Min Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version MIN_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinVersion() <em>Min Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVersion()
	 * @generated
	 * @ordered
	 */
	protected Version minVersion = MIN_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVersion() <em>Max Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version MAX_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxVersion() <em>Max Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVersion()
	 * @generated
	 * @ordered
	 */
	protected Version maxVersion = MAX_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean minExclusive = MIN_EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean maxExclusive = MAX_EXCLUSIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredBundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.REQUIRED_BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.REQUIRED_BUNDLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getMinVersion() {
		return minVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVersion(Version newMinVersion) {
		Version oldMinVersion = minVersion;
		minVersion = newMinVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.REQUIRED_BUNDLE__MIN_VERSION, oldMinVersion, minVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getMaxVersion() {
		return maxVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVersion(Version newMaxVersion) {
		Version oldMaxVersion = maxVersion;
		maxVersion = newMaxVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.REQUIRED_BUNDLE__MAX_VERSION, oldMaxVersion, maxVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinExclusive() {
		return minExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExclusive(boolean newMinExclusive) {
		boolean oldMinExclusive = minExclusive;
		minExclusive = newMinExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.REQUIRED_BUNDLE__MIN_EXCLUSIVE, oldMinExclusive, minExclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxExclusive() {
		return maxExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxExclusive(boolean newMaxExclusive) {
		boolean oldMaxExclusive = maxExclusive;
		maxExclusive = newMaxExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.REQUIRED_BUNDLE__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BundlePackage.REQUIRED_BUNDLE__NAME:
				return getName();
			case BundlePackage.REQUIRED_BUNDLE__MIN_VERSION:
				return getMinVersion();
			case BundlePackage.REQUIRED_BUNDLE__MAX_VERSION:
				return getMaxVersion();
			case BundlePackage.REQUIRED_BUNDLE__MIN_EXCLUSIVE:
				return isMinExclusive();
			case BundlePackage.REQUIRED_BUNDLE__MAX_EXCLUSIVE:
				return isMaxExclusive();
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
			case BundlePackage.REQUIRED_BUNDLE__NAME:
				setName((String)newValue);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MIN_VERSION:
				setMinVersion((Version)newValue);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MAX_VERSION:
				setMaxVersion((Version)newValue);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MIN_EXCLUSIVE:
				setMinExclusive((Boolean)newValue);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MAX_EXCLUSIVE:
				setMaxExclusive((Boolean)newValue);
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
			case BundlePackage.REQUIRED_BUNDLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MIN_VERSION:
				setMinVersion(MIN_VERSION_EDEFAULT);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MAX_VERSION:
				setMaxVersion(MAX_VERSION_EDEFAULT);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MIN_EXCLUSIVE:
				setMinExclusive(MIN_EXCLUSIVE_EDEFAULT);
				return;
			case BundlePackage.REQUIRED_BUNDLE__MAX_EXCLUSIVE:
				setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
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
			case BundlePackage.REQUIRED_BUNDLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BundlePackage.REQUIRED_BUNDLE__MIN_VERSION:
				return MIN_VERSION_EDEFAULT == null ? minVersion != null : !MIN_VERSION_EDEFAULT.equals(minVersion);
			case BundlePackage.REQUIRED_BUNDLE__MAX_VERSION:
				return MAX_VERSION_EDEFAULT == null ? maxVersion != null : !MAX_VERSION_EDEFAULT.equals(maxVersion);
			case BundlePackage.REQUIRED_BUNDLE__MIN_EXCLUSIVE:
				return minExclusive != MIN_EXCLUSIVE_EDEFAULT;
			case BundlePackage.REQUIRED_BUNDLE__MAX_EXCLUSIVE:
				return maxExclusive != MAX_EXCLUSIVE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", minVersion: ");
		result.append(minVersion);
		result.append(", maxVersion: ");
		result.append(maxVersion);
		result.append(", minExclusive: ");
		result.append(minExclusive);
		result.append(", maxExclusive: ");
		result.append(maxExclusive);
		result.append(')');
		return result.toString();
	}

} //RequiredBundleImpl
