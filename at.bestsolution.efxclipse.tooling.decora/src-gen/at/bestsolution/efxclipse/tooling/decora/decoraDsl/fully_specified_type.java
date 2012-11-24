/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fully specified type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTq <em>Tq</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTp <em>Tp</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTs <em>Ts</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfully_specified_type()
 * @model
 * @generated
 */
public interface fully_specified_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Tq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tq</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tq</em>' attribute.
   * @see #setTq(String)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfully_specified_type_Tq()
   * @model
   * @generated
   */
  String getTq();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTq <em>Tq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tq</em>' attribute.
   * @see #getTq()
   * @generated
   */
  void setTq(String value);

  /**
   * Returns the value of the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' attribute.
   * @see #setTp(String)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfully_specified_type_Tp()
   * @model
   * @generated
   */
  String getTp();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTp <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' attribute.
   * @see #getTp()
   * @generated
   */
  void setTp(String value);

  /**
   * Returns the value of the '<em><b>Ts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ts</em>' containment reference.
   * @see #setTs(type_specifier)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getfully_specified_type_Ts()
   * @model containment="true"
   * @generated
   */
  type_specifier getTs();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTs <em>Ts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ts</em>' containment reference.
   * @see #getTs()
   * @generated
   */
  void setTs(type_specifier value);

} // fully_specified_type
