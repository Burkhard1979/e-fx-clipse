/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value List Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getSingleType <em>Single Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getValueListTypeDef()
 * @model
 * @generated
 */
public interface ValueListTypeDef extends TypeDef
{
  /**
   * Returns the value of the '<em><b>Single Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Type</em>' containment reference.
   * @see #setSingleType(JvmTypeReference)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getValueListTypeDef_SingleType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getSingleType();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getSingleType <em>Single Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Type</em>' containment reference.
   * @see #getSingleType()
   * @generated
   */
  void setSingleType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Multi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' containment reference.
   * @see #setMulti(Multiplicity)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getValueListTypeDef_Multi()
   * @model containment="true"
   * @generated
   */
  Multiplicity getMulti();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getMulti <em>Multi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi</em>' containment reference.
   * @see #getMulti()
   * @generated
   */
  void setMulti(Multiplicity value);

} // ValueListTypeDef
