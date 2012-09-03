/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;

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
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslFactory
 * @model kind="package"
 * @generated
 */
public interface CssExtDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cssExtDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/css/cssext/CssExtDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cssExtDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssExtDslPackage eINSTANCE = at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl <em>Css Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCssExtension()
   * @generated
   */
  int CSS_EXTENSION = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_EXTENSION__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Package Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_EXTENSION__PACKAGE_DEF = 1;

  /**
   * The number of structural features of the '<em>Css Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_EXTENSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

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
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDefinitionImpl <em>Package Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPackageDefinition()
   * @generated
   */
  int PACKAGE_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__RULES = 1;

  /**
   * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__SUBPACKAGES = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Package Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.DokuImpl <em>Doku</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.DokuImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getDoku()
   * @generated
   */
  int DOKU = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOKU__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Doku</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOKU_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleImpl <em>CSS Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRule()
   * @generated
   */
  int CSS_RULE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE__TYPE = 0;

  /**
   * The number of structural features of the '<em>CSS Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getElementDefinition()
   * @generated
   */
  int ELEMENT_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Doku</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__DOKU = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__SUPER = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Pseudo Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__PSEUDO_CLASSES = 4;

  /**
   * The number of structural features of the '<em>Element Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PropertyDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Doku</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__DOKU = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__RULE = 2;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__DEFAULT = 3;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PseudoClassDefinitionImpl <em>Pseudo Class Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PseudoClassDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPseudoClassDefinition()
   * @generated
   */
  int PSEUDO_CLASS_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Doku</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_DEFINITION__DOKU = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_DEFINITION__NAME = 1;

  /**
   * The number of structural features of the '<em>Pseudo Class Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl <em>CSS Rule Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleId()
   * @generated
   */
  int CSS_RULE_ID = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>CSS Rule Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl <em>CSS Rule Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleRef()
   * @generated
   */
  int CSS_RULE_REF = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REF__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REF__REF = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REF_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl <em>CSS Rule Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleDefinition()
   * @generated
   */
  int CSS_RULE_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Doku</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_DEFINITION__DOKU = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_DEFINITION__RULE = 2;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_DEFINITION__FUNC = 3;

  /**
   * The number of structural features of the '<em>CSS Rule Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl <em>CSS Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSDefaultValue()
   * @generated
   */
  int CSS_DEFAULT_VALUE = 11;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DEFAULT_VALUE__VAL = 0;

  /**
   * The feature id for the '<em><b>Ival</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DEFAULT_VALUE__IVAL = 1;

  /**
   * The feature id for the '<em><b>Dval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DEFAULT_VALUE__DVAL = 2;

  /**
   * The feature id for the '<em><b>Sval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DEFAULT_VALUE__SVAL = 3;

  /**
   * The number of structural features of the '<em>CSS Default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DEFAULT_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedIntTypeImpl <em>CSS Ranged Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedIntTypeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRangedIntType()
   * @generated
   */
  int CSS_RANGED_INT_TYPE = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_INT_TYPE__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_INT_TYPE__FROM = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_INT_TYPE__TO = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CSS Ranged Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_INT_TYPE_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedDoubleTypeImpl <em>CSS Ranged Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedDoubleTypeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRangedDoubleType()
   * @generated
   */
  int CSS_RANGED_DOUBLE_TYPE = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_DOUBLE_TYPE__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_DOUBLE_TYPE__FROM = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_DOUBLE_TYPE__TO = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CSS Ranged Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RANGED_DOUBLE_TYPE_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleFuncImpl <em>CSS Rule Func</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleFuncImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleFunc()
   * @generated
   */
  int CSS_RULE_FUNC = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_FUNC__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_FUNC__NAME = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_FUNC__PARAMS = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CSS Rule Func</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_FUNC_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleOrImpl <em>CSS Rule Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleOrImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleOr()
   * @generated
   */
  int CSS_RULE_OR = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_OR__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Ors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_OR__ORS = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_OR_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorImpl <em>CSS Rule Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleXor()
   * @generated
   */
  int CSS_RULE_XOR = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_XOR__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Xors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_XOR__XORS = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_XOR_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl <em>CSS Rule Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleConcat()
   * @generated
   */
  int CSS_RULE_CONCAT = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_CONCAT__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Conc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_CONCAT__CONC = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_CONCAT_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixImpl <em>CSS Rule Postfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRulePostfix()
   * @generated
   */
  int CSS_RULE_POSTFIX = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_POSTFIX__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_POSTFIX__RULE = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_POSTFIX__CARDINALITY = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CSS Rule Postfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_POSTFIX_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketImpl <em>CSS Rule Bracket</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleBracket()
   * @generated
   */
  int CSS_RULE_BRACKET = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_BRACKET__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_BRACKET__INNER = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Bracket</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_BRACKET_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSNumLiteralImpl <em>CSS Num Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSNumLiteralImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSNumLiteral()
   * @generated
   */
  int CSS_NUM_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_NUM_LITERAL__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_NUM_LITERAL__VALUE = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Num Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_NUM_LITERAL_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRegexImpl <em>CSS Rule Regex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRegexImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleRegex()
   * @generated
   */
  int CSS_RULE_REGEX = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REGEX__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REGEX__REGEX = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Regex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REGEX_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleLiteralImpl <em>CSS Rule Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleLiteralImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleLiteral()
   * @generated
   */
  int CSS_RULE_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_LITERAL__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_LITERAL__VALUE = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_LITERAL_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSymbolImpl <em>CSS Rule Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSymbolImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleSymbol()
   * @generated
   */
  int CSS_RULE_SYMBOL = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_SYMBOL__TYPE = CSS_RULE__TYPE;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_SYMBOL__SYMBOL = CSS_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_SYMBOL_FEATURE_COUNT = CSS_RULE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension <em>Css Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Css Extension</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension
   * @generated
   */
  EClass getCssExtension();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getImports()
   * @see #getCssExtension()
   * @generated
   */
  EReference getCssExtension_Imports();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getPackageDef <em>Package Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package Def</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getPackageDef()
   * @see #getCssExtension()
   * @generated
   */
  EReference getCssExtension_PackageDef();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition
   * @generated
   */
  EClass getPackageDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getName()
   * @see #getPackageDefinition()
   * @generated
   */
  EAttribute getPackageDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getRules()
   * @see #getPackageDefinition()
   * @generated
   */
  EReference getPackageDefinition_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getSubpackages <em>Subpackages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subpackages</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getSubpackages()
   * @see #getPackageDefinition()
   * @generated
   */
  EReference getPackageDefinition_Subpackages();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition#getElements()
   * @see #getPackageDefinition()
   * @generated
   */
  EReference getPackageDefinition_Elements();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku <em>Doku</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doku</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku
   * @generated
   */
  EClass getDoku();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku#getContent()
   * @see #getDoku()
   * @generated
   */
  EAttribute getDoku_Content();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule <em>CSS Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule
   * @generated
   */
  EClass getCSSRule();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule#getType()
   * @see #getCSSRule()
   * @generated
   */
  EAttribute getCSSRule_Type();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition <em>Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition
   * @generated
   */
  EClass getElementDefinition();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getDoku <em>Doku</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doku</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getDoku()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_Doku();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getName()
   * @see #getElementDefinition()
   * @generated
   */
  EAttribute getElementDefinition_Name();

  /**
   * Returns the meta object for the reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getSuper()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_Super();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getProperties()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getPseudoClasses <em>Pseudo Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pseudo Classes</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition#getPseudoClasses()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_PseudoClasses();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition
   * @generated
   */
  EClass getPropertyDefinition();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getDoku <em>Doku</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doku</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getDoku()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Doku();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getName()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getRule()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Rule();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition#getDefault()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Default();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition <em>Pseudo Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Class Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition
   * @generated
   */
  EClass getPseudoClassDefinition();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition#getDoku <em>Doku</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doku</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition#getDoku()
   * @see #getPseudoClassDefinition()
   * @generated
   */
  EReference getPseudoClassDefinition_Doku();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition#getName()
   * @see #getPseudoClassDefinition()
   * @generated
   */
  EAttribute getPseudoClassDefinition_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId <em>CSS Rule Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId
   * @generated
   */
  EClass getCSSRuleId();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId#getName()
   * @see #getCSSRuleId()
   * @generated
   */
  EAttribute getCSSRuleId_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef <em>CSS Rule Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Ref</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef
   * @generated
   */
  EClass getCSSRuleRef();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef#getRef()
   * @see #getCSSRuleRef()
   * @generated
   */
  EReference getCSSRuleRef_Ref();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition <em>CSS Rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition
   * @generated
   */
  EClass getCSSRuleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getDoku <em>Doku</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doku</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getDoku()
   * @see #getCSSRuleDefinition()
   * @generated
   */
  EReference getCSSRuleDefinition_Doku();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getName()
   * @see #getCSSRuleDefinition()
   * @generated
   */
  EReference getCSSRuleDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getRule()
   * @see #getCSSRuleDefinition()
   * @generated
   */
  EReference getCSSRuleDefinition_Rule();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getFunc()
   * @see #getCSSRuleDefinition()
   * @generated
   */
  EReference getCSSRuleDefinition_Func();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue <em>CSS Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Default Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue
   * @generated
   */
  EClass getCSSDefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getVal()
   * @see #getCSSDefaultValue()
   * @generated
   */
  EReference getCSSDefaultValue_Val();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getIval <em>Ival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ival</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getIval()
   * @see #getCSSDefaultValue()
   * @generated
   */
  EAttribute getCSSDefaultValue_Ival();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getDval <em>Dval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dval</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getDval()
   * @see #getCSSDefaultValue()
   * @generated
   */
  EAttribute getCSSDefaultValue_Dval();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getSval <em>Sval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sval</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue#getSval()
   * @see #getCSSDefaultValue()
   * @generated
   */
  EAttribute getCSSDefaultValue_Sval();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType <em>CSS Ranged Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Ranged Int Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType
   * @generated
   */
  EClass getCSSRangedIntType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType#getFrom()
   * @see #getCSSRangedIntType()
   * @generated
   */
  EAttribute getCSSRangedIntType_From();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedIntType#getTo()
   * @see #getCSSRangedIntType()
   * @generated
   */
  EAttribute getCSSRangedIntType_To();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType <em>CSS Ranged Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Ranged Double Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType
   * @generated
   */
  EClass getCSSRangedDoubleType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType#getFrom()
   * @see #getCSSRangedDoubleType()
   * @generated
   */
  EAttribute getCSSRangedDoubleType_From();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRangedDoubleType#getTo()
   * @see #getCSSRangedDoubleType()
   * @generated
   */
  EAttribute getCSSRangedDoubleType_To();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc <em>CSS Rule Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Func</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc
   * @generated
   */
  EClass getCSSRuleFunc();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc#getName()
   * @see #getCSSRuleFunc()
   * @generated
   */
  EAttribute getCSSRuleFunc_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc#getParams()
   * @see #getCSSRuleFunc()
   * @generated
   */
  EReference getCSSRuleFunc_Params();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr <em>CSS Rule Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Or</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr
   * @generated
   */
  EClass getCSSRuleOr();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr#getOrs <em>Ors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr#getOrs()
   * @see #getCSSRuleOr()
   * @generated
   */
  EReference getCSSRuleOr_Ors();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor <em>CSS Rule Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Xor</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor
   * @generated
   */
  EClass getCSSRuleXor();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor#getXors <em>Xors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor#getXors()
   * @see #getCSSRuleXor()
   * @generated
   */
  EReference getCSSRuleXor_Xors();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat <em>CSS Rule Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Concat</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat
   * @generated
   */
  EClass getCSSRuleConcat();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat#getConc <em>Conc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conc</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat#getConc()
   * @see #getCSSRuleConcat()
   * @generated
   */
  EReference getCSSRuleConcat_Conc();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix <em>CSS Rule Postfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Postfix</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix
   * @generated
   */
  EClass getCSSRulePostfix();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getRule()
   * @see #getCSSRulePostfix()
   * @generated
   */
  EReference getCSSRulePostfix_Rule();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix#getCardinality()
   * @see #getCSSRulePostfix()
   * @generated
   */
  EAttribute getCSSRulePostfix_Cardinality();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket <em>CSS Rule Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Bracket</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket
   * @generated
   */
  EClass getCSSRuleBracket();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket#getInner()
   * @see #getCSSRuleBracket()
   * @generated
   */
  EReference getCSSRuleBracket_Inner();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral <em>CSS Num Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Num Literal</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral
   * @generated
   */
  EClass getCSSNumLiteral();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral#getValue()
   * @see #getCSSNumLiteral()
   * @generated
   */
  EAttribute getCSSNumLiteral_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex <em>CSS Rule Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Regex</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex
   * @generated
   */
  EClass getCSSRuleRegex();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex#getRegex <em>Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regex</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex#getRegex()
   * @see #getCSSRuleRegex()
   * @generated
   */
  EAttribute getCSSRuleRegex_Regex();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral <em>CSS Rule Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Literal</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral
   * @generated
   */
  EClass getCSSRuleLiteral();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral#getValue()
   * @see #getCSSRuleLiteral()
   * @generated
   */
  EAttribute getCSSRuleLiteral_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol <em>CSS Rule Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Symbol</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol
   * @generated
   */
  EClass getCSSRuleSymbol();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol#getSymbol()
   * @see #getCSSRuleSymbol()
   * @generated
   */
  EAttribute getCSSRuleSymbol_Symbol();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CssExtDslFactory getCssExtDslFactory();

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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl <em>Css Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCssExtension()
     * @generated
     */
    EClass CSS_EXTENSION = eINSTANCE.getCssExtension();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_EXTENSION__IMPORTS = eINSTANCE.getCssExtension_Imports();

    /**
     * The meta object literal for the '<em><b>Package Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_EXTENSION__PACKAGE_DEF = eINSTANCE.getCssExtension_PackageDef();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDefinitionImpl <em>Package Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPackageDefinition()
     * @generated
     */
    EClass PACKAGE_DEFINITION = eINSTANCE.getPackageDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEFINITION__NAME = eINSTANCE.getPackageDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DEFINITION__RULES = eINSTANCE.getPackageDefinition_Rules();

    /**
     * The meta object literal for the '<em><b>Subpackages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DEFINITION__SUBPACKAGES = eINSTANCE.getPackageDefinition_Subpackages();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DEFINITION__ELEMENTS = eINSTANCE.getPackageDefinition_Elements();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.DokuImpl <em>Doku</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.DokuImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getDoku()
     * @generated
     */
    EClass DOKU = eINSTANCE.getDoku();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOKU__CONTENT = eINSTANCE.getDoku_Content();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleImpl <em>CSS Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRule()
     * @generated
     */
    EClass CSS_RULE = eINSTANCE.getCSSRule();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE__TYPE = eINSTANCE.getCSSRule_Type();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ElementDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getElementDefinition()
     * @generated
     */
    EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

    /**
     * The meta object literal for the '<em><b>Doku</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__DOKU = eINSTANCE.getElementDefinition_Doku();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DEFINITION__NAME = eINSTANCE.getElementDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__SUPER = eINSTANCE.getElementDefinition_Super();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__PROPERTIES = eINSTANCE.getElementDefinition_Properties();

    /**
     * The meta object literal for the '<em><b>Pseudo Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__PSEUDO_CLASSES = eINSTANCE.getElementDefinition_PseudoClasses();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PropertyDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPropertyDefinition()
     * @generated
     */
    EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Doku</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__DOKU = eINSTANCE.getPropertyDefinition_Doku();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__RULE = eINSTANCE.getPropertyDefinition_Rule();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__DEFAULT = eINSTANCE.getPropertyDefinition_Default();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PseudoClassDefinitionImpl <em>Pseudo Class Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PseudoClassDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPseudoClassDefinition()
     * @generated
     */
    EClass PSEUDO_CLASS_DEFINITION = eINSTANCE.getPseudoClassDefinition();

    /**
     * The meta object literal for the '<em><b>Doku</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSEUDO_CLASS_DEFINITION__DOKU = eINSTANCE.getPseudoClassDefinition_Doku();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO_CLASS_DEFINITION__NAME = eINSTANCE.getPseudoClassDefinition_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl <em>CSS Rule Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleId()
     * @generated
     */
    EClass CSS_RULE_ID = eINSTANCE.getCSSRuleId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_ID__NAME = eINSTANCE.getCSSRuleId_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl <em>CSS Rule Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleRef()
     * @generated
     */
    EClass CSS_RULE_REF = eINSTANCE.getCSSRuleRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_REF__REF = eINSTANCE.getCSSRuleRef_Ref();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl <em>CSS Rule Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleDefinition()
     * @generated
     */
    EClass CSS_RULE_DEFINITION = eINSTANCE.getCSSRuleDefinition();

    /**
     * The meta object literal for the '<em><b>Doku</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_DEFINITION__DOKU = eINSTANCE.getCSSRuleDefinition_Doku();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_DEFINITION__NAME = eINSTANCE.getCSSRuleDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_DEFINITION__RULE = eINSTANCE.getCSSRuleDefinition_Rule();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_DEFINITION__FUNC = eINSTANCE.getCSSRuleDefinition_Func();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl <em>CSS Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSDefaultValue()
     * @generated
     */
    EClass CSS_DEFAULT_VALUE = eINSTANCE.getCSSDefaultValue();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_DEFAULT_VALUE__VAL = eINSTANCE.getCSSDefaultValue_Val();

    /**
     * The meta object literal for the '<em><b>Ival</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_DEFAULT_VALUE__IVAL = eINSTANCE.getCSSDefaultValue_Ival();

    /**
     * The meta object literal for the '<em><b>Dval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_DEFAULT_VALUE__DVAL = eINSTANCE.getCSSDefaultValue_Dval();

    /**
     * The meta object literal for the '<em><b>Sval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_DEFAULT_VALUE__SVAL = eINSTANCE.getCSSDefaultValue_Sval();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedIntTypeImpl <em>CSS Ranged Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedIntTypeImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRangedIntType()
     * @generated
     */
    EClass CSS_RANGED_INT_TYPE = eINSTANCE.getCSSRangedIntType();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RANGED_INT_TYPE__FROM = eINSTANCE.getCSSRangedIntType_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RANGED_INT_TYPE__TO = eINSTANCE.getCSSRangedIntType_To();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedDoubleTypeImpl <em>CSS Ranged Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRangedDoubleTypeImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRangedDoubleType()
     * @generated
     */
    EClass CSS_RANGED_DOUBLE_TYPE = eINSTANCE.getCSSRangedDoubleType();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RANGED_DOUBLE_TYPE__FROM = eINSTANCE.getCSSRangedDoubleType_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RANGED_DOUBLE_TYPE__TO = eINSTANCE.getCSSRangedDoubleType_To();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleFuncImpl <em>CSS Rule Func</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleFuncImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleFunc()
     * @generated
     */
    EClass CSS_RULE_FUNC = eINSTANCE.getCSSRuleFunc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_FUNC__NAME = eINSTANCE.getCSSRuleFunc_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_FUNC__PARAMS = eINSTANCE.getCSSRuleFunc_Params();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleOrImpl <em>CSS Rule Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleOrImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleOr()
     * @generated
     */
    EClass CSS_RULE_OR = eINSTANCE.getCSSRuleOr();

    /**
     * The meta object literal for the '<em><b>Ors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_OR__ORS = eINSTANCE.getCSSRuleOr_Ors();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorImpl <em>CSS Rule Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleXor()
     * @generated
     */
    EClass CSS_RULE_XOR = eINSTANCE.getCSSRuleXor();

    /**
     * The meta object literal for the '<em><b>Xors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_XOR__XORS = eINSTANCE.getCSSRuleXor_Xors();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl <em>CSS Rule Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleConcat()
     * @generated
     */
    EClass CSS_RULE_CONCAT = eINSTANCE.getCSSRuleConcat();

    /**
     * The meta object literal for the '<em><b>Conc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_CONCAT__CONC = eINSTANCE.getCSSRuleConcat_Conc();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixImpl <em>CSS Rule Postfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRulePostfix()
     * @generated
     */
    EClass CSS_RULE_POSTFIX = eINSTANCE.getCSSRulePostfix();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_POSTFIX__RULE = eINSTANCE.getCSSRulePostfix_Rule();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_POSTFIX__CARDINALITY = eINSTANCE.getCSSRulePostfix_Cardinality();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketImpl <em>CSS Rule Bracket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleBracket()
     * @generated
     */
    EClass CSS_RULE_BRACKET = eINSTANCE.getCSSRuleBracket();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_BRACKET__INNER = eINSTANCE.getCSSRuleBracket_Inner();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSNumLiteralImpl <em>CSS Num Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSNumLiteralImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSNumLiteral()
     * @generated
     */
    EClass CSS_NUM_LITERAL = eINSTANCE.getCSSNumLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_NUM_LITERAL__VALUE = eINSTANCE.getCSSNumLiteral_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRegexImpl <em>CSS Rule Regex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRegexImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleRegex()
     * @generated
     */
    EClass CSS_RULE_REGEX = eINSTANCE.getCSSRuleRegex();

    /**
     * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_REGEX__REGEX = eINSTANCE.getCSSRuleRegex_Regex();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleLiteralImpl <em>CSS Rule Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleLiteralImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleLiteral()
     * @generated
     */
    EClass CSS_RULE_LITERAL = eINSTANCE.getCSSRuleLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_LITERAL__VALUE = eINSTANCE.getCSSRuleLiteral_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSymbolImpl <em>CSS Rule Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSymbolImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleSymbol()
     * @generated
     */
    EClass CSS_RULE_SYMBOL = eINSTANCE.getCSSRuleSymbol();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_SYMBOL__SYMBOL = eINSTANCE.getCSSRuleSymbol_Symbol();

  }

} //CssExtDslPackage
