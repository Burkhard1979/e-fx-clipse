package at.bestsolution.efxclipse.tooling.css.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_HASH", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_STRING", "RULE_COMMA", "RULE_INTEGER", "RULE_REAL", "RULE_WS", "RULE_ML_COMMENT", "'!important'", "'not('", "'@charset'", "'@CHARSET'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'@media'", "'@MEDIA'", "'*'", "'^='", "'$='", "'*='", "'='", "'+'", "'-'", "'>'", "'~'", "'/'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'em'", "'ex'", "';'", "'{'", "'}'", "':'", "'|'", "'.'", "'['", "']'", "')'", "'('", "'url'", "'%'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=6;
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
    public static final int RULE_REAL=11;
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
    public static final int RULE_COMMA=9;
    public static final int RULE_HASH=5;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_DASHMATCH=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_IDENT=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;
    public static final int RULE_INTEGER=10;

    // delegates
    // delegators


        public InternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g"; }


     
     	private CssDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CssDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:60:1: entryRulestylesheet : rulestylesheet EOF ;
    public final void entryRulestylesheet() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:61:1: ( rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:62:1: rulestylesheet EOF
            {
             before(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet61);
            rulestylesheet();

            state._fsp--;

             after(grammarAccess.getStylesheetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:69:1: rulestylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
    public final void rulestylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:73:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( rule__Stylesheet__Group__0 )
            {
             before(grammarAccess.getStylesheetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:76:1: ( rule__Stylesheet__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:76:2: rule__Stylesheet__Group__0
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet94);
            rule__Stylesheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStylesheetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulecharset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:88:1: entryRulecharset : rulecharset EOF ;
    public final void entryRulecharset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:89:1: ( rulecharset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:90:1: rulecharset EOF
            {
             before(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset121);
            rulecharset();

            state._fsp--;

             after(grammarAccess.getCharsetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecharset"


    // $ANTLR start "rulecharset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:97:1: rulecharset : ( ( rule__Charset__Group__0 ) ) ;
    public final void rulecharset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:101:2: ( ( ( rule__Charset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:102:1: ( ( rule__Charset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:102:1: ( ( rule__Charset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( rule__Charset__Group__0 )
            {
             before(grammarAccess.getCharsetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:104:1: ( rule__Charset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:104:2: rule__Charset__Group__0
            {
            pushFollow(FOLLOW_rule__Charset__Group__0_in_rulecharset154);
            rule__Charset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecharset"


    // $ANTLR start "entryRuleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:116:1: entryRuleimportExpression : ruleimportExpression EOF ;
    public final void entryRuleimportExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:117:1: ( ruleimportExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:118:1: ruleimportExpression EOF
            {
             before(grammarAccess.getImportExpressionRule()); 
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression181);
            ruleimportExpression();

            state._fsp--;

             after(grammarAccess.getImportExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleimportExpression"


    // $ANTLR start "ruleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:125:1: ruleimportExpression : ( ( rule__ImportExpression__Alternatives ) ) ;
    public final void ruleimportExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:129:2: ( ( ( rule__ImportExpression__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:130:1: ( ( rule__ImportExpression__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:130:1: ( ( rule__ImportExpression__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:131:1: ( rule__ImportExpression__Alternatives )
            {
             before(grammarAccess.getImportExpressionAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:132:1: ( rule__ImportExpression__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:132:2: rule__ImportExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ImportExpression__Alternatives_in_ruleimportExpression214);
            rule__ImportExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:144:1: entryRulepage : rulepage EOF ;
    public final void entryRulepage() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:145:1: ( rulepage EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:146:1: rulepage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulepage_in_entryRulepage241);
            rulepage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepage248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepage"


    // $ANTLR start "rulepage"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:153:1: rulepage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulepage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:157:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:158:1: ( ( rule__Page__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:158:1: ( ( rule__Page__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:159:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:160:1: ( rule__Page__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:160:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulepage274);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepage"


    // $ANTLR start "entryRulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:172:1: entryRulepseudo_page : rulepseudo_page EOF ;
    public final void entryRulepseudo_page() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:173:1: ( rulepseudo_page EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:174:1: rulepseudo_page EOF
            {
             before(grammarAccess.getPseudo_pageRule()); 
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page301);
            rulepseudo_page();

            state._fsp--;

             after(grammarAccess.getPseudo_pageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepseudo_page"


    // $ANTLR start "rulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:181:1: rulepseudo_page : ( ( rule__Pseudo_page__Group__0 ) ) ;
    public final void rulepseudo_page() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:185:2: ( ( ( rule__Pseudo_page__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:186:1: ( ( rule__Pseudo_page__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:186:1: ( ( rule__Pseudo_page__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:187:1: ( rule__Pseudo_page__Group__0 )
            {
             before(grammarAccess.getPseudo_pageAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:188:1: ( rule__Pseudo_page__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:188:2: rule__Pseudo_page__Group__0
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__0_in_rulepseudo_page334);
            rule__Pseudo_page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPseudo_pageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepseudo_page"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:200:1: entryRulemedia : rulemedia EOF ;
    public final void entryRulemedia() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:201:1: ( rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:202:1: rulemedia EOF
            {
             before(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia361);
            rulemedia();

            state._fsp--;

             after(grammarAccess.getMediaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemedia"


    // $ANTLR start "rulemedia"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:209:1: rulemedia : ( ( rule__Media__Group__0 ) ) ;
    public final void rulemedia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:213:2: ( ( ( rule__Media__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:214:1: ( ( rule__Media__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:214:1: ( ( rule__Media__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:215:1: ( rule__Media__Group__0 )
            {
             before(grammarAccess.getMediaAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:216:1: ( rule__Media__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:216:2: rule__Media__Group__0
            {
            pushFollow(FOLLOW_rule__Media__Group__0_in_rulemedia394);
            rule__Media__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemedia"


    // $ANTLR start "entryRulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:228:1: entryRulemedia_list : rulemedia_list EOF ;
    public final void entryRulemedia_list() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:229:1: ( rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:230:1: rulemedia_list EOF
            {
             before(grammarAccess.getMedia_listRule()); 
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list421);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getMedia_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemedia_list"


    // $ANTLR start "rulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:237:1: rulemedia_list : ( ( rule__Media_list__Group__0 ) ) ;
    public final void rulemedia_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:241:2: ( ( ( rule__Media_list__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:242:1: ( ( rule__Media_list__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:242:1: ( ( rule__Media_list__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:243:1: ( rule__Media_list__Group__0 )
            {
             before(grammarAccess.getMedia_listAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:244:1: ( rule__Media_list__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:244:2: rule__Media_list__Group__0
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0_in_rulemedia_list454);
            rule__Media_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMedia_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemedia_list"


    // $ANTLR start "entryRulemedium"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:256:1: entryRulemedium : rulemedium EOF ;
    public final void entryRulemedium() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:257:1: ( rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:258:1: rulemedium EOF
            {
             before(grammarAccess.getMediumRule()); 
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium481);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMediumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemedium"


    // $ANTLR start "rulemedium"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:265:1: rulemedium : ( RULE_IDENT ) ;
    public final void rulemedium() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:269:2: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:270:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:270:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:271:1: RULE_IDENT
            {
             before(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium514); 
             after(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemedium"


    // $ANTLR start "entryRuleruleset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:284:1: entryRuleruleset : ruleruleset EOF ;
    public final void entryRuleruleset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:285:1: ( ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:286:1: ruleruleset EOF
            {
             before(grammarAccess.getRulesetRule()); 
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset540);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getRulesetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleruleset"


    // $ANTLR start "ruleruleset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:293:1: ruleruleset : ( ( rule__Ruleset__Group__0 ) ) ;
    public final void ruleruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:297:2: ( ( ( rule__Ruleset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:298:1: ( ( rule__Ruleset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:298:1: ( ( rule__Ruleset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:299:1: ( rule__Ruleset__Group__0 )
            {
             before(grammarAccess.getRulesetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:300:1: ( rule__Ruleset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:300:2: rule__Ruleset__Group__0
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0_in_ruleruleset573);
            rule__Ruleset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleruleset"


    // $ANTLR start "entryRuleselector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:312:1: entryRuleselector : ruleselector EOF ;
    public final void entryRuleselector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:316:1: ( ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:317:1: ruleselector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector605);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector612); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:327:1: ruleselector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleselector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:332:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:333:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:333:1: ( ( rule__Selector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:334:1: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:1: ( rule__Selector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleselector642);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:348:1: entryRulesimple_selector : rulesimple_selector EOF ;
    public final void entryRulesimple_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:349:1: ( rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:350:1: rulesimple_selector EOF
            {
             before(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector669);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector676); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:357:1: rulesimple_selector : ( ( rule__Simple_selector__Alternatives ) ) ;
    public final void rulesimple_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:361:2: ( ( ( rule__Simple_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:362:1: ( ( rule__Simple_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:362:1: ( ( rule__Simple_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:363:1: ( rule__Simple_selector__Alternatives )
            {
             before(grammarAccess.getSimple_selectorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:364:1: ( rule__Simple_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:364:2: rule__Simple_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector702);
            rule__Simple_selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_selectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRuleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:376:1: entryRuleelement_name : ruleelement_name EOF ;
    public final void entryRuleelement_name() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:377:1: ( ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:378:1: ruleelement_name EOF
            {
             before(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name729);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getElement_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name736); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelement_name"


    // $ANTLR start "ruleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:385:1: ruleelement_name : ( ( rule__Element_name__Alternatives ) ) ;
    public final void ruleelement_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:389:2: ( ( ( rule__Element_name__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:390:1: ( ( rule__Element_name__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:390:1: ( ( rule__Element_name__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: ( rule__Element_name__Alternatives )
            {
             before(grammarAccess.getElement_nameAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:392:1: ( rule__Element_name__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:392:2: rule__Element_name__Alternatives
            {
            pushFollow(FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name762);
            rule__Element_name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElement_nameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelement_name"


    // $ANTLR start "entryRulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:404:1: entryRulesub_selector : rulesub_selector EOF ;
    public final void entryRulesub_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:405:1: ( rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:406:1: rulesub_selector EOF
            {
             before(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector789);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSub_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector796); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesub_selector"


    // $ANTLR start "rulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:413:1: rulesub_selector : ( ( rule__Sub_selector__Alternatives ) ) ;
    public final void rulesub_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:417:2: ( ( ( rule__Sub_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:418:1: ( ( rule__Sub_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:418:1: ( ( rule__Sub_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:419:1: ( rule__Sub_selector__Alternatives )
            {
             before(grammarAccess.getSub_selectorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:420:1: ( rule__Sub_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:420:2: rule__Sub_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Sub_selector__Alternatives_in_rulesub_selector822);
            rule__Sub_selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSub_selectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesub_selector"


    // $ANTLR start "entryRulecss_type_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:432:1: entryRulecss_type_selector : rulecss_type_selector EOF ;
    public final void entryRulecss_type_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:433:1: ( rulecss_type_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:434:1: rulecss_type_selector EOF
            {
             before(grammarAccess.getCss_type_selectorRule()); 
            pushFollow(FOLLOW_rulecss_type_selector_in_entryRulecss_type_selector849);
            rulecss_type_selector();

            state._fsp--;

             after(grammarAccess.getCss_type_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_type_selector856); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_type_selector"


    // $ANTLR start "rulecss_type_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:441:1: rulecss_type_selector : ( ( rule__Css_type_selector__Group__0 ) ) ;
    public final void rulecss_type_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:445:2: ( ( ( rule__Css_type_selector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:446:1: ( ( rule__Css_type_selector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:446:1: ( ( rule__Css_type_selector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:447:1: ( rule__Css_type_selector__Group__0 )
            {
             before(grammarAccess.getCss_type_selectorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:448:1: ( rule__Css_type_selector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:448:2: rule__Css_type_selector__Group__0
            {
            pushFollow(FOLLOW_rule__Css_type_selector__Group__0_in_rulecss_type_selector882);
            rule__Css_type_selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_type_selectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_type_selector"


    // $ANTLR start "entryRulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:460:1: entryRulecss_namespace_prefix : rulecss_namespace_prefix EOF ;
    public final void entryRulecss_namespace_prefix() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:461:1: ( rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:462:1: rulecss_namespace_prefix EOF
            {
             before(grammarAccess.getCss_namespace_prefixRule()); 
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix909);
            rulecss_namespace_prefix();

            state._fsp--;

             after(grammarAccess.getCss_namespace_prefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix916); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_namespace_prefix"


    // $ANTLR start "rulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:469:1: rulecss_namespace_prefix : ( ( rule__Css_namespace_prefix__Group__0 ) ) ;
    public final void rulecss_namespace_prefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:473:2: ( ( ( rule__Css_namespace_prefix__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:474:1: ( ( rule__Css_namespace_prefix__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:474:1: ( ( rule__Css_namespace_prefix__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:475:1: ( rule__Css_namespace_prefix__Group__0 )
            {
             before(grammarAccess.getCss_namespace_prefixAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:476:1: ( rule__Css_namespace_prefix__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:476:2: rule__Css_namespace_prefix__Group__0
            {
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__0_in_rulecss_namespace_prefix942);
            rule__Css_namespace_prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_namespace_prefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_namespace_prefix"


    // $ANTLR start "entryRulecss_universal"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:488:1: entryRulecss_universal : rulecss_universal EOF ;
    public final void entryRulecss_universal() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:489:1: ( rulecss_universal EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:490:1: rulecss_universal EOF
            {
             before(grammarAccess.getCss_universalRule()); 
            pushFollow(FOLLOW_rulecss_universal_in_entryRulecss_universal969);
            rulecss_universal();

            state._fsp--;

             after(grammarAccess.getCss_universalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_universal976); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_universal"


    // $ANTLR start "rulecss_universal"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:497:1: rulecss_universal : ( ( rule__Css_universal__Group__0 ) ) ;
    public final void rulecss_universal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:501:2: ( ( ( rule__Css_universal__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:502:1: ( ( rule__Css_universal__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:502:1: ( ( rule__Css_universal__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:503:1: ( rule__Css_universal__Group__0 )
            {
             before(grammarAccess.getCss_universalAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:504:1: ( rule__Css_universal__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:504:2: rule__Css_universal__Group__0
            {
            pushFollow(FOLLOW_rule__Css_universal__Group__0_in_rulecss_universal1002);
            rule__Css_universal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_universalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_universal"


    // $ANTLR start "entryRulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:516:1: entryRulecss_class : rulecss_class EOF ;
    public final void entryRulecss_class() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:517:1: ( rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:518:1: rulecss_class EOF
            {
             before(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class1029);
            rulecss_class();

            state._fsp--;

             after(grammarAccess.getCss_classRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class1036); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_class"


    // $ANTLR start "rulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:525:1: rulecss_class : ( ( rule__Css_class__Group__0 ) ) ;
    public final void rulecss_class() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:529:2: ( ( ( rule__Css_class__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:530:1: ( ( rule__Css_class__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:530:1: ( ( rule__Css_class__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:531:1: ( rule__Css_class__Group__0 )
            {
             before(grammarAccess.getCss_classAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:532:1: ( rule__Css_class__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:532:2: rule__Css_class__Group__0
            {
            pushFollow(FOLLOW_rule__Css_class__Group__0_in_rulecss_class1062);
            rule__Css_class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_classAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_class"


    // $ANTLR start "entryRulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:544:1: entryRulecss_id : rulecss_id EOF ;
    public final void entryRulecss_id() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:545:1: ( rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:546:1: rulecss_id EOF
            {
             before(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id1089);
            rulecss_id();

            state._fsp--;

             after(grammarAccess.getCss_idRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id1096); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_id"


    // $ANTLR start "rulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:553:1: rulecss_id : ( RULE_HASH ) ;
    public final void rulecss_id() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:557:2: ( ( RULE_HASH ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:558:1: ( RULE_HASH )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:558:1: ( RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:559:1: RULE_HASH
            {
             before(grammarAccess.getCss_idAccess().getHASHTerminalRuleCall()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_id1122); 
             after(grammarAccess.getCss_idAccess().getHASHTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_id"


    // $ANTLR start "entryRulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:572:1: entryRulecss_attrib : rulecss_attrib EOF ;
    public final void entryRulecss_attrib() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:573:1: ( rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:574:1: rulecss_attrib EOF
            {
             before(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib1148);
            rulecss_attrib();

            state._fsp--;

             after(grammarAccess.getCss_attribRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib1155); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_attrib"


    // $ANTLR start "rulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:581:1: rulecss_attrib : ( ( rule__Css_attrib__Group__0 ) ) ;
    public final void rulecss_attrib() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:585:2: ( ( ( rule__Css_attrib__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:586:1: ( ( rule__Css_attrib__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:586:1: ( ( rule__Css_attrib__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:587:1: ( rule__Css_attrib__Group__0 )
            {
             before(grammarAccess.getCss_attribAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:588:1: ( rule__Css_attrib__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:588:2: rule__Css_attrib__Group__0
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__0_in_rulecss_attrib1181);
            rule__Css_attrib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_attrib"


    // $ANTLR start "entryRulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:600:1: entryRulecss_declaration : rulecss_declaration EOF ;
    public final void entryRulecss_declaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:601:1: ( rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:602:1: rulecss_declaration EOF
            {
             before(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration1208);
            rulecss_declaration();

            state._fsp--;

             after(grammarAccess.getCss_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration1215); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_declaration"


    // $ANTLR start "rulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:609:1: rulecss_declaration : ( rulecss_generic_declaration ) ;
    public final void rulecss_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:613:2: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:614:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:614:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:615:1: rulecss_generic_declaration
            {
             before(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1241);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_declaration"


    // $ANTLR start "entryRulecss_generic_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:628:1: entryRulecss_generic_declaration : rulecss_generic_declaration EOF ;
    public final void entryRulecss_generic_declaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:629:1: ( rulecss_generic_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:630:1: rulecss_generic_declaration EOF
            {
             before(grammarAccess.getCss_generic_declarationRule()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration1267);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_generic_declaration1274); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_generic_declaration"


    // $ANTLR start "rulecss_generic_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:637:1: rulecss_generic_declaration : ( ( rule__Css_generic_declaration__Group__0 ) ) ;
    public final void rulecss_generic_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:641:2: ( ( ( rule__Css_generic_declaration__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:642:1: ( ( rule__Css_generic_declaration__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:642:1: ( ( rule__Css_generic_declaration__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:643:1: ( rule__Css_generic_declaration__Group__0 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:644:1: ( rule__Css_generic_declaration__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:644:2: rule__Css_generic_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__0_in_rulecss_generic_declaration1300);
            rule__Css_generic_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_generic_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_generic_declaration"


    // $ANTLR start "entryRulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:656:1: entryRulecss_prio : rulecss_prio EOF ;
    public final void entryRulecss_prio() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:657:1: ( rulecss_prio EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:658:1: rulecss_prio EOF
            {
             before(grammarAccess.getCss_prioRule()); 
            pushFollow(FOLLOW_rulecss_prio_in_entryRulecss_prio1327);
            rulecss_prio();

            state._fsp--;

             after(grammarAccess.getCss_prioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_prio1334); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_prio"


    // $ANTLR start "rulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:665:1: rulecss_prio : ( ruleIMPORTANT_SYM ) ;
    public final void rulecss_prio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:669:2: ( ( ruleIMPORTANT_SYM ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:670:1: ( ruleIMPORTANT_SYM )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:670:1: ( ruleIMPORTANT_SYM )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:671:1: ruleIMPORTANT_SYM
            {
             before(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio1360);
            ruleIMPORTANT_SYM();

            state._fsp--;

             after(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_prio"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:684:1: entryRulecss_property : rulecss_property EOF ;
    public final void entryRulecss_property() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:685:1: ( rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:686:1: rulecss_property EOF
            {
             before(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property1386);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getCss_propertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property1393); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_property"


    // $ANTLR start "rulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:693:1: rulecss_property : ( ( rule__Css_property__Group__0 ) ) ;
    public final void rulecss_property() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:697:2: ( ( ( rule__Css_property__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:698:1: ( ( rule__Css_property__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:698:1: ( ( rule__Css_property__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:699:1: ( rule__Css_property__Group__0 )
            {
             before(grammarAccess.getCss_propertyAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:700:1: ( rule__Css_property__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:700:2: rule__Css_property__Group__0
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0_in_rulecss_property1419);
            rule__Css_property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_propertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_property"


    // $ANTLR start "entryRulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:712:1: entryRulecss_pseudo : rulecss_pseudo EOF ;
    public final void entryRulecss_pseudo() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:713:1: ( rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:714:1: rulecss_pseudo EOF
            {
             before(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo1446);
            rulecss_pseudo();

            state._fsp--;

             after(grammarAccess.getCss_pseudoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo1453); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_pseudo"


    // $ANTLR start "rulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:721:1: rulecss_pseudo : ( ( rule__Css_pseudo__Group__0 ) ) ;
    public final void rulecss_pseudo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:725:2: ( ( ( rule__Css_pseudo__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:726:1: ( ( rule__Css_pseudo__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:726:1: ( ( rule__Css_pseudo__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:727:1: ( rule__Css_pseudo__Group__0 )
            {
             before(grammarAccess.getCss_pseudoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:728:1: ( rule__Css_pseudo__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:728:2: rule__Css_pseudo__Group__0
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__0_in_rulecss_pseudo1479);
            rule__Css_pseudo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_pseudoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_pseudo"


    // $ANTLR start "entryRulecss_negation"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:740:1: entryRulecss_negation : rulecss_negation EOF ;
    public final void entryRulecss_negation() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:741:1: ( rulecss_negation EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:742:1: rulecss_negation EOF
            {
             before(grammarAccess.getCss_negationRule()); 
            pushFollow(FOLLOW_rulecss_negation_in_entryRulecss_negation1506);
            rulecss_negation();

            state._fsp--;

             after(grammarAccess.getCss_negationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_negation1513); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_negation"


    // $ANTLR start "rulecss_negation"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:749:1: rulecss_negation : ( ( rule__Css_negation__Group__0 ) ) ;
    public final void rulecss_negation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:753:2: ( ( ( rule__Css_negation__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:754:1: ( ( rule__Css_negation__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:754:1: ( ( rule__Css_negation__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:755:1: ( rule__Css_negation__Group__0 )
            {
             before(grammarAccess.getCss_negationAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:756:1: ( rule__Css_negation__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:756:2: rule__Css_negation__Group__0
            {
            pushFollow(FOLLOW_rule__Css_negation__Group__0_in_rulecss_negation1539);
            rule__Css_negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_negationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_negation"


    // $ANTLR start "entryRulecss_negation_arg"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:768:1: entryRulecss_negation_arg : rulecss_negation_arg EOF ;
    public final void entryRulecss_negation_arg() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:769:1: ( rulecss_negation_arg EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:770:1: rulecss_negation_arg EOF
            {
             before(grammarAccess.getCss_negation_argRule()); 
            pushFollow(FOLLOW_rulecss_negation_arg_in_entryRulecss_negation_arg1566);
            rulecss_negation_arg();

            state._fsp--;

             after(grammarAccess.getCss_negation_argRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_negation_arg1573); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_negation_arg"


    // $ANTLR start "rulecss_negation_arg"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:777:1: rulecss_negation_arg : ( ( rule__Css_negation_arg__Alternatives ) ) ;
    public final void rulecss_negation_arg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:781:2: ( ( ( rule__Css_negation_arg__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:782:1: ( ( rule__Css_negation_arg__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:782:1: ( ( rule__Css_negation_arg__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:783:1: ( rule__Css_negation_arg__Alternatives )
            {
             before(grammarAccess.getCss_negation_argAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:784:1: ( rule__Css_negation_arg__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:784:2: rule__Css_negation_arg__Alternatives
            {
            pushFollow(FOLLOW_rule__Css_negation_arg__Alternatives_in_rulecss_negation_arg1599);
            rule__Css_negation_arg__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCss_negation_argAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_negation_arg"


    // $ANTLR start "entryRulefunctional_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:796:1: entryRulefunctional_pseudo : rulefunctional_pseudo EOF ;
    public final void entryRulefunctional_pseudo() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:797:1: ( rulefunctional_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:798:1: rulefunctional_pseudo EOF
            {
             before(grammarAccess.getFunctional_pseudoRule()); 
            pushFollow(FOLLOW_rulefunctional_pseudo_in_entryRulefunctional_pseudo1626);
            rulefunctional_pseudo();

            state._fsp--;

             after(grammarAccess.getFunctional_pseudoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctional_pseudo1633); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunctional_pseudo"


    // $ANTLR start "rulefunctional_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:805:1: rulefunctional_pseudo : ( ( rule__Functional_pseudo__Group__0 ) ) ;
    public final void rulefunctional_pseudo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:809:2: ( ( ( rule__Functional_pseudo__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:810:1: ( ( rule__Functional_pseudo__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:810:1: ( ( rule__Functional_pseudo__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:811:1: ( rule__Functional_pseudo__Group__0 )
            {
             before(grammarAccess.getFunctional_pseudoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:812:1: ( rule__Functional_pseudo__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:812:2: rule__Functional_pseudo__Group__0
            {
            pushFollow(FOLLOW_rule__Functional_pseudo__Group__0_in_rulefunctional_pseudo1659);
            rule__Functional_pseudo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctional_pseudoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunctional_pseudo"


    // $ANTLR start "entryRulefunction_expr"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:824:1: entryRulefunction_expr : rulefunction_expr EOF ;
    public final void entryRulefunction_expr() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:825:1: ( rulefunction_expr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:826:1: rulefunction_expr EOF
            {
             before(grammarAccess.getFunction_exprRule()); 
            pushFollow(FOLLOW_rulefunction_expr_in_entryRulefunction_expr1686);
            rulefunction_expr();

            state._fsp--;

             after(grammarAccess.getFunction_exprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_expr1693); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction_expr"


    // $ANTLR start "rulefunction_expr"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:833:1: rulefunction_expr : ( ( ( rule__Function_expr__Alternatives ) ) ( ( rule__Function_expr__Alternatives )* ) ) ;
    public final void rulefunction_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:837:2: ( ( ( ( rule__Function_expr__Alternatives ) ) ( ( rule__Function_expr__Alternatives )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:838:1: ( ( ( rule__Function_expr__Alternatives ) ) ( ( rule__Function_expr__Alternatives )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:838:1: ( ( ( rule__Function_expr__Alternatives ) ) ( ( rule__Function_expr__Alternatives )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:839:1: ( ( rule__Function_expr__Alternatives ) ) ( ( rule__Function_expr__Alternatives )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:839:1: ( ( rule__Function_expr__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:840:1: ( rule__Function_expr__Alternatives )
            {
             before(grammarAccess.getFunction_exprAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:841:1: ( rule__Function_expr__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:841:2: rule__Function_expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Function_expr__Alternatives_in_rulefunction_expr1721);
            rule__Function_expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunction_exprAccess().getAlternatives()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:844:1: ( ( rule__Function_expr__Alternatives )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:845:1: ( rule__Function_expr__Alternatives )*
            {
             before(grammarAccess.getFunction_exprAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:846:1: ( rule__Function_expr__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENT||LA1_0==RULE_STRING||(LA1_0>=RULE_INTEGER && LA1_0<=RULE_REAL)||(LA1_0>=29 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:846:2: rule__Function_expr__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Function_expr__Alternatives_in_rulefunction_expr1733);
            	    rule__Function_expr__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFunction_exprAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_expr"


    // $ANTLR start "entryRuleDIMENSION"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:859:1: entryRuleDIMENSION : ruleDIMENSION EOF ;
    public final void entryRuleDIMENSION() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:860:1: ( ruleDIMENSION EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:861:1: ruleDIMENSION EOF
            {
             before(grammarAccess.getDIMENSIONRule()); 
            pushFollow(FOLLOW_ruleDIMENSION_in_entryRuleDIMENSION1763);
            ruleDIMENSION();

            state._fsp--;

             after(grammarAccess.getDIMENSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIMENSION1770); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDIMENSION"


    // $ANTLR start "ruleDIMENSION"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:868:1: ruleDIMENSION : ( ( rule__DIMENSION__Alternatives ) ) ;
    public final void ruleDIMENSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:872:2: ( ( ( rule__DIMENSION__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:873:1: ( ( rule__DIMENSION__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:873:1: ( ( rule__DIMENSION__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:874:1: ( rule__DIMENSION__Alternatives )
            {
             before(grammarAccess.getDIMENSIONAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:875:1: ( rule__DIMENSION__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:875:2: rule__DIMENSION__Alternatives
            {
            pushFollow(FOLLOW_rule__DIMENSION__Alternatives_in_ruleDIMENSION1796);
            rule__DIMENSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDIMENSIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDIMENSION"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:887:1: entryRulecombinator : rulecombinator EOF ;
    public final void entryRulecombinator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:888:1: ( rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:889:1: rulecombinator EOF
            {
             before(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator1823);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getCombinatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator1830); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:896:1: rulecombinator : ( ( rule__Combinator__Group__0 ) ) ;
    public final void rulecombinator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:900:2: ( ( ( rule__Combinator__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:901:1: ( ( rule__Combinator__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:901:1: ( ( rule__Combinator__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:902:1: ( rule__Combinator__Group__0 )
            {
             before(grammarAccess.getCombinatorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:903:1: ( rule__Combinator__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:903:2: rule__Combinator__Group__0
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0_in_rulecombinator1856);
            rule__Combinator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCombinatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleoperator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:915:1: entryRuleoperator : ruleoperator EOF ;
    public final void entryRuleoperator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:916:1: ( ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:917:1: ruleoperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator1883);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator1890); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:924:1: ruleoperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleoperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:928:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:929:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:929:1: ( ( rule__Operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:930:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:931:1: ( rule__Operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:931:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleoperator1916);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRuleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:943:1: entryRuleunary_operator : ruleunary_operator EOF ;
    public final void entryRuleunary_operator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:944:1: ( ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:945:1: ruleunary_operator EOF
            {
             before(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator1943);
            ruleunary_operator();

            state._fsp--;

             after(grammarAccess.getUnary_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator1950); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:952:1: ruleunary_operator : ( ( rule__Unary_operator__Alternatives ) ) ;
    public final void ruleunary_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:956:2: ( ( ( rule__Unary_operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:957:1: ( ( rule__Unary_operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:957:1: ( ( rule__Unary_operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:958:1: ( rule__Unary_operator__Alternatives )
            {
             before(grammarAccess.getUnary_operatorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:959:1: ( rule__Unary_operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:959:2: rule__Unary_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1976);
            rule__Unary_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnary_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRuleexpr"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:971:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:975:1: ( ruleexpr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:976:1: ruleexpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2008);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2015); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:986:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:991:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:992:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:992:1: ( ( rule__Expr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:993:1: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:994:1: ( rule__Expr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:994:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleexpr2045);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1007:1: entryRuletermGroup : ruletermGroup EOF ;
    public final void entryRuletermGroup() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1008:1: ( ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1009:1: ruletermGroup EOF
            {
             before(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup2072);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getTermGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup2079); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletermGroup"


    // $ANTLR start "ruletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1016:1: ruletermGroup : ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) ) ;
    public final void ruletermGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1020:2: ( ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1021:1: ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1021:1: ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1022:1: ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1022:1: ( ( rule__TermGroup__TermsAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1023:1: ( rule__TermGroup__TermsAssignment )
            {
             before(grammarAccess.getTermGroupAccess().getTermsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1024:1: ( rule__TermGroup__TermsAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1024:2: rule__TermGroup__TermsAssignment
            {
            pushFollow(FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup2107);
            rule__TermGroup__TermsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermGroupAccess().getTermsAssignment()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1027:1: ( ( rule__TermGroup__TermsAssignment )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1028:1: ( rule__TermGroup__TermsAssignment )*
            {
             before(grammarAccess.getTermGroupAccess().getTermsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1029:1: ( rule__TermGroup__TermsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_IDENT && LA2_0<=RULE_HASH)||LA2_0==RULE_STRING||(LA2_0>=RULE_INTEGER && LA2_0<=RULE_REAL)||(LA2_0>=29 && LA2_0<=30)||LA2_0==59) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1029:2: rule__TermGroup__TermsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup2119);
            	    rule__TermGroup__TermsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTermGroupAccess().getTermsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletermGroup"


    // $ANTLR start "entryRuleterm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1042:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1043:1: ( ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1044:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2149);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2156); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1051:1: ruleterm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1055:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1056:1: ( ( rule__Term__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1056:1: ( ( rule__Term__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1057:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1058:1: ( rule__Term__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1058:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleterm2182);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1070:1: entryRulenumberTerm : rulenumberTerm EOF ;
    public final void entryRulenumberTerm() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1074:1: ( rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1075:1: rulenumberTerm EOF
            {
             before(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm2214);
            rulenumberTerm();

            state._fsp--;

             after(grammarAccess.getNumberTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm2221); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulenumberTerm"


    // $ANTLR start "rulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1085:1: rulenumberTerm : ( ( rule__NumberTerm__Group__0 ) ) ;
    public final void rulenumberTerm() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1090:2: ( ( ( rule__NumberTerm__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1091:1: ( ( rule__NumberTerm__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1091:1: ( ( rule__NumberTerm__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1092:1: ( rule__NumberTerm__Group__0 )
            {
             before(grammarAccess.getNumberTermAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1093:1: ( rule__NumberTerm__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1093:2: rule__NumberTerm__Group__0
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__0_in_rulenumberTerm2251);
            rule__NumberTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulenumberTerm"


    // $ANTLR start "entryRulenum"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1106:1: entryRulenum : rulenum EOF ;
    public final void entryRulenum() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1107:1: ( rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1108:1: rulenum EOF
            {
             before(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum2278);
            rulenum();

            state._fsp--;

             after(grammarAccess.getNumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum2285); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenum"


    // $ANTLR start "rulenum"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1115:1: rulenum : ( ( rule__Num__Alternatives ) ) ;
    public final void rulenum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1119:2: ( ( ( rule__Num__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1120:1: ( ( rule__Num__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1120:1: ( ( rule__Num__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1121:1: ( rule__Num__Alternatives )
            {
             before(grammarAccess.getNumAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1122:1: ( rule__Num__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1122:2: rule__Num__Alternatives
            {
            pushFollow(FOLLOW_rule__Num__Alternatives_in_rulenum2311);
            rule__Num__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenum"


    // $ANTLR start "entryRulefunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1134:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1138:1: ( rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1139:1: rulefunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction2343);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction2350); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1149:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1154:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1155:1: ( ( rule__Function__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1155:1: ( ( rule__Function__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1156:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1157:1: ( rule__Function__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1157:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction2380);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1170:1: entryRuleHexColor : ruleHexColor EOF ;
    public final void entryRuleHexColor() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1174:1: ( ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1175:1: ruleHexColor EOF
            {
             before(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor2412);
            ruleHexColor();

            state._fsp--;

             after(grammarAccess.getHexColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor2419); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1185:1: ruleHexColor : ( RULE_HASH ) ;
    public final void ruleHexColor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1190:2: ( ( RULE_HASH ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1191:1: ( RULE_HASH )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1191:1: ( RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1192:1: RULE_HASH
            {
             before(grammarAccess.getHexColorAccess().getHASHTerminalRuleCall()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleHexColor2449); 
             after(grammarAccess.getHexColorAccess().getHASHTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1206:1: entryRuleURLType : ruleURLType EOF ;
    public final void entryRuleURLType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1210:1: ( ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1211:1: ruleURLType EOF
            {
             before(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType2480);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getURLTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType2487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1221:1: ruleURLType : ( ( rule__URLType__Group__0 ) ) ;
    public final void ruleURLType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1226:2: ( ( ( rule__URLType__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1227:1: ( ( rule__URLType__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1227:1: ( ( rule__URLType__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1228:1: ( rule__URLType__Group__0 )
            {
             before(grammarAccess.getURLTypeAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1229:1: ( rule__URLType__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1229:2: rule__URLType__Group__0
            {
            pushFollow(FOLLOW_rule__URLType__Group__0_in_ruleURLType2517);
            rule__URLType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURLTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1242:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1243:1: ( ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1244:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER2544);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER2551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1251:1: ruleNUMBER : ( rulenum ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1255:2: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1256:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1256:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1257:1: rulenum
            {
             before(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER2577);
            rulenum();

            state._fsp--;

             after(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1270:1: entryRulePERCENTAGE : rulePERCENTAGE EOF ;
    public final void entryRulePERCENTAGE() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1271:1: ( rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1272:1: rulePERCENTAGE EOF
            {
             before(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE2603);
            rulePERCENTAGE();

            state._fsp--;

             after(grammarAccess.getPERCENTAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE2610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePERCENTAGE"


    // $ANTLR start "rulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1279:1: rulePERCENTAGE : ( ( rule__PERCENTAGE__Group__0 ) ) ;
    public final void rulePERCENTAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1283:2: ( ( ( rule__PERCENTAGE__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1284:1: ( ( rule__PERCENTAGE__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1284:1: ( ( rule__PERCENTAGE__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1285:1: ( rule__PERCENTAGE__Group__0 )
            {
             before(grammarAccess.getPERCENTAGEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1286:1: ( rule__PERCENTAGE__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1286:2: rule__PERCENTAGE__Group__0
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE2636);
            rule__PERCENTAGE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPERCENTAGEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePERCENTAGE"


    // $ANTLR start "entryRuleEMS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1298:1: entryRuleEMS : ruleEMS EOF ;
    public final void entryRuleEMS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1299:1: ( ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1300:1: ruleEMS EOF
            {
             before(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS2663);
            ruleEMS();

            state._fsp--;

             after(grammarAccess.getEMSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS2670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEMS"


    // $ANTLR start "ruleEMS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1307:1: ruleEMS : ( ( rule__EMS__Group__0 ) ) ;
    public final void ruleEMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1311:2: ( ( ( rule__EMS__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:1: ( ( rule__EMS__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:1: ( ( rule__EMS__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1313:1: ( rule__EMS__Group__0 )
            {
             before(grammarAccess.getEMSAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1314:1: ( rule__EMS__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1314:2: rule__EMS__Group__0
            {
            pushFollow(FOLLOW_rule__EMS__Group__0_in_ruleEMS2696);
            rule__EMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEMSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEMS"


    // $ANTLR start "entryRuleEXS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1326:1: entryRuleEXS : ruleEXS EOF ;
    public final void entryRuleEXS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1327:1: ( ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1328:1: ruleEXS EOF
            {
             before(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS2723);
            ruleEXS();

            state._fsp--;

             after(grammarAccess.getEXSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS2730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXS"


    // $ANTLR start "ruleEXS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1335:1: ruleEXS : ( ( rule__EXS__Group__0 ) ) ;
    public final void ruleEXS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1339:2: ( ( ( rule__EXS__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1340:1: ( ( rule__EXS__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1340:1: ( ( rule__EXS__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1341:1: ( rule__EXS__Group__0 )
            {
             before(grammarAccess.getEXSAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1342:1: ( rule__EXS__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1342:2: rule__EXS__Group__0
            {
            pushFollow(FOLLOW_rule__EXS__Group__0_in_ruleEXS2756);
            rule__EXS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEXSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXS"


    // $ANTLR start "entryRuleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1354:1: entryRuleLENGTH : ruleLENGTH EOF ;
    public final void entryRuleLENGTH() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1358:1: ( ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1359:1: ruleLENGTH EOF
            {
             before(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH2788);
            ruleLENGTH();

            state._fsp--;

             after(grammarAccess.getLENGTHRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH2795); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLENGTH"


    // $ANTLR start "ruleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1369:1: ruleLENGTH : ( ( rule__LENGTH__Group__0 ) ) ;
    public final void ruleLENGTH() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1374:2: ( ( ( rule__LENGTH__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1375:1: ( ( rule__LENGTH__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1375:1: ( ( rule__LENGTH__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1376:1: ( rule__LENGTH__Group__0 )
            {
             before(grammarAccess.getLENGTHAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1377:1: ( rule__LENGTH__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1377:2: rule__LENGTH__Group__0
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH2825);
            rule__LENGTH__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLENGTHAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLENGTH"


    // $ANTLR start "entryRuleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1390:1: entryRuleANGLE : ruleANGLE EOF ;
    public final void entryRuleANGLE() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1391:1: ( ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1392:1: ruleANGLE EOF
            {
             before(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE2852);
            ruleANGLE();

            state._fsp--;

             after(grammarAccess.getANGLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE2859); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleANGLE"


    // $ANTLR start "ruleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1399:1: ruleANGLE : ( ( rule__ANGLE__Group__0 ) ) ;
    public final void ruleANGLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1403:2: ( ( ( rule__ANGLE__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1404:1: ( ( rule__ANGLE__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1404:1: ( ( rule__ANGLE__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1405:1: ( rule__ANGLE__Group__0 )
            {
             before(grammarAccess.getANGLEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1406:1: ( rule__ANGLE__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1406:2: rule__ANGLE__Group__0
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE2885);
            rule__ANGLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANGLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANGLE"


    // $ANTLR start "entryRuleTIME"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1418:1: entryRuleTIME : ruleTIME EOF ;
    public final void entryRuleTIME() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1419:1: ( ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1420:1: ruleTIME EOF
            {
             before(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME2912);
            ruleTIME();

            state._fsp--;

             after(grammarAccess.getTIMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME2919); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1427:1: ruleTIME : ( ( rule__TIME__Group__0 ) ) ;
    public final void ruleTIME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1431:2: ( ( ( rule__TIME__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1432:1: ( ( rule__TIME__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1432:1: ( ( rule__TIME__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1433:1: ( rule__TIME__Group__0 )
            {
             before(grammarAccess.getTIMEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1434:1: ( rule__TIME__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1434:2: rule__TIME__Group__0
            {
            pushFollow(FOLLOW_rule__TIME__Group__0_in_ruleTIME2945);
            rule__TIME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1446:1: entryRuleFREQ : ruleFREQ EOF ;
    public final void entryRuleFREQ() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1447:1: ( ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1448:1: ruleFREQ EOF
            {
             before(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ2972);
            ruleFREQ();

            state._fsp--;

             after(grammarAccess.getFREQRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ2979); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFREQ"


    // $ANTLR start "ruleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1455:1: ruleFREQ : ( ( rule__FREQ__Group__0 ) ) ;
    public final void ruleFREQ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1459:2: ( ( ( rule__FREQ__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1460:1: ( ( rule__FREQ__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1460:1: ( ( rule__FREQ__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1461:1: ( rule__FREQ__Group__0 )
            {
             before(grammarAccess.getFREQAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1462:1: ( rule__FREQ__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1462:2: rule__FREQ__Group__0
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0_in_ruleFREQ3005);
            rule__FREQ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFREQAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFREQ"


    // $ANTLR start "entryRuleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1474:1: entryRuleIMPORTANT_SYM : ruleIMPORTANT_SYM EOF ;
    public final void entryRuleIMPORTANT_SYM() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1475:1: ( ruleIMPORTANT_SYM EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1476:1: ruleIMPORTANT_SYM EOF
            {
             before(grammarAccess.getIMPORTANT_SYMRule()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM3032);
            ruleIMPORTANT_SYM();

            state._fsp--;

             after(grammarAccess.getIMPORTANT_SYMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORTANT_SYM3039); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIMPORTANT_SYM"


    // $ANTLR start "ruleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1483:1: ruleIMPORTANT_SYM : ( '!important' ) ;
    public final void ruleIMPORTANT_SYM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1487:2: ( ( '!important' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1488:1: ( '!important' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1488:1: ( '!important' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1489:1: '!important'
            {
             before(grammarAccess.getIMPORTANT_SYMAccess().getImportantKeyword()); 
            match(input,14,FOLLOW_14_in_ruleIMPORTANT_SYM3066); 
             after(grammarAccess.getIMPORTANT_SYMAccess().getImportantKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIMPORTANT_SYM"


    // $ANTLR start "entryRuleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1504:1: entryRuleReservedWords : ruleReservedWords EOF ;
    public final void entryRuleReservedWords() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1505:1: ( ruleReservedWords EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1506:1: ruleReservedWords EOF
            {
             before(grammarAccess.getReservedWordsRule()); 
            pushFollow(FOLLOW_ruleReservedWords_in_entryRuleReservedWords3094);
            ruleReservedWords();

            state._fsp--;

             after(grammarAccess.getReservedWordsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedWords3101); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReservedWords"


    // $ANTLR start "ruleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1513:1: ruleReservedWords : ( ( rule__ReservedWords__Alternatives ) ) ;
    public final void ruleReservedWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1517:2: ( ( ( rule__ReservedWords__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1518:1: ( ( rule__ReservedWords__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1518:1: ( ( rule__ReservedWords__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1519:1: ( rule__ReservedWords__Alternatives )
            {
             before(grammarAccess.getReservedWordsAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1520:1: ( rule__ReservedWords__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1520:2: rule__ReservedWords__Alternatives
            {
            pushFollow(FOLLOW_rule__ReservedWords__Alternatives_in_ruleReservedWords3127);
            rule__ReservedWords__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReservedWordsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReservedWords"


    // $ANTLR start "rulecss_not"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1533:1: rulecss_not : ( ( 'not(' ) ) ;
    public final void rulecss_not() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1537:1: ( ( ( 'not(' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1538:1: ( ( 'not(' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1538:1: ( ( 'not(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1539:1: ( 'not(' )
            {
             before(grammarAccess.getCss_notAccess().getNotEnumLiteralDeclaration()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1540:1: ( 'not(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1540:3: 'not('
            {
            match(input,15,FOLLOW_15_in_rulecss_not3165); 

            }

             after(grammarAccess.getCss_notAccess().getNotEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_not"


    // $ANTLR start "rule__Stylesheet__Alternatives_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1552:1: rule__Stylesheet__Alternatives_2 : ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) );
    public final void rule__Stylesheet__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1556:1: ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_HASH:
            case 24:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt3=1;
                }
                break;
            case 22:
            case 23:
                {
                alt3=2;
                }
                break;
            case 20:
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1557:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1557:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1558:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    {
                     before(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1559:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1559:2: rule__Stylesheet__RulesetAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__RulesetAssignment_2_0_in_rule__Stylesheet__Alternatives_23202);
                    rule__Stylesheet__RulesetAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1563:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1563:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1564:1: ( rule__Stylesheet__MediaAssignment_2_1 )
                    {
                     before(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1565:1: ( rule__Stylesheet__MediaAssignment_2_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1565:2: rule__Stylesheet__MediaAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__MediaAssignment_2_1_in_rule__Stylesheet__Alternatives_23220);
                    rule__Stylesheet__MediaAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1569:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1569:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1570:1: ( rule__Stylesheet__PageAssignment_2_2 )
                    {
                     before(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1571:1: ( rule__Stylesheet__PageAssignment_2_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1571:2: rule__Stylesheet__PageAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__PageAssignment_2_2_in_rule__Stylesheet__Alternatives_23238);
                    rule__Stylesheet__PageAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Alternatives_2"


    // $ANTLR start "rule__Charset__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1580:1: rule__Charset__Alternatives_0 : ( ( '@charset' ) | ( '@CHARSET' ) );
    public final void rule__Charset__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1584:1: ( ( '@charset' ) | ( '@CHARSET' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1585:1: ( '@charset' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1585:1: ( '@charset' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1586:1: '@charset'
                    {
                     before(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Charset__Alternatives_03272); 
                     after(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1593:6: ( '@CHARSET' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1593:6: ( '@CHARSET' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1594:1: '@CHARSET'
                    {
                     before(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Charset__Alternatives_03292); 
                     after(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Alternatives_0"


    // $ANTLR start "rule__ImportExpression__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1606:1: rule__ImportExpression__Alternatives : ( ( ( rule__ImportExpression__Group_0__0 ) ) | ( ( rule__ImportExpression__Group_1__0 ) ) );
    public final void rule__ImportExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1610:1: ( ( ( rule__ImportExpression__Group_0__0 ) ) | ( ( rule__ImportExpression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            else if ( (LA5_0==59) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1611:1: ( ( rule__ImportExpression__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1611:1: ( ( rule__ImportExpression__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1612:1: ( rule__ImportExpression__Group_0__0 )
                    {
                     before(grammarAccess.getImportExpressionAccess().getGroup_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1613:1: ( rule__ImportExpression__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1613:2: rule__ImportExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__Group_0__0_in_rule__ImportExpression__Alternatives3326);
                    rule__ImportExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1617:6: ( ( rule__ImportExpression__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1617:6: ( ( rule__ImportExpression__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1618:1: ( rule__ImportExpression__Group_1__0 )
                    {
                     before(grammarAccess.getImportExpressionAccess().getGroup_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1619:1: ( rule__ImportExpression__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1619:2: rule__ImportExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__Group_1__0_in_rule__ImportExpression__Alternatives3344);
                    rule__ImportExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Alternatives"


    // $ANTLR start "rule__ImportExpression__Alternatives_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1628:1: rule__ImportExpression__Alternatives_0_0 : ( ( '@import' ) | ( '@IMPORT' ) );
    public final void rule__ImportExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1632:1: ( ( '@import' ) | ( '@IMPORT' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1633:1: ( '@import' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1633:1: ( '@import' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1634:1: '@import'
                    {
                     before(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__ImportExpression__Alternatives_0_03378); 
                     after(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1641:6: ( '@IMPORT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1641:6: ( '@IMPORT' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1642:1: '@IMPORT'
                    {
                     before(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__ImportExpression__Alternatives_0_03398); 
                     after(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Alternatives_0_0"


    // $ANTLR start "rule__Page__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1654:1: rule__Page__Alternatives_1 : ( ( '@page' ) | ( '@PAGE' ) );
    public final void rule__Page__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1658:1: ( ( '@page' ) | ( '@PAGE' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1659:1: ( '@page' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1659:1: ( '@page' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1660:1: '@page'
                    {
                     before(grammarAccess.getPageAccess().getPageKeyword_1_0()); 
                    match(input,20,FOLLOW_20_in_rule__Page__Alternatives_13433); 
                     after(grammarAccess.getPageAccess().getPageKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1667:6: ( '@PAGE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1667:6: ( '@PAGE' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1668:1: '@PAGE'
                    {
                     before(grammarAccess.getPageAccess().getPAGEKeyword_1_1()); 
                    match(input,21,FOLLOW_21_in_rule__Page__Alternatives_13453); 
                     after(grammarAccess.getPageAccess().getPAGEKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Alternatives_1"


    // $ANTLR start "rule__Media__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1680:1: rule__Media__Alternatives_0 : ( ( '@media' ) | ( '@MEDIA' ) );
    public final void rule__Media__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1684:1: ( ( '@media' ) | ( '@MEDIA' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1685:1: ( '@media' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1685:1: ( '@media' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1686:1: '@media'
                    {
                     before(grammarAccess.getMediaAccess().getMediaKeyword_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Media__Alternatives_03488); 
                     after(grammarAccess.getMediaAccess().getMediaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1693:6: ( '@MEDIA' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1693:6: ( '@MEDIA' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1694:1: '@MEDIA'
                    {
                     before(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Media__Alternatives_03508); 
                     after(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Alternatives_0"


    // $ANTLR start "rule__Selector__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1706:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1710:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29||(LA9_0>=31 && LA9_0<=32)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_WS) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1711:1: ( ( rule__Selector__Group_1_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1711:1: ( ( rule__Selector__Group_1_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1712:1: ( rule__Selector__Group_1_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1713:1: ( rule__Selector__Group_1_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1713:2: rule__Selector__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_13542);
                    rule__Selector__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1717:6: ( ( rule__Selector__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1717:6: ( ( rule__Selector__Group_1_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1718:1: ( rule__Selector__Group_1_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1719:1: ( rule__Selector__Group_1_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1719:2: rule__Selector__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_13560);
                    rule__Selector__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives_1"


    // $ANTLR start "rule__Simple_selector__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1728:1: rule__Simple_selector__Alternatives : ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) );
    public final void rule__Simple_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1732:1: ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENT||LA11_0==24||(LA11_0>=34 && LA11_0<=48)||LA11_0==53) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_HASH||LA11_0==52||(LA11_0>=54 && LA11_0<=55)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1733:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1733:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1734:1: ( rule__Simple_selector__Group_0__0 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getGroup_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1735:1: ( rule__Simple_selector__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1735:2: rule__Simple_selector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives3593);
                    rule__Simple_selector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1739:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1739:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1740:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1740:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1741:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1742:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1742:2: rule__Simple_selector__SubSelectorsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3613);
                    rule__Simple_selector__SubSelectorsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1745:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1746:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    {
                     before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1747:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_HASH||LA10_0==52||(LA10_0>=54 && LA10_0<=55)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1747:2: rule__Simple_selector__SubSelectorsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3625);
                    	    rule__Simple_selector__SubSelectorsAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                     after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Alternatives"


    // $ANTLR start "rule__Simple_selector__Alternatives_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1757:1: rule__Simple_selector__Alternatives_0_0 : ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) );
    public final void rule__Simple_selector__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1761:1: ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_HASH||LA12_1==RULE_COMMA||LA12_1==RULE_WS||LA12_1==29||(LA12_1>=31 && LA12_1<=32)||LA12_1==50||LA12_1==52||(LA12_1>=54 && LA12_1<=55)) ) {
                    alt12=1;
                }
                else if ( (LA12_1==53) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt12=1;
                }
                break;
            case 24:
            case 53:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1762:1: ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1762:1: ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1763:1: ( rule__Simple_selector__ElementAssignment_0_0_0 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1764:1: ( rule__Simple_selector__ElementAssignment_0_0_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1764:2: rule__Simple_selector__ElementAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__ElementAssignment_0_0_0_in_rule__Simple_selector__Alternatives_0_03661);
                    rule__Simple_selector__ElementAssignment_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1768:6: ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1768:6: ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1769:1: ( rule__Simple_selector__UniversalAssignment_0_0_1 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1770:1: ( rule__Simple_selector__UniversalAssignment_0_0_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1770:2: rule__Simple_selector__UniversalAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__UniversalAssignment_0_0_1_in_rule__Simple_selector__Alternatives_0_03679);
                    rule__Simple_selector__UniversalAssignment_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Alternatives_0_0"


    // $ANTLR start "rule__Element_name__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1779:1: rule__Element_name__Alternatives : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Element_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1783:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDENT) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=34 && LA13_0<=48)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1784:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1784:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1785:1: RULE_IDENT
                    {
                     before(grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Element_name__Alternatives3712); 
                     after(grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1790:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1790:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1791:1: ruleReservedWords
                    {
                     before(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Element_name__Alternatives3729);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element_name__Alternatives"


    // $ANTLR start "rule__Sub_selector__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1801:1: rule__Sub_selector__Alternatives : ( ( ( rule__Sub_selector__IdAssignment_0 ) ) | ( ( rule__Sub_selector__ClassAssignment_1 ) ) | ( ( rule__Sub_selector__AttribAssignment_2 ) ) | ( ( rule__Sub_selector__PseudoclassAssignment_3 ) ) | ( ( rule__Sub_selector__NegotationAssignment_4 ) ) );
    public final void rule__Sub_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1805:1: ( ( ( rule__Sub_selector__IdAssignment_0 ) ) | ( ( rule__Sub_selector__ClassAssignment_1 ) ) | ( ( rule__Sub_selector__AttribAssignment_2 ) ) | ( ( rule__Sub_selector__PseudoclassAssignment_3 ) ) | ( ( rule__Sub_selector__NegotationAssignment_4 ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_HASH:
                {
                alt14=1;
                }
                break;
            case 54:
                {
                alt14=2;
                }
                break;
            case 55:
                {
                alt14=3;
                }
                break;
            case 52:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==RULE_IDENT||LA14_4==52) ) {
                    alt14=4;
                }
                else if ( (LA14_4==15) ) {
                    alt14=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1806:1: ( ( rule__Sub_selector__IdAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1806:1: ( ( rule__Sub_selector__IdAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1807:1: ( rule__Sub_selector__IdAssignment_0 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getIdAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1808:1: ( rule__Sub_selector__IdAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1808:2: rule__Sub_selector__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__IdAssignment_0_in_rule__Sub_selector__Alternatives3761);
                    rule__Sub_selector__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1812:6: ( ( rule__Sub_selector__ClassAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1812:6: ( ( rule__Sub_selector__ClassAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1813:1: ( rule__Sub_selector__ClassAssignment_1 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getClassAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1814:1: ( rule__Sub_selector__ClassAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1814:2: rule__Sub_selector__ClassAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__ClassAssignment_1_in_rule__Sub_selector__Alternatives3779);
                    rule__Sub_selector__ClassAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getClassAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1818:6: ( ( rule__Sub_selector__AttribAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1818:6: ( ( rule__Sub_selector__AttribAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1819:1: ( rule__Sub_selector__AttribAssignment_2 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getAttribAssignment_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1820:1: ( rule__Sub_selector__AttribAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1820:2: rule__Sub_selector__AttribAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__AttribAssignment_2_in_rule__Sub_selector__Alternatives3797);
                    rule__Sub_selector__AttribAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getAttribAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1824:6: ( ( rule__Sub_selector__PseudoclassAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1824:6: ( ( rule__Sub_selector__PseudoclassAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1825:1: ( rule__Sub_selector__PseudoclassAssignment_3 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getPseudoclassAssignment_3()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1826:1: ( rule__Sub_selector__PseudoclassAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1826:2: rule__Sub_selector__PseudoclassAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__PseudoclassAssignment_3_in_rule__Sub_selector__Alternatives3815);
                    rule__Sub_selector__PseudoclassAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getPseudoclassAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1830:6: ( ( rule__Sub_selector__NegotationAssignment_4 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1830:6: ( ( rule__Sub_selector__NegotationAssignment_4 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1831:1: ( rule__Sub_selector__NegotationAssignment_4 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getNegotationAssignment_4()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1832:1: ( rule__Sub_selector__NegotationAssignment_4 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1832:2: rule__Sub_selector__NegotationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__NegotationAssignment_4_in_rule__Sub_selector__Alternatives3833);
                    rule__Sub_selector__NegotationAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getNegotationAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__Alternatives"


    // $ANTLR start "rule__Css_namespace_prefix__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1841:1: rule__Css_namespace_prefix__Alternatives_0 : ( ( RULE_IDENT ) | ( '*' ) );
    public final void rule__Css_namespace_prefix__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1845:1: ( ( RULE_IDENT ) | ( '*' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENT) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1846:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1846:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1847:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_namespace_prefix__Alternatives_03866); 
                     after(grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1852:6: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1852:6: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1853:1: '*'
                    {
                     before(grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                    match(input,24,FOLLOW_24_in_rule__Css_namespace_prefix__Alternatives_03884); 
                     after(grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_namespace_prefix__Alternatives_0"


    // $ANTLR start "rule__Css_class__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1865:1: rule__Css_class__Alternatives_1 : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Css_class__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1869:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENT) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=34 && LA16_0<=48)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1870:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1870:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1871:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_class__Alternatives_13918); 
                     after(grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1876:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1876:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1877:1: ruleReservedWords
                    {
                     before(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Css_class__Alternatives_13935);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Alternatives_1"


    // $ANTLR start "rule__Css_attrib__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1887:1: rule__Css_attrib__Alternatives_1 : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Css_attrib__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1891:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENT) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=34 && LA17_0<=48)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1892:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1892:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1893:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_13967); 
                     after(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1898:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1898:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1899:1: ruleReservedWords
                    {
                     before(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_13984);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_1"


    // $ANTLR start "rule__Css_attrib__Alternatives_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1909:1: rule__Css_attrib__Alternatives_2_0 : ( ( '^=' ) | ( '$=' ) | ( '*=' ) | ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) );
    public final void rule__Css_attrib__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1913:1: ( ( '^=' ) | ( '$=' ) | ( '*=' ) | ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt18=1;
                }
                break;
            case 26:
                {
                alt18=2;
                }
                break;
            case 27:
                {
                alt18=3;
                }
                break;
            case 28:
                {
                alt18=4;
                }
                break;
            case RULE_INCLUDES:
                {
                alt18=5;
                }
                break;
            case RULE_DASHMATCH:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1914:1: ( '^=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1914:1: ( '^=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1915:1: '^='
                    {
                     before(grammarAccess.getCss_attribAccess().getCircumflexAccentEqualsSignKeyword_2_0_0()); 
                    match(input,25,FOLLOW_25_in_rule__Css_attrib__Alternatives_2_04017); 
                     after(grammarAccess.getCss_attribAccess().getCircumflexAccentEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1922:6: ( '$=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1922:6: ( '$=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1923:1: '$='
                    {
                     before(grammarAccess.getCss_attribAccess().getDollarSignEqualsSignKeyword_2_0_1()); 
                    match(input,26,FOLLOW_26_in_rule__Css_attrib__Alternatives_2_04037); 
                     after(grammarAccess.getCss_attribAccess().getDollarSignEqualsSignKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1930:6: ( '*=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1930:6: ( '*=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1931:1: '*='
                    {
                     before(grammarAccess.getCss_attribAccess().getAsteriskEqualsSignKeyword_2_0_2()); 
                    match(input,27,FOLLOW_27_in_rule__Css_attrib__Alternatives_2_04057); 
                     after(grammarAccess.getCss_attribAccess().getAsteriskEqualsSignKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1938:6: ( '=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1938:6: ( '=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1939:1: '='
                    {
                     before(grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_3()); 
                    match(input,28,FOLLOW_28_in_rule__Css_attrib__Alternatives_2_04077); 
                     after(grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1946:6: ( RULE_INCLUDES )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1946:6: ( RULE_INCLUDES )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1947:1: RULE_INCLUDES
                    {
                     before(grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_4()); 
                    match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rule__Css_attrib__Alternatives_2_04096); 
                     after(grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1952:6: ( RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1952:6: ( RULE_DASHMATCH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1953:1: RULE_DASHMATCH
                    {
                     before(grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_5()); 
                    match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rule__Css_attrib__Alternatives_2_04113); 
                     after(grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_2_0"


    // $ANTLR start "rule__Css_attrib__Alternatives_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1963:1: rule__Css_attrib__Alternatives_2_1 : ( ( ( rule__Css_attrib__Alternatives_2_1_0 ) ) | ( RULE_STRING ) );
    public final void rule__Css_attrib__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1967:1: ( ( ( rule__Css_attrib__Alternatives_2_1_0 ) ) | ( RULE_STRING ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENT||(LA19_0>=34 && LA19_0<=48)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1968:1: ( ( rule__Css_attrib__Alternatives_2_1_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1968:1: ( ( rule__Css_attrib__Alternatives_2_1_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1969:1: ( rule__Css_attrib__Alternatives_2_1_0 )
                    {
                     before(grammarAccess.getCss_attribAccess().getAlternatives_2_1_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1970:1: ( rule__Css_attrib__Alternatives_2_1_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1970:2: rule__Css_attrib__Alternatives_2_1_0
                    {
                    pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_1_0_in_rule__Css_attrib__Alternatives_2_14145);
                    rule__Css_attrib__Alternatives_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCss_attribAccess().getAlternatives_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1974:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1974:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1975:1: RULE_STRING
                    {
                     before(grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Css_attrib__Alternatives_2_14163); 
                     after(grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_2_1"


    // $ANTLR start "rule__Css_attrib__Alternatives_2_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1985:1: rule__Css_attrib__Alternatives_2_1_0 : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Css_attrib__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1989:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENT) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=34 && LA20_0<=48)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1990:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1990:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1991:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_2_1_04195); 
                     after(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1996:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1996:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1997:1: ruleReservedWords
                    {
                     before(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_2_1_04212);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_2_1_0"


    // $ANTLR start "rule__Css_pseudo__Alternatives_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2007:1: rule__Css_pseudo__Alternatives_2 : ( ( RULE_IDENT ) | ( rulefunctional_pseudo ) );
    public final void rule__Css_pseudo__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2011:1: ( ( RULE_IDENT ) | ( rulefunctional_pseudo ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==58) ) {
                    alt21=2;
                }
                else if ( (LA21_1==EOF||LA21_1==RULE_HASH||LA21_1==RULE_COMMA||LA21_1==RULE_WS||LA21_1==29||(LA21_1>=31 && LA21_1<=32)||LA21_1==50||LA21_1==52||(LA21_1>=54 && LA21_1<=55)||LA21_1==57) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2012:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2012:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2013:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_2_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_pseudo__Alternatives_24244); 
                     after(grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2018:6: ( rulefunctional_pseudo )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2018:6: ( rulefunctional_pseudo )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2019:1: rulefunctional_pseudo
                    {
                     before(grammarAccess.getCss_pseudoAccess().getFunctional_pseudoParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_rulefunctional_pseudo_in_rule__Css_pseudo__Alternatives_24261);
                    rulefunctional_pseudo();

                    state._fsp--;

                     after(grammarAccess.getCss_pseudoAccess().getFunctional_pseudoParserRuleCall_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Alternatives_2"


    // $ANTLR start "rule__Css_negation_arg__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2029:1: rule__Css_negation_arg__Alternatives : ( ( rulecss_type_selector ) | ( rulecss_universal ) | ( RULE_HASH ) | ( rulecss_class ) | ( rulecss_attrib ) | ( rulecss_pseudo ) );
    public final void rule__Css_negation_arg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2033:1: ( ( rulecss_type_selector ) | ( rulecss_universal ) | ( RULE_HASH ) | ( rulecss_class ) | ( rulecss_attrib ) | ( rulecss_pseudo ) )
            int alt22=6;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2034:1: ( rulecss_type_selector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2034:1: ( rulecss_type_selector )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2035:1: rulecss_type_selector
                    {
                     before(grammarAccess.getCss_negation_argAccess().getCss_type_selectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulecss_type_selector_in_rule__Css_negation_arg__Alternatives4293);
                    rulecss_type_selector();

                    state._fsp--;

                     after(grammarAccess.getCss_negation_argAccess().getCss_type_selectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2040:6: ( rulecss_universal )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2040:6: ( rulecss_universal )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2041:1: rulecss_universal
                    {
                     before(grammarAccess.getCss_negation_argAccess().getCss_universalParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulecss_universal_in_rule__Css_negation_arg__Alternatives4310);
                    rulecss_universal();

                    state._fsp--;

                     after(grammarAccess.getCss_negation_argAccess().getCss_universalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2046:6: ( RULE_HASH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2046:6: ( RULE_HASH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2047:1: RULE_HASH
                    {
                     before(grammarAccess.getCss_negation_argAccess().getHASHTerminalRuleCall_2()); 
                    match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rule__Css_negation_arg__Alternatives4327); 
                     after(grammarAccess.getCss_negation_argAccess().getHASHTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2052:6: ( rulecss_class )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2052:6: ( rulecss_class )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2053:1: rulecss_class
                    {
                     before(grammarAccess.getCss_negation_argAccess().getCss_classParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulecss_class_in_rule__Css_negation_arg__Alternatives4344);
                    rulecss_class();

                    state._fsp--;

                     after(grammarAccess.getCss_negation_argAccess().getCss_classParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2058:6: ( rulecss_attrib )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2058:6: ( rulecss_attrib )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2059:1: rulecss_attrib
                    {
                     before(grammarAccess.getCss_negation_argAccess().getCss_attribParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulecss_attrib_in_rule__Css_negation_arg__Alternatives4361);
                    rulecss_attrib();

                    state._fsp--;

                     after(grammarAccess.getCss_negation_argAccess().getCss_attribParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2064:6: ( rulecss_pseudo )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2064:6: ( rulecss_pseudo )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2065:1: rulecss_pseudo
                    {
                     before(grammarAccess.getCss_negation_argAccess().getCss_pseudoParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulecss_pseudo_in_rule__Css_negation_arg__Alternatives4378);
                    rulecss_pseudo();

                    state._fsp--;

                     after(grammarAccess.getCss_negation_argAccess().getCss_pseudoParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation_arg__Alternatives"


    // $ANTLR start "rule__Function_expr__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2075:1: rule__Function_expr__Alternatives : ( ( '+' ) | ( '-' ) | ( ruleDIMENSION ) | ( ruleNUMBER ) | ( RULE_STRING ) | ( RULE_IDENT ) );
    public final void rule__Function_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2079:1: ( ( '+' ) | ( '-' ) | ( ruleDIMENSION ) | ( ruleNUMBER ) | ( RULE_STRING ) | ( RULE_IDENT ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt23=1;
                }
                break;
            case 30:
                {
                alt23=2;
                }
                break;
            case RULE_INTEGER:
                {
                int LA23_3 = input.LA(2);

                if ( ((LA23_3>=34 && LA23_3<=48)||LA23_3==60) ) {
                    alt23=3;
                }
                else if ( (LA23_3==EOF||LA23_3==RULE_IDENT||LA23_3==RULE_STRING||(LA23_3>=RULE_INTEGER && LA23_3<=RULE_REAL)||(LA23_3>=29 && LA23_3<=30)||LA23_3==57) ) {
                    alt23=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REAL:
                {
                int LA23_4 = input.LA(2);

                if ( ((LA23_4>=34 && LA23_4<=48)||LA23_4==60) ) {
                    alt23=3;
                }
                else if ( (LA23_4==EOF||LA23_4==RULE_IDENT||LA23_4==RULE_STRING||(LA23_4>=RULE_INTEGER && LA23_4<=RULE_REAL)||(LA23_4>=29 && LA23_4<=30)||LA23_4==57) ) {
                    alt23=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt23=5;
                }
                break;
            case RULE_IDENT:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2080:1: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2080:1: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2081:1: '+'
                    {
                     before(grammarAccess.getFunction_exprAccess().getPlusSignKeyword_0()); 
                    match(input,29,FOLLOW_29_in_rule__Function_expr__Alternatives4411); 
                     after(grammarAccess.getFunction_exprAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2088:6: ( '-' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2088:6: ( '-' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2089:1: '-'
                    {
                     before(grammarAccess.getFunction_exprAccess().getHyphenMinusKeyword_1()); 
                    match(input,30,FOLLOW_30_in_rule__Function_expr__Alternatives4431); 
                     after(grammarAccess.getFunction_exprAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2096:6: ( ruleDIMENSION )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2096:6: ( ruleDIMENSION )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2097:1: ruleDIMENSION
                    {
                     before(grammarAccess.getFunction_exprAccess().getDIMENSIONParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDIMENSION_in_rule__Function_expr__Alternatives4450);
                    ruleDIMENSION();

                    state._fsp--;

                     after(grammarAccess.getFunction_exprAccess().getDIMENSIONParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2102:6: ( ruleNUMBER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2102:6: ( ruleNUMBER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2103:1: ruleNUMBER
                    {
                     before(grammarAccess.getFunction_exprAccess().getNUMBERParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__Function_expr__Alternatives4467);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getFunction_exprAccess().getNUMBERParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2108:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2108:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2109:1: RULE_STRING
                    {
                     before(grammarAccess.getFunction_exprAccess().getSTRINGTerminalRuleCall_4()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Function_expr__Alternatives4484); 
                     after(grammarAccess.getFunction_exprAccess().getSTRINGTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2114:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2114:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2115:1: RULE_IDENT
                    {
                     before(grammarAccess.getFunction_exprAccess().getIDENTTerminalRuleCall_5()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Function_expr__Alternatives4501); 
                     after(grammarAccess.getFunction_exprAccess().getIDENTTerminalRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_expr__Alternatives"


    // $ANTLR start "rule__DIMENSION__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2125:1: rule__DIMENSION__Alternatives : ( ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );
    public final void rule__DIMENSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2129:1: ( ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) )
            int alt24=7;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2130:1: ( rulePERCENTAGE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2130:1: ( rulePERCENTAGE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2131:1: rulePERCENTAGE
                    {
                     before(grammarAccess.getDIMENSIONAccess().getPERCENTAGEParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rule__DIMENSION__Alternatives4533);
                    rulePERCENTAGE();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getPERCENTAGEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2136:6: ( ruleLENGTH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2136:6: ( ruleLENGTH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2137:1: ruleLENGTH
                    {
                     before(grammarAccess.getDIMENSIONAccess().getLENGTHParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLENGTH_in_rule__DIMENSION__Alternatives4550);
                    ruleLENGTH();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getLENGTHParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2142:6: ( ruleEMS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2142:6: ( ruleEMS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2143:1: ruleEMS
                    {
                     before(grammarAccess.getDIMENSIONAccess().getEMSParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEMS_in_rule__DIMENSION__Alternatives4567);
                    ruleEMS();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getEMSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2148:6: ( ruleEXS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2148:6: ( ruleEXS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2149:1: ruleEXS
                    {
                     before(grammarAccess.getDIMENSIONAccess().getEXSParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEXS_in_rule__DIMENSION__Alternatives4584);
                    ruleEXS();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getEXSParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2154:6: ( ruleANGLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2154:6: ( ruleANGLE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2155:1: ruleANGLE
                    {
                     before(grammarAccess.getDIMENSIONAccess().getANGLEParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleANGLE_in_rule__DIMENSION__Alternatives4601);
                    ruleANGLE();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getANGLEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2160:6: ( ruleTIME )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2160:6: ( ruleTIME )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2161:1: ruleTIME
                    {
                     before(grammarAccess.getDIMENSIONAccess().getTIMEParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTIME_in_rule__DIMENSION__Alternatives4618);
                    ruleTIME();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getTIMEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2166:6: ( ruleFREQ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2166:6: ( ruleFREQ )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2167:1: ruleFREQ
                    {
                     before(grammarAccess.getDIMENSIONAccess().getFREQParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFREQ_in_rule__DIMENSION__Alternatives4635);
                    ruleFREQ();

                    state._fsp--;

                     after(grammarAccess.getDIMENSIONAccess().getFREQParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIMENSION__Alternatives"


    // $ANTLR start "rule__Combinator__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2177:1: rule__Combinator__Alternatives_0 : ( ( '+' ) | ( '>' ) | ( '~' ) );
    public final void rule__Combinator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2181:1: ( ( '+' ) | ( '>' ) | ( '~' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case 32:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2182:1: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2182:1: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2183:1: '+'
                    {
                     before(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                    match(input,29,FOLLOW_29_in_rule__Combinator__Alternatives_04668); 
                     after(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2190:6: ( '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2190:6: ( '>' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2191:1: '>'
                    {
                     before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                    match(input,31,FOLLOW_31_in_rule__Combinator__Alternatives_04688); 
                     after(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2198:6: ( '~' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2198:6: ( '~' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2199:1: '~'
                    {
                     before(grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 
                    match(input,32,FOLLOW_32_in_rule__Combinator__Alternatives_04708); 
                     after(grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Alternatives_0"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2211:1: rule__Operator__Alternatives : ( ( '/' ) | ( RULE_COMMA ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2215:1: ( ( '/' ) | ( RULE_COMMA ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_COMMA) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2216:1: ( '/' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2216:1: ( '/' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2217:1: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                    match(input,33,FOLLOW_33_in_rule__Operator__Alternatives4743); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2224:6: ( RULE_COMMA )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2224:6: ( RULE_COMMA )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2225:1: RULE_COMMA
                    {
                     before(grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Operator__Alternatives4762); 
                     after(grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Unary_operator__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2235:1: rule__Unary_operator__Alternatives : ( ( '-' ) | ( '+' ) );
    public final void rule__Unary_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2239:1: ( ( '-' ) | ( '+' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==29) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2240:1: ( '-' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2240:1: ( '-' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2241:1: '-'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                    match(input,30,FOLLOW_30_in_rule__Unary_operator__Alternatives4795); 
                     after(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2248:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2248:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2249:1: '+'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__Unary_operator__Alternatives4815); 
                     after(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary_operator__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2261:1: rule__Term__Alternatives : ( ( ( rule__Term__NumberAssignment_0 ) ) | ( ( rule__Term__StringValueAssignment_1 ) ) | ( ( rule__Term__IdentifierAssignment_2 ) ) | ( ( rule__Term__UrlAssignment_3 ) ) | ( ( rule__Term__FunctionAssignment_4 ) ) | ( ( rule__Term__HexColorAssignment_5 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2265:1: ( ( ( rule__Term__NumberAssignment_0 ) ) | ( ( rule__Term__StringValueAssignment_1 ) ) | ( ( rule__Term__IdentifierAssignment_2 ) ) | ( ( rule__Term__UrlAssignment_3 ) ) | ( ( rule__Term__FunctionAssignment_4 ) ) | ( ( rule__Term__HexColorAssignment_5 ) ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_IDENT) ) {
                    int LA28_4 = input.LA(3);

                    if ( (LA28_4==58) ) {
                        alt28=5;
                    }
                    else if ( (LA28_4==EOF||(LA28_4>=RULE_IDENT && LA28_4<=RULE_HASH)||(LA28_4>=RULE_STRING && LA28_4<=RULE_WS)||LA28_4==14||(LA28_4>=29 && LA28_4<=30)||LA28_4==33||LA28_4==49||LA28_4==51||LA28_4==57||LA28_4==59) ) {
                        alt28=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA28_1>=RULE_INTEGER && LA28_1<=RULE_REAL)) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 29:
                {
                alt28=1;
                }
                break;
            case RULE_STRING:
                {
                alt28=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA28_4 = input.LA(2);

                if ( (LA28_4==58) ) {
                    alt28=5;
                }
                else if ( (LA28_4==EOF||(LA28_4>=RULE_IDENT && LA28_4<=RULE_HASH)||(LA28_4>=RULE_STRING && LA28_4<=RULE_WS)||LA28_4==14||(LA28_4>=29 && LA28_4<=30)||LA28_4==33||LA28_4==49||LA28_4==51||LA28_4==57||LA28_4==59) ) {
                    alt28=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 4, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt28=4;
                }
                break;
            case RULE_HASH:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2266:1: ( ( rule__Term__NumberAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2266:1: ( ( rule__Term__NumberAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2267:1: ( rule__Term__NumberAssignment_0 )
                    {
                     before(grammarAccess.getTermAccess().getNumberAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2268:1: ( rule__Term__NumberAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2268:2: rule__Term__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Term__NumberAssignment_0_in_rule__Term__Alternatives4849);
                    rule__Term__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2272:6: ( ( rule__Term__StringValueAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2272:6: ( ( rule__Term__StringValueAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2273:1: ( rule__Term__StringValueAssignment_1 )
                    {
                     before(grammarAccess.getTermAccess().getStringValueAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2274:1: ( rule__Term__StringValueAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2274:2: rule__Term__StringValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Term__StringValueAssignment_1_in_rule__Term__Alternatives4867);
                    rule__Term__StringValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getStringValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2278:6: ( ( rule__Term__IdentifierAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2278:6: ( ( rule__Term__IdentifierAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2279:1: ( rule__Term__IdentifierAssignment_2 )
                    {
                     before(grammarAccess.getTermAccess().getIdentifierAssignment_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2280:1: ( rule__Term__IdentifierAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2280:2: rule__Term__IdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Term__IdentifierAssignment_2_in_rule__Term__Alternatives4885);
                    rule__Term__IdentifierAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getIdentifierAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2284:6: ( ( rule__Term__UrlAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2284:6: ( ( rule__Term__UrlAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2285:1: ( rule__Term__UrlAssignment_3 )
                    {
                     before(grammarAccess.getTermAccess().getUrlAssignment_3()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2286:1: ( rule__Term__UrlAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2286:2: rule__Term__UrlAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Term__UrlAssignment_3_in_rule__Term__Alternatives4903);
                    rule__Term__UrlAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getUrlAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2290:6: ( ( rule__Term__FunctionAssignment_4 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2290:6: ( ( rule__Term__FunctionAssignment_4 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2291:1: ( rule__Term__FunctionAssignment_4 )
                    {
                     before(grammarAccess.getTermAccess().getFunctionAssignment_4()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2292:1: ( rule__Term__FunctionAssignment_4 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2292:2: rule__Term__FunctionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Term__FunctionAssignment_4_in_rule__Term__Alternatives4921);
                    rule__Term__FunctionAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getFunctionAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2296:6: ( ( rule__Term__HexColorAssignment_5 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2296:6: ( ( rule__Term__HexColorAssignment_5 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2297:1: ( rule__Term__HexColorAssignment_5 )
                    {
                     before(grammarAccess.getTermAccess().getHexColorAssignment_5()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2298:1: ( rule__Term__HexColorAssignment_5 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2298:2: rule__Term__HexColorAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Term__HexColorAssignment_5_in_rule__Term__Alternatives4939);
                    rule__Term__HexColorAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getHexColorAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__NumberTerm__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2307:1: rule__NumberTerm__Alternatives_1 : ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );
    public final void rule__NumberTerm__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2311:1: ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2312:1: ( ruleNUMBER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2312:1: ( ruleNUMBER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2313:1: ruleNUMBER
                    {
                     before(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberTerm__Alternatives_14972);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2318:6: ( rulePERCENTAGE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2318:6: ( rulePERCENTAGE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2319:1: rulePERCENTAGE
                    {
                     before(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rule__NumberTerm__Alternatives_14989);
                    rulePERCENTAGE();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2324:6: ( ruleLENGTH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2324:6: ( ruleLENGTH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2325:1: ruleLENGTH
                    {
                     before(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleLENGTH_in_rule__NumberTerm__Alternatives_15006);
                    ruleLENGTH();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2330:6: ( ruleEMS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2330:6: ( ruleEMS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2331:1: ruleEMS
                    {
                     before(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_ruleEMS_in_rule__NumberTerm__Alternatives_15023);
                    ruleEMS();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2336:6: ( ruleEXS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2336:6: ( ruleEXS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2337:1: ruleEXS
                    {
                     before(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_ruleEXS_in_rule__NumberTerm__Alternatives_15040);
                    ruleEXS();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2342:6: ( ruleANGLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2342:6: ( ruleANGLE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2343:1: ruleANGLE
                    {
                     before(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_ruleANGLE_in_rule__NumberTerm__Alternatives_15057);
                    ruleANGLE();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2348:6: ( ruleTIME )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2348:6: ( ruleTIME )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2349:1: ruleTIME
                    {
                     before(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_ruleTIME_in_rule__NumberTerm__Alternatives_15074);
                    ruleTIME();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2354:6: ( ruleFREQ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2354:6: ( ruleFREQ )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2355:1: ruleFREQ
                    {
                     before(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                    pushFollow(FOLLOW_ruleFREQ_in_rule__NumberTerm__Alternatives_15091);
                    ruleFREQ();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Alternatives_1"


    // $ANTLR start "rule__Num__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2365:1: rule__Num__Alternatives : ( ( RULE_INTEGER ) | ( RULE_REAL ) );
    public final void rule__Num__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2369:1: ( ( RULE_INTEGER ) | ( RULE_REAL ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INTEGER) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_REAL) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2370:1: ( RULE_INTEGER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2370:1: ( RULE_INTEGER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2371:1: RULE_INTEGER
                    {
                     before(grammarAccess.getNumAccess().getINTEGERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Num__Alternatives5123); 
                     after(grammarAccess.getNumAccess().getINTEGERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2376:6: ( RULE_REAL )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2376:6: ( RULE_REAL )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2377:1: RULE_REAL
                    {
                     before(grammarAccess.getNumAccess().getREALTerminalRuleCall_1()); 
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Num__Alternatives5140); 
                     after(grammarAccess.getNumAccess().getREALTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Alternatives"


    // $ANTLR start "rule__LENGTH__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2387:1: rule__LENGTH__Alternatives_1 : ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) );
    public final void rule__LENGTH__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2391:1: ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt31=1;
                }
                break;
            case 35:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            case 37:
                {
                alt31=4;
                }
                break;
            case 38:
                {
                alt31=5;
                }
                break;
            case 39:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2392:1: ( 'px' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2392:1: ( 'px' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2393:1: 'px'
                    {
                     before(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                    match(input,34,FOLLOW_34_in_rule__LENGTH__Alternatives_15173); 
                     after(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2400:6: ( 'cm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2400:6: ( 'cm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2401:1: 'cm'
                    {
                     before(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                    match(input,35,FOLLOW_35_in_rule__LENGTH__Alternatives_15193); 
                     after(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2408:6: ( 'mm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2408:6: ( 'mm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2409:1: 'mm'
                    {
                     before(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                    match(input,36,FOLLOW_36_in_rule__LENGTH__Alternatives_15213); 
                     after(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2416:6: ( 'in' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2416:6: ( 'in' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2417:1: 'in'
                    {
                     before(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                    match(input,37,FOLLOW_37_in_rule__LENGTH__Alternatives_15233); 
                     after(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2424:6: ( 'pt' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2424:6: ( 'pt' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2425:1: 'pt'
                    {
                     before(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                    match(input,38,FOLLOW_38_in_rule__LENGTH__Alternatives_15253); 
                     after(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2432:6: ( 'pc' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2432:6: ( 'pc' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2433:1: 'pc'
                    {
                     before(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                    match(input,39,FOLLOW_39_in_rule__LENGTH__Alternatives_15273); 
                     after(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Alternatives_1"


    // $ANTLR start "rule__ANGLE__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2445:1: rule__ANGLE__Alternatives_1 : ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) );
    public final void rule__ANGLE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2449:1: ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt32=1;
                }
                break;
            case 41:
                {
                alt32=2;
                }
                break;
            case 42:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2450:1: ( 'deg' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2450:1: ( 'deg' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2451:1: 'deg'
                    {
                     before(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                    match(input,40,FOLLOW_40_in_rule__ANGLE__Alternatives_15308); 
                     after(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2458:6: ( 'rad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2458:6: ( 'rad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2459:1: 'rad'
                    {
                     before(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                    match(input,41,FOLLOW_41_in_rule__ANGLE__Alternatives_15328); 
                     after(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2466:6: ( 'grad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2466:6: ( 'grad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2467:1: 'grad'
                    {
                     before(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                    match(input,42,FOLLOW_42_in_rule__ANGLE__Alternatives_15348); 
                     after(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Alternatives_1"


    // $ANTLR start "rule__TIME__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2479:1: rule__TIME__Alternatives_1 : ( ( 'ms' ) | ( 's' ) );
    public final void rule__TIME__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2483:1: ( ( 'ms' ) | ( 's' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            else if ( (LA33_0==44) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2484:1: ( 'ms' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2484:1: ( 'ms' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2485:1: 'ms'
                    {
                     before(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                    match(input,43,FOLLOW_43_in_rule__TIME__Alternatives_15383); 
                     after(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2492:6: ( 's' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2492:6: ( 's' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2493:1: 's'
                    {
                     before(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                    match(input,44,FOLLOW_44_in_rule__TIME__Alternatives_15403); 
                     after(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Alternatives_1"


    // $ANTLR start "rule__FREQ__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2505:1: rule__FREQ__Alternatives_1 : ( ( 'hz' ) | ( 'khz' ) );
    public final void rule__FREQ__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2509:1: ( ( 'hz' ) | ( 'khz' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==46) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2510:1: ( 'hz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2510:1: ( 'hz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2511:1: 'hz'
                    {
                     before(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                    match(input,45,FOLLOW_45_in_rule__FREQ__Alternatives_15438); 
                     after(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2518:6: ( 'khz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2518:6: ( 'khz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2519:1: 'khz'
                    {
                     before(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                    match(input,46,FOLLOW_46_in_rule__FREQ__Alternatives_15458); 
                     after(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Alternatives_1"


    // $ANTLR start "rule__ReservedWords__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2531:1: rule__ReservedWords__Alternatives : ( ( 'em' ) | ( 'ex' ) | ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) | ( 'deg' ) | ( 'rad' ) | ( 'grad' ) | ( 'ms' ) | ( 's' ) | ( 'hz' ) | ( 'khz' ) );
    public final void rule__ReservedWords__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2535:1: ( ( 'em' ) | ( 'ex' ) | ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) | ( 'deg' ) | ( 'rad' ) | ( 'grad' ) | ( 'ms' ) | ( 's' ) | ( 'hz' ) | ( 'khz' ) )
            int alt35=15;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt35=1;
                }
                break;
            case 48:
                {
                alt35=2;
                }
                break;
            case 34:
                {
                alt35=3;
                }
                break;
            case 35:
                {
                alt35=4;
                }
                break;
            case 36:
                {
                alt35=5;
                }
                break;
            case 37:
                {
                alt35=6;
                }
                break;
            case 38:
                {
                alt35=7;
                }
                break;
            case 39:
                {
                alt35=8;
                }
                break;
            case 40:
                {
                alt35=9;
                }
                break;
            case 41:
                {
                alt35=10;
                }
                break;
            case 42:
                {
                alt35=11;
                }
                break;
            case 43:
                {
                alt35=12;
                }
                break;
            case 44:
                {
                alt35=13;
                }
                break;
            case 45:
                {
                alt35=14;
                }
                break;
            case 46:
                {
                alt35=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2536:1: ( 'em' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2536:1: ( 'em' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2537:1: 'em'
                    {
                     before(grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 
                    match(input,47,FOLLOW_47_in_rule__ReservedWords__Alternatives5493); 
                     after(grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2544:6: ( 'ex' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2544:6: ( 'ex' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2545:1: 'ex'
                    {
                     before(grammarAccess.getReservedWordsAccess().getExKeyword_1()); 
                    match(input,48,FOLLOW_48_in_rule__ReservedWords__Alternatives5513); 
                     after(grammarAccess.getReservedWordsAccess().getExKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2552:6: ( 'px' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2552:6: ( 'px' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2553:1: 'px'
                    {
                     before(grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 
                    match(input,34,FOLLOW_34_in_rule__ReservedWords__Alternatives5533); 
                     after(grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2560:6: ( 'cm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2560:6: ( 'cm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2561:1: 'cm'
                    {
                     before(grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 
                    match(input,35,FOLLOW_35_in_rule__ReservedWords__Alternatives5553); 
                     after(grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2568:6: ( 'mm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2568:6: ( 'mm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2569:1: 'mm'
                    {
                     before(grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 
                    match(input,36,FOLLOW_36_in_rule__ReservedWords__Alternatives5573); 
                     after(grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2576:6: ( 'in' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2576:6: ( 'in' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2577:1: 'in'
                    {
                     before(grammarAccess.getReservedWordsAccess().getInKeyword_5()); 
                    match(input,37,FOLLOW_37_in_rule__ReservedWords__Alternatives5593); 
                     after(grammarAccess.getReservedWordsAccess().getInKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2584:6: ( 'pt' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2584:6: ( 'pt' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2585:1: 'pt'
                    {
                     before(grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 
                    match(input,38,FOLLOW_38_in_rule__ReservedWords__Alternatives5613); 
                     after(grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2592:6: ( 'pc' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2592:6: ( 'pc' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2593:1: 'pc'
                    {
                     before(grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 
                    match(input,39,FOLLOW_39_in_rule__ReservedWords__Alternatives5633); 
                     after(grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2600:6: ( 'deg' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2600:6: ( 'deg' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2601:1: 'deg'
                    {
                     before(grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 
                    match(input,40,FOLLOW_40_in_rule__ReservedWords__Alternatives5653); 
                     after(grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2608:6: ( 'rad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2608:6: ( 'rad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2609:1: 'rad'
                    {
                     before(grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 
                    match(input,41,FOLLOW_41_in_rule__ReservedWords__Alternatives5673); 
                     after(grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2616:6: ( 'grad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2616:6: ( 'grad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2617:1: 'grad'
                    {
                     before(grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 
                    match(input,42,FOLLOW_42_in_rule__ReservedWords__Alternatives5693); 
                     after(grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2624:6: ( 'ms' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2624:6: ( 'ms' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2625:1: 'ms'
                    {
                     before(grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 
                    match(input,43,FOLLOW_43_in_rule__ReservedWords__Alternatives5713); 
                     after(grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2632:6: ( 's' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2632:6: ( 's' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2633:1: 's'
                    {
                     before(grammarAccess.getReservedWordsAccess().getSKeyword_12()); 
                    match(input,44,FOLLOW_44_in_rule__ReservedWords__Alternatives5733); 
                     after(grammarAccess.getReservedWordsAccess().getSKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2640:6: ( 'hz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2640:6: ( 'hz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2641:1: 'hz'
                    {
                     before(grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 
                    match(input,45,FOLLOW_45_in_rule__ReservedWords__Alternatives5753); 
                     after(grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2648:6: ( 'khz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2648:6: ( 'khz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2649:1: 'khz'
                    {
                     before(grammarAccess.getReservedWordsAccess().getKhzKeyword_14()); 
                    match(input,46,FOLLOW_46_in_rule__ReservedWords__Alternatives5773); 
                     after(grammarAccess.getReservedWordsAccess().getKhzKeyword_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservedWords__Alternatives"


    // $ANTLR start "rule__Stylesheet__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2663:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
    public final void rule__Stylesheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2667:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2668:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__05805);
            rule__Stylesheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__05808);
            rule__Stylesheet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__0"


    // $ANTLR start "rule__Stylesheet__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2675:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__CharsetAssignment_0 )? ) ;
    public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2679:1: ( ( ( rule__Stylesheet__CharsetAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2680:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2680:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2681:1: ( rule__Stylesheet__CharsetAssignment_0 )?
            {
             before(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2682:1: ( rule__Stylesheet__CharsetAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=16 && LA36_0<=17)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2682:2: rule__Stylesheet__CharsetAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__CharsetAssignment_0_in_rule__Stylesheet__Group__0__Impl5835);
                    rule__Stylesheet__CharsetAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__0__Impl"


    // $ANTLR start "rule__Stylesheet__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2692:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
    public final void rule__Stylesheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2696:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2697:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__15866);
            rule__Stylesheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__15869);
            rule__Stylesheet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__1"


    // $ANTLR start "rule__Stylesheet__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2704:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__ImportsAssignment_1 )* ) ;
    public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2708:1: ( ( ( rule__Stylesheet__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2709:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2709:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2710:1: ( rule__Stylesheet__ImportsAssignment_1 )*
            {
             before(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2711:1: ( rule__Stylesheet__ImportsAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=18 && LA37_0<=19)||LA37_0==59) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2711:2: rule__Stylesheet__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__ImportsAssignment_1_in_rule__Stylesheet__Group__1__Impl5896);
            	    rule__Stylesheet__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2721:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl ;
    public final void rule__Stylesheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2725:1: ( rule__Stylesheet__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2726:2: rule__Stylesheet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__25927);
            rule__Stylesheet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__2"


    // $ANTLR start "rule__Stylesheet__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2732:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__Alternatives_2 )* ) ;
    public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2736:1: ( ( ( rule__Stylesheet__Alternatives_2 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2737:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2737:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2738:1: ( rule__Stylesheet__Alternatives_2 )*
            {
             before(grammarAccess.getStylesheetAccess().getAlternatives_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2739:1: ( rule__Stylesheet__Alternatives_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_IDENT && LA38_0<=RULE_HASH)||(LA38_0>=20 && LA38_0<=24)||(LA38_0>=34 && LA38_0<=48)||(LA38_0>=52 && LA38_0<=55)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2739:2: rule__Stylesheet__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__Alternatives_2_in_rule__Stylesheet__Group__2__Impl5954);
            	    rule__Stylesheet__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__2__Impl"


    // $ANTLR start "rule__Charset__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2755:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2759:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2760:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__05991);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__05994);
            rule__Charset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__0"


    // $ANTLR start "rule__Charset__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2767:1: rule__Charset__Group__0__Impl : ( ( rule__Charset__Alternatives_0 ) ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2771:1: ( ( ( rule__Charset__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2772:1: ( ( rule__Charset__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2772:1: ( ( rule__Charset__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2773:1: ( rule__Charset__Alternatives_0 )
            {
             before(grammarAccess.getCharsetAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2774:1: ( rule__Charset__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2774:2: rule__Charset__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Charset__Alternatives_0_in_rule__Charset__Group__0__Impl6021);
            rule__Charset__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__0__Impl"


    // $ANTLR start "rule__Charset__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2784:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2788:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2789:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__16051);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__16054);
            rule__Charset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__1"


    // $ANTLR start "rule__Charset__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2796:1: rule__Charset__Group__1__Impl : ( ( rule__Charset__CharsetAssignment_1 ) ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2800:1: ( ( ( rule__Charset__CharsetAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2801:1: ( ( rule__Charset__CharsetAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2801:1: ( ( rule__Charset__CharsetAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2802:1: ( rule__Charset__CharsetAssignment_1 )
            {
             before(grammarAccess.getCharsetAccess().getCharsetAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2803:1: ( rule__Charset__CharsetAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2803:2: rule__Charset__CharsetAssignment_1
            {
            pushFollow(FOLLOW_rule__Charset__CharsetAssignment_1_in_rule__Charset__Group__1__Impl6081);
            rule__Charset__CharsetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getCharsetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__1__Impl"


    // $ANTLR start "rule__Charset__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2813:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2817:1: ( rule__Charset__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2818:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__26111);
            rule__Charset__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__2"


    // $ANTLR start "rule__Charset__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2824:1: rule__Charset__Group__2__Impl : ( ';' ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2828:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2829:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2829:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2830:1: ';'
            {
             before(grammarAccess.getCharsetAccess().getSemicolonKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__Charset__Group__2__Impl6139); 
             after(grammarAccess.getCharsetAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__2__Impl"


    // $ANTLR start "rule__ImportExpression__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2849:1: rule__ImportExpression__Group_0__0 : rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1 ;
    public final void rule__ImportExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2853:1: ( rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2854:2: rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__0__Impl_in_rule__ImportExpression__Group_0__06176);
            rule__ImportExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportExpression__Group_0__1_in_rule__ImportExpression__Group_0__06179);
            rule__ImportExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_0__0"


    // $ANTLR start "rule__ImportExpression__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2861:1: rule__ImportExpression__Group_0__0__Impl : ( ( rule__ImportExpression__Alternatives_0_0 ) ) ;
    public final void rule__ImportExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2865:1: ( ( ( rule__ImportExpression__Alternatives_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2866:1: ( ( rule__ImportExpression__Alternatives_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2866:1: ( ( rule__ImportExpression__Alternatives_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2867:1: ( rule__ImportExpression__Alternatives_0_0 )
            {
             before(grammarAccess.getImportExpressionAccess().getAlternatives_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2868:1: ( rule__ImportExpression__Alternatives_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2868:2: rule__ImportExpression__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__ImportExpression__Alternatives_0_0_in_rule__ImportExpression__Group_0__0__Impl6206);
            rule__ImportExpression__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportExpressionAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ImportExpression__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2878:1: rule__ImportExpression__Group_0__1 : rule__ImportExpression__Group_0__1__Impl ;
    public final void rule__ImportExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2882:1: ( rule__ImportExpression__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2883:2: rule__ImportExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__1__Impl_in_rule__ImportExpression__Group_0__16236);
            rule__ImportExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_0__1"


    // $ANTLR start "rule__ImportExpression__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2889:1: rule__ImportExpression__Group_0__1__Impl : ( ( rule__ImportExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__ImportExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2893:1: ( ( ( rule__ImportExpression__ValueAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2894:1: ( ( rule__ImportExpression__ValueAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2894:1: ( ( rule__ImportExpression__ValueAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2895:1: ( rule__ImportExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getImportExpressionAccess().getValueAssignment_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2896:1: ( rule__ImportExpression__ValueAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2896:2: rule__ImportExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ImportExpression__ValueAssignment_0_1_in_rule__ImportExpression__Group_0__1__Impl6263);
            rule__ImportExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getImportExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2910:1: rule__ImportExpression__Group_1__0 : rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1 ;
    public final void rule__ImportExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2914:1: ( rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2915:2: rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__0__Impl_in_rule__ImportExpression__Group_1__06297);
            rule__ImportExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportExpression__Group_1__1_in_rule__ImportExpression__Group_1__06300);
            rule__ImportExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_1__0"


    // $ANTLR start "rule__ImportExpression__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2922:1: rule__ImportExpression__Group_1__0__Impl : ( ruleURLType ) ;
    public final void rule__ImportExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2926:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2927:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2927:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2928:1: ruleURLType
            {
             before(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleURLType_in_rule__ImportExpression__Group_1__0__Impl6327);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2939:1: rule__ImportExpression__Group_1__1 : rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2 ;
    public final void rule__ImportExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2943:1: ( rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2944:2: rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__1__Impl_in_rule__ImportExpression__Group_1__16356);
            rule__ImportExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportExpression__Group_1__2_in_rule__ImportExpression__Group_1__16359);
            rule__ImportExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_1__1"


    // $ANTLR start "rule__ImportExpression__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2951:1: rule__ImportExpression__Group_1__1__Impl : ( ( rule__ImportExpression__MediaListAssignment_1_1 )? ) ;
    public final void rule__ImportExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2955:1: ( ( ( rule__ImportExpression__MediaListAssignment_1_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2956:1: ( ( rule__ImportExpression__MediaListAssignment_1_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2956:1: ( ( rule__ImportExpression__MediaListAssignment_1_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2957:1: ( rule__ImportExpression__MediaListAssignment_1_1 )?
            {
             before(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2958:1: ( rule__ImportExpression__MediaListAssignment_1_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_IDENT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2958:2: rule__ImportExpression__MediaListAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__MediaListAssignment_1_1_in_rule__ImportExpression__Group_1__1__Impl6386);
                    rule__ImportExpression__MediaListAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2968:1: rule__ImportExpression__Group_1__2 : rule__ImportExpression__Group_1__2__Impl ;
    public final void rule__ImportExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2972:1: ( rule__ImportExpression__Group_1__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2973:2: rule__ImportExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__2__Impl_in_rule__ImportExpression__Group_1__26417);
            rule__ImportExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_1__2"


    // $ANTLR start "rule__ImportExpression__Group_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2979:1: rule__ImportExpression__Group_1__2__Impl : ( ';' ) ;
    public final void rule__ImportExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2983:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2984:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2984:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2985:1: ';'
            {
             before(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2()); 
            match(input,49,FOLLOW_49_in_rule__ImportExpression__Group_1__2__Impl6445); 
             after(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3004:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3008:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3009:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__06482);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__06485);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3016:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3020:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3021:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3021:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3022:1: ()
            {
             before(grammarAccess.getPageAccess().getPageAction_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3023:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3025:1: 
            {
            }

             after(grammarAccess.getPageAccess().getPageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3035:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3039:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3040:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__16543);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__16546);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3047:1: rule__Page__Group__1__Impl : ( ( rule__Page__Alternatives_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3051:1: ( ( ( rule__Page__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3052:1: ( ( rule__Page__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3052:1: ( ( rule__Page__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3053:1: ( rule__Page__Alternatives_1 )
            {
             before(grammarAccess.getPageAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3054:1: ( rule__Page__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3054:2: rule__Page__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Page__Alternatives_1_in_rule__Page__Group__1__Impl6573);
            rule__Page__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3064:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3068:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3069:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__26603);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__26606);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3076:1: rule__Page__Group__2__Impl : ( ( rule__Page__PseudoPageAssignment_2 )? ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3080:1: ( ( ( rule__Page__PseudoPageAssignment_2 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3081:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3081:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3082:1: ( rule__Page__PseudoPageAssignment_2 )?
            {
             before(grammarAccess.getPageAccess().getPseudoPageAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3083:1: ( rule__Page__PseudoPageAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3083:2: rule__Page__PseudoPageAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Page__PseudoPageAssignment_2_in_rule__Page__Group__2__Impl6633);
                    rule__Page__PseudoPageAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getPseudoPageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3093:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3097:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3098:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__36664);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__36667);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3105:1: rule__Page__Group__3__Impl : ( '{' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3109:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3110:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3110:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3111:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__Page__Group__3__Impl6695); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3124:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3128:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3129:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__46726);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__46729);
            rule__Page__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3136:1: rule__Page__Group__4__Impl : ( ( rule__Page__DeclarationsAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3140:1: ( ( ( rule__Page__DeclarationsAssignment_4 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3141:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3141:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3142:1: ( rule__Page__DeclarationsAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getDeclarationsAssignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3143:1: ( rule__Page__DeclarationsAssignment_4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_IDENT||LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3143:2: rule__Page__DeclarationsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_4_in_rule__Page__Group__4__Impl6756);
                    rule__Page__DeclarationsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3153:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3157:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3158:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__56787);
            rule__Page__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__56790);
            rule__Page__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3165:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )* ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3169:1: ( ( ( rule__Page__Group_5__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3170:1: ( ( rule__Page__Group_5__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3170:1: ( ( rule__Page__Group_5__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3171:1: ( rule__Page__Group_5__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_5()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3172:1: ( rule__Page__Group_5__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==49) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3172:2: rule__Page__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl6817);
            	    rule__Page__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3182:1: rule__Page__Group__6 : rule__Page__Group__6__Impl ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3186:1: ( rule__Page__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3187:2: rule__Page__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__66848);
            rule__Page__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3193:1: rule__Page__Group__6__Impl : ( '}' ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3197:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3198:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3198:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3199:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,51,FOLLOW_51_in_rule__Page__Group__6__Impl6876); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group_5__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3226:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3230:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3231:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__06921);
            rule__Page__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__06924);
            rule__Page__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__0"


    // $ANTLR start "rule__Page__Group_5__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3238:1: rule__Page__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3242:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3243:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3243:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3244:1: ';'
            {
             before(grammarAccess.getPageAccess().getSemicolonKeyword_5_0()); 
            match(input,49,FOLLOW_49_in_rule__Page__Group_5__0__Impl6952); 
             after(grammarAccess.getPageAccess().getSemicolonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__0__Impl"


    // $ANTLR start "rule__Page__Group_5__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3257:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3261:1: ( rule__Page__Group_5__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3262:2: rule__Page__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__16983);
            rule__Page__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__1"


    // $ANTLR start "rule__Page__Group_5__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3268:1: rule__Page__Group_5__1__Impl : ( ( rule__Page__DeclarationsAssignment_5_1 )? ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3272:1: ( ( ( rule__Page__DeclarationsAssignment_5_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3273:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3273:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3274:1: ( rule__Page__DeclarationsAssignment_5_1 )?
            {
             before(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3275:1: ( rule__Page__DeclarationsAssignment_5_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_IDENT||LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3275:2: rule__Page__DeclarationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_5_1_in_rule__Page__Group_5__1__Impl7010);
                    rule__Page__DeclarationsAssignment_5_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__1__Impl"


    // $ANTLR start "rule__Pseudo_page__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3289:1: rule__Pseudo_page__Group__0 : rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 ;
    public final void rule__Pseudo_page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3293:1: ( rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3294:2: rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__0__Impl_in_rule__Pseudo_page__Group__07045);
            rule__Pseudo_page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pseudo_page__Group__1_in_rule__Pseudo_page__Group__07048);
            rule__Pseudo_page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo_page__Group__0"


    // $ANTLR start "rule__Pseudo_page__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3301:1: rule__Pseudo_page__Group__0__Impl : ( ':' ) ;
    public final void rule__Pseudo_page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3305:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3306:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3306:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3307:1: ':'
            {
             before(grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Pseudo_page__Group__0__Impl7076); 
             after(grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo_page__Group__0__Impl"


    // $ANTLR start "rule__Pseudo_page__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3320:1: rule__Pseudo_page__Group__1 : rule__Pseudo_page__Group__1__Impl ;
    public final void rule__Pseudo_page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3324:1: ( rule__Pseudo_page__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3325:2: rule__Pseudo_page__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__1__Impl_in_rule__Pseudo_page__Group__17107);
            rule__Pseudo_page__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo_page__Group__1"


    // $ANTLR start "rule__Pseudo_page__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3331:1: rule__Pseudo_page__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Pseudo_page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3335:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3336:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3336:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3337:1: RULE_IDENT
            {
             before(grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pseudo_page__Group__1__Impl7134); 
             after(grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pseudo_page__Group__1__Impl"


    // $ANTLR start "rule__Media__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3352:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
    public final void rule__Media__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3356:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3357:2: rule__Media__Group__0__Impl rule__Media__Group__1
            {
            pushFollow(FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__07167);
            rule__Media__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__1_in_rule__Media__Group__07170);
            rule__Media__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__0"


    // $ANTLR start "rule__Media__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3364:1: rule__Media__Group__0__Impl : ( ( rule__Media__Alternatives_0 ) ) ;
    public final void rule__Media__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3368:1: ( ( ( rule__Media__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3369:1: ( ( rule__Media__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3369:1: ( ( rule__Media__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3370:1: ( rule__Media__Alternatives_0 )
            {
             before(grammarAccess.getMediaAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3371:1: ( rule__Media__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3371:2: rule__Media__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Media__Alternatives_0_in_rule__Media__Group__0__Impl7197);
            rule__Media__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__0__Impl"


    // $ANTLR start "rule__Media__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3381:1: rule__Media__Group__1 : rule__Media__Group__1__Impl rule__Media__Group__2 ;
    public final void rule__Media__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3385:1: ( rule__Media__Group__1__Impl rule__Media__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3386:2: rule__Media__Group__1__Impl rule__Media__Group__2
            {
            pushFollow(FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__17227);
            rule__Media__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__2_in_rule__Media__Group__17230);
            rule__Media__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__1"


    // $ANTLR start "rule__Media__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3393:1: rule__Media__Group__1__Impl : ( ( rule__Media__MedialistAssignment_1 ) ) ;
    public final void rule__Media__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3397:1: ( ( ( rule__Media__MedialistAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3398:1: ( ( rule__Media__MedialistAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3398:1: ( ( rule__Media__MedialistAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3399:1: ( rule__Media__MedialistAssignment_1 )
            {
             before(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3400:1: ( rule__Media__MedialistAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3400:2: rule__Media__MedialistAssignment_1
            {
            pushFollow(FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl7257);
            rule__Media__MedialistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__1__Impl"


    // $ANTLR start "rule__Media__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3410:1: rule__Media__Group__2 : rule__Media__Group__2__Impl rule__Media__Group__3 ;
    public final void rule__Media__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3414:1: ( rule__Media__Group__2__Impl rule__Media__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3415:2: rule__Media__Group__2__Impl rule__Media__Group__3
            {
            pushFollow(FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__27287);
            rule__Media__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__3_in_rule__Media__Group__27290);
            rule__Media__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__2"


    // $ANTLR start "rule__Media__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3422:1: rule__Media__Group__2__Impl : ( '{' ) ;
    public final void rule__Media__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3426:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3427:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3427:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3428:1: '{'
            {
             before(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__Media__Group__2__Impl7318); 
             after(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__2__Impl"


    // $ANTLR start "rule__Media__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3441:1: rule__Media__Group__3 : rule__Media__Group__3__Impl rule__Media__Group__4 ;
    public final void rule__Media__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3445:1: ( rule__Media__Group__3__Impl rule__Media__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3446:2: rule__Media__Group__3__Impl rule__Media__Group__4
            {
            pushFollow(FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__37349);
            rule__Media__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__4_in_rule__Media__Group__37352);
            rule__Media__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__3"


    // $ANTLR start "rule__Media__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3453:1: rule__Media__Group__3__Impl : ( ( rule__Media__RulesetsAssignment_3 )* ) ;
    public final void rule__Media__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3457:1: ( ( ( rule__Media__RulesetsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3458:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3458:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3459:1: ( rule__Media__RulesetsAssignment_3 )*
            {
             before(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3460:1: ( rule__Media__RulesetsAssignment_3 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_IDENT && LA44_0<=RULE_HASH)||LA44_0==24||(LA44_0>=34 && LA44_0<=48)||(LA44_0>=52 && LA44_0<=55)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3460:2: rule__Media__RulesetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl7379);
            	    rule__Media__RulesetsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__3__Impl"


    // $ANTLR start "rule__Media__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3470:1: rule__Media__Group__4 : rule__Media__Group__4__Impl ;
    public final void rule__Media__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3474:1: ( rule__Media__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3475:2: rule__Media__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__47410);
            rule__Media__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__4"


    // $ANTLR start "rule__Media__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3481:1: rule__Media__Group__4__Impl : ( '}' ) ;
    public final void rule__Media__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3485:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3486:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3486:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3487:1: '}'
            {
             before(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__Media__Group__4__Impl7438); 
             after(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__4__Impl"


    // $ANTLR start "rule__Media_list__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3510:1: rule__Media_list__Group__0 : rule__Media_list__Group__0__Impl rule__Media_list__Group__1 ;
    public final void rule__Media_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3514:1: ( rule__Media_list__Group__0__Impl rule__Media_list__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3515:2: rule__Media_list__Group__0__Impl rule__Media_list__Group__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__07479);
            rule__Media_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__07482);
            rule__Media_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__0"


    // $ANTLR start "rule__Media_list__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3522:1: rule__Media_list__Group__0__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3526:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3527:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3527:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3528:1: rulemedium
            {
             before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl7509);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__0__Impl"


    // $ANTLR start "rule__Media_list__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3539:1: rule__Media_list__Group__1 : rule__Media_list__Group__1__Impl ;
    public final void rule__Media_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3543:1: ( rule__Media_list__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3544:2: rule__Media_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__17538);
            rule__Media_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__1"


    // $ANTLR start "rule__Media_list__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3550:1: rule__Media_list__Group__1__Impl : ( ( rule__Media_list__Group_1__0 )* ) ;
    public final void rule__Media_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3554:1: ( ( ( rule__Media_list__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3555:1: ( ( rule__Media_list__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3555:1: ( ( rule__Media_list__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3556:1: ( rule__Media_list__Group_1__0 )*
            {
             before(grammarAccess.getMedia_listAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3557:1: ( rule__Media_list__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3557:2: rule__Media_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl7565);
            	    rule__Media_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getMedia_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__1__Impl"


    // $ANTLR start "rule__Media_list__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3571:1: rule__Media_list__Group_1__0 : rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 ;
    public final void rule__Media_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3575:1: ( rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3576:2: rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__07600);
            rule__Media_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__07603);
            rule__Media_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__0"


    // $ANTLR start "rule__Media_list__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3583:1: rule__Media_list__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Media_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3587:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3588:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3588:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3589:1: RULE_COMMA
            {
             before(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl7630); 
             after(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__0__Impl"


    // $ANTLR start "rule__Media_list__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3600:1: rule__Media_list__Group_1__1 : rule__Media_list__Group_1__1__Impl ;
    public final void rule__Media_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3604:1: ( rule__Media_list__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3605:2: rule__Media_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__17659);
            rule__Media_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__1"


    // $ANTLR start "rule__Media_list__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3611:1: rule__Media_list__Group_1__1__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3615:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3616:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3616:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3617:1: rulemedium
            {
             before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl7686);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3632:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
    public final void rule__Ruleset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3636:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3637:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__07719);
            rule__Ruleset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__07722);
            rule__Ruleset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__0"


    // $ANTLR start "rule__Ruleset__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3644:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
    public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3648:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3649:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3649:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3650:1: ( rule__Ruleset__SelectorsAssignment_0 )
            {
             before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3651:1: ( rule__Ruleset__SelectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3651:2: rule__Ruleset__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl7749);
            rule__Ruleset__SelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__0__Impl"


    // $ANTLR start "rule__Ruleset__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3661:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
    public final void rule__Ruleset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3665:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3666:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__17779);
            rule__Ruleset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__17782);
            rule__Ruleset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__1"


    // $ANTLR start "rule__Ruleset__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3673:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
    public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3677:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3678:1: ( ( rule__Ruleset__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3678:1: ( ( rule__Ruleset__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3679:1: ( rule__Ruleset__Group_1__0 )*
            {
             before(grammarAccess.getRulesetAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3680:1: ( rule__Ruleset__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3680:2: rule__Ruleset__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl7809);
            	    rule__Ruleset__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getRulesetAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3690:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
    public final void rule__Ruleset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3694:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3695:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__27840);
            rule__Ruleset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__27843);
            rule__Ruleset__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__2"


    // $ANTLR start "rule__Ruleset__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3702:1: rule__Ruleset__Group__2__Impl : ( '{' ) ;
    public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3706:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3707:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3707:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3708:1: '{'
            {
             before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__Ruleset__Group__2__Impl7871); 
             after(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__2__Impl"


    // $ANTLR start "rule__Ruleset__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3721:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
    public final void rule__Ruleset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3725:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3726:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__37902);
            rule__Ruleset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__37905);
            rule__Ruleset__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__3"


    // $ANTLR start "rule__Ruleset__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3733:1: rule__Ruleset__Group__3__Impl : ( ( rule__Ruleset__Group_3__0 )* ) ;
    public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3737:1: ( ( ( rule__Ruleset__Group_3__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3738:1: ( ( rule__Ruleset__Group_3__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3738:1: ( ( rule__Ruleset__Group_3__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3739:1: ( rule__Ruleset__Group_3__0 )*
            {
             before(grammarAccess.getRulesetAccess().getGroup_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3740:1: ( rule__Ruleset__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_IDENT||LA47_0==30) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3740:2: rule__Ruleset__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_3__0_in_rule__Ruleset__Group__3__Impl7932);
            	    rule__Ruleset__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getRulesetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__3__Impl"


    // $ANTLR start "rule__Ruleset__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3750:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl ;
    public final void rule__Ruleset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3754:1: ( rule__Ruleset__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3755:2: rule__Ruleset__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__47963);
            rule__Ruleset__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__4"


    // $ANTLR start "rule__Ruleset__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3761:1: rule__Ruleset__Group__4__Impl : ( '}' ) ;
    public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3765:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3766:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3766:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3767:1: '}'
            {
             before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__Ruleset__Group__4__Impl7991); 
             after(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__4__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3790:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
    public final void rule__Ruleset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3794:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3795:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__08032);
            rule__Ruleset__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__08035);
            rule__Ruleset__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__0"


    // $ANTLR start "rule__Ruleset__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3802:1: rule__Ruleset__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3806:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3807:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3807:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3808:1: RULE_COMMA
            {
             before(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl8062); 
             after(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3819:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl ;
    public final void rule__Ruleset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3823:1: ( rule__Ruleset__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3824:2: rule__Ruleset__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__18091);
            rule__Ruleset__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__1"


    // $ANTLR start "rule__Ruleset__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3830:1: rule__Ruleset__Group_1__1__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) ;
    public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3834:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3835:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3835:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3836:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3837:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3837:2: rule__Ruleset__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl8118);
            rule__Ruleset__SelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3851:1: rule__Ruleset__Group_3__0 : rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1 ;
    public final void rule__Ruleset__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3855:1: ( rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3856:2: rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_3__0__Impl_in_rule__Ruleset__Group_3__08152);
            rule__Ruleset__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group_3__1_in_rule__Ruleset__Group_3__08155);
            rule__Ruleset__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__0"


    // $ANTLR start "rule__Ruleset__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3863:1: rule__Ruleset__Group_3__0__Impl : ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) ) ;
    public final void rule__Ruleset__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3867:1: ( ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3868:1: ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3868:1: ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3869:1: ( rule__Ruleset__DeclarationsAssignment_3_0 )
            {
             before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_3_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3870:1: ( rule__Ruleset__DeclarationsAssignment_3_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3870:2: rule__Ruleset__DeclarationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Ruleset__DeclarationsAssignment_3_0_in_rule__Ruleset__Group_3__0__Impl8182);
            rule__Ruleset__DeclarationsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3880:1: rule__Ruleset__Group_3__1 : rule__Ruleset__Group_3__1__Impl ;
    public final void rule__Ruleset__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3884:1: ( rule__Ruleset__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3885:2: rule__Ruleset__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_3__1__Impl_in_rule__Ruleset__Group_3__18212);
            rule__Ruleset__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__1"


    // $ANTLR start "rule__Ruleset__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3891:1: rule__Ruleset__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Ruleset__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3895:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3896:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3896:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3897:1: ';'
            {
             before(grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1()); 
            match(input,49,FOLLOW_49_in_rule__Ruleset__Group_3__1__Impl8240); 
             after(grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__1__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3914:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3918:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3919:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__08275);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__08278);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3926:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3930:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3931:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3931:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3932:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3933:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3933:2: rule__Selector__SimpleselectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl8305);
            rule__Selector__SimpleselectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3943:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3947:1: ( rule__Selector__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3948:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__18335);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3954:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3958:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3959:1: ( ( rule__Selector__Alternatives_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3959:1: ( ( rule__Selector__Alternatives_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3960:1: ( rule__Selector__Alternatives_1 )?
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3961:1: ( rule__Selector__Alternatives_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_WS||LA48_0==29||(LA48_0>=31 && LA48_0<=32)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3961:2: rule__Selector__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl8362);
                    rule__Selector__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3975:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
    public final void rule__Selector__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3979:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3980:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__08397);
            rule__Selector__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__08400);
            rule__Selector__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0"


    // $ANTLR start "rule__Selector__Group_1_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3987:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
    public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3991:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3992:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3992:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3993:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3994:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3994:2: rule__Selector__CombinatorAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl8427);
            rule__Selector__CombinatorAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4004:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl ;
    public final void rule__Selector__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4008:1: ( rule__Selector__Group_1_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4009:2: rule__Selector__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__18457);
            rule__Selector__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1"


    // $ANTLR start "rule__Selector__Group_1_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4015:1: rule__Selector__Group_1_0__1__Impl : ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4019:1: ( ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4020:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4020:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4021:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4022:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4022:2: rule__Selector__SelectorAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl8484);
            rule__Selector__SelectorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4036:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4040:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4041:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__08518);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__08521);
            rule__Selector__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4048:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4052:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4053:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4053:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4054:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4054:1: ( ( RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4055:1: ( RULE_WS )
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4056:1: ( RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4056:3: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl8551); 

            }

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4059:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4060:1: ( RULE_WS )*
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4061:1: ( RULE_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_WS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4061:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl8564); 

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4072:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4076:1: ( rule__Selector__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4077:2: rule__Selector__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__18597);
            rule__Selector__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4083:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )? ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4087:1: ( ( ( rule__Selector__Group_1_1_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4088:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4088:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4089:1: ( rule__Selector__Group_1_1_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4090:1: ( rule__Selector__Group_1_1_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_IDENT && LA50_0<=RULE_HASH)||LA50_0==24||LA50_0==29||(LA50_0>=31 && LA50_0<=32)||(LA50_0>=34 && LA50_0<=48)||(LA50_0>=52 && LA50_0<=55)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4090:2: rule__Selector__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl8624);
                    rule__Selector__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4104:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4108:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4109:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__08659);
            rule__Selector__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__08662);
            rule__Selector__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4116:1: rule__Selector__Group_1_1_1__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4120:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4121:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4121:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4122:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4123:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==29||(LA51_0>=31 && LA51_0<=32)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4123:2: rule__Selector__CombinatorAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl8689);
                    rule__Selector__CombinatorAssignment_1_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4133:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4137:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4138:2: rule__Selector__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__18720);
            rule__Selector__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4144:1: rule__Selector__Group_1_1_1__1__Impl : ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4148:1: ( ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4149:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4149:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4150:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4151:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4151:2: rule__Selector__SelectorAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl8747);
            rule__Selector__SelectorAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4165:1: rule__Simple_selector__Group_0__0 : rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 ;
    public final void rule__Simple_selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4169:1: ( rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4170:2: rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__08781);
            rule__Simple_selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__08784);
            rule__Simple_selector__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__0"


    // $ANTLR start "rule__Simple_selector__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4177:1: rule__Simple_selector__Group_0__0__Impl : ( ( rule__Simple_selector__Alternatives_0_0 ) ) ;
    public final void rule__Simple_selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4181:1: ( ( ( rule__Simple_selector__Alternatives_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4182:1: ( ( rule__Simple_selector__Alternatives_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4182:1: ( ( rule__Simple_selector__Alternatives_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4183:1: ( rule__Simple_selector__Alternatives_0_0 )
            {
             before(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4184:1: ( rule__Simple_selector__Alternatives_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4184:2: rule__Simple_selector__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_0_0_in_rule__Simple_selector__Group_0__0__Impl8811);
            rule__Simple_selector__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__0__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4194:1: rule__Simple_selector__Group_0__1 : rule__Simple_selector__Group_0__1__Impl ;
    public final void rule__Simple_selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4198:1: ( rule__Simple_selector__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4199:2: rule__Simple_selector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__18841);
            rule__Simple_selector__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__1"


    // $ANTLR start "rule__Simple_selector__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4205:1: rule__Simple_selector__Group_0__1__Impl : ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) ;
    public final void rule__Simple_selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4209:1: ( ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4210:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4210:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4211:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4212:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_HASH||LA52_0==52||(LA52_0>=54 && LA52_0<=55)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4212:2: rule__Simple_selector__SubSelectorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl8868);
            	    rule__Simple_selector__SubSelectorsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__1__Impl"


    // $ANTLR start "rule__Css_type_selector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4226:1: rule__Css_type_selector__Group__0 : rule__Css_type_selector__Group__0__Impl rule__Css_type_selector__Group__1 ;
    public final void rule__Css_type_selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4230:1: ( rule__Css_type_selector__Group__0__Impl rule__Css_type_selector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4231:2: rule__Css_type_selector__Group__0__Impl rule__Css_type_selector__Group__1
            {
            pushFollow(FOLLOW_rule__Css_type_selector__Group__0__Impl_in_rule__Css_type_selector__Group__08903);
            rule__Css_type_selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_type_selector__Group__1_in_rule__Css_type_selector__Group__08906);
            rule__Css_type_selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_type_selector__Group__0"


    // $ANTLR start "rule__Css_type_selector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4238:1: rule__Css_type_selector__Group__0__Impl : ( ( rulecss_namespace_prefix )? ) ;
    public final void rule__Css_type_selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4242:1: ( ( ( rulecss_namespace_prefix )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4243:1: ( ( rulecss_namespace_prefix )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4243:1: ( ( rulecss_namespace_prefix )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4244:1: ( rulecss_namespace_prefix )?
            {
             before(grammarAccess.getCss_type_selectorAccess().getCss_namespace_prefixParserRuleCall_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4245:1: ( rulecss_namespace_prefix )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_IDENT) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==53) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==24||LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4245:3: rulecss_namespace_prefix
                    {
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_rule__Css_type_selector__Group__0__Impl8934);
                    rulecss_namespace_prefix();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_type_selectorAccess().getCss_namespace_prefixParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_type_selector__Group__0__Impl"


    // $ANTLR start "rule__Css_type_selector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4255:1: rule__Css_type_selector__Group__1 : rule__Css_type_selector__Group__1__Impl ;
    public final void rule__Css_type_selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4259:1: ( rule__Css_type_selector__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4260:2: rule__Css_type_selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_type_selector__Group__1__Impl_in_rule__Css_type_selector__Group__18965);
            rule__Css_type_selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_type_selector__Group__1"


    // $ANTLR start "rule__Css_type_selector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4266:1: rule__Css_type_selector__Group__1__Impl : ( ruleelement_name ) ;
    public final void rule__Css_type_selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4270:1: ( ( ruleelement_name ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4271:1: ( ruleelement_name )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4271:1: ( ruleelement_name )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4272:1: ruleelement_name
            {
             before(grammarAccess.getCss_type_selectorAccess().getElement_nameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleelement_name_in_rule__Css_type_selector__Group__1__Impl8992);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getCss_type_selectorAccess().getElement_nameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_type_selector__Group__1__Impl"


    // $ANTLR start "rule__Css_namespace_prefix__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4287:1: rule__Css_namespace_prefix__Group__0 : rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1 ;
    public final void rule__Css_namespace_prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4291:1: ( rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4292:2: rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1
            {
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__0__Impl_in_rule__Css_namespace_prefix__Group__09025);
            rule__Css_namespace_prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__1_in_rule__Css_namespace_prefix__Group__09028);
            rule__Css_namespace_prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_namespace_prefix__Group__0"


    // $ANTLR start "rule__Css_namespace_prefix__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4299:1: rule__Css_namespace_prefix__Group__0__Impl : ( ( rule__Css_namespace_prefix__Alternatives_0 )? ) ;
    public final void rule__Css_namespace_prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4303:1: ( ( ( rule__Css_namespace_prefix__Alternatives_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4304:1: ( ( rule__Css_namespace_prefix__Alternatives_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4304:1: ( ( rule__Css_namespace_prefix__Alternatives_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4305:1: ( rule__Css_namespace_prefix__Alternatives_0 )?
            {
             before(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4306:1: ( rule__Css_namespace_prefix__Alternatives_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_IDENT||LA54_0==24) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4306:2: rule__Css_namespace_prefix__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Css_namespace_prefix__Alternatives_0_in_rule__Css_namespace_prefix__Group__0__Impl9055);
                    rule__Css_namespace_prefix__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_namespace_prefix__Group__0__Impl"


    // $ANTLR start "rule__Css_namespace_prefix__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4316:1: rule__Css_namespace_prefix__Group__1 : rule__Css_namespace_prefix__Group__1__Impl ;
    public final void rule__Css_namespace_prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4320:1: ( rule__Css_namespace_prefix__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4321:2: rule__Css_namespace_prefix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__1__Impl_in_rule__Css_namespace_prefix__Group__19086);
            rule__Css_namespace_prefix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_namespace_prefix__Group__1"


    // $ANTLR start "rule__Css_namespace_prefix__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4327:1: rule__Css_namespace_prefix__Group__1__Impl : ( '|' ) ;
    public final void rule__Css_namespace_prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4331:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4332:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4332:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4333:1: '|'
            {
             before(grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__Css_namespace_prefix__Group__1__Impl9114); 
             after(grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_namespace_prefix__Group__1__Impl"


    // $ANTLR start "rule__Css_universal__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4350:1: rule__Css_universal__Group__0 : rule__Css_universal__Group__0__Impl rule__Css_universal__Group__1 ;
    public final void rule__Css_universal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4354:1: ( rule__Css_universal__Group__0__Impl rule__Css_universal__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4355:2: rule__Css_universal__Group__0__Impl rule__Css_universal__Group__1
            {
            pushFollow(FOLLOW_rule__Css_universal__Group__0__Impl_in_rule__Css_universal__Group__09149);
            rule__Css_universal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_universal__Group__1_in_rule__Css_universal__Group__09152);
            rule__Css_universal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_universal__Group__0"


    // $ANTLR start "rule__Css_universal__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4362:1: rule__Css_universal__Group__0__Impl : ( ( rulecss_namespace_prefix )? ) ;
    public final void rule__Css_universal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4366:1: ( ( ( rulecss_namespace_prefix )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4367:1: ( ( rulecss_namespace_prefix )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4367:1: ( ( rulecss_namespace_prefix )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4368:1: ( rulecss_namespace_prefix )?
            {
             before(grammarAccess.getCss_universalAccess().getCss_namespace_prefixParserRuleCall_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4369:1: ( rulecss_namespace_prefix )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_IDENT||LA55_0==53) ) {
                alt55=1;
            }
            else if ( (LA55_0==24) ) {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==53) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4369:3: rulecss_namespace_prefix
                    {
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_rule__Css_universal__Group__0__Impl9180);
                    rulecss_namespace_prefix();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_universalAccess().getCss_namespace_prefixParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_universal__Group__0__Impl"


    // $ANTLR start "rule__Css_universal__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4379:1: rule__Css_universal__Group__1 : rule__Css_universal__Group__1__Impl ;
    public final void rule__Css_universal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4383:1: ( rule__Css_universal__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4384:2: rule__Css_universal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_universal__Group__1__Impl_in_rule__Css_universal__Group__19211);
            rule__Css_universal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_universal__Group__1"


    // $ANTLR start "rule__Css_universal__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4390:1: rule__Css_universal__Group__1__Impl : ( '*' ) ;
    public final void rule__Css_universal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4394:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4395:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4395:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4396:1: '*'
            {
             before(grammarAccess.getCss_universalAccess().getAsteriskKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Css_universal__Group__1__Impl9239); 
             after(grammarAccess.getCss_universalAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_universal__Group__1__Impl"


    // $ANTLR start "rule__Css_class__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4413:1: rule__Css_class__Group__0 : rule__Css_class__Group__0__Impl rule__Css_class__Group__1 ;
    public final void rule__Css_class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4417:1: ( rule__Css_class__Group__0__Impl rule__Css_class__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4418:2: rule__Css_class__Group__0__Impl rule__Css_class__Group__1
            {
            pushFollow(FOLLOW_rule__Css_class__Group__0__Impl_in_rule__Css_class__Group__09274);
            rule__Css_class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_class__Group__1_in_rule__Css_class__Group__09277);
            rule__Css_class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__0"


    // $ANTLR start "rule__Css_class__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4425:1: rule__Css_class__Group__0__Impl : ( '.' ) ;
    public final void rule__Css_class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4429:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4430:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4430:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4431:1: '.'
            {
             before(grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Css_class__Group__0__Impl9305); 
             after(grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__0__Impl"


    // $ANTLR start "rule__Css_class__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4444:1: rule__Css_class__Group__1 : rule__Css_class__Group__1__Impl ;
    public final void rule__Css_class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4448:1: ( rule__Css_class__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4449:2: rule__Css_class__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_class__Group__1__Impl_in_rule__Css_class__Group__19336);
            rule__Css_class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__1"


    // $ANTLR start "rule__Css_class__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4455:1: rule__Css_class__Group__1__Impl : ( ( rule__Css_class__Alternatives_1 ) ) ;
    public final void rule__Css_class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4459:1: ( ( ( rule__Css_class__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4460:1: ( ( rule__Css_class__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4460:1: ( ( rule__Css_class__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4461:1: ( rule__Css_class__Alternatives_1 )
            {
             before(grammarAccess.getCss_classAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4462:1: ( rule__Css_class__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4462:2: rule__Css_class__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_class__Alternatives_1_in_rule__Css_class__Group__1__Impl9363);
            rule__Css_class__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_classAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__1__Impl"


    // $ANTLR start "rule__Css_attrib__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4476:1: rule__Css_attrib__Group__0 : rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1 ;
    public final void rule__Css_attrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4480:1: ( rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4481:2: rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__0__Impl_in_rule__Css_attrib__Group__09397);
            rule__Css_attrib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__1_in_rule__Css_attrib__Group__09400);
            rule__Css_attrib__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__0"


    // $ANTLR start "rule__Css_attrib__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4488:1: rule__Css_attrib__Group__0__Impl : ( '[' ) ;
    public final void rule__Css_attrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4492:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4493:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4493:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4494:1: '['
            {
             before(grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__Css_attrib__Group__0__Impl9428); 
             after(grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__0__Impl"


    // $ANTLR start "rule__Css_attrib__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4507:1: rule__Css_attrib__Group__1 : rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2 ;
    public final void rule__Css_attrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4511:1: ( rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4512:2: rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__1__Impl_in_rule__Css_attrib__Group__19459);
            rule__Css_attrib__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__2_in_rule__Css_attrib__Group__19462);
            rule__Css_attrib__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__1"


    // $ANTLR start "rule__Css_attrib__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4519:1: rule__Css_attrib__Group__1__Impl : ( ( rule__Css_attrib__Alternatives_1 ) ) ;
    public final void rule__Css_attrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4523:1: ( ( ( rule__Css_attrib__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4524:1: ( ( rule__Css_attrib__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4524:1: ( ( rule__Css_attrib__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4525:1: ( rule__Css_attrib__Alternatives_1 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4526:1: ( rule__Css_attrib__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4526:2: rule__Css_attrib__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_1_in_rule__Css_attrib__Group__1__Impl9489);
            rule__Css_attrib__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__1__Impl"


    // $ANTLR start "rule__Css_attrib__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4536:1: rule__Css_attrib__Group__2 : rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3 ;
    public final void rule__Css_attrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4540:1: ( rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4541:2: rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__2__Impl_in_rule__Css_attrib__Group__29519);
            rule__Css_attrib__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__3_in_rule__Css_attrib__Group__29522);
            rule__Css_attrib__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__2"


    // $ANTLR start "rule__Css_attrib__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4548:1: rule__Css_attrib__Group__2__Impl : ( ( rule__Css_attrib__Group_2__0 )? ) ;
    public final void rule__Css_attrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4552:1: ( ( ( rule__Css_attrib__Group_2__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4553:1: ( ( rule__Css_attrib__Group_2__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4553:1: ( ( rule__Css_attrib__Group_2__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4554:1: ( rule__Css_attrib__Group_2__0 )?
            {
             before(grammarAccess.getCss_attribAccess().getGroup_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4555:1: ( rule__Css_attrib__Group_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_INCLUDES && LA56_0<=RULE_DASHMATCH)||(LA56_0>=25 && LA56_0<=28)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4555:2: rule__Css_attrib__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Css_attrib__Group_2__0_in_rule__Css_attrib__Group__2__Impl9549);
                    rule__Css_attrib__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_attribAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__2__Impl"


    // $ANTLR start "rule__Css_attrib__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4565:1: rule__Css_attrib__Group__3 : rule__Css_attrib__Group__3__Impl ;
    public final void rule__Css_attrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4569:1: ( rule__Css_attrib__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4570:2: rule__Css_attrib__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__3__Impl_in_rule__Css_attrib__Group__39580);
            rule__Css_attrib__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__3"


    // $ANTLR start "rule__Css_attrib__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4576:1: rule__Css_attrib__Group__3__Impl : ( ']' ) ;
    public final void rule__Css_attrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4580:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4581:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4581:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4582:1: ']'
            {
             before(grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 
            match(input,56,FOLLOW_56_in_rule__Css_attrib__Group__3__Impl9608); 
             after(grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__3__Impl"


    // $ANTLR start "rule__Css_attrib__Group_2__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4603:1: rule__Css_attrib__Group_2__0 : rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1 ;
    public final void rule__Css_attrib__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4607:1: ( rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4608:2: rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group_2__0__Impl_in_rule__Css_attrib__Group_2__09647);
            rule__Css_attrib__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group_2__1_in_rule__Css_attrib__Group_2__09650);
            rule__Css_attrib__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__0"


    // $ANTLR start "rule__Css_attrib__Group_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4615:1: rule__Css_attrib__Group_2__0__Impl : ( ( rule__Css_attrib__Alternatives_2_0 ) ) ;
    public final void rule__Css_attrib__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4619:1: ( ( ( rule__Css_attrib__Alternatives_2_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4620:1: ( ( rule__Css_attrib__Alternatives_2_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4620:1: ( ( rule__Css_attrib__Alternatives_2_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4621:1: ( rule__Css_attrib__Alternatives_2_0 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_2_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4622:1: ( rule__Css_attrib__Alternatives_2_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4622:2: rule__Css_attrib__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_0_in_rule__Css_attrib__Group_2__0__Impl9677);
            rule__Css_attrib__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__0__Impl"


    // $ANTLR start "rule__Css_attrib__Group_2__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4632:1: rule__Css_attrib__Group_2__1 : rule__Css_attrib__Group_2__1__Impl ;
    public final void rule__Css_attrib__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4636:1: ( rule__Css_attrib__Group_2__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4637:2: rule__Css_attrib__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group_2__1__Impl_in_rule__Css_attrib__Group_2__19707);
            rule__Css_attrib__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__1"


    // $ANTLR start "rule__Css_attrib__Group_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4643:1: rule__Css_attrib__Group_2__1__Impl : ( ( rule__Css_attrib__Alternatives_2_1 ) ) ;
    public final void rule__Css_attrib__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4647:1: ( ( ( rule__Css_attrib__Alternatives_2_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4648:1: ( ( rule__Css_attrib__Alternatives_2_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4648:1: ( ( rule__Css_attrib__Alternatives_2_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4649:1: ( rule__Css_attrib__Alternatives_2_1 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_2_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4650:1: ( rule__Css_attrib__Alternatives_2_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4650:2: rule__Css_attrib__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_1_in_rule__Css_attrib__Group_2__1__Impl9734);
            rule__Css_attrib__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__1__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4664:1: rule__Css_generic_declaration__Group__0 : rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1 ;
    public final void rule__Css_generic_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4668:1: ( rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4669:2: rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__0__Impl_in_rule__Css_generic_declaration__Group__09768);
            rule__Css_generic_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__1_in_rule__Css_generic_declaration__Group__09771);
            rule__Css_generic_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__0"


    // $ANTLR start "rule__Css_generic_declaration__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4676:1: rule__Css_generic_declaration__Group__0__Impl : ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) ) ;
    public final void rule__Css_generic_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4680:1: ( ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4681:1: ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4681:1: ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4682:1: ( rule__Css_generic_declaration__PropertyAssignment_0 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPropertyAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4683:1: ( rule__Css_generic_declaration__PropertyAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4683:2: rule__Css_generic_declaration__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__PropertyAssignment_0_in_rule__Css_generic_declaration__Group__0__Impl9798);
            rule__Css_generic_declaration__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCss_generic_declarationAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__0__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4693:1: rule__Css_generic_declaration__Group__1 : rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2 ;
    public final void rule__Css_generic_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4697:1: ( rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4698:2: rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__1__Impl_in_rule__Css_generic_declaration__Group__19828);
            rule__Css_generic_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__2_in_rule__Css_generic_declaration__Group__19831);
            rule__Css_generic_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__1"


    // $ANTLR start "rule__Css_generic_declaration__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4705:1: rule__Css_generic_declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Css_generic_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4709:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4710:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4710:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4711:1: ':'
            {
             before(grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__Css_generic_declaration__Group__1__Impl9859); 
             after(grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__1__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4724:1: rule__Css_generic_declaration__Group__2 : rule__Css_generic_declaration__Group__2__Impl rule__Css_generic_declaration__Group__3 ;
    public final void rule__Css_generic_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4728:1: ( rule__Css_generic_declaration__Group__2__Impl rule__Css_generic_declaration__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4729:2: rule__Css_generic_declaration__Group__2__Impl rule__Css_generic_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__2__Impl_in_rule__Css_generic_declaration__Group__29890);
            rule__Css_generic_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__3_in_rule__Css_generic_declaration__Group__29893);
            rule__Css_generic_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__2"


    // $ANTLR start "rule__Css_generic_declaration__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4736:1: rule__Css_generic_declaration__Group__2__Impl : ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) ) ;
    public final void rule__Css_generic_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4740:1: ( ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4741:1: ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4741:1: ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4742:1: ( rule__Css_generic_declaration__ExpressionAssignment_2 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getExpressionAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4743:1: ( rule__Css_generic_declaration__ExpressionAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4743:2: rule__Css_generic_declaration__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__ExpressionAssignment_2_in_rule__Css_generic_declaration__Group__2__Impl9920);
            rule__Css_generic_declaration__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCss_generic_declarationAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__2__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4753:1: rule__Css_generic_declaration__Group__3 : rule__Css_generic_declaration__Group__3__Impl ;
    public final void rule__Css_generic_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4757:1: ( rule__Css_generic_declaration__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4758:2: rule__Css_generic_declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__3__Impl_in_rule__Css_generic_declaration__Group__39950);
            rule__Css_generic_declaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__3"


    // $ANTLR start "rule__Css_generic_declaration__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4764:1: rule__Css_generic_declaration__Group__3__Impl : ( ( rule__Css_generic_declaration__PrioAssignment_3 )? ) ;
    public final void rule__Css_generic_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4768:1: ( ( ( rule__Css_generic_declaration__PrioAssignment_3 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4769:1: ( ( rule__Css_generic_declaration__PrioAssignment_3 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4769:1: ( ( rule__Css_generic_declaration__PrioAssignment_3 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4770:1: ( rule__Css_generic_declaration__PrioAssignment_3 )?
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPrioAssignment_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4771:1: ( rule__Css_generic_declaration__PrioAssignment_3 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==14) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4771:2: rule__Css_generic_declaration__PrioAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Css_generic_declaration__PrioAssignment_3_in_rule__Css_generic_declaration__Group__3__Impl9977);
                    rule__Css_generic_declaration__PrioAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_generic_declarationAccess().getPrioAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__3__Impl"


    // $ANTLR start "rule__Css_property__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4789:1: rule__Css_property__Group__0 : rule__Css_property__Group__0__Impl rule__Css_property__Group__1 ;
    public final void rule__Css_property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4793:1: ( rule__Css_property__Group__0__Impl rule__Css_property__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4794:2: rule__Css_property__Group__0__Impl rule__Css_property__Group__1
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__010016);
            rule__Css_property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__010019);
            rule__Css_property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__0"


    // $ANTLR start "rule__Css_property__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4801:1: rule__Css_property__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Css_property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4805:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4806:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4806:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4807:1: ( '-' )?
            {
             before(grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4808:1: ( '-' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4809:2: '-'
                    {
                    match(input,30,FOLLOW_30_in_rule__Css_property__Group__0__Impl10048); 

                    }
                    break;

            }

             after(grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__0__Impl"


    // $ANTLR start "rule__Css_property__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4820:1: rule__Css_property__Group__1 : rule__Css_property__Group__1__Impl ;
    public final void rule__Css_property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4824:1: ( rule__Css_property__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4825:2: rule__Css_property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__110081);
            rule__Css_property__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__1"


    // $ANTLR start "rule__Css_property__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4831:1: rule__Css_property__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Css_property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4835:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4836:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4836:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4837:1: RULE_IDENT
            {
             before(grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_property__Group__1__Impl10108); 
             after(grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__1__Impl"


    // $ANTLR start "rule__Css_pseudo__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4852:1: rule__Css_pseudo__Group__0 : rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1 ;
    public final void rule__Css_pseudo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4856:1: ( rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4857:2: rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__0__Impl_in_rule__Css_pseudo__Group__010141);
            rule__Css_pseudo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_pseudo__Group__1_in_rule__Css_pseudo__Group__010144);
            rule__Css_pseudo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__0"


    // $ANTLR start "rule__Css_pseudo__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4864:1: rule__Css_pseudo__Group__0__Impl : ( ':' ) ;
    public final void rule__Css_pseudo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4868:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4869:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4869:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4870:1: ':'
            {
             before(grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Css_pseudo__Group__0__Impl10172); 
             after(grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__0__Impl"


    // $ANTLR start "rule__Css_pseudo__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4883:1: rule__Css_pseudo__Group__1 : rule__Css_pseudo__Group__1__Impl rule__Css_pseudo__Group__2 ;
    public final void rule__Css_pseudo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4887:1: ( rule__Css_pseudo__Group__1__Impl rule__Css_pseudo__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4888:2: rule__Css_pseudo__Group__1__Impl rule__Css_pseudo__Group__2
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__1__Impl_in_rule__Css_pseudo__Group__110203);
            rule__Css_pseudo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_pseudo__Group__2_in_rule__Css_pseudo__Group__110206);
            rule__Css_pseudo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__1"


    // $ANTLR start "rule__Css_pseudo__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4895:1: rule__Css_pseudo__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__Css_pseudo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4899:1: ( ( ( ':' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4900:1: ( ( ':' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4900:1: ( ( ':' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4901:1: ( ':' )?
            {
             before(grammarAccess.getCss_pseudoAccess().getColonKeyword_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4902:1: ( ':' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==52) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4903:2: ':'
                    {
                    match(input,52,FOLLOW_52_in_rule__Css_pseudo__Group__1__Impl10235); 

                    }
                    break;

            }

             after(grammarAccess.getCss_pseudoAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__1__Impl"


    // $ANTLR start "rule__Css_pseudo__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4914:1: rule__Css_pseudo__Group__2 : rule__Css_pseudo__Group__2__Impl ;
    public final void rule__Css_pseudo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4918:1: ( rule__Css_pseudo__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4919:2: rule__Css_pseudo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__2__Impl_in_rule__Css_pseudo__Group__210268);
            rule__Css_pseudo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__2"


    // $ANTLR start "rule__Css_pseudo__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4925:1: rule__Css_pseudo__Group__2__Impl : ( ( rule__Css_pseudo__Alternatives_2 ) ) ;
    public final void rule__Css_pseudo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4929:1: ( ( ( rule__Css_pseudo__Alternatives_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4930:1: ( ( rule__Css_pseudo__Alternatives_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4930:1: ( ( rule__Css_pseudo__Alternatives_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4931:1: ( rule__Css_pseudo__Alternatives_2 )
            {
             before(grammarAccess.getCss_pseudoAccess().getAlternatives_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4932:1: ( rule__Css_pseudo__Alternatives_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4932:2: rule__Css_pseudo__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Alternatives_2_in_rule__Css_pseudo__Group__2__Impl10295);
            rule__Css_pseudo__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCss_pseudoAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__2__Impl"


    // $ANTLR start "rule__Css_negation__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4948:1: rule__Css_negation__Group__0 : rule__Css_negation__Group__0__Impl rule__Css_negation__Group__1 ;
    public final void rule__Css_negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4952:1: ( rule__Css_negation__Group__0__Impl rule__Css_negation__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4953:2: rule__Css_negation__Group__0__Impl rule__Css_negation__Group__1
            {
            pushFollow(FOLLOW_rule__Css_negation__Group__0__Impl_in_rule__Css_negation__Group__010331);
            rule__Css_negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_negation__Group__1_in_rule__Css_negation__Group__010334);
            rule__Css_negation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__0"


    // $ANTLR start "rule__Css_negation__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4960:1: rule__Css_negation__Group__0__Impl : ( ':' ) ;
    public final void rule__Css_negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4964:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4965:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4965:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4966:1: ':'
            {
             before(grammarAccess.getCss_negationAccess().getColonKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Css_negation__Group__0__Impl10362); 
             after(grammarAccess.getCss_negationAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__0__Impl"


    // $ANTLR start "rule__Css_negation__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4979:1: rule__Css_negation__Group__1 : rule__Css_negation__Group__1__Impl rule__Css_negation__Group__2 ;
    public final void rule__Css_negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4983:1: ( rule__Css_negation__Group__1__Impl rule__Css_negation__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4984:2: rule__Css_negation__Group__1__Impl rule__Css_negation__Group__2
            {
            pushFollow(FOLLOW_rule__Css_negation__Group__1__Impl_in_rule__Css_negation__Group__110393);
            rule__Css_negation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_negation__Group__2_in_rule__Css_negation__Group__110396);
            rule__Css_negation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__1"


    // $ANTLR start "rule__Css_negation__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4991:1: rule__Css_negation__Group__1__Impl : ( ( rule__Css_negation__NotAssignment_1 ) ) ;
    public final void rule__Css_negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4995:1: ( ( ( rule__Css_negation__NotAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4996:1: ( ( rule__Css_negation__NotAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4996:1: ( ( rule__Css_negation__NotAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4997:1: ( rule__Css_negation__NotAssignment_1 )
            {
             before(grammarAccess.getCss_negationAccess().getNotAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4998:1: ( rule__Css_negation__NotAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4998:2: rule__Css_negation__NotAssignment_1
            {
            pushFollow(FOLLOW_rule__Css_negation__NotAssignment_1_in_rule__Css_negation__Group__1__Impl10423);
            rule__Css_negation__NotAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_negationAccess().getNotAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__1__Impl"


    // $ANTLR start "rule__Css_negation__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5008:1: rule__Css_negation__Group__2 : rule__Css_negation__Group__2__Impl rule__Css_negation__Group__3 ;
    public final void rule__Css_negation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5012:1: ( rule__Css_negation__Group__2__Impl rule__Css_negation__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5013:2: rule__Css_negation__Group__2__Impl rule__Css_negation__Group__3
            {
            pushFollow(FOLLOW_rule__Css_negation__Group__2__Impl_in_rule__Css_negation__Group__210453);
            rule__Css_negation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_negation__Group__3_in_rule__Css_negation__Group__210456);
            rule__Css_negation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__2"


    // $ANTLR start "rule__Css_negation__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5020:1: rule__Css_negation__Group__2__Impl : ( ( rule__Css_negation__Negation_argAssignment_2 ) ) ;
    public final void rule__Css_negation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5024:1: ( ( ( rule__Css_negation__Negation_argAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5025:1: ( ( rule__Css_negation__Negation_argAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5025:1: ( ( rule__Css_negation__Negation_argAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5026:1: ( rule__Css_negation__Negation_argAssignment_2 )
            {
             before(grammarAccess.getCss_negationAccess().getNegation_argAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5027:1: ( rule__Css_negation__Negation_argAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5027:2: rule__Css_negation__Negation_argAssignment_2
            {
            pushFollow(FOLLOW_rule__Css_negation__Negation_argAssignment_2_in_rule__Css_negation__Group__2__Impl10483);
            rule__Css_negation__Negation_argAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCss_negationAccess().getNegation_argAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__2__Impl"


    // $ANTLR start "rule__Css_negation__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5037:1: rule__Css_negation__Group__3 : rule__Css_negation__Group__3__Impl ;
    public final void rule__Css_negation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5041:1: ( rule__Css_negation__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5042:2: rule__Css_negation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css_negation__Group__3__Impl_in_rule__Css_negation__Group__310513);
            rule__Css_negation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__3"


    // $ANTLR start "rule__Css_negation__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5048:1: rule__Css_negation__Group__3__Impl : ( ')' ) ;
    public final void rule__Css_negation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5052:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5053:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5053:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5054:1: ')'
            {
             before(grammarAccess.getCss_negationAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FOLLOW_57_in_rule__Css_negation__Group__3__Impl10541); 
             after(grammarAccess.getCss_negationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Group__3__Impl"


    // $ANTLR start "rule__Functional_pseudo__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5075:1: rule__Functional_pseudo__Group__0 : rule__Functional_pseudo__Group__0__Impl rule__Functional_pseudo__Group__1 ;
    public final void rule__Functional_pseudo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5079:1: ( rule__Functional_pseudo__Group__0__Impl rule__Functional_pseudo__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5080:2: rule__Functional_pseudo__Group__0__Impl rule__Functional_pseudo__Group__1
            {
            pushFollow(FOLLOW_rule__Functional_pseudo__Group__0__Impl_in_rule__Functional_pseudo__Group__010580);
            rule__Functional_pseudo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Functional_pseudo__Group__1_in_rule__Functional_pseudo__Group__010583);
            rule__Functional_pseudo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__0"


    // $ANTLR start "rule__Functional_pseudo__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5087:1: rule__Functional_pseudo__Group__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Functional_pseudo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5091:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5092:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5092:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5093:1: RULE_IDENT
            {
             before(grammarAccess.getFunctional_pseudoAccess().getIDENTTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Functional_pseudo__Group__0__Impl10610); 
             after(grammarAccess.getFunctional_pseudoAccess().getIDENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__0__Impl"


    // $ANTLR start "rule__Functional_pseudo__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5104:1: rule__Functional_pseudo__Group__1 : rule__Functional_pseudo__Group__1__Impl rule__Functional_pseudo__Group__2 ;
    public final void rule__Functional_pseudo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5108:1: ( rule__Functional_pseudo__Group__1__Impl rule__Functional_pseudo__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5109:2: rule__Functional_pseudo__Group__1__Impl rule__Functional_pseudo__Group__2
            {
            pushFollow(FOLLOW_rule__Functional_pseudo__Group__1__Impl_in_rule__Functional_pseudo__Group__110639);
            rule__Functional_pseudo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Functional_pseudo__Group__2_in_rule__Functional_pseudo__Group__110642);
            rule__Functional_pseudo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__1"


    // $ANTLR start "rule__Functional_pseudo__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5116:1: rule__Functional_pseudo__Group__1__Impl : ( '(' ) ;
    public final void rule__Functional_pseudo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5120:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5121:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5121:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5122:1: '('
            {
             before(grammarAccess.getFunctional_pseudoAccess().getLeftParenthesisKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__Functional_pseudo__Group__1__Impl10670); 
             after(grammarAccess.getFunctional_pseudoAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__1__Impl"


    // $ANTLR start "rule__Functional_pseudo__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5135:1: rule__Functional_pseudo__Group__2 : rule__Functional_pseudo__Group__2__Impl rule__Functional_pseudo__Group__3 ;
    public final void rule__Functional_pseudo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5139:1: ( rule__Functional_pseudo__Group__2__Impl rule__Functional_pseudo__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5140:2: rule__Functional_pseudo__Group__2__Impl rule__Functional_pseudo__Group__3
            {
            pushFollow(FOLLOW_rule__Functional_pseudo__Group__2__Impl_in_rule__Functional_pseudo__Group__210701);
            rule__Functional_pseudo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Functional_pseudo__Group__3_in_rule__Functional_pseudo__Group__210704);
            rule__Functional_pseudo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__2"


    // $ANTLR start "rule__Functional_pseudo__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5147:1: rule__Functional_pseudo__Group__2__Impl : ( rulefunction_expr ) ;
    public final void rule__Functional_pseudo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5151:1: ( ( rulefunction_expr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5152:1: ( rulefunction_expr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5152:1: ( rulefunction_expr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5153:1: rulefunction_expr
            {
             before(grammarAccess.getFunctional_pseudoAccess().getFunction_exprParserRuleCall_2()); 
            pushFollow(FOLLOW_rulefunction_expr_in_rule__Functional_pseudo__Group__2__Impl10731);
            rulefunction_expr();

            state._fsp--;

             after(grammarAccess.getFunctional_pseudoAccess().getFunction_exprParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__2__Impl"


    // $ANTLR start "rule__Functional_pseudo__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5164:1: rule__Functional_pseudo__Group__3 : rule__Functional_pseudo__Group__3__Impl ;
    public final void rule__Functional_pseudo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5168:1: ( rule__Functional_pseudo__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5169:2: rule__Functional_pseudo__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Functional_pseudo__Group__3__Impl_in_rule__Functional_pseudo__Group__310760);
            rule__Functional_pseudo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__3"


    // $ANTLR start "rule__Functional_pseudo__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5175:1: rule__Functional_pseudo__Group__3__Impl : ( ')' ) ;
    public final void rule__Functional_pseudo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5179:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5180:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5180:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5181:1: ')'
            {
             before(grammarAccess.getFunctional_pseudoAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FOLLOW_57_in_rule__Functional_pseudo__Group__3__Impl10788); 
             after(grammarAccess.getFunctional_pseudoAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functional_pseudo__Group__3__Impl"


    // $ANTLR start "rule__Combinator__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5202:1: rule__Combinator__Group__0 : rule__Combinator__Group__0__Impl rule__Combinator__Group__1 ;
    public final void rule__Combinator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5206:1: ( rule__Combinator__Group__0__Impl rule__Combinator__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5207:2: rule__Combinator__Group__0__Impl rule__Combinator__Group__1
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__010827);
            rule__Combinator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__010830);
            rule__Combinator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__0"


    // $ANTLR start "rule__Combinator__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5214:1: rule__Combinator__Group__0__Impl : ( ( rule__Combinator__Alternatives_0 ) ) ;
    public final void rule__Combinator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5218:1: ( ( ( rule__Combinator__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5219:1: ( ( rule__Combinator__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5219:1: ( ( rule__Combinator__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5220:1: ( rule__Combinator__Alternatives_0 )
            {
             before(grammarAccess.getCombinatorAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5221:1: ( rule__Combinator__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5221:2: rule__Combinator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl10857);
            rule__Combinator__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCombinatorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__0__Impl"


    // $ANTLR start "rule__Combinator__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5231:1: rule__Combinator__Group__1 : rule__Combinator__Group__1__Impl ;
    public final void rule__Combinator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5235:1: ( rule__Combinator__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5236:2: rule__Combinator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__110887);
            rule__Combinator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__1"


    // $ANTLR start "rule__Combinator__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5242:1: rule__Combinator__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Combinator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5246:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5247:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5247:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5248:1: ( RULE_WS )*
            {
             before(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5249:1: ( RULE_WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_WS) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5249:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl10915); 

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5263:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5267:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5268:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__010950);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__010953);
            rule__Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5275:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__TermGroupsAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5279:1: ( ( ( rule__Expr__TermGroupsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5280:1: ( ( rule__Expr__TermGroupsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5280:1: ( ( rule__Expr__TermGroupsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5281:1: ( rule__Expr__TermGroupsAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getTermGroupsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5282:1: ( rule__Expr__TermGroupsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5282:2: rule__Expr__TermGroupsAssignment_0
            {
            pushFollow(FOLLOW_rule__Expr__TermGroupsAssignment_0_in_rule__Expr__Group__0__Impl10980);
            rule__Expr__TermGroupsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getTermGroupsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5292:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5296:1: ( rule__Expr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5297:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__111010);
            rule__Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5303:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5307:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5308:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5308:1: ( ( rule__Expr__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5309:1: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5310:1: ( rule__Expr__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_COMMA||LA61_0==33) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5310:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl11037);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5324:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5328:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5329:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__011072);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__011075);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5336:1: rule__Expr__Group_1__0__Impl : ( ruleoperator ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5340:1: ( ( ruleoperator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5341:1: ( ruleoperator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5341:1: ( ruleoperator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5342:1: ruleoperator
            {
             before(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleoperator_in_rule__Expr__Group_1__0__Impl11102);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5353:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5357:1: ( rule__Expr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5358:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__111131);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5364:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__TermGroupsAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5368:1: ( ( ( rule__Expr__TermGroupsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5369:1: ( ( rule__Expr__TermGroupsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5369:1: ( ( rule__Expr__TermGroupsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5370:1: ( rule__Expr__TermGroupsAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getTermGroupsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5371:1: ( rule__Expr__TermGroupsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5371:2: rule__Expr__TermGroupsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__TermGroupsAssignment_1_1_in_rule__Expr__Group_1__1__Impl11158);
            rule__Expr__TermGroupsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getTermGroupsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__NumberTerm__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5385:1: rule__NumberTerm__Group__0 : rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1 ;
    public final void rule__NumberTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5389:1: ( rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5390:2: rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__0__Impl_in_rule__NumberTerm__Group__011192);
            rule__NumberTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberTerm__Group__1_in_rule__NumberTerm__Group__011195);
            rule__NumberTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__0"


    // $ANTLR start "rule__NumberTerm__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5397:1: rule__NumberTerm__Group__0__Impl : ( ( ruleunary_operator )? ) ;
    public final void rule__NumberTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5401:1: ( ( ( ruleunary_operator )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5402:1: ( ( ruleunary_operator )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5402:1: ( ( ruleunary_operator )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5403:1: ( ruleunary_operator )?
            {
             before(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5404:1: ( ruleunary_operator )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=29 && LA62_0<=30)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5404:3: ruleunary_operator
                    {
                    pushFollow(FOLLOW_ruleunary_operator_in_rule__NumberTerm__Group__0__Impl11223);
                    ruleunary_operator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__0__Impl"


    // $ANTLR start "rule__NumberTerm__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5414:1: rule__NumberTerm__Group__1 : rule__NumberTerm__Group__1__Impl ;
    public final void rule__NumberTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5418:1: ( rule__NumberTerm__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5419:2: rule__NumberTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__1__Impl_in_rule__NumberTerm__Group__111254);
            rule__NumberTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__1"


    // $ANTLR start "rule__NumberTerm__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5425:1: rule__NumberTerm__Group__1__Impl : ( ( rule__NumberTerm__Alternatives_1 ) ) ;
    public final void rule__NumberTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5429:1: ( ( ( rule__NumberTerm__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5430:1: ( ( rule__NumberTerm__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5430:1: ( ( rule__NumberTerm__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5431:1: ( rule__NumberTerm__Alternatives_1 )
            {
             before(grammarAccess.getNumberTermAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5432:1: ( rule__NumberTerm__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5432:2: rule__NumberTerm__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NumberTerm__Alternatives_1_in_rule__NumberTerm__Group__1__Impl11281);
            rule__NumberTerm__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberTermAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5446:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5450:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5451:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__011315);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__011318);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5458:1: rule__Function__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5462:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5463:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5463:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5464:1: ( '-' )?
            {
             before(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5465:1: ( '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==30) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5466:2: '-'
                    {
                    match(input,30,FOLLOW_30_in_rule__Function__Group__0__Impl11347); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5477:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5481:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5482:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__111380);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__111383);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5489:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5493:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5494:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5494:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5495:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5496:1: ( rule__Function__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5496:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl11410);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5506:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5510:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5511:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__211440);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__211443);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5518:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5522:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5523:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5523:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5524:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__Function__Group__2__Impl11471); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5537:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5541:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5542:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__311502);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__311505);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5549:1: rule__Function__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5553:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5554:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5554:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5555:1: ( RULE_WS )*
            {
             before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5556:1: ( RULE_WS )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_WS) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5556:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Function__Group__3__Impl11533); 

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5566:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5570:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5571:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__411564);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__411567);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5578:1: rule__Function__Group__4__Impl : ( ( rule__Function__ExpressionAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5582:1: ( ( ( rule__Function__ExpressionAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5583:1: ( ( rule__Function__ExpressionAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5583:1: ( ( rule__Function__ExpressionAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5584:1: ( rule__Function__ExpressionAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getExpressionAssignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5585:1: ( rule__Function__ExpressionAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5585:2: rule__Function__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__ExpressionAssignment_4_in_rule__Function__Group__4__Impl11594);
            rule__Function__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5595:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5599:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5600:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__511624);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__511627);
            rule__Function__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5607:1: rule__Function__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5611:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5612:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5612:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5613:1: ( RULE_WS )*
            {
             before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5614:1: ( RULE_WS )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_WS) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5614:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Function__Group__5__Impl11655); 

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5624:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5628:1: ( rule__Function__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5629:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__611686);
            rule__Function__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5635:1: rule__Function__Group__6__Impl : ( ')' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5639:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5640:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5640:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5641:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 
            match(input,57,FOLLOW_57_in_rule__Function__Group__6__Impl11714); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__URLType__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5668:1: rule__URLType__Group__0 : rule__URLType__Group__0__Impl rule__URLType__Group__1 ;
    public final void rule__URLType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5672:1: ( rule__URLType__Group__0__Impl rule__URLType__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5673:2: rule__URLType__Group__0__Impl rule__URLType__Group__1
            {
            pushFollow(FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__011759);
            rule__URLType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__011762);
            rule__URLType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__0"


    // $ANTLR start "rule__URLType__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5680:1: rule__URLType__Group__0__Impl : ( 'url' ) ;
    public final void rule__URLType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5684:1: ( ( 'url' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5685:1: ( 'url' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5685:1: ( 'url' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5686:1: 'url'
            {
             before(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__URLType__Group__0__Impl11790); 
             after(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__0__Impl"


    // $ANTLR start "rule__URLType__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5699:1: rule__URLType__Group__1 : rule__URLType__Group__1__Impl rule__URLType__Group__2 ;
    public final void rule__URLType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5703:1: ( rule__URLType__Group__1__Impl rule__URLType__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5704:2: rule__URLType__Group__1__Impl rule__URLType__Group__2
            {
            pushFollow(FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__111821);
            rule__URLType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__111824);
            rule__URLType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__1"


    // $ANTLR start "rule__URLType__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5711:1: rule__URLType__Group__1__Impl : ( '(' ) ;
    public final void rule__URLType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5715:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5716:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5716:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5717:1: '('
            {
             before(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__URLType__Group__1__Impl11852); 
             after(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__1__Impl"


    // $ANTLR start "rule__URLType__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5730:1: rule__URLType__Group__2 : rule__URLType__Group__2__Impl rule__URLType__Group__3 ;
    public final void rule__URLType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5734:1: ( rule__URLType__Group__2__Impl rule__URLType__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5735:2: rule__URLType__Group__2__Impl rule__URLType__Group__3
            {
            pushFollow(FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__211883);
            rule__URLType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__211886);
            rule__URLType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__2"


    // $ANTLR start "rule__URLType__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5742:1: rule__URLType__Group__2__Impl : ( ( rule__URLType__UrlAssignment_2 ) ) ;
    public final void rule__URLType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5746:1: ( ( ( rule__URLType__UrlAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5747:1: ( ( rule__URLType__UrlAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5747:1: ( ( rule__URLType__UrlAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5748:1: ( rule__URLType__UrlAssignment_2 )
            {
             before(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5749:1: ( rule__URLType__UrlAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5749:2: rule__URLType__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl11913);
            rule__URLType__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__2__Impl"


    // $ANTLR start "rule__URLType__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5759:1: rule__URLType__Group__3 : rule__URLType__Group__3__Impl ;
    public final void rule__URLType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5763:1: ( rule__URLType__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5764:2: rule__URLType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__311943);
            rule__URLType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__3"


    // $ANTLR start "rule__URLType__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5770:1: rule__URLType__Group__3__Impl : ( ')' ) ;
    public final void rule__URLType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5774:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5775:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5775:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5776:1: ')'
            {
             before(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FOLLOW_57_in_rule__URLType__Group__3__Impl11971); 
             after(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__3__Impl"


    // $ANTLR start "rule__PERCENTAGE__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5797:1: rule__PERCENTAGE__Group__0 : rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 ;
    public final void rule__PERCENTAGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5801:1: ( rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5802:2: rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__012010);
            rule__PERCENTAGE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__012013);
            rule__PERCENTAGE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__0"


    // $ANTLR start "rule__PERCENTAGE__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5809:1: rule__PERCENTAGE__Group__0__Impl : ( rulenum ) ;
    public final void rule__PERCENTAGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5813:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5814:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5814:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5815:1: rulenum
            {
             before(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__PERCENTAGE__Group__0__Impl12040);
            rulenum();

            state._fsp--;

             after(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__0__Impl"


    // $ANTLR start "rule__PERCENTAGE__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5826:1: rule__PERCENTAGE__Group__1 : rule__PERCENTAGE__Group__1__Impl ;
    public final void rule__PERCENTAGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5830:1: ( rule__PERCENTAGE__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5831:2: rule__PERCENTAGE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__112069);
            rule__PERCENTAGE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__1"


    // $ANTLR start "rule__PERCENTAGE__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5837:1: rule__PERCENTAGE__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENTAGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5841:1: ( ( '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5842:1: ( '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5842:1: ( '%' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5843:1: '%'
            {
             before(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__PERCENTAGE__Group__1__Impl12097); 
             after(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__1__Impl"


    // $ANTLR start "rule__EMS__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5860:1: rule__EMS__Group__0 : rule__EMS__Group__0__Impl rule__EMS__Group__1 ;
    public final void rule__EMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5864:1: ( rule__EMS__Group__0__Impl rule__EMS__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5865:2: rule__EMS__Group__0__Impl rule__EMS__Group__1
            {
            pushFollow(FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__012132);
            rule__EMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__012135);
            rule__EMS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__0"


    // $ANTLR start "rule__EMS__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5872:1: rule__EMS__Group__0__Impl : ( rulenum ) ;
    public final void rule__EMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5876:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5877:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5877:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5878:1: rulenum
            {
             before(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__EMS__Group__0__Impl12162);
            rulenum();

            state._fsp--;

             after(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__0__Impl"


    // $ANTLR start "rule__EMS__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5889:1: rule__EMS__Group__1 : rule__EMS__Group__1__Impl ;
    public final void rule__EMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5893:1: ( rule__EMS__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5894:2: rule__EMS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__112191);
            rule__EMS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__1"


    // $ANTLR start "rule__EMS__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5900:1: rule__EMS__Group__1__Impl : ( 'em' ) ;
    public final void rule__EMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5904:1: ( ( 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5905:1: ( 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5905:1: ( 'em' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5906:1: 'em'
            {
             before(grammarAccess.getEMSAccess().getEmKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__EMS__Group__1__Impl12219); 
             after(grammarAccess.getEMSAccess().getEmKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__1__Impl"


    // $ANTLR start "rule__EXS__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5923:1: rule__EXS__Group__0 : rule__EXS__Group__0__Impl rule__EXS__Group__1 ;
    public final void rule__EXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5927:1: ( rule__EXS__Group__0__Impl rule__EXS__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5928:2: rule__EXS__Group__0__Impl rule__EXS__Group__1
            {
            pushFollow(FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__012254);
            rule__EXS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__012257);
            rule__EXS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__0"


    // $ANTLR start "rule__EXS__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5935:1: rule__EXS__Group__0__Impl : ( rulenum ) ;
    public final void rule__EXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5939:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5940:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5940:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5941:1: rulenum
            {
             before(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__EXS__Group__0__Impl12284);
            rulenum();

            state._fsp--;

             after(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__0__Impl"


    // $ANTLR start "rule__EXS__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5952:1: rule__EXS__Group__1 : rule__EXS__Group__1__Impl ;
    public final void rule__EXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5956:1: ( rule__EXS__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5957:2: rule__EXS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__112313);
            rule__EXS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__1"


    // $ANTLR start "rule__EXS__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5963:1: rule__EXS__Group__1__Impl : ( 'ex' ) ;
    public final void rule__EXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5967:1: ( ( 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5968:1: ( 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5968:1: ( 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5969:1: 'ex'
            {
             before(grammarAccess.getEXSAccess().getExKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__EXS__Group__1__Impl12341); 
             after(grammarAccess.getEXSAccess().getExKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__1__Impl"


    // $ANTLR start "rule__LENGTH__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5986:1: rule__LENGTH__Group__0 : rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 ;
    public final void rule__LENGTH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5990:1: ( rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5991:2: rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__012376);
            rule__LENGTH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__012379);
            rule__LENGTH__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__0"


    // $ANTLR start "rule__LENGTH__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5998:1: rule__LENGTH__Group__0__Impl : ( rulenum ) ;
    public final void rule__LENGTH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6002:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6003:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6003:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6004:1: rulenum
            {
             before(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__LENGTH__Group__0__Impl12406);
            rulenum();

            state._fsp--;

             after(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__0__Impl"


    // $ANTLR start "rule__LENGTH__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6015:1: rule__LENGTH__Group__1 : rule__LENGTH__Group__1__Impl ;
    public final void rule__LENGTH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6019:1: ( rule__LENGTH__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6020:2: rule__LENGTH__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__112435);
            rule__LENGTH__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__1"


    // $ANTLR start "rule__LENGTH__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6026:1: rule__LENGTH__Group__1__Impl : ( ( rule__LENGTH__Alternatives_1 ) ) ;
    public final void rule__LENGTH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6030:1: ( ( ( rule__LENGTH__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6031:1: ( ( rule__LENGTH__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6031:1: ( ( rule__LENGTH__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6032:1: ( rule__LENGTH__Alternatives_1 )
            {
             before(grammarAccess.getLENGTHAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6033:1: ( rule__LENGTH__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6033:2: rule__LENGTH__Alternatives_1
            {
            pushFollow(FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl12462);
            rule__LENGTH__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLENGTHAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__1__Impl"


    // $ANTLR start "rule__ANGLE__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6047:1: rule__ANGLE__Group__0 : rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 ;
    public final void rule__ANGLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6051:1: ( rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6052:2: rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__012496);
            rule__ANGLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__012499);
            rule__ANGLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__0"


    // $ANTLR start "rule__ANGLE__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6059:1: rule__ANGLE__Group__0__Impl : ( rulenum ) ;
    public final void rule__ANGLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6063:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6064:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6064:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6065:1: rulenum
            {
             before(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__ANGLE__Group__0__Impl12526);
            rulenum();

            state._fsp--;

             after(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__0__Impl"


    // $ANTLR start "rule__ANGLE__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6076:1: rule__ANGLE__Group__1 : rule__ANGLE__Group__1__Impl ;
    public final void rule__ANGLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6080:1: ( rule__ANGLE__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6081:2: rule__ANGLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__112555);
            rule__ANGLE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__1"


    // $ANTLR start "rule__ANGLE__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6087:1: rule__ANGLE__Group__1__Impl : ( ( rule__ANGLE__Alternatives_1 ) ) ;
    public final void rule__ANGLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6091:1: ( ( ( rule__ANGLE__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6092:1: ( ( rule__ANGLE__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6092:1: ( ( rule__ANGLE__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6093:1: ( rule__ANGLE__Alternatives_1 )
            {
             before(grammarAccess.getANGLEAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6094:1: ( rule__ANGLE__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6094:2: rule__ANGLE__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl12582);
            rule__ANGLE__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getANGLEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__1__Impl"


    // $ANTLR start "rule__TIME__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6108:1: rule__TIME__Group__0 : rule__TIME__Group__0__Impl rule__TIME__Group__1 ;
    public final void rule__TIME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6112:1: ( rule__TIME__Group__0__Impl rule__TIME__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6113:2: rule__TIME__Group__0__Impl rule__TIME__Group__1
            {
            pushFollow(FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__012616);
            rule__TIME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__012619);
            rule__TIME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__0"


    // $ANTLR start "rule__TIME__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6120:1: rule__TIME__Group__0__Impl : ( rulenum ) ;
    public final void rule__TIME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6124:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6125:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6125:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6126:1: rulenum
            {
             before(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__TIME__Group__0__Impl12646);
            rulenum();

            state._fsp--;

             after(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__0__Impl"


    // $ANTLR start "rule__TIME__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6137:1: rule__TIME__Group__1 : rule__TIME__Group__1__Impl ;
    public final void rule__TIME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6141:1: ( rule__TIME__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6142:2: rule__TIME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__112675);
            rule__TIME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__1"


    // $ANTLR start "rule__TIME__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6148:1: rule__TIME__Group__1__Impl : ( ( rule__TIME__Alternatives_1 ) ) ;
    public final void rule__TIME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6152:1: ( ( ( rule__TIME__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6153:1: ( ( rule__TIME__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6153:1: ( ( rule__TIME__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6154:1: ( rule__TIME__Alternatives_1 )
            {
             before(grammarAccess.getTIMEAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6155:1: ( rule__TIME__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6155:2: rule__TIME__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl12702);
            rule__TIME__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__1__Impl"


    // $ANTLR start "rule__FREQ__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6169:1: rule__FREQ__Group__0 : rule__FREQ__Group__0__Impl rule__FREQ__Group__1 ;
    public final void rule__FREQ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6173:1: ( rule__FREQ__Group__0__Impl rule__FREQ__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6174:2: rule__FREQ__Group__0__Impl rule__FREQ__Group__1
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__012736);
            rule__FREQ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__012739);
            rule__FREQ__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__0"


    // $ANTLR start "rule__FREQ__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6181:1: rule__FREQ__Group__0__Impl : ( rulenum ) ;
    public final void rule__FREQ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6185:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6186:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6186:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6187:1: rulenum
            {
             before(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__FREQ__Group__0__Impl12766);
            rulenum();

            state._fsp--;

             after(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__0__Impl"


    // $ANTLR start "rule__FREQ__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6198:1: rule__FREQ__Group__1 : rule__FREQ__Group__1__Impl ;
    public final void rule__FREQ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6202:1: ( rule__FREQ__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6203:2: rule__FREQ__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__112795);
            rule__FREQ__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__1"


    // $ANTLR start "rule__FREQ__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6209:1: rule__FREQ__Group__1__Impl : ( ( rule__FREQ__Alternatives_1 ) ) ;
    public final void rule__FREQ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6213:1: ( ( ( rule__FREQ__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6214:1: ( ( rule__FREQ__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6214:1: ( ( rule__FREQ__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6215:1: ( rule__FREQ__Alternatives_1 )
            {
             before(grammarAccess.getFREQAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6216:1: ( rule__FREQ__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6216:2: rule__FREQ__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl12822);
            rule__FREQ__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFREQAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__CharsetAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6231:1: rule__Stylesheet__CharsetAssignment_0 : ( rulecharset ) ;
    public final void rule__Stylesheet__CharsetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6235:1: ( ( rulecharset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6236:1: ( rulecharset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6236:1: ( rulecharset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6237:1: rulecharset
            {
             before(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecharset_in_rule__Stylesheet__CharsetAssignment_012861);
            rulecharset();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__CharsetAssignment_0"


    // $ANTLR start "rule__Stylesheet__ImportsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6246:1: rule__Stylesheet__ImportsAssignment_1 : ( ruleimportExpression ) ;
    public final void rule__Stylesheet__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6250:1: ( ( ruleimportExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6251:1: ( ruleimportExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6251:1: ( ruleimportExpression )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6252:1: ruleimportExpression
            {
             before(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleimportExpression_in_rule__Stylesheet__ImportsAssignment_112892);
            ruleimportExpression();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__ImportsAssignment_1"


    // $ANTLR start "rule__Stylesheet__RulesetAssignment_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6261:1: rule__Stylesheet__RulesetAssignment_2_0 : ( ruleruleset ) ;
    public final void rule__Stylesheet__RulesetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6265:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6266:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6266:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6267:1: ruleruleset
            {
             before(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_2_012923);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__RulesetAssignment_2_0"


    // $ANTLR start "rule__Stylesheet__MediaAssignment_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6276:1: rule__Stylesheet__MediaAssignment_2_1 : ( rulemedia ) ;
    public final void rule__Stylesheet__MediaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6280:1: ( ( rulemedia ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6281:1: ( rulemedia )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6281:1: ( rulemedia )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6282:1: rulemedia
            {
             before(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_2_112954);
            rulemedia();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__MediaAssignment_2_1"


    // $ANTLR start "rule__Stylesheet__PageAssignment_2_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6291:1: rule__Stylesheet__PageAssignment_2_2 : ( rulepage ) ;
    public final void rule__Stylesheet__PageAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6295:1: ( ( rulepage ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6296:1: ( rulepage )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6296:1: ( rulepage )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6297:1: rulepage
            {
             before(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_rulepage_in_rule__Stylesheet__PageAssignment_2_212985);
            rulepage();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__PageAssignment_2_2"


    // $ANTLR start "rule__Charset__CharsetAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6306:1: rule__Charset__CharsetAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Charset__CharsetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6310:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6311:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6311:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6312:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__CharsetAssignment_113016); 
             after(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__CharsetAssignment_1"


    // $ANTLR start "rule__ImportExpression__ValueAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6321:1: rule__ImportExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__ImportExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6325:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6326:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6326:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6327:1: RULE_STRING
            {
             before(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportExpression__ValueAssignment_0_113047); 
             after(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__ImportExpression__MediaListAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6336:1: rule__ImportExpression__MediaListAssignment_1_1 : ( rulemedia_list ) ;
    public final void rule__ImportExpression__MediaListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6340:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6341:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6341:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6342:1: rulemedia_list
            {
             before(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulemedia_list_in_rule__ImportExpression__MediaListAssignment_1_113078);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportExpression__MediaListAssignment_1_1"


    // $ANTLR start "rule__Page__PseudoPageAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6351:1: rule__Page__PseudoPageAssignment_2 : ( rulepseudo_page ) ;
    public final void rule__Page__PseudoPageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6355:1: ( ( rulepseudo_page ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6356:1: ( rulepseudo_page )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6356:1: ( rulepseudo_page )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6357:1: rulepseudo_page
            {
             before(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulepseudo_page_in_rule__Page__PseudoPageAssignment_213109);
            rulepseudo_page();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__PseudoPageAssignment_2"


    // $ANTLR start "rule__Page__DeclarationsAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6366:1: rule__Page__DeclarationsAssignment_4 : ( rulecss_generic_declaration ) ;
    public final void rule__Page__DeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6370:1: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6371:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6371:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6372:1: rulecss_generic_declaration
            {
             before(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_413140);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__DeclarationsAssignment_4"


    // $ANTLR start "rule__Page__DeclarationsAssignment_5_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6381:1: rule__Page__DeclarationsAssignment_5_1 : ( rulecss_generic_declaration ) ;
    public final void rule__Page__DeclarationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6385:1: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6386:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6386:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6387:1: rulecss_generic_declaration
            {
             before(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_5_113171);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__DeclarationsAssignment_5_1"


    // $ANTLR start "rule__Media__MedialistAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6396:1: rule__Media__MedialistAssignment_1 : ( rulemedia_list ) ;
    public final void rule__Media__MedialistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6400:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6401:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6401:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6402:1: rulemedia_list
            {
             before(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_113202);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__MedialistAssignment_1"


    // $ANTLR start "rule__Media__RulesetsAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6411:1: rule__Media__RulesetsAssignment_3 : ( ruleruleset ) ;
    public final void rule__Media__RulesetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6415:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6416:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6416:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6417:1: ruleruleset
            {
             before(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_313233);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__RulesetsAssignment_3"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6426:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6430:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6431:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6431:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6432:1: ruleselector
            {
             before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_013264);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_0"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6441:1: rule__Ruleset__SelectorsAssignment_1_1 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6445:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6446:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6446:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6447:1: ruleselector
            {
             before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_113295);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_1_1"


    // $ANTLR start "rule__Ruleset__DeclarationsAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6456:1: rule__Ruleset__DeclarationsAssignment_3_0 : ( rulecss_declaration ) ;
    public final void rule__Ruleset__DeclarationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6460:1: ( ( rulecss_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6461:1: ( rulecss_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6461:1: ( rulecss_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6462:1: rulecss_declaration
            {
             before(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_3_013326);
            rulecss_declaration();

            state._fsp--;

             after(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__DeclarationsAssignment_3_0"


    // $ANTLR start "rule__Selector__SimpleselectorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6471:1: rule__Selector__SimpleselectorsAssignment_0 : ( rulesimple_selector ) ;
    public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6475:1: ( ( rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6476:1: ( rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6476:1: ( rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6477:1: rulesimple_selector
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_013357);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SimpleselectorsAssignment_0"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6486:1: rule__Selector__CombinatorAssignment_1_0_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6490:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6491:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6491:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6492:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_013388);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_0_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6501:1: rule__Selector__SelectorAssignment_1_0_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6505:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6506:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6506:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6507:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_113419);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_0_1"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_1_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6516:1: rule__Selector__CombinatorAssignment_1_1_1_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6520:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6521:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6521:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6522:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_013450);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_1_1_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6531:1: rule__Selector__SelectorAssignment_1_1_1_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6535:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6536:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6536:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6537:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_113481);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_1_1_1"


    // $ANTLR start "rule__Simple_selector__ElementAssignment_0_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6546:1: rule__Simple_selector__ElementAssignment_0_0_0 : ( ruleelement_name ) ;
    public final void rule__Simple_selector__ElementAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6550:1: ( ( ruleelement_name ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6551:1: ( ruleelement_name )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6551:1: ( ruleelement_name )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6552:1: ruleelement_name
            {
             before(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_0_013512);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__ElementAssignment_0_0_0"


    // $ANTLR start "rule__Simple_selector__UniversalAssignment_0_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6561:1: rule__Simple_selector__UniversalAssignment_0_0_1 : ( rulecss_universal ) ;
    public final void rule__Simple_selector__UniversalAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6565:1: ( ( rulecss_universal ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6566:1: ( rulecss_universal )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6566:1: ( rulecss_universal )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6567:1: rulecss_universal
            {
             before(grammarAccess.getSimple_selectorAccess().getUniversalCss_universalParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_rulecss_universal_in_rule__Simple_selector__UniversalAssignment_0_0_113543);
            rulecss_universal();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getUniversalCss_universalParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__UniversalAssignment_0_0_1"


    // $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6576:1: rule__Simple_selector__SubSelectorsAssignment_0_1 : ( rulesub_selector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6580:1: ( ( rulesub_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6581:1: ( rulesub_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6581:1: ( rulesub_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6582:1: rulesub_selector
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_0_113574);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_0_1"


    // $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6591:1: rule__Simple_selector__SubSelectorsAssignment_1 : ( rulesub_selector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6595:1: ( ( rulesub_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6596:1: ( rulesub_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6596:1: ( rulesub_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6597:1: rulesub_selector
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_113605);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_1"


    // $ANTLR start "rule__Sub_selector__IdAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6606:1: rule__Sub_selector__IdAssignment_0 : ( rulecss_id ) ;
    public final void rule__Sub_selector__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6610:1: ( ( rulecss_id ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6611:1: ( rulecss_id )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6611:1: ( rulecss_id )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6612:1: rulecss_id
            {
             before(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecss_id_in_rule__Sub_selector__IdAssignment_013636);
            rulecss_id();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__IdAssignment_0"


    // $ANTLR start "rule__Sub_selector__ClassAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6621:1: rule__Sub_selector__ClassAssignment_1 : ( rulecss_class ) ;
    public final void rule__Sub_selector__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6625:1: ( ( rulecss_class ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6626:1: ( rulecss_class )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6626:1: ( rulecss_class )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6627:1: rulecss_class
            {
             before(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecss_class_in_rule__Sub_selector__ClassAssignment_113667);
            rulecss_class();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__ClassAssignment_1"


    // $ANTLR start "rule__Sub_selector__AttribAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6636:1: rule__Sub_selector__AttribAssignment_2 : ( rulecss_attrib ) ;
    public final void rule__Sub_selector__AttribAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6640:1: ( ( rulecss_attrib ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6641:1: ( rulecss_attrib )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6641:1: ( rulecss_attrib )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6642:1: rulecss_attrib
            {
             before(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_attrib_in_rule__Sub_selector__AttribAssignment_213698);
            rulecss_attrib();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__AttribAssignment_2"


    // $ANTLR start "rule__Sub_selector__PseudoclassAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6651:1: rule__Sub_selector__PseudoclassAssignment_3 : ( rulecss_pseudo ) ;
    public final void rule__Sub_selector__PseudoclassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6655:1: ( ( rulecss_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6656:1: ( rulecss_pseudo )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6656:1: ( rulecss_pseudo )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6657:1: rulecss_pseudo
            {
             before(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_rule__Sub_selector__PseudoclassAssignment_313729);
            rulecss_pseudo();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__PseudoclassAssignment_3"


    // $ANTLR start "rule__Sub_selector__NegotationAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6666:1: rule__Sub_selector__NegotationAssignment_4 : ( rulecss_negation ) ;
    public final void rule__Sub_selector__NegotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6670:1: ( ( rulecss_negation ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6671:1: ( rulecss_negation )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6671:1: ( rulecss_negation )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6672:1: rulecss_negation
            {
             before(grammarAccess.getSub_selectorAccess().getNegotationCss_negationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulecss_negation_in_rule__Sub_selector__NegotationAssignment_413760);
            rulecss_negation();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getNegotationCss_negationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__NegotationAssignment_4"


    // $ANTLR start "rule__Css_generic_declaration__PropertyAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6681:1: rule__Css_generic_declaration__PropertyAssignment_0 : ( rulecss_property ) ;
    public final void rule__Css_generic_declaration__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6685:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6686:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6686:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6687:1: rulecss_property
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecss_property_in_rule__Css_generic_declaration__PropertyAssignment_013791);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__PropertyAssignment_0"


    // $ANTLR start "rule__Css_generic_declaration__ExpressionAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6696:1: rule__Css_generic_declaration__ExpressionAssignment_2 : ( ruleexpr ) ;
    public final void rule__Css_generic_declaration__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6700:1: ( ( ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6701:1: ( ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6701:1: ( ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6702:1: ruleexpr
            {
             before(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Css_generic_declaration__ExpressionAssignment_213822);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__ExpressionAssignment_2"


    // $ANTLR start "rule__Css_generic_declaration__PrioAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6711:1: rule__Css_generic_declaration__PrioAssignment_3 : ( rulecss_prio ) ;
    public final void rule__Css_generic_declaration__PrioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6715:1: ( ( rulecss_prio ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6716:1: ( rulecss_prio )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6716:1: ( rulecss_prio )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6717:1: rulecss_prio
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPrioCss_prioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulecss_prio_in_rule__Css_generic_declaration__PrioAssignment_313853);
            rulecss_prio();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationAccess().getPrioCss_prioParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__PrioAssignment_3"


    // $ANTLR start "rule__Css_negation__NotAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6726:1: rule__Css_negation__NotAssignment_1 : ( rulecss_not ) ;
    public final void rule__Css_negation__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6730:1: ( ( rulecss_not ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6731:1: ( rulecss_not )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6731:1: ( rulecss_not )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6732:1: rulecss_not
            {
             before(grammarAccess.getCss_negationAccess().getNotCss_notEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecss_not_in_rule__Css_negation__NotAssignment_113884);
            rulecss_not();

            state._fsp--;

             after(grammarAccess.getCss_negationAccess().getNotCss_notEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__NotAssignment_1"


    // $ANTLR start "rule__Css_negation__Negation_argAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6741:1: rule__Css_negation__Negation_argAssignment_2 : ( rulecss_negation_arg ) ;
    public final void rule__Css_negation__Negation_argAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6745:1: ( ( rulecss_negation_arg ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6746:1: ( rulecss_negation_arg )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6746:1: ( rulecss_negation_arg )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6747:1: rulecss_negation_arg
            {
             before(grammarAccess.getCss_negationAccess().getNegation_argCss_negation_argParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_negation_arg_in_rule__Css_negation__Negation_argAssignment_213915);
            rulecss_negation_arg();

            state._fsp--;

             after(grammarAccess.getCss_negationAccess().getNegation_argCss_negation_argParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_negation__Negation_argAssignment_2"


    // $ANTLR start "rule__Expr__TermGroupsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6756:1: rule__Expr__TermGroupsAssignment_0 : ( ruletermGroup ) ;
    public final void rule__Expr__TermGroupsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6760:1: ( ( ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6761:1: ( ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6761:1: ( ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6762:1: ruletermGroup
            {
             before(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_013946);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TermGroupsAssignment_0"


    // $ANTLR start "rule__Expr__TermGroupsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6771:1: rule__Expr__TermGroupsAssignment_1_1 : ( ruletermGroup ) ;
    public final void rule__Expr__TermGroupsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6775:1: ( ( ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6776:1: ( ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6776:1: ( ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6777:1: ruletermGroup
            {
             before(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_1_113977);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TermGroupsAssignment_1_1"


    // $ANTLR start "rule__TermGroup__TermsAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6786:1: rule__TermGroup__TermsAssignment : ( ruleterm ) ;
    public final void rule__TermGroup__TermsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6790:1: ( ( ruleterm ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6791:1: ( ruleterm )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6791:1: ( ruleterm )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6792:1: ruleterm
            {
             before(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleterm_in_rule__TermGroup__TermsAssignment14008);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermGroup__TermsAssignment"


    // $ANTLR start "rule__Term__NumberAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6801:1: rule__Term__NumberAssignment_0 : ( rulenumberTerm ) ;
    public final void rule__Term__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6805:1: ( ( rulenumberTerm ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6806:1: ( rulenumberTerm )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6806:1: ( rulenumberTerm )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6807:1: rulenumberTerm
            {
             before(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulenumberTerm_in_rule__Term__NumberAssignment_014039);
            rulenumberTerm();

            state._fsp--;

             after(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__NumberAssignment_0"


    // $ANTLR start "rule__Term__StringValueAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6816:1: rule__Term__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Term__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6820:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6821:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6821:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6822:1: RULE_STRING
            {
             before(grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__StringValueAssignment_114070); 
             after(grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__StringValueAssignment_1"


    // $ANTLR start "rule__Term__IdentifierAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6831:1: rule__Term__IdentifierAssignment_2 : ( rulecss_property ) ;
    public final void rule__Term__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6835:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6836:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6836:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6837:1: rulecss_property
            {
             before(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_property_in_rule__Term__IdentifierAssignment_214101);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__IdentifierAssignment_2"


    // $ANTLR start "rule__Term__UrlAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6846:1: rule__Term__UrlAssignment_3 : ( ruleURLType ) ;
    public final void rule__Term__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6850:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6851:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6851:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6852:1: ruleURLType
            {
             before(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURLType_in_rule__Term__UrlAssignment_314132);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__UrlAssignment_3"


    // $ANTLR start "rule__Term__FunctionAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6861:1: rule__Term__FunctionAssignment_4 : ( rulefunction ) ;
    public final void rule__Term__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6865:1: ( ( rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6866:1: ( rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6866:1: ( rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6867:1: rulefunction
            {
             before(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_414163);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FunctionAssignment_4"


    // $ANTLR start "rule__Term__HexColorAssignment_5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6876:1: rule__Term__HexColorAssignment_5 : ( ruleHexColor ) ;
    public final void rule__Term__HexColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6880:1: ( ( ruleHexColor ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6881:1: ( ruleHexColor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6881:1: ( ruleHexColor )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6882:1: ruleHexColor
            {
             before(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHexColor_in_rule__Term__HexColorAssignment_514194);
            ruleHexColor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__HexColorAssignment_5"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6891:1: rule__Function__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6895:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6896:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6896:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6897:1: RULE_IDENT
            {
             before(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_114225); 
             after(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__ExpressionAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6906:1: rule__Function__ExpressionAssignment_4 : ( ruleexpr ) ;
    public final void rule__Function__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6910:1: ( ( ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6911:1: ( ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6911:1: ( ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6912:1: ruleexpr
            {
             before(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Function__ExpressionAssignment_414256);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExpressionAssignment_4"


    // $ANTLR start "rule__URLType__UrlAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6921:1: rule__URLType__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__URLType__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6925:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6926:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6926:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6927:1: RULE_STRING
            {
             before(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_214287); 
             after(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__UrlAssignment_2"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA22_eotS =
        "\12\uffff";
    static final String DFA22_eofS =
        "\1\uffff\1\4\1\11\7\uffff";
    static final String DFA22_minS =
        "\1\4\2\65\1\4\6\uffff";
    static final String DFA22_maxS =
        "\1\67\2\71\1\60\6\uffff";
    static final String DFA22_acceptS =
        "\4\uffff\1\1\1\3\1\4\1\5\1\6\1\2";
    static final String DFA22_specialS =
        "\12\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\5\22\uffff\1\2\11\uffff\17\4\3\uffff\1\10\1\3\1\6\1\7",
            "\1\3\3\uffff\1\4",
            "\1\3\3\uffff\1\11",
            "\1\4\23\uffff\1\11\11\uffff\17\4",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "2029:1: rule__Css_negation_arg__Alternatives : ( ( rulecss_type_selector ) | ( rulecss_universal ) | ( RULE_HASH ) | ( rulecss_class ) | ( rulecss_attrib ) | ( rulecss_pseudo ) );";
        }
    }
    static final String DFA24_eotS =
        "\12\uffff";
    static final String DFA24_eofS =
        "\12\uffff";
    static final String DFA24_minS =
        "\1\12\2\42\7\uffff";
    static final String DFA24_maxS =
        "\1\13\2\74\7\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\7\1\3\1\6\1\1\1\2\1\5\1\4";
    static final String DFA24_specialS =
        "\12\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\2",
            "\6\7\3\10\2\5\2\3\1\4\1\11\13\uffff\1\6",
            "\6\7\3\10\2\5\2\3\1\4\1\11\13\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2125:1: rule__DIMENSION__Alternatives : ( ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );";
        }
    }
    static final String DFA29_eotS =
        "\13\uffff";
    static final String DFA29_eofS =
        "\1\uffff\2\6\10\uffff";
    static final String DFA29_minS =
        "\1\12\2\4\10\uffff";
    static final String DFA29_maxS =
        "\1\13\2\74\10\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\1\2\1\5\1\4\1\1\1\7\1\3\1\10\1\6";
    static final String DFA29_specialS =
        "\13\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\2",
            "\2\6\2\uffff\5\6\1\uffff\1\6\16\uffff\2\6\2\uffff\1\6\6\10"+
            "\3\12\2\7\2\11\1\5\1\4\1\6\1\uffff\1\6\5\uffff\1\6\1\uffff\1"+
            "\6\1\3",
            "\2\6\2\uffff\5\6\1\uffff\1\6\16\uffff\2\6\2\uffff\1\6\6\10"+
            "\3\12\2\7\2\11\1\5\1\4\1\6\1\uffff\1\6\5\uffff\1\6\1\uffff\1"+
            "\6\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2307:1: rule__NumberTerm__Alternatives_1 : ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0_in_rulecharset154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Alternatives_in_ruleimportExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulepage274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__0_in_rulepseudo_page334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0_in_rulemedia394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0_in_rulemedia_list454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0_in_ruleruleset573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleselector642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__Alternatives_in_rulesub_selector822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_type_selector_in_entryRulecss_type_selector849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_type_selector856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_type_selector__Group__0_in_rulecss_type_selector882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__0_in_rulecss_namespace_prefix942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_entryRulecss_universal969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_universal976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_universal__Group__0_in_rulecss_universal1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__0_in_rulecss_class1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_id1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__0_in_rulecss_attrib1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_generic_declaration1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__0_in_rulecss_generic_declaration1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_entryRulecss_prio1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_prio1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0_in_rulecss_property1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__0_in_rulecss_pseudo1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_in_entryRulecss_negation1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_negation1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__0_in_rulecss_negation1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_arg_in_entryRulecss_negation_arg1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_negation_arg1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation_arg__Alternatives_in_rulecss_negation_arg1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctional_pseudo_in_entryRulefunctional_pseudo1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctional_pseudo1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__0_in_rulefunctional_pseudo1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_expr_in_entryRulefunction_expr1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_expr1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_expr__Alternatives_in_rulefunction_expr1721 = new BitSet(new long[]{0x0000000060000D12L});
    public static final BitSet FOLLOW_rule__Function_expr__Alternatives_in_rulefunction_expr1733 = new BitSet(new long[]{0x0000000060000D12L});
    public static final BitSet FOLLOW_ruleDIMENSION_in_entryRuleDIMENSION1763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIMENSION1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIMENSION__Alternatives_in_ruleDIMENSION1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0_in_rulecombinator1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleoperator1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator1943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleexpr2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup2072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup2107 = new BitSet(new long[]{0x0800000060000D32L});
    public static final BitSet FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup2119 = new BitSet(new long[]{0x0800000060000D32L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleterm2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__0_in_rulenumberTerm2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Num__Alternatives_in_rulenum2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleHexColor2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0_in_ruleURLType2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER2544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0_in_ruleEMS2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0_in_ruleEXS2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE2852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME2912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0_in_ruleTIME2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ2972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0_in_ruleFREQ3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM3032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORTANT_SYM3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIMPORTANT_SYM3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_entryRuleReservedWords3094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedWords3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReservedWords__Alternatives_in_ruleReservedWords3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulecss_not3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__RulesetAssignment_2_0_in_rule__Stylesheet__Alternatives_23202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__MediaAssignment_2_1_in_rule__Stylesheet__Alternatives_23220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__PageAssignment_2_2_in_rule__Stylesheet__Alternatives_23238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Charset__Alternatives_03272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Charset__Alternatives_03292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__0_in_rule__ImportExpression__Alternatives3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__0_in_rule__ImportExpression__Alternatives3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImportExpression__Alternatives_0_03378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ImportExpression__Alternatives_0_03398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__Alternatives_13433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Alternatives_13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Media__Alternatives_03488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Media__Alternatives_03508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_13560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3613 = new BitSet(new long[]{0x00D0000000000022L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3625 = new BitSet(new long[]{0x00D0000000000022L});
    public static final BitSet FOLLOW_rule__Simple_selector__ElementAssignment_0_0_0_in_rule__Simple_selector__Alternatives_0_03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__UniversalAssignment_0_0_1_in_rule__Simple_selector__Alternatives_0_03679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Element_name__Alternatives3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Element_name__Alternatives3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__IdAssignment_0_in_rule__Sub_selector__Alternatives3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__ClassAssignment_1_in_rule__Sub_selector__Alternatives3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__AttribAssignment_2_in_rule__Sub_selector__Alternatives3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__PseudoclassAssignment_3_in_rule__Sub_selector__Alternatives3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__NegotationAssignment_4_in_rule__Sub_selector__Alternatives3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_namespace_prefix__Alternatives_03866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Css_namespace_prefix__Alternatives_03884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_class__Alternatives_13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Css_class__Alternatives_13935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_13984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Css_attrib__Alternatives_2_04017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Css_attrib__Alternatives_2_04037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Css_attrib__Alternatives_2_04057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Css_attrib__Alternatives_2_04077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rule__Css_attrib__Alternatives_2_04096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rule__Css_attrib__Alternatives_2_04113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_1_0_in_rule__Css_attrib__Alternatives_2_14145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Css_attrib__Alternatives_2_14163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_2_1_04195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_2_1_04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_pseudo__Alternatives_24244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctional_pseudo_in_rule__Css_pseudo__Alternatives_24261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_type_selector_in_rule__Css_negation_arg__Alternatives4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_rule__Css_negation_arg__Alternatives4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rule__Css_negation_arg__Alternatives4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rule__Css_negation_arg__Alternatives4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rule__Css_negation_arg__Alternatives4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rule__Css_negation_arg__Alternatives4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Function_expr__Alternatives4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Function_expr__Alternatives4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIMENSION_in_rule__Function_expr__Alternatives4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Function_expr__Alternatives4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Function_expr__Alternatives4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Function_expr__Alternatives4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rule__DIMENSION__Alternatives4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rule__DIMENSION__Alternatives4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rule__DIMENSION__Alternatives4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rule__DIMENSION__Alternatives4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rule__DIMENSION__Alternatives4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rule__DIMENSION__Alternatives4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rule__DIMENSION__Alternatives4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Combinator__Alternatives_04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Combinator__Alternatives_04688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Combinator__Alternatives_04708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operator__Alternatives4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Operator__Alternatives4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Unary_operator__Alternatives4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Unary_operator__Alternatives4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NumberAssignment_0_in_rule__Term__Alternatives4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__StringValueAssignment_1_in_rule__Term__Alternatives4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__IdentifierAssignment_2_in_rule__Term__Alternatives4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__UrlAssignment_3_in_rule__Term__Alternatives4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__FunctionAssignment_4_in_rule__Term__Alternatives4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__HexColorAssignment_5_in_rule__Term__Alternatives4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberTerm__Alternatives_14972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rule__NumberTerm__Alternatives_14989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rule__NumberTerm__Alternatives_15006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rule__NumberTerm__Alternatives_15023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rule__NumberTerm__Alternatives_15040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rule__NumberTerm__Alternatives_15057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rule__NumberTerm__Alternatives_15074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rule__NumberTerm__Alternatives_15091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Num__Alternatives5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Num__Alternatives5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__LENGTH__Alternatives_15173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LENGTH__Alternatives_15193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LENGTH__Alternatives_15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LENGTH__Alternatives_15233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LENGTH__Alternatives_15253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LENGTH__Alternatives_15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ANGLE__Alternatives_15308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ANGLE__Alternatives_15328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ANGLE__Alternatives_15348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TIME__Alternatives_15383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TIME__Alternatives_15403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FREQ__Alternatives_15438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FREQ__Alternatives_15458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ReservedWords__Alternatives5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ReservedWords__Alternatives5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ReservedWords__Alternatives5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ReservedWords__Alternatives5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ReservedWords__Alternatives5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ReservedWords__Alternatives5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ReservedWords__Alternatives5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ReservedWords__Alternatives5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ReservedWords__Alternatives5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ReservedWords__Alternatives5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ReservedWords__Alternatives5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ReservedWords__Alternatives5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReservedWords__Alternatives5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReservedWords__Alternatives5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReservedWords__Alternatives5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__05805 = new BitSet(new long[]{0x08F1FFFC01FC0030L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__CharsetAssignment_0_in_rule__Stylesheet__Group__0__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__15866 = new BitSet(new long[]{0x08F1FFFC01FC0030L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__15869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__ImportsAssignment_1_in_rule__Stylesheet__Group__1__Impl5896 = new BitSet(new long[]{0x08000000000C0002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__25927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_2_in_rule__Stylesheet__Group__2__Impl5954 = new BitSet(new long[]{0x00F1FFFC01F00032L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__05991 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__05994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Alternatives_0_in_rule__Charset__Group__0__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__16051 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__CharsetAssignment_1_in_rule__Charset__Group__1__Impl6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__26111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Charset__Group__2__Impl6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__0__Impl_in_rule__ImportExpression__Group_0__06176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__1_in_rule__ImportExpression__Group_0__06179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Alternatives_0_0_in_rule__ImportExpression__Group_0__0__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__1__Impl_in_rule__ImportExpression__Group_0__16236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__ValueAssignment_0_1_in_rule__ImportExpression__Group_0__1__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__0__Impl_in_rule__ImportExpression__Group_1__06297 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__1_in_rule__ImportExpression__Group_1__06300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__ImportExpression__Group_1__0__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__1__Impl_in_rule__ImportExpression__Group_1__16356 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__2_in_rule__ImportExpression__Group_1__16359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__MediaListAssignment_1_1_in_rule__ImportExpression__Group_1__1__Impl6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__2__Impl_in_rule__ImportExpression__Group_1__26417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ImportExpression__Group_1__2__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__06482 = new BitSet(new long[]{0x00F1FFFC01F00030L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__06485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__16543 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__16546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Alternatives_1_in_rule__Page__Group__1__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__26603 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__26606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__PseudoPageAssignment_2_in_rule__Page__Group__2__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__36664 = new BitSet(new long[]{0x000A000040000010L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__36667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Page__Group__3__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__46726 = new BitSet(new long[]{0x000A000040000010L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__46729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_4_in_rule__Page__Group__4__Impl6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__56787 = new BitSet(new long[]{0x000A000040000010L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__56790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl6817 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__66848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Page__Group__6__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__06921 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__06924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Page__Group_5__0__Impl6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__16983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_5_1_in_rule__Page__Group_5__1__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__0__Impl_in_rule__Pseudo_page__Group__07045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__1_in_rule__Pseudo_page__Group__07048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Pseudo_page__Group__0__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__1__Impl_in_rule__Pseudo_page__Group__17107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pseudo_page__Group__1__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__07167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media__Group__1_in_rule__Media__Group__07170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Alternatives_0_in_rule__Media__Group__0__Impl7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__17227 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Media__Group__2_in_rule__Media__Group__17230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__27287 = new BitSet(new long[]{0x00F9FFFC01000030L});
    public static final BitSet FOLLOW_rule__Media__Group__3_in_rule__Media__Group__27290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Media__Group__2__Impl7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__37349 = new BitSet(new long[]{0x00F9FFFC01000030L});
    public static final BitSet FOLLOW_rule__Media__Group__4_in_rule__Media__Group__37352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl7379 = new BitSet(new long[]{0x00F1FFFC01000032L});
    public static final BitSet FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__47410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Media__Group__4__Impl7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__07479 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__07482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__17538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl7565 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__07600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__07603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__17659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__07719 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__07722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__17779 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__17782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl7809 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__27840 = new BitSet(new long[]{0x0008000040000010L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__27843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Ruleset__Group__2__Impl7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__37902 = new BitSet(new long[]{0x0008000040000010L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__37905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__0_in_rule__Ruleset__Group__3__Impl7932 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__47963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Ruleset__Group__4__Impl7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__08032 = new BitSet(new long[]{0x00F1FFFC01000030L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__08035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl8062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__18091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__0__Impl_in_rule__Ruleset__Group_3__08152 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__1_in_rule__Ruleset__Group_3__08155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__DeclarationsAssignment_3_0_in_rule__Ruleset__Group_3__0__Impl8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__1__Impl_in_rule__Ruleset__Group_3__18212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Ruleset__Group_3__1__Impl8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__08275 = new BitSet(new long[]{0x00000001A0001000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__08278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__18335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__08397 = new BitSet(new long[]{0x00F1FFFC01000030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__08400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__18457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__08518 = new BitSet(new long[]{0x00F1FFFDA1000030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__08521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl8551 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl8564 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__18597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__08659 = new BitSet(new long[]{0x00F1FFFDA1000030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__08662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__18720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__08781 = new BitSet(new long[]{0x00D0000000000020L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__08784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_0_0_in_rule__Simple_selector__Group_0__0__Impl8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__18841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl8868 = new BitSet(new long[]{0x00D0000000000022L});
    public static final BitSet FOLLOW_rule__Css_type_selector__Group__0__Impl_in_rule__Css_type_selector__Group__08903 = new BitSet(new long[]{0x0001FFFC00000010L});
    public static final BitSet FOLLOW_rule__Css_type_selector__Group__1_in_rule__Css_type_selector__Group__08906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rule__Css_type_selector__Group__0__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_type_selector__Group__1__Impl_in_rule__Css_type_selector__Group__18965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rule__Css_type_selector__Group__1__Impl8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__0__Impl_in_rule__Css_namespace_prefix__Group__09025 = new BitSet(new long[]{0x0020000001000010L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__1_in_rule__Css_namespace_prefix__Group__09028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Alternatives_0_in_rule__Css_namespace_prefix__Group__0__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__1__Impl_in_rule__Css_namespace_prefix__Group__19086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Css_namespace_prefix__Group__1__Impl9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_universal__Group__0__Impl_in_rule__Css_universal__Group__09149 = new BitSet(new long[]{0x0021FFFC01000010L});
    public static final BitSet FOLLOW_rule__Css_universal__Group__1_in_rule__Css_universal__Group__09152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rule__Css_universal__Group__0__Impl9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_universal__Group__1__Impl_in_rule__Css_universal__Group__19211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Css_universal__Group__1__Impl9239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__0__Impl_in_rule__Css_class__Group__09274 = new BitSet(new long[]{0x0001FFFC00000010L});
    public static final BitSet FOLLOW_rule__Css_class__Group__1_in_rule__Css_class__Group__09277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Css_class__Group__0__Impl9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__1__Impl_in_rule__Css_class__Group__19336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Alternatives_1_in_rule__Css_class__Group__1__Impl9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__0__Impl_in_rule__Css_attrib__Group__09397 = new BitSet(new long[]{0x0001FFFC00000010L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__1_in_rule__Css_attrib__Group__09400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Css_attrib__Group__0__Impl9428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__1__Impl_in_rule__Css_attrib__Group__19459 = new BitSet(new long[]{0x010000001E0000C0L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__2_in_rule__Css_attrib__Group__19462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_1_in_rule__Css_attrib__Group__1__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__2__Impl_in_rule__Css_attrib__Group__29519 = new BitSet(new long[]{0x010000001E0000C0L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__3_in_rule__Css_attrib__Group__29522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__0_in_rule__Css_attrib__Group__2__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__3__Impl_in_rule__Css_attrib__Group__39580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Css_attrib__Group__3__Impl9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__0__Impl_in_rule__Css_attrib__Group_2__09647 = new BitSet(new long[]{0x0001FFFC00000110L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__1_in_rule__Css_attrib__Group_2__09650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_0_in_rule__Css_attrib__Group_2__0__Impl9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__1__Impl_in_rule__Css_attrib__Group_2__19707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_1_in_rule__Css_attrib__Group_2__1__Impl9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__0__Impl_in_rule__Css_generic_declaration__Group__09768 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__1_in_rule__Css_generic_declaration__Group__09771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__PropertyAssignment_0_in_rule__Css_generic_declaration__Group__0__Impl9798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__1__Impl_in_rule__Css_generic_declaration__Group__19828 = new BitSet(new long[]{0x0800000060000D30L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__2_in_rule__Css_generic_declaration__Group__19831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Css_generic_declaration__Group__1__Impl9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__2__Impl_in_rule__Css_generic_declaration__Group__29890 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__3_in_rule__Css_generic_declaration__Group__29893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__ExpressionAssignment_2_in_rule__Css_generic_declaration__Group__2__Impl9920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__3__Impl_in_rule__Css_generic_declaration__Group__39950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__PrioAssignment_3_in_rule__Css_generic_declaration__Group__3__Impl9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__010016 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__010019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Css_property__Group__0__Impl10048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__110081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_property__Group__1__Impl10108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__0__Impl_in_rule__Css_pseudo__Group__010141 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__1_in_rule__Css_pseudo__Group__010144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Css_pseudo__Group__0__Impl10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__1__Impl_in_rule__Css_pseudo__Group__110203 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__2_in_rule__Css_pseudo__Group__110206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Css_pseudo__Group__1__Impl10235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__2__Impl_in_rule__Css_pseudo__Group__210268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Alternatives_2_in_rule__Css_pseudo__Group__2__Impl10295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__0__Impl_in_rule__Css_negation__Group__010331 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__1_in_rule__Css_negation__Group__010334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Css_negation__Group__0__Impl10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__1__Impl_in_rule__Css_negation__Group__110393 = new BitSet(new long[]{0x00F1FFFC01000030L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__2_in_rule__Css_negation__Group__110396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__NotAssignment_1_in_rule__Css_negation__Group__1__Impl10423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__2__Impl_in_rule__Css_negation__Group__210453 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__3_in_rule__Css_negation__Group__210456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__Negation_argAssignment_2_in_rule__Css_negation__Group__2__Impl10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_negation__Group__3__Impl_in_rule__Css_negation__Group__310513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Css_negation__Group__3__Impl10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__0__Impl_in_rule__Functional_pseudo__Group__010580 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__1_in_rule__Functional_pseudo__Group__010583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Functional_pseudo__Group__0__Impl10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__1__Impl_in_rule__Functional_pseudo__Group__110639 = new BitSet(new long[]{0x0000000060000D10L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__2_in_rule__Functional_pseudo__Group__110642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Functional_pseudo__Group__1__Impl10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__2__Impl_in_rule__Functional_pseudo__Group__210701 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__3_in_rule__Functional_pseudo__Group__210704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_expr_in_rule__Functional_pseudo__Group__2__Impl10731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functional_pseudo__Group__3__Impl_in_rule__Functional_pseudo__Group__310760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Functional_pseudo__Group__3__Impl10788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__010827 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__010830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__110887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl10915 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__010950 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__010953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermGroupsAssignment_0_in_rule__Expr__Group__0__Impl10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__111010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl11037 = new BitSet(new long[]{0x0000000200000202L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__011072 = new BitSet(new long[]{0x0800000060000D30L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__011075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_rule__Expr__Group_1__0__Impl11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__111131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermGroupsAssignment_1_1_in_rule__Expr__Group_1__1__Impl11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__0__Impl_in_rule__NumberTerm__Group__011192 = new BitSet(new long[]{0x0000000060000C00L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__1_in_rule__NumberTerm__Group__011195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rule__NumberTerm__Group__0__Impl11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__1__Impl_in_rule__NumberTerm__Group__111254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Alternatives_1_in_rule__NumberTerm__Group__1__Impl11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__011315 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__011318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Function__Group__0__Impl11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__111380 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__111383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__211440 = new BitSet(new long[]{0x0800000060001D30L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__211443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Function__Group__2__Impl11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__311502 = new BitSet(new long[]{0x0800000060001D30L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__311505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__3__Impl11533 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__411564 = new BitSet(new long[]{0x0200000000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__411567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ExpressionAssignment_4_in_rule__Function__Group__4__Impl11594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__511624 = new BitSet(new long[]{0x0200000000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__511627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__5__Impl11655 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__611686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Function__Group__6__Impl11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__011759 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__011762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__URLType__Group__0__Impl11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__111821 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__111824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__URLType__Group__1__Impl11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__211883 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__211886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__311943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__URLType__Group__3__Impl11971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__012010 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__012013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__PERCENTAGE__Group__0__Impl12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__112069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PERCENTAGE__Group__1__Impl12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__012132 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__012135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__EMS__Group__0__Impl12162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__112191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EMS__Group__1__Impl12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__012254 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__012257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__EXS__Group__0__Impl12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__112313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EXS__Group__1__Impl12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__012376 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__012379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__LENGTH__Group__0__Impl12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__112435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl12462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__012496 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__012499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__ANGLE__Group__0__Impl12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__112555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__012616 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__012619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__TIME__Group__0__Impl12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__112675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__012736 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__012739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__FREQ__Group__0__Impl12766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__112795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rule__Stylesheet__CharsetAssignment_012861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rule__Stylesheet__ImportsAssignment_112892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_2_012923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_2_112954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_rule__Stylesheet__PageAssignment_2_212985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__CharsetAssignment_113016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportExpression__ValueAssignment_0_113047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__ImportExpression__MediaListAssignment_1_113078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rule__Page__PseudoPageAssignment_213109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_413140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_5_113171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_113202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_313233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_013264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_113295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_3_013326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_013357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_013388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_113419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_013450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_113481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_0_013512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_universal_in_rule__Simple_selector__UniversalAssignment_0_0_113543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_0_113574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_113605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rule__Sub_selector__IdAssignment_013636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rule__Sub_selector__ClassAssignment_113667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rule__Sub_selector__AttribAssignment_213698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rule__Sub_selector__PseudoclassAssignment_313729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_in_rule__Sub_selector__NegotationAssignment_413760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Css_generic_declaration__PropertyAssignment_013791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Css_generic_declaration__ExpressionAssignment_213822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_rule__Css_generic_declaration__PrioAssignment_313853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_not_in_rule__Css_negation__NotAssignment_113884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_negation_arg_in_rule__Css_negation__Negation_argAssignment_213915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_013946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_1_113977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__TermGroup__TermsAssignment14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_rule__Term__NumberAssignment_014039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__StringValueAssignment_114070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Term__IdentifierAssignment_214101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__Term__UrlAssignment_314132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_414163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_rule__Term__HexColorAssignment_514194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_114225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Function__ExpressionAssignment_414256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_214287 = new BitSet(new long[]{0x0000000000000002L});

}