/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declarationImpl#getS <em>S</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declarationImpl#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class declarationImpl extends MinimalEObjectImpl.Container implements declaration
{
  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected single_declaration s;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected EList<declaration_identifier_and_init> d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declarationImpl()
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
    return DecoraDslPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public single_declaration getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(single_declaration newS, NotificationChain msgs)
  {
    single_declaration oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(single_declaration newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.DECLARATION__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.DECLARATION__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.DECLARATION__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<declaration_identifier_and_init> getD()
  {
    if (d == null)
    {
      d = new EObjectContainmentEList<declaration_identifier_and_init>(declaration_identifier_and_init.class, this, DecoraDslPackage.DECLARATION__D);
    }
    return d;
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
      case DecoraDslPackage.DECLARATION__S:
        return basicSetS(null, msgs);
      case DecoraDslPackage.DECLARATION__D:
        return ((InternalEList<?>)getD()).basicRemove(otherEnd, msgs);
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
      case DecoraDslPackage.DECLARATION__S:
        return getS();
      case DecoraDslPackage.DECLARATION__D:
        return getD();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DecoraDslPackage.DECLARATION__S:
        setS((single_declaration)newValue);
        return;
      case DecoraDslPackage.DECLARATION__D:
        getD().clear();
        getD().addAll((Collection<? extends declaration_identifier_and_init>)newValue);
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
      case DecoraDslPackage.DECLARATION__S:
        setS((single_declaration)null);
        return;
      case DecoraDslPackage.DECLARATION__D:
        getD().clear();
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
      case DecoraDslPackage.DECLARATION__S:
        return s != null;
      case DecoraDslPackage.DECLARATION__D:
        return d != null && !d.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //declarationImpl
