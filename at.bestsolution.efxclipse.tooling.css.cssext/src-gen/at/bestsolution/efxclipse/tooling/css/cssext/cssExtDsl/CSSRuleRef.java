/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleRef()
 * @model
 * @generated
 */
public interface CSSRuleRef extends CSSRule
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(CSSRuleId)
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleRef_Ref()
   * @model
   * @generated
   */
  CSSRuleId getRef();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(CSSRuleId value);

} // CSSRuleRef
