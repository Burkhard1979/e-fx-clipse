/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Property Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReference <em>Reference</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanPropertyDecl()
 * @model
 * @generated
 */
public interface BeanPropertyDecl extends EObject
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
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanPropertyDecl_Readonly()
   * @model
   * @generated
   */
  boolean isReadonly();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReadonly <em>Readonly</em>}' attribute.
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
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanPropertyDecl_Lazy()
   * @model
   * @generated
   */
  boolean isLazy();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isLazy <em>Lazy</em>}' attribute.
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
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanPropertyDecl_Reference()
   * @model
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReference <em>Reference</em>}' attribute.
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
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanPropertyDecl_Type()
   * @model containment="true"
   * @generated
   */
  TypeDef getType();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeDef value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getBeanPropertyDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // BeanPropertyDecl
