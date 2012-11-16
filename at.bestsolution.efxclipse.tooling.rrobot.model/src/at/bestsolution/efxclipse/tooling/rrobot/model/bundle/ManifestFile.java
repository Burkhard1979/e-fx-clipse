/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

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
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getVersion <em>Version</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getImportedPackages <em>Imported Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getManifestFile()
 * @model
 * @generated
 */
public interface ManifestFile extends File {
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
	 * @model
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
	 * @model dataType="at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Version"
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

} // ManifestFile
