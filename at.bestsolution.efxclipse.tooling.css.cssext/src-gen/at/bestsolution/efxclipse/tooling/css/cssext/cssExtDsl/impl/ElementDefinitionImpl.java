/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getPseudoClasses <em>Pseudo Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDefinitionImpl extends MinimalEObjectImpl.Container implements ElementDefinition
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
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected EList<ElementDefinition> super_;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<PropertyDefinition> properties;

  /**
   * The cached value of the '{@link #getPseudoClasses() <em>Pseudo Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoClasses()
   * @generated
   * @ordered
   */
  protected EList<PseudoClassDefinition> pseudoClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementDefinitionImpl()
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
    return CssExtDslPackage.Literals.ELEMENT_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__DOKU, oldDoku, newDoku);
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
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.ELEMENT_DEFINITION__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.ELEMENT_DEFINITION__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__DOKU, newDoku, newDoku));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementDefinition> getSuper()
  {
    if (super_ == null)
    {
      super_ = new EObjectResolvingEList<ElementDefinition>(ElementDefinition.class, this, CssExtDslPackage.ELEMENT_DEFINITION__SUPER);
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyDefinition> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<PropertyDefinition>(PropertyDefinition.class, this, CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PseudoClassDefinition> getPseudoClasses()
  {
    if (pseudoClasses == null)
    {
      pseudoClasses = new EObjectContainmentEList<PseudoClassDefinition>(PseudoClassDefinition.class, this, CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES);
    }
    return pseudoClasses;
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        return ((InternalEList<?>)getPseudoClasses()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        return getDoku();
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        return getName();
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        return getSuper();
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        return getProperties();
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        return getPseudoClasses();
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        getSuper().clear();
        getSuper().addAll((Collection<? extends ElementDefinition>)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends PropertyDefinition>)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        getPseudoClasses().clear();
        getPseudoClasses().addAll((Collection<? extends PseudoClassDefinition>)newValue);
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        getSuper().clear();
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        getProperties().clear();
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        getPseudoClasses().clear();
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        return doku != null;
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        return super_ != null && !super_.isEmpty();
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        return pseudoClasses != null && !pseudoClasses.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ElementDefinitionImpl
