/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage
 * @generated
 */
public class CssExtDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssExtDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CssExtDslPackage.eINSTANCE;
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
  protected CssExtDslSwitch<Adapter> modelSwitch =
    new CssExtDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseCssExtension(CssExtension object)
      {
        return createCssExtensionAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackageDefinition(PackageDefinition object)
      {
        return createPackageDefinitionAdapter();
      }
      @Override
      public Adapter caseDoku(Doku object)
      {
        return createDokuAdapter();
      }
      @Override
      public Adapter caseCSSRule(CSSRule object)
      {
        return createCSSRuleAdapter();
      }
      @Override
      public Adapter caseElementDeclartion(ElementDeclartion object)
      {
        return createElementDeclartionAdapter();
      }
      @Override
      public Adapter casePropertyDefinition(PropertyDefinition object)
      {
        return createPropertyDefinitionAdapter();
      }
      @Override
      public Adapter casePseudoClassDefinition(PseudoClassDefinition object)
      {
        return createPseudoClassDefinitionAdapter();
      }
      @Override
      public Adapter caseCSSRuleId(CSSRuleId object)
      {
        return createCSSRuleIdAdapter();
      }
      @Override
      public Adapter caseCSSRuleRef(CSSRuleRef object)
      {
        return createCSSRuleRefAdapter();
      }
      @Override
      public Adapter caseCSSRuleDefinition(CSSRuleDefinition object)
      {
        return createCSSRuleDefinitionAdapter();
      }
      @Override
      public Adapter caseCSSDefaultValue(CSSDefaultValue object)
      {
        return createCSSDefaultValueAdapter();
      }
      @Override
      public Adapter caseCSSRuleOr(CSSRuleOr object)
      {
        return createCSSRuleOrAdapter();
      }
      @Override
      public Adapter caseCSSRuleXor(CSSRuleXor object)
      {
        return createCSSRuleXorAdapter();
      }
      @Override
      public Adapter caseCSSRuleConcat(CSSRuleConcat object)
      {
        return createCSSRuleConcatAdapter();
      }
      @Override
      public Adapter caseCSSRulePostfix(CSSRulePostfix object)
      {
        return createCSSRulePostfixAdapter();
      }
      @Override
      public Adapter caseCSSRuleBracket(CSSRuleBracket object)
      {
        return createCSSRuleBracketAdapter();
      }
      @Override
      public Adapter caseCSSRuleLiteral(CSSRuleLiteral object)
      {
        return createCSSRuleLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension <em>Css Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension
   * @generated
   */
  public Adapter createCssExtensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition
   * @generated
   */
  public Adapter createPackageDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku <em>Doku</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku
   * @generated
   */
  public Adapter createDokuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule <em>CSS Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule
   * @generated
   */
  public Adapter createCSSRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDeclartion <em>Element Declartion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDeclartion
   * @generated
   */
  public Adapter createElementDeclartionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition
   * @generated
   */
  public Adapter createPropertyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition <em>Pseudo Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition
   * @generated
   */
  public Adapter createPseudoClassDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId <em>CSS Rule Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId
   * @generated
   */
  public Adapter createCSSRuleIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef <em>CSS Rule Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef
   * @generated
   */
  public Adapter createCSSRuleRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition <em>CSS Rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition
   * @generated
   */
  public Adapter createCSSRuleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue <em>CSS Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue
   * @generated
   */
  public Adapter createCSSDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr <em>CSS Rule Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr
   * @generated
   */
  public Adapter createCSSRuleOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor <em>CSS Rule Xor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor
   * @generated
   */
  public Adapter createCSSRuleXorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat <em>CSS Rule Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat
   * @generated
   */
  public Adapter createCSSRuleConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix <em>CSS Rule Postfix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix
   * @generated
   */
  public Adapter createCSSRulePostfixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket <em>CSS Rule Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket
   * @generated
   */
  public Adapter createCSSRuleBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral <em>CSS Rule Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral
   * @generated
   */
  public Adapter createCSSRuleLiteralAdapter()
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

} //CssExtDslAdapterFactory
