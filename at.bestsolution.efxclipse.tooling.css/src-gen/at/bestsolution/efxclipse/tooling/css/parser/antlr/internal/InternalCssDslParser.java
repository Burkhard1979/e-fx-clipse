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
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleruleset1443); 
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleruleset1456); 

                	newLeafNode(otherlv_4, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:662:1: ( ( (lv_declarations_5_0= rulecss_declaration ) ) otherlv_6= ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_IDENT||LA18_0==RULE_WS||LA18_0==35) ) {
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
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1478);
            	    lv_declarations_5_0=rulecss_declaration();

            	    state._fsp--;


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

            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleruleset1490); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleruleset1504); 

                	newLeafNode(otherlv_7, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:696:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:700:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:701:2: iv_ruleselector= ruleselector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1546);
            iv_ruleselector=ruleselector();

            state._fsp--;

             current =iv_ruleselector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1556); 

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
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1606);
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
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1629);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:752:2: ( (lv_selector_2_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:753:1: (lv_selector_2_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:753:1: (lv_selector_2_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:754:3: lv_selector_2_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1650);
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
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1670); 
                    	     
                    	        newLeafNode(this_WS_3, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:775:3: ( (lv_combinator_4_0= rulecombinator ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=38 && LA20_0<=40)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:776:1: (lv_combinator_4_0= rulecombinator )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:776:1: (lv_combinator_4_0= rulecombinator )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:777:3: lv_combinator_4_0= rulecombinator
                            {
                             
                            	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulecombinator_in_ruleselector1692);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:793:3: ( (lv_selector_5_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:794:1: (lv_selector_5_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:794:1: (lv_selector_5_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:795:3: lv_selector_5_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1714);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:822:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:823:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:824:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
             newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector1757);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;

             current =iv_rulesimple_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector1767); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:1: rulesimple_selector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_element_0_0 = null;

        AntlrDatatypeRuleToken lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:834:28: ( ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:1: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:1: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* ) | ( (lv_subSelectors_3_0= rulesub_selector ) )+ )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENT||(LA25_0>=26 && LA25_0<=27)||(LA25_0>=44 && LA25_0<=58)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_HASH||LA25_0==23||(LA25_0>=28 && LA25_0<=29)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:2: ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:2: ( ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:3: ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) ) ( (lv_subSelectors_2_0= rulesub_selector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:3: ( ( (lv_element_0_0= ruleelement_name ) ) | ( (lv_universal_1_0= rulecss_universal ) ) )
                    int alt22=2;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                        {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==27) ) {
                            alt22=2;
                        }
                        else if ( (LA22_1==EOF||(LA22_1>=RULE_COMMA && LA22_1<=RULE_HASH)||LA22_1==21||LA22_1==23||(LA22_1>=28 && LA22_1<=29)||(LA22_1>=38 && LA22_1<=40)) ) {
                            alt22=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 1, input);

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
                        alt22=1;
                        }
                        break;
                    case 26:
                    case 27:
                        {
                        alt22=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:4: ( (lv_element_0_0= ruleelement_name ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:835:4: ( (lv_element_0_0= ruleelement_name ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:836:1: (lv_element_0_0= ruleelement_name )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:836:1: (lv_element_0_0= ruleelement_name )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:837:3: lv_element_0_0= ruleelement_name
                            {
                             
                            	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleelement_name_in_rulesimple_selector1815);
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:854:6: ( (lv_universal_1_0= rulecss_universal ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:854:6: ( (lv_universal_1_0= rulecss_universal ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:855:1: (lv_universal_1_0= rulecss_universal )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:855:1: (lv_universal_1_0= rulecss_universal )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:856:3: lv_universal_1_0= rulecss_universal
                            {
                             
                            	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getUniversalCss_universalParserRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulecss_universal_in_rulesimple_selector1842);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:872:3: ( (lv_subSelectors_2_0= rulesub_selector ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_HASH||LA23_0==23||(LA23_0>=28 && LA23_0<=29)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:874:3: lv_subSelectors_2_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1864);
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
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:891:6: ( (lv_subSelectors_3_0= rulesub_selector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:891:6: ( (lv_subSelectors_3_0= rulesub_selector ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_HASH||LA24_0==23||(LA24_0>=28 && LA24_0<=29)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:1: (lv_subSelectors_3_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:1: (lv_subSelectors_3_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:3: lv_subSelectors_3_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1893);
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
                    	    if ( cnt24 >= 1 ) break loop24;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:917:1: entryRuleelement_name returns [String current=null] : iv_ruleelement_name= ruleelement_name EOF ;
    public final String entryRuleelement_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelement_name = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:918:2: (iv_ruleelement_name= ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:919:2: iv_ruleelement_name= ruleelement_name EOF
            {
             newCompositeNode(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name1931);
            iv_ruleelement_name=ruleelement_name();

            state._fsp--;

             current =iv_ruleelement_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name1942); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:926:1: ruleelement_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords ) ;
    public final AntlrDatatypeRuleToken ruleelement_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        AntlrDatatypeRuleToken this_ReservedWords_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:929:28: ( (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:1: (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:1: (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IDENT) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=44 && LA26_0<=58)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:930:6: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleelement_name1982); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:939:5: this_ReservedWords_1= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_ruleelement_name2015);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:957:1: entryRulesub_selector returns [EObject current=null] : iv_rulesub_selector= rulesub_selector EOF ;
    public final EObject entryRulesub_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesub_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:958:2: (iv_rulesub_selector= rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:959:2: iv_rulesub_selector= rulesub_selector EOF
            {
             newCompositeNode(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector2060);
            iv_rulesub_selector=rulesub_selector();

            state._fsp--;

             current =iv_rulesub_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector2070); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:966:1: rulesub_selector returns [EObject current=null] : ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) ) ;
    public final EObject rulesub_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_class_1_0 = null;

        AntlrDatatypeRuleToken lv_attrib_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudoclass_3_0 = null;

        EObject lv_negotation_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:969:28: ( ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:970:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:970:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) | ( (lv_negotation_4_0= rulecss_negation ) ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_HASH:
                {
                alt27=1;
                }
                break;
            case 28:
                {
                alt27=2;
                }
                break;
            case 29:
                {
                alt27=3;
                }
                break;
            case 23:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==RULE_IDENT||LA27_4==23) ) {
                    alt27=4;
                }
                else if ( (LA27_4==60) ) {
                    alt27=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:970:2: ( (lv_id_0_0= rulecss_id ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:970:2: ( (lv_id_0_0= rulecss_id ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:971:1: (lv_id_0_0= rulecss_id )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:971:1: (lv_id_0_0= rulecss_id )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:972:3: lv_id_0_0= rulecss_id
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_id_in_rulesub_selector2116);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:989:6: ( (lv_class_1_0= rulecss_class ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:989:6: ( (lv_class_1_0= rulecss_class ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:990:1: (lv_class_1_0= rulecss_class )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:990:1: (lv_class_1_0= rulecss_class )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:991:3: lv_class_1_0= rulecss_class
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_class_in_rulesub_selector2143);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1008:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1008:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:1: (lv_attrib_2_0= rulecss_attrib )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:1: (lv_attrib_2_0= rulecss_attrib )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1010:3: lv_attrib_2_0= rulecss_attrib
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_attrib_in_rulesub_selector2170);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1027:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1027:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1028:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1028:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1029:3: lv_pseudoclass_3_0= rulecss_pseudo
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_pseudo_in_rulesub_selector2197);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1046:6: ( (lv_negotation_4_0= rulecss_negation ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1046:6: ( (lv_negotation_4_0= rulecss_negation ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1047:1: (lv_negotation_4_0= rulecss_negation )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1047:1: (lv_negotation_4_0= rulecss_negation )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1048:3: lv_negotation_4_0= rulecss_negation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getNegotationCss_negationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_negation_in_rulesub_selector2224);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1072:1: entryRulecss_type_selector returns [String current=null] : iv_rulecss_type_selector= rulecss_type_selector EOF ;
    public final String entryRulecss_type_selector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_type_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1073:2: (iv_rulecss_type_selector= rulecss_type_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1074:2: iv_rulecss_type_selector= rulecss_type_selector EOF
            {
             newCompositeNode(grammarAccess.getCss_type_selectorRule()); 
            pushFollow(FOLLOW_rulecss_type_selector_in_entryRulecss_type_selector2261);
            iv_rulecss_type_selector=rulecss_type_selector();

            state._fsp--;

             current =iv_rulecss_type_selector.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_type_selector2272); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1081:1: rulecss_type_selector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name ) ;
    public final AntlrDatatypeRuleToken rulecss_type_selector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_css_namespace_prefix_0 = null;

        AntlrDatatypeRuleToken this_element_name_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1084:28: ( ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1085:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1085:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1085:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )? this_element_name_1= ruleelement_name
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1085:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENT) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==27) ) {
                    alt28=1;
                }
            }
            else if ( ((LA28_0>=26 && LA28_0<=27)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1086:5: this_css_namespace_prefix_0= rulecss_namespace_prefix
                    {
                     
                            newCompositeNode(grammarAccess.getCss_type_selectorAccess().getCss_namespace_prefixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_rulecss_type_selector2320);
                    this_css_namespace_prefix_0=rulecss_namespace_prefix();

                    state._fsp--;


                    		current.merge(this_css_namespace_prefix_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getCss_type_selectorAccess().getElement_nameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleelement_name_in_rulecss_type_selector2349);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1115:1: entryRulecss_namespace_prefix returns [String current=null] : iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF ;
    public final String entryRulecss_namespace_prefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_namespace_prefix = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1116:2: (iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1117:2: iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF
            {
             newCompositeNode(grammarAccess.getCss_namespace_prefixRule()); 
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix2395);
            iv_rulecss_namespace_prefix=rulecss_namespace_prefix();

            state._fsp--;

             current =iv_rulecss_namespace_prefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix2406); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:1: rulecss_namespace_prefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulecss_namespace_prefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1127:28: ( ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1128:1: ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1128:1: ( (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1128:2: (this_IDENT_0= RULE_IDENT | kw= '*' )? kw= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1128:2: (this_IDENT_0= RULE_IDENT | kw= '*' )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENT) ) {
                alt29=1;
            }
            else if ( (LA29_0==26) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1128:7: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_namespace_prefix2447); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1137:2: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulecss_namespace_prefix2471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,27,FOLLOW_27_in_rulecss_namespace_prefix2486); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1156:1: entryRulecss_universal returns [String current=null] : iv_rulecss_universal= rulecss_universal EOF ;
    public final String entryRulecss_universal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_universal = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1157:2: (iv_rulecss_universal= rulecss_universal EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1158:2: iv_rulecss_universal= rulecss_universal EOF
            {
             newCompositeNode(grammarAccess.getCss_universalRule()); 
            pushFollow(FOLLOW_rulecss_universal_in_entryRulecss_universal2527);
            iv_rulecss_universal=rulecss_universal();

            state._fsp--;

             current =iv_rulecss_universal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_universal2538); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:1: rulecss_universal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' ) ;
    public final AntlrDatatypeRuleToken rulecss_universal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_css_namespace_prefix_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1168:28: ( ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1169:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1169:1: ( (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1169:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )? kw= '*'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1169:2: (this_css_namespace_prefix_0= rulecss_namespace_prefix )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENT||LA30_0==27) ) {
                alt30=1;
            }
            else if ( (LA30_0==26) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==27) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1170:5: this_css_namespace_prefix_0= rulecss_namespace_prefix
                    {
                     
                            newCompositeNode(grammarAccess.getCss_universalAccess().getCss_namespace_prefixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_rulecss_universal2586);
                    this_css_namespace_prefix_0=rulecss_namespace_prefix();

                    state._fsp--;


                    		current.merge(this_css_namespace_prefix_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_26_in_rulecss_universal2606); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1194:1: entryRulecss_class returns [String current=null] : iv_rulecss_class= rulecss_class EOF ;
    public final String entryRulecss_class() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_class = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1195:2: (iv_rulecss_class= rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1196:2: iv_rulecss_class= rulecss_class EOF
            {
             newCompositeNode(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class2647);
            iv_rulecss_class=rulecss_class();

            state._fsp--;

             current =iv_rulecss_class.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class2658); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1203:1: rulecss_class returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ) ;
    public final AntlrDatatypeRuleToken rulecss_class() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        AntlrDatatypeRuleToken this_ReservedWords_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1206:28: ( (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1207:1: (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1207:1: (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1208:2: kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulecss_class2696); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1213:1: (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1213:6: this_IDENT_1= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_class2712); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1222:5: this_ReservedWords_2= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_class2745);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1240:1: entryRulecss_id returns [String current=null] : iv_rulecss_id= rulecss_id EOF ;
    public final String entryRulecss_id() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_id = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1241:2: (iv_rulecss_id= rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1242:2: iv_rulecss_id= rulecss_id EOF
            {
             newCompositeNode(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id2792);
            iv_rulecss_id=rulecss_id();

            state._fsp--;

             current =iv_rulecss_id.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id2803); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1249:1: rulecss_id returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HASH_0= RULE_HASH ;
    public final AntlrDatatypeRuleToken rulecss_id() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1252:28: (this_HASH_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1253:5: this_HASH_0= RULE_HASH
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_id2842); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1268:1: entryRulecss_attrib returns [String current=null] : iv_rulecss_attrib= rulecss_attrib EOF ;
    public final String entryRulecss_attrib() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_attrib = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1269:2: (iv_rulecss_attrib= rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1270:2: iv_rulecss_attrib= rulecss_attrib EOF
            {
             newCompositeNode(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib2887);
            iv_rulecss_attrib=rulecss_attrib();

            state._fsp--;

             current =iv_rulecss_attrib.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib2898); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1277:1: rulecss_attrib returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1280:28: ( (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1281:1: (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1281:1: (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1282:2: kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )? kw= ']'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_rulecss_attrib2936); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1287:1: (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_IDENT) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=44 && LA32_0<=58)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1287:6: this_IDENT_1= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib2952); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1296:5: this_ReservedWords_2= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_attrib2985);
                    this_ReservedWords_2=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:2: ( (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_INCLUDES && LA36_0<=RULE_DASHMATCH)||(LA36_0>=30 && LA36_0<=33)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:3: (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH ) ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1306:3: (kw= '^=' | kw= '$=' | kw= '*=' | kw= '=' | this_INCLUDES_7= RULE_INCLUDES | this_DASHMATCH_8= RULE_DASHMATCH )
                    int alt33=6;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt33=1;
                        }
                        break;
                    case 31:
                        {
                        alt33=2;
                        }
                        break;
                    case 32:
                        {
                        alt33=3;
                        }
                        break;
                    case 33:
                        {
                        alt33=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt33=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt33=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1307:2: kw= '^='
                            {
                            kw=(Token)match(input,30,FOLLOW_30_in_rulecss_attrib3006); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getCircumflexAccentEqualsSignKeyword_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1314:2: kw= '$='
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_rulecss_attrib3025); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getDollarSignEqualsSignKeyword_2_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1321:2: kw= '*='
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_rulecss_attrib3044); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getAsteriskEqualsSignKeyword_2_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1328:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_rulecss_attrib3063); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1334:10: this_INCLUDES_7= RULE_INCLUDES
                            {
                            this_INCLUDES_7=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rulecss_attrib3084); 

                            		current.merge(this_INCLUDES_7);
                                
                             
                                newLeafNode(this_INCLUDES_7, grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1342:10: this_DASHMATCH_8= RULE_DASHMATCH
                            {
                            this_DASHMATCH_8=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rulecss_attrib3110); 

                            		current.merge(this_DASHMATCH_8);
                                
                             
                                newLeafNode(this_DASHMATCH_8, grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_5()); 
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1349:2: ( (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords ) | this_STRING_11= RULE_STRING )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_IDENT||(LA35_0>=44 && LA35_0<=58)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_STRING) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1349:3: (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1349:3: (this_IDENT_9= RULE_IDENT | this_ReservedWords_10= ruleReservedWords )
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==RULE_IDENT) ) {
                                alt34=1;
                            }
                            else if ( ((LA34_0>=44 && LA34_0<=58)) ) {
                                alt34=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 0, input);

                                throw nvae;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1349:8: this_IDENT_9= RULE_IDENT
                                    {
                                    this_IDENT_9=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib3133); 

                                    		current.merge(this_IDENT_9);
                                        
                                     
                                        newLeafNode(this_IDENT_9, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1358:5: this_ReservedWords_10= ruleReservedWords
                                    {
                                     
                                            newCompositeNode(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_attrib3166);
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1369:10: this_STRING_11= RULE_STRING
                            {
                            this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecss_attrib3193); 

                            		current.merge(this_STRING_11);
                                
                             
                                newLeafNode(this_STRING_11, grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,34,FOLLOW_34_in_rulecss_attrib3214); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1394:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1395:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration3260);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;

             current =iv_rulecss_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration3270); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1405:1: rulecss_declaration returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1409:28: ( ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:2: (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* otherlv_3= ':' ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_prio_5_0= rulecss_prio ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:2: (this_WS_0= RULE_WS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_WS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3311); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1414:3: ( (lv_property_1_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1415:1: (lv_property_1_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1415:1: (lv_property_1_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1416:3: lv_property_1_0= rulecss_property
            {
             
            	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulecss_property_in_rulecss_declaration3333);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1432:2: (this_WS_2= RULE_WS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1432:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3345); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulecss_declaration3358); 

                	newLeafNode(otherlv_3, grammarAccess.getCss_declarationAccess().getColonKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1440:1: ( (lv_valueTokens_4_0= ruleCssTok ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_HASH)||(LA39_0>=RULE_INTEGER && LA39_0<=RULE_REAL)||LA39_0==35||LA39_0==38||LA39_0==42) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1441:1: (lv_valueTokens_4_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1441:1: (lv_valueTokens_4_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1442:3: lv_valueTokens_4_0= ruleCssTok
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCssTok_in_rulecss_declaration3379);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1458:3: ( (lv_prio_5_0= rulecss_prio ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1459:1: (lv_prio_5_0= rulecss_prio )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1459:1: (lv_prio_5_0= rulecss_prio )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1460:3: lv_prio_5_0= rulecss_prio
                    {
                     
                    	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPrioCss_prioParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_prio_in_rulecss_declaration3401);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1487:1: entryRulecss_prio returns [String current=null] : iv_rulecss_prio= rulecss_prio EOF ;
    public final String entryRulecss_prio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_prio = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1488:2: (iv_rulecss_prio= rulecss_prio EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1489:2: iv_rulecss_prio= rulecss_prio EOF
            {
             newCompositeNode(grammarAccess.getCss_prioRule()); 
            pushFollow(FOLLOW_rulecss_prio_in_entryRulecss_prio3443);
            iv_rulecss_prio=rulecss_prio();

            state._fsp--;

             current =iv_rulecss_prio.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_prio3454); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1496:1: rulecss_prio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM ;
    public final AntlrDatatypeRuleToken rulecss_prio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IMPORTANT_SYM_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1499:28: (this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1501:5: this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM
            {
             
                    newCompositeNode(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio3500);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1519:1: entryRulecss_property returns [EObject current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final EObject entryRulecss_property() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1520:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1521:2: iv_rulecss_property= rulecss_property EOF
            {
             newCompositeNode(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3544);
            iv_rulecss_property=rulecss_property();

            state._fsp--;

             current =iv_rulecss_property; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3554); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1528:1: rulecss_property returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject rulecss_property() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1531:28: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1532:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1532:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1532:2: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1532:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1533:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCss_propertyAccess().getCss_propertyAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1538:2: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1539:1: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1539:1: (lv_name_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1540:3: lv_name_1_0= ruleValidPropertyIdent
            {
             
            	        newCompositeNode(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rulecss_property3609);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1564:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1565:2: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1566:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
             newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3646);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;

             current =iv_ruleValidPropertyIdent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent3657); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1573:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1576:28: ( ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:2: (kw= '-' )? this_IDENT_1= RULE_IDENT
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1578:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleValidPropertyIdent3696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValidPropertyIdentAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleValidPropertyIdent3713); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1598:1: entryRulecss_pseudo returns [String current=null] : iv_rulecss_pseudo= rulecss_pseudo EOF ;
    public final String entryRulecss_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1599:2: (iv_rulecss_pseudo= rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1600:2: iv_rulecss_pseudo= rulecss_pseudo EOF
            {
             newCompositeNode(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo3759);
            iv_rulecss_pseudo=rulecss_pseudo();

            state._fsp--;

             current =iv_rulecss_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo3770); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:1: rulecss_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) ) ;
    public final AntlrDatatypeRuleToken rulecss_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_2=null;
        AntlrDatatypeRuleToken this_functional_pseudo_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1610:28: ( (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1611:1: (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1611:1: (kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1612:2: kw= ':' (kw= ':' )? (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo )
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulecss_pseudo3808); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1617:1: (kw= ':' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1618:2: kw= ':'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulecss_pseudo3822); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_1()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1623:3: (this_IDENT_2= RULE_IDENT | this_functional_pseudo_3= rulefunctional_pseudo )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_IDENT) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==EOF||(LA43_1>=RULE_COMMA && LA43_1<=RULE_HASH)||LA43_1==21||LA43_1==23||(LA43_1>=28 && LA43_1<=29)||LA43_1==36||(LA43_1>=38 && LA43_1<=40)) ) {
                    alt43=1;
                }
                else if ( (LA43_1==37) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1623:8: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_pseudo3840); 

                    		current.merge(this_IDENT_2);
                        
                     
                        newLeafNode(this_IDENT_2, grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1632:5: this_functional_pseudo_3= rulefunctional_pseudo
                    {
                     
                            newCompositeNode(grammarAccess.getCss_pseudoAccess().getFunctional_pseudoParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_rulefunctional_pseudo_in_rulecss_pseudo3873);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1650:1: entryRulecss_negation returns [EObject current=null] : iv_rulecss_negation= rulecss_negation EOF ;
    public final EObject entryRulecss_negation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_negation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1651:2: (iv_rulecss_negation= rulecss_negation EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1652:2: iv_rulecss_negation= rulecss_negation EOF
            {
             newCompositeNode(grammarAccess.getCss_negationRule()); 
            pushFollow(FOLLOW_rulecss_negation_in_entryRulecss_negation3919);
            iv_rulecss_negation=rulecss_negation();

            state._fsp--;

             current =iv_rulecss_negation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_negation3929); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1659:1: rulecss_negation returns [EObject current=null] : (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' ) ;
    public final EObject rulecss_negation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_not_1_0 = null;

        AntlrDatatypeRuleToken lv_negation_arg_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1662:28: ( (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1663:1: (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1663:1: (otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1663:3: otherlv_0= ':' ( (lv_not_1_0= rulecss_not ) ) ( (lv_negation_arg_2_0= rulecss_negation_arg ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulecss_negation3966); 

                	newLeafNode(otherlv_0, grammarAccess.getCss_negationAccess().getColonKeyword_0());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1667:1: ( (lv_not_1_0= rulecss_not ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1668:1: (lv_not_1_0= rulecss_not )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1668:1: (lv_not_1_0= rulecss_not )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1669:3: lv_not_1_0= rulecss_not
            {
             
            	        newCompositeNode(grammarAccess.getCss_negationAccess().getNotCss_notEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulecss_not_in_rulecss_negation3987);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1685:2: ( (lv_negation_arg_2_0= rulecss_negation_arg ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1686:1: (lv_negation_arg_2_0= rulecss_negation_arg )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1686:1: (lv_negation_arg_2_0= rulecss_negation_arg )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1687:3: lv_negation_arg_2_0= rulecss_negation_arg
            {
             
            	        newCompositeNode(grammarAccess.getCss_negationAccess().getNegation_argCss_negation_argParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulecss_negation_arg_in_rulecss_negation4008);
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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_rulecss_negation4020); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1715:1: entryRulecss_negation_arg returns [String current=null] : iv_rulecss_negation_arg= rulecss_negation_arg EOF ;
    public final String entryRulecss_negation_arg() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_negation_arg = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1716:2: (iv_rulecss_negation_arg= rulecss_negation_arg EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1717:2: iv_rulecss_negation_arg= rulecss_negation_arg EOF
            {
             newCompositeNode(grammarAccess.getCss_negation_argRule()); 
            pushFollow(FOLLOW_rulecss_negation_arg_in_entryRulecss_negation_arg4057);
            iv_rulecss_negation_arg=rulecss_negation_arg();

            state._fsp--;

             current =iv_rulecss_negation_arg.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_negation_arg4068); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1724:1: rulecss_negation_arg returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1727:28: ( (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1728:1: (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1728:1: (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo )
            int alt44=6;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1729:5: this_css_type_selector_0= rulecss_type_selector
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_type_selectorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecss_type_selector_in_rulecss_negation_arg4115);
                    this_css_type_selector_0=rulecss_type_selector();

                    state._fsp--;


                    		current.merge(this_css_type_selector_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1741:5: this_css_universal_1= rulecss_universal
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_universalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecss_universal_in_rulecss_negation_arg4148);
                    this_css_universal_1=rulecss_universal();

                    state._fsp--;


                    		current.merge(this_css_universal_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1752:10: this_HASH_2= RULE_HASH
                    {
                    this_HASH_2=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_negation_arg4174); 

                    		current.merge(this_HASH_2);
                        
                     
                        newLeafNode(this_HASH_2, grammarAccess.getCss_negation_argAccess().getHASHTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1761:5: this_css_class_3= rulecss_class
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_classParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulecss_class_in_rulecss_negation_arg4207);
                    this_css_class_3=rulecss_class();

                    state._fsp--;


                    		current.merge(this_css_class_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1773:5: this_css_attrib_4= rulecss_attrib
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_attribParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulecss_attrib_in_rulecss_negation_arg4240);
                    this_css_attrib_4=rulecss_attrib();

                    state._fsp--;


                    		current.merge(this_css_attrib_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1785:5: this_css_pseudo_5= rulecss_pseudo
                    {
                     
                            newCompositeNode(grammarAccess.getCss_negation_argAccess().getCss_pseudoParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulecss_pseudo_in_rulecss_negation_arg4273);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1803:1: entryRulefunctional_pseudo returns [String current=null] : iv_rulefunctional_pseudo= rulefunctional_pseudo EOF ;
    public final String entryRulefunctional_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunctional_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1804:2: (iv_rulefunctional_pseudo= rulefunctional_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1805:2: iv_rulefunctional_pseudo= rulefunctional_pseudo EOF
            {
             newCompositeNode(grammarAccess.getFunctional_pseudoRule()); 
            pushFollow(FOLLOW_rulefunctional_pseudo_in_entryRulefunctional_pseudo4319);
            iv_rulefunctional_pseudo=rulefunctional_pseudo();

            state._fsp--;

             current =iv_rulefunctional_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctional_pseudo4330); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1812:1: rulefunctional_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulefunctional_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_function_expr_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1815:28: ( (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1816:1: (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1816:1: (this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1816:6: this_IDENT_0= RULE_IDENT kw= '(' this_function_expr_2= rulefunction_expr kw= ')'
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunctional_pseudo4370); 

            		current.merge(this_IDENT_0);
                
             
                newLeafNode(this_IDENT_0, grammarAccess.getFunctional_pseudoAccess().getIDENTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,37,FOLLOW_37_in_rulefunctional_pseudo4388); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunctional_pseudoAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getFunctional_pseudoAccess().getFunction_exprParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulefunction_expr_in_rulefunctional_pseudo4410);
            this_function_expr_2=rulefunction_expr();

            state._fsp--;


            		current.merge(this_function_expr_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,36,FOLLOW_36_in_rulefunctional_pseudo4428); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1854:1: entryRulefunction_expr returns [String current=null] : iv_rulefunction_expr= rulefunction_expr EOF ;
    public final String entryRulefunction_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_expr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1855:2: (iv_rulefunction_expr= rulefunction_expr EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1856:2: iv_rulefunction_expr= rulefunction_expr EOF
            {
             newCompositeNode(grammarAccess.getFunction_exprRule()); 
            pushFollow(FOLLOW_rulefunction_expr_in_entryRulefunction_expr4469);
            iv_rulefunction_expr=rulefunction_expr();

            state._fsp--;

             current =iv_rulefunction_expr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_expr4480); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1863:1: rulefunction_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+ ;
    public final AntlrDatatypeRuleToken rulefunction_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_4=null;
        Token this_IDENT_5=null;
        AntlrDatatypeRuleToken this_DIMENSION_2 = null;

        AntlrDatatypeRuleToken this_NUMBER_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1866:28: ( (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1867:1: (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1867:1: (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+
            int cnt45=0;
            loop45:
            do {
                int alt45=7;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1868:2: kw= '+'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_rulefunction_expr4518); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFunction_exprAccess().getPlusSignKeyword_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1875:2: kw= '-'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_rulefunction_expr4537); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFunction_exprAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1882:5: this_DIMENSION_2= ruleDIMENSION
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunction_exprAccess().getDIMENSIONParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleDIMENSION_in_rulefunction_expr4565);
            	    this_DIMENSION_2=ruleDIMENSION();

            	    state._fsp--;


            	    		current.merge(this_DIMENSION_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1894:5: this_NUMBER_3= ruleNUMBER
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunction_exprAccess().getNUMBERParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleNUMBER_in_rulefunction_expr4598);
            	    this_NUMBER_3=ruleNUMBER();

            	    state._fsp--;


            	    		current.merge(this_NUMBER_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1905:10: this_STRING_4= RULE_STRING
            	    {
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefunction_expr4624); 

            	    		current.merge(this_STRING_4);
            	        
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getFunction_exprAccess().getSTRINGTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1913:10: this_IDENT_5= RULE_IDENT
            	    {
            	    this_IDENT_5=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction_expr4650); 

            	    		current.merge(this_IDENT_5);
            	        
            	     
            	        newLeafNode(this_IDENT_5, grammarAccess.getFunction_exprAccess().getIDENTTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1928:1: entryRuleDIMENSION returns [String current=null] : iv_ruleDIMENSION= ruleDIMENSION EOF ;
    public final String entryRuleDIMENSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIMENSION = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1929:2: (iv_ruleDIMENSION= ruleDIMENSION EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1930:2: iv_ruleDIMENSION= ruleDIMENSION EOF
            {
             newCompositeNode(grammarAccess.getDIMENSIONRule()); 
            pushFollow(FOLLOW_ruleDIMENSION_in_entryRuleDIMENSION4697);
            iv_ruleDIMENSION=ruleDIMENSION();

            state._fsp--;

             current =iv_ruleDIMENSION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIMENSION4708); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1937:1: ruleDIMENSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1940:28: ( (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1941:1: (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1941:1: (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1942:5: this_PERCENTAGE_0= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getPERCENTAGEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_ruleDIMENSION4755);
                    this_PERCENTAGE_0=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1954:5: this_LENGTH_1= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getLENGTHParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_ruleDIMENSION4788);
                    this_LENGTH_1=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1966:5: this_EMS_2= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getEMSParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_ruleDIMENSION4821);
                    this_EMS_2=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1978:5: this_EXS_3= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getEXSParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_ruleDIMENSION4854);
                    this_EXS_3=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1990:5: this_ANGLE_4= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getANGLEParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_ruleDIMENSION4887);
                    this_ANGLE_4=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2002:5: this_TIME_5= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getTIMEParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_ruleDIMENSION4920);
                    this_TIME_5=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2014:5: this_FREQ_6= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getDIMENSIONAccess().getFREQParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_ruleDIMENSION4953);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2032:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2033:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2034:2: iv_rulecombinator= rulecombinator EOF
            {
             newCompositeNode(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator4999);
            iv_rulecombinator=rulecombinator();

            state._fsp--;

             current =iv_rulecombinator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator5010); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2041:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2044:28: ( ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2045:1: ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2045:1: ( (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2045:2: (kw= '+' | kw= '>' | kw= '~' ) (this_WS_3= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2045:2: (kw= '+' | kw= '>' | kw= '~' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt47=1;
                }
                break;
            case 39:
                {
                alt47=2;
                }
                break;
            case 40:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2046:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulecombinator5049); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2053:2: kw= '>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulecombinator5068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2060:2: kw= '~'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulecombinator5087); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2065:2: (this_WS_3= RULE_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_WS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2065:7: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecombinator5104); 

            	    		current.merge(this_WS_3);
            	        
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2080:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2081:2: (iv_ruleoperator= ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2082:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator5152);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator5163); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2089:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | this_COMMA_1= RULE_COMMA ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMA_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2092:28: ( (kw= '/' | this_COMMA_1= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2093:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2093:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_COMMA) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2094:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleoperator5201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2100:10: this_COMMA_1= RULE_COMMA
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleoperator5222); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2115:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2116:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2117:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
             newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator5268);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;

             current =iv_ruleunary_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator5279); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2124:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2127:28: ( (kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2128:1: (kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2128:1: (kw= '-' | kw= '+' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35) ) {
                alt50=1;
            }
            else if ( (LA50_0==38) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2129:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleunary_operator5317); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2136:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleunary_operator5336); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2149:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2153:2: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2154:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
             newCompositeNode(grammarAccess.getSymbolTokRule()); 
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok5382);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;

             current =iv_ruleSymbolTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok5392); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2164:1: ruleSymbolTok returns [EObject current=null] : ( () ( (lv_symbol_1_0= RULE_COMMA ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2168:28: ( ( () ( (lv_symbol_1_0= RULE_COMMA ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2169:1: ( () ( (lv_symbol_1_0= RULE_COMMA ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2169:1: ( () ( (lv_symbol_1_0= RULE_COMMA ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2169:2: () ( (lv_symbol_1_0= RULE_COMMA ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2169:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2170:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2175:2: ( (lv_symbol_1_0= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2176:1: (lv_symbol_1_0= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2176:1: (lv_symbol_1_0= RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2177:3: lv_symbol_1_0= RULE_COMMA
            {
            lv_symbol_1_0=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSymbolTok5447); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2204:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2208:2: (iv_ruleWSTok= ruleWSTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2209:2: iv_ruleWSTok= ruleWSTok EOF
            {
             newCompositeNode(grammarAccess.getWSTokRule()); 
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok5498);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;

             current =iv_ruleWSTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok5508); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2219:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2223:28: ( ( () this_WS_1= RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2224:1: ( () this_WS_1= RULE_WS )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2224:1: ( () this_WS_1= RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2224:2: () this_WS_1= RULE_WS
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2224:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWSTokAccess().getWSTokAction_0(),
                        current);
                

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleWSTok5557); 
             
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2245:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2249:2: (iv_ruleStringTok= ruleStringTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2250:2: iv_ruleStringTok= ruleStringTok EOF
            {
             newCompositeNode(grammarAccess.getStringTokRule()); 
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok5602);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;

             current =iv_ruleStringTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok5612); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2260:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2264:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2265:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2265:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2265:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2265:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2266:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTokAccess().getStringTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2271:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2272:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2272:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2273:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringTok5667); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2300:1: entryRuleFuncTok returns [EObject current=null] : iv_ruleFuncTok= ruleFuncTok EOF ;
    public final EObject entryRuleFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2304:2: (iv_ruleFuncTok= ruleFuncTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2305:2: iv_ruleFuncTok= ruleFuncTok EOF
            {
             newCompositeNode(grammarAccess.getFuncTokRule()); 
            pushFollow(FOLLOW_ruleFuncTok_in_entryRuleFuncTok5718);
            iv_ruleFuncTok=ruleFuncTok();

            state._fsp--;

             current =iv_ruleFuncTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncTok5728); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2315:1: ruleFuncTok returns [EObject current=null] : ( () ( (lv_func_1_0= rulefunction ) ) ) ;
    public final EObject ruleFuncTok() throws RecognitionException {
        EObject current = null;

        EObject lv_func_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2319:28: ( ( () ( (lv_func_1_0= rulefunction ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2320:1: ( () ( (lv_func_1_0= rulefunction ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2320:1: ( () ( (lv_func_1_0= rulefunction ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2320:2: () ( (lv_func_1_0= rulefunction ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2320:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2321:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFuncTokAccess().getFuncTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2326:2: ( (lv_func_1_0= rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2327:1: (lv_func_1_0= rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2327:1: (lv_func_1_0= rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2328:3: lv_func_1_0= rulefunction
            {
             
            	        newCompositeNode(grammarAccess.getFuncTokAccess().getFuncFunctionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulefunction_in_ruleFuncTok5787);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2355:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2359:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2360:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
             newCompositeNode(grammarAccess.getNumberTokRule()); 
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok5833);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;

             current =iv_ruleNumberTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok5843); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2370:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_num_1_0= rulenumberTerm ) ) ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_num_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2374:28: ( ( () ( (lv_num_1_0= rulenumberTerm ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:1: ( () ( (lv_num_1_0= rulenumberTerm ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:1: ( () ( (lv_num_1_0= rulenumberTerm ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:2: () ( (lv_num_1_0= rulenumberTerm ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2376:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2381:2: ( (lv_num_1_0= rulenumberTerm ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2382:1: (lv_num_1_0= rulenumberTerm )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2382:1: (lv_num_1_0= rulenumberTerm )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2383:3: lv_num_1_0= rulenumberTerm
            {
             
            	        newCompositeNode(grammarAccess.getNumberTokAccess().getNumNumberTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulenumberTerm_in_ruleNumberTok5902);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2410:1: entryRuleIdentifierTok returns [EObject current=null] : iv_ruleIdentifierTok= ruleIdentifierTok EOF ;
    public final EObject entryRuleIdentifierTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2414:2: (iv_ruleIdentifierTok= ruleIdentifierTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2415:2: iv_ruleIdentifierTok= ruleIdentifierTok EOF
            {
             newCompositeNode(grammarAccess.getIdentifierTokRule()); 
            pushFollow(FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok5948);
            iv_ruleIdentifierTok=ruleIdentifierTok();

            state._fsp--;

             current =iv_ruleIdentifierTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierTok5958); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2425:1: ruleIdentifierTok returns [EObject current=null] : ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject ruleIdentifierTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2429:28: ( ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2430:1: ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2430:1: ( () ( (lv_id_1_0= ruleValidPropertyIdent ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2430:2: () ( (lv_id_1_0= ruleValidPropertyIdent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2430:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2431:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIdentifierTokAccess().getIdentifierTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2436:2: ( (lv_id_1_0= ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2437:1: (lv_id_1_0= ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2437:1: (lv_id_1_0= ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2438:3: lv_id_1_0= ruleValidPropertyIdent
            {
             
            	        newCompositeNode(grammarAccess.getIdentifierTokAccess().getIdValidPropertyIdentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_ruleIdentifierTok6017);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2465:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2469:2: (iv_ruleUrlTok= ruleUrlTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2470:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
             newCompositeNode(grammarAccess.getUrlTokRule()); 
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok6063);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;

             current =iv_ruleUrlTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok6073); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2480:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2484:28: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2485:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2485:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2485:2: () ( (lv_url_1_0= ruleURLType ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2485:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2486:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2491:2: ( (lv_url_1_0= ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2492:1: (lv_url_1_0= ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2492:1: (lv_url_1_0= ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2493:3: lv_url_1_0= ruleURLType
            {
             
            	        newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleURLType_in_ruleUrlTok6132);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2520:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2524:2: (iv_ruleColorTok= ruleColorTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2525:2: iv_ruleColorTok= ruleColorTok EOF
            {
             newCompositeNode(grammarAccess.getColorTokRule()); 
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok6178);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;

             current =iv_ruleColorTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok6188); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2535:1: ruleColorTok returns [EObject current=null] : ( () ( (lv_color_1_0= RULE_HASH ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        Token lv_color_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2539:28: ( ( () ( (lv_color_1_0= RULE_HASH ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2540:1: ( () ( (lv_color_1_0= RULE_HASH ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2540:1: ( () ( (lv_color_1_0= RULE_HASH ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2540:2: () ( (lv_color_1_0= RULE_HASH ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2540:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2541:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorTokAccess().getColorTokAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2546:2: ( (lv_color_1_0= RULE_HASH ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2547:1: (lv_color_1_0= RULE_HASH )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2547:1: (lv_color_1_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2548:3: lv_color_1_0= RULE_HASH
            {
            lv_color_1_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleColorTok6243); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2575:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2579:2: (iv_ruleCssTok= ruleCssTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2580:2: iv_ruleCssTok= ruleCssTok EOF
            {
             newCompositeNode(grammarAccess.getCssTokRule()); 
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok6294);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;

             current =iv_ruleCssTok; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok6304); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2590:1: ruleCssTok returns [EObject current=null] : (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2594:28: ( (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2595:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2595:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )
            int alt51=8;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2596:5: this_SymbolTok_0= ruleSymbolTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolTok_in_ruleCssTok6355);
                    this_SymbolTok_0=ruleSymbolTok();

                    state._fsp--;

                     
                            current = this_SymbolTok_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2606:5: this_WSTok_1= ruleWSTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWSTok_in_ruleCssTok6382);
                    this_WSTok_1=ruleWSTok();

                    state._fsp--;

                     
                            current = this_WSTok_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2616:5: this_StringTok_2= ruleStringTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringTok_in_ruleCssTok6409);
                    this_StringTok_2=ruleStringTok();

                    state._fsp--;

                     
                            current = this_StringTok_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2626:5: this_FuncTok_3= ruleFuncTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getFuncTokParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFuncTok_in_ruleCssTok6436);
                    this_FuncTok_3=ruleFuncTok();

                    state._fsp--;

                     
                            current = this_FuncTok_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2636:5: this_NumberTok_4= ruleNumberTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNumberTok_in_ruleCssTok6463);
                    this_NumberTok_4=ruleNumberTok();

                    state._fsp--;

                     
                            current = this_NumberTok_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2646:5: this_IdentifierTok_5= ruleIdentifierTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierTokParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleIdentifierTok_in_ruleCssTok6490);
                    this_IdentifierTok_5=ruleIdentifierTok();

                    state._fsp--;

                     
                            current = this_IdentifierTok_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2656:5: this_UrlTok_6= ruleUrlTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleUrlTok_in_ruleCssTok6517);
                    this_UrlTok_6=ruleUrlTok();

                    state._fsp--;

                     
                            current = this_UrlTok_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2666:5: this_ColorTok_7= ruleColorTok
                    {
                     
                            newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleColorTok_in_ruleCssTok6544);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2687:1: entryRuletermGroup returns [EObject current=null] : iv_ruletermGroup= ruletermGroup EOF ;
    public final EObject entryRuletermGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermGroup = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2688:2: (iv_ruletermGroup= ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2689:2: iv_ruletermGroup= ruletermGroup EOF
            {
             newCompositeNode(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup6585);
            iv_ruletermGroup=ruletermGroup();

            state._fsp--;

             current =iv_ruletermGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup6595); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2696:1: ruletermGroup returns [EObject current=null] : ( (lv_terms_0_0= ruleterm ) )+ ;
    public final EObject ruletermGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2699:28: ( ( (lv_terms_0_0= ruleterm ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2700:1: ( (lv_terms_0_0= ruleterm ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2700:1: ( (lv_terms_0_0= ruleterm ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_IDENT)||LA52_0==RULE_HASH||(LA52_0>=RULE_INTEGER && LA52_0<=RULE_REAL)||LA52_0==35||LA52_0==38||LA52_0==42) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2701:1: (lv_terms_0_0= ruleterm )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2701:1: (lv_terms_0_0= ruleterm )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2702:3: lv_terms_0_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_ruletermGroup6640);
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
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2726:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2727:2: (iv_ruleterm= ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2728:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm6676);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm6686); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2735:1: ruleterm returns [EObject current=null] : ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2738:28: ( ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2739:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2739:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= ruleValidPropertyIdent ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            int alt53=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_IDENT) ) {
                    int LA53_4 = input.LA(3);

                    if ( (LA53_4==37) ) {
                        alt53=5;
                    }
                    else if ( (LA53_4==EOF||(LA53_4>=RULE_STRING && LA53_4<=RULE_IDENT)||LA53_4==RULE_HASH||(LA53_4>=RULE_INTEGER && LA53_4<=RULE_REAL)||LA53_4==35||LA53_4==38||LA53_4==42) ) {
                        alt53=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA53_1>=RULE_INTEGER && LA53_1<=RULE_REAL)) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 38:
                {
                alt53=1;
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA53_4 = input.LA(2);

                if ( (LA53_4==37) ) {
                    alt53=5;
                }
                else if ( (LA53_4==EOF||(LA53_4>=RULE_STRING && LA53_4<=RULE_IDENT)||LA53_4==RULE_HASH||(LA53_4>=RULE_INTEGER && LA53_4<=RULE_REAL)||LA53_4==35||LA53_4==38||LA53_4==42) ) {
                    alt53=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 4, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt53=4;
                }
                break;
            case RULE_HASH:
                {
                alt53=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2739:2: ( (lv_number_0_0= rulenumberTerm ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2739:2: ( (lv_number_0_0= rulenumberTerm ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2740:1: (lv_number_0_0= rulenumberTerm )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2740:1: (lv_number_0_0= rulenumberTerm )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2741:3: lv_number_0_0= rulenumberTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumberTerm_in_ruleterm6732);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2758:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2758:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2759:1: (lv_stringValue_1_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2759:1: (lv_stringValue_1_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2760:3: lv_stringValue_1_0= RULE_STRING
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleterm6755); 

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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2777:6: ( (lv_identifier_2_0= ruleValidPropertyIdent ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2777:6: ( (lv_identifier_2_0= ruleValidPropertyIdent ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2778:1: (lv_identifier_2_0= ruleValidPropertyIdent )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2778:1: (lv_identifier_2_0= ruleValidPropertyIdent )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2779:3: lv_identifier_2_0= ruleValidPropertyIdent
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getIdentifierValidPropertyIdentParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidPropertyIdent_in_ruleterm6787);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2796:6: ( (lv_url_3_0= ruleURLType ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2796:6: ( (lv_url_3_0= ruleURLType ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2797:1: (lv_url_3_0= ruleURLType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2797:1: (lv_url_3_0= ruleURLType )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2798:3: lv_url_3_0= ruleURLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleURLType_in_ruleterm6814);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2815:6: ( (lv_function_4_0= rulefunction ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2815:6: ( (lv_function_4_0= rulefunction ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2816:1: (lv_function_4_0= rulefunction )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2816:1: (lv_function_4_0= rulefunction )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2817:3: lv_function_4_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_ruleterm6841);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2834:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2834:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2835:1: (lv_hexColor_5_0= ruleHexColor )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2835:1: (lv_hexColor_5_0= ruleHexColor )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2836:3: lv_hexColor_5_0= ruleHexColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHexColor_in_ruleterm6868);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2860:1: entryRulenumberTerm returns [String current=null] : iv_rulenumberTerm= rulenumberTerm EOF ;
    public final String entryRulenumberTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumberTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2864:2: (iv_rulenumberTerm= rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2865:2: iv_rulenumberTerm= rulenumberTerm EOF
            {
             newCompositeNode(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm6911);
            iv_rulenumberTerm=rulenumberTerm();

            state._fsp--;

             current =iv_rulenumberTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm6922); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2875:1: rulenumberTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2879:28: ( ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2880:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2880:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2880:2: (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2880:2: (this_unary_operator_0= ruleunary_operator )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35||LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2881:5: this_unary_operator_0= ruleunary_operator
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunary_operator_in_rulenumberTerm6974);
                    this_unary_operator_0=ruleunary_operator();

                    state._fsp--;


                    		current.merge(this_unary_operator_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2891:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2892:5: this_NUMBER_1= ruleNUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_rulenumberTerm7004);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2904:5: this_PERCENTAGE_2= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rulenumberTerm7037);
                    this_PERCENTAGE_2=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2916:5: this_LENGTH_3= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_rulenumberTerm7070);
                    this_LENGTH_3=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2928:5: this_EMS_4= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_rulenumberTerm7103);
                    this_EMS_4=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2940:5: this_EXS_5= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_rulenumberTerm7136);
                    this_EXS_5=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2952:5: this_ANGLE_6= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_rulenumberTerm7169);
                    this_ANGLE_6=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2964:5: this_TIME_7= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_rulenumberTerm7202);
                    this_TIME_7=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2976:5: this_FREQ_8= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_rulenumberTerm7235);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2997:1: entryRulenum returns [String current=null] : iv_rulenum= rulenum EOF ;
    public final String entryRulenum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenum = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2998:2: (iv_rulenum= rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2999:2: iv_rulenum= rulenum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum7286);
            iv_rulenum=rulenum();

            state._fsp--;

             current =iv_rulenum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum7297); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3006:1: rulenum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken rulenum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_REAL_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3009:28: ( (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3010:1: (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3010:1: (this_INTEGER_0= RULE_INTEGER | this_REAL_1= RULE_REAL )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INTEGER) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_REAL) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3010:6: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rulenum7337); 

                    		current.merge(this_INTEGER_0);
                        
                     
                        newLeafNode(this_INTEGER_0, grammarAccess.getNumAccess().getINTEGERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3018:10: this_REAL_1= RULE_REAL
                    {
                    this_REAL_1=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulenum7363); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3033:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3037:2: (iv_rulefunction= rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3038:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction7414);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction7424); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3048:1: rulefunction returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3052:28: ( ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3053:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3053:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3053:2: (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_params_3_0= ruleCssTok ) )+ otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3053:2: (otherlv_0= '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==35) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3053:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulefunction7466); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3057:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3058:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3058:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3059:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction7485); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_rulefunction7502); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3079:1: ( (lv_params_3_0= ruleCssTok ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_HASH)||(LA58_0>=RULE_INTEGER && LA58_0<=RULE_REAL)||LA58_0==35||LA58_0==38||LA58_0==42) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3080:1: (lv_params_3_0= ruleCssTok )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3080:1: (lv_params_3_0= ruleCssTok )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3081:3: lv_params_3_0= ruleCssTok
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsCssTokParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCssTok_in_rulefunction7523);
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
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulefunction7536); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3112:1: entryRuleHexColor returns [String current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final String entryRuleHexColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexColor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3116:2: (iv_ruleHexColor= ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3117:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor7583);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor7594); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3127:1: ruleHexColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HASH_0= RULE_HASH ;
    public final AntlrDatatypeRuleToken ruleHexColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3131:28: (this_HASH_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3132:5: this_HASH_0= RULE_HASH
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleHexColor7637); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3150:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3154:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3155:2: iv_ruleURLType= ruleURLType EOF
            {
             newCompositeNode(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType7691);
            iv_ruleURLType=ruleURLType();

            state._fsp--;

             current =iv_ruleURLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType7701); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3165:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3169:28: ( (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3170:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3170:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3170:3: otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleURLType7742); 

                	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleURLType7754); 

                	newLeafNode(otherlv_1, grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3178:1: ( (lv_url_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:1: (lv_url_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3179:1: (lv_url_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3180:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURLType7771); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleURLType7788); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3211:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3212:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3213:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER7829);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER7840); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3220:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_num_0= rulenum ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3223:28: (this_num_0= rulenum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3225:5: this_num_0= rulenum
            {
             
                    newCompositeNode(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER7886);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3243:1: entryRulePERCENTAGE returns [String current=null] : iv_rulePERCENTAGE= rulePERCENTAGE EOF ;
    public final String entryRulePERCENTAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENTAGE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3244:2: (iv_rulePERCENTAGE= rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3245:2: iv_rulePERCENTAGE= rulePERCENTAGE EOF
            {
             newCompositeNode(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE7931);
            iv_rulePERCENTAGE=rulePERCENTAGE();

            state._fsp--;

             current =iv_rulePERCENTAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE7942); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3252:1: rulePERCENTAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePERCENTAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3255:28: ( (this_num_0= rulenum kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3256:1: (this_num_0= rulenum kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3256:1: (this_num_0= rulenum kw= '%' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3257:5: this_num_0= rulenum kw= '%'
            {
             
                    newCompositeNode(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_rulePERCENTAGE7989);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,43,FOLLOW_43_in_rulePERCENTAGE8007); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3281:1: entryRuleEMS returns [String current=null] : iv_ruleEMS= ruleEMS EOF ;
    public final String entryRuleEMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3282:2: (iv_ruleEMS= ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3283:2: iv_ruleEMS= ruleEMS EOF
            {
             newCompositeNode(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS8048);
            iv_ruleEMS=ruleEMS();

            state._fsp--;

             current =iv_ruleEMS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS8059); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3290:1: ruleEMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'em' ) ;
    public final AntlrDatatypeRuleToken ruleEMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3293:28: ( (this_num_0= rulenum kw= 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3294:1: (this_num_0= rulenum kw= 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3294:1: (this_num_0= rulenum kw= 'em' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3295:5: this_num_0= rulenum kw= 'em'
            {
             
                    newCompositeNode(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEMS8106);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleEMS8124); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3319:1: entryRuleEXS returns [String current=null] : iv_ruleEXS= ruleEXS EOF ;
    public final String entryRuleEXS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3320:2: (iv_ruleEXS= ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3321:2: iv_ruleEXS= ruleEXS EOF
            {
             newCompositeNode(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS8165);
            iv_ruleEXS=ruleEXS();

            state._fsp--;

             current =iv_ruleEXS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS8176); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3328:1: ruleEXS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'ex' ) ;
    public final AntlrDatatypeRuleToken ruleEXS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3331:28: ( (this_num_0= rulenum kw= 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3332:1: (this_num_0= rulenum kw= 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3332:1: (this_num_0= rulenum kw= 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3333:5: this_num_0= rulenum kw= 'ex'
            {
             
                    newCompositeNode(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEXS8223);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,45,FOLLOW_45_in_ruleEXS8241); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3357:1: entryRuleLENGTH returns [String current=null] : iv_ruleLENGTH= ruleLENGTH EOF ;
    public final String entryRuleLENGTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLENGTH = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3361:2: (iv_ruleLENGTH= ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3362:2: iv_ruleLENGTH= ruleLENGTH EOF
            {
             newCompositeNode(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH8288);
            iv_ruleLENGTH=ruleLENGTH();

            state._fsp--;

             current =iv_ruleLENGTH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH8299); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3372:1: ruleLENGTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) ;
    public final AntlrDatatypeRuleToken ruleLENGTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3376:28: ( (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3377:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3377:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3378:5: this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            {
             
                    newCompositeNode(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleLENGTH8350);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3388:1: (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            int alt59=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt59=1;
                }
                break;
            case 47:
                {
                alt59=2;
                }
                break;
            case 48:
                {
                alt59=3;
                }
                break;
            case 49:
                {
                alt59=4;
                }
                break;
            case 50:
                {
                alt59=5;
                }
                break;
            case 51:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3389:2: kw= 'px'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleLENGTH8369); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3396:2: kw= 'cm'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleLENGTH8388); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3403:2: kw= 'mm'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleLENGTH8407); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3410:2: kw= 'in'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleLENGTH8426); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3417:2: kw= 'pt'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleLENGTH8445); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3424:2: kw= 'pc'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleLENGTH8464); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3440:1: entryRuleANGLE returns [String current=null] : iv_ruleANGLE= ruleANGLE EOF ;
    public final String entryRuleANGLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANGLE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3441:2: (iv_ruleANGLE= ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3442:2: iv_ruleANGLE= ruleANGLE EOF
            {
             newCompositeNode(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE8510);
            iv_ruleANGLE=ruleANGLE();

            state._fsp--;

             current =iv_ruleANGLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE8521); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3449:1: ruleANGLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) ;
    public final AntlrDatatypeRuleToken ruleANGLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3452:28: ( (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3453:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3453:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3454:5: this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            {
             
                    newCompositeNode(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleANGLE8568);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3464:1: (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt60=1;
                }
                break;
            case 53:
                {
                alt60=2;
                }
                break;
            case 54:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3465:2: kw= 'deg'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleANGLE8587); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3472:2: kw= 'rad'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleANGLE8606); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3479:2: kw= 'grad'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleANGLE8625); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3492:1: entryRuleTIME returns [String current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final String entryRuleTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3493:2: (iv_ruleTIME= ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3494:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME8667);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME8678); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3501:1: ruleTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) ;
    public final AntlrDatatypeRuleToken ruleTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3504:28: ( (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3505:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3505:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3506:5: this_num_0= rulenum (kw= 'ms' | kw= 's' )
            {
             
                    newCompositeNode(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleTIME8725);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3516:1: (kw= 'ms' | kw= 's' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==55) ) {
                alt61=1;
            }
            else if ( (LA61_0==56) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3517:2: kw= 'ms'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleTIME8744); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3524:2: kw= 's'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleTIME8763); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3537:1: entryRuleFREQ returns [String current=null] : iv_ruleFREQ= ruleFREQ EOF ;
    public final String entryRuleFREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFREQ = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3538:2: (iv_ruleFREQ= ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3539:2: iv_ruleFREQ= ruleFREQ EOF
            {
             newCompositeNode(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ8805);
            iv_ruleFREQ=ruleFREQ();

            state._fsp--;

             current =iv_ruleFREQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ8816); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3546:1: ruleFREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) ;
    public final AntlrDatatypeRuleToken ruleFREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3549:28: ( (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3550:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3550:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3551:5: this_num_0= rulenum (kw= 'hz' | kw= 'khz' )
            {
             
                    newCompositeNode(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleFREQ8863);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3561:1: (kw= 'hz' | kw= 'khz' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            else if ( (LA62_0==58) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3562:2: kw= 'hz'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleFREQ8882); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3569:2: kw= 'khz'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleFREQ8901); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3582:1: entryRuleIMPORTANT_SYM returns [String current=null] : iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF ;
    public final String entryRuleIMPORTANT_SYM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORTANT_SYM = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3583:2: (iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3584:2: iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF
            {
             newCompositeNode(grammarAccess.getIMPORTANT_SYMRule()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM8943);
            iv_ruleIMPORTANT_SYM=ruleIMPORTANT_SYM();

            state._fsp--;

             current =iv_ruleIMPORTANT_SYM.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORTANT_SYM8954); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3591:1: ruleIMPORTANT_SYM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!important' ;
    public final AntlrDatatypeRuleToken ruleIMPORTANT_SYM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3594:28: (kw= '!important' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3596:2: kw= '!important'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleIMPORTANT_SYM8991); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3609:1: entryRuleReservedWords returns [String current=null] : iv_ruleReservedWords= ruleReservedWords EOF ;
    public final String entryRuleReservedWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReservedWords = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3610:2: (iv_ruleReservedWords= ruleReservedWords EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3611:2: iv_ruleReservedWords= ruleReservedWords EOF
            {
             newCompositeNode(grammarAccess.getReservedWordsRule()); 
            pushFollow(FOLLOW_ruleReservedWords_in_entryRuleReservedWords9031);
            iv_ruleReservedWords=ruleReservedWords();

            state._fsp--;

             current =iv_ruleReservedWords.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedWords9042); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3618:1: ruleReservedWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' ) ;
    public final AntlrDatatypeRuleToken ruleReservedWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3621:28: ( (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3622:1: (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3622:1: (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' )
            int alt63=15;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt63=1;
                }
                break;
            case 45:
                {
                alt63=2;
                }
                break;
            case 46:
                {
                alt63=3;
                }
                break;
            case 47:
                {
                alt63=4;
                }
                break;
            case 48:
                {
                alt63=5;
                }
                break;
            case 49:
                {
                alt63=6;
                }
                break;
            case 50:
                {
                alt63=7;
                }
                break;
            case 51:
                {
                alt63=8;
                }
                break;
            case 52:
                {
                alt63=9;
                }
                break;
            case 53:
                {
                alt63=10;
                }
                break;
            case 54:
                {
                alt63=11;
                }
                break;
            case 55:
                {
                alt63=12;
                }
                break;
            case 56:
                {
                alt63=13;
                }
                break;
            case 57:
                {
                alt63=14;
                }
                break;
            case 58:
                {
                alt63=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3623:2: kw= 'em'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleReservedWords9080); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3630:2: kw= 'ex'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleReservedWords9099); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getExKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3637:2: kw= 'px'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleReservedWords9118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3644:2: kw= 'cm'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleReservedWords9137); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3651:2: kw= 'mm'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleReservedWords9156); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3658:2: kw= 'in'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleReservedWords9175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getInKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3665:2: kw= 'pt'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleReservedWords9194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3672:2: kw= 'pc'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleReservedWords9213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3679:2: kw= 'deg'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleReservedWords9232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3686:2: kw= 'rad'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleReservedWords9251); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3693:2: kw= 'grad'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleReservedWords9270); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3700:2: kw= 'ms'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleReservedWords9289); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3707:2: kw= 's'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleReservedWords9308); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getSKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3714:2: kw= 'hz'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleReservedWords9327); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3721:2: kw= 'khz'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleReservedWords9346); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3734:1: rulecss_not returns [Enumerator current=null] : (enumLiteral_0= 'not(' ) ;
    public final Enumerator rulecss_not() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3736:28: ( (enumLiteral_0= 'not(' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3737:1: (enumLiteral_0= 'not(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3737:1: (enumLiteral_0= 'not(' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:3737:3: enumLiteral_0= 'not('
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_rulecss_not9399); 

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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String DFA21_eotS =
        "\5\uffff";
    static final String DFA21_eofS =
        "\1\3\4\uffff";
    static final String DFA21_minS =
        "\1\6\1\uffff\1\5\2\uffff";
    static final String DFA21_maxS =
        "\1\50\1\uffff\1\72\2\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\2\15\uffff\1\3\20\uffff\3\1",
            "",
            "\1\4\1\uffff\1\2\1\4\14\uffff\1\3\1\uffff\1\4\2\uffff\4\4\10"+
            "\uffff\3\4\3\uffff\17\4",
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
    static final String DFA44_eotS =
        "\12\uffff";
    static final String DFA44_eofS =
        "\1\uffff\1\4\1\11\7\uffff";
    static final String DFA44_minS =
        "\1\5\2\33\1\5\6\uffff";
    static final String DFA44_maxS =
        "\1\72\2\44\1\72\6\uffff";
    static final String DFA44_acceptS =
        "\4\uffff\1\1\1\3\1\4\1\5\1\6\1\2";
    static final String DFA44_specialS =
        "\12\uffff}>";
    static final String[] DFA44_transitionS = {
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
            return "1728:1: (this_css_type_selector_0= rulecss_type_selector | this_css_universal_1= rulecss_universal | this_HASH_2= RULE_HASH | this_css_class_3= rulecss_class | this_css_attrib_4= rulecss_attrib | this_css_pseudo_5= rulecss_pseudo )";
        }
    }
    static final String DFA45_eotS =
        "\12\uffff";
    static final String DFA45_eofS =
        "\1\1\3\uffff\2\11\4\uffff";
    static final String DFA45_minS =
        "\1\4\3\uffff\2\4\4\uffff";
    static final String DFA45_maxS =
        "\1\46\3\uffff\2\72\4\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\7\1\1\1\2\2\uffff\1\5\1\6\1\3\1\4";
    static final String DFA45_specialS =
        "\12\uffff}>";
    static final String[] DFA45_transitionS = {
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
            return "()+ loopback of 1867:1: (kw= '+' | kw= '-' | this_DIMENSION_2= ruleDIMENSION | this_NUMBER_3= ruleNUMBER | this_STRING_4= RULE_STRING | this_IDENT_5= RULE_IDENT )+";
        }
    }
    static final String DFA46_eotS =
        "\12\uffff";
    static final String DFA46_eofS =
        "\12\uffff";
    static final String DFA46_minS =
        "\1\13\2\53\7\uffff";
    static final String DFA46_maxS =
        "\1\14\2\72\7\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\1\6\1\1\1\5\1\3\1\2\1\7\1\4";
    static final String DFA46_specialS =
        "\12\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\1\2",
            "\1\4\1\6\1\11\6\7\3\5\2\3\2\10",
            "\1\4\1\6\1\11\6\7\3\5\2\3\2\10",
            "",
            "",
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
            return "1941:1: (this_PERCENTAGE_0= rulePERCENTAGE | this_LENGTH_1= ruleLENGTH | this_EMS_2= ruleEMS | this_EXS_3= ruleEXS | this_ANGLE_4= ruleANGLE | this_TIME_5= ruleTIME | this_FREQ_6= ruleFREQ )";
        }
    }
    static final String DFA51_eotS =
        "\13\uffff";
    static final String DFA51_eofS =
        "\5\uffff\1\12\5\uffff";
    static final String DFA51_minS =
        "\1\4\3\uffff\1\5\1\4\5\uffff";
    static final String DFA51_maxS =
        "\1\52\3\uffff\1\14\1\73\5\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String DFA51_specialS =
        "\13\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\3\1\5\1\1\1\2\1\10\2\uffff\2\6\26\uffff\1\4\2\uffff\1\6\3"+
            "\uffff\1\7",
            "",
            "",
            "",
            "\1\5\5\uffff\2\6",
            "\5\12\2\uffff\2\12\3\uffff\1\12\5\uffff\1\12\14\uffff\2\12"+
            "\1\11\1\12\3\uffff\1\12\20\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2595:1: (this_SymbolTok_0= ruleSymbolTok | this_WSTok_1= ruleWSTok | this_StringTok_2= ruleStringTok | this_FuncTok_3= ruleFuncTok | this_NumberTok_4= ruleNumberTok | this_IdentifierTok_5= ruleIdentifierTok | this_UrlTok_6= ruleUrlTok | this_ColorTok_7= ruleColorTok )";
        }
    }
    static final String DFA55_eotS =
        "\13\uffff";
    static final String DFA55_eofS =
        "\1\uffff\2\3\10\uffff";
    static final String DFA55_minS =
        "\1\13\2\4\10\uffff";
    static final String DFA55_maxS =
        "\1\14\2\73\10\uffff";
    static final String DFA55_acceptS =
        "\3\uffff\1\1\1\5\1\7\1\6\1\4\1\2\1\10\1\3";
    static final String DFA55_specialS =
        "\13\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\1\2",
            "\5\3\2\uffff\2\3\3\uffff\1\3\5\uffff\1\3\14\uffff\2\3\1\uffff"+
            "\1\3\3\uffff\1\3\1\10\1\7\1\4\6\12\3\6\2\5\2\11\1\3",
            "\5\3\2\uffff\2\3\3\uffff\1\3\5\uffff\1\3\14\uffff\2\3\1\uffff"+
            "\1\3\3\uffff\1\3\1\10\1\7\1\4\6\12\3\6\2\5\2\11\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2891:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )";
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
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1397 = new BitSet(new long[]{0x00000000002000C0L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1409 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1429 = new BitSet(new long[]{0x00000000002000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleruleset1443 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_21_in_ruleruleset1456 = new BitSet(new long[]{0x00000008004000A0L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1478 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleset1490 = new BitSet(new long[]{0x00000008004000A0L});
    public static final BitSet FOLLOW_22_in_ruleruleset1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1606 = new BitSet(new long[]{0x000001C000000082L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1629 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1670 = new BitSet(new long[]{0x07FFF1C03C8001A0L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1692 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulesimple_selector1815 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_rulecss_universal_in_rulesimple_selector1842 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1864 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1893 = new BitSet(new long[]{0x07FFF0003C800122L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleelement_name1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_ruleelement_name2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rulesub_selector2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulesub_selector2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulesub_selector2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulesub_selector2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_in_rulesub_selector2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_type_selector_in_entryRulecss_type_selector2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_type_selector2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rulecss_type_selector2320 = new BitSet(new long[]{0x07FFF00000000020L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulecss_type_selector2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix2395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_namespace_prefix2447 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_rulecss_namespace_prefix2471 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulecss_namespace_prefix2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_entryRulecss_universal2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_universal2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rulecss_universal2586 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulecss_universal2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class2647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulecss_class2696 = new BitSet(new long[]{0x07FFF00000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_class2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_class2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_id2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib2887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecss_attrib2936 = new BitSet(new long[]{0x07FFF00000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib2952 = new BitSet(new long[]{0x00000007C0000600L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_attrib2985 = new BitSet(new long[]{0x00000007C0000600L});
    public static final BitSet FOLLOW_30_in_rulecss_attrib3006 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_31_in_rulecss_attrib3025 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_32_in_rulecss_attrib3044 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_33_in_rulecss_attrib3063 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rulecss_attrib3084 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rulecss_attrib3110 = new BitSet(new long[]{0x07FFF00000000030L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib3133 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_attrib3166 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecss_attrib3193 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulecss_attrib3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration3260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3311 = new BitSet(new long[]{0x00000008000000A0L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_declaration3333 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3345 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_23_in_rulecss_declaration3358 = new BitSet(new long[]{0x00000448000619F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulecss_declaration3379 = new BitSet(new long[]{0x08000448000619F2L});
    public static final BitSet FOLLOW_rulecss_prio_in_rulecss_declaration3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_entryRulecss_prio3443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_prio3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rulecss_property3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleValidPropertyIdent3696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleValidPropertyIdent3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo3759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecss_pseudo3808 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_rulecss_pseudo3822 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_pseudo3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctional_pseudo_in_rulecss_pseudo3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_in_entryRulecss_negation3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_negation3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecss_negation3966 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rulecss_not_in_rulecss_negation3987 = new BitSet(new long[]{0x07FFF0003C800120L});
    public static final BitSet FOLLOW_rulecss_negation_arg_in_rulecss_negation4008 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulecss_negation4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_arg_in_entryRulecss_negation_arg4057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_negation_arg4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_type_selector_in_rulecss_negation_arg4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_rulecss_negation_arg4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_negation_arg4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulecss_negation_arg4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulecss_negation_arg4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulecss_negation_arg4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctional_pseudo_in_entryRulefunctional_pseudo4319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctional_pseudo4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunctional_pseudo4370 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunctional_pseudo4388 = new BitSet(new long[]{0x0000004800001830L});
    public static final BitSet FOLLOW_rulefunction_expr_in_rulefunctional_pseudo4410 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunctional_pseudo4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_expr_in_entryRulefunction_expr4469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_expr4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulefunction_expr4518 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_35_in_rulefunction_expr4537 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_ruleDIMENSION_in_rulefunction_expr4565 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulefunction_expr4598 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefunction_expr4624 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction_expr4650 = new BitSet(new long[]{0x0000004800001832L});
    public static final BitSet FOLLOW_ruleDIMENSION_in_entryRuleDIMENSION4697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIMENSION4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_ruleDIMENSION4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_ruleDIMENSION4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_ruleDIMENSION4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_ruleDIMENSION4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_ruleDIMENSION4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_ruleDIMENSION4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_ruleDIMENSION4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator4999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulecombinator5049 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_39_in_rulecombinator5068 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_40_in_rulecombinator5087 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecombinator5104 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator5152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleoperator5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleoperator5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator5268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleunary_operator5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleunary_operator5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok5382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSymbolTok5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok5498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleWSTok5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok5602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringTok5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_entryRuleFuncTok5718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncTok5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleFuncTok5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok5833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleNumberTok5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok5948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierTok5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_ruleIdentifierTok6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok6063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleUrlTok6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok6178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleColorTok6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok6294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_ruleCssTok6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_ruleCssTok6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_ruleCssTok6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_ruleCssTok6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_ruleCssTok6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_ruleCssTok6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_ruleCssTok6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_ruleCssTok6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup6585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermGroup6640 = new BitSet(new long[]{0x00000448000619B2L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm6676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleterm6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleterm6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_ruleterm6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleterm6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleterm6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_ruleterm6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm6911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rulenumberTerm6974 = new BitSet(new long[]{0x0000004800001800L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulenumberTerm7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rulenumberTerm7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rulenumberTerm7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rulenumberTerm7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rulenumberTerm7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rulenumberTerm7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rulenumberTerm7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rulenumberTerm7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum7286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rulenum7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulenum7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction7414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulefunction7466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction7485 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction7502 = new BitSet(new long[]{0x00000448000619F0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulefunction7523 = new BitSet(new long[]{0x00000458000619F0L});
    public static final BitSet FOLLOW_36_in_rulefunction7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor7583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleHexColor7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType7691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleURLType7742 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleURLType7754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURLType7771 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleURLType7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER7829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE7931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rulePERCENTAGE7989 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePERCENTAGE8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS8048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEMS8106 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEMS8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS8165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEXS8223 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEXS8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH8288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleLENGTH8350 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_46_in_ruleLENGTH8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLENGTH8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLENGTH8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLENGTH8426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLENGTH8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLENGTH8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleANGLE8568 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_52_in_ruleANGLE8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleANGLE8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleANGLE8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME8667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleTIME8725 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTIME8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTIME8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ8805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleFREQ8863 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_ruleFREQ8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFREQ8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM8943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORTANT_SYM8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIMPORTANT_SYM8991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_entryRuleReservedWords9031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedWords9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReservedWords9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReservedWords9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReservedWords9118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReservedWords9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReservedWords9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleReservedWords9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReservedWords9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReservedWords9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReservedWords9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleReservedWords9251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleReservedWords9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleReservedWords9289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReservedWords9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleReservedWords9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReservedWords9346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulecss_not9399 = new BitSet(new long[]{0x0000000000000002L});

}