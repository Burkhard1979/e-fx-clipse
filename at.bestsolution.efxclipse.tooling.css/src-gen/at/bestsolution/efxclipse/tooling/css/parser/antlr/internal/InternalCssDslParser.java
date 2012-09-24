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

@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENT", "RULE_COMMA", "RULE_WS", "RULE_HASH", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_INTEGER", "RULE_REAL", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "';'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'{'", "'}'", "':'", "'@media'", "'@MEDIA'", "'*'", "'|'", "'.'", "'['", "'^='", "'$='", "'*='", "'='", "']'", "'-'", "')'", "'('", "'+'", "'>'", "'~'", "'/'", "'url'", "'%'", "'em'", "'ex'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'!important'", "'not('"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=9;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_REAL=12;
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
    public static final int RULE_HASH=8;
    public static final int RULE_COMMA=6;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_DASHMATCH=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_IDENT=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=7;
    public static final int RULE_INTEGER=11;

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
             newCompositeNode(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet75);
            iv_rulestylesheet=rulestylesheet();

            state._fsp--;

             current =iv_rulestylesheet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet85); 

            }

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

            if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:1: (lv_charset_0_0= rulecharset )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:1: (lv_charset_0_0= rulecharset )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:83:3: lv_charset_0_0= rulecharset
                    {
                     
                    	        newCompositeNode(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecharset_in_rulestylesheet131);
                    lv_charset_0_0=rulecharset();

                    state._fsp--;


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
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:3: ( (lv_imports_1_0= ruleimportExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:1: (lv_imports_1_0= ruleimportExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:1: (lv_imports_1_0= ruleimportExpression )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:101:3: lv_imports_1_0= ruleimportExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleimportExpression_in_rulestylesheet153);
            	    lv_imports_1_0=ruleimportExpression();

            	    state._fsp--;


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
                case RULE_HASH:
                case 23:
                case 26:
                case 27:
                case 28:
                case 29:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                case 25:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                case 20:
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
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleset_in_rulestylesheet176);
            	    lv_ruleset_2_0=ruleruleset();

            	    state._fsp--;


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
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulemedia_in_rulestylesheet203);
            	    lv_media_3_0=rulemedia();

            	    state._fsp--;


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
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulepage_in_rulestylesheet230);
            	    lv_page_4_0=rulepage();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset268);
            iv_rulecharset=rulecharset();

            state._fsp--;

             current =iv_rulecharset; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset278); 

            }

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

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:4: otherlv_0= '@charset'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulecharset316); 

                        	newLeafNode(otherlv_0, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:199:7: otherlv_1= '@CHARSET'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulecharset334); 

                        	newLeafNode(otherlv_1, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:2: ( (lv_charset_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:204:1: (lv_charset_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:204:1: (lv_charset_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:205:3: lv_charset_2_0= RULE_STRING
            {
            lv_charset_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecharset352); 

            			newLeafNode(lv_charset_2_0, grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
            		

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulecharset369); 

                	newLeafNode(otherlv_3, grammarAccess.getCharsetAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getImportExpressionRule()); 
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression405);
            iv_ruleimportExpression=ruleimportExpression();

            state._fsp--;

             current =iv_ruleimportExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression415); 

            }

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

            if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
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

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==18) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:5: otherlv_0= '@import'
                            {
                            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleimportExpression454); 

                                	newLeafNode(otherlv_0, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:251:7: otherlv_1= '@IMPORT'
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleimportExpression472); 

                                	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:255:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:1: (lv_value_2_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:257:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleimportExpression490); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                    		

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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:275:5: this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleURLType_in_ruleimportExpression525);
                    this_URLType_3=ruleURLType();

                    state._fsp--;

                     
                            current = this_URLType_3; 
                            afterParserOrEnumRuleCall();
                        
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
                             
                            	        newCompositeNode(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulemedia_list_in_ruleimportExpression545);
                            lv_mediaList_4_0=rulemedia_list();

                            state._fsp--;


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
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleimportExpression558); 

                        	newLeafNode(otherlv_5, grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulepage_in_entryRulepage595);
            iv_rulepage=rulepage();

            state._fsp--;

             current =iv_rulepage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepage605); 

            }

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

                    current = forceCreateModelElement(
                        grammarAccess.getPageAccess().getPageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:332:2: (otherlv_1= '@page' | otherlv_2= '@PAGE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:332:4: otherlv_1= '@page'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulepage652); 

                        	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:337:7: otherlv_2= '@PAGE'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulepage670); 

                        	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getPAGEKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:341:2: ( (lv_pseudoPage_3_0= rulepseudo_page ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:342:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:342:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:343:3: lv_pseudoPage_3_0= rulepseudo_page
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulepseudo_page_in_rulepage692);
                    lv_pseudoPage_3_0=rulepseudo_page();

                    state._fsp--;


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
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulepage705); 

                	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: ( (lv_declarations_5_0= rulecss_declaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT||LA10_0==RULE_WS||LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:364:1: (lv_declarations_5_0= rulecss_declaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:364:1: (lv_declarations_5_0= rulecss_declaration )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:365:3: lv_declarations_5_0= rulecss_declaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_declaration_in_rulepage726);
                    lv_declarations_5_0=rulecss_declaration();

                    state._fsp--;


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
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:381:3: (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:381:5: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_rulepage740); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:1: ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_IDENT||LA11_0==RULE_WS||LA11_0==35) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:386:1: (lv_declarations_7_0= rulecss_declaration )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:386:1: (lv_declarations_7_0= rulecss_declaration )
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:387:3: lv_declarations_7_0= rulecss_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulecss_declaration_in_rulepage761);
            	            lv_declarations_7_0=rulecss_declaration();

            	            state._fsp--;


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
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_rulepage776); 

                	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getPseudo_pageRule()); 
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page813);
            iv_rulepseudo_page=rulepseudo_page();

            state._fsp--;

             current =iv_rulepseudo_page.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page824); 

            }

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
            kw=(Token)match(input,23,FOLLOW_23_in_rulepseudo_page862); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulepseudo_page877); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia922);
            iv_rulemedia=rulemedia();

            state._fsp--;

             current =iv_rulemedia; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia932); 

            }

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

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:4: otherlv_0= '@media'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulemedia970); 

                        	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:467:7: otherlv_1= '@MEDIA'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulemedia988); 

                        	newLeafNode(otherlv_1, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:471:2: ( (lv_medialist_2_0= rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:472:1: (lv_medialist_2_0= rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:472:1: (lv_medialist_2_0= rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:473:3: lv_medialist_2_0= rulemedia_list
            {
             
            	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia1010);
            lv_medialist_2_0=rulemedia_list();

            state._fsp--;


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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulemedia1022); 

                	newLeafNode(otherlv_3, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:493:1: ( (lv_rulesets_4_0= ruleruleset ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_IDENT||LA14_0==RULE_HASH||LA14_0==23||(LA14_0>=26 && LA14_0<=29)||(LA14_0>=44 && LA14_0<=58)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:494:1: (lv_rulesets_4_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:494:1: (lv_rulesets_4_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:495:3: lv_rulesets_4_0= ruleruleset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia1043);
            	    lv_rulesets_4_0=ruleruleset();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulemedia1056); 

                	newLeafNode(otherlv_5, grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getMedia_listRule()); 
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list1093);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;

             current =iv_rulemedia_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list1104); 

            }

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
             
                    newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list1151);
            this_medium_0=rulemedium();

            state._fsp--;


            		current.merge(this_medium_0);
                
             
                    afterParserOrEnumRuleCall();
                
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
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list1172); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list1199);
            	    this_medium_2=rulemedium();

            	    state._fsp--;


            	    		current.merge(this_medium_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getMediumRule()); 
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium1247);
            iv_rulemedium=rulemedium();

            state._fsp--;

             current =iv_rulemedium.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium1258); 

            }

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
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium1297); 

            		current.merge(this_IDENT_0);
                
             
                newLeafNode(this_IDENT_0, grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
                

            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getRulesetRule()); 
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset1341);
            iv_ruleruleset=ruleruleset();

            state._fsp--;

             current =iv_ruleruleset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset1351); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:610:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleruleset() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_declarations_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:2: ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:615:1: (lv_selectors_0_0= ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:615:1: (lv_selectors_0_0= ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:616:3: lv_selectors_0_0= ruleselector
            {
             
            	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleselector_in_ruleruleset1397);
            lv_selectors_0_0=ruleselector();

            state._fsp--;


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
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset1409); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:636:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:637:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:637:1: (lv_selectors_2_0= ruleselector )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:638:3: lv_selectors_2_0= ruleselector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset1429);
            	    lv_selectors_2_0=ruleselector();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleruleset1443); 

                	newLeafNode(otherlv_3, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:658:1: ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_IDENT||LA17_0==RULE_WS||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:658:2: ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:658:2: ( (lv_declarations_4_0= rulecss_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:659:1: (lv_declarations_4_0= rulecss_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:659:1: (lv_declarations_4_0= rulecss_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:660:3: lv_declarations_4_0= rulecss_declaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1465);
            	    lv_declarations_4_0=rulecss_declaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_4_0, 
            	            		"css_declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleruleset1477); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleruleset1491); 

                	newLeafNode(otherlv_6, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:692:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:696:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:697:2: iv_ruleselector= ruleselector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1533);
            iv_ruleselector=ruleselector();

            state._fsp--;

             current =iv_ruleselector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1543); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:707:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:711:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:712:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:712:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:712:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:712:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:713:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:713:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:714:3: lv_simpleselectors_0_0= rulesimple_selector
            {
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1593);
            lv_simpleselectors_0_0=rulesimple_selector();

            state._fsp--;


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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=38 && LA20_0<=40)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_WS) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:4: ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:731:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:731:1: (lv_combinator_1_0= rulecombinator )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:732:3: lv_combinator_1_0= rulecombinator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1616);
                    lv_combinator_1_0=rulecombinator();

                    state._fsp--;


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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:748:2: ( (lv_selector_2_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:749:1: (lv_selector_2_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:749:1: (lv_selector_2_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:750:3: lv_selector_2_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1637);
                    lv_selector_2_0=ruleselector();

                    state._fsp--;


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
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:767:6: ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:767:6: ( (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:767:7: (this_WS_3= RULE_WS )+ ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:767:7: (this_WS_3= RULE_WS )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:767:8: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1657); 
                    	     
                    	        newLeafNode(this_WS_3, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:3: ( (lv_combinator_4_0= rulecombinator ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=38 && LA19_0<=40)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:772:1: (lv_combinator_4_0= rulecombinator )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:772:1: (lv_combinator_4_0= rulecombinator )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:773:3: lv_combinator_4_0= rulecombinator
                            {
                             
                            	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulecombinator_in_ruleselector1679);
                            lv_combinator_4_0=rulecombinator();

                            state._fsp--;


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
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:789:3: ( (lv_selector_5_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:790:1: (lv_selector_5_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:790:1: (lv_selector_5_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:791:3: lv_selector_5_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1701);
                    lv_selector_5_0=ruleselector();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:818:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:819:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:820:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
             newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector1744);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;

             current =iv_rulesimple_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector1754); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:827:1: rulesimple_selector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_element_0_0 = null;

        AntlrDatatypeRuleToken lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:28: ( ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:1: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:1: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENT||(LA24_0>=26 && LA24_0<=27)||(LA24_0>=44 && LA24_0<=58)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_HASH||LA24_0==23||(LA24_0>=28 && LA24_0<=29)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:2: ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:2: ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:3: ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:3: ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) )
                    int alt21=2;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                        {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==EOF||(LA21_1>=RULE_COMMA && LA21_1<=RULE_HASH)||LA21_1==21||LA21_1==23||(LA21_1>=28 && LA21_1<=29)||(LA21_1>=38 && LA21_1<=40)) ) {
                            alt21=1;
                        }
                        else if ( (LA21_1==27) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                        {
                        alt21=1;
                        }
                        break;
                    case 26:
                    case 27:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:4: ( (lv_element_0_0= ruleelement_name ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:4: ( (lv_element_0_0= ruleelement_name ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:832:1: (lv_element_0_0= ruleelement_name )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:832:1: (lv_element_0_0= ruleelement_name )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:833:3: lv_element_0_0= ruleelement_name
                            {
                             
                            	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleelement_name_in_rulesimple_selector1802);
                            lv_element_0_0=ruleelement_name();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"element",
                                    		lv_element_0_0, 
                                    		"element_name");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:6: ( (lv_universal_1_0= rulecss_universal ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:6: ( (lv_universal_1_0= rulecss_universal ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:851:1: (lv_universal_1_0= rulecss_universal )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:851:1: (lv_universal_1_0= rulecss_universal )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:852:3: lv_universal_1_0= rulecss_universal
                            {
                             
                            	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getUniversalCss_universalParserRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulecss_universal_in_rulesimple_selector1829);
                            lv_universal_1_0=rulecss_universal();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"universal",
                                    		lv_universal_1_0, 
                                    		"css_universal");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:868:3: ( (lv_subSelectors_2_0= rulesub_selector ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_HASH||LA22_0==23||(LA22_0>=28 && LA22_0<=29)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:869:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:869:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:870:3: lv_subSelectors_2_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1851);
                    	    lv_subSelectors_2_0=rulesub_selector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSelectors",
                    	            		lv_subSelectors_2_0, 
                    	            		"sub_selector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:887:6: ( (lv_subSelectors_3_0= rulesub_selector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:887:6: ( (lv_subSelectors_3_0= rulesub_selector ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_HASH||LA23_0==23||(LA23_0>=28 && LA23_0<=29)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:888:1: (lv_subSelectors_3_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:888:1: (lv_subSelectors_3_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:889:3: lv_subSelectors_3_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1880);
                    	    lv_subSelectors_3_0=rulesub_selector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSelectors",
                    	            		lv_subSelectors_3_0, 
                    	            		"sub_selector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:913:1: entryRuleelement_name returns [String current=null] : iv_ruleelement_name= ruleelement_name EOF ;
    public final String entryRuleelement_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelement_name = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:914:2: (iv_ruleelement_name= ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:915:2: iv_ruleelement_name= ruleelement_name EOF
            {
             newCompositeNode(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name1918);
            iv_ruleelement_name=ruleelement_name();

            state._fsp--;

             current =iv_ruleelement_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name1929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelement_name"


    // $ANTLR start "ruleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:922:1: ruleelement_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords ) ;
    public final AntlrDatatypeRuleToken ruleelement_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        AntlrDatatypeRuleToken this_ReservedWords_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:925:28: ( (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:926:1: (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:926:1: (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENT) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=44 && LA25_0<=58)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:926:6: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleelement_name1969); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:935:5: this_ReservedWords_1= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_ruleelement_name2002);
                    this_ReservedWords_1=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleelement_name"


    // $ANTLR start "entryRulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:1: entryRulesub_selector returns [EObject current=null] : iv_rulesub_selector= rulesub_selector EOF ;
    public final EObject entryRulesub_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesub_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:954:2: (iv_rulesub_selector= rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:955:2: iv_rulesub_selector= rulesub_selector EOF
            {
             newCompositeNode(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector2047);
            iv_rulesub_selector=rulesub_selector();

            state._fsp--;

             current =iv_rulesub_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector2057); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesub_selector"


    // $ANTLR start "rulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:962:1: rulesub_selector returns [EObject current=null] : ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) ) ;
    public final EObject rulesub_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_class_1_0 = null;

        AntlrDatatypeRuleToken lv_attrib_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudoclass_3_0 = null;

        EObject lv_negotation_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:965:28: ( ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:966:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:966:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case RULE_HASH:
                {
                alt26=1;
                }
                break;
            case 28:
                {
                alt26=2;
                }
                break;
            case 29:
                {
                alt26=3;
                }
                break;
            case 23:
                {
                int LA26_4 = input.LA(2);

                if ( (LA26_4==60) ) {
                    alt26=5;
                }
                else if ( (LA26_4==RULE_IDENT||LA26_4==23) ) {
                    alt26=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:966:2: ( (lv_id_0_0= rulecss_id ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:966:2: ( (lv_id_0_0= rulecss_id ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:967:1: (lv_id_0_0= rulecss_id )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:967:1: (lv_id_0_0= rulecss_id )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:968:3: lv_id_0_0= rulecss_id
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_id_in_rulesub_selector2103);
                    lv_id_0_0=rulecss_id();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"css_id");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:985:6: ( (lv_class_1_0= rulecss_class ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:985:6: ( (lv_class_1_0= rulecss_class ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:986:1: (lv_class_1_0= rulecss_class )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:986:1: (lv_class_1_0= rulecss_class )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:987:3: lv_class_1_0= rulecss_class
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_class_in_rulesub_selector2130);
                    lv_class_1_0=rulecss_class();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"class",
                            		lv_class_1_0, 
                            		"css_class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1004:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1004:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1005:1: (lv_attrib_2_0= rulecss_attrib )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1005:1: (lv_attrib_2_0= rulecss_attrib )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1006:3: lv_attrib_2_0= rulecss_attrib
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_attrib_in_rulesub_selector2157);
                    lv_attrib_2_0=rulecss_attrib();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"attrib",
                            		lv_attrib_2_0, 
                            		"css_attrib");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1023:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1023:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1024:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1024:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1025:3: lv_pseudoclass_3_0= rulecss_pseudo
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_pseudo_in_rulesub_selector2184);
                    lv_pseudoclass_3_0=rulecss_pseudo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"pseudoclass",
                            		lv_pseudoclass_3_0, 
                            		"css_pseudo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1042:6: ( (lv_negotation_4_0= rulecss_negation ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1042:6: ( (lv_negotation_4_0= rulecss_negation ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1043:1: (lv_negotation_4_0= rulecss_negation )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1043:1: (lv_negotation_4_0= rulecss_negation )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1044:3: lv_negotation_4_0= rulecss_negation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getNegotationCss_negationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_negation_in_rulesub_selector2211);
                    lv_negotation_4_0=rulecss_negation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"negotation",
                            		lv_negotation_4_0, 
                            		"css_negation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesub_selector"


    // $ANTLR start "entryRulecss_type_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1068:1: entryRulecss_type_selector returns [String current=null] : iv_rulecss_type_selector= rulecss_type_selector EOF ;
    public final String entryRulecss_type_selector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_type_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1069:2: (iv_rulecss_type_selector= rulecss_type_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1070:2: iv_rulecss_type_selector= rulecss_type_selector EOF
            {
             newCompositeNode(grammarAccess.getCss_type_selectorRule()); 
            pushFollow(FOLLOW_rulecss_type_selector_in_entryRulecss_type_selector2248);
            iv_rulecss_type_selector=rulecss_type_selector();

            state._fsp--;

             current =iv_rulecss_type_selector.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_type_selector2259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_type_selector"


    // $ANTLR start "rulecss_type_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1077:1: rulecss_type_selector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name ) ;
    public final AntlrDatatypeRuleToken rulecss_type_selector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_css_namespace_prefix_0 = null;

        AntlrDatatypeRuleToken this_element_name_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1080:28: ( ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1081:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1081:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1081:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1081:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENT) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==27) ) {
                    alt27=1;
                }
            }
            else if ( ((LA27_0>=26 && LA27_0<=27)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1082:5: this_css_namespace_prefix_0= rulecss_namespace_prefix
                    {
                     
                            newCompositeNode(grammarAccess.getCss_type_selectorAccess().getCss_namespace_prefixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_rulecss_type_selector2307);
                    this_css_namespace_prefix_0=rulecss_namespace_prefix();

                    state._fsp--;


                    		current.merge(this_css_namespace_prefix_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getCss_type_selectorAccess().getElement_nameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleelement_name_in_rulecss_type_selector2336);
            this_element_name_1=ruleelement_name();

            state._fsp--;


            		current.merge(this_element_name_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_type_selector"


    // $ANTLR start "entryRulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1111:1: entryRulecss_namespace_prefix returns [String current=null] : iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF ;
    public final String entryRulecss_namespace_prefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_namespace_prefix = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1112:2: (iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1113:2: iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF
            {
             newCompositeNode(grammarAccess.getCss_namespace_prefixRule()); 
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix2382);
            iv_rulecss_namespace_prefix=rulecss_namespace_prefix();

            state._fsp--;

             current =iv_rulecss_namespace_prefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix2393); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1120:1: rulecss_namespace_prefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulecss_namespace_prefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1123:28: ( ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:1: ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:1: ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:2: (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:2: (this_IDENT_0= RULE_IDENT | kw= '*' )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENT) ) {
                alt28=1;
            }
            else if ( (LA28_0==26) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:7: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_namespace_prefix2434); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1133:2: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulecss_namespace_prefix2458); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,27,FOLLOW_27_in_rulecss_namespace_prefix2473); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulecss_universal"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1152:1: entryRulecss_universal returns [String current=null] : iv_rulecss_universal= rulecss_universal EOF ;
    public final String entryRulecss_universal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_universal = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1153:2: (iv_rulecss_universal= rulecss_universal EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1154:2: iv_rulecss_universal= rulecss_universal EOF
            {
             newCompositeNode(grammarAccess.getCss_universalRule()); 
            pushFollow(FOLLOW_rulecss_universal_in_entryRulecss_universal2514);
            iv_rulecss_universal=rulecss_universal();

            state._fsp--;

             current =iv_rulecss_universal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_universal2525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_universal"


    // $ANTLR start "rulecss_universal"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1161:1: rulecss_universal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' ) ;
    public final AntlrDatatypeRuleToken rulecss_universal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_css_namespace_prefix_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1164:28: ( ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENT||LA29_0==27) ) {
                alt29=1;
            }
            else if ( (LA29_0==26) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==27) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1166:5: this_css_namespace_prefix_0= rulecss_namespace_prefix
                    {
                     
                            newCompositeNode(grammarAccess.getCss_universalAccess().getCss_namespace_prefixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_rulecss_universal2573);
                    this_css_namespace_prefix_0=rulecss_namespace_prefix();

                    state._fsp--;


                    		current.merge(this_css_namespace_prefix_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_26_in_rulecss_universal2593); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_universalAccess().getAsteriskKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_universal"


    // $ANTLR start "entryRulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1190:1: entryRulecss_class returns [String current=null] : iv_rulecss_class= rulecss_class EOF ;
    public final String entryRulecss_class() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_class = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1191:2: (iv_rulecss_class= rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1192:2: iv_rulecss_class= rulecss_class EOF
            {
             newCompositeNode(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class2634);
            iv_rulecss_class=rulecss_class();

            state._fsp--;

             current =iv_rulecss_class.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class2645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_class"


    // $ANTLR start "rulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1199:1: rulecss_class returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ) ;
    public final AntlrDatatypeRuleToken rulecss_class() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        AntlrDatatypeRuleToken this_ReservedWords_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1202:28: ( (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1203:1: (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1203:1: (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1204:2: kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulecss_class2683); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1209:1: (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENT) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=44 && LA30_0<=58)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1209:6: this_IDENT_1= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_class2699); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1218:5: this_ReservedWords_2= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_class2732);
                    this_ReservedWords_2=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_class"


    // $ANTLR start "entryRulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1236:1: entryRulecss_id returns [String current=null] : iv_rulecss_id= rulecss_id EOF ;
    public final String entryRulecss_id() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_id = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1237:2: (iv_rulecss_id= rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1238:2: iv_rulecss_id= rulecss_id EOF
            {
             newCompositeNode(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id2779);
            iv_rulecss_id=rulecss_id();

            state._fsp--;

             current =iv_rulecss_id.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id2790); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_id"


    // $ANTLR start "rulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1245:1: rulecss_id returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HASH_0= RULE_HASH ;
    public final AntlrDatatypeRuleToken rulecss_id() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1248:28: (this_HASH_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1249:5: this_HASH_0= RULE_HASH
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_id2829); 

            		current.merge(this_HASH_0);
                
             
                newLeafNode(this_HASH_0, grammarAccess.getCss_idAccess().getHASHTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_id"


    // $ANTLR start "entryRulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1264:1: entryRulecss_attrib returns [String current=null] : iv_rulecss_attrib= rulecss_attrib EOF ;
    public final String entryRulecss_attrib() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_attrib = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1265:2: (iv_rulecss_attrib= rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1266:2: iv_rulecss_attrib= rulecss_attrib EOF
            {
             newCompositeNode(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib2874);
            iv_rulecss_attrib=rulecss_attrib();

            state._fsp--;

             current =iv_rulecss_attrib.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib2885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_attrib"


    // $ANTLR start "rulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1273:1: rulecss_attrib returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' ) ;
    public final AntlrDatatypeRuleToken rulecss_attrib() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_INCLUDES_7=null;
        Token this_DASHMATCH_8=null;
        Token this_IDENT_9=null;
        Token this_STRING_11=null;
        AntlrDatatypeRuleToken this_ReservedWords_2 = null;

        AntlrDatatypeRuleToken this_ReservedWords_10 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1276:28: ( (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1277:1: (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1277:1: (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1278:2: kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_rulecss_attrib2923); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1283:1: (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_IDENT) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=44 && LA31_0<=58)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1283:6: this_IDENT_1= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib2939); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1292:5: this_ReservedWords_2= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_attrib2972);
                    this_ReservedWords_2=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1302:2: ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INCLUDES && LA35_0<=RULE_DASHMATCH)||(LA35_0>=30 && LA35_0<=33)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1302:3: (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1302:3: (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH )
                    int alt32=6;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt32=1;
                        }
                        break;
                    case 31:
                        {
                        alt32=2;
                        }
                        break;
                    case 32:
                        {
                        alt32=3;
                        }
                        break;
                    case 33:
                        {
                        alt32=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt32=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt32=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1303:2: kw= '^='
                            {
                            kw=(Token)match(input,30,FOLLOW_30_in_rulecss_attrib2993); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getCircumflexAccentEqualsSignKeyword_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1310:2: kw= '$='
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_rulecss_attrib3012); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getDollarSignEqualsSignKeyword_2_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1317:2: kw= '*='
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_rulecss_attrib3031); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getAsteriskEqualsSignKeyword_2_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1324:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_rulecss_attrib3050); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1330:10: this_INCLUDES_7= RULE_INCLUDES
                            {
                            this_INCLUDES_7=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rulecss_attrib3071); 

                            		current.merge(this_INCLUDES_7);
                                
                             
                                newLeafNode(this_INCLUDES_7, grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1338:10: this_DASHMATCH_8= RULE_DASHMATCH
                            {
                            this_DASHMATCH_8=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rulecss_attrib3097); 

                            		current.merge(this_DASHMATCH_8);
                                
                             
                                newLeafNode(this_DASHMATCH_8, grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_5()); 
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1345:2: ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_IDENT||(LA34_0>=44 && LA34_0<=58)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_STRING) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1345:3: (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1345:3: (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords )
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==RULE_IDENT) ) {
                                alt33=1;
                            }
                            else if ( ((LA33_0>=44 && LA33_0<=58)) ) {
                                alt33=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 0, input);

                                throw nvae;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1345:8: this_IDENT_9= RULE_IDENT
                                    {
                                    this_IDENT_9=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib3120); 

                                    		current.merge(this_IDENT_9);
                                        
                                     
                                        newLeafNode(this_IDENT_9, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1354:5: this_ReservedWords_10= ruleReservedWords
                                    {
                                     
                                            newCompositeNode(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_attrib3153);
                                    this_ReservedWords_10=ruleReservedWords();

                                    state._fsp--;


                                    		current.merge(this_ReservedWords_10);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1365:10: this_STRING_11= RULE_STRING
                            {
                            this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecss_attrib3180); 

                            		current.merge(this_STRING_11);
                                
                             
                                newLeafNode(this_STRING_11, grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,34,FOLLOW_34_in_rulecss_attrib3201); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_attrib"


    // $ANTLR start "entryRulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1391:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration3247);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;

             current =iv_rulecss_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration3257); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1401:1: rulecss_declaration returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? ) ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        EObject lv_property_1_0 = null;

        EObject lv_valueTokens_4_0 = null;

        AntlrDatatypeRuleToken lv_prio_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1405:28: ( ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1406:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1406:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1406:2: (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1406:2: (this_WS_0= RULE_WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_WS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1406:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3298); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:3: ( (lv_property_1_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1411:1: (lv_property_1_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1411:1: (lv_property_1_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1412:3: lv_property_1_0= rulecss_property
            {
             
            	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulecss_property_in_rulecss_declaration3320);
            lv_property_1_0=rulecss_property();

            state._fsp--;


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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1428:2: (this_WS_2= RULE_WS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_WS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1428:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3332); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulecss_declaration3345); 

                	newLeafNode(otherlv_3, grammarAccess.getCss_declarationAccess().getColonKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1436:1: ( (lv_valueTokens_4_0= ruleCssTok ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_HASH)||(LA38_0>=RULE_INTEGER && LA38_0<=RULE_REAL)||LA38_0==35||LA38_0==38||LA38_0==42) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1437:1: (lv_valueTokens_4_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1437:1: (lv_valueTokens_4_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1438:3: lv_valueTokens_4_0= ruleCssTok
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCssTok_in_rulecss_declaration3366);
            	    lv_valueTokens_4_0=ruleCssTok();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1454:3: ( (lv_prio_5_0= rulecss_prio ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==59) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1455:1: (lv_prio_5_0= rulecss_prio )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1455:1: (lv_prio_5_0= rulecss_prio )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1456:3: lv_prio_5_0= rulecss_prio
                    {
                     
                    	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPrioCss_prioParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_prio_in_rulecss_declaration3388);
                    lv_prio_5_0=rulecss_prio();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCss_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"prio",
                            		lv_prio_5_0, 
                            		"css_prio");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1483:1: entryRulecss_prio returns [String current=null] : iv_rulecss_prio= rulecss_prio EOF ;
    public final String entryRulecss_prio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_prio = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1484:2: (iv_rulecss_prio= rulecss_prio EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1485:2: iv_rulecss_prio= rulecss_prio EOF
            {
             newCompositeNode(grammarAccess.getCss_prioRule()); 
            pushFollow(FOLLOW_rulecss_prio_in_entryRulecss_prio3430);
            iv_rulecss_prio=rulecss_prio();

            state._fsp--;

             current =iv_rulecss_prio.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_prio3441); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_prio"


    // $ANTLR start "rulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1492:1: rulecss_prio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM ;
    public final AntlrDatatypeRuleToken rulecss_prio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IMPORTANT_SYM_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1495:28: (this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1497:5: this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM
            {
             
                    newCompositeNode(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio3487);
            this_IMPORTANT_SYM_0=ruleIMPORTANT_SYM();

            state._fsp--;


            		current.merge(this_IMPORTANT_SYM_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_prio"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1515:1: entryRulecss_property returns [EObject current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final EObject entryRulecss_property() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1516:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1517:2: iv_rulecss_property= rulecss_property EOF
            {
             newCompositeNode(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3531);
            iv_rulecss_property=rulecss_property();

            state._fsp--;

             current =iv_rulecss_property; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3541); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1524:1: rulecss_property returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject rulecss_property() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1527:28: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1528:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1528:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1528:2: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1528:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1529:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCss_propertyAccess().getCss_propertyAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1534:2: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1535:1: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1535:1: (lv_name_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1536:3: lv_name_1_0= ruleValidPropertyIdent
            {
             
            	        newCompositeNode(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rulecss_property3596);
            lv_name_1_0=ruleValidPropertyIdent();

            state._fsp--;


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

             leaveRule(); 
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1560:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1561:2: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1562:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
             newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3633);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;

             current =iv_ruleValidPropertyIdent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent3644); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1569:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1572:28: ( ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1573:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1573:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1573:2: (kw= '-' )? this_IDENT_1= RULE_IDENT
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1573:2: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1574:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleValidPropertyIdent3683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValidPropertyIdentAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleValidPropertyIdent3700); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getValidPropertyIdentAccess().getIDENTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1594:1: entryRulecss_pseudo returns [String current=null] : iv_rulecss_pseudo= rulecss_pseudo EOF ;
    public final String entryRulecss_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1595:2: (iv_rulecss_pseudo= rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1596:2: iv_rulecss_pseudo= rulecss_pseudo EOF
            {
             newCompositeNode(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo3746);
            iv_rulecss_pseudo=rulecss_pseudo();

            state._fsp--;

             current =iv_rulecss_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo3757); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_pseudo"


    // $ANTLR start "rulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1603:1: rulecss_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) ) ;
    public final AntlrDatatypeRuleToken rulecss_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_2=null;
        AntlrDatatypeRuleToken this_functional_pseudo_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1606:28: ( (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:1: (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:1: (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1608:2: kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo )
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulecss_pseudo3795); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1613:1: (kw= ':' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1614:2: kw= ':'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulecss_pseudo3809); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_1()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1619:3: (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_IDENT) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||(LA42_1>=RULE_COMMA && LA42_1<=RULE_HASH)||LA42_1==21||LA42_1==23||(LA42_1>=28 && LA42_1<=29)||LA42_1==36||(LA42_1>=38 && LA42_1<=40)) ) {
                    alt42=1;
                }
                else if ( (LA42_1==37) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1619:8: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_pseudo3827); 

                    		current.merge(this_IDENT_2);
                        
                     
                        newLeafNode(this_IDENT_2, grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1628:5: this_functional_pseudo_3= rulefunctional_pseudo
                    {
                     
                            newCompositeNode(grammarAccess.getCss_pseudoAccess().getFunctional_pseudoParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_rulefunctional_pseudo_in_rulecss_pseudo3860);
                    this_functional_pseudo_3=rulefunctional_pseudo();

                    state._fsp--;


                    		current.merge(this_functional_pseudo_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_pseudo"


    // $ANTLR start "entryRulecss_negation"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1646:1: entryRulecss_negation returns [EObject current=null] : iv_rulecss_negation= rulecss_negation EOF ;
    public final EObject entryRulecss_negation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_negation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1647:2: (iv_rulecss_negation= rulecss_negation EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1648:2: iv_rulecss_negation= rulecss_negation EOF
            {
             newCompositeNode(grammarAccess.getCss_negationRule()); 
            pushFollow(FOLLOW_rulecss_negation_in_entryRulecss_negation3906);
            iv_rulecss_negation=rulecss_negation();

            state._fsp--;

             current =iv_rulecss_negation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_negation3916); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_negation"


    // $ANTLR start "rulecss_negation"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1655:1: rulecss_negation returns [EObject current=null] : (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' ) ;
    public final EObject rulecss_negation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_not_1_0 = null;

        AntlrDatatypeRuleToken lv_negation_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1658:28: ( (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1659:1: (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1659:1: (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1659:3: otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulecss_negation3953); 

                	newLeafNode(otherlv_0, grammarAccess.getCss_negationAccess().getColonKeyword_0());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1663:1: ( (lv_not_1_0= rulecss_not ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1664:1: (lv_not_1_0= rulecss_not )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1664:1: (lv_not_1_0= rulecss_not )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1665:3: lv_not_1_0= rulecss_not
            {
             
            	        newCompositeNode(grammarAccess.getCss_negationAccess().getNotCss_notEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulecss_not_in_rulecss_negation3974);
            lv_not_1_0=rulecss_not();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCss_negationRule());
            	        }
                   		set(
                   			current, 
                   			"not",
                    		lv_not_1_0, 
                    		"css_not");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1681:2: ( (lv_negation_arg_2_0= rulecss_negation_arg ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1682:1: (lv_negation_arg_2_0= rulecss_negation_arg )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1682:1: (lv_negation_arg_2_0= rulecss_negation_arg )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1683:3: lv_negation_arg_2_0= rulecss_negation_arg
            {
             
            	        newCompositeNode(grammarAccess.getCss_negationAccess().getNegation_argCss_negation_argParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulecss_negation_arg_in_rulecss_negation3995);
            lv_negation_arg_2_0=rulecss_negation_arg();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCss_negationRule());
            	        }
                   		set(
                   			current, 
                   			"negation_arg",
                    		lv_negation_arg_2_0, 
                    		"css_negation_arg");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_rulecss_negation4007); 

                	newLeafNode(otherlv_3, grammarAccess.getCss_negationAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_negation"


    // $ANTLR start "entryRulecss_negation_arg"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1711:1: entryRulecss_negation_arg returns [String current=null] : iv_rulecss_negation_arg= rulecss_negation_arg EOF ;
    public final String entryRulecss_negation_arg() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_negation_arg = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1712:2: (iv_rulecss_negation_arg= rulecss_negation_arg EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1713:2: iv_rulecss_negation_arg= rulecss_negation_arg EOF
            {
             newCompositeNode(grammarAccess.getCss_negation_argRule()); 
            pushFollow(FOLLOW_rulecss_negation_arg_in_entryRulecss_negation_arg4044);
            iv_rulecss_negation_arg=rulecss_negation_arg();

            state._fsp--;

             current =iv_rulecss_negation_arg.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_negation_arg4055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_negation_arg"


    // $ANTLR start "rulecss_negation_arg"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1720:1: rulecss_negation_arg returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo ) ;
    public final AntlrDatatypeRuleToken rulecss_negation_arg() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_2=null;
        AntlrDatatypeRuleToken this_css_type_selector_0 = null;

        AntlrDatatypeRuleToken this_css_universal_1 = null;

        AntlrDatatypeRuleToken this_css_class_3 = null;

        AntlrDatatypeRuleToken this_css_attrib_4 = null;

        AntlrDatatypeRuleToken this_css_pseudo_5 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1723:28: ( (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1724:1: (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1724:1: (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo )
            int alt43=6;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1725:5: this_css_type_selector_0= rulecss_type_selector
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_type_selectorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecss_type_selector_in_rulecss_negation_arg4102);
                    this_css_type_selector_0=rulecss_type_selector();

                    state._fsp--;


                    		current.merge(this_css_type_selector_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1737:5: this_css_universal_1= rulecss_universal
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_universalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecss_universal_in_rulecss_negation_arg4135);
                    this_css_universal_1=rulecss_universal();

                    state._fsp--;


                    		current.merge(this_css_universal_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1748:10: this_HASH_2= RULE_HASH
                    {
                    this_HASH_2=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_negation_arg4161); 

                    		current.merge(this_HASH_2);
                        
                     
                        newLeafNode(this_HASH_2, grammarAccess.getCss_negation_argAccess().getHASHTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1757:5: this_css_class_3= rulecss_class
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_classParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulecss_class_in_rulecss_negation_arg4194);
                    this_css_class_3=rulecss_class();

                    state._fsp--;


                    		current.merge(this_css_class_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1769:5: this_css_attrib_4= rulecss_attrib
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_attribParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulecss_attrib_in_rulecss_negation_arg4227);
                    this_css_attrib_4=rulecss_attrib();

                    state._fsp--;


                    		current.merge(this_css_attrib_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1781:5: this_css_pseudo_5= rulecss_pseudo
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_pseudoParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulecss_pseudo_in_rulecss_negation_arg4260);
                    this_css_pseudo_5=rulecss_pseudo();

                    state._fsp--;


                    		current.merge(this_css_pseudo_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_negation_arg"


    // $ANTLR start "entryRulefunctional_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1799:1: entryRulefunctional_pseudo returns [String current=null] : iv_rulefunctional_pseudo= rulefunctional_pseudo EOF ;
    public final String entryRulefunctional_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunctional_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1800:2: (iv_rulefunctional_pseudo= rulefunctional_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1801:2: iv_rulefunctional_pseudo= rulefunctional_pseudo EOF
            {
             newCompositeNode(grammarAccess.getFunctional_pseudoRule()); 
            pushFollow(FOLLOW_rulefunctional_pseudo_in_entryRulefunctional_pseudo4306);
            iv_rulefunctional_pseudo=rulefunctional_pseudo();

            state._fsp--;

             current =iv_rulefunctional_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctional_pseudo4317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunctional_pseudo"


    // $ANTLR start "rulefunctional_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1808:1: rulefunctional_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulefunctional_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_function_expr_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1811:28: ( (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1812:1: (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1812:1: (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1812:6: this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')'
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunctional_pseudo4357); 

            		current.merge(this_IDENT_0);
                
             
                newLeafNode(this_IDENT_0, grammarAccess.getFunctional_pseudoAccess().getIDENTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,37,FOLLOW_37_in_rulefunctional_pseudo4375); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunctional_pseudoAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getFunctional_pseudoAccess().getFunction_exprParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulefunction_expr_in_rulefunctional_pseudo4397);
            this_function_expr_2=rulefunction_expr();

            state._fsp--;


            		current.merge(this_function_expr_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,36,FOLLOW_36_in_rulefunctional_pseudo4415); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunctional_pseudoAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunctional_pseudo"


    // $ANTLR start "entryRulefunction_expr"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1850:1: entryRulefunction_expr returns [String current=null] : iv_rulefunction_expr= rulefunction_expr EOF ;
    public final String entryRulefunction_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_expr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1851:2: (iv_rulefunction_expr= rulefunction_expr EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1852:2: iv_rulefunction_expr= rulefunction_expr EOF
            {
             newCompositeNode(grammarAccess.getFunction_exprRule()); 
            pushFollow(FOLLOW_rulefunction_expr_in_entryRulefunction_expr4456);
            iv_rulefunction_expr=rulefunction_expr();

            state._fsp--;

             current =iv_rulefunction_expr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_expr4467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_expr"


    // $ANTLR start "rulefunction_expr"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1859:1: rulefunction_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+ ;
    public final AntlrDatatypeRuleToken rulefunction_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_4=null;
        Token this_IDENT_5=null;
        AntlrDatatypeRuleToken this_DIMENSION_2 = null;

        AntlrDatatypeRuleToken this_NUMBER_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1862:28: ( (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1863:1: (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1863:1: (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+
            int cnt44=0;
            loop44:
            do {
                int alt44=7;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1864:2: kw= '+'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_rulefunction_expr4505); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFunction_exprAccess().getPlusSignKeyword_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1871:2: kw= '-'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_rulefunction_expr4524); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFunction_exprAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1878:5: this_DIMENSION_2= ruleDIMENSION
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunction_exprAccess().getDIMENSIONParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleDIMENSION_in_rulefunction_expr4552);
            	    this_DIMENSION_2=ruleDIMENSION();

            	    state._fsp--;


            	    		current.merge(this_DIMENSION_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1890:5: this_NUMBER_3= ruleNUMBER
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunction_exprAccess().getNUMBERParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleNUMBER_in_rulefunction_expr4585);
            	    this_NUMBER_3=ruleNUMBER();

            	    state._fsp--;


            	    		current.merge(this_NUMBER_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1901:10: this_STRING_4= RULE_STRING
            	    {
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefunction_expr4611); 

            	    		current.merge(this_STRING_4);
            	        
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getFunction_exprAccess().getSTRINGTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1909:10: this_IDENT_5= RULE_IDENT
            	    {
            	    this_IDENT_5=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction_expr4637); 

            	    		current.merge(this_IDENT_5);
            	        
            	     
            	        newLeafNode(this_IDENT_5, grammarAccess.getFunction_exprAccess().getIDENTTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_expr"


    // $ANTLR start "entryRuleDIMENSION"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1924:1: entryRuleDIMENSION returns [String current=null] : iv_ruleDIMENSION= ruleDIMENSION EOF ;
    public final String entryRuleDIMENSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIMENSION = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1925:2: (iv_ruleDIMENSION= ruleDIMENSION EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1926:2: iv_ruleDIMENSION= ruleDIMENSION EOF
            {
             newCompositeNode(grammarAccess.getDIMENSIONRule()); 
            pushFollow(FOLLOW_ruleDIMENSION_in_entryRuleDIMENSION4684);
            iv_ruleDIMENSION=ruleDIMENSION();

            state._fsp--;

             current =iv_ruleDIMENSION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIMENSION4695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIMENSION"


    // $ANTLR start "ruleDIMENSION"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1933:1: ruleDIMENSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ ) ;
    public final AntlrDatatypeRuleToken ruleDIMENSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PERCENTAGE_0 = null;

        AntlrDatatypeRuleToken this_LENGTH_1 = null;

        AntlrDatatypeRuleToken this_EMS_2 = null;

        AntlrDatatypeRuleToken this_EXS_3 = null;

        AntlrDatatypeRuleToken this_ANGLE_4 = null;

        AntlrDatatypeRuleToken this_TIME_5 = null;

        AntlrDatatypeRuleToken this_FREQ_6 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1936:28: ( (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1937:1: (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1937:1: (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ )
            int alt45=7;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1938:5: this_PERCENTAGE_0= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getPERCENTAGEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_ruleDIMENSION4742);
                    this_PERCENTAGE_0=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1950:5: this_LENGTH_1= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getLENGTHParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_ruleDIMENSION4775);
                    this_LENGTH_1=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1962:5: this_EMS_2= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getEMSParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_ruleDIMENSION4808);
                    this_EMS_2=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1974:5: this_EXS_3= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getEXSParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_ruleDIMENSION4841);
                    this_EXS_3=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1986:5: this_ANGLE_4= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getANGLEParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_ruleDIMENSION4874);
                    this_ANGLE_4=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1998:5: this_TIME_5= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getTIMEParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_ruleDIMENSION4907);
                    this_TIME_5=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2010:5: this_FREQ_6= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getFREQParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_ruleDIMENSION4940);
                    this_FREQ_6=ruleFREQ();

                    state._fsp--;


                    		current.merge(this_FREQ_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIMENSION"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2028:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2029:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2030:2: iv_rulecombinator= rulecombinator EOF
            {
             newCompositeNode(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator4986);
            iv_rulecombinator=rulecombinator();

            state._fsp--;

             current =iv_rulecombinator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator4997); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2037:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2040:28: ( ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2041:1: ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2041:1: ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2041:2: (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2041:2: (kw= '+' | kw= '>' | kw= '~' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt46=1;
                }
                break;
            case 39:
                {
                alt46=2;
                }
                break;
            case 40:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2042:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulecombinator5036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2049:2: kw= '>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulecombinator5055); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2056:2: kw= '~'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulecombinator5074); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2061:2: (this_WS_3= RULE_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_WS) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2061:7: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecombinator5091); 

            	    		current.merge(this_WS_3);
            	        
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleoperator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2076:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2077:2: (iv_ruleoperator= ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2078:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator5139);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator5150); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2085:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | this_COMMA_1= RULE_COMMA ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMA_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2088:28: ( (kw= '/' | this_COMMA_1= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_COMMA) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2090:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleoperator5188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2096:10: this_COMMA_1= RULE_COMMA
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleoperator5209); 

                    		current.merge(this_COMMA_1);
                        
                     
                        newLeafNode(this_COMMA_1, grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRuleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2111:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2112:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2113:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
             newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator5255);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;

             current =iv_ruleunary_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator5266); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2120:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2123:28: ( (kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2124:1: (kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2124:1: (kw= '-' | kw= '+' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            else if ( (LA49_0==38) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2125:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleunary_operator5304); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2132:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleunary_operator5323); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2145:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2149:2: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2150:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
             newCompositeNode(grammarAccess.getSymbolTokRule()); 
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok5369);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;

             current =iv_ruleSymbolTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok5379); 

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
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2160:1: ruleSymbolTok returns [EObject current=null] : ( () ( (lv_symbol_1_0= RULE_COMMA ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2164:28: ( ( () ( (lv_symbol_1_0= RULE_COMMA ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2165:1: ( () ( (lv_symbol_1_0= RULE_COMMA ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2165:1: ( () ( (lv_symbol_1_0= RULE_COMMA ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2165:2: () ( (lv_symbol_1_0= RULE_COMMA ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2165:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2166:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2171:2: ( (lv_symbol_1_0= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:1: (lv_symbol_1_0= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2172:1: (lv_symbol_1_0= RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2173:3: lv_symbol_1_0= RULE_COMMA
            {
            lv_symbol_1_0=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSymbolTok5434); 

            			newLeafNode(lv_symbol_1_0, grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolTokRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbol",
                    		lv_symbol_1_0, 
                    		"COMMA");
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2200:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2204:2: (iv_ruleWSTok= ruleWSTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2205:2: iv_ruleWSTok= ruleWSTok EOF
            {
             newCompositeNode(grammarAccess.getWSTokRule()); 
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok5485);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;

             current =iv_ruleWSTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok5495); 

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
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2215:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2219:28: ( ( () this_WS_1= RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:1: ( () this_WS_1= RULE_WS )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:1: ( () this_WS_1= RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:2: () this_WS_1= RULE_WS
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWSTokAccess().getWSTokAction_0(),
                        current);
                

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleWSTok5544); 
             
                newLeafNode(this_WS_1, grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2241:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2245:2: (iv_ruleStringTok= ruleStringTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2246:2: iv_ruleStringTok= ruleStringTok EOF
            {
             newCompositeNode(grammarAccess.getStringTokRule()); 
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok5589);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;

             current =iv_ruleStringTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok5599); 

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
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2256:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2260:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2261:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2261:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2261:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2261:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2262:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTokAccess().getStringTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2267:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2268:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2268:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2269:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringTok5654); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStringTokAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2296:1: entryRuleFuncTok returns [EObject current=null] : iv_ruleFuncTok= ruleFuncTok EOF ;
    public final EObject entryRuleFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2300:2: (iv_ruleFuncTok= ruleFuncTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2301:2: iv_ruleFuncTok= ruleFuncTok EOF
            {
             newCompositeNode(grammarAccess.getFuncTokRule()); 
            pushFollow(FOLLOW_ruleFuncTok_in_entryRuleFuncTok5705);
            iv_ruleFuncTok=ruleFuncTok();

            state._fsp--;

             current =iv_ruleFuncTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncTok5715); 

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
    // $ANTLR end "entryRuleFuncTok"


    // $ANTLR start "ruleFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2311:1: ruleFuncTok returns [EObject current=null] : ( () ( (lv_func_1_0= rulefunction ) ) ) ;
    public final EObject ruleFuncTok() throws RecognitionException {
        EObject current = null;

        EObject lv_func_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2315:28: ( ( () ( (lv_func_1_0= rulefunction ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2316:1: ( () ( (lv_func_1_0= rulefunction ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2316:1: ( () ( (lv_func_1_0= rulefunction ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2316:2: () ( (lv_func_1_0= rulefunction ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2316:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2317:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFuncTokAccess().getFuncTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2322:2: ( (lv_func_1_0= rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2323:1: (lv_func_1_0= rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2323:1: (lv_func_1_0= rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2324:3: lv_func_1_0= rulefunction
            {
             
            	        newCompositeNode(grammarAccess.getFuncTokAccess().getFuncFunctionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulefunction_in_ruleFuncTok5774);
            lv_func_1_0=rulefunction();

            state._fsp--;


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

             leaveRule(); 
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
    // $ANTLR end "ruleFuncTok"


    // $ANTLR start "entryRuleNumberTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2351:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2355:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2356:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
             newCompositeNode(grammarAccess.getNumberTokRule()); 
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok5820);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;

             current =iv_ruleNumberTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok5830); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2366:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_num_1_0= rulenumberTerm ) ) ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_num_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2370:28: ( ( () ( (lv_num_1_0= rulenumberTerm ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2371:1: ( () ( (lv_num_1_0= rulenumberTerm ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2371:1: ( () ( (lv_num_1_0= rulenumberTerm ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2371:2: () ( (lv_num_1_0= rulenumberTerm ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2371:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2372:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2377:2: ( (lv_num_1_0= rulenumberTerm ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2378:1: (lv_num_1_0= rulenumberTerm )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2378:1: (lv_num_1_0= rulenumberTerm )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2379:3: lv_num_1_0= rulenumberTerm
            {
             
            	        newCompositeNode(grammarAccess.getNumberTokAccess().getNumNumberTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulenumberTerm_in_ruleNumberTok5889);
            lv_num_1_0=rulenumberTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberTokRule());
            	        }
                   		set(
                   			current, 
                   			"num",
                    		lv_num_1_0, 
                    		"numberTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2406:1: entryRuleIdentifierTok returns [EObject current=null] : iv_ruleIdentifierTok= ruleIdentifierTok EOF ;
    public final EObject entryRuleIdentifierTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2410:2: (iv_ruleIdentifierTok= ruleIdentifierTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2411:2: iv_ruleIdentifierTok= ruleIdentifierTok EOF
            {
             newCompositeNode(grammarAccess.getIdentifierTokRule()); 
            pushFollow(FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok5935);
            iv_ruleIdentifierTok=ruleIdentifierTok();

            state._fsp--;

             current =iv_ruleIdentifierTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierTok5945); 

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
    // $ANTLR end "entryRuleIdentifierTok"


    // $ANTLR start "ruleIdentifierTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2421:1: ruleIdentifierTok returns [EObject current=null] : ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject ruleIdentifierTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2425:28: ( ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2426:1: ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2426:1: ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2426:2: () ( (lv_id_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2426:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIdentifierTokAccess().getIdentifierTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2432:2: ( (lv_id_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2433:1: (lv_id_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2433:1: (lv_id_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2434:3: lv_id_1_0= ruleValidPropertyIdent
            {
             
            	        newCompositeNode(grammarAccess.getIdentifierTokAccess().getIdValidPropertyIdentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_ruleIdentifierTok6004);
            lv_id_1_0=ruleValidPropertyIdent();

            state._fsp--;


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

             leaveRule(); 
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
    // $ANTLR end "ruleIdentifierTok"


    // $ANTLR start "entryRuleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2461:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2465:2: (iv_ruleUrlTok= ruleUrlTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2466:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
             newCompositeNode(grammarAccess.getUrlTokRule()); 
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok6050);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;

             current =iv_ruleUrlTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok6060); 

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
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2476:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2480:28: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2481:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2481:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2481:2: () ( (lv_url_1_0= ruleURLType ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2481:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2482:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2487:2: ( (lv_url_1_0= ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2488:1: (lv_url_1_0= ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2488:1: (lv_url_1_0= ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2489:3: lv_url_1_0= ruleURLType
            {
             
            	        newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleURLType_in_ruleUrlTok6119);
            lv_url_1_0=ruleURLType();

            state._fsp--;


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

             leaveRule(); 
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
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2516:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2520:2: (iv_ruleColorTok= ruleColorTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2521:2: iv_ruleColorTok= ruleColorTok EOF
            {
             newCompositeNode(grammarAccess.getColorTokRule()); 
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok6165);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;

             current =iv_ruleColorTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok6175); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2531:1: ruleColorTok returns [EObject current=null] : ( () ( (lv_color_1_0= RULE_HASH ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        Token lv_color_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2535:28: ( ( () ( (lv_color_1_0= RULE_HASH ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2536:1: ( () ( (lv_color_1_0= RULE_HASH ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2536:1: ( () ( (lv_color_1_0= RULE_HASH ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2536:2: () ( (lv_color_1_0= RULE_HASH ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2536:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2537:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorTokAccess().getColorTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2542:2: ( (lv_color_1_0= RULE_HASH ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2543:1: (lv_color_1_0= RULE_HASH )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2543:1: (lv_color_1_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2544:3: lv_color_1_0= RULE_HASH
            {
            lv_color_1_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleColorTok6230); 

            			newLeafNode(lv_color_1_0, grammarAccess.getColorTokAccess().getColorHASHTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorTokRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"HASH");
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleCssTok"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2571:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2575:2: (iv_ruleCssTok= ruleCssTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2576:2: iv_ruleCssTok= ruleCssTok EOF
            {
             newCompositeNode(grammarAccess.getCssTokRule()); 
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok6281);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;

             current =iv_ruleCssTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok6291); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2586:1: ruleCssTok returns [EObject current=null] : (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok ) ;
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
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2590:28: ( (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2591:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2591:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )
            int alt50=8;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2592:5: this_SymbolTok_0= ruleSymbolTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolTok_in_ruleCssTok6342);
                    this_SymbolTok_0=ruleSymbolTok();

                    state._fsp--;

                     
                            current = this_SymbolTok_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2602:5: this_WSTok_1= ruleWSTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWSTok_in_ruleCssTok6369);
                    this_WSTok_1=ruleWSTok();

                    state._fsp--;

                     
                            current = this_WSTok_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2612:5: this_StringTok_2= ruleStringTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringTok_in_ruleCssTok6396);
                    this_StringTok_2=ruleStringTok();

                    state._fsp--;

                     
                            current = this_StringTok_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2622:5: this_FuncTok_3= ruleFuncTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getFuncTokParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFuncTok_in_ruleCssTok6423);
                    this_FuncTok_3=ruleFuncTok();

                    state._fsp--;

                     
                            current = this_FuncTok_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2632:5: this_NumberTok_4= ruleNumberTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNumberTok_in_ruleCssTok6450);
                    this_NumberTok_4=ruleNumberTok();

                    state._fsp--;

                     
                            current = this_NumberTok_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2642:5: this_IdentifierTok_5= ruleIdentifierTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierTokParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleIdentifierTok_in_ruleCssTok6477);
                    this_IdentifierTok_5=ruleIdentifierTok();

                    state._fsp--;

                     
                            current = this_IdentifierTok_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2652:5: this_UrlTok_6= ruleUrlTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleUrlTok_in_ruleCssTok6504);
                    this_UrlTok_6=ruleUrlTok();

                    state._fsp--;

                     
                            current = this_UrlTok_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2662:5: this_ColorTok_7= ruleColorTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleColorTok_in_ruleCssTok6531);
                    this_ColorTok_7=ruleColorTok();

                    state._fsp--;

                     
                            current = this_ColorTok_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2683:1: entryRuletermGroup returns [EObject current=null] : iv_ruletermGroup= ruletermGroup EOF ;
    public final EObject entryRuletermGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermGroup = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2684:2: (iv_ruletermGroup= ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2685:2: iv_ruletermGroup= ruletermGroup EOF
            {
             newCompositeNode(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup6572);
            iv_ruletermGroup=ruletermGroup();

            state._fsp--;

             current =iv_ruletermGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup6582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermGroup"


    // $ANTLR start "ruletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2692:1: ruletermGroup returns [EObject current=null] : ( (lv_terms_0_0= ruleterm ) )+ ;
    public final EObject ruletermGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2695:28: ( ( (lv_terms_0_0= ruleterm ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2696:1: ( (lv_terms_0_0= ruleterm ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2696:1: ( (lv_terms_0_0= ruleterm ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_IDENT)||LA51_0==RULE_HASH||(LA51_0>=RULE_INTEGER && LA51_0<=RULE_REAL)||LA51_0==35||LA51_0==38||LA51_0==42) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2697:1: (lv_terms_0_0= ruleterm )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2697:1: (lv_terms_0_0= ruleterm )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2698:3: lv_terms_0_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_ruletermGroup6627);
            	    lv_terms_0_0=ruleterm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_0_0, 
            	            		"term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermGroup"


    // $ANTLR start "entryRuleterm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2722:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2723:2: (iv_ruleterm= ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2724:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm6663);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm6673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2731:1: ruleterm returns [EObject current=null] : ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_identifier_2_0 = null;

        EObject lv_url_3_0 = null;

        EObject lv_function_4_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2734:28: ( ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2735:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2735:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                int LA52_1 = input.LA(2);

                if ( ((LA52_1>=RULE_INTEGER && LA52_1<=RULE_REAL)) ) {
                    alt52=1;
                }
                else if ( (LA52_1==RULE_IDENT) ) {
                    int LA52_4 = input.LA(3);

                    if ( (LA52_4==37) ) {
                        alt52=5;
                    }
                    else if ( (LA52_4==EOF||(LA52_4>=RULE_STRING && LA52_4<=RULE_IDENT)||LA52_4==RULE_HASH||(LA52_4>=RULE_INTEGER && LA52_4<=RULE_REAL)||LA52_4==35||LA52_4==38||LA52_4==42) ) {
                        alt52=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 38:
                {
                alt52=1;
                }
                break;
            case RULE_STRING:
                {
                alt52=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA52_4 = input.LA(2);

                if ( (LA52_4==37) ) {
                    alt52=5;
                }
                else if ( (LA52_4==EOF||(LA52_4>=RULE_STRING && LA52_4<=RULE_IDENT)||LA52_4==RULE_HASH||(LA52_4>=RULE_INTEGER && LA52_4<=RULE_REAL)||LA52_4==35||LA52_4==38||LA52_4==42) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 4, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt52=4;
                }
                break;
            case RULE_HASH:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2735:2: ( (lv_number_0_0= rulenumberTerm ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2735:2: ( (lv_number_0_0= rulenumberTerm ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2736:1: (lv_number_0_0= rulenumberTerm )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2736:1: (lv_number_0_0= rulenumberTerm )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2737:3: lv_number_0_0= rulenumberTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumberTerm_in_ruleterm6719);
                    lv_number_0_0=rulenumberTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"numberTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2754:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2754:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2755:1: (lv_stringValue_1_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2755:1: (lv_stringValue_1_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2756:3: lv_stringValue_1_0= RULE_STRING
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleterm6742); 

                    			newLeafNode(lv_stringValue_1_0, grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2773:6: ( (lv_identifier_2_0= ruleValidPropertyIdent ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2773:6: ( (lv_identifier_2_0= ruleValidPropertyIdent ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2774:1: (lv_identifier_2_0= ruleValidPropertyIdent )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2774:1: (lv_identifier_2_0= ruleValidPropertyIdent )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2775:3: lv_identifier_2_0= ruleValidPropertyIdent
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getIdentifierValidPropertyIdentParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidPropertyIdent_in_ruleterm6774);
                    lv_identifier_2_0=ruleValidPropertyIdent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_2_0, 
                            		"ValidPropertyIdent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2792:6: ( (lv_url_3_0= ruleURLType ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2792:6: ( (lv_url_3_0= ruleURLType ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2793:1: (lv_url_3_0= ruleURLType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2793:1: (lv_url_3_0= ruleURLType )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2794:3: lv_url_3_0= ruleURLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleURLType_in_ruleterm6801);
                    lv_url_3_0=ruleURLType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_3_0, 
                            		"URLType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2811:6: ( (lv_function_4_0= rulefunction ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2811:6: ( (lv_function_4_0= rulefunction ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2812:1: (lv_function_4_0= rulefunction )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2812:1: (lv_function_4_0= rulefunction )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2813:3: lv_function_4_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_ruleterm6828);
                    lv_function_4_0=rulefunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_4_0, 
                            		"function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2830:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2830:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2831:1: (lv_hexColor_5_0= ruleHexColor )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2831:1: (lv_hexColor_5_0= ruleHexColor )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2832:3: lv_hexColor_5_0= ruleHexColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHexColor_in_ruleterm6855);
                    lv_hexColor_5_0=ruleHexColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"hexColor",
                            		lv_hexColor_5_0, 
                            		"HexColor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2856:1: entryRulenumberTerm returns [String current=null] : iv_rulenumberTerm= rulenumberTerm EOF ;
    public final String entryRulenumberTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumberTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2860:2: (iv_rulenumberTerm= rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2861:2: iv_rulenumberTerm= rulenumberTerm EOF
            {
             newCompositeNode(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm6898);
            iv_rulenumberTerm=rulenumberTerm();

            state._fsp--;

             current =iv_rulenumberTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm6909); 

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
    // $ANTLR end "entryRulenumberTerm"


    // $ANTLR start "rulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2871:1: rulenumberTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) ;
    public final AntlrDatatypeRuleToken rulenumberTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unary_operator_0 = null;

        AntlrDatatypeRuleToken this_NUMBER_1 = null;

        AntlrDatatypeRuleToken this_PERCENTAGE_2 = null;

        AntlrDatatypeRuleToken this_LENGTH_3 = null;

        AntlrDatatypeRuleToken this_EMS_4 = null;

        AntlrDatatypeRuleToken this_EXS_5 = null;

        AntlrDatatypeRuleToken this_ANGLE_6 = null;

        AntlrDatatypeRuleToken this_TIME_7 = null;

        AntlrDatatypeRuleToken this_FREQ_8 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2875:28: ( ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2876:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2876:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2876:2: (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2876:2: (this_unary_operator_0= ruleunary_operator )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==35||LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2877:5: this_unary_operator_0= ruleunary_operator
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunary_operator_in_rulenumberTerm6961);
                    this_unary_operator_0=ruleunary_operator();

                    state._fsp--;


                    		current.merge(this_unary_operator_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2887:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            int alt54=8;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2888:5: this_NUMBER_1= ruleNUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_rulenumberTerm6991);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2900:5: this_PERCENTAGE_2= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rulenumberTerm7024);
                    this_PERCENTAGE_2=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2912:5: this_LENGTH_3= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_rulenumberTerm7057);
                    this_LENGTH_3=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2924:5: this_EMS_4= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_rulenumberTerm7090);
                    this_EMS_4=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2936:5: this_EXS_5= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_rulenumberTerm7123);
                    this_EXS_5=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2948:5: this_ANGLE_6= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_rulenumberTerm7156);
                    this_ANGLE_6=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2960:5: this_TIME_7= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_rulenumberTerm7189);
                    this_TIME_7=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2972:5: this_FREQ_8= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_rulenumberTerm7222);
                    this_FREQ_8=ruleFREQ();

                    state._fsp--;


                    		current.merge(this_FREQ_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // $ANTLR end "rulenumberTerm"


    // $ANTLR start "entryRulenum"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2993:1: entryRulenum returns [String current=null] : iv_rulenum= rulenum EOF ;
    public final String entryRulenum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenum = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2994:2: (iv_rulenum= rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2995:2: iv_rulenum= rulenum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum7273);
            iv_rulenum=rulenum();

            state._fsp--;

             current =iv_rulenum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum7284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenum"


    // $ANTLR start "rulenum"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3002:1: rulenum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken rulenum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_REAL_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3005:28: ( (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3006:1: (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3006:1: (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INTEGER) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_REAL) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3006:6: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rulenum7324); 

                    		current.merge(this_INTEGER_0);
                        
                     
                        newLeafNode(this_INTEGER_0, grammarAccess.getNumAccess().getINTEGERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3014:10: this_REAL_1= RULE_REAL
                    {
                    this_REAL_1=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulenum7350); 

                    		current.merge(this_REAL_1);
                        
                     
                        newLeafNode(this_REAL_1, grammarAccess.getNumAccess().getREALTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenum"


    // $ANTLR start "entryRulefunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3029:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3033:2: (iv_rulefunction= rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3034:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction7401);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction7411); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3044:1: rulefunction returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3048:28: ( ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3049:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3049:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3049:2: (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3049:2: (otherlv_0= '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3049:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulefunction7453); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3053:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3054:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3054:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3055:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction7472); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_rulefunction7489); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3075:1: ( (lv_params_3_0= ruleCssTok ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_HASH)||(LA57_0>=RULE_INTEGER && LA57_0<=RULE_REAL)||LA57_0==35||LA57_0==38||LA57_0==42) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3076:1: (lv_params_3_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3076:1: (lv_params_3_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3077:3: lv_params_3_0= ruleCssTok
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsCssTokParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCssTok_in_rulefunction7510);
            	    lv_params_3_0=ruleCssTok();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulefunction7523); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3108:1: entryRuleHexColor returns [String current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final String entryRuleHexColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexColor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3112:2: (iv_ruleHexColor= ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3113:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor7570);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor7581); 

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
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3123:1: ruleHexColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HASH_0= RULE_HASH ;
    public final AntlrDatatypeRuleToken ruleHexColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3127:28: (this_HASH_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3128:5: this_HASH_0= RULE_HASH
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleHexColor7624); 

            		current.merge(this_HASH_0);
                
             
                newLeafNode(this_HASH_0, grammarAccess.getHexColorAccess().getHASHTerminalRuleCall()); 
                

            }

             leaveRule(); 
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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3146:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3150:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3151:2: iv_ruleURLType= ruleURLType EOF
            {
             newCompositeNode(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType7678);
            iv_ruleURLType=ruleURLType();

            state._fsp--;

             current =iv_ruleURLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType7688); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3161:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3165:28: ( (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3166:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3166:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3166:3: otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleURLType7729); 

                	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleURLType7741); 

                	newLeafNode(otherlv_1, grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3174:1: ( (lv_url_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3175:1: (lv_url_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3175:1: (lv_url_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3176:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURLType7758); 

            			newLeafNode(lv_url_2_0, grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleURLType7775); 

                	newLeafNode(otherlv_3, grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3207:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3208:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3209:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER7816);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER7827); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3216:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_num_0= rulenum ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3219:28: (this_num_0= rulenum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3221:5: this_num_0= rulenum
            {
             
                    newCompositeNode(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER7873);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3239:1: entryRulePERCENTAGE returns [String current=null] : iv_rulePERCENTAGE= rulePERCENTAGE EOF ;
    public final String entryRulePERCENTAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENTAGE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3240:2: (iv_rulePERCENTAGE= rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3241:2: iv_rulePERCENTAGE= rulePERCENTAGE EOF
            {
             newCompositeNode(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE7918);
            iv_rulePERCENTAGE=rulePERCENTAGE();

            state._fsp--;

             current =iv_rulePERCENTAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE7929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePERCENTAGE"


    // $ANTLR start "rulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3248:1: rulePERCENTAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePERCENTAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3251:28: ( (this_num_0= rulenum kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3252:1: (this_num_0= rulenum kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3252:1: (this_num_0= rulenum kw= '%' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3253:5: this_num_0= rulenum kw= '%'
            {
             
                    newCompositeNode(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_rulePERCENTAGE7976);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,43,FOLLOW_43_in_rulePERCENTAGE7994); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePERCENTAGE"


    // $ANTLR start "entryRuleEMS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3277:1: entryRuleEMS returns [String current=null] : iv_ruleEMS= ruleEMS EOF ;
    public final String entryRuleEMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3278:2: (iv_ruleEMS= ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3279:2: iv_ruleEMS= ruleEMS EOF
            {
             newCompositeNode(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS8035);
            iv_ruleEMS=ruleEMS();

            state._fsp--;

             current =iv_ruleEMS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS8046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMS"


    // $ANTLR start "ruleEMS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3286:1: ruleEMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'em' ) ;
    public final AntlrDatatypeRuleToken ruleEMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3289:28: ( (this_num_0= rulenum kw= 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3290:1: (this_num_0= rulenum kw= 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3290:1: (this_num_0= rulenum kw= 'em' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3291:5: this_num_0= rulenum kw= 'em'
            {
             
                    newCompositeNode(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEMS8093);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleEMS8111); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEMSAccess().getEmKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMS"


    // $ANTLR start "entryRuleEXS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3315:1: entryRuleEXS returns [String current=null] : iv_ruleEXS= ruleEXS EOF ;
    public final String entryRuleEXS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3316:2: (iv_ruleEXS= ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3317:2: iv_ruleEXS= ruleEXS EOF
            {
             newCompositeNode(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS8152);
            iv_ruleEXS=ruleEXS();

            state._fsp--;

             current =iv_ruleEXS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS8163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXS"


    // $ANTLR start "ruleEXS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3324:1: ruleEXS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'ex' ) ;
    public final AntlrDatatypeRuleToken ruleEXS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3327:28: ( (this_num_0= rulenum kw= 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3328:1: (this_num_0= rulenum kw= 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3328:1: (this_num_0= rulenum kw= 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3329:5: this_num_0= rulenum kw= 'ex'
            {
             
                    newCompositeNode(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEXS8210);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,45,FOLLOW_45_in_ruleEXS8228); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEXSAccess().getExKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXS"


    // $ANTLR start "entryRuleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3353:1: entryRuleLENGTH returns [String current=null] : iv_ruleLENGTH= ruleLENGTH EOF ;
    public final String entryRuleLENGTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLENGTH = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3357:2: (iv_ruleLENGTH= ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3358:2: iv_ruleLENGTH= ruleLENGTH EOF
            {
             newCompositeNode(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH8275);
            iv_ruleLENGTH=ruleLENGTH();

            state._fsp--;

             current =iv_ruleLENGTH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH8286); 

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
    // $ANTLR end "entryRuleLENGTH"


    // $ANTLR start "ruleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3368:1: ruleLENGTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) ;
    public final AntlrDatatypeRuleToken ruleLENGTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3372:28: ( (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3373:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3373:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3374:5: this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            {
             
                    newCompositeNode(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleLENGTH8337);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3384:1: (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt58=1;
                }
                break;
            case 47:
                {
                alt58=2;
                }
                break;
            case 48:
                {
                alt58=3;
                }
                break;
            case 49:
                {
                alt58=4;
                }
                break;
            case 50:
                {
                alt58=5;
                }
                break;
            case 51:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3385:2: kw= 'px'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleLENGTH8356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3392:2: kw= 'cm'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleLENGTH8375); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3399:2: kw= 'mm'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleLENGTH8394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3406:2: kw= 'in'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleLENGTH8413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3413:2: kw= 'pt'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleLENGTH8432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3420:2: kw= 'pc'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleLENGTH8451); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleLENGTH"


    // $ANTLR start "entryRuleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3436:1: entryRuleANGLE returns [String current=null] : iv_ruleANGLE= ruleANGLE EOF ;
    public final String entryRuleANGLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANGLE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3437:2: (iv_ruleANGLE= ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3438:2: iv_ruleANGLE= ruleANGLE EOF
            {
             newCompositeNode(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE8497);
            iv_ruleANGLE=ruleANGLE();

            state._fsp--;

             current =iv_ruleANGLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE8508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANGLE"


    // $ANTLR start "ruleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3445:1: ruleANGLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) ;
    public final AntlrDatatypeRuleToken ruleANGLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3448:28: ( (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3449:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3449:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3450:5: this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            {
             
                    newCompositeNode(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleANGLE8555);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3460:1: (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt59=1;
                }
                break;
            case 53:
                {
                alt59=2;
                }
                break;
            case 54:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3461:2: kw= 'deg'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleANGLE8574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3468:2: kw= 'rad'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleANGLE8593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3475:2: kw= 'grad'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleANGLE8612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANGLE"


    // $ANTLR start "entryRuleTIME"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3488:1: entryRuleTIME returns [String current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final String entryRuleTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3489:2: (iv_ruleTIME= ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3490:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME8654);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME8665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3497:1: ruleTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) ;
    public final AntlrDatatypeRuleToken ruleTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3500:28: ( (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3501:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3501:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3502:5: this_num_0= rulenum (kw= 'ms' | kw= 's' )
            {
             
                    newCompositeNode(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleTIME8712);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3512:1: (kw= 'ms' | kw= 's' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55) ) {
                alt60=1;
            }
            else if ( (LA60_0==56) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3513:2: kw= 'ms'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleTIME8731); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3520:2: kw= 's'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleTIME8750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3533:1: entryRuleFREQ returns [String current=null] : iv_ruleFREQ= ruleFREQ EOF ;
    public final String entryRuleFREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFREQ = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3534:2: (iv_ruleFREQ= ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3535:2: iv_ruleFREQ= ruleFREQ EOF
            {
             newCompositeNode(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ8792);
            iv_ruleFREQ=ruleFREQ();

            state._fsp--;

             current =iv_ruleFREQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ8803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFREQ"


    // $ANTLR start "ruleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3542:1: ruleFREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) ;
    public final AntlrDatatypeRuleToken ruleFREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3545:28: ( (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3546:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3546:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3547:5: this_num_0= rulenum (kw= 'hz' | kw= 'khz' )
            {
             
                    newCompositeNode(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleFREQ8850);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3557:1: (kw= 'hz' | kw= 'khz' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==57) ) {
                alt61=1;
            }
            else if ( (LA61_0==58) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3558:2: kw= 'hz'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleFREQ8869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3565:2: kw= 'khz'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleFREQ8888); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFREQ"


    // $ANTLR start "entryRuleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3578:1: entryRuleIMPORTANT_SYM returns [String current=null] : iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF ;
    public final String entryRuleIMPORTANT_SYM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORTANT_SYM = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3579:2: (iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3580:2: iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF
            {
             newCompositeNode(grammarAccess.getIMPORTANT_SYMRule()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM8930);
            iv_ruleIMPORTANT_SYM=ruleIMPORTANT_SYM();

            state._fsp--;

             current =iv_ruleIMPORTANT_SYM.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORTANT_SYM8941); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMPORTANT_SYM"


    // $ANTLR start "ruleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3587:1: ruleIMPORTANT_SYM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!important' ;
    public final AntlrDatatypeRuleToken ruleIMPORTANT_SYM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3590:28: (kw= '!important' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3592:2: kw= '!important'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleIMPORTANT_SYM8978); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIMPORTANT_SYMAccess().getImportantKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMPORTANT_SYM"


    // $ANTLR start "entryRuleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3605:1: entryRuleReservedWords returns [String current=null] : iv_ruleReservedWords= ruleReservedWords EOF ;
    public final String entryRuleReservedWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReservedWords = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3606:2: (iv_ruleReservedWords= ruleReservedWords EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3607:2: iv_ruleReservedWords= ruleReservedWords EOF
            {
             newCompositeNode(grammarAccess.getReservedWordsRule()); 
            pushFollow(FOLLOW_ruleReservedWords_in_entryRuleReservedWords9018);
            iv_ruleReservedWords=ruleReservedWords();

            state._fsp--;

             current =iv_ruleReservedWords.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedWords9029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReservedWords"


    // $ANTLR start "ruleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3614:1: ruleReservedWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' ) ;
    public final AntlrDatatypeRuleToken ruleReservedWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3617:28: ( (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3618:1: (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3618:1: (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' )
            int alt62=15;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt62=1;
                }
                break;
            case 45:
                {
                alt62=2;
                }
                break;
            case 46:
                {
                alt62=3;
                }
                break;
            case 47:
                {
                alt62=4;
                }
                break;
            case 48:
                {
                alt62=5;
                }
                break;
            case 49:
                {
                alt62=6;
                }
                break;
            case 50:
                {
                alt62=7;
                }
                break;
            case 51:
                {
                alt62=8;
                }
                break;
            case 52:
                {
                alt62=9;
                }
                break;
            case 53:
                {
                alt62=10;
                }
                break;
            case 54:
                {
                alt62=11;
                }
                break;
            case 55:
                {
                alt62=12;
                }
                break;
            case 56:
                {
                alt62=13;
                }
                break;
            case 57:
                {
                alt62=14;
                }
                break;
            case 58:
                {
                alt62=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3619:2: kw= 'em'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleReservedWords9067); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3626:2: kw= 'ex'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleReservedWords9086); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getExKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3633:2: kw= 'px'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleReservedWords9105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3640:2: kw= 'cm'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleReservedWords9124); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3647:2: kw= 'mm'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleReservedWords9143); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3654:2: kw= 'in'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleReservedWords9162); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getInKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3661:2: kw= 'pt'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleReservedWords9181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3668:2: kw= 'pc'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleReservedWords9200); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3675:2: kw= 'deg'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleReservedWords9219); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3682:2: kw= 'rad'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleReservedWords9238); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3689:2: kw= 'grad'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleReservedWords9257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3696:2: kw= 'ms'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleReservedWords9276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3703:2: kw= 's'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleReservedWords9295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getSKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3710:2: kw= 'hz'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleReservedWords9314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3717:2: kw= 'khz'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleReservedWords9333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getKhzKeyword_14()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReservedWords"


    // $ANTLR start "rulecss_not"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3730:1: rulecss_not returns [Enumerator current=null] : (enumLiteral_0= 'not(' ) ;
    public final Enumerator rulecss_not() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3732:28: ( (enumLiteral_0= 'not(' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3733:1: (enumLiteral_0= 'not(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3733:1: (enumLiteral_0= 'not(' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3733:3: enumLiteral_0= 'not('
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_rulecss_not9386); 

                    current = grammarAccess.getCss_notAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getCss_notAccess().getNotEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_not"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA43_eotS =
        "\12\uffff";
    static final String DFA43_eofS =
        "\1\uffff\1\4\1\11\7\uffff";
    static final String DFA43_minS =
        "\1\5\2\33\1\5\6\uffff";
    static final String DFA43_maxS =
        "\1\72\2\44\1\72\6\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\1\3\1\4\1\5\1\6\1\2";
    static final String DFA43_specialS =
        "\12\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\2\uffff\1\5\16\uffff\1\10\2\uffff\1\2\1\3\1\6\1\7\16\uffff"+
            "\17\4",
            "\1\3\10\uffff\1\4",
            "\1\3\10\uffff\1\11",
            "\1\4\24\uffff\1\11\21\uffff\17\4",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "1724:1: (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo )";
        }
    }
    static final String DFA44_eotS =
        "\12\uffff";
    static final String DFA44_eofS =
        "\1\1\3\uffff\2\11\4\uffff";
    static final String DFA44_minS =
        "\1\4\3\uffff\2\4\4\uffff";
    static final String DFA44_maxS =
        "\1\46\3\uffff\2\72\4\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\7\1\1\1\2\2\uffff\1\5\1\6\1\3\1\4";
    static final String DFA44_specialS =
        "\12\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\6\1\7\5\uffff\1\4\1\5\26\uffff\1\3\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "\2\11\5\uffff\2\11\26\uffff\2\11\1\uffff\1\11\4\uffff\20\10",
            "\2\11\5\uffff\2\11\26\uffff\2\11\1\uffff\1\11\4\uffff\20\10",
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
            return "()+ loopback of 1863:1: (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+";
        }
    }
    static final String DFA45_eotS =
        "\12\uffff";
    static final String DFA45_eofS =
        "\12\uffff";
    static final String DFA45_minS =
        "\1\13\2\53\7\uffff";
    static final String DFA45_maxS =
        "\1\14\2\72\7\uffff";
    static final String DFA45_acceptS =
        "\3\uffff\1\6\1\3\1\7\1\5\1\4\1\1\1\2";
    static final String DFA45_specialS =
        "\12\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\1\2",
            "\1\10\1\4\1\7\6\11\3\6\2\3\2\5",
            "\1\10\1\4\1\7\6\11\3\6\2\3\2\5",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "1937:1: (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ )";
        }
    }
    static final String DFA50_eotS =
        "\13\uffff";
    static final String DFA50_eofS =
        "\5\uffff\1\11\5\uffff";
    static final String DFA50_minS =
        "\1\4\3\uffff\1\5\1\4\5\uffff";
    static final String DFA50_maxS =
        "\1\52\3\uffff\1\14\1\73\5\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\5\1\7\1\10\1\6\1\4";
    static final String DFA50_specialS =
        "\13\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\3\1\5\1\1\1\2\1\10\2\uffff\2\6\26\uffff\1\4\2\uffff\1\6\3"+
            "\uffff\1\7",
            "",
            "",
            "",
            "\1\5\5\uffff\2\6",
            "\5\11\2\uffff\2\11\3\uffff\1\11\5\uffff\1\11\14\uffff\2\11"+
            "\1\12\1\11\3\uffff\1\11\20\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "2591:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )";
        }
    }
    static final String DFA54_eotS =
        "\13\uffff";
    static final String DFA54_eofS =
        "\1\uffff\2\11\10\uffff";
    static final String DFA54_minS =
        "\1\13\2\4\10\uffff";
    static final String DFA54_maxS =
        "\1\14\2\73\10\uffff";
    static final String DFA54_acceptS =
        "\3\uffff\1\4\1\7\1\6\1\5\1\10\1\2\1\1\1\3";
    static final String DFA54_specialS =
        "\13\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\1\2",
            "\5\11\2\uffff\2\11\3\uffff\1\11\5\uffff\1\11\14\uffff\2\11"+
            "\1\uffff\1\11\3\uffff\1\11\1\10\1\3\1\6\6\12\3\5\2\4\2\7\1\11",
            "\5\11\2\uffff\2\11\3\uffff\1\11\5\uffff\1\11\14\uffff\2\11"+
            "\1\uffff\1\11\3\uffff\1\11\1\10\1\3\1\6\6\12\3\5\2\4\2\7\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "2887:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rulestylesheet131 = new BitSet(new long[]{0x07FFF4003F9E0122L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rulestylesheet153 = new BitSet(new long[]{0x07FFF4003F9E0122L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet176 = new BitSet(new long[]{0x07FFF0003F980122L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet203 = new BitSet(new long[]{0x07FFF0003F980122L});
    public static final BitSet FOLLOW_rulepage_in_rulestylesheet230 = new BitSet(new long[]{0x07FFF0003F980122L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulecharset316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_rulecharset334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecharset352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulecharset369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleimportExpression454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleimportExpression472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleimportExpression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleimportExpression525 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_rulemedia_list_in_ruleimportExpression545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleimportExpression558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulepage652 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_20_in_rulepage670 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rulepage692 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulepage705 = new BitSet(new long[]{0x00000008004100A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage726 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_rulepage740 = new BitSet(new long[]{0x00000008004100A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage761 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_rulepage776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulepseudo_page862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulepseudo_page877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulemedia970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25_in_rulemedia988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia1010 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulemedia1022 = new BitSet(new long[]{0x07FFF0003CC00120L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia1043 = new BitSet(new long[]{0x07FFF0003CC00120L});
    public static final BitSet FOLLOW_22_in_rulemedia1056 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1397 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1409 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1429 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_21_in_ruleruleset1443 = new BitSet(new long[]{0x00000008004000A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleset1477 = new BitSet(new long[]{0x00000008004000A0L});
    public static final BitSet FOLLOW_22_in_ruleruleset1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1593 = new BitSet(new long[]{0x000001C000000082L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1616 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1657 = new BitSet(new long[]{0x07FFF1C03C8001A0L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1679 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulesimple_selector1802 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_rulecss_universal_in_rulesimple_selector1829 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1851 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1880 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleelement_name1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_ruleelement_name2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rulesub_selector2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulesub_selector2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulesub_selector2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulesub_selector2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_in_rulesub_selector2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_type_selector_in_entryRulecss_type_selector2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_type_selector2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rulecss_type_selector2307 = new BitSet(new long[]{0x07FFF00000000020L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulecss_type_selector2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_namespace_prefix2434 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_rulecss_namespace_prefix2458 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulecss_namespace_prefix2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_entryRulecss_universal2514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_universal2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rulecss_universal2573 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulecss_universal2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulecss_class2683 = new BitSet(new long[]{0x07FFF00000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_class2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_class2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_id2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecss_attrib2923 = new BitSet(new long[]{0x07FFF00000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib2939 = new BitSet(new long[]{0x00000007C0000600L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_attrib2972 = new BitSet(new long[]{0x00000007C0000600L});
    public static final BitSet FOLLOW_30_in_rulecss_attrib2993 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_31_in_rulecss_attrib3012 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_32_in_rulecss_attrib3031 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_33_in_rulecss_attrib3050 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rulecss_attrib3071 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rulecss_attrib3097 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib3120 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_attrib3153 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecss_attrib3180 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulecss_attrib3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration3247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3298 = new BitSet(new long[]{0x00000008000000A0L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_declaration3320 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3332 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_23_in_rulecss_declaration3345 = new BitSet(new long[]{0x00000448000619F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulecss_declaration3366 = new BitSet(new long[]{0x08000448000619F2L});
    public static final BitSet FOLLOW_rulecss_prio_in_rulecss_declaration3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_entryRulecss_prio3430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_prio3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rulecss_property3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleValidPropertyIdent3683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleValidPropertyIdent3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecss_pseudo3795 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_rulecss_pseudo3809 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_pseudo3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctional_pseudo_in_rulecss_pseudo3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_in_entryRulecss_negation3906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_negation3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecss_negation3953 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rulecss_not_in_rulecss_negation3974 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_rulecss_negation_arg_in_rulecss_negation3995 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulecss_negation4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_arg_in_entryRulecss_negation_arg4044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_negation_arg4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_type_selector_in_rulecss_negation_arg4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_rulecss_negation_arg4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_negation_arg4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulecss_negation_arg4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulecss_negation_arg4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulecss_negation_arg4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctional_pseudo_in_entryRulefunctional_pseudo4306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctional_pseudo4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunctional_pseudo4357 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunctional_pseudo4375 = new BitSet(new long[]{0x0000004800001830L});
    public static final BitSet FOLLOW_rulefunction_expr_in_rulefunctional_pseudo4397 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunctional_pseudo4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_expr_in_entryRulefunction_expr4456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_expr4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulefunction_expr4505 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_35_in_rulefunction_expr4524 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_ruleDIMENSION_in_rulefunction_expr4552 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulefunction_expr4585 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefunction_expr4611 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction_expr4637 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_ruleDIMENSION_in_entryRuleDIMENSION4684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIMENSION4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_ruleDIMENSION4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_ruleDIMENSION4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_ruleDIMENSION4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_ruleDIMENSION4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_ruleDIMENSION4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_ruleDIMENSION4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_ruleDIMENSION4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator4986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulecombinator5036 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_39_in_rulecombinator5055 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_40_in_rulecombinator5074 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecombinator5091 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator5139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleoperator5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleoperator5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator5255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleunary_operator5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleunary_operator5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok5369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSymbolTok5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok5485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleWSTok5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok5589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringTok5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_entryRuleFuncTok5705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncTok5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleFuncTok5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok5820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleNumberTok5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok5935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierTok5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_ruleIdentifierTok6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok6050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleUrlTok6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok6165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleColorTok6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok6281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_ruleCssTok6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_ruleCssTok6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_ruleCssTok6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_ruleCssTok6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_ruleCssTok6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_ruleCssTok6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_ruleCssTok6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_ruleCssTok6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup6572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermGroup6627 = new BitSet(new long[]{0x00000448000619B2L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm6663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleterm6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleterm6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_ruleterm6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleterm6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleterm6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_ruleterm6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rulenumberTerm6961 = new BitSet(new long[]{0x0000004800001800L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulenumberTerm6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rulenumberTerm7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rulenumberTerm7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rulenumberTerm7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rulenumberTerm7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rulenumberTerm7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rulenumberTerm7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rulenumberTerm7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum7273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rulenum7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulenum7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction7401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulefunction7453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction7472 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction7489 = new BitSet(new long[]{0x00000448000619F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulefunction7510 = new BitSet(new long[]{0x00000458000619F0L});
    public static final BitSet FOLLOW_36_in_rulefunction7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor7570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleHexColor7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType7678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleURLType7729 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleURLType7741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURLType7758 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleURLType7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER7816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE7918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rulePERCENTAGE7976 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePERCENTAGE7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS8035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEMS8093 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEMS8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS8152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS8163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEXS8210 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEXS8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH8275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleLENGTH8337 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_46_in_ruleLENGTH8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLENGTH8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLENGTH8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLENGTH8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLENGTH8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLENGTH8451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE8497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleANGLE8555 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_52_in_ruleANGLE8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleANGLE8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleANGLE8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME8654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleTIME8712 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTIME8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTIME8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ8792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleFREQ8850 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_ruleFREQ8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFREQ8888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM8930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORTANT_SYM8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIMPORTANT_SYM8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_entryRuleReservedWords9018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedWords9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReservedWords9067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReservedWords9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReservedWords9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReservedWords9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReservedWords9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleReservedWords9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReservedWords9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReservedWords9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReservedWords9219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleReservedWords9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleReservedWords9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleReservedWords9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReservedWords9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleReservedWords9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReservedWords9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulecss_not9386 = new BitSet(new long[]{0x0000000000000002L});

}