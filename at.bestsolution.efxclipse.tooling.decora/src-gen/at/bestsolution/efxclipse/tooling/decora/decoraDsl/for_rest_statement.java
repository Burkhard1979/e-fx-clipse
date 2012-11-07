/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for rest statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getC <em>C</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfor_rest_statement()
 * @model
 * @generated
 */
public interface for_rest_statement extends EObject
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
   * @see #setC(condition)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfor_rest_statement_C()
   * @model containment="true"
   * @generated
   */
  condition getC();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(condition value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(expression)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfor_rest_statement_E()
   * @model containment="true"
   * @generated
   */
  expression getE();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(expression value);

} // for_rest_statement
