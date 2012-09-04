/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Attribute Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReference <em>Reference</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanAttributeDecl()
 * @model
 * @generated
 */
public interface BeanAttributeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Readonly</em>' attribute.
   * @see #setReadonly(boolean)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanAttributeDecl_Readonly()
   * @model
   * @generated
   */
  boolean isReadonly();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReadonly <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Readonly</em>' attribute.
   * @see #isReadonly()
   * @generated
   */
  void setReadonly(boolean value);

  /**
   * Returns the value of the '<em><b>Lazy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lazy</em>' attribute.
   * @see #setLazy(boolean)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanAttributeDecl_Lazy()
   * @model
   * @generated
   */
  boolean isLazy();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isLazy <em>Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lazy</em>' attribute.
   * @see #isLazy()
   * @generated
   */
  void setLazy(boolean value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(boolean)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanAttributeDecl_Reference()
   * @model
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #isReference()
   * @generated
   */
  void setReference(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeDef)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanAttributeDecl_Type()
   * @model containment="true"
   * @generated
   */
  TypeDef getType();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeDef value);

} // BeanAttributeDecl
