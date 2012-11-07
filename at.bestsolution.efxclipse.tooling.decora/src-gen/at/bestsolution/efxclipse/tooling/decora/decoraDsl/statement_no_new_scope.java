/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement no new scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getC <em>C</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getstatement_no_new_scope()
 * @model
 * @generated
 */
public interface statement_no_new_scope extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(compound_statement_no_new_scope)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getstatement_no_new_scope_C()
   * @model containment="true"
   * @generated
   */
  compound_statement_no_new_scope getC();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(compound_statement_no_new_scope value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(simple_statement)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getstatement_no_new_scope_S()
   * @model containment="true"
   * @generated
   */
  simple_statement getS();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(simple_statement value);

} // statement_no_new_scope
