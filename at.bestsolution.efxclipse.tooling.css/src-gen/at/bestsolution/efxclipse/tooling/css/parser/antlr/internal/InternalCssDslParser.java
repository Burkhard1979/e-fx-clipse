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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_COLON", "RULE_COMMA", "RULE_WS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_HASHMARK", "RULE_IMPORTANT_SYM", "RULE_PLUS", "RULE_PERCENT", "RULE_DASH", "RULE_UNDERSCORE", "RULE_ONE_HEX_LETTER", "RULE_ONE_NON_HEX_LETTER", "RULE_ONE_INT", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "';'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'{'", "'}'", "'@media'", "'@MEDIA'", "'['", "'^='", "'$='", "'*='", "'='", "']'", "'.'", "'*'", "'|'", "')'", "'('", "'not('", "'>'", "'~'", "'url('", "'/'", "'?'", "'@'", "'!'", "'$'", "'&'", "'not'", "'no'", "'url'", "'ur'", "'\\\\ '", "'\\\\('", "'\\\\)'", "'\\\\\\''", "'\\\\\"'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=8;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ONE_INT=18;
    public static final int RULE_PERCENT=13;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ONE_NON_HEX_LETTER=17;
    public static final int T__59=59;
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
    public static final int RULE_UNDERSCORE=15;
    public static final int RULE_PLUS=12;
    public static final int RULE_ONE_HEX_LETTER=16;
    public static final int RULE_COMMA=6;
    public static final int RULE_HASHMARK=10;
    public static final int RULE_ML_COMMENT=19;
    public static final int RULE_DASHMATCH=9;
    public static final int T__30=30;
    public static final int RULE_COLON=5;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_IMPORTANT_SYM=11;
    public static final int RULE_WS=7;
    public static final int RULE_DASH=14;

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

            if ( ((LA1_0>=20 && LA1_0<=21)) ) {
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

                if ( ((LA2_0>=23 && LA2_0<=24)) ) {
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
                case RULE_COLON:
                case RULE_HASHMARK:
                case RULE_DASH:
                case RULE_UNDERSCORE:
                case RULE_ONE_HEX_LETTER:
                case RULE_ONE_NON_HEX_LETTER:
                case 31:
                case 37:
                case 38:
                case 39:
                case 52:
                case 53:
                case 54:
                case 55:
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
                case 25:
                case 26:
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

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
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
                    otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulecharset316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:198:7: otherlv_1= '@CHARSET'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulecharset334); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_rulecharset369); if (state.failed) return current;
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

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
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
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleimportExpression453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:250:7: otherlv_1= '@IMPORT'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleimportExpression471); if (state.failed) return current;
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

                    if ( ((LA6_0>=RULE_DASH && LA6_0<=RULE_ONE_NON_HEX_LETTER)||(LA6_0>=52 && LA6_0<=55)) ) {
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleimportExpression559); if (state.failed) return current;
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

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
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
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulepage652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:336:7: otherlv_2= '@PAGE'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulepage670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getPAGEKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:340:2: ( (lv_pseudoPage_3_0= rulepseudo_page ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COLON) ) {
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_rulepage705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:362:1: ( (lv_declarations_5_0= rulecss_declaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS||(LA10_0>=RULE_DASH && LA10_0<=RULE_ONE_NON_HEX_LETTER)||(LA10_0>=52 && LA10_0<=55)) ) {
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

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:380:5: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulepage740); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:384:1: ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_WS||(LA11_0>=RULE_DASH && LA11_0<=RULE_ONE_NON_HEX_LETTER)||(LA11_0>=52 && LA11_0<=55)) ) {
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

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_rulepage776); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:423:1: rulepseudo_page returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier ) ;
    public final AntlrDatatypeRuleToken rulepseudo_page() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_0=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:426:28: ( (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:1: (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:1: (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:6: this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulepseudo_page864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COLON_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_0, grammarAccess.getPseudo_pageAccess().getCOLONTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPseudo_pageAccess().getIdentifierParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulepseudo_page891);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:453:1: entryRulemedia returns [EObject current=null] : iv_rulemedia= rulemedia EOF ;
    public final EObject entryRulemedia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemedia = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:454:2: (iv_rulemedia= rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:455:2: iv_rulemedia= rulemedia EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia936);
            iv_rulemedia=rulemedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia946); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:1: rulemedia returns [EObject current=null] : ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:465:28: ( ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:466:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:466:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:466:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:466:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' )
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:466:4: otherlv_0= '@media'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulemedia984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:471:7: otherlv_1= '@MEDIA'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulemedia1002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:475:2: ( (lv_medialist_2_0= rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:476:1: (lv_medialist_2_0= rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:476:1: (lv_medialist_2_0= rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:477:3: lv_medialist_2_0= rulemedia_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia1024);
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulemedia1036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:497:1: ( (lv_rulesets_4_0= ruleruleset ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COLON||LA14_0==RULE_HASHMARK||(LA14_0>=RULE_DASH && LA14_0<=RULE_ONE_NON_HEX_LETTER)||LA14_0==31||(LA14_0>=37 && LA14_0<=39)||(LA14_0>=52 && LA14_0<=55)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:498:1: (lv_rulesets_4_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:498:1: (lv_rulesets_4_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:499:3: lv_rulesets_4_0= ruleruleset
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia1057);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_rulemedia1070); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:527:1: entryRulemedia_list returns [String current=null] : iv_rulemedia_list= rulemedia_list EOF ;
    public final String entryRulemedia_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedia_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:528:2: (iv_rulemedia_list= rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:529:2: iv_rulemedia_list= rulemedia_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedia_listRule()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list1107);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia_list.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list1118); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:536:1: rulemedia_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) ;
    public final AntlrDatatypeRuleToken rulemedia_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_medium_0 = null;

        AntlrDatatypeRuleToken this_medium_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:539:28: ( (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:540:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:540:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:541:5: this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list1165);
            this_medium_0=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_medium_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:551:1: (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:551:6: this_COMMA_1= RULE_COMMA this_medium_2= rulemedium
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list1186); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list1213);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:577:1: entryRulemedium returns [String current=null] : iv_rulemedium= rulemedium EOF ;
    public final String entryRulemedium() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedium = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:578:2: (iv_rulemedium= rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:579:2: iv_rulemedium= rulemedium EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediumRule()); 
            }
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium1261);
            iv_rulemedium=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedium.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium1272); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:586:1: rulemedium returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken rulemedium() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:589:28: (this_Identifier_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:591:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMediumAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulemedium1318);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:609:1: entryRuleruleset returns [EObject current=null] : iv_ruleruleset= ruleruleset EOF ;
    public final EObject entryRuleruleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:610:2: (iv_ruleruleset= ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:611:2: iv_ruleruleset= ruleruleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset1362);
            iv_ruleruleset=ruleruleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleruleset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset1372); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:618:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )? )? otherlv_9= '}' ) ;
    public final EObject ruleruleset() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_declarations_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:621:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )? )? otherlv_9= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:622:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )? )? otherlv_9= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:622:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )? )? otherlv_9= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:622:2: ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* (this_WS_3= RULE_WS )* otherlv_4= '{' ( ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )? )? otherlv_9= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:622:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:623:1: (lv_selectors_0_0= ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:623:1: (lv_selectors_0_0= ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:624:3: lv_selectors_0_0= ruleselector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleselector_in_ruleruleset1418);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:640:2: (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:640:3: this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset1430); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:644:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:645:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:645:1: (lv_selectors_2_0= ruleselector )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:646:3: lv_selectors_2_0= ruleselector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset1450);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:662:4: (this_WS_3= RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:662:5: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleruleset1464); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleruleset1477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:1: ( ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_WS||(LA20_0>=RULE_DASH && LA20_0<=RULE_ONE_NON_HEX_LETTER)||(LA20_0>=52 && LA20_0<=55)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:2: ( (lv_declarations_5_0= rulecss_declaration ) ) (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )* (otherlv_8= ';' )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:2: ( (lv_declarations_5_0= rulecss_declaration ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:671:1: (lv_declarations_5_0= rulecss_declaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:671:1: (lv_declarations_5_0= rulecss_declaration )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:672:3: lv_declarations_5_0= rulecss_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1499);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:688:2: (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==22) ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1==RULE_WS||(LA18_1>=RULE_DASH && LA18_1<=RULE_ONE_NON_HEX_LETTER)||(LA18_1>=52 && LA18_1<=55)) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:688:4: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleruleset1512); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:692:1: ( (lv_declarations_7_0= rulecss_declaration ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:693:1: (lv_declarations_7_0= rulecss_declaration )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:693:1: (lv_declarations_7_0= rulecss_declaration )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:694:3: lv_declarations_7_0= rulecss_declaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1533);
                    	    lv_declarations_7_0=rulecss_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRulesetRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:710:4: (otherlv_8= ';' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==22) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:710:6: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleruleset1548); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleruleset1564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:726:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:731:2: iv_ruleselector= ruleselector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1606);
            iv_ruleselector=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1616); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:741:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:745:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:746:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:746:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:746:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:746:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:747:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:747:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:748:3: lv_simpleselectors_0_0= rulesimple_selector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1666);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:3: ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:3: ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:4: ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:765:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:765:1: (lv_combinator_1_0= rulecombinator )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:3: lv_combinator_1_0= rulecombinator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1689);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:2: (this_WS_2= RULE_WS )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_WS) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:782:3: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1701); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_2, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:786:3: ( (lv_selector_3_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:787:1: (lv_selector_3_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:787:1: (lv_selector_3_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:788:3: lv_selector_3_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1723);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:6: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:6: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:7: (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:7: (this_WS_4= RULE_WS )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_WS) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:8: this_WS_4= RULE_WS
                    	    {
                    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1743); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_4, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:809:3: ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_PLUS||(LA24_0>=43 && LA24_0<=44)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:809:4: ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:809:4: ( (lv_combinator_5_0= rulecombinator ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:810:1: (lv_combinator_5_0= rulecombinator )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:810:1: (lv_combinator_5_0= rulecombinator )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:811:3: lv_combinator_5_0= rulecombinator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecombinator_in_ruleselector1766);
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

                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:827:2: (this_WS_6= RULE_WS )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_WS) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:827:3: this_WS_6= RULE_WS
                            	    {
                            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1778); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_6, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:5: ( (lv_selector_7_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:832:1: (lv_selector_7_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:832:1: (lv_selector_7_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:833:3: lv_selector_7_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1802);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:860:1: entryRuleSimpleSelectorForNegation returns [EObject current=null] : iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF ;
    public final EObject entryRuleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectorForNegation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:861:2: (iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:862:2: iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleSelectorForNegation_in_entryRuleSimpleSelectorForNegation1845);
            iv_ruleSimpleSelectorForNegation=ruleSimpleSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSelectorForNegation1855); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:869:1: ruleSimpleSelectorForNegation returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) ;
    public final EObject ruleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:872:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_DASH && LA29_0<=RULE_ONE_NON_HEX_LETTER)||(LA29_0>=38 && LA29_0<=39)||(LA29_0>=52 && LA29_0<=55)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_COLON||LA29_0==RULE_HASHMARK||LA29_0==31||LA29_0==37) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt26=2;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:874:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:874:1: (lv_element_0_0= ruleElementSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:875:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_ruleSimpleSelectorForNegation1903);
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:894:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorForNegation1930);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:910:3: ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_COLON||LA27_0==RULE_HASHMARK||LA27_0==31||LA27_0==37) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:911:1: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:911:1: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:912:3: lv_subSelectors_2_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1952);
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
                    	    break loop27;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:929:6: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:929:6: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_HASHMARK) && (synpred1_InternalCssDsl())) {
                            alt28=1;
                        }
                        else if ( (LA28_0==37) && (synpred1_InternalCssDsl())) {
                            alt28=1;
                        }
                        else if ( (LA28_0==31) && (synpred1_InternalCssDsl())) {
                            alt28=1;
                        }
                        else if ( (LA28_0==RULE_COLON) && (synpred1_InternalCssDsl())) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:929:7: ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:934:1: (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:935:3: lv_subSelectors_3_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1991);
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
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:959:1: entryRuleSubSelectorForNegation returns [EObject current=null] : iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF ;
    public final EObject entryRuleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelectorForNegation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:960:2: (iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:961:2: iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelectorForNegation_in_entryRuleSubSelectorForNegation2028);
            iv_ruleSubSelectorForNegation=ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelectorForNegation2038); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:968:1: ruleSubSelectorForNegation returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) ;
    public final EObject ruleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClass_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:971:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:972:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:972:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt30=1;
                }
                break;
            case 37:
                {
                alt30=2;
                }
                break;
            case 31:
                {
                alt30=3;
                }
                break;
            case RULE_COLON:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:973:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelectorForNegation2085);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:983:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelectorForNegation2112);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:993:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelectorForNegation2139);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1003:5: this_PseudoClass_3= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_ruleSubSelectorForNegation2166);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1019:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1020:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            }
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector2201);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_selector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector2211); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1028:1: rulesimple_selector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1031:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_DASH && LA34_0<=RULE_ONE_NON_HEX_LETTER)||(LA34_0>=38 && LA34_0<=39)||(LA34_0>=52 && LA34_0<=55)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_COLON||LA34_0==RULE_HASHMARK||LA34_0==31||LA34_0==37) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt31=2;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1032:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1033:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1033:1: (lv_element_0_0= ruleElementSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1034:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_rulesimple_selector2259);
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1051:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1051:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1052:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1052:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1053:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_rulesimple_selector2286);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1069:3: ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_COLON||LA32_0==RULE_HASHMARK||LA32_0==31||LA32_0==37) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1070:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1070:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1071:3: lv_subSelectors_2_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector2308);
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
                    	    break loop32;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1088:6: ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1088:6: ( ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_HASHMARK) && (synpred2_InternalCssDsl())) {
                            alt33=1;
                        }
                        else if ( (LA33_0==37) && (synpred2_InternalCssDsl())) {
                            alt33=1;
                        }
                        else if ( (LA33_0==31) && (synpred2_InternalCssDsl())) {
                            alt33=1;
                        }
                        else if ( (LA33_0==RULE_COLON) && (synpred2_InternalCssDsl())) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1088:7: ( ( ruleSubSelector ) )=> (lv_subSelectors_3_0= ruleSubSelector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1093:1: (lv_subSelectors_3_0= ruleSubSelector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1094:3: lv_subSelectors_3_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector2347);
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
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1118:1: entryRuleSubSelector returns [EObject current=null] : iv_ruleSubSelector= ruleSubSelector EOF ;
    public final EObject entryRuleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1119:2: (iv_ruleSubSelector= ruleSubSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1120:2: iv_ruleSubSelector= ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_entryRuleSubSelector2384);
            iv_ruleSubSelector=ruleSubSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelector2394); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1127:1: ruleSubSelector returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) ;
    public final EObject ruleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClassOrFunc_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1130:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1131:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1131:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt35=1;
                }
                break;
            case 37:
                {
                alt35=2;
                }
                break;
            case 31:
                {
                alt35=3;
                }
                break;
            case RULE_COLON:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1132:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelector2441);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1142:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelector2468);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1152:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelector2495);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1162:5: this_PseudoClassOrFunc_3= rulePseudoClassOrFunc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassOrFunc_in_ruleSubSelector2522);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1178:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1179:2: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1180:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2557);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSelector2567); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1187:1: ruleAttributeSelector returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1190:28: ( ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1191:1: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1191:1: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1191:2: () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )? otherlv_5= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1191:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAttributeSelector2613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1201:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1202:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1202:1: (lv_name_2_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1203:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeSelector2634);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1219:2: ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_INCLUDES && LA38_0<=RULE_DASHMATCH)||(LA38_0>=32 && LA38_0<=35)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1219:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1219:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1220:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1220:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1221:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1221:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    int alt36=6;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt36=1;
                        }
                        break;
                    case 33:
                        {
                        alt36=2;
                        }
                        break;
                    case 34:
                        {
                        alt36=3;
                        }
                        break;
                    case 35:
                        {
                        alt36=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt36=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt36=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1222:3: lv_op_3_1= '^='
                            {
                            lv_op_3_1=(Token)match(input,32,FOLLOW_32_in_ruleAttributeSelector2655); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1234:8: lv_op_3_2= '$='
                            {
                            lv_op_3_2=(Token)match(input,33,FOLLOW_33_in_ruleAttributeSelector2684); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1246:8: lv_op_3_3= '*='
                            {
                            lv_op_3_3=(Token)match(input,34,FOLLOW_34_in_ruleAttributeSelector2713); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1258:8: lv_op_3_4= '='
                            {
                            lv_op_3_4=(Token)match(input,35,FOLLOW_35_in_ruleAttributeSelector2742); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1270:8: lv_op_3_5= RULE_INCLUDES
                            {
                            lv_op_3_5=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2770); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1285:8: lv_op_3_6= RULE_DASHMATCH
                            {
                            lv_op_3_6=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2790); if (state.failed) return current;
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1303:2: ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1304:1: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1304:1: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1305:1: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1305:1: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_STRING )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_DASH && LA37_0<=RULE_ONE_NON_HEX_LETTER)||(LA37_0>=52 && LA37_0<=55)) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_STRING) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:3: lv_value_4_1= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeSelector2821);
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1321:8: lv_value_4_2= RULE_STRING
                            {
                            lv_value_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeSelector2836); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleAttributeSelector2858); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1351:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1352:2: (iv_ruleClassSelector= ruleClassSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1353:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleClassSelector_in_entryRuleClassSelector2894);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSelector2904); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1360:1: ruleClassSelector returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1363:28: ( ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1364:1: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1364:1: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1364:2: () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1364:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1365:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassSelectorAccess().getClassSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleClassSelector2950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1374:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1375:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1375:1: (lv_name_2_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1376:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleClassSelector2971);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1400:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1401:2: (iv_ruleElementSelector= ruleElementSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1402:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleElementSelector_in_entryRuleElementSelector3007);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementSelector3017); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1409:1: ruleElementSelector returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1412:28: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1413:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1413:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1413:2: () ( (lv_name_1_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1413:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1414:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1419:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1420:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1420:1: (lv_name_1_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1421:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleElementSelector3072);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1445:1: entryRuleUniversalSelector returns [EObject current=null] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final EObject entryRuleUniversalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1446:2: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1447:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector3108);
            iv_ruleUniversalSelector=ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniversalSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniversalSelector3118); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1454:1: ruleUniversalSelector returns [EObject current=null] : ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) ;
    public final EObject ruleUniversalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1457:28: ( ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1458:1: ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1458:1: ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1458:2: () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1458:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1459:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1464:2: ( (lv_namespace_1_0= rulecss_namespace_prefix ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_DASH && LA39_0<=RULE_ONE_NON_HEX_LETTER)||LA39_0==39||(LA39_0>=52 && LA39_0<=55)) ) {
                alt39=1;
            }
            else if ( (LA39_0==38) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==39) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1465:1: (lv_namespace_1_0= rulecss_namespace_prefix )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1465:1: (lv_namespace_1_0= rulecss_namespace_prefix )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1466:3: lv_namespace_1_0= rulecss_namespace_prefix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUniversalSelectorAccess().getNamespaceCss_namespace_prefixParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector3173);
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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleUniversalSelector3186); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1494:1: entryRuleIdSelector returns [EObject current=null] : iv_ruleIdSelector= ruleIdSelector EOF ;
    public final EObject entryRuleIdSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSelector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1495:2: (iv_ruleIdSelector= ruleIdSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1496:2: iv_ruleIdSelector= ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleIdSelector_in_entryRuleIdSelector3222);
            iv_ruleIdSelector=ruleIdSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdSelector3232); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1503:1: ruleIdSelector returns [EObject current=null] : ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleIdSelector() throws RecognitionException {
        EObject current = null;

        Token this_HASHMARK_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1506:28: ( ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1507:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1507:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1507:2: () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1507:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1508:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdSelectorAccess().getIdSelectorAction_0(),
                          current);
                  
            }

            }

            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleIdSelector3277); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_1, grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1517:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1518:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1518:1: (lv_name_2_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1519:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleIdSelector3297);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1543:1: entryRulecss_namespace_prefix returns [String current=null] : iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF ;
    public final String entryRulecss_namespace_prefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_namespace_prefix = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1544:2: (iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1545:2: iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_namespace_prefixRule()); 
            }
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix3334);
            iv_rulecss_namespace_prefix=rulecss_namespace_prefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_namespace_prefix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix3345); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1552:1: rulecss_namespace_prefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulecss_namespace_prefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1555:28: ( ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1556:1: ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1556:1: ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1556:2: (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1556:2: (this_Identifier_0= ruleIdentifier | kw= '*' )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_DASH && LA40_0<=RULE_ONE_NON_HEX_LETTER)||(LA40_0>=52 && LA40_0<=55)) ) {
                alt40=1;
            }
            else if ( (LA40_0==38) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1557:5: this_Identifier_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCss_namespace_prefixAccess().getIdentifierParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulecss_namespace_prefix3393);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1569:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulecss_namespace_prefix3417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_39_in_rulecss_namespace_prefix3432); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1588:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1592:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1593:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_declarationRule()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration3478);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration3488); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1603:1: rulecss_declaration returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_COLON_3=null;
        Token lv_important_5_0=null;
        EObject lv_property_1_0 = null;

        EObject lv_valueTokens_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:28: ( ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1608:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1608:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1608:2: (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1608:2: (this_WS_0= RULE_WS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_WS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1608:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3529); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1612:3: ( (lv_property_1_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1613:1: (lv_property_1_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1613:1: (lv_property_1_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1614:3: lv_property_1_0= rulecss_property
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecss_property_in_rulecss_declaration3551);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1630:2: (this_WS_2= RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1630:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3563); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulecss_declaration3575); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getCss_declarationAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1638:1: ( (lv_valueTokens_4_0= ruleCssTok ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_STRING||(LA43_0>=RULE_COMMA && LA43_0<=RULE_WS)||LA43_0==RULE_HASHMARK||(LA43_0>=RULE_PLUS && LA43_0<=RULE_ONE_INT)||LA43_0==37||LA43_0==45||(LA43_0>=52 && LA43_0<=55)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1639:1: (lv_valueTokens_4_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1639:1: (lv_valueTokens_4_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1640:3: lv_valueTokens_4_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCssTok_in_rulecss_declaration3595);
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
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1656:3: ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_IMPORTANT_SYM) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1658:3: lv_important_5_0= RULE_IMPORTANT_SYM
                    {
                    lv_important_5_0=(Token)match(input,RULE_IMPORTANT_SYM,FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3613); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1685:1: entryRulecss_property returns [EObject current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final EObject entryRulecss_property() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1686:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1687:2: iv_rulecss_property= rulecss_property EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_propertyRule()); 
            }
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3659);
            iv_rulecss_property=rulecss_property();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_property; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3669); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1694:1: rulecss_property returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject rulecss_property() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1697:28: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1698:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1698:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1698:2: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1698:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1699:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCss_propertyAccess().getCss_propertyAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1704:2: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1705:1: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1705:1: (lv_name_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1706:3: lv_name_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rulecss_property3724);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1730:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1731:2: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1732:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3761);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidPropertyIdent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent3772); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1739:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1742:28: (this_Identifier_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1744:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleValidPropertyIdent3818);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1762:1: entryRulePseudoClassOrFunc returns [EObject current=null] : iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF ;
    public final EObject entryRulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassOrFunc = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1763:2: (iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1764:2: iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassOrFuncRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassOrFunc_in_entryRulePseudoClassOrFunc3862);
            iv_rulePseudoClassOrFunc=rulePseudoClassOrFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassOrFunc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassOrFunc3872); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1771:1: rulePseudoClassOrFunc returns [EObject current=null] : (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) ;
    public final EObject rulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject this_PseudoClass_0 = null;

        EObject this_PseudoClassFunction_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1774:28: ( (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1775:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1775:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1776:5: this_PseudoClass_0= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_rulePseudoClassOrFunc3919);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1786:5: this_PseudoClassFunction_1= rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassFunction_in_rulePseudoClassOrFunc3946);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1802:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1803:2: (iv_rulePseudoClass= rulePseudoClass EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1804:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClass_in_entryRulePseudoClass3981);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClass3991); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1811:1: rulePseudoClass returns [EObject current=null] : (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token this_COLON_0=null;
        Token this_COLON_1=null;
        EObject this_PseudoClassName_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1814:28: ( (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1815:1: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1815:1: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1815:2: this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePseudoClass4027); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_0, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1819:1: (this_COLON_1= RULE_COLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_COLON) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1819:2: this_COLON_1= RULE_COLON
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePseudoClass4038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_1, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_rulePseudoClass4061);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1840:1: entryRulePseudoClassName returns [EObject current=null] : iv_rulePseudoClassName= rulePseudoClassName EOF ;
    public final EObject entryRulePseudoClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1841:2: (iv_rulePseudoClassName= rulePseudoClassName EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1842:2: iv_rulePseudoClassName= rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName4096);
            iv_rulePseudoClassName=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassName4106); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1849:1: rulePseudoClassName returns [EObject current=null] : ( (lv_name_0_0= ruleIdentifier ) ) ;
    public final EObject rulePseudoClassName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1852:28: ( ( (lv_name_0_0= ruleIdentifier ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1853:1: ( (lv_name_0_0= ruleIdentifier ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1853:1: ( (lv_name_0_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1854:1: (lv_name_0_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1854:1: (lv_name_0_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1855:3: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPseudoClassNameAccess().getNameIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulePseudoClassName4151);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1879:1: entryRulePseudoClassFunction returns [EObject current=null] : iv_rulePseudoClassFunction= rulePseudoClassFunction EOF ;
    public final EObject entryRulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassFunction = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1880:2: (iv_rulePseudoClassFunction= rulePseudoClassFunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1881:2: iv_rulePseudoClassFunction= rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction4186);
            iv_rulePseudoClassFunction=rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassFunction4196); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1888:1: rulePseudoClassFunction returns [EObject current=null] : ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) ;
    public final EObject rulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_not_0_0 = null;

        EObject lv_paramSelector_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1891:28: ( ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:1: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:1: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_COLON) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==42) ) {
                    alt48=1;
                }
                else if ( ((LA48_1>=RULE_DASH && LA48_1<=RULE_ONE_NON_HEX_LETTER)||(LA48_1>=52 && LA48_1<=55)) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:2: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:2: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:3: ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:3: ( (lv_not_0_0= ruleNotFunctionCall ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1893:1: (lv_not_0_0= ruleNotFunctionCall )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1893:1: (lv_not_0_0= ruleNotFunctionCall )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1894:3: lv_not_0_0= ruleNotFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotFunctionCall_in_rulePseudoClassFunction4243);
                    lv_not_0_0=ruleNotFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"not",
                              		true, 
                              		"NotFunctionCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1910:2: ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:1: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1911:1: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1912:3: lv_paramSelector_1_0= ruleSimpleSelectorForNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleSelectorForNegation_in_rulePseudoClassFunction4264);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_rulePseudoClassFunction4276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1933:6: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1933:6: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1933:7: this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')'
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePseudoClassFunction4295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1937:1: ( (lv_name_4_0= ruleIdentifier ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1938:1: (lv_name_4_0= ruleIdentifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1938:1: (lv_name_4_0= ruleIdentifier )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1939:3: lv_name_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulePseudoClassFunction4315);
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

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_rulePseudoClassFunction4327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1959:1: ( (lv_params_6_0= ruleCssTok ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_STRING||(LA47_0>=RULE_COMMA && LA47_0<=RULE_WS)||LA47_0==RULE_HASHMARK||(LA47_0>=RULE_PLUS && LA47_0<=RULE_ONE_INT)||LA47_0==37||LA47_0==45||(LA47_0>=52 && LA47_0<=55)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1960:1: (lv_params_6_0= ruleCssTok )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1960:1: (lv_params_6_0= ruleCssTok )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1961:3: lv_params_6_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCssTok_in_rulePseudoClassFunction4348);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_rulePseudoClassFunction4361); if (state.failed) return current;
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


    // $ANTLR start "entryRuleNotFunctionCall"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1989:1: entryRuleNotFunctionCall returns [String current=null] : iv_ruleNotFunctionCall= ruleNotFunctionCall EOF ;
    public final String entryRuleNotFunctionCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotFunctionCall = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1993:2: (iv_ruleNotFunctionCall= ruleNotFunctionCall EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1994:2: iv_ruleNotFunctionCall= ruleNotFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleNotFunctionCall_in_entryRuleNotFunctionCall4405);
            iv_ruleNotFunctionCall=ruleNotFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotFunctionCall.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotFunctionCall4416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotFunctionCall"


    // $ANTLR start "ruleNotFunctionCall"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2004:1: ruleNotFunctionCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COLON_0= RULE_COLON kw= 'not(' ) ;
    public final AntlrDatatypeRuleToken ruleNotFunctionCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_0=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2008:28: ( (this_COLON_0= RULE_COLON kw= 'not(' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2009:1: (this_COLON_0= RULE_COLON kw= 'not(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2009:1: (this_COLON_0= RULE_COLON kw= 'not(' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2009:6: this_COLON_0= RULE_COLON kw= 'not('
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleNotFunctionCall4460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COLON_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_0, grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleNotFunctionCall4478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNotFunctionCallAccess().getNotKeyword_1()); 
                  
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
    // $ANTLR end "ruleNotFunctionCall"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2033:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2034:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2035:2: iv_rulecombinator= rulecombinator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator4523);
            iv_rulecombinator=rulecombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecombinator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator4534); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2042:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2045:28: ( (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2046:1: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2046:1: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt49=1;
                }
                break;
            case 43:
                {
                alt49=2;
                }
                break;
            case 44:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2046:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulecombinator4574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2055:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulecombinator4598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2062:2: kw= '~'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulecombinator4617); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2079:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2080:2: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2081:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4661);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok4671); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2088:1: ruleSymbolTok returns [EObject current=null] : ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2091:28: ( ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2092:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2092:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2092:2: () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2092:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2098:2: ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2099:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2099:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2100:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2100:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_COMMA) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_PERCENT) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2101:3: lv_symbol_1_1= RULE_COMMA
                    {
                    lv_symbol_1_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSymbolTok4724); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2116:8: lv_symbol_1_2= RULE_PERCENT
                    {
                    lv_symbol_1_2=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSymbolTok4744); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2142:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2143:2: (iv_ruleWSTok= ruleWSTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2144:2: iv_ruleWSTok= ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok4788);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWSTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok4798); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2151:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2154:28: ( ( () this_WS_1= RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2155:1: ( () this_WS_1= RULE_WS )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2155:1: ( () this_WS_1= RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2155:2: () this_WS_1= RULE_WS
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2155:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2156:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWSTokAccess().getWSTokAction_0(),
                          current);
                  
            }

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleWSTok4843); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2173:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2174:2: (iv_ruleStringTok= ruleStringTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2175:2: iv_ruleStringTok= ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok4878);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok4888); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2182:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2185:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2186:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2186:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2186:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2186:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2187:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTokAccess().getStringTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2192:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2193:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2193:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2194:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringTok4939); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2218:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2222:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2223:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok4986);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok4996); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2233:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_val_1_0= ruleNum ) ) ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2237:28: ( ( () ( (lv_val_1_0= ruleNum ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2238:1: ( () ( (lv_val_1_0= ruleNum ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2238:1: ( () ( (lv_val_1_0= ruleNum ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2238:2: () ( (lv_val_1_0= ruleNum ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2238:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2239:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2244:2: ( (lv_val_1_0= ruleNum ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2245:1: (lv_val_1_0= ruleNum )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2245:1: (lv_val_1_0= ruleNum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2246:3: lv_val_1_0= ruleNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNum_in_ruleNumberTok5055);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2273:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2274:2: (iv_ruleUrlTok= ruleUrlTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2275:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok5095);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUrlTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok5105); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2282:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2285:28: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2286:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2286:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2286:2: () ( (lv_url_1_0= ruleURLType ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2286:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2287:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2292:2: ( (lv_url_1_0= ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2293:1: (lv_url_1_0= ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2293:1: (lv_url_1_0= ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2294:3: lv_url_1_0= ruleURLType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleURLType_in_ruleUrlTok5160);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2318:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2322:2: (iv_ruleColorTok= ruleColorTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2323:2: iv_ruleColorTok= ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok5202);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok5212); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2333:1: ruleColorTok returns [EObject current=null] : ( () ( (lv_value_1_0= ruleHex ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2337:28: ( ( () ( (lv_value_1_0= ruleHex ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2338:1: ( () ( (lv_value_1_0= ruleHex ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2338:1: ( () ( (lv_value_1_0= ruleHex ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2338:2: () ( (lv_value_1_0= ruleHex ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2338:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2339:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColorTokAccess().getColorTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2344:2: ( (lv_value_1_0= ruleHex ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2345:1: (lv_value_1_0= ruleHex )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2345:1: (lv_value_1_0= ruleHex )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2346:3: lv_value_1_0= ruleHex
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHex_in_ruleColorTok5271);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2373:1: entryRuleIdentifierOrFuncTok returns [EObject current=null] : iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF ;
    public final EObject entryRuleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierOrFuncTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2377:2: (iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2378:2: iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierOrFuncTokRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierOrFuncTok_in_entryRuleIdentifierOrFuncTok5317);
            iv_ruleIdentifierOrFuncTok=ruleIdentifierOrFuncTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierOrFuncTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierOrFuncTok5327); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2388:1: ruleIdentifierOrFuncTok returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) ;
    public final EObject ruleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2392:28: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2393:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2393:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2393:2: () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2393:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2394:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2399:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2400:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2400:1: (lv_name_1_0= ruleIdentifier )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2401:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleIdentifierOrFuncTok5386);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2417:2: ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2417:3: () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2417:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2418:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleIdentifierOrFuncTok5408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2427:1: ( (lv_params_4_0= ruleCssTok ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_STRING||(LA51_0>=RULE_COMMA && LA51_0<=RULE_WS)||LA51_0==RULE_HASHMARK||(LA51_0>=RULE_PLUS && LA51_0<=RULE_ONE_INT)||LA51_0==37||LA51_0==45||(LA51_0>=52 && LA51_0<=55)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2428:1: (lv_params_4_0= ruleCssTok )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2428:1: (lv_params_4_0= ruleCssTok )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2429:3: lv_params_4_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCssTok_in_ruleIdentifierOrFuncTok5429);
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
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleIdentifierOrFuncTok5442); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2460:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2464:2: (iv_ruleCssTok= ruleCssTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2465:2: iv_ruleCssTok= ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok5490);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok5500); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2475:1: ruleCssTok returns [EObject current=null] : (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2479:28: ( (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2480:1: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2480:1: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            int alt53=7;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ONE_INT||LA53_1==37) ) {
                    alt53=5;
                }
                else if ( ((LA53_1>=RULE_UNDERSCORE && LA53_1<=RULE_ONE_NON_HEX_LETTER)||(LA53_1>=52 && LA53_1<=55)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNDERSCORE:
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt53=1;
                }
                break;
            case RULE_COMMA:
            case RULE_PERCENT:
                {
                alt53=2;
                }
                break;
            case RULE_WS:
                {
                alt53=3;
                }
                break;
            case RULE_STRING:
                {
                alt53=4;
                }
                break;
            case RULE_PLUS:
            case RULE_ONE_INT:
            case 37:
                {
                alt53=5;
                }
                break;
            case 45:
                {
                alt53=6;
                }
                break;
            case RULE_HASHMARK:
                {
                alt53=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2481:5: this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierOrFuncTok_in_ruleCssTok5551);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2491:5: this_SymbolTok_1= ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSymbolTok_in_ruleCssTok5578);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2501:5: this_WSTok_2= ruleWSTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWSTok_in_ruleCssTok5605);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2511:5: this_StringTok_3= ruleStringTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringTok_in_ruleCssTok5632);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2521:5: this_NumberTok_4= ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTok_in_ruleCssTok5659);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2531:5: this_UrlTok_5= ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUrlTok_in_ruleCssTok5686);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2541:5: this_ColorTok_6= ruleColorTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColorTok_in_ruleCssTok5713);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2560:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2564:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2565:2: iv_ruleURLType= ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType5758);
            iv_ruleURLType=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType5768); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2575:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_url_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2579:28: ( (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2580:1: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2580:1: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2580:3: otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleURLType5809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2584:1: ( (lv_url_1_0= ruleValidURL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2585:1: (lv_url_1_0= ruleValidURL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2585:1: (lv_url_1_0= ruleValidURL )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2586:3: lv_url_1_0= ruleValidURL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidURL_in_ruleURLType5830);
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

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleURLType5842); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2617:1: entryRuleValidURLSymbol returns [String current=null] : iv_ruleValidURLSymbol= ruleValidURLSymbol EOF ;
    public final String entryRuleValidURLSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURLSymbol = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2618:2: (iv_ruleValidURLSymbol= ruleValidURLSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2619:2: iv_ruleValidURLSymbol= ruleValidURLSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleValidURLSymbol_in_entryRuleValidURLSymbol5883);
            iv_ruleValidURLSymbol=ruleValidURLSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURLSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidURLSymbol5894); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2626:1: ruleValidURLSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) ) ;
    public final AntlrDatatypeRuleToken ruleValidURLSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token kw=null;
        Token this_UNDERSCORE_2=null;
        Token this_COLON_4=null;
        Token this_HASHMARK_7=null;
        Token this_PLUS_15=null;
        Token this_COMMA_16=null;
        AntlrDatatypeRuleToken this_KeywordHack_19 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2629:28: ( (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2630:1: (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2630:1: (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) )
            int alt54=19;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                alt54=1;
                }
                break;
            case 37:
                {
                alt54=2;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt54=3;
                }
                break;
            case 44:
                {
                alt54=4;
                }
                break;
            case RULE_COLON:
                {
                alt54=5;
                }
                break;
            case 46:
                {
                alt54=6;
                }
                break;
            case 47:
                {
                alt54=7;
                }
                break;
            case RULE_HASHMARK:
                {
                alt54=8;
                }
                break;
            case 31:
                {
                alt54=9;
                }
                break;
            case 36:
                {
                alt54=10;
                }
                break;
            case 48:
                {
                alt54=11;
                }
                break;
            case 49:
                {
                alt54=12;
                }
                break;
            case 50:
                {
                alt54=13;
                }
                break;
            case 51:
                {
                alt54=14;
                }
                break;
            case 38:
                {
                alt54=15;
                }
                break;
            case RULE_PLUS:
                {
                alt54=16;
                }
                break;
            case RULE_COMMA:
                {
                alt54=17;
                }
                break;
            case 22:
                {
                alt54=18;
                }
                break;
            case 35:
                {
                alt54=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2630:6: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleValidURLSymbol5934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_0, grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2639:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleValidURLSymbol5958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2645:10: this_UNDERSCORE_2= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_2=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleValidURLSymbol5979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNDERSCORE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNDERSCORE_2, grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2654:2: kw= '~'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleValidURLSymbol6003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2660:10: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleValidURLSymbol6024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2669:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValidURLSymbol6048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2676:2: kw= '?'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleValidURLSymbol6067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2682:10: this_HASHMARK_7= RULE_HASHMARK
                    {
                    this_HASHMARK_7=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleValidURLSymbol6088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASHMARK_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASHMARK_7, grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2691:2: kw= '['
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleValidURLSymbol6112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2698:2: kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleValidURLSymbol6131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2705:2: kw= '@'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleValidURLSymbol6150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2712:2: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleValidURLSymbol6169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2719:2: kw= '$'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleValidURLSymbol6188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2726:2: kw= '&'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleValidURLSymbol6207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2733:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleValidURLSymbol6226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2739:10: this_PLUS_15= RULE_PLUS
                    {
                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleValidURLSymbol6247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_15, grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2747:10: this_COMMA_16= RULE_COMMA
                    {
                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleValidURLSymbol6273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_16, grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2756:2: kw= ';'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleValidURLSymbol6297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2762:6: (kw= '=' this_KeywordHack_19= ruleKeywordHack )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2762:6: (kw= '=' this_KeywordHack_19= ruleKeywordHack )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2763:2: kw= '=' this_KeywordHack_19= ruleKeywordHack
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleValidURLSymbol6317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeywordHack_in_ruleValidURLSymbol6339);
                    this_KeywordHack_19=ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KeywordHack_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleValidURLSymbol"


    // $ANTLR start "entryRuleKeywordHack"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2787:1: entryRuleKeywordHack returns [String current=null] : iv_ruleKeywordHack= ruleKeywordHack EOF ;
    public final String entryRuleKeywordHack() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeywordHack = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2788:2: (iv_ruleKeywordHack= ruleKeywordHack EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2789:2: iv_ruleKeywordHack= ruleKeywordHack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeywordHackRule()); 
            }
            pushFollow(FOLLOW_ruleKeywordHack_in_entryRuleKeywordHack6386);
            iv_ruleKeywordHack=ruleKeywordHack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeywordHack.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeywordHack6397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeywordHack"


    // $ANTLR start "ruleKeywordHack"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2796:1: ruleKeywordHack returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' ) ;
    public final AntlrDatatypeRuleToken ruleKeywordHack() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2799:28: ( (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2800:1: (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2800:1: (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt55=1;
                }
                break;
            case 53:
                {
                alt55=2;
                }
                break;
            case 54:
                {
                alt55=3;
                }
                break;
            case 55:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2801:2: kw= 'not'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleKeywordHack6435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getNotKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2808:2: kw= 'no'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleKeywordHack6454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getNoKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2815:2: kw= 'url'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleKeywordHack6473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getUrlKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2822:2: kw= 'ur'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleKeywordHack6492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getUrKeyword_3()); 
                          
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
    // $ANTLR end "ruleKeywordHack"


    // $ANTLR start "entryRuleValidURL"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2835:1: entryRuleValidURL returns [String current=null] : iv_ruleValidURL= ruleValidURL EOF ;
    public final String entryRuleValidURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURL = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2839:2: (iv_ruleValidURL= ruleValidURL EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2840:2: iv_ruleValidURL= ruleValidURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLRule()); 
            }
            pushFollow(FOLLOW_ruleValidURL_in_entryRuleValidURL6539);
            iv_ruleValidURL=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidURL6550); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2850:1: ruleValidURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleValidURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ONE_HEX_LETTER_3=null;
        Token this_ONE_NON_HEX_LETTER_4=null;
        Token this_ONE_INT_5=null;
        Token kw=null;
        Token this_PERCENT_11=null;
        Token this_ONE_INT_12=null;
        Token this_ONE_HEX_LETTER_13=null;
        Token this_ONE_INT_14=null;
        Token this_ONE_HEX_LETTER_15=null;
        AntlrDatatypeRuleToken this_ValidURLSymbol_1 = null;

        AntlrDatatypeRuleToken this_KeywordHack_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2854:28: ( (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2855:1: (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2855:1: (this_STRING_0= RULE_STRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=RULE_COLON && LA59_0<=RULE_COMMA)||LA59_0==RULE_HASHMARK||(LA59_0>=RULE_PLUS && LA59_0<=RULE_ONE_INT)||LA59_0==22||LA59_0==31||(LA59_0>=35 && LA59_0<=38)||LA59_0==44||(LA59_0>=46 && LA59_0<=60)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2855:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValidURL6594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getValidURLAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2863:6: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2863:6: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=12;
                        switch ( input.LA(1) ) {
                        case RULE_COLON:
                        case RULE_COMMA:
                        case RULE_HASHMARK:
                        case RULE_PLUS:
                        case RULE_DASH:
                        case RULE_UNDERSCORE:
                        case 22:
                        case 31:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                            {
                            alt58=1;
                            }
                            break;
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                            {
                            alt58=2;
                            }
                            break;
                        case RULE_ONE_HEX_LETTER:
                            {
                            alt58=3;
                            }
                            break;
                        case RULE_ONE_NON_HEX_LETTER:
                            {
                            alt58=4;
                            }
                            break;
                        case RULE_ONE_INT:
                            {
                            alt58=5;
                            }
                            break;
                        case 56:
                            {
                            alt58=6;
                            }
                            break;
                        case 57:
                            {
                            alt58=7;
                            }
                            break;
                        case 58:
                            {
                            alt58=8;
                            }
                            break;
                        case 59:
                            {
                            alt58=9;
                            }
                            break;
                        case 60:
                            {
                            alt58=10;
                            }
                            break;
                        case RULE_PERCENT:
                            {
                            alt58=11;
                            }
                            break;

                        }

                        switch (alt58) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2864:5: this_ValidURLSymbol_1= ruleValidURLSymbol
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleValidURLSymbol_in_ruleValidURL6628);
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
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2876:5: this_KeywordHack_2= ruleKeywordHack
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleKeywordHack_in_ruleValidURL6661);
                    	    this_KeywordHack_2=ruleKeywordHack();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_KeywordHack_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2887:10: this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER
                    	    {
                    	    this_ONE_HEX_LETTER_3=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6687); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_HEX_LETTER_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_HEX_LETTER_3, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2895:10: this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER
                    	    {
                    	    this_ONE_NON_HEX_LETTER_4=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleValidURL6713); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_NON_HEX_LETTER_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_NON_HEX_LETTER_4, grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2903:10: this_ONE_INT_5= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_5=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6739); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_5, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2912:2: kw= '\\\\ '
                    	    {
                    	    kw=(Token)match(input,56,FOLLOW_56_in_ruleValidURL6763); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2919:2: kw= '\\\\('
                    	    {
                    	    kw=(Token)match(input,57,FOLLOW_57_in_ruleValidURL6782); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2926:2: kw= '\\\\)'
                    	    {
                    	    kw=(Token)match(input,58,FOLLOW_58_in_ruleValidURL6801); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2933:2: kw= '\\\\\\''
                    	    {
                    	    kw=(Token)match(input,59,FOLLOW_59_in_ruleValidURL6820); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2940:2: kw= '\\\\\"'
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_60_in_ruleValidURL6839); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 11 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2946:6: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2946:6: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2946:11: this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    {
                    	    this_PERCENT_11=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleValidURL6861); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_PERCENT_11);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_PERCENT_11, grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0()); 
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2953:1: (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER )
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==RULE_ONE_INT) ) {
                    	        alt56=1;
                    	    }
                    	    else if ( (LA56_0==RULE_ONE_HEX_LETTER) ) {
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
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2953:6: this_ONE_INT_12= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_12=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6882); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_INT_12);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_INT_12, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0()); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2961:10: this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_13=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6908); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_HEX_LETTER_13);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_HEX_LETTER_13, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2968:2: (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==RULE_ONE_INT) ) {
                    	        alt57=1;
                    	    }
                    	    else if ( (LA57_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt57=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 57, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2968:7: this_ONE_INT_14= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_14=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6930); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_INT_14);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_INT_14, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0()); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2976:10: this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_15=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6956); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_HEX_LETTER_15);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_HEX_LETTER_15, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2994:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2998:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier7016);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier7027); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3009:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        Token this_ONE_HEX_LETTER_2=null;
        Token this_ONE_NON_HEX_LETTER_3=null;
        Token this_UNDERSCORE_5=null;
        Token this_DASH_6=null;
        Token this_ONE_HEX_LETTER_7=null;
        Token this_ONE_NON_HEX_LETTER_8=null;
        Token this_ONE_INT_9=null;
        AntlrDatatypeRuleToken this_KeywordHack_4 = null;

        AntlrDatatypeRuleToken this_KeywordHack_10 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3013:28: ( ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3014:1: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3014:1: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3014:2: (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3014:2: (this_DASH_0= RULE_DASH )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_DASH) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3014:7: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleIdentifier7072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_0, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3021:3: (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack )
            int alt61=4;
            switch ( input.LA(1) ) {
            case RULE_UNDERSCORE:
                {
                alt61=1;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt61=2;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt61=3;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3021:8: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNDERSCORE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNDERSCORE_1, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3029:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
                    {
                    this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_HEX_LETTER_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3037:10: this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER
                    {
                    this_ONE_NON_HEX_LETTER_3=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_NON_HEX_LETTER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_NON_HEX_LETTER_3, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3046:5: this_KeywordHack_4= ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeywordHack_in_ruleIdentifier7180);
                    this_KeywordHack_4=ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KeywordHack_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3056:2: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3056:3: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3061:26: (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack )
            	    int alt62=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_UNDERSCORE:
            	        {
            	        alt62=1;
            	        }
            	        break;
            	    case RULE_DASH:
            	        {
            	        alt62=2;
            	        }
            	        break;
            	    case RULE_ONE_HEX_LETTER:
            	        {
            	        alt62=3;
            	        }
            	        break;
            	    case RULE_ONE_NON_HEX_LETTER:
            	        {
            	        alt62=4;
            	        }
            	        break;
            	    case RULE_ONE_INT:
            	        {
            	        alt62=5;
            	        }
            	        break;
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	        {
            	        alt62=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt62) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3061:31: this_UNDERSCORE_5= RULE_UNDERSCORE
            	            {
            	            this_UNDERSCORE_5=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7250); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_UNDERSCORE_5);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_UNDERSCORE_5, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3069:10: this_DASH_6= RULE_DASH
            	            {
            	            this_DASH_6=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleIdentifier7276); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_DASH_6);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_DASH_6, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3077:10: this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_7=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7302); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_HEX_LETTER_7);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_HEX_LETTER_7, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3085:10: this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER
            	            {
            	            this_ONE_NON_HEX_LETTER_8=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7328); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_NON_HEX_LETTER_8);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_NON_HEX_LETTER_8, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3093:10: this_ONE_INT_9= RULE_ONE_INT
            	            {
            	            this_ONE_INT_9=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleIdentifier7354); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_INT_9);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_INT_9, grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3102:5: this_KeywordHack_10= ruleKeywordHack
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleKeywordHack_in_ruleIdentifier7387);
            	            this_KeywordHack_10=ruleKeywordHack();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_KeywordHack_10);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3123:1: entryRuleNum returns [String current=null] : iv_ruleNum= ruleNum EOF ;
    public final String entryRuleNum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNum = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3127:2: (iv_ruleNum= ruleNum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3128:2: iv_ruleNum= ruleNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumRule()); 
            }
            pushFollow(FOLLOW_ruleNum_in_entryRuleNum7446);
            iv_ruleNum=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNum.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNum7457); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3138:1: ruleNum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3142:28: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3143:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3143:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3143:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3143:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_PLUS) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_DASH) ) {
                alt64=2;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3143:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleNum7502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3151:10: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleNum7528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_1, grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3158:3: ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==37) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ONE_INT) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3158:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3158:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3159:2: kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNum7550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_0_0()); 
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3164:1: ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_ONE_INT) ) {
                            int LA65_2 = input.LA(2);

                            if ( (synpred4_InternalCssDsl()) ) {
                                alt65=1;
                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3164:2: ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_3=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7571); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_3, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:6: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:6: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:7: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:7: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_ONE_INT) ) {
                            int LA66_2 = input.LA(2);

                            if ( (synpred5_InternalCssDsl()) ) {
                                alt66=1;
                            }


                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:8: ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_4=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7607); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_4, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:3: ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==37) ) {
                        int LA68_1 = input.LA(2);

                        if ( (LA68_1==RULE_ONE_INT) ) {
                            int LA68_3 = input.LA(3);

                            if ( (synpred6_InternalCssDsl()) ) {
                                alt68=1;
                            }
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:4: ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:4: ( ( '.' )=>kw= '.' )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:5: ( '.' )=>kw= '.'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleNum7637); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0()); 
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3187:2: ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            int cnt67=0;
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==RULE_ONE_INT) ) {
                                    int LA67_2 = input.LA(2);

                                    if ( (synpred7_InternalCssDsl()) ) {
                                        alt67=1;
                                    }


                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3187:3: ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT
                            	    {
                            	    this_ONE_INT_6=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7659); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		current.merge(this_ONE_INT_6);
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_ONE_INT_6, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt67 >= 1 ) break loop67;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(67, input);
                                        throw eee;
                                }
                                cnt67++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3205:1: entryRuleHex returns [String current=null] : iv_ruleHex= ruleHex EOF ;
    public final String entryRuleHex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHex = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3206:2: (iv_ruleHex= ruleHex EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3207:2: iv_ruleHex= ruleHex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexRule()); 
            }
            pushFollow(FOLLOW_ruleHex_in_entryRuleHex7715);
            iv_ruleHex=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHex.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHex7726); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3214:1: ruleHex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleHex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASHMARK_0=null;
        Token this_ONE_INT_1=null;
        Token this_ONE_HEX_LETTER_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3217:28: ( (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3218:1: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3218:1: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3218:6: this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            {
            this_HASHMARK_0=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleHex7766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HASHMARK_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_0, grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3225:1: ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ONE_HEX_LETTER) ) {
                    int LA71_2 = input.LA(2);

                    if ( (synpred8_InternalCssDsl()) ) {
                        alt71=1;
                    }


                }
                else if ( (LA71_0==RULE_ONE_INT) ) {
                    int LA71_3 = input.LA(2);

                    if ( (synpred8_InternalCssDsl()) ) {
                        alt71=1;
                    }


                }


                switch (alt71) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3225:2: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3226:30: (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==RULE_ONE_INT) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==RULE_ONE_HEX_LETTER) ) {
            	        alt70=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3226:35: this_ONE_INT_1= RULE_ONE_INT
            	            {
            	            this_ONE_INT_1=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleHex7803); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_INT_1);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_INT_1, grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3234:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleHex7829); if (state.failed) return current;
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
            	    if ( cnt71 >= 1 ) break loop71;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
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
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:929:7: ( ( ruleSubSelectorForNegation ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:1: ( ruleSubSelectorForNegation )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:1: ( ruleSubSelectorForNegation )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:931:1: ruleSubSelectorForNegation
        {
        pushFollow(FOLLOW_ruleSubSelectorForNegation_in_synpred1_InternalCssDsl1974);
        ruleSubSelectorForNegation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCssDsl

    // $ANTLR start synpred2_InternalCssDsl
    public final void synpred2_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1088:7: ( ( ruleSubSelector ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1089:1: ( ruleSubSelector )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1089:1: ( ruleSubSelector )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1090:1: ruleSubSelector
        {
        pushFollow(FOLLOW_ruleSubSelector_in_synpred2_InternalCssDsl2330);
        ruleSubSelector();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCssDsl

    // $ANTLR start synpred3_InternalCssDsl
    public final void synpred3_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3056:3: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3056:4: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        {
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3056:4: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        int alt72=6;
        switch ( input.LA(1) ) {
        case RULE_UNDERSCORE:
            {
            alt72=1;
            }
            break;
        case RULE_DASH:
            {
            alt72=2;
            }
            break;
        case RULE_ONE_HEX_LETTER:
            {
            alt72=3;
            }
            break;
        case RULE_ONE_NON_HEX_LETTER:
            {
            alt72=4;
            }
            break;
        case RULE_ONE_INT:
            {
            alt72=5;
            }
            break;
        case 52:
        case 53:
        case 54:
        case 55:
            {
            alt72=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 72, 0, input);

            throw nvae;
        }

        switch (alt72) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3056:6: RULE_UNDERSCORE
                {
                match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_synpred3_InternalCssDsl7199); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3057:7: RULE_DASH
                {
                match(input,RULE_DASH,FOLLOW_RULE_DASH_in_synpred3_InternalCssDsl7207); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3058:7: RULE_ONE_HEX_LETTER
                {
                match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_synpred3_InternalCssDsl7215); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3059:7: RULE_ONE_NON_HEX_LETTER
                {
                match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_synpred3_InternalCssDsl7223); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3060:7: RULE_ONE_INT
                {
                match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred3_InternalCssDsl7231); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3061:7: ruleKeywordHack
                {
                pushFollow(FOLLOW_ruleKeywordHack_in_synpred3_InternalCssDsl7239);
                ruleKeywordHack();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred3_InternalCssDsl

    // $ANTLR start synpred4_InternalCssDsl
    public final void synpred4_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3164:2: ( RULE_ONE_INT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3164:4: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred4_InternalCssDsl7562); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCssDsl

    // $ANTLR start synpred5_InternalCssDsl
    public final void synpred5_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:8: ( RULE_ONE_INT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3172:10: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred5_InternalCssDsl7598); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCssDsl

    // $ANTLR start synpred6_InternalCssDsl
    public final void synpred6_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:5: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3180:2: '.'
        {
        match(input,37,FOLLOW_37_in_synpred6_InternalCssDsl7628); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCssDsl

    // $ANTLR start synpred7_InternalCssDsl
    public final void synpred7_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3187:3: ( RULE_ONE_INT )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3187:5: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred7_InternalCssDsl7650); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalCssDsl

    // $ANTLR start synpred8_InternalCssDsl
    public final void synpred8_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3225:2: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )
        // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3225:3: ( RULE_ONE_INT | RULE_ONE_HEX_LETTER )
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
    // $ANTLR end synpred8_InternalCssDsl

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


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA25_eotS =
        "\5\uffff";
    static final String DFA25_eofS =
        "\1\3\4\uffff";
    static final String DFA25_minS =
        "\1\6\1\uffff\1\5\2\uffff";
    static final String DFA25_maxS =
        "\1\54\1\uffff\1\67\2\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA25_specialS =
        "\5\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\1\2\4\uffff\1\1\16\uffff\1\3\17\uffff\2\1",
            "",
            "\1\4\1\uffff\1\2\2\uffff\1\4\1\uffff\1\4\1\uffff\4\4\11\uffff"+
            "\1\3\3\uffff\1\4\5\uffff\3\4\3\uffff\2\4\7\uffff\4\4",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "764:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?";
        }
    }
    static final String DFA26_eotS =
        "\24\uffff";
    static final String DFA26_eofS =
        "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String DFA26_minS =
        "\1\16\1\17\7\5\1\uffff\11\5\1\uffff";
    static final String DFA26_maxS =
        "\11\67\1\uffff\11\67\1\uffff";
    static final String DFA26_acceptS =
        "\11\uffff\1\2\11\uffff\1\1";
    static final String DFA26_specialS =
        "\24\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\2\1\3\1\4\24\uffff\2\11\14\uffff\1\5\1\6\1\7\1\10",
            "\1\2\1\3\1\4\42\uffff\1\5\1\6\1\7\1\10",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "873:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String DFA31_eotS =
        "\24\uffff";
    static final String DFA31_eofS =
        "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String DFA31_minS =
        "\1\16\1\17\7\5\1\uffff\11\5\1\uffff";
    static final String DFA31_maxS =
        "\11\67\1\uffff\11\67\1\uffff";
    static final String DFA31_acceptS =
        "\11\uffff\1\2\11\uffff\1\1";
    static final String DFA31_specialS =
        "\24\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\2\1\3\1\4\24\uffff\2\11\14\uffff\1\5\1\6\1\7\1\10",
            "\1\2\1\3\1\4\42\uffff\1\5\1\6\1\7\1\10",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
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
            return "1032:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String DFA45_eotS =
        "\25\uffff";
    static final String DFA45_eofS =
        "\3\uffff\7\13\2\uffff\11\13";
    static final String DFA45_minS =
        "\2\5\1\17\7\5\2\uffff\11\5";
    static final String DFA45_maxS =
        "\1\5\11\67\2\uffff\11\67";
    static final String DFA45_acceptS =
        "\12\uffff\1\2\1\1\11\uffff";
    static final String DFA45_specialS =
        "\25\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1",
            "\1\13\10\uffff\1\2\1\3\1\4\1\5\30\uffff\1\12\11\uffff\1\6"+
            "\1\7\1\10\1\11",
            "\1\3\1\4\1\5\42\uffff\1\6\1\7\1\10\1\11",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "",
            "",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24",
            "\3\13\2\uffff\1\13\1\uffff\1\13\1\uffff\1\15\1\14\1\16\1\17"+
            "\1\20\10\uffff\1\13\3\uffff\1\13\5\uffff\1\13\3\uffff\1\12\1"+
            "\uffff\2\13\7\uffff\1\21\1\22\1\23\1\24"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1775:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )";
        }
    }
    static final String DFA63_eotS =
        "\14\uffff";
    static final String DFA63_eofS =
        "\1\1\13\uffff";
    static final String DFA63_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA63_maxS =
        "\1\67\1\uffff\11\0\1\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA63_specialS =
        "\2\uffff\1\10\1\6\1\0\1\2\1\7\1\5\1\4\1\1\1\3\1\uffff}>";
    static final String[] DFA63_transitionS = {
            "\12\1\1\2\1\3\1\4\1\5\1\12\3\uffff\1\1\4\uffff\2\1\2\uffff"+
            "\7\1\1\uffff\3\1\1\uffff\3\1\6\uffff\1\6\1\7\1\10\1\11",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()* loopback of 3056:2: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_4 = input.LA(1);

                         
                        int index63_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_9 = input.LA(1);

                         
                        int index63_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_5 = input.LA(1);

                         
                        int index63_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_8 = input.LA(1);

                         
                        int index63_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_7 = input.LA(1);

                         
                        int index63_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_3 = input.LA(1);

                         
                        int index63_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA63_6 = input.LA(1);

                         
                        int index63_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rulestylesheet131 = new BitSet(new long[]{0x00F000E0E783C422L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rulestylesheet153 = new BitSet(new long[]{0x00F000E0E783C422L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet176 = new BitSet(new long[]{0x00F000E0E603C422L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet203 = new BitSet(new long[]{0x00F000E0E603C422L});
    public static final BitSet FOLLOW_rulepage_in_rulestylesheet230 = new BitSet(new long[]{0x00F000E0E603C422L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulecharset316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_rulecharset334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecharset352 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulecharset369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleimportExpression453 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_24_in_ruleimportExpression471 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleimportExpression490 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleimportExpression524 = new BitSet(new long[]{0x00F000000043C000L});
    public static final BitSet FOLLOW_rulemedia_list_in_ruleimportExpression544 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleimportExpression559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulepage652 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_26_in_rulepage670 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rulepage692 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulepage705 = new BitSet(new long[]{0x00F000001043C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage726 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_rulepage740 = new BitSet(new long[]{0x00F000001043C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage761 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_28_in_rulepage776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulepseudo_page864 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulepseudo_page891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulemedia984 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_30_in_rulemedia1002 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia1024 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulemedia1036 = new BitSet(new long[]{0x00F000E09003C420L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia1057 = new BitSet(new long[]{0x00F000E09003C420L});
    public static final BitSet FOLLOW_28_in_rulemedia1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1165 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulemedia_list1186 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1213 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulemedium1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1418 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1430 = new BitSet(new long[]{0x00F000E08003C420L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1450 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleruleset1464 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_27_in_ruleruleset1477 = new BitSet(new long[]{0x00F000001003C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1499 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleruleset1512 = new BitSet(new long[]{0x00F000000003C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1533 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleruleset1548 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleruleset1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1666 = new BitSet(new long[]{0x0000180000001082L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1689 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1701 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1743 = new BitSet(new long[]{0x00F018E08003D4A0L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1766 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1778 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSelectorForNegation_in_entryRuleSimpleSelectorForNegation1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSelectorForNegation1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_ruleSimpleSelectorForNegation1903 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorForNegation1930 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1952 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1991 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_entryRuleSubSelectorForNegation2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelectorForNegation2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelectorForNegation2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelectorForNegation2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelectorForNegation2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_ruleSubSelectorForNegation2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_rulesimple_selector2259 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_rulesimple_selector2286 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector2308 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector2347 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_entryRuleSubSelector2384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelector2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelector2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelector2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelector2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassOrFunc_in_ruleSubSelector2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSelector2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAttributeSelector2613 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeSelector2634 = new BitSet(new long[]{0x0000001F00000300L});
    public static final BitSet FOLLOW_32_in_ruleAttributeSelector2655 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_33_in_ruleAttributeSelector2684 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_34_in_ruleAttributeSelector2713 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_35_in_ruleAttributeSelector2742 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2770 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2790 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeSelector2821 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeSelector2836 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAttributeSelector2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_entryRuleClassSelector2894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSelector2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClassSelector2950 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleClassSelector2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_entryRuleElementSelector3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementSelector3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleElementSelector3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector3108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniversalSelector3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector3173 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUniversalSelector3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_entryRuleIdSelector3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdSelector3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleIdSelector3277 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIdSelector3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix3334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulecss_namespace_prefix3393 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38_in_rulecss_namespace_prefix3417 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulecss_namespace_prefix3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration3478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3529 = new BitSet(new long[]{0x00F000000003C080L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_declaration3551 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3563 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulecss_declaration3575 = new BitSet(new long[]{0x00F020200007F4D0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulecss_declaration3595 = new BitSet(new long[]{0x00F020200007FCD2L});
    public static final BitSet FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rulecss_property3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleValidPropertyIdent3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassOrFunc_in_entryRulePseudoClassOrFunc3862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassOrFunc3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_rulePseudoClassOrFunc3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_rulePseudoClassOrFunc3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_entryRulePseudoClass3981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClass3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePseudoClass4027 = new BitSet(new long[]{0x00F000000003C020L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePseudoClass4038 = new BitSet(new long[]{0x00F000000003C020L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_rulePseudoClass4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName4096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassName4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePseudoClassName4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction4186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassFunction4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotFunctionCall_in_rulePseudoClassFunction4243 = new BitSet(new long[]{0x00F000E08003C420L});
    public static final BitSet FOLLOW_ruleSimpleSelectorForNegation_in_rulePseudoClassFunction4264 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePseudoClassFunction4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePseudoClassFunction4295 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePseudoClassFunction4315 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePseudoClassFunction4327 = new BitSet(new long[]{0x00F021200007F4D0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulePseudoClassFunction4348 = new BitSet(new long[]{0x00F021200007F4D0L});
    public static final BitSet FOLLOW_40_in_rulePseudoClassFunction4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotFunctionCall_in_entryRuleNotFunctionCall4405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotFunctionCall4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleNotFunctionCall4460 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNotFunctionCall4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator4523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulecombinator4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulecombinator4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulecombinator4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSymbolTok4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSymbolTok4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok4788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleWSTok4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok4878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringTok4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok4986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNum_in_ruleNumberTok5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok5095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleUrlTok5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok5202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHex_in_ruleColorTok5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierOrFuncTok_in_entryRuleIdentifierOrFuncTok5317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrFuncTok5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIdentifierOrFuncTok5386 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleIdentifierOrFuncTok5408 = new BitSet(new long[]{0x00F020200007F4D0L});
    public static final BitSet FOLLOW_ruleCssTok_in_ruleIdentifierOrFuncTok5429 = new BitSet(new long[]{0x00F021200007F4D0L});
    public static final BitSet FOLLOW_40_in_ruleIdentifierOrFuncTok5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok5490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierOrFuncTok_in_ruleCssTok5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_ruleCssTok5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_ruleCssTok5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_ruleCssTok5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_ruleCssTok5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_ruleCssTok5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_ruleCssTok5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType5758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleURLType5809 = new BitSet(new long[]{0x1FFFD0788047F470L});
    public static final BitSet FOLLOW_ruleValidURL_in_ruleURLType5830 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleURLType5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURLSymbol_in_entryRuleValidURLSymbol5883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidURLSymbol5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleValidURLSymbol5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleValidURLSymbol5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleValidURLSymbol5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleValidURLSymbol6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleValidURLSymbol6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValidURLSymbol6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValidURLSymbol6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleValidURLSymbol6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleValidURLSymbol6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleValidURLSymbol6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValidURLSymbol6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValidURLSymbol6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValidURLSymbol6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValidURLSymbol6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleValidURLSymbol6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleValidURLSymbol6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleValidURLSymbol6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValidURLSymbol6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleValidURLSymbol6317 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleValidURLSymbol6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_entryRuleKeywordHack6386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeywordHack6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleKeywordHack6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleKeywordHack6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleKeywordHack6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleKeywordHack6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURL_in_entryRuleValidURL6539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidURL6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValidURL6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURLSymbol_in_ruleValidURL6628 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleValidURL6661 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6687 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleValidURL6713 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6739 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_56_in_ruleValidURL6763 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_57_in_ruleValidURL6782 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_58_in_ruleValidURL6801 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_59_in_ruleValidURL6820 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_60_in_ruleValidURL6839 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleValidURL6861 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6882 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6908 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6930 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6956 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier7016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleIdentifier7072 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7095 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7121 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7147 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleIdentifier7180 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7250 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleIdentifier7276 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7302 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7328 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleIdentifier7354 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleIdentifier7387 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_ruleNum_in_entryRuleNum7446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNum7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleNum7502 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleNum7528 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_ruleNum7550 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7571 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7607 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_37_in_ruleNum7637 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7659 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleHex_in_entryRuleHex7715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHex7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleHex7766 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleHex7803 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleHex7829 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_synpred1_InternalCssDsl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelector_in_synpred2_InternalCssDsl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_synpred3_InternalCssDsl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_synpred3_InternalCssDsl7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_synpred3_InternalCssDsl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_synpred3_InternalCssDsl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred3_InternalCssDsl7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_synpred3_InternalCssDsl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred4_InternalCssDsl7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred5_InternalCssDsl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred6_InternalCssDsl7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred7_InternalCssDsl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred8_InternalCssDsl7782 = new BitSet(new long[]{0x0000000000000002L});

}