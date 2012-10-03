package at.bestsolution.efxclipse.tooling.css.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENT", "RULE_COMMA", "RULE_WS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_HASHMARK", "RULE_IMPORTANT_SYM", "RULE_PERCENT", "RULE_INTEGER", "RULE_HEX", "RULE_REAL", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "';'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'{'", "'}'", "':'", "'@media'", "'@MEDIA'", "'['", "'^='", "'$='", "'*='", "'='", "']'", "'.'", "'*'", "'|'", "'-'", "'('", "')'", "'+'", "'>'", "'~'", "'url'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INCLUDES=8;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_PERCENT=12;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=14;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_REAL=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_COMMA=6;
    public static final int RULE_HASHMARK=10;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_DASHMATCH=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=5;
    public static final int T__39=39;
    public static final int RULE_IMPORTANT_SYM=11;
    public static final int RULE_WS=7;
    public static final int RULE_INTEGER=13;

    // delegates
    // delegators


        public InternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g"; }



     	private CssDslGrammarAccess grammarAccess;
     	
        public InternalCssDslParser(TokenStream input, CssDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "stylesheet";	
       	}
       	
       	@Override
       	protected CssDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:68:1: entryRulestylesheet returns [EObject current=null] : iv_rulestylesheet= rulestylesheet EOF ;
    public final EObject entryRulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestylesheet = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:69:2: (iv_rulestylesheet= rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:70:2: iv_rulestylesheet= rulestylesheet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStylesheetRule()); 
            }
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet75);
            iv_rulestylesheet=rulestylesheet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestylesheet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet85); if (state.failed) return current;

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
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:77:1: rulestylesheet returns [EObject current=null] : ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) ;
    public final EObject rulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject lv_charset_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_ruleset_2_0 = null;

        EObject lv_media_3_0 = null;

        EObject lv_page_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:28: ( ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:2: ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:2: ( (lv_charset_0_0= rulecharset ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:1: (lv_charset_0_0= rulecharset )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:1: (lv_charset_0_0= rulecharset )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:83:3: lv_charset_0_0= rulecharset
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecharset_in_rulestylesheet131);
                    lv_charset_0_0=rulecharset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
                      	        }
                             		set(
                             			current, 
                             			"charset",
                              		lv_charset_0_0, 
                              		"charset");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:3: ( (lv_imports_1_0= ruleimportExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=21)||LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:1: (lv_imports_1_0= ruleimportExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:1: (lv_imports_1_0= ruleimportExpression )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:101:3: lv_imports_1_0= ruleimportExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleimportExpression_in_rulestylesheet153);
            	    lv_imports_1_0=ruleimportExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"importExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:3: ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                case RULE_HASHMARK:
                case 26:
                case 29:
                case 35:
                case 36:
                case 37:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                case 28:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                case 23:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:118:1: (lv_ruleset_2_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:118:1: (lv_ruleset_2_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:119:3: lv_ruleset_2_0= ruleruleset
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleruleset_in_rulestylesheet176);
            	    lv_ruleset_2_0=ruleruleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ruleset",
            	              		lv_ruleset_2_0, 
            	              		"ruleset");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:136:6: ( (lv_media_3_0= rulemedia ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:136:6: ( (lv_media_3_0= rulemedia ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:137:1: (lv_media_3_0= rulemedia )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:137:1: (lv_media_3_0= rulemedia )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:138:3: lv_media_3_0= rulemedia
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemedia_in_rulestylesheet203);
            	    lv_media_3_0=rulemedia();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"media",
            	              		lv_media_3_0, 
            	              		"media");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:155:6: ( (lv_page_4_0= rulepage ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:155:6: ( (lv_page_4_0= rulepage ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:156:1: (lv_page_4_0= rulepage )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:156:1: (lv_page_4_0= rulepage )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:157:3: lv_page_4_0= rulepage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepage_in_rulestylesheet230);
            	    lv_page_4_0=rulepage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"page",
            	              		lv_page_4_0, 
            	              		"page");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulecharset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:181:1: entryRulecharset returns [EObject current=null] : iv_rulecharset= rulecharset EOF ;
    public final EObject entryRulecharset() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:182:2: (iv_rulecharset= rulecharset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:183:2: iv_rulecharset= rulecharset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharsetRule()); 
            }
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset268);
            iv_rulecharset=rulecharset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecharset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset278); if (state.failed) return current;

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
    // $ANTLR end "entryRulecharset"


    // $ANTLR start "rulecharset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:190:1: rulecharset returns [EObject current=null] : ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulecharset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_charset_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:28: ( ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:4: otherlv_0= '@charset'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulecharset316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:199:7: otherlv_1= '@CHARSET'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulecharset334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:2: ( (lv_charset_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:204:1: (lv_charset_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:204:1: (lv_charset_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:205:3: lv_charset_2_0= RULE_STRING
            {
            lv_charset_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecharset352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_charset_2_0, grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCharsetRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"charset",
                      		lv_charset_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulecharset369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCharsetAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "rulecharset"


    // $ANTLR start "entryRuleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:233:1: entryRuleimportExpression returns [EObject current=null] : iv_ruleimportExpression= ruleimportExpression EOF ;
    public final EObject entryRuleimportExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:234:2: (iv_ruleimportExpression= ruleimportExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:235:2: iv_ruleimportExpression= ruleimportExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression405);
            iv_ruleimportExpression=ruleimportExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimportExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression415); if (state.failed) return current;

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
    // $ANTLR end "entryRuleimportExpression"


    // $ANTLR start "ruleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:242:1: ruleimportExpression returns [EObject current=null] : ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) ) ;
    public final EObject ruleimportExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_5=null;
        EObject this_URLType_3 = null;

        AntlrDatatypeRuleToken lv_mediaList_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:28: ( ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:1: ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:1: ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:2: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:2: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:3: (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:3: (otherlv_0= '@import' | otherlv_1= '@IMPORT' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==21) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:5: otherlv_0= '@import'
                            {
                            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleimportExpression454); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:251:7: otherlv_1= '@IMPORT'
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleimportExpression472); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:255:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:1: (lv_value_2_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:257:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleimportExpression490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:275:5: this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleURLType_in_ruleimportExpression525);
                    this_URLType_3=ruleURLType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_URLType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:283:1: ( (lv_mediaList_4_0= rulemedia_list ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_IDENT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:284:1: (lv_mediaList_4_0= rulemedia_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:284:1: (lv_mediaList_4_0= rulemedia_list )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:285:3: lv_mediaList_4_0= rulemedia_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemedia_list_in_ruleimportExpression545);
                            lv_mediaList_4_0=rulemedia_list();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"mediaList",
                                      		lv_mediaList_4_0, 
                                      		"media_list");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleimportExpression558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2());
                          
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
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:313:1: entryRulepage returns [EObject current=null] : iv_rulepage= rulepage EOF ;
    public final EObject entryRulepage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:314:2: (iv_rulepage= rulepage EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:315:2: iv_rulepage= rulepage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulepage_in_entryRulepage595);
            iv_rulepage=rulepage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepage605); if (state.failed) return current;

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
    // $ANTLR end "entryRulepage"


    // $ANTLR start "rulepage"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:322:1: rulepage returns [EObject current=null] : ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' ) ;
    public final EObject rulepage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_pseudoPage_3_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_declarations_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:28: ( ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:326:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:326:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:326:2: () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:326:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:327:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageAccess().getPageAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:332:2: (otherlv_1= '@page' | otherlv_2= '@PAGE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:332:4: otherlv_1= '@page'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulepage652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:337:7: otherlv_2= '@PAGE'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulepage670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getPAGEKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:341:2: ( (lv_pseudoPage_3_0= rulepseudo_page ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:342:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:342:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:343:3: lv_pseudoPage_3_0= rulepseudo_page
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepseudo_page_in_rulepage692);
                    lv_pseudoPage_3_0=rulepseudo_page();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"pseudoPage",
                              		lv_pseudoPage_3_0, 
                              		"pseudo_page");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulepage705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: ( (lv_declarations_5_0= rulecss_declaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT||LA10_0==RULE_WS||LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:364:1: (lv_declarations_5_0= rulecss_declaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:364:1: (lv_declarations_5_0= rulecss_declaration )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:365:3: lv_declarations_5_0= rulecss_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_declaration_in_rulepage726);
                    lv_declarations_5_0=rulecss_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		add(
                             			current, 
                             			"declarations",
                              		lv_declarations_5_0, 
                              		"css_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:381:3: (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:381:5: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_rulepage740); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:1: ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_IDENT||LA11_0==RULE_WS||LA11_0==38) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:386:1: (lv_declarations_7_0= rulecss_declaration )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:386:1: (lv_declarations_7_0= rulecss_declaration )
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:387:3: lv_declarations_7_0= rulecss_declaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_rulecss_declaration_in_rulepage761);
            	            lv_declarations_7_0=rulecss_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_7_0, 
            	                      		"css_declaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_rulepage776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "rulepage"


    // $ANTLR start "entryRulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:415:1: entryRulepseudo_page returns [String current=null] : iv_rulepseudo_page= rulepseudo_page EOF ;
    public final String entryRulepseudo_page() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepseudo_page = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:416:2: (iv_rulepseudo_page= rulepseudo_page EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:417:2: iv_rulepseudo_page= rulepseudo_page EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudo_pageRule()); 
            }
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page813);
            iv_rulepseudo_page=rulepseudo_page();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepseudo_page.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page824); if (state.failed) return current;

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
    // $ANTLR end "entryRulepseudo_page"


    // $ANTLR start "rulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:424:1: rulepseudo_page returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulepseudo_page() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:28: ( (kw= ':' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:428:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:428:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:429:2: kw= ':' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,26,FOLLOW_26_in_rulepseudo_page862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
                  
            }
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulepseudo_page877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENT_1, grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "rulepseudo_page"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:449:1: entryRulemedia returns [EObject current=null] : iv_rulemedia= rulemedia EOF ;
    public final EObject entryRulemedia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemedia = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:450:2: (iv_rulemedia= rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:451:2: iv_rulemedia= rulemedia EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia922);
            iv_rulemedia=rulemedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia932); if (state.failed) return current;

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
    // $ANTLR end "entryRulemedia"


    // $ANTLR start "rulemedia"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:458:1: rulemedia returns [EObject current=null] : ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) ;
    public final EObject rulemedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_medialist_2_0 = null;

        EObject lv_rulesets_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:28: ( ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:4: otherlv_0= '@media'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulemedia970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:467:7: otherlv_1= '@MEDIA'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_rulemedia988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:471:2: ( (lv_medialist_2_0= rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:472:1: (lv_medialist_2_0= rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:472:1: (lv_medialist_2_0= rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:473:3: lv_medialist_2_0= rulemedia_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia1010);
            lv_medialist_2_0=rulemedia_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMediaRule());
              	        }
                     		set(
                     			current, 
                     			"medialist",
                      		lv_medialist_2_0, 
                      		"media_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulemedia1022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:493:1: ( (lv_rulesets_4_0= ruleruleset ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_IDENT||LA14_0==RULE_HASHMARK||LA14_0==26||LA14_0==29||(LA14_0>=35 && LA14_0<=37)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:494:1: (lv_rulesets_4_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:494:1: (lv_rulesets_4_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:495:3: lv_rulesets_4_0= ruleruleset
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia1043);
            	    lv_rulesets_4_0=ruleruleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rulesets",
            	              		lv_rulesets_4_0, 
            	              		"ruleset");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_rulemedia1056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "rulemedia"


    // $ANTLR start "entryRulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:523:1: entryRulemedia_list returns [String current=null] : iv_rulemedia_list= rulemedia_list EOF ;
    public final String entryRulemedia_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedia_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:524:2: (iv_rulemedia_list= rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:525:2: iv_rulemedia_list= rulemedia_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedia_listRule()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list1093);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia_list.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list1104); if (state.failed) return current;

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
    // $ANTLR end "entryRulemedia_list"


    // $ANTLR start "rulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:532:1: rulemedia_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) ;
    public final AntlrDatatypeRuleToken rulemedia_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_medium_0 = null;

        AntlrDatatypeRuleToken this_medium_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:535:28: ( (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:536:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:536:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:537:5: this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list1151);
            this_medium_0=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_medium_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:547:1: (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:547:6: this_COMMA_1= RULE_COMMA this_medium_2= rulemedium
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list1172); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list1199);
            	    this_medium_2=rulemedium();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_medium_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
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
    // $ANTLR end "rulemedia_list"


    // $ANTLR start "entryRulemedium"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:573:1: entryRulemedium returns [String current=null] : iv_rulemedium= rulemedium EOF ;
    public final String entryRulemedium() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedium = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:574:2: (iv_rulemedium= rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:575:2: iv_rulemedium= rulemedium EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediumRule()); 
            }
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium1247);
            iv_rulemedium=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedium.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium1258); if (state.failed) return current;

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
    // $ANTLR end "entryRulemedium"


    // $ANTLR start "rulemedium"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:582:1: rulemedium returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENT_0= RULE_IDENT ;
    public final AntlrDatatypeRuleToken rulemedium() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:585:28: (this_IDENT_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:586:5: this_IDENT_0= RULE_IDENT
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium1297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENT_0, grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
                  
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
    // $ANTLR end "rulemedium"


    // $ANTLR start "entryRuleruleset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:601:1: entryRuleruleset returns [EObject current=null] : iv_ruleruleset= ruleruleset EOF ;
    public final EObject entryRuleruleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:602:2: (iv_ruleruleset= ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:603:2: iv_ruleruleset= ruleruleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset1341);
            iv_ruleruleset=ruleruleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleruleset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset1351); if (state.failed) return current;

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
    // $ANTLR end "entryRuleruleset"


    // $ANTLR start "ruleruleset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:610:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' ) ;
    public final EObject ruleruleset() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_declarations_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:2: ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:615:1: (lv_selectors_0_0= ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:615:1: (lv_selectors_0_0= ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:616:3: lv_selectors_0_0= ruleselector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleselector_in_ruleruleset1397);
            lv_selectors_0_0=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRulesetRule());
              	        }
                     		add(
                     			current, 
                     			"selectors",
                      		lv_selectors_0_0, 
                      		"selector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:632:2: (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:632:3: this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset1409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:636:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:637:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:637:1: (lv_selectors_2_0= ruleselector )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:638:3: lv_selectors_2_0= ruleselector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset1429);
            	    lv_selectors_2_0=ruleselector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"selectors",
            	              		lv_selectors_2_0, 
            	              		"selector");
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:654:4: (this_WS_3= RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:654:5: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleruleset1443); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleruleset1456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:662:1: ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_IDENT||LA18_0==RULE_WS||LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:662:2: ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:662:2: ( (lv_declarations_5_0= rulecss_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:663:1: (lv_declarations_5_0= rulecss_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:663:1: (lv_declarations_5_0= rulecss_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:664:3: lv_declarations_5_0= rulecss_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1478);
            	    lv_declarations_5_0=rulecss_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_5_0, 
            	              		"css_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleruleset1490); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleruleset1504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleruleset"


    // $ANTLR start "entryRuleselector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:696:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:700:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:701:2: iv_ruleselector= ruleselector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1546);
            iv_ruleselector=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1556); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:711:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? ) ;
    public final EObject ruleselector() throws RecognitionException {
        EObject current = null;

        Token this_WS_3=null;
        EObject lv_simpleselectors_0_0 = null;

        AntlrDatatypeRuleToken lv_combinator_1_0 = null;

        EObject lv_selector_2_0 = null;

        AntlrDatatypeRuleToken lv_combinator_4_0 = null;

        EObject lv_selector_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:715:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:716:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:716:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:716:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:716:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:717:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:717:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:718:3: lv_simpleselectors_0_0= rulesimple_selector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1606);
            lv_simpleselectors_0_0=rulesimple_selector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectorRule());
              	        }
                     		add(
                     			current, 
                     			"simpleselectors",
                      		lv_simpleselectors_0_0, 
                      		"simple_selector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:734:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )?
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:734:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:734:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:734:4: ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:734:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:735:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:735:1: (lv_combinator_1_0= rulecombinator )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:736:3: lv_combinator_1_0= rulecombinator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1629);
                    lv_combinator_1_0=rulecombinator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"combinator",
                              		lv_combinator_1_0, 
                              		"combinator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:752:2: ( (lv_selector_2_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:753:1: (lv_selector_2_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:753:1: (lv_selector_2_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:754:3: lv_selector_2_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1650);
                    lv_selector_2_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"selector",
                              		lv_selector_2_0, 
                              		"selector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:6: ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:6: ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:7: (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:7: (this_WS_3= RULE_WS )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:8: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1670); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_3, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:775:3: ( (lv_combinator_4_0= rulecombinator ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=41 && LA20_0<=43)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:776:1: (lv_combinator_4_0= rulecombinator )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:776:1: (lv_combinator_4_0= rulecombinator )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:777:3: lv_combinator_4_0= rulecombinator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecombinator_in_ruleselector1692);
                            lv_combinator_4_0=rulecombinator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"combinator",
                                      		lv_combinator_4_0, 
                                      		"combinator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:793:3: ( (lv_selector_5_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:794:1: (lv_selector_5_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:794:1: (lv_selector_5_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:795:3: lv_selector_5_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1714);
                    lv_selector_5_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"selector",
                              		lv_selector_5_0, 
                              		"selector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:822:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:823:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:824:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            }
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector1757);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_selector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector1767); if (state.failed) return current;

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
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:1: rulesimple_selector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:834:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            int alt25=2;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||(LA25_1>=RULE_IDENT && LA25_1<=RULE_WS)||LA25_1==RULE_HASHMARK||LA25_1==24||LA25_1==26||LA25_1==29||LA25_1==35||LA25_1==37||(LA25_1>=41 && LA25_1<=43)) ) {
                    alt25=1;
                }
                else if ( (LA25_1==39) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 36:
            case 37:
                {
                alt25=1;
                }
                break;
            case RULE_HASHMARK:
            case 26:
            case 29:
            case 35:
                {
                alt25=2;
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_IDENT) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==37) ) {
                            alt22=2;
                        }
                        else if ( (LA22_1==EOF||(LA22_1>=RULE_IDENT && LA22_1<=RULE_WS)||LA22_1==RULE_HASHMARK||LA22_1==24||LA22_1==26||LA22_1==29||LA22_1==35||(LA22_1>=41 && LA22_1<=43)) ) {
                            alt22=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA22_0>=36 && LA22_0<=37)) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:836:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:836:1: (lv_element_0_0= ruleElementSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:837:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_rulesimple_selector1815);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"element",
                                      		lv_element_0_0, 
                                      		"ElementSelector");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:854:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:854:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:855:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:855:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:856:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_rulesimple_selector1842);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"universal",
                                      		lv_universal_1_0, 
                                      		"UniversalSelector");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:872:3: ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_IDENT||LA23_0==RULE_HASHMARK||LA23_0==26||LA23_0==29||LA23_0==35) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:874:3: lv_subSelectors_2_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector1864);
                    	    lv_subSelectors_2_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_2_0, 
                    	              		"SubSelector");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:891:6: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:891:6: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_IDENT||LA24_0==RULE_HASHMARK||LA24_0==26||LA24_0==29||LA24_0==35) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:1: (lv_subSelectors_3_0= ruleSubSelector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:1: (lv_subSelectors_3_0= ruleSubSelector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:3: lv_subSelectors_3_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector1893);
                    	    lv_subSelectors_3_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_3_0, 
                    	              		"SubSelector");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


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
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRuleSubSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:917:1: entryRuleSubSelector returns [EObject current=null] : iv_ruleSubSelector= ruleSubSelector EOF ;
    public final EObject entryRuleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:918:2: (iv_ruleSubSelector= ruleSubSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:919:2: iv_ruleSubSelector= ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_entryRuleSubSelector1930);
            iv_ruleSubSelector=ruleSubSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelector1940); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubSelector"


    // $ANTLR start "ruleSubSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:926:1: ruleSubSelector returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) ;
    public final EObject ruleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClass_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:929:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt26=1;
                }
                break;
            case 35:
                {
                alt26=2;
                }
                break;
            case 29:
                {
                alt26=3;
                }
                break;
            case RULE_IDENT:
            case 26:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:931:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelector1987);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdSelector_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:941:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelector2014);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassSelector_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:951:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelector2041);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeSelector_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:961:5: this_PseudoClass_3= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getPseudoClassParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_ruleSubSelector2068);
                    this_PseudoClass_3=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClass_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleSubSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:977:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:978:2: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:979:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2103);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSelector2113); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:986:1: ruleAttributeSelector returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_name_2_0= RULE_IDENT ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token lv_value_4_1=null;
        Token lv_value_4_2=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:989:28: ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_IDENT ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:990:1: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_IDENT ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:990:1: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_IDENT ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:990:2: () otherlv_1= '[' ( (lv_name_2_0= RULE_IDENT ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:990:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:991:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAttributeSelector2159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1000:1: ( (lv_name_2_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1001:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1001:1: (lv_name_2_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1002:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAttributeSelector2176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getAttributeSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"IDENT");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1018:2: ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INCLUDES && LA29_0<=RULE_DASHMATCH)||(LA29_0>=30 && LA29_0<=33)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1018:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1018:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1019:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1019:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1020:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1020:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    int alt27=6;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt27=1;
                        }
                        break;
                    case 31:
                        {
                        alt27=2;
                        }
                        break;
                    case 32:
                        {
                        alt27=3;
                        }
                        break;
                    case 33:
                        {
                        alt27=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt27=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt27=6;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:3: lv_op_3_1= '^='
                            {
                            lv_op_3_1=(Token)match(input,30,FOLLOW_30_in_ruleAttributeSelector2202); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_1, grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1033:8: lv_op_3_2= '$='
                            {
                            lv_op_3_2=(Token)match(input,31,FOLLOW_31_in_ruleAttributeSelector2231); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_2, grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1045:8: lv_op_3_3= '*='
                            {
                            lv_op_3_3=(Token)match(input,32,FOLLOW_32_in_ruleAttributeSelector2260); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_3, grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1057:8: lv_op_3_4= '='
                            {
                            lv_op_3_4=(Token)match(input,33,FOLLOW_33_in_ruleAttributeSelector2289); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_4, grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1069:8: lv_op_3_5= RULE_INCLUDES
                            {
                            lv_op_3_5=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2317); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_op_3_5, grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"op",
                                      		lv_op_3_5, 
                                      		"INCLUDES");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1084:8: lv_op_3_6= RULE_DASHMATCH
                            {
                            lv_op_3_6=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2337); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_op_3_6, grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"op",
                                      		lv_op_3_6, 
                                      		"DASHMATCH");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1102:2: ( ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1103:1: ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1103:1: ( (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1104:1: (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1104:1: (lv_value_4_1= RULE_IDENT | lv_value_4_2= RULE_STRING )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_IDENT) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_STRING) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1105:3: lv_value_4_1= RULE_IDENT
                            {
                            lv_value_4_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAttributeSelector2364); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_4_1, grammarAccess.getAttributeSelectorAccess().getValueIDENTTerminalRuleCall_3_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_4_1, 
                                      		"IDENT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1120:8: lv_value_4_2= RULE_STRING
                            {
                            lv_value_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeSelector2384); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_4_2, grammarAccess.getAttributeSelectorAccess().getValueSTRINGTerminalRuleCall_3_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_4_2, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleAttributeSelector2406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4());
                  
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
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleClassSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1150:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1151:2: (iv_ruleClassSelector= ruleClassSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1152:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleClassSelector_in_entryRuleClassSelector2442);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSelector2452); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1159:1: ruleClassSelector returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_name_2_0= RULE_IDENT ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1162:28: ( ( () otherlv_1= '.' ( (lv_name_2_0= RULE_IDENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1163:1: ( () otherlv_1= '.' ( (lv_name_2_0= RULE_IDENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1163:1: ( () otherlv_1= '.' ( (lv_name_2_0= RULE_IDENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1163:2: () otherlv_1= '.' ( (lv_name_2_0= RULE_IDENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1163:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1164:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassSelectorAccess().getClassSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleClassSelector2498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1173:1: ( (lv_name_2_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1174:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1174:1: (lv_name_2_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1175:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleClassSelector2515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getClassSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassSelectorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"IDENT");
              	    
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
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1199:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1200:2: (iv_ruleElementSelector= ruleElementSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1201:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleElementSelector_in_entryRuleElementSelector2556);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementSelector2566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1208:1: ruleElementSelector returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_IDENT ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1211:28: ( ( () ( (lv_name_1_0= RULE_IDENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1212:1: ( () ( (lv_name_1_0= RULE_IDENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1212:1: ( () ( (lv_name_1_0= RULE_IDENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1212:2: () ( (lv_name_1_0= RULE_IDENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1212:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1213:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1218:2: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1219:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1219:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1220:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleElementSelector2617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getElementSelectorAccess().getNameIDENTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getElementSelectorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENT");
              	    
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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1244:1: entryRuleUniversalSelector returns [EObject current=null] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final EObject entryRuleUniversalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1245:2: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1246:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector2658);
            iv_ruleUniversalSelector=ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniversalSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniversalSelector2668); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1253:1: ruleUniversalSelector returns [EObject current=null] : ( () ( (lv_namespece_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) ;
    public final EObject ruleUniversalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespece_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1256:28: ( ( () ( (lv_namespece_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1257:1: ( () ( (lv_namespece_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1257:1: ( () ( (lv_namespece_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1257:2: () ( (lv_namespece_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1257:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1258:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1263:2: ( (lv_namespece_1_0= rulecss_namespace_prefix ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENT||LA30_0==37) ) {
                alt30=1;
            }
            else if ( (LA30_0==36) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==37) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1264:1: (lv_namespece_1_0= rulecss_namespace_prefix )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1264:1: (lv_namespece_1_0= rulecss_namespace_prefix )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1265:3: lv_namespece_1_0= rulecss_namespace_prefix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUniversalSelectorAccess().getNamespeceCss_namespace_prefixParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector2723);
                    lv_namespece_1_0=rulecss_namespace_prefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUniversalSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"namespece",
                              		lv_namespece_1_0, 
                              		"css_namespace_prefix");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleUniversalSelector2736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2());
                  
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
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleIdSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1293:1: entryRuleIdSelector returns [EObject current=null] : iv_ruleIdSelector= ruleIdSelector EOF ;
    public final EObject entryRuleIdSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1294:2: (iv_ruleIdSelector= ruleIdSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1295:2: iv_ruleIdSelector= ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleIdSelector_in_entryRuleIdSelector2772);
            iv_ruleIdSelector=ruleIdSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdSelector2782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdSelector"


    // $ANTLR start "ruleIdSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1302:1: ruleIdSelector returns [EObject current=null] : ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= RULE_IDENT ) ) ) ;
    public final EObject ruleIdSelector() throws RecognitionException {
        EObject current = null;

        Token this_HASHMARK_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1305:28: ( ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= RULE_IDENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= RULE_IDENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= RULE_IDENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:2: () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= RULE_IDENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1307:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdSelectorAccess().getIdSelectorAction_0(),
                          current);
                  
            }

            }

            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleIdSelector2827); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_1, grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1316:1: ( (lv_name_2_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1317:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1317:1: (lv_name_2_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1318:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdSelector2843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getIdSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdSelectorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"IDENT");
              	    
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
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1342:1: entryRulecss_namespace_prefix returns [String current=null] : iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF ;
    public final String entryRulecss_namespace_prefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_namespace_prefix = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1343:2: (iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1344:2: iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_namespace_prefixRule()); 
            }
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix2885);
            iv_rulecss_namespace_prefix=rulecss_namespace_prefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_namespace_prefix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix2896); if (state.failed) return current;

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
    // $ANTLR end "entryRulecss_namespace_prefix"


    // $ANTLR start "rulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1351:1: rulecss_namespace_prefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulecss_namespace_prefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1354:28: ( ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1355:1: ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1355:1: ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1355:2: (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1355:2: (this_IDENT_0= RULE_IDENT | kw= '*' )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_IDENT) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1355:7: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_namespace_prefix2937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_0, grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1364:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulecss_namespace_prefix2961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_37_in_rulecss_namespace_prefix2976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 
                  
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
    // $ANTLR end "rulecss_namespace_prefix"


    // $ANTLR start "entryRulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1383:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1387:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1388:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_declarationRule()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration3022);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration3032); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulecss_declaration"


    // $ANTLR start "rulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1398:1: rulecss_declaration returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token lv_important_5_0=null;
        EObject lv_property_1_0 = null;

        EObject lv_valueTokens_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1402:28: ( ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1403:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1403:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1403:2: (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1403:2: (this_WS_0= RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1403:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3073); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1407:3: ( (lv_property_1_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1408:1: (lv_property_1_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1408:1: (lv_property_1_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1409:3: lv_property_1_0= rulecss_property
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecss_property_in_rulecss_declaration3095);
            lv_property_1_0=rulecss_property();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCss_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"property",
                      		lv_property_1_0, 
                      		"css_property");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1425:2: (this_WS_2= RULE_WS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1425:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3107); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulecss_declaration3120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCss_declarationAccess().getColonKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1433:1: ( (lv_valueTokens_4_0= ruleCssTok ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_WS)||LA34_0==RULE_HASHMARK||(LA34_0>=RULE_PERCENT && LA34_0<=RULE_INTEGER)||LA34_0==38||LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1434:1: (lv_valueTokens_4_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1434:1: (lv_valueTokens_4_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1435:3: lv_valueTokens_4_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCssTok_in_rulecss_declaration3141);
            	    lv_valueTokens_4_0=ruleCssTok();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCss_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valueTokens",
            	              		lv_valueTokens_4_0, 
            	              		"CssTok");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1451:3: ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_IMPORTANT_SYM) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1452:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1452:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1453:3: lv_important_5_0= RULE_IMPORTANT_SYM
                    {
                    lv_important_5_0=(Token)match(input,RULE_IMPORTANT_SYM,FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_important_5_0, grammarAccess.getCss_declarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCss_declarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"important",
                              		true, 
                              		"IMPORTANT_SYM");
                      	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulecss_declaration"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1480:1: entryRulecss_property returns [EObject current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final EObject entryRulecss_property() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1481:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1482:2: iv_rulecss_property= rulecss_property EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_propertyRule()); 
            }
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3205);
            iv_rulecss_property=rulecss_property();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_property; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3215); if (state.failed) return current;

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
    // $ANTLR end "entryRulecss_property"


    // $ANTLR start "rulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1489:1: rulecss_property returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject rulecss_property() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1492:28: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1493:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1493:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1493:2: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1493:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1494:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCss_propertyAccess().getCss_propertyAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1499:2: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1500:1: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1500:1: (lv_name_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1501:3: lv_name_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rulecss_property3270);
            lv_name_1_0=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCss_propertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidPropertyIdent");
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
    // $ANTLR end "rulecss_property"


    // $ANTLR start "entryRuleValidPropertyIdent"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1525:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1526:2: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1527:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3307);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidPropertyIdent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent3318); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidPropertyIdent"


    // $ANTLR start "ruleValidPropertyIdent"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1534:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1537:28: ( ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1538:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1538:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1538:2: (kw= '-' )? this_IDENT_1= RULE_IDENT
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1538:2: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1539:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleValidPropertyIdent3357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidPropertyIdentAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleValidPropertyIdent3374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENT_1, grammarAccess.getValidPropertyIdentAccess().getIDENTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleValidPropertyIdent"


    // $ANTLR start "entryRulePseudoClass"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1561:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1562:2: (iv_rulePseudoClass= rulePseudoClass EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1563:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClass_in_entryRulePseudoClass3421);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClass3431); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1570:1: rulePseudoClass returns [EObject current=null] : ( (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName ) | this_PseudoClassFunction_3= rulePseudoClassFunction ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_PseudoClassName_2 = null;

        EObject this_PseudoClassFunction_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1573:28: ( ( (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName ) | this_PseudoClassFunction_3= rulePseudoClassFunction ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1574:1: ( (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName ) | this_PseudoClassFunction_3= rulePseudoClassFunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1574:1: ( (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName ) | this_PseudoClassFunction_3= rulePseudoClassFunction )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_IDENT) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1574:2: (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1574:2: (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1574:4: otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePseudoClass3469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPseudoClassAccess().getColonKeyword_0_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1578:1: (otherlv_1= ':' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==26) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1578:3: otherlv_1= ':'
                            {
                            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePseudoClass3482); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getPseudoClassAccess().getColonKeyword_0_1());
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassName_in_rulePseudoClass3506);
                    this_PseudoClassName_2=rulePseudoClassName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClassName_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1593:5: this_PseudoClassFunction_3= rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassAccess().getPseudoClassFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassFunction_in_rulePseudoClass3534);
                    this_PseudoClassFunction_3=rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClassFunction_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1609:1: entryRulePseudoClassName returns [EObject current=null] : iv_rulePseudoClassName= rulePseudoClassName EOF ;
    public final EObject entryRulePseudoClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1610:2: (iv_rulePseudoClassName= rulePseudoClassName EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1611:2: iv_rulePseudoClassName= rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName3569);
            iv_rulePseudoClassName=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassName3579); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClassName"


    // $ANTLR start "rulePseudoClassName"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1618:1: rulePseudoClassName returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENT ) ) ;
    public final EObject rulePseudoClassName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1621:28: ( ( (lv_name_0_0= RULE_IDENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1622:1: ( (lv_name_0_0= RULE_IDENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1622:1: ( (lv_name_0_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1623:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1623:1: (lv_name_0_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1624:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePseudoClassName3620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPseudoClassNameAccess().getNameIDENTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoClassNameRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENT");
              	    
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
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1648:1: entryRulePseudoClassFunction returns [EObject current=null] : iv_rulePseudoClassFunction= rulePseudoClassFunction EOF ;
    public final EObject entryRulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassFunction = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1649:2: (iv_rulePseudoClassFunction= rulePseudoClassFunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1650:2: iv_rulePseudoClassFunction= rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction3660);
            iv_rulePseudoClassFunction=rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassFunction3670); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClassFunction"


    // $ANTLR start "rulePseudoClassFunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:1: rulePseudoClassFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_params_2_0= ruleCssTok ) )* otherlv_3= ')' ) ;
    public final EObject rulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1660:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_params_2_0= ruleCssTok ) )* otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1661:1: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_params_2_0= ruleCssTok ) )* otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1661:1: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_params_2_0= ruleCssTok ) )* otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1661:2: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_params_2_0= ruleCssTok ) )* otherlv_3= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1661:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1662:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1662:1: (lv_name_0_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1663:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePseudoClassFunction3712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPseudoClassFunctionAccess().getNameIDENTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoClassFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePseudoClassFunction3729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1683:1: ( (lv_params_2_0= ruleCssTok ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_WS)||LA39_0==RULE_HASHMARK||(LA39_0>=RULE_PERCENT && LA39_0<=RULE_INTEGER)||LA39_0==38||LA39_0==44) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1684:1: (lv_params_2_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1684:1: (lv_params_2_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1685:3: lv_params_2_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCssTok_in_rulePseudoClassFunction3750);
            	    lv_params_2_0=ruleCssTok();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_2_0, 
            	              		"CssTok");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_rulePseudoClassFunction3763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1713:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1714:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1715:2: iv_rulecombinator= rulecombinator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator3800);
            iv_rulecombinator=rulecombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecombinator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator3811); if (state.failed) return current;

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
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1722:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1725:28: ( ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1726:1: ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1726:1: ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1726:2: (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1726:2: (kw= '+' | kw= '>' | kw= '~' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt40=1;
                }
                break;
            case 42:
                {
                alt40=2;
                }
                break;
            case 43:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1727:2: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_rulecombinator3850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1734:2: kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_rulecombinator3869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1741:2: kw= '~'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulecombinator3888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1746:2: (this_WS_3= RULE_WS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_WS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1746:7: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecombinator3905); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1763:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1764:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1765:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            }
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator3955);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_operator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator3966); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1772:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1775:28: ( (kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1776:1: (kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1776:1: (kw= '-' | kw= '+' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            else if ( (LA42_0==41) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1777:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleunary_operator4004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1784:2: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleunary_operator4023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRuleSymbolTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1797:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:2: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1799:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4063);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok4073); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1806:1: ruleSymbolTok returns [EObject current=null] : ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1809:28: ( ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1810:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1810:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1810:2: () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1810:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1811:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1816:2: ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1817:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1817:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1818:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1818:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_COMMA) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_PERCENT) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1819:3: lv_symbol_1_1= RULE_COMMA
                    {
                    lv_symbol_1_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSymbolTok4126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_symbol_1_1, grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSymbolTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"symbol",
                              		lv_symbol_1_1, 
                              		"COMMA");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1834:8: lv_symbol_1_2= RULE_PERCENT
                    {
                    lv_symbol_1_2=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSymbolTok4146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_symbol_1_2, grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSymbolTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"symbol",
                              		lv_symbol_1_2, 
                              		"PERCENT");
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1860:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1861:2: (iv_ruleWSTok= ruleWSTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1862:2: iv_ruleWSTok= ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok4190);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWSTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok4200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1869:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1872:28: ( ( () this_WS_1= RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:1: ( () this_WS_1= RULE_WS )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:1: ( () this_WS_1= RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:2: () this_WS_1= RULE_WS
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1874:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWSTokAccess().getWSTokAction_0(),
                          current);
                  
            }

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleWSTok4245); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WS_1, grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1891:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:2: (iv_ruleStringTok= ruleStringTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1893:2: iv_ruleStringTok= ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok4280);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok4290); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1900:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1903:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1904:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1904:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1904:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1904:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1905:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTokAccess().getStringTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1910:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1912:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringTok4341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringTokAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringTokRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1936:1: entryRuleFuncTok returns [EObject current=null] : iv_ruleFuncTok= ruleFuncTok EOF ;
    public final EObject entryRuleFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1937:2: (iv_ruleFuncTok= ruleFuncTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1938:2: iv_ruleFuncTok= ruleFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncTokRule()); 
            }
            pushFollow(FOLLOW_ruleFuncTok_in_entryRuleFuncTok4382);
            iv_ruleFuncTok=ruleFuncTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncTok4392); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFuncTok"


    // $ANTLR start "ruleFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1945:1: ruleFuncTok returns [EObject current=null] : ( () ( (lv_func_1_0= rulefunction ) ) ) ;
    public final EObject ruleFuncTok() throws RecognitionException {
        EObject current = null;

        EObject lv_func_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1948:28: ( ( () ( (lv_func_1_0= rulefunction ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1949:1: ( () ( (lv_func_1_0= rulefunction ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1949:1: ( () ( (lv_func_1_0= rulefunction ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1949:2: () ( (lv_func_1_0= rulefunction ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1949:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1950:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFuncTokAccess().getFuncTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1955:2: ( (lv_func_1_0= rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1956:1: (lv_func_1_0= rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1956:1: (lv_func_1_0= rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1957:3: lv_func_1_0= rulefunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFuncTokAccess().getFuncFunctionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulefunction_in_ruleFuncTok4447);
            lv_func_1_0=rulefunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFuncTokRule());
              	        }
                     		set(
                     			current, 
                     			"func",
                      		lv_func_1_0, 
                      		"function");
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
    // $ANTLR end "ruleFuncTok"


    // $ANTLR start "entryRuleNumberTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1981:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1985:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1986:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok4489);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok4499); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTok"


    // $ANTLR start "ruleNumberTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1996:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_num_1_0= RULE_INTEGER ) ) ( ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT ) )? ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token lv_unit_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2000:28: ( ( () ( (lv_num_1_0= RULE_INTEGER ) ) ( ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2001:1: ( () ( (lv_num_1_0= RULE_INTEGER ) ) ( ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2001:1: ( () ( (lv_num_1_0= RULE_INTEGER ) ) ( ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2001:2: () ( (lv_num_1_0= RULE_INTEGER ) ) ( ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2001:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2002:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2007:2: ( (lv_num_1_0= RULE_INTEGER ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2008:1: (lv_num_1_0= RULE_INTEGER )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2008:1: (lv_num_1_0= RULE_INTEGER )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2009:3: lv_num_1_0= RULE_INTEGER
            {
            lv_num_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleNumberTok4554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_num_1_0, grammarAccess.getNumberTokAccess().getNumINTEGERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberTokRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"num",
                      		lv_num_1_0, 
                      		"INTEGER");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2025:2: ( ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_IDENT) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred1_InternalCssDsl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2025:3: ( ( RULE_IDENT ) )=> (lv_unit_2_0= RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2031:1: (lv_unit_2_0= RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2032:3: lv_unit_2_0= RULE_IDENT
                    {
                    lv_unit_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleNumberTok4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_unit_2_0, grammarAccess.getNumberTokAccess().getUnitIDENTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"unit",
                              		lv_unit_2_0, 
                              		"IDENT");
                      	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleIdentifierTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2059:1: entryRuleIdentifierTok returns [EObject current=null] : iv_ruleIdentifierTok= ruleIdentifierTok EOF ;
    public final EObject entryRuleIdentifierTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2060:2: (iv_ruleIdentifierTok= ruleIdentifierTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2061:2: iv_ruleIdentifierTok= ruleIdentifierTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierTokRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok4633);
            iv_ruleIdentifierTok=ruleIdentifierTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierTok4643); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifierTok"


    // $ANTLR start "ruleIdentifierTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2068:1: ruleIdentifierTok returns [EObject current=null] : ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject ruleIdentifierTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2071:28: ( ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2072:1: ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2072:1: ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2072:2: () ( (lv_id_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2072:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2073:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdentifierTokAccess().getIdentifierTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2078:2: ( (lv_id_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2079:1: (lv_id_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2079:1: (lv_id_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2080:3: lv_id_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdentifierTokAccess().getIdValidPropertyIdentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_ruleIdentifierTok4698);
            lv_id_1_0=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdentifierTokRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"ValidPropertyIdent");
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
    // $ANTLR end "ruleIdentifierTok"


    // $ANTLR start "entryRuleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2104:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2105:2: (iv_ruleUrlTok= ruleUrlTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2106:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok4734);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUrlTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok4744); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2113:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2116:28: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2117:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2117:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2117:2: () ( (lv_url_1_0= ruleURLType ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2117:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2118:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2123:2: ( (lv_url_1_0= ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2124:1: (lv_url_1_0= ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2124:1: (lv_url_1_0= ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2125:3: lv_url_1_0= ruleURLType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleURLType_in_ruleUrlTok4799);
            lv_url_1_0=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUrlTokRule());
              	        }
                     		set(
                     			current, 
                     			"url",
                      		lv_url_1_0, 
                      		"URLType");
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
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2149:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2150:2: (iv_ruleColorTok= ruleColorTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2151:2: iv_ruleColorTok= ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok4835);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok4845); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2158:1: ruleColorTok returns [EObject current=null] : ( () this_HASHMARK_1= RULE_HASHMARK ( ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        Token this_HASHMARK_1=null;
        Token lv_color_2_1=null;
        Token lv_color_2_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2161:28: ( ( () this_HASHMARK_1= RULE_HASHMARK ( ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2162:1: ( () this_HASHMARK_1= RULE_HASHMARK ( ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2162:1: ( () this_HASHMARK_1= RULE_HASHMARK ( ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2162:2: () this_HASHMARK_1= RULE_HASHMARK ( ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2162:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2163:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColorTokAccess().getColorTokAction_0(),
                          current);
                  
            }

            }

            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleColorTok4890); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_1, grammarAccess.getColorTokAccess().getHASHMARKTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:1: ( ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2173:1: ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2173:1: ( (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2174:1: (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2174:1: (lv_color_2_1= RULE_HEX | lv_color_2_2= RULE_IDENT )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_HEX) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_IDENT) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2175:3: lv_color_2_1= RULE_HEX
                    {
                    lv_color_2_1=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleColorTok4908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_color_2_1, grammarAccess.getColorTokAccess().getColorHEXTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getColorTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"color",
                              		lv_color_2_1, 
                              		"HEX");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2190:8: lv_color_2_2= RULE_IDENT
                    {
                    lv_color_2_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColorTok4928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_color_2_2, grammarAccess.getColorTokAccess().getColorIDENTTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getColorTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"color",
                              		lv_color_2_2, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleCssTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2216:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_WS");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:2: (iv_ruleCssTok= ruleCssTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2221:2: iv_ruleCssTok= ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok4978);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok4988); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCssTok"


    // $ANTLR start "ruleCssTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2231:1: ruleCssTok returns [EObject current=null] : (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok ) ;
    public final EObject ruleCssTok() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolTok_0 = null;

        EObject this_WSTok_1 = null;

        EObject this_StringTok_2 = null;

        EObject this_FuncTok_3 = null;

        EObject this_NumberTok_4 = null;

        EObject this_IdentifierTok_5 = null;

        EObject this_UrlTok_6 = null;

        EObject this_ColorTok_7 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_WS");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2235:28: ( (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2236:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2236:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )
            int alt46=8;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2237:5: this_SymbolTok_0= ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSymbolTok_in_ruleCssTok5039);
                    this_SymbolTok_0=ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SymbolTok_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2247:5: this_WSTok_1= ruleWSTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWSTok_in_ruleCssTok5066);
                    this_WSTok_1=ruleWSTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WSTok_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2257:5: this_StringTok_2= ruleStringTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringTok_in_ruleCssTok5093);
                    this_StringTok_2=ruleStringTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringTok_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2267:5: this_FuncTok_3= ruleFuncTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getFuncTokParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFuncTok_in_ruleCssTok5120);
                    this_FuncTok_3=ruleFuncTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FuncTok_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2277:5: this_NumberTok_4= ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTok_in_ruleCssTok5147);
                    this_NumberTok_4=ruleNumberTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberTok_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2287:5: this_IdentifierTok_5= ruleIdentifierTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierTokParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierTok_in_ruleCssTok5174);
                    this_IdentifierTok_5=ruleIdentifierTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentifierTok_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2297:5: this_UrlTok_6= ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUrlTok_in_ruleCssTok5201);
                    this_UrlTok_6=ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UrlTok_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2307:5: this_ColorTok_7= ruleColorTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColorTok_in_ruleCssTok5228);
                    this_ColorTok_7=ruleColorTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ColorTok_7; 
                              afterParserOrEnumRuleCall();
                          
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCssTok"


    // $ANTLR start "entryRulefunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2328:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2332:2: (iv_rulefunction= rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2333:2: iv_rulefunction= rulefunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction5275);
            iv_rulefunction=rulefunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction5285); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2343:1: rulefunction returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' ) ;
    public final EObject rulefunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2347:28: ( ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2348:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2348:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2348:2: (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2348:2: (otherlv_0= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2348:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulefunction5327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2352:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2353:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2353:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2354:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction5346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulefunction5363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2374:1: ( (lv_params_3_0= ruleCssTok ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_WS)||LA48_0==RULE_HASHMARK||(LA48_0>=RULE_PERCENT && LA48_0<=RULE_INTEGER)||LA48_0==38||LA48_0==44) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:1: (lv_params_3_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:1: (lv_params_3_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2376:3: lv_params_3_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsCssTokParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCssTok_in_rulefunction5384);
            	    lv_params_3_0=ruleCssTok();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_3_0, 
            	              		"CssTok");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulefunction5397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2407:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2411:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2412:2: iv_ruleURLType= ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType5443);
            iv_ruleURLType=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType5453); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2422:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2426:28: ( (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2427:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2427:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2427:3: otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleURLType5494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleURLType5506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2435:1: ( (lv_url_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2436:1: (lv_url_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2436:1: (lv_url_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2437:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURLType5523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_url_2_0, grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getURLTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"url",
                      		lv_url_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleURLType5540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleURLType"

    // $ANTLR start synpred1_InternalCssDsl
    public final void synpred1_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2025:3: ( ( RULE_IDENT ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2026:1: ( RULE_IDENT )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2026:1: ( RULE_IDENT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2027:1: RULE_IDENT
        {
        match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_synpred1_InternalCssDsl4573); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCssDsl

    // Delegated rules

    public final boolean synpred1_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA21_eotS =
        "\5\uffff";
    static final String DFA21_eofS =
        "\1\3\4\uffff";
    static final String DFA21_minS =
        "\1\6\1\uffff\1\5\2\uffff";
    static final String DFA21_maxS =
        "\1\53\1\uffff\1\53\2\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\2\20\uffff\1\3\20\uffff\3\1",
            "",
            "\1\4\1\uffff\1\2\2\uffff\1\4\15\uffff\1\3\1\uffff\1\4\2\uffff"+
            "\1\4\5\uffff\3\4\3\uffff\3\4",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "734:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )?";
        }
    }
    static final String DFA46_eotS =
        "\13\uffff";
    static final String DFA46_eofS =
        "\5\uffff\1\12\5\uffff";
    static final String DFA46_minS =
        "\1\4\3\uffff\1\5\1\4\5\uffff";
    static final String DFA46_maxS =
        "\1\54\3\uffff\1\5\1\54\5\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String DFA46_specialS =
        "\13\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\3\1\5\1\1\1\2\2\uffff\1\10\1\uffff\1\1\1\6\30\uffff\1\4\5"+
            "\uffff\1\7",
            "",
            "",
            "",
            "\1\5",
            "\4\12\2\uffff\4\12\5\uffff\1\12\5\uffff\1\12\14\uffff\1\12"+
            "\1\11\1\12\3\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2236:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rulestylesheet131 = new BitSet(new long[]{0x000010383CF00422L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rulestylesheet153 = new BitSet(new long[]{0x000010383CF00422L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet176 = new BitSet(new long[]{0x000000383CC00422L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet203 = new BitSet(new long[]{0x000000383CC00422L});
    public static final BitSet FOLLOW_rulepage_in_rulestylesheet230 = new BitSet(new long[]{0x000000383CC00422L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulecharset316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_rulecharset334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecharset352 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulecharset369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleimportExpression454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleimportExpression472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleimportExpression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleimportExpression525 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rulemedia_list_in_ruleimportExpression545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleimportExpression558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulepage652 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_23_in_rulepage670 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rulepage692 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulepage705 = new BitSet(new long[]{0x00000040020800A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage726 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_19_in_rulepage740 = new BitSet(new long[]{0x00000040020800A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage761 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_25_in_rulepage776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulepseudo_page862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulepseudo_page877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulemedia970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28_in_rulemedia988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia1010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulemedia1022 = new BitSet(new long[]{0x0000003826000420L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia1043 = new BitSet(new long[]{0x0000003826000420L});
    public static final BitSet FOLLOW_25_in_rulemedia1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1151 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulemedia_list1172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1199 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1397 = new BitSet(new long[]{0x00000000010000C0L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1409 = new BitSet(new long[]{0x0000003824000420L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1429 = new BitSet(new long[]{0x00000000010000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleruleset1443 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_24_in_ruleruleset1456 = new BitSet(new long[]{0x00000040020000A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleruleset1490 = new BitSet(new long[]{0x00000040020000A0L});
    public static final BitSet FOLLOW_25_in_ruleruleset1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1606 = new BitSet(new long[]{0x00000E0000000082L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1629 = new BitSet(new long[]{0x0000003824000420L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1670 = new BitSet(new long[]{0x00000E38240004A0L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1692 = new BitSet(new long[]{0x0000003824000420L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_rulesimple_selector1815 = new BitSet(new long[]{0x0000003824000422L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_rulesimple_selector1842 = new BitSet(new long[]{0x0000003824000422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector1864 = new BitSet(new long[]{0x0000003824000422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector1893 = new BitSet(new long[]{0x0000003824000422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_entryRuleSubSelector1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelector1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelector1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelector2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelector2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_ruleSubSelector2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSelector2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeSelector2159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttributeSelector2176 = new BitSet(new long[]{0x00000007C0000300L});
    public static final BitSet FOLLOW_30_in_ruleAttributeSelector2202 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31_in_ruleAttributeSelector2231 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_32_in_ruleAttributeSelector2260 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_33_in_ruleAttributeSelector2289 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2317 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2337 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttributeSelector2364 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeSelector2384 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAttributeSelector2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_entryRuleClassSelector2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSelector2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleClassSelector2498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleClassSelector2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_entryRuleElementSelector2556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementSelector2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleElementSelector2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector2658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniversalSelector2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector2723 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleUniversalSelector2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_entryRuleIdSelector2772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdSelector2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleIdSelector2827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdSelector2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix2885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_namespace_prefix2937 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_rulecss_namespace_prefix2961 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulecss_namespace_prefix2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration3022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3073 = new BitSet(new long[]{0x00000040000000A0L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_declaration3095 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3107 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_26_in_rulecss_declaration3120 = new BitSet(new long[]{0x00001040003034F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulecss_declaration3141 = new BitSet(new long[]{0x0000104000303CF2L});
    public static final BitSet FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rulecss_property3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleValidPropertyIdent3357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleValidPropertyIdent3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_entryRulePseudoClass3421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClass3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePseudoClass3469 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePseudoClass3482 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_rulePseudoClass3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_rulePseudoClass3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName3569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassName3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePseudoClassName3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction3660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassFunction3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePseudoClassFunction3712 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePseudoClassFunction3729 = new BitSet(new long[]{0x00001140003034F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulePseudoClassFunction3750 = new BitSet(new long[]{0x00001140003034F0L});
    public static final BitSet FOLLOW_40_in_rulePseudoClassFunction3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator3800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulecombinator3850 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_42_in_rulecombinator3869 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_43_in_rulecombinator3888 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecombinator3905 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator3955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleunary_operator4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleunary_operator4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSymbolTok4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSymbolTok4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleWSTok4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringTok4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_entryRuleFuncTok4382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncTok4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleFuncTok4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok4489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleNumberTok4554 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleNumberTok4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok4633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierTok4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_ruleIdentifierTok4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok4734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleUrlTok4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok4835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleColorTok4890 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleColorTok4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColorTok4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok4978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_ruleCssTok5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_ruleCssTok5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_ruleCssTok5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_ruleCssTok5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_ruleCssTok5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_ruleCssTok5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_ruleCssTok5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_ruleCssTok5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulefunction5327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction5346 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulefunction5363 = new BitSet(new long[]{0x00001040003034F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulefunction5384 = new BitSet(new long[]{0x00001140003034F0L});
    public static final BitSet FOLLOW_40_in_rulefunction5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType5443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleURLType5494 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleURLType5506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURLType5523 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleURLType5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_synpred1_InternalCssDsl4573 = new BitSet(new long[]{0x0000000000000002L});

}