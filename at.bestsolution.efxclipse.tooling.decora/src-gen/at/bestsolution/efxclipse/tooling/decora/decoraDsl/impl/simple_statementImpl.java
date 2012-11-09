/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl#getD <em>D</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl#getE <em>E</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl#getS <em>S</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl#getI <em>I</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl#getJ <em>J</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_statementImpl extends MinimalEObjectImpl.Container implements simple_statement
{
  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected declaration_statement d;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected expression_statement e;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected selection_statement s;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected iteration_statement i;

  /**
   * The cached value of the '{@link #getJ() <em>J</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJ()
   * @generated
   * @ordered
   */
  protected jump_statement j;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_statementImpl()
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
    return DecoraDslPackage.Literals.SIMPLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_statement getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(declaration_statement newD, NotificationChain msgs)
  {
    declaration_statement oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(declaration_statement newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__D, newD, newD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(expression_statement newE, NotificationChain msgs)
  {
    expression_statement oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(expression_statement newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selection_statement getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(selection_statement newS, NotificationChain msgs)
  {
    selection_statement oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(selection_statement newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iteration_statement getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(iteration_statement newI, NotificationChain msgs)
  {
    iteration_statement oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(iteration_statement newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jump_statement getJ()
  {
    return j;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJ(jump_statement newJ, NotificationChain msgs)
  {
    jump_statement oldJ = j;
    j = newJ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__J, oldJ, newJ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJ(jump_statement newJ)
  {
    if (newJ != j)
    {
      NotificationChain msgs = null;
      if (j != null)
        msgs = ((InternalEObject)j).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__J, null, msgs);
      if (newJ != null)
        msgs = ((InternalEObject)newJ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.SIMPLE_STATEMENT__J, null, msgs);
      msgs = basicSetJ(newJ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.SIMPLE_STATEMENT__J, newJ, newJ));
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
      case DecoraDslPackage.SIMPLE_STATEMENT__D:
        return basicSetD(null, msgs);
      case DecoraDslPackage.SIMPLE_STATEMENT__E:
        return basicSetE(null, msgs);
      case DecoraDslPackage.SIMPLE_STATEMENT__S:
        return basicSetS(null, msgs);
      case DecoraDslPackage.SIMPLE_STATEMENT__I:
        return basicSetI(null, msgs);
      case DecoraDslPackage.SIMPLE_STATEMENT__J:
        return basicSetJ(null, msgs);
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
      case DecoraDslPackage.SIMPLE_STATEMENT__D:
        return getD();
      case DecoraDslPackage.SIMPLE_STATEMENT__E:
        return getE();
      case DecoraDslPackage.SIMPLE_STATEMENT__S:
        return getS();
      case DecoraDslPackage.SIMPLE_STATEMENT__I:
        return getI();
      case DecoraDslPackage.SIMPLE_STATEMENT__J:
        return getJ();
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
      case DecoraDslPackage.SIMPLE_STATEMENT__D:
        setD((declaration_statement)newValue);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__E:
        setE((expression_statement)newValue);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__S:
        setS((selection_statement)newValue);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__I:
        setI((iteration_statement)newValue);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__J:
        setJ((jump_statement)newValue);
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
      case DecoraDslPackage.SIMPLE_STATEMENT__D:
        setD((declaration_statement)null);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__E:
        setE((expression_statement)null);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__S:
        setS((selection_statement)null);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__I:
        setI((iteration_statement)null);
        return;
      case DecoraDslPackage.SIMPLE_STATEMENT__J:
        setJ((jump_statement)null);
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
      case DecoraDslPackage.SIMPLE_STATEMENT__D:
        return d != null;
      case DecoraDslPackage.SIMPLE_STATEMENT__E:
        return e != null;
      case DecoraDslPackage.SIMPLE_STATEMENT__S:
        return s != null;
      case DecoraDslPackage.SIMPLE_STATEMENT__I:
        return i != null;
      case DecoraDslPackage.SIMPLE_STATEMENT__J:
        return j != null;
    }
    return super.eIsSet(featureID);
  }

} //simple_statementImpl
