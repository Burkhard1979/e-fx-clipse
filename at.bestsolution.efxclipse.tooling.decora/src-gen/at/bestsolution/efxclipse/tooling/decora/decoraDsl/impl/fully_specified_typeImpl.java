/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fully specified type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl#getTq <em>Tq</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl#getTs <em>Ts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fully_specified_typeImpl extends MinimalEObjectImpl.Container implements fully_specified_type
{
  /**
   * The default value of the '{@link #getTq() <em>Tq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTq()
   * @generated
   * @ordered
   */
  protected static final String TQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTq() <em>Tq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTq()
   * @generated
   * @ordered
   */
  protected String tq = TQ_EDEFAULT;

  /**
   * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected static final String TP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected String tp = TP_EDEFAULT;

  /**
   * The cached value of the '{@link #getTs() <em>Ts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTs()
   * @generated
   * @ordered
   */
  protected type_specifier ts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fully_specified_typeImpl()
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
    return DecoraDslPackage.Literals.FULLY_SPECIFIED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTq()
  {
    return tq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTq(String newTq)
  {
    String oldTq = tq;
    tq = newTq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FULLY_SPECIFIED_TYPE__TQ, oldTq, tq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTp()
  {
    return tp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp(String newTp)
  {
    String oldTp = tp;
    tp = newTp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FULLY_SPECIFIED_TYPE__TP, oldTp, tp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getTs()
  {
    return ts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTs(type_specifier newTs, NotificationChain msgs)
  {
    type_specifier oldTs = ts;
    ts = newTs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS, oldTs, newTs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTs(type_specifier newTs)
  {
    if (newTs != ts)
    {
      NotificationChain msgs = null;
      if (ts != null)
        msgs = ((InternalEObject)ts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS, null, msgs);
      if (newTs != null)
        msgs = ((InternalEObject)newTs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS, null, msgs);
      msgs = basicSetTs(newTs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS, newTs, newTs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS:
        return basicSetTs(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TQ:
        return getTq();
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TP:
        return getTp();
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS:
        return getTs();
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
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TQ:
        setTq((String)newValue);
        return;
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TP:
        setTp((String)newValue);
        return;
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS:
        setTs((type_specifier)newValue);
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
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TQ:
        setTq(TQ_EDEFAULT);
        return;
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TP:
        setTp(TP_EDEFAULT);
        return;
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS:
        setTs((type_specifier)null);
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
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TQ:
        return TQ_EDEFAULT == null ? tq != null : !TQ_EDEFAULT.equals(tq);
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TP:
        return TP_EDEFAULT == null ? tp != null : !TP_EDEFAULT.equals(tp);
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE__TS:
        return ts != null;
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
    result.append(" (tq: ");
    result.append(tq);
    result.append(", tp: ");
    result.append(tp);
    result.append(')');
    return result.toString();
  }

} //fully_specified_typeImpl
