package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FuncTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NumberTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.StringTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SymbolTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.UrlTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.charset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_negation;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.importExpression;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.page;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractCssDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CssDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CssDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CssDslPackage.COLOR_TOK:
				if(context == grammarAccess.getColorTokRule() ||
				   context == grammarAccess.getCssTokRule()) {
					sequence_ColorTok(context, (ColorTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FUNC_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getFuncTokRule()) {
					sequence_FuncTok(context, (FuncTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.IDENTIFIER_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getIdentifierTokRule()) {
					sequence_IdentifierTok(context, (IdentifierTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.NUMBER_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getNumberTokRule()) {
					sequence_NumberTok(context, (NumberTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STRING_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getStringTokRule()) {
					sequence_StringTok(context, (StringTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SYMBOL_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getSymbolTokRule()) {
					sequence_SymbolTok(context, (SymbolTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.URL_TYPE:
				if(context == grammarAccess.getURLTypeRule()) {
					sequence_URLType(context, (URLType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getImportExpressionRule()) {
					sequence_URLType_importExpression(context, (URLType) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.URL_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getUrlTokRule()) {
					sequence_UrlTok(context, (UrlTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.WS_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getWSTokRule()) {
					sequence_WSTok(context, (WSTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CHARSET:
				if(context == grammarAccess.getCharsetRule()) {
					sequence_charset(context, (charset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_DECLARATION:
				if(context == grammarAccess.getCss_declarationRule()) {
					sequence_css_declaration(context, (css_declaration) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_NEGATION:
				if(context == grammarAccess.getCss_negationRule()) {
					sequence_css_negation(context, (css_negation) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_PROPERTY:
				if(context == grammarAccess.getCss_propertyRule()) {
					sequence_css_property(context, (css_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_expr(context, (expr) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_function(context, (function) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.IMPORT_EXPRESSION:
				if(context == grammarAccess.getImportExpressionRule()) {
					sequence_importExpression(context, (importExpression) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.MEDIA:
				if(context == grammarAccess.getMediaRule()) {
					sequence_media(context, (media) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_page(context, (page) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RULESET:
				if(context == grammarAccess.getRulesetRule()) {
					sequence_ruleset(context, (ruleset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_selector(context, (selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIMPLE_SELECTOR:
				if(context == grammarAccess.getSimple_selectorRule()) {
					sequence_simple_selector(context, (simple_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STYLESHEET:
				if(context == grammarAccess.getStylesheetRule()) {
					sequence_stylesheet(context, (stylesheet) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SUB_SELECTOR:
				if(context == grammarAccess.getSub_selectorRule()) {
					sequence_sub_selector(context, (sub_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_term(context, (term) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.TERM_GROUP:
				if(context == grammarAccess.getTermGroupRule()) {
					sequence_termGroup(context, (termGroup) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     color=HASH
	 */
	protected void sequence_ColorTok(EObject context, ColorTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.COLOR_TOK__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.COLOR_TOK__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorTokAccess().getColorHASHTerminalRuleCall_1_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     func=function
	 */
	protected void sequence_FuncTok(EObject context, FuncTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FUNC_TOK__FUNC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FUNC_TOK__FUNC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuncTokAccess().getFuncFunctionParserRuleCall_1_0(), semanticObject.getFunc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=ValidPropertyIdent
	 */
	protected void sequence_IdentifierTok(EObject context, IdentifierTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.IDENTIFIER_TOK__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.IDENTIFIER_TOK__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierTokAccess().getIdValidPropertyIdentParserRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     num=numberTerm
	 */
	protected void sequence_NumberTok(EObject context, NumberTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.NUMBER_TOK__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.NUMBER_TOK__NUM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberTokAccess().getNumNumberTermParserRuleCall_1_0(), semanticObject.getNum());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringTok(EObject context, StringTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.STRING_TOK__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.STRING_TOK__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringTokAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     symbol=COMMA
	 */
	protected void sequence_SymbolTok(EObject context, SymbolTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.SYMBOL_TOK__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.SYMBOL_TOK__SYMBOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0(), semanticObject.getSymbol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_URLType(EObject context, URLType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=STRING mediaList=media_list?)
	 */
	protected void sequence_URLType_importExpression(EObject context, URLType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=URLType
	 */
	protected void sequence_UrlTok(EObject context, UrlTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.URL_TOK__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.URL_TOK__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {WSTok}
	 */
	protected void sequence_WSTok(EObject context, WSTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     charset=STRING
	 */
	protected void sequence_charset(EObject context, charset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CHARSET__CHARSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CHARSET__CHARSET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0(), semanticObject.getCharset());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (property=css_property valueTokens+=CssTok+ prio=css_prio?)
	 */
	protected void sequence_css_declaration(EObject context, css_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (not=css_not negation_arg=css_negation_arg)
	 */
	protected void sequence_css_negation(EObject context, css_negation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_NEGATION__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_NEGATION__NOT));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_NEGATION__NEGATION_ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_NEGATION__NEGATION_ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCss_negationAccess().getNotCss_notEnumRuleCall_1_0(), semanticObject.getNot());
		feeder.accept(grammarAccess.getCss_negationAccess().getNegation_argCss_negation_argParserRuleCall_2_0(), semanticObject.getNegation_arg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidPropertyIdent
	 */
	protected void sequence_css_property(EObject context, css_property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_PROPERTY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (termGroups+=termGroup termGroups+=termGroup*)
	 */
	protected void sequence_expr(EObject context, expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT params+=CssTok+)
	 */
	protected void sequence_function(EObject context, function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_importExpression(EObject context, importExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.IMPORT_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.IMPORT_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (medialist=media_list rulesets+=ruleset*)
	 */
	protected void sequence_media(EObject context, media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pseudoPage=pseudo_page? declarations+=css_declaration? declarations+=css_declaration*)
	 */
	protected void sequence_page(EObject context, page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=selector selectors+=selector* declarations+=css_declaration*)
	 */
	protected void sequence_ruleset(EObject context, ruleset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleselectors+=simple_selector ((combinator=combinator selector=selector) | (combinator=combinator? selector=selector)?)?)
	 */
	protected void sequence_selector(EObject context, selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((element=element_name | universal=css_universal) subSelectors+=sub_selector*) | subSelectors+=sub_selector+)
	 */
	protected void sequence_simple_selector(EObject context, simple_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (charset=charset? imports+=importExpression* (ruleset+=ruleset | media+=media | page+=page)*)
	 */
	protected void sequence_stylesheet(EObject context, stylesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=css_id | class=css_class | attrib=css_attrib | pseudoclass=css_pseudo | negotation=css_negation)
	 */
	protected void sequence_sub_selector(EObject context, sub_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     terms+=term+
	 */
	protected void sequence_termGroup(EObject context, termGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         number=numberTerm | 
	 *         stringValue=STRING | 
	 *         identifier=ValidPropertyIdent | 
	 *         url=URLType | 
	 *         function=function | 
	 *         hexColor=HexColor
	 *     )
	 */
	protected void sequence_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
