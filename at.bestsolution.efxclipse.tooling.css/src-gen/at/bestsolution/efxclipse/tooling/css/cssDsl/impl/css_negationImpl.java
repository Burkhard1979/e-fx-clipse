/**
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_negation;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_not;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>css negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_negationImpl#getNot <em>Not</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_negationImpl#getNegation_arg <em>Negation arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class css_negationImpl extends MinimalEObjectImpl.Container implements css_negation
{
  /**
   * The default value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected static final css_not NOT_EDEFAULT = css_not.NOT;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected css_not not = NOT_EDEFAULT;

  /**
   * The default value of the '{@link #getNegation_arg() <em>Negation arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegation_arg()
   * @generated
   * @ordered
   */
  protected static final String NEGATION_ARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNegation_arg() <em>Negation arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegation_arg()
   * @generated
   * @ordered
   */
  protected String negation_arg = NEGATION_ARG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected css_negationImpl()
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
    return CssDslPackage.Literals.CSS_NEGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_not getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(css_not newNot)
  {
    css_not oldNot = not;
    not = newNot == null ? NOT_EDEFAULT : newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_NEGATION__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNegation_arg()
  {
    return negation_arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegation_arg(String newNegation_arg)
  {
    String oldNegation_arg = negation_arg;
    negation_arg = newNegation_arg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_NEGATION__NEGATION_ARG, oldNegation_arg, negation_arg));
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
      case CssDslPackage.CSS_NEGATION__NOT:
        return getNot();
      case CssDslPackage.CSS_NEGATION__NEGATION_ARG:
        return getNegation_arg();
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
      case CssDslPackage.CSS_NEGATION__NOT:
        setNot((css_not)newValue);
        return;
      case CssDslPackage.CSS_NEGATION__NEGATION_ARG:
        setNegation_arg((String)newValue);
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
      case CssDslPackage.CSS_NEGATION__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case CssDslPackage.CSS_NEGATION__NEGATION_ARG:
        setNegation_arg(NEGATION_ARG_EDEFAULT);
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
      case CssDslPackage.CSS_NEGATION__NOT:
        return not != NOT_EDEFAULT;
      case CssDslPackage.CSS_NEGATION__NEGATION_ARG:
        return NEGATION_ARG_EDEFAULT == null ? negation_arg != null : !NEGATION_ARG_EDEFAULT.equals(negation_arg);
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
    result.append(" (not: ");
    result.append(not);
    result.append(", negation_arg: ");
    result.append(negation_arg);
    result.append(')');
    return result.toString();
  }

} //css_negationImpl
