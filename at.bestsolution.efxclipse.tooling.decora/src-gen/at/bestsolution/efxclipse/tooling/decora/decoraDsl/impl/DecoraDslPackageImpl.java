/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslFactory;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.Model;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.additive_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.array_brackets;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.assignment_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.compound_statement_no_new_scope;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.condition;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.conditional_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.constant_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_identifier_and_init;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.equality_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.external_declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.field_selection;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_rest_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.fully_specified_type;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_call_parameter_list;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_definition;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.function_prototype;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.glue_block;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.initializer;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.iteration_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.jump_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_and_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_or_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.logical_xor_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.multiplicative_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.parameter_declaration_list;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.postfix_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.primary_or_call;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.relational_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.selection_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.simple_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.single_declaration;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.statement_no_new_scope;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.ternary_part;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.translation_unit;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.type_specifier;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.unary_expression;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.unroll_modifier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecoraDslPackageImpl extends EPackageImpl implements DecoraDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_selectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primary_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primary_or_callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postfix_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_call_parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unary_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicative_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additive_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relational_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equality_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_and_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_xor_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_or_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ternary_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditional_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignment_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_prototypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_declaration_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaration_identifier_and_initEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass single_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fully_specified_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_bracketsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaration_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compound_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_no_new_scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compound_statement_no_new_scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selection_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iteration_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unroll_modifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_init_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_rest_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jump_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass translation_unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass external_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass glue_blockEClass = null;

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
   * @see at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DecoraDslPackageImpl()
  {
    super(eNS_URI, DecoraDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DecoraDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DecoraDslPackage init()
  {
    if (isInited) return (DecoraDslPackage)EPackage.Registry.INSTANCE.getEPackage(DecoraDslPackage.eNS_URI);

    // Obtain or create and register package
    DecoraDslPackageImpl theDecoraDslPackage = (DecoraDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DecoraDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DecoraDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDecoraDslPackage.createPackageContents();

    // Initialize created meta-data
    theDecoraDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDecoraDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DecoraDslPackage.eNS_URI, theDecoraDslPackage);
    return theDecoraDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Unit()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfield_selection()
  {
    return field_selectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfield_selection_R()
  {
    return (EAttribute)field_selectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfield_selection_X()
  {
    return (EAttribute)field_selectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprimary_expression()
  {
    return primary_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimary_expression_E()
  {
    return (EReference)primary_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprimary_or_call()
  {
    return primary_or_callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimary_or_call_E()
  {
    return (EReference)primary_or_callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimary_or_call_F()
  {
    return (EReference)primary_or_callEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpostfix_expression()
  {
    return postfix_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpostfix_expression_E()
  {
    return (EReference)postfix_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpostfix_expression_Ae()
  {
    return (EReference)postfix_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpostfix_expression_Fs()
  {
    return (EReference)postfix_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_call()
  {
    return function_callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_call_Id()
  {
    return (EAttribute)function_callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_call_P()
  {
    return (EReference)function_callEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_call_Ts()
  {
    return (EReference)function_callEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_call_parameter_list()
  {
    return function_call_parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_call_parameter_list_A()
  {
    return (EReference)function_call_parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunary_expression()
  {
    return unary_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunary_expression_P()
  {
    return (EReference)unary_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunary_expression_U()
  {
    return (EReference)unary_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmultiplicative_expression()
  {
    return multiplicative_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmultiplicative_expression_A()
  {
    return (EReference)multiplicative_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmultiplicative_expression_B()
  {
    return (EReference)multiplicative_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getadditive_expression()
  {
    return additive_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getadditive_expression_A()
  {
    return (EReference)additive_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getadditive_expression_B()
  {
    return (EReference)additive_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrelational_expression()
  {
    return relational_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrelational_expression_A()
  {
    return (EReference)relational_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrelational_expression_B()
  {
    return (EReference)relational_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getequality_expression()
  {
    return equality_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getequality_expression_A()
  {
    return (EReference)equality_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getequality_expression_B()
  {
    return (EReference)equality_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_and_expression()
  {
    return logical_and_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_and_expression_A()
  {
    return (EReference)logical_and_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_and_expression_B()
  {
    return (EReference)logical_and_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_xor_expression()
  {
    return logical_xor_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_xor_expression_A()
  {
    return (EReference)logical_xor_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_xor_expression_B()
  {
    return (EReference)logical_xor_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_or_expression()
  {
    return logical_or_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_or_expression_A()
  {
    return (EReference)logical_or_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_or_expression_B()
  {
    return (EReference)logical_or_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getternary_part()
  {
    return ternary_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconditional_expression()
  {
    return conditional_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconditional_expression_A()
  {
    return (EReference)conditional_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconditional_expression_T()
  {
    return (EReference)conditional_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassignment_expression()
  {
    return assignment_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignment_expression_A()
  {
    return (EReference)assignment_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getassignment_expression_Op()
  {
    return (EAttribute)assignment_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignment_expression_B()
  {
    return (EReference)assignment_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignment_expression_C()
  {
    return (EReference)assignment_expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_A()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_E()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_prototype()
  {
    return function_prototypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_prototype_T()
  {
    return (EReference)function_prototypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_prototype_Id()
  {
    return (EAttribute)function_prototypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_prototype_P()
  {
    return (EReference)function_prototypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter_declaration()
  {
    return parameter_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_declaration_T()
  {
    return (EReference)parameter_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameter_declaration_Id()
  {
    return (EAttribute)parameter_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter_declaration_list()
  {
    return parameter_declaration_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_declaration_list_P()
  {
    return (EReference)parameter_declaration_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdeclaration_identifier_and_init()
  {
    return declaration_identifier_and_initEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdeclaration_identifier_and_init_Id()
  {
    return (EAttribute)declaration_identifier_and_initEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdeclaration_identifier_and_init_Ae()
  {
    return (EReference)declaration_identifier_and_initEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdeclaration_identifier_and_init_E()
  {
    return (EReference)declaration_identifier_and_initEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsingle_declaration()
  {
    return single_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsingle_declaration_T()
  {
    return (EReference)single_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsingle_declaration_D()
  {
    return (EReference)single_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdeclaration_S()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdeclaration_D()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfully_specified_type()
  {
    return fully_specified_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfully_specified_type_Tq()
  {
    return (EAttribute)fully_specified_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfully_specified_type_Tp()
  {
    return (EAttribute)fully_specified_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfully_specified_type_Ts()
  {
    return (EReference)fully_specified_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_specifier()
  {
    return type_specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarray_brackets()
  {
    return array_bracketsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinitializer()
  {
    return initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinitializer_E()
  {
    return (EReference)initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdeclaration_statement()
  {
    return declaration_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdeclaration_statement_D()
  {
    return (EReference)declaration_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_C()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_S()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_statement()
  {
    return simple_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_D()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_E()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_S()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_I()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_J()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompound_statement()
  {
    return compound_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompound_statement_S()
  {
    return (EReference)compound_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement_no_new_scope()
  {
    return statement_no_new_scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_no_new_scope_C()
  {
    return (EReference)statement_no_new_scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_no_new_scope_S()
  {
    return (EReference)statement_no_new_scopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompound_statement_no_new_scope()
  {
    return compound_statement_no_new_scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompound_statement_no_new_scope_S()
  {
    return (EReference)compound_statement_no_new_scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression_statement()
  {
    return expression_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_statement_E()
  {
    return (EReference)expression_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_expression()
  {
    return constant_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_expression_C()
  {
    return (EReference)constant_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselection_statement()
  {
    return selection_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselection_statement_E()
  {
    return (EReference)selection_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselection_statement_A()
  {
    return (EReference)selection_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselection_statement_B()
  {
    return (EReference)selection_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcondition_E()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiteration_statement()
  {
    return iteration_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_C()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_Snns()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_S()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_E()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_U()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_Init()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getiteration_statement_Rem()
  {
    return (EReference)iteration_statementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunroll_modifier()
  {
    return unroll_modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getunroll_modifier_M()
  {
    return (EAttribute)unroll_modifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getunroll_modifier_C()
  {
    return (EAttribute)unroll_modifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfor_init_statement()
  {
    return for_init_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_init_statement_E()
  {
    return (EReference)for_init_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_init_statement_D()
  {
    return (EReference)for_init_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfor_rest_statement()
  {
    return for_rest_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_rest_statement_C()
  {
    return (EReference)for_rest_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_rest_statement_E()
  {
    return (EReference)for_rest_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getjump_statement()
  {
    return jump_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getjump_statement_E()
  {
    return (EReference)jump_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettranslation_unit()
  {
    return translation_unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettranslation_unit_E()
  {
    return (EReference)translation_unitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexternal_declaration()
  {
    return external_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexternal_declaration_F()
  {
    return (EReference)external_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexternal_declaration_D()
  {
    return (EReference)external_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexternal_declaration_G()
  {
    return (EReference)external_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_definition()
  {
    return function_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_definition_P()
  {
    return (EReference)function_definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_definition_S()
  {
    return (EReference)function_definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getglue_block()
  {
    return glue_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getglue_block_G()
  {
    return (EAttribute)glue_blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecoraDslFactory getDecoraDslFactory()
  {
    return (DecoraDslFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__UNIT);

    field_selectionEClass = createEClass(FIELD_SELECTION);
    createEAttribute(field_selectionEClass, FIELD_SELECTION__R);
    createEAttribute(field_selectionEClass, FIELD_SELECTION__X);

    primary_expressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primary_expressionEClass, PRIMARY_EXPRESSION__E);

    primary_or_callEClass = createEClass(PRIMARY_OR_CALL);
    createEReference(primary_or_callEClass, PRIMARY_OR_CALL__E);
    createEReference(primary_or_callEClass, PRIMARY_OR_CALL__F);

    postfix_expressionEClass = createEClass(POSTFIX_EXPRESSION);
    createEReference(postfix_expressionEClass, POSTFIX_EXPRESSION__E);
    createEReference(postfix_expressionEClass, POSTFIX_EXPRESSION__AE);
    createEReference(postfix_expressionEClass, POSTFIX_EXPRESSION__FS);

    function_callEClass = createEClass(FUNCTION_CALL);
    createEAttribute(function_callEClass, FUNCTION_CALL__ID);
    createEReference(function_callEClass, FUNCTION_CALL__P);
    createEReference(function_callEClass, FUNCTION_CALL__TS);

    function_call_parameter_listEClass = createEClass(FUNCTION_CALL_PARAMETER_LIST);
    createEReference(function_call_parameter_listEClass, FUNCTION_CALL_PARAMETER_LIST__A);

    unary_expressionEClass = createEClass(UNARY_EXPRESSION);
    createEReference(unary_expressionEClass, UNARY_EXPRESSION__P);
    createEReference(unary_expressionEClass, UNARY_EXPRESSION__U);

    multiplicative_expressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEReference(multiplicative_expressionEClass, MULTIPLICATIVE_EXPRESSION__A);
    createEReference(multiplicative_expressionEClass, MULTIPLICATIVE_EXPRESSION__B);

    additive_expressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additive_expressionEClass, ADDITIVE_EXPRESSION__A);
    createEReference(additive_expressionEClass, ADDITIVE_EXPRESSION__B);

    relational_expressionEClass = createEClass(RELATIONAL_EXPRESSION);
    createEReference(relational_expressionEClass, RELATIONAL_EXPRESSION__A);
    createEReference(relational_expressionEClass, RELATIONAL_EXPRESSION__B);

    equality_expressionEClass = createEClass(EQUALITY_EXPRESSION);
    createEReference(equality_expressionEClass, EQUALITY_EXPRESSION__A);
    createEReference(equality_expressionEClass, EQUALITY_EXPRESSION__B);

    logical_and_expressionEClass = createEClass(LOGICAL_AND_EXPRESSION);
    createEReference(logical_and_expressionEClass, LOGICAL_AND_EXPRESSION__A);
    createEReference(logical_and_expressionEClass, LOGICAL_AND_EXPRESSION__B);

    logical_xor_expressionEClass = createEClass(LOGICAL_XOR_EXPRESSION);
    createEReference(logical_xor_expressionEClass, LOGICAL_XOR_EXPRESSION__A);
    createEReference(logical_xor_expressionEClass, LOGICAL_XOR_EXPRESSION__B);

    logical_or_expressionEClass = createEClass(LOGICAL_OR_EXPRESSION);
    createEReference(logical_or_expressionEClass, LOGICAL_OR_EXPRESSION__A);
    createEReference(logical_or_expressionEClass, LOGICAL_OR_EXPRESSION__B);

    ternary_partEClass = createEClass(TERNARY_PART);

    conditional_expressionEClass = createEClass(CONDITIONAL_EXPRESSION);
    createEReference(conditional_expressionEClass, CONDITIONAL_EXPRESSION__A);
    createEReference(conditional_expressionEClass, CONDITIONAL_EXPRESSION__T);

    assignment_expressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
    createEReference(assignment_expressionEClass, ASSIGNMENT_EXPRESSION__A);
    createEAttribute(assignment_expressionEClass, ASSIGNMENT_EXPRESSION__OP);
    createEReference(assignment_expressionEClass, ASSIGNMENT_EXPRESSION__B);
    createEReference(assignment_expressionEClass, ASSIGNMENT_EXPRESSION__C);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__A);
    createEReference(expressionEClass, EXPRESSION__E);

    function_prototypeEClass = createEClass(FUNCTION_PROTOTYPE);
    createEReference(function_prototypeEClass, FUNCTION_PROTOTYPE__T);
    createEAttribute(function_prototypeEClass, FUNCTION_PROTOTYPE__ID);
    createEReference(function_prototypeEClass, FUNCTION_PROTOTYPE__P);

    parameter_declarationEClass = createEClass(PARAMETER_DECLARATION);
    createEReference(parameter_declarationEClass, PARAMETER_DECLARATION__T);
    createEAttribute(parameter_declarationEClass, PARAMETER_DECLARATION__ID);

    parameter_declaration_listEClass = createEClass(PARAMETER_DECLARATION_LIST);
    createEReference(parameter_declaration_listEClass, PARAMETER_DECLARATION_LIST__P);

    declaration_identifier_and_initEClass = createEClass(DECLARATION_IDENTIFIER_AND_INIT);
    createEAttribute(declaration_identifier_and_initEClass, DECLARATION_IDENTIFIER_AND_INIT__ID);
    createEReference(declaration_identifier_and_initEClass, DECLARATION_IDENTIFIER_AND_INIT__AE);
    createEReference(declaration_identifier_and_initEClass, DECLARATION_IDENTIFIER_AND_INIT__E);

    single_declarationEClass = createEClass(SINGLE_DECLARATION);
    createEReference(single_declarationEClass, SINGLE_DECLARATION__T);
    createEReference(single_declarationEClass, SINGLE_DECLARATION__D);

    declarationEClass = createEClass(DECLARATION);
    createEReference(declarationEClass, DECLARATION__S);
    createEReference(declarationEClass, DECLARATION__D);

    fully_specified_typeEClass = createEClass(FULLY_SPECIFIED_TYPE);
    createEAttribute(fully_specified_typeEClass, FULLY_SPECIFIED_TYPE__TQ);
    createEAttribute(fully_specified_typeEClass, FULLY_SPECIFIED_TYPE__TP);
    createEReference(fully_specified_typeEClass, FULLY_SPECIFIED_TYPE__TS);

    type_specifierEClass = createEClass(TYPE_SPECIFIER);

    array_bracketsEClass = createEClass(ARRAY_BRACKETS);

    initializerEClass = createEClass(INITIALIZER);
    createEReference(initializerEClass, INITIALIZER__E);

    declaration_statementEClass = createEClass(DECLARATION_STATEMENT);
    createEReference(declaration_statementEClass, DECLARATION_STATEMENT__D);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__C);
    createEReference(statementEClass, STATEMENT__S);

    simple_statementEClass = createEClass(SIMPLE_STATEMENT);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__D);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__E);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__S);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__I);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__J);

    compound_statementEClass = createEClass(COMPOUND_STATEMENT);
    createEReference(compound_statementEClass, COMPOUND_STATEMENT__S);

    statement_no_new_scopeEClass = createEClass(STATEMENT_NO_NEW_SCOPE);
    createEReference(statement_no_new_scopeEClass, STATEMENT_NO_NEW_SCOPE__C);
    createEReference(statement_no_new_scopeEClass, STATEMENT_NO_NEW_SCOPE__S);

    compound_statement_no_new_scopeEClass = createEClass(COMPOUND_STATEMENT_NO_NEW_SCOPE);
    createEReference(compound_statement_no_new_scopeEClass, COMPOUND_STATEMENT_NO_NEW_SCOPE__S);

    expression_statementEClass = createEClass(EXPRESSION_STATEMENT);
    createEReference(expression_statementEClass, EXPRESSION_STATEMENT__E);

    constant_expressionEClass = createEClass(CONSTANT_EXPRESSION);
    createEReference(constant_expressionEClass, CONSTANT_EXPRESSION__C);

    selection_statementEClass = createEClass(SELECTION_STATEMENT);
    createEReference(selection_statementEClass, SELECTION_STATEMENT__E);
    createEReference(selection_statementEClass, SELECTION_STATEMENT__A);
    createEReference(selection_statementEClass, SELECTION_STATEMENT__B);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__E);

    iteration_statementEClass = createEClass(ITERATION_STATEMENT);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__C);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__SNNS);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__S);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__E);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__U);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__INIT);
    createEReference(iteration_statementEClass, ITERATION_STATEMENT__REM);

    unroll_modifierEClass = createEClass(UNROLL_MODIFIER);
    createEAttribute(unroll_modifierEClass, UNROLL_MODIFIER__M);
    createEAttribute(unroll_modifierEClass, UNROLL_MODIFIER__C);

    for_init_statementEClass = createEClass(FOR_INIT_STATEMENT);
    createEReference(for_init_statementEClass, FOR_INIT_STATEMENT__E);
    createEReference(for_init_statementEClass, FOR_INIT_STATEMENT__D);

    for_rest_statementEClass = createEClass(FOR_REST_STATEMENT);
    createEReference(for_rest_statementEClass, FOR_REST_STATEMENT__C);
    createEReference(for_rest_statementEClass, FOR_REST_STATEMENT__E);

    jump_statementEClass = createEClass(JUMP_STATEMENT);
    createEReference(jump_statementEClass, JUMP_STATEMENT__E);

    translation_unitEClass = createEClass(TRANSLATION_UNIT);
    createEReference(translation_unitEClass, TRANSLATION_UNIT__E);

    external_declarationEClass = createEClass(EXTERNAL_DECLARATION);
    createEReference(external_declarationEClass, EXTERNAL_DECLARATION__F);
    createEReference(external_declarationEClass, EXTERNAL_DECLARATION__D);
    createEReference(external_declarationEClass, EXTERNAL_DECLARATION__G);

    function_definitionEClass = createEClass(FUNCTION_DEFINITION);
    createEReference(function_definitionEClass, FUNCTION_DEFINITION__P);
    createEReference(function_definitionEClass, FUNCTION_DEFINITION__S);

    glue_blockEClass = createEClass(GLUE_BLOCK);
    createEAttribute(glue_blockEClass, GLUE_BLOCK__G);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    expressionEClass.getESuperTypes().add(this.getternary_part());
    array_bracketsEClass.getESuperTypes().add(this.gettype_specifier());
    constant_expressionEClass.getESuperTypes().add(this.getarray_brackets());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Unit(), this.gettranslation_unit(), null, "unit", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_selectionEClass, field_selection.class, "field_selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfield_selection_R(), ecorePackage.getEString(), "r", null, 0, 1, field_selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfield_selection_X(), ecorePackage.getEString(), "x", null, 0, 1, field_selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primary_expressionEClass, primary_expression.class, "primary_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprimary_expression_E(), this.getexpression(), null, "e", null, 0, 1, primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primary_or_callEClass, primary_or_call.class, "primary_or_call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprimary_or_call_E(), this.getprimary_expression(), null, "e", null, 0, 1, primary_or_call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprimary_or_call_F(), this.getfunction_call(), null, "f", null, 0, 1, primary_or_call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postfix_expressionEClass, postfix_expression.class, "postfix_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpostfix_expression_E(), this.getprimary_or_call(), null, "e", null, 0, 1, postfix_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpostfix_expression_Ae(), this.getexpression(), null, "ae", null, 0, 1, postfix_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpostfix_expression_Fs(), this.getfield_selection(), null, "fs", null, 0, 1, postfix_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_callEClass, function_call.class, "function_call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunction_call_Id(), ecorePackage.getEString(), "id", null, 0, 1, function_call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_call_P(), this.getfunction_call_parameter_list(), null, "p", null, 0, 1, function_call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_call_Ts(), this.gettype_specifier(), null, "ts", null, 0, 1, function_call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_call_parameter_listEClass, function_call_parameter_list.class, "function_call_parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunction_call_parameter_list_A(), this.getassignment_expression(), null, "a", null, 0, -1, function_call_parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unary_expressionEClass, unary_expression.class, "unary_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunary_expression_P(), this.getpostfix_expression(), null, "p", null, 0, 1, unary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunary_expression_U(), this.getunary_expression(), null, "u", null, 0, 1, unary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicative_expressionEClass, multiplicative_expression.class, "multiplicative_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmultiplicative_expression_A(), this.getunary_expression(), null, "a", null, 0, 1, multiplicative_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmultiplicative_expression_B(), this.getmultiplicative_expression(), null, "b", null, 0, -1, multiplicative_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additive_expressionEClass, additive_expression.class, "additive_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getadditive_expression_A(), this.getmultiplicative_expression(), null, "a", null, 0, 1, additive_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getadditive_expression_B(), this.getmultiplicative_expression(), null, "b", null, 0, -1, additive_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relational_expressionEClass, relational_expression.class, "relational_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrelational_expression_A(), this.getadditive_expression(), null, "a", null, 0, 1, relational_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrelational_expression_B(), this.getadditive_expression(), null, "b", null, 0, -1, relational_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equality_expressionEClass, equality_expression.class, "equality_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getequality_expression_A(), this.getrelational_expression(), null, "a", null, 0, 1, equality_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getequality_expression_B(), this.getrelational_expression(), null, "b", null, 0, -1, equality_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_and_expressionEClass, logical_and_expression.class, "logical_and_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogical_and_expression_A(), this.getequality_expression(), null, "a", null, 0, 1, logical_and_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_and_expression_B(), this.getequality_expression(), null, "b", null, 0, -1, logical_and_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_xor_expressionEClass, logical_xor_expression.class, "logical_xor_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogical_xor_expression_A(), this.getlogical_and_expression(), null, "a", null, 0, 1, logical_xor_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_xor_expression_B(), this.getlogical_and_expression(), null, "b", null, 0, -1, logical_xor_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_or_expressionEClass, logical_or_expression.class, "logical_or_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogical_or_expression_A(), this.getlogical_xor_expression(), null, "a", null, 0, 1, logical_or_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_or_expression_B(), this.getlogical_xor_expression(), null, "b", null, 0, -1, logical_or_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ternary_partEClass, ternary_part.class, "ternary_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditional_expressionEClass, conditional_expression.class, "conditional_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconditional_expression_A(), this.getlogical_or_expression(), null, "a", null, 0, 1, conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconditional_expression_T(), this.getternary_part(), null, "t", null, 0, 1, conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignment_expressionEClass, assignment_expression.class, "assignment_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getassignment_expression_A(), this.getunary_expression(), null, "a", null, 0, 1, assignment_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getassignment_expression_Op(), ecorePackage.getEString(), "op", null, 0, 1, assignment_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getassignment_expression_B(), this.getassignment_expression(), null, "b", null, 0, 1, assignment_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getassignment_expression_C(), this.getconditional_expression(), null, "c", null, 0, 1, assignment_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_A(), this.getassignment_expression(), null, "a", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_E(), this.getassignment_expression(), null, "e", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_prototypeEClass, function_prototype.class, "function_prototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunction_prototype_T(), this.gettype_specifier(), null, "t", null, 0, 1, function_prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfunction_prototype_Id(), ecorePackage.getEString(), "id", null, 0, 1, function_prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_prototype_P(), this.getparameter_declaration_list(), null, "p", null, 0, 1, function_prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_declarationEClass, parameter_declaration.class, "parameter_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameter_declaration_T(), this.gettype_specifier(), null, "t", null, 0, 1, parameter_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameter_declaration_Id(), ecorePackage.getEString(), "id", null, 0, 1, parameter_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_declaration_listEClass, parameter_declaration_list.class, "parameter_declaration_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameter_declaration_list_P(), this.getparameter_declaration(), null, "p", null, 0, -1, parameter_declaration_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaration_identifier_and_initEClass, declaration_identifier_and_init.class, "declaration_identifier_and_init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdeclaration_identifier_and_init_Id(), ecorePackage.getEString(), "id", null, 0, 1, declaration_identifier_and_init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdeclaration_identifier_and_init_Ae(), this.getconstant_expression(), null, "ae", null, 0, 1, declaration_identifier_and_init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdeclaration_identifier_and_init_E(), this.getinitializer(), null, "e", null, 0, 1, declaration_identifier_and_init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(single_declarationEClass, single_declaration.class, "single_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsingle_declaration_T(), this.getfully_specified_type(), null, "t", null, 0, 1, single_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsingle_declaration_D(), this.getdeclaration_identifier_and_init(), null, "d", null, 0, 1, single_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, declaration.class, "declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdeclaration_S(), this.getsingle_declaration(), null, "s", null, 0, 1, declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdeclaration_D(), this.getdeclaration_identifier_and_init(), null, "d", null, 0, -1, declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fully_specified_typeEClass, fully_specified_type.class, "fully_specified_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfully_specified_type_Tq(), ecorePackage.getEString(), "tq", null, 0, 1, fully_specified_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfully_specified_type_Tp(), ecorePackage.getEString(), "tp", null, 0, 1, fully_specified_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfully_specified_type_Ts(), this.gettype_specifier(), null, "ts", null, 0, 1, fully_specified_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_specifierEClass, type_specifier.class, "type_specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(array_bracketsEClass, array_brackets.class, "array_brackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initializerEClass, initializer.class, "initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinitializer_E(), this.getassignment_expression(), null, "e", null, 0, 1, initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaration_statementEClass, declaration_statement.class, "declaration_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdeclaration_statement_D(), this.getdeclaration(), null, "d", null, 0, 1, declaration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_C(), this.getcompound_statement(), null, "c", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_S(), this.getsimple_statement(), null, "s", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_statementEClass, simple_statement.class, "simple_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsimple_statement_D(), this.getdeclaration_statement(), null, "d", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_statement_E(), this.getexpression_statement(), null, "e", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_statement_S(), this.getselection_statement(), null, "s", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_statement_I(), this.getiteration_statement(), null, "i", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_statement_J(), this.getjump_statement(), null, "j", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compound_statementEClass, compound_statement.class, "compound_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompound_statement_S(), this.getstatement(), null, "s", null, 0, -1, compound_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_no_new_scopeEClass, statement_no_new_scope.class, "statement_no_new_scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_no_new_scope_C(), this.getcompound_statement_no_new_scope(), null, "c", null, 0, 1, statement_no_new_scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_no_new_scope_S(), this.getsimple_statement(), null, "s", null, 0, 1, statement_no_new_scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compound_statement_no_new_scopeEClass, compound_statement_no_new_scope.class, "compound_statement_no_new_scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompound_statement_no_new_scope_S(), this.getstatement(), null, "s", null, 0, -1, compound_statement_no_new_scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_statementEClass, expression_statement.class, "expression_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_statement_E(), this.getexpression(), null, "e", null, 0, 1, expression_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_expressionEClass, constant_expression.class, "constant_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconstant_expression_C(), this.getconditional_expression(), null, "c", null, 0, 1, constant_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selection_statementEClass, selection_statement.class, "selection_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getselection_statement_E(), this.getexpression(), null, "e", null, 0, 1, selection_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselection_statement_A(), this.getstatement(), null, "a", null, 0, 1, selection_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselection_statement_B(), this.getstatement(), null, "b", null, 0, 1, selection_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, condition.class, "condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcondition_E(), this.getexpression(), null, "e", null, 0, 1, condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iteration_statementEClass, iteration_statement.class, "iteration_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getiteration_statement_C(), this.getcondition(), null, "c", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getiteration_statement_Snns(), this.getstatement_no_new_scope(), null, "snns", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getiteration_statement_S(), this.getstatement(), null, "s", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getiteration_statement_E(), this.getexpression(), null, "e", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getiteration_statement_U(), this.getunroll_modifier(), null, "u", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getiteration_statement_Init(), this.getfor_init_statement(), null, "init", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getiteration_statement_Rem(), this.getfor_rest_statement(), null, "rem", null, 0, 1, iteration_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unroll_modifierEClass, unroll_modifier.class, "unroll_modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getunroll_modifier_M(), ecorePackage.getEString(), "m", null, 0, 1, unroll_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getunroll_modifier_C(), ecorePackage.getEString(), "c", null, 0, 1, unroll_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_init_statementEClass, for_init_statement.class, "for_init_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfor_init_statement_E(), this.getexpression_statement(), null, "e", null, 0, 1, for_init_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_init_statement_D(), this.getdeclaration_statement(), null, "d", null, 0, 1, for_init_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_rest_statementEClass, for_rest_statement.class, "for_rest_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfor_rest_statement_C(), this.getcondition(), null, "c", null, 0, 1, for_rest_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_rest_statement_E(), this.getexpression(), null, "e", null, 0, 1, for_rest_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jump_statementEClass, jump_statement.class, "jump_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getjump_statement_E(), this.getexpression(), null, "e", null, 0, 1, jump_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(translation_unitEClass, translation_unit.class, "translation_unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettranslation_unit_E(), this.getexternal_declaration(), null, "e", null, 0, -1, translation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(external_declarationEClass, external_declaration.class, "external_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexternal_declaration_F(), this.getfunction_definition(), null, "f", null, 0, 1, external_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexternal_declaration_D(), this.getdeclaration(), null, "d", null, 0, 1, external_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexternal_declaration_G(), this.getglue_block(), null, "g", null, 0, 1, external_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_definitionEClass, function_definition.class, "function_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunction_definition_P(), this.getfunction_prototype(), null, "p", null, 0, 1, function_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_definition_S(), this.getcompound_statement_no_new_scope(), null, "s", null, 0, 1, function_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(glue_blockEClass, glue_block.class, "glue_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getglue_block_G(), ecorePackage.getEString(), "g", null, 0, 1, glue_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DecoraDslPackageImpl
