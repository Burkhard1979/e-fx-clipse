/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration identifier and init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl#getAe <em>Ae</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class declaration_identifier_and_initImpl extends MinimalEObjectImpl.Container implements declaration_identifier_and_init
{
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
   * The cached value of the '{@link #getAe() <em>Ae</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAe()
   * @generated
   * @ordered
   */
  protected constant_expression ae;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected initializer e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_identifier_and_initImpl()
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
    return DecoraDslPackage.Literals.DECLARATION_IDENTIFIER_AND_INIT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression getAe()
  {
    return ae;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAe(constant_expression newAe, NotificationChain msgs)
  {
    constant_expression oldAe = ae;
    ae = newAe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE, oldAe, newAe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAe(constant_expression newAe)
  {
    if (newAe != ae)
    {
      NotificationChain msgs = null;
      if (ae != null)
        msgs = ((InternalEObject)ae).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE, null, msgs);
      if (newAe != null)
        msgs = ((InternalEObject)newAe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE, null, msgs);
      msgs = basicSetAe(newAe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE, newAe, newAe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(initializer newE, NotificationChain msgs)
  {
    initializer oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(initializer newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E, newE, newE));
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
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE:
        return basicSetAe(null, msgs);
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E:
        return basicSetE(null, msgs);
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
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__ID:
        return getId();
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE:
        return getAe();
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E:
        return getE();
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
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__ID:
        setId((String)newValue);
        return;
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE:
        setAe((constant_expression)newValue);
        return;
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E:
        setE((initializer)newValue);
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
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__ID:
        setId(ID_EDEFAULT);
        return;
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE:
        setAe((constant_expression)null);
        return;
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E:
        setE((initializer)null);
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
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__AE:
        return ae != null;
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT__E:
        return e != null;
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

} //declaration_identifier_and_initImpl
