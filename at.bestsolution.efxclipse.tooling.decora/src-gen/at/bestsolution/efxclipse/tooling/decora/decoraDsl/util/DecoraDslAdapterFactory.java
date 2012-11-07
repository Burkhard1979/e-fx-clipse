/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.util;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage
 * @generated
 */
public class DecoraDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DecoraDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecoraDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DecoraDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecoraDslSwitch<Adapter> modelSwitch =
    new DecoraDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casefield_selection(field_selection object)
      {
        return createfield_selectionAdapter();
      }
      @Override
      public Adapter caseprimary_expression(primary_expression object)
      {
        return createprimary_expressionAdapter();
      }
      @Override
      public Adapter caseprimary_or_call(primary_or_call object)
      {
        return createprimary_or_callAdapter();
      }
      @Override
      public Adapter casepostfix_expression(postfix_expression object)
      {
        return createpostfix_expressionAdapter();
      }
      @Override
      public Adapter casefunction_call(function_call object)
      {
        return createfunction_callAdapter();
      }
      @Override
      public Adapter casefunction_call_parameter_list(function_call_parameter_list object)
      {
        return createfunction_call_parameter_listAdapter();
      }
      @Override
      public Adapter caseunary_expression(unary_expression object)
      {
        return createunary_expressionAdapter();
      }
      @Override
      public Adapter casemultiplicative_expression(multiplicative_expression object)
      {
        return createmultiplicative_expressionAdapter();
      }
      @Override
      public Adapter caseadditive_expression(additive_expression object)
      {
        return createadditive_expressionAdapter();
      }
      @Override
      public Adapter caserelational_expression(relational_expression object)
      {
        return createrelational_expressionAdapter();
      }
      @Override
      public Adapter caseequality_expression(equality_expression object)
      {
        return createequality_expressionAdapter();
      }
      @Override
      public Adapter caselogical_and_expression(logical_and_expression object)
      {
        return createlogical_and_expressionAdapter();
      }
      @Override
      public Adapter caselogical_xor_expression(logical_xor_expression object)
      {
        return createlogical_xor_expressionAdapter();
      }
      @Override
      public Adapter caselogical_or_expression(logical_or_expression object)
      {
        return createlogical_or_expressionAdapter();
      }
      @Override
      public Adapter caseternary_part(ternary_part object)
      {
        return createternary_partAdapter();
      }
      @Override
      public Adapter caseconditional_expression(conditional_expression object)
      {
        return createconditional_expressionAdapter();
      }
      @Override
      public Adapter caseassignment_expression(assignment_expression object)
      {
        return createassignment_expressionAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter casefunction_prototype(function_prototype object)
      {
        return createfunction_prototypeAdapter();
      }
      @Override
      public Adapter caseparameter_declaration(parameter_declaration object)
      {
        return createparameter_declarationAdapter();
      }
      @Override
      public Adapter caseparameter_declaration_list(parameter_declaration_list object)
      {
        return createparameter_declaration_listAdapter();
      }
      @Override
      public Adapter casedeclaration_identifier_and_init(declaration_identifier_and_init object)
      {
        return createdeclaration_identifier_and_initAdapter();
      }
      @Override
      public Adapter casesingle_declaration(single_declaration object)
      {
        return createsingle_declarationAdapter();
      }
      @Override
      public Adapter casedeclaration(declaration object)
      {
        return createdeclarationAdapter();
      }
      @Override
      public Adapter casefully_specified_type(fully_specified_type object)
      {
        return createfully_specified_typeAdapter();
      }
      @Override
      public Adapter casetype_specifier(type_specifier object)
      {
        return createtype_specifierAdapter();
      }
      @Override
      public Adapter casearray_brackets(array_brackets object)
      {
        return createarray_bracketsAdapter();
      }
      @Override
      public Adapter caseinitializer(initializer object)
      {
        return createinitializerAdapter();
      }
      @Override
      public Adapter casedeclaration_statement(declaration_statement object)
      {
        return createdeclaration_statementAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter casesimple_statement(simple_statement object)
      {
        return createsimple_statementAdapter();
      }
      @Override
      public Adapter casecompound_statement(compound_statement object)
      {
        return createcompound_statementAdapter();
      }
      @Override
      public Adapter casestatement_no_new_scope(statement_no_new_scope object)
      {
        return createstatement_no_new_scopeAdapter();
      }
      @Override
      public Adapter casecompound_statement_no_new_scope(compound_statement_no_new_scope object)
      {
        return createcompound_statement_no_new_scopeAdapter();
      }
      @Override
      public Adapter caseexpression_statement(expression_statement object)
      {
        return createexpression_statementAdapter();
      }
      @Override
      public Adapter caseconstant_expression(constant_expression object)
      {
        return createconstant_expressionAdapter();
      }
      @Override
      public Adapter caseselection_statement(selection_statement object)
      {
        return createselection_statementAdapter();
      }
      @Override
      public Adapter casecondition(condition object)
      {
        return createconditionAdapter();
      }
      @Override
      public Adapter caseiteration_statement(iteration_statement object)
      {
        return createiteration_statementAdapter();
      }
      @Override
      public Adapter caseunroll_modifier(unroll_modifier object)
      {
        return createunroll_modifierAdapter();
      }
      @Override
      public Adapter casefor_init_statement(for_init_statement object)
      {
        return createfor_init_statementAdapter();
      }
      @Override
      public Adapter casefor_rest_statement(for_rest_statement object)
      {
        return createfor_rest_statementAdapter();
      }
      @Override
      public Adapter casejump_statement(jump_statement object)
      {
        return createjump_statementAdapter();
      }
      @Override
      public Adapter casetranslation_unit(translation_unit object)
      {
        return createtranslation_unitAdapter();
      }
      @Override
      public Adapter caseexternal_declaration(external_declaration object)
      {
        return createexternal_declarationAdapter();
      }
      @Override
      public Adapter casefunction_definition(function_definition object)
      {
        return createfunction_definitionAdapter();
      }
      @Override
      public Adapter caseglue_block(glue_block object)
      {
        return createglue_blockAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection <em>field selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection
   * @generated
   */
  public Adapter createfield_selectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_expression <em>primary expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_expression
   * @generated
   */
  public Adapter createprimary_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_or_call <em>primary or call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_or_call
   * @generated
   */
  public Adapter createprimary_or_callAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.postfix_expression <em>postfix expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.postfix_expression
   * @generated
   */
  public Adapter createpostfix_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call <em>function call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call
   * @generated
   */
  public Adapter createfunction_callAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list <em>function call parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list
   * @generated
   */
  public Adapter createfunction_call_parameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.unary_expression <em>unary expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.unary_expression
   * @generated
   */
  public Adapter createunary_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.multiplicative_expression <em>multiplicative expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.multiplicative_expression
   * @generated
   */
  public Adapter createmultiplicative_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.additive_expression <em>additive expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.additive_expression
   * @generated
   */
  public Adapter createadditive_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.relational_expression <em>relational expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.relational_expression
   * @generated
   */
  public Adapter createrelational_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.equality_expression <em>equality expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.equality_expression
   * @generated
   */
  public Adapter createequality_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_and_expression <em>logical and expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_and_expression
   * @generated
   */
  public Adapter createlogical_and_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_xor_expression <em>logical xor expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_xor_expression
   * @generated
   */
  public Adapter createlogical_xor_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_or_expression <em>logical or expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_or_expression
   * @generated
   */
  public Adapter createlogical_or_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.ternary_part <em>ternary part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.ternary_part
   * @generated
   */
  public Adapter createternary_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.conditional_expression <em>conditional expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.conditional_expression
   * @generated
   */
  public Adapter createconditional_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.assignment_expression <em>assignment expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.assignment_expression
   * @generated
   */
  public Adapter createassignment_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype <em>function prototype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype
   * @generated
   */
  public Adapter createfunction_prototypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration <em>parameter declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration
   * @generated
   */
  public Adapter createparameter_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list <em>parameter declaration list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list
   * @generated
   */
  public Adapter createparameter_declaration_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init <em>declaration identifier and init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init
   * @generated
   */
  public Adapter createdeclaration_identifier_and_initAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration <em>single declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration
   * @generated
   */
  public Adapter createsingle_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration <em>declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration
   * @generated
   */
  public Adapter createdeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type <em>fully specified type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type
   * @generated
   */
  public Adapter createfully_specified_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier <em>type specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier
   * @generated
   */
  public Adapter createtype_specifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.array_brackets <em>array brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.array_brackets
   * @generated
   */
  public Adapter createarray_bracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer <em>initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer
   * @generated
   */
  public Adapter createinitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement <em>declaration statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement
   * @generated
   */
  public Adapter createdeclaration_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement <em>simple statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement
   * @generated
   */
  public Adapter createsimple_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement <em>compound statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement
   * @generated
   */
  public Adapter createcompound_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope <em>statement no new scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope
   * @generated
   */
  public Adapter createstatement_no_new_scopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope <em>compound statement no new scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope
   * @generated
   */
  public Adapter createcompound_statement_no_new_scopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement <em>expression statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement
   * @generated
   */
  public Adapter createexpression_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression
   * @generated
   */
  public Adapter createconstant_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement <em>selection statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement
   * @generated
   */
  public Adapter createselection_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition <em>condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition
   * @generated
   */
  public Adapter createconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement <em>iteration statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement
   * @generated
   */
  public Adapter createiteration_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier <em>unroll modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier
   * @generated
   */
  public Adapter createunroll_modifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement <em>for init statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement
   * @generated
   */
  public Adapter createfor_init_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement <em>for rest statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement
   * @generated
   */
  public Adapter createfor_rest_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement <em>jump statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement
   * @generated
   */
  public Adapter createjump_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit <em>translation unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit
   * @generated
   */
  public Adapter createtranslation_unitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration <em>external declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration
   * @generated
   */
  public Adapter createexternal_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition <em>function definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition
   * @generated
   */
  public Adapter createfunction_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block <em>glue block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block
   * @generated
   */
  public Adapter createglue_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DecoraDslAdapterFactory
