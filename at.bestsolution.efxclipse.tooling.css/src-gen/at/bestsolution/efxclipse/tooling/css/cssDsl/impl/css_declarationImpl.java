/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>css declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl#getPrio <em>Prio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class css_declarationImpl extends MinimalEObjectImpl.Container implements css_declaration
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected css_property property;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expr expression;

  /**
   * The default value of the '{@link #getPrio() <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrio()
   * @generated
   * @ordered
   */
  protected static final String PRIO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrio() <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrio()
   * @generated
   * @ordered
   */
  protected String prio = PRIO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected css_declarationImpl()
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
    return CssDslPackage.Literals.CSS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_property getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(css_property newProperty, NotificationChain msgs)
  {
    css_property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_DECLARATION__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(css_property newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.CSS_DECLARATION__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.CSS_DECLARATION__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_DECLARATION__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expr newExpression, NotificationChain msgs)
  {
    expr oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_DECLARATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expr newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.CSS_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.CSS_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_DECLARATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrio()
  {
    return prio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrio(String newPrio)
  {
    String oldPrio = prio;
    prio = newPrio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.CSS_DECLARATION__PRIO, oldPrio, prio));
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
      case CssDslPackage.CSS_DECLARATION__PROPERTY:
        return basicSetProperty(null, msgs);
      case CssDslPackage.CSS_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case CssDslPackage.CSS_DECLARATION__PROPERTY:
        return getProperty();
      case CssDslPackage.CSS_DECLARATION__EXPRESSION:
        return getExpression();
      case CssDslPackage.CSS_DECLARATION__PRIO:
        return getPrio();
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
      case CssDslPackage.CSS_DECLARATION__PROPERTY:
        setProperty((css_property)newValue);
        return;
      case CssDslPackage.CSS_DECLARATION__EXPRESSION:
        setExpression((expr)newValue);
        return;
      case CssDslPackage.CSS_DECLARATION__PRIO:
        setPrio((String)newValue);
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
      case CssDslPackage.CSS_DECLARATION__PROPERTY:
        setProperty((css_property)null);
        return;
      case CssDslPackage.CSS_DECLARATION__EXPRESSION:
        setExpression((expr)null);
        return;
      case CssDslPackage.CSS_DECLARATION__PRIO:
        setPrio(PRIO_EDEFAULT);
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
      case CssDslPackage.CSS_DECLARATION__PROPERTY:
        return property != null;
      case CssDslPackage.CSS_DECLARATION__EXPRESSION:
        return expression != null;
      case CssDslPackage.CSS_DECLARATION__PRIO:
        return PRIO_EDEFAULT == null ? prio != null : !PRIO_EDEFAULT.equals(prio);
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
    result.append(" (prio: ");
    result.append(prio);
    result.append(')');
    return result.toString();
  }

} //css_declarationImpl
