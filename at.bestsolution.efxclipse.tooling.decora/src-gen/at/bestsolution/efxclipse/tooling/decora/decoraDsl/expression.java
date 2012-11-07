/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression#getA <em>A</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends ternary_part
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(assignment_expression)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getexpression_A()
   * @model containment="true"
   * @generated
   */
  assignment_expression getA();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(assignment_expression value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(assignment_expression)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getexpression_E()
   * @model containment="true"
   * @generated
   */
  assignment_expression getE();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(assignment_expression value);

} // expression
