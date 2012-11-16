/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getRobotTask()
 * @model
 * @generated
 */
public interface RobotTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference.
	 * @see #setProjects(Project)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getRobotTask_Projects()
	 * @model containment="true"
	 * @generated
	 */
	Project getProjects();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask#getProjects <em>Projects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projects</em>' containment reference.
	 * @see #getProjects()
	 * @generated
	 */
	void setProjects(Project value);

} // RobotTask
