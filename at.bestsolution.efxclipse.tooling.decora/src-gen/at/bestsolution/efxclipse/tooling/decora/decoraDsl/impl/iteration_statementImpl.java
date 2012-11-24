/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>iteration statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getC <em>C</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getSnns <em>Snns</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getS <em>S</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getE <em>E</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getU <em>U</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getInit <em>Init</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl#getRem <em>Rem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class iteration_statementImpl extends MinimalEObjectImpl.Container implements iteration_statement
{
  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected condition c;

  /**
   * The cached value of the '{@link #getSnns() <em>Snns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSnns()
   * @generated
   * @ordered
   */
  protected statement_no_new_scope snns;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected statement s;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Expr e;

  /**
   * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getU()
   * @generated
   * @ordered
   */
  protected unroll_modifier u;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected for_init_statement init;

  /**
   * The cached value of the '{@link #getRem() <em>Rem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRem()
   * @generated
   * @ordered
   */
  protected for_rest_statement rem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected iteration_statementImpl()
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
    return DecoraDslPackage.Literals.ITERATION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public condition getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(condition newC, NotificationChain msgs)
  {
    condition oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(condition newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_no_new_scope getSnns()
  {
    return snns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSnns(statement_no_new_scope newSnns, NotificationChain msgs)
  {
    statement_no_new_scope oldSnns = snns;
    snns = newSnns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__SNNS, oldSnns, newSnns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSnns(statement_no_new_scope newSnns)
  {
    if (newSnns != snns)
    {
      NotificationChain msgs = null;
      if (snns != null)
        msgs = ((InternalEObject)snns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__SNNS, null, msgs);
      if (newSnns != null)
        msgs = ((InternalEObject)newSnns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__SNNS, null, msgs);
      msgs = basicSetSnns(newSnns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__SNNS, newSnns, newSnns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(statement newS, NotificationChain msgs)
  {
    statement oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(statement newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Expr newE, NotificationChain msgs)
  {
    Expr oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Expr newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unroll_modifier getU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetU(unroll_modifier newU, NotificationChain msgs)
  {
    unroll_modifier oldU = u;
    u = newU;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__U, oldU, newU);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(unroll_modifier newU)
  {
    if (newU != u)
    {
      NotificationChain msgs = null;
      if (u != null)
        msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__U, null, msgs);
      if (newU != null)
        msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__U, null, msgs);
      msgs = basicSetU(newU, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__U, newU, newU));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_init_statement getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(for_init_statement newInit, NotificationChain msgs)
  {
    for_init_statement oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(for_init_statement newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_rest_statement getRem()
  {
    return rem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRem(for_rest_statement newRem, NotificationChain msgs)
  {
    for_rest_statement oldRem = rem;
    rem = newRem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__REM, oldRem, newRem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRem(for_rest_statement newRem)
  {
    if (newRem != rem)
    {
      NotificationChain msgs = null;
      if (rem != null)
        msgs = ((InternalEObject)rem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__REM, null, msgs);
      if (newRem != null)
        msgs = ((InternalEObject)newRem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.ITERATION_STATEMENT__REM, null, msgs);
      msgs = basicSetRem(newRem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.ITERATION_STATEMENT__REM, newRem, newRem));
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
      case DecoraDslPackage.ITERATION_STATEMENT__C:
        return basicSetC(null, msgs);
      case DecoraDslPackage.ITERATION_STATEMENT__SNNS:
        return basicSetSnns(null, msgs);
      case DecoraDslPackage.ITERATION_STATEMENT__S:
        return basicSetS(null, msgs);
      case DecoraDslPackage.ITERATION_STATEMENT__E:
        return basicSetE(null, msgs);
      case DecoraDslPackage.ITERATION_STATEMENT__U:
        return basicSetU(null, msgs);
      case DecoraDslPackage.ITERATION_STATEMENT__INIT:
        return basicSetInit(null, msgs);
      case DecoraDslPackage.ITERATION_STATEMENT__REM:
        return basicSetRem(null, msgs);
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
      case DecoraDslPackage.ITERATION_STATEMENT__C:
        return getC();
      case DecoraDslPackage.ITERATION_STATEMENT__SNNS:
        return getSnns();
      case DecoraDslPackage.ITERATION_STATEMENT__S:
        return getS();
      case DecoraDslPackage.ITERATION_STATEMENT__E:
        return getE();
      case DecoraDslPackage.ITERATION_STATEMENT__U:
        return getU();
      case DecoraDslPackage.ITERATION_STATEMENT__INIT:
        return getInit();
      case DecoraDslPackage.ITERATION_STATEMENT__REM:
        return getRem();
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
      case DecoraDslPackage.ITERATION_STATEMENT__C:
        setC((condition)newValue);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__SNNS:
        setSnns((statement_no_new_scope)newValue);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__S:
        setS((statement)newValue);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__E:
        setE((Expr)newValue);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__U:
        setU((unroll_modifier)newValue);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__INIT:
        setInit((for_init_statement)newValue);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__REM:
        setRem((for_rest_statement)newValue);
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
      case DecoraDslPackage.ITERATION_STATEMENT__C:
        setC((condition)null);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__SNNS:
        setSnns((statement_no_new_scope)null);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__S:
        setS((statement)null);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__E:
        setE((Expr)null);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__U:
        setU((unroll_modifier)null);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__INIT:
        setInit((for_init_statement)null);
        return;
      case DecoraDslPackage.ITERATION_STATEMENT__REM:
        setRem((for_rest_statement)null);
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
      case DecoraDslPackage.ITERATION_STATEMENT__C:
        return c != null;
      case DecoraDslPackage.ITERATION_STATEMENT__SNNS:
        return snns != null;
      case DecoraDslPackage.ITERATION_STATEMENT__S:
        return s != null;
      case DecoraDslPackage.ITERATION_STATEMENT__E:
        return e != null;
      case DecoraDslPackage.ITERATION_STATEMENT__U:
        return u != null;
      case DecoraDslPackage.ITERATION_STATEMENT__INIT:
        return init != null;
      case DecoraDslPackage.ITERATION_STATEMENT__REM:
        return rem != null;
    }
    return super.eIsSet(featureID);
  }

} //iteration_statementImpl
