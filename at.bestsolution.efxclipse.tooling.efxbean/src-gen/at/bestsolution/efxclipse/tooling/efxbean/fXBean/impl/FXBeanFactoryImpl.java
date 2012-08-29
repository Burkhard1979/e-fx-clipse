/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FXBeanFactoryImpl extends EFactoryImpl implements FXBeanFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FXBeanFactory init()
  {
    try
    {
      FXBeanFactory theFXBeanFactory = (FXBeanFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/efxbean/FXBean"); 
      if (theFXBeanFactory != null)
      {
        return theFXBeanFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FXBeanFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXBeanFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FXBeanPackage.FX_BEAN_UNIT: return createFXBeanUnit();
      case FXBeanPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case FXBeanPackage.IMPORT: return createImport();
      case FXBeanPackage.BEAN: return createBean();
      case FXBeanPackage.BEAN_PROPERTY_DECL: return createBeanPropertyDecl();
      case FXBeanPackage.BEAN_ATTRIBUTE_DECL: return createBeanAttributeDecl();
      case FXBeanPackage.TYPE_DEF: return createTypeDef();
      case FXBeanPackage.VALUE_LIST_TYPE_DEF: return createValueListTypeDef();
      case FXBeanPackage.MAP_TYPE_DEF: return createMapTypeDef();
      case FXBeanPackage.MULTIPLICITY: return createMultiplicity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXBeanUnit createFXBeanUnit()
  {
    FXBeanUnitImpl fxBeanUnit = new FXBeanUnitImpl();
    return fxBeanUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bean createBean()
  {
    BeanImpl bean = new BeanImpl();
    return bean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeanPropertyDecl createBeanPropertyDecl()
  {
    BeanPropertyDeclImpl beanPropertyDecl = new BeanPropertyDeclImpl();
    return beanPropertyDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeanAttributeDecl createBeanAttributeDecl()
  {
    BeanAttributeDeclImpl beanAttributeDecl = new BeanAttributeDeclImpl();
    return beanAttributeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueListTypeDef createValueListTypeDef()
  {
    ValueListTypeDefImpl valueListTypeDef = new ValueListTypeDefImpl();
    return valueListTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapTypeDef createMapTypeDef()
  {
    MapTypeDefImpl mapTypeDef = new MapTypeDefImpl();
    return mapTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXBeanPackage getFXBeanPackage()
  {
    return (FXBeanPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FXBeanPackage getPackage()
  {
    return FXBeanPackage.eINSTANCE;
  }

} //FXBeanFactoryImpl
