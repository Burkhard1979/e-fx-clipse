/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.TypeDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Property Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanPropertyDeclImpl extends MinimalEObjectImpl.Container implements BeanPropertyDecl
{
  /**
   * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonly()
   * @generated
   * @ordered
   */
  protected static final boolean READONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonly()
   * @generated
   * @ordered
   */
  protected boolean readonly = READONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLazy()
   * @generated
   * @ordered
   */
  protected static final boolean LAZY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLazy()
   * @generated
   * @ordered
   */
  protected boolean lazy = LAZY_EDEFAULT;

  /**
   * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected static final boolean REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected boolean reference = REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeDef type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeanPropertyDeclImpl()
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
    return FXBeanPackage.Literals.BEAN_PROPERTY_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadonly()
  {
    return readonly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadonly(boolean newReadonly)
  {
    boolean oldReadonly = readonly;
    readonly = newReadonly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN_PROPERTY_DECL__READONLY, oldReadonly, readonly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLazy()
  {
    return lazy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLazy(boolean newLazy)
  {
    boolean oldLazy = lazy;
    lazy = newLazy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN_PROPERTY_DECL__LAZY, oldLazy, lazy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(boolean newReference)
  {
    boolean oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN_PROPERTY_DECL__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeDef newType, NotificationChain msgs)
  {
    TypeDef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN_PROPERTY_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeDef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.BEAN_PROPERTY_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.BEAN_PROPERTY_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN_PROPERTY_DECL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN_PROPERTY_DECL__NAME, oldName, name));
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
      case FXBeanPackage.BEAN_PROPERTY_DECL__TYPE:
        return basicSetType(null, msgs);
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
      case FXBeanPackage.BEAN_PROPERTY_DECL__READONLY:
        return isReadonly();
      case FXBeanPackage.BEAN_PROPERTY_DECL__LAZY:
        return isLazy();
      case FXBeanPackage.BEAN_PROPERTY_DECL__REFERENCE:
        return isReference();
      case FXBeanPackage.BEAN_PROPERTY_DECL__TYPE:
        return getType();
      case FXBeanPackage.BEAN_PROPERTY_DECL__NAME:
        return getName();
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
      case FXBeanPackage.BEAN_PROPERTY_DECL__READONLY:
        setReadonly((Boolean)newValue);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__LAZY:
        setLazy((Boolean)newValue);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__REFERENCE:
        setReference((Boolean)newValue);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__TYPE:
        setType((TypeDef)newValue);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__NAME:
        setName((String)newValue);
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
      case FXBeanPackage.BEAN_PROPERTY_DECL__READONLY:
        setReadonly(READONLY_EDEFAULT);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__LAZY:
        setLazy(LAZY_EDEFAULT);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__TYPE:
        setType((TypeDef)null);
        return;
      case FXBeanPackage.BEAN_PROPERTY_DECL__NAME:
        setName(NAME_EDEFAULT);
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
      case FXBeanPackage.BEAN_PROPERTY_DECL__READONLY:
        return readonly != READONLY_EDEFAULT;
      case FXBeanPackage.BEAN_PROPERTY_DECL__LAZY:
        return lazy != LAZY_EDEFAULT;
      case FXBeanPackage.BEAN_PROPERTY_DECL__REFERENCE:
        return reference != REFERENCE_EDEFAULT;
      case FXBeanPackage.BEAN_PROPERTY_DECL__TYPE:
        return type != null;
      case FXBeanPackage.BEAN_PROPERTY_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (readonly: ");
    result.append(readonly);
    result.append(", lazy: ");
    result.append(lazy);
    result.append(", reference: ");
    result.append(reference);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BeanPropertyDeclImpl
