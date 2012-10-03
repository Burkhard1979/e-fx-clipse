/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.UniversalSelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universal Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.UniversalSelectorImpl#getNamespece <em>Namespece</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniversalSelectorImpl extends CssSelectorImpl implements UniversalSelector
{
  /**
   * The default value of the '{@link #getNamespece() <em>Namespece</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespece()
   * @generated
   * @ordered
   */
  protected static final String NAMESPECE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespece() <em>Namespece</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespece()
   * @generated
   * @ordered
   */
  protected String namespece = NAMESPECE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UniversalSelectorImpl()
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
    return CssDslPackage.Literals.UNIVERSAL_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespece()
  {
    return namespece;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespece(String newNamespece)
  {
    String oldNamespece = namespece;
    namespece = newNamespece;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.UNIVERSAL_SELECTOR__NAMESPECE, oldNamespece, namespece));
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
      case CssDslPackage.UNIVERSAL_SELECTOR__NAMESPECE:
        return getNamespece();
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
      case CssDslPackage.UNIVERSAL_SELECTOR__NAMESPECE:
        setNamespece((String)newValue);
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
      case CssDslPackage.UNIVERSAL_SELECTOR__NAMESPECE:
        setNamespece(NAMESPECE_EDEFAULT);
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
      case CssDslPackage.UNIVERSAL_SELECTOR__NAMESPECE:
        return NAMESPECE_EDEFAULT == null ? namespece != null : !NAMESPECE_EDEFAULT.equals(namespece);
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
    result.append(" (namespece: ");
    result.append(namespece);
    result.append(')');
    return result.toString();
  }

} //UniversalSelectorImpl
