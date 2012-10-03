/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Class Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.PseudoClassFunction#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getPseudoClassFunction()
 * @model
 * @generated
 */
public interface PseudoClassFunction extends PseudoClass
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getPseudoClassFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<CssTok> getParams();

} // PseudoClassFunction
