/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage;

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

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl#isReflective <em>Reflective</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanImpl extends MinimalEObjectImpl.Container implements Bean
{
  /**
   * The default value of the '{@link #isReflective() <em>Reflective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReflective()
   * @generated
   * @ordered
   */
  protected static final boolean REFLECTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReflective() <em>Reflective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReflective()
   * @generated
   * @ordered
   */
  protected boolean reflective = REFLECTIVE_EDEFAULT;

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
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference superType;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<BeanPropertyDecl> properties;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<BeanAttributeDecl> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeanImpl()
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
    return FXBeanPackage.Literals.BEAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReflective()
  {
    return reflective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReflective(boolean newReflective)
  {
    boolean oldReflective = reflective;
    reflective = newReflective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN__REFLECTIVE, oldReflective, reflective));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(JvmParameterizedTypeReference newSuperType, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN__SUPER_TYPE, oldSuperType, newSuperType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(JvmParameterizedTypeReference newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.BEAN__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXBeanPackage.BEAN__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXBeanPackage.BEAN__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BeanPropertyDecl> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<BeanPropertyDecl>(BeanPropertyDecl.class, this, FXBeanPackage.BEAN__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BeanAttributeDecl> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<BeanAttributeDecl>(BeanAttributeDecl.class, this, FXBeanPackage.BEAN__ATTRIBUTES);
    }
    return attributes;
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
      case FXBeanPackage.BEAN__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case FXBeanPackage.BEAN__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case FXBeanPackage.BEAN__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case FXBeanPackage.BEAN__REFLECTIVE:
        return isReflective();
      case FXBeanPackage.BEAN__NAME:
        return getName();
      case FXBeanPackage.BEAN__SUPER_TYPE:
        return getSuperType();
      case FXBeanPackage.BEAN__PROPERTIES:
        return getProperties();
      case FXBeanPackage.BEAN__ATTRIBUTES:
        return getAttributes();
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
      case FXBeanPackage.BEAN__REFLECTIVE:
        setReflective((Boolean)newValue);
        return;
      case FXBeanPackage.BEAN__NAME:
        setName((String)newValue);
        return;
      case FXBeanPackage.BEAN__SUPER_TYPE:
        setSuperType((JvmParameterizedTypeReference)newValue);
        return;
      case FXBeanPackage.BEAN__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends BeanPropertyDecl>)newValue);
        return;
      case FXBeanPackage.BEAN__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends BeanAttributeDecl>)newValue);
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
      case FXBeanPackage.BEAN__REFLECTIVE:
        setReflective(REFLECTIVE_EDEFAULT);
        return;
      case FXBeanPackage.BEAN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FXBeanPackage.BEAN__SUPER_TYPE:
        setSuperType((JvmParameterizedTypeReference)null);
        return;
      case FXBeanPackage.BEAN__PROPERTIES:
        getProperties().clear();
        return;
      case FXBeanPackage.BEAN__ATTRIBUTES:
        getAttributes().clear();
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
      case FXBeanPackage.BEAN__REFLECTIVE:
        return reflective != REFLECTIVE_EDEFAULT;
      case FXBeanPackage.BEAN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FXBeanPackage.BEAN__SUPER_TYPE:
        return superType != null;
      case FXBeanPackage.BEAN__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case FXBeanPackage.BEAN__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
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
    result.append(" (reflective: ");
    result.append(reflective);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BeanImpl
