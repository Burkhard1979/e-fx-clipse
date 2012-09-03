/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMapTypeDef()
 * @model
 * @generated
 */
public interface MapTypeDef extends TypeDef
{
  /**
   * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Type</em>' containment reference.
   * @see #setKeyType(JvmTypeReference)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMapTypeDef_KeyType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getKeyType();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getKeyType <em>Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Type</em>' containment reference.
   * @see #getKeyType()
   * @generated
   */
  void setKeyType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' containment reference.
   * @see #setValueType(JvmTypeReference)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMapTypeDef_ValueType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getValueType();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getValueType <em>Value Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' containment reference.
   * @see #getValueType()
   * @generated
   */
  void setValueType(JvmTypeReference value);

} // MapTypeDef
