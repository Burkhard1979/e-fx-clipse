/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;

import org.eclipse.emf.common.util.EList;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getBundlename <em>Bundlename</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getSymbolicname <em>Symbolicname</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getVersion <em>Version</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getRequiredBundles <em>Required Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile()
 * @model
 * @generated
 */
public interface ManifestFile extends TemplatedFile {
	/**
	 * Returns the value of the '<em><b>Bundlename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundlename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundlename</em>' attribute.
	 * @see #setBundlename(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_Bundlename()
	 * @model required="true"
	 * @generated
	 */
	String getBundlename();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getBundlename <em>Bundlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundlename</em>' attribute.
	 * @see #getBundlename()
	 * @generated
	 */
	void setBundlename(String value);

	/**
	 * Returns the value of the '<em><b>Symbolicname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolicname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolicname</em>' attribute.
	 * @see #setSymbolicname(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_Symbolicname()
	 * @model required="true"
	 * @generated
	 */
	String getSymbolicname();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getSymbolicname <em>Symbolicname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolicname</em>' attribute.
	 * @see #getSymbolicname()
	 * @generated
	 */
	void setSymbolicname(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_Version()
	 * @model dataType="at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Version" required="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Packages</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_ExportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExportedPackage> getExportedPackages();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_ImportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedPackage> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environment</em>' attribute.
	 * @see #setExecutionEnvironment(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_ExecutionEnvironment()
	 * @model required="true"
	 * @generated
	 */
	String getExecutionEnvironment();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExecutionEnvironment <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Environment</em>' attribute.
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	void setExecutionEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Required Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Bundles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Bundles</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile_RequiredBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredBundle> getRequiredBundles();

} // ManifestFile
