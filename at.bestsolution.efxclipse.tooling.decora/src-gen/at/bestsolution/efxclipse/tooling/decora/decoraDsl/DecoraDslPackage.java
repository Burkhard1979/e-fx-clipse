/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

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
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslFactory
 * @model kind="package"
 * @generated
 */
public interface DecoraDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "decoraDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/decora/DecoraDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "decoraDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DecoraDslPackage eINSTANCE = at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ModelImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__UNIT = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl <em>field selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfield_selection()
   * @generated
   */
  int FIELD_SELECTION = 1;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SELECTION__R = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SELECTION__X = 1;

  /**
   * The number of structural features of the '<em>field selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SELECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ternary_partImpl <em>ternary part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ternary_partImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getternary_part()
   * @generated
   */
  int TERNARY_PART = 4;

  /**
   * The number of structural features of the '<em>ternary part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ExprImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 2;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__E = TERNARY_PART_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__F = TERNARY_PART_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ae</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__AE = TERNARY_PART_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__FS = TERNARY_PART_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ID = TERNARY_PART_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__P = TERNARY_PART_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__TS = TERNARY_PART_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__U = TERNARY_PART_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__A = TERNARY_PART_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__B = TERNARY_PART_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__T = TERNARY_PART_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__OP = TERNARY_PART_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__C = TERNARY_PART_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = TERNARY_PART_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_call_parameter_listImpl <em>function call parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_call_parameter_listImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfunction_call_parameter_list()
   * @generated
   */
  int FUNCTION_CALL_PARAMETER_LIST = 3;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_PARAMETER_LIST__A = 0;

  /**
   * The number of structural features of the '<em>function call parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl <em>function prototype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfunction_prototype()
   * @generated
   */
  int FUNCTION_PROTOTYPE = 5;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__T = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__ID = 1;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__P = 2;

  /**
   * The number of structural features of the '<em>function prototype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declarationImpl <em>parameter declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getparameter_declaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__T = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__ID = 1;

  /**
   * The number of structural features of the '<em>parameter declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declaration_listImpl <em>parameter declaration list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declaration_listImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getparameter_declaration_list()
   * @generated
   */
  int PARAMETER_DECLARATION_LIST = 7;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_LIST__P = 0;

  /**
   * The number of structural features of the '<em>parameter declaration list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl <em>declaration identifier and init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getdeclaration_identifier_and_init()
   * @generated
   */
  int DECLARATION_IDENTIFIER_AND_INIT = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_IDENTIFIER_AND_INIT__ID = 0;

  /**
   * The feature id for the '<em><b>Ae</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_IDENTIFIER_AND_INIT__AE = 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_IDENTIFIER_AND_INIT__E = 2;

  /**
   * The number of structural features of the '<em>declaration identifier and init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_IDENTIFIER_AND_INIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.single_declarationImpl <em>single declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.single_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getsingle_declaration()
   * @generated
   */
  int SINGLE_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_DECLARATION__T = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_DECLARATION__D = 1;

  /**
   * The number of structural features of the '<em>single declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declarationImpl <em>declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declarationImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getdeclaration()
   * @generated
   */
  int DECLARATION = 10;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__S = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__D = 1;

  /**
   * The number of structural features of the '<em>declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl <em>fully specified type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfully_specified_type()
   * @generated
   */
  int FULLY_SPECIFIED_TYPE = 11;

  /**
   * The feature id for the '<em><b>Tq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLY_SPECIFIED_TYPE__TQ = 0;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLY_SPECIFIED_TYPE__TP = 1;

  /**
   * The feature id for the '<em><b>Ts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLY_SPECIFIED_TYPE__TS = 2;

  /**
   * The number of structural features of the '<em>fully specified type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLY_SPECIFIED_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.type_specifierImpl <em>type specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.type_specifierImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#gettype_specifier()
   * @generated
   */
  int TYPE_SPECIFIER = 12;

  /**
   * The number of structural features of the '<em>type specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.array_bracketsImpl <em>array brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.array_bracketsImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getarray_brackets()
   * @generated
   */
  int ARRAY_BRACKETS = 13;

  /**
   * The number of structural features of the '<em>array brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_BRACKETS_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.initializerImpl <em>initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.initializerImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getinitializer()
   * @generated
   */
  int INITIALIZER = 14;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZER__E = 0;

  /**
   * The number of structural features of the '<em>initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_statementImpl <em>declaration statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getdeclaration_statement()
   * @generated
   */
  int DECLARATION_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT__D = 0;

  /**
   * The number of structural features of the '<em>declaration statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 16;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__C = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__S = 1;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl <em>simple statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getsimple_statement()
   * @generated
   */
  int SIMPLE_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__D = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__E = 1;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__S = 2;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__I = 3;

  /**
   * The feature id for the '<em><b>J</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__J = 4;

  /**
   * The number of structural features of the '<em>simple statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statementImpl <em>compound statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getcompound_statement()
   * @generated
   */
  int COMPOUND_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT__S = 0;

  /**
   * The number of structural features of the '<em>compound statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statement_no_new_scopeImpl <em>statement no new scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statement_no_new_scopeImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getstatement_no_new_scope()
   * @generated
   */
  int STATEMENT_NO_NEW_SCOPE = 19;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_NO_NEW_SCOPE__C = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_NO_NEW_SCOPE__S = 1;

  /**
   * The number of structural features of the '<em>statement no new scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_NO_NEW_SCOPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statement_no_new_scopeImpl <em>compound statement no new scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statement_no_new_scopeImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getcompound_statement_no_new_scope()
   * @generated
   */
  int COMPOUND_STATEMENT_NO_NEW_SCOPE = 20;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_NO_NEW_SCOPE__S = 0;

  /**
   * The number of structural features of the '<em>compound statement no new scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_NO_NEW_SCOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.expression_statementImpl <em>expression statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.expression_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getexpression_statement()
   * @generated
   */
  int EXPRESSION_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT__E = 0;

  /**
   * The number of structural features of the '<em>expression statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.constant_expressionImpl <em>constant expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.constant_expressionImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getconstant_expression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__C = ARRAY_BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>constant expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = ARRAY_BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.selection_statementImpl <em>selection statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.selection_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getselection_statement()
   * @generated
   */
  int SELECTION_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__E = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__A = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__B = 2;

  /**
   * The number of structural features of the '<em>selection statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.conditionImpl <em>condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.conditionImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getcondition()
   * @generated
   */
  int CONDITION = 24;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__E = 0;

  /**
   * The number of structural features of the '<em>condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl <em>iteration statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getiteration_statement()
   * @generated
   */
  int ITERATION_STATEMENT = 25;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__C = 0;

  /**
   * The feature id for the '<em><b>Snns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__SNNS = 1;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__S = 2;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__E = 3;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__U = 4;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__INIT = 5;

  /**
   * The feature id for the '<em><b>Rem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__REM = 6;

  /**
   * The number of structural features of the '<em>iteration statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.unroll_modifierImpl <em>unroll modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.unroll_modifierImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getunroll_modifier()
   * @generated
   */
  int UNROLL_MODIFIER = 26;

  /**
   * The feature id for the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNROLL_MODIFIER__M = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNROLL_MODIFIER__C = 1;

  /**
   * The number of structural features of the '<em>unroll modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNROLL_MODIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_init_statementImpl <em>for init statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_init_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfor_init_statement()
   * @generated
   */
  int FOR_INIT_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT_STATEMENT__E = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT_STATEMENT__D = 1;

  /**
   * The number of structural features of the '<em>for init statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_rest_statementImpl <em>for rest statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_rest_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfor_rest_statement()
   * @generated
   */
  int FOR_REST_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_REST_STATEMENT__C = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_REST_STATEMENT__E = 1;

  /**
   * The number of structural features of the '<em>for rest statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_REST_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.jump_statementImpl <em>jump statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.jump_statementImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getjump_statement()
   * @generated
   */
  int JUMP_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT__E = 0;

  /**
   * The number of structural features of the '<em>jump statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.translation_unitImpl <em>translation unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.translation_unitImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#gettranslation_unit()
   * @generated
   */
  int TRANSLATION_UNIT = 30;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_UNIT__E = 0;

  /**
   * The number of structural features of the '<em>translation unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_UNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl <em>external declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getexternal_declaration()
   * @generated
   */
  int EXTERNAL_DECLARATION = 31;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECLARATION__F = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECLARATION__D = 1;

  /**
   * The feature id for the '<em><b>G</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECLARATION__G = 2;

  /**
   * The number of structural features of the '<em>external declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_definitionImpl <em>function definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_definitionImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfunction_definition()
   * @generated
   */
  int FUNCTION_DEFINITION = 32;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__P = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__S = 1;

  /**
   * The number of structural features of the '<em>function definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.glue_blockImpl <em>glue block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.glue_blockImpl
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getglue_block()
   * @generated
   */
  int GLUE_BLOCK = 33;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUE_BLOCK__G = 0;

  /**
   * The number of structural features of the '<em>glue block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUE_BLOCK_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unit</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model#getUnit()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Unit();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection <em>field selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field selection</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection
   * @generated
   */
  EClass getfield_selection();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getR()
   * @see #getfield_selection()
   * @generated
   */
  EAttribute getfield_selection_R();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection#getX()
   * @see #getfield_selection()
   * @generated
   */
  EAttribute getfield_selection_X();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getE()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_E();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getF()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_F();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getAe <em>Ae</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ae</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getAe()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Ae();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getFs <em>Fs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fs</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getFs()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Fs();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getId()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Id();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getP()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_P();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getTs <em>Ts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ts</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getTs()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Ts();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getU()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_U();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getA()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_A();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>B</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getB()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_B();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getT()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_T();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getOp()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Expr#getC()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_C();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list <em>function call parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function call parameter list</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list
   * @generated
   */
  EClass getfunction_call_parameter_list();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>A</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list#getA()
   * @see #getfunction_call_parameter_list()
   * @generated
   */
  EReference getfunction_call_parameter_list_A();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.ternary_part <em>ternary part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ternary part</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.ternary_part
   * @generated
   */
  EClass getternary_part();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype <em>function prototype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function prototype</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype
   * @generated
   */
  EClass getfunction_prototype();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype#getT()
   * @see #getfunction_prototype()
   * @generated
   */
  EReference getfunction_prototype_T();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype#getId()
   * @see #getfunction_prototype()
   * @generated
   */
  EAttribute getfunction_prototype_Id();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype#getP()
   * @see #getfunction_prototype()
   * @generated
   */
  EReference getfunction_prototype_P();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration <em>parameter declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration
   * @generated
   */
  EClass getparameter_declaration();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getT()
   * @see #getparameter_declaration()
   * @generated
   */
  EReference getparameter_declaration_T();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration#getId()
   * @see #getparameter_declaration()
   * @generated
   */
  EAttribute getparameter_declaration_Id();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list <em>parameter declaration list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter declaration list</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list
   * @generated
   */
  EClass getparameter_declaration_list();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>P</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list#getP()
   * @see #getparameter_declaration_list()
   * @generated
   */
  EReference getparameter_declaration_list_P();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init <em>declaration identifier and init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration identifier and init</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init
   * @generated
   */
  EClass getdeclaration_identifier_and_init();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init#getId()
   * @see #getdeclaration_identifier_and_init()
   * @generated
   */
  EAttribute getdeclaration_identifier_and_init_Id();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init#getAe <em>Ae</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ae</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init#getAe()
   * @see #getdeclaration_identifier_and_init()
   * @generated
   */
  EReference getdeclaration_identifier_and_init_Ae();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init#getE()
   * @see #getdeclaration_identifier_and_init()
   * @generated
   */
  EReference getdeclaration_identifier_and_init_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration <em>single declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>single declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration
   * @generated
   */
  EClass getsingle_declaration();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration#getT()
   * @see #getsingle_declaration()
   * @generated
   */
  EReference getsingle_declaration_T();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration#getD()
   * @see #getsingle_declaration()
   * @generated
   */
  EReference getsingle_declaration_D();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration <em>declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration
   * @generated
   */
  EClass getdeclaration();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration#getS()
   * @see #getdeclaration()
   * @generated
   */
  EReference getdeclaration_S();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>D</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration#getD()
   * @see #getdeclaration()
   * @generated
   */
  EReference getdeclaration_D();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type <em>fully specified type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fully specified type</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type
   * @generated
   */
  EClass getfully_specified_type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTq <em>Tq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tq</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTq()
   * @see #getfully_specified_type()
   * @generated
   */
  EAttribute getfully_specified_type_Tq();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTp <em>Tp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tp</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTp()
   * @see #getfully_specified_type()
   * @generated
   */
  EAttribute getfully_specified_type_Tp();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTs <em>Ts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ts</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type#getTs()
   * @see #getfully_specified_type()
   * @generated
   */
  EReference getfully_specified_type_Ts();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier <em>type specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type specifier</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier
   * @generated
   */
  EClass gettype_specifier();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.array_brackets <em>array brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>array brackets</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.array_brackets
   * @generated
   */
  EClass getarray_brackets();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer <em>initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>initializer</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer
   * @generated
   */
  EClass getinitializer();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer#getE()
   * @see #getinitializer()
   * @generated
   */
  EReference getinitializer_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement <em>declaration statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement
   * @generated
   */
  EClass getdeclaration_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement#getD()
   * @see #getdeclaration_statement()
   * @generated
   */
  EReference getdeclaration_statement_D();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement#getC()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_C();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement#getS()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_S();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement <em>simple statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement
   * @generated
   */
  EClass getsimple_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getD()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_D();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getE()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_E();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getS()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_S();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>I</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getI()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_I();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getJ <em>J</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>J</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement#getJ()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_J();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement <em>compound statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compound statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement
   * @generated
   */
  EClass getcompound_statement();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement#getS()
   * @see #getcompound_statement()
   * @generated
   */
  EReference getcompound_statement_S();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope <em>statement no new scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement no new scope</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope
   * @generated
   */
  EClass getstatement_no_new_scope();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getC()
   * @see #getstatement_no_new_scope()
   * @generated
   */
  EReference getstatement_no_new_scope_C();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope#getS()
   * @see #getstatement_no_new_scope()
   * @generated
   */
  EReference getstatement_no_new_scope_S();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope <em>compound statement no new scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compound statement no new scope</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope
   * @generated
   */
  EClass getcompound_statement_no_new_scope();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope#getS()
   * @see #getcompound_statement_no_new_scope()
   * @generated
   */
  EReference getcompound_statement_no_new_scope_S();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement <em>expression statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement
   * @generated
   */
  EClass getexpression_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement#getE()
   * @see #getexpression_statement()
   * @generated
   */
  EReference getexpression_statement_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression
   * @generated
   */
  EClass getconstant_expression();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression#getC()
   * @see #getconstant_expression()
   * @generated
   */
  EReference getconstant_expression_C();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement <em>selection statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>selection statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement
   * @generated
   */
  EClass getselection_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement#getE()
   * @see #getselection_statement()
   * @generated
   */
  EReference getselection_statement_E();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement#getA()
   * @see #getselection_statement()
   * @generated
   */
  EReference getselection_statement_A();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement#getB()
   * @see #getselection_statement()
   * @generated
   */
  EReference getselection_statement_B();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition <em>condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>condition</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition
   * @generated
   */
  EClass getcondition();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition#getE()
   * @see #getcondition()
   * @generated
   */
  EReference getcondition_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement <em>iteration statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iteration statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement
   * @generated
   */
  EClass getiteration_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getC()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_C();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getSnns <em>Snns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Snns</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getSnns()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_Snns();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getS()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_S();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getE()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_E();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getU()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_U();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getInit()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getRem <em>Rem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rem</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement#getRem()
   * @see #getiteration_statement()
   * @generated
   */
  EReference getiteration_statement_Rem();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier <em>unroll modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unroll modifier</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier
   * @generated
   */
  EClass getunroll_modifier();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>M</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier#getM()
   * @see #getunroll_modifier()
   * @generated
   */
  EAttribute getunroll_modifier_M();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier#getC()
   * @see #getunroll_modifier()
   * @generated
   */
  EAttribute getunroll_modifier_C();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement <em>for init statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for init statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement
   * @generated
   */
  EClass getfor_init_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement#getE()
   * @see #getfor_init_statement()
   * @generated
   */
  EReference getfor_init_statement_E();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement#getD()
   * @see #getfor_init_statement()
   * @generated
   */
  EReference getfor_init_statement_D();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement <em>for rest statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for rest statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement
   * @generated
   */
  EClass getfor_rest_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getC()
   * @see #getfor_rest_statement()
   * @generated
   */
  EReference getfor_rest_statement_C();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement#getE()
   * @see #getfor_rest_statement()
   * @generated
   */
  EReference getfor_rest_statement_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement <em>jump statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>jump statement</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement
   * @generated
   */
  EClass getjump_statement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement#getE()
   * @see #getjump_statement()
   * @generated
   */
  EReference getjump_statement_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit <em>translation unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>translation unit</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit
   * @generated
   */
  EClass gettranslation_unit();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit#getE()
   * @see #gettranslation_unit()
   * @generated
   */
  EReference gettranslation_unit_E();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration <em>external declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>external declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration
   * @generated
   */
  EClass getexternal_declaration();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration#getF()
   * @see #getexternal_declaration()
   * @generated
   */
  EReference getexternal_declaration_F();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration#getD()
   * @see #getexternal_declaration()
   * @generated
   */
  EReference getexternal_declaration_D();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>G</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration#getG()
   * @see #getexternal_declaration()
   * @generated
   */
  EReference getexternal_declaration_G();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition <em>function definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition
   * @generated
   */
  EClass getfunction_definition();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition#getP()
   * @see #getfunction_definition()
   * @generated
   */
  EReference getfunction_definition_P();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition#getS()
   * @see #getfunction_definition()
   * @generated
   */
  EReference getfunction_definition_S();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block <em>glue block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>glue block</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block
   * @generated
   */
  EClass getglue_block();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block#getG()
   * @see #getglue_block()
   * @generated
   */
  EAttribute getglue_block_G();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DecoraDslFactory getDecoraDslFactory();

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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ModelImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__UNIT = eINSTANCE.getModel_Unit();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl <em>field selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.field_selectionImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfield_selection()
     * @generated
     */
    EClass FIELD_SELECTION = eINSTANCE.getfield_selection();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SELECTION__R = eINSTANCE.getfield_selection_R();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SELECTION__X = eINSTANCE.getfield_selection_X();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ExprImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__E = eINSTANCE.getExpr_E();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__F = eINSTANCE.getExpr_F();

    /**
     * The meta object literal for the '<em><b>Ae</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__AE = eINSTANCE.getExpr_Ae();

    /**
     * The meta object literal for the '<em><b>Fs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__FS = eINSTANCE.getExpr_Fs();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__ID = eINSTANCE.getExpr_Id();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__P = eINSTANCE.getExpr_P();

    /**
     * The meta object literal for the '<em><b>Ts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__TS = eINSTANCE.getExpr_Ts();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__U = eINSTANCE.getExpr_U();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__A = eINSTANCE.getExpr_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__B = eINSTANCE.getExpr_B();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__T = eINSTANCE.getExpr_T();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__OP = eINSTANCE.getExpr_Op();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__C = eINSTANCE.getExpr_C();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_call_parameter_listImpl <em>function call parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_call_parameter_listImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfunction_call_parameter_list()
     * @generated
     */
    EClass FUNCTION_CALL_PARAMETER_LIST = eINSTANCE.getfunction_call_parameter_list();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_PARAMETER_LIST__A = eINSTANCE.getfunction_call_parameter_list_A();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ternary_partImpl <em>ternary part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.ternary_partImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getternary_part()
     * @generated
     */
    EClass TERNARY_PART = eINSTANCE.getternary_part();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl <em>function prototype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_prototypeImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfunction_prototype()
     * @generated
     */
    EClass FUNCTION_PROTOTYPE = eINSTANCE.getfunction_prototype();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PROTOTYPE__T = eINSTANCE.getfunction_prototype_T();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PROTOTYPE__ID = eINSTANCE.getfunction_prototype_Id();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PROTOTYPE__P = eINSTANCE.getfunction_prototype_P();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declarationImpl <em>parameter declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declarationImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getparameter_declaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getparameter_declaration();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION__T = eINSTANCE.getparameter_declaration_T();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__ID = eINSTANCE.getparameter_declaration_Id();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declaration_listImpl <em>parameter declaration list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.parameter_declaration_listImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getparameter_declaration_list()
     * @generated
     */
    EClass PARAMETER_DECLARATION_LIST = eINSTANCE.getparameter_declaration_list();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION_LIST__P = eINSTANCE.getparameter_declaration_list_P();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl <em>declaration identifier and init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_identifier_and_initImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getdeclaration_identifier_and_init()
     * @generated
     */
    EClass DECLARATION_IDENTIFIER_AND_INIT = eINSTANCE.getdeclaration_identifier_and_init();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION_IDENTIFIER_AND_INIT__ID = eINSTANCE.getdeclaration_identifier_and_init_Id();

    /**
     * The meta object literal for the '<em><b>Ae</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_IDENTIFIER_AND_INIT__AE = eINSTANCE.getdeclaration_identifier_and_init_Ae();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_IDENTIFIER_AND_INIT__E = eINSTANCE.getdeclaration_identifier_and_init_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.single_declarationImpl <em>single declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.single_declarationImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getsingle_declaration()
     * @generated
     */
    EClass SINGLE_DECLARATION = eINSTANCE.getsingle_declaration();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_DECLARATION__T = eINSTANCE.getsingle_declaration_T();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_DECLARATION__D = eINSTANCE.getsingle_declaration_D();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declarationImpl <em>declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declarationImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getdeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getdeclaration();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__S = eINSTANCE.getdeclaration_S();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__D = eINSTANCE.getdeclaration_D();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl <em>fully specified type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.fully_specified_typeImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfully_specified_type()
     * @generated
     */
    EClass FULLY_SPECIFIED_TYPE = eINSTANCE.getfully_specified_type();

    /**
     * The meta object literal for the '<em><b>Tq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULLY_SPECIFIED_TYPE__TQ = eINSTANCE.getfully_specified_type_Tq();

    /**
     * The meta object literal for the '<em><b>Tp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULLY_SPECIFIED_TYPE__TP = eINSTANCE.getfully_specified_type_Tp();

    /**
     * The meta object literal for the '<em><b>Ts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULLY_SPECIFIED_TYPE__TS = eINSTANCE.getfully_specified_type_Ts();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.type_specifierImpl <em>type specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.type_specifierImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#gettype_specifier()
     * @generated
     */
    EClass TYPE_SPECIFIER = eINSTANCE.gettype_specifier();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.array_bracketsImpl <em>array brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.array_bracketsImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getarray_brackets()
     * @generated
     */
    EClass ARRAY_BRACKETS = eINSTANCE.getarray_brackets();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.initializerImpl <em>initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.initializerImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getinitializer()
     * @generated
     */
    EClass INITIALIZER = eINSTANCE.getinitializer();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZER__E = eINSTANCE.getinitializer_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_statementImpl <em>declaration statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.declaration_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getdeclaration_statement()
     * @generated
     */
    EClass DECLARATION_STATEMENT = eINSTANCE.getdeclaration_statement();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_STATEMENT__D = eINSTANCE.getdeclaration_statement_D();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__C = eINSTANCE.getstatement_C();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__S = eINSTANCE.getstatement_S();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl <em>simple statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.simple_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getsimple_statement()
     * @generated
     */
    EClass SIMPLE_STATEMENT = eINSTANCE.getsimple_statement();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__D = eINSTANCE.getsimple_statement_D();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__E = eINSTANCE.getsimple_statement_E();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__S = eINSTANCE.getsimple_statement_S();

    /**
     * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__I = eINSTANCE.getsimple_statement_I();

    /**
     * The meta object literal for the '<em><b>J</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__J = eINSTANCE.getsimple_statement_J();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statementImpl <em>compound statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getcompound_statement()
     * @generated
     */
    EClass COMPOUND_STATEMENT = eINSTANCE.getcompound_statement();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATEMENT__S = eINSTANCE.getcompound_statement_S();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statement_no_new_scopeImpl <em>statement no new scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.statement_no_new_scopeImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getstatement_no_new_scope()
     * @generated
     */
    EClass STATEMENT_NO_NEW_SCOPE = eINSTANCE.getstatement_no_new_scope();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_NO_NEW_SCOPE__C = eINSTANCE.getstatement_no_new_scope_C();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_NO_NEW_SCOPE__S = eINSTANCE.getstatement_no_new_scope_S();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statement_no_new_scopeImpl <em>compound statement no new scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.compound_statement_no_new_scopeImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getcompound_statement_no_new_scope()
     * @generated
     */
    EClass COMPOUND_STATEMENT_NO_NEW_SCOPE = eINSTANCE.getcompound_statement_no_new_scope();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATEMENT_NO_NEW_SCOPE__S = eINSTANCE.getcompound_statement_no_new_scope_S();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.expression_statementImpl <em>expression statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.expression_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getexpression_statement()
     * @generated
     */
    EClass EXPRESSION_STATEMENT = eINSTANCE.getexpression_statement();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_STATEMENT__E = eINSTANCE.getexpression_statement_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.constant_expressionImpl <em>constant expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.constant_expressionImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getconstant_expression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getconstant_expression();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION__C = eINSTANCE.getconstant_expression_C();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.selection_statementImpl <em>selection statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.selection_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getselection_statement()
     * @generated
     */
    EClass SELECTION_STATEMENT = eINSTANCE.getselection_statement();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_STATEMENT__E = eINSTANCE.getselection_statement_E();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_STATEMENT__A = eINSTANCE.getselection_statement_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_STATEMENT__B = eINSTANCE.getselection_statement_B();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.conditionImpl <em>condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.conditionImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getcondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getcondition();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__E = eINSTANCE.getcondition_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl <em>iteration statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.iteration_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getiteration_statement()
     * @generated
     */
    EClass ITERATION_STATEMENT = eINSTANCE.getiteration_statement();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__C = eINSTANCE.getiteration_statement_C();

    /**
     * The meta object literal for the '<em><b>Snns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__SNNS = eINSTANCE.getiteration_statement_Snns();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__S = eINSTANCE.getiteration_statement_S();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__E = eINSTANCE.getiteration_statement_E();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__U = eINSTANCE.getiteration_statement_U();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__INIT = eINSTANCE.getiteration_statement_Init();

    /**
     * The meta object literal for the '<em><b>Rem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__REM = eINSTANCE.getiteration_statement_Rem();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.unroll_modifierImpl <em>unroll modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.unroll_modifierImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getunroll_modifier()
     * @generated
     */
    EClass UNROLL_MODIFIER = eINSTANCE.getunroll_modifier();

    /**
     * The meta object literal for the '<em><b>M</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNROLL_MODIFIER__M = eINSTANCE.getunroll_modifier_M();

    /**
     * The meta object literal for the '<em><b>C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNROLL_MODIFIER__C = eINSTANCE.getunroll_modifier_C();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_init_statementImpl <em>for init statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_init_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfor_init_statement()
     * @generated
     */
    EClass FOR_INIT_STATEMENT = eINSTANCE.getfor_init_statement();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT_STATEMENT__E = eINSTANCE.getfor_init_statement_E();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT_STATEMENT__D = eINSTANCE.getfor_init_statement_D();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_rest_statementImpl <em>for rest statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_rest_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfor_rest_statement()
     * @generated
     */
    EClass FOR_REST_STATEMENT = eINSTANCE.getfor_rest_statement();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_REST_STATEMENT__C = eINSTANCE.getfor_rest_statement_C();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_REST_STATEMENT__E = eINSTANCE.getfor_rest_statement_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.jump_statementImpl <em>jump statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.jump_statementImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getjump_statement()
     * @generated
     */
    EClass JUMP_STATEMENT = eINSTANCE.getjump_statement();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP_STATEMENT__E = eINSTANCE.getjump_statement_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.translation_unitImpl <em>translation unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.translation_unitImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#gettranslation_unit()
     * @generated
     */
    EClass TRANSLATION_UNIT = eINSTANCE.gettranslation_unit();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSLATION_UNIT__E = eINSTANCE.gettranslation_unit_E();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl <em>external declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.external_declarationImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getexternal_declaration()
     * @generated
     */
    EClass EXTERNAL_DECLARATION = eINSTANCE.getexternal_declaration();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_DECLARATION__F = eINSTANCE.getexternal_declaration_F();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_DECLARATION__D = eINSTANCE.getexternal_declaration_D();

    /**
     * The meta object literal for the '<em><b>G</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_DECLARATION__G = eINSTANCE.getexternal_declaration_G();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_definitionImpl <em>function definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.function_definitionImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getfunction_definition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getfunction_definition();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__P = eINSTANCE.getfunction_definition_P();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__S = eINSTANCE.getfunction_definition_S();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.glue_blockImpl <em>glue block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.glue_blockImpl
     * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslPackageImpl#getglue_block()
     * @generated
     */
    EClass GLUE_BLOCK = eINSTANCE.getglue_block();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUE_BLOCK__G = eINSTANCE.getglue_block_G();

  }

} //DecoraDslPackage
