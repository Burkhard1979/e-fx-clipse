/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>translation unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#gettranslation_unit()
 * @model
 * @generated
 */
public interface translation_unit extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#gettranslation_unit_E()
   * @model containment="true"
   * @generated
   */
  EList<external_declaration> getE();

} // translation_unit
