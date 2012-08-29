/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getBean <em>Bean</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getFXBeanUnit()
 * @model
 * @generated
 */
public interface FXBeanUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(PackageDeclaration)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getFXBeanUnit_Package()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getPackage();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(PackageDeclaration value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getFXBeanUnit_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Bean</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bean</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bean</em>' containment reference.
   * @see #setBean(Bean)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getFXBeanUnit_Bean()
   * @model containment="true"
   * @generated
   */
  Bean getBean();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getBean <em>Bean</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bean</em>' containment reference.
   * @see #getBean()
   * @generated
   */
  void setBean(Bean value);

} // FXBeanUnit
