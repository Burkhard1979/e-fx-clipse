/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter declaration list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getparameter_declaration_list()
 * @model
 * @generated
 */
public interface parameter_declaration_list extends EObject
{
  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getparameter_declaration_list_P()
   * @model containment="true"
   * @generated
   */
  EList<parameter_declaration> getP();

} // parameter_declaration_list
