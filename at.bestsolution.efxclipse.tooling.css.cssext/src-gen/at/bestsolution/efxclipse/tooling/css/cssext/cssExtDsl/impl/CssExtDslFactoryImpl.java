/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.*;

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
public class CssExtDslFactoryImpl extends EFactoryImpl implements CssExtDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CssExtDslFactory init()
  {
    try
    {
      CssExtDslFactory theCssExtDslFactory = (CssExtDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/css/cssext/CssExtDsl"); 
      if (theCssExtDslFactory != null)
      {
        return theCssExtDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CssExtDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslFactoryImpl()
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
      case CssExtDslPackage.CSS_EXTENSION: return createCssExtension();
      case CssExtDslPackage.IMPORT: return createImport();
      case CssExtDslPackage.PACKAGE_DEFINITION: return createPackageDefinition();
      case CssExtDslPackage.DOKU: return createDoku();
      case CssExtDslPackage.CSS_RULE: return createCSSRule();
      case CssExtDslPackage.ELEMENT_DEFINITION: return createElementDefinition();
      case CssExtDslPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case CssExtDslPackage.PSEUDO_CLASS_DEFINITION: return createPseudoClassDefinition();
      case CssExtDslPackage.CSS_RULE_ID: return createCSSRuleId();
      case CssExtDslPackage.CSS_RULE_REF: return createCSSRuleRef();
      case CssExtDslPackage.CSS_RULE_DEFINITION: return createCSSRuleDefinition();
      case CssExtDslPackage.CSS_DEFAULT_VALUE: return createCSSDefaultValue();
      case CssExtDslPackage.CSS_RANGED_INT_TYPE: return createCSSRangedIntType();
      case CssExtDslPackage.CSS_RANGED_DOUBLE_TYPE: return createCSSRangedDoubleType();
      case CssExtDslPackage.CSS_RULE_FUNC: return createCSSRuleFunc();
      case CssExtDslPackage.CSS_RULE_OR: return createCSSRuleOr();
      case CssExtDslPackage.CSS_RULE_XOR: return createCSSRuleXor();
      case CssExtDslPackage.CSS_RULE_CONCAT: return createCSSRuleConcat();
      case CssExtDslPackage.CSS_RULE_POSTFIX: return createCSSRulePostfix();
      case CssExtDslPackage.CSS_RULE_BRACKET: return createCSSRuleBracket();
      case CssExtDslPackage.NUM_LITERAL: return createNumLiteral();
      case CssExtDslPackage.CSS_RULE_REGEX: return createCSSRuleRegex();
      case CssExtDslPackage.CSS_RULE_LITERAL: return createCSSRuleLiteral();
      case CssExtDslPackage.CSS_RULE_SYMBOL: return createCSSRuleSymbol();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtension createCssExtension()
  {
    CssExtensionImpl cssExtension = new CssExtensionImpl();
    return cssExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDefinition createPackageDefinition()
  {
    PackageDefinitionImpl packageDefinition = new PackageDefinitionImpl();
    return packageDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku createDoku()
  {
    DokuImpl doku = new DokuImpl();
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRule createCSSRule()
  {
    CSSRuleImpl cssRule = new CSSRuleImpl();
    return cssRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition createElementDefinition()
  {
    ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
    return elementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDefinition createPropertyDefinition()
  {
    PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
    return propertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoClassDefinition createPseudoClassDefinition()
  {
    PseudoClassDefinitionImpl pseudoClassDefinition = new PseudoClassDefinitionImpl();
    return pseudoClassDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleId createCSSRuleId()
  {
    CSSRuleIdImpl cssRuleId = new CSSRuleIdImpl();
    return cssRuleId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleRef createCSSRuleRef()
  {
    CSSRuleRefImpl cssRuleRef = new CSSRuleRefImpl();
    return cssRuleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleDefinition createCSSRuleDefinition()
  {
    CSSRuleDefinitionImpl cssRuleDefinition = new CSSRuleDefinitionImpl();
    return cssRuleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSDefaultValue createCSSDefaultValue()
  {
    CSSDefaultValueImpl cssDefaultValue = new CSSDefaultValueImpl();
    return cssDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRangedIntType createCSSRangedIntType()
  {
    CSSRangedIntTypeImpl cssRangedIntType = new CSSRangedIntTypeImpl();
    return cssRangedIntType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRangedDoubleType createCSSRangedDoubleType()
  {
    CSSRangedDoubleTypeImpl cssRangedDoubleType = new CSSRangedDoubleTypeImpl();
    return cssRangedDoubleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleFunc createCSSRuleFunc()
  {
    CSSRuleFuncImpl cssRuleFunc = new CSSRuleFuncImpl();
    return cssRuleFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleOr createCSSRuleOr()
  {
    CSSRuleOrImpl cssRuleOr = new CSSRuleOrImpl();
    return cssRuleOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleXor createCSSRuleXor()
  {
    CSSRuleXorImpl cssRuleXor = new CSSRuleXorImpl();
    return cssRuleXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleConcat createCSSRuleConcat()
  {
    CSSRuleConcatImpl cssRuleConcat = new CSSRuleConcatImpl();
    return cssRuleConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRulePostfix createCSSRulePostfix()
  {
    CSSRulePostfixImpl cssRulePostfix = new CSSRulePostfixImpl();
    return cssRulePostfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleBracket createCSSRuleBracket()
  {
    CSSRuleBracketImpl cssRuleBracket = new CSSRuleBracketImpl();
    return cssRuleBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumLiteral createNumLiteral()
  {
    NumLiteralImpl numLiteral = new NumLiteralImpl();
    return numLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleRegex createCSSRuleRegex()
  {
    CSSRuleRegexImpl cssRuleRegex = new CSSRuleRegexImpl();
    return cssRuleRegex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleLiteral createCSSRuleLiteral()
  {
    CSSRuleLiteralImpl cssRuleLiteral = new CSSRuleLiteralImpl();
    return cssRuleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleSymbol createCSSRuleSymbol()
  {
    CSSRuleSymbolImpl cssRuleSymbol = new CSSRuleSymbolImpl();
    return cssRuleSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslPackage getCssExtDslPackage()
  {
    return (CssExtDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CssExtDslPackage getPackage()
  {
    return CssExtDslPackage.eINSTANCE;
  }

} //CssExtDslFactoryImpl
