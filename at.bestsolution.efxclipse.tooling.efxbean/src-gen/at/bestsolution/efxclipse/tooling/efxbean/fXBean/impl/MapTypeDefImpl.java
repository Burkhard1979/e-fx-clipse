/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MapTypeDefImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MapTypeDefImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapTypeDefImpl extends TypeDefImpl implements MapTypeDef
{
  /**
   * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference keyType;

  /**
   * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference valueType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapTypeDefImpl()
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
    return FXBeanPackage.Literals.MAP_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getKeyType()
  {
    return keyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyType(JvmTypeReference newKeyType, NotificationChain msgs)
  {
    JvmTypeReference oldKeyType = keyType;
    keyType = newKeyType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE, oldKeyType, newKeyType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyType(JvmTypeReference newKeyType)
  {
    if (newKeyType != keyType)
    {
      NotificationChain msgs = null;
      if (keyType != null)
        msgs = ((InternalEObject)keyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE, null, msgs);
      if (newKeyType != null)
        msgs = ((InternalEObject)newKeyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE, null, msgs);
      msgs = basicSetKeyType(newKeyType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE, newKeyType, newKeyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getValueType()
  {
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueType(JvmTypeReference newValueType, NotificationChain msgs)
  {
    JvmTypeReference oldValueType = valueType;
    valueType = newValueType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE, oldValueType, newValueType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueType(JvmTypeReference newValueType)
  {
    if (newValueType != valueType)
    {
      NotificationChain msgs = null;
      if (valueType != null)
        msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE, null, msgs);
      if (newValueType != null)
        msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE, null, msgs);
      msgs = basicSetValueType(newValueType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE, newValueType, newValueType));
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
      case FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE:
        return basicSetKeyType(null, msgs);
      case FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE:
        return basicSetValueType(null, msgs);
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
      case FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE:
        return getKeyType();
      case FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE:
        return getValueType();
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
      case FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE:
        setKeyType((JvmTypeReference)newValue);
        return;
      case FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE:
        setValueType((JvmTypeReference)newValue);
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
      case FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE:
        setKeyType((JvmTypeReference)null);
        return;
      case FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE:
        setValueType((JvmTypeReference)null);
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
      case FXBeanPackage.MAP_TYPE_DEF__KEY_TYPE:
        return keyType != null;
      case FXBeanPackage.MAP_TYPE_DEF__VALUE_TYPE:
        return valueType != null;
    }
    return super.eIsSet(featureID);
  }

} //MapTypeDefImpl
