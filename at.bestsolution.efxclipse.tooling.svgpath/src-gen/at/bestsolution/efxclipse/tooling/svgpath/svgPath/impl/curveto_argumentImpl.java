/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>curveto argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl#getC3 <em>C3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class curveto_argumentImpl extends MinimalEObjectImpl.Container implements curveto_argument
{
  /**
   * The cached value of the '{@link #getC1() <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC1()
   * @generated
   * @ordered
   */
  protected coordinate_pair c1;

  /**
   * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC2()
   * @generated
   * @ordered
   */
  protected coordinate_pair c2;

  /**
   * The cached value of the '{@link #getC3() <em>C3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC3()
   * @generated
   * @ordered
   */
  protected coordinate_pair c3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected curveto_argumentImpl()
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
    return SvgPathPackage.Literals.CURVETO_ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate_pair getC1()
  {
    return c1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC1(coordinate_pair newC1, NotificationChain msgs)
  {
    coordinate_pair oldC1 = c1;
    c1 = newC1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO_ARGUMENT__C1, oldC1, newC1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC1(coordinate_pair newC1)
  {
    if (newC1 != c1)
    {
      NotificationChain msgs = null;
      if (c1 != null)
        msgs = ((InternalEObject)c1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO_ARGUMENT__C1, null, msgs);
      if (newC1 != null)
        msgs = ((InternalEObject)newC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO_ARGUMENT__C1, null, msgs);
      msgs = basicSetC1(newC1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO_ARGUMENT__C1, newC1, newC1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate_pair getC2()
  {
    return c2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC2(coordinate_pair newC2, NotificationChain msgs)
  {
    coordinate_pair oldC2 = c2;
    c2 = newC2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO_ARGUMENT__C2, oldC2, newC2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC2(coordinate_pair newC2)
  {
    if (newC2 != c2)
    {
      NotificationChain msgs = null;
      if (c2 != null)
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO_ARGUMENT__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO_ARGUMENT__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO_ARGUMENT__C2, newC2, newC2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate_pair getC3()
  {
    return c3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC3(coordinate_pair newC3, NotificationChain msgs)
  {
    coordinate_pair oldC3 = c3;
    c3 = newC3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO_ARGUMENT__C3, oldC3, newC3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC3(coordinate_pair newC3)
  {
    if (newC3 != c3)
    {
      NotificationChain msgs = null;
      if (c3 != null)
        msgs = ((InternalEObject)c3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO_ARGUMENT__C3, null, msgs);
      if (newC3 != null)
        msgs = ((InternalEObject)newC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO_ARGUMENT__C3, null, msgs);
      msgs = basicSetC3(newC3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO_ARGUMENT__C3, newC3, newC3));
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
      case SvgPathPackage.CURVETO_ARGUMENT__C1:
        return basicSetC1(null, msgs);
      case SvgPathPackage.CURVETO_ARGUMENT__C2:
        return basicSetC2(null, msgs);
      case SvgPathPackage.CURVETO_ARGUMENT__C3:
        return basicSetC3(null, msgs);
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
      case SvgPathPackage.CURVETO_ARGUMENT__C1:
        return getC1();
      case SvgPathPackage.CURVETO_ARGUMENT__C2:
        return getC2();
      case SvgPathPackage.CURVETO_ARGUMENT__C3:
        return getC3();
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
      case SvgPathPackage.CURVETO_ARGUMENT__C1:
        setC1((coordinate_pair)newValue);
        return;
      case SvgPathPackage.CURVETO_ARGUMENT__C2:
        setC2((coordinate_pair)newValue);
        return;
      case SvgPathPackage.CURVETO_ARGUMENT__C3:
        setC3((coordinate_pair)newValue);
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
      case SvgPathPackage.CURVETO_ARGUMENT__C1:
        setC1((coordinate_pair)null);
        return;
      case SvgPathPackage.CURVETO_ARGUMENT__C2:
        setC2((coordinate_pair)null);
        return;
      case SvgPathPackage.CURVETO_ARGUMENT__C3:
        setC3((coordinate_pair)null);
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
      case SvgPathPackage.CURVETO_ARGUMENT__C1:
        return c1 != null;
      case SvgPathPackage.CURVETO_ARGUMENT__C2:
        return c2 != null;
      case SvgPathPackage.CURVETO_ARGUMENT__C3:
        return c3 != null;
    }
    return super.eIsSet(featureID);
  }

} //curveto_argumentImpl
