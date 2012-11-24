/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl#getT <em>T</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class function_prototypeImpl extends MinimalEObjectImpl.Container implements function_prototype
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected type_specifier t;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected parameter_declaration_list p;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected function_prototypeImpl()
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
    return DecoraDslPackage.Literals.FUNCTION_PROTOTYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(type_specifier newT, NotificationChain msgs)
  {
    type_specifier oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_PROTOTYPE__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(type_specifier newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_PROTOTYPE__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_PROTOTYPE__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_PROTOTYPE__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_PROTOTYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_declaration_list getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(parameter_declaration_list newP, NotificationChain msgs)
  {
    parameter_declaration_list oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_PROTOTYPE__P, oldP, newP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(parameter_declaration_list newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_PROTOTYPE__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_PROTOTYPE__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_PROTOTYPE__P, newP, newP));
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
      case DecoraDslPackage.FUNCTION_PROTOTYPE__T:
        return basicSetT(null, msgs);
      case DecoraDslPackage.FUNCTION_PROTOTYPE__P:
        return basicSetP(null, msgs);
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
      case DecoraDslPackage.FUNCTION_PROTOTYPE__T:
        return getT();
      case DecoraDslPackage.FUNCTION_PROTOTYPE__ID:
        return getId();
      case DecoraDslPackage.FUNCTION_PROTOTYPE__P:
        return getP();
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
      case DecoraDslPackage.FUNCTION_PROTOTYPE__T:
        setT((type_specifier)newValue);
        return;
      case DecoraDslPackage.FUNCTION_PROTOTYPE__ID:
        setId((String)newValue);
        return;
      case DecoraDslPackage.FUNCTION_PROTOTYPE__P:
        setP((parameter_declaration_list)newValue);
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
      case DecoraDslPackage.FUNCTION_PROTOTYPE__T:
        setT((type_specifier)null);
        return;
      case DecoraDslPackage.FUNCTION_PROTOTYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case DecoraDslPackage.FUNCTION_PROTOTYPE__P:
        setP((parameter_declaration_list)null);
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
      case DecoraDslPackage.FUNCTION_PROTOTYPE__T:
        return t != null;
      case DecoraDslPackage.FUNCTION_PROTOTYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DecoraDslPackage.FUNCTION_PROTOTYPE__P:
        return p != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //function_prototypeImpl
