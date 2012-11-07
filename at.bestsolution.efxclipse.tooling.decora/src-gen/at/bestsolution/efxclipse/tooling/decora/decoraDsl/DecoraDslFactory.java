/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage
 * @generated
 */
public interface DecoraDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DecoraDslFactory eINSTANCE = at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>field selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field selection</em>'.
   * @generated
   */
  field_selection createfield_selection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DecoraDslPackage getDecoraDslPackage();

} //DecoraDslFactory
