/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value List Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ValueListTypeDefImpl#getSingleType <em>Single Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ValueListTypeDefImpl#getMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueListTypeDefImpl extends TypeDefImpl implements ValueListTypeDef
{
  /**
   * The cached value of the '{@link #getSingleType() <em>Single Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference singleType;

  /**
   * The cached value of the '{@link #getMulti() <em>Multi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti()
   * @generated
   * @ordered
   */
  protected Multiplicity multi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueListTypeDefImpl()
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
    return FXBeanPackage.Literals.VALUE_LIST_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getSingleType()
  {
    return singleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleType(JvmTypeReference newSingleType, NotificationChain msgs)
  {
    JvmTypeReference oldSingleType = singleType;
    singleType = newSingleType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE, oldSingleType, newSingleType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleType(JvmTypeReference newSingleType)
  {
    if (newSingleType != singleType)
    {
      NotificationChain msgs = null;
      if (singleType != null)
        msgs = ((InternalEObject)singleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE, null, msgs);
      if (newSingleType != null)
        msgs = ((InternalEObject)newSingleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE, null, msgs);
      msgs = basicSetSingleType(newSingleType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE, newSingleType, newSingleType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity getMulti()
  {
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMulti(Multiplicity newMulti, NotificationChain msgs)
  {
    Multiplicity oldMulti = multi;
    multi = newMulti;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI, oldMulti, newMulti);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMulti(Multiplicity newMulti)
  {
    if (newMulti != multi)
    {
      NotificationChain msgs = null;
      if (multi != null)
        msgs = ((InternalEObject)multi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI, null, msgs);
      if (newMulti != null)
        msgs = ((InternalEObject)newMulti).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI, null, msgs);
      msgs = basicSetMulti(newMulti, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI, newMulti, newMulti));
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
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE:
        return basicSetSingleType(null, msgs);
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI:
        return basicSetMulti(null, msgs);
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
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE:
        return getSingleType();
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI:
        return getMulti();
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
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE:
        setSingleType((JvmTypeReference)newValue);
        return;
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI:
        setMulti((Multiplicity)newValue);
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
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE:
        setSingleType((JvmTypeReference)null);
        return;
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI:
        setMulti((Multiplicity)null);
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
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__SINGLE_TYPE:
        return singleType != null;
      case FXBeanPackage.VALUE_LIST_TYPE_DEF__MULTI:
        return multi != null;
    }
    return super.eIsSet(featureID);
  }

} //ValueListTypeDefImpl
