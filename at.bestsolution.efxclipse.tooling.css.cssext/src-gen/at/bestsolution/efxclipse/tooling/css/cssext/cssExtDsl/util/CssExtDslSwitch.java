/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.*;

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
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage
 * @generated
 */
public class CssExtDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssExtDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CssExtDslPackage.eINSTANCE;
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
      case CssExtDslPackage.CSS_EXTENSION:
      {
        CssExtension cssExtension = (CssExtension)theEObject;
        T result = caseCssExtension(cssExtension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.PACKAGE_DEFINITION:
      {
        PackageDefinition packageDefinition = (PackageDefinition)theEObject;
        T result = casePackageDefinition(packageDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.DOKU:
      {
        Doku doku = (Doku)theEObject;
        T result = caseDoku(doku);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE:
      {
        CSSRule cssRule = (CSSRule)theEObject;
        T result = caseCSSRule(cssRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.ELEMENT_DECLARTION:
      {
        ElementDeclartion elementDeclartion = (ElementDeclartion)theEObject;
        T result = caseElementDeclartion(elementDeclartion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.PROPERTY_DEFINITION:
      {
        PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
        T result = casePropertyDefinition(propertyDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.PSEUDO_CLASS_DEFINITION:
      {
        PseudoClassDefinition pseudoClassDefinition = (PseudoClassDefinition)theEObject;
        T result = casePseudoClassDefinition(pseudoClassDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_ID:
      {
        CSSRuleId cssRuleId = (CSSRuleId)theEObject;
        T result = caseCSSRuleId(cssRuleId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_REF:
      {
        CSSRuleRef cssRuleRef = (CSSRuleRef)theEObject;
        T result = caseCSSRuleRef(cssRuleRef);
        if (result == null) result = caseCSSRule(cssRuleRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_DEFINITION:
      {
        CSSRuleDefinition cssRuleDefinition = (CSSRuleDefinition)theEObject;
        T result = caseCSSRuleDefinition(cssRuleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_DEFAULT_VALUE:
      {
        CSSDefaultValue cssDefaultValue = (CSSDefaultValue)theEObject;
        T result = caseCSSDefaultValue(cssDefaultValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RANGED_INT_TYPE:
      {
        CSSRangedIntType cssRangedIntType = (CSSRangedIntType)theEObject;
        T result = caseCSSRangedIntType(cssRangedIntType);
        if (result == null) result = caseCSSRule(cssRangedIntType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RANGED_DOUBLE_TYPE:
      {
        CSSRangedDoubleType cssRangedDoubleType = (CSSRangedDoubleType)theEObject;
        T result = caseCSSRangedDoubleType(cssRangedDoubleType);
        if (result == null) result = caseCSSRule(cssRangedDoubleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_FUNC:
      {
        CSSRuleFunc cssRuleFunc = (CSSRuleFunc)theEObject;
        T result = caseCSSRuleFunc(cssRuleFunc);
        if (result == null) result = caseCSSRule(cssRuleFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_OR:
      {
        CSSRuleOr cssRuleOr = (CSSRuleOr)theEObject;
        T result = caseCSSRuleOr(cssRuleOr);
        if (result == null) result = caseCSSRule(cssRuleOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_XOR:
      {
        CSSRuleXor cssRuleXor = (CSSRuleXor)theEObject;
        T result = caseCSSRuleXor(cssRuleXor);
        if (result == null) result = caseCSSRule(cssRuleXor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_CONCAT:
      {
        CSSRuleConcat cssRuleConcat = (CSSRuleConcat)theEObject;
        T result = caseCSSRuleConcat(cssRuleConcat);
        if (result == null) result = caseCSSRule(cssRuleConcat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_POSTFIX:
      {
        CSSRulePostfix cssRulePostfix = (CSSRulePostfix)theEObject;
        T result = caseCSSRulePostfix(cssRulePostfix);
        if (result == null) result = caseCSSRule(cssRulePostfix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_BRACKET:
      {
        CSSRuleBracket cssRuleBracket = (CSSRuleBracket)theEObject;
        T result = caseCSSRuleBracket(cssRuleBracket);
        if (result == null) result = caseCSSRule(cssRuleBracket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_PARANTHESIS:
      {
        CSSRuleParanthesis cssRuleParanthesis = (CSSRuleParanthesis)theEObject;
        T result = caseCSSRuleParanthesis(cssRuleParanthesis);
        if (result == null) result = caseCSSRule(cssRuleParanthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_LITERAL:
      {
        CSSRuleLiteral cssRuleLiteral = (CSSRuleLiteral)theEObject;
        T result = caseCSSRuleLiteral(cssRuleLiteral);
        if (result == null) result = caseCSSRule(cssRuleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_REGEX:
      {
        CSSRuleRegex cssRuleRegex = (CSSRuleRegex)theEObject;
        T result = caseCSSRuleRegex(cssRuleRegex);
        if (result == null) result = caseCSSRule(cssRuleRegex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Css Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Css Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCssExtension(CssExtension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDefinition(PackageDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doku</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doku</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoku(Doku object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRule(CSSRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Declartion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Declartion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDeclartion(ElementDeclartion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDefinition(PropertyDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Class Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Class Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoClassDefinition(PseudoClassDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleId(CSSRuleId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleRef(CSSRuleRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleDefinition(CSSRuleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Default Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Default Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSDefaultValue(CSSDefaultValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Ranged Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Ranged Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRangedIntType(CSSRangedIntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Ranged Double Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Ranged Double Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRangedDoubleType(CSSRangedDoubleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleFunc(CSSRuleFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleOr(CSSRuleOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleXor(CSSRuleXor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Concat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Concat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleConcat(CSSRuleConcat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Postfix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Postfix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRulePostfix(CSSRulePostfix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Bracket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Bracket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleBracket(CSSRuleBracket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Paranthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Paranthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleParanthesis(CSSRuleParanthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleLiteral(CSSRuleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Regex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Regex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleRegex(CSSRuleRegex object)
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

} //CssExtDslSwitch
