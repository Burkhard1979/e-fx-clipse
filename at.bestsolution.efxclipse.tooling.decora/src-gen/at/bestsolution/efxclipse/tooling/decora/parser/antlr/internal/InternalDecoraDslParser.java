package at.bestsolution.efxclipse.tooling.decora.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.decora.services.DecoraDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDecoraDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_RGBA_FIELDS", "RULE_XYZW_FIELDS", "RULE_IDENTIFIER", "RULE_INTCONSTANT", "RULE_FLOATCONSTANT", "RULE_BOOLCONSTANT", "RULE_LEFT_PAREN", "RULE_RIGHT_PAREN", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INC", "RULE_DEC", "RULE_COMMA", "RULE_PLUS", "RULE_DASH", "RULE_BANG", "RULE_STAR", "RULE_SLASH", "RULE_LTEQ", "RULE_GTEQ", "RULE_LT", "RULE_GT", "RULE_EQEQ", "RULE_NEQ", "RULE_AND", "RULE_XOR", "RULE_OR", "RULE_QUESTION", "RULE_COLON", "RULE_EQUAL", "RULE_STAREQ", "RULE_SLASHEQ", "RULE_PLUSEQ", "RULE_DASHEQ", "RULE_SEMICOLON", "RULE_TYPE", "RULE_VOID", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_IF", "RULE_ELSE", "RULE_WHILE", "RULE_DO", "RULE_FOR", "RULE_UNROLL", "RULE_CONTINUE", "RULE_BREAK", "RULE_DISCARD", "RULE_RETURN", "RULE_T_GLUE_BLOCK", "RULE_LEFT_FRENCH", "RULE_RIGHT_FRENCH", "RULE_DOT", "RULE_TILDE", "RULE_RFIELD", "RULE_XFIELD", "RULE_LETTER", "RULE_DIGIT", "RULE_WS", "RULE_COMMENT", "RULE_LINE_COMMENT", "'const'", "'param'", "'lowp'", "'mediump'", "'highp'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_TILDE=57;
    public static final int RULE_XYZW_FIELDS=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int RULE_LTEQ=22;
    public static final int T__65=65;
    public static final int RULE_DISCARD=51;
    public static final int RULE_DO=46;
    public static final int RULE_SEMICOLON=38;
    public static final int RULE_PLUSEQ=36;
    public static final int RULE_RETURN=52;
    public static final int RULE_FOR=47;
    public static final int RULE_OR=30;
    public static final int RULE_AND=28;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=54;
    public static final int RULE_LT=24;
    public static final int RULE_DASHEQ=37;
    public static final int RULE_WHILE=45;
    public static final int RULE_GTEQ=23;
    public static final int RULE_DOT=56;
    public static final int RULE_RGBA_FIELDS=4;
    public static final int RULE_LEFT_PAREN=10;
    public static final int RULE_GT=25;
    public static final int RULE_RFIELD=58;
    public static final int RULE_SLASHEQ=35;
    public static final int RULE_INC=14;
    public static final int RULE_T_GLUE_BLOCK=53;
    public static final int RULE_FLOATCONSTANT=8;
    public static final int RULE_STAREQ=34;
    public static final int RULE_LEFT_BRACE=41;
    public static final int RULE_BANG=19;
    public static final int RULE_DEC=15;
    public static final int RULE_CONTINUE=49;
    public static final int RULE_XOR=29;
    public static final int RULE_PLUS=17;
    public static final int RULE_UNROLL=48;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_COMMA=16;
    public static final int RULE_EQUAL=33;
    public static final int RULE_COMMENT=63;
    public static final int RULE_RIGHT_FRENCH=55;
    public static final int RULE_LETTER=60;
    public static final int RULE_INTCONSTANT=7;
    public static final int RULE_COLON=32;
    public static final int RULE_TYPE=39;
    public static final int RULE_STAR=20;
    public static final int RULE_EQEQ=26;
    public static final int RULE_VOID=40;
    public static final int RULE_RIGHT_BRACKET=13;
    public static final int RULE_BOOLCONSTANT=9;
    public static final int RULE_RIGHT_PAREN=11;
    public static final int RULE_NEQ=27;
    public static final int RULE_LINE_COMMENT=64;
    public static final int RULE_RIGHT_BRACE=42;
    public static final int RULE_LEFT_BRACKET=12;
    public static final int RULE_SLASH=21;
    public static final int RULE_WS=62;
    public static final int RULE_XFIELD=59;
    public static final int RULE_DIGIT=61;
    public static final int RULE_IF=43;
    public static final int RULE_BREAK=50;
    public static final int RULE_ELSE=44;
    public static final int RULE_DASH=18;
    public static final int RULE_QUESTION=31;

    // delegates
    // delegators


        public InternalDecoraDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDecoraDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDecoraDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private DecoraDslGrammarAccess grammarAccess;
     	
        public InternalDecoraDslParser(TokenStream input, DecoraDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DecoraDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:82:1: ruleModel returns [EObject current=null] : ( (lv_unit_0_0= ruletranslation_unit ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_unit_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:85:28: ( ( (lv_unit_0_0= ruletranslation_unit ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:86:1: ( (lv_unit_0_0= ruletranslation_unit ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:86:1: ( (lv_unit_0_0= ruletranslation_unit ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:87:1: (lv_unit_0_0= ruletranslation_unit )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:87:1: (lv_unit_0_0= ruletranslation_unit )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:88:3: lv_unit_0_0= ruletranslation_unit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getUnitTranslation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletranslation_unit_in_ruleModel136);
            lv_unit_0_0=ruletranslation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_0_0, 
                      		"translation_unit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulefield_selection"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:112:1: entryRulefield_selection returns [EObject current=null] : iv_rulefield_selection= rulefield_selection EOF ;
    public final EObject entryRulefield_selection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_selection = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:113:2: (iv_rulefield_selection= rulefield_selection EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:114:2: iv_rulefield_selection= rulefield_selection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_selectionRule()); 
            }
            pushFollow(FOLLOW_rulefield_selection_in_entryRulefield_selection171);
            iv_rulefield_selection=rulefield_selection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_selection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_selection181); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_selection"


    // $ANTLR start "rulefield_selection"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:121:1: rulefield_selection returns [EObject current=null] : ( ( (lv_r_0_0= RULE_RGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) ) ;
    public final EObject rulefield_selection() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;
        Token lv_x_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:124:28: ( ( ( (lv_r_0_0= RULE_RGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:1: ( ( (lv_r_0_0= RULE_RGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:1: ( ( (lv_r_0_0= RULE_RGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_RGBA_FIELDS) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_XYZW_FIELDS) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:2: ( (lv_r_0_0= RULE_RGBA_FIELDS ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:2: ( (lv_r_0_0= RULE_RGBA_FIELDS ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:126:1: (lv_r_0_0= RULE_RGBA_FIELDS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:126:1: (lv_r_0_0= RULE_RGBA_FIELDS )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:127:3: lv_r_0_0= RULE_RGBA_FIELDS
                    {
                    lv_r_0_0=(Token)match(input,RULE_RGBA_FIELDS,FOLLOW_RULE_RGBA_FIELDS_in_rulefield_selection223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_r_0_0, grammarAccess.getField_selectionAccess().getRRGBA_FIELDSTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getField_selectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"r",
                              		lv_r_0_0, 
                              		"RGBA_FIELDS");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:144:6: ( (lv_x_1_0= RULE_XYZW_FIELDS ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:144:6: ( (lv_x_1_0= RULE_XYZW_FIELDS ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:145:1: (lv_x_1_0= RULE_XYZW_FIELDS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:145:1: (lv_x_1_0= RULE_XYZW_FIELDS )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:146:3: lv_x_1_0= RULE_XYZW_FIELDS
                    {
                    lv_x_1_0=(Token)match(input,RULE_XYZW_FIELDS,FOLLOW_RULE_XYZW_FIELDS_in_rulefield_selection251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_x_1_0, grammarAccess.getField_selectionAccess().getXXYZW_FIELDSTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getField_selectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"x",
                              		lv_x_1_0, 
                              		"XYZW_FIELDS");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_selection"


    // $ANTLR start "entryRuleprimary_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:170:1: entryRuleprimary_expression returns [EObject current=null] : iv_ruleprimary_expression= ruleprimary_expression EOF ;
    public final EObject entryRuleprimary_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:171:2: (iv_ruleprimary_expression= ruleprimary_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:172:2: iv_ruleprimary_expression= ruleprimary_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleprimary_expression_in_entryRuleprimary_expression292);
            iv_ruleprimary_expression=ruleprimary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimary_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprimary_expression302); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprimary_expression"


    // $ANTLR start "ruleprimary_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:179:1: ruleprimary_expression returns [EObject current=null] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_INTCONSTANT_1= RULE_INTCONSTANT | this_FLOATCONSTANT_2= RULE_FLOATCONSTANT | this_BOOLCONSTANT_3= RULE_BOOLCONSTANT | (this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN ) ) ;
    public final EObject ruleprimary_expression() throws RecognitionException {
        EObject current = null;

        Token this_IDENTIFIER_0=null;
        Token this_INTCONSTANT_1=null;
        Token this_FLOATCONSTANT_2=null;
        Token this_BOOLCONSTANT_3=null;
        Token this_LEFT_PAREN_4=null;
        Token this_RIGHT_PAREN_6=null;
        EObject lv_e_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:182:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_INTCONSTANT_1= RULE_INTCONSTANT | this_FLOATCONSTANT_2= RULE_FLOATCONSTANT | this_BOOLCONSTANT_3= RULE_BOOLCONSTANT | (this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:1: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_INTCONSTANT_1= RULE_INTCONSTANT | this_FLOATCONSTANT_2= RULE_FLOATCONSTANT | this_BOOLCONSTANT_3= RULE_BOOLCONSTANT | (this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:1: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_INTCONSTANT_1= RULE_INTCONSTANT | this_FLOATCONSTANT_2= RULE_FLOATCONSTANT | this_BOOLCONSTANT_3= RULE_BOOLCONSTANT | (this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt2=1;
                }
                break;
            case RULE_INTCONSTANT:
                {
                alt2=2;
                }
                break;
            case RULE_FLOATCONSTANT:
                {
                alt2=3;
                }
                break;
            case RULE_BOOLCONSTANT:
                {
                alt2=4;
                }
                break;
            case RULE_LEFT_PAREN:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:2: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprimary_expression338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_0, grammarAccess.getPrimary_expressionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:188:6: this_INTCONSTANT_1= RULE_INTCONSTANT
                    {
                    this_INTCONSTANT_1=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleprimary_expression354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INTCONSTANT_1, grammarAccess.getPrimary_expressionAccess().getINTCONSTANTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:193:6: this_FLOATCONSTANT_2= RULE_FLOATCONSTANT
                    {
                    this_FLOATCONSTANT_2=(Token)match(input,RULE_FLOATCONSTANT,FOLLOW_RULE_FLOATCONSTANT_in_ruleprimary_expression370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOATCONSTANT_2, grammarAccess.getPrimary_expressionAccess().getFLOATCONSTANTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:198:6: this_BOOLCONSTANT_3= RULE_BOOLCONSTANT
                    {
                    this_BOOLCONSTANT_3=(Token)match(input,RULE_BOOLCONSTANT,FOLLOW_RULE_BOOLCONSTANT_in_ruleprimary_expression386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLCONSTANT_3, grammarAccess.getPrimary_expressionAccess().getBOOLCONSTANTTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:203:6: (this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:203:6: (this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:203:7: this_LEFT_PAREN_4= RULE_LEFT_PAREN ( (lv_e_5_0= ruleexpression ) ) this_RIGHT_PAREN_6= RULE_RIGHT_PAREN
                    {
                    this_LEFT_PAREN_4=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleprimary_expression403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_4, grammarAccess.getPrimary_expressionAccess().getLEFT_PARENTerminalRuleCall_4_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:207:1: ( (lv_e_5_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:208:1: (lv_e_5_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:208:1: (lv_e_5_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:209:3: lv_e_5_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimary_expressionAccess().getEExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleprimary_expression423);
                    lv_e_5_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_5_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PAREN_6=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleprimary_expression434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_6, grammarAccess.getPrimary_expressionAccess().getRIGHT_PARENTerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprimary_expression"


    // $ANTLR start "entryRuleprimary_or_call"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:237:1: entryRuleprimary_or_call returns [EObject current=null] : iv_ruleprimary_or_call= ruleprimary_or_call EOF ;
    public final EObject entryRuleprimary_or_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_or_call = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:238:2: (iv_ruleprimary_or_call= ruleprimary_or_call EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:239:2: iv_ruleprimary_or_call= ruleprimary_or_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_or_callRule()); 
            }
            pushFollow(FOLLOW_ruleprimary_or_call_in_entryRuleprimary_or_call470);
            iv_ruleprimary_or_call=ruleprimary_or_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimary_or_call; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprimary_or_call480); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprimary_or_call"


    // $ANTLR start "ruleprimary_or_call"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:246:1: ruleprimary_or_call returns [EObject current=null] : ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) ) ;
    public final EObject ruleprimary_or_call() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_f_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:249:28: ( ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:250:1: ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:250:1: ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_LEFT_PAREN) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=RULE_RGBA_FIELDS && LA3_1<=RULE_XYZW_FIELDS)||(LA3_1>=RULE_RIGHT_PAREN && LA3_1<=RULE_DASH)||(LA3_1>=RULE_STAR && LA3_1<=RULE_SEMICOLON)) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTCONSTANT:
            case RULE_FLOATCONSTANT:
            case RULE_BOOLCONSTANT:
            case RULE_LEFT_PAREN:
                {
                alt3=1;
                }
                break;
            case RULE_TYPE:
            case RULE_VOID:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:250:2: ( (lv_e_0_0= ruleprimary_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:250:2: ( (lv_e_0_0= ruleprimary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:251:1: (lv_e_0_0= ruleprimary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:251:1: (lv_e_0_0= ruleprimary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:252:3: lv_e_0_0= ruleprimary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimary_or_callAccess().getEPrimary_expressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_expression_in_ruleprimary_or_call526);
                    lv_e_0_0=ruleprimary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimary_or_callRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_0_0, 
                              		"primary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:269:6: ( (lv_f_1_0= rulefunction_call ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:269:6: ( (lv_f_1_0= rulefunction_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:1: (lv_f_1_0= rulefunction_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:1: (lv_f_1_0= rulefunction_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:271:3: lv_f_1_0= rulefunction_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimary_or_callAccess().getFFunction_callParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefunction_call_in_ruleprimary_or_call553);
                    lv_f_1_0=rulefunction_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimary_or_callRule());
                      	        }
                             		set(
                             			current, 
                             			"f",
                              		lv_f_1_0, 
                              		"function_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprimary_or_call"


    // $ANTLR start "entryRulepostfix_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:295:1: entryRulepostfix_expression returns [EObject current=null] : iv_rulepostfix_expression= rulepostfix_expression EOF ;
    public final EObject entryRulepostfix_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepostfix_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:296:2: (iv_rulepostfix_expression= rulepostfix_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:297:2: iv_rulepostfix_expression= rulepostfix_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfix_expressionRule()); 
            }
            pushFollow(FOLLOW_rulepostfix_expression_in_entryRulepostfix_expression589);
            iv_rulepostfix_expression=rulepostfix_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepostfix_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfix_expression599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepostfix_expression"


    // $ANTLR start "rulepostfix_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:304:1: rulepostfix_expression returns [EObject current=null] : ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) ) ;
    public final EObject rulepostfix_expression() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        Token this_LEFT_BRACKET_6=null;
        Token this_RIGHT_BRACKET_8=null;
        Token this_INC_12=null;
        Token this_DEC_14=null;
        EObject lv_e_0_0 = null;

        EObject lv_ae_2_0 = null;

        EObject lv_fs_4_0 = null;

        EObject lv_e_5_0 = null;

        EObject lv_ae_7_0 = null;

        EObject lv_e_9_0 = null;

        EObject lv_fs_10_0 = null;

        EObject lv_e_11_0 = null;

        EObject lv_e_13_0 = null;

        EObject lv_e_15_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:307:28: ( ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:1: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:1: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:3: ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:3: ( (lv_e_0_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:309:1: (lv_e_0_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:309:1: (lv_e_0_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:310:3: lv_e_0_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression646);
                    lv_e_0_0=ruleprimary_or_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_0_0, 
                              		"primary_or_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getPostfix_expressionAccess().getLEFT_BRACKETTerminalRuleCall_0_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:330:1: ( (lv_ae_2_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:331:1: (lv_ae_2_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:331:1: (lv_ae_2_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:332:3: lv_ae_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulepostfix_expression677);
                    lv_ae_2_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"ae",
                              		lv_ae_2_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getPostfix_expressionAccess().getRIGHT_BRACKETTerminalRuleCall_0_3()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:352:1: ( (lv_fs_4_0= rulefield_selection ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:353:1: (lv_fs_4_0= rulefield_selection )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:353:1: (lv_fs_4_0= rulefield_selection )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:354:3: lv_fs_4_0= rulefield_selection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefield_selection_in_rulepostfix_expression708);
                    lv_fs_4_0=rulefield_selection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"fs",
                              		lv_fs_4_0, 
                              		"field_selection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:7: ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:7: ( (lv_e_5_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:372:1: (lv_e_5_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:372:1: (lv_e_5_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:373:3: lv_e_5_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression737);
                    lv_e_5_0=ruleprimary_or_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_5_0, 
                              		"primary_or_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_BRACKET_6=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKET_6, grammarAccess.getPostfix_expressionAccess().getLEFT_BRACKETTerminalRuleCall_1_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:393:1: ( (lv_ae_7_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:394:1: (lv_ae_7_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:394:1: (lv_ae_7_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:395:3: lv_ae_7_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulepostfix_expression768);
                    lv_ae_7_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"ae",
                              		lv_ae_7_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getPostfix_expressionAccess().getRIGHT_BRACKETTerminalRuleCall_1_3()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:7: ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:7: ( (lv_e_9_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:417:1: (lv_e_9_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:417:1: (lv_e_9_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:418:3: lv_e_9_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression807);
                    lv_e_9_0=ruleprimary_or_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_9_0, 
                              		"primary_or_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:434:2: ( (lv_fs_10_0= rulefield_selection ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:435:1: (lv_fs_10_0= rulefield_selection )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:435:1: (lv_fs_10_0= rulefield_selection )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:436:3: lv_fs_10_0= rulefield_selection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefield_selection_in_rulepostfix_expression828);
                    lv_fs_10_0=rulefield_selection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"fs",
                              		lv_fs_10_0, 
                              		"field_selection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:7: ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:7: ( (lv_e_11_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:454:1: (lv_e_11_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:454:1: (lv_e_11_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:455:3: lv_e_11_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression857);
                    lv_e_11_0=ruleprimary_or_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_11_0, 
                              		"primary_or_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_INC_12=(Token)match(input,RULE_INC,FOLLOW_RULE_INC_in_rulepostfix_expression868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INC_12, grammarAccess.getPostfix_expressionAccess().getINCTerminalRuleCall_3_1()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:7: ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:7: ( (lv_e_13_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:477:1: (lv_e_13_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:477:1: (lv_e_13_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:478:3: lv_e_13_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression896);
                    lv_e_13_0=ruleprimary_or_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_13_0, 
                              		"primary_or_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_DEC_14=(Token)match(input,RULE_DEC,FOLLOW_RULE_DEC_in_rulepostfix_expression907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DEC_14, grammarAccess.getPostfix_expressionAccess().getDECTerminalRuleCall_4_1()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:499:6: ( (lv_e_15_0= ruleprimary_or_call ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:499:6: ( (lv_e_15_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:500:1: (lv_e_15_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:500:1: (lv_e_15_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:501:3: lv_e_15_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression934);
                    lv_e_15_0=ruleprimary_or_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfix_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_15_0, 
                              		"primary_or_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepostfix_expression"


    // $ANTLR start "entryRulefunction_call"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:525:1: entryRulefunction_call returns [EObject current=null] : iv_rulefunction_call= rulefunction_call EOF ;
    public final EObject entryRulefunction_call() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_call = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:2: (iv_rulefunction_call= rulefunction_call EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:527:2: iv_rulefunction_call= rulefunction_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_callRule()); 
            }
            pushFollow(FOLLOW_rulefunction_call_in_entryRulefunction_call970);
            iv_rulefunction_call=rulefunction_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_call; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_call980); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_call"


    // $ANTLR start "rulefunction_call"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:534:1: rulefunction_call returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) ) ;
    public final EObject rulefunction_call() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_LEFT_PAREN_1=null;
        Token this_RIGHT_PAREN_3=null;
        Token this_LEFT_PAREN_5=null;
        Token this_RIGHT_PAREN_7=null;
        EObject lv_p_2_0 = null;

        EObject lv_ts_4_0 = null;

        EObject lv_p_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:537:28: ( ( ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:538:1: ( ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:538:1: ( ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENTIFIER) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_TYPE && LA7_0<=RULE_VOID)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:538:2: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:538:2: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:538:3: ( (lv_id_0_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:538:3: ( (lv_id_0_0= RULE_IDENTIFIER ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:539:1: (lv_id_0_0= RULE_IDENTIFIER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:539:1: (lv_id_0_0= RULE_IDENTIFIER )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:540:3: lv_id_0_0= RULE_IDENTIFIER
                    {
                    lv_id_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_call1023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_0_0, grammarAccess.getFunction_callAccess().getIdIDENTIFIERTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunction_callRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_0_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }

                    this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_1, grammarAccess.getFunction_callAccess().getLEFT_PARENTerminalRuleCall_0_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:560:1: ( (lv_p_2_0= rulefunction_call_parameter_list ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_IDENTIFIER && LA5_0<=RULE_LEFT_PAREN)||(LA5_0>=RULE_INC && LA5_0<=RULE_DEC)||(LA5_0>=RULE_PLUS && LA5_0<=RULE_BANG)||(LA5_0>=RULE_TYPE && LA5_0<=RULE_VOID)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:561:1: (lv_p_2_0= rulefunction_call_parameter_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:561:1: (lv_p_2_0= rulefunction_call_parameter_list )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:562:3: lv_p_2_0= rulefunction_call_parameter_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunction_callAccess().getPFunction_call_parameter_listParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1059);
                            lv_p_2_0=rulefunction_call_parameter_list();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunction_callRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"p",
                                      		lv_p_2_0, 
                                      		"function_call_parameter_list");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_RIGHT_PAREN_3=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_3, grammarAccess.getFunction_callAccess().getRIGHT_PARENTerminalRuleCall_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:583:6: ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:583:6: ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:583:7: ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:583:7: ( (lv_ts_4_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:584:1: (lv_ts_4_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:584:1: (lv_ts_4_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:585:3: lv_ts_4_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_callAccess().getTsType_specifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefunction_call1099);
                    lv_ts_4_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunction_callRule());
                      	        }
                             		set(
                             			current, 
                             			"ts",
                              		lv_ts_4_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_PAREN_5=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_5, grammarAccess.getFunction_callAccess().getLEFT_PARENTerminalRuleCall_1_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:605:1: ( (lv_p_6_0= rulefunction_call_parameter_list ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_IDENTIFIER && LA6_0<=RULE_LEFT_PAREN)||(LA6_0>=RULE_INC && LA6_0<=RULE_DEC)||(LA6_0>=RULE_PLUS && LA6_0<=RULE_BANG)||(LA6_0>=RULE_TYPE && LA6_0<=RULE_VOID)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:606:1: (lv_p_6_0= rulefunction_call_parameter_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:606:1: (lv_p_6_0= rulefunction_call_parameter_list )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:607:3: lv_p_6_0= rulefunction_call_parameter_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunction_callAccess().getPFunction_call_parameter_listParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1130);
                            lv_p_6_0=rulefunction_call_parameter_list();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunction_callRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"p",
                                      		lv_p_6_0, 
                                      		"function_call_parameter_list");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_RIGHT_PAREN_7=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_7, grammarAccess.getFunction_callAccess().getRIGHT_PARENTerminalRuleCall_1_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_call"


    // $ANTLR start "entryRulefunction_call_parameter_list"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:635:1: entryRulefunction_call_parameter_list returns [EObject current=null] : iv_rulefunction_call_parameter_list= rulefunction_call_parameter_list EOF ;
    public final EObject entryRulefunction_call_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_call_parameter_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:636:2: (iv_rulefunction_call_parameter_list= rulefunction_call_parameter_list EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:637:2: iv_rulefunction_call_parameter_list= rulefunction_call_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_call_parameter_listRule()); 
            }
            pushFollow(FOLLOW_rulefunction_call_parameter_list_in_entryRulefunction_call_parameter_list1178);
            iv_rulefunction_call_parameter_list=rulefunction_call_parameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_call_parameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_call_parameter_list1188); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_call_parameter_list"


    // $ANTLR start "rulefunction_call_parameter_list"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:644:1: rulefunction_call_parameter_list returns [EObject current=null] : ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* ) ;
    public final EObject rulefunction_call_parameter_list() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:647:28: ( ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:648:1: ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:648:1: ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:648:2: ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:648:2: ( (lv_a_0_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:649:1: (lv_a_0_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:649:1: (lv_a_0_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:650:3: lv_a_0_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_call_parameter_listAccess().getAAssignment_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1234);
            lv_a_0_0=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_call_parameter_listRule());
              	        }
                     		add(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"assignment_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:666:2: (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:666:3: this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulefunction_call_parameter_list1246); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getFunction_call_parameter_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:670:1: ( (lv_a_2_0= ruleassignment_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:671:1: (lv_a_2_0= ruleassignment_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:671:1: (lv_a_2_0= ruleassignment_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:672:3: lv_a_2_0= ruleassignment_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunction_call_parameter_listAccess().getAAssignment_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1266);
            	    lv_a_2_0=ruleassignment_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunction_call_parameter_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"a",
            	              		lv_a_2_0, 
            	              		"assignment_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_call_parameter_list"


    // $ANTLR start "entryRuleunary_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:696:1: entryRuleunary_expression returns [EObject current=null] : iv_ruleunary_expression= ruleunary_expression EOF ;
    public final EObject entryRuleunary_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:697:2: (iv_ruleunary_expression= ruleunary_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:698:2: iv_ruleunary_expression= ruleunary_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleunary_expression_in_entryRuleunary_expression1304);
            iv_ruleunary_expression=ruleunary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_expression1314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_expression"


    // $ANTLR start "ruleunary_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:705:1: ruleunary_expression returns [EObject current=null] : ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) ) ;
    public final EObject ruleunary_expression() throws RecognitionException {
        EObject current = null;

        Token this_INC_1=null;
        Token this_DEC_3=null;
        Token this_PLUS_5=null;
        Token this_DASH_7=null;
        Token this_BANG_9=null;
        EObject lv_p_0_0 = null;

        EObject lv_u_2_0 = null;

        EObject lv_u_4_0 = null;

        EObject lv_u_6_0 = null;

        EObject lv_u_8_0 = null;

        EObject lv_u_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:708:28: ( ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:709:1: ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:709:1: ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
            case RULE_INTCONSTANT:
            case RULE_FLOATCONSTANT:
            case RULE_BOOLCONSTANT:
            case RULE_LEFT_PAREN:
            case RULE_TYPE:
            case RULE_VOID:
                {
                alt9=1;
                }
                break;
            case RULE_INC:
                {
                alt9=2;
                }
                break;
            case RULE_DEC:
                {
                alt9=3;
                }
                break;
            case RULE_PLUS:
                {
                alt9=4;
                }
                break;
            case RULE_DASH:
                {
                alt9=5;
                }
                break;
            case RULE_BANG:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:709:2: ( (lv_p_0_0= rulepostfix_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:709:2: ( (lv_p_0_0= rulepostfix_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:710:1: (lv_p_0_0= rulepostfix_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:710:1: (lv_p_0_0= rulepostfix_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:711:3: lv_p_0_0= rulepostfix_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getPPostfix_expressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepostfix_expression_in_ruleunary_expression1360);
                    lv_p_0_0=rulepostfix_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"p",
                              		lv_p_0_0, 
                              		"postfix_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:728:6: (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:728:6: (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:728:7: this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) )
                    {
                    this_INC_1=(Token)match(input,RULE_INC,FOLLOW_RULE_INC_in_ruleunary_expression1378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INC_1, grammarAccess.getUnary_expressionAccess().getINCTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:732:1: ( (lv_u_2_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:733:1: (lv_u_2_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:733:1: (lv_u_2_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:734:3: lv_u_2_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1398);
                    lv_u_2_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"u",
                              		lv_u_2_0, 
                              		"unary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:751:6: (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:751:6: (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:751:7: this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) )
                    {
                    this_DEC_3=(Token)match(input,RULE_DEC,FOLLOW_RULE_DEC_in_ruleunary_expression1417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DEC_3, grammarAccess.getUnary_expressionAccess().getDECTerminalRuleCall_2_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:755:1: ( (lv_u_4_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:756:1: (lv_u_4_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:756:1: (lv_u_4_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:757:3: lv_u_4_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1437);
                    lv_u_4_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"u",
                              		lv_u_4_0, 
                              		"unary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:774:6: (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:774:6: (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:774:7: this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) )
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleunary_expression1456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_5, grammarAccess.getUnary_expressionAccess().getPLUSTerminalRuleCall_3_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:778:1: ( (lv_u_6_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:779:1: (lv_u_6_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:779:1: (lv_u_6_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:780:3: lv_u_6_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1476);
                    lv_u_6_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"u",
                              		lv_u_6_0, 
                              		"unary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:797:6: (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:797:6: (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:797:7: this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) )
                    {
                    this_DASH_7=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleunary_expression1495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_7, grammarAccess.getUnary_expressionAccess().getDASHTerminalRuleCall_4_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:801:1: ( (lv_u_8_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:802:1: (lv_u_8_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:802:1: (lv_u_8_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:803:3: lv_u_8_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1515);
                    lv_u_8_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"u",
                              		lv_u_8_0, 
                              		"unary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:820:6: (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:820:6: (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:820:7: this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) )
                    {
                    this_BANG_9=(Token)match(input,RULE_BANG,FOLLOW_RULE_BANG_in_ruleunary_expression1534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BANG_9, grammarAccess.getUnary_expressionAccess().getBANGTerminalRuleCall_5_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:824:1: ( (lv_u_10_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:825:1: (lv_u_10_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:825:1: (lv_u_10_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:826:3: lv_u_10_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1554);
                    lv_u_10_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"u",
                              		lv_u_10_0, 
                              		"unary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_expression"


    // $ANTLR start "entryRulemultiplicative_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:850:1: entryRulemultiplicative_expression returns [EObject current=null] : iv_rulemultiplicative_expression= rulemultiplicative_expression EOF ;
    public final EObject entryRulemultiplicative_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiplicative_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:851:2: (iv_rulemultiplicative_expression= rulemultiplicative_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:852:2: iv_rulemultiplicative_expression= rulemultiplicative_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicative_expressionRule()); 
            }
            pushFollow(FOLLOW_rulemultiplicative_expression_in_entryRulemultiplicative_expression1591);
            iv_rulemultiplicative_expression=rulemultiplicative_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplicative_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplicative_expression1601); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicative_expression"


    // $ANTLR start "rulemultiplicative_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:859:1: rulemultiplicative_expression returns [EObject current=null] : ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) ;
    public final EObject rulemultiplicative_expression() throws RecognitionException {
        EObject current = null;

        Token this_STAR_1=null;
        Token this_SLASH_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:862:28: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:863:1: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:863:1: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:863:2: ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:863:2: ( (lv_a_0_0= ruleunary_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:864:1: (lv_a_0_0= ruleunary_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:864:1: (lv_a_0_0= ruleunary_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:865:3: lv_a_0_0= ruleunary_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getAUnary_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleunary_expression_in_rulemultiplicative_expression1647);
            lv_a_0_0=ruleunary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicative_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"unary_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:2: ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STAR) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred21_InternalDecoraDsl()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==RULE_SLASH) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred22_InternalDecoraDsl()) ) {
                        alt10=2;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:4: this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    {
            	    this_STAR_1=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_rulemultiplicative_expression1660); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STAR_1, grammarAccess.getMultiplicative_expressionAccess().getSTARTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:885:1: ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:886:1: (lv_b_2_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:886:1: (lv_b_2_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:887:3: lv_b_2_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1680);
            	    lv_b_2_0=rulemultiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicative_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"multiplicative_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:7: this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    {
            	    this_SLASH_3=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_rulemultiplicative_expression1699); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SLASH_3, grammarAccess.getMultiplicative_expressionAccess().getSLASHTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:908:1: ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:909:1: (lv_b_4_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:909:1: (lv_b_4_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:910:3: lv_b_4_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1719);
            	    lv_b_4_0=rulemultiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicative_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_4_0, 
            	              		"multiplicative_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicative_expression"


    // $ANTLR start "entryRuleadditive_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:934:1: entryRuleadditive_expression returns [EObject current=null] : iv_ruleadditive_expression= ruleadditive_expression EOF ;
    public final EObject entryRuleadditive_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadditive_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:935:2: (iv_ruleadditive_expression= ruleadditive_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:936:2: iv_ruleadditive_expression= ruleadditive_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditive_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleadditive_expression_in_entryRuleadditive_expression1758);
            iv_ruleadditive_expression=ruleadditive_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadditive_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleadditive_expression1768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadditive_expression"


    // $ANTLR start "ruleadditive_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:943:1: ruleadditive_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) ;
    public final EObject ruleadditive_expression() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_DASH_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:946:28: ( ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:947:1: ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:947:1: ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:947:2: ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:947:2: ( (lv_a_0_0= rulemultiplicative_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:948:1: (lv_a_0_0= rulemultiplicative_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:948:1: (lv_a_0_0= rulemultiplicative_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:949:3: lv_a_0_0= rulemultiplicative_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditive_expressionAccess().getAMultiplicative_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1814);
            lv_a_0_0=rulemultiplicative_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditive_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"multiplicative_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:965:2: ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_PLUS) ) {
                    alt11=1;
                }
                else if ( (LA11_0==RULE_DASH) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:965:3: (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:965:3: (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:965:4: this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleadditive_expression1827); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_1, grammarAccess.getAdditive_expressionAccess().getPLUSTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:969:1: ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:970:1: (lv_b_2_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:970:1: (lv_b_2_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:971:3: lv_b_2_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditive_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1847);
            	    lv_b_2_0=rulemultiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditive_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"multiplicative_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:988:6: (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:988:6: (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:988:7: this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    {
            	    this_DASH_3=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleadditive_expression1866); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DASH_3, grammarAccess.getAdditive_expressionAccess().getDASHTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:992:1: ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:993:1: (lv_b_4_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:993:1: (lv_b_4_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:994:3: lv_b_4_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditive_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1886);
            	    lv_b_4_0=rulemultiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditive_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_4_0, 
            	              		"multiplicative_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadditive_expression"


    // $ANTLR start "entryRulerelational_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1018:1: entryRulerelational_expression returns [EObject current=null] : iv_rulerelational_expression= rulerelational_expression EOF ;
    public final EObject entryRulerelational_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelational_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1019:2: (iv_rulerelational_expression= rulerelational_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1020:2: iv_rulerelational_expression= rulerelational_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelational_expressionRule()); 
            }
            pushFollow(FOLLOW_rulerelational_expression_in_entryRulerelational_expression1925);
            iv_rulerelational_expression=rulerelational_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelational_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelational_expression1935); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelational_expression"


    // $ANTLR start "rulerelational_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1027:1: rulerelational_expression returns [EObject current=null] : ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* ) ;
    public final EObject rulerelational_expression() throws RecognitionException {
        EObject current = null;

        Token this_LTEQ_1=null;
        Token this_GTEQ_3=null;
        Token this_LT_5=null;
        Token this_GT_7=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;

        EObject lv_b_6_0 = null;

        EObject lv_b_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1030:28: ( ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1031:1: ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1031:1: ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1031:2: ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1031:2: ( (lv_a_0_0= ruleadditive_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1032:1: (lv_a_0_0= ruleadditive_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1032:1: (lv_a_0_0= ruleadditive_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1033:3: lv_a_0_0= ruleadditive_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getAAdditive_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression1981);
            lv_a_0_0=ruleadditive_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelational_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"additive_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1049:2: ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )*
            loop12:
            do {
                int alt12=5;
                switch ( input.LA(1) ) {
                case RULE_LTEQ:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_GTEQ:
                    {
                    alt12=2;
                    }
                    break;
                case RULE_LT:
                    {
                    alt12=3;
                    }
                    break;
                case RULE_GT:
                    {
                    alt12=4;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1049:3: (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1049:3: (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1049:4: this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) )
            	    {
            	    this_LTEQ_1=(Token)match(input,RULE_LTEQ,FOLLOW_RULE_LTEQ_in_rulerelational_expression1994); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LTEQ_1, grammarAccess.getRelational_expressionAccess().getLTEQTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1053:1: ( (lv_b_2_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1054:1: (lv_b_2_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1054:1: (lv_b_2_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1055:3: lv_b_2_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2014);
            	    lv_b_2_0=ruleadditive_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelational_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"additive_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1072:6: (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1072:6: (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1072:7: this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) )
            	    {
            	    this_GTEQ_3=(Token)match(input,RULE_GTEQ,FOLLOW_RULE_GTEQ_in_rulerelational_expression2033); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_GTEQ_3, grammarAccess.getRelational_expressionAccess().getGTEQTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1076:1: ( (lv_b_4_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1077:1: (lv_b_4_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1077:1: (lv_b_4_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1078:3: lv_b_4_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2053);
            	    lv_b_4_0=ruleadditive_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelational_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_4_0, 
            	              		"additive_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1095:6: (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1095:6: (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1095:7: this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) )
            	    {
            	    this_LT_5=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_rulerelational_expression2072); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LT_5, grammarAccess.getRelational_expressionAccess().getLTTerminalRuleCall_1_2_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1099:1: ( (lv_b_6_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1100:1: (lv_b_6_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1100:1: (lv_b_6_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1101:3: lv_b_6_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2092);
            	    lv_b_6_0=ruleadditive_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelational_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_6_0, 
            	              		"additive_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1118:6: (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1118:6: (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1118:7: this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) )
            	    {
            	    this_GT_7=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_rulerelational_expression2111); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_GT_7, grammarAccess.getRelational_expressionAccess().getGTTerminalRuleCall_1_3_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1122:1: ( (lv_b_8_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1123:1: (lv_b_8_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1123:1: (lv_b_8_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1124:3: lv_b_8_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2131);
            	    lv_b_8_0=ruleadditive_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelational_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_8_0, 
            	              		"additive_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelational_expression"


    // $ANTLR start "entryRuleequality_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1148:1: entryRuleequality_expression returns [EObject current=null] : iv_ruleequality_expression= ruleequality_expression EOF ;
    public final EObject entryRuleequality_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleequality_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1149:2: (iv_ruleequality_expression= ruleequality_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1150:2: iv_ruleequality_expression= ruleequality_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquality_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleequality_expression_in_entryRuleequality_expression2170);
            iv_ruleequality_expression=ruleequality_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleequality_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleequality_expression2180); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleequality_expression"


    // $ANTLR start "ruleequality_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1157:1: ruleequality_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* ) ;
    public final EObject ruleequality_expression() throws RecognitionException {
        EObject current = null;

        Token this_EQEQ_1=null;
        Token this_NEQ_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1160:28: ( ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1161:1: ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1161:1: ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1161:2: ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1161:2: ( (lv_a_0_0= rulerelational_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1162:1: (lv_a_0_0= rulerelational_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1162:1: (lv_a_0_0= rulerelational_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1163:3: lv_a_0_0= rulerelational_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquality_expressionAccess().getARelational_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulerelational_expression_in_ruleequality_expression2226);
            lv_a_0_0=rulerelational_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEquality_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"relational_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1179:2: ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_EQEQ) ) {
                    alt13=1;
                }
                else if ( (LA13_0==RULE_NEQ) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1179:3: (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1179:3: (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1179:4: this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) )
            	    {
            	    this_EQEQ_1=(Token)match(input,RULE_EQEQ,FOLLOW_RULE_EQEQ_in_ruleequality_expression2239); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQEQ_1, grammarAccess.getEquality_expressionAccess().getEQEQTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1183:1: ( (lv_b_2_0= rulerelational_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1184:1: (lv_b_2_0= rulerelational_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1184:1: (lv_b_2_0= rulerelational_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1185:3: lv_b_2_0= rulerelational_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEquality_expressionAccess().getBRelational_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelational_expression_in_ruleequality_expression2259);
            	    lv_b_2_0=rulerelational_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEquality_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"relational_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1202:6: (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1202:6: (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1202:7: this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) )
            	    {
            	    this_NEQ_3=(Token)match(input,RULE_NEQ,FOLLOW_RULE_NEQ_in_ruleequality_expression2278); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NEQ_3, grammarAccess.getEquality_expressionAccess().getNEQTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1206:1: ( (lv_b_4_0= rulerelational_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1207:1: (lv_b_4_0= rulerelational_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1207:1: (lv_b_4_0= rulerelational_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1208:3: lv_b_4_0= rulerelational_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEquality_expressionAccess().getBRelational_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelational_expression_in_ruleequality_expression2298);
            	    lv_b_4_0=rulerelational_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEquality_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_4_0, 
            	              		"relational_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleequality_expression"


    // $ANTLR start "entryRulelogical_and_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1232:1: entryRulelogical_and_expression returns [EObject current=null] : iv_rulelogical_and_expression= rulelogical_and_expression EOF ;
    public final EObject entryRulelogical_and_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_and_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1233:2: (iv_rulelogical_and_expression= rulelogical_and_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1234:2: iv_rulelogical_and_expression= rulelogical_and_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_and_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_and_expression_in_entryRulelogical_and_expression2337);
            iv_rulelogical_and_expression=rulelogical_and_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_and_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_and_expression2347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_and_expression"


    // $ANTLR start "rulelogical_and_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1241:1: rulelogical_and_expression returns [EObject current=null] : ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* ) ;
    public final EObject rulelogical_and_expression() throws RecognitionException {
        EObject current = null;

        Token this_AND_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1244:28: ( ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1245:1: ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1245:1: ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1245:2: ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1245:2: ( (lv_a_0_0= ruleequality_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1246:1: (lv_a_0_0= ruleequality_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1246:1: (lv_a_0_0= ruleequality_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1247:3: lv_a_0_0= ruleequality_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogical_and_expressionAccess().getAEquality_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleequality_expression_in_rulelogical_and_expression2393);
            lv_a_0_0=ruleequality_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogical_and_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"equality_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1263:2: (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1263:3: this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) )
            	    {
            	    this_AND_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulelogical_and_expression2405); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AND_1, grammarAccess.getLogical_and_expressionAccess().getANDTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1267:1: ( (lv_b_2_0= ruleequality_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1268:1: (lv_b_2_0= ruleequality_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1268:1: (lv_b_2_0= ruleequality_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1269:3: lv_b_2_0= ruleequality_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogical_and_expressionAccess().getBEquality_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleequality_expression_in_rulelogical_and_expression2425);
            	    lv_b_2_0=ruleequality_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogical_and_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"equality_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_and_expression"


    // $ANTLR start "entryRulelogical_xor_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1293:1: entryRulelogical_xor_expression returns [EObject current=null] : iv_rulelogical_xor_expression= rulelogical_xor_expression EOF ;
    public final EObject entryRulelogical_xor_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_xor_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1294:2: (iv_rulelogical_xor_expression= rulelogical_xor_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1295:2: iv_rulelogical_xor_expression= rulelogical_xor_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_xor_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_xor_expression_in_entryRulelogical_xor_expression2463);
            iv_rulelogical_xor_expression=rulelogical_xor_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_xor_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_xor_expression2473); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_xor_expression"


    // $ANTLR start "rulelogical_xor_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1302:1: rulelogical_xor_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* ) ;
    public final EObject rulelogical_xor_expression() throws RecognitionException {
        EObject current = null;

        Token this_XOR_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1305:28: ( ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1306:1: ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1306:1: ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1306:2: ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1306:2: ( (lv_a_0_0= rulelogical_and_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1307:1: (lv_a_0_0= rulelogical_and_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1307:1: (lv_a_0_0= rulelogical_and_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1308:3: lv_a_0_0= rulelogical_and_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogical_xor_expressionAccess().getALogical_and_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2519);
            lv_a_0_0=rulelogical_and_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogical_xor_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"logical_and_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1324:2: (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_XOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1324:3: this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) )
            	    {
            	    this_XOR_1=(Token)match(input,RULE_XOR,FOLLOW_RULE_XOR_in_rulelogical_xor_expression2531); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_XOR_1, grammarAccess.getLogical_xor_expressionAccess().getXORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1328:1: ( (lv_b_2_0= rulelogical_and_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1329:1: (lv_b_2_0= rulelogical_and_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1329:1: (lv_b_2_0= rulelogical_and_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1330:3: lv_b_2_0= rulelogical_and_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogical_xor_expressionAccess().getBLogical_and_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2551);
            	    lv_b_2_0=rulelogical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogical_xor_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"logical_and_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_xor_expression"


    // $ANTLR start "entryRulelogical_or_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1354:1: entryRulelogical_or_expression returns [EObject current=null] : iv_rulelogical_or_expression= rulelogical_or_expression EOF ;
    public final EObject entryRulelogical_or_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_or_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1355:2: (iv_rulelogical_or_expression= rulelogical_or_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1356:2: iv_rulelogical_or_expression= rulelogical_or_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_or_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_or_expression_in_entryRulelogical_or_expression2589);
            iv_rulelogical_or_expression=rulelogical_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_or_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_or_expression2599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_or_expression"


    // $ANTLR start "rulelogical_or_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1363:1: rulelogical_or_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* ) ;
    public final EObject rulelogical_or_expression() throws RecognitionException {
        EObject current = null;

        Token this_OR_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1366:28: ( ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1367:1: ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1367:1: ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1367:2: ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1367:2: ( (lv_a_0_0= rulelogical_xor_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1368:1: (lv_a_0_0= rulelogical_xor_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1368:1: (lv_a_0_0= rulelogical_xor_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1369:3: lv_a_0_0= rulelogical_xor_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogical_or_expressionAccess().getALogical_xor_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2645);
            lv_a_0_0=rulelogical_xor_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogical_or_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"logical_xor_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1385:2: (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1385:3: this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) )
            	    {
            	    this_OR_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulelogical_or_expression2657); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_1, grammarAccess.getLogical_or_expressionAccess().getORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1389:1: ( (lv_b_2_0= rulelogical_xor_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1390:1: (lv_b_2_0= rulelogical_xor_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1390:1: (lv_b_2_0= rulelogical_xor_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1391:3: lv_b_2_0= rulelogical_xor_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogical_or_expressionAccess().getBLogical_xor_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2677);
            	    lv_b_2_0=rulelogical_xor_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogical_or_expressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"b",
            	              		lv_b_2_0, 
            	              		"logical_xor_expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_or_expression"


    // $ANTLR start "entryRuleternary_part"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1415:1: entryRuleternary_part returns [EObject current=null] : iv_ruleternary_part= ruleternary_part EOF ;
    public final EObject entryRuleternary_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleternary_part = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1416:2: (iv_ruleternary_part= ruleternary_part EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1417:2: iv_ruleternary_part= ruleternary_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernary_partRule()); 
            }
            pushFollow(FOLLOW_ruleternary_part_in_entryRuleternary_part2715);
            iv_ruleternary_part=ruleternary_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleternary_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleternary_part2725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleternary_part"


    // $ANTLR start "ruleternary_part"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1424:1: ruleternary_part returns [EObject current=null] : (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) ) ;
    public final EObject ruleternary_part() throws RecognitionException {
        EObject current = null;

        Token this_QUESTION_0=null;
        Token this_COLON_2=null;
        EObject this_expression_1 = null;

        EObject lv_a_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1427:28: ( (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1428:1: (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1428:1: (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1428:2: this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) )
            {
            this_QUESTION_0=(Token)match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleternary_part2761); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_QUESTION_0, grammarAccess.getTernary_partAccess().getQUESTIONTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTernary_partAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleternary_part2785);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleternary_part2795); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_2, grammarAccess.getTernary_partAccess().getCOLONTerminalRuleCall_2()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1448:1: ( (lv_a_3_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1449:1: (lv_a_3_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1449:1: (lv_a_3_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1450:3: lv_a_3_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTernary_partAccess().getAAssignment_expressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_ruleternary_part2815);
            lv_a_3_0=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTernary_partRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_3_0, 
                      		"assignment_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleternary_part"


    // $ANTLR start "entryRuleconditional_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1474:1: entryRuleconditional_expression returns [EObject current=null] : iv_ruleconditional_expression= ruleconditional_expression EOF ;
    public final EObject entryRuleconditional_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1475:2: (iv_ruleconditional_expression= ruleconditional_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1476:2: iv_ruleconditional_expression= ruleconditional_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditional_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleconditional_expression_in_entryRuleconditional_expression2851);
            iv_ruleconditional_expression=ruleconditional_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconditional_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_expression2861); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditional_expression"


    // $ANTLR start "ruleconditional_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1483:1: ruleconditional_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? ) ;
    public final EObject ruleconditional_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        EObject lv_t_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1486:28: ( ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1487:1: ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1487:1: ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1487:2: ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1487:2: ( (lv_a_0_0= rulelogical_or_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1488:1: (lv_a_0_0= rulelogical_or_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1488:1: (lv_a_0_0= rulelogical_or_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1489:3: lv_a_0_0= rulelogical_or_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditional_expressionAccess().getALogical_or_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelogical_or_expression_in_ruleconditional_expression2907);
            lv_a_0_0=rulelogical_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditional_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_0_0, 
                      		"logical_or_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1505:2: ( (lv_t_1_0= ruleternary_part ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_QUESTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1506:1: (lv_t_1_0= ruleternary_part )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1506:1: (lv_t_1_0= ruleternary_part )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1507:3: lv_t_1_0= ruleternary_part
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditional_expressionAccess().getTTernary_partParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleternary_part_in_ruleconditional_expression2928);
                    lv_t_1_0=ruleternary_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditional_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"t",
                              		lv_t_1_0, 
                              		"ternary_part");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_expression"


    // $ANTLR start "entryRuleassignment_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1531:1: entryRuleassignment_expression returns [EObject current=null] : iv_ruleassignment_expression= ruleassignment_expression EOF ;
    public final EObject entryRuleassignment_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1532:2: (iv_ruleassignment_expression= ruleassignment_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1533:2: iv_ruleassignment_expression= ruleassignment_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_entryRuleassignment_expression2965);
            iv_ruleassignment_expression=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_expression2975); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_expression"


    // $ANTLR start "ruleassignment_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1540:1: ruleassignment_expression returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) ) ;
    public final EObject ruleassignment_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_c_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1543:28: ( ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:1: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:1: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:3: ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:3: ( (lv_a_0_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1545:1: (lv_a_0_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1545:1: (lv_a_0_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1546:3: lv_a_0_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getAUnary_expressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleassignment_expression3022);
                    lv_a_0_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignment_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"a",
                              		lv_a_0_0, 
                              		"unary_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1562:2: ( (lv_op_1_0= ruleassignment_operator ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1563:1: (lv_op_1_0= ruleassignment_operator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1563:1: (lv_op_1_0= ruleassignment_operator )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1564:3: lv_op_1_0= ruleassignment_operator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getOpAssignment_operatorParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_operator_in_ruleassignment_expression3043);
                    lv_op_1_0=ruleassignment_operator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignment_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"assignment_operator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1580:2: ( (lv_b_2_0= ruleassignment_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1581:1: (lv_b_2_0= ruleassignment_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1581:1: (lv_b_2_0= ruleassignment_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1582:3: lv_b_2_0= ruleassignment_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getBAssignment_expressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_expression_in_ruleassignment_expression3064);
                    lv_b_2_0=ruleassignment_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignment_expressionRule());
                      	        }
                             		add(
                             			current, 
                             			"b",
                              		lv_b_2_0, 
                              		"assignment_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1599:6: ( (lv_c_3_0= ruleconditional_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1599:6: ( (lv_c_3_0= ruleconditional_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1600:1: (lv_c_3_0= ruleconditional_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1600:1: (lv_c_3_0= ruleconditional_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1601:3: lv_c_3_0= ruleconditional_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getCConditional_expressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconditional_expression_in_ruleassignment_expression3092);
                    lv_c_3_0=ruleconditional_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignment_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"c",
                              		lv_c_3_0, 
                              		"conditional_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_expression"


    // $ANTLR start "entryRuleassignment_operator"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1625:1: entryRuleassignment_operator returns [String current=null] : iv_ruleassignment_operator= ruleassignment_operator EOF ;
    public final String entryRuleassignment_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1626:2: (iv_ruleassignment_operator= ruleassignment_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1627:2: iv_ruleassignment_operator= ruleassignment_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_operatorRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_operator_in_entryRuleassignment_operator3129);
            iv_ruleassignment_operator=ruleassignment_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_operator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_operator3140); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_operator"


    // $ANTLR start "ruleassignment_operator"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1634:1: ruleassignment_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ ) ;
    public final AntlrDatatypeRuleToken ruleassignment_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_STAREQ_1=null;
        Token this_SLASHEQ_2=null;
        Token this_PLUSEQ_3=null;
        Token this_DASHEQ_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1637:28: ( (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1638:1: (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1638:1: (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt19=1;
                }
                break;
            case RULE_STAREQ:
                {
                alt19=2;
                }
                break;
            case RULE_SLASHEQ:
                {
                alt19=3;
                }
                break;
            case RULE_PLUSEQ:
                {
                alt19=4;
                }
                break;
            case RULE_DASHEQ:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1638:6: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleassignment_operator3180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_0, grammarAccess.getAssignment_operatorAccess().getEQUALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1646:10: this_STAREQ_1= RULE_STAREQ
                    {
                    this_STAREQ_1=(Token)match(input,RULE_STAREQ,FOLLOW_RULE_STAREQ_in_ruleassignment_operator3206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STAREQ_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STAREQ_1, grammarAccess.getAssignment_operatorAccess().getSTAREQTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1654:10: this_SLASHEQ_2= RULE_SLASHEQ
                    {
                    this_SLASHEQ_2=(Token)match(input,RULE_SLASHEQ,FOLLOW_RULE_SLASHEQ_in_ruleassignment_operator3232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SLASHEQ_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SLASHEQ_2, grammarAccess.getAssignment_operatorAccess().getSLASHEQTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1662:10: this_PLUSEQ_3= RULE_PLUSEQ
                    {
                    this_PLUSEQ_3=(Token)match(input,RULE_PLUSEQ,FOLLOW_RULE_PLUSEQ_in_ruleassignment_operator3258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUSEQ_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUSEQ_3, grammarAccess.getAssignment_operatorAccess().getPLUSEQTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1670:10: this_DASHEQ_4= RULE_DASHEQ
                    {
                    this_DASHEQ_4=(Token)match(input,RULE_DASHEQ,FOLLOW_RULE_DASHEQ_in_ruleassignment_operator3284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASHEQ_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASHEQ_4, grammarAccess.getAssignment_operatorAccess().getDASHEQTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_operator"


    // $ANTLR start "entryRuleexpression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1685:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1686:2: (iv_ruleexpression= ruleexpression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1687:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression3329);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression3339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1694:1: ruleexpression returns [EObject current=null] : ( (lv_e_0_0= ruleassignment_expression ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1697:28: ( ( (lv_e_0_0= ruleassignment_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1698:1: ( (lv_e_0_0= ruleassignment_expression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1698:1: ( (lv_e_0_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1699:1: (lv_e_0_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1699:1: (lv_e_0_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1700:3: lv_e_0_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getEAssignment_expressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_ruleexpression3384);
            lv_e_0_0=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"e",
                      		lv_e_0_0, 
                      		"assignment_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulefunction_prototype"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1724:1: entryRulefunction_prototype returns [EObject current=null] : iv_rulefunction_prototype= rulefunction_prototype EOF ;
    public final EObject entryRulefunction_prototype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_prototype = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1725:2: (iv_rulefunction_prototype= rulefunction_prototype EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1726:2: iv_rulefunction_prototype= rulefunction_prototype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_prototypeRule()); 
            }
            pushFollow(FOLLOW_rulefunction_prototype_in_entryRulefunction_prototype3419);
            iv_rulefunction_prototype=rulefunction_prototype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_prototype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_prototype3429); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_prototype"


    // $ANTLR start "rulefunction_prototype"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1733:1: rulefunction_prototype returns [EObject current=null] : ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) ;
    public final EObject rulefunction_prototype() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token this_LEFT_PAREN_2=null;
        Token this_RIGHT_PAREN_4=null;
        EObject lv_t_0_0 = null;

        EObject lv_p_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1736:28: ( ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1737:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1737:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1737:2: ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1737:2: ( (lv_t_0_0= ruletype_specifier ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1738:1: (lv_t_0_0= ruletype_specifier )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1738:1: (lv_t_0_0= ruletype_specifier )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1739:3: lv_t_0_0= ruletype_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_prototypeAccess().getTType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_specifier_in_rulefunction_prototype3475);
            lv_t_0_0=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_prototypeRule());
              	        }
                     		set(
                     			current, 
                     			"t",
                      		lv_t_0_0, 
                      		"type_specifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1755:2: ( (lv_id_1_0= RULE_IDENTIFIER ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1756:1: (lv_id_1_0= RULE_IDENTIFIER )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1756:1: (lv_id_1_0= RULE_IDENTIFIER )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1757:3: lv_id_1_0= RULE_IDENTIFIER
            {
            lv_id_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_prototype3492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getFunction_prototypeAccess().getIdIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunction_prototypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            this_LEFT_PAREN_2=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_rulefunction_prototype3508); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PAREN_2, grammarAccess.getFunction_prototypeAccess().getLEFT_PARENTerminalRuleCall_2()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1777:1: ( (lv_p_3_0= ruleparameter_declaration_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_TYPE && LA20_0<=RULE_VOID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1778:1: (lv_p_3_0= ruleparameter_declaration_list )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1778:1: (lv_p_3_0= ruleparameter_declaration_list )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1779:3: lv_p_3_0= ruleparameter_declaration_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_prototypeAccess().getPParameter_declaration_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_declaration_list_in_rulefunction_prototype3528);
                    lv_p_3_0=ruleparameter_declaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunction_prototypeRule());
                      	        }
                             		set(
                             			current, 
                             			"p",
                              		lv_p_3_0, 
                              		"parameter_declaration_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RIGHT_PAREN_4=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_prototype3540); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PAREN_4, grammarAccess.getFunction_prototypeAccess().getRIGHT_PARENTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_prototype"


    // $ANTLR start "entryRuleparameter_declaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1807:1: entryRuleparameter_declaration returns [EObject current=null] : iv_ruleparameter_declaration= ruleparameter_declaration EOF ;
    public final EObject entryRuleparameter_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1808:2: (iv_ruleparameter_declaration= ruleparameter_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1809:2: iv_ruleparameter_declaration= ruleparameter_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_declaration_in_entryRuleparameter_declaration3575);
            iv_ruleparameter_declaration=ruleparameter_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_declaration3585); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_declaration"


    // $ANTLR start "ruleparameter_declaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1816:1: ruleparameter_declaration returns [EObject current=null] : ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject ruleparameter_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_t_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1819:28: ( ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1820:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1820:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1820:2: ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= RULE_IDENTIFIER ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1820:2: ( (lv_t_0_0= ruletype_specifier ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1821:1: (lv_t_0_0= ruletype_specifier )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1821:1: (lv_t_0_0= ruletype_specifier )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1822:3: lv_t_0_0= ruletype_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_declarationAccess().getTType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_specifier_in_ruleparameter_declaration3631);
            lv_t_0_0=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameter_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"t",
                      		lv_t_0_0, 
                      		"type_specifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1838:2: ( (lv_id_1_0= RULE_IDENTIFIER ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1839:1: (lv_id_1_0= RULE_IDENTIFIER )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1839:1: (lv_id_1_0= RULE_IDENTIFIER )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1840:3: lv_id_1_0= RULE_IDENTIFIER
            {
            lv_id_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter_declaration3648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getParameter_declarationAccess().getIdIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameter_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_declaration"


    // $ANTLR start "entryRuleparameter_declaration_list"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1864:1: entryRuleparameter_declaration_list returns [EObject current=null] : iv_ruleparameter_declaration_list= ruleparameter_declaration_list EOF ;
    public final EObject entryRuleparameter_declaration_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_declaration_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1865:2: (iv_ruleparameter_declaration_list= ruleparameter_declaration_list EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1866:2: iv_ruleparameter_declaration_list= ruleparameter_declaration_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_declaration_listRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_declaration_list_in_entryRuleparameter_declaration_list3689);
            iv_ruleparameter_declaration_list=ruleparameter_declaration_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_declaration_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_declaration_list3699); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_declaration_list"


    // $ANTLR start "ruleparameter_declaration_list"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1873:1: ruleparameter_declaration_list returns [EObject current=null] : ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* ) ;
    public final EObject ruleparameter_declaration_list() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_p_0_0 = null;

        EObject lv_p_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1876:28: ( ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1877:1: ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1877:1: ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1877:2: ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1877:2: ( (lv_p_0_0= ruleparameter_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1878:1: (lv_p_0_0= ruleparameter_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1878:1: (lv_p_0_0= ruleparameter_declaration )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1879:3: lv_p_0_0= ruleparameter_declaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_declaration_listAccess().getPParameter_declarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3745);
            lv_p_0_0=ruleparameter_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameter_declaration_listRule());
              	        }
                     		add(
                     			current, 
                     			"p",
                      		lv_p_0_0, 
                      		"parameter_declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1895:2: (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1895:3: this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleparameter_declaration_list3757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getParameter_declaration_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1899:1: ( (lv_p_2_0= ruleparameter_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1900:1: (lv_p_2_0= ruleparameter_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1900:1: (lv_p_2_0= ruleparameter_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1901:3: lv_p_2_0= ruleparameter_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_declaration_listAccess().getPParameter_declarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3777);
            	    lv_p_2_0=ruleparameter_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameter_declaration_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"p",
            	              		lv_p_2_0, 
            	              		"parameter_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_declaration_list"


    // $ANTLR start "entryRuledeclaration_identifier_and_init"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1925:1: entryRuledeclaration_identifier_and_init returns [EObject current=null] : iv_ruledeclaration_identifier_and_init= ruledeclaration_identifier_and_init EOF ;
    public final EObject entryRuledeclaration_identifier_and_init() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_identifier_and_init = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1926:2: (iv_ruledeclaration_identifier_and_init= ruledeclaration_identifier_and_init EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1927:2: iv_ruledeclaration_identifier_and_init= ruledeclaration_identifier_and_init EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_identifier_and_initRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_identifier_and_init_in_entryRuledeclaration_identifier_and_init3815);
            iv_ruledeclaration_identifier_and_init=ruledeclaration_identifier_and_init();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_identifier_and_init; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_identifier_and_init3825); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaration_identifier_and_init"


    // $ANTLR start "ruledeclaration_identifier_and_init"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1934:1: ruledeclaration_identifier_and_init returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? ) ;
    public final EObject ruledeclaration_identifier_and_init() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        Token this_EQUAL_4=null;
        EObject lv_ae_2_0 = null;

        EObject lv_e_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1937:28: ( ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1938:1: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1938:1: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1938:2: ( (lv_id_0_0= RULE_IDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1938:2: ( (lv_id_0_0= RULE_IDENTIFIER ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1939:1: (lv_id_0_0= RULE_IDENTIFIER )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1939:1: (lv_id_0_0= RULE_IDENTIFIER )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1940:3: lv_id_0_0= RULE_IDENTIFIER
            {
            lv_id_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruledeclaration_identifier_and_init3867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_0_0, grammarAccess.getDeclaration_identifier_and_initAccess().getIdIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclaration_identifier_and_initRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1956:2: (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LEFT_BRACKET) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1956:3: this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruledeclaration_identifier_and_init3884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getDeclaration_identifier_and_initAccess().getLEFT_BRACKETTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1960:1: ( (lv_ae_2_0= ruleconstant_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1961:1: (lv_ae_2_0= ruleconstant_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1961:1: (lv_ae_2_0= ruleconstant_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1962:3: lv_ae_2_0= ruleconstant_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaration_identifier_and_initAccess().getAeConstant_expressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconstant_expression_in_ruledeclaration_identifier_and_init3904);
                    lv_ae_2_0=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclaration_identifier_and_initRule());
                      	        }
                             		set(
                             			current, 
                             			"ae",
                              		lv_ae_2_0, 
                              		"constant_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruledeclaration_identifier_and_init3915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getDeclaration_identifier_and_initAccess().getRIGHT_BRACKETTerminalRuleCall_1_2()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1982:3: (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_EQUAL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1982:4: this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) )
                    {
                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruledeclaration_identifier_and_init3928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_4, grammarAccess.getDeclaration_identifier_and_initAccess().getEQUALTerminalRuleCall_2_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1986:1: ( (lv_e_5_0= ruleinitializer ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1987:1: (lv_e_5_0= ruleinitializer )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1987:1: (lv_e_5_0= ruleinitializer )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1988:3: lv_e_5_0= ruleinitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaration_identifier_and_initAccess().getEInitializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleinitializer_in_ruledeclaration_identifier_and_init3948);
                    lv_e_5_0=ruleinitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclaration_identifier_and_initRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_5_0, 
                              		"initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration_identifier_and_init"


    // $ANTLR start "entryRulesingle_declaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2012:1: entryRulesingle_declaration returns [EObject current=null] : iv_rulesingle_declaration= rulesingle_declaration EOF ;
    public final EObject entryRulesingle_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesingle_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2013:2: (iv_rulesingle_declaration= rulesingle_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2014:2: iv_rulesingle_declaration= rulesingle_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingle_declarationRule()); 
            }
            pushFollow(FOLLOW_rulesingle_declaration_in_entryRulesingle_declaration3986);
            iv_rulesingle_declaration=rulesingle_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesingle_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesingle_declaration3996); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesingle_declaration"


    // $ANTLR start "rulesingle_declaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2021:1: rulesingle_declaration returns [EObject current=null] : ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) ) ;
    public final EObject rulesingle_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_t_0_0 = null;

        EObject lv_d_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2024:28: ( ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2025:1: ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2025:1: ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2025:2: ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2025:2: ( (lv_t_0_0= rulefully_specified_type ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2026:1: (lv_t_0_0= rulefully_specified_type )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2026:1: (lv_t_0_0= rulefully_specified_type )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2027:3: lv_t_0_0= rulefully_specified_type
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingle_declarationAccess().getTFully_specified_typeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefully_specified_type_in_rulesingle_declaration4042);
            lv_t_0_0=rulefully_specified_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingle_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"t",
                      		lv_t_0_0, 
                      		"fully_specified_type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2043:2: ( (lv_d_1_0= ruledeclaration_identifier_and_init ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2044:1: (lv_d_1_0= ruledeclaration_identifier_and_init )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2044:1: (lv_d_1_0= ruledeclaration_identifier_and_init )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2045:3: lv_d_1_0= ruledeclaration_identifier_and_init
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingle_declarationAccess().getDDeclaration_identifier_and_initParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruledeclaration_identifier_and_init_in_rulesingle_declaration4063);
            lv_d_1_0=ruledeclaration_identifier_and_init();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingle_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"d",
                      		lv_d_1_0, 
                      		"declaration_identifier_and_init");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesingle_declaration"


    // $ANTLR start "entryRuledeclaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2069:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2070:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2071:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration4099);
            iv_ruledeclaration=ruledeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration4109); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaration"


    // $ANTLR start "ruledeclaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2078:1: ruledeclaration returns [EObject current=null] : ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_s_0_0 = null;

        EObject lv_d_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2081:28: ( ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2082:1: ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2082:1: ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2082:2: ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2082:2: ( (lv_s_0_0= rulesingle_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2083:1: (lv_s_0_0= rulesingle_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2083:1: (lv_s_0_0= rulesingle_declaration )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2084:3: lv_s_0_0= rulesingle_declaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getSSingle_declarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesingle_declaration_in_ruledeclaration4155);
            lv_s_0_0=rulesingle_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"s",
                      		lv_s_0_0, 
                      		"single_declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2100:2: (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2100:3: this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruledeclaration4167); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getDeclarationAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2104:1: ( (lv_d_2_0= ruledeclaration_identifier_and_init ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2105:1: (lv_d_2_0= ruledeclaration_identifier_and_init )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2105:1: (lv_d_2_0= ruledeclaration_identifier_and_init )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2106:3: lv_d_2_0= ruledeclaration_identifier_and_init
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getDDeclaration_identifier_and_initParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruledeclaration_identifier_and_init_in_ruledeclaration4187);
            	    lv_d_2_0=ruledeclaration_identifier_and_init();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"d",
            	              		lv_d_2_0, 
            	              		"declaration_identifier_and_init");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruledeclaration4200); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getDeclarationAccess().getSEMICOLONTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "entryRulefully_specified_type"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2134:1: entryRulefully_specified_type returns [EObject current=null] : iv_rulefully_specified_type= rulefully_specified_type EOF ;
    public final EObject entryRulefully_specified_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefully_specified_type = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2135:2: (iv_rulefully_specified_type= rulefully_specified_type EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2136:2: iv_rulefully_specified_type= rulefully_specified_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFully_specified_typeRule()); 
            }
            pushFollow(FOLLOW_rulefully_specified_type_in_entryRulefully_specified_type4235);
            iv_rulefully_specified_type=rulefully_specified_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefully_specified_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefully_specified_type4245); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefully_specified_type"


    // $ANTLR start "rulefully_specified_type"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2143:1: rulefully_specified_type returns [EObject current=null] : ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) ) ;
    public final EObject rulefully_specified_type() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tq_0_0 = null;

        AntlrDatatypeRuleToken lv_tp_1_0 = null;

        EObject lv_ts_2_0 = null;

        AntlrDatatypeRuleToken lv_tq_3_0 = null;

        EObject lv_ts_4_0 = null;

        AntlrDatatypeRuleToken lv_tp_5_0 = null;

        EObject lv_ts_6_0 = null;

        EObject lv_ts_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2146:28: ( ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2147:1: ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2147:1: ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=RULE_TYPE && LA25_1<=RULE_VOID)) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=67 && LA25_1<=69)) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA25_2 = input.LA(2);

                if ( ((LA25_2>=RULE_TYPE && LA25_2<=RULE_VOID)) ) {
                    alt25=2;
                }
                else if ( ((LA25_2>=67 && LA25_2<=69)) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 67:
            case 68:
            case 69:
                {
                alt25=3;
                }
                break;
            case RULE_TYPE:
            case RULE_VOID:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2147:2: ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2147:2: ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2147:3: ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2147:3: ( (lv_tq_0_0= ruletype_qualifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2148:1: (lv_tq_0_0= ruletype_qualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2148:1: (lv_tq_0_0= ruletype_qualifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2149:3: lv_tq_0_0= ruletype_qualifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTqType_qualifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_qualifier_in_rulefully_specified_type4292);
                    lv_tq_0_0=ruletype_qualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"tq",
                              		lv_tq_0_0, 
                              		"type_qualifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2165:2: ( (lv_tp_1_0= ruletype_precision ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2166:1: (lv_tp_1_0= ruletype_precision )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2166:1: (lv_tp_1_0= ruletype_precision )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2167:3: lv_tp_1_0= ruletype_precision
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTpType_precisionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_precision_in_rulefully_specified_type4313);
                    lv_tp_1_0=ruletype_precision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"tp",
                              		lv_tp_1_0, 
                              		"type_precision");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2183:2: ( (lv_ts_2_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2184:1: (lv_ts_2_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2184:1: (lv_ts_2_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2185:3: lv_ts_2_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4334);
                    lv_ts_2_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"ts",
                              		lv_ts_2_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2202:6: ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2202:6: ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2202:7: ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2202:7: ( (lv_tq_3_0= ruletype_qualifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2203:1: (lv_tq_3_0= ruletype_qualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2203:1: (lv_tq_3_0= ruletype_qualifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2204:3: lv_tq_3_0= ruletype_qualifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTqType_qualifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_qualifier_in_rulefully_specified_type4363);
                    lv_tq_3_0=ruletype_qualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"tq",
                              		lv_tq_3_0, 
                              		"type_qualifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2220:2: ( (lv_ts_4_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2221:1: (lv_ts_4_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2221:1: (lv_ts_4_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2222:3: lv_ts_4_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4384);
                    lv_ts_4_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"ts",
                              		lv_ts_4_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2239:6: ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2239:6: ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2239:7: ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2239:7: ( (lv_tp_5_0= ruletype_precision ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2240:1: (lv_tp_5_0= ruletype_precision )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2240:1: (lv_tp_5_0= ruletype_precision )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2241:3: lv_tp_5_0= ruletype_precision
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTpType_precisionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_precision_in_rulefully_specified_type4413);
                    lv_tp_5_0=ruletype_precision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"tp",
                              		lv_tp_5_0, 
                              		"type_precision");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2257:2: ( (lv_ts_6_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2258:1: (lv_ts_6_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2258:1: (lv_ts_6_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2259:3: lv_ts_6_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4434);
                    lv_ts_6_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"ts",
                              		lv_ts_6_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2276:6: ( (lv_ts_7_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2276:6: ( (lv_ts_7_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2277:1: (lv_ts_7_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2277:1: (lv_ts_7_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2278:3: lv_ts_7_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4462);
                    lv_ts_7_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFully_specified_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"ts",
                              		lv_ts_7_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefully_specified_type"


    // $ANTLR start "entryRuletype_qualifier"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2302:1: entryRuletype_qualifier returns [String current=null] : iv_ruletype_qualifier= ruletype_qualifier EOF ;
    public final String entryRuletype_qualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_qualifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2303:2: (iv_ruletype_qualifier= ruletype_qualifier EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2304:2: iv_ruletype_qualifier= ruletype_qualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_qualifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_qualifier_in_entryRuletype_qualifier4499);
            iv_ruletype_qualifier=ruletype_qualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_qualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_qualifier4510); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_qualifier"


    // $ANTLR start "ruletype_qualifier"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2311:1: ruletype_qualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'param' ) ;
    public final AntlrDatatypeRuleToken ruletype_qualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2314:28: ( (kw= 'const' | kw= 'param' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2315:1: (kw= 'const' | kw= 'param' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2315:1: (kw= 'const' | kw= 'param' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==65) ) {
                alt26=1;
            }
            else if ( (LA26_0==66) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2316:2: kw= 'const'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruletype_qualifier4548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_qualifierAccess().getConstKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2323:2: kw= 'param'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruletype_qualifier4567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_qualifierAccess().getParamKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_qualifier"


    // $ANTLR start "entryRuletype_precision"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2336:1: entryRuletype_precision returns [String current=null] : iv_ruletype_precision= ruletype_precision EOF ;
    public final String entryRuletype_precision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_precision = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2337:2: (iv_ruletype_precision= ruletype_precision EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2338:2: iv_ruletype_precision= ruletype_precision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_precisionRule()); 
            }
            pushFollow(FOLLOW_ruletype_precision_in_entryRuletype_precision4608);
            iv_ruletype_precision=ruletype_precision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_precision.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_precision4619); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_precision"


    // $ANTLR start "ruletype_precision"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2345:1: ruletype_precision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'lowp' | kw= 'mediump' | kw= 'highp' ) ;
    public final AntlrDatatypeRuleToken ruletype_precision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2348:28: ( (kw= 'lowp' | kw= 'mediump' | kw= 'highp' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2349:1: (kw= 'lowp' | kw= 'mediump' | kw= 'highp' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2349:1: (kw= 'lowp' | kw= 'mediump' | kw= 'highp' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt27=1;
                }
                break;
            case 68:
                {
                alt27=2;
                }
                break;
            case 69:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2350:2: kw= 'lowp'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruletype_precision4657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_precisionAccess().getLowpKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2357:2: kw= 'mediump'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruletype_precision4676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_precisionAccess().getMediumpKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2364:2: kw= 'highp'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruletype_precision4695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_precisionAccess().getHighpKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_precision"


    // $ANTLR start "entryRuletype_specifier"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2377:1: entryRuletype_specifier returns [EObject current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final EObject entryRuletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_specifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2378:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2379:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier4735);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier4745); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_specifier"


    // $ANTLR start "ruletype_specifier"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2386:1: ruletype_specifier returns [EObject current=null] : ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? ) ;
    public final EObject ruletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject this_array_brackets_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2389:28: ( ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2390:1: ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2390:1: ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2390:2: () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )?
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2390:2: ()
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2391:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getType_specifierAccess().getType_specifierAction_0(),
                          current);
                  
            }

            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getType_specifierAccess().getType_specifier_nonarrayParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruletype_specifier_nonarray_in_ruletype_specifier4801);
            ruletype_specifier_nonarray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2410:1: (this_array_brackets_2= rulearray_brackets )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LEFT_BRACKET) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2411:2: this_array_brackets_2= rulearray_brackets
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getArray_bracketsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulearray_brackets_in_ruletype_specifier4826);
                    this_array_brackets_2=rulearray_brackets();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_array_brackets_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_specifier"


    // $ANTLR start "entryRulearray_brackets"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2430:1: entryRulearray_brackets returns [EObject current=null] : iv_rulearray_brackets= rulearray_brackets EOF ;
    public final EObject entryRulearray_brackets() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_brackets = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2431:2: (iv_rulearray_brackets= rulearray_brackets EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2432:2: iv_rulearray_brackets= rulearray_brackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_bracketsRule()); 
            }
            pushFollow(FOLLOW_rulearray_brackets_in_entryRulearray_brackets4863);
            iv_rulearray_brackets=rulearray_brackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearray_brackets; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_brackets4873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearray_brackets"


    // $ANTLR start "rulearray_brackets"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2439:1: rulearray_brackets returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET ) ;
    public final EObject rulearray_brackets() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_0=null;
        Token this_RIGHT_BRACKET_2=null;
        EObject this_constant_expression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2442:28: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2443:1: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2443:1: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2443:2: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rulearray_brackets4909); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getArray_bracketsAccess().getLEFT_BRACKETTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArray_bracketsAccess().getConstant_expressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleconstant_expression_in_rulearray_brackets4933);
            this_constant_expression_1=ruleconstant_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_constant_expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RIGHT_BRACKET_2=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rulearray_brackets4943); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACKET_2, grammarAccess.getArray_bracketsAccess().getRIGHT_BRACKETTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_brackets"


    // $ANTLR start "entryRuletype_specifier_nonarray"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2471:1: entryRuletype_specifier_nonarray returns [String current=null] : iv_ruletype_specifier_nonarray= ruletype_specifier_nonarray EOF ;
    public final String entryRuletype_specifier_nonarray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_specifier_nonarray = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2472:2: (iv_ruletype_specifier_nonarray= ruletype_specifier_nonarray EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2473:2: iv_ruletype_specifier_nonarray= ruletype_specifier_nonarray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifier_nonarrayRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_nonarray_in_entryRuletype_specifier_nonarray4979);
            iv_ruletype_specifier_nonarray=ruletype_specifier_nonarray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier_nonarray.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier_nonarray4990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_specifier_nonarray"


    // $ANTLR start "ruletype_specifier_nonarray"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2480:1: ruletype_specifier_nonarray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= RULE_TYPE | this_VOID_1= RULE_VOID ) ;
    public final AntlrDatatypeRuleToken ruletype_specifier_nonarray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_0=null;
        Token this_VOID_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2483:28: ( (this_TYPE_0= RULE_TYPE | this_VOID_1= RULE_VOID ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2484:1: (this_TYPE_0= RULE_TYPE | this_VOID_1= RULE_VOID )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2484:1: (this_TYPE_0= RULE_TYPE | this_VOID_1= RULE_VOID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_TYPE) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_VOID) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2484:6: this_TYPE_0= RULE_TYPE
                    {
                    this_TYPE_0=(Token)match(input,RULE_TYPE,FOLLOW_RULE_TYPE_in_ruletype_specifier_nonarray5030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TYPE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TYPE_0, grammarAccess.getType_specifier_nonarrayAccess().getTYPETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2492:10: this_VOID_1= RULE_VOID
                    {
                    this_VOID_1=(Token)match(input,RULE_VOID,FOLLOW_RULE_VOID_in_ruletype_specifier_nonarray5056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VOID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VOID_1, grammarAccess.getType_specifier_nonarrayAccess().getVOIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_specifier_nonarray"


    // $ANTLR start "entryRuleinitializer"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2507:1: entryRuleinitializer returns [EObject current=null] : iv_ruleinitializer= ruleinitializer EOF ;
    public final EObject entryRuleinitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitializer = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2508:2: (iv_ruleinitializer= ruleinitializer EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2509:2: iv_ruleinitializer= ruleinitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleinitializer_in_entryRuleinitializer5101);
            iv_ruleinitializer=ruleinitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinitializer5111); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinitializer"


    // $ANTLR start "ruleinitializer"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2516:1: ruleinitializer returns [EObject current=null] : ( (lv_e_0_0= ruleassignment_expression ) ) ;
    public final EObject ruleinitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2519:28: ( ( (lv_e_0_0= ruleassignment_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2520:1: ( (lv_e_0_0= ruleassignment_expression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2520:1: ( (lv_e_0_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2521:1: (lv_e_0_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2521:1: (lv_e_0_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2522:3: lv_e_0_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInitializerAccess().getEAssignment_expressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_ruleinitializer5156);
            lv_e_0_0=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInitializerRule());
              	        }
                     		set(
                     			current, 
                     			"e",
                      		lv_e_0_0, 
                      		"assignment_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinitializer"


    // $ANTLR start "entryRuledeclaration_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2546:1: entryRuledeclaration_statement returns [EObject current=null] : iv_ruledeclaration_statement= ruledeclaration_statement EOF ;
    public final EObject entryRuledeclaration_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2547:2: (iv_ruledeclaration_statement= ruledeclaration_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2548:2: iv_ruledeclaration_statement= ruledeclaration_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_statementRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_statement_in_entryRuledeclaration_statement5191);
            iv_ruledeclaration_statement=ruledeclaration_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_statement5201); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaration_statement"


    // $ANTLR start "ruledeclaration_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2555:1: ruledeclaration_statement returns [EObject current=null] : ( (lv_d_0_0= ruledeclaration ) ) ;
    public final EObject ruledeclaration_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_d_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2558:28: ( ( (lv_d_0_0= ruledeclaration ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2559:1: ( (lv_d_0_0= ruledeclaration ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2559:1: ( (lv_d_0_0= ruledeclaration ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2560:1: (lv_d_0_0= ruledeclaration )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2560:1: (lv_d_0_0= ruledeclaration )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2561:3: lv_d_0_0= ruledeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaration_statementAccess().getDDeclarationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruledeclaration_in_ruledeclaration_statement5246);
            lv_d_0_0=ruledeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaration_statementRule());
              	        }
                     		set(
                     			current, 
                     			"d",
                      		lv_d_0_0, 
                      		"declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration_statement"


    // $ANTLR start "entryRulestatement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2585:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2586:2: (iv_rulestatement= rulestatement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2587:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement5281);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement5291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2594:1: rulestatement returns [EObject current=null] : ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_s_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2597:28: ( ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2598:1: ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2598:1: ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LEFT_BRACE) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_IDENTIFIER && LA30_0<=RULE_LEFT_PAREN)||(LA30_0>=RULE_INC && LA30_0<=RULE_DEC)||(LA30_0>=RULE_PLUS && LA30_0<=RULE_BANG)||(LA30_0>=RULE_SEMICOLON && LA30_0<=RULE_VOID)||LA30_0==RULE_IF||(LA30_0>=RULE_WHILE && LA30_0<=RULE_RETURN)||(LA30_0>=65 && LA30_0<=69)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2598:2: ( (lv_c_0_0= rulecompound_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2598:2: ( (lv_c_0_0= rulecompound_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2599:1: (lv_c_0_0= rulecompound_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2599:1: (lv_c_0_0= rulecompound_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2600:3: lv_c_0_0= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCCompound_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestatement5337);
                    lv_c_0_0=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"c",
                              		lv_c_0_0, 
                              		"compound_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2617:6: ( (lv_s_1_0= rulesimple_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2617:6: ( (lv_s_1_0= rulesimple_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2618:1: (lv_s_1_0= rulesimple_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2618:1: (lv_s_1_0= rulesimple_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2619:3: lv_s_1_0= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSSimple_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement5364);
                    lv_s_1_0=rulesimple_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"s",
                              		lv_s_1_0, 
                              		"simple_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2643:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2644:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2645:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_statementRule()); 
            }
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement5400);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement5410); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2652:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_d_0_0 = null;

        EObject lv_e_1_0 = null;

        EObject lv_s_2_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_j_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2655:28: ( ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:1: ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:1: ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) )
            int alt31=5;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:2: ( (lv_d_0_0= ruledeclaration_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:2: ( (lv_d_0_0= ruledeclaration_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2657:1: (lv_d_0_0= ruledeclaration_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2657:1: (lv_d_0_0= ruledeclaration_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2658:3: lv_d_0_0= ruledeclaration_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getDDeclaration_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaration_statement_in_rulesimple_statement5456);
                    lv_d_0_0=ruledeclaration_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"d",
                              		lv_d_0_0, 
                              		"declaration_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2675:6: ( (lv_e_1_0= ruleexpression_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2675:6: ( (lv_e_1_0= ruleexpression_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2676:1: (lv_e_1_0= ruleexpression_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2676:1: (lv_e_1_0= ruleexpression_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2677:3: lv_e_1_0= ruleexpression_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getEExpression_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_statement_in_rulesimple_statement5483);
                    lv_e_1_0=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_1_0, 
                              		"expression_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2694:6: ( (lv_s_2_0= ruleselection_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2694:6: ( (lv_s_2_0= ruleselection_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2695:1: (lv_s_2_0= ruleselection_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2695:1: (lv_s_2_0= ruleselection_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2696:3: lv_s_2_0= ruleselection_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getSSelection_statementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselection_statement_in_rulesimple_statement5510);
                    lv_s_2_0=ruleselection_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"s",
                              		lv_s_2_0, 
                              		"selection_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2713:6: ( (lv_i_3_0= ruleiteration_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2713:6: ( (lv_i_3_0= ruleiteration_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2714:1: (lv_i_3_0= ruleiteration_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2714:1: (lv_i_3_0= ruleiteration_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2715:3: lv_i_3_0= ruleiteration_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getIIteration_statementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleiteration_statement_in_rulesimple_statement5537);
                    lv_i_3_0=ruleiteration_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"i",
                              		lv_i_3_0, 
                              		"iteration_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2732:6: ( (lv_j_4_0= rulejump_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2732:6: ( (lv_j_4_0= rulejump_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2733:1: (lv_j_4_0= rulejump_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2733:1: (lv_j_4_0= rulejump_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2734:3: lv_j_4_0= rulejump_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getJJump_statementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulejump_statement_in_rulesimple_statement5564);
                    lv_j_4_0=rulejump_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"j",
                              		lv_j_4_0, 
                              		"jump_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRulecompound_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2758:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2759:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2760:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement5600);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement5610); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2767:1: rulecompound_statement returns [EObject current=null] : ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_1=null;
        Token this_RIGHT_BRACE_3=null;
        EObject lv_s_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2770:28: ( ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2771:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2771:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2771:2: () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2771:2: ()
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2772:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompound_statementAccess().getCompound_statementAction_0(),
                          current);
                  
            }

            }

            this_LEFT_BRACE_1=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement5658); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACE_1, grammarAccess.getCompound_statementAccess().getLEFT_BRACETerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2784:1: ( (lv_s_2_0= rulestatement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_IDENTIFIER && LA32_0<=RULE_LEFT_PAREN)||(LA32_0>=RULE_INC && LA32_0<=RULE_DEC)||(LA32_0>=RULE_PLUS && LA32_0<=RULE_BANG)||(LA32_0>=RULE_SEMICOLON && LA32_0<=RULE_LEFT_BRACE)||LA32_0==RULE_IF||(LA32_0>=RULE_WHILE && LA32_0<=RULE_RETURN)||(LA32_0>=65 && LA32_0<=69)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2785:1: (lv_s_2_0= rulestatement )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2785:1: (lv_s_2_0= rulestatement )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2786:3: lv_s_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompound_statementAccess().getSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulecompound_statement5678);
            	    lv_s_2_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"s",
            	              		lv_s_2_0, 
            	              		"statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            this_RIGHT_BRACE_3=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement5690); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACE_3, grammarAccess.getCompound_statementAccess().getRIGHT_BRACETerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulestatement_no_new_scope"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2814:1: entryRulestatement_no_new_scope returns [EObject current=null] : iv_rulestatement_no_new_scope= rulestatement_no_new_scope EOF ;
    public final EObject entryRulestatement_no_new_scope() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_no_new_scope = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2815:2: (iv_rulestatement_no_new_scope= rulestatement_no_new_scope EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2816:2: iv_rulestatement_no_new_scope= rulestatement_no_new_scope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_no_new_scopeRule()); 
            }
            pushFollow(FOLLOW_rulestatement_no_new_scope_in_entryRulestatement_no_new_scope5725);
            iv_rulestatement_no_new_scope=rulestatement_no_new_scope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_no_new_scope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_no_new_scope5735); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_no_new_scope"


    // $ANTLR start "rulestatement_no_new_scope"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2823:1: rulestatement_no_new_scope returns [EObject current=null] : ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) ;
    public final EObject rulestatement_no_new_scope() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_s_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2826:28: ( ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2827:1: ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2827:1: ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LEFT_BRACE) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=RULE_IDENTIFIER && LA33_0<=RULE_LEFT_PAREN)||(LA33_0>=RULE_INC && LA33_0<=RULE_DEC)||(LA33_0>=RULE_PLUS && LA33_0<=RULE_BANG)||(LA33_0>=RULE_SEMICOLON && LA33_0<=RULE_VOID)||LA33_0==RULE_IF||(LA33_0>=RULE_WHILE && LA33_0<=RULE_RETURN)||(LA33_0>=65 && LA33_0<=69)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2827:2: ( (lv_c_0_0= rulecompound_statement_no_new_scope ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2827:2: ( (lv_c_0_0= rulecompound_statement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2828:1: (lv_c_0_0= rulecompound_statement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2828:1: (lv_c_0_0= rulecompound_statement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2829:3: lv_c_0_0= rulecompound_statement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_no_new_scopeAccess().getCCompound_statement_no_new_scopeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecompound_statement_no_new_scope_in_rulestatement_no_new_scope5781);
                    lv_c_0_0=rulecompound_statement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_no_new_scopeRule());
                      	        }
                             		set(
                             			current, 
                             			"c",
                              		lv_c_0_0, 
                              		"compound_statement_no_new_scope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2846:6: ( (lv_s_1_0= rulesimple_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2846:6: ( (lv_s_1_0= rulesimple_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2847:1: (lv_s_1_0= rulesimple_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2847:1: (lv_s_1_0= rulesimple_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2848:3: lv_s_1_0= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_no_new_scopeAccess().getSSimple_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement_no_new_scope5808);
                    lv_s_1_0=rulesimple_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_no_new_scopeRule());
                      	        }
                             		set(
                             			current, 
                             			"s",
                              		lv_s_1_0, 
                              		"simple_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_no_new_scope"


    // $ANTLR start "entryRulecompound_statement_no_new_scope"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2872:1: entryRulecompound_statement_no_new_scope returns [EObject current=null] : iv_rulecompound_statement_no_new_scope= rulecompound_statement_no_new_scope EOF ;
    public final EObject entryRulecompound_statement_no_new_scope() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement_no_new_scope = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2873:2: (iv_rulecompound_statement_no_new_scope= rulecompound_statement_no_new_scope EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2874:2: iv_rulecompound_statement_no_new_scope= rulecompound_statement_no_new_scope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statement_no_new_scopeRule()); 
            }
            pushFollow(FOLLOW_rulecompound_statement_no_new_scope_in_entryRulecompound_statement_no_new_scope5844);
            iv_rulecompound_statement_no_new_scope=rulecompound_statement_no_new_scope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement_no_new_scope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement_no_new_scope5854); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement_no_new_scope"


    // $ANTLR start "rulecompound_statement_no_new_scope"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2881:1: rulecompound_statement_no_new_scope returns [EObject current=null] : ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) ;
    public final EObject rulecompound_statement_no_new_scope() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_1=null;
        Token this_RIGHT_BRACE_3=null;
        EObject lv_s_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2884:28: ( ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2885:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2885:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2885:2: () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2885:2: ()
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2886:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompound_statement_no_new_scopeAccess().getCompound_statement_no_new_scopeAction_0(),
                          current);
                  
            }

            }

            this_LEFT_BRACE_1=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement_no_new_scope5902); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACE_1, grammarAccess.getCompound_statement_no_new_scopeAccess().getLEFT_BRACETerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2898:1: ( (lv_s_2_0= rulestatement ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_IDENTIFIER && LA34_0<=RULE_LEFT_PAREN)||(LA34_0>=RULE_INC && LA34_0<=RULE_DEC)||(LA34_0>=RULE_PLUS && LA34_0<=RULE_BANG)||(LA34_0>=RULE_SEMICOLON && LA34_0<=RULE_LEFT_BRACE)||LA34_0==RULE_IF||(LA34_0>=RULE_WHILE && LA34_0<=RULE_RETURN)||(LA34_0>=65 && LA34_0<=69)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2899:1: (lv_s_2_0= rulestatement )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2899:1: (lv_s_2_0= rulestatement )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2900:3: lv_s_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompound_statement_no_new_scopeAccess().getSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulecompound_statement_no_new_scope5922);
            	    lv_s_2_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompound_statement_no_new_scopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"s",
            	              		lv_s_2_0, 
            	              		"statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            this_RIGHT_BRACE_3=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement_no_new_scope5934); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACE_3, grammarAccess.getCompound_statement_no_new_scopeAccess().getRIGHT_BRACETerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement_no_new_scope"


    // $ANTLR start "entryRuleexpression_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2928:1: entryRuleexpression_statement returns [EObject current=null] : iv_ruleexpression_statement= ruleexpression_statement EOF ;
    public final EObject entryRuleexpression_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2929:2: (iv_ruleexpression_statement= ruleexpression_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2930:2: iv_ruleexpression_statement= ruleexpression_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_statementRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_statement_in_entryRuleexpression_statement5969);
            iv_ruleexpression_statement=ruleexpression_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_statement5979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_statement"


    // $ANTLR start "ruleexpression_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2937:1: ruleexpression_statement returns [EObject current=null] : ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ) ;
    public final EObject ruleexpression_statement() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_e_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2940:28: ( ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2941:1: ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2941:1: ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SEMICOLON) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_IDENTIFIER && LA35_0<=RULE_LEFT_PAREN)||(LA35_0>=RULE_INC && LA35_0<=RULE_DEC)||(LA35_0>=RULE_PLUS && LA35_0<=RULE_BANG)||(LA35_0>=RULE_TYPE && LA35_0<=RULE_VOID)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2941:2: ( () this_SEMICOLON_1= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2941:2: ( () this_SEMICOLON_1= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2941:3: () this_SEMICOLON_1= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2941:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2942:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_statementAccess().getExpression_statementAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_1, grammarAccess.getExpression_statementAccess().getSEMICOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2955:6: ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2955:6: ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2955:7: ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2955:7: ( (lv_e_2_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2956:1: (lv_e_2_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2956:1: (lv_e_2_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2957:3: lv_e_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_statementAccess().getEExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_statement6056);
                    lv_e_2_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_2_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_3, grammarAccess.getExpression_statementAccess().getSEMICOLONTerminalRuleCall_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_statement"


    // $ANTLR start "entryRuleconstant_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2985:1: entryRuleconstant_expression returns [EObject current=null] : iv_ruleconstant_expression= ruleconstant_expression EOF ;
    public final EObject entryRuleconstant_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2986:2: (iv_ruleconstant_expression= ruleconstant_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2987:2: iv_ruleconstant_expression= ruleconstant_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression6103);
            iv_ruleconstant_expression=ruleconstant_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_expression6113); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_expression"


    // $ANTLR start "ruleconstant_expression"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2994:1: ruleconstant_expression returns [EObject current=null] : ( (lv_c_0_0= ruleconditional_expression ) ) ;
    public final EObject ruleconstant_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2997:28: ( ( (lv_c_0_0= ruleconditional_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2998:1: ( (lv_c_0_0= ruleconditional_expression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2998:1: ( (lv_c_0_0= ruleconditional_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2999:1: (lv_c_0_0= ruleconditional_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2999:1: (lv_c_0_0= ruleconditional_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3000:3: lv_c_0_0= ruleconditional_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstant_expressionAccess().getCConditional_expressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleconditional_expression_in_ruleconstant_expression6158);
            lv_c_0_0=ruleconditional_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstant_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"c",
                      		lv_c_0_0, 
                      		"conditional_expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_expression"


    // $ANTLR start "entryRuleselection_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3024:1: entryRuleselection_statement returns [EObject current=null] : iv_ruleselection_statement= ruleselection_statement EOF ;
    public final EObject entryRuleselection_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselection_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3025:2: (iv_ruleselection_statement= ruleselection_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3026:2: iv_ruleselection_statement= ruleselection_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelection_statementRule()); 
            }
            pushFollow(FOLLOW_ruleselection_statement_in_entryRuleselection_statement6193);
            iv_ruleselection_statement=ruleselection_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselection_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselection_statement6203); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleselection_statement"


    // $ANTLR start "ruleselection_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3033:1: ruleselection_statement returns [EObject current=null] : (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? ) ;
    public final EObject ruleselection_statement() throws RecognitionException {
        EObject current = null;

        Token this_IF_0=null;
        Token this_LEFT_PAREN_1=null;
        Token this_RIGHT_PAREN_3=null;
        Token this_ELSE_5=null;
        EObject lv_e_2_0 = null;

        EObject lv_a_4_0 = null;

        EObject lv_b_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3036:28: ( (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3037:1: (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3037:1: (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3037:2: this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )?
            {
            this_IF_0=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleselection_statement6239); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IF_0, grammarAccess.getSelection_statementAccess().getIFTerminalRuleCall_0()); 
                  
            }
            this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleselection_statement6249); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PAREN_1, grammarAccess.getSelection_statementAccess().getLEFT_PARENTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3045:1: ( (lv_e_2_0= ruleexpression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3046:1: (lv_e_2_0= ruleexpression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3046:1: (lv_e_2_0= ruleexpression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3047:3: lv_e_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelection_statementAccess().getEExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleselection_statement6269);
            lv_e_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelection_statementRule());
              	        }
                     		set(
                     			current, 
                     			"e",
                      		lv_e_2_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RIGHT_PAREN_3=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleselection_statement6280); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PAREN_3, grammarAccess.getSelection_statementAccess().getRIGHT_PARENTerminalRuleCall_3()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3067:1: ( (lv_a_4_0= rulestatement ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3068:1: (lv_a_4_0= rulestatement )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3068:1: (lv_a_4_0= rulestatement )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3069:3: lv_a_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelection_statementAccess().getAStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruleselection_statement6300);
            lv_a_4_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelection_statementRule());
              	        }
                     		set(
                     			current, 
                     			"a",
                      		lv_a_4_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3085:2: (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ELSE) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred62_InternalDecoraDsl()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3085:3: this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) )
                    {
                    this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleselection_statement6312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELSE_5, grammarAccess.getSelection_statementAccess().getELSETerminalRuleCall_5_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3089:1: ( (lv_b_6_0= rulestatement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3090:1: (lv_b_6_0= rulestatement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3090:1: (lv_b_6_0= rulestatement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3091:3: lv_b_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelection_statementAccess().getBStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleselection_statement6332);
                    lv_b_6_0=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelection_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"b",
                              		lv_b_6_0, 
                              		"statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleselection_statement"


    // $ANTLR start "entryRulecondition"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3115:1: entryRulecondition returns [EObject current=null] : iv_rulecondition= rulecondition EOF ;
    public final EObject entryRulecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecondition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3116:2: (iv_rulecondition= rulecondition EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3117:2: iv_rulecondition= rulecondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_rulecondition_in_entryRulecondition6370);
            iv_rulecondition=rulecondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecondition6380); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecondition"


    // $ANTLR start "rulecondition"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3124:1: rulecondition returns [EObject current=null] : ( (lv_e_0_0= ruleexpression ) ) ;
    public final EObject rulecondition() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3127:28: ( ( (lv_e_0_0= ruleexpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3128:1: ( (lv_e_0_0= ruleexpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3128:1: ( (lv_e_0_0= ruleexpression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3129:1: (lv_e_0_0= ruleexpression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3129:1: (lv_e_0_0= ruleexpression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3130:3: lv_e_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getEExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulecondition6425);
            lv_e_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRule());
              	        }
                     		set(
                     			current, 
                     			"e",
                      		lv_e_0_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecondition"


    // $ANTLR start "entryRuleiteration_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3154:1: entryRuleiteration_statement returns [EObject current=null] : iv_ruleiteration_statement= ruleiteration_statement EOF ;
    public final EObject entryRuleiteration_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiteration_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3155:2: (iv_ruleiteration_statement= ruleiteration_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3156:2: iv_ruleiteration_statement= ruleiteration_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteration_statementRule()); 
            }
            pushFollow(FOLLOW_ruleiteration_statement_in_entryRuleiteration_statement6460);
            iv_ruleiteration_statement=ruleiteration_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiteration_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleiteration_statement6470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleiteration_statement"


    // $ANTLR start "ruleiteration_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3163:1: ruleiteration_statement returns [EObject current=null] : ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) ) ;
    public final EObject ruleiteration_statement() throws RecognitionException {
        EObject current = null;

        Token this_WHILE_0=null;
        Token this_LEFT_PAREN_1=null;
        Token this_RIGHT_PAREN_3=null;
        Token this_DO_5=null;
        Token this_WHILE_7=null;
        Token this_LEFT_PAREN_8=null;
        Token this_RIGHT_PAREN_10=null;
        Token this_SEMICOLON_11=null;
        Token this_FOR_13=null;
        Token this_LEFT_PAREN_14=null;
        Token this_RIGHT_PAREN_17=null;
        Token this_FOR_19=null;
        Token this_LEFT_PAREN_20=null;
        Token this_RIGHT_PAREN_23=null;
        EObject lv_c_2_0 = null;

        EObject lv_snns_4_0 = null;

        EObject lv_s_6_0 = null;

        EObject lv_e_9_0 = null;

        EObject lv_u_12_0 = null;

        EObject lv_init_15_0 = null;

        EObject lv_rem_16_0 = null;

        EObject lv_snns_18_0 = null;

        EObject lv_init_21_0 = null;

        EObject lv_rem_22_0 = null;

        EObject lv_snns_24_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3166:28: ( ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3167:1: ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3167:1: ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_WHILE:
                {
                alt37=1;
                }
                break;
            case RULE_DO:
                {
                alt37=2;
                }
                break;
            case RULE_UNROLL:
                {
                alt37=3;
                }
                break;
            case RULE_FOR:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3167:2: (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3167:2: (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3167:3: this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) )
                    {
                    this_WHILE_0=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleiteration_statement6507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_0, grammarAccess.getIteration_statementAccess().getWHILETerminalRuleCall_0_0()); 
                          
                    }
                    this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_1, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_0_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3175:1: ( (lv_c_2_0= rulecondition ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3176:1: (lv_c_2_0= rulecondition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3176:1: (lv_c_2_0= rulecondition )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3177:3: lv_c_2_0= rulecondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getCConditionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecondition_in_ruleiteration_statement6537);
                    lv_c_2_0=rulecondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"c",
                              		lv_c_2_0, 
                              		"condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PAREN_3=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_3, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_0_3()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3197:1: ( (lv_snns_4_0= rulestatement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3198:1: (lv_snns_4_0= rulestatement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3198:1: (lv_snns_4_0= rulestatement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3199:3: lv_snns_4_0= rulestatement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSnnsStatement_no_new_scopeParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6568);
                    lv_snns_4_0=rulestatement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"snns",
                              		lv_snns_4_0, 
                              		"statement_no_new_scope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3216:6: (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3216:6: (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3216:7: this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON
                    {
                    this_DO_5=(Token)match(input,RULE_DO,FOLLOW_RULE_DO_in_ruleiteration_statement6587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DO_5, grammarAccess.getIteration_statementAccess().getDOTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3220:1: ( (lv_s_6_0= rulestatement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:1: (lv_s_6_0= rulestatement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:1: (lv_s_6_0= rulestatement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3222:3: lv_s_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSStatementParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleiteration_statement6607);
                    lv_s_6_0=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"s",
                              		lv_s_6_0, 
                              		"statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_WHILE_7=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleiteration_statement6618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_7, grammarAccess.getIteration_statementAccess().getWHILETerminalRuleCall_1_2()); 
                          
                    }
                    this_LEFT_PAREN_8=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_8, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_1_3()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3246:1: ( (lv_e_9_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3247:1: (lv_e_9_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3247:1: (lv_e_9_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3248:3: lv_e_9_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getEExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleiteration_statement6648);
                    lv_e_9_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_9_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PAREN_10=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_10, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_1_5()); 
                          
                    }
                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleiteration_statement6669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_11, grammarAccess.getIteration_statementAccess().getSEMICOLONTerminalRuleCall_1_6()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3273:6: ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3273:6: ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3273:7: ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3273:7: ( (lv_u_12_0= ruleunroll_modifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3274:1: (lv_u_12_0= ruleunroll_modifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3274:1: (lv_u_12_0= ruleunroll_modifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3275:3: lv_u_12_0= ruleunroll_modifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getUUnroll_modifierParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunroll_modifier_in_ruleiteration_statement6697);
                    lv_u_12_0=ruleunroll_modifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"u",
                              		lv_u_12_0, 
                              		"unroll_modifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_FOR_13=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_ruleiteration_statement6708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_13, grammarAccess.getIteration_statementAccess().getFORTerminalRuleCall_2_1()); 
                          
                    }
                    this_LEFT_PAREN_14=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_14, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_2_2()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3299:1: ( (lv_init_15_0= rulefor_init_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3300:1: (lv_init_15_0= rulefor_init_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3300:1: (lv_init_15_0= rulefor_init_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3301:3: lv_init_15_0= rulefor_init_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getInitFor_init_statementParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_init_statement_in_ruleiteration_statement6738);
                    lv_init_15_0=rulefor_init_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_15_0, 
                              		"for_init_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3317:2: ( (lv_rem_16_0= rulefor_rest_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3318:1: (lv_rem_16_0= rulefor_rest_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3318:1: (lv_rem_16_0= rulefor_rest_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3319:3: lv_rem_16_0= rulefor_rest_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getRemFor_rest_statementParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6759);
                    lv_rem_16_0=rulefor_rest_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"rem",
                              		lv_rem_16_0, 
                              		"for_rest_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PAREN_17=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_17, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_2_5()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3339:1: ( (lv_snns_18_0= rulestatement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3340:1: (lv_snns_18_0= rulestatement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3340:1: (lv_snns_18_0= rulestatement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3341:3: lv_snns_18_0= rulestatement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSnnsStatement_no_new_scopeParserRuleCall_2_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6790);
                    lv_snns_18_0=rulestatement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"snns",
                              		lv_snns_18_0, 
                              		"statement_no_new_scope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3358:6: (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3358:6: (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3358:7: this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) )
                    {
                    this_FOR_19=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_ruleiteration_statement6809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_19, grammarAccess.getIteration_statementAccess().getFORTerminalRuleCall_3_0()); 
                          
                    }
                    this_LEFT_PAREN_20=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_20, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_3_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3366:1: ( (lv_init_21_0= rulefor_init_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3367:1: (lv_init_21_0= rulefor_init_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3367:1: (lv_init_21_0= rulefor_init_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3368:3: lv_init_21_0= rulefor_init_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getInitFor_init_statementParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_init_statement_in_ruleiteration_statement6839);
                    lv_init_21_0=rulefor_init_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_21_0, 
                              		"for_init_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3384:2: ( (lv_rem_22_0= rulefor_rest_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3385:1: (lv_rem_22_0= rulefor_rest_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3385:1: (lv_rem_22_0= rulefor_rest_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3386:3: lv_rem_22_0= rulefor_rest_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getRemFor_rest_statementParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6860);
                    lv_rem_22_0=rulefor_rest_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"rem",
                              		lv_rem_22_0, 
                              		"for_rest_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PAREN_23=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_23, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_3_4()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3406:1: ( (lv_snns_24_0= rulestatement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3407:1: (lv_snns_24_0= rulestatement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3407:1: (lv_snns_24_0= rulestatement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3408:3: lv_snns_24_0= rulestatement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSnnsStatement_no_new_scopeParserRuleCall_3_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6891);
                    lv_snns_24_0=rulestatement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteration_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"snns",
                              		lv_snns_24_0, 
                              		"statement_no_new_scope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleiteration_statement"


    // $ANTLR start "entryRuleunroll_modifier"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3432:1: entryRuleunroll_modifier returns [EObject current=null] : iv_ruleunroll_modifier= ruleunroll_modifier EOF ;
    public final EObject entryRuleunroll_modifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunroll_modifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3433:2: (iv_ruleunroll_modifier= ruleunroll_modifier EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3434:2: iv_ruleunroll_modifier= ruleunroll_modifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnroll_modifierRule()); 
            }
            pushFollow(FOLLOW_ruleunroll_modifier_in_entryRuleunroll_modifier6928);
            iv_ruleunroll_modifier=ruleunroll_modifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunroll_modifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunroll_modifier6938); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunroll_modifier"


    // $ANTLR start "ruleunroll_modifier"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3441:1: ruleunroll_modifier returns [EObject current=null] : (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN ) ;
    public final EObject ruleunroll_modifier() throws RecognitionException {
        EObject current = null;

        Token this_UNROLL_0=null;
        Token this_LEFT_PAREN_1=null;
        Token lv_m_2_0=null;
        Token this_COMMA_3=null;
        Token lv_c_4_0=null;
        Token this_RIGHT_PAREN_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3444:28: ( (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3445:1: (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3445:1: (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3445:2: this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN
            {
            this_UNROLL_0=(Token)match(input,RULE_UNROLL,FOLLOW_RULE_UNROLL_in_ruleunroll_modifier6974); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_UNROLL_0, grammarAccess.getUnroll_modifierAccess().getUNROLLTerminalRuleCall_0()); 
                  
            }
            this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleunroll_modifier6984); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PAREN_1, grammarAccess.getUnroll_modifierAccess().getLEFT_PARENTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3453:1: ( (lv_m_2_0= RULE_INTCONSTANT ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3454:1: (lv_m_2_0= RULE_INTCONSTANT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3454:1: (lv_m_2_0= RULE_INTCONSTANT )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3455:3: lv_m_2_0= RULE_INTCONSTANT
            {
            lv_m_2_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_m_2_0, grammarAccess.getUnroll_modifierAccess().getMINTCONSTANTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnroll_modifierRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"m",
                      		lv_m_2_0, 
                      		"INTCONSTANT");
              	    
            }

            }


            }

            this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleunroll_modifier7016); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_3, grammarAccess.getUnroll_modifierAccess().getCOMMATerminalRuleCall_3()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3475:1: ( (lv_c_4_0= RULE_INTCONSTANT ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3476:1: (lv_c_4_0= RULE_INTCONSTANT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3476:1: (lv_c_4_0= RULE_INTCONSTANT )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3477:3: lv_c_4_0= RULE_INTCONSTANT
            {
            lv_c_4_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_c_4_0, grammarAccess.getUnroll_modifierAccess().getCINTCONSTANTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnroll_modifierRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"c",
                      		lv_c_4_0, 
                      		"INTCONSTANT");
              	    
            }

            }


            }

            this_RIGHT_PAREN_5=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleunroll_modifier7048); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PAREN_5, grammarAccess.getUnroll_modifierAccess().getRIGHT_PARENTerminalRuleCall_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunroll_modifier"


    // $ANTLR start "entryRulefor_init_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3505:1: entryRulefor_init_statement returns [EObject current=null] : iv_rulefor_init_statement= rulefor_init_statement EOF ;
    public final EObject entryRulefor_init_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_init_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3506:2: (iv_rulefor_init_statement= rulefor_init_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3507:2: iv_rulefor_init_statement= rulefor_init_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_init_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_init_statement_in_entryRulefor_init_statement7083);
            iv_rulefor_init_statement=rulefor_init_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_init_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_init_statement7093); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_init_statement"


    // $ANTLR start "rulefor_init_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3514:1: rulefor_init_statement returns [EObject current=null] : ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) ) ;
    public final EObject rulefor_init_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_d_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3517:28: ( ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:1: ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:1: ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:2: ( (lv_e_0_0= ruleexpression_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:2: ( (lv_e_0_0= ruleexpression_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3519:1: (lv_e_0_0= ruleexpression_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3519:1: (lv_e_0_0= ruleexpression_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3520:3: lv_e_0_0= ruleexpression_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_init_statementAccess().getEExpression_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_statement_in_rulefor_init_statement7139);
                    lv_e_0_0=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_init_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_0_0, 
                              		"expression_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3537:6: ( (lv_d_1_0= ruledeclaration_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3537:6: ( (lv_d_1_0= ruledeclaration_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3538:1: (lv_d_1_0= ruledeclaration_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3538:1: (lv_d_1_0= ruledeclaration_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3539:3: lv_d_1_0= ruledeclaration_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_init_statementAccess().getDDeclaration_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaration_statement_in_rulefor_init_statement7166);
                    lv_d_1_0=ruledeclaration_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_init_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"d",
                              		lv_d_1_0, 
                              		"declaration_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_init_statement"


    // $ANTLR start "entryRulefor_rest_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3563:1: entryRulefor_rest_statement returns [EObject current=null] : iv_rulefor_rest_statement= rulefor_rest_statement EOF ;
    public final EObject entryRulefor_rest_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_rest_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3564:2: (iv_rulefor_rest_statement= rulefor_rest_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3565:2: iv_rulefor_rest_statement= rulefor_rest_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_rest_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_rest_statement_in_entryRulefor_rest_statement7202);
            iv_rulefor_rest_statement=rulefor_rest_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_rest_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_rest_statement7212); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_rest_statement"


    // $ANTLR start "rulefor_rest_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:1: rulefor_rest_statement returns [EObject current=null] : ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) ) ;
    public final EObject rulefor_rest_statement() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_5=null;
        EObject lv_c_1_0 = null;

        EObject lv_e_3_0 = null;

        EObject lv_e_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3575:28: ( ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3576:1: ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3576:1: ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_IDENTIFIER && LA41_0<=RULE_LEFT_PAREN)||(LA41_0>=RULE_INC && LA41_0<=RULE_DEC)||(LA41_0>=RULE_PLUS && LA41_0<=RULE_BANG)||(LA41_0>=RULE_TYPE && LA41_0<=RULE_VOID)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_SEMICOLON) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3576:2: ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3576:2: ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3576:3: () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3576:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3577:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFor_rest_statementAccess().getFor_rest_statementAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3585:2: ( (lv_c_1_0= rulecondition ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3586:1: (lv_c_1_0= rulecondition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3586:1: (lv_c_1_0= rulecondition )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3587:3: lv_c_1_0= rulecondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_rest_statementAccess().getCConditionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecondition_in_rulefor_rest_statement7271);
                    lv_c_1_0=rulecondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_rest_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"c",
                              		lv_c_1_0, 
                              		"condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_2, grammarAccess.getFor_rest_statementAccess().getSEMICOLONTerminalRuleCall_0_2()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3607:1: ( (lv_e_3_0= ruleexpression ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_IDENTIFIER && LA39_0<=RULE_LEFT_PAREN)||(LA39_0>=RULE_INC && LA39_0<=RULE_DEC)||(LA39_0>=RULE_PLUS && LA39_0<=RULE_BANG)||(LA39_0>=RULE_TYPE && LA39_0<=RULE_VOID)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3608:1: (lv_e_3_0= ruleexpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3608:1: (lv_e_3_0= ruleexpression )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3609:3: lv_e_3_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFor_rest_statementAccess().getEExpressionParserRuleCall_0_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulefor_rest_statement7302);
                            lv_e_3_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFor_rest_statementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"e",
                                      		lv_e_3_0, 
                                      		"expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3626:6: ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3626:6: ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3626:7: () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3626:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3627:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFor_rest_statementAccess().getFor_rest_statementAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getFor_rest_statementAccess().getSEMICOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3639:1: ( (lv_e_6_0= ruleexpression ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_IDENTIFIER && LA40_0<=RULE_LEFT_PAREN)||(LA40_0>=RULE_INC && LA40_0<=RULE_DEC)||(LA40_0>=RULE_PLUS && LA40_0<=RULE_BANG)||(LA40_0>=RULE_TYPE && LA40_0<=RULE_VOID)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3640:1: (lv_e_6_0= ruleexpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3640:1: (lv_e_6_0= ruleexpression )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3641:3: lv_e_6_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFor_rest_statementAccess().getEExpressionParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulefor_rest_statement7354);
                            lv_e_6_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFor_rest_statementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"e",
                                      		lv_e_6_0, 
                                      		"expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_rest_statement"


    // $ANTLR start "entryRulejump_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3665:1: entryRulejump_statement returns [EObject current=null] : iv_rulejump_statement= rulejump_statement EOF ;
    public final EObject entryRulejump_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejump_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3666:2: (iv_rulejump_statement= rulejump_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3667:2: iv_rulejump_statement= rulejump_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJump_statementRule()); 
            }
            pushFollow(FOLLOW_rulejump_statement_in_entryRulejump_statement7392);
            iv_rulejump_statement=rulejump_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulejump_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulejump_statement7402); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejump_statement"


    // $ANTLR start "rulejump_statement"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3674:1: rulejump_statement returns [EObject current=null] : ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) ) ;
    public final EObject rulejump_statement() throws RecognitionException {
        EObject current = null;

        Token this_CONTINUE_1=null;
        Token this_SEMICOLON_2=null;
        Token this_BREAK_4=null;
        Token this_SEMICOLON_5=null;
        Token this_DISCARD_7=null;
        Token this_SEMICOLON_8=null;
        Token this_RETURN_10=null;
        Token this_SEMICOLON_11=null;
        Token this_RETURN_12=null;
        Token this_SEMICOLON_14=null;
        EObject lv_e_13_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3677:28: ( ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3678:1: ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3678:1: ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case RULE_CONTINUE:
                {
                alt42=1;
                }
                break;
            case RULE_BREAK:
                {
                alt42=2;
                }
                break;
            case RULE_DISCARD:
                {
                alt42=3;
                }
                break;
            case RULE_RETURN:
                {
                int LA42_4 = input.LA(2);

                if ( (LA42_4==RULE_SEMICOLON) ) {
                    alt42=4;
                }
                else if ( ((LA42_4>=RULE_IDENTIFIER && LA42_4<=RULE_LEFT_PAREN)||(LA42_4>=RULE_INC && LA42_4<=RULE_DEC)||(LA42_4>=RULE_PLUS && LA42_4<=RULE_BANG)||(LA42_4>=RULE_TYPE && LA42_4<=RULE_VOID)) ) {
                    alt42=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3678:2: ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3678:2: ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3678:3: () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3678:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3679:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getJump_statementAccess().getJump_statementAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_CONTINUE_1=(Token)match(input,RULE_CONTINUE,FOLLOW_RULE_CONTINUE_in_rulejump_statement7451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CONTINUE_1, grammarAccess.getJump_statementAccess().getCONTINUETerminalRuleCall_0_1()); 
                          
                    }
                    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_2, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3696:6: ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3696:6: ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3696:7: () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3696:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3697:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getJump_statementAccess().getJump_statementAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_BREAK_4=(Token)match(input,RULE_BREAK,FOLLOW_RULE_BREAK_in_rulejump_statement7491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BREAK_4, grammarAccess.getJump_statementAccess().getBREAKTerminalRuleCall_1_1()); 
                          
                    }
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3714:6: ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3714:6: ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3714:7: () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3714:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3715:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getJump_statementAccess().getJump_statementAction_2_0(),
                                  current);
                          
                    }

                    }

                    this_DISCARD_7=(Token)match(input,RULE_DISCARD,FOLLOW_RULE_DISCARD_in_rulejump_statement7531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DISCARD_7, grammarAccess.getJump_statementAccess().getDISCARDTerminalRuleCall_2_1()); 
                          
                    }
                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_8, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_2_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:6: ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:6: ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:7: () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3733:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getJump_statementAccess().getJump_statementAction_3_0(),
                                  current);
                          
                    }

                    }

                    this_RETURN_10=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_rulejump_statement7571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RETURN_10, grammarAccess.getJump_statementAccess().getRETURNTerminalRuleCall_3_1()); 
                          
                    }
                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_11, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_3_2()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:6: (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:6: (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:7: this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON
                    {
                    this_RETURN_12=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_rulejump_statement7599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RETURN_12, grammarAccess.getJump_statementAccess().getRETURNTerminalRuleCall_4_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3754:1: ( (lv_e_13_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3755:1: (lv_e_13_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3755:1: (lv_e_13_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3756:3: lv_e_13_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJump_statementAccess().getEExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulejump_statement7619);
                    lv_e_13_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJump_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"e",
                              		lv_e_13_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_14, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejump_statement"


    // $ANTLR start "entryRuletranslation_unit"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3784:1: entryRuletranslation_unit returns [EObject current=null] : iv_ruletranslation_unit= ruletranslation_unit EOF ;
    public final EObject entryRuletranslation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletranslation_unit = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3785:2: (iv_ruletranslation_unit= ruletranslation_unit EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3786:2: iv_ruletranslation_unit= ruletranslation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTranslation_unitRule()); 
            }
            pushFollow(FOLLOW_ruletranslation_unit_in_entryRuletranslation_unit7666);
            iv_ruletranslation_unit=ruletranslation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletranslation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletranslation_unit7676); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletranslation_unit"


    // $ANTLR start "ruletranslation_unit"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3793:1: ruletranslation_unit returns [EObject current=null] : ( (lv_e_0_0= ruleexternal_declaration ) )+ ;
    public final EObject ruletranslation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3796:28: ( ( (lv_e_0_0= ruleexternal_declaration ) )+ )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3797:1: ( (lv_e_0_0= ruleexternal_declaration ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3797:1: ( (lv_e_0_0= ruleexternal_declaration ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_TYPE && LA43_0<=RULE_VOID)||LA43_0==RULE_T_GLUE_BLOCK||(LA43_0>=65 && LA43_0<=69)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3798:1: (lv_e_0_0= ruleexternal_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3798:1: (lv_e_0_0= ruleexternal_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3799:3: lv_e_0_0= ruleexternal_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTranslation_unitAccess().getEExternal_declarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexternal_declaration_in_ruletranslation_unit7721);
            	    lv_e_0_0=ruleexternal_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTranslation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"e",
            	              		lv_e_0_0, 
            	              		"external_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletranslation_unit"


    // $ANTLR start "entryRuleexternal_declaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3823:1: entryRuleexternal_declaration returns [EObject current=null] : iv_ruleexternal_declaration= ruleexternal_declaration EOF ;
    public final EObject entryRuleexternal_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexternal_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3824:2: (iv_ruleexternal_declaration= ruleexternal_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3825:2: iv_ruleexternal_declaration= ruleexternal_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternal_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleexternal_declaration_in_entryRuleexternal_declaration7757);
            iv_ruleexternal_declaration=ruleexternal_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexternal_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexternal_declaration7767); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexternal_declaration"


    // $ANTLR start "ruleexternal_declaration"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3832:1: ruleexternal_declaration returns [EObject current=null] : ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) ) ;
    public final EObject ruleexternal_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_f_0_0 = null;

        EObject lv_d_1_0 = null;

        EObject lv_g_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3835:28: ( ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:1: ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:1: ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:2: ( (lv_f_0_0= rulefunction_definition ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:2: ( (lv_f_0_0= rulefunction_definition ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3837:1: (lv_f_0_0= rulefunction_definition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3837:1: (lv_f_0_0= rulefunction_definition )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3838:3: lv_f_0_0= rulefunction_definition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getFFunction_definitionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefunction_definition_in_ruleexternal_declaration7813);
                    lv_f_0_0=rulefunction_definition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExternal_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"f",
                              		lv_f_0_0, 
                              		"function_definition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3855:6: ( (lv_d_1_0= ruledeclaration ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3855:6: ( (lv_d_1_0= ruledeclaration ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3856:1: (lv_d_1_0= ruledeclaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3856:1: (lv_d_1_0= ruledeclaration )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3857:3: lv_d_1_0= ruledeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getDDeclarationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaration_in_ruleexternal_declaration7840);
                    lv_d_1_0=ruledeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExternal_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"d",
                              		lv_d_1_0, 
                              		"declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3874:6: ( (lv_g_2_0= ruleglue_block ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3874:6: ( (lv_g_2_0= ruleglue_block ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3875:1: (lv_g_2_0= ruleglue_block )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3875:1: (lv_g_2_0= ruleglue_block )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3876:3: lv_g_2_0= ruleglue_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getGGlue_blockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleglue_block_in_ruleexternal_declaration7867);
                    lv_g_2_0=ruleglue_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExternal_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"g",
                              		lv_g_2_0, 
                              		"glue_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexternal_declaration"


    // $ANTLR start "entryRulefunction_definition"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3900:1: entryRulefunction_definition returns [EObject current=null] : iv_rulefunction_definition= rulefunction_definition EOF ;
    public final EObject entryRulefunction_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_definition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3901:2: (iv_rulefunction_definition= rulefunction_definition EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3902:2: iv_rulefunction_definition= rulefunction_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_definitionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_definition_in_entryRulefunction_definition7903);
            iv_rulefunction_definition=rulefunction_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_definition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_definition7913); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_definition"


    // $ANTLR start "rulefunction_definition"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3909:1: rulefunction_definition returns [EObject current=null] : ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) ) ;
    public final EObject rulefunction_definition() throws RecognitionException {
        EObject current = null;

        EObject lv_p_0_0 = null;

        EObject lv_s_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3912:28: ( ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3913:1: ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3913:1: ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3913:2: ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3913:2: ( (lv_p_0_0= rulefunction_prototype ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3914:1: (lv_p_0_0= rulefunction_prototype )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3914:1: (lv_p_0_0= rulefunction_prototype )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3915:3: lv_p_0_0= rulefunction_prototype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_definitionAccess().getPFunction_prototypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefunction_prototype_in_rulefunction_definition7959);
            lv_p_0_0=rulefunction_prototype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_definitionRule());
              	        }
                     		set(
                     			current, 
                     			"p",
                      		lv_p_0_0, 
                      		"function_prototype");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3931:2: ( (lv_s_1_0= rulecompound_statement_no_new_scope ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3932:1: (lv_s_1_0= rulecompound_statement_no_new_scope )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3932:1: (lv_s_1_0= rulecompound_statement_no_new_scope )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3933:3: lv_s_1_0= rulecompound_statement_no_new_scope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_definitionAccess().getSCompound_statement_no_new_scopeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecompound_statement_no_new_scope_in_rulefunction_definition7980);
            lv_s_1_0=rulecompound_statement_no_new_scope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_definitionRule());
              	        }
                     		set(
                     			current, 
                     			"s",
                      		lv_s_1_0, 
                      		"compound_statement_no_new_scope");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_definition"


    // $ANTLR start "entryRuleglue_block"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3957:1: entryRuleglue_block returns [EObject current=null] : iv_ruleglue_block= ruleglue_block EOF ;
    public final EObject entryRuleglue_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglue_block = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3958:2: (iv_ruleglue_block= ruleglue_block EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3959:2: iv_ruleglue_block= ruleglue_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlue_blockRule()); 
            }
            pushFollow(FOLLOW_ruleglue_block_in_entryRuleglue_block8016);
            iv_ruleglue_block=ruleglue_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglue_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglue_block8026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleglue_block"


    // $ANTLR start "ruleglue_block"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3966:1: ruleglue_block returns [EObject current=null] : ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) ) ;
    public final EObject ruleglue_block() throws RecognitionException {
        EObject current = null;

        Token lv_g_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3969:28: ( ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3970:1: ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3970:1: ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3971:1: (lv_g_0_0= RULE_T_GLUE_BLOCK )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3971:1: (lv_g_0_0= RULE_T_GLUE_BLOCK )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3972:3: lv_g_0_0= RULE_T_GLUE_BLOCK
            {
            lv_g_0_0=(Token)match(input,RULE_T_GLUE_BLOCK,FOLLOW_RULE_T_GLUE_BLOCK_in_ruleglue_block8067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_g_0_0, grammarAccess.getGlue_blockAccess().getGT_GLUE_BLOCKTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlue_blockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"g",
                      		lv_g_0_0, 
                      		"T_GLUE_BLOCK");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleglue_block"

    // $ANTLR start synpred7_InternalDecoraDsl
    public final void synpred7_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        EObject lv_e_0_0 = null;

        EObject lv_ae_2_0 = null;

        EObject lv_fs_4_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:2: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:3: ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:3: ( (lv_e_0_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:309:1: (lv_e_0_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:309:1: (lv_e_0_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:310:3: lv_e_0_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred7_InternalDecoraDsl646);
        lv_e_0_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_synpred7_InternalDecoraDsl657); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:330:1: ( (lv_ae_2_0= ruleexpression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:331:1: (lv_ae_2_0= ruleexpression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:331:1: (lv_ae_2_0= ruleexpression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:332:3: lv_ae_2_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred7_InternalDecoraDsl677);
        lv_ae_2_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_synpred7_InternalDecoraDsl688); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:352:1: ( (lv_fs_4_0= rulefield_selection ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:353:1: (lv_fs_4_0= rulefield_selection )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:353:1: (lv_fs_4_0= rulefield_selection )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:354:3: lv_fs_4_0= rulefield_selection
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_0_4_0()); 
          	    
        }
        pushFollow(FOLLOW_rulefield_selection_in_synpred7_InternalDecoraDsl708);
        lv_fs_4_0=rulefield_selection();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalDecoraDsl

    // $ANTLR start synpred8_InternalDecoraDsl
    public final void synpred8_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_LEFT_BRACKET_6=null;
        Token this_RIGHT_BRACKET_8=null;
        EObject lv_e_5_0 = null;

        EObject lv_ae_7_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:6: ( ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:7: ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:371:7: ( (lv_e_5_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:372:1: (lv_e_5_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:372:1: (lv_e_5_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:373:3: lv_e_5_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred8_InternalDecoraDsl737);
        lv_e_5_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_BRACKET_6=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_synpred8_InternalDecoraDsl748); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:393:1: ( (lv_ae_7_0= ruleexpression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:394:1: (lv_ae_7_0= ruleexpression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:394:1: (lv_ae_7_0= ruleexpression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:395:3: lv_ae_7_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred8_InternalDecoraDsl768);
        lv_ae_7_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_synpred8_InternalDecoraDsl779); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalDecoraDsl

    // $ANTLR start synpred9_InternalDecoraDsl
    public final void synpred9_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_e_9_0 = null;

        EObject lv_fs_10_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:6: ( ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:7: ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:416:7: ( (lv_e_9_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:417:1: (lv_e_9_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:417:1: (lv_e_9_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:418:3: lv_e_9_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred9_InternalDecoraDsl807);
        lv_e_9_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:434:2: ( (lv_fs_10_0= rulefield_selection ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:435:1: (lv_fs_10_0= rulefield_selection )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:435:1: (lv_fs_10_0= rulefield_selection )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:436:3: lv_fs_10_0= rulefield_selection
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulefield_selection_in_synpred9_InternalDecoraDsl828);
        lv_fs_10_0=rulefield_selection();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalDecoraDsl

    // $ANTLR start synpred10_InternalDecoraDsl
    public final void synpred10_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_INC_12=null;
        EObject lv_e_11_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:6: ( ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:7: ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:453:7: ( (lv_e_11_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:454:1: (lv_e_11_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:454:1: (lv_e_11_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:455:3: lv_e_11_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_3_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred10_InternalDecoraDsl857);
        lv_e_11_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_INC_12=(Token)match(input,RULE_INC,FOLLOW_RULE_INC_in_synpred10_InternalDecoraDsl868); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDecoraDsl

    // $ANTLR start synpred11_InternalDecoraDsl
    public final void synpred11_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_DEC_14=null;
        EObject lv_e_13_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:6: ( ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:7: ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:476:7: ( (lv_e_13_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:477:1: (lv_e_13_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:477:1: (lv_e_13_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:478:3: lv_e_13_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred11_InternalDecoraDsl896);
        lv_e_13_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_DEC_14=(Token)match(input,RULE_DEC,FOLLOW_RULE_DEC_in_synpred11_InternalDecoraDsl907); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDecoraDsl

    // $ANTLR start synpred21_InternalDecoraDsl
    public final void synpred21_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_STAR_1=null;
        EObject lv_b_2_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:3: ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:881:4: this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) )
        {
        this_STAR_1=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_synpred21_InternalDecoraDsl1660); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:885:1: ( (lv_b_2_0= rulemultiplicative_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:886:1: (lv_b_2_0= rulemultiplicative_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:886:1: (lv_b_2_0= rulemultiplicative_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:887:3: lv_b_2_0= rulemultiplicative_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemultiplicative_expression_in_synpred21_InternalDecoraDsl1680);
        lv_b_2_0=rulemultiplicative_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalDecoraDsl

    // $ANTLR start synpred22_InternalDecoraDsl
    public final void synpred22_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_SLASH_3=null;
        EObject lv_b_4_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:6: ( (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:904:7: this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) )
        {
        this_SLASH_3=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_synpred22_InternalDecoraDsl1699); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:908:1: ( (lv_b_4_0= rulemultiplicative_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:909:1: (lv_b_4_0= rulemultiplicative_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:909:1: (lv_b_4_0= rulemultiplicative_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:910:3: lv_b_4_0= rulemultiplicative_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemultiplicative_expression_in_synpred22_InternalDecoraDsl1719);
        lv_b_4_0=rulemultiplicative_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalDecoraDsl

    // $ANTLR start synpred35_InternalDecoraDsl
    public final void synpred35_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_a_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_b_2_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:2: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:3: ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1544:3: ( (lv_a_0_0= ruleunary_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1545:1: (lv_a_0_0= ruleunary_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1545:1: (lv_a_0_0= ruleunary_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1546:3: lv_a_0_0= ruleunary_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getAUnary_expressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleunary_expression_in_synpred35_InternalDecoraDsl3022);
        lv_a_0_0=ruleunary_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1562:2: ( (lv_op_1_0= ruleassignment_operator ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1563:1: (lv_op_1_0= ruleassignment_operator )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1563:1: (lv_op_1_0= ruleassignment_operator )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1564:3: lv_op_1_0= ruleassignment_operator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getOpAssignment_operatorParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_operator_in_synpred35_InternalDecoraDsl3043);
        lv_op_1_0=ruleassignment_operator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1580:2: ( (lv_b_2_0= ruleassignment_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1581:1: (lv_b_2_0= ruleassignment_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1581:1: (lv_b_2_0= ruleassignment_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1582:3: lv_b_2_0= ruleassignment_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getBAssignment_expressionParserRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_expression_in_synpred35_InternalDecoraDsl3064);
        lv_b_2_0=ruleassignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred35_InternalDecoraDsl

    // $ANTLR start synpred54_InternalDecoraDsl
    public final void synpred54_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_d_0_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:2: ( ( (lv_d_0_0= ruledeclaration_statement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:2: ( (lv_d_0_0= ruledeclaration_statement ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2656:2: ( (lv_d_0_0= ruledeclaration_statement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2657:1: (lv_d_0_0= ruledeclaration_statement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2657:1: (lv_d_0_0= ruledeclaration_statement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2658:3: lv_d_0_0= ruledeclaration_statement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSimple_statementAccess().getDDeclaration_statementParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruledeclaration_statement_in_synpred54_InternalDecoraDsl5456);
        lv_d_0_0=ruledeclaration_statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred54_InternalDecoraDsl

    // $ANTLR start synpred55_InternalDecoraDsl
    public final void synpred55_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_e_1_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2675:6: ( ( (lv_e_1_0= ruleexpression_statement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2675:6: ( (lv_e_1_0= ruleexpression_statement ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2675:6: ( (lv_e_1_0= ruleexpression_statement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2676:1: (lv_e_1_0= ruleexpression_statement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2676:1: (lv_e_1_0= ruleexpression_statement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2677:3: lv_e_1_0= ruleexpression_statement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSimple_statementAccess().getEExpression_statementParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_statement_in_synpred55_InternalDecoraDsl5483);
        lv_e_1_0=ruleexpression_statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred55_InternalDecoraDsl

    // $ANTLR start synpred62_InternalDecoraDsl
    public final void synpred62_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_ELSE_5=null;
        EObject lv_b_6_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3085:3: (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3085:3: this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) )
        {
        this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_synpred62_InternalDecoraDsl6312); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3089:1: ( (lv_b_6_0= rulestatement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3090:1: (lv_b_6_0= rulestatement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3090:1: (lv_b_6_0= rulestatement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3091:3: lv_b_6_0= rulestatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSelection_statementAccess().getBStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred62_InternalDecoraDsl6332);
        lv_b_6_0=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred62_InternalDecoraDsl

    // $ANTLR start synpred66_InternalDecoraDsl
    public final void synpred66_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_e_0_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:2: ( ( (lv_e_0_0= ruleexpression_statement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:2: ( (lv_e_0_0= ruleexpression_statement ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3518:2: ( (lv_e_0_0= ruleexpression_statement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3519:1: (lv_e_0_0= ruleexpression_statement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3519:1: (lv_e_0_0= ruleexpression_statement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3520:3: lv_e_0_0= ruleexpression_statement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_init_statementAccess().getEExpression_statementParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_statement_in_synpred66_InternalDecoraDsl7139);
        lv_e_0_0=ruleexpression_statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred66_InternalDecoraDsl

    // $ANTLR start synpred75_InternalDecoraDsl
    public final void synpred75_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_f_0_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:2: ( ( (lv_f_0_0= rulefunction_definition ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:2: ( (lv_f_0_0= rulefunction_definition ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3836:2: ( (lv_f_0_0= rulefunction_definition ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3837:1: (lv_f_0_0= rulefunction_definition )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3837:1: (lv_f_0_0= rulefunction_definition )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3838:3: lv_f_0_0= rulefunction_definition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getFFunction_definitionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulefunction_definition_in_synpred75_InternalDecoraDsl7813);
        lv_f_0_0=rulefunction_definition();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred75_InternalDecoraDsl

    // $ANTLR start synpred76_InternalDecoraDsl
    public final void synpred76_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_d_1_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3855:6: ( ( (lv_d_1_0= ruledeclaration ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3855:6: ( (lv_d_1_0= ruledeclaration ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3855:6: ( (lv_d_1_0= ruledeclaration ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3856:1: (lv_d_1_0= ruledeclaration )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3856:1: (lv_d_1_0= ruledeclaration )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3857:3: lv_d_1_0= ruledeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getDDeclarationParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruledeclaration_in_synpred76_InternalDecoraDsl7840);
        lv_d_1_0=ruledeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred76_InternalDecoraDsl

    // Delegated rules

    public final boolean synpred76_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalDecoraDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalDecoraDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\6\7\0\6\uffff";
    static final String DFA4_maxS =
        "\1\50\7\0\6\uffff";
    static final String DFA4_acceptS =
        "\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\34\uffff\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "308:1: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 8;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 10;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 11;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\17\uffff";
    static final String DFA18_eofS =
        "\17\uffff";
    static final String DFA18_minS =
        "\1\6\14\0\2\uffff";
    static final String DFA18_maxS =
        "\1\50\14\0\2\uffff";
    static final String DFA18_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\3\uffff\1\10\1\11\1\uffff\1\12\1\13\1\14"+
            "\23\uffff\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1544:1: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\34\uffff";
    static final String DFA31_eofS =
        "\34\uffff";
    static final String DFA31_minS =
        "\1\6\5\uffff\2\0\24\uffff";
    static final String DFA31_maxS =
        "\1\105\5\uffff\2\0\24\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\12\uffff\1\3\1\4\3\uffff\1\5\3\uffff";
    static final String DFA31_specialS =
        "\6\uffff\1\0\1\1\24\uffff}>";
    static final String[] DFA31_transitionS = {
            "\5\10\3\uffff\2\10\1\uffff\3\10\22\uffff\1\10\1\6\1\7\2\uffff"+
            "\1\23\1\uffff\4\24\4\30\14\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2656:1: ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 8;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 8;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\23\uffff";
    static final String DFA38_eofS =
        "\23\uffff";
    static final String DFA38_minS =
        "\1\6\6\uffff\2\0\12\uffff";
    static final String DFA38_maxS =
        "\1\105\6\uffff\2\0\12\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\14\uffff\1\2\4\uffff";
    static final String DFA38_specialS =
        "\7\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA38_transitionS = {
            "\5\1\3\uffff\2\1\1\uffff\3\1\22\uffff\1\1\1\7\1\10\30\uffff"+
            "\5\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "3518:1: ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\12\uffff";
    static final String DFA44_eofS =
        "\12\uffff";
    static final String DFA44_minS =
        "\1\47\2\0\7\uffff";
    static final String DFA44_maxS =
        "\1\105\2\0\7\uffff";
    static final String DFA44_acceptS =
        "\3\uffff\1\2\4\uffff\1\3\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\1\2\14\uffff\1\10\13\uffff\5\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "3836:1: ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 3;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 9;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 3;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletranslation_unit_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_selection_in_entryRulefield_selection171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_selection181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RGBA_FIELDS_in_rulefield_selection223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XYZW_FIELDS_in_rulefield_selection251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_expression_in_entryRuleprimary_expression292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprimary_expression302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprimary_expression338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleprimary_expression354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATCONSTANT_in_ruleprimary_expression370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLCONSTANT_in_ruleprimary_expression386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleprimary_expression403 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleprimary_expression423 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleprimary_expression434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_entryRuleprimary_or_call470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprimary_or_call480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_expression_in_ruleprimary_or_call526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_call_in_ruleprimary_or_call553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfix_expression_in_entryRulepostfix_expression589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfix_expression599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression657 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulepostfix_expression677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression688 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulefield_selection_in_rulepostfix_expression708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression737 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression748 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulepostfix_expression768 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression807 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulefield_selection_in_rulepostfix_expression828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_INC_in_rulepostfix_expression868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression896 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DEC_in_rulepostfix_expression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_call_in_entryRulefunction_call970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_call980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_call1023 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1039 = new BitSet(new long[]{0x00000180000ECFC0L});
    public static final BitSet FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1059 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefunction_call1099 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1110 = new BitSet(new long[]{0x00000180000ECFC0L});
    public static final BitSet FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_call_parameter_list_in_entryRulefunction_call_parameter_list1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_call_parameter_list1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1234 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulefunction_call_parameter_list1246 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1266 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_entryRuleunary_expression1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_expression1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfix_expression_in_ruleunary_expression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INC_in_ruleunary_expression1378 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_in_ruleunary_expression1417 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleunary_expression1456 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleunary_expression1495 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BANG_in_ruleunary_expression1534 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_entryRulemultiplicative_expression1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplicative_expression1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_rulemultiplicative_expression1647 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_RULE_STAR_in_rulemultiplicative_expression1660 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1680 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_rulemultiplicative_expression1699 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1719 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_entryRuleadditive_expression1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadditive_expression1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1814 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleadditive_expression1827 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1847 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleadditive_expression1866 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1886 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_rulerelational_expression_in_entryRulerelational_expression1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelational_expression1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression1981 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_RULE_LTEQ_in_rulerelational_expression1994 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2014 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_RULE_GTEQ_in_rulerelational_expression2033 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2053 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_RULE_LT_in_rulerelational_expression2072 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2092 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_RULE_GT_in_rulerelational_expression2111 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2131 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_ruleequality_expression_in_entryRuleequality_expression2170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleequality_expression2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelational_expression_in_ruleequality_expression2226 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_RULE_EQEQ_in_ruleequality_expression2239 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulerelational_expression_in_ruleequality_expression2259 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_RULE_NEQ_in_ruleequality_expression2278 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulerelational_expression_in_ruleequality_expression2298 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rulelogical_and_expression_in_entryRulelogical_and_expression2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_and_expression2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleequality_expression_in_rulelogical_and_expression2393 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rulelogical_and_expression2405 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleequality_expression_in_rulelogical_and_expression2425 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulelogical_xor_expression_in_entryRulelogical_xor_expression2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_xor_expression2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2519 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_XOR_in_rulelogical_xor_expression2531 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2551 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulelogical_or_expression_in_entryRulelogical_or_expression2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_or_expression2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2645 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rulelogical_or_expression2657 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2677 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleternary_part_in_entryRuleternary_part2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleternary_part2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleternary_part2761 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleternary_part2785 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleternary_part2795 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleternary_part2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_expression_in_entryRuleconditional_expression2851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_expression2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_or_expression_in_ruleconditional_expression2907 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleternary_part_in_ruleconditional_expression2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_entryRuleassignment_expression2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_expression2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleassignment_expression3022 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_ruleassignment_operator_in_ruleassignment_expression3043 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleassignment_expression3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_expression_in_ruleassignment_expression3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_operator_in_entryRuleassignment_operator3129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_operator3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleassignment_operator3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAREQ_in_ruleassignment_operator3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASHEQ_in_ruleassignment_operator3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUSEQ_in_ruleassignment_operator3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASHEQ_in_ruleassignment_operator3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleexpression3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_prototype_in_entryRulefunction_prototype3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_prototype3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefunction_prototype3475 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_prototype3492 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_rulefunction_prototype3508 = new BitSet(new long[]{0x0000018000000FC0L});
    public static final BitSet FOLLOW_ruleparameter_declaration_list_in_rulefunction_prototype3528 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_prototype3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_declaration_in_entryRuleparameter_declaration3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_declaration3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruleparameter_declaration3631 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter_declaration3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_declaration_list_in_entryRuleparameter_declaration_list3689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_declaration_list3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3745 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleparameter_declaration_list3757 = new BitSet(new long[]{0x00000180000007C0L});
    public static final BitSet FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3777 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruledeclaration_identifier_and_init_in_entryRuledeclaration_identifier_and_init3815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_identifier_and_init3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruledeclaration_identifier_and_init3867 = new BitSet(new long[]{0x0000000200001002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruledeclaration_identifier_and_init3884 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_ruledeclaration_identifier_and_init3904 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruledeclaration_identifier_and_init3915 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruledeclaration_identifier_and_init3928 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleinitializer_in_ruledeclaration_identifier_and_init3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesingle_declaration_in_entryRulesingle_declaration3986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesingle_declaration3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefully_specified_type_in_rulesingle_declaration4042 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruledeclaration_identifier_and_init_in_rulesingle_declaration4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration4099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesingle_declaration_in_ruledeclaration4155 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruledeclaration4167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruledeclaration_identifier_and_init_in_ruledeclaration4187 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruledeclaration4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefully_specified_type_in_entryRulefully_specified_type4235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefully_specified_type4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_qualifier_in_rulefully_specified_type4292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruletype_precision_in_rulefully_specified_type4313 = new BitSet(new long[]{0x00000180000007C0L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_qualifier_in_rulefully_specified_type4363 = new BitSet(new long[]{0x00000180000007C0L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_precision_in_rulefully_specified_type4413 = new BitSet(new long[]{0x00000180000007C0L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_qualifier_in_entryRuletype_qualifier4499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_qualifier4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruletype_qualifier4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruletype_qualifier4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_precision_in_entryRuletype_precision4608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_precision4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruletype_precision4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruletype_precision4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruletype_precision4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier4735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_nonarray_in_ruletype_specifier4801 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulearray_brackets_in_ruletype_specifier4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_brackets_in_entryRulearray_brackets4863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_brackets4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rulearray_brackets4909 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_rulearray_brackets4933 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rulearray_brackets4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_nonarray_in_entryRuletype_specifier_nonarray4979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier_nonarray4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_in_ruletype_specifier_nonarray5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VOID_in_ruletype_specifier_nonarray5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinitializer_in_entryRuleinitializer5101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinitializer5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleinitializer5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_entryRuledeclaration_statement5191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_statement5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_ruledeclaration_statement5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestatement5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement5400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_rulesimple_statement5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_rulesimple_statement5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselection_statement_in_rulesimple_statement5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleiteration_statement_in_rulesimple_statement5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejump_statement_in_rulesimple_statement5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement5600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement5658 = new BitSet(new long[]{0x001FEFC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_in_rulecompound_statement5678 = new BitSet(new long[]{0x001FEFC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_entryRulestatement_no_new_scope5725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_no_new_scope5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_no_new_scope_in_rulestatement_no_new_scope5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement_no_new_scope5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_no_new_scope_in_entryRulecompound_statement_no_new_scope5844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement_no_new_scope5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement_no_new_scope5902 = new BitSet(new long[]{0x001FEFC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_in_rulecompound_statement_no_new_scope5922 = new BitSet(new long[]{0x001FEFC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement_no_new_scope5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_entryRuleexpression_statement5969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_statement5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_statement6056 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression6103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_expression6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_expression_in_ruleconstant_expression6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselection_statement_in_entryRuleselection_statement6193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselection_statement6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleselection_statement6239 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleselection_statement6249 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleselection_statement6269 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleselection_statement6280 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_in_ruleselection_statement6300 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleselection_statement6312 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_in_ruleselection_statement6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecondition_in_entryRulecondition6370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecondition6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecondition6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleiteration_statement_in_entryRuleiteration_statement6460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleiteration_statement6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleiteration_statement6507 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6517 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulecondition_in_ruleiteration_statement6537 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6548 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_in_ruleiteration_statement6587 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_in_ruleiteration_statement6607 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleiteration_statement6618 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6628 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleiteration_statement6648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6659 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleiteration_statement6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunroll_modifier_in_ruleiteration_statement6697 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RULE_FOR_in_ruleiteration_statement6708 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6718 = new BitSet(new long[]{0x000001C0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulefor_init_statement_in_ruleiteration_statement6738 = new BitSet(new long[]{0x000001C0000EC7C0L});
    public static final BitSet FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6759 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6770 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_ruleiteration_statement6809 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6819 = new BitSet(new long[]{0x000001C0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulefor_init_statement_in_ruleiteration_statement6839 = new BitSet(new long[]{0x000001C0000EC7C0L});
    public static final BitSet FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6860 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6871 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunroll_modifier_in_entryRuleunroll_modifier6928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunroll_modifier6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNROLL_in_ruleunroll_modifier6974 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleunroll_modifier6984 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7000 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleunroll_modifier7016 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7032 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleunroll_modifier7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_init_statement_in_entryRulefor_init_statement7083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_init_statement7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_rulefor_init_statement7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_rulefor_init_statement7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_rest_statement_in_entryRulefor_rest_statement7202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_rest_statement7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecondition_in_rulefor_rest_statement7271 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7282 = new BitSet(new long[]{0x00000180000EC7C2L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_rest_statement7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7334 = new BitSet(new long[]{0x00000180000EC7C2L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_rest_statement7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejump_statement_in_entryRulejump_statement7392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejump_statement7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONTINUE_in_rulejump_statement7451 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BREAK_in_rulejump_statement7491 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCARD_in_rulejump_statement7531 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_rulejump_statement7571 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_rulejump_statement7599 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulejump_statement7619 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletranslation_unit_in_entryRuletranslation_unit7666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletranslation_unit7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexternal_declaration_in_ruletranslation_unit7721 = new BitSet(new long[]{0x00200180000007C2L,0x000000000000003EL});
    public static final BitSet FOLLOW_ruleexternal_declaration_in_entryRuleexternal_declaration7757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexternal_declaration7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_definition_in_ruleexternal_declaration7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_ruleexternal_declaration7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglue_block_in_ruleexternal_declaration7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_definition_in_entryRulefunction_definition7903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_definition7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_prototype_in_rulefunction_definition7959 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rulecompound_statement_no_new_scope_in_rulefunction_definition7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglue_block_in_entryRuleglue_block8016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglue_block8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_T_GLUE_BLOCK_in_ruleglue_block8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred7_InternalDecoraDsl646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_synpred7_InternalDecoraDsl657 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred7_InternalDecoraDsl677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_synpred7_InternalDecoraDsl688 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulefield_selection_in_synpred7_InternalDecoraDsl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred8_InternalDecoraDsl737 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_synpred8_InternalDecoraDsl748 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred8_InternalDecoraDsl768 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_synpred8_InternalDecoraDsl779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred9_InternalDecoraDsl807 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulefield_selection_in_synpred9_InternalDecoraDsl828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred10_InternalDecoraDsl857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_INC_in_synpred10_InternalDecoraDsl868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred11_InternalDecoraDsl896 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DEC_in_synpred11_InternalDecoraDsl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_synpred21_InternalDecoraDsl1660 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_synpred21_InternalDecoraDsl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_synpred22_InternalDecoraDsl1699 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_synpred22_InternalDecoraDsl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_synpred35_InternalDecoraDsl3022 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_ruleassignment_operator_in_synpred35_InternalDecoraDsl3043 = new BitSet(new long[]{0x00000180000EC7C0L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_synpred35_InternalDecoraDsl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_synpred54_InternalDecoraDsl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_synpred55_InternalDecoraDsl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_synpred62_InternalDecoraDsl6312 = new BitSet(new long[]{0x001FEBC0000EC7C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_rulestatement_in_synpred62_InternalDecoraDsl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_synpred66_InternalDecoraDsl7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_definition_in_synpred75_InternalDecoraDsl7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_synpred76_InternalDecoraDsl7840 = new BitSet(new long[]{0x0000000000000002L});

}