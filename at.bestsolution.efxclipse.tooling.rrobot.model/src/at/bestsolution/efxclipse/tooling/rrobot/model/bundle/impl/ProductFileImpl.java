/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TemplatedFileImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ProductFileImpl#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ProductFileImpl#getProgramArgs <em>Program Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProductFileImpl extends TemplatedFileImpl implements ProductFile {
	/**
	 * The default value of the '{@link #getVmArgs() <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgs() <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgs()
	 * @generated
	 * @ordered
	 */
	protected String vmArgs = VM_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramArgs() <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgs() <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected String programArgs = PROGRAM_ARGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.PRODUCT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgs() {
		return vmArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgs(String newVmArgs) {
		String oldVmArgs = vmArgs;
		vmArgs = newVmArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__VM_ARGS, oldVmArgs, vmArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgs() {
		return programArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgs(String newProgramArgs) {
		String oldProgramArgs = programArgs;
		programArgs = newProgramArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__PROGRAM_ARGS, oldProgramArgs, programArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				return getVmArgs();
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				return getProgramArgs();
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				setVmArgs((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				setProgramArgs((String)newValue);
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				setVmArgs(VM_ARGS_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				setProgramArgs(PROGRAM_ARGS_EDEFAULT);
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				return VM_ARGS_EDEFAULT == null ? vmArgs != null : !VM_ARGS_EDEFAULT.equals(vmArgs);
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				return PROGRAM_ARGS_EDEFAULT == null ? programArgs != null : !PROGRAM_ARGS_EDEFAULT.equals(programArgs);
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
		result.append(" (vmArgs: ");
		result.append(vmArgs);
		result.append(", programArgs: ");
		result.append(programArgs);
		result.append(')');
		return result.toString();
	}

} //ProductFileImpl
