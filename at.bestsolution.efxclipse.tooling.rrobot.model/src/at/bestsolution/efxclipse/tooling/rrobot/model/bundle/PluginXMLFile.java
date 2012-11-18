/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile;
import org.eclipse.emf.common.util.EList;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin XML File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getPluginXMLFile()
 * @model
 * @generated
 */
public interface PluginXMLFile extends TemplatedFile {

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getPluginXMLFile_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getExtensions();
} // PluginXMLFile
