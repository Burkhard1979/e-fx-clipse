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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_XYZW_FIELDS", "RULE_DOT", "RULE_RFIELD", "RULE_XFIELD", "RULE_LETTER", "RULE_DIGIT", "RULE_INTCONSTANT", "RULE_FLOATCONSTANT", "RULE_WS", "RULE_COMMENT", "RULE_LINE_COMMENT", "RULE_LEFT_FRENCH", "RULE_RIGHT_FRENCH", "RULE_T_GLUE_BLOCK", "RULE_STAR", "RULE_SLASH", "RULE_PLUS", "RULE_DASH", "RULE_LT", "RULE_GT", "RULE_LTEQ", "RULE_GTEQ", "RULE_EQEQ", "RULE_NEQ", "RULE_AND", "RULE_XOR", "RULE_OR", "RULE_INC", "RULE_DEC", "RULE_STAREQ", "RULE_SLASHEQ", "RULE_PLUSEQ", "RULE_DASHEQ", "RULE_LEFT_PAREN", "RULE_RIGHT_PAREN", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_COMMA", "RULE_EQUAL", "RULE_BANG", "RULE_TILDE", "RULE_QUESTION", "RULE_COLON", "RULE_SEMICOLON", "RULE_IF", "RULE_ELSE", "RULE_WHILE", "RULE_DO", "RULE_FOR", "RULE_UNROLL", "RULE_CONTINUE", "RULE_BREAK", "RULE_DISCARD", "RULE_RETURN", "RULE_VOID"
    };
    public static final int RULE_TILDE=46;
    public static final int RULE_XYZW_FIELDS=4;
    public static final int RULE_LTEQ=24;
    public static final int RULE_DISCARD=58;
    public static final int RULE_DO=53;
    public static final int RULE_SEMICOLON=49;
    public static final int RULE_PLUSEQ=35;
    public static final int RULE_RETURN=59;
    public static final int RULE_FOR=54;
    public static final int RULE_OR=30;
    public static final int RULE_AND=28;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=15;
    public static final int RULE_LT=22;
    public static final int RULE_DASHEQ=36;
    public static final int RULE_WHILE=52;
    public static final int RULE_GTEQ=25;
    public static final int RULE_DOT=5;
    public static final int RULE_LEFT_PAREN=37;
    public static final int RULE_GT=23;
    public static final int RULE_RFIELD=6;
    public static final int RULE_SLASHEQ=34;
    public static final int RULE_INC=31;
    public static final int RULE_T_GLUE_BLOCK=17;
    public static final int RULE_FLOATCONSTANT=11;
    public static final int RULE_STAREQ=33;
    public static final int RULE_LEFT_BRACE=41;
    public static final int RULE_BANG=45;
    public static final int RULE_DEC=32;
    public static final int RULE_CONTINUE=56;
    public static final int RULE_XOR=29;
    public static final int RULE_PLUS=20;
    public static final int RULE_UNROLL=55;
    public static final int RULE_COMMA=43;
    public static final int RULE_EQUAL=44;
    public static final int RULE_COMMENT=13;
    public static final int RULE_RIGHT_FRENCH=16;
    public static final int RULE_LETTER=8;
    public static final int RULE_COLON=48;
    public static final int RULE_INTCONSTANT=10;
    public static final int RULE_STAR=18;
    public static final int RULE_EQEQ=26;
    public static final int RULE_VOID=60;
    public static final int RULE_RIGHT_BRACKET=40;
    public static final int RULE_NEQ=27;
    public static final int RULE_RIGHT_PAREN=38;
    public static final int RULE_LINE_COMMENT=14;
    public static final int RULE_RIGHT_BRACE=42;
    public static final int RULE_LEFT_BRACKET=39;
    public static final int RULE_SLASH=19;
    public static final int RULE_WS=12;
    public static final int RULE_XFIELD=7;
    public static final int RULE_DIGIT=9;
    public static final int RULE_IF=50;
    public static final int RULE_BREAK=57;
    public static final int RULE_ELSE=51;
    public static final int RULE_DASH=21;
    public static final int RULE_QUESTION=47;

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
        	return "field_selection";	
       	}
       	
       	@Override
       	protected DecoraDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulefield_selection"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:73:1: entryRulefield_selection returns [EObject current=null] : iv_rulefield_selection= rulefield_selection EOF ;
    public final EObject entryRulefield_selection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_selection = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:74:2: (iv_rulefield_selection= rulefield_selection EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:75:2: iv_rulefield_selection= rulefield_selection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_selectionRule()); 
            }
            pushFollow(FOLLOW_rulefield_selection_in_entryRulefield_selection81);
            iv_rulefield_selection=rulefield_selection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_selection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_selection91); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:82:1: rulefield_selection returns [EObject current=null] : ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) ) ;
    public final EObject rulefield_selection() throws RecognitionException {
        EObject current = null;

        Token lv_x_1_0=null;
        AntlrDatatypeRuleToken lv_r_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:85:28: ( ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:86:1: ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:86:1: ( ( (lv_r_0_0= ruleRGBA_FIELDS ) ) | ( (lv_x_1_0= RULE_XYZW_FIELDS ) ) )
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:86:2: ( (lv_r_0_0= ruleRGBA_FIELDS ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:86:2: ( (lv_r_0_0= ruleRGBA_FIELDS ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:87:1: (lv_r_0_0= ruleRGBA_FIELDS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:87:1: (lv_r_0_0= ruleRGBA_FIELDS )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:88:3: lv_r_0_0= ruleRGBA_FIELDS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_selectionAccess().getRRGBA_FIELDSParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRGBA_FIELDS_in_rulefield_selection137);
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:105:6: ( (lv_x_1_0= RULE_XYZW_FIELDS ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:105:6: ( (lv_x_1_0= RULE_XYZW_FIELDS ) )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:106:1: (lv_x_1_0= RULE_XYZW_FIELDS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:106:1: (lv_x_1_0= RULE_XYZW_FIELDS )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:107:3: lv_x_1_0= RULE_XYZW_FIELDS
                    {
                    lv_x_1_0=(Token)match(input,RULE_XYZW_FIELDS,FOLLOW_RULE_XYZW_FIELDS_in_rulefield_selection160); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRGBA_FIELDS"
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:135:1: entryRuleRGBA_FIELDS returns [String current=null] : iv_ruleRGBA_FIELDS= ruleRGBA_FIELDS EOF ;
    public final String entryRuleRGBA_FIELDS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRGBA_FIELDS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:136:2: (iv_ruleRGBA_FIELDS= ruleRGBA_FIELDS EOF )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:137:2: iv_ruleRGBA_FIELDS= ruleRGBA_FIELDS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRGBA_FIELDSRule()); 
            }
            pushFollow(FOLLOW_ruleRGBA_FIELDS_in_entryRuleRGBA_FIELDS206);
            iv_ruleRGBA_FIELDS=ruleRGBA_FIELDS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRGBA_FIELDS.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGBA_FIELDS217); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:144:1: ruleRGBA_FIELDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:147:28: ( ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:148:1: ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:148:1: ( (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD ) | (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD ) | (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD ) | (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_RFIELD) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_RFIELD) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==RULE_RFIELD) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==EOF) ) {
                                alt2=2;
                            }
                            else if ( (LA2_5==RULE_RFIELD) ) {
                                alt2=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA2_3==EOF) ) {
                            alt2=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_2==EOF) ) {
                        alt2=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:148:2: (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:148:2: (this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:148:7: this_DOT_0= RULE_DOT this_RFIELD_1= RULE_RFIELD this_RFIELD_2= RULE_RFIELD this_RFIELD_3= RULE_RFIELD this_RFIELD_4= RULE_RFIELD
                    {
                    this_DOT_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_0, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_0_0()); 
                          
                    }
                    this_RFIELD_1=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_1, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_1()); 
                          
                    }
                    this_RFIELD_2=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_2, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_2()); 
                          
                    }
                    this_RFIELD_3=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_3, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_3()); 
                          
                    }
                    this_RFIELD_4=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS338); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:184:6: (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:184:6: (this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:184:11: this_DOT_5= RULE_DOT this_RFIELD_6= RULE_RFIELD this_RFIELD_7= RULE_RFIELD this_RFIELD_8= RULE_RFIELD
                    {
                    this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_5, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_1_0()); 
                          
                    }
                    this_RFIELD_6=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_6, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_1()); 
                          
                    }
                    this_RFIELD_7=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_7, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_2()); 
                          
                    }
                    this_RFIELD_8=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS426); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:213:6: (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:213:6: (this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:213:11: this_DOT_9= RULE_DOT this_RFIELD_10= RULE_RFIELD this_RFIELD_11= RULE_RFIELD
                    {
                    this_DOT_9=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_9, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_2_0()); 
                          
                    }
                    this_RFIELD_10=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RFIELD_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RFIELD_10, grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_1()); 
                          
                    }
                    this_RFIELD_11=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS494); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:235:6: (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:235:6: (this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD )
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:235:11: this_DOT_12= RULE_DOT this_RFIELD_13= RULE_RFIELD
                    {
                    this_DOT_12=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_12, grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_3_0()); 
                          
                    }
                    this_RFIELD_13=(Token)match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS542); if (state.failed) return current;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_rulefield_selection_in_entryRulefield_selection81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_selection91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBA_FIELDS_in_rulefield_selection137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XYZW_FIELDS_in_rulefield_selection160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBA_FIELDS_in_entryRuleRGBA_FIELDS206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGBA_FIELDS217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS258 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS366 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS386 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS454 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS474 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleRGBA_FIELDS522 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_ruleRGBA_FIELDS542 = new BitSet(new long[]{0x0000000000000002L});

}