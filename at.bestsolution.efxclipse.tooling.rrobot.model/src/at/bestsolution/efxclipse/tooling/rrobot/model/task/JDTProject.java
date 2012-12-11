/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDT Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.JDTProject#getSourceFragments <em>Source Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getJDTProject()
 * @model
 * @generated
 */
public interface JDTProject extends Project {
	/**
	 * Returns the value of the '<em><b>Source Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.task.SourceFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Fragments</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getJDTProject_SourceFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceFragment> getSourceFragments();

} // JDTProject
