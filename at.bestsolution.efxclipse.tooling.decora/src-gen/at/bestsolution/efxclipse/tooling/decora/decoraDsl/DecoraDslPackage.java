/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslFactory
 * @model kind="package"
 * @generated
 */
public interface DecoraDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "decoraDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/decora/DecoraDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "decoraDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DecoraDslPackage eINSTANCE = at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl <em>field selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfield_selection()
   * @generated
   */
  int FIELD_SELECTION = 0;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SELECTION__R = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SELECTION__X = 1;

  /**
   * The number of structural features of the '<em>field selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SELECTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection <em>field selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field selection</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection
   * @generated
   */
  EClass getfield_selection();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getR()
   * @see #getfield_selection()
   * @generated
   */
  EAttribute getfield_selection_R();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getX()
   * @see #getfield_selection()
   * @generated
   */
  EAttribute getfield_selection_X();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DecoraDslFactory getDecoraDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl <em>field selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfield_selection()
     * @generated
     */
    EClass FIELD_SELECTION = eINSTANCE.getfield_selection();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SELECTION__R = eINSTANCE.getfield_selection_R();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SELECTION__X = eINSTANCE.getfield_selection_X();

  }

} //DecoraDslPackage
