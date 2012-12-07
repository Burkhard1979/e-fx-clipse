/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile#getGeneratorInstance <em>Generator Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getGeneratorFile()
 * @model
 * @generated
 */
public interface GeneratorFile extends File {
	/**
	 * Returns the value of the '<em><b>Generator Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Instance</em>' attribute.
	 * @see #setGeneratorInstance(Generator)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getGeneratorFile_GeneratorInstance()
	 * @model dataType="at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator<at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile>" transient="true"
	 * @generated
	 */
	Generator<GeneratorFile> getGeneratorInstance();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile#getGeneratorInstance <em>Generator Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Instance</em>' attribute.
	 * @see #getGeneratorInstance()
	 * @generated
	 */
	void setGeneratorInstance(Generator<GeneratorFile> value);

} // GeneratorFile
