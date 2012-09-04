/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl#getTotalUnbound <em>Total Unbound</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl#isNoUpperBound <em>No Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityImpl extends MinimalEObjectImpl.Container implements Multiplicity
{
  /**
   * The default value of the '{@link #getTotalUnbound() <em>Total Unbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalUnbound()
   * @generated
   * @ordered
   */
  protected static final String TOTAL_UNBOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTotalUnbound() <em>Total Unbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalUnbound()
   * @generated
   * @ordered
   */
  protected String totalUnbound = TOTAL_UNBOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final int UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected int upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isNoUpperBound() <em>No Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoUpperBound()
   * @generated
   * @ordered
   */
  protected static final boolean NO_UPPER_BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoUpperBound() <em>No Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoUpperBound()
   * @generated
   * @ordered
   */
  protected boolean noUpperBound = NO_UPPER_BOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FXBeanPackage.Literals.MULTIPLICITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTotalUnbound()
  {
    return totalUnbound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTotalUnbound(String newTotalUnbound)
  {
    String oldTotalUnbound = totalUnbound;
    totalUnbound = newTotalUnbound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.MULTIPLICITY__TOTAL_UNBOUND, oldTotalUnbound, totalUnbound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(int newLowerBound)
  {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.MULTIPLICITY__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(int newUpperBound)
  {
    int oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.MULTIPLICITY__UPPER_BOUND, oldUpperBound, upperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoUpperBound()
  {
    return noUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoUpperBound(boolean newNoUpperBound)
  {
    boolean oldNoUpperBound = noUpperBound;
    noUpperBound = newNoUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.MULTIPLICITY__NO_UPPER_BOUND, oldNoUpperBound, noUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FXBeanPackage.MULTIPLICITY__TOTAL_UNBOUND:
        return getTotalUnbound();
      case FXBeanPackage.MULTIPLICITY__LOWER_BOUND:
        return getLowerBound();
      case FXBeanPackage.MULTIPLICITY__UPPER_BOUND:
        return getUpperBound();
      case FXBeanPackage.MULTIPLICITY__NO_UPPER_BOUND:
        return isNoUpperBound();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FXBeanPackage.MULTIPLICITY__TOTAL_UNBOUND:
        setTotalUnbound((String)newValue);
        return;
      case FXBeanPackage.MULTIPLICITY__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case FXBeanPackage.MULTIPLICITY__UPPER_BOUND:
        setUpperBound((Integer)newValue);
        return;
      case FXBeanPackage.MULTIPLICITY__NO_UPPER_BOUND:
        setNoUpperBound((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FXBeanPackage.MULTIPLICITY__TOTAL_UNBOUND:
        setTotalUnbound(TOTAL_UNBOUND_EDEFAULT);
        return;
      case FXBeanPackage.MULTIPLICITY__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case FXBeanPackage.MULTIPLICITY__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case FXBeanPackage.MULTIPLICITY__NO_UPPER_BOUND:
        setNoUpperBound(NO_UPPER_BOUND_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FXBeanPackage.MULTIPLICITY__TOTAL_UNBOUND:
        return TOTAL_UNBOUND_EDEFAULT == null ? totalUnbound != null : !TOTAL_UNBOUND_EDEFAULT.equals(totalUnbound);
      case FXBeanPackage.MULTIPLICITY__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case FXBeanPackage.MULTIPLICITY__UPPER_BOUND:
        return upperBound != UPPER_BOUND_EDEFAULT;
      case FXBeanPackage.MULTIPLICITY__NO_UPPER_BOUND:
        return noUpperBound != NO_UPPER_BOUND_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (totalUnbound: ");
    result.append(totalUnbound);
    result.append(", lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(", noUpperBound: ");
    result.append(noUpperBound);
    result.append(')');
    return result.toString();
  }

} //MultiplicityImpl
