/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.util;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage
 * @generated
 */
public class DecoraDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DecoraDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecoraDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DecoraDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DecoraDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FIELD_SELECTION:
      {
        field_selection field_selection = (field_selection)theEObject;
        T result = casefield_selection(field_selection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.PRIMARY_EXPRESSION:
      {
        primary_expression primary_expression = (primary_expression)theEObject;
        T result = caseprimary_expression(primary_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.PRIMARY_OR_CALL:
      {
        primary_or_call primary_or_call = (primary_or_call)theEObject;
        T result = caseprimary_or_call(primary_or_call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.POSTFIX_EXPRESSION:
      {
        postfix_expression postfix_expression = (postfix_expression)theEObject;
        T result = casepostfix_expression(postfix_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FUNCTION_CALL:
      {
        function_call function_call = (function_call)theEObject;
        T result = casefunction_call(function_call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FUNCTION_CALL_PARAMETER_LIST:
      {
        function_call_parameter_list function_call_parameter_list = (function_call_parameter_list)theEObject;
        T result = casefunction_call_parameter_list(function_call_parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.UNARY_EXPRESSION:
      {
        unary_expression unary_expression = (unary_expression)theEObject;
        T result = caseunary_expression(unary_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.MULTIPLICATIVE_EXPRESSION:
      {
        multiplicative_expression multiplicative_expression = (multiplicative_expression)theEObject;
        T result = casemultiplicative_expression(multiplicative_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.ADDITIVE_EXPRESSION:
      {
        additive_expression additive_expression = (additive_expression)theEObject;
        T result = caseadditive_expression(additive_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.RELATIONAL_EXPRESSION:
      {
        relational_expression relational_expression = (relational_expression)theEObject;
        T result = caserelational_expression(relational_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.EQUALITY_EXPRESSION:
      {
        equality_expression equality_expression = (equality_expression)theEObject;
        T result = caseequality_expression(equality_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.LOGICAL_AND_EXPRESSION:
      {
        logical_and_expression logical_and_expression = (logical_and_expression)theEObject;
        T result = caselogical_and_expression(logical_and_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.LOGICAL_XOR_EXPRESSION:
      {
        logical_xor_expression logical_xor_expression = (logical_xor_expression)theEObject;
        T result = caselogical_xor_expression(logical_xor_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.LOGICAL_OR_EXPRESSION:
      {
        logical_or_expression logical_or_expression = (logical_or_expression)theEObject;
        T result = caselogical_or_expression(logical_or_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.TERNARY_PART:
      {
        ternary_part ternary_part = (ternary_part)theEObject;
        T result = caseternary_part(ternary_part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.CONDITIONAL_EXPRESSION:
      {
        conditional_expression conditional_expression = (conditional_expression)theEObject;
        T result = caseconditional_expression(conditional_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.ASSIGNMENT_EXPRESSION:
      {
        assignment_expression assignment_expression = (assignment_expression)theEObject;
        T result = caseassignment_expression(assignment_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseternary_part(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FUNCTION_PROTOTYPE:
      {
        function_prototype function_prototype = (function_prototype)theEObject;
        T result = casefunction_prototype(function_prototype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.PARAMETER_DECLARATION:
      {
        parameter_declaration parameter_declaration = (parameter_declaration)theEObject;
        T result = caseparameter_declaration(parameter_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.PARAMETER_DECLARATION_LIST:
      {
        parameter_declaration_list parameter_declaration_list = (parameter_declaration_list)theEObject;
        T result = caseparameter_declaration_list(parameter_declaration_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.DECLARATION_IDENTIFIER_AND_INIT:
      {
        declaration_identifier_and_init declaration_identifier_and_init = (declaration_identifier_and_init)theEObject;
        T result = casedeclaration_identifier_and_init(declaration_identifier_and_init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.SINGLE_DECLARATION:
      {
        single_declaration single_declaration = (single_declaration)theEObject;
        T result = casesingle_declaration(single_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.DECLARATION:
      {
        declaration declaration = (declaration)theEObject;
        T result = casedeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FULLY_SPECIFIED_TYPE:
      {
        fully_specified_type fully_specified_type = (fully_specified_type)theEObject;
        T result = casefully_specified_type(fully_specified_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.TYPE_SPECIFIER:
      {
        type_specifier type_specifier = (type_specifier)theEObject;
        T result = casetype_specifier(type_specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.ARRAY_BRACKETS:
      {
        array_brackets array_brackets = (array_brackets)theEObject;
        T result = casearray_brackets(array_brackets);
        if (result == null) result = casetype_specifier(array_brackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.INITIALIZER:
      {
        initializer initializer = (initializer)theEObject;
        T result = caseinitializer(initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.DECLARATION_STATEMENT:
      {
        declaration_statement declaration_statement = (declaration_statement)theEObject;
        T result = casedeclaration_statement(declaration_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.SIMPLE_STATEMENT:
      {
        simple_statement simple_statement = (simple_statement)theEObject;
        T result = casesimple_statement(simple_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.COMPOUND_STATEMENT:
      {
        compound_statement compound_statement = (compound_statement)theEObject;
        T result = casecompound_statement(compound_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.STATEMENT_NO_NEW_SCOPE:
      {
        statement_no_new_scope statement_no_new_scope = (statement_no_new_scope)theEObject;
        T result = casestatement_no_new_scope(statement_no_new_scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.COMPOUND_STATEMENT_NO_NEW_SCOPE:
      {
        compound_statement_no_new_scope compound_statement_no_new_scope = (compound_statement_no_new_scope)theEObject;
        T result = casecompound_statement_no_new_scope(compound_statement_no_new_scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.EXPRESSION_STATEMENT:
      {
        expression_statement expression_statement = (expression_statement)theEObject;
        T result = caseexpression_statement(expression_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.CONSTANT_EXPRESSION:
      {
        constant_expression constant_expression = (constant_expression)theEObject;
        T result = caseconstant_expression(constant_expression);
        if (result == null) result = casearray_brackets(constant_expression);
        if (result == null) result = casetype_specifier(constant_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.SELECTION_STATEMENT:
      {
        selection_statement selection_statement = (selection_statement)theEObject;
        T result = caseselection_statement(selection_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.CONDITION:
      {
        condition condition = (condition)theEObject;
        T result = casecondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.ITERATION_STATEMENT:
      {
        iteration_statement iteration_statement = (iteration_statement)theEObject;
        T result = caseiteration_statement(iteration_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.UNROLL_MODIFIER:
      {
        unroll_modifier unroll_modifier = (unroll_modifier)theEObject;
        T result = caseunroll_modifier(unroll_modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FOR_INIT_STATEMENT:
      {
        for_init_statement for_init_statement = (for_init_statement)theEObject;
        T result = casefor_init_statement(for_init_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FOR_REST_STATEMENT:
      {
        for_rest_statement for_rest_statement = (for_rest_statement)theEObject;
        T result = casefor_rest_statement(for_rest_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.JUMP_STATEMENT:
      {
        jump_statement jump_statement = (jump_statement)theEObject;
        T result = casejump_statement(jump_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.TRANSLATION_UNIT:
      {
        translation_unit translation_unit = (translation_unit)theEObject;
        T result = casetranslation_unit(translation_unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.EXTERNAL_DECLARATION:
      {
        external_declaration external_declaration = (external_declaration)theEObject;
        T result = caseexternal_declaration(external_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.FUNCTION_DEFINITION:
      {
        function_definition function_definition = (function_definition)theEObject;
        T result = casefunction_definition(function_definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecoraDslPackage.GLUE_BLOCK:
      {
        glue_block glue_block = (glue_block)theEObject;
        T result = caseglue_block(glue_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefield_selection(field_selection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimary_expression(primary_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary or call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary or call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimary_or_call(primary_or_call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>postfix expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>postfix expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepostfix_expression(postfix_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_call(function_call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function call parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function call parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_call_parameter_list(function_call_parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unary expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unary expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunary_expression(unary_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>multiplicative expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>multiplicative expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemultiplicative_expression(multiplicative_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>additive expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>additive expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseadditive_expression(additive_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>relational expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>relational expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserelational_expression(relational_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>equality expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>equality expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseequality_expression(equality_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical and expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical and expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_and_expression(logical_and_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical xor expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical xor expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_xor_expression(logical_xor_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical or expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical or expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_or_expression(logical_or_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ternary part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ternary part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseternary_part(ternary_part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conditional expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conditional expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconditional_expression(conditional_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assignment expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assignment expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassignment_expression(assignment_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function prototype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function prototype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_prototype(function_prototype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter_declaration(parameter_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter declaration list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter declaration list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter_declaration_list(parameter_declaration_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration identifier and init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration identifier and init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclaration_identifier_and_init(declaration_identifier_and_init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>single declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>single declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesingle_declaration(single_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclaration(declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fully specified type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fully specified type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefully_specified_type(fully_specified_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_specifier(type_specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearray_brackets(array_brackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinitializer(initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclaration_statement(declaration_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_statement(simple_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compound statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compound statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompound_statement(compound_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement no new scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement no new scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement_no_new_scope(statement_no_new_scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compound statement no new scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compound statement no new scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompound_statement_no_new_scope(compound_statement_no_new_scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression_statement(expression_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant_expression(constant_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>selection statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>selection statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselection_statement(selection_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecondition(condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iteration statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iteration statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiteration_statement(iteration_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unroll modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unroll modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunroll_modifier(unroll_modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for init statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for init statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefor_init_statement(for_init_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for rest statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for rest statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefor_rest_statement(for_rest_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>jump statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>jump statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casejump_statement(jump_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>translation unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>translation unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetranslation_unit(translation_unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>external declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>external declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexternal_declaration(external_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_definition(function_definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>glue block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>glue block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseglue_block(glue_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DecoraDslSwitch
