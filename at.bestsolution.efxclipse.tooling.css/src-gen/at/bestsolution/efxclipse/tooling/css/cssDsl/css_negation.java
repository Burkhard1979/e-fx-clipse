/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>css negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_negation#getNot <em>Not</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_negation#getNegation_arg <em>Negation arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_negation()
 * @model
 * @generated
 */
public interface css_negation extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * The literals are from the enumeration {@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_not}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_not
   * @see #setNot(css_not)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_negation_Not()
   * @model
   * @generated
   */
  css_not getNot();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_negation#getNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_not
   * @see #getNot()
   * @generated
   */
  void setNot(css_not value);

  /**
   * Returns the value of the '<em><b>Negation arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negation arg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation arg</em>' attribute.
   * @see #setNegation_arg(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_negation_Negation_arg()
   * @model
   * @generated
   */
  String getNegation_arg();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_negation#getNegation_arg <em>Negation arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation arg</em>' attribute.
   * @see #getNegation_arg()
   * @generated
   */
  void setNegation_arg(String value);

} // css_negation
