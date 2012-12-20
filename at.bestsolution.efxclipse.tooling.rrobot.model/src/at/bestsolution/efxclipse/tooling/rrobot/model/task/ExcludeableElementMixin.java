/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excludeable Element Mixin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.ExcludeableElementMixin#getExcludeExpression <em>Exclude Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getExcludeableElementMixin()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExcludeableElementMixin extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Expression</em>' containment reference.
	 * @see #setExcludeExpression(BooleanExpression)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getExcludeableElementMixin_ExcludeExpression()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getExcludeExpression();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.ExcludeableElementMixin#getExcludeExpression <em>Exclude Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Expression</em>' containment reference.
	 * @see #getExcludeExpression()
	 * @generated
	 */
	void setExcludeExpression(BooleanExpression value);

} // ExcludeableElementMixin
