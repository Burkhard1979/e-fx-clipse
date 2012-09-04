/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanFactory;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Import;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.PackageDeclaration;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.TypeDef;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FXBeanPackageImpl extends EPackageImpl implements FXBeanPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fxBeanUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanPropertyDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanAttributeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueListTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicityEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FXBeanPackageImpl()
  {
    super(eNS_URI, FXBeanFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FXBeanPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FXBeanPackage init()
  {
    if (isInited) return (FXBeanPackage)EPackage.Registry.INSTANCE.getEPackage(FXBeanPackage.eNS_URI);

    // Obtain or create and register package
    FXBeanPackageImpl theFXBeanPackage = (FXBeanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FXBeanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FXBeanPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFXBeanPackage.createPackageContents();

    // Initialize created meta-data
    theFXBeanPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFXBeanPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FXBeanPackage.eNS_URI, theFXBeanPackage);
    return theFXBeanPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFXBeanUnit()
  {
    return fxBeanUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFXBeanUnit_Package()
  {
    return (EReference)fxBeanUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFXBeanUnit_Imports()
  {
    return (EReference)fxBeanUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFXBeanUnit_Bean()
  {
    return (EReference)fxBeanUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBean()
  {
    return beanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBean_Reflective()
  {
    return (EAttribute)beanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBean_Name()
  {
    return (EAttribute)beanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBean_SuperType()
  {
    return (EReference)beanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBean_Properties()
  {
    return (EReference)beanEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBean_Attributes()
  {
    return (EReference)beanEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeanPropertyDecl()
  {
    return beanPropertyDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanPropertyDecl_Readonly()
  {
    return (EAttribute)beanPropertyDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanPropertyDecl_Lazy()
  {
    return (EAttribute)beanPropertyDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanPropertyDecl_Reference()
  {
    return (EAttribute)beanPropertyDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeanPropertyDecl_Type()
  {
    return (EReference)beanPropertyDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanPropertyDecl_Name()
  {
    return (EAttribute)beanPropertyDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeanAttributeDecl()
  {
    return beanAttributeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanAttributeDecl_Readonly()
  {
    return (EAttribute)beanAttributeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanAttributeDecl_Lazy()
  {
    return (EAttribute)beanAttributeDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanAttributeDecl_Reference()
  {
    return (EAttribute)beanAttributeDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeanAttributeDecl_Type()
  {
    return (EReference)beanAttributeDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueListTypeDef()
  {
    return valueListTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueListTypeDef_SingleType()
  {
    return (EReference)valueListTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueListTypeDef_Multi()
  {
    return (EReference)valueListTypeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapTypeDef()
  {
    return mapTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapTypeDef_KeyType()
  {
    return (EReference)mapTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapTypeDef_ValueType()
  {
    return (EReference)mapTypeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicity()
  {
    return multiplicityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_TotalUnbound()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_LowerBound()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_UpperBound()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_NoUpperBound()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXBeanFactory getFXBeanFactory()
  {
    return (FXBeanFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fxBeanUnitEClass = createEClass(FX_BEAN_UNIT);
    createEReference(fxBeanUnitEClass, FX_BEAN_UNIT__PACKAGE);
    createEReference(fxBeanUnitEClass, FX_BEAN_UNIT__IMPORTS);
    createEReference(fxBeanUnitEClass, FX_BEAN_UNIT__BEAN);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    beanEClass = createEClass(BEAN);
    createEAttribute(beanEClass, BEAN__REFLECTIVE);
    createEAttribute(beanEClass, BEAN__NAME);
    createEReference(beanEClass, BEAN__SUPER_TYPE);
    createEReference(beanEClass, BEAN__PROPERTIES);
    createEReference(beanEClass, BEAN__ATTRIBUTES);

    beanPropertyDeclEClass = createEClass(BEAN_PROPERTY_DECL);
    createEAttribute(beanPropertyDeclEClass, BEAN_PROPERTY_DECL__READONLY);
    createEAttribute(beanPropertyDeclEClass, BEAN_PROPERTY_DECL__LAZY);
    createEAttribute(beanPropertyDeclEClass, BEAN_PROPERTY_DECL__REFERENCE);
    createEReference(beanPropertyDeclEClass, BEAN_PROPERTY_DECL__TYPE);
    createEAttribute(beanPropertyDeclEClass, BEAN_PROPERTY_DECL__NAME);

    beanAttributeDeclEClass = createEClass(BEAN_ATTRIBUTE_DECL);
    createEAttribute(beanAttributeDeclEClass, BEAN_ATTRIBUTE_DECL__READONLY);
    createEAttribute(beanAttributeDeclEClass, BEAN_ATTRIBUTE_DECL__LAZY);
    createEAttribute(beanAttributeDeclEClass, BEAN_ATTRIBUTE_DECL__REFERENCE);
    createEReference(beanAttributeDeclEClass, BEAN_ATTRIBUTE_DECL__TYPE);

    typeDefEClass = createEClass(TYPE_DEF);

    valueListTypeDefEClass = createEClass(VALUE_LIST_TYPE_DEF);
    createEReference(valueListTypeDefEClass, VALUE_LIST_TYPE_DEF__SINGLE_TYPE);
    createEReference(valueListTypeDefEClass, VALUE_LIST_TYPE_DEF__MULTI);

    mapTypeDefEClass = createEClass(MAP_TYPE_DEF);
    createEReference(mapTypeDefEClass, MAP_TYPE_DEF__KEY_TYPE);
    createEReference(mapTypeDefEClass, MAP_TYPE_DEF__VALUE_TYPE);

    multiplicityEClass = createEClass(MULTIPLICITY);
    createEAttribute(multiplicityEClass, MULTIPLICITY__TOTAL_UNBOUND);
    createEAttribute(multiplicityEClass, MULTIPLICITY__LOWER_BOUND);
    createEAttribute(multiplicityEClass, MULTIPLICITY__UPPER_BOUND);
    createEAttribute(multiplicityEClass, MULTIPLICITY__NO_UPPER_BOUND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    valueListTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    mapTypeDefEClass.getESuperTypes().add(this.getTypeDef());

    // Initialize classes and features; add operations and parameters
    initEClass(fxBeanUnitEClass, FXBeanUnit.class, "FXBeanUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFXBeanUnit_Package(), this.getPackageDeclaration(), null, "package", null, 0, 1, FXBeanUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFXBeanUnit_Imports(), this.getImport(), null, "imports", null, 0, -1, FXBeanUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFXBeanUnit_Bean(), this.getBean(), null, "bean", null, 0, 1, FXBeanUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beanEClass, Bean.class, "Bean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBean_Reflective(), ecorePackage.getEBoolean(), "reflective", null, 0, 1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBean_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBean_SuperType(), theTypesPackage.getJvmParameterizedTypeReference(), null, "superType", null, 0, 1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBean_Properties(), this.getBeanPropertyDecl(), null, "properties", null, 0, -1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBean_Attributes(), this.getBeanAttributeDecl(), null, "attributes", null, 0, -1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beanPropertyDeclEClass, BeanPropertyDecl.class, "BeanPropertyDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeanPropertyDecl_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, BeanPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanPropertyDecl_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, BeanPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanPropertyDecl_Reference(), ecorePackage.getEBoolean(), "reference", null, 0, 1, BeanPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeanPropertyDecl_Type(), this.getTypeDef(), null, "type", null, 0, 1, BeanPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanPropertyDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, BeanPropertyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beanAttributeDeclEClass, BeanAttributeDecl.class, "BeanAttributeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeanAttributeDecl_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, BeanAttributeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanAttributeDecl_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, BeanAttributeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanAttributeDecl_Reference(), ecorePackage.getEBoolean(), "reference", null, 0, 1, BeanAttributeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeanAttributeDecl_Type(), this.getTypeDef(), null, "type", null, 0, 1, BeanAttributeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueListTypeDefEClass, ValueListTypeDef.class, "ValueListTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueListTypeDef_SingleType(), theTypesPackage.getJvmTypeReference(), null, "singleType", null, 0, 1, ValueListTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueListTypeDef_Multi(), this.getMultiplicity(), null, "multi", null, 0, 1, ValueListTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapTypeDefEClass, MapTypeDef.class, "MapTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapTypeDef_KeyType(), theTypesPackage.getJvmTypeReference(), null, "keyType", null, 0, 1, MapTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapTypeDef_ValueType(), theTypesPackage.getJvmTypeReference(), null, "valueType", null, 0, 1, MapTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicity_TotalUnbound(), ecorePackage.getEString(), "totalUnbound", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicity_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicity_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicity_NoUpperBound(), ecorePackage.getEBoolean(), "noUpperBound", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FXBeanPackageImpl
