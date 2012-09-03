/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSSRuleDefinitionImpl extends MinimalEObjectImpl.Container implements CSSRuleDefinition
{
  /**
   * The cached value of the '{@link #getDoku() <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoku()
   * @generated
   * @ordered
   */
  protected Doku doku;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected CSSRuleId name;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected CSSRule rule;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected CSSRule func;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSSRuleDefinitionImpl()
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
    return CssExtDslPackage.Literals.CSS_RULE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku getDoku()
  {
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoku(Doku newDoku, NotificationChain msgs)
  {
    Doku oldDoku = doku;
    doku = newDoku;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, oldDoku, newDoku);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoku(Doku newDoku)
  {
    if (newDoku != doku)
    {
      NotificationChain msgs = null;
      if (doku != null)
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, newDoku, newDoku));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleId getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(CSSRuleId newName, NotificationChain msgs)
  {
    CSSRuleId oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(CSSRuleId newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(CSSRule newRule, NotificationChain msgs)
  {
    CSSRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(CSSRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__RULE, newRule, newRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRule getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunc(CSSRule newFunc, NotificationChain msgs)
  {
    CSSRule oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(CSSRule newFunc)
  {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__FUNC, newFunc, newFunc));
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
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        return basicSetName(null, msgs);
      case CssExtDslPackage.CSS_RULE_DEFINITION__RULE:
        return basicSetRule(null, msgs);
      case CssExtDslPackage.CSS_RULE_DEFINITION__FUNC:
        return basicSetFunc(null, msgs);
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
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        return getDoku();
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        return getName();
      case CssExtDslPackage.CSS_RULE_DEFINITION__RULE:
        return getRule();
      case CssExtDslPackage.CSS_RULE_DEFINITION__FUNC:
        return getFunc();
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
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        setName((CSSRuleId)newValue);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__RULE:
        setRule((CSSRule)newValue);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__FUNC:
        setFunc((CSSRule)newValue);
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
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        setName((CSSRuleId)null);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__RULE:
        setRule((CSSRule)null);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__FUNC:
        setFunc((CSSRule)null);
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
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        return doku != null;
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        return name != null;
      case CssExtDslPackage.CSS_RULE_DEFINITION__RULE:
        return rule != null;
      case CssExtDslPackage.CSS_RULE_DEFINITION__FUNC:
        return func != null;
    }
    return super.eIsSet(featureID);
  }

} //CSSRuleDefinitionImpl
