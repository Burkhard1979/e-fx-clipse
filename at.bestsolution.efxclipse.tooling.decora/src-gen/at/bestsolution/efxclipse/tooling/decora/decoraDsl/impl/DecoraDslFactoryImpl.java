/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.*;

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
public class DecoraDslFactoryImpl extends EFactoryImpl implements DecoraDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DecoraDslFactory init()
  {
    try
    {
      DecoraDslFactory theDecoraDslFactory = (DecoraDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/decora/DecoraDsl"); 
      if (theDecoraDslFactory != null)
      {
        return theDecoraDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DecoraDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecoraDslFactoryImpl()
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
      case DecoraDslPackage.MODEL: return createModel();
      case DecoraDslPackage.FIELD_SELECTION: return createfield_selection();
      case DecoraDslPackage.PRIMARY_EXPRESSION: return createprimary_expression();
      case DecoraDslPackage.PRIMARY_OR_CALL: return createprimary_or_call();
      case DecoraDslPackage.POSTFIX_EXPRESSION: return createpostfix_expression();
      case DecoraDslPackage.FUNCTION_CALL: return createfunction_call();
      case DecoraDslPackage.FUNCTION_CALL_PARAMETER_LIST: return createfunction_call_parameter_list();
      case DecoraDslPackage.UNARY_EXPRESSION: return createunary_expression();
      case DecoraDslPackage.MULTIPLICATIVE_EXPRESSION: return createmultiplicative_expression();
      case DecoraDslPackage.ADDITIVE_EXPRESSION: return createadditive_expression();
      case DecoraDslPackage.RELATIONAL_EXPRESSION: return createrelational_expression();
      case DecoraDslPackage.EQUALITY_EXPRESSION: return createequality_expression();
      case DecoraDslPackage.LOGICAL_AND_EXPRESSION: return createlogical_and_expression();
      case DecoraDslPackage.LOGICAL_XOR_EXPRESSION: return createlogical_xor_expression();
      case DecoraDslPackage.LOGICAL_OR_EXPRESSION: return createlogical_or_expression();
      case DecoraDslPackage.TERNARY_PART: return createternary_part();
      case DecoraDslPackage.CONDITIONAL_EXPRESSION: return createconditional_expression();
      case DecoraDslPackage.ASSIGNMENT_EXPRESSION: return createassignment_expression();
      case DecoraDslPackage.EXPRESSION: return createexpression();
      case DecoraDslPackage.FUNCTION_PROTOTYPE: return createfunction_prototype();
      case DecoraDslPackage.PARAMETER_DECLARATION: return createparameter_declaration();
      case DecoraDslPackage.PARAMETER_DECLARATION_LIST: return createparameter_declaration_list();
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT: return createdeclaration_identifier_and_init();
      case DecoraDslPackage.SINGLE_DECLARATION: return createsingle_declaration();
      case DecoraDslPackage.DECLARATION: return createdeclaration();
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE: return createfully_specified_type();
      case DecoraDslPackage.TYPE_SPECIFIER: return createtype_specifier();
      case DecoraDslPackage.ARRAY_BRACKETS: return createarray_brackets();
      case DecoraDslPackage.INITIALIZER: return createinitializer();
      case DecoraDslPackage.DECLARATION_STATEMENT: return createdeclaration_statement();
      case DecoraDslPackage.STATEMENT: return createstatement();
      case DecoraDslPackage.SIMPLE_STATEMENT: return createsimple_statement();
      case DecoraDslPackage.COMPOUND_STATEMENT: return createcompound_statement();
      case DecoraDslPackage.STATEMENT_NO_NEW_SCOPE: return createstatement_no_new_scope();
      case DecoraDslPackage.COMPOUND_STATEMENT_NO_NEW_SCOPE: return createcompound_statement_no_new_scope();
      case DecoraDslPackage.EXPRESSION_STATEMENT: return createexpression_statement();
      case DecoraDslPackage.CONSTANT_EXPRESSION: return createconstant_expression();
      case DecoraDslPackage.SELECTION_STATEMENT: return createselection_statement();
      case DecoraDslPackage.CONDITION: return createcondition();
      case DecoraDslPackage.ITERATION_STATEMENT: return createiteration_statement();
      case DecoraDslPackage.UNROLL_MODIFIER: return createunroll_modifier();
      case DecoraDslPackage.FOR_INIT_STATEMENT: return createfor_init_statement();
      case DecoraDslPackage.FOR_REST_STATEMENT: return createfor_rest_statement();
      case DecoraDslPackage.JUMP_STATEMENT: return createjump_statement();
      case DecoraDslPackage.TRANSLATION_UNIT: return createtranslation_unit();
      case DecoraDslPackage.EXTERNAL_DECLARATION: return createexternal_declaration();
      case DecoraDslPackage.FUNCTION_DEFINITION: return createfunction_definition();
      case DecoraDslPackage.GLUE_BLOCK: return createglue_block();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_selection createfield_selection()
  {
    field_selectionImpl field_selection = new field_selectionImpl();
    return field_selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primary_expression createprimary_expression()
  {
    primary_expressionImpl primary_expression = new primary_expressionImpl();
    return primary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primary_or_call createprimary_or_call()
  {
    primary_or_callImpl primary_or_call = new primary_or_callImpl();
    return primary_or_call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfix_expression createpostfix_expression()
  {
    postfix_expressionImpl postfix_expression = new postfix_expressionImpl();
    return postfix_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_call createfunction_call()
  {
    function_callImpl function_call = new function_callImpl();
    return function_call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_call_parameter_list createfunction_call_parameter_list()
  {
    function_call_parameter_listImpl function_call_parameter_list = new function_call_parameter_listImpl();
    return function_call_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unary_expression createunary_expression()
  {
    unary_expressionImpl unary_expression = new unary_expressionImpl();
    return unary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicative_expression createmultiplicative_expression()
  {
    multiplicative_expressionImpl multiplicative_expression = new multiplicative_expressionImpl();
    return multiplicative_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additive_expression createadditive_expression()
  {
    additive_expressionImpl additive_expression = new additive_expressionImpl();
    return additive_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relational_expression createrelational_expression()
  {
    relational_expressionImpl relational_expression = new relational_expressionImpl();
    return relational_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public equality_expression createequality_expression()
  {
    equality_expressionImpl equality_expression = new equality_expressionImpl();
    return equality_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expression createlogical_and_expression()
  {
    logical_and_expressionImpl logical_and_expression = new logical_and_expressionImpl();
    return logical_and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_xor_expression createlogical_xor_expression()
  {
    logical_xor_expressionImpl logical_xor_expression = new logical_xor_expressionImpl();
    return logical_xor_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_or_expression createlogical_or_expression()
  {
    logical_or_expressionImpl logical_or_expression = new logical_or_expressionImpl();
    return logical_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ternary_part createternary_part()
  {
    ternary_partImpl ternary_part = new ternary_partImpl();
    return ternary_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_expression createconditional_expression()
  {
    conditional_expressionImpl conditional_expression = new conditional_expressionImpl();
    return conditional_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_expression createassignment_expression()
  {
    assignment_expressionImpl assignment_expression = new assignment_expressionImpl();
    return assignment_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_prototype createfunction_prototype()
  {
    function_prototypeImpl function_prototype = new function_prototypeImpl();
    return function_prototype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_declaration createparameter_declaration()
  {
    parameter_declarationImpl parameter_declaration = new parameter_declarationImpl();
    return parameter_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_declaration_list createparameter_declaration_list()
  {
    parameter_declaration_listImpl parameter_declaration_list = new parameter_declaration_listImpl();
    return parameter_declaration_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_identifier_and_init createdeclaration_identifier_and_init()
  {
    declaration_identifier_and_initImpl declaration_identifier_and_init = new declaration_identifier_and_initImpl();
    return declaration_identifier_and_init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public single_declaration createsingle_declaration()
  {
    single_declarationImpl single_declaration = new single_declarationImpl();
    return single_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration createdeclaration()
  {
    declarationImpl declaration = new declarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fully_specified_type createfully_specified_type()
  {
    fully_specified_typeImpl fully_specified_type = new fully_specified_typeImpl();
    return fully_specified_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier createtype_specifier()
  {
    type_specifierImpl type_specifier = new type_specifierImpl();
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public array_brackets createarray_brackets()
  {
    array_bracketsImpl array_brackets = new array_bracketsImpl();
    return array_brackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer createinitializer()
  {
    initializerImpl initializer = new initializerImpl();
    return initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_statement createdeclaration_statement()
  {
    declaration_statementImpl declaration_statement = new declaration_statementImpl();
    return declaration_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement createsimple_statement()
  {
    simple_statementImpl simple_statement = new simple_statementImpl();
    return simple_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement createcompound_statement()
  {
    compound_statementImpl compound_statement = new compound_statementImpl();
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_no_new_scope createstatement_no_new_scope()
  {
    statement_no_new_scopeImpl statement_no_new_scope = new statement_no_new_scopeImpl();
    return statement_no_new_scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement_no_new_scope createcompound_statement_no_new_scope()
  {
    compound_statement_no_new_scopeImpl compound_statement_no_new_scope = new compound_statement_no_new_scopeImpl();
    return compound_statement_no_new_scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement createexpression_statement()
  {
    expression_statementImpl expression_statement = new expression_statementImpl();
    return expression_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression createconstant_expression()
  {
    constant_expressionImpl constant_expression = new constant_expressionImpl();
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selection_statement createselection_statement()
  {
    selection_statementImpl selection_statement = new selection_statementImpl();
    return selection_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public condition createcondition()
  {
    conditionImpl condition = new conditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iteration_statement createiteration_statement()
  {
    iteration_statementImpl iteration_statement = new iteration_statementImpl();
    return iteration_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unroll_modifier createunroll_modifier()
  {
    unroll_modifierImpl unroll_modifier = new unroll_modifierImpl();
    return unroll_modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_init_statement createfor_init_statement()
  {
    for_init_statementImpl for_init_statement = new for_init_statementImpl();
    return for_init_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_rest_statement createfor_rest_statement()
  {
    for_rest_statementImpl for_rest_statement = new for_rest_statementImpl();
    return for_rest_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jump_statement createjump_statement()
  {
    jump_statementImpl jump_statement = new jump_statementImpl();
    return jump_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public translation_unit createtranslation_unit()
  {
    translation_unitImpl translation_unit = new translation_unitImpl();
    return translation_unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public external_declaration createexternal_declaration()
  {
    external_declarationImpl external_declaration = new external_declarationImpl();
    return external_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_definition createfunction_definition()
  {
    function_definitionImpl function_definition = new function_definitionImpl();
    return function_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public glue_block createglue_block()
  {
    glue_blockImpl glue_block = new glue_blockImpl();
    return glue_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecoraDslPackage getDecoraDslPackage()
  {
    return (DecoraDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DecoraDslPackage getPackage()
  {
    return DecoraDslPackage.eINSTANCE;
  }

} //DecoraDslFactoryImpl
