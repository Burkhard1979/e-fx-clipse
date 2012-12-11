/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task.impl;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.SourceFragment;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.CompilationUnitImpl#getPackagename <em>Packagename</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.CompilationUnitImpl#getFile <em>File</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.CompilationUnitImpl#getSourcefragment <em>Sourcefragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationUnitImpl extends EObjectImpl implements CompilationUnit {
	/**
	 * The default value of the '{@link #getPackagename() <em>Packagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagename()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagename() <em>Packagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagename()
	 * @generated
	 * @ordered
	 */
	protected String packagename = PACKAGENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file;

	/**
	 * The cached value of the '{@link #getSourcefragment() <em>Sourcefragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcefragment()
	 * @generated
	 * @ordered
	 */
	protected SourceFragment sourcefragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagename() {
		return packagename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagename(String newPackagename) {
		String oldPackagename = packagename;
		packagename = newPackagename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.COMPILATION_UNIT__PACKAGENAME, oldPackagename, packagename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(File newFile, NotificationChain msgs) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.COMPILATION_UNIT__FILE, oldFile, newFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		if (newFile != file) {
			NotificationChain msgs = null;
			if (file != null)
				msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.COMPILATION_UNIT__FILE, null, msgs);
			if (newFile != null)
				msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.COMPILATION_UNIT__FILE, null, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.COMPILATION_UNIT__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFragment getSourcefragment() {
		if (sourcefragment != null && sourcefragment.eIsProxy()) {
			InternalEObject oldSourcefragment = (InternalEObject)sourcefragment;
			sourcefragment = (SourceFragment)eResolveProxy(oldSourcefragment);
			if (sourcefragment != oldSourcefragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.COMPILATION_UNIT__SOURCEFRAGMENT, oldSourcefragment, sourcefragment));
			}
		}
		return sourcefragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFragment basicGetSourcefragment() {
		return sourcefragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcefragment(SourceFragment newSourcefragment) {
		SourceFragment oldSourcefragment = sourcefragment;
		sourcefragment = newSourcefragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.COMPILATION_UNIT__SOURCEFRAGMENT, oldSourcefragment, sourcefragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.COMPILATION_UNIT__FILE:
				return basicSetFile(null, msgs);
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
			case TaskPackage.COMPILATION_UNIT__PACKAGENAME:
				return getPackagename();
			case TaskPackage.COMPILATION_UNIT__FILE:
				return getFile();
			case TaskPackage.COMPILATION_UNIT__SOURCEFRAGMENT:
				if (resolve) return getSourcefragment();
				return basicGetSourcefragment();
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
			case TaskPackage.COMPILATION_UNIT__PACKAGENAME:
				setPackagename((String)newValue);
				return;
			case TaskPackage.COMPILATION_UNIT__FILE:
				setFile((File)newValue);
				return;
			case TaskPackage.COMPILATION_UNIT__SOURCEFRAGMENT:
				setSourcefragment((SourceFragment)newValue);
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
			case TaskPackage.COMPILATION_UNIT__PACKAGENAME:
				setPackagename(PACKAGENAME_EDEFAULT);
				return;
			case TaskPackage.COMPILATION_UNIT__FILE:
				setFile((File)null);
				return;
			case TaskPackage.COMPILATION_UNIT__SOURCEFRAGMENT:
				setSourcefragment((SourceFragment)null);
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
			case TaskPackage.COMPILATION_UNIT__PACKAGENAME:
				return PACKAGENAME_EDEFAULT == null ? packagename != null : !PACKAGENAME_EDEFAULT.equals(packagename);
			case TaskPackage.COMPILATION_UNIT__FILE:
				return file != null;
			case TaskPackage.COMPILATION_UNIT__SOURCEFRAGMENT:
				return sourcefragment != null;
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
		result.append(" (packagename: ");
		result.append(packagename);
		result.append(')');
		return result.toString();
	}

} //CompilationUnitImpl
