/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile#getProgramArgs <em>Program Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductFile()
 * @model abstract="true"
 * @generated
 */
public interface ProductFile extends TemplatedFile {
	/**
	 * Returns the value of the '<em><b>Vm Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args</em>' attribute.
	 * @see #setVmArgs(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductFile_VmArgs()
	 * @model
	 * @generated
	 */
	String getVmArgs();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile#getVmArgs <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args</em>' attribute.
	 * @see #getVmArgs()
	 * @generated
	 */
	void setVmArgs(String value);

	/**
	 * Returns the value of the '<em><b>Program Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args</em>' attribute.
	 * @see #setProgramArgs(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductFile_ProgramArgs()
	 * @model
	 * @generated
	 */
	String getProgramArgs();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile#getProgramArgs <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args</em>' attribute.
	 * @see #getProgramArgs()
	 * @generated
	 */
	void setProgramArgs(String value);

} // ProductFile
