/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile;
import org.eclipse.emf.common.util.EList;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties#getBinIncludes <em>Bin Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBuildProperties()
 * @model
 * @generated
 */
public interface BuildProperties extends TemplatedFile {

	/**
	 * Returns the value of the '<em><b>Bin Includes</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Includes</em>' reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBuildProperties_BinIncludes()
	 * @model
	 * @generated
	 */
	EList<Resource> getBinIncludes();
} // BuildProperties
