package at.bestsolution.efxclipse.tooling.css.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_COMMA", "RULE_WS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_HASHMARK", "RULE_IMPORTANT_SYM", "RULE_PLUS", "RULE_PERCENT", "RULE_DASH", "RULE_ONE_HEX_LETTER", "RULE_ONE_NON_HEX_LETTER", "RULE_ONE_INT", "RULE_UNDERSCORE", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "';'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'{'", "'}'", "':'", "'@media'", "'@MEDIA'", "'['", "'^='", "'$='", "'*='", "'='", "']'", "'.'", "'*'", "'|'", "':not('", "')'", "'('", "'>'", "'~'", "'url('", "'/'", "'?'", "'&'", "'@'", "'url'", "'ur'", "'\\\\ '", "'\\\\('", "'\\\\)'", "'\\\\\\''", "'\\\\\"'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=7;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ONE_INT=16;
    public static final int RULE_PERCENT=12;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ONE_NON_HEX_LETTER=15;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_UNDERSCORE=17;
    public static final int RULE_PLUS=11;
    public static final int RULE_ONE_HEX_LETTER=14;
    public static final int RULE_COMMA=5;
    public static final int RULE_HASHMARK=9;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_DASHMATCH=8;
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
    public static final int T__39=39;
    public static final int RULE_IMPORTANT_SYM=10;
    public static final int RULE_WS=6;
    public static final int RULE_DASH=13;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:67:1: entryRulestylesheet returns [EObject current=null] : iv_rulestylesheet= rulestylesheet EOF ;
    public final EObject entryRulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestylesheet = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:68:2: (iv_rulestylesheet= rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:69:2: iv_rulestylesheet= rulestylesheet EOF
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:76:1: rulestylesheet returns [EObject current=null] : ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) ;
    public final EObject rulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject lv_charset_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_ruleset_2_0 = null;

        EObject lv_media_3_0 = null;

        EObject lv_page_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:79:28: ( ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_charset_0_0= rulecharset ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=19 && LA1_0<=20)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_charset_0_0= rulecharset )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_charset_0_0= rulecharset )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:3: lv_charset_0_0= rulecharset
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:98:3: ( (lv_imports_1_0= ruleimportExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=22 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:1: (lv_imports_1_0= ruleimportExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:1: (lv_imports_1_0= ruleimportExpression )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:3: lv_imports_1_0= ruleimportExpression
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:116:3: ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case RULE_HASHMARK:
                case RULE_DASH:
                case RULE_ONE_HEX_LETTER:
                case RULE_ONE_NON_HEX_LETTER:
                case RULE_UNDERSCORE:
                case 28:
                case 31:
                case 37:
                case 38:
                case 39:
                case 40:
                case 50:
                case 51:
                    {
                    alt3=1;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt3=2;
                    }
                    break;
                case 24:
                case 25:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:116:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:116:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:1: (lv_ruleset_2_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:1: (lv_ruleset_2_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:118:3: lv_ruleset_2_0= ruleruleset
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
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:135:6: ( (lv_media_3_0= rulemedia ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:135:6: ( (lv_media_3_0= rulemedia ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:136:1: (lv_media_3_0= rulemedia )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:136:1: (lv_media_3_0= rulemedia )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:137:3: lv_media_3_0= rulemedia
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
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:154:6: ( (lv_page_4_0= rulepage ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:154:6: ( (lv_page_4_0= rulepage ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_page_4_0= rulepage )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_page_4_0= rulepage )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:156:3: lv_page_4_0= rulepage
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:180:1: entryRulecharset returns [EObject current=null] : iv_rulecharset= rulecharset EOF ;
    public final EObject entryRulecharset() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:181:2: (iv_rulecharset= rulecharset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:182:2: iv_rulecharset= rulecharset EOF
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:189:1: rulecharset returns [EObject current=null] : ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulecharset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_charset_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:192:28: ( ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:4: otherlv_0= '@charset'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulecharset316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:198:7: otherlv_1= '@CHARSET'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulecharset334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:202:2: ( (lv_charset_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:1: (lv_charset_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:1: (lv_charset_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:204:3: lv_charset_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulecharset369); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:232:1: entryRuleimportExpression returns [EObject current=null] : iv_ruleimportExpression= ruleimportExpression EOF ;
    public final EObject entryRuleimportExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:233:2: (iv_ruleimportExpression= ruleimportExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:234:2: iv_ruleimportExpression= ruleimportExpression EOF
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:241:1: ruleimportExpression returns [EObject current=null] : ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_STRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:244:28: ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_STRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:1: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_STRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:1: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_STRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:2: (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_STRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:2: (otherlv_0= '@import' | otherlv_1= '@IMPORT' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:4: otherlv_0= '@import'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleimportExpression453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:250:7: otherlv_1= '@IMPORT'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleimportExpression471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:254:2: ( ( (lv_value_2_0= RULE_STRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==45) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:254:3: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:254:3: ( (lv_value_2_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:255:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:255:1: (lv_value_2_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleimportExpression490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                      		
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
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:273:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:273:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:5: this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleURLType_in_ruleimportExpression524);
                    this_URLType_3=ruleURLType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_URLType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:282:1: ( (lv_mediaList_4_0= rulemedia_list ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_DASH && LA6_0<=RULE_ONE_NON_HEX_LETTER)||LA6_0==RULE_UNDERSCORE||(LA6_0>=50 && LA6_0<=51)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:283:1: (lv_mediaList_4_0= rulemedia_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:283:1: (lv_mediaList_4_0= rulemedia_list )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:284:3: lv_mediaList_4_0= rulemedia_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemedia_list_in_ruleimportExpression544);
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


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleimportExpression559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getImportExpressionAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:312:1: entryRulepage returns [EObject current=null] : iv_rulepage= rulepage EOF ;
    public final EObject entryRulepage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:313:2: (iv_rulepage= rulepage EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:314:2: iv_rulepage= rulepage EOF
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:321:1: rulepage returns [EObject current=null] : ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:324:28: ( ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:2: () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageAccess().getPageAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:331:2: (otherlv_1= '@page' | otherlv_2= '@PAGE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:331:4: otherlv_1= '@page'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulepage652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:336:7: otherlv_2= '@PAGE'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_rulepage670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getPAGEKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:340:2: ( (lv_pseudoPage_3_0= rulepseudo_page ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:341:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:341:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:342:3: lv_pseudoPage_3_0= rulepseudo_page
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_rulepage705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:362:1: ( (lv_declarations_5_0= rulecss_declaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS||(LA10_0>=RULE_DASH && LA10_0<=RULE_ONE_NON_HEX_LETTER)||LA10_0==RULE_UNDERSCORE||(LA10_0>=50 && LA10_0<=51)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: (lv_declarations_5_0= rulecss_declaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: (lv_declarations_5_0= rulecss_declaration )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:364:3: lv_declarations_5_0= rulecss_declaration
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:380:3: (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:380:5: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulepage740); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:384:1: ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_WS||(LA11_0>=RULE_DASH && LA11_0<=RULE_ONE_NON_HEX_LETTER)||LA11_0==RULE_UNDERSCORE||(LA11_0>=50 && LA11_0<=51)) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:1: (lv_declarations_7_0= rulecss_declaration )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:1: (lv_declarations_7_0= rulecss_declaration )
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:386:3: lv_declarations_7_0= rulecss_declaration
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

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_rulepage776); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:414:1: entryRulepseudo_page returns [String current=null] : iv_rulepseudo_page= rulepseudo_page EOF ;
    public final String entryRulepseudo_page() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepseudo_page = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:415:2: (iv_rulepseudo_page= rulepseudo_page EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:416:2: iv_rulepseudo_page= rulepseudo_page EOF
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:423:1: rulepseudo_page returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_Identifier_1= ruleIdentifier ) ;
    public final AntlrDatatypeRuleToken rulepseudo_page() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:426:28: ( (kw= ':' this_Identifier_1= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:1: (kw= ':' this_Identifier_1= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:1: (kw= ':' this_Identifier_1= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:428:2: kw= ':' this_Identifier_1= ruleIdentifier
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulepseudo_page862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPseudo_pageAccess().getIdentifierParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulepseudo_page884);
            this_Identifier_1=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:452:1: entryRulemedia returns [EObject current=null] : iv_rulemedia= rulemedia EOF ;
    public final EObject entryRulemedia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemedia = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:453:2: (iv_rulemedia= rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:454:2: iv_rulemedia= rulemedia EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia929);
            iv_rulemedia=rulemedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia939); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:1: rulemedia returns [EObject current=null] : ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:464:28: ( ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:465:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:465:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:465:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:465:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:465:4: otherlv_0= '@media'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulemedia977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:470:7: otherlv_1= '@MEDIA'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulemedia995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:474:2: ( (lv_medialist_2_0= rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:475:1: (lv_medialist_2_0= rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:475:1: (lv_medialist_2_0= rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:476:3: lv_medialist_2_0= rulemedia_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia1017);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulemedia1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:496:1: ( (lv_rulesets_4_0= ruleruleset ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_HASHMARK||(LA14_0>=RULE_DASH && LA14_0<=RULE_ONE_NON_HEX_LETTER)||LA14_0==RULE_UNDERSCORE||LA14_0==28||LA14_0==31||(LA14_0>=37 && LA14_0<=40)||(LA14_0>=50 && LA14_0<=51)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:497:1: (lv_rulesets_4_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:497:1: (lv_rulesets_4_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:498:3: lv_rulesets_4_0= ruleruleset
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia1050);
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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_rulemedia1063); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:526:1: entryRulemedia_list returns [String current=null] : iv_rulemedia_list= rulemedia_list EOF ;
    public final String entryRulemedia_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedia_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:527:2: (iv_rulemedia_list= rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:528:2: iv_rulemedia_list= rulemedia_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedia_listRule()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list1100);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia_list.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list1111); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:535:1: rulemedia_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) ;
    public final AntlrDatatypeRuleToken rulemedia_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_medium_0 = null;

        AntlrDatatypeRuleToken this_medium_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:538:28: ( (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:539:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:539:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:540:5: this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list1158);
            this_medium_0=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_medium_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:550:1: (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:550:6: this_COMMA_1= RULE_COMMA this_medium_2= rulemedium
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list1179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list1206);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:576:1: entryRulemedium returns [String current=null] : iv_rulemedium= rulemedium EOF ;
    public final String entryRulemedium() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedium = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:577:2: (iv_rulemedium= rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:578:2: iv_rulemedium= rulemedium EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediumRule()); 
            }
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium1254);
            iv_rulemedium=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedium.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium1265); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:585:1: rulemedium returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken rulemedium() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:588:28: (this_Identifier_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:590:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMediumAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulemedium1311);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:608:1: entryRuleruleset returns [EObject current=null] : iv_ruleruleset= ruleruleset EOF ;
    public final EObject entryRuleruleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:609:2: (iv_ruleruleset= ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:610:2: iv_ruleruleset= ruleruleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset1355);
            iv_ruleruleset=ruleruleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleruleset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset1365); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:617:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:620:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:621:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:621:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:621:2: ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )* otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:621:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:622:1: (lv_selectors_0_0= ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:622:1: (lv_selectors_0_0= ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:623:3: lv_selectors_0_0= ruleselector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleselector_in_ruleruleset1411);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:639:2: (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:639:3: this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset1423); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:643:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:644:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:644:1: (lv_selectors_2_0= ruleselector )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:645:3: lv_selectors_2_0= ruleselector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset1443);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:661:4: (this_WS_3= RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:661:5: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleruleset1457); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleruleset1470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:669:1: ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS||(LA18_0>=RULE_DASH && LA18_0<=RULE_ONE_NON_HEX_LETTER)||LA18_0==RULE_UNDERSCORE||(LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:669:2: ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:669:2: ( (lv_declarations_5_0= rulecss_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:1: (lv_declarations_5_0= rulecss_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:1: (lv_declarations_5_0= rulecss_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:671:3: lv_declarations_5_0= rulecss_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1492);
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

            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleruleset1504); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleruleset1518); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:703:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:707:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:708:2: iv_ruleselector= ruleselector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1560);
            iv_ruleselector=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1570); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:718:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? ) ;
    public final EObject ruleselector() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        EObject lv_simpleselectors_0_0 = null;

        AntlrDatatypeRuleToken lv_combinator_1_0 = null;

        EObject lv_selector_3_0 = null;

        AntlrDatatypeRuleToken lv_combinator_5_0 = null;

        EObject lv_selector_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:722:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:723:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:723:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:723:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:723:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:724:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:724:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:725:3: lv_simpleselectors_0_0= rulesimple_selector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1620);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:741:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:741:3: ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:741:3: ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:741:4: ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:741:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:742:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:742:1: (lv_combinator_1_0= rulecombinator )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:3: lv_combinator_1_0= rulecombinator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1643);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:759:2: (this_WS_2= RULE_WS )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:759:3: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1655); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_2, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:763:3: ( (lv_selector_3_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:1: (lv_selector_3_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:1: (lv_selector_3_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:765:3: lv_selector_3_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1677);
                    lv_selector_3_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"selector",
                              		lv_selector_3_0, 
                              		"selector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:6: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:6: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:7: (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:7: (this_WS_4= RULE_WS )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_WS) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:8: this_WS_4= RULE_WS
                    	    {
                    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_4, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:786:3: ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_PLUS||(LA22_0>=43 && LA22_0<=44)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:786:4: ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:786:4: ( (lv_combinator_5_0= rulecombinator ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:787:1: (lv_combinator_5_0= rulecombinator )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:787:1: (lv_combinator_5_0= rulecombinator )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:788:3: lv_combinator_5_0= rulecombinator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecombinator_in_ruleselector1720);
                            lv_combinator_5_0=rulecombinator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"combinator",
                                      		lv_combinator_5_0, 
                                      		"combinator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:804:2: (this_WS_6= RULE_WS )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==RULE_WS) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:804:3: this_WS_6= RULE_WS
                            	    {
                            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1732); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_6, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:808:5: ( (lv_selector_7_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:809:1: (lv_selector_7_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:809:1: (lv_selector_7_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:810:3: lv_selector_7_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1756);
                    lv_selector_7_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"selector",
                              		lv_selector_7_0, 
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


    // $ANTLR start "entryRuleSimpleSelectorForNegation"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:837:1: entryRuleSimpleSelectorForNegation returns [EObject current=null] : iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF ;
    public final EObject entryRuleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectorForNegation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:838:2: (iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:839:2: iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleSelectorForNegation_in_entryRuleSimpleSelectorForNegation1799);
            iv_ruleSimpleSelectorForNegation=ruleSimpleSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSelectorForNegation1809); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSelectorForNegation"


    // $ANTLR start "ruleSimpleSelectorForNegation"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:846:1: ruleSimpleSelectorForNegation returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) ;
    public final EObject ruleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:849:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_DASH && LA27_0<=RULE_ONE_NON_HEX_LETTER)||LA27_0==RULE_UNDERSCORE||(LA27_0>=38 && LA27_0<=39)||(LA27_0>=50 && LA27_0<=51)) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_HASHMARK||LA27_0==28||LA27_0==31||LA27_0==37) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:851:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:851:1: (lv_element_0_0= ruleElementSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:852:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_ruleSimpleSelectorForNegation1857);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:869:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:869:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:870:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:870:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:871:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorForNegation1884);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:887:3: ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_HASHMARK||LA25_0==28||LA25_0==31||LA25_0==37) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:888:1: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:888:1: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:889:3: lv_subSelectors_2_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1906);
                    	    lv_subSelectors_2_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_2_0, 
                    	              		"SubSelectorForNegation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:6: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:6: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_HASHMARK) && (synpred1_InternalCssDsl())) {
                            alt26=1;
                        }
                        else if ( (LA26_0==37) && (synpred1_InternalCssDsl())) {
                            alt26=1;
                        }
                        else if ( (LA26_0==31) && (synpred1_InternalCssDsl())) {
                            alt26=1;
                        }
                        else if ( (LA26_0==28) && (synpred1_InternalCssDsl())) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:7: ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:911:1: (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:912:3: lv_subSelectors_3_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1945);
                    	    lv_subSelectors_3_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_3_0, 
                    	              		"SubSelectorForNegation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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
    // $ANTLR end "ruleSimpleSelectorForNegation"


    // $ANTLR start "entryRuleSubSelectorForNegation"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:936:1: entryRuleSubSelectorForNegation returns [EObject current=null] : iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF ;
    public final EObject entryRuleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelectorForNegation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:937:2: (iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:938:2: iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelectorForNegation_in_entryRuleSubSelectorForNegation1982);
            iv_ruleSubSelectorForNegation=ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelectorForNegation1992); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSelectorForNegation"


    // $ANTLR start "ruleSubSelectorForNegation"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:945:1: ruleSubSelectorForNegation returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) ;
    public final EObject ruleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClass_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:948:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:949:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:949:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case 31:
                {
                alt28=3;
                }
                break;
            case 28:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:950:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelectorForNegation2039);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:960:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelectorForNegation2066);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:970:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelectorForNegation2093);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:980:5: this_PseudoClass_3= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_ruleSubSelectorForNegation2120);
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
    // $ANTLR end "ruleSubSelectorForNegation"


    // $ANTLR start "entryRulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:996:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:997:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:998:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            }
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector2155);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_selector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector2165); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1005:1: rulesimple_selector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1008:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_DASH && LA32_0<=RULE_ONE_NON_HEX_LETTER)||LA32_0==RULE_UNDERSCORE||(LA32_0>=38 && LA32_0<=39)||(LA32_0>=50 && LA32_0<=51)) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_HASHMARK||LA32_0==28||LA32_0==31||LA32_0==37||LA32_0==40) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt29=2;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1010:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1010:1: (lv_element_0_0= ruleElementSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1011:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_rulesimple_selector2213);
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1028:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1028:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1029:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1029:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1030:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_rulesimple_selector2240);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1046:3: ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_HASHMARK||LA30_0==28||LA30_0==31||LA30_0==37||LA30_0==40) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1047:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1047:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1048:3: lv_subSelectors_2_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector2262);
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
                    	    break loop30;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1065:6: ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1065:6: ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_HASHMARK) && (synpred2_InternalCssDsl())) {
                            alt31=1;
                        }
                        else if ( (LA31_0==37) && (synpred2_InternalCssDsl())) {
                            alt31=1;
                        }
                        else if ( (LA31_0==31) && (synpred2_InternalCssDsl())) {
                            alt31=1;
                        }
                        else if ( (LA31_0==28) && (synpred2_InternalCssDsl())) {
                            alt31=1;
                        }
                        else if ( (LA31_0==40) && (synpred2_InternalCssDsl())) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1065:7: ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1070:1: (lv_subSelectors_3_0= ruleSubSelector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1071:3: lv_subSelectors_3_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector2301);
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
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1095:1: entryRuleSubSelector returns [EObject current=null] : iv_ruleSubSelector= ruleSubSelector EOF ;
    public final EObject entryRuleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1096:2: (iv_ruleSubSelector= ruleSubSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1097:2: iv_ruleSubSelector= ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_entryRuleSubSelector2338);
            iv_ruleSubSelector=ruleSubSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelector2348); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1104:1: ruleSubSelector returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) ;
    public final EObject ruleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClassOrFunc_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1107:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1108:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1108:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt33=1;
                }
                break;
            case 37:
                {
                alt33=2;
                }
                break;
            case 31:
                {
                alt33=3;
                }
                break;
            case 28:
            case 40:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1109:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelector2395);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1119:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelector2422);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1129:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelector2449);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1139:5: this_PseudoClassOrFunc_3= rulePseudoClassOrFunc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassOrFunc_in_ruleSubSelector2476);
                    this_PseudoClassOrFunc_3=rulePseudoClassOrFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClassOrFunc_3; 
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1155:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1156:2: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1157:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2511);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSelector2521); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1164:1: ruleAttributeSelector returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token lv_value_4_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1167:28: ( ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1168:1: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1168:1: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1168:2: () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1168:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAttributeSelector2567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1178:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1179:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1179:1: (lv_name_2_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1180:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeSelector2588);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1196:2: ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_INCLUDES && LA36_0<=RULE_DASHMATCH)||(LA36_0>=32 && LA36_0<=35)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1196:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1196:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1197:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1197:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1198:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1198:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    int alt34=6;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt34=1;
                        }
                        break;
                    case 33:
                        {
                        alt34=2;
                        }
                        break;
                    case 34:
                        {
                        alt34=3;
                        }
                        break;
                    case 35:
                        {
                        alt34=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt34=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt34=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1199:3: lv_op_3_1= '^='
                            {
                            lv_op_3_1=(Token)match(input,32,FOLLOW_32_in_ruleAttributeSelector2609); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1211:8: lv_op_3_2= '$='
                            {
                            lv_op_3_2=(Token)match(input,33,FOLLOW_33_in_ruleAttributeSelector2638); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1223:8: lv_op_3_3= '*='
                            {
                            lv_op_3_3=(Token)match(input,34,FOLLOW_34_in_ruleAttributeSelector2667); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1235:8: lv_op_3_4= '='
                            {
                            lv_op_3_4=(Token)match(input,35,FOLLOW_35_in_ruleAttributeSelector2696); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1247:8: lv_op_3_5= RULE_INCLUDES
                            {
                            lv_op_3_5=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2724); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1262:8: lv_op_3_6= RULE_DASHMATCH
                            {
                            lv_op_3_6=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2744); if (state.failed) return current;
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1280:2: ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1281:1: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1281:1: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1282:1: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1282:1: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_DASH && LA35_0<=RULE_ONE_NON_HEX_LETTER)||LA35_0==RULE_UNDERSCORE||(LA35_0>=50 && LA35_0<=51)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_STRING) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1283:3: lv_value_4_1= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeSelector2775);
                            lv_value_4_1=ruleIdentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_4_1, 
                                      		"Identifier");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1298:8: lv_value_4_2= RULE_STRING
                            {
                            lv_value_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeSelector2790); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleAttributeSelector2812); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1328:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1329:2: (iv_ruleClassSelector= ruleClassSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1330:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleClassSelector_in_entryRuleClassSelector2848);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSelector2858); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1337:1: ruleClassSelector returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1340:28: ( ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1341:1: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1341:1: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1341:2: () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1341:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1342:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassSelectorAccess().getClassSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleClassSelector2904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1351:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1352:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1352:1: (lv_name_2_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1353:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleClassSelector2925);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Identifier");
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
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1377:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1378:2: (iv_ruleElementSelector= ruleElementSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1379:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleElementSelector_in_entryRuleElementSelector2961);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementSelector2971); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:1: ruleElementSelector returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1389:28: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:2: () ( (lv_name_1_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1391:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1396:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1397:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1397:1: (lv_name_1_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1398:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleElementSelector3026);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Identifier");
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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1422:1: entryRuleUniversalSelector returns [EObject current=null] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final EObject entryRuleUniversalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1423:2: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1424:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector3062);
            iv_ruleUniversalSelector=ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniversalSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniversalSelector3072); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1431:1: ruleUniversalSelector returns [EObject current=null] : ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) ;
    public final EObject ruleUniversalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1434:28: ( ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1435:1: ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1435:1: ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1435:2: () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1435:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1436:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1441:2: ( (lv_namespace_1_0= rulecss_namespace_prefix ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_DASH && LA37_0<=RULE_ONE_NON_HEX_LETTER)||LA37_0==RULE_UNDERSCORE||LA37_0==39||(LA37_0>=50 && LA37_0<=51)) ) {
                alt37=1;
            }
            else if ( (LA37_0==38) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==39) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1442:1: (lv_namespace_1_0= rulecss_namespace_prefix )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1442:1: (lv_namespace_1_0= rulecss_namespace_prefix )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1443:3: lv_namespace_1_0= rulecss_namespace_prefix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUniversalSelectorAccess().getNamespaceCss_namespace_prefixParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector3127);
                    lv_namespace_1_0=rulecss_namespace_prefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUniversalSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"namespace",
                              		lv_namespace_1_0, 
                              		"css_namespace_prefix");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleUniversalSelector3140); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1471:1: entryRuleIdSelector returns [EObject current=null] : iv_ruleIdSelector= ruleIdSelector EOF ;
    public final EObject entryRuleIdSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1472:2: (iv_ruleIdSelector= ruleIdSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1473:2: iv_ruleIdSelector= ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleIdSelector_in_entryRuleIdSelector3176);
            iv_ruleIdSelector=ruleIdSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdSelector3186); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1480:1: ruleIdSelector returns [EObject current=null] : ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleIdSelector() throws RecognitionException {
        EObject current = null;

        Token this_HASHMARK_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1483:28: ( ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1484:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1484:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1484:2: () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1484:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdSelectorAccess().getIdSelectorAction_0(),
                          current);
                  
            }

            }

            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleIdSelector3231); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_1, grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1494:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1495:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1495:1: (lv_name_2_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1496:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleIdSelector3251);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Identifier");
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
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1520:1: entryRulecss_namespace_prefix returns [String current=null] : iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF ;
    public final String entryRulecss_namespace_prefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_namespace_prefix = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1521:2: (iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1522:2: iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_namespace_prefixRule()); 
            }
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix3288);
            iv_rulecss_namespace_prefix=rulecss_namespace_prefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_namespace_prefix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix3299); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1529:1: rulecss_namespace_prefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulecss_namespace_prefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1532:28: ( ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1533:1: ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1533:1: ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1533:2: (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1533:2: (this_Identifier_0= ruleIdentifier | kw= '*' )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_DASH && LA38_0<=RULE_ONE_NON_HEX_LETTER)||LA38_0==RULE_UNDERSCORE||(LA38_0>=50 && LA38_0<=51)) ) {
                alt38=1;
            }
            else if ( (LA38_0==38) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1534:5: this_Identifier_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCss_namespace_prefixAccess().getIdentifierParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulecss_namespace_prefix3347);
                    this_Identifier_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Identifier_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1546:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulecss_namespace_prefix3371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_39_in_rulecss_namespace_prefix3386); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1565:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1569:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1570:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_declarationRule()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration3432);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration3442); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1580:1: rulecss_declaration returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1584:28: ( ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:2: (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:2: (this_WS_0= RULE_WS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_WS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3483); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1589:3: ( (lv_property_1_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1590:1: (lv_property_1_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1590:1: (lv_property_1_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1591:3: lv_property_1_0= rulecss_property
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecss_property_in_rulecss_declaration3505);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:2: (this_WS_2= RULE_WS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_WS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3517); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulecss_declaration3530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCss_declarationAccess().getColonKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1615:1: ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1615:2: ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1620:1: (lv_valueTokens_4_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1621:3: lv_valueTokens_4_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCssTok_in_rulecss_declaration3561);
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
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1637:3: ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_IMPORTANT_SYM) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1638:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1638:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1639:3: lv_important_5_0= RULE_IMPORTANT_SYM
                    {
                    lv_important_5_0=(Token)match(input,RULE_IMPORTANT_SYM,FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3579); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1666:1: entryRulecss_property returns [EObject current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final EObject entryRulecss_property() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1667:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1668:2: iv_rulecss_property= rulecss_property EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_propertyRule()); 
            }
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3625);
            iv_rulecss_property=rulecss_property();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_property; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3635); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1675:1: rulecss_property returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject rulecss_property() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1678:28: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1679:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1679:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1679:2: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1679:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1680:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCss_propertyAccess().getCss_propertyAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1685:2: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1686:1: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1686:1: (lv_name_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1687:3: lv_name_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rulecss_property3690);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1711:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1712:2: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1713:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3727);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidPropertyIdent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent3738); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1720:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1723:28: (this_Identifier_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1725:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleValidPropertyIdent3784);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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


    // $ANTLR start "entryRulePseudoClassOrFunc"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1743:1: entryRulePseudoClassOrFunc returns [EObject current=null] : iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF ;
    public final EObject entryRulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassOrFunc = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1744:2: (iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1745:2: iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassOrFuncRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassOrFunc_in_entryRulePseudoClassOrFunc3828);
            iv_rulePseudoClassOrFunc=rulePseudoClassOrFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassOrFunc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassOrFunc3838); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassOrFunc"


    // $ANTLR start "rulePseudoClassOrFunc"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1752:1: rulePseudoClassOrFunc returns [EObject current=null] : (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) ;
    public final EObject rulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject this_PseudoClass_0 = null;

        EObject this_PseudoClassFunction_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1755:28: ( (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1756:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1756:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1757:5: this_PseudoClass_0= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_rulePseudoClassOrFunc3885);
                    this_PseudoClass_0=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClass_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1767:5: this_PseudoClassFunction_1= rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassFunction_in_rulePseudoClassOrFunc3912);
                    this_PseudoClassFunction_1=rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClassFunction_1; 
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
    // $ANTLR end "rulePseudoClassOrFunc"


    // $ANTLR start "entryRulePseudoClass"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1783:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1784:2: (iv_rulePseudoClass= rulePseudoClass EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1785:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClass_in_entryRulePseudoClass3947);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClass3957); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1792:1: rulePseudoClass returns [EObject current=null] : (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_PseudoClassName_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1795:28: ( (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1796:1: (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1796:1: (otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1796:3: otherlv_0= ':' (otherlv_1= ':' )? this_PseudoClassName_2= rulePseudoClassName
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePseudoClass3994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPseudoClassAccess().getColonKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1800:1: (otherlv_1= ':' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1800:3: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_rulePseudoClass4007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPseudoClassAccess().getColonKeyword_1());
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_rulePseudoClass4031);
            this_PseudoClassName_2=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PseudoClassName_2; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1821:1: entryRulePseudoClassName returns [EObject current=null] : iv_rulePseudoClassName= rulePseudoClassName EOF ;
    public final EObject entryRulePseudoClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1822:2: (iv_rulePseudoClassName= rulePseudoClassName EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1823:2: iv_rulePseudoClassName= rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName4066);
            iv_rulePseudoClassName=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassName4076); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1830:1: rulePseudoClassName returns [EObject current=null] : ( (lv_name_0_0= ruleIdentifier ) ) ;
    public final EObject rulePseudoClassName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1833:28: ( ( (lv_name_0_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1834:1: ( (lv_name_0_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1834:1: ( (lv_name_0_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1835:1: (lv_name_0_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1835:1: (lv_name_0_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1836:3: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPseudoClassNameAccess().getNameIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulePseudoClassName4121);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPseudoClassNameRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"Identifier");
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
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1860:1: entryRulePseudoClassFunction returns [EObject current=null] : iv_rulePseudoClassFunction= rulePseudoClassFunction EOF ;
    public final EObject entryRulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassFunction = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1861:2: (iv_rulePseudoClassFunction= rulePseudoClassFunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1862:2: iv_rulePseudoClassFunction= rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction4156);
            iv_rulePseudoClassFunction=rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassFunction4166); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1869:1: rulePseudoClassFunction returns [EObject current=null] : ( ( ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) ;
    public final EObject rulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_paramSelector_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1872:28: ( ( ( ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:1: ( ( ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:1: ( ( ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            else if ( (LA46_0==28) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:2: ( ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:2: ( ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:3: ( (lv_not_0_0= ':not(' ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1873:3: ( (lv_not_0_0= ':not(' ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1874:1: (lv_not_0_0= ':not(' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1874:1: (lv_not_0_0= ':not(' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1875:3: lv_not_0_0= ':not('
                    {
                    lv_not_0_0=(Token)match(input,40,FOLLOW_40_in_rulePseudoClassFunction4210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_not_0_0, grammarAccess.getPseudoClassFunctionAccess().getNotNotKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		setWithLastConsumed(current, "not", true, ":not(");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1888:2: ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1889:1: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1889:1: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1890:3: lv_paramSelector_1_0= ruleSimpleSelectorForNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleSelectorForNegation_in_rulePseudoClassFunction4244);
                    lv_paramSelector_1_0=ruleSimpleSelectorForNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"paramSelector",
                              		lv_paramSelector_1_0, 
                              		"SimpleSelectorForNegation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulePseudoClassFunction4256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:6: (otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:6: (otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:8: otherlv_3= ':' ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePseudoClassFunction4276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPseudoClassFunctionAccess().getColonKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1915:1: ( (lv_name_4_0= ruleIdentifier ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1916:1: (lv_name_4_0= ruleIdentifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1916:1: (lv_name_4_0= ruleIdentifier )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1917:3: lv_name_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulePseudoClassFunction4297);
                    lv_name_4_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_rulePseudoClassFunction4309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1937:1: ( (lv_params_6_0= ruleCssTok ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_WS)||LA45_0==RULE_HASHMARK||(LA45_0>=RULE_PLUS && LA45_0<=RULE_UNDERSCORE)||LA45_0==37||LA45_0==45||(LA45_0>=50 && LA45_0<=51)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1938:1: (lv_params_6_0= ruleCssTok )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1938:1: (lv_params_6_0= ruleCssTok )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1939:3: lv_params_6_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCssTok_in_rulePseudoClassFunction4330);
                    	    lv_params_6_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_6_0, 
                    	              		"CssTok");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_rulePseudoClassFunction4343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4());
                          
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
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1967:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1968:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1969:2: iv_rulecombinator= rulecombinator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator4381);
            iv_rulecombinator=rulecombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecombinator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator4392); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1976:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1979:28: ( (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1980:1: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1980:1: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt47=1;
                }
                break;
            case 43:
                {
                alt47=2;
                }
                break;
            case 44:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1980:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulecombinator4432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1989:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulecombinator4456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1996:2: kw= '~'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulecombinator4475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getTildeKeyword_2()); 
                          
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
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleSymbolTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2013:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2014:2: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2015:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4519);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok4529); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2022:1: ruleSymbolTok returns [EObject current=null] : ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2025:28: ( ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2026:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2026:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2026:2: () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2026:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2032:2: ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2033:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2033:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2034:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2034:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_COMMA) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_PERCENT) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2035:3: lv_symbol_1_1= RULE_COMMA
                    {
                    lv_symbol_1_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSymbolTok4582); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2050:8: lv_symbol_1_2= RULE_PERCENT
                    {
                    lv_symbol_1_2=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSymbolTok4602); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2076:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2077:2: (iv_ruleWSTok= ruleWSTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2078:2: iv_ruleWSTok= ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok4646);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWSTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok4656); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2085:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2088:28: ( ( () this_WS_1= RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:1: ( () this_WS_1= RULE_WS )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:1: ( () this_WS_1= RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:2: () this_WS_1= RULE_WS
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2090:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWSTokAccess().getWSTokAction_0(),
                          current);
                  
            }

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleWSTok4701); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2107:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2108:2: (iv_ruleStringTok= ruleStringTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2109:2: iv_ruleStringTok= ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok4736);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok4746); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2116:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2119:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2120:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2120:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2120:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2120:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2121:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTokAccess().getStringTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2126:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2127:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2127:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2128:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringTok4797); if (state.failed) return current;
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


    // $ANTLR start "entryRuleNumberTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2152:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2156:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2157:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok4844);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok4854); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2167:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_val_1_0= ruleNum ) ) ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2171:28: ( ( () ( (lv_val_1_0= ruleNum ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:1: ( () ( (lv_val_1_0= ruleNum ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:1: ( () ( (lv_val_1_0= ruleNum ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:2: () ( (lv_val_1_0= ruleNum ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2178:2: ( (lv_val_1_0= ruleNum ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2179:1: (lv_val_1_0= ruleNum )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2179:1: (lv_val_1_0= ruleNum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2180:3: lv_val_1_0= ruleNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNum_in_ruleNumberTok4913);
            lv_val_1_0=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberTokRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_1_0, 
                      		"Num");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2207:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2208:2: (iv_ruleUrlTok= ruleUrlTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2209:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok4953);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUrlTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok4963); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2216:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2219:28: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:2: () ( (lv_url_1_0= ruleURLType ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2221:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2226:2: ( (lv_url_1_0= ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2227:1: (lv_url_1_0= ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2227:1: (lv_url_1_0= ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2228:3: lv_url_1_0= ruleURLType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleURLType_in_ruleUrlTok5018);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2252:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2256:2: (iv_ruleColorTok= ruleColorTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2257:2: iv_ruleColorTok= ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok5060);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok5070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2267:1: ruleColorTok returns [EObject current=null] : ( () ( (lv_value_1_0= ruleHex ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2271:28: ( ( () ( (lv_value_1_0= ruleHex ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2272:1: ( () ( (lv_value_1_0= ruleHex ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2272:1: ( () ( (lv_value_1_0= ruleHex ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2272:2: () ( (lv_value_1_0= ruleHex ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2272:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2273:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColorTokAccess().getColorTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2278:2: ( (lv_value_1_0= ruleHex ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2279:1: (lv_value_1_0= ruleHex )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2279:1: (lv_value_1_0= ruleHex )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2280:3: lv_value_1_0= ruleHex
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHex_in_ruleColorTok5129);
            lv_value_1_0=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColorTokRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Hex");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleIdentifierOrFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2307:1: entryRuleIdentifierOrFuncTok returns [EObject current=null] : iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF ;
    public final EObject entryRuleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierOrFuncTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2311:2: (iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2312:2: iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierOrFuncTokRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierOrFuncTok_in_entryRuleIdentifierOrFuncTok5175);
            iv_ruleIdentifierOrFuncTok=ruleIdentifierOrFuncTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierOrFuncTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierOrFuncTok5185); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifierOrFuncTok"


    // $ANTLR start "ruleIdentifierOrFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2322:1: ruleIdentifierOrFuncTok returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) ;
    public final EObject ruleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2326:28: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2327:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2327:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2327:2: () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2327:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2328:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2333:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2334:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2334:1: (lv_name_1_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2335:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleIdentifierOrFuncTok5244);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdentifierOrFuncTokRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2351:2: ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2351:3: () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2351:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2352:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleIdentifierOrFuncTok5266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2361:1: ( (lv_params_4_0= ruleCssTok ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_WS)||LA49_0==RULE_HASHMARK||(LA49_0>=RULE_PLUS && LA49_0<=RULE_UNDERSCORE)||LA49_0==37||LA49_0==45||(LA49_0>=50 && LA49_0<=51)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2362:1: (lv_params_4_0= ruleCssTok )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2362:1: (lv_params_4_0= ruleCssTok )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2363:3: lv_params_4_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCssTok_in_ruleIdentifierOrFuncTok5287);
                    	    lv_params_4_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIdentifierOrFuncTokRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"CssTok");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleIdentifierOrFuncTok5300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3());
                          
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
    // $ANTLR end "ruleIdentifierOrFuncTok"


    // $ANTLR start "entryRuleCssTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2394:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2398:2: (iv_ruleCssTok= ruleCssTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2399:2: iv_ruleCssTok= ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok5348);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok5358); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2409:1: ruleCssTok returns [EObject current=null] : (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) ;
    public final EObject ruleCssTok() throws RecognitionException {
        EObject current = null;

        EObject this_IdentifierOrFuncTok_0 = null;

        EObject this_SymbolTok_1 = null;

        EObject this_WSTok_2 = null;

        EObject this_StringTok_3 = null;

        EObject this_NumberTok_4 = null;

        EObject this_UrlTok_5 = null;

        EObject this_ColorTok_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2413:28: ( (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2414:1: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2414:1: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            int alt51=7;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ONE_INT||LA51_1==37) ) {
                    alt51=5;
                }
                else if ( ((LA51_1>=RULE_ONE_HEX_LETTER && LA51_1<=RULE_ONE_NON_HEX_LETTER)||LA51_1==RULE_UNDERSCORE||(LA51_1>=50 && LA51_1<=51)) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case RULE_UNDERSCORE:
            case 50:
            case 51:
                {
                alt51=1;
                }
                break;
            case RULE_COMMA:
            case RULE_PERCENT:
                {
                alt51=2;
                }
                break;
            case RULE_WS:
                {
                alt51=3;
                }
                break;
            case RULE_STRING:
                {
                alt51=4;
                }
                break;
            case RULE_PLUS:
            case RULE_ONE_INT:
            case 37:
                {
                alt51=5;
                }
                break;
            case 45:
                {
                alt51=6;
                }
                break;
            case RULE_HASHMARK:
                {
                alt51=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2415:5: this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierOrFuncTok_in_ruleCssTok5409);
                    this_IdentifierOrFuncTok_0=ruleIdentifierOrFuncTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentifierOrFuncTok_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2425:5: this_SymbolTok_1= ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSymbolTok_in_ruleCssTok5436);
                    this_SymbolTok_1=ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SymbolTok_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2435:5: this_WSTok_2= ruleWSTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWSTok_in_ruleCssTok5463);
                    this_WSTok_2=ruleWSTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WSTok_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2445:5: this_StringTok_3= ruleStringTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringTok_in_ruleCssTok5490);
                    this_StringTok_3=ruleStringTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringTok_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2455:5: this_NumberTok_4= ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTok_in_ruleCssTok5517);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2465:5: this_UrlTok_5= ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUrlTok_in_ruleCssTok5544);
                    this_UrlTok_5=ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UrlTok_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2475:5: this_ColorTok_6= ruleColorTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColorTok_in_ruleCssTok5571);
                    this_ColorTok_6=ruleColorTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ColorTok_6; 
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


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2494:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2498:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2499:2: iv_ruleURLType= ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType5616);
            iv_ruleURLType=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType5626); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2509:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_url_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2513:28: ( (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2514:1: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2514:1: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2514:3: otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleURLType5667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2518:1: ( (lv_url_1_0= ruleValidURL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2519:1: (lv_url_1_0= ruleValidURL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2519:1: (lv_url_1_0= ruleValidURL )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2520:3: lv_url_1_0= ruleValidURL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidURL_in_ruleURLType5688);
            lv_url_1_0=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getURLTypeRule());
              	        }
                     		set(
                     			current, 
                     			"url",
                      		lv_url_1_0, 
                      		"ValidURL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleURLType5700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2());
                  
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


    // $ANTLR start "entryRuleValidURLSymbol"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2551:1: entryRuleValidURLSymbol returns [String current=null] : iv_ruleValidURLSymbol= ruleValidURLSymbol EOF ;
    public final String entryRuleValidURLSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURLSymbol = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2552:2: (iv_ruleValidURLSymbol= ruleValidURLSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2553:2: iv_ruleValidURLSymbol= ruleValidURLSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleValidURLSymbol_in_entryRuleValidURLSymbol5741);
            iv_ruleValidURLSymbol=ruleValidURLSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURLSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidURLSymbol5752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidURLSymbol"


    // $ANTLR start "ruleValidURLSymbol"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2560:1: ruleValidURLSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | kw= '.' | kw= '/' | this_DASH_3= RULE_DASH | this_PLUS_4= RULE_PLUS | kw= '?' | kw= '&' | kw= '=' | this_COMMA_8= RULE_COMMA | kw= '@' | kw= 'url' | kw= 'ur' ) ;
    public final AntlrDatatypeRuleToken ruleValidURLSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DASH_3=null;
        Token this_PLUS_4=null;
        Token this_COMMA_8=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2563:28: ( (kw= ':' | kw= '.' | kw= '/' | this_DASH_3= RULE_DASH | this_PLUS_4= RULE_PLUS | kw= '?' | kw= '&' | kw= '=' | this_COMMA_8= RULE_COMMA | kw= '@' | kw= 'url' | kw= 'ur' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2564:1: (kw= ':' | kw= '.' | kw= '/' | this_DASH_3= RULE_DASH | this_PLUS_4= RULE_PLUS | kw= '?' | kw= '&' | kw= '=' | this_COMMA_8= RULE_COMMA | kw= '@' | kw= 'url' | kw= 'ur' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2564:1: (kw= ':' | kw= '.' | kw= '/' | this_DASH_3= RULE_DASH | this_PLUS_4= RULE_PLUS | kw= '?' | kw= '&' | kw= '=' | this_COMMA_8= RULE_COMMA | kw= '@' | kw= 'url' | kw= 'ur' )
            int alt52=12;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt52=1;
                }
                break;
            case 37:
                {
                alt52=2;
                }
                break;
            case 46:
                {
                alt52=3;
                }
                break;
            case RULE_DASH:
                {
                alt52=4;
                }
                break;
            case RULE_PLUS:
                {
                alt52=5;
                }
                break;
            case 47:
                {
                alt52=6;
                }
                break;
            case 48:
                {
                alt52=7;
                }
                break;
            case 35:
                {
                alt52=8;
                }
                break;
            case RULE_COMMA:
                {
                alt52=9;
                }
                break;
            case 49:
                {
                alt52=10;
                }
                break;
            case 50:
                {
                alt52=11;
                }
                break;
            case 51:
                {
                alt52=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2565:2: kw= ':'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleValidURLSymbol5790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getColonKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2572:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleValidURLSymbol5809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2579:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValidURLSymbol5828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2585:10: this_DASH_3= RULE_DASH
                    {
                    this_DASH_3=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleValidURLSymbol5849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_3, grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2593:10: this_PLUS_4= RULE_PLUS
                    {
                    this_PLUS_4=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleValidURLSymbol5875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_4, grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2602:2: kw= '?'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleValidURLSymbol5899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2609:2: kw= '&'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleValidURLSymbol5918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2616:2: kw= '='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleValidURLSymbol5937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2622:10: this_COMMA_8= RULE_COMMA
                    {
                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleValidURLSymbol5958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_8, grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2631:2: kw= '@'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleValidURLSymbol5982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2638:2: kw= 'url'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleValidURLSymbol6001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getUrlKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2645:2: kw= 'ur'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleValidURLSymbol6020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getUrKeyword_11()); 
                          
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
    // $ANTLR end "ruleValidURLSymbol"


    // $ANTLR start "entryRuleValidURL"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2658:1: entryRuleValidURL returns [String current=null] : iv_ruleValidURL= ruleValidURL EOF ;
    public final String entryRuleValidURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURL = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2662:2: (iv_ruleValidURL= ruleValidURL EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2663:2: iv_ruleValidURL= ruleValidURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLRule()); 
            }
            pushFollow(FOLLOW_ruleValidURL_in_entryRuleValidURL6067);
            iv_ruleValidURL=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidURL6078); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidURL"


    // $ANTLR start "ruleValidURL"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2673:1: ruleValidURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_4= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleValidURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ONE_HEX_LETTER_2=null;
        Token this_ONE_NON_HEX_LETTER_3=null;
        Token this_ONE_INT_4=null;
        Token kw=null;
        Token this_PERCENT_10=null;
        Token this_ONE_INT_11=null;
        Token this_ONE_HEX_LETTER_12=null;
        Token this_ONE_INT_13=null;
        Token this_ONE_HEX_LETTER_14=null;
        AntlrDatatypeRuleToken this_ValidURLSymbol_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2677:28: ( (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_4= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2678:1: (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_4= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2678:1: (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_4= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) ) )+ )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_COMMA||(LA56_0>=RULE_PLUS && LA56_0<=RULE_ONE_INT)||LA56_0==28||LA56_0==35||LA56_0==37||(LA56_0>=46 && LA56_0<=56)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2678:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValidURL6122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getValidURLAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2686:6: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_4= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2686:6: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_4= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=11;
                        switch ( input.LA(1) ) {
                        case RULE_COMMA:
                        case RULE_PLUS:
                        case RULE_DASH:
                        case 28:
                        case 35:
                        case 37:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                            {
                            alt55=1;
                            }
                            break;
                        case RULE_ONE_HEX_LETTER:
                            {
                            alt55=2;
                            }
                            break;
                        case RULE_ONE_NON_HEX_LETTER:
                            {
                            alt55=3;
                            }
                            break;
                        case RULE_ONE_INT:
                            {
                            alt55=4;
                            }
                            break;
                        case 52:
                            {
                            alt55=5;
                            }
                            break;
                        case 53:
                            {
                            alt55=6;
                            }
                            break;
                        case 54:
                            {
                            alt55=7;
                            }
                            break;
                        case 55:
                            {
                            alt55=8;
                            }
                            break;
                        case 56:
                            {
                            alt55=9;
                            }
                            break;
                        case RULE_PERCENT:
                            {
                            alt55=10;
                            }
                            break;

                        }

                        switch (alt55) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2687:5: this_ValidURLSymbol_1= ruleValidURLSymbol
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleValidURLSymbol_in_ruleValidURL6156);
                    	    this_ValidURLSymbol_1=ruleValidURLSymbol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ValidURLSymbol_1);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2698:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
                    	    {
                    	    this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6182); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_HEX_LETTER_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2706:10: this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER
                    	    {
                    	    this_ONE_NON_HEX_LETTER_3=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleValidURL6208); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_NON_HEX_LETTER_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_NON_HEX_LETTER_3, grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2714:10: this_ONE_INT_4= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_4=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6234); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_4, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_3()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2723:2: kw= '\\\\ '
                    	    {
                    	    kw=(Token)match(input,52,FOLLOW_52_in_ruleValidURL6258); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2730:2: kw= '\\\\('
                    	    {
                    	    kw=(Token)match(input,53,FOLLOW_53_in_ruleValidURL6277); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_5()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2737:2: kw= '\\\\)'
                    	    {
                    	    kw=(Token)match(input,54,FOLLOW_54_in_ruleValidURL6296); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2744:2: kw= '\\\\\\''
                    	    {
                    	    kw=(Token)match(input,55,FOLLOW_55_in_ruleValidURL6315); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_7()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2751:2: kw= '\\\\\"'
                    	    {
                    	    kw=(Token)match(input,56,FOLLOW_56_in_ruleValidURL6334); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2757:6: (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2757:6: (this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2757:11: this_PERCENT_10= RULE_PERCENT (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER ) (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER )
                    	    {
                    	    this_PERCENT_10=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleValidURL6356); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_PERCENT_10);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_PERCENT_10, grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_9_0()); 
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2764:1: (this_ONE_INT_11= RULE_ONE_INT | this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER )
                    	    int alt53=2;
                    	    int LA53_0 = input.LA(1);

                    	    if ( (LA53_0==RULE_ONE_INT) ) {
                    	        alt53=1;
                    	    }
                    	    else if ( (LA53_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt53=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 53, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt53) {
                    	        case 1 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2764:6: this_ONE_INT_11= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_11=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6377); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_INT_11);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_INT_11, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_9_1_0()); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2772:10: this_ONE_HEX_LETTER_12= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_12=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6403); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_HEX_LETTER_12);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_HEX_LETTER_12, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_9_1_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2779:2: (this_ONE_INT_13= RULE_ONE_INT | this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER )
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( (LA54_0==RULE_ONE_INT) ) {
                    	        alt54=1;
                    	    }
                    	    else if ( (LA54_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt54=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 54, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt54) {
                    	        case 1 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2779:7: this_ONE_INT_13= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_13=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6425); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_INT_13);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_INT_13, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_9_2_0()); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2787:10: this_ONE_HEX_LETTER_14= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_14=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6451); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_HEX_LETTER_14);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_HEX_LETTER_14, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_9_2_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleValidURL"


    // $ANTLR start "entryRuleIdentifier"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2805:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2809:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2810:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier6511);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier6522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2820:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | kw= 'url' | kw= 'ur' ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        Token this_ONE_HEX_LETTER_2=null;
        Token this_ONE_NON_HEX_LETTER_3=null;
        Token kw=null;
        Token this_UNDERSCORE_6=null;
        Token this_DASH_7=null;
        Token this_ONE_HEX_LETTER_8=null;
        Token this_ONE_NON_HEX_LETTER_9=null;
        Token this_ONE_INT_10=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2824:28: ( ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | kw= 'url' | kw= 'ur' ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2825:1: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | kw= 'url' | kw= 'ur' ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2825:1: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | kw= 'url' | kw= 'ur' ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2825:2: (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | kw= 'url' | kw= 'ur' ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2825:2: (this_DASH_0= RULE_DASH )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_DASH) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2825:7: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleIdentifier6567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_0, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2832:3: (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | kw= 'url' | kw= 'ur' )
            int alt58=5;
            switch ( input.LA(1) ) {
            case RULE_UNDERSCORE:
                {
                alt58=1;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt58=2;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt58=3;
                }
                break;
            case 50:
                {
                alt58=4;
                }
                break;
            case 51:
                {
                alt58=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2832:8: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier6590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNDERSCORE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNDERSCORE_1, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2840:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
                    {
                    this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier6616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_HEX_LETTER_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2848:10: this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER
                    {
                    this_ONE_NON_HEX_LETTER_3=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier6642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_NON_HEX_LETTER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_NON_HEX_LETTER_3, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2857:2: kw= 'url'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleIdentifier6666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdentifierAccess().getUrlKeyword_1_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2864:2: kw= 'ur'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleIdentifier6685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdentifierAccess().getUrKeyword_1_4()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2869:2: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )*
            loop60:
            do {
                int alt60=2;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2869:3: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2879:5: (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' )
            	    int alt59=7;
            	    switch ( input.LA(1) ) {
            	    case RULE_UNDERSCORE:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case RULE_DASH:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case RULE_ONE_HEX_LETTER:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    case RULE_ONE_NON_HEX_LETTER:
            	        {
            	        alt59=4;
            	        }
            	        break;
            	    case RULE_ONE_INT:
            	        {
            	        alt59=5;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt59=6;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt59=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt59) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2879:10: this_UNDERSCORE_6= RULE_UNDERSCORE
            	            {
            	            this_UNDERSCORE_6=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier6764); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_UNDERSCORE_6);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_UNDERSCORE_6, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2887:10: this_DASH_7= RULE_DASH
            	            {
            	            this_DASH_7=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleIdentifier6790); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_DASH_7);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_DASH_7, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2895:10: this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_8=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier6816); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_HEX_LETTER_8);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_HEX_LETTER_8, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2903:10: this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER
            	            {
            	            this_ONE_NON_HEX_LETTER_9=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier6842); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_NON_HEX_LETTER_9);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_NON_HEX_LETTER_9, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2911:10: this_ONE_INT_10= RULE_ONE_INT
            	            {
            	            this_ONE_INT_10=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleIdentifier6868); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_INT_10);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_INT_10, grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2920:2: kw= 'url'
            	            {
            	            kw=(Token)match(input,50,FOLLOW_50_in_ruleIdentifier6892); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIdentifierAccess().getUrlKeyword_2_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2927:2: kw= 'ur'
            	            {
            	            kw=(Token)match(input,51,FOLLOW_51_in_ruleIdentifier6911); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIdentifierAccess().getUrKeyword_2_0_6()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNum"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2943:1: entryRuleNum returns [String current=null] : iv_ruleNum= ruleNum EOF ;
    public final String entryRuleNum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNum = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2947:2: (iv_ruleNum= ruleNum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2948:2: iv_ruleNum= ruleNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumRule()); 
            }
            pushFollow(FOLLOW_ruleNum_in_entryRuleNum6965);
            iv_ruleNum=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNum.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNum6976); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2958:1: ruleNum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleNum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        Token kw=null;
        Token this_ONE_INT_3=null;
        Token this_ONE_INT_4=null;
        Token this_ONE_INT_6=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2962:28: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2963:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2963:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2963:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2963:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_PLUS) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_DASH) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2963:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleNum7021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2971:10: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleNum7047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_1, grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2978:3: ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ONE_INT) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2978:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2978:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2979:2: kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNum7069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_0_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2984:1: ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ONE_INT) ) {
                            int LA62_2 = input.LA(2);

                            if ( (synpred5_InternalCssDsl()) ) {
                                alt62=1;
                            }


                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2984:2: ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_3=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7090); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_3, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:6: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:6: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:7: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:7: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ONE_INT) ) {
                            int LA63_2 = input.LA(2);

                            if ( (synpred6_InternalCssDsl()) ) {
                                alt63=1;
                            }


                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:8: ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_4=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7126); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_4, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:3: ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==37) ) {
                        int LA65_1 = input.LA(2);

                        if ( (LA65_1==RULE_ONE_INT) ) {
                            int LA65_3 = input.LA(3);

                            if ( (synpred7_InternalCssDsl()) ) {
                                alt65=1;
                            }
                        }
                    }
                    switch (alt65) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:4: ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:4: ( ( '.' )=>kw= '.' )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:5: ( '.' )=>kw= '.'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleNum7156); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0()); 
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3007:2: ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            int cnt64=0;
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==RULE_ONE_INT) ) {
                                    int LA64_2 = input.LA(2);

                                    if ( (synpred8_InternalCssDsl()) ) {
                                        alt64=1;
                                    }


                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3007:3: ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT
                            	    {
                            	    this_ONE_INT_6=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7178); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		current.merge(this_ONE_INT_6);
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_ONE_INT_6, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt64 >= 1 ) break loop64;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(64, input);
                                        throw eee;
                                }
                                cnt64++;
                            } while (true);


                            }
                            break;

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
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleHex"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3025:1: entryRuleHex returns [String current=null] : iv_ruleHex= ruleHex EOF ;
    public final String entryRuleHex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHex = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3026:2: (iv_ruleHex= ruleHex EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3027:2: iv_ruleHex= ruleHex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexRule()); 
            }
            pushFollow(FOLLOW_ruleHex_in_entryRuleHex7234);
            iv_ruleHex=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHex.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHex7245); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHex"


    // $ANTLR start "ruleHex"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3034:1: ruleHex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleHex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASHMARK_0=null;
        Token this_ONE_INT_1=null;
        Token this_ONE_HEX_LETTER_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3037:28: ( (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3038:1: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3038:1: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3038:6: this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            {
            this_HASHMARK_0=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleHex7285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HASHMARK_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_0, grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3045:1: ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ONE_HEX_LETTER) ) {
                    int LA68_2 = input.LA(2);

                    if ( (synpred9_InternalCssDsl()) ) {
                        alt68=1;
                    }


                }
                else if ( (LA68_0==RULE_ONE_INT) ) {
                    int LA68_3 = input.LA(2);

                    if ( (synpred9_InternalCssDsl()) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3045:2: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3046:30: (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_ONE_INT) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==RULE_ONE_HEX_LETTER) ) {
            	        alt67=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3046:35: this_ONE_INT_1= RULE_ONE_INT
            	            {
            	            this_ONE_INT_1=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleHex7322); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_INT_1);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_INT_1, grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3054:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleHex7348); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_HEX_LETTER_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
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
    // $ANTLR end "ruleHex"

    // $ANTLR start synpred1_InternalCssDsl
    public final void synpred1_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:7: ( ( ruleSubSelectorForNegation ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:907:1: ( ruleSubSelectorForNegation )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:907:1: ( ruleSubSelectorForNegation )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:908:1: ruleSubSelectorForNegation
        {
        pushFollow(FOLLOW_ruleSubSelectorForNegation_in_synpred1_InternalCssDsl1928);
        ruleSubSelectorForNegation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCssDsl

    // $ANTLR start synpred2_InternalCssDsl
    public final void synpred2_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1065:7: ( ( ruleSubSelector ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1066:1: ( ruleSubSelector )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1066:1: ( ruleSubSelector )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1067:1: ruleSubSelector
        {
        pushFollow(FOLLOW_ruleSubSelector_in_synpred2_InternalCssDsl2284);
        ruleSubSelector();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCssDsl

    // $ANTLR start synpred3_InternalCssDsl
    public final void synpred3_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1615:2: ( ( ruleCssTok ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1616:1: ( ruleCssTok )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1616:1: ( ruleCssTok )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1617:1: ruleCssTok
        {
        pushFollow(FOLLOW_ruleCssTok_in_synpred3_InternalCssDsl3544);
        ruleCssTok();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCssDsl

    // $ANTLR start synpred4_InternalCssDsl
    public final void synpred4_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2869:3: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2869:4: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' )
        {
        if ( (input.LA(1)>=RULE_DASH && input.LA(1)<=RULE_UNDERSCORE)||(input.LA(1)>=50 && input.LA(1)<=51) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred4_InternalCssDsl

    // $ANTLR start synpred5_InternalCssDsl
    public final void synpred5_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2984:2: ( RULE_ONE_INT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2984:4: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred5_InternalCssDsl7081); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCssDsl

    // $ANTLR start synpred6_InternalCssDsl
    public final void synpred6_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:8: ( RULE_ONE_INT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2992:10: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred6_InternalCssDsl7117); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCssDsl

    // $ANTLR start synpred7_InternalCssDsl
    public final void synpred7_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:5: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3000:2: '.'
        {
        match(input,37,FOLLOW_37_in_synpred7_InternalCssDsl7147); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalCssDsl

    // $ANTLR start synpred8_InternalCssDsl
    public final void synpred8_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3007:3: ( RULE_ONE_INT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3007:5: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred8_InternalCssDsl7169); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalCssDsl

    // $ANTLR start synpred9_InternalCssDsl
    public final void synpred9_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3045:2: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3045:3: ( RULE_ONE_INT | RULE_ONE_HEX_LETTER )
        {
        if ( input.LA(1)==RULE_ONE_HEX_LETTER||input.LA(1)==RULE_ONE_INT ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred9_InternalCssDsl

    // Delegated rules

    public final boolean synpred7_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred2_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA23_eotS =
        "\5\uffff";
    static final String DFA23_eofS =
        "\1\3\4\uffff";
    static final String DFA23_minS =
        "\1\5\1\uffff\1\6\2\uffff";
    static final String DFA23_maxS =
        "\1\54\1\uffff\1\63\2\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA23_specialS =
        "\5\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\1\2\4\uffff\1\1\16\uffff\1\3\20\uffff\2\1",
            "",
            "\1\2\2\uffff\1\4\1\uffff\1\4\1\uffff\3\4\1\uffff\1\4\10\uffff"+
            "\1\3\1\uffff\1\4\2\uffff\1\4\5\uffff\4\4\2\uffff\2\4\5\uffff"+
            "\2\4",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "741:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?";
        }
    }
    static final String DFA24_eotS =
        "\20\uffff";
    static final String DFA24_eofS =
        "\2\uffff\5\17\1\uffff\7\17\1\uffff";
    static final String DFA24_minS =
        "\1\15\1\16\5\11\1\uffff\7\11\1\uffff";
    static final String DFA24_maxS =
        "\7\63\1\uffff\7\63\1\uffff";
    static final String DFA24_acceptS =
        "\7\uffff\1\2\7\uffff\1\1";
    static final String DFA24_specialS =
        "\20\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\3\1\4\1\uffff\1\2\24\uffff\2\7\12\uffff\1\5\1\6",
            "\1\3\1\4\1\uffff\1\2\40\uffff\1\5\1\6",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            "\1\17\3\uffff\1\11\1\12\1\13\1\14\1\10\12\uffff\1\17\2\uffff"+
            "\1\17\5\uffff\1\17\1\uffff\1\7\1\uffff\1\17\10\uffff\1\15\1"+
            "\16",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "850:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String DFA29_eotS =
        "\20\uffff";
    static final String DFA29_eofS =
        "\2\uffff\5\17\1\uffff\7\17\1\uffff";
    static final String DFA29_minS =
        "\1\15\1\16\5\5\1\uffff\7\5\1\uffff";
    static final String DFA29_maxS =
        "\7\63\1\uffff\7\63\1\uffff";
    static final String DFA29_acceptS =
        "\7\uffff\1\2\7\uffff\1\1";
    static final String DFA29_specialS =
        "\20\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\3\1\4\1\uffff\1\2\24\uffff\2\7\12\uffff\1\5\1\6",
            "\1\3\1\4\1\uffff\1\2\40\uffff\1\5\1\6",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            "\2\17\2\uffff\1\17\1\uffff\1\17\1\uffff\1\11\1\12\1\13\1\14"+
            "\1\10\10\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5\uffff\1\17\1"+
            "\uffff\1\7\1\17\2\uffff\2\17\5\uffff\1\15\1\16",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1009:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String DFA41_eotS =
        "\21\uffff";
    static final String DFA41_eofS =
        "\1\1\20\uffff";
    static final String DFA41_minS =
        "\1\4\20\uffff";
    static final String DFA41_maxS =
        "\1\63\20\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\17\1";
    static final String DFA41_specialS =
        "\1\0\20\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\13\1\10\1\12\2\uffff\1\20\1\1\1\14\1\11\1\2\1\4\1\5\1\16"+
            "\1\3\3\uffff\1\1\5\uffff\1\1\11\uffff\1\15\7\uffff\1\17\4\uffff"+
            "\1\6\1\7",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1615:1: ( ( ( ruleCssTok ) )=> (lv_valueTokens_4_0= ruleCssTok ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==EOF||LA41_0==RULE_IMPORTANT_SYM||LA41_0==21||LA41_0==27) ) {s = 1;}

                        else if ( (LA41_0==RULE_DASH) && (synpred3_InternalCssDsl())) {s = 2;}

                        else if ( (LA41_0==RULE_UNDERSCORE) && (synpred3_InternalCssDsl())) {s = 3;}

                        else if ( (LA41_0==RULE_ONE_HEX_LETTER) && (synpred3_InternalCssDsl())) {s = 4;}

                        else if ( (LA41_0==RULE_ONE_NON_HEX_LETTER) && (synpred3_InternalCssDsl())) {s = 5;}

                        else if ( (LA41_0==50) && (synpred3_InternalCssDsl())) {s = 6;}

                        else if ( (LA41_0==51) && (synpred3_InternalCssDsl())) {s = 7;}

                        else if ( (LA41_0==RULE_COMMA) && (synpred3_InternalCssDsl())) {s = 8;}

                        else if ( (LA41_0==RULE_PERCENT) && (synpred3_InternalCssDsl())) {s = 9;}

                        else if ( (LA41_0==RULE_WS) && (synpred3_InternalCssDsl())) {s = 10;}

                        else if ( (LA41_0==RULE_STRING) && (synpred3_InternalCssDsl())) {s = 11;}

                        else if ( (LA41_0==RULE_PLUS) && (synpred3_InternalCssDsl())) {s = 12;}

                        else if ( (LA41_0==37) && (synpred3_InternalCssDsl())) {s = 13;}

                        else if ( (LA41_0==RULE_ONE_INT) && (synpred3_InternalCssDsl())) {s = 14;}

                        else if ( (LA41_0==45) && (synpred3_InternalCssDsl())) {s = 15;}

                        else if ( (LA41_0==RULE_HASHMARK) && (synpred3_InternalCssDsl())) {s = 16;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\21\uffff";
    static final String DFA43_eofS =
        "\4\uffff\5\11\1\uffff\7\11";
    static final String DFA43_minS =
        "\1\34\1\15\1\uffff\1\16\5\5\1\uffff\7\5";
    static final String DFA43_maxS =
        "\1\50\1\63\1\uffff\6\63\1\uffff\7\63";
    static final String DFA43_acceptS =
        "\2\uffff\1\2\6\uffff\1\1\7\uffff";
    static final String DFA43_specialS =
        "\21\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\13\uffff\1\2",
            "\1\3\1\5\1\6\1\uffff\1\4\12\uffff\1\11\25\uffff\1\7\1\10",
            "",
            "\1\5\1\6\1\uffff\1\4\40\uffff\1\7\1\10",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20",
            "\2\11\2\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\12\10\uffff\1\11\1\uffff\1\11\2\uffff\1\11\5\uffff\1\11\2"+
            "\uffff\1\11\1\uffff\1\2\2\11\5\uffff\1\17\1\20"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1756:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )";
        }
    }
    static final String DFA60_eotS =
        "\12\uffff";
    static final String DFA60_eofS =
        "\1\1\11\uffff";
    static final String DFA60_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA60_maxS =
        "\1\63\1\uffff\7\0\1\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA60_specialS =
        "\2\uffff\1\1\1\6\1\3\1\0\1\4\1\2\1\5\1\uffff}>";
    static final String[] DFA60_transitionS = {
            "\11\1\1\2\1\4\1\5\1\10\1\3\3\uffff\1\1\4\uffff\3\1\2\uffff\7"+
            "\1\1\uffff\7\1\4\uffff\1\6\1\7",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "()* loopback of 2869:2: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | 'url' | 'ur' ) )=> (this_UNDERSCORE_6= RULE_UNDERSCORE | this_DASH_7= RULE_DASH | this_ONE_HEX_LETTER_8= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_9= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_10= RULE_ONE_INT | kw= 'url' | kw= 'ur' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCssDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rulestylesheet131 = new BitSet(new long[]{0x000C01E0F3C2E202L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rulestylesheet153 = new BitSet(new long[]{0x000C01E0F3C2E202L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet176 = new BitSet(new long[]{0x000C01E0F302E202L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet203 = new BitSet(new long[]{0x000C01E0F302E202L});
    public static final BitSet FOLLOW_rulepage_in_rulestylesheet230 = new BitSet(new long[]{0x000C01E0F302E202L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulecharset316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_rulecharset334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecharset352 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulecharset369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleimportExpression453 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_23_in_ruleimportExpression471 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleimportExpression490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleimportExpression524 = new BitSet(new long[]{0x000C00000022E000L});
    public static final BitSet FOLLOW_rulemedia_list_in_ruleimportExpression544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleimportExpression559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulepage652 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_25_in_rulepage670 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rulepage692 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulepage705 = new BitSet(new long[]{0x000C00000822E040L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage726 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_rulepage740 = new BitSet(new long[]{0x000C00000822E040L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage761 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_rulepage776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulepseudo_page862 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulepseudo_page884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulemedia977 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_30_in_rulemedia995 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia1017 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulemedia1029 = new BitSet(new long[]{0x000C01E09802E200L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia1050 = new BitSet(new long[]{0x000C01E09802E200L});
    public static final BitSet FOLLOW_27_in_rulemedia1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1158 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulemedia_list1179 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1206 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium1254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulemedium1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1411 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1423 = new BitSet(new long[]{0x000C01E09002E200L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1443 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleruleset1457 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26_in_ruleruleset1470 = new BitSet(new long[]{0x000C00000802E040L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1492 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleruleset1504 = new BitSet(new long[]{0x000C00000802E040L});
    public static final BitSet FOLLOW_27_in_ruleruleset1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1620 = new BitSet(new long[]{0x0000180000000842L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1643 = new BitSet(new long[]{0x000C01E09002E240L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1655 = new BitSet(new long[]{0x000C01E09002E240L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1697 = new BitSet(new long[]{0x000C19E09002EA40L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1720 = new BitSet(new long[]{0x000C01E09002E240L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1732 = new BitSet(new long[]{0x000C01E09002E240L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSelectorForNegation_in_entryRuleSimpleSelectorForNegation1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSelectorForNegation1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_ruleSimpleSelectorForNegation1857 = new BitSet(new long[]{0x0000002090000202L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorForNegation1884 = new BitSet(new long[]{0x0000002090000202L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1906 = new BitSet(new long[]{0x0000002090000202L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1945 = new BitSet(new long[]{0x0000002090000202L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_entryRuleSubSelectorForNegation1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelectorForNegation1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelectorForNegation2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelectorForNegation2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelectorForNegation2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_ruleSubSelectorForNegation2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector2155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_rulesimple_selector2213 = new BitSet(new long[]{0x000C01E09002E202L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_rulesimple_selector2240 = new BitSet(new long[]{0x000C01E09002E202L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector2262 = new BitSet(new long[]{0x000C01E09002E202L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector2301 = new BitSet(new long[]{0x000C01E09002E202L});
    public static final BitSet FOLLOW_ruleSubSelector_in_entryRuleSubSelector2338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelector2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelector2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelector2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelector2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassOrFunc_in_ruleSubSelector2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSelector2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAttributeSelector2567 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeSelector2588 = new BitSet(new long[]{0x0000001F00000180L});
    public static final BitSet FOLLOW_32_in_ruleAttributeSelector2609 = new BitSet(new long[]{0x000C00000002E010L});
    public static final BitSet FOLLOW_33_in_ruleAttributeSelector2638 = new BitSet(new long[]{0x000C00000002E010L});
    public static final BitSet FOLLOW_34_in_ruleAttributeSelector2667 = new BitSet(new long[]{0x000C00000002E010L});
    public static final BitSet FOLLOW_35_in_ruleAttributeSelector2696 = new BitSet(new long[]{0x000C00000002E010L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2724 = new BitSet(new long[]{0x000C00000002E010L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2744 = new BitSet(new long[]{0x000C00000002E010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeSelector2775 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeSelector2790 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAttributeSelector2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_entryRuleClassSelector2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSelector2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClassSelector2904 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleClassSelector2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_entryRuleElementSelector2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementSelector2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleElementSelector3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniversalSelector3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector3127 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUniversalSelector3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_entryRuleIdSelector3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdSelector3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleIdSelector3231 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIdSelector3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix3288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulecss_namespace_prefix3347 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38_in_rulecss_namespace_prefix3371 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulecss_namespace_prefix3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration3432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3483 = new BitSet(new long[]{0x000C00000002E040L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_declaration3505 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3517 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_28_in_rulecss_declaration3530 = new BitSet(new long[]{0x000C20200003FA70L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulecss_declaration3561 = new BitSet(new long[]{0x000C20200003FE72L});
    public static final BitSet FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rulecss_property3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleValidPropertyIdent3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassOrFunc_in_entryRulePseudoClassOrFunc3828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassOrFunc3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_rulePseudoClassOrFunc3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_rulePseudoClassOrFunc3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_entryRulePseudoClass3947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClass3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePseudoClass3994 = new BitSet(new long[]{0x000C00001002E000L});
    public static final BitSet FOLLOW_28_in_rulePseudoClass4007 = new BitSet(new long[]{0x000C00001002E000L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_rulePseudoClass4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName4066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassName4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePseudoClassName4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction4156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassFunction4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePseudoClassFunction4210 = new BitSet(new long[]{0x000C00E09002E200L});
    public static final BitSet FOLLOW_ruleSimpleSelectorForNegation_in_rulePseudoClassFunction4244 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePseudoClassFunction4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePseudoClassFunction4276 = new BitSet(new long[]{0x000C00000002E000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePseudoClassFunction4297 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePseudoClassFunction4309 = new BitSet(new long[]{0x000C22200003FA70L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulePseudoClassFunction4330 = new BitSet(new long[]{0x000C22200003FA70L});
    public static final BitSet FOLLOW_41_in_rulePseudoClassFunction4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator4381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulecombinator4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulecombinator4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulecombinator4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSymbolTok4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSymbolTok4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok4646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleWSTok4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok4736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringTok4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNum_in_ruleNumberTok4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok4953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleUrlTok5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok5060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHex_in_ruleColorTok5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierOrFuncTok_in_entryRuleIdentifierOrFuncTok5175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrFuncTok5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIdentifierOrFuncTok5244 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleIdentifierOrFuncTok5266 = new BitSet(new long[]{0x000C20200003FA70L});
    public static final BitSet FOLLOW_ruleCssTok_in_ruleIdentifierOrFuncTok5287 = new BitSet(new long[]{0x000C22200003FA70L});
    public static final BitSet FOLLOW_41_in_ruleIdentifierOrFuncTok5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierOrFuncTok_in_ruleCssTok5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_ruleCssTok5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_ruleCssTok5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_ruleCssTok5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_ruleCssTok5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_ruleCssTok5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_ruleCssTok5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType5616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleURLType5667 = new BitSet(new long[]{0x01FFC0281001F830L});
    public static final BitSet FOLLOW_ruleValidURL_in_ruleURLType5688 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleURLType5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURLSymbol_in_entryRuleValidURLSymbol5741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidURLSymbol5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleValidURLSymbol5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleValidURLSymbol5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValidURLSymbol5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleValidURLSymbol5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleValidURLSymbol5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValidURLSymbol5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValidURLSymbol5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleValidURLSymbol5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleValidURLSymbol5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValidURLSymbol5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValidURLSymbol6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValidURLSymbol6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURL_in_entryRuleValidURL6067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidURL6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValidURL6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURLSymbol_in_ruleValidURL6156 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6182 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleValidURL6208 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6234 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_52_in_ruleValidURL6258 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_53_in_ruleValidURL6277 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_54_in_ruleValidURL6296 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_55_in_ruleValidURL6315 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_56_in_ruleValidURL6334 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleValidURL6356 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6377 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6403 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6425 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6451 = new BitSet(new long[]{0x01FFC0281001F822L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier6511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleIdentifier6567 = new BitSet(new long[]{0x000C00000002C000L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier6590 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier6616 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier6642 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_50_in_ruleIdentifier6666 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_51_in_ruleIdentifier6685 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier6764 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleIdentifier6790 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier6816 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier6842 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleIdentifier6868 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_50_in_ruleIdentifier6892 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_51_in_ruleIdentifier6911 = new BitSet(new long[]{0x000C00000003E002L});
    public static final BitSet FOLLOW_ruleNum_in_entryRuleNum6965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNum6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleNum7021 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleNum7047 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_37_in_ruleNum7069 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7090 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7126 = new BitSet(new long[]{0x0000002000010002L});
    public static final BitSet FOLLOW_37_in_ruleNum7156 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7178 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleHex_in_entryRuleHex7234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHex7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleHex7285 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleHex7322 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleHex7348 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_synpred1_InternalCssDsl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelector_in_synpred2_InternalCssDsl2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_synpred3_InternalCssDsl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalCssDsl6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred5_InternalCssDsl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred6_InternalCssDsl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred7_InternalCssDsl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred8_InternalCssDsl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred9_InternalCssDsl7301 = new BitSet(new long[]{0x0000000000000002L});

}