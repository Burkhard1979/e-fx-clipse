/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Xor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor#getXors <em>Xors</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleXor()
 * @model
 * @generated
 */
public interface CSSRuleXor extends CSSRule
{
  /**
   * Returns the value of the '<em><b>Xors</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xors</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleXor_Xors()
   * @model containment="true"
   * @generated
   */
  EList<CSSRule> getXors();

} // CSSRuleXor
