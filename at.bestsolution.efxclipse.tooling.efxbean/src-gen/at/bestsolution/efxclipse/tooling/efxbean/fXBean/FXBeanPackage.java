/**
 */
package at.bestsolution.efxclipse.tooling.efxbean.fXBean;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanFactory
 * @model kind="package"
 * @generated
 */
public interface FXBeanPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fXBean";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/efxbean/FXBean";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fXBean";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXBeanPackage eINSTANCE = at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanUnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanUnitImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getFXBeanUnit()
   * @generated
   */
  int FX_BEAN_UNIT = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BEAN_UNIT__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BEAN_UNIT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Bean</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BEAN_UNIT__BEAN = 2;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BEAN_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.PackageDeclarationImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ImportImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl <em>Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getBean()
   * @generated
   */
  int BEAN = 3;

  /**
   * The feature id for the '<em><b>Reflective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__REFLECTIVE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__NAME = 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__SUPER_TYPE = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl <em>Bean Property Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getBeanPropertyDecl()
   * @generated
   */
  int BEAN_PROPERTY_DECL = 4;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_DECL__READONLY = 0;

  /**
   * The feature id for the '<em><b>Lazy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_DECL__LAZY = 1;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_DECL__REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_DECL__TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_DECL__NAME = 4;

  /**
   * The number of structural features of the '<em>Bean Property Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_DECL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanAttributeDeclImpl <em>Bean Attribute Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanAttributeDeclImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getBeanAttributeDecl()
   * @generated
   */
  int BEAN_ATTRIBUTE_DECL = 5;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_ATTRIBUTE_DECL__READONLY = 0;

  /**
   * The feature id for the '<em><b>Lazy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_ATTRIBUTE_DECL__LAZY = 1;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_ATTRIBUTE_DECL__REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_ATTRIBUTE_DECL__TYPE = 3;

  /**
   * The number of structural features of the '<em>Bean Attribute Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_ATTRIBUTE_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.TypeDefImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 6;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ValueListTypeDefImpl <em>Value List Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ValueListTypeDefImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getValueListTypeDef()
   * @generated
   */
  int VALUE_LIST_TYPE_DEF = 7;

  /**
   * The feature id for the '<em><b>Single Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_TYPE_DEF__SINGLE_TYPE = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_TYPE_DEF__MULTI = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value List Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MapTypeDefImpl <em>Map Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MapTypeDefImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getMapTypeDef()
   * @generated
   */
  int MAP_TYPE_DEF = 8;

  /**
   * The feature id for the '<em><b>Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_DEF__KEY_TYPE = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_DEF__VALUE_TYPE = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Map Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 9;

  /**
   * The feature id for the '<em><b>Total Unbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__TOTAL_UNBOUND = 0;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__LOWER_BOUND = 1;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__UPPER_BOUND = 2;

  /**
   * The feature id for the '<em><b>No Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__NO_UPPER_BOUND = 3;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit
   * @generated
   */
  EClass getFXBeanUnit();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getPackage()
   * @see #getFXBeanUnit()
   * @generated
   */
  EReference getFXBeanUnit_Package();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getImports()
   * @see #getFXBeanUnit()
   * @generated
   */
  EReference getFXBeanUnit_Imports();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getBean <em>Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bean</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit#getBean()
   * @see #getFXBeanUnit()
   * @generated
   */
  EReference getFXBeanUnit_Bean();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean <em>Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean
   * @generated
   */
  EClass getBean();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#isReflective <em>Reflective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reflective</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#isReflective()
   * @see #getBean()
   * @generated
   */
  EAttribute getBean_Reflective();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getName()
   * @see #getBean()
   * @generated
   */
  EAttribute getBean_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getSuperType()
   * @see #getBean()
   * @generated
   */
  EReference getBean_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getProperties()
   * @see #getBean()
   * @generated
   */
  EReference getBean_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean#getAttributes()
   * @see #getBean()
   * @generated
   */
  EReference getBean_Attributes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl <em>Bean Property Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean Property Decl</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl
   * @generated
   */
  EClass getBeanPropertyDecl();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReadonly()
   * @see #getBeanPropertyDecl()
   * @generated
   */
  EAttribute getBeanPropertyDecl_Readonly();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isLazy <em>Lazy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lazy</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isLazy()
   * @see #getBeanPropertyDecl()
   * @generated
   */
  EAttribute getBeanPropertyDecl_Lazy();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#isReference()
   * @see #getBeanPropertyDecl()
   * @generated
   */
  EAttribute getBeanPropertyDecl_Reference();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getType()
   * @see #getBeanPropertyDecl()
   * @generated
   */
  EReference getBeanPropertyDecl_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl#getName()
   * @see #getBeanPropertyDecl()
   * @generated
   */
  EAttribute getBeanPropertyDecl_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl <em>Bean Attribute Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean Attribute Decl</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl
   * @generated
   */
  EClass getBeanAttributeDecl();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReadonly()
   * @see #getBeanAttributeDecl()
   * @generated
   */
  EAttribute getBeanAttributeDecl_Readonly();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isLazy <em>Lazy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lazy</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isLazy()
   * @see #getBeanAttributeDecl()
   * @generated
   */
  EAttribute getBeanAttributeDecl_Lazy();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#isReference()
   * @see #getBeanAttributeDecl()
   * @generated
   */
  EAttribute getBeanAttributeDecl_Reference();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanAttributeDecl#getType()
   * @see #getBeanAttributeDecl()
   * @generated
   */
  EReference getBeanAttributeDecl_Type();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef <em>Value List Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value List Type Def</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef
   * @generated
   */
  EClass getValueListTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getSingleType <em>Single Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getSingleType()
   * @see #getValueListTypeDef()
   * @generated
   */
  EReference getValueListTypeDef_SingleType();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multi</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef#getMulti()
   * @see #getValueListTypeDef()
   * @generated
   */
  EReference getValueListTypeDef_Multi();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef <em>Map Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Type Def</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef
   * @generated
   */
  EClass getMapTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getKeyType <em>Key Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getKeyType()
   * @see #getMapTypeDef()
   * @generated
   */
  EReference getMapTypeDef_KeyType();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef#getValueType()
   * @see #getMapTypeDef()
   * @generated
   */
  EReference getMapTypeDef_ValueType();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getTotalUnbound <em>Total Unbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Total Unbound</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getTotalUnbound()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_TotalUnbound();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getLowerBound()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#getUpperBound()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#isNoUpperBound <em>No Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Upper Bound</em>'.
   * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity#isNoUpperBound()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_NoUpperBound();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FXBeanFactory getFXBeanFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanUnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanUnitImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getFXBeanUnit()
     * @generated
     */
    EClass FX_BEAN_UNIT = eINSTANCE.getFXBeanUnit();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_BEAN_UNIT__PACKAGE = eINSTANCE.getFXBeanUnit_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_BEAN_UNIT__IMPORTS = eINSTANCE.getFXBeanUnit_Imports();

    /**
     * The meta object literal for the '<em><b>Bean</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_BEAN_UNIT__BEAN = eINSTANCE.getFXBeanUnit_Bean();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.PackageDeclarationImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ImportImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl <em>Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getBean()
     * @generated
     */
    EClass BEAN = eINSTANCE.getBean();

    /**
     * The meta object literal for the '<em><b>Reflective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN__REFLECTIVE = eINSTANCE.getBean_Reflective();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN__NAME = eINSTANCE.getBean_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN__SUPER_TYPE = eINSTANCE.getBean_SuperType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN__PROPERTIES = eINSTANCE.getBean_Properties();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN__ATTRIBUTES = eINSTANCE.getBean_Attributes();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl <em>Bean Property Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanPropertyDeclImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getBeanPropertyDecl()
     * @generated
     */
    EClass BEAN_PROPERTY_DECL = eINSTANCE.getBeanPropertyDecl();

    /**
     * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_PROPERTY_DECL__READONLY = eINSTANCE.getBeanPropertyDecl_Readonly();

    /**
     * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_PROPERTY_DECL__LAZY = eINSTANCE.getBeanPropertyDecl_Lazy();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_PROPERTY_DECL__REFERENCE = eINSTANCE.getBeanPropertyDecl_Reference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN_PROPERTY_DECL__TYPE = eINSTANCE.getBeanPropertyDecl_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_PROPERTY_DECL__NAME = eINSTANCE.getBeanPropertyDecl_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanAttributeDeclImpl <em>Bean Attribute Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.BeanAttributeDeclImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getBeanAttributeDecl()
     * @generated
     */
    EClass BEAN_ATTRIBUTE_DECL = eINSTANCE.getBeanAttributeDecl();

    /**
     * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_ATTRIBUTE_DECL__READONLY = eINSTANCE.getBeanAttributeDecl_Readonly();

    /**
     * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_ATTRIBUTE_DECL__LAZY = eINSTANCE.getBeanAttributeDecl_Lazy();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_ATTRIBUTE_DECL__REFERENCE = eINSTANCE.getBeanAttributeDecl_Reference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN_ATTRIBUTE_DECL__TYPE = eINSTANCE.getBeanAttributeDecl_Type();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.TypeDefImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ValueListTypeDefImpl <em>Value List Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.ValueListTypeDefImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getValueListTypeDef()
     * @generated
     */
    EClass VALUE_LIST_TYPE_DEF = eINSTANCE.getValueListTypeDef();

    /**
     * The meta object literal for the '<em><b>Single Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_LIST_TYPE_DEF__SINGLE_TYPE = eINSTANCE.getValueListTypeDef_SingleType();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_LIST_TYPE_DEF__MULTI = eINSTANCE.getValueListTypeDef_Multi();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MapTypeDefImpl <em>Map Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MapTypeDefImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getMapTypeDef()
     * @generated
     */
    EClass MAP_TYPE_DEF = eINSTANCE.getMapTypeDef();

    /**
     * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE_DEF__KEY_TYPE = eINSTANCE.getMapTypeDef_KeyType();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE_DEF__VALUE_TYPE = eINSTANCE.getMapTypeDef_ValueType();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.MultiplicityImpl
     * @see at.bestsolution.efxclipse.tooling.efxbean.fXBean.impl.FXBeanPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Total Unbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__TOTAL_UNBOUND = eINSTANCE.getMultiplicity_TotalUnbound();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__LOWER_BOUND = eINSTANCE.getMultiplicity_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__UPPER_BOUND = eINSTANCE.getMultiplicity_UpperBound();

    /**
     * The meta object literal for the '<em><b>No Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__NO_UPPER_BOUND = eINSTANCE.getMultiplicity_NoUpperBound();

  }

} //FXBeanPackage
