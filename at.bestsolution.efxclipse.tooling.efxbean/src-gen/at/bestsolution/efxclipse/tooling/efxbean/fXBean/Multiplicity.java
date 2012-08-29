/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getTotalUnbound <em>Total Unbound</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#isNoUpperBound <em>No Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Total Unbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Total Unbound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Total Unbound</em>' attribute.
   * @see #setTotalUnbound(String)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMultiplicity_TotalUnbound()
   * @model
   * @generated
   */
  String getTotalUnbound();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getTotalUnbound <em>Total Unbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Total Unbound</em>' attribute.
   * @see #getTotalUnbound()
   * @generated
   */
  void setTotalUnbound(String value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMultiplicity_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMultiplicity_UpperBound()
   * @model
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>No Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Upper Bound</em>' attribute.
   * @see #setNoUpperBound(boolean)
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#getMultiplicity_NoUpperBound()
   * @model
   * @generated
   */
  boolean isNoUpperBound();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#isNoUpperBound <em>No Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Upper Bound</em>' attribute.
   * @see #isNoUpperBound()
   * @generated
   */
  void setNoUpperBound(boolean value);

} // Multiplicity
