/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Postfix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getRule <em>Rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRulePostfix()
 * @model
 * @generated
 */
public interface CSSRulePostfix extends CSSRule
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(CSSRule)
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRulePostfix_Rule()
   * @model containment="true"
   * @generated
   */
  CSSRule getRule();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(CSSRule value);

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see #setCardinality(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRulePostfix_Cardinality()
   * @model
   * @generated
   */
  String getCardinality();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(String value);

} // CSSRulePostfix
