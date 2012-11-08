/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage
 * @generated
 */
public interface DecoraDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DecoraDslFactory eINSTANCE = at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.DecoraDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>field selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field selection</em>'.
   * @generated
   */
  field_selection createfield_selection();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>function call parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function call parameter list</em>'.
   * @generated
   */
  function_call_parameter_list createfunction_call_parameter_list();

  /**
   * Returns a new object of class '<em>ternary part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ternary part</em>'.
   * @generated
   */
  ternary_part createternary_part();

  /**
   * Returns a new object of class '<em>function prototype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function prototype</em>'.
   * @generated
   */
  function_prototype createfunction_prototype();

  /**
   * Returns a new object of class '<em>parameter declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter declaration</em>'.
   * @generated
   */
  parameter_declaration createparameter_declaration();

  /**
   * Returns a new object of class '<em>parameter declaration list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter declaration list</em>'.
   * @generated
   */
  parameter_declaration_list createparameter_declaration_list();

  /**
   * Returns a new object of class '<em>declaration identifier and init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration identifier and init</em>'.
   * @generated
   */
  declaration_identifier_and_init createdeclaration_identifier_and_init();

  /**
   * Returns a new object of class '<em>single declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>single declaration</em>'.
   * @generated
   */
  single_declaration createsingle_declaration();

  /**
   * Returns a new object of class '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration</em>'.
   * @generated
   */
  declaration createdeclaration();

  /**
   * Returns a new object of class '<em>fully specified type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>fully specified type</em>'.
   * @generated
   */
  fully_specified_type createfully_specified_type();

  /**
   * Returns a new object of class '<em>type specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type specifier</em>'.
   * @generated
   */
  type_specifier createtype_specifier();

  /**
   * Returns a new object of class '<em>array brackets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array brackets</em>'.
   * @generated
   */
  array_brackets createarray_brackets();

  /**
   * Returns a new object of class '<em>initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>initializer</em>'.
   * @generated
   */
  initializer createinitializer();

  /**
   * Returns a new object of class '<em>declaration statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration statement</em>'.
   * @generated
   */
  declaration_statement createdeclaration_statement();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>simple statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple statement</em>'.
   * @generated
   */
  simple_statement createsimple_statement();

  /**
   * Returns a new object of class '<em>compound statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compound statement</em>'.
   * @generated
   */
  compound_statement createcompound_statement();

  /**
   * Returns a new object of class '<em>statement no new scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement no new scope</em>'.
   * @generated
   */
  statement_no_new_scope createstatement_no_new_scope();

  /**
   * Returns a new object of class '<em>compound statement no new scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compound statement no new scope</em>'.
   * @generated
   */
  compound_statement_no_new_scope createcompound_statement_no_new_scope();

  /**
   * Returns a new object of class '<em>expression statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression statement</em>'.
   * @generated
   */
  expression_statement createexpression_statement();

  /**
   * Returns a new object of class '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant expression</em>'.
   * @generated
   */
  constant_expression createconstant_expression();

  /**
   * Returns a new object of class '<em>selection statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selection statement</em>'.
   * @generated
   */
  selection_statement createselection_statement();

  /**
   * Returns a new object of class '<em>condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>condition</em>'.
   * @generated
   */
  condition createcondition();

  /**
   * Returns a new object of class '<em>iteration statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>iteration statement</em>'.
   * @generated
   */
  iteration_statement createiteration_statement();

  /**
   * Returns a new object of class '<em>unroll modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unroll modifier</em>'.
   * @generated
   */
  unroll_modifier createunroll_modifier();

  /**
   * Returns a new object of class '<em>for init statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for init statement</em>'.
   * @generated
   */
  for_init_statement createfor_init_statement();

  /**
   * Returns a new object of class '<em>for rest statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for rest statement</em>'.
   * @generated
   */
  for_rest_statement createfor_rest_statement();

  /**
   * Returns a new object of class '<em>jump statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>jump statement</em>'.
   * @generated
   */
  jump_statement createjump_statement();

  /**
   * Returns a new object of class '<em>translation unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>translation unit</em>'.
   * @generated
   */
  translation_unit createtranslation_unit();

  /**
   * Returns a new object of class '<em>external declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>external declaration</em>'.
   * @generated
   */
  external_declaration createexternal_declaration();

  /**
   * Returns a new object of class '<em>function definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function definition</em>'.
   * @generated
   */
  function_definition createfunction_definition();

  /**
   * Returns a new object of class '<em>glue block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>glue block</em>'.
   * @generated
   */
  glue_block createglue_block();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DecoraDslPackage getDecoraDslPackage();

} //DecoraDslFactory
