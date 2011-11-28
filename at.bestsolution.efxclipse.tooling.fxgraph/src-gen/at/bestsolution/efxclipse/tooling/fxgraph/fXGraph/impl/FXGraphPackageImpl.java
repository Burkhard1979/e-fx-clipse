/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphFactory;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MultiValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SingleValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty;

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
public class FXGraphPackageImpl extends EPackageImpl implements FXGraphPackage
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
  private EClass componentDefinitionEClass = null;

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
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listValueElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass copyValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controllerHandledValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptHandlerHandledValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptValueExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindValuePropertyEClass = null;

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
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FXGraphPackageImpl()
  {
    super(eNS_URI, FXGraphFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FXGraphPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FXGraphPackage init()
  {
    if (isInited) return (FXGraphPackage)EPackage.Registry.INSTANCE.getEPackage(FXGraphPackage.eNS_URI);

    // Obtain or create and register package
    FXGraphPackageImpl theFXGraphPackage = (FXGraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FXGraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FXGraphPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFXGraphPackage.createPackageContents();

    // Initialize created meta-data
    theFXGraphPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFXGraphPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FXGraphPackage.eNS_URI, theFXGraphPackage);
    return theFXGraphPackage;
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
  public EReference getModel_Imports()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_ComponentDef()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDefinition()
  {
    return componentDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_Name()
  {
    return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_Controller()
  {
    return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_PreviewCssFiles()
  {
    return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_PreviewResourceBundle()
  {
    return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_PreviewClasspathEntries()
  {
    return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_Scripts()
  {
    return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_Defines()
  {
    return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_RootNode()
  {
    return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(7);
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
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Type()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Value()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Factory()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Name()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Properties()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_StaticProperties()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefine()
  {
    return defineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefine_Element()
  {
    return (EReference)defineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Language()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Source()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Sourcecode()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticValueProperty()
  {
    return staticValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticValueProperty_Type()
  {
    return (EReference)staticValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticValueProperty_Name()
  {
    return (EAttribute)staticValuePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticValueProperty_Value()
  {
    return (EReference)staticValuePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Preview()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Value()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueProperty()
  {
    return valuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleValueProperty()
  {
    return singleValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiValueProperty()
  {
    return multiValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListValueElement()
  {
    return listValueElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListValueProperty()
  {
    return listValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListValueProperty_Value()
  {
    return (EReference)listValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapValueProperty()
  {
    return mapValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapValueProperty_Properties()
  {
    return (EReference)mapValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleValueProperty()
  {
    return simpleValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleValueProperty_StringValue()
  {
    return (EAttribute)simpleValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleValueProperty_BooleanValue()
  {
    return (EAttribute)simpleValuePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleValueProperty_Negative()
  {
    return (EAttribute)simpleValuePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleValueProperty_IntValue()
  {
    return (EAttribute)simpleValuePropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleValueProperty_RealValue()
  {
    return (EAttribute)simpleValuePropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceValueProperty()
  {
    return referenceValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceValueProperty_Reference()
  {
    return (EReference)referenceValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeValueProperty()
  {
    return includeValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeValueProperty_Source()
  {
    return (EAttribute)includeValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCopyValueProperty()
  {
    return copyValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCopyValueProperty_Reference()
  {
    return (EReference)copyValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControllerHandledValueProperty()
  {
    return controllerHandledValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControllerHandledValueProperty_Methodname()
  {
    return (EAttribute)controllerHandledValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptHandlerHandledValueProperty()
  {
    return scriptHandlerHandledValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptHandlerHandledValueProperty_Functionname()
  {
    return (EAttribute)scriptHandlerHandledValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptValueExpression()
  {
    return scriptValueExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptValueExpression_Sourcecode()
  {
    return (EAttribute)scriptValueExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationValueProperty()
  {
    return locationValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationValueProperty_Value()
  {
    return (EAttribute)locationValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceValueProperty()
  {
    return resourceValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceValueProperty_Value()
  {
    return (EAttribute)resourceValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindValueProperty()
  {
    return bindValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindValueProperty_ElementReference()
  {
    return (EReference)bindValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindValueProperty_Attribute()
  {
    return (EAttribute)bindValuePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXGraphFactory getFXGraphFactory()
  {
    return (FXGraphFactory)getEFactoryInstance();
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
    createEReference(modelEClass, MODEL__IMPORTS);
    createEReference(modelEClass, MODEL__COMPONENT_DEF);

    componentDefinitionEClass = createEClass(COMPONENT_DEFINITION);
    createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__NAME);
    createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__CONTROLLER);
    createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__PREVIEW_CSS_FILES);
    createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE);
    createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES);
    createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__SCRIPTS);
    createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__DEFINES);
    createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__ROOT_NODE);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    elementEClass = createEClass(ELEMENT);
    createEReference(elementEClass, ELEMENT__TYPE);
    createEReference(elementEClass, ELEMENT__VALUE);
    createEAttribute(elementEClass, ELEMENT__FACTORY);
    createEAttribute(elementEClass, ELEMENT__NAME);
    createEReference(elementEClass, ELEMENT__PROPERTIES);
    createEReference(elementEClass, ELEMENT__STATIC_PROPERTIES);

    defineEClass = createEClass(DEFINE);
    createEReference(defineEClass, DEFINE__ELEMENT);

    scriptEClass = createEClass(SCRIPT);
    createEAttribute(scriptEClass, SCRIPT__LANGUAGE);
    createEAttribute(scriptEClass, SCRIPT__SOURCE);
    createEAttribute(scriptEClass, SCRIPT__SOURCECODE);

    staticValuePropertyEClass = createEClass(STATIC_VALUE_PROPERTY);
    createEReference(staticValuePropertyEClass, STATIC_VALUE_PROPERTY__TYPE);
    createEAttribute(staticValuePropertyEClass, STATIC_VALUE_PROPERTY__NAME);
    createEReference(staticValuePropertyEClass, STATIC_VALUE_PROPERTY__VALUE);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__PREVIEW);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__VALUE);

    valuePropertyEClass = createEClass(VALUE_PROPERTY);

    singleValuePropertyEClass = createEClass(SINGLE_VALUE_PROPERTY);

    multiValuePropertyEClass = createEClass(MULTI_VALUE_PROPERTY);

    listValueElementEClass = createEClass(LIST_VALUE_ELEMENT);

    listValuePropertyEClass = createEClass(LIST_VALUE_PROPERTY);
    createEReference(listValuePropertyEClass, LIST_VALUE_PROPERTY__VALUE);

    mapValuePropertyEClass = createEClass(MAP_VALUE_PROPERTY);
    createEReference(mapValuePropertyEClass, MAP_VALUE_PROPERTY__PROPERTIES);

    simpleValuePropertyEClass = createEClass(SIMPLE_VALUE_PROPERTY);
    createEAttribute(simpleValuePropertyEClass, SIMPLE_VALUE_PROPERTY__STRING_VALUE);
    createEAttribute(simpleValuePropertyEClass, SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE);
    createEAttribute(simpleValuePropertyEClass, SIMPLE_VALUE_PROPERTY__NEGATIVE);
    createEAttribute(simpleValuePropertyEClass, SIMPLE_VALUE_PROPERTY__INT_VALUE);
    createEAttribute(simpleValuePropertyEClass, SIMPLE_VALUE_PROPERTY__REAL_VALUE);

    referenceValuePropertyEClass = createEClass(REFERENCE_VALUE_PROPERTY);
    createEReference(referenceValuePropertyEClass, REFERENCE_VALUE_PROPERTY__REFERENCE);

    includeValuePropertyEClass = createEClass(INCLUDE_VALUE_PROPERTY);
    createEAttribute(includeValuePropertyEClass, INCLUDE_VALUE_PROPERTY__SOURCE);

    copyValuePropertyEClass = createEClass(COPY_VALUE_PROPERTY);
    createEReference(copyValuePropertyEClass, COPY_VALUE_PROPERTY__REFERENCE);

    controllerHandledValuePropertyEClass = createEClass(CONTROLLER_HANDLED_VALUE_PROPERTY);
    createEAttribute(controllerHandledValuePropertyEClass, CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME);

    scriptHandlerHandledValuePropertyEClass = createEClass(SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY);
    createEAttribute(scriptHandlerHandledValuePropertyEClass, SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME);

    scriptValueExpressionEClass = createEClass(SCRIPT_VALUE_EXPRESSION);
    createEAttribute(scriptValueExpressionEClass, SCRIPT_VALUE_EXPRESSION__SOURCECODE);

    locationValuePropertyEClass = createEClass(LOCATION_VALUE_PROPERTY);
    createEAttribute(locationValuePropertyEClass, LOCATION_VALUE_PROPERTY__VALUE);

    resourceValuePropertyEClass = createEClass(RESOURCE_VALUE_PROPERTY);
    createEAttribute(resourceValuePropertyEClass, RESOURCE_VALUE_PROPERTY__VALUE);

    bindValuePropertyEClass = createEClass(BIND_VALUE_PROPERTY);
    createEReference(bindValuePropertyEClass, BIND_VALUE_PROPERTY__ELEMENT_REFERENCE);
    createEAttribute(bindValuePropertyEClass, BIND_VALUE_PROPERTY__ATTRIBUTE);
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
    elementEClass.getESuperTypes().add(this.getSingleValueProperty());
    elementEClass.getESuperTypes().add(this.getListValueElement());
    singleValuePropertyEClass.getESuperTypes().add(this.getValueProperty());
    multiValuePropertyEClass.getESuperTypes().add(this.getValueProperty());
    listValuePropertyEClass.getESuperTypes().add(this.getMultiValueProperty());
    mapValuePropertyEClass.getESuperTypes().add(this.getMultiValueProperty());
    simpleValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    referenceValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    referenceValuePropertyEClass.getESuperTypes().add(this.getListValueElement());
    includeValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    includeValuePropertyEClass.getESuperTypes().add(this.getListValueElement());
    copyValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    controllerHandledValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    scriptHandlerHandledValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    scriptValueExpressionEClass.getESuperTypes().add(this.getSingleValueProperty());
    locationValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    resourceValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());
    bindValuePropertyEClass.getESuperTypes().add(this.getSingleValueProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_ComponentDef(), this.getComponentDefinition(), null, "componentDef", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentDefinitionEClass, ComponentDefinition.class, "ComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDefinition_Controller(), theTypesPackage.getJvmTypeReference(), null, "controller", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentDefinition_PreviewCssFiles(), ecorePackage.getEString(), "previewCssFiles", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentDefinition_PreviewResourceBundle(), ecorePackage.getEString(), "previewResourceBundle", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentDefinition_PreviewClasspathEntries(), ecorePackage.getEString(), "previewClasspathEntries", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDefinition_Scripts(), this.getScript(), null, "scripts", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDefinition_Defines(), this.getDefine(), null, "defines", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDefinition_RootNode(), this.getElement(), null, "rootNode", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElement_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_Value(), this.getSimpleValueProperty(), null, "value", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_Factory(), ecorePackage.getEString(), "factory", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_Properties(), this.getProperty(), null, "properties", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_StaticProperties(), this.getStaticValueProperty(), null, "staticProperties", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defineEClass, Define.class, "Define", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefine_Element(), this.getElement(), null, "element", null, 0, 1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScript_Language(), ecorePackage.getEString(), "language", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScript_Source(), ecorePackage.getEString(), "source", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScript_Sourcecode(), ecorePackage.getEString(), "sourcecode", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticValuePropertyEClass, StaticValueProperty.class, "StaticValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStaticValueProperty_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, StaticValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStaticValueProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, StaticValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticValueProperty_Value(), this.getValueProperty(), null, "value", null, 0, 1, StaticValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Preview(), ecorePackage.getEBoolean(), "preview", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Value(), this.getValueProperty(), null, "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuePropertyEClass, ValueProperty.class, "ValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(singleValuePropertyEClass, SingleValueProperty.class, "SingleValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiValuePropertyEClass, MultiValueProperty.class, "MultiValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listValueElementEClass, ListValueElement.class, "ListValueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listValuePropertyEClass, ListValueProperty.class, "ListValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListValueProperty_Value(), this.getListValueElement(), null, "value", null, 0, -1, ListValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapValuePropertyEClass, MapValueProperty.class, "MapValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapValueProperty_Properties(), this.getProperty(), null, "properties", null, 0, -1, MapValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleValuePropertyEClass, SimpleValueProperty.class, "SimpleValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleValueProperty_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, SimpleValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleValueProperty_BooleanValue(), ecorePackage.getEString(), "booleanValue", null, 0, 1, SimpleValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleValueProperty_Negative(), ecorePackage.getEBoolean(), "negative", null, 0, 1, SimpleValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleValueProperty_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, SimpleValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleValueProperty_RealValue(), ecorePackage.getEDouble(), "realValue", null, 0, 1, SimpleValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceValuePropertyEClass, ReferenceValueProperty.class, "ReferenceValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceValueProperty_Reference(), this.getElement(), null, "reference", null, 0, 1, ReferenceValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeValuePropertyEClass, IncludeValueProperty.class, "IncludeValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIncludeValueProperty_Source(), ecorePackage.getEString(), "source", null, 0, 1, IncludeValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(copyValuePropertyEClass, CopyValueProperty.class, "CopyValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCopyValueProperty_Reference(), this.getElement(), null, "reference", null, 0, 1, CopyValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllerHandledValuePropertyEClass, ControllerHandledValueProperty.class, "ControllerHandledValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControllerHandledValueProperty_Methodname(), ecorePackage.getEString(), "methodname", null, 0, 1, ControllerHandledValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptHandlerHandledValuePropertyEClass, ScriptHandlerHandledValueProperty.class, "ScriptHandlerHandledValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScriptHandlerHandledValueProperty_Functionname(), ecorePackage.getEString(), "functionname", null, 0, 1, ScriptHandlerHandledValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptValueExpressionEClass, ScriptValueExpression.class, "ScriptValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScriptValueExpression_Sourcecode(), ecorePackage.getEString(), "sourcecode", null, 0, 1, ScriptValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationValuePropertyEClass, LocationValueProperty.class, "LocationValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocationValueProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, LocationValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceValuePropertyEClass, ResourceValueProperty.class, "ResourceValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceValueProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, ResourceValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindValuePropertyEClass, BindValueProperty.class, "BindValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindValueProperty_ElementReference(), this.getElement(), null, "elementReference", null, 0, 1, BindValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBindValueProperty_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, BindValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FXGraphPackageImpl
