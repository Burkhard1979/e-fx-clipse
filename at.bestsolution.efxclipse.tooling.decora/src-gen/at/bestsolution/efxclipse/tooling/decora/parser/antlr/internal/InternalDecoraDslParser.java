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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_XYZW_FIELDS", "RULE_INTCONSTANT", "RULE_FLOATCONSTANT", "RULE_LEFT_PAREN", "RULE_RIGHT_PAREN", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INC", "RULE_DEC", "RULE_COMMA", "RULE_PLUS", "RULE_DASH", "RULE_BANG", "RULE_STAR", "RULE_SLASH", "RULE_LTEQ", "RULE_GTEQ", "RULE_LT", "RULE_GT", "RULE_EQEQ", "RULE_NEQ", "RULE_AND", "RULE_XOR", "RULE_OR", "RULE_QUESTION", "RULE_COLON", "RULE_EQUAL", "RULE_STAREQ", "RULE_SLASHEQ", "RULE_PLUSEQ", "RULE_DASHEQ", "RULE_SEMICOLON", "RULE_VOID", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_IF", "RULE_ELSE", "RULE_WHILE", "RULE_DO", "RULE_FOR", "RULE_UNROLL", "RULE_CONTINUE", "RULE_BREAK", "RULE_DISCARD", "RULE_RETURN", "RULE_T_GLUE_BLOCK", "RULE_DOT", "RULE_RFIELD", "RULE_LETTER", "RULE_DIGIT", "RULE_XFIELD", "RULE_WS", "RULE_COMMENT", "RULE_LINE_COMMENT", "RULE_LEFT_FRENCH", "RULE_RIGHT_FRENCH", "RULE_TILDE", "'const'", "'param'", "'lowp'", "'mediump'", "'highp'", "'float2'", "'float3'", "'float4'", "'float'", "'int2'", "'int3'", "'int4'", "'int'", "'bool2'", "'bool3'", "'bool4'", "'bool'", "'sampler'", "'lsampler'", "'fsampler'", "'true'", "'false'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_TILDE=60;
    public static final int T__66=66;
    public static final int RULE_XYZW_FIELDS=4;
    public static final int T__67=67;
    public static final int RULE_LTEQ=19;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DISCARD=47;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DO=42;
    public static final int RULE_SEMICOLON=35;
    public static final int RULE_PLUSEQ=33;
    public static final int RULE_RETURN=48;
    public static final int RULE_FOR=43;
    public static final int RULE_OR=27;
    public static final int RULE_AND=25;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=58;
    public static final int RULE_LT=21;
    public static final int RULE_DASHEQ=34;
    public static final int RULE_WHILE=41;
    public static final int RULE_GTEQ=20;
    public static final int RULE_DOT=50;
    public static final int RULE_LEFT_PAREN=7;
    public static final int RULE_GT=22;
    public static final int RULE_RFIELD=51;
    public static final int RULE_SLASHEQ=32;
    public static final int RULE_INC=11;
    public static final int RULE_T_GLUE_BLOCK=49;
    public static final int RULE_STAREQ=31;
    public static final int RULE_FLOATCONSTANT=6;
    public static final int RULE_LEFT_BRACE=37;
    public static final int RULE_BANG=16;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_DEC=12;
    public static final int RULE_CONTINUE=45;
    public static final int RULE_XOR=26;
    public static final int RULE_PLUS=14;
    public static final int RULE_UNROLL=44;
    public static final int RULE_COMMA=13;
    public static final int RULE_EQUAL=30;
    public static final int RULE_COMMENT=56;
    public static final int RULE_RIGHT_FRENCH=59;
    public static final int RULE_LETTER=52;
    public static final int RULE_COLON=29;
    public static final int RULE_INTCONSTANT=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_STAR=17;
    public static final int RULE_EQEQ=23;
    public static final int RULE_VOID=36;
    public static final int RULE_RIGHT_BRACKET=10;
    public static final int RULE_NEQ=24;
    public static final int RULE_RIGHT_PAREN=8;
    public static final int RULE_LINE_COMMENT=57;
    public static final int RULE_RIGHT_BRACE=38;
    public static final int RULE_LEFT_BRACKET=9;
    public static final int RULE_SLASH=18;
    public static final int RULE_WS=55;
    public static final int RULE_XFIELD=54;
    public static final int T__76=76;
    public static final int RULE_DIGIT=53;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_IF=39;
    public static final int T__73=73;
    public static final int RULE_BREAK=46;
    public static final int RULE_ELSE=40;
    public static final int T__79=79;
    public static final int RULE_DASH=15;
    public static final int T__78=78;
    public static final int RULE_QUESTION=28;
    public static final int T__77=77;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:121:1: rulefield_selection returns [EObject current=null] : ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) ) ;
    public final EObject rulefield_selection() throws RecognitionException {
        EObject current = null;

        Token lv_x_1_0=null;
        AntlrDatatypeRuleToken lv_r_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:124:28: ( ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:1: ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:1: ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOT) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:2: ( (lv_r_0_0= ruleRGBA_FIELDS ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:125:2: ( (lv_r_0_0= ruleRGBA_FIELDS ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:126:1: (lv_r_0_0= ruleRGBA_FIELDS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:126:1: (lv_r_0_0= ruleRGBA_FIELDS )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:127:3: lv_r_0_0= ruleRGBA_FIELDS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_selectionAccess().getRRGBA_FIELDSParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRGBA_FIELDS_in_rulefield_selection227);
                    lv_r_0_0=ruleRGBA_FIELDS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getField_selectionRule());
                      	        }
                             		set(
                             			current, 
                             			"r",
                              		lv_r_0_0, 
                              		"RGBA_FIELDS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
                    lv_x_1_0=(Token)match(input,RULE_XYZW_FIELDS,FOLLOW_RULE_XYZW_FIELDS_in_rulefield_selection250); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleprimary_expression_in_entryRuleprimary_expression291);
            iv_ruleprimary_expression=ruleprimary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimary_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprimary_expression301); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:179:1: ruleprimary_expression returns [EObject current=null] : ( ( () ruleIDENTIFIER ) | ( () this_INTCONSTANT_3= RULE_INTCONSTANT ) | ( () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT ) | ( () ruleBOOLCONSTANT ) | (this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN ) ) ;
    public final EObject ruleprimary_expression() throws RecognitionException {
        EObject current = null;

        Token this_INTCONSTANT_3=null;
        Token this_FLOATCONSTANT_5=null;
        Token this_LEFT_PAREN_8=null;
        Token this_RIGHT_PAREN_10=null;
        EObject lv_e_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:182:28: ( ( ( () ruleIDENTIFIER ) | ( () this_INTCONSTANT_3= RULE_INTCONSTANT ) | ( () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT ) | ( () ruleBOOLCONSTANT ) | (this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:1: ( ( () ruleIDENTIFIER ) | ( () this_INTCONSTANT_3= RULE_INTCONSTANT ) | ( () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT ) | ( () ruleBOOLCONSTANT ) | (this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:1: ( ( () ruleIDENTIFIER ) | ( () this_INTCONSTANT_3= RULE_INTCONSTANT ) | ( () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT ) | ( () ruleBOOLCONSTANT ) | (this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
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
            case 81:
            case 82:
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:2: ( () ruleIDENTIFIER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:2: ( () ruleIDENTIFIER )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:3: () ruleIDENTIFIER
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:183:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:184:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimary_expressionAccess().getPrimary_expressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_expressionAccess().getIDENTIFIERParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleprimary_expression358);
                    ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:204:6: ( () this_INTCONSTANT_3= RULE_INTCONSTANT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:204:6: ( () this_INTCONSTANT_3= RULE_INTCONSTANT )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:204:7: () this_INTCONSTANT_3= RULE_INTCONSTANT
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:204:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:205:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimary_expressionAccess().getPrimary_expressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_INTCONSTANT_3=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleprimary_expression388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INTCONSTANT_3, grammarAccess.getPrimary_expressionAccess().getINTCONSTANTTerminalRuleCall_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:218:6: ( () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:218:6: ( () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:218:7: () this_FLOATCONSTANT_5= RULE_FLOATCONSTANT
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:218:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:219:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimary_expressionAccess().getPrimary_expressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    this_FLOATCONSTANT_5=(Token)match(input,RULE_FLOATCONSTANT,FOLLOW_RULE_FLOATCONSTANT_in_ruleprimary_expression418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOATCONSTANT_5, grammarAccess.getPrimary_expressionAccess().getFLOATCONSTANTTerminalRuleCall_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:232:6: ( () ruleBOOLCONSTANT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:232:6: ( () ruleBOOLCONSTANT )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:232:7: () ruleBOOLCONSTANT
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:232:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:233:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimary_expressionAccess().getPrimary_expressionAction_3_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_expressionAccess().getBOOLCONSTANTParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBOOLCONSTANT_in_ruleprimary_expression456);
                    ruleBOOLCONSTANT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:253:6: (this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:253:6: (this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:253:7: this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN
                    {
                    this_LEFT_PAREN_8=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleprimary_expression474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_8, grammarAccess.getPrimary_expressionAccess().getLEFT_PARENTerminalRuleCall_4_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:257:1: ( (lv_e_9_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:258:1: (lv_e_9_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:258:1: (lv_e_9_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:259:3: lv_e_9_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimary_expressionAccess().getEExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleprimary_expression494);
                    lv_e_9_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimary_expressionRule());
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

                    this_RIGHT_PAREN_10=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleprimary_expression505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_10, grammarAccess.getPrimary_expressionAccess().getRIGHT_PARENTerminalRuleCall_4_2()); 
                          
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:287:1: entryRuleprimary_or_call returns [EObject current=null] : iv_ruleprimary_or_call= ruleprimary_or_call EOF ;
    public final EObject entryRuleprimary_or_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_or_call = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:288:2: (iv_ruleprimary_or_call= ruleprimary_or_call EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:289:2: iv_ruleprimary_or_call= ruleprimary_or_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_or_callRule()); 
            }
            pushFollow(FOLLOW_ruleprimary_or_call_in_entryRuleprimary_or_call541);
            iv_ruleprimary_or_call=ruleprimary_or_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimary_or_call; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleprimary_or_call551); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:296:1: ruleprimary_or_call returns [EObject current=null] : ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) ) ;
    public final EObject ruleprimary_or_call() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_f_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:299:28: ( ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:300:1: ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:300:1: ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:300:2: ( (lv_e_0_0= ruleprimary_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:300:2: ( (lv_e_0_0= ruleprimary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:301:1: (lv_e_0_0= ruleprimary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:301:1: (lv_e_0_0= ruleprimary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:302:3: lv_e_0_0= ruleprimary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimary_or_callAccess().getEPrimary_expressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_expression_in_ruleprimary_or_call597);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:319:6: ( (lv_f_1_0= rulefunction_call ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:319:6: ( (lv_f_1_0= rulefunction_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:320:1: (lv_f_1_0= rulefunction_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:320:1: (lv_f_1_0= rulefunction_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:321:3: lv_f_1_0= rulefunction_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimary_or_callAccess().getFFunction_callParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefunction_call_in_ruleprimary_or_call624);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:345:1: entryRulepostfix_expression returns [EObject current=null] : iv_rulepostfix_expression= rulepostfix_expression EOF ;
    public final EObject entryRulepostfix_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepostfix_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:346:2: (iv_rulepostfix_expression= rulepostfix_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:347:2: iv_rulepostfix_expression= rulepostfix_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfix_expressionRule()); 
            }
            pushFollow(FOLLOW_rulepostfix_expression_in_entryRulepostfix_expression660);
            iv_rulepostfix_expression=rulepostfix_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepostfix_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfix_expression670); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:354:1: rulepostfix_expression returns [EObject current=null] : ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:357:28: ( ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:1: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:1: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:3: ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:3: ( (lv_e_0_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:359:1: (lv_e_0_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:359:1: (lv_e_0_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:360:3: lv_e_0_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression717);
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

                    this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getPostfix_expressionAccess().getLEFT_BRACKETTerminalRuleCall_0_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:380:1: ( (lv_ae_2_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:381:1: (lv_ae_2_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:381:1: (lv_ae_2_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:382:3: lv_ae_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulepostfix_expression748);
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

                    this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getPostfix_expressionAccess().getRIGHT_BRACKETTerminalRuleCall_0_3()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:402:1: ( (lv_fs_4_0= rulefield_selection ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:403:1: (lv_fs_4_0= rulefield_selection )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:403:1: (lv_fs_4_0= rulefield_selection )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:404:3: lv_fs_4_0= rulefield_selection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefield_selection_in_rulepostfix_expression779);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:7: ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:7: ( (lv_e_5_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:422:1: (lv_e_5_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:422:1: (lv_e_5_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:423:3: lv_e_5_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression808);
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

                    this_LEFT_BRACKET_6=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKET_6, grammarAccess.getPostfix_expressionAccess().getLEFT_BRACKETTerminalRuleCall_1_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:443:1: ( (lv_ae_7_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:444:1: (lv_ae_7_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:444:1: (lv_ae_7_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:445:3: lv_ae_7_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulepostfix_expression839);
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

                    this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getPostfix_expressionAccess().getRIGHT_BRACKETTerminalRuleCall_1_3()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:7: ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:7: ( (lv_e_9_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:467:1: (lv_e_9_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:467:1: (lv_e_9_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:468:3: lv_e_9_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression878);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:484:2: ( (lv_fs_10_0= rulefield_selection ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:485:1: (lv_fs_10_0= rulefield_selection )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:485:1: (lv_fs_10_0= rulefield_selection )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:486:3: lv_fs_10_0= rulefield_selection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefield_selection_in_rulepostfix_expression899);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:7: ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:7: ( (lv_e_11_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:504:1: (lv_e_11_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:504:1: (lv_e_11_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:505:3: lv_e_11_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression928);
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

                    this_INC_12=(Token)match(input,RULE_INC,FOLLOW_RULE_INC_in_rulepostfix_expression939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INC_12, grammarAccess.getPostfix_expressionAccess().getINCTerminalRuleCall_3_1()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:7: ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:7: ( (lv_e_13_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:527:1: (lv_e_13_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:527:1: (lv_e_13_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:528:3: lv_e_13_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression967);
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

                    this_DEC_14=(Token)match(input,RULE_DEC,FOLLOW_RULE_DEC_in_rulepostfix_expression978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DEC_14, grammarAccess.getPostfix_expressionAccess().getDECTerminalRuleCall_4_1()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:549:6: ( (lv_e_15_0= ruleprimary_or_call ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:549:6: ( (lv_e_15_0= ruleprimary_or_call ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:550:1: (lv_e_15_0= ruleprimary_or_call )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:550:1: (lv_e_15_0= ruleprimary_or_call )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:551:3: lv_e_15_0= ruleprimary_or_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleprimary_or_call_in_rulepostfix_expression1005);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:575:1: entryRulefunction_call returns [EObject current=null] : iv_rulefunction_call= rulefunction_call EOF ;
    public final EObject entryRulefunction_call() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_call = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:576:2: (iv_rulefunction_call= rulefunction_call EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:577:2: iv_rulefunction_call= rulefunction_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_callRule()); 
            }
            pushFollow(FOLLOW_rulefunction_call_in_entryRulefunction_call1041);
            iv_rulefunction_call=rulefunction_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_call; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_call1051); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:584:1: rulefunction_call returns [EObject current=null] : ( ( ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) ) ;
    public final EObject rulefunction_call() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PAREN_1=null;
        Token this_RIGHT_PAREN_3=null;
        Token this_LEFT_PAREN_5=null;
        Token this_RIGHT_PAREN_7=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_p_2_0 = null;

        EObject lv_ts_4_0 = null;

        EObject lv_p_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:587:28: ( ( ( ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:588:1: ( ( ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:588:1: ( ( ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ) | ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LETTER) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_VOID||(LA7_0>=66 && LA7_0<=80)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:588:2: ( ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:588:2: ( ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:588:3: ( (lv_id_0_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_p_2_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_3= RULE_RIGHT_PAREN
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:588:3: ( (lv_id_0_0= ruleIDENTIFIER ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:589:1: (lv_id_0_0= ruleIDENTIFIER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:589:1: (lv_id_0_0= ruleIDENTIFIER )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:590:3: lv_id_0_0= ruleIDENTIFIER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_callAccess().getIdIDENTIFIERParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDENTIFIER_in_rulefunction_call1098);
                    lv_id_0_0=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunction_callRule());
                      	        }
                             		set(
                             			current, 
                             			"id",
                              		lv_id_0_0, 
                              		"IDENTIFIER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_1, grammarAccess.getFunction_callAccess().getLEFT_PARENTerminalRuleCall_0_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:610:1: ( (lv_p_2_0= rulefunction_call_parameter_list ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_INTCONSTANT && LA5_0<=RULE_LEFT_PAREN)||(LA5_0>=RULE_INC && LA5_0<=RULE_DEC)||(LA5_0>=RULE_PLUS && LA5_0<=RULE_BANG)||LA5_0==RULE_VOID||LA5_0==RULE_LETTER||(LA5_0>=66 && LA5_0<=82)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:611:1: (lv_p_2_0= rulefunction_call_parameter_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:611:1: (lv_p_2_0= rulefunction_call_parameter_list )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:612:3: lv_p_2_0= rulefunction_call_parameter_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunction_callAccess().getPFunction_call_parameter_listParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1129);
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

                    this_RIGHT_PAREN_3=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_3, grammarAccess.getFunction_callAccess().getRIGHT_PARENTerminalRuleCall_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:633:6: ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:633:6: ( ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:633:7: ( (lv_ts_4_0= ruletype_specifier ) ) this_LEFT_PAREN_5= RULE_LEFT_PAREN ( (lv_p_6_0= rulefunction_call_parameter_list ) )? this_RIGHT_PAREN_7= RULE_RIGHT_PAREN
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:633:7: ( (lv_ts_4_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:634:1: (lv_ts_4_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:634:1: (lv_ts_4_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:635:3: lv_ts_4_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_callAccess().getTsType_specifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefunction_call1169);
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

                    this_LEFT_PAREN_5=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_5, grammarAccess.getFunction_callAccess().getLEFT_PARENTerminalRuleCall_1_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:655:1: ( (lv_p_6_0= rulefunction_call_parameter_list ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_INTCONSTANT && LA6_0<=RULE_LEFT_PAREN)||(LA6_0>=RULE_INC && LA6_0<=RULE_DEC)||(LA6_0>=RULE_PLUS && LA6_0<=RULE_BANG)||LA6_0==RULE_VOID||LA6_0==RULE_LETTER||(LA6_0>=66 && LA6_0<=82)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:656:1: (lv_p_6_0= rulefunction_call_parameter_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:656:1: (lv_p_6_0= rulefunction_call_parameter_list )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:657:3: lv_p_6_0= rulefunction_call_parameter_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunction_callAccess().getPFunction_call_parameter_listParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1200);
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

                    this_RIGHT_PAREN_7=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1212); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:685:1: entryRulefunction_call_parameter_list returns [EObject current=null] : iv_rulefunction_call_parameter_list= rulefunction_call_parameter_list EOF ;
    public final EObject entryRulefunction_call_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_call_parameter_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:686:2: (iv_rulefunction_call_parameter_list= rulefunction_call_parameter_list EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:687:2: iv_rulefunction_call_parameter_list= rulefunction_call_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_call_parameter_listRule()); 
            }
            pushFollow(FOLLOW_rulefunction_call_parameter_list_in_entryRulefunction_call_parameter_list1248);
            iv_rulefunction_call_parameter_list=rulefunction_call_parameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_call_parameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_call_parameter_list1258); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:694:1: rulefunction_call_parameter_list returns [EObject current=null] : ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* ) ;
    public final EObject rulefunction_call_parameter_list() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:697:28: ( ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:698:1: ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:698:1: ( ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:698:2: ( (lv_a_0_0= ruleassignment_expression ) ) (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:698:2: ( (lv_a_0_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:699:1: (lv_a_0_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:699:1: (lv_a_0_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:700:3: lv_a_0_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_call_parameter_listAccess().getAAssignment_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1304);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:716:2: (this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:716:3: this_COMMA_1= RULE_COMMA ( (lv_a_2_0= ruleassignment_expression ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulefunction_call_parameter_list1316); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getFunction_call_parameter_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:720:1: ( (lv_a_2_0= ruleassignment_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:721:1: (lv_a_2_0= ruleassignment_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:721:1: (lv_a_2_0= ruleassignment_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:722:3: lv_a_2_0= ruleassignment_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunction_call_parameter_listAccess().getAAssignment_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1336);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:746:1: entryRuleunary_expression returns [EObject current=null] : iv_ruleunary_expression= ruleunary_expression EOF ;
    public final EObject entryRuleunary_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:747:2: (iv_ruleunary_expression= ruleunary_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:748:2: iv_ruleunary_expression= ruleunary_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleunary_expression_in_entryRuleunary_expression1374);
            iv_ruleunary_expression=ruleunary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_expression1384); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:755:1: ruleunary_expression returns [EObject current=null] : ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:758:28: ( ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:759:1: ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:759:1: ( ( (lv_p_0_0= rulepostfix_expression ) ) | (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) ) | (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) ) | (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) ) | (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) ) | (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_INTCONSTANT:
            case RULE_FLOATCONSTANT:
            case RULE_LEFT_PAREN:
            case RULE_VOID:
            case RULE_LETTER:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:759:2: ( (lv_p_0_0= rulepostfix_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:759:2: ( (lv_p_0_0= rulepostfix_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:760:1: (lv_p_0_0= rulepostfix_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:760:1: (lv_p_0_0= rulepostfix_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:761:3: lv_p_0_0= rulepostfix_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getPPostfix_expressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepostfix_expression_in_ruleunary_expression1430);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:778:6: (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:778:6: (this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:778:7: this_INC_1= RULE_INC ( (lv_u_2_0= ruleunary_expression ) )
                    {
                    this_INC_1=(Token)match(input,RULE_INC,FOLLOW_RULE_INC_in_ruleunary_expression1448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INC_1, grammarAccess.getUnary_expressionAccess().getINCTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:782:1: ( (lv_u_2_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:783:1: (lv_u_2_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:783:1: (lv_u_2_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:784:3: lv_u_2_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1468);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:801:6: (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:801:6: (this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:801:7: this_DEC_3= RULE_DEC ( (lv_u_4_0= ruleunary_expression ) )
                    {
                    this_DEC_3=(Token)match(input,RULE_DEC,FOLLOW_RULE_DEC_in_ruleunary_expression1487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DEC_3, grammarAccess.getUnary_expressionAccess().getDECTerminalRuleCall_2_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:805:1: ( (lv_u_4_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:806:1: (lv_u_4_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:806:1: (lv_u_4_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:807:3: lv_u_4_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1507);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:824:6: (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:824:6: (this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:824:7: this_PLUS_5= RULE_PLUS ( (lv_u_6_0= ruleunary_expression ) )
                    {
                    this_PLUS_5=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleunary_expression1526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_5, grammarAccess.getUnary_expressionAccess().getPLUSTerminalRuleCall_3_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:828:1: ( (lv_u_6_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:829:1: (lv_u_6_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:829:1: (lv_u_6_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:830:3: lv_u_6_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1546);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:847:6: (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:847:6: (this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:847:7: this_DASH_7= RULE_DASH ( (lv_u_8_0= ruleunary_expression ) )
                    {
                    this_DASH_7=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleunary_expression1565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_7, grammarAccess.getUnary_expressionAccess().getDASHTerminalRuleCall_4_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:851:1: ( (lv_u_8_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:852:1: (lv_u_8_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:852:1: (lv_u_8_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:853:3: lv_u_8_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1585);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:870:6: (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:870:6: (this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:870:7: this_BANG_9= RULE_BANG ( (lv_u_10_0= ruleunary_expression ) )
                    {
                    this_BANG_9=(Token)match(input,RULE_BANG,FOLLOW_RULE_BANG_in_ruleunary_expression1604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BANG_9, grammarAccess.getUnary_expressionAccess().getBANGTerminalRuleCall_5_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:874:1: ( (lv_u_10_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:875:1: (lv_u_10_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:875:1: (lv_u_10_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:876:3: lv_u_10_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_expressionAccess().getUUnary_expressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleunary_expression1624);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:900:1: entryRulemultiplicative_expression returns [EObject current=null] : iv_rulemultiplicative_expression= rulemultiplicative_expression EOF ;
    public final EObject entryRulemultiplicative_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiplicative_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:901:2: (iv_rulemultiplicative_expression= rulemultiplicative_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:902:2: iv_rulemultiplicative_expression= rulemultiplicative_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicative_expressionRule()); 
            }
            pushFollow(FOLLOW_rulemultiplicative_expression_in_entryRulemultiplicative_expression1661);
            iv_rulemultiplicative_expression=rulemultiplicative_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplicative_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplicative_expression1671); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:909:1: rulemultiplicative_expression returns [EObject current=null] : ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) ;
    public final EObject rulemultiplicative_expression() throws RecognitionException {
        EObject current = null;

        Token this_STAR_1=null;
        Token this_SLASH_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:912:28: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:913:1: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:913:1: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:913:2: ( (lv_a_0_0= ruleunary_expression ) ) ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:913:2: ( (lv_a_0_0= ruleunary_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:914:1: (lv_a_0_0= ruleunary_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:914:1: (lv_a_0_0= ruleunary_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:915:3: lv_a_0_0= ruleunary_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getAUnary_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleunary_expression_in_rulemultiplicative_expression1717);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:2: ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:4: this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    {
            	    this_STAR_1=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_rulemultiplicative_expression1730); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STAR_1, grammarAccess.getMultiplicative_expressionAccess().getSTARTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:935:1: ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:936:1: (lv_b_2_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:936:1: (lv_b_2_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:937:3: lv_b_2_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1750);
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:7: this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    {
            	    this_SLASH_3=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_rulemultiplicative_expression1769); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SLASH_3, grammarAccess.getMultiplicative_expressionAccess().getSLASHTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:958:1: ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:959:1: (lv_b_4_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:959:1: (lv_b_4_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:960:3: lv_b_4_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1789);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:984:1: entryRuleadditive_expression returns [EObject current=null] : iv_ruleadditive_expression= ruleadditive_expression EOF ;
    public final EObject entryRuleadditive_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadditive_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:985:2: (iv_ruleadditive_expression= ruleadditive_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:986:2: iv_ruleadditive_expression= ruleadditive_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditive_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleadditive_expression_in_entryRuleadditive_expression1828);
            iv_ruleadditive_expression=ruleadditive_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadditive_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleadditive_expression1838); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:993:1: ruleadditive_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) ;
    public final EObject ruleadditive_expression() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_DASH_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:996:28: ( ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:997:1: ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:997:1: ( ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:997:2: ( (lv_a_0_0= rulemultiplicative_expression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:997:2: ( (lv_a_0_0= rulemultiplicative_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:998:1: (lv_a_0_0= rulemultiplicative_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:998:1: (lv_a_0_0= rulemultiplicative_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:999:3: lv_a_0_0= rulemultiplicative_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditive_expressionAccess().getAMultiplicative_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1884);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1015:2: ( (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) ) | (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )*
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1015:3: (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1015:3: (this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1015:4: this_PLUS_1= RULE_PLUS ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleadditive_expression1897); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_1, grammarAccess.getAdditive_expressionAccess().getPLUSTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1019:1: ( (lv_b_2_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1020:1: (lv_b_2_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1020:1: (lv_b_2_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1021:3: lv_b_2_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditive_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1917);
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1038:6: (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1038:6: (this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1038:7: this_DASH_3= RULE_DASH ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    {
            	    this_DASH_3=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleadditive_expression1936); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DASH_3, grammarAccess.getAdditive_expressionAccess().getDASHTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1042:1: ( (lv_b_4_0= rulemultiplicative_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1043:1: (lv_b_4_0= rulemultiplicative_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1043:1: (lv_b_4_0= rulemultiplicative_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1044:3: lv_b_4_0= rulemultiplicative_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditive_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1956);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1068:1: entryRulerelational_expression returns [EObject current=null] : iv_rulerelational_expression= rulerelational_expression EOF ;
    public final EObject entryRulerelational_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelational_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1069:2: (iv_rulerelational_expression= rulerelational_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1070:2: iv_rulerelational_expression= rulerelational_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelational_expressionRule()); 
            }
            pushFollow(FOLLOW_rulerelational_expression_in_entryRulerelational_expression1995);
            iv_rulerelational_expression=rulerelational_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelational_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelational_expression2005); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1077:1: rulerelational_expression returns [EObject current=null] : ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1080:28: ( ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1081:1: ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1081:1: ( ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1081:2: ( (lv_a_0_0= ruleadditive_expression ) ) ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1081:2: ( (lv_a_0_0= ruleadditive_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1082:1: (lv_a_0_0= ruleadditive_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1082:1: (lv_a_0_0= ruleadditive_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1083:3: lv_a_0_0= ruleadditive_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getAAdditive_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2051);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1099:2: ( (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) ) | (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) ) | (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) ) | (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) ) )*
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1099:3: (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1099:3: (this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1099:4: this_LTEQ_1= RULE_LTEQ ( (lv_b_2_0= ruleadditive_expression ) )
            	    {
            	    this_LTEQ_1=(Token)match(input,RULE_LTEQ,FOLLOW_RULE_LTEQ_in_rulerelational_expression2064); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LTEQ_1, grammarAccess.getRelational_expressionAccess().getLTEQTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1103:1: ( (lv_b_2_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1104:1: (lv_b_2_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1104:1: (lv_b_2_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1105:3: lv_b_2_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2084);
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1122:6: (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1122:6: (this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1122:7: this_GTEQ_3= RULE_GTEQ ( (lv_b_4_0= ruleadditive_expression ) )
            	    {
            	    this_GTEQ_3=(Token)match(input,RULE_GTEQ,FOLLOW_RULE_GTEQ_in_rulerelational_expression2103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_GTEQ_3, grammarAccess.getRelational_expressionAccess().getGTEQTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1126:1: ( (lv_b_4_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1127:1: (lv_b_4_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1127:1: (lv_b_4_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1128:3: lv_b_4_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2123);
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1145:6: (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1145:6: (this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1145:7: this_LT_5= RULE_LT ( (lv_b_6_0= ruleadditive_expression ) )
            	    {
            	    this_LT_5=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_rulerelational_expression2142); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LT_5, grammarAccess.getRelational_expressionAccess().getLTTerminalRuleCall_1_2_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1149:1: ( (lv_b_6_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1150:1: (lv_b_6_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1150:1: (lv_b_6_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1151:3: lv_b_6_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2162);
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1168:6: (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1168:6: (this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1168:7: this_GT_7= RULE_GT ( (lv_b_8_0= ruleadditive_expression ) )
            	    {
            	    this_GT_7=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_rulerelational_expression2181); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_GT_7, grammarAccess.getRelational_expressionAccess().getGTTerminalRuleCall_1_3_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1172:1: ( (lv_b_8_0= ruleadditive_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1173:1: (lv_b_8_0= ruleadditive_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1173:1: (lv_b_8_0= ruleadditive_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1174:3: lv_b_8_0= ruleadditive_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelational_expressionAccess().getBAdditive_expressionParserRuleCall_1_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleadditive_expression_in_rulerelational_expression2201);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1198:1: entryRuleequality_expression returns [EObject current=null] : iv_ruleequality_expression= ruleequality_expression EOF ;
    public final EObject entryRuleequality_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleequality_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1199:2: (iv_ruleequality_expression= ruleequality_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1200:2: iv_ruleequality_expression= ruleequality_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquality_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleequality_expression_in_entryRuleequality_expression2240);
            iv_ruleequality_expression=ruleequality_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleequality_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleequality_expression2250); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1207:1: ruleequality_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* ) ;
    public final EObject ruleequality_expression() throws RecognitionException {
        EObject current = null;

        Token this_EQEQ_1=null;
        Token this_NEQ_3=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1210:28: ( ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1211:1: ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1211:1: ( ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1211:2: ( (lv_a_0_0= rulerelational_expression ) ) ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1211:2: ( (lv_a_0_0= rulerelational_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1212:1: (lv_a_0_0= rulerelational_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1212:1: (lv_a_0_0= rulerelational_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1213:3: lv_a_0_0= rulerelational_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquality_expressionAccess().getARelational_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulerelational_expression_in_ruleequality_expression2296);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1229:2: ( (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) ) | (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) ) )*
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1229:3: (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1229:3: (this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1229:4: this_EQEQ_1= RULE_EQEQ ( (lv_b_2_0= rulerelational_expression ) )
            	    {
            	    this_EQEQ_1=(Token)match(input,RULE_EQEQ,FOLLOW_RULE_EQEQ_in_ruleequality_expression2309); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQEQ_1, grammarAccess.getEquality_expressionAccess().getEQEQTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1233:1: ( (lv_b_2_0= rulerelational_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1234:1: (lv_b_2_0= rulerelational_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1234:1: (lv_b_2_0= rulerelational_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1235:3: lv_b_2_0= rulerelational_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEquality_expressionAccess().getBRelational_expressionParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelational_expression_in_ruleequality_expression2329);
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1252:6: (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1252:6: (this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1252:7: this_NEQ_3= RULE_NEQ ( (lv_b_4_0= rulerelational_expression ) )
            	    {
            	    this_NEQ_3=(Token)match(input,RULE_NEQ,FOLLOW_RULE_NEQ_in_ruleequality_expression2348); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NEQ_3, grammarAccess.getEquality_expressionAccess().getNEQTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1256:1: ( (lv_b_4_0= rulerelational_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1257:1: (lv_b_4_0= rulerelational_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1257:1: (lv_b_4_0= rulerelational_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1258:3: lv_b_4_0= rulerelational_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEquality_expressionAccess().getBRelational_expressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelational_expression_in_ruleequality_expression2368);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1282:1: entryRulelogical_and_expression returns [EObject current=null] : iv_rulelogical_and_expression= rulelogical_and_expression EOF ;
    public final EObject entryRulelogical_and_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_and_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1283:2: (iv_rulelogical_and_expression= rulelogical_and_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1284:2: iv_rulelogical_and_expression= rulelogical_and_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_and_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_and_expression_in_entryRulelogical_and_expression2407);
            iv_rulelogical_and_expression=rulelogical_and_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_and_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_and_expression2417); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1291:1: rulelogical_and_expression returns [EObject current=null] : ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* ) ;
    public final EObject rulelogical_and_expression() throws RecognitionException {
        EObject current = null;

        Token this_AND_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1294:28: ( ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1295:1: ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1295:1: ( ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1295:2: ( (lv_a_0_0= ruleequality_expression ) ) (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1295:2: ( (lv_a_0_0= ruleequality_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1296:1: (lv_a_0_0= ruleequality_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1296:1: (lv_a_0_0= ruleequality_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1297:3: lv_a_0_0= ruleequality_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogical_and_expressionAccess().getAEquality_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleequality_expression_in_rulelogical_and_expression2463);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1313:2: (this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1313:3: this_AND_1= RULE_AND ( (lv_b_2_0= ruleequality_expression ) )
            	    {
            	    this_AND_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulelogical_and_expression2475); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AND_1, grammarAccess.getLogical_and_expressionAccess().getANDTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1317:1: ( (lv_b_2_0= ruleequality_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1318:1: (lv_b_2_0= ruleequality_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1318:1: (lv_b_2_0= ruleequality_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1319:3: lv_b_2_0= ruleequality_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogical_and_expressionAccess().getBEquality_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleequality_expression_in_rulelogical_and_expression2495);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1343:1: entryRulelogical_xor_expression returns [EObject current=null] : iv_rulelogical_xor_expression= rulelogical_xor_expression EOF ;
    public final EObject entryRulelogical_xor_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_xor_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1344:2: (iv_rulelogical_xor_expression= rulelogical_xor_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1345:2: iv_rulelogical_xor_expression= rulelogical_xor_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_xor_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_xor_expression_in_entryRulelogical_xor_expression2533);
            iv_rulelogical_xor_expression=rulelogical_xor_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_xor_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_xor_expression2543); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1352:1: rulelogical_xor_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* ) ;
    public final EObject rulelogical_xor_expression() throws RecognitionException {
        EObject current = null;

        Token this_XOR_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1355:28: ( ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1356:1: ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1356:1: ( ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1356:2: ( (lv_a_0_0= rulelogical_and_expression ) ) (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1356:2: ( (lv_a_0_0= rulelogical_and_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1357:1: (lv_a_0_0= rulelogical_and_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1357:1: (lv_a_0_0= rulelogical_and_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1358:3: lv_a_0_0= rulelogical_and_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogical_xor_expressionAccess().getALogical_and_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2589);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1374:2: (this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_XOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1374:3: this_XOR_1= RULE_XOR ( (lv_b_2_0= rulelogical_and_expression ) )
            	    {
            	    this_XOR_1=(Token)match(input,RULE_XOR,FOLLOW_RULE_XOR_in_rulelogical_xor_expression2601); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_XOR_1, grammarAccess.getLogical_xor_expressionAccess().getXORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1378:1: ( (lv_b_2_0= rulelogical_and_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1379:1: (lv_b_2_0= rulelogical_and_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1379:1: (lv_b_2_0= rulelogical_and_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1380:3: lv_b_2_0= rulelogical_and_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogical_xor_expressionAccess().getBLogical_and_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2621);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1404:1: entryRulelogical_or_expression returns [EObject current=null] : iv_rulelogical_or_expression= rulelogical_or_expression EOF ;
    public final EObject entryRulelogical_or_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_or_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1405:2: (iv_rulelogical_or_expression= rulelogical_or_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1406:2: iv_rulelogical_or_expression= rulelogical_or_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_or_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_or_expression_in_entryRulelogical_or_expression2659);
            iv_rulelogical_or_expression=rulelogical_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_or_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_or_expression2669); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1413:1: rulelogical_or_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* ) ;
    public final EObject rulelogical_or_expression() throws RecognitionException {
        EObject current = null;

        Token this_OR_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1416:28: ( ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1417:1: ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1417:1: ( ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1417:2: ( (lv_a_0_0= rulelogical_xor_expression ) ) (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1417:2: ( (lv_a_0_0= rulelogical_xor_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1418:1: (lv_a_0_0= rulelogical_xor_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1418:1: (lv_a_0_0= rulelogical_xor_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1419:3: lv_a_0_0= rulelogical_xor_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogical_or_expressionAccess().getALogical_xor_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2715);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1435:2: (this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1435:3: this_OR_1= RULE_OR ( (lv_b_2_0= rulelogical_xor_expression ) )
            	    {
            	    this_OR_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulelogical_or_expression2727); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_1, grammarAccess.getLogical_or_expressionAccess().getORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1439:1: ( (lv_b_2_0= rulelogical_xor_expression ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1440:1: (lv_b_2_0= rulelogical_xor_expression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1440:1: (lv_b_2_0= rulelogical_xor_expression )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1441:3: lv_b_2_0= rulelogical_xor_expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogical_or_expressionAccess().getBLogical_xor_expressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2747);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1465:1: entryRuleternary_part returns [EObject current=null] : iv_ruleternary_part= ruleternary_part EOF ;
    public final EObject entryRuleternary_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleternary_part = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1466:2: (iv_ruleternary_part= ruleternary_part EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1467:2: iv_ruleternary_part= ruleternary_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernary_partRule()); 
            }
            pushFollow(FOLLOW_ruleternary_part_in_entryRuleternary_part2785);
            iv_ruleternary_part=ruleternary_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleternary_part; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleternary_part2795); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1474:1: ruleternary_part returns [EObject current=null] : (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) ) ;
    public final EObject ruleternary_part() throws RecognitionException {
        EObject current = null;

        Token this_QUESTION_0=null;
        Token this_COLON_2=null;
        EObject this_expression_1 = null;

        EObject lv_a_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1477:28: ( (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1478:1: (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1478:1: (this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1478:2: this_QUESTION_0= RULE_QUESTION this_expression_1= ruleexpression this_COLON_2= RULE_COLON ( (lv_a_3_0= ruleassignment_expression ) )
            {
            this_QUESTION_0=(Token)match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleternary_part2831); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_QUESTION_0, grammarAccess.getTernary_partAccess().getQUESTIONTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTernary_partAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleternary_part2855);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleternary_part2865); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_2, grammarAccess.getTernary_partAccess().getCOLONTerminalRuleCall_2()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1498:1: ( (lv_a_3_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1499:1: (lv_a_3_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1499:1: (lv_a_3_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1500:3: lv_a_3_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTernary_partAccess().getAAssignment_expressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_ruleternary_part2885);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1524:1: entryRuleconditional_expression returns [EObject current=null] : iv_ruleconditional_expression= ruleconditional_expression EOF ;
    public final EObject entryRuleconditional_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1525:2: (iv_ruleconditional_expression= ruleconditional_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1526:2: iv_ruleconditional_expression= ruleconditional_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditional_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleconditional_expression_in_entryRuleconditional_expression2921);
            iv_ruleconditional_expression=ruleconditional_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconditional_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_expression2931); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1533:1: ruleconditional_expression returns [EObject current=null] : ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? ) ;
    public final EObject ruleconditional_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        EObject lv_t_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1536:28: ( ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1537:1: ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1537:1: ( ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1537:2: ( (lv_a_0_0= rulelogical_or_expression ) ) ( (lv_t_1_0= ruleternary_part ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1537:2: ( (lv_a_0_0= rulelogical_or_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1538:1: (lv_a_0_0= rulelogical_or_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1538:1: (lv_a_0_0= rulelogical_or_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1539:3: lv_a_0_0= rulelogical_or_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditional_expressionAccess().getALogical_or_expressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulelogical_or_expression_in_ruleconditional_expression2977);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1555:2: ( (lv_t_1_0= ruleternary_part ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_QUESTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1556:1: (lv_t_1_0= ruleternary_part )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1556:1: (lv_t_1_0= ruleternary_part )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1557:3: lv_t_1_0= ruleternary_part
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditional_expressionAccess().getTTernary_partParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleternary_part_in_ruleconditional_expression2998);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1581:1: entryRuleassignment_expression returns [EObject current=null] : iv_ruleassignment_expression= ruleassignment_expression EOF ;
    public final EObject entryRuleassignment_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1582:2: (iv_ruleassignment_expression= ruleassignment_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1583:2: iv_ruleassignment_expression= ruleassignment_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_entryRuleassignment_expression3035);
            iv_ruleassignment_expression=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_expression3045); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1590:1: ruleassignment_expression returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) ) ;
    public final EObject ruleassignment_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_c_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1593:28: ( ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:1: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:1: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:3: ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:3: ( (lv_a_0_0= ruleunary_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1595:1: (lv_a_0_0= ruleunary_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1595:1: (lv_a_0_0= ruleunary_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1596:3: lv_a_0_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getAUnary_expressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunary_expression_in_ruleassignment_expression3092);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1612:2: ( (lv_op_1_0= ruleassignment_operator ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1613:1: (lv_op_1_0= ruleassignment_operator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1613:1: (lv_op_1_0= ruleassignment_operator )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1614:3: lv_op_1_0= ruleassignment_operator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getOpAssignment_operatorParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_operator_in_ruleassignment_expression3113);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1630:2: ( (lv_b_2_0= ruleassignment_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1631:1: (lv_b_2_0= ruleassignment_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1631:1: (lv_b_2_0= ruleassignment_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1632:3: lv_b_2_0= ruleassignment_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getBAssignment_expressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_expression_in_ruleassignment_expression3134);
                    lv_b_2_0=ruleassignment_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignment_expressionRule());
                      	        }
                             		set(
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1649:6: ( (lv_c_3_0= ruleconditional_expression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1649:6: ( (lv_c_3_0= ruleconditional_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1650:1: (lv_c_3_0= ruleconditional_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1650:1: (lv_c_3_0= ruleconditional_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1651:3: lv_c_3_0= ruleconditional_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getCConditional_expressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconditional_expression_in_ruleassignment_expression3162);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1675:1: entryRuleassignment_operator returns [String current=null] : iv_ruleassignment_operator= ruleassignment_operator EOF ;
    public final String entryRuleassignment_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1676:2: (iv_ruleassignment_operator= ruleassignment_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1677:2: iv_ruleassignment_operator= ruleassignment_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_operatorRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_operator_in_entryRuleassignment_operator3199);
            iv_ruleassignment_operator=ruleassignment_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_operator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_operator3210); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1684:1: ruleassignment_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ ) ;
    public final AntlrDatatypeRuleToken ruleassignment_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_STAREQ_1=null;
        Token this_SLASHEQ_2=null;
        Token this_PLUSEQ_3=null;
        Token this_DASHEQ_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1687:28: ( (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1688:1: (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1688:1: (this_EQUAL_0= RULE_EQUAL | this_STAREQ_1= RULE_STAREQ | this_SLASHEQ_2= RULE_SLASHEQ | this_PLUSEQ_3= RULE_PLUSEQ | this_DASHEQ_4= RULE_DASHEQ )
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1688:6: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleassignment_operator3250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_0, grammarAccess.getAssignment_operatorAccess().getEQUALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1696:10: this_STAREQ_1= RULE_STAREQ
                    {
                    this_STAREQ_1=(Token)match(input,RULE_STAREQ,FOLLOW_RULE_STAREQ_in_ruleassignment_operator3276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STAREQ_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STAREQ_1, grammarAccess.getAssignment_operatorAccess().getSTAREQTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1704:10: this_SLASHEQ_2= RULE_SLASHEQ
                    {
                    this_SLASHEQ_2=(Token)match(input,RULE_SLASHEQ,FOLLOW_RULE_SLASHEQ_in_ruleassignment_operator3302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SLASHEQ_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SLASHEQ_2, grammarAccess.getAssignment_operatorAccess().getSLASHEQTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1712:10: this_PLUSEQ_3= RULE_PLUSEQ
                    {
                    this_PLUSEQ_3=(Token)match(input,RULE_PLUSEQ,FOLLOW_RULE_PLUSEQ_in_ruleassignment_operator3328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUSEQ_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUSEQ_3, grammarAccess.getAssignment_operatorAccess().getPLUSEQTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1720:10: this_DASHEQ_4= RULE_DASHEQ
                    {
                    this_DASHEQ_4=(Token)match(input,RULE_DASHEQ,FOLLOW_RULE_DASHEQ_in_ruleassignment_operator3354); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1735:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1736:2: (iv_ruleexpression= ruleexpression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1737:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression3399);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression3409); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1744:1: ruleexpression returns [EObject current=null] : ( (lv_e_0_0= ruleassignment_expression ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1747:28: ( ( (lv_e_0_0= ruleassignment_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1748:1: ( (lv_e_0_0= ruleassignment_expression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1748:1: ( (lv_e_0_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1749:1: (lv_e_0_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1749:1: (lv_e_0_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1750:3: lv_e_0_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getEAssignment_expressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_ruleexpression3454);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1774:1: entryRulefunction_prototype returns [EObject current=null] : iv_rulefunction_prototype= rulefunction_prototype EOF ;
    public final EObject entryRulefunction_prototype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_prototype = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1775:2: (iv_rulefunction_prototype= rulefunction_prototype EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1776:2: iv_rulefunction_prototype= rulefunction_prototype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_prototypeRule()); 
            }
            pushFollow(FOLLOW_rulefunction_prototype_in_entryRulefunction_prototype3489);
            iv_rulefunction_prototype=rulefunction_prototype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_prototype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_prototype3499); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1783:1: rulefunction_prototype returns [EObject current=null] : ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) ;
    public final EObject rulefunction_prototype() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PAREN_2=null;
        Token this_RIGHT_PAREN_4=null;
        EObject lv_t_0_0 = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_p_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1786:28: ( ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1787:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1787:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1787:2: ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) this_LEFT_PAREN_2= RULE_LEFT_PAREN ( (lv_p_3_0= ruleparameter_declaration_list ) )? this_RIGHT_PAREN_4= RULE_RIGHT_PAREN
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1787:2: ( (lv_t_0_0= ruletype_specifier ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1788:1: (lv_t_0_0= ruletype_specifier )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1788:1: (lv_t_0_0= ruletype_specifier )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1789:3: lv_t_0_0= ruletype_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_prototypeAccess().getTType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_specifier_in_rulefunction_prototype3545);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1805:2: ( (lv_id_1_0= ruleIDENTIFIER ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1806:1: (lv_id_1_0= ruleIDENTIFIER )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1806:1: (lv_id_1_0= ruleIDENTIFIER )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1807:3: lv_id_1_0= ruleIDENTIFIER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_prototypeAccess().getIdIDENTIFIERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulefunction_prototype3566);
            lv_id_1_0=ruleIDENTIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunction_prototypeRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"IDENTIFIER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LEFT_PAREN_2=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_rulefunction_prototype3577); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PAREN_2, grammarAccess.getFunction_prototypeAccess().getLEFT_PARENTerminalRuleCall_2()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1827:1: ( (lv_p_3_0= ruleparameter_declaration_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_VOID||(LA20_0>=66 && LA20_0<=80)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1828:1: (lv_p_3_0= ruleparameter_declaration_list )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1828:1: (lv_p_3_0= ruleparameter_declaration_list )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1829:3: lv_p_3_0= ruleparameter_declaration_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunction_prototypeAccess().getPParameter_declaration_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_declaration_list_in_rulefunction_prototype3597);
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

            this_RIGHT_PAREN_4=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_prototype3609); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1857:1: entryRuleparameter_declaration returns [EObject current=null] : iv_ruleparameter_declaration= ruleparameter_declaration EOF ;
    public final EObject entryRuleparameter_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1858:2: (iv_ruleparameter_declaration= ruleparameter_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1859:2: iv_ruleparameter_declaration= ruleparameter_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_declaration_in_entryRuleparameter_declaration3644);
            iv_ruleparameter_declaration=ruleparameter_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_declaration3654); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1866:1: ruleparameter_declaration returns [EObject current=null] : ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) ) ;
    public final EObject ruleparameter_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_t_0_0 = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1869:28: ( ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1870:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1870:1: ( ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1870:2: ( (lv_t_0_0= ruletype_specifier ) ) ( (lv_id_1_0= ruleIDENTIFIER ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1870:2: ( (lv_t_0_0= ruletype_specifier ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1871:1: (lv_t_0_0= ruletype_specifier )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1871:1: (lv_t_0_0= ruletype_specifier )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1872:3: lv_t_0_0= ruletype_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_declarationAccess().getTType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_specifier_in_ruleparameter_declaration3700);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1888:2: ( (lv_id_1_0= ruleIDENTIFIER ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1889:1: (lv_id_1_0= ruleIDENTIFIER )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1889:1: (lv_id_1_0= ruleIDENTIFIER )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1890:3: lv_id_1_0= ruleIDENTIFIER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_declarationAccess().getIdIDENTIFIERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleparameter_declaration3721);
            lv_id_1_0=ruleIDENTIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameter_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"IDENTIFIER");
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
    // $ANTLR end "ruleparameter_declaration"


    // $ANTLR start "entryRuleparameter_declaration_list"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1914:1: entryRuleparameter_declaration_list returns [EObject current=null] : iv_ruleparameter_declaration_list= ruleparameter_declaration_list EOF ;
    public final EObject entryRuleparameter_declaration_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_declaration_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1915:2: (iv_ruleparameter_declaration_list= ruleparameter_declaration_list EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1916:2: iv_ruleparameter_declaration_list= ruleparameter_declaration_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_declaration_listRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_declaration_list_in_entryRuleparameter_declaration_list3757);
            iv_ruleparameter_declaration_list=ruleparameter_declaration_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_declaration_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_declaration_list3767); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1923:1: ruleparameter_declaration_list returns [EObject current=null] : ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* ) ;
    public final EObject ruleparameter_declaration_list() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_p_0_0 = null;

        EObject lv_p_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1926:28: ( ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1927:1: ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1927:1: ( ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1927:2: ( (lv_p_0_0= ruleparameter_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1927:2: ( (lv_p_0_0= ruleparameter_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1928:1: (lv_p_0_0= ruleparameter_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1928:1: (lv_p_0_0= ruleparameter_declaration )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1929:3: lv_p_0_0= ruleparameter_declaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_declaration_listAccess().getPParameter_declarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3813);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1945:2: (this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1945:3: this_COMMA_1= RULE_COMMA ( (lv_p_2_0= ruleparameter_declaration ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleparameter_declaration_list3825); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getParameter_declaration_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1949:1: ( (lv_p_2_0= ruleparameter_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1950:1: (lv_p_2_0= ruleparameter_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1950:1: (lv_p_2_0= ruleparameter_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1951:3: lv_p_2_0= ruleparameter_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_declaration_listAccess().getPParameter_declarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3845);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1975:1: entryRuledeclaration_identifier_and_init returns [EObject current=null] : iv_ruledeclaration_identifier_and_init= ruledeclaration_identifier_and_init EOF ;
    public final EObject entryRuledeclaration_identifier_and_init() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_identifier_and_init = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1976:2: (iv_ruledeclaration_identifier_and_init= ruledeclaration_identifier_and_init EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1977:2: iv_ruledeclaration_identifier_and_init= ruledeclaration_identifier_and_init EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_identifier_and_initRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_identifier_and_init_in_entryRuledeclaration_identifier_and_init3883);
            iv_ruledeclaration_identifier_and_init=ruledeclaration_identifier_and_init();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_identifier_and_init; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_identifier_and_init3893); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1984:1: ruledeclaration_identifier_and_init returns [EObject current=null] : ( ( (lv_id_0_0= ruleIDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? ) ;
    public final EObject ruledeclaration_identifier_and_init() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        Token this_EQUAL_4=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_ae_2_0 = null;

        EObject lv_e_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1987:28: ( ( ( (lv_id_0_0= ruleIDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1988:1: ( ( (lv_id_0_0= ruleIDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1988:1: ( ( (lv_id_0_0= ruleIDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1988:2: ( (lv_id_0_0= ruleIDENTIFIER ) ) (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )? (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1988:2: ( (lv_id_0_0= ruleIDENTIFIER ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1989:1: (lv_id_0_0= ruleIDENTIFIER )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1989:1: (lv_id_0_0= ruleIDENTIFIER )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1990:3: lv_id_0_0= ruleIDENTIFIER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaration_identifier_and_initAccess().getIdIDENTIFIERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDENTIFIER_in_ruledeclaration_identifier_and_init3939);
            lv_id_0_0=ruleIDENTIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaration_identifier_and_initRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"IDENTIFIER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2006:2: (this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LEFT_BRACKET) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2006:3: this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleconstant_expression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruledeclaration_identifier_and_init3951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getDeclaration_identifier_and_initAccess().getLEFT_BRACKETTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2010:1: ( (lv_ae_2_0= ruleconstant_expression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2011:1: (lv_ae_2_0= ruleconstant_expression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2011:1: (lv_ae_2_0= ruleconstant_expression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2012:3: lv_ae_2_0= ruleconstant_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaration_identifier_and_initAccess().getAeConstant_expressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconstant_expression_in_ruledeclaration_identifier_and_init3971);
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

                    this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruledeclaration_identifier_and_init3982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getDeclaration_identifier_and_initAccess().getRIGHT_BRACKETTerminalRuleCall_1_2()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2032:3: (this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_EQUAL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2032:4: this_EQUAL_4= RULE_EQUAL ( (lv_e_5_0= ruleinitializer ) )
                    {
                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruledeclaration_identifier_and_init3995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_4, grammarAccess.getDeclaration_identifier_and_initAccess().getEQUALTerminalRuleCall_2_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2036:1: ( (lv_e_5_0= ruleinitializer ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2037:1: (lv_e_5_0= ruleinitializer )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2037:1: (lv_e_5_0= ruleinitializer )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2038:3: lv_e_5_0= ruleinitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaration_identifier_and_initAccess().getEInitializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleinitializer_in_ruledeclaration_identifier_and_init4015);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2062:1: entryRulesingle_declaration returns [EObject current=null] : iv_rulesingle_declaration= rulesingle_declaration EOF ;
    public final EObject entryRulesingle_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesingle_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2063:2: (iv_rulesingle_declaration= rulesingle_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2064:2: iv_rulesingle_declaration= rulesingle_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingle_declarationRule()); 
            }
            pushFollow(FOLLOW_rulesingle_declaration_in_entryRulesingle_declaration4053);
            iv_rulesingle_declaration=rulesingle_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesingle_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesingle_declaration4063); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2071:1: rulesingle_declaration returns [EObject current=null] : ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) ) ;
    public final EObject rulesingle_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_t_0_0 = null;

        EObject lv_d_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2074:28: ( ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2075:1: ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2075:1: ( ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2075:2: ( (lv_t_0_0= rulefully_specified_type ) ) ( (lv_d_1_0= ruledeclaration_identifier_and_init ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2075:2: ( (lv_t_0_0= rulefully_specified_type ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2076:1: (lv_t_0_0= rulefully_specified_type )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2076:1: (lv_t_0_0= rulefully_specified_type )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2077:3: lv_t_0_0= rulefully_specified_type
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingle_declarationAccess().getTFully_specified_typeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefully_specified_type_in_rulesingle_declaration4109);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2093:2: ( (lv_d_1_0= ruledeclaration_identifier_and_init ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2094:1: (lv_d_1_0= ruledeclaration_identifier_and_init )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2094:1: (lv_d_1_0= ruledeclaration_identifier_and_init )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2095:3: lv_d_1_0= ruledeclaration_identifier_and_init
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingle_declarationAccess().getDDeclaration_identifier_and_initParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruledeclaration_identifier_and_init_in_rulesingle_declaration4130);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2119:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2120:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2121:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration4166);
            iv_ruledeclaration=ruledeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration4176); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2128:1: ruledeclaration returns [EObject current=null] : ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_s_0_0 = null;

        EObject lv_d_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2131:28: ( ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2132:1: ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2132:1: ( ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2132:2: ( (lv_s_0_0= rulesingle_declaration ) ) (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )* this_SEMICOLON_3= RULE_SEMICOLON
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2132:2: ( (lv_s_0_0= rulesingle_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2133:1: (lv_s_0_0= rulesingle_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2133:1: (lv_s_0_0= rulesingle_declaration )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2134:3: lv_s_0_0= rulesingle_declaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getSSingle_declarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesingle_declaration_in_ruledeclaration4222);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2150:2: (this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2150:3: this_COMMA_1= RULE_COMMA ( (lv_d_2_0= ruledeclaration_identifier_and_init ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruledeclaration4234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getDeclarationAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2154:1: ( (lv_d_2_0= ruledeclaration_identifier_and_init ) )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2155:1: (lv_d_2_0= ruledeclaration_identifier_and_init )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2155:1: (lv_d_2_0= ruledeclaration_identifier_and_init )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2156:3: lv_d_2_0= ruledeclaration_identifier_and_init
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getDDeclaration_identifier_and_initParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruledeclaration_identifier_and_init_in_ruledeclaration4254);
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

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruledeclaration4267); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2184:1: entryRulefully_specified_type returns [EObject current=null] : iv_rulefully_specified_type= rulefully_specified_type EOF ;
    public final EObject entryRulefully_specified_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefully_specified_type = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2185:2: (iv_rulefully_specified_type= rulefully_specified_type EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2186:2: iv_rulefully_specified_type= rulefully_specified_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFully_specified_typeRule()); 
            }
            pushFollow(FOLLOW_rulefully_specified_type_in_entryRulefully_specified_type4302);
            iv_rulefully_specified_type=rulefully_specified_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefully_specified_type; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefully_specified_type4312); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2193:1: rulefully_specified_type returns [EObject current=null] : ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2196:28: ( ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2197:1: ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2197:1: ( ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) ) | ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) ) | ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) ) | ( (lv_ts_7_0= ruletype_specifier ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_VOID||(LA25_1>=66 && LA25_1<=80)) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=63 && LA25_1<=65)) ) {
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
            case 62:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_VOID||(LA25_2>=66 && LA25_2<=80)) ) {
                    alt25=2;
                }
                else if ( ((LA25_2>=63 && LA25_2<=65)) ) {
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
            case 63:
            case 64:
            case 65:
                {
                alt25=3;
                }
                break;
            case RULE_VOID:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2197:2: ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2197:2: ( ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2197:3: ( (lv_tq_0_0= ruletype_qualifier ) ) ( (lv_tp_1_0= ruletype_precision ) ) ( (lv_ts_2_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2197:3: ( (lv_tq_0_0= ruletype_qualifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2198:1: (lv_tq_0_0= ruletype_qualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2198:1: (lv_tq_0_0= ruletype_qualifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2199:3: lv_tq_0_0= ruletype_qualifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTqType_qualifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_qualifier_in_rulefully_specified_type4359);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2215:2: ( (lv_tp_1_0= ruletype_precision ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2216:1: (lv_tp_1_0= ruletype_precision )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2216:1: (lv_tp_1_0= ruletype_precision )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2217:3: lv_tp_1_0= ruletype_precision
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTpType_precisionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_precision_in_rulefully_specified_type4380);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2233:2: ( (lv_ts_2_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2234:1: (lv_ts_2_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2234:1: (lv_ts_2_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2235:3: lv_ts_2_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4401);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2252:6: ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2252:6: ( ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2252:7: ( (lv_tq_3_0= ruletype_qualifier ) ) ( (lv_ts_4_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2252:7: ( (lv_tq_3_0= ruletype_qualifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2253:1: (lv_tq_3_0= ruletype_qualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2253:1: (lv_tq_3_0= ruletype_qualifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2254:3: lv_tq_3_0= ruletype_qualifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTqType_qualifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_qualifier_in_rulefully_specified_type4430);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2270:2: ( (lv_ts_4_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2271:1: (lv_ts_4_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2271:1: (lv_ts_4_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2272:3: lv_ts_4_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4451);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2289:6: ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2289:6: ( ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2289:7: ( (lv_tp_5_0= ruletype_precision ) ) ( (lv_ts_6_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2289:7: ( (lv_tp_5_0= ruletype_precision ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2290:1: (lv_tp_5_0= ruletype_precision )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2290:1: (lv_tp_5_0= ruletype_precision )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2291:3: lv_tp_5_0= ruletype_precision
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTpType_precisionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_precision_in_rulefully_specified_type4480);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2307:2: ( (lv_ts_6_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2308:1: (lv_ts_6_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2308:1: (lv_ts_6_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2309:3: lv_ts_6_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4501);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2326:6: ( (lv_ts_7_0= ruletype_specifier ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2326:6: ( (lv_ts_7_0= ruletype_specifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2327:1: (lv_ts_7_0= ruletype_specifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2327:1: (lv_ts_7_0= ruletype_specifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2328:3: lv_ts_7_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFully_specified_typeAccess().getTsType_specifierParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulefully_specified_type4529);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2352:1: entryRuletype_qualifier returns [String current=null] : iv_ruletype_qualifier= ruletype_qualifier EOF ;
    public final String entryRuletype_qualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_qualifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2353:2: (iv_ruletype_qualifier= ruletype_qualifier EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2354:2: iv_ruletype_qualifier= ruletype_qualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_qualifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_qualifier_in_entryRuletype_qualifier4566);
            iv_ruletype_qualifier=ruletype_qualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_qualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_qualifier4577); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2361:1: ruletype_qualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'param' ) ;
    public final AntlrDatatypeRuleToken ruletype_qualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2364:28: ( (kw= 'const' | kw= 'param' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2365:1: (kw= 'const' | kw= 'param' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2365:1: (kw= 'const' | kw= 'param' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==61) ) {
                alt26=1;
            }
            else if ( (LA26_0==62) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2366:2: kw= 'const'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruletype_qualifier4615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_qualifierAccess().getConstKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2373:2: kw= 'param'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruletype_qualifier4634); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2386:1: entryRuletype_precision returns [String current=null] : iv_ruletype_precision= ruletype_precision EOF ;
    public final String entryRuletype_precision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_precision = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2387:2: (iv_ruletype_precision= ruletype_precision EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2388:2: iv_ruletype_precision= ruletype_precision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_precisionRule()); 
            }
            pushFollow(FOLLOW_ruletype_precision_in_entryRuletype_precision4675);
            iv_ruletype_precision=ruletype_precision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_precision.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_precision4686); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2395:1: ruletype_precision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'lowp' | kw= 'mediump' | kw= 'highp' ) ;
    public final AntlrDatatypeRuleToken ruletype_precision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2398:28: ( (kw= 'lowp' | kw= 'mediump' | kw= 'highp' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2399:1: (kw= 'lowp' | kw= 'mediump' | kw= 'highp' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2399:1: (kw= 'lowp' | kw= 'mediump' | kw= 'highp' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt27=1;
                }
                break;
            case 64:
                {
                alt27=2;
                }
                break;
            case 65:
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2400:2: kw= 'lowp'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruletype_precision4724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_precisionAccess().getLowpKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2407:2: kw= 'mediump'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruletype_precision4743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_precisionAccess().getMediumpKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2414:2: kw= 'highp'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruletype_precision4762); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2427:1: entryRuletype_specifier returns [EObject current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final EObject entryRuletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_specifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2428:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2429:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier4802);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier4812); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2436:1: ruletype_specifier returns [EObject current=null] : ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? ) ;
    public final EObject ruletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject this_array_brackets_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2439:28: ( ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2440:1: ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2440:1: ( () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2440:2: () ruletype_specifier_nonarray (this_array_brackets_2= rulearray_brackets )?
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2440:2: ()
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2441:2: 
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
            pushFollow(FOLLOW_ruletype_specifier_nonarray_in_ruletype_specifier4868);
            ruletype_specifier_nonarray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2460:1: (this_array_brackets_2= rulearray_brackets )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LEFT_BRACKET) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2461:2: this_array_brackets_2= rulearray_brackets
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getArray_bracketsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulearray_brackets_in_ruletype_specifier4893);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2480:1: entryRulearray_brackets returns [EObject current=null] : iv_rulearray_brackets= rulearray_brackets EOF ;
    public final EObject entryRulearray_brackets() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_brackets = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2481:2: (iv_rulearray_brackets= rulearray_brackets EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2482:2: iv_rulearray_brackets= rulearray_brackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_bracketsRule()); 
            }
            pushFollow(FOLLOW_rulearray_brackets_in_entryRulearray_brackets4930);
            iv_rulearray_brackets=rulearray_brackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearray_brackets; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_brackets4940); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2489:1: rulearray_brackets returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET ) ;
    public final EObject rulearray_brackets() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_0=null;
        Token this_RIGHT_BRACKET_2=null;
        EObject this_constant_expression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2492:28: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2493:1: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2493:1: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2493:2: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET this_constant_expression_1= ruleconstant_expression this_RIGHT_BRACKET_2= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rulearray_brackets4976); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getArray_bracketsAccess().getLEFT_BRACKETTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArray_bracketsAccess().getConstant_expressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleconstant_expression_in_rulearray_brackets5000);
            this_constant_expression_1=ruleconstant_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_constant_expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RIGHT_BRACKET_2=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rulearray_brackets5010); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2521:1: entryRuletype_specifier_nonarray returns [String current=null] : iv_ruletype_specifier_nonarray= ruletype_specifier_nonarray EOF ;
    public final String entryRuletype_specifier_nonarray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_specifier_nonarray = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2522:2: (iv_ruletype_specifier_nonarray= ruletype_specifier_nonarray EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2523:2: iv_ruletype_specifier_nonarray= ruletype_specifier_nonarray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifier_nonarrayRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_nonarray_in_entryRuletype_specifier_nonarray5046);
            iv_ruletype_specifier_nonarray=ruletype_specifier_nonarray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier_nonarray.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier_nonarray5057); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2530:1: ruletype_specifier_nonarray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= ruleTYPE | this_VOID_1= RULE_VOID ) ;
    public final AntlrDatatypeRuleToken ruletype_specifier_nonarray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VOID_1=null;
        AntlrDatatypeRuleToken this_TYPE_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2533:28: ( (this_TYPE_0= ruleTYPE | this_VOID_1= RULE_VOID ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2534:1: (this_TYPE_0= ruleTYPE | this_VOID_1= RULE_VOID )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2534:1: (this_TYPE_0= ruleTYPE | this_VOID_1= RULE_VOID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=66 && LA29_0<=80)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2535:5: this_TYPE_0= ruleTYPE
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifier_nonarrayAccess().getTYPEParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTYPE_in_ruletype_specifier_nonarray5104);
                    this_TYPE_0=ruleTYPE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TYPE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2546:10: this_VOID_1= RULE_VOID
                    {
                    this_VOID_1=(Token)match(input,RULE_VOID,FOLLOW_RULE_VOID_in_ruletype_specifier_nonarray5130); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2561:1: entryRuleinitializer returns [EObject current=null] : iv_ruleinitializer= ruleinitializer EOF ;
    public final EObject entryRuleinitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitializer = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2562:2: (iv_ruleinitializer= ruleinitializer EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2563:2: iv_ruleinitializer= ruleinitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleinitializer_in_entryRuleinitializer5175);
            iv_ruleinitializer=ruleinitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinitializer5185); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2570:1: ruleinitializer returns [EObject current=null] : ( (lv_e_0_0= ruleassignment_expression ) ) ;
    public final EObject ruleinitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2573:28: ( ( (lv_e_0_0= ruleassignment_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2574:1: ( (lv_e_0_0= ruleassignment_expression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2574:1: ( (lv_e_0_0= ruleassignment_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2575:1: (lv_e_0_0= ruleassignment_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2575:1: (lv_e_0_0= ruleassignment_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2576:3: lv_e_0_0= ruleassignment_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInitializerAccess().getEAssignment_expressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleassignment_expression_in_ruleinitializer5230);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2600:1: entryRuledeclaration_statement returns [EObject current=null] : iv_ruledeclaration_statement= ruledeclaration_statement EOF ;
    public final EObject entryRuledeclaration_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2601:2: (iv_ruledeclaration_statement= ruledeclaration_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2602:2: iv_ruledeclaration_statement= ruledeclaration_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_statementRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_statement_in_entryRuledeclaration_statement5265);
            iv_ruledeclaration_statement=ruledeclaration_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_statement5275); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2609:1: ruledeclaration_statement returns [EObject current=null] : ( (lv_d_0_0= ruledeclaration ) ) ;
    public final EObject ruledeclaration_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_d_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2612:28: ( ( (lv_d_0_0= ruledeclaration ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2613:1: ( (lv_d_0_0= ruledeclaration ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2613:1: ( (lv_d_0_0= ruledeclaration ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2614:1: (lv_d_0_0= ruledeclaration )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2614:1: (lv_d_0_0= ruledeclaration )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2615:3: lv_d_0_0= ruledeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaration_statementAccess().getDDeclarationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruledeclaration_in_ruledeclaration_statement5320);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2639:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2640:2: (iv_rulestatement= rulestatement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2641:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement5355);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement5365); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2648:1: rulestatement returns [EObject current=null] : ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_s_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2651:28: ( ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2652:1: ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2652:1: ( ( (lv_c_0_0= rulecompound_statement ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LEFT_BRACE) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_INTCONSTANT && LA30_0<=RULE_LEFT_PAREN)||(LA30_0>=RULE_INC && LA30_0<=RULE_DEC)||(LA30_0>=RULE_PLUS && LA30_0<=RULE_BANG)||(LA30_0>=RULE_SEMICOLON && LA30_0<=RULE_VOID)||LA30_0==RULE_IF||(LA30_0>=RULE_WHILE && LA30_0<=RULE_RETURN)||LA30_0==RULE_LETTER||(LA30_0>=61 && LA30_0<=82)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2652:2: ( (lv_c_0_0= rulecompound_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2652:2: ( (lv_c_0_0= rulecompound_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2653:1: (lv_c_0_0= rulecompound_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2653:1: (lv_c_0_0= rulecompound_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2654:3: lv_c_0_0= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCCompound_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestatement5411);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2671:6: ( (lv_s_1_0= rulesimple_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2671:6: ( (lv_s_1_0= rulesimple_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2672:1: (lv_s_1_0= rulesimple_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2672:1: (lv_s_1_0= rulesimple_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2673:3: lv_s_1_0= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSSimple_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement5438);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2697:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2698:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2699:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_statementRule()); 
            }
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement5474);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement5484); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2706:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_d_0_0 = null;

        EObject lv_e_1_0 = null;

        EObject lv_s_2_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_j_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2709:28: ( ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:1: ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:1: ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) )
            int alt31=5;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:2: ( (lv_d_0_0= ruledeclaration_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:2: ( (lv_d_0_0= ruledeclaration_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2711:1: (lv_d_0_0= ruledeclaration_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2711:1: (lv_d_0_0= ruledeclaration_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2712:3: lv_d_0_0= ruledeclaration_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getDDeclaration_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaration_statement_in_rulesimple_statement5530);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2729:6: ( (lv_e_1_0= ruleexpression_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2729:6: ( (lv_e_1_0= ruleexpression_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2730:1: (lv_e_1_0= ruleexpression_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2730:1: (lv_e_1_0= ruleexpression_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2731:3: lv_e_1_0= ruleexpression_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getEExpression_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_statement_in_rulesimple_statement5557);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2748:6: ( (lv_s_2_0= ruleselection_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2748:6: ( (lv_s_2_0= ruleselection_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2749:1: (lv_s_2_0= ruleselection_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2749:1: (lv_s_2_0= ruleselection_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2750:3: lv_s_2_0= ruleselection_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getSSelection_statementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselection_statement_in_rulesimple_statement5584);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2767:6: ( (lv_i_3_0= ruleiteration_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2767:6: ( (lv_i_3_0= ruleiteration_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2768:1: (lv_i_3_0= ruleiteration_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2768:1: (lv_i_3_0= ruleiteration_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2769:3: lv_i_3_0= ruleiteration_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getIIteration_statementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleiteration_statement_in_rulesimple_statement5611);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2786:6: ( (lv_j_4_0= rulejump_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2786:6: ( (lv_j_4_0= rulejump_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2787:1: (lv_j_4_0= rulejump_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2787:1: (lv_j_4_0= rulejump_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2788:3: lv_j_4_0= rulejump_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimple_statementAccess().getJJump_statementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulejump_statement_in_rulesimple_statement5638);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2812:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2813:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2814:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement5674);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement5684); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2821:1: rulecompound_statement returns [EObject current=null] : ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_1=null;
        Token this_RIGHT_BRACE_3=null;
        EObject lv_s_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2824:28: ( ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2825:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2825:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2825:2: () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2825:2: ()
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2826:2: 
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

            this_LEFT_BRACE_1=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement5732); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACE_1, grammarAccess.getCompound_statementAccess().getLEFT_BRACETerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2838:1: ( (lv_s_2_0= rulestatement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_INTCONSTANT && LA32_0<=RULE_LEFT_PAREN)||(LA32_0>=RULE_INC && LA32_0<=RULE_DEC)||(LA32_0>=RULE_PLUS && LA32_0<=RULE_BANG)||(LA32_0>=RULE_SEMICOLON && LA32_0<=RULE_LEFT_BRACE)||LA32_0==RULE_IF||(LA32_0>=RULE_WHILE && LA32_0<=RULE_RETURN)||LA32_0==RULE_LETTER||(LA32_0>=61 && LA32_0<=82)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2839:1: (lv_s_2_0= rulestatement )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2839:1: (lv_s_2_0= rulestatement )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2840:3: lv_s_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompound_statementAccess().getSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulecompound_statement5752);
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

            this_RIGHT_BRACE_3=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement5764); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2868:1: entryRulestatement_no_new_scope returns [EObject current=null] : iv_rulestatement_no_new_scope= rulestatement_no_new_scope EOF ;
    public final EObject entryRulestatement_no_new_scope() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_no_new_scope = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2869:2: (iv_rulestatement_no_new_scope= rulestatement_no_new_scope EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2870:2: iv_rulestatement_no_new_scope= rulestatement_no_new_scope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_no_new_scopeRule()); 
            }
            pushFollow(FOLLOW_rulestatement_no_new_scope_in_entryRulestatement_no_new_scope5799);
            iv_rulestatement_no_new_scope=rulestatement_no_new_scope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_no_new_scope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_no_new_scope5809); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2877:1: rulestatement_no_new_scope returns [EObject current=null] : ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) ;
    public final EObject rulestatement_no_new_scope() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_s_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2880:28: ( ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2881:1: ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2881:1: ( ( (lv_c_0_0= rulecompound_statement_no_new_scope ) ) | ( (lv_s_1_0= rulesimple_statement ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LEFT_BRACE) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=RULE_INTCONSTANT && LA33_0<=RULE_LEFT_PAREN)||(LA33_0>=RULE_INC && LA33_0<=RULE_DEC)||(LA33_0>=RULE_PLUS && LA33_0<=RULE_BANG)||(LA33_0>=RULE_SEMICOLON && LA33_0<=RULE_VOID)||LA33_0==RULE_IF||(LA33_0>=RULE_WHILE && LA33_0<=RULE_RETURN)||LA33_0==RULE_LETTER||(LA33_0>=61 && LA33_0<=82)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2881:2: ( (lv_c_0_0= rulecompound_statement_no_new_scope ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2881:2: ( (lv_c_0_0= rulecompound_statement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2882:1: (lv_c_0_0= rulecompound_statement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2882:1: (lv_c_0_0= rulecompound_statement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2883:3: lv_c_0_0= rulecompound_statement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_no_new_scopeAccess().getCCompound_statement_no_new_scopeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecompound_statement_no_new_scope_in_rulestatement_no_new_scope5855);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2900:6: ( (lv_s_1_0= rulesimple_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2900:6: ( (lv_s_1_0= rulesimple_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2901:1: (lv_s_1_0= rulesimple_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2901:1: (lv_s_1_0= rulesimple_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2902:3: lv_s_1_0= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_no_new_scopeAccess().getSSimple_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement_no_new_scope5882);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2926:1: entryRulecompound_statement_no_new_scope returns [EObject current=null] : iv_rulecompound_statement_no_new_scope= rulecompound_statement_no_new_scope EOF ;
    public final EObject entryRulecompound_statement_no_new_scope() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement_no_new_scope = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2927:2: (iv_rulecompound_statement_no_new_scope= rulecompound_statement_no_new_scope EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2928:2: iv_rulecompound_statement_no_new_scope= rulecompound_statement_no_new_scope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statement_no_new_scopeRule()); 
            }
            pushFollow(FOLLOW_rulecompound_statement_no_new_scope_in_entryRulecompound_statement_no_new_scope5918);
            iv_rulecompound_statement_no_new_scope=rulecompound_statement_no_new_scope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement_no_new_scope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement_no_new_scope5928); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2935:1: rulecompound_statement_no_new_scope returns [EObject current=null] : ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) ;
    public final EObject rulecompound_statement_no_new_scope() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_1=null;
        Token this_RIGHT_BRACE_3=null;
        EObject lv_s_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2938:28: ( ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2939:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2939:1: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2939:2: () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_s_2_0= rulestatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2939:2: ()
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2940:2: 
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

            this_LEFT_BRACE_1=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement_no_new_scope5976); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACE_1, grammarAccess.getCompound_statement_no_new_scopeAccess().getLEFT_BRACETerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2952:1: ( (lv_s_2_0= rulestatement ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_INTCONSTANT && LA34_0<=RULE_LEFT_PAREN)||(LA34_0>=RULE_INC && LA34_0<=RULE_DEC)||(LA34_0>=RULE_PLUS && LA34_0<=RULE_BANG)||(LA34_0>=RULE_SEMICOLON && LA34_0<=RULE_LEFT_BRACE)||LA34_0==RULE_IF||(LA34_0>=RULE_WHILE && LA34_0<=RULE_RETURN)||LA34_0==RULE_LETTER||(LA34_0>=61 && LA34_0<=82)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2953:1: (lv_s_2_0= rulestatement )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2953:1: (lv_s_2_0= rulestatement )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2954:3: lv_s_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompound_statement_no_new_scopeAccess().getSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulecompound_statement_no_new_scope5996);
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

            this_RIGHT_BRACE_3=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement_no_new_scope6008); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2982:1: entryRuleexpression_statement returns [EObject current=null] : iv_ruleexpression_statement= ruleexpression_statement EOF ;
    public final EObject entryRuleexpression_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2983:2: (iv_ruleexpression_statement= ruleexpression_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2984:2: iv_ruleexpression_statement= ruleexpression_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_statementRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_statement_in_entryRuleexpression_statement6043);
            iv_ruleexpression_statement=ruleexpression_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_statement6053); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2991:1: ruleexpression_statement returns [EObject current=null] : ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ) ;
    public final EObject ruleexpression_statement() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_e_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2994:28: ( ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2995:1: ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2995:1: ( ( () this_SEMICOLON_1= RULE_SEMICOLON ) | ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SEMICOLON) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_INTCONSTANT && LA35_0<=RULE_LEFT_PAREN)||(LA35_0>=RULE_INC && LA35_0<=RULE_DEC)||(LA35_0>=RULE_PLUS && LA35_0<=RULE_BANG)||LA35_0==RULE_VOID||LA35_0==RULE_LETTER||(LA35_0>=66 && LA35_0<=82)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2995:2: ( () this_SEMICOLON_1= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2995:2: ( () this_SEMICOLON_1= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2995:3: () this_SEMICOLON_1= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2995:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2996:2: 
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

                    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_1, grammarAccess.getExpression_statementAccess().getSEMICOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3009:6: ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3009:6: ( ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3009:7: ( (lv_e_2_0= ruleexpression ) ) this_SEMICOLON_3= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3009:7: ( (lv_e_2_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3010:1: (lv_e_2_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3010:1: (lv_e_2_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3011:3: lv_e_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_statementAccess().getEExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_statement6130);
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

                    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6141); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3039:1: entryRuleconstant_expression returns [EObject current=null] : iv_ruleconstant_expression= ruleconstant_expression EOF ;
    public final EObject entryRuleconstant_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_expression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3040:2: (iv_ruleconstant_expression= ruleconstant_expression EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3041:2: iv_ruleconstant_expression= ruleconstant_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression6177);
            iv_ruleconstant_expression=ruleconstant_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_expression6187); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3048:1: ruleconstant_expression returns [EObject current=null] : ( (lv_c_0_0= ruleconditional_expression ) ) ;
    public final EObject ruleconstant_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3051:28: ( ( (lv_c_0_0= ruleconditional_expression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3052:1: ( (lv_c_0_0= ruleconditional_expression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3052:1: ( (lv_c_0_0= ruleconditional_expression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3053:1: (lv_c_0_0= ruleconditional_expression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3053:1: (lv_c_0_0= ruleconditional_expression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3054:3: lv_c_0_0= ruleconditional_expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstant_expressionAccess().getCConditional_expressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleconditional_expression_in_ruleconstant_expression6232);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3078:1: entryRuleselection_statement returns [EObject current=null] : iv_ruleselection_statement= ruleselection_statement EOF ;
    public final EObject entryRuleselection_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselection_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3079:2: (iv_ruleselection_statement= ruleselection_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3080:2: iv_ruleselection_statement= ruleselection_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelection_statementRule()); 
            }
            pushFollow(FOLLOW_ruleselection_statement_in_entryRuleselection_statement6267);
            iv_ruleselection_statement=ruleselection_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselection_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselection_statement6277); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3087:1: ruleselection_statement returns [EObject current=null] : (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3090:28: ( (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3091:1: (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3091:1: (this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3091:2: this_IF_0= RULE_IF this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_e_2_0= ruleexpression ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_a_4_0= rulestatement ) ) (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )?
            {
            this_IF_0=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleselection_statement6313); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IF_0, grammarAccess.getSelection_statementAccess().getIFTerminalRuleCall_0()); 
                  
            }
            this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleselection_statement6323); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PAREN_1, grammarAccess.getSelection_statementAccess().getLEFT_PARENTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3099:1: ( (lv_e_2_0= ruleexpression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3100:1: (lv_e_2_0= ruleexpression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3100:1: (lv_e_2_0= ruleexpression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3101:3: lv_e_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelection_statementAccess().getEExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleselection_statement6343);
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

            this_RIGHT_PAREN_3=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleselection_statement6354); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PAREN_3, grammarAccess.getSelection_statementAccess().getRIGHT_PARENTerminalRuleCall_3()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3121:1: ( (lv_a_4_0= rulestatement ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3122:1: (lv_a_4_0= rulestatement )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3122:1: (lv_a_4_0= rulestatement )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3123:3: lv_a_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelection_statementAccess().getAStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruleselection_statement6374);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3139:2: (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )?
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3139:3: this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) )
                    {
                    this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleselection_statement6386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELSE_5, grammarAccess.getSelection_statementAccess().getELSETerminalRuleCall_5_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3143:1: ( (lv_b_6_0= rulestatement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3144:1: (lv_b_6_0= rulestatement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3144:1: (lv_b_6_0= rulestatement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3145:3: lv_b_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelection_statementAccess().getBStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleselection_statement6406);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3169:1: entryRulecondition returns [EObject current=null] : iv_rulecondition= rulecondition EOF ;
    public final EObject entryRulecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecondition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3170:2: (iv_rulecondition= rulecondition EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3171:2: iv_rulecondition= rulecondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_rulecondition_in_entryRulecondition6444);
            iv_rulecondition=rulecondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecondition6454); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3178:1: rulecondition returns [EObject current=null] : ( (lv_e_0_0= ruleexpression ) ) ;
    public final EObject rulecondition() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3181:28: ( ( (lv_e_0_0= ruleexpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3182:1: ( (lv_e_0_0= ruleexpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3182:1: ( (lv_e_0_0= ruleexpression ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3183:1: (lv_e_0_0= ruleexpression )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3183:1: (lv_e_0_0= ruleexpression )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3184:3: lv_e_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getEExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulecondition6499);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3208:1: entryRuleiteration_statement returns [EObject current=null] : iv_ruleiteration_statement= ruleiteration_statement EOF ;
    public final EObject entryRuleiteration_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiteration_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3209:2: (iv_ruleiteration_statement= ruleiteration_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3210:2: iv_ruleiteration_statement= ruleiteration_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteration_statementRule()); 
            }
            pushFollow(FOLLOW_ruleiteration_statement_in_entryRuleiteration_statement6534);
            iv_ruleiteration_statement=ruleiteration_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiteration_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleiteration_statement6544); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3217:1: ruleiteration_statement returns [EObject current=null] : ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3220:28: ( ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:1: ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:1: ( (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) ) | (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON ) | ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) ) | (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) ) )
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:2: (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:2: (this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3221:3: this_WHILE_0= RULE_WHILE this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_c_2_0= rulecondition ) ) this_RIGHT_PAREN_3= RULE_RIGHT_PAREN ( (lv_snns_4_0= rulestatement_no_new_scope ) )
                    {
                    this_WHILE_0=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleiteration_statement6581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_0, grammarAccess.getIteration_statementAccess().getWHILETerminalRuleCall_0_0()); 
                          
                    }
                    this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_1, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_0_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3229:1: ( (lv_c_2_0= rulecondition ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3230:1: (lv_c_2_0= rulecondition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3230:1: (lv_c_2_0= rulecondition )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3231:3: lv_c_2_0= rulecondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getCConditionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecondition_in_ruleiteration_statement6611);
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

                    this_RIGHT_PAREN_3=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_3, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_0_3()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3251:1: ( (lv_snns_4_0= rulestatement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3252:1: (lv_snns_4_0= rulestatement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3252:1: (lv_snns_4_0= rulestatement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3253:3: lv_snns_4_0= rulestatement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSnnsStatement_no_new_scopeParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6642);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3270:6: (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3270:6: (this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3270:7: this_DO_5= RULE_DO ( (lv_s_6_0= rulestatement ) ) this_WHILE_7= RULE_WHILE this_LEFT_PAREN_8= RULE_LEFT_PAREN ( (lv_e_9_0= ruleexpression ) ) this_RIGHT_PAREN_10= RULE_RIGHT_PAREN this_SEMICOLON_11= RULE_SEMICOLON
                    {
                    this_DO_5=(Token)match(input,RULE_DO,FOLLOW_RULE_DO_in_ruleiteration_statement6661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DO_5, grammarAccess.getIteration_statementAccess().getDOTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3274:1: ( (lv_s_6_0= rulestatement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3275:1: (lv_s_6_0= rulestatement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3275:1: (lv_s_6_0= rulestatement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3276:3: lv_s_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSStatementParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleiteration_statement6681);
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

                    this_WHILE_7=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleiteration_statement6692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_7, grammarAccess.getIteration_statementAccess().getWHILETerminalRuleCall_1_2()); 
                          
                    }
                    this_LEFT_PAREN_8=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_8, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_1_3()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3300:1: ( (lv_e_9_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3301:1: (lv_e_9_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3301:1: (lv_e_9_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3302:3: lv_e_9_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getEExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleiteration_statement6722);
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

                    this_RIGHT_PAREN_10=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_10, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_1_5()); 
                          
                    }
                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleiteration_statement6743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_11, grammarAccess.getIteration_statementAccess().getSEMICOLONTerminalRuleCall_1_6()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3327:6: ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3327:6: ( ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3327:7: ( (lv_u_12_0= ruleunroll_modifier ) ) this_FOR_13= RULE_FOR this_LEFT_PAREN_14= RULE_LEFT_PAREN ( (lv_init_15_0= rulefor_init_statement ) ) ( (lv_rem_16_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_17= RULE_RIGHT_PAREN ( (lv_snns_18_0= rulestatement_no_new_scope ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3327:7: ( (lv_u_12_0= ruleunroll_modifier ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3328:1: (lv_u_12_0= ruleunroll_modifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3328:1: (lv_u_12_0= ruleunroll_modifier )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3329:3: lv_u_12_0= ruleunroll_modifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getUUnroll_modifierParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunroll_modifier_in_ruleiteration_statement6771);
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

                    this_FOR_13=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_ruleiteration_statement6782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_13, grammarAccess.getIteration_statementAccess().getFORTerminalRuleCall_2_1()); 
                          
                    }
                    this_LEFT_PAREN_14=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_14, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_2_2()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3353:1: ( (lv_init_15_0= rulefor_init_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3354:1: (lv_init_15_0= rulefor_init_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3354:1: (lv_init_15_0= rulefor_init_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3355:3: lv_init_15_0= rulefor_init_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getInitFor_init_statementParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_init_statement_in_ruleiteration_statement6812);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3371:2: ( (lv_rem_16_0= rulefor_rest_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3372:1: (lv_rem_16_0= rulefor_rest_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3372:1: (lv_rem_16_0= rulefor_rest_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3373:3: lv_rem_16_0= rulefor_rest_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getRemFor_rest_statementParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6833);
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

                    this_RIGHT_PAREN_17=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_17, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_2_5()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3393:1: ( (lv_snns_18_0= rulestatement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3394:1: (lv_snns_18_0= rulestatement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3394:1: (lv_snns_18_0= rulestatement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3395:3: lv_snns_18_0= rulestatement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSnnsStatement_no_new_scopeParserRuleCall_2_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6864);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3412:6: (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3412:6: (this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3412:7: this_FOR_19= RULE_FOR this_LEFT_PAREN_20= RULE_LEFT_PAREN ( (lv_init_21_0= rulefor_init_statement ) ) ( (lv_rem_22_0= rulefor_rest_statement ) ) this_RIGHT_PAREN_23= RULE_RIGHT_PAREN ( (lv_snns_24_0= rulestatement_no_new_scope ) )
                    {
                    this_FOR_19=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_ruleiteration_statement6883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_19, grammarAccess.getIteration_statementAccess().getFORTerminalRuleCall_3_0()); 
                          
                    }
                    this_LEFT_PAREN_20=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PAREN_20, grammarAccess.getIteration_statementAccess().getLEFT_PARENTerminalRuleCall_3_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3420:1: ( (lv_init_21_0= rulefor_init_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3421:1: (lv_init_21_0= rulefor_init_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3421:1: (lv_init_21_0= rulefor_init_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3422:3: lv_init_21_0= rulefor_init_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getInitFor_init_statementParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_init_statement_in_ruleiteration_statement6913);
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3438:2: ( (lv_rem_22_0= rulefor_rest_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3439:1: (lv_rem_22_0= rulefor_rest_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3439:1: (lv_rem_22_0= rulefor_rest_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3440:3: lv_rem_22_0= rulefor_rest_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getRemFor_rest_statementParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6934);
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

                    this_RIGHT_PAREN_23=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PAREN_23, grammarAccess.getIteration_statementAccess().getRIGHT_PARENTerminalRuleCall_3_4()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3460:1: ( (lv_snns_24_0= rulestatement_no_new_scope ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3461:1: (lv_snns_24_0= rulestatement_no_new_scope )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3461:1: (lv_snns_24_0= rulestatement_no_new_scope )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3462:3: lv_snns_24_0= rulestatement_no_new_scope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteration_statementAccess().getSnnsStatement_no_new_scopeParserRuleCall_3_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6965);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3486:1: entryRuleunroll_modifier returns [EObject current=null] : iv_ruleunroll_modifier= ruleunroll_modifier EOF ;
    public final EObject entryRuleunroll_modifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunroll_modifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3487:2: (iv_ruleunroll_modifier= ruleunroll_modifier EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3488:2: iv_ruleunroll_modifier= ruleunroll_modifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnroll_modifierRule()); 
            }
            pushFollow(FOLLOW_ruleunroll_modifier_in_entryRuleunroll_modifier7002);
            iv_ruleunroll_modifier=ruleunroll_modifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunroll_modifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunroll_modifier7012); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3495:1: ruleunroll_modifier returns [EObject current=null] : (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3498:28: ( (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3499:1: (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3499:1: (this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3499:2: this_UNROLL_0= RULE_UNROLL this_LEFT_PAREN_1= RULE_LEFT_PAREN ( (lv_m_2_0= RULE_INTCONSTANT ) ) this_COMMA_3= RULE_COMMA ( (lv_c_4_0= RULE_INTCONSTANT ) ) this_RIGHT_PAREN_5= RULE_RIGHT_PAREN
            {
            this_UNROLL_0=(Token)match(input,RULE_UNROLL,FOLLOW_RULE_UNROLL_in_ruleunroll_modifier7048); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_UNROLL_0, grammarAccess.getUnroll_modifierAccess().getUNROLLTerminalRuleCall_0()); 
                  
            }
            this_LEFT_PAREN_1=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_RULE_LEFT_PAREN_in_ruleunroll_modifier7058); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PAREN_1, grammarAccess.getUnroll_modifierAccess().getLEFT_PARENTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3507:1: ( (lv_m_2_0= RULE_INTCONSTANT ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3508:1: (lv_m_2_0= RULE_INTCONSTANT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3508:1: (lv_m_2_0= RULE_INTCONSTANT )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3509:3: lv_m_2_0= RULE_INTCONSTANT
            {
            lv_m_2_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7074); if (state.failed) return current;
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

            this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleunroll_modifier7090); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_3, grammarAccess.getUnroll_modifierAccess().getCOMMATerminalRuleCall_3()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3529:1: ( (lv_c_4_0= RULE_INTCONSTANT ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3530:1: (lv_c_4_0= RULE_INTCONSTANT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3530:1: (lv_c_4_0= RULE_INTCONSTANT )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3531:3: lv_c_4_0= RULE_INTCONSTANT
            {
            lv_c_4_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7106); if (state.failed) return current;
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

            this_RIGHT_PAREN_5=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_RULE_RIGHT_PAREN_in_ruleunroll_modifier7122); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3559:1: entryRulefor_init_statement returns [EObject current=null] : iv_rulefor_init_statement= rulefor_init_statement EOF ;
    public final EObject entryRulefor_init_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_init_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3560:2: (iv_rulefor_init_statement= rulefor_init_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3561:2: iv_rulefor_init_statement= rulefor_init_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_init_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_init_statement_in_entryRulefor_init_statement7157);
            iv_rulefor_init_statement=rulefor_init_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_init_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_init_statement7167); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3568:1: rulefor_init_statement returns [EObject current=null] : ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) ) ;
    public final EObject rulefor_init_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_d_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3571:28: ( ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:1: ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:1: ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:2: ( (lv_e_0_0= ruleexpression_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:2: ( (lv_e_0_0= ruleexpression_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3573:1: (lv_e_0_0= ruleexpression_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3573:1: (lv_e_0_0= ruleexpression_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3574:3: lv_e_0_0= ruleexpression_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_init_statementAccess().getEExpression_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_statement_in_rulefor_init_statement7213);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3591:6: ( (lv_d_1_0= ruledeclaration_statement ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3591:6: ( (lv_d_1_0= ruledeclaration_statement ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3592:1: (lv_d_1_0= ruledeclaration_statement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3592:1: (lv_d_1_0= ruledeclaration_statement )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3593:3: lv_d_1_0= ruledeclaration_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_init_statementAccess().getDDeclaration_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaration_statement_in_rulefor_init_statement7240);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3617:1: entryRulefor_rest_statement returns [EObject current=null] : iv_rulefor_rest_statement= rulefor_rest_statement EOF ;
    public final EObject entryRulefor_rest_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_rest_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3618:2: (iv_rulefor_rest_statement= rulefor_rest_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3619:2: iv_rulefor_rest_statement= rulefor_rest_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_rest_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_rest_statement_in_entryRulefor_rest_statement7276);
            iv_rulefor_rest_statement=rulefor_rest_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_rest_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_rest_statement7286); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3626:1: rulefor_rest_statement returns [EObject current=null] : ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) ) ;
    public final EObject rulefor_rest_statement() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_5=null;
        EObject lv_c_1_0 = null;

        EObject lv_e_3_0 = null;

        EObject lv_e_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3629:28: ( ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3630:1: ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3630:1: ( ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? ) | ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INTCONSTANT && LA41_0<=RULE_LEFT_PAREN)||(LA41_0>=RULE_INC && LA41_0<=RULE_DEC)||(LA41_0>=RULE_PLUS && LA41_0<=RULE_BANG)||LA41_0==RULE_VOID||LA41_0==RULE_LETTER||(LA41_0>=66 && LA41_0<=82)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3630:2: ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3630:2: ( () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )? )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3630:3: () ( (lv_c_1_0= rulecondition ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_e_3_0= ruleexpression ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3630:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3631:2: 
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

                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3639:2: ( (lv_c_1_0= rulecondition ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3640:1: (lv_c_1_0= rulecondition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3640:1: (lv_c_1_0= rulecondition )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3641:3: lv_c_1_0= rulecondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_rest_statementAccess().getCConditionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecondition_in_rulefor_rest_statement7345);
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

                    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_2, grammarAccess.getFor_rest_statementAccess().getSEMICOLONTerminalRuleCall_0_2()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3661:1: ( (lv_e_3_0= ruleexpression ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_INTCONSTANT && LA39_0<=RULE_LEFT_PAREN)||(LA39_0>=RULE_INC && LA39_0<=RULE_DEC)||(LA39_0>=RULE_PLUS && LA39_0<=RULE_BANG)||LA39_0==RULE_VOID||LA39_0==RULE_LETTER||(LA39_0>=66 && LA39_0<=82)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3662:1: (lv_e_3_0= ruleexpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3662:1: (lv_e_3_0= ruleexpression )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3663:3: lv_e_3_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFor_rest_statementAccess().getEExpressionParserRuleCall_0_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulefor_rest_statement7376);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3680:6: ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3680:6: ( () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )? )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3680:7: () this_SEMICOLON_5= RULE_SEMICOLON ( (lv_e_6_0= ruleexpression ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3680:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3681:2: 
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

                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getFor_rest_statementAccess().getSEMICOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3693:1: ( (lv_e_6_0= ruleexpression ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_INTCONSTANT && LA40_0<=RULE_LEFT_PAREN)||(LA40_0>=RULE_INC && LA40_0<=RULE_DEC)||(LA40_0>=RULE_PLUS && LA40_0<=RULE_BANG)||LA40_0==RULE_VOID||LA40_0==RULE_LETTER||(LA40_0>=66 && LA40_0<=82)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3694:1: (lv_e_6_0= ruleexpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3694:1: (lv_e_6_0= ruleexpression )
                            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3695:3: lv_e_6_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFor_rest_statementAccess().getEExpressionParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulefor_rest_statement7428);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3719:1: entryRulejump_statement returns [EObject current=null] : iv_rulejump_statement= rulejump_statement EOF ;
    public final EObject entryRulejump_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejump_statement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3720:2: (iv_rulejump_statement= rulejump_statement EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3721:2: iv_rulejump_statement= rulejump_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJump_statementRule()); 
            }
            pushFollow(FOLLOW_rulejump_statement_in_entryRulejump_statement7466);
            iv_rulejump_statement=rulejump_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulejump_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulejump_statement7476); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3728:1: rulejump_statement returns [EObject current=null] : ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3731:28: ( ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:1: ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:1: ( ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON ) | ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON ) | ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON ) | ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON ) | (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON ) )
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
                else if ( ((LA42_4>=RULE_INTCONSTANT && LA42_4<=RULE_LEFT_PAREN)||(LA42_4>=RULE_INC && LA42_4<=RULE_DEC)||(LA42_4>=RULE_PLUS && LA42_4<=RULE_BANG)||LA42_4==RULE_VOID||LA42_4==RULE_LETTER||(LA42_4>=66 && LA42_4<=82)) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:2: ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:2: ( () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:3: () this_CONTINUE_1= RULE_CONTINUE this_SEMICOLON_2= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3732:3: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3733:2: 
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

                    this_CONTINUE_1=(Token)match(input,RULE_CONTINUE,FOLLOW_RULE_CONTINUE_in_rulejump_statement7525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CONTINUE_1, grammarAccess.getJump_statementAccess().getCONTINUETerminalRuleCall_0_1()); 
                          
                    }
                    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_2, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:6: ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:6: ( () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:7: () this_BREAK_4= RULE_BREAK this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3750:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3751:2: 
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

                    this_BREAK_4=(Token)match(input,RULE_BREAK,FOLLOW_RULE_BREAK_in_rulejump_statement7565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BREAK_4, grammarAccess.getJump_statementAccess().getBREAKTerminalRuleCall_1_1()); 
                          
                    }
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3768:6: ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3768:6: ( () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3768:7: () this_DISCARD_7= RULE_DISCARD this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3768:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3769:2: 
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

                    this_DISCARD_7=(Token)match(input,RULE_DISCARD,FOLLOW_RULE_DISCARD_in_rulejump_statement7605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DISCARD_7, grammarAccess.getJump_statementAccess().getDISCARDTerminalRuleCall_2_1()); 
                          
                    }
                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_8, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_2_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3786:6: ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3786:6: ( () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3786:7: () this_RETURN_10= RULE_RETURN this_SEMICOLON_11= RULE_SEMICOLON
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3786:7: ()
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3787:2: 
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

                    this_RETURN_10=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_rulejump_statement7645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RETURN_10, grammarAccess.getJump_statementAccess().getRETURNTerminalRuleCall_3_1()); 
                          
                    }
                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_11, grammarAccess.getJump_statementAccess().getSEMICOLONTerminalRuleCall_3_2()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3804:6: (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3804:6: (this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3804:7: this_RETURN_12= RULE_RETURN ( (lv_e_13_0= ruleexpression ) ) this_SEMICOLON_14= RULE_SEMICOLON
                    {
                    this_RETURN_12=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_rulejump_statement7673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RETURN_12, grammarAccess.getJump_statementAccess().getRETURNTerminalRuleCall_4_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3808:1: ( (lv_e_13_0= ruleexpression ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3809:1: (lv_e_13_0= ruleexpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3809:1: (lv_e_13_0= ruleexpression )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3810:3: lv_e_13_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJump_statementAccess().getEExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulejump_statement7693);
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

                    this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulejump_statement7704); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3838:1: entryRuletranslation_unit returns [EObject current=null] : iv_ruletranslation_unit= ruletranslation_unit EOF ;
    public final EObject entryRuletranslation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletranslation_unit = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3839:2: (iv_ruletranslation_unit= ruletranslation_unit EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3840:2: iv_ruletranslation_unit= ruletranslation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTranslation_unitRule()); 
            }
            pushFollow(FOLLOW_ruletranslation_unit_in_entryRuletranslation_unit7740);
            iv_ruletranslation_unit=ruletranslation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletranslation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletranslation_unit7750); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3847:1: ruletranslation_unit returns [EObject current=null] : ( (lv_e_0_0= ruleexternal_declaration ) )+ ;
    public final EObject ruletranslation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3850:28: ( ( (lv_e_0_0= ruleexternal_declaration ) )+ )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3851:1: ( (lv_e_0_0= ruleexternal_declaration ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3851:1: ( (lv_e_0_0= ruleexternal_declaration ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_VOID||LA43_0==RULE_T_GLUE_BLOCK||(LA43_0>=61 && LA43_0<=80)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3852:1: (lv_e_0_0= ruleexternal_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3852:1: (lv_e_0_0= ruleexternal_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3853:3: lv_e_0_0= ruleexternal_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTranslation_unitAccess().getEExternal_declarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexternal_declaration_in_ruletranslation_unit7795);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3877:1: entryRuleexternal_declaration returns [EObject current=null] : iv_ruleexternal_declaration= ruleexternal_declaration EOF ;
    public final EObject entryRuleexternal_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexternal_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3878:2: (iv_ruleexternal_declaration= ruleexternal_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3879:2: iv_ruleexternal_declaration= ruleexternal_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternal_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleexternal_declaration_in_entryRuleexternal_declaration7831);
            iv_ruleexternal_declaration=ruleexternal_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexternal_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexternal_declaration7841); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3886:1: ruleexternal_declaration returns [EObject current=null] : ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) ) ;
    public final EObject ruleexternal_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_f_0_0 = null;

        EObject lv_d_1_0 = null;

        EObject lv_g_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3889:28: ( ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:1: ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:1: ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:2: ( (lv_f_0_0= rulefunction_definition ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:2: ( (lv_f_0_0= rulefunction_definition ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3891:1: (lv_f_0_0= rulefunction_definition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3891:1: (lv_f_0_0= rulefunction_definition )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3892:3: lv_f_0_0= rulefunction_definition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getFFunction_definitionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefunction_definition_in_ruleexternal_declaration7887);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3909:6: ( (lv_d_1_0= ruledeclaration ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3909:6: ( (lv_d_1_0= ruledeclaration ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3910:1: (lv_d_1_0= ruledeclaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3910:1: (lv_d_1_0= ruledeclaration )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3911:3: lv_d_1_0= ruledeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getDDeclarationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaration_in_ruleexternal_declaration7914);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3928:6: ( (lv_g_2_0= ruleglue_block ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3928:6: ( (lv_g_2_0= ruleglue_block ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3929:1: (lv_g_2_0= ruleglue_block )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3929:1: (lv_g_2_0= ruleglue_block )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3930:3: lv_g_2_0= ruleglue_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getGGlue_blockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleglue_block_in_ruleexternal_declaration7941);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3954:1: entryRulefunction_definition returns [EObject current=null] : iv_rulefunction_definition= rulefunction_definition EOF ;
    public final EObject entryRulefunction_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_definition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3955:2: (iv_rulefunction_definition= rulefunction_definition EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3956:2: iv_rulefunction_definition= rulefunction_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_definitionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_definition_in_entryRulefunction_definition7977);
            iv_rulefunction_definition=rulefunction_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_definition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_definition7987); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3963:1: rulefunction_definition returns [EObject current=null] : ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) ) ;
    public final EObject rulefunction_definition() throws RecognitionException {
        EObject current = null;

        EObject lv_p_0_0 = null;

        EObject lv_s_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3966:28: ( ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3967:1: ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3967:1: ( ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3967:2: ( (lv_p_0_0= rulefunction_prototype ) ) ( (lv_s_1_0= rulecompound_statement_no_new_scope ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3967:2: ( (lv_p_0_0= rulefunction_prototype ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3968:1: (lv_p_0_0= rulefunction_prototype )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3968:1: (lv_p_0_0= rulefunction_prototype )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3969:3: lv_p_0_0= rulefunction_prototype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_definitionAccess().getPFunction_prototypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefunction_prototype_in_rulefunction_definition8033);
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3985:2: ( (lv_s_1_0= rulecompound_statement_no_new_scope ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3986:1: (lv_s_1_0= rulecompound_statement_no_new_scope )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3986:1: (lv_s_1_0= rulecompound_statement_no_new_scope )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3987:3: lv_s_1_0= rulecompound_statement_no_new_scope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunction_definitionAccess().getSCompound_statement_no_new_scopeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecompound_statement_no_new_scope_in_rulefunction_definition8054);
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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4011:1: entryRuleglue_block returns [EObject current=null] : iv_ruleglue_block= ruleglue_block EOF ;
    public final EObject entryRuleglue_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglue_block = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4012:2: (iv_ruleglue_block= ruleglue_block EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4013:2: iv_ruleglue_block= ruleglue_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlue_blockRule()); 
            }
            pushFollow(FOLLOW_ruleglue_block_in_entryRuleglue_block8090);
            iv_ruleglue_block=ruleglue_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglue_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglue_block8100); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4020:1: ruleglue_block returns [EObject current=null] : ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) ) ;
    public final EObject ruleglue_block() throws RecognitionException {
        EObject current = null;

        Token lv_g_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4023:28: ( ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4024:1: ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4024:1: ( (lv_g_0_0= RULE_T_GLUE_BLOCK ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4025:1: (lv_g_0_0= RULE_T_GLUE_BLOCK )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4025:1: (lv_g_0_0= RULE_T_GLUE_BLOCK )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4026:3: lv_g_0_0= RULE_T_GLUE_BLOCK
            {
            lv_g_0_0=(Token)match(input,RULE_T_GLUE_BLOCK,FOLLOW_RULE_T_GLUE_BLOCK_in_ruleglue_block8141); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTYPE"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4050:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4051:2: (iv_ruleTYPE= ruleTYPE EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4052:2: iv_ruleTYPE= ruleTYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPERule()); 
            }
            pushFollow(FOLLOW_ruleTYPE_in_entryRuleTYPE8182);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPE8193); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4059:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'float2' | kw= 'float3' | kw= 'float4' | kw= 'float' | kw= 'int2' | kw= 'int3' | kw= 'int4' | kw= 'int' | kw= 'bool2' | kw= 'bool3' | kw= 'bool4' | kw= 'bool' | kw= 'sampler' | kw= 'lsampler' | kw= 'fsampler' ) ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4062:28: ( (kw= 'float2' | kw= 'float3' | kw= 'float4' | kw= 'float' | kw= 'int2' | kw= 'int3' | kw= 'int4' | kw= 'int' | kw= 'bool2' | kw= 'bool3' | kw= 'bool4' | kw= 'bool' | kw= 'sampler' | kw= 'lsampler' | kw= 'fsampler' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4063:1: (kw= 'float2' | kw= 'float3' | kw= 'float4' | kw= 'float' | kw= 'int2' | kw= 'int3' | kw= 'int4' | kw= 'int' | kw= 'bool2' | kw= 'bool3' | kw= 'bool4' | kw= 'bool' | kw= 'sampler' | kw= 'lsampler' | kw= 'fsampler' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4063:1: (kw= 'float2' | kw= 'float3' | kw= 'float4' | kw= 'float' | kw= 'int2' | kw= 'int3' | kw= 'int4' | kw= 'int' | kw= 'bool2' | kw= 'bool3' | kw= 'bool4' | kw= 'bool' | kw= 'sampler' | kw= 'lsampler' | kw= 'fsampler' )
            int alt45=15;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt45=1;
                }
                break;
            case 67:
                {
                alt45=2;
                }
                break;
            case 68:
                {
                alt45=3;
                }
                break;
            case 69:
                {
                alt45=4;
                }
                break;
            case 70:
                {
                alt45=5;
                }
                break;
            case 71:
                {
                alt45=6;
                }
                break;
            case 72:
                {
                alt45=7;
                }
                break;
            case 73:
                {
                alt45=8;
                }
                break;
            case 74:
                {
                alt45=9;
                }
                break;
            case 75:
                {
                alt45=10;
                }
                break;
            case 76:
                {
                alt45=11;
                }
                break;
            case 77:
                {
                alt45=12;
                }
                break;
            case 78:
                {
                alt45=13;
                }
                break;
            case 79:
                {
                alt45=14;
                }
                break;
            case 80:
                {
                alt45=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4064:2: kw= 'float2'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleTYPE8231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getFloat2Keyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4071:2: kw= 'float3'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleTYPE8250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getFloat3Keyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4078:2: kw= 'float4'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleTYPE8269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getFloat4Keyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4085:2: kw= 'float'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleTYPE8288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getFloatKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4092:2: kw= 'int2'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleTYPE8307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getInt2Keyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4099:2: kw= 'int3'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleTYPE8326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getInt3Keyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4106:2: kw= 'int4'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleTYPE8345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getInt4Keyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4113:2: kw= 'int'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleTYPE8364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getIntKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4120:2: kw= 'bool2'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleTYPE8383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getBool2Keyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4127:2: kw= 'bool3'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleTYPE8402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getBool3Keyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4134:2: kw= 'bool4'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleTYPE8421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getBool4Keyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4141:2: kw= 'bool'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleTYPE8440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getBoolKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4148:2: kw= 'sampler'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleTYPE8459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getSamplerKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4155:2: kw= 'lsampler'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleTYPE8478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getLsamplerKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4162:2: kw= 'fsampler'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleTYPE8497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTYPEAccess().getFsamplerKeyword_14()); 
                          
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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleBOOLCONSTANT"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4175:1: entryRuleBOOLCONSTANT returns [String current=null] : iv_ruleBOOLCONSTANT= ruleBOOLCONSTANT EOF ;
    public final String entryRuleBOOLCONSTANT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLCONSTANT = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4176:2: (iv_ruleBOOLCONSTANT= ruleBOOLCONSTANT EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4177:2: iv_ruleBOOLCONSTANT= ruleBOOLCONSTANT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLCONSTANTRule()); 
            }
            pushFollow(FOLLOW_ruleBOOLCONSTANT_in_entryRuleBOOLCONSTANT8538);
            iv_ruleBOOLCONSTANT=ruleBOOLCONSTANT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLCONSTANT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLCONSTANT8549); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBOOLCONSTANT"


    // $ANTLR start "ruleBOOLCONSTANT"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4184:1: ruleBOOLCONSTANT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLCONSTANT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4187:28: ( (kw= 'true' | kw= 'false' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4188:1: (kw= 'true' | kw= 'false' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4188:1: (kw= 'true' | kw= 'false' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==81) ) {
                alt46=1;
            }
            else if ( (LA46_0==82) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4189:2: kw= 'true'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleBOOLCONSTANT8587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLCONSTANTAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4196:2: kw= 'false'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleBOOLCONSTANT8606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLCONSTANTAccess().getFalseKeyword_1()); 
                          
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
    // $ANTLR end "ruleBOOLCONSTANT"


    // $ANTLR start "entryRuleRGBA_FIELDS"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4209:1: entryRuleRGBA_FIELDS returns [String current=null] : iv_ruleRGBA_FIELDS= ruleRGBA_FIELDS EOF ;
    public final String entryRuleRGBA_FIELDS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRGBA_FIELDS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4210:2: (iv_ruleRGBA_FIELDS= ruleRGBA_FIELDS EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4211:2: iv_ruleRGBA_FIELDS= ruleRGBA_FIELDS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRGBA_FIELDSRule()); 
            }
            pushFollow(FOLLOW_ruleRGBA_FIELDS_in_entryRuleRGBA_FIELDS8647);
            iv_ruleRGBA_FIELDS=ruleRGBA_FIELDS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRGBA_FIELDS.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGBA_FIELDS8658); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRGBA_FIELDS"


    // $ANTLR start "ruleRGBA_FIELDS"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4218:1: ruleRGBA_FIELDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) ) ;
    public final AntlrDatatypeRuleToken ruleRGBA_FIELDS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_0=null;
        Token this_RFIELD_1=null;
        Token this_RFIELD_2=null;
        Token this_RFIELD_3=null;
        Token this_RFIELD_4=null;
        Token this_DOT_5=null;
        Token this_RFIELD_6=null;
        Token this_RFIELD_7=null;
        Token this_RFIELD_8=null;
        Token this_DOT_9=null;
        Token this_RFIELD_10=null;
        Token this_RFIELD_11=null;
        Token this_DOT_12=null;
        Token this_RFIELD_13=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4221:28: ( ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4222:1: ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4222:1: ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) )
            int alt47=4;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DOT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_RFIELD) ) {
                    int LA47_2 = input.LA(3);

                    if ( (LA47_2==RULE_RFIELD) ) {
                        int LA47_3 = input.LA(4);

                        if ( (LA47_3==EOF||LA47_3==RULE_RIGHT_PAREN||LA47_3==RULE_RIGHT_BRACKET||(LA47_3>=RULE_COMMA && LA47_3<=RULE_DASH)||(LA47_3>=RULE_STAR && LA47_3<=RULE_SEMICOLON)) ) {
                            alt47=3;
                        }
                        else if ( (LA47_3==RULE_RFIELD) ) {
                            int LA47_6 = input.LA(5);

                            if ( (LA47_6==EOF||LA47_6==RULE_RIGHT_PAREN||LA47_6==RULE_RIGHT_BRACKET||(LA47_6>=RULE_COMMA && LA47_6<=RULE_DASH)||(LA47_6>=RULE_STAR && LA47_6<=RULE_SEMICOLON)) ) {
                                alt47=2;
                            }
                            else if ( (LA47_6==RULE_RFIELD) ) {
                                alt47=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA47_2==EOF||LA47_2==RULE_RIGHT_PAREN||LA47_2==RULE_RIGHT_BRACKET||(LA47_2>=RULE_COMMA && LA47_2<=RULE_DASH)||(LA47_2>=RULE_STAR && LA47_2<=RULE_SEMICOLON)) ) {
                        alt47=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4222:2: (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4222:2: (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4222:7: this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD
                    {
                    this_DOT_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_0, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_0_0()); 
                          
                    }
                    this_RFIELD_1=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_1, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_1()); 
                          
                    }
                    this_RFIELD_2=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_2, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_2()); 
                          
                    }
                    this_RFIELD_3=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_3, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_3()); 
                          
                    }
                    this_RFIELD_4=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_4, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_4()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4258:6: (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4258:6: (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4258:11: this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD
                    {
                    this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_5, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_1_0()); 
                          
                    }
                    this_RFIELD_6=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_6, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_1()); 
                          
                    }
                    this_RFIELD_7=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_7, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_2()); 
                          
                    }
                    this_RFIELD_8=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_8, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_3()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4287:6: (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4287:6: (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4287:11: this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD
                    {
                    this_DOT_9=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_9, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_2_0()); 
                          
                    }
                    this_RFIELD_10=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_10, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_1()); 
                          
                    }
                    this_RFIELD_11=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_11, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4309:6: (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4309:6: (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4309:11: this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD
                    {
                    this_DOT_12=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_12, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_3_0()); 
                          
                    }
                    this_RFIELD_13=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_13, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_3_1()); 
                          
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
    // $ANTLR end "ruleRGBA_FIELDS"


    // $ANTLR start "entryRuleIDENTIFIER"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4331:1: entryRuleIDENTIFIER returns [String current=null] : iv_ruleIDENTIFIER= ruleIDENTIFIER EOF ;
    public final String entryRuleIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDENTIFIER = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4332:2: (iv_ruleIDENTIFIER= ruleIDENTIFIER EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4333:2: iv_ruleIDENTIFIER= ruleIDENTIFIER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDENTIFIERRule()); 
            }
            pushFollow(FOLLOW_ruleIDENTIFIER_in_entryRuleIDENTIFIER9030);
            iv_ruleIDENTIFIER=ruleIDENTIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDENTIFIER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDENTIFIER9041); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIDENTIFIER"


    // $ANTLR start "ruleIDENTIFIER"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4340:1: ruleIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DIGIT_2= RULE_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruleIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_LETTER_1=null;
        Token this_DIGIT_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4343:28: ( (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DIGIT_2= RULE_DIGIT )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4344:1: (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DIGIT_2= RULE_DIGIT )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4344:1: (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DIGIT_2= RULE_DIGIT )* )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4344:6: this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DIGIT_2= RULE_DIGIT )*
            {
            this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_RULE_LETTER_in_ruleIDENTIFIER9081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LETTER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LETTER_0, grammarAccess.getIDENTIFIERAccess().getLETTERTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4351:1: (this_LETTER_1= RULE_LETTER | this_DIGIT_2= RULE_DIGIT )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_LETTER) ) {
                    alt48=1;
                }
                else if ( (LA48_0==RULE_DIGIT) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4351:6: this_LETTER_1= RULE_LETTER
            	    {
            	    this_LETTER_1=(Token)match(input,RULE_LETTER,FOLLOW_RULE_LETTER_in_ruleIDENTIFIER9102); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LETTER_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LETTER_1, grammarAccess.getIDENTIFIERAccess().getLETTERTerminalRuleCall_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4359:10: this_DIGIT_2= RULE_DIGIT
            	    {
            	    this_DIGIT_2=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleIDENTIFIER9128); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DIGIT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DIGIT_2, grammarAccess.getIDENTIFIERAccess().getDIGITTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleIDENTIFIER"

    // $ANTLR start synpred7_InternalDecoraDsl
    public final void synpred7_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        EObject lv_e_0_0 = null;

        EObject lv_ae_2_0 = null;

        EObject lv_fs_4_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:2: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:2: ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:3: ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:3: ( (lv_e_0_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:359:1: (lv_e_0_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:359:1: (lv_e_0_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:360:3: lv_e_0_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred7_InternalDecoraDsl717);
        lv_e_0_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_synpred7_InternalDecoraDsl728); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:380:1: ( (lv_ae_2_0= ruleexpression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:381:1: (lv_ae_2_0= ruleexpression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:381:1: (lv_ae_2_0= ruleexpression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:382:3: lv_ae_2_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred7_InternalDecoraDsl748);
        lv_ae_2_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_synpred7_InternalDecoraDsl759); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:402:1: ( (lv_fs_4_0= rulefield_selection ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:403:1: (lv_fs_4_0= rulefield_selection )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:403:1: (lv_fs_4_0= rulefield_selection )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:404:3: lv_fs_4_0= rulefield_selection
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_0_4_0()); 
          	    
        }
        pushFollow(FOLLOW_rulefield_selection_in_synpred7_InternalDecoraDsl779);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:6: ( ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:6: ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:7: ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:421:7: ( (lv_e_5_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:422:1: (lv_e_5_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:422:1: (lv_e_5_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:423:3: lv_e_5_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred8_InternalDecoraDsl808);
        lv_e_5_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_BRACKET_6=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_synpred8_InternalDecoraDsl819); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:443:1: ( (lv_ae_7_0= ruleexpression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:444:1: (lv_ae_7_0= ruleexpression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:444:1: (lv_ae_7_0= ruleexpression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:445:3: lv_ae_7_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getAeExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred8_InternalDecoraDsl839);
        lv_ae_7_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_synpred8_InternalDecoraDsl850); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalDecoraDsl

    // $ANTLR start synpred9_InternalDecoraDsl
    public final void synpred9_InternalDecoraDsl_fragment() throws RecognitionException {   
        EObject lv_e_9_0 = null;

        EObject lv_fs_10_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:6: ( ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:6: ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:7: ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:466:7: ( (lv_e_9_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:467:1: (lv_e_9_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:467:1: (lv_e_9_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:468:3: lv_e_9_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred9_InternalDecoraDsl878);
        lv_e_9_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:484:2: ( (lv_fs_10_0= rulefield_selection ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:485:1: (lv_fs_10_0= rulefield_selection )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:485:1: (lv_fs_10_0= rulefield_selection )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:486:3: lv_fs_10_0= rulefield_selection
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getFsField_selectionParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulefield_selection_in_synpred9_InternalDecoraDsl899);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:6: ( ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:6: ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:7: ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:503:7: ( (lv_e_11_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:504:1: (lv_e_11_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:504:1: (lv_e_11_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:505:3: lv_e_11_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_3_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred10_InternalDecoraDsl928);
        lv_e_11_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_INC_12=(Token)match(input,RULE_INC,FOLLOW_RULE_INC_in_synpred10_InternalDecoraDsl939); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDecoraDsl

    // $ANTLR start synpred11_InternalDecoraDsl
    public final void synpred11_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_DEC_14=null;
        EObject lv_e_13_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:6: ( ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:6: ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:7: ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:526:7: ( (lv_e_13_0= ruleprimary_or_call ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:527:1: (lv_e_13_0= ruleprimary_or_call )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:527:1: (lv_e_13_0= ruleprimary_or_call )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:528:3: lv_e_13_0= ruleprimary_or_call
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostfix_expressionAccess().getEPrimary_or_callParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleprimary_or_call_in_synpred11_InternalDecoraDsl967);
        lv_e_13_0=ruleprimary_or_call();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_DEC_14=(Token)match(input,RULE_DEC,FOLLOW_RULE_DEC_in_synpred11_InternalDecoraDsl978); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDecoraDsl

    // $ANTLR start synpred21_InternalDecoraDsl
    public final void synpred21_InternalDecoraDsl_fragment() throws RecognitionException {   
        Token this_STAR_1=null;
        EObject lv_b_2_0 = null;


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:3: ( (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:3: (this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:931:4: this_STAR_1= RULE_STAR ( (lv_b_2_0= rulemultiplicative_expression ) )
        {
        this_STAR_1=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_synpred21_InternalDecoraDsl1730); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:935:1: ( (lv_b_2_0= rulemultiplicative_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:936:1: (lv_b_2_0= rulemultiplicative_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:936:1: (lv_b_2_0= rulemultiplicative_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:937:3: lv_b_2_0= rulemultiplicative_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemultiplicative_expression_in_synpred21_InternalDecoraDsl1750);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:6: ( (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:6: (this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:954:7: this_SLASH_3= RULE_SLASH ( (lv_b_4_0= rulemultiplicative_expression ) )
        {
        this_SLASH_3=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_synpred22_InternalDecoraDsl1769); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:958:1: ( (lv_b_4_0= rulemultiplicative_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:959:1: (lv_b_4_0= rulemultiplicative_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:959:1: (lv_b_4_0= rulemultiplicative_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:960:3: lv_b_4_0= rulemultiplicative_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getBMultiplicative_expressionParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemultiplicative_expression_in_synpred22_InternalDecoraDsl1789);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:2: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:2: ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:3: ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1594:3: ( (lv_a_0_0= ruleunary_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1595:1: (lv_a_0_0= ruleunary_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1595:1: (lv_a_0_0= ruleunary_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1596:3: lv_a_0_0= ruleunary_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getAUnary_expressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleunary_expression_in_synpred35_InternalDecoraDsl3092);
        lv_a_0_0=ruleunary_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1612:2: ( (lv_op_1_0= ruleassignment_operator ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1613:1: (lv_op_1_0= ruleassignment_operator )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1613:1: (lv_op_1_0= ruleassignment_operator )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1614:3: lv_op_1_0= ruleassignment_operator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getOpAssignment_operatorParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_operator_in_synpred35_InternalDecoraDsl3113);
        lv_op_1_0=ruleassignment_operator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1630:2: ( (lv_b_2_0= ruleassignment_expression ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1631:1: (lv_b_2_0= ruleassignment_expression )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1631:1: (lv_b_2_0= ruleassignment_expression )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1632:3: lv_b_2_0= ruleassignment_expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignment_expressionAccess().getBAssignment_expressionParserRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_expression_in_synpred35_InternalDecoraDsl3134);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:2: ( ( (lv_d_0_0= ruledeclaration_statement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:2: ( (lv_d_0_0= ruledeclaration_statement ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2710:2: ( (lv_d_0_0= ruledeclaration_statement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2711:1: (lv_d_0_0= ruledeclaration_statement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2711:1: (lv_d_0_0= ruledeclaration_statement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2712:3: lv_d_0_0= ruledeclaration_statement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSimple_statementAccess().getDDeclaration_statementParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruledeclaration_statement_in_synpred54_InternalDecoraDsl5530);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2729:6: ( ( (lv_e_1_0= ruleexpression_statement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2729:6: ( (lv_e_1_0= ruleexpression_statement ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2729:6: ( (lv_e_1_0= ruleexpression_statement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2730:1: (lv_e_1_0= ruleexpression_statement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2730:1: (lv_e_1_0= ruleexpression_statement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:2731:3: lv_e_1_0= ruleexpression_statement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSimple_statementAccess().getEExpression_statementParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_statement_in_synpred55_InternalDecoraDsl5557);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3139:3: (this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3139:3: this_ELSE_5= RULE_ELSE ( (lv_b_6_0= rulestatement ) )
        {
        this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_synpred62_InternalDecoraDsl6386); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3143:1: ( (lv_b_6_0= rulestatement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3144:1: (lv_b_6_0= rulestatement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3144:1: (lv_b_6_0= rulestatement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3145:3: lv_b_6_0= rulestatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSelection_statementAccess().getBStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred62_InternalDecoraDsl6406);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:2: ( ( (lv_e_0_0= ruleexpression_statement ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:2: ( (lv_e_0_0= ruleexpression_statement ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3572:2: ( (lv_e_0_0= ruleexpression_statement ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3573:1: (lv_e_0_0= ruleexpression_statement )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3573:1: (lv_e_0_0= ruleexpression_statement )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3574:3: lv_e_0_0= ruleexpression_statement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_init_statementAccess().getEExpression_statementParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_statement_in_synpred66_InternalDecoraDsl7213);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:2: ( ( (lv_f_0_0= rulefunction_definition ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:2: ( (lv_f_0_0= rulefunction_definition ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3890:2: ( (lv_f_0_0= rulefunction_definition ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3891:1: (lv_f_0_0= rulefunction_definition )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3891:1: (lv_f_0_0= rulefunction_definition )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3892:3: lv_f_0_0= rulefunction_definition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getFFunction_definitionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulefunction_definition_in_synpred75_InternalDecoraDsl7887);
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


        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3909:6: ( ( (lv_d_1_0= ruledeclaration ) ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3909:6: ( (lv_d_1_0= ruledeclaration ) )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3909:6: ( (lv_d_1_0= ruledeclaration ) )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3910:1: (lv_d_1_0= ruledeclaration )
        {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3910:1: (lv_d_1_0= ruledeclaration )
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:3911:3: lv_d_1_0= ruledeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExternal_declarationAccess().getDDeclarationParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruledeclaration_in_synpred76_InternalDecoraDsl7914);
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\2\2\uffff\2\2";
    static final String DFA3_minS =
        "\1\5\1\4\2\uffff\2\4";
    static final String DFA3_maxS =
        "\1\122\1\65\2\uffff\2\65";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\2\34\uffff\1\3\17\uffff\1\1\15\uffff\17\3\2\2",
            "\1\2\2\uffff\1\3\10\2\1\uffff\23\2\16\uffff\1\2\1\uffff\1\4"+
            "\1\5",
            "",
            "",
            "\1\2\2\uffff\1\3\10\2\1\uffff\23\2\16\uffff\1\2\1\uffff\1\4"+
            "\1\5",
            "\1\2\2\uffff\1\3\10\2\1\uffff\23\2\16\uffff\1\2\1\uffff\1\4"+
            "\1\5"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "300:1: ( ( (lv_e_0_0= ruleprimary_expression ) ) | ( (lv_f_1_0= rulefunction_call ) ) )";
        }
    }
    static final String DFA4_eotS =
        "\35\uffff";
    static final String DFA4_eofS =
        "\35\uffff";
    static final String DFA4_minS =
        "\1\5\26\0\6\uffff";
    static final String DFA4_maxS =
        "\1\122\26\0\6\uffff";
    static final String DFA4_acceptS =
        "\27\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\3\1\6\34\uffff\1\26\17\uffff\1\1\15\uffff\1\7\1\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\4\1\5",
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
            return "358:1: ( ( ( (lv_e_0_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_ae_2_0= ruleexpression ) ) this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ( (lv_fs_4_0= rulefield_selection ) ) ) | ( ( (lv_e_5_0= ruleprimary_or_call ) ) this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_ae_7_0= ruleexpression ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) | ( ( (lv_e_9_0= ruleprimary_or_call ) ) ( (lv_fs_10_0= rulefield_selection ) ) ) | ( ( (lv_e_11_0= ruleprimary_or_call ) ) this_INC_12= RULE_INC ) | ( ( (lv_e_13_0= ruleprimary_or_call ) ) this_DEC_14= RULE_DEC ) | ( (lv_e_15_0= ruleprimary_or_call ) ) )";
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
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA4_15 = input.LA(1);

                         
                        int index4_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA4_16 = input.LA(1);

                         
                        int index4_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA4_17 = input.LA(1);

                         
                        int index4_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA4_18 = input.LA(1);

                         
                        int index4_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA4_19 = input.LA(1);

                         
                        int index4_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA4_21 = input.LA(1);

                         
                        int index4_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA4_22 = input.LA(1);

                         
                        int index4_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred8_InternalDecoraDsl()) ) {s = 24;}

                        else if ( (synpred9_InternalDecoraDsl()) ) {s = 25;}

                        else if ( (synpred10_InternalDecoraDsl()) ) {s = 26;}

                        else if ( (synpred11_InternalDecoraDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index4_22);
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
        "\36\uffff";
    static final String DFA18_eofS =
        "\36\uffff";
    static final String DFA18_minS =
        "\1\5\33\0\2\uffff";
    static final String DFA18_maxS =
        "\1\122\33\0\2\uffff";
    static final String DFA18_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\3\1\6\3\uffff\1\27\1\30\1\uffff\1\31\1\32\1\33\23\uffff"+
            "\1\26\17\uffff\1\1\15\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\4\1\5",
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
            return "1594:1: ( ( ( (lv_a_0_0= ruleunary_expression ) ) ( (lv_op_1_0= ruleassignment_operator ) ) ( (lv_b_2_0= ruleassignment_expression ) ) ) | ( (lv_c_3_0= ruleconditional_expression ) ) )";
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
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_13 = input.LA(1);

                         
                        int index18_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_14 = input.LA(1);

                         
                        int index18_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA18_16 = input.LA(1);

                         
                        int index18_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA18_17 = input.LA(1);

                         
                        int index18_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA18_18 = input.LA(1);

                         
                        int index18_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA18_19 = input.LA(1);

                         
                        int index18_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA18_20 = input.LA(1);

                         
                        int index18_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA18_21 = input.LA(1);

                         
                        int index18_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA18_22 = input.LA(1);

                         
                        int index18_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA18_23 = input.LA(1);

                         
                        int index18_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA18_24 = input.LA(1);

                         
                        int index18_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA18_25 = input.LA(1);

                         
                        int index18_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA18_26 = input.LA(1);

                         
                        int index18_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA18_27 = input.LA(1);

                         
                        int index18_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalDecoraDsl()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_27);
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
        "\53\uffff";
    static final String DFA31_eofS =
        "\53\uffff";
    static final String DFA31_minS =
        "\1\5\5\uffff\20\0\25\uffff";
    static final String DFA31_maxS =
        "\1\122\5\uffff\20\0\25\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\13\uffff\1\3\1\4\3\uffff\1\5\3\uffff";
    static final String DFA31_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\25\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\26\3\uffff\2\26\1\uffff\3\26\22\uffff\1\26\1\25\2\uffff\1"+
            "\42\1\uffff\4\43\4\47\3\uffff\1\26\10\uffff\5\1\1\6\1\7\1\10"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\2\26",
            "",
            "",
            "",
            "",
            "",
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
            "\1\uffff",
            "\1\uffff",
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
            return "2710:1: ( ( (lv_d_0_0= ruledeclaration_statement ) ) | ( (lv_e_1_0= ruleexpression_statement ) ) | ( (lv_s_2_0= ruleselection_statement ) ) | ( (lv_i_3_0= ruleiteration_statement ) ) | ( (lv_j_4_0= rulejump_statement ) ) )";
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

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (synpred55_InternalDecoraDsl()) ) {s = 22;}

                         
                        input.seek(index31_21);
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
        "\42\uffff";
    static final String DFA38_eofS =
        "\42\uffff";
    static final String DFA38_minS =
        "\1\5\7\uffff\20\0\12\uffff";
    static final String DFA38_maxS =
        "\1\122\7\uffff\20\0\12\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\4\uffff";
    static final String DFA38_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\12\uffff}>";
    static final String[] DFA38_transitionS = {
            "\3\1\3\uffff\2\1\1\uffff\3\1\22\uffff\1\1\1\27\17\uffff\1\1"+
            "\10\uffff\5\35\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\uffff",
            "\1\uffff",
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
            return "3572:1: ( ( (lv_e_0_0= ruleexpression_statement ) ) | ( (lv_d_1_0= ruledeclaration_statement ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_11 = input.LA(1);

                         
                        int index38_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_12 = input.LA(1);

                         
                        int index38_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_13 = input.LA(1);

                         
                        int index38_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_14 = input.LA(1);

                         
                        int index38_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_15 = input.LA(1);

                         
                        int index38_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_16 = input.LA(1);

                         
                        int index38_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA38_17 = input.LA(1);

                         
                        int index38_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_17);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA38_18 = input.LA(1);

                         
                        int index38_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_18);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA38_19 = input.LA(1);

                         
                        int index38_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_19);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA38_20 = input.LA(1);

                         
                        int index38_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA38_21 = input.LA(1);

                         
                        int index38_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_21);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA38_22 = input.LA(1);

                         
                        int index38_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_22);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA38_23 = input.LA(1);

                         
                        int index38_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalDecoraDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index38_23);
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
        "\30\uffff";
    static final String DFA44_eofS =
        "\30\uffff";
    static final String DFA44_minS =
        "\1\44\20\0\7\uffff";
    static final String DFA44_maxS =
        "\1\120\20\0\7\uffff";
    static final String DFA44_acceptS =
        "\21\uffff\1\2\4\uffff\1\3\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\7\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\20\14\uffff\1\26\13\uffff\5\21\1\1\1\2\1\3\1\4\1\5\1\6\1"+
            "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
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
            "\1\uffff",
            "\1\uffff",
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
            return "3890:1: ( ( (lv_f_0_0= rulefunction_definition ) ) | ( (lv_d_1_0= ruledeclaration ) ) | ( (lv_g_2_0= ruleglue_block ) ) )";
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
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_4 = input.LA(1);

                         
                        int index44_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA44_16 = input.LA(1);

                         
                        int index44_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalDecoraDsl()) ) {s = 23;}

                        else if ( (synpred76_InternalDecoraDsl()) ) {s = 17;}

                         
                        input.seek(index44_16);
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
    public static final BitSet FOLLOW_ruleRGBA_FIELDS_in_rulefield_selection227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XYZW_FIELDS_in_rulefield_selection250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_expression_in_entryRuleprimary_expression291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprimary_expression301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleprimary_expression358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleprimary_expression388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATCONSTANT_in_ruleprimary_expression418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLCONSTANT_in_ruleprimary_expression456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleprimary_expression474 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_ruleprimary_expression494 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleprimary_expression505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_entryRuleprimary_or_call541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprimary_or_call551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_expression_in_ruleprimary_or_call597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_call_in_ruleprimary_or_call624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfix_expression_in_entryRulepostfix_expression660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfix_expression670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression717 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression728 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_rulepostfix_expression748 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression759 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_rulefield_selection_in_rulepostfix_expression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression808 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rulepostfix_expression819 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_rulepostfix_expression839 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rulepostfix_expression850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression878 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_rulefield_selection_in_rulepostfix_expression899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression928 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INC_in_rulepostfix_expression939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression967 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_DEC_in_rulepostfix_expression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_rulepostfix_expression1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_call_in_entryRulefunction_call1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_call1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulefunction_call1098 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1109 = new BitSet(new long[]{0x001000100001D9E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefunction_call1169 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_rulefunction_call1180 = new BitSet(new long[]{0x001000100001D9E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulefunction_call_parameter_list_in_rulefunction_call1200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_call1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_call_parameter_list_in_entryRulefunction_call_parameter_list1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_call_parameter_list1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1304 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulefunction_call_parameter_list1316 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleassignment_expression_in_rulefunction_call_parameter_list1336 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_entryRuleunary_expression1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_expression1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfix_expression_in_ruleunary_expression1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INC_in_ruleunary_expression1448 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_in_ruleunary_expression1487 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleunary_expression1526 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleunary_expression1565 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BANG_in_ruleunary_expression1604 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleunary_expression1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_entryRulemultiplicative_expression1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplicative_expression1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_rulemultiplicative_expression1717 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_RULE_STAR_in_rulemultiplicative_expression1730 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1750 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_rulemultiplicative_expression1769 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_rulemultiplicative_expression1789 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_entryRuleadditive_expression1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadditive_expression1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1884 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleadditive_expression1897 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1917 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleadditive_expression1936 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_ruleadditive_expression1956 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rulerelational_expression_in_entryRulerelational_expression1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelational_expression2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2051 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_RULE_LTEQ_in_rulerelational_expression2064 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2084 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_RULE_GTEQ_in_rulerelational_expression2103 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2123 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_RULE_LT_in_rulerelational_expression2142 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2162 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_RULE_GT_in_rulerelational_expression2181 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleadditive_expression_in_rulerelational_expression2201 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_ruleequality_expression_in_entryRuleequality_expression2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleequality_expression2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelational_expression_in_ruleequality_expression2296 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_RULE_EQEQ_in_ruleequality_expression2309 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulerelational_expression_in_ruleequality_expression2329 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_RULE_NEQ_in_ruleequality_expression2348 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulerelational_expression_in_ruleequality_expression2368 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rulelogical_and_expression_in_entryRulelogical_and_expression2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_and_expression2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleequality_expression_in_rulelogical_and_expression2463 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rulelogical_and_expression2475 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleequality_expression_in_rulelogical_and_expression2495 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rulelogical_xor_expression_in_entryRulelogical_xor_expression2533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_xor_expression2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2589 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_XOR_in_rulelogical_xor_expression2601 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulelogical_and_expression_in_rulelogical_xor_expression2621 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulelogical_or_expression_in_entryRulelogical_or_expression2659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_or_expression2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2715 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rulelogical_or_expression2727 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulelogical_xor_expression_in_rulelogical_or_expression2747 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleternary_part_in_entryRuleternary_part2785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleternary_part2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleternary_part2831 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_ruleternary_part2855 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleternary_part2865 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleternary_part2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_expression_in_entryRuleconditional_expression2921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_expression2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_or_expression_in_ruleconditional_expression2977 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleternary_part_in_ruleconditional_expression2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_entryRuleassignment_expression3035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_expression3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_ruleassignment_expression3092 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleassignment_operator_in_ruleassignment_expression3113 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleassignment_expression3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_expression_in_ruleassignment_expression3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_operator_in_entryRuleassignment_operator3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_operator3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleassignment_operator3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAREQ_in_ruleassignment_operator3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASHEQ_in_ruleassignment_operator3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUSEQ_in_ruleassignment_operator3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASHEQ_in_ruleassignment_operator3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression3399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleexpression3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_prototype_in_entryRulefunction_prototype3489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_prototype3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefunction_prototype3545 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulefunction_prototype3566 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_rulefunction_prototype3577 = new BitSet(new long[]{0x00100010000001E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleparameter_declaration_list_in_rulefunction_prototype3597 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_rulefunction_prototype3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_declaration_in_entryRuleparameter_declaration3644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_declaration3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruleparameter_declaration3700 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleparameter_declaration3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_declaration_list_in_entryRuleparameter_declaration_list3757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_declaration_list3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3813 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleparameter_declaration_list3825 = new BitSet(new long[]{0x00100010000000E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleparameter_declaration_in_ruleparameter_declaration_list3845 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruledeclaration_identifier_and_init_in_entryRuledeclaration_identifier_and_init3883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_identifier_and_init3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruledeclaration_identifier_and_init3939 = new BitSet(new long[]{0x0000000040000202L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruledeclaration_identifier_and_init3951 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleconstant_expression_in_ruledeclaration_identifier_and_init3971 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruledeclaration_identifier_and_init3982 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruledeclaration_identifier_and_init3995 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleinitializer_in_ruledeclaration_identifier_and_init4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesingle_declaration_in_entryRulesingle_declaration4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesingle_declaration4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefully_specified_type_in_rulesingle_declaration4109 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruledeclaration_identifier_and_init_in_rulesingle_declaration4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration4166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesingle_declaration_in_ruledeclaration4222 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruledeclaration4234 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruledeclaration_identifier_and_init_in_ruledeclaration4254 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruledeclaration4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefully_specified_type_in_entryRulefully_specified_type4302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefully_specified_type4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_qualifier_in_rulefully_specified_type4359 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruletype_precision_in_rulefully_specified_type4380 = new BitSet(new long[]{0x00100010000000E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_qualifier_in_rulefully_specified_type4430 = new BitSet(new long[]{0x00100010000000E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_precision_in_rulefully_specified_type4480 = new BitSet(new long[]{0x00100010000000E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulefully_specified_type4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_qualifier_in_entryRuletype_qualifier4566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_qualifier4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruletype_qualifier4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruletype_qualifier4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_precision_in_entryRuletype_precision4675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_precision4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruletype_precision4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruletype_precision4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruletype_precision4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier4802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_nonarray_in_ruletype_specifier4868 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rulearray_brackets_in_ruletype_specifier4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_brackets_in_entryRulearray_brackets4930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_brackets4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rulearray_brackets4976 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleconstant_expression_in_rulearray_brackets5000 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rulearray_brackets5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_nonarray_in_entryRuletype_specifier_nonarray5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier_nonarray5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruletype_specifier_nonarray5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VOID_in_ruletype_specifier_nonarray5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinitializer_in_entryRuleinitializer5175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinitializer5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_expression_in_ruleinitializer5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_entryRuledeclaration_statement5265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_statement5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_ruledeclaration_statement5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestatement5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement5474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_rulesimple_statement5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_rulesimple_statement5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselection_statement_in_rulesimple_statement5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleiteration_statement_in_rulesimple_statement5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejump_statement_in_rulesimple_statement5638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement5674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement5732 = new BitSet(new long[]{0xE011FEF80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_in_rulecompound_statement5752 = new BitSet(new long[]{0xE011FEF80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_entryRulestatement_no_new_scope5799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_no_new_scope5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_no_new_scope_in_rulestatement_no_new_scope5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement_no_new_scope5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_no_new_scope_in_entryRulecompound_statement_no_new_scope5918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement_no_new_scope5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_rulecompound_statement_no_new_scope5976 = new BitSet(new long[]{0xE011FEF80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_in_rulecompound_statement_no_new_scope5996 = new BitSet(new long[]{0xE011FEF80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_rulecompound_statement_no_new_scope6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_entryRuleexpression_statement6043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_statement6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_statement6130 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleexpression_statement6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression6177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_expression6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_expression_in_ruleconstant_expression6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselection_statement_in_entryRuleselection_statement6267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselection_statement6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleselection_statement6313 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleselection_statement6323 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_ruleselection_statement6343 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleselection_statement6354 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_in_ruleselection_statement6374 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleselection_statement6386 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_in_ruleselection_statement6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecondition_in_entryRulecondition6444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecondition6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecondition6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleiteration_statement_in_entryRuleiteration_statement6534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleiteration_statement6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleiteration_statement6581 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6591 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulecondition_in_ruleiteration_statement6611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6622 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_in_ruleiteration_statement6661 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_in_ruleiteration_statement6681 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleiteration_statement6692 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6702 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_ruleiteration_statement6722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6733 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleiteration_statement6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunroll_modifier_in_ruleiteration_statement6771 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_FOR_in_ruleiteration_statement6782 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6792 = new BitSet(new long[]{0xE01000180001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulefor_init_statement_in_ruleiteration_statement6812 = new BitSet(new long[]{0x001000180001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6833 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6844 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_ruleiteration_statement6883 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleiteration_statement6893 = new BitSet(new long[]{0xE01000180001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulefor_init_statement_in_ruleiteration_statement6913 = new BitSet(new long[]{0x001000180001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulefor_rest_statement_in_ruleiteration_statement6934 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleiteration_statement6945 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_no_new_scope_in_ruleiteration_statement6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunroll_modifier_in_entryRuleunroll_modifier7002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunroll_modifier7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNROLL_in_ruleunroll_modifier7048 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LEFT_PAREN_in_ruleunroll_modifier7058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7074 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleunroll_modifier7090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleunroll_modifier7106 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RIGHT_PAREN_in_ruleunroll_modifier7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_init_statement_in_entryRulefor_init_statement7157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_init_statement7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_rulefor_init_statement7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_rulefor_init_statement7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_rest_statement_in_entryRulefor_rest_statement7276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_rest_statement7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecondition_in_rulefor_rest_statement7345 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7356 = new BitSet(new long[]{0x001000100001D8E2L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_rest_statement7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulefor_rest_statement7408 = new BitSet(new long[]{0x001000100001D8E2L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_rest_statement7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejump_statement_in_entryRulejump_statement7466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejump_statement7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONTINUE_in_rulejump_statement7525 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BREAK_in_rulejump_statement7565 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCARD_in_rulejump_statement7605 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_rulejump_statement7645 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_rulejump_statement7673 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_rulejump_statement7693 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulejump_statement7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletranslation_unit_in_entryRuletranslation_unit7740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletranslation_unit7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexternal_declaration_in_ruletranslation_unit7795 = new BitSet(new long[]{0xE0120010000000E2L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ruleexternal_declaration_in_entryRuleexternal_declaration7831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexternal_declaration7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_definition_in_ruleexternal_declaration7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_ruleexternal_declaration7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglue_block_in_ruleexternal_declaration7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_definition_in_entryRulefunction_definition7977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_definition7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_prototype_in_rulefunction_definition8033 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rulecompound_statement_no_new_scope_in_rulefunction_definition8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglue_block_in_entryRuleglue_block8090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglue_block8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_T_GLUE_BLOCK_in_ruleglue_block8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_entryRuleTYPE8182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPE8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTYPE8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleTYPE8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTYPE8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTYPE8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTYPE8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTYPE8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTYPE8345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTYPE8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTYPE8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTYPE8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTYPE8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTYPE8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTYPE8459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTYPE8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTYPE8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLCONSTANT_in_entryRuleBOOLCONSTANT8538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLCONSTANT8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleBOOLCONSTANT8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBOOLCONSTANT8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBA_FIELDS_in_entryRuleRGBA_FIELDS8647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGBA_FIELDS8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8699 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8719 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8739 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8759 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8807 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8827 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8847 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8895 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8915 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS8963 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_entryRuleIDENTIFIER9030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDENTIFIER9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LETTER_in_ruleIDENTIFIER9081 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_RULE_LETTER_in_ruleIDENTIFIER9102 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleIDENTIFIER9128 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred7_InternalDecoraDsl717 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_synpred7_InternalDecoraDsl728 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_synpred7_InternalDecoraDsl748 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_synpred7_InternalDecoraDsl759 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_rulefield_selection_in_synpred7_InternalDecoraDsl779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred8_InternalDecoraDsl808 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_synpred8_InternalDecoraDsl819 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleexpression_in_synpred8_InternalDecoraDsl839 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_synpred8_InternalDecoraDsl850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred9_InternalDecoraDsl878 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_rulefield_selection_in_synpred9_InternalDecoraDsl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred10_InternalDecoraDsl928 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INC_in_synpred10_InternalDecoraDsl939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprimary_or_call_in_synpred11_InternalDecoraDsl967 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_DEC_in_synpred11_InternalDecoraDsl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_synpred21_InternalDecoraDsl1730 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_synpred21_InternalDecoraDsl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_synpred22_InternalDecoraDsl1769 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_rulemultiplicative_expression_in_synpred22_InternalDecoraDsl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expression_in_synpred35_InternalDecoraDsl3092 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleassignment_operator_in_synpred35_InternalDecoraDsl3113 = new BitSet(new long[]{0x001000100001D8E0L,0x000000000007FFFCL});
    public static final BitSet FOLLOW_ruleassignment_expression_in_synpred35_InternalDecoraDsl3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_statement_in_synpred54_InternalDecoraDsl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_synpred55_InternalDecoraDsl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_synpred62_InternalDecoraDsl6386 = new BitSet(new long[]{0xE011FEB80001D8E0L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_rulestatement_in_synpred62_InternalDecoraDsl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_statement_in_synpred66_InternalDecoraDsl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_definition_in_synpred75_InternalDecoraDsl7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_synpred76_InternalDecoraDsl7914 = new BitSet(new long[]{0x0000000000000002L});

}