/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getT <em>T</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getparameter_declaration()
 * @model
 * @generated
 */
public interface parameter_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(type_specifier)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getparameter_declaration_T()
   * @model containment="true"
   * @generated
   */
  type_specifier getT();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(type_specifier value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#getparameter_declaration_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // parameter_declaration
