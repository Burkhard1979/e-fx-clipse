/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templated File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile#getGeneratorType <em>Generator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getTemplatedFile()
 * @model
 * @generated
 */
public interface TemplatedFile extends File {

	/**
	 * Returns the value of the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Type</em>' attribute.
	 * @see #setGeneratorType(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getTemplatedFile_GeneratorType()
	 * @model
	 * @generated
	 */
	String getGeneratorType();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile#getGeneratorType <em>Generator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Type</em>' attribute.
	 * @see #getGeneratorType()
	 * @generated
	 */
	void setGeneratorType(String value);
} // TemplatedFile
