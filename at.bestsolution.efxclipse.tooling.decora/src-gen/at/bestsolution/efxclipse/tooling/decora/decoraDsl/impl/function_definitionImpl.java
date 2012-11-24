/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_definitionImpl#getP <em>P</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_definitionImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class function_definitionImpl extends MinimalEObjectImpl.Container implements function_definition
{
  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected function_prototype p;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected compound_statement_no_new_scope s;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected function_definitionImpl()
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
    return DecoraDslPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_prototype getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(function_prototype newP, NotificationChain msgs)
  {
    function_prototype oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_DEFINITION__P, oldP, newP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(function_prototype newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_DEFINITION__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_DEFINITION__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_DEFINITION__P, newP, newP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement_no_new_scope getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(compound_statement_no_new_scope newS, NotificationChain msgs)
  {
    compound_statement_no_new_scope oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_DEFINITION__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(compound_statement_no_new_scope newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_DEFINITION__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FUNCTION_DEFINITION__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FUNCTION_DEFINITION__S, newS, newS));
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
      case DecoraDslPackage.FUNCTION_DEFINITION__P:
        return basicSetP(null, msgs);
      case DecoraDslPackage.FUNCTION_DEFINITION__S:
        return basicSetS(null, msgs);
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
      case DecoraDslPackage.FUNCTION_DEFINITION__P:
        return getP();
      case DecoraDslPackage.FUNCTION_DEFINITION__S:
        return getS();
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
      case DecoraDslPackage.FUNCTION_DEFINITION__P:
        setP((function_prototype)newValue);
        return;
      case DecoraDslPackage.FUNCTION_DEFINITION__S:
        setS((compound_statement_no_new_scope)newValue);
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
      case DecoraDslPackage.FUNCTION_DEFINITION__P:
        setP((function_prototype)null);
        return;
      case DecoraDslPackage.FUNCTION_DEFINITION__S:
        setS((compound_statement_no_new_scope)null);
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
      case DecoraDslPackage.FUNCTION_DEFINITION__P:
        return p != null;
      case DecoraDslPackage.FUNCTION_DEFINITION__S:
        return s != null;
    }
    return super.eIsSet(featureID);
  }

} //function_definitionImpl
