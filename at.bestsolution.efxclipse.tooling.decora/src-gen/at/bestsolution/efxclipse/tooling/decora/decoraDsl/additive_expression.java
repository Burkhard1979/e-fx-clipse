/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>additive expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.additive_expression#getA <em>A</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.additive_expression#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getadditive_expression()
 * @model
 * @generated
 */
public interface additive_expression extends EObject
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
   * @see #setA(multiplicative_expression)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getadditive_expression_A()
   * @model containment="true"
   * @generated
   */
  multiplicative_expression getA();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.additive_expression#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(multiplicative_expression value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.multiplicative_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getadditive_expression_B()
   * @model containment="true"
   * @generated
   */
  EList<multiplicative_expression> getB();

} // additive_expression
