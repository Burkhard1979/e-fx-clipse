/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>external declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl#getF <em>F</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl#getD <em>D</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl#getG <em>G</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class external_declarationImpl extends MinimalEObjectImpl.Container implements external_declaration
{
  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected function_definition f;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected declaration d;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected glue_block g;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected external_declarationImpl()
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
    return DecoraDslPackage.Literals.EXTERNAL_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_definition getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(function_definition newF, NotificationChain msgs)
  {
    function_definition oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.EXTERNAL_DECLARATION__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(function_definition newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.EXTERNAL_DECLARATION__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.EXTERNAL_DECLARATION__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.EXTERNAL_DECLARATION__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(declaration newD, NotificationChain msgs)
  {
    declaration oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.EXTERNAL_DECLARATION__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(declaration newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.EXTERNAL_DECLARATION__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.EXTERNAL_DECLARATION__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.EXTERNAL_DECLARATION__D, newD, newD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public glue_block getG()
  {
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetG(glue_block newG, NotificationChain msgs)
  {
    glue_block oldG = g;
    g = newG;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.EXTERNAL_DECLARATION__G, oldG, newG);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setG(glue_block newG)
  {
    if (newG != g)
    {
      NotificationChain msgs = null;
      if (g != null)
        msgs = ((InternalEObject)g).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.EXTERNAL_DECLARATION__G, null, msgs);
      if (newG != null)
        msgs = ((InternalEObject)newG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.EXTERNAL_DECLARATION__G, null, msgs);
      msgs = basicSetG(newG, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.EXTERNAL_DECLARATION__G, newG, newG));
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
      case DecoraDslPackage.EXTERNAL_DECLARATION__F:
        return basicSetF(null, msgs);
      case DecoraDslPackage.EXTERNAL_DECLARATION__D:
        return basicSetD(null, msgs);
      case DecoraDslPackage.EXTERNAL_DECLARATION__G:
        return basicSetG(null, msgs);
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
      case DecoraDslPackage.EXTERNAL_DECLARATION__F:
        return getF();
      case DecoraDslPackage.EXTERNAL_DECLARATION__D:
        return getD();
      case DecoraDslPackage.EXTERNAL_DECLARATION__G:
        return getG();
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
      case DecoraDslPackage.EXTERNAL_DECLARATION__F:
        setF((function_definition)newValue);
        return;
      case DecoraDslPackage.EXTERNAL_DECLARATION__D:
        setD((declaration)newValue);
        return;
      case DecoraDslPackage.EXTERNAL_DECLARATION__G:
        setG((glue_block)newValue);
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
      case DecoraDslPackage.EXTERNAL_DECLARATION__F:
        setF((function_definition)null);
        return;
      case DecoraDslPackage.EXTERNAL_DECLARATION__D:
        setD((declaration)null);
        return;
      case DecoraDslPackage.EXTERNAL_DECLARATION__G:
        setG((glue_block)null);
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
      case DecoraDslPackage.EXTERNAL_DECLARATION__F:
        return f != null;
      case DecoraDslPackage.EXTERNAL_DECLARATION__D:
        return d != null;
      case DecoraDslPackage.EXTERNAL_DECLARATION__G:
        return g != null;
    }
    return super.eIsSet(featureID);
  }

} //external_declarationImpl
