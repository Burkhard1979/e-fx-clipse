/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.postfix_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_or_call;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.postfix_expressionImpl#getE <em>E</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.postfix_expressionImpl#getAe <em>Ae</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.postfix_expressionImpl#getFs <em>Fs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class postfix_expressionImpl extends MinimalEObjectImpl.Container implements postfix_expression
{
  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected primary_or_call e;

  /**
   * The cached value of the '{@link #getAe() <em>Ae</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAe()
   * @generated
   * @ordered
   */
  protected expression ae;

  /**
   * The cached value of the '{@link #getFs() <em>Fs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected field_selection fs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfix_expressionImpl()
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
    return DecoraDslPackage.Literals.POSTFIX_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primary_or_call getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(primary_or_call newE, NotificationChain msgs)
  {
    primary_or_call oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.POSTFIX_EXPRESSION__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(primary_or_call newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.POSTFIX_EXPRESSION__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.POSTFIX_EXPRESSION__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.POSTFIX_EXPRESSION__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getAe()
  {
    return ae;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAe(expression newAe, NotificationChain msgs)
  {
    expression oldAe = ae;
    ae = newAe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.POSTFIX_EXPRESSION__AE, oldAe, newAe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAe(expression newAe)
  {
    if (newAe != ae)
    {
      NotificationChain msgs = null;
      if (ae != null)
        msgs = ((InternalEObject)ae).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.POSTFIX_EXPRESSION__AE, null, msgs);
      if (newAe != null)
        msgs = ((InternalEObject)newAe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.POSTFIX_EXPRESSION__AE, null, msgs);
      msgs = basicSetAe(newAe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.POSTFIX_EXPRESSION__AE, newAe, newAe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_selection getFs()
  {
    return fs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFs(field_selection newFs, NotificationChain msgs)
  {
    field_selection oldFs = fs;
    fs = newFs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.POSTFIX_EXPRESSION__FS, oldFs, newFs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFs(field_selection newFs)
  {
    if (newFs != fs)
    {
      NotificationChain msgs = null;
      if (fs != null)
        msgs = ((InternalEObject)fs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.POSTFIX_EXPRESSION__FS, null, msgs);
      if (newFs != null)
        msgs = ((InternalEObject)newFs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.POSTFIX_EXPRESSION__FS, null, msgs);
      msgs = basicSetFs(newFs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.POSTFIX_EXPRESSION__FS, newFs, newFs));
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
      case DecoraDslPackage.POSTFIX_EXPRESSION__E:
        return basicSetE(null, msgs);
      case DecoraDslPackage.POSTFIX_EXPRESSION__AE:
        return basicSetAe(null, msgs);
      case DecoraDslPackage.POSTFIX_EXPRESSION__FS:
        return basicSetFs(null, msgs);
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
      case DecoraDslPackage.POSTFIX_EXPRESSION__E:
        return getE();
      case DecoraDslPackage.POSTFIX_EXPRESSION__AE:
        return getAe();
      case DecoraDslPackage.POSTFIX_EXPRESSION__FS:
        return getFs();
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
      case DecoraDslPackage.POSTFIX_EXPRESSION__E:
        setE((primary_or_call)newValue);
        return;
      case DecoraDslPackage.POSTFIX_EXPRESSION__AE:
        setAe((expression)newValue);
        return;
      case DecoraDslPackage.POSTFIX_EXPRESSION__FS:
        setFs((field_selection)newValue);
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
      case DecoraDslPackage.POSTFIX_EXPRESSION__E:
        setE((primary_or_call)null);
        return;
      case DecoraDslPackage.POSTFIX_EXPRESSION__AE:
        setAe((expression)null);
        return;
      case DecoraDslPackage.POSTFIX_EXPRESSION__FS:
        setFs((field_selection)null);
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
      case DecoraDslPackage.POSTFIX_EXPRESSION__E:
        return e != null;
      case DecoraDslPackage.POSTFIX_EXPRESSION__AE:
        return ae != null;
      case DecoraDslPackage.POSTFIX_EXPRESSION__FS:
        return fs != null;
    }
    return super.eIsSet(featureID);
  }

} //postfix_expressionImpl
