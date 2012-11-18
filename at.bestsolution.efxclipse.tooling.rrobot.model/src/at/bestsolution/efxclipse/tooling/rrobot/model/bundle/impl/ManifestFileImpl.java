/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Version;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TemplatedFileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getBundlename <em>Bundlename</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getSymbolicname <em>Symbolicname</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl#getRequiredBundles <em>Required Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestFileImpl extends TemplatedFileImpl implements ManifestFile {
	/**
	 * The default value of the '{@link #getBundlename() <em>Bundlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundlename()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundlename() <em>Bundlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundlename()
	 * @generated
	 * @ordered
	 */
	protected String bundlename = BUNDLENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicname() <em>Symbolicname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicname()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOLICNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicname() <em>Symbolicname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicname()
	 * @generated
	 * @ordered
	 */
	protected String symbolicname = SYMBOLICNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportedPackage> exportedPackages;

	/**
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedPackage> importedPackages;

	/**
	 * The default value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String executionEnvironment = EXECUTION_ENVIRONMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredBundles() <em>Required Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredBundle> requiredBundles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ManifestFileImpl() {
		super();
		setGeneratorType("bundle-manifest");
		setName("MANIFEST.MF");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.MANIFEST_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundlename() {
		return bundlename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundlename(String newBundlename) {
		String oldBundlename = bundlename;
		bundlename = newBundlename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__BUNDLENAME, oldBundlename, bundlename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolicname() {
		return symbolicname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicname(String newSymbolicname) {
		String oldSymbolicname = symbolicname;
		symbolicname = newSymbolicname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__SYMBOLICNAME, oldSymbolicname, symbolicname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportedPackage> getExportedPackages() {
		if (exportedPackages == null) {
			exportedPackages = new EObjectContainmentEList<ExportedPackage>(ExportedPackage.class, this, BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES);
		}
		return exportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedPackage> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectContainmentEList<ImportedPackage>(ImportedPackage.class, this, BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES);
		}
		return importedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionEnvironment() {
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionEnvironment(String newExecutionEnvironment) {
		String oldExecutionEnvironment = executionEnvironment;
		executionEnvironment = newExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT, oldExecutionEnvironment, executionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredBundle> getRequiredBundles() {
		if (requiredBundles == null) {
			requiredBundles = new EObjectContainmentEList<RequiredBundle>(RequiredBundle.class, this, BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES);
		}
		return requiredBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				return ((InternalEList<?>)getExportedPackages()).basicRemove(otherEnd, msgs);
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				return ((InternalEList<?>)getImportedPackages()).basicRemove(otherEnd, msgs);
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				return ((InternalEList<?>)getRequiredBundles()).basicRemove(otherEnd, msgs);
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
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				return getBundlename();
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				return getSymbolicname();
			case BundlePackage.MANIFEST_FILE__VERSION:
				return getVersion();
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				return getExportedPackages();
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				return getImportedPackages();
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment();
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				return getRequiredBundles();
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
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				setBundlename((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				setSymbolicname((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__VERSION:
				setVersion((Version)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				getExportedPackages().addAll((Collection<? extends ExportedPackage>)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends ImportedPackage>)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				getRequiredBundles().addAll((Collection<? extends RequiredBundle>)newValue);
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
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				setBundlename(BUNDLENAME_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				setSymbolicname(SYMBOLICNAME_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				return;
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				return;
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment(EXECUTION_ENVIRONMENT_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
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
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				return BUNDLENAME_EDEFAULT == null ? bundlename != null : !BUNDLENAME_EDEFAULT.equals(bundlename);
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				return SYMBOLICNAME_EDEFAULT == null ? symbolicname != null : !SYMBOLICNAME_EDEFAULT.equals(symbolicname);
			case BundlePackage.MANIFEST_FILE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				return exportedPackages != null && !exportedPackages.isEmpty();
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				return EXECUTION_ENVIRONMENT_EDEFAULT == null ? executionEnvironment != null : !EXECUTION_ENVIRONMENT_EDEFAULT.equals(executionEnvironment);
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				return requiredBundles != null && !requiredBundles.isEmpty();
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
		result.append(" (bundlename: ");
		result.append(bundlename);
		result.append(", symbolicname: ");
		result.append(symbolicname);
		result.append(", version: ");
		result.append(version);
		result.append(", executionEnvironment: ");
		result.append(executionEnvironment);
		result.append(')');
		return result.toString();
	}

} //ManifestFileImpl
