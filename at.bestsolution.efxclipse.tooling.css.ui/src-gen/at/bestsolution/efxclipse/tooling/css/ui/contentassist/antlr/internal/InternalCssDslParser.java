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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_STRING", "RULE_COMMA", "RULE_PERCENT", "RULE_HEX", "RULE_WS", "RULE_HASHMARK", "RULE_IMPORTANT_SYM", "RULE_INTEGER", "RULE_REAL", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'@media'", "'@MEDIA'", "'^='", "'$='", "'*='", "'='", "'*'", "'+'", "'>'", "'~'", "'-'", "';'", "'{'", "'}'", "':'", "'['", "']'", "'.'", "'|'", "'('", "')'", "'url'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INCLUDES=5;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_PERCENT=9;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=10;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_REAL=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_COMMA=8;
    public static final int RULE_HASHMARK=12;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_DASHMATCH=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=4;
    public static final int T__39=39;
    public static final int RULE_IMPORTANT_SYM=13;
    public static final int RULE_WS=11;
    public static final int RULE_INTEGER=14;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:61:1: entryRulestylesheet : rulestylesheet EOF ;
    public final void entryRulestylesheet() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:62:1: ( rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:63:1: rulestylesheet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetRule()); 
            }
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet67);
            rulestylesheet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet74); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:70:1: rulestylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
    public final void rulestylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:74:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( ( rule__Stylesheet__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( ( rule__Stylesheet__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:76:1: ( rule__Stylesheet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:77:1: ( rule__Stylesheet__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:77:2: rule__Stylesheet__Group__0
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet100);
            rule__Stylesheet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getGroup()); 
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
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulecharset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:89:1: entryRulecharset : rulecharset EOF ;
    public final void entryRulecharset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:90:1: ( rulecharset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:91:1: rulecharset EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRule()); 
            }
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset127);
            rulecharset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset134); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:98:1: rulecharset : ( ( rule__Charset__Group__0 ) ) ;
    public final void rulecharset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:102:2: ( ( ( rule__Charset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( ( rule__Charset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( ( rule__Charset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:104:1: ( rule__Charset__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:105:1: ( rule__Charset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:105:2: rule__Charset__Group__0
            {
            pushFollow(FOLLOW_rule__Charset__Group__0_in_rulecharset160);
            rule__Charset__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetAccess().getGroup()); 
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
    // $ANTLR end "rulecharset"


    // $ANTLR start "entryRuleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:117:1: entryRuleimportExpression : ruleimportExpression EOF ;
    public final void entryRuleimportExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:118:1: ( ruleimportExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:119:1: ruleimportExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression187);
            ruleimportExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression194); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:126:1: ruleimportExpression : ( ( rule__ImportExpression__Alternatives ) ) ;
    public final void ruleimportExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:130:2: ( ( ( rule__ImportExpression__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:131:1: ( ( rule__ImportExpression__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:131:1: ( ( rule__ImportExpression__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:132:1: ( rule__ImportExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:133:1: ( rule__ImportExpression__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:133:2: rule__ImportExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ImportExpression__Alternatives_in_ruleimportExpression220);
            rule__ImportExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:145:1: entryRulepage : rulepage EOF ;
    public final void entryRulepage() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:146:1: ( rulepage EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:147:1: rulepage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulepage_in_entryRulepage247);
            rulepage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepage254); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:154:1: rulepage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulepage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:158:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:159:1: ( ( rule__Page__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:159:1: ( ( rule__Page__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:160:1: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:161:1: ( rule__Page__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:161:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulepage280);
            rule__Page__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup()); 
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
    // $ANTLR end "rulepage"


    // $ANTLR start "entryRulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:173:1: entryRulepseudo_page : rulepseudo_page EOF ;
    public final void entryRulepseudo_page() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:174:1: ( rulepseudo_page EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:175:1: rulepseudo_page EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudo_pageRule()); 
            }
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page307);
            rulepseudo_page();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudo_pageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page314); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:182:1: rulepseudo_page : ( ( rule__Pseudo_page__Group__0 ) ) ;
    public final void rulepseudo_page() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:186:2: ( ( ( rule__Pseudo_page__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:187:1: ( ( rule__Pseudo_page__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:187:1: ( ( rule__Pseudo_page__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:188:1: ( rule__Pseudo_page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudo_pageAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:189:1: ( rule__Pseudo_page__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:189:2: rule__Pseudo_page__Group__0
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__0_in_rulepseudo_page340);
            rule__Pseudo_page__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudo_pageAccess().getGroup()); 
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
    // $ANTLR end "rulepseudo_page"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:201:1: entryRulemedia : rulemedia EOF ;
    public final void entryRulemedia() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:202:1: ( rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:203:1: rulemedia EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia367);
            rulemedia();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia374); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:210:1: rulemedia : ( ( rule__Media__Group__0 ) ) ;
    public final void rulemedia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:214:2: ( ( ( rule__Media__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:215:1: ( ( rule__Media__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:215:1: ( ( rule__Media__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:216:1: ( rule__Media__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:217:1: ( rule__Media__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:217:2: rule__Media__Group__0
            {
            pushFollow(FOLLOW_rule__Media__Group__0_in_rulemedia400);
            rule__Media__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getGroup()); 
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
    // $ANTLR end "rulemedia"


    // $ANTLR start "entryRulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:229:1: entryRulemedia_list : rulemedia_list EOF ;
    public final void entryRulemedia_list() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:230:1: ( rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:231:1: rulemedia_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedia_listRule()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list427);
            rulemedia_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedia_listRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list434); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:238:1: rulemedia_list : ( ( rule__Media_list__Group__0 ) ) ;
    public final void rulemedia_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:242:2: ( ( ( rule__Media_list__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:243:1: ( ( rule__Media_list__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:243:1: ( ( rule__Media_list__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:244:1: ( rule__Media_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedia_listAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:245:1: ( rule__Media_list__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:245:2: rule__Media_list__Group__0
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0_in_rulemedia_list460);
            rule__Media_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedia_listAccess().getGroup()); 
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
    // $ANTLR end "rulemedia_list"


    // $ANTLR start "entryRulemedium"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:257:1: entryRulemedium : rulemedium EOF ;
    public final void entryRulemedium() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:258:1: ( rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:259:1: rulemedium EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediumRule()); 
            }
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium487);
            rulemedium();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium494); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:266:1: rulemedium : ( RULE_IDENT ) ;
    public final void rulemedium() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:270:2: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:271:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:271:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:272:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium520); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
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
    // $ANTLR end "rulemedium"


    // $ANTLR start "entryRuleruleset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:285:1: entryRuleruleset : ruleruleset EOF ;
    public final void entryRuleruleset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:286:1: ( ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:287:1: ruleruleset EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset546);
            ruleruleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset553); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:294:1: ruleruleset : ( ( rule__Ruleset__Group__0 ) ) ;
    public final void ruleruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:298:2: ( ( ( rule__Ruleset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:299:1: ( ( rule__Ruleset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:299:1: ( ( rule__Ruleset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:300:1: ( rule__Ruleset__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:301:1: ( rule__Ruleset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:301:2: rule__Ruleset__Group__0
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0_in_ruleruleset579);
            rule__Ruleset__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup()); 
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
    // $ANTLR end "ruleruleset"


    // $ANTLR start "entryRuleselector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:313:1: entryRuleselector : ruleselector EOF ;
    public final void entryRuleselector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:317:1: ( ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:318:1: ruleselector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector611);
            ruleselector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector618); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:328:1: ruleselector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleselector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:333:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:334:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:334:1: ( ( rule__Selector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:1: ( rule__Selector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:336:1: ( rule__Selector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:336:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleselector648);
            rule__Selector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:349:1: entryRulesimple_selector : rulesimple_selector EOF ;
    public final void entryRulesimple_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:350:1: ( rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:351:1: rulesimple_selector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorRule()); 
            }
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector675);
            rulesimple_selector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector682); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:358:1: rulesimple_selector : ( ( rule__Simple_selector__Alternatives ) ) ;
    public final void rulesimple_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:362:2: ( ( ( rule__Simple_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:363:1: ( ( rule__Simple_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:363:1: ( ( rule__Simple_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:364:1: ( rule__Simple_selector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:365:1: ( rule__Simple_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:365:2: rule__Simple_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector708);
            rule__Simple_selector__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getAlternatives()); 
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
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRuleSubSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:377:1: entryRuleSubSelector : ruleSubSelector EOF ;
    public final void entryRuleSubSelector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:378:1: ( ruleSubSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:379:1: ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_entryRuleSubSelector735);
            ruleSubSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelector742); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSubSelector"


    // $ANTLR start "ruleSubSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:386:1: ruleSubSelector : ( ( rule__SubSelector__Alternatives ) ) ;
    public final void ruleSubSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:390:2: ( ( ( rule__SubSelector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: ( ( rule__SubSelector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: ( ( rule__SubSelector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:392:1: ( rule__SubSelector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSelectorAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:393:1: ( rule__SubSelector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:393:2: rule__SubSelector__Alternatives
            {
            pushFollow(FOLLOW_rule__SubSelector__Alternatives_in_ruleSubSelector768);
            rule__SubSelector__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSelectorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSubSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:405:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:406:1: ( ruleAttributeSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:407:1: ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector795);
            ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSelector802); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:414:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:418:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:419:1: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:419:1: ( ( rule__AttributeSelector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:420:1: ( rule__AttributeSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:421:1: ( rule__AttributeSelector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:421:2: rule__AttributeSelector__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group__0_in_ruleAttributeSelector828);
            rule__AttributeSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getGroup()); 
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
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleClassSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:433:1: entryRuleClassSelector : ruleClassSelector EOF ;
    public final void entryRuleClassSelector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:434:1: ( ruleClassSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:435:1: ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleClassSelector_in_entryRuleClassSelector855);
            ruleClassSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSelector862); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:442:1: ruleClassSelector : ( ( rule__ClassSelector__Group__0 ) ) ;
    public final void ruleClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:446:2: ( ( ( rule__ClassSelector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:447:1: ( ( rule__ClassSelector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:447:1: ( ( rule__ClassSelector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:448:1: ( rule__ClassSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:449:1: ( rule__ClassSelector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:449:2: rule__ClassSelector__Group__0
            {
            pushFollow(FOLLOW_rule__ClassSelector__Group__0_in_ruleClassSelector888);
            rule__ClassSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getGroup()); 
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
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:461:1: entryRuleElementSelector : ruleElementSelector EOF ;
    public final void entryRuleElementSelector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:462:1: ( ruleElementSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:463:1: ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleElementSelector_in_entryRuleElementSelector915);
            ruleElementSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementSelector922); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:470:1: ruleElementSelector : ( ( rule__ElementSelector__Group__0 ) ) ;
    public final void ruleElementSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:474:2: ( ( ( rule__ElementSelector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:475:1: ( ( rule__ElementSelector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:475:1: ( ( rule__ElementSelector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:476:1: ( rule__ElementSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:477:1: ( rule__ElementSelector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:477:2: rule__ElementSelector__Group__0
            {
            pushFollow(FOLLOW_rule__ElementSelector__Group__0_in_ruleElementSelector948);
            rule__ElementSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getGroup()); 
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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:489:1: entryRuleUniversalSelector : ruleUniversalSelector EOF ;
    public final void entryRuleUniversalSelector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:490:1: ( ruleUniversalSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:491:1: ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector975);
            ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniversalSelector982); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:498:1: ruleUniversalSelector : ( ( rule__UniversalSelector__Group__0 ) ) ;
    public final void ruleUniversalSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:502:2: ( ( ( rule__UniversalSelector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:503:1: ( ( rule__UniversalSelector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:503:1: ( ( rule__UniversalSelector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:504:1: ( rule__UniversalSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:505:1: ( rule__UniversalSelector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:505:2: rule__UniversalSelector__Group__0
            {
            pushFollow(FOLLOW_rule__UniversalSelector__Group__0_in_ruleUniversalSelector1008);
            rule__UniversalSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getGroup()); 
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
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleIdSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:517:1: entryRuleIdSelector : ruleIdSelector EOF ;
    public final void entryRuleIdSelector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:518:1: ( ruleIdSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:519:1: ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleIdSelector_in_entryRuleIdSelector1035);
            ruleIdSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdSelector1042); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIdSelector"


    // $ANTLR start "ruleIdSelector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:526:1: ruleIdSelector : ( ( rule__IdSelector__Group__0 ) ) ;
    public final void ruleIdSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:530:2: ( ( ( rule__IdSelector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:531:1: ( ( rule__IdSelector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:531:1: ( ( rule__IdSelector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:532:1: ( rule__IdSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:533:1: ( rule__IdSelector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:533:2: rule__IdSelector__Group__0
            {
            pushFollow(FOLLOW_rule__IdSelector__Group__0_in_ruleIdSelector1068);
            rule__IdSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getGroup()); 
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
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRulecss_namespace_prefix"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:545:1: entryRulecss_namespace_prefix : rulecss_namespace_prefix EOF ;
    public final void entryRulecss_namespace_prefix() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:546:1: ( rulecss_namespace_prefix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:547:1: rulecss_namespace_prefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_namespace_prefixRule()); 
            }
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix1095);
            rulecss_namespace_prefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_namespace_prefixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix1102); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:554:1: rulecss_namespace_prefix : ( ( rule__Css_namespace_prefix__Group__0 ) ) ;
    public final void rulecss_namespace_prefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:558:2: ( ( ( rule__Css_namespace_prefix__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:559:1: ( ( rule__Css_namespace_prefix__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:559:1: ( ( rule__Css_namespace_prefix__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:560:1: ( rule__Css_namespace_prefix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_namespace_prefixAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:561:1: ( rule__Css_namespace_prefix__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:561:2: rule__Css_namespace_prefix__Group__0
            {
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__0_in_rulecss_namespace_prefix1128);
            rule__Css_namespace_prefix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_namespace_prefixAccess().getGroup()); 
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
    // $ANTLR end "rulecss_namespace_prefix"


    // $ANTLR start "entryRulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:573:1: entryRulecss_declaration : rulecss_declaration EOF ;
    public final void entryRulecss_declaration() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:577:1: ( rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:578:1: rulecss_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationRule()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration1160);
            rulecss_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration1167); if (state.failed) return ;

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
    // $ANTLR end "entryRulecss_declaration"


    // $ANTLR start "rulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:588:1: rulecss_declaration : ( ( rule__Css_declaration__Group__0 ) ) ;
    public final void rulecss_declaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:593:2: ( ( ( rule__Css_declaration__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:594:1: ( ( rule__Css_declaration__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:594:1: ( ( rule__Css_declaration__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:595:1: ( rule__Css_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:596:1: ( rule__Css_declaration__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:596:2: rule__Css_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__0_in_rulecss_declaration1197);
            rule__Css_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulecss_declaration"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:609:1: entryRulecss_property : rulecss_property EOF ;
    public final void entryRulecss_property() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:610:1: ( rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:611:1: rulecss_property EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_propertyRule()); 
            }
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property1224);
            rulecss_property();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_propertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property1231); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:618:1: rulecss_property : ( ( rule__Css_property__Group__0 ) ) ;
    public final void rulecss_property() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:622:2: ( ( ( rule__Css_property__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:623:1: ( ( rule__Css_property__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:623:1: ( ( rule__Css_property__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:624:1: ( rule__Css_property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_propertyAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:625:1: ( rule__Css_property__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:625:2: rule__Css_property__Group__0
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0_in_rulecss_property1257);
            rule__Css_property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_propertyAccess().getGroup()); 
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
    // $ANTLR end "rulecss_property"


    // $ANTLR start "entryRuleValidPropertyIdent"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:637:1: entryRuleValidPropertyIdent : ruleValidPropertyIdent EOF ;
    public final void entryRuleValidPropertyIdent() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:638:1: ( ruleValidPropertyIdent EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:639:1: ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent1284);
            ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidPropertyIdentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent1291); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidPropertyIdent"


    // $ANTLR start "ruleValidPropertyIdent"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:646:1: ruleValidPropertyIdent : ( ( rule__ValidPropertyIdent__Group__0 ) ) ;
    public final void ruleValidPropertyIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:650:2: ( ( ( rule__ValidPropertyIdent__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:651:1: ( ( rule__ValidPropertyIdent__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:651:1: ( ( rule__ValidPropertyIdent__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:652:1: ( rule__ValidPropertyIdent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidPropertyIdentAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:653:1: ( rule__ValidPropertyIdent__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:653:2: rule__ValidPropertyIdent__Group__0
            {
            pushFollow(FOLLOW_rule__ValidPropertyIdent__Group__0_in_ruleValidPropertyIdent1317);
            rule__ValidPropertyIdent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidPropertyIdentAccess().getGroup()); 
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
    // $ANTLR end "ruleValidPropertyIdent"


    // $ANTLR start "entryRulePseudoClass"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:667:1: entryRulePseudoClass : rulePseudoClass EOF ;
    public final void entryRulePseudoClass() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:668:1: ( rulePseudoClass EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:669:1: rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClass_in_entryRulePseudoClass1346);
            rulePseudoClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClass1353); if (state.failed) return ;

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
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:676:1: rulePseudoClass : ( ( rule__PseudoClass__Alternatives ) ) ;
    public final void rulePseudoClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:680:2: ( ( ( rule__PseudoClass__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:681:1: ( ( rule__PseudoClass__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:681:1: ( ( rule__PseudoClass__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:682:1: ( rule__PseudoClass__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:683:1: ( rule__PseudoClass__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:683:2: rule__PseudoClass__Alternatives
            {
            pushFollow(FOLLOW_rule__PseudoClass__Alternatives_in_rulePseudoClass1379);
            rule__PseudoClass__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getAlternatives()); 
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
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:695:1: entryRulePseudoClassName : rulePseudoClassName EOF ;
    public final void entryRulePseudoClassName() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:696:1: ( rulePseudoClassName EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:697:1: rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName1406);
            rulePseudoClassName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassName1413); if (state.failed) return ;

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
    // $ANTLR end "entryRulePseudoClassName"


    // $ANTLR start "rulePseudoClassName"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:704:1: rulePseudoClassName : ( ( rule__PseudoClassName__NameAssignment ) ) ;
    public final void rulePseudoClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:708:2: ( ( ( rule__PseudoClassName__NameAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:709:1: ( ( rule__PseudoClassName__NameAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:709:1: ( ( rule__PseudoClassName__NameAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:710:1: ( rule__PseudoClassName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassNameAccess().getNameAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:711:1: ( rule__PseudoClassName__NameAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:711:2: rule__PseudoClassName__NameAssignment
            {
            pushFollow(FOLLOW_rule__PseudoClassName__NameAssignment_in_rulePseudoClassName1439);
            rule__PseudoClassName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassNameAccess().getNameAssignment()); 
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
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:723:1: entryRulePseudoClassFunction : rulePseudoClassFunction EOF ;
    public final void entryRulePseudoClassFunction() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:724:1: ( rulePseudoClassFunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:725:1: rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction1466);
            rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassFunction1473); if (state.failed) return ;

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
    // $ANTLR end "entryRulePseudoClassFunction"


    // $ANTLR start "rulePseudoClassFunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:732:1: rulePseudoClassFunction : ( ( rule__PseudoClassFunction__Group__0 ) ) ;
    public final void rulePseudoClassFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:736:2: ( ( ( rule__PseudoClassFunction__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:737:1: ( ( rule__PseudoClassFunction__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:737:1: ( ( rule__PseudoClassFunction__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:738:1: ( rule__PseudoClassFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:739:1: ( rule__PseudoClassFunction__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:739:2: rule__PseudoClassFunction__Group__0
            {
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__0_in_rulePseudoClassFunction1499);
            rule__PseudoClassFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getGroup()); 
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
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:751:1: entryRulecombinator : rulecombinator EOF ;
    public final void entryRulecombinator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:752:1: ( rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:753:1: rulecombinator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator1526);
            rulecombinator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator1533); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:760:1: rulecombinator : ( ( rule__Combinator__Group__0 ) ) ;
    public final void rulecombinator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:764:2: ( ( ( rule__Combinator__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:765:1: ( ( rule__Combinator__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:765:1: ( ( rule__Combinator__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:766:1: ( rule__Combinator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinatorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:767:1: ( rule__Combinator__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:767:2: rule__Combinator__Group__0
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0_in_rulecombinator1559);
            rule__Combinator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinatorAccess().getGroup()); 
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
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:781:1: entryRuleunary_operator : ruleunary_operator EOF ;
    public final void entryRuleunary_operator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:782:1: ( ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:783:1: ruleunary_operator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_operatorRule()); 
            }
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator1588);
            ruleunary_operator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnary_operatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator1595); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:790:1: ruleunary_operator : ( ( rule__Unary_operator__Alternatives ) ) ;
    public final void ruleunary_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:794:2: ( ( ( rule__Unary_operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:795:1: ( ( rule__Unary_operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:795:1: ( ( rule__Unary_operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:796:1: ( rule__Unary_operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_operatorAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:797:1: ( rule__Unary_operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:797:2: rule__Unary_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1621);
            rule__Unary_operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnary_operatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRuleSymbolTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:809:1: entryRuleSymbolTok : ruleSymbolTok EOF ;
    public final void entryRuleSymbolTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:810:1: ( ruleSymbolTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:811:1: ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok1648);
            ruleSymbolTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok1655); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:818:1: ruleSymbolTok : ( ( rule__SymbolTok__Group__0 ) ) ;
    public final void ruleSymbolTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:822:2: ( ( ( rule__SymbolTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:823:1: ( ( rule__SymbolTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:823:1: ( ( rule__SymbolTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:824:1: ( rule__SymbolTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:825:1: ( rule__SymbolTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:825:2: rule__SymbolTok__Group__0
            {
            pushFollow(FOLLOW_rule__SymbolTok__Group__0_in_ruleSymbolTok1681);
            rule__SymbolTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getGroup()); 
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
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:837:1: entryRuleWSTok : ruleWSTok EOF ;
    public final void entryRuleWSTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:838:1: ( ruleWSTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:839:1: ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok1708);
            ruleWSTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok1715); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:846:1: ruleWSTok : ( ( rule__WSTok__Group__0 ) ) ;
    public final void ruleWSTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:850:2: ( ( ( rule__WSTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:851:1: ( ( rule__WSTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:851:1: ( ( rule__WSTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:852:1: ( rule__WSTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:853:1: ( rule__WSTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:853:2: rule__WSTok__Group__0
            {
            pushFollow(FOLLOW_rule__WSTok__Group__0_in_ruleWSTok1741);
            rule__WSTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokAccess().getGroup()); 
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
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:865:1: entryRuleStringTok : ruleStringTok EOF ;
    public final void entryRuleStringTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:866:1: ( ruleStringTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:867:1: ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok1768);
            ruleStringTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok1775); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:874:1: ruleStringTok : ( ( rule__StringTok__Group__0 ) ) ;
    public final void ruleStringTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:878:2: ( ( ( rule__StringTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:879:1: ( ( rule__StringTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:879:1: ( ( rule__StringTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:880:1: ( rule__StringTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:881:1: ( rule__StringTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:881:2: rule__StringTok__Group__0
            {
            pushFollow(FOLLOW_rule__StringTok__Group__0_in_ruleStringTok1801);
            rule__StringTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getGroup()); 
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
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:893:1: entryRuleFuncTok : ruleFuncTok EOF ;
    public final void entryRuleFuncTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:894:1: ( ruleFuncTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:895:1: ruleFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTokRule()); 
            }
            pushFollow(FOLLOW_ruleFuncTok_in_entryRuleFuncTok1828);
            ruleFuncTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncTok1835); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFuncTok"


    // $ANTLR start "ruleFuncTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:902:1: ruleFuncTok : ( ( rule__FuncTok__Group__0 ) ) ;
    public final void ruleFuncTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:906:2: ( ( ( rule__FuncTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:907:1: ( ( rule__FuncTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:907:1: ( ( rule__FuncTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:908:1: ( rule__FuncTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:909:1: ( rule__FuncTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:909:2: rule__FuncTok__Group__0
            {
            pushFollow(FOLLOW_rule__FuncTok__Group__0_in_ruleFuncTok1861);
            rule__FuncTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTokAccess().getGroup()); 
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
    // $ANTLR end "ruleFuncTok"


    // $ANTLR start "entryRuleNumberTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:921:1: entryRuleNumberTok : ruleNumberTok EOF ;
    public final void entryRuleNumberTok() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:925:1: ( ruleNumberTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:926:1: ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok1893);
            ruleNumberTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok1900); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberTok"


    // $ANTLR start "ruleNumberTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:936:1: ruleNumberTok : ( ( rule__NumberTok__Group__0 ) ) ;
    public final void ruleNumberTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:941:2: ( ( ( rule__NumberTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:942:1: ( ( rule__NumberTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:942:1: ( ( rule__NumberTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:943:1: ( rule__NumberTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:944:1: ( rule__NumberTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:944:2: rule__NumberTok__Group__0
            {
            pushFollow(FOLLOW_rule__NumberTok__Group__0_in_ruleNumberTok1930);
            rule__NumberTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleIdentifierTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:957:1: entryRuleIdentifierTok : ruleIdentifierTok EOF ;
    public final void entryRuleIdentifierTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:958:1: ( ruleIdentifierTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:959:1: ruleIdentifierTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierTokRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok1957);
            ruleIdentifierTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierTok1964); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIdentifierTok"


    // $ANTLR start "ruleIdentifierTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:966:1: ruleIdentifierTok : ( ( rule__IdentifierTok__Group__0 ) ) ;
    public final void ruleIdentifierTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:970:2: ( ( ( rule__IdentifierTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:971:1: ( ( rule__IdentifierTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:971:1: ( ( rule__IdentifierTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:972:1: ( rule__IdentifierTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:973:1: ( rule__IdentifierTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:973:2: rule__IdentifierTok__Group__0
            {
            pushFollow(FOLLOW_rule__IdentifierTok__Group__0_in_ruleIdentifierTok1990);
            rule__IdentifierTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierTokAccess().getGroup()); 
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
    // $ANTLR end "ruleIdentifierTok"


    // $ANTLR start "entryRuleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:985:1: entryRuleUrlTok : ruleUrlTok EOF ;
    public final void entryRuleUrlTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:986:1: ( ruleUrlTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:987:1: ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok2017);
            ruleUrlTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok2024); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:994:1: ruleUrlTok : ( ( rule__UrlTok__Group__0 ) ) ;
    public final void ruleUrlTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:998:2: ( ( ( rule__UrlTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:999:1: ( ( rule__UrlTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:999:1: ( ( rule__UrlTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1000:1: ( rule__UrlTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1001:1: ( rule__UrlTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1001:2: rule__UrlTok__Group__0
            {
            pushFollow(FOLLOW_rule__UrlTok__Group__0_in_ruleUrlTok2050);
            rule__UrlTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getGroup()); 
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
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1013:1: entryRuleColorTok : ruleColorTok EOF ;
    public final void entryRuleColorTok() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1014:1: ( ruleColorTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1015:1: ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok2077);
            ruleColorTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok2084); if (state.failed) return ;

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
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1022:1: ruleColorTok : ( ( rule__ColorTok__Group__0 ) ) ;
    public final void ruleColorTok() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1026:2: ( ( ( rule__ColorTok__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1027:1: ( ( rule__ColorTok__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1027:1: ( ( rule__ColorTok__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1028:1: ( rule__ColorTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1029:1: ( rule__ColorTok__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1029:2: rule__ColorTok__Group__0
            {
            pushFollow(FOLLOW_rule__ColorTok__Group__0_in_ruleColorTok2110);
            rule__ColorTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getGroup()); 
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
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleCssTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1041:1: entryRuleCssTok : ruleCssTok EOF ;
    public final void entryRuleCssTok() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_WS");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1045:1: ( ruleCssTok EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1046:1: ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok2142);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssTokRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok2149); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCssTok"


    // $ANTLR start "ruleCssTok"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1056:1: ruleCssTok : ( ( rule__CssTok__Alternatives ) ) ;
    public final void ruleCssTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1061:2: ( ( ( rule__CssTok__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1062:1: ( ( rule__CssTok__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1062:1: ( ( rule__CssTok__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1063:1: ( rule__CssTok__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssTokAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1064:1: ( rule__CssTok__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1064:2: rule__CssTok__Alternatives
            {
            pushFollow(FOLLOW_rule__CssTok__Alternatives_in_ruleCssTok2179);
            rule__CssTok__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssTokAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCssTok"


    // $ANTLR start "entryRulefunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1079:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1083:1: ( rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1084:1: rulefunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction2213);
            rulefunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction2220); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1094:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1099:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1100:1: ( ( rule__Function__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1100:1: ( ( rule__Function__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1101:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1102:1: ( rule__Function__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1102:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction2250);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1115:1: entryRuleURLType : ruleURLType EOF ;
    public final void entryRuleURLType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1119:1: ( ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1120:1: ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType2282);
            ruleURLType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType2289); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1130:1: ruleURLType : ( ( rule__URLType__Group__0 ) ) ;
    public final void ruleURLType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1135:2: ( ( ( rule__URLType__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1136:1: ( ( rule__URLType__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1136:1: ( ( rule__URLType__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1137:1: ( rule__URLType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1138:1: ( rule__URLType__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1138:2: rule__URLType__Group__0
            {
            pushFollow(FOLLOW_rule__URLType__Group__0_in_ruleURLType2319);
            rule__URLType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleURLType"


    // $ANTLR start "rule__Stylesheet__Alternatives_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1153:1: rule__Stylesheet__Alternatives_2 : ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) );
    public final void rule__Stylesheet__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1157:1: ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_HASHMARK:
            case 29:
            case 37:
            case 38:
            case 40:
            case 41:
                {
                alt1=1;
                }
                break;
            case 23:
            case 24:
                {
                alt1=2;
                }
                break;
            case 21:
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1158:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1158:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1159:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1160:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1160:2: rule__Stylesheet__RulesetAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__RulesetAssignment_2_0_in_rule__Stylesheet__Alternatives_22357);
                    rule__Stylesheet__RulesetAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1164:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1164:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1165:1: ( rule__Stylesheet__MediaAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1166:1: ( rule__Stylesheet__MediaAssignment_2_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1166:2: rule__Stylesheet__MediaAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__MediaAssignment_2_1_in_rule__Stylesheet__Alternatives_22375);
                    rule__Stylesheet__MediaAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1170:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1170:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1171:1: ( rule__Stylesheet__PageAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1172:1: ( rule__Stylesheet__PageAssignment_2_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1172:2: rule__Stylesheet__PageAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__PageAssignment_2_2_in_rule__Stylesheet__Alternatives_22393);
                    rule__Stylesheet__PageAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 
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
    // $ANTLR end "rule__Stylesheet__Alternatives_2"


    // $ANTLR start "rule__Charset__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1181:1: rule__Charset__Alternatives_0 : ( ( '@charset' ) | ( '@CHARSET' ) );
    public final void rule__Charset__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1185:1: ( ( '@charset' ) | ( '@CHARSET' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1186:1: ( '@charset' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1186:1: ( '@charset' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1187:1: '@charset'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Charset__Alternatives_02427); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1194:6: ( '@CHARSET' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1194:6: ( '@CHARSET' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1195:1: '@CHARSET'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Charset__Alternatives_02447); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()); 
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
    // $ANTLR end "rule__Charset__Alternatives_0"


    // $ANTLR start "rule__ImportExpression__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1207:1: rule__ImportExpression__Alternatives : ( ( ( rule__ImportExpression__Group_0__0 ) ) | ( ( rule__ImportExpression__Group_1__0 ) ) );
    public final void rule__ImportExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1211:1: ( ( ( rule__ImportExpression__Group_0__0 ) ) | ( ( rule__ImportExpression__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1212:1: ( ( rule__ImportExpression__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1212:1: ( ( rule__ImportExpression__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1213:1: ( rule__ImportExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportExpressionAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1214:1: ( rule__ImportExpression__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1214:2: rule__ImportExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__Group_0__0_in_rule__ImportExpression__Alternatives2481);
                    rule__ImportExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1218:6: ( ( rule__ImportExpression__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1218:6: ( ( rule__ImportExpression__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1219:1: ( rule__ImportExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportExpressionAccess().getGroup_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1220:1: ( rule__ImportExpression__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1220:2: rule__ImportExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__Group_1__0_in_rule__ImportExpression__Alternatives2499);
                    rule__ImportExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ImportExpression__Alternatives"


    // $ANTLR start "rule__ImportExpression__Alternatives_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1229:1: rule__ImportExpression__Alternatives_0_0 : ( ( '@import' ) | ( '@IMPORT' ) );
    public final void rule__ImportExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1233:1: ( ( '@import' ) | ( '@IMPORT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1234:1: ( '@import' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1234:1: ( '@import' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1235:1: '@import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__ImportExpression__Alternatives_0_02533); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1242:6: ( '@IMPORT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1242:6: ( '@IMPORT' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1243:1: '@IMPORT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__ImportExpression__Alternatives_0_02553); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()); 
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
    // $ANTLR end "rule__ImportExpression__Alternatives_0_0"


    // $ANTLR start "rule__Page__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1255:1: rule__Page__Alternatives_1 : ( ( '@page' ) | ( '@PAGE' ) );
    public final void rule__Page__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1259:1: ( ( '@page' ) | ( '@PAGE' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1260:1: ( '@page' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1260:1: ( '@page' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1261:1: '@page'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageAccess().getPageKeyword_1_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Page__Alternatives_12588); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageAccess().getPageKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1268:6: ( '@PAGE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1268:6: ( '@PAGE' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1269:1: '@PAGE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageAccess().getPAGEKeyword_1_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Page__Alternatives_12608); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageAccess().getPAGEKeyword_1_1()); 
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
    // $ANTLR end "rule__Page__Alternatives_1"


    // $ANTLR start "rule__Media__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1281:1: rule__Media__Alternatives_0 : ( ( '@media' ) | ( '@MEDIA' ) );
    public final void rule__Media__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1285:1: ( ( '@media' ) | ( '@MEDIA' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1286:1: ( '@media' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1286:1: ( '@media' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1287:1: '@media'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediaAccess().getMediaKeyword_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Media__Alternatives_02643); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediaAccess().getMediaKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1294:6: ( '@MEDIA' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1294:6: ( '@MEDIA' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1295:1: '@MEDIA'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Media__Alternatives_02663); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()); 
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
    // $ANTLR end "rule__Media__Alternatives_0"


    // $ANTLR start "rule__Selector__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1307:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1311:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=30 && LA7_0<=32)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_WS) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:1: ( ( rule__Selector__Group_1_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:1: ( ( rule__Selector__Group_1_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1313:1: ( rule__Selector__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1314:1: ( rule__Selector__Group_1_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1314:2: rule__Selector__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_12697);
                    rule__Selector__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1318:6: ( ( rule__Selector__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1318:6: ( ( rule__Selector__Group_1_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1319:1: ( rule__Selector__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1320:1: ( rule__Selector__Group_1_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1320:2: rule__Selector__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_12715);
                    rule__Selector__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectorAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Selector__Alternatives_1"


    // $ANTLR start "rule__Simple_selector__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1329:1: rule__Simple_selector__Alternatives : ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) );
    public final void rule__Simple_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1333:1: ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==42) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_IDENT||LA9_1==RULE_COMMA||(LA9_1>=RULE_WS && LA9_1<=RULE_HASHMARK)||(LA9_1>=30 && LA9_1<=32)||LA9_1==35||(LA9_1>=37 && LA9_1<=38)||(LA9_1>=40 && LA9_1<=41)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
            case 41:
                {
                alt9=1;
                }
                break;
            case RULE_HASHMARK:
            case 37:
            case 38:
            case 40:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1334:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1334:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1335:1: ( rule__Simple_selector__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_selectorAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1336:1: ( rule__Simple_selector__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1336:2: rule__Simple_selector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives2748);
                    rule__Simple_selector__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_selectorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1340:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1340:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1341:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1341:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1342:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1343:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1343:2: rule__Simple_selector__SubSelectorsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2768);
                    rule__Simple_selector__SubSelectorsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1346:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1347:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1348:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_IDENT||LA8_0==RULE_HASHMARK||(LA8_0>=37 && LA8_0<=38)||LA8_0==40) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1348:2: rule__Simple_selector__SubSelectorsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2780);
                    	    rule__Simple_selector__SubSelectorsAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    }

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1358:1: rule__Simple_selector__Alternatives_0_0 : ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) );
    public final void rule__Simple_selector__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1362:1: ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_IDENT||LA10_1==RULE_COMMA||(LA10_1>=RULE_WS && LA10_1<=RULE_HASHMARK)||(LA10_1>=30 && LA10_1<=32)||LA10_1==35||(LA10_1>=37 && LA10_1<=38)||LA10_1==40) ) {
                    alt10=1;
                }
                else if ( (LA10_1==41) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==29||LA10_0==41) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1363:1: ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1363:1: ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1364:1: ( rule__Simple_selector__ElementAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1365:1: ( rule__Simple_selector__ElementAssignment_0_0_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1365:2: rule__Simple_selector__ElementAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__ElementAssignment_0_0_0_in_rule__Simple_selector__Alternatives_0_02816);
                    rule__Simple_selector__ElementAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1369:6: ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1369:6: ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1370:1: ( rule__Simple_selector__UniversalAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1371:1: ( rule__Simple_selector__UniversalAssignment_0_0_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1371:2: rule__Simple_selector__UniversalAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__UniversalAssignment_0_0_1_in_rule__Simple_selector__Alternatives_0_02834);
                    rule__Simple_selector__UniversalAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1()); 
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
    // $ANTLR end "rule__Simple_selector__Alternatives_0_0"


    // $ANTLR start "rule__SubSelector__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1380:1: rule__SubSelector__Alternatives : ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClass ) );
    public final void rule__SubSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1384:1: ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClass ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt11=1;
                }
                break;
            case 40:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case RULE_IDENT:
            case 37:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1385:1: ( ruleIdSelector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1385:1: ( ruleIdSelector )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1386:1: ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_rule__SubSelector__Alternatives2867);
                    ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1391:6: ( ruleClassSelector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1391:6: ( ruleClassSelector )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1392:1: ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_rule__SubSelector__Alternatives2884);
                    ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1397:6: ( ruleAttributeSelector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1397:6: ( ruleAttributeSelector )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1398:1: ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_rule__SubSelector__Alternatives2901);
                    ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1403:6: ( rulePseudoClass )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1403:6: ( rulePseudoClass )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1404:1: rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getPseudoClassParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_rule__SubSelector__Alternatives2918);
                    rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getPseudoClassParserRuleCall_3()); 
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
    // $ANTLR end "rule__SubSelector__Alternatives"


    // $ANTLR start "rule__AttributeSelector__OpAlternatives_3_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1414:1: rule__AttributeSelector__OpAlternatives_3_0_0 : ( ( '^=' ) | ( '$=' ) | ( '*=' ) | ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) );
    public final void rule__AttributeSelector__OpAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1418:1: ( ( '^=' ) | ( '$=' ) | ( '*=' ) | ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case RULE_INCLUDES:
                {
                alt12=5;
                }
                break;
            case RULE_DASHMATCH:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1419:1: ( '^=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1419:1: ( '^=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1420:1: '^='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__AttributeSelector__OpAlternatives_3_0_02951); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1427:6: ( '$=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1427:6: ( '$=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1428:1: '$='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__AttributeSelector__OpAlternatives_3_0_02971); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1435:6: ( '*=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1435:6: ( '*=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1436:1: '*='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__AttributeSelector__OpAlternatives_3_0_02991); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1443:6: ( '=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1443:6: ( '=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1444:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__AttributeSelector__OpAlternatives_3_0_03011); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1451:6: ( RULE_INCLUDES )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1451:6: ( RULE_INCLUDES )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1452:1: RULE_INCLUDES
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4()); 
                    }
                    match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rule__AttributeSelector__OpAlternatives_3_0_03030); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1457:6: ( RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1457:6: ( RULE_DASHMATCH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1458:1: RULE_DASHMATCH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5()); 
                    }
                    match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rule__AttributeSelector__OpAlternatives_3_0_03047); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5()); 
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
    // $ANTLR end "rule__AttributeSelector__OpAlternatives_3_0_0"


    // $ANTLR start "rule__AttributeSelector__ValueAlternatives_3_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1468:1: rule__AttributeSelector__ValueAlternatives_3_1_0 : ( ( RULE_IDENT ) | ( RULE_STRING ) );
    public final void rule__AttributeSelector__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1472:1: ( ( RULE_IDENT ) | ( RULE_STRING ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDENT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1473:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1473:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1474:1: RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getValueIDENTTerminalRuleCall_3_1_0_0()); 
                    }
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttributeSelector__ValueAlternatives_3_1_03079); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getValueIDENTTerminalRuleCall_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1479:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1479:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1480:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getValueSTRINGTerminalRuleCall_3_1_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeSelector__ValueAlternatives_3_1_03096); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getValueSTRINGTerminalRuleCall_3_1_0_1()); 
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
    // $ANTLR end "rule__AttributeSelector__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__Css_namespace_prefix__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1490:1: rule__Css_namespace_prefix__Alternatives_0 : ( ( RULE_IDENT ) | ( '*' ) );
    public final void rule__Css_namespace_prefix__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1494:1: ( ( RULE_IDENT ) | ( '*' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENT) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1495:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1495:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1496:1: RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_namespace_prefix__Alternatives_03128); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCss_namespace_prefixAccess().getIDENTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1501:6: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1501:6: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1502:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Css_namespace_prefix__Alternatives_03146); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
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
    // $ANTLR end "rule__Css_namespace_prefix__Alternatives_0"


    // $ANTLR start "rule__PseudoClass__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1514:1: rule__PseudoClass__Alternatives : ( ( ( rule__PseudoClass__Group_0__0 ) ) | ( rulePseudoClassFunction ) );
    public final void rule__PseudoClass__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1518:1: ( ( ( rule__PseudoClass__Group_0__0 ) ) | ( rulePseudoClassFunction ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_IDENT) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1519:1: ( ( rule__PseudoClass__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1519:1: ( ( rule__PseudoClass__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1520:1: ( rule__PseudoClass__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPseudoClassAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1521:1: ( rule__PseudoClass__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1521:2: rule__PseudoClass__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PseudoClass__Group_0__0_in_rule__PseudoClass__Alternatives3180);
                    rule__PseudoClass__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPseudoClassAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1525:6: ( rulePseudoClassFunction )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1525:6: ( rulePseudoClassFunction )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1526:1: rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPseudoClassAccess().getPseudoClassFunctionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePseudoClassFunction_in_rule__PseudoClass__Alternatives3198);
                    rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPseudoClassAccess().getPseudoClassFunctionParserRuleCall_1()); 
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
    // $ANTLR end "rule__PseudoClass__Alternatives"


    // $ANTLR start "rule__Combinator__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1536:1: rule__Combinator__Alternatives_0 : ( ( '+' ) | ( '>' ) | ( '~' ) );
    public final void rule__Combinator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1540:1: ( ( '+' ) | ( '>' ) | ( '~' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1541:1: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1541:1: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1542:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Combinator__Alternatives_03231); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1549:6: ( '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1549:6: ( '>' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1550:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Combinator__Alternatives_03251); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1557:6: ( '~' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1557:6: ( '~' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1558:1: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__Combinator__Alternatives_03271); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinatorAccess().getTildeKeyword_0_2()); 
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
    // $ANTLR end "rule__Combinator__Alternatives_0"


    // $ANTLR start "rule__Unary_operator__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1571:1: rule__Unary_operator__Alternatives : ( ( '-' ) | ( '+' ) );
    public final void rule__Unary_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1575:1: ( ( '-' ) | ( '+' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1576:1: ( '-' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1576:1: ( '-' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1577:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__Unary_operator__Alternatives3307); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1584:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1584:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1585:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Unary_operator__Alternatives3327); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
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
    // $ANTLR end "rule__Unary_operator__Alternatives"


    // $ANTLR start "rule__SymbolTok__SymbolAlternatives_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1597:1: rule__SymbolTok__SymbolAlternatives_1_0 : ( ( RULE_COMMA ) | ( RULE_PERCENT ) );
    public final void rule__SymbolTok__SymbolAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1601:1: ( ( RULE_COMMA ) | ( RULE_PERCENT ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMMA) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_PERCENT) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1602:1: ( RULE_COMMA )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1602:1: ( RULE_COMMA )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1603:1: RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__SymbolTok__SymbolAlternatives_1_03361); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1608:6: ( RULE_PERCENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1608:6: ( RULE_PERCENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1609:1: RULE_PERCENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rule__SymbolTok__SymbolAlternatives_1_03378); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__SymbolTok__SymbolAlternatives_1_0"


    // $ANTLR start "rule__ColorTok__ColorAlternatives_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1619:1: rule__ColorTok__ColorAlternatives_2_0 : ( ( RULE_HEX ) | ( RULE_IDENT ) );
    public final void rule__ColorTok__ColorAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1623:1: ( ( RULE_HEX ) | ( RULE_IDENT ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_HEX) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_IDENT) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1624:1: ( RULE_HEX )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1624:1: ( RULE_HEX )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1625:1: RULE_HEX
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorTokAccess().getColorHEXTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_rule__ColorTok__ColorAlternatives_2_03410); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorTokAccess().getColorHEXTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1630:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1630:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1631:1: RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorTokAccess().getColorIDENTTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ColorTok__ColorAlternatives_2_03427); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorTokAccess().getColorIDENTTerminalRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__ColorTok__ColorAlternatives_2_0"


    // $ANTLR start "rule__CssTok__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1641:1: rule__CssTok__Alternatives : ( ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleFuncTok ) | ( ruleNumberTok ) | ( ruleIdentifierTok ) | ( ruleUrlTok ) | ( ruleColorTok ) );
    public final void rule__CssTok__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1645:1: ( ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleFuncTok ) | ( ruleNumberTok ) | ( ruleIdentifierTok ) | ( ruleUrlTok ) | ( ruleColorTok ) )
            int alt20=8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1646:1: ( ruleSymbolTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1646:1: ( ruleSymbolTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1647:1: ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSymbolTok_in_rule__CssTok__Alternatives3459);
                    ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1652:6: ( ruleWSTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1652:6: ( ruleWSTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1653:1: ruleWSTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWSTok_in_rule__CssTok__Alternatives3476);
                    ruleWSTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1658:6: ( ruleStringTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1658:6: ( ruleStringTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1659:1: ruleStringTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringTok_in_rule__CssTok__Alternatives3493);
                    ruleStringTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1664:6: ( ruleFuncTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1664:6: ( ruleFuncTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1665:1: ruleFuncTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getFuncTokParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFuncTok_in_rule__CssTok__Alternatives3510);
                    ruleFuncTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getFuncTokParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1670:6: ( ruleNumberTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1670:6: ( ruleNumberTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1671:1: ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumberTok_in_rule__CssTok__Alternatives3527);
                    ruleNumberTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1676:6: ( ruleIdentifierTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1676:6: ( ruleIdentifierTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1677:1: ruleIdentifierTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getIdentifierTokParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifierTok_in_rule__CssTok__Alternatives3544);
                    ruleIdentifierTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getIdentifierTokParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1682:6: ( ruleUrlTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1682:6: ( ruleUrlTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1683:1: ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleUrlTok_in_rule__CssTok__Alternatives3561);
                    ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1688:6: ( ruleColorTok )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1688:6: ( ruleColorTok )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1689:1: ruleColorTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleColorTok_in_rule__CssTok__Alternatives3578);
                    ruleColorTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_7()); 
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
    // $ANTLR end "rule__CssTok__Alternatives"


    // $ANTLR start "rule__Stylesheet__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1702:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
    public final void rule__Stylesheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1706:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1707:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__03609);
            rule__Stylesheet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__03612);
            rule__Stylesheet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1714:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__CharsetAssignment_0 )? ) ;
    public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1718:1: ( ( ( rule__Stylesheet__CharsetAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1719:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1719:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1720:1: ( rule__Stylesheet__CharsetAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1721:1: ( rule__Stylesheet__CharsetAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=17 && LA21_0<=18)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1721:2: rule__Stylesheet__CharsetAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__CharsetAssignment_0_in_rule__Stylesheet__Group__0__Impl3639);
                    rule__Stylesheet__CharsetAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 
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
    // $ANTLR end "rule__Stylesheet__Group__0__Impl"


    // $ANTLR start "rule__Stylesheet__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1731:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
    public final void rule__Stylesheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1735:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1736:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__13670);
            rule__Stylesheet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__13673);
            rule__Stylesheet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1743:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__ImportsAssignment_1 )* ) ;
    public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1747:1: ( ( ( rule__Stylesheet__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1748:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1748:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1749:1: ( rule__Stylesheet__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1750:1: ( rule__Stylesheet__ImportsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=19 && LA22_0<=20)||LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1750:2: rule__Stylesheet__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__ImportsAssignment_1_in_rule__Stylesheet__Group__1__Impl3700);
            	    rule__Stylesheet__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 
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
    // $ANTLR end "rule__Stylesheet__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1760:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl ;
    public final void rule__Stylesheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1764:1: ( rule__Stylesheet__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1765:2: rule__Stylesheet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__23731);
            rule__Stylesheet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1771:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__Alternatives_2 )* ) ;
    public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1775:1: ( ( ( rule__Stylesheet__Alternatives_2 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1776:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1776:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1777:1: ( rule__Stylesheet__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getAlternatives_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1778:1: ( rule__Stylesheet__Alternatives_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_IDENT||LA23_0==RULE_HASHMARK||(LA23_0>=21 && LA23_0<=24)||LA23_0==29||(LA23_0>=37 && LA23_0<=38)||(LA23_0>=40 && LA23_0<=41)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1778:2: rule__Stylesheet__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__Alternatives_2_in_rule__Stylesheet__Group__2__Impl3758);
            	    rule__Stylesheet__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__Stylesheet__Group__2__Impl"


    // $ANTLR start "rule__Charset__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1794:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1798:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1799:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__03795);
            rule__Charset__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__03798);
            rule__Charset__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1806:1: rule__Charset__Group__0__Impl : ( ( rule__Charset__Alternatives_0 ) ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1810:1: ( ( ( rule__Charset__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1811:1: ( ( rule__Charset__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1811:1: ( ( rule__Charset__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1812:1: ( rule__Charset__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetAccess().getAlternatives_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1813:1: ( rule__Charset__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1813:2: rule__Charset__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Charset__Alternatives_0_in_rule__Charset__Group__0__Impl3825);
            rule__Charset__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Charset__Group__0__Impl"


    // $ANTLR start "rule__Charset__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1823:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1827:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1828:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__13855);
            rule__Charset__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__13858);
            rule__Charset__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1835:1: rule__Charset__Group__1__Impl : ( ( rule__Charset__CharsetAssignment_1 ) ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1839:1: ( ( ( rule__Charset__CharsetAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1840:1: ( ( rule__Charset__CharsetAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1840:1: ( ( rule__Charset__CharsetAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1841:1: ( rule__Charset__CharsetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetAccess().getCharsetAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1842:1: ( rule__Charset__CharsetAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1842:2: rule__Charset__CharsetAssignment_1
            {
            pushFollow(FOLLOW_rule__Charset__CharsetAssignment_1_in_rule__Charset__Group__1__Impl3885);
            rule__Charset__CharsetAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetAccess().getCharsetAssignment_1()); 
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
    // $ANTLR end "rule__Charset__Group__1__Impl"


    // $ANTLR start "rule__Charset__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1852:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1856:1: ( rule__Charset__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1857:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__23915);
            rule__Charset__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1863:1: rule__Charset__Group__2__Impl : ( ';' ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1867:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1868:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1868:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1869:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetAccess().getSemicolonKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__Charset__Group__2__Impl3943); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Charset__Group__2__Impl"


    // $ANTLR start "rule__ImportExpression__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1888:1: rule__ImportExpression__Group_0__0 : rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1 ;
    public final void rule__ImportExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1892:1: ( rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1893:2: rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__0__Impl_in_rule__ImportExpression__Group_0__03980);
            rule__ImportExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__1_in_rule__ImportExpression__Group_0__03983);
            rule__ImportExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1900:1: rule__ImportExpression__Group_0__0__Impl : ( ( rule__ImportExpression__Alternatives_0_0 ) ) ;
    public final void rule__ImportExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1904:1: ( ( ( rule__ImportExpression__Alternatives_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1905:1: ( ( rule__ImportExpression__Alternatives_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1905:1: ( ( rule__ImportExpression__Alternatives_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1906:1: ( rule__ImportExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getAlternatives_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1907:1: ( rule__ImportExpression__Alternatives_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1907:2: rule__ImportExpression__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__ImportExpression__Alternatives_0_0_in_rule__ImportExpression__Group_0__0__Impl4010);
            rule__ImportExpression__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getAlternatives_0_0()); 
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
    // $ANTLR end "rule__ImportExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ImportExpression__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1917:1: rule__ImportExpression__Group_0__1 : rule__ImportExpression__Group_0__1__Impl ;
    public final void rule__ImportExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1921:1: ( rule__ImportExpression__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1922:2: rule__ImportExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__1__Impl_in_rule__ImportExpression__Group_0__14040);
            rule__ImportExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1928:1: rule__ImportExpression__Group_0__1__Impl : ( ( rule__ImportExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__ImportExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1932:1: ( ( ( rule__ImportExpression__ValueAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1933:1: ( ( rule__ImportExpression__ValueAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1933:1: ( ( rule__ImportExpression__ValueAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1934:1: ( rule__ImportExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getValueAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1935:1: ( rule__ImportExpression__ValueAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1935:2: rule__ImportExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ImportExpression__ValueAssignment_0_1_in_rule__ImportExpression__Group_0__1__Impl4067);
            rule__ImportExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getValueAssignment_0_1()); 
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
    // $ANTLR end "rule__ImportExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1949:1: rule__ImportExpression__Group_1__0 : rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1 ;
    public final void rule__ImportExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1953:1: ( rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1954:2: rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__0__Impl_in_rule__ImportExpression__Group_1__04101);
            rule__ImportExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__1_in_rule__ImportExpression__Group_1__04104);
            rule__ImportExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1961:1: rule__ImportExpression__Group_1__0__Impl : ( ruleURLType ) ;
    public final void rule__ImportExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1965:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1966:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1966:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1967:1: ruleURLType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_rule__ImportExpression__Group_1__0__Impl4131);
            ruleURLType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ImportExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1978:1: rule__ImportExpression__Group_1__1 : rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2 ;
    public final void rule__ImportExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1982:1: ( rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1983:2: rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__1__Impl_in_rule__ImportExpression__Group_1__14160);
            rule__ImportExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__2_in_rule__ImportExpression__Group_1__14163);
            rule__ImportExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1990:1: rule__ImportExpression__Group_1__1__Impl : ( ( rule__ImportExpression__MediaListAssignment_1_1 )? ) ;
    public final void rule__ImportExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1994:1: ( ( ( rule__ImportExpression__MediaListAssignment_1_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1995:1: ( ( rule__ImportExpression__MediaListAssignment_1_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1995:1: ( ( rule__ImportExpression__MediaListAssignment_1_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1996:1: ( rule__ImportExpression__MediaListAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1997:1: ( rule__ImportExpression__MediaListAssignment_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1997:2: rule__ImportExpression__MediaListAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__MediaListAssignment_1_1_in_rule__ImportExpression__Group_1__1__Impl4190);
                    rule__ImportExpression__MediaListAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1()); 
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
    // $ANTLR end "rule__ImportExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2007:1: rule__ImportExpression__Group_1__2 : rule__ImportExpression__Group_1__2__Impl ;
    public final void rule__ImportExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2011:1: ( rule__ImportExpression__Group_1__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2012:2: rule__ImportExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__2__Impl_in_rule__ImportExpression__Group_1__24221);
            rule__ImportExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2018:1: rule__ImportExpression__Group_1__2__Impl : ( ';' ) ;
    public final void rule__ImportExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2022:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2023:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2023:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2024:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ImportExpression__Group_1__2__Impl4249); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2()); 
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
    // $ANTLR end "rule__ImportExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2043:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2047:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2048:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__04286);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__04289);
            rule__Page__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2055:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2059:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2060:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2060:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2061:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2062:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2064:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageAction_0()); 
            }

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2074:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2078:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2079:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__14347);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__14350);
            rule__Page__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2086:1: rule__Page__Group__1__Impl : ( ( rule__Page__Alternatives_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2090:1: ( ( ( rule__Page__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2091:1: ( ( rule__Page__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2091:1: ( ( rule__Page__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2092:1: ( rule__Page__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2093:1: ( rule__Page__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2093:2: rule__Page__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Page__Alternatives_1_in_rule__Page__Group__1__Impl4377);
            rule__Page__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2103:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2107:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2108:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__24407);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__24410);
            rule__Page__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2115:1: rule__Page__Group__2__Impl : ( ( rule__Page__PseudoPageAssignment_2 )? ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2119:1: ( ( ( rule__Page__PseudoPageAssignment_2 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2120:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2120:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2121:1: ( rule__Page__PseudoPageAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPseudoPageAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2122:1: ( rule__Page__PseudoPageAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2122:2: rule__Page__PseudoPageAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Page__PseudoPageAssignment_2_in_rule__Page__Group__2__Impl4437);
                    rule__Page__PseudoPageAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPseudoPageAssignment_2()); 
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
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2132:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2136:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2137:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__34468);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__34471);
            rule__Page__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2144:1: rule__Page__Group__3__Impl : ( '{' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2148:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2149:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2149:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2150:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Page__Group__3__Impl4499); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2163:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2167:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2168:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__44530);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__44533);
            rule__Page__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2175:1: rule__Page__Group__4__Impl : ( ( rule__Page__DeclarationsAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2179:1: ( ( ( rule__Page__DeclarationsAssignment_4 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2180:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2180:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2181:1: ( rule__Page__DeclarationsAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDeclarationsAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2182:1: ( rule__Page__DeclarationsAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IDENT||LA26_0==RULE_WS||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2182:2: rule__Page__DeclarationsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_4_in_rule__Page__Group__4__Impl4560);
                    rule__Page__DeclarationsAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDeclarationsAssignment_4()); 
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
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2192:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2196:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2197:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__54591);
            rule__Page__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__54594);
            rule__Page__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2204:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )* ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2208:1: ( ( ( rule__Page__Group_5__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2209:1: ( ( rule__Page__Group_5__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2209:1: ( ( rule__Page__Group_5__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2210:1: ( rule__Page__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2211:1: ( rule__Page__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==34) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2211:2: rule__Page__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl4621);
            	    rule__Page__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2221:1: rule__Page__Group__6 : rule__Page__Group__6__Impl ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2225:1: ( rule__Page__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2226:2: rule__Page__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__64652);
            rule__Page__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2232:1: rule__Page__Group__6__Impl : ( '}' ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2236:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2237:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2237:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2238:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,36,FOLLOW_36_in_rule__Page__Group__6__Impl4680); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group_5__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2265:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2269:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2270:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__04725);
            rule__Page__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__04728);
            rule__Page__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2277:1: rule__Page__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2281:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2282:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2282:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2283:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getSemicolonKeyword_5_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Page__Group_5__0__Impl4756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getSemicolonKeyword_5_0()); 
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
    // $ANTLR end "rule__Page__Group_5__0__Impl"


    // $ANTLR start "rule__Page__Group_5__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2296:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2300:1: ( rule__Page__Group_5__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2301:2: rule__Page__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__14787);
            rule__Page__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2307:1: rule__Page__Group_5__1__Impl : ( ( rule__Page__DeclarationsAssignment_5_1 )? ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2311:1: ( ( ( rule__Page__DeclarationsAssignment_5_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2312:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2312:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2313:1: ( rule__Page__DeclarationsAssignment_5_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2314:1: ( rule__Page__DeclarationsAssignment_5_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENT||LA28_0==RULE_WS||LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2314:2: rule__Page__DeclarationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_5_1_in_rule__Page__Group_5__1__Impl4814);
                    rule__Page__DeclarationsAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1()); 
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
    // $ANTLR end "rule__Page__Group_5__1__Impl"


    // $ANTLR start "rule__Pseudo_page__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2328:1: rule__Pseudo_page__Group__0 : rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 ;
    public final void rule__Pseudo_page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2332:1: ( rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2333:2: rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__0__Impl_in_rule__Pseudo_page__Group__04849);
            rule__Pseudo_page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pseudo_page__Group__1_in_rule__Pseudo_page__Group__04852);
            rule__Pseudo_page__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2340:1: rule__Pseudo_page__Group__0__Impl : ( ':' ) ;
    public final void rule__Pseudo_page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2344:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2345:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2345:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2346:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Pseudo_page__Group__0__Impl4880); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
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
    // $ANTLR end "rule__Pseudo_page__Group__0__Impl"


    // $ANTLR start "rule__Pseudo_page__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2359:1: rule__Pseudo_page__Group__1 : rule__Pseudo_page__Group__1__Impl ;
    public final void rule__Pseudo_page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2363:1: ( rule__Pseudo_page__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2364:2: rule__Pseudo_page__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__1__Impl_in_rule__Pseudo_page__Group__14911);
            rule__Pseudo_page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2370:1: rule__Pseudo_page__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Pseudo_page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2374:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2375:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2375:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2376:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pseudo_page__Group__1__Impl4938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Pseudo_page__Group__1__Impl"


    // $ANTLR start "rule__Media__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2391:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
    public final void rule__Media__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2395:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2396:2: rule__Media__Group__0__Impl rule__Media__Group__1
            {
            pushFollow(FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__04971);
            rule__Media__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Media__Group__1_in_rule__Media__Group__04974);
            rule__Media__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2403:1: rule__Media__Group__0__Impl : ( ( rule__Media__Alternatives_0 ) ) ;
    public final void rule__Media__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2407:1: ( ( ( rule__Media__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2408:1: ( ( rule__Media__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2408:1: ( ( rule__Media__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2409:1: ( rule__Media__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getAlternatives_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2410:1: ( rule__Media__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2410:2: rule__Media__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Media__Alternatives_0_in_rule__Media__Group__0__Impl5001);
            rule__Media__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Media__Group__0__Impl"


    // $ANTLR start "rule__Media__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2420:1: rule__Media__Group__1 : rule__Media__Group__1__Impl rule__Media__Group__2 ;
    public final void rule__Media__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2424:1: ( rule__Media__Group__1__Impl rule__Media__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2425:2: rule__Media__Group__1__Impl rule__Media__Group__2
            {
            pushFollow(FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__15031);
            rule__Media__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Media__Group__2_in_rule__Media__Group__15034);
            rule__Media__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2432:1: rule__Media__Group__1__Impl : ( ( rule__Media__MedialistAssignment_1 ) ) ;
    public final void rule__Media__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2436:1: ( ( ( rule__Media__MedialistAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2437:1: ( ( rule__Media__MedialistAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2437:1: ( ( rule__Media__MedialistAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2438:1: ( rule__Media__MedialistAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2439:1: ( rule__Media__MedialistAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2439:2: rule__Media__MedialistAssignment_1
            {
            pushFollow(FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl5061);
            rule__Media__MedialistAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 
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
    // $ANTLR end "rule__Media__Group__1__Impl"


    // $ANTLR start "rule__Media__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2449:1: rule__Media__Group__2 : rule__Media__Group__2__Impl rule__Media__Group__3 ;
    public final void rule__Media__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2453:1: ( rule__Media__Group__2__Impl rule__Media__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2454:2: rule__Media__Group__2__Impl rule__Media__Group__3
            {
            pushFollow(FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__25091);
            rule__Media__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Media__Group__3_in_rule__Media__Group__25094);
            rule__Media__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2461:1: rule__Media__Group__2__Impl : ( '{' ) ;
    public final void rule__Media__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2465:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2466:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2466:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2467:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Media__Group__2__Impl5122); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Media__Group__2__Impl"


    // $ANTLR start "rule__Media__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2480:1: rule__Media__Group__3 : rule__Media__Group__3__Impl rule__Media__Group__4 ;
    public final void rule__Media__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2484:1: ( rule__Media__Group__3__Impl rule__Media__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2485:2: rule__Media__Group__3__Impl rule__Media__Group__4
            {
            pushFollow(FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__35153);
            rule__Media__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Media__Group__4_in_rule__Media__Group__35156);
            rule__Media__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2492:1: rule__Media__Group__3__Impl : ( ( rule__Media__RulesetsAssignment_3 )* ) ;
    public final void rule__Media__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2496:1: ( ( ( rule__Media__RulesetsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2497:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2497:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2498:1: ( rule__Media__RulesetsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2499:1: ( rule__Media__RulesetsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_IDENT||LA29_0==RULE_HASHMARK||LA29_0==29||(LA29_0>=37 && LA29_0<=38)||(LA29_0>=40 && LA29_0<=41)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2499:2: rule__Media__RulesetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl5183);
            	    rule__Media__RulesetsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 
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
    // $ANTLR end "rule__Media__Group__3__Impl"


    // $ANTLR start "rule__Media__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2509:1: rule__Media__Group__4 : rule__Media__Group__4__Impl ;
    public final void rule__Media__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2513:1: ( rule__Media__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2514:2: rule__Media__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__45214);
            rule__Media__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2520:1: rule__Media__Group__4__Impl : ( '}' ) ;
    public final void rule__Media__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2524:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2525:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2525:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2526:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__Media__Group__4__Impl5242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Media__Group__4__Impl"


    // $ANTLR start "rule__Media_list__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2549:1: rule__Media_list__Group__0 : rule__Media_list__Group__0__Impl rule__Media_list__Group__1 ;
    public final void rule__Media_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2553:1: ( rule__Media_list__Group__0__Impl rule__Media_list__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2554:2: rule__Media_list__Group__0__Impl rule__Media_list__Group__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__05283);
            rule__Media_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__05286);
            rule__Media_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2561:1: rule__Media_list__Group__0__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2565:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2566:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2566:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2567:1: rulemedium
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl5313);
            rulemedium();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
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
    // $ANTLR end "rule__Media_list__Group__0__Impl"


    // $ANTLR start "rule__Media_list__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2578:1: rule__Media_list__Group__1 : rule__Media_list__Group__1__Impl ;
    public final void rule__Media_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2582:1: ( rule__Media_list__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2583:2: rule__Media_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__15342);
            rule__Media_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2589:1: rule__Media_list__Group__1__Impl : ( ( rule__Media_list__Group_1__0 )* ) ;
    public final void rule__Media_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2593:1: ( ( ( rule__Media_list__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2594:1: ( ( rule__Media_list__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2594:1: ( ( rule__Media_list__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2595:1: ( rule__Media_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedia_listAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2596:1: ( rule__Media_list__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2596:2: rule__Media_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl5369);
            	    rule__Media_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedia_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Media_list__Group__1__Impl"


    // $ANTLR start "rule__Media_list__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2610:1: rule__Media_list__Group_1__0 : rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 ;
    public final void rule__Media_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2614:1: ( rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2615:2: rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__05404);
            rule__Media_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__05407);
            rule__Media_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2622:1: rule__Media_list__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Media_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2626:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2627:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2627:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2628:1: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl5434); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Media_list__Group_1__0__Impl"


    // $ANTLR start "rule__Media_list__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2639:1: rule__Media_list__Group_1__1 : rule__Media_list__Group_1__1__Impl ;
    public final void rule__Media_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2643:1: ( rule__Media_list__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2644:2: rule__Media_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__15463);
            rule__Media_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2650:1: rule__Media_list__Group_1__1__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2654:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2655:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2655:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2656:1: rulemedium
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl5490);
            rulemedium();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Media_list__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2671:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
    public final void rule__Ruleset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2675:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2676:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__05523);
            rule__Ruleset__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__05526);
            rule__Ruleset__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2683:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
    public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2687:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2688:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2688:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2689:1: ( rule__Ruleset__SelectorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2690:1: ( rule__Ruleset__SelectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2690:2: rule__Ruleset__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl5553);
            rule__Ruleset__SelectorsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
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
    // $ANTLR end "rule__Ruleset__Group__0__Impl"


    // $ANTLR start "rule__Ruleset__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2700:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
    public final void rule__Ruleset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2704:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2705:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__15583);
            rule__Ruleset__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__15586);
            rule__Ruleset__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2712:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
    public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2716:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2717:1: ( ( rule__Ruleset__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2717:1: ( ( rule__Ruleset__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2718:1: ( rule__Ruleset__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2719:1: ( rule__Ruleset__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2719:2: rule__Ruleset__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl5613);
            	    rule__Ruleset__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Ruleset__Group__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2729:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
    public final void rule__Ruleset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2733:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2734:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__25644);
            rule__Ruleset__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__25647);
            rule__Ruleset__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2741:1: rule__Ruleset__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2745:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2746:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2746:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2747:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2748:1: ( RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2748:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Ruleset__Group__2__Impl5675); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Ruleset__Group__2__Impl"


    // $ANTLR start "rule__Ruleset__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2758:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
    public final void rule__Ruleset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2762:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2763:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__35706);
            rule__Ruleset__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__35709);
            rule__Ruleset__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2770:1: rule__Ruleset__Group__3__Impl : ( '{' ) ;
    public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2774:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2775:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2775:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2776:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Ruleset__Group__3__Impl5737); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Ruleset__Group__3__Impl"


    // $ANTLR start "rule__Ruleset__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2789:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 ;
    public final void rule__Ruleset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2793:1: ( rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2794:2: rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__45768);
            rule__Ruleset__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group__5_in_rule__Ruleset__Group__45771);
            rule__Ruleset__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2801:1: rule__Ruleset__Group__4__Impl : ( ( rule__Ruleset__Group_4__0 )* ) ;
    public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2805:1: ( ( ( rule__Ruleset__Group_4__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2806:1: ( ( rule__Ruleset__Group_4__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2806:1: ( ( rule__Ruleset__Group_4__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2807:1: ( rule__Ruleset__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2808:1: ( rule__Ruleset__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_IDENT||LA33_0==RULE_WS||LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2808:2: rule__Ruleset__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_4__0_in_rule__Ruleset__Group__4__Impl5798);
            	    rule__Ruleset__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Ruleset__Group__4__Impl"


    // $ANTLR start "rule__Ruleset__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2818:1: rule__Ruleset__Group__5 : rule__Ruleset__Group__5__Impl ;
    public final void rule__Ruleset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2822:1: ( rule__Ruleset__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2823:2: rule__Ruleset__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__5__Impl_in_rule__Ruleset__Group__55829);
            rule__Ruleset__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__5"


    // $ANTLR start "rule__Ruleset__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2829:1: rule__Ruleset__Group__5__Impl : ( '}' ) ;
    public final void rule__Ruleset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2833:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2834:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2834:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2835:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,36,FOLLOW_36_in_rule__Ruleset__Group__5__Impl5857); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Ruleset__Group__5__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2860:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
    public final void rule__Ruleset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2864:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2865:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__05900);
            rule__Ruleset__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__05903);
            rule__Ruleset__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2872:1: rule__Ruleset__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2876:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2877:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2877:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2878:1: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl5930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Ruleset__Group_1__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2889:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl ;
    public final void rule__Ruleset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2893:1: ( rule__Ruleset__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2894:2: rule__Ruleset__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__15959);
            rule__Ruleset__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2900:1: rule__Ruleset__Group_1__1__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) ;
    public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2904:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2905:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2905:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2906:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2907:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2907:2: rule__Ruleset__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl5986);
            rule__Ruleset__SelectorsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 
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
    // $ANTLR end "rule__Ruleset__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group_4__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2921:1: rule__Ruleset__Group_4__0 : rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1 ;
    public final void rule__Ruleset__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2925:1: ( rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2926:2: rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_4__0__Impl_in_rule__Ruleset__Group_4__06020);
            rule__Ruleset__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ruleset__Group_4__1_in_rule__Ruleset__Group_4__06023);
            rule__Ruleset__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__0"


    // $ANTLR start "rule__Ruleset__Group_4__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2933:1: rule__Ruleset__Group_4__0__Impl : ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) ) ;
    public final void rule__Ruleset__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2937:1: ( ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2938:1: ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2938:1: ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2939:1: ( rule__Ruleset__DeclarationsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2940:1: ( rule__Ruleset__DeclarationsAssignment_4_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2940:2: rule__Ruleset__DeclarationsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Ruleset__DeclarationsAssignment_4_0_in_rule__Ruleset__Group_4__0__Impl6050);
            rule__Ruleset__DeclarationsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0()); 
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
    // $ANTLR end "rule__Ruleset__Group_4__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_4__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2950:1: rule__Ruleset__Group_4__1 : rule__Ruleset__Group_4__1__Impl ;
    public final void rule__Ruleset__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2954:1: ( rule__Ruleset__Group_4__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2955:2: rule__Ruleset__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_4__1__Impl_in_rule__Ruleset__Group_4__16080);
            rule__Ruleset__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__1"


    // $ANTLR start "rule__Ruleset__Group_4__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2961:1: rule__Ruleset__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Ruleset__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2965:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2966:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2966:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2967:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Ruleset__Group_4__1__Impl6108); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1()); 
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
    // $ANTLR end "rule__Ruleset__Group_4__1__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2984:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2988:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2989:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__06143);
            rule__Selector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__06146);
            rule__Selector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2996:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3000:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3001:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3001:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3002:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3003:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3003:2: rule__Selector__SimpleselectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl6173);
            rule__Selector__SimpleselectorsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
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
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3013:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3017:1: ( rule__Selector__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3018:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__16203);
            rule__Selector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3024:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3028:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3029:1: ( ( rule__Selector__Alternatives_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3029:1: ( ( rule__Selector__Alternatives_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3030:1: ( rule__Selector__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3031:1: ( rule__Selector__Alternatives_1 )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3031:2: rule__Selector__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl6230);
                    rule__Selector__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3045:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
    public final void rule__Selector__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3049:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3050:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__06265);
            rule__Selector__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__06268);
            rule__Selector__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3057:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
    public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3061:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3062:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3062:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3063:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3064:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3064:2: rule__Selector__CombinatorAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl6295);
            rule__Selector__CombinatorAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
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
    // $ANTLR end "rule__Selector__Group_1_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3074:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl ;
    public final void rule__Selector__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3078:1: ( rule__Selector__Group_1_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3079:2: rule__Selector__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__16325);
            rule__Selector__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3085:1: rule__Selector__Group_1_0__1__Impl : ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3089:1: ( ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3090:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3090:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3091:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3092:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3092:2: rule__Selector__SelectorAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl6352);
            rule__Selector__SelectorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 
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
    // $ANTLR end "rule__Selector__Group_1_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3106:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3110:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3111:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__06386);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__06389);
            rule__Selector__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3118:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3122:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3123:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3123:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3124:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3124:1: ( ( RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3125:1: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3126:1: ( RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3126:3: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl6419); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3129:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3130:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3131:1: ( RULE_WS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_WS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3131:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl6432); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3142:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2 ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3146:1: ( rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3147:2: rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__16465);
            rule__Selector__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selector__Group_1_1__2_in_rule__Selector__Group_1_1__16468);
            rule__Selector__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3154:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1 )? ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3158:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3159:1: ( ( rule__Selector__CombinatorAssignment_1_1_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3159:1: ( ( rule__Selector__CombinatorAssignment_1_1_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3160:1: ( rule__Selector__CombinatorAssignment_1_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3161:1: ( rule__Selector__CombinatorAssignment_1_1_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=30 && LA36_0<=32)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3161:2: rule__Selector__CombinatorAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_in_rule__Selector__Group_1_1__1__Impl6495);
                    rule__Selector__CombinatorAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1()); 
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
    // $ANTLR end "rule__Selector__Group_1_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3171:1: rule__Selector__Group_1_1__2 : rule__Selector__Group_1_1__2__Impl ;
    public final void rule__Selector__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3175:1: ( rule__Selector__Group_1_1__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3176:2: rule__Selector__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__2__Impl_in_rule__Selector__Group_1_1__26526);
            rule__Selector__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__2"


    // $ANTLR start "rule__Selector__Group_1_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3182:1: rule__Selector__Group_1_1__2__Impl : ( ( rule__Selector__SelectorAssignment_1_1_2 ) ) ;
    public final void rule__Selector__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3186:1: ( ( ( rule__Selector__SelectorAssignment_1_1_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3187:1: ( ( rule__Selector__SelectorAssignment_1_1_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3187:1: ( ( rule__Selector__SelectorAssignment_1_1_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3188:1: ( rule__Selector__SelectorAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3189:1: ( rule__Selector__SelectorAssignment_1_1_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3189:2: rule__Selector__SelectorAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_1_2_in_rule__Selector__Group_1_1__2__Impl6553);
            rule__Selector__SelectorAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2()); 
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
    // $ANTLR end "rule__Selector__Group_1_1__2__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3205:1: rule__Simple_selector__Group_0__0 : rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 ;
    public final void rule__Simple_selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3209:1: ( rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3210:2: rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__06589);
            rule__Simple_selector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__06592);
            rule__Simple_selector__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3217:1: rule__Simple_selector__Group_0__0__Impl : ( ( rule__Simple_selector__Alternatives_0_0 ) ) ;
    public final void rule__Simple_selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3221:1: ( ( ( rule__Simple_selector__Alternatives_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3222:1: ( ( rule__Simple_selector__Alternatives_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3222:1: ( ( rule__Simple_selector__Alternatives_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3223:1: ( rule__Simple_selector__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3224:1: ( rule__Simple_selector__Alternatives_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3224:2: rule__Simple_selector__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_0_0_in_rule__Simple_selector__Group_0__0__Impl6619);
            rule__Simple_selector__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0()); 
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
    // $ANTLR end "rule__Simple_selector__Group_0__0__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3234:1: rule__Simple_selector__Group_0__1 : rule__Simple_selector__Group_0__1__Impl ;
    public final void rule__Simple_selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3238:1: ( rule__Simple_selector__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3239:2: rule__Simple_selector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__16649);
            rule__Simple_selector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3245:1: rule__Simple_selector__Group_0__1__Impl : ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) ;
    public final void rule__Simple_selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3249:1: ( ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3250:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3250:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3251:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3252:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_IDENT||LA37_0==RULE_HASHMARK||(LA37_0>=37 && LA37_0<=38)||LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3252:2: rule__Simple_selector__SubSelectorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl6676);
            	    rule__Simple_selector__SubSelectorsAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 
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
    // $ANTLR end "rule__Simple_selector__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3266:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3270:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3271:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group__0__Impl_in_rule__AttributeSelector__Group__06711);
            rule__AttributeSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeSelector__Group__1_in_rule__AttributeSelector__Group__06714);
            rule__AttributeSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__0"


    // $ANTLR start "rule__AttributeSelector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3278:1: rule__AttributeSelector__Group__0__Impl : ( () ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3282:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3283:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3283:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3284:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3285:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3287:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__0__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3297:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2 ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3301:1: ( rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3302:2: rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group__1__Impl_in_rule__AttributeSelector__Group__16772);
            rule__AttributeSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeSelector__Group__2_in_rule__AttributeSelector__Group__16775);
            rule__AttributeSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__1"


    // $ANTLR start "rule__AttributeSelector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3309:1: rule__AttributeSelector__Group__1__Impl : ( '[' ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3313:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3314:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3314:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3315:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__AttributeSelector__Group__1__Impl6803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__AttributeSelector__Group__1__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3328:1: rule__AttributeSelector__Group__2 : rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3 ;
    public final void rule__AttributeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3332:1: ( rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3333:2: rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group__2__Impl_in_rule__AttributeSelector__Group__26834);
            rule__AttributeSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeSelector__Group__3_in_rule__AttributeSelector__Group__26837);
            rule__AttributeSelector__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__2"


    // $ANTLR start "rule__AttributeSelector__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3340:1: rule__AttributeSelector__Group__2__Impl : ( ( rule__AttributeSelector__NameAssignment_2 ) ) ;
    public final void rule__AttributeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3344:1: ( ( ( rule__AttributeSelector__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3345:1: ( ( rule__AttributeSelector__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3345:1: ( ( rule__AttributeSelector__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3346:1: ( rule__AttributeSelector__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3347:1: ( rule__AttributeSelector__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3347:2: rule__AttributeSelector__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__AttributeSelector__NameAssignment_2_in_rule__AttributeSelector__Group__2__Impl6864);
            rule__AttributeSelector__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__AttributeSelector__Group__2__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3357:1: rule__AttributeSelector__Group__3 : rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4 ;
    public final void rule__AttributeSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3361:1: ( rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3362:2: rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group__3__Impl_in_rule__AttributeSelector__Group__36894);
            rule__AttributeSelector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeSelector__Group__4_in_rule__AttributeSelector__Group__36897);
            rule__AttributeSelector__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__3"


    // $ANTLR start "rule__AttributeSelector__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3369:1: rule__AttributeSelector__Group__3__Impl : ( ( rule__AttributeSelector__Group_3__0 )? ) ;
    public final void rule__AttributeSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3373:1: ( ( ( rule__AttributeSelector__Group_3__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3374:1: ( ( rule__AttributeSelector__Group_3__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3374:1: ( ( rule__AttributeSelector__Group_3__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3375:1: ( rule__AttributeSelector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getGroup_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3376:1: ( rule__AttributeSelector__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_INCLUDES && LA38_0<=RULE_DASHMATCH)||(LA38_0>=25 && LA38_0<=28)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3376:2: rule__AttributeSelector__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AttributeSelector__Group_3__0_in_rule__AttributeSelector__Group__3__Impl6924);
                    rule__AttributeSelector__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getGroup_3()); 
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
    // $ANTLR end "rule__AttributeSelector__Group__3__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3386:1: rule__AttributeSelector__Group__4 : rule__AttributeSelector__Group__4__Impl ;
    public final void rule__AttributeSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3390:1: ( rule__AttributeSelector__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3391:2: rule__AttributeSelector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group__4__Impl_in_rule__AttributeSelector__Group__46955);
            rule__AttributeSelector__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__4"


    // $ANTLR start "rule__AttributeSelector__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3397:1: rule__AttributeSelector__Group__4__Impl : ( ']' ) ;
    public final void rule__AttributeSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3401:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3402:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3402:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3403:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__AttributeSelector__Group__4__Impl6983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4()); 
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
    // $ANTLR end "rule__AttributeSelector__Group__4__Impl"


    // $ANTLR start "rule__AttributeSelector__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3426:1: rule__AttributeSelector__Group_3__0 : rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1 ;
    public final void rule__AttributeSelector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3430:1: ( rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3431:2: rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group_3__0__Impl_in_rule__AttributeSelector__Group_3__07024);
            rule__AttributeSelector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeSelector__Group_3__1_in_rule__AttributeSelector__Group_3__07027);
            rule__AttributeSelector__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group_3__0"


    // $ANTLR start "rule__AttributeSelector__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3438:1: rule__AttributeSelector__Group_3__0__Impl : ( ( rule__AttributeSelector__OpAssignment_3_0 ) ) ;
    public final void rule__AttributeSelector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3442:1: ( ( ( rule__AttributeSelector__OpAssignment_3_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3443:1: ( ( rule__AttributeSelector__OpAssignment_3_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3443:1: ( ( rule__AttributeSelector__OpAssignment_3_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3444:1: ( rule__AttributeSelector__OpAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3445:1: ( rule__AttributeSelector__OpAssignment_3_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3445:2: rule__AttributeSelector__OpAssignment_3_0
            {
            pushFollow(FOLLOW_rule__AttributeSelector__OpAssignment_3_0_in_rule__AttributeSelector__Group_3__0__Impl7054);
            rule__AttributeSelector__OpAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0()); 
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
    // $ANTLR end "rule__AttributeSelector__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeSelector__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3455:1: rule__AttributeSelector__Group_3__1 : rule__AttributeSelector__Group_3__1__Impl ;
    public final void rule__AttributeSelector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3459:1: ( rule__AttributeSelector__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3460:2: rule__AttributeSelector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeSelector__Group_3__1__Impl_in_rule__AttributeSelector__Group_3__17084);
            rule__AttributeSelector__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group_3__1"


    // $ANTLR start "rule__AttributeSelector__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3466:1: rule__AttributeSelector__Group_3__1__Impl : ( ( rule__AttributeSelector__ValueAssignment_3_1 ) ) ;
    public final void rule__AttributeSelector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3470:1: ( ( ( rule__AttributeSelector__ValueAssignment_3_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3471:1: ( ( rule__AttributeSelector__ValueAssignment_3_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3471:1: ( ( rule__AttributeSelector__ValueAssignment_3_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3472:1: ( rule__AttributeSelector__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3473:1: ( rule__AttributeSelector__ValueAssignment_3_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3473:2: rule__AttributeSelector__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttributeSelector__ValueAssignment_3_1_in_rule__AttributeSelector__Group_3__1__Impl7111);
            rule__AttributeSelector__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1()); 
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
    // $ANTLR end "rule__AttributeSelector__Group_3__1__Impl"


    // $ANTLR start "rule__ClassSelector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3487:1: rule__ClassSelector__Group__0 : rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1 ;
    public final void rule__ClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3491:1: ( rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3492:2: rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1
            {
            pushFollow(FOLLOW_rule__ClassSelector__Group__0__Impl_in_rule__ClassSelector__Group__07145);
            rule__ClassSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ClassSelector__Group__1_in_rule__ClassSelector__Group__07148);
            rule__ClassSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__0"


    // $ANTLR start "rule__ClassSelector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3499:1: rule__ClassSelector__Group__0__Impl : ( () ) ;
    public final void rule__ClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3503:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3504:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3504:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3505:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getClassSelectorAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3506:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3508:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getClassSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__0__Impl"


    // $ANTLR start "rule__ClassSelector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3518:1: rule__ClassSelector__Group__1 : rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2 ;
    public final void rule__ClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3522:1: ( rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3523:2: rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2
            {
            pushFollow(FOLLOW_rule__ClassSelector__Group__1__Impl_in_rule__ClassSelector__Group__17206);
            rule__ClassSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ClassSelector__Group__2_in_rule__ClassSelector__Group__17209);
            rule__ClassSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__1"


    // $ANTLR start "rule__ClassSelector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3530:1: rule__ClassSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__ClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3534:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3535:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3535:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3536:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getFullStopKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__ClassSelector__Group__1__Impl7237); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__ClassSelector__Group__1__Impl"


    // $ANTLR start "rule__ClassSelector__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3549:1: rule__ClassSelector__Group__2 : rule__ClassSelector__Group__2__Impl ;
    public final void rule__ClassSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3553:1: ( rule__ClassSelector__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3554:2: rule__ClassSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassSelector__Group__2__Impl_in_rule__ClassSelector__Group__27268);
            rule__ClassSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__2"


    // $ANTLR start "rule__ClassSelector__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3560:1: rule__ClassSelector__Group__2__Impl : ( ( rule__ClassSelector__NameAssignment_2 ) ) ;
    public final void rule__ClassSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3564:1: ( ( ( rule__ClassSelector__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3565:1: ( ( rule__ClassSelector__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3565:1: ( ( rule__ClassSelector__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3566:1: ( rule__ClassSelector__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3567:1: ( rule__ClassSelector__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3567:2: rule__ClassSelector__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassSelector__NameAssignment_2_in_rule__ClassSelector__Group__2__Impl7295);
            rule__ClassSelector__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__ClassSelector__Group__2__Impl"


    // $ANTLR start "rule__ElementSelector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3583:1: rule__ElementSelector__Group__0 : rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 ;
    public final void rule__ElementSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3587:1: ( rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3588:2: rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1
            {
            pushFollow(FOLLOW_rule__ElementSelector__Group__0__Impl_in_rule__ElementSelector__Group__07331);
            rule__ElementSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementSelector__Group__1_in_rule__ElementSelector__Group__07334);
            rule__ElementSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__0"


    // $ANTLR start "rule__ElementSelector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3595:1: rule__ElementSelector__Group__0__Impl : ( () ) ;
    public final void rule__ElementSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3599:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3600:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3600:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3601:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3602:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3604:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__0__Impl"


    // $ANTLR start "rule__ElementSelector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3614:1: rule__ElementSelector__Group__1 : rule__ElementSelector__Group__1__Impl ;
    public final void rule__ElementSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3618:1: ( rule__ElementSelector__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3619:2: rule__ElementSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementSelector__Group__1__Impl_in_rule__ElementSelector__Group__17392);
            rule__ElementSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__1"


    // $ANTLR start "rule__ElementSelector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3625:1: rule__ElementSelector__Group__1__Impl : ( ( rule__ElementSelector__NameAssignment_1 ) ) ;
    public final void rule__ElementSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3629:1: ( ( ( rule__ElementSelector__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3630:1: ( ( rule__ElementSelector__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3630:1: ( ( rule__ElementSelector__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3631:1: ( rule__ElementSelector__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3632:1: ( rule__ElementSelector__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3632:2: rule__ElementSelector__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementSelector__NameAssignment_1_in_rule__ElementSelector__Group__1__Impl7419);
            rule__ElementSelector__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ElementSelector__Group__1__Impl"


    // $ANTLR start "rule__UniversalSelector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3646:1: rule__UniversalSelector__Group__0 : rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1 ;
    public final void rule__UniversalSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3650:1: ( rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3651:2: rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1
            {
            pushFollow(FOLLOW_rule__UniversalSelector__Group__0__Impl_in_rule__UniversalSelector__Group__07453);
            rule__UniversalSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UniversalSelector__Group__1_in_rule__UniversalSelector__Group__07456);
            rule__UniversalSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__0"


    // $ANTLR start "rule__UniversalSelector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3658:1: rule__UniversalSelector__Group__0__Impl : ( () ) ;
    public final void rule__UniversalSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3662:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3663:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3663:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3664:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3665:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3667:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__0__Impl"


    // $ANTLR start "rule__UniversalSelector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3677:1: rule__UniversalSelector__Group__1 : rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2 ;
    public final void rule__UniversalSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3681:1: ( rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3682:2: rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2
            {
            pushFollow(FOLLOW_rule__UniversalSelector__Group__1__Impl_in_rule__UniversalSelector__Group__17514);
            rule__UniversalSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UniversalSelector__Group__2_in_rule__UniversalSelector__Group__17517);
            rule__UniversalSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__1"


    // $ANTLR start "rule__UniversalSelector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3689:1: rule__UniversalSelector__Group__1__Impl : ( ( rule__UniversalSelector__NamespeceAssignment_1 )? ) ;
    public final void rule__UniversalSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3693:1: ( ( ( rule__UniversalSelector__NamespeceAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3694:1: ( ( rule__UniversalSelector__NamespeceAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3694:1: ( ( rule__UniversalSelector__NamespeceAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3695:1: ( rule__UniversalSelector__NamespeceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getNamespeceAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3696:1: ( rule__UniversalSelector__NamespeceAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_IDENT||LA39_0==41) ) {
                alt39=1;
            }
            else if ( (LA39_0==29) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==41) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3696:2: rule__UniversalSelector__NamespeceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__UniversalSelector__NamespeceAssignment_1_in_rule__UniversalSelector__Group__1__Impl7544);
                    rule__UniversalSelector__NamespeceAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getNamespeceAssignment_1()); 
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
    // $ANTLR end "rule__UniversalSelector__Group__1__Impl"


    // $ANTLR start "rule__UniversalSelector__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3706:1: rule__UniversalSelector__Group__2 : rule__UniversalSelector__Group__2__Impl ;
    public final void rule__UniversalSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3710:1: ( rule__UniversalSelector__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3711:2: rule__UniversalSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UniversalSelector__Group__2__Impl_in_rule__UniversalSelector__Group__27575);
            rule__UniversalSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__2"


    // $ANTLR start "rule__UniversalSelector__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3717:1: rule__UniversalSelector__Group__2__Impl : ( '*' ) ;
    public final void rule__UniversalSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3721:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3722:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3722:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3723:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__UniversalSelector__Group__2__Impl7603); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__UniversalSelector__Group__2__Impl"


    // $ANTLR start "rule__IdSelector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3742:1: rule__IdSelector__Group__0 : rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1 ;
    public final void rule__IdSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3746:1: ( rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3747:2: rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1
            {
            pushFollow(FOLLOW_rule__IdSelector__Group__0__Impl_in_rule__IdSelector__Group__07640);
            rule__IdSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdSelector__Group__1_in_rule__IdSelector__Group__07643);
            rule__IdSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__0"


    // $ANTLR start "rule__IdSelector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3754:1: rule__IdSelector__Group__0__Impl : ( () ) ;
    public final void rule__IdSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3758:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3759:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3759:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3760:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getIdSelectorAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3761:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3763:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getIdSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__0__Impl"


    // $ANTLR start "rule__IdSelector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3773:1: rule__IdSelector__Group__1 : rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2 ;
    public final void rule__IdSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3777:1: ( rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3778:2: rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2
            {
            pushFollow(FOLLOW_rule__IdSelector__Group__1__Impl_in_rule__IdSelector__Group__17701);
            rule__IdSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdSelector__Group__2_in_rule__IdSelector__Group__17704);
            rule__IdSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__1"


    // $ANTLR start "rule__IdSelector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3785:1: rule__IdSelector__Group__1__Impl : ( RULE_HASHMARK ) ;
    public final void rule__IdSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3789:1: ( ( RULE_HASHMARK ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3790:1: ( RULE_HASHMARK )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3790:1: ( RULE_HASHMARK )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3791:1: RULE_HASHMARK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
            }
            match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_rule__IdSelector__Group__1__Impl7731); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__IdSelector__Group__1__Impl"


    // $ANTLR start "rule__IdSelector__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3802:1: rule__IdSelector__Group__2 : rule__IdSelector__Group__2__Impl ;
    public final void rule__IdSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3806:1: ( rule__IdSelector__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3807:2: rule__IdSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IdSelector__Group__2__Impl_in_rule__IdSelector__Group__27760);
            rule__IdSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__2"


    // $ANTLR start "rule__IdSelector__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3813:1: rule__IdSelector__Group__2__Impl : ( ( rule__IdSelector__NameAssignment_2 ) ) ;
    public final void rule__IdSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3817:1: ( ( ( rule__IdSelector__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3818:1: ( ( rule__IdSelector__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3818:1: ( ( rule__IdSelector__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3819:1: ( rule__IdSelector__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3820:1: ( rule__IdSelector__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3820:2: rule__IdSelector__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__IdSelector__NameAssignment_2_in_rule__IdSelector__Group__2__Impl7787);
            rule__IdSelector__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__IdSelector__Group__2__Impl"


    // $ANTLR start "rule__Css_namespace_prefix__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3836:1: rule__Css_namespace_prefix__Group__0 : rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1 ;
    public final void rule__Css_namespace_prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3840:1: ( rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3841:2: rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1
            {
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__0__Impl_in_rule__Css_namespace_prefix__Group__07823);
            rule__Css_namespace_prefix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__1_in_rule__Css_namespace_prefix__Group__07826);
            rule__Css_namespace_prefix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3848:1: rule__Css_namespace_prefix__Group__0__Impl : ( ( rule__Css_namespace_prefix__Alternatives_0 )? ) ;
    public final void rule__Css_namespace_prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3852:1: ( ( ( rule__Css_namespace_prefix__Alternatives_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3853:1: ( ( rule__Css_namespace_prefix__Alternatives_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3853:1: ( ( rule__Css_namespace_prefix__Alternatives_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3854:1: ( rule__Css_namespace_prefix__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3855:1: ( rule__Css_namespace_prefix__Alternatives_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IDENT||LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3855:2: rule__Css_namespace_prefix__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Css_namespace_prefix__Alternatives_0_in_rule__Css_namespace_prefix__Group__0__Impl7853);
                    rule__Css_namespace_prefix__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Css_namespace_prefix__Group__0__Impl"


    // $ANTLR start "rule__Css_namespace_prefix__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3865:1: rule__Css_namespace_prefix__Group__1 : rule__Css_namespace_prefix__Group__1__Impl ;
    public final void rule__Css_namespace_prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3869:1: ( rule__Css_namespace_prefix__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3870:2: rule__Css_namespace_prefix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_namespace_prefix__Group__1__Impl_in_rule__Css_namespace_prefix__Group__17884);
            rule__Css_namespace_prefix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3876:1: rule__Css_namespace_prefix__Group__1__Impl : ( '|' ) ;
    public final void rule__Css_namespace_prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3880:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3881:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3881:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3882:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Css_namespace_prefix__Group__1__Impl7912); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 
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
    // $ANTLR end "rule__Css_namespace_prefix__Group__1__Impl"


    // $ANTLR start "rule__Css_declaration__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3899:1: rule__Css_declaration__Group__0 : rule__Css_declaration__Group__0__Impl rule__Css_declaration__Group__1 ;
    public final void rule__Css_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3903:1: ( rule__Css_declaration__Group__0__Impl rule__Css_declaration__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3904:2: rule__Css_declaration__Group__0__Impl rule__Css_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__0__Impl_in_rule__Css_declaration__Group__07947);
            rule__Css_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_declaration__Group__1_in_rule__Css_declaration__Group__07950);
            rule__Css_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_declaration__Group__0"


    // $ANTLR start "rule__Css_declaration__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3911:1: rule__Css_declaration__Group__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Css_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3915:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3916:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3916:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3917:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3918:1: ( RULE_WS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_WS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3918:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Css_declaration__Group__0__Impl7978); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Css_declaration__Group__0__Impl"


    // $ANTLR start "rule__Css_declaration__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3928:1: rule__Css_declaration__Group__1 : rule__Css_declaration__Group__1__Impl rule__Css_declaration__Group__2 ;
    public final void rule__Css_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3932:1: ( rule__Css_declaration__Group__1__Impl rule__Css_declaration__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3933:2: rule__Css_declaration__Group__1__Impl rule__Css_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__1__Impl_in_rule__Css_declaration__Group__18009);
            rule__Css_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_declaration__Group__2_in_rule__Css_declaration__Group__18012);
            rule__Css_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_declaration__Group__1"


    // $ANTLR start "rule__Css_declaration__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3940:1: rule__Css_declaration__Group__1__Impl : ( ( rule__Css_declaration__PropertyAssignment_1 ) ) ;
    public final void rule__Css_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3944:1: ( ( ( rule__Css_declaration__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3945:1: ( ( rule__Css_declaration__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3945:1: ( ( rule__Css_declaration__PropertyAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3946:1: ( rule__Css_declaration__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3947:1: ( rule__Css_declaration__PropertyAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3947:2: rule__Css_declaration__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__Css_declaration__PropertyAssignment_1_in_rule__Css_declaration__Group__1__Impl8039);
            rule__Css_declaration__PropertyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getPropertyAssignment_1()); 
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
    // $ANTLR end "rule__Css_declaration__Group__1__Impl"


    // $ANTLR start "rule__Css_declaration__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3957:1: rule__Css_declaration__Group__2 : rule__Css_declaration__Group__2__Impl rule__Css_declaration__Group__3 ;
    public final void rule__Css_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3961:1: ( rule__Css_declaration__Group__2__Impl rule__Css_declaration__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3962:2: rule__Css_declaration__Group__2__Impl rule__Css_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__2__Impl_in_rule__Css_declaration__Group__28069);
            rule__Css_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_declaration__Group__3_in_rule__Css_declaration__Group__28072);
            rule__Css_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_declaration__Group__2"


    // $ANTLR start "rule__Css_declaration__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3969:1: rule__Css_declaration__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Css_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3973:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3974:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3974:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3975:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3976:1: ( RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3976:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Css_declaration__Group__2__Impl8100); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Css_declaration__Group__2__Impl"


    // $ANTLR start "rule__Css_declaration__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3986:1: rule__Css_declaration__Group__3 : rule__Css_declaration__Group__3__Impl rule__Css_declaration__Group__4 ;
    public final void rule__Css_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3990:1: ( rule__Css_declaration__Group__3__Impl rule__Css_declaration__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3991:2: rule__Css_declaration__Group__3__Impl rule__Css_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__3__Impl_in_rule__Css_declaration__Group__38131);
            rule__Css_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_declaration__Group__4_in_rule__Css_declaration__Group__38134);
            rule__Css_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_declaration__Group__3"


    // $ANTLR start "rule__Css_declaration__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3998:1: rule__Css_declaration__Group__3__Impl : ( ':' ) ;
    public final void rule__Css_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4002:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4003:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4003:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4004:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getColonKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__Css_declaration__Group__3__Impl8162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__Css_declaration__Group__3__Impl"


    // $ANTLR start "rule__Css_declaration__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4017:1: rule__Css_declaration__Group__4 : rule__Css_declaration__Group__4__Impl rule__Css_declaration__Group__5 ;
    public final void rule__Css_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4021:1: ( rule__Css_declaration__Group__4__Impl rule__Css_declaration__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4022:2: rule__Css_declaration__Group__4__Impl rule__Css_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__4__Impl_in_rule__Css_declaration__Group__48193);
            rule__Css_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_declaration__Group__5_in_rule__Css_declaration__Group__48196);
            rule__Css_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_declaration__Group__4"


    // $ANTLR start "rule__Css_declaration__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4029:1: rule__Css_declaration__Group__4__Impl : ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) ) ;
    public final void rule__Css_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4033:1: ( ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4034:1: ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4034:1: ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4035:1: ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4035:1: ( ( rule__Css_declaration__ValueTokensAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4036:1: ( rule__Css_declaration__ValueTokensAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4037:1: ( rule__Css_declaration__ValueTokensAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4037:2: rule__Css_declaration__ValueTokensAssignment_4
            {
            pushFollow(FOLLOW_rule__Css_declaration__ValueTokensAssignment_4_in_rule__Css_declaration__Group__4__Impl8225);
            rule__Css_declaration__ValueTokensAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4040:1: ( ( rule__Css_declaration__ValueTokensAssignment_4 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4041:1: ( rule__Css_declaration__ValueTokensAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4042:1: ( rule__Css_declaration__ValueTokensAssignment_4 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_IDENT||(LA43_0>=RULE_STRING && LA43_0<=RULE_PERCENT)||(LA43_0>=RULE_WS && LA43_0<=RULE_HASHMARK)||LA43_0==RULE_INTEGER||LA43_0==33||LA43_0==44) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4042:2: rule__Css_declaration__ValueTokensAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Css_declaration__ValueTokensAssignment_4_in_rule__Css_declaration__Group__4__Impl8237);
            	    rule__Css_declaration__ValueTokensAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4()); 
            }

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
    // $ANTLR end "rule__Css_declaration__Group__4__Impl"


    // $ANTLR start "rule__Css_declaration__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4053:1: rule__Css_declaration__Group__5 : rule__Css_declaration__Group__5__Impl ;
    public final void rule__Css_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4057:1: ( rule__Css_declaration__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4058:2: rule__Css_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Css_declaration__Group__5__Impl_in_rule__Css_declaration__Group__58270);
            rule__Css_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_declaration__Group__5"


    // $ANTLR start "rule__Css_declaration__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4064:1: rule__Css_declaration__Group__5__Impl : ( ( rule__Css_declaration__ImportantAssignment_5 )? ) ;
    public final void rule__Css_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4068:1: ( ( ( rule__Css_declaration__ImportantAssignment_5 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4069:1: ( ( rule__Css_declaration__ImportantAssignment_5 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4069:1: ( ( rule__Css_declaration__ImportantAssignment_5 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4070:1: ( rule__Css_declaration__ImportantAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getImportantAssignment_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4071:1: ( rule__Css_declaration__ImportantAssignment_5 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_IMPORTANT_SYM) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4071:2: rule__Css_declaration__ImportantAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Css_declaration__ImportantAssignment_5_in_rule__Css_declaration__Group__5__Impl8297);
                    rule__Css_declaration__ImportantAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getImportantAssignment_5()); 
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
    // $ANTLR end "rule__Css_declaration__Group__5__Impl"


    // $ANTLR start "rule__Css_property__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4093:1: rule__Css_property__Group__0 : rule__Css_property__Group__0__Impl rule__Css_property__Group__1 ;
    public final void rule__Css_property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4097:1: ( rule__Css_property__Group__0__Impl rule__Css_property__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4098:2: rule__Css_property__Group__0__Impl rule__Css_property__Group__1
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__08340);
            rule__Css_property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__08343);
            rule__Css_property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4105:1: rule__Css_property__Group__0__Impl : ( () ) ;
    public final void rule__Css_property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4109:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4110:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4110:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4111:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_propertyAccess().getCss_propertyAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4112:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4114:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_propertyAccess().getCss_propertyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__0__Impl"


    // $ANTLR start "rule__Css_property__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4124:1: rule__Css_property__Group__1 : rule__Css_property__Group__1__Impl ;
    public final void rule__Css_property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4128:1: ( rule__Css_property__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4129:2: rule__Css_property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__18401);
            rule__Css_property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4135:1: rule__Css_property__Group__1__Impl : ( ( rule__Css_property__NameAssignment_1 ) ) ;
    public final void rule__Css_property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4139:1: ( ( ( rule__Css_property__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4140:1: ( ( rule__Css_property__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4140:1: ( ( rule__Css_property__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4141:1: ( rule__Css_property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_propertyAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4142:1: ( rule__Css_property__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4142:2: rule__Css_property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Css_property__NameAssignment_1_in_rule__Css_property__Group__1__Impl8428);
            rule__Css_property__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_propertyAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Css_property__Group__1__Impl"


    // $ANTLR start "rule__ValidPropertyIdent__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4156:1: rule__ValidPropertyIdent__Group__0 : rule__ValidPropertyIdent__Group__0__Impl rule__ValidPropertyIdent__Group__1 ;
    public final void rule__ValidPropertyIdent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4160:1: ( rule__ValidPropertyIdent__Group__0__Impl rule__ValidPropertyIdent__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4161:2: rule__ValidPropertyIdent__Group__0__Impl rule__ValidPropertyIdent__Group__1
            {
            pushFollow(FOLLOW_rule__ValidPropertyIdent__Group__0__Impl_in_rule__ValidPropertyIdent__Group__08462);
            rule__ValidPropertyIdent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ValidPropertyIdent__Group__1_in_rule__ValidPropertyIdent__Group__08465);
            rule__ValidPropertyIdent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidPropertyIdent__Group__0"


    // $ANTLR start "rule__ValidPropertyIdent__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4168:1: rule__ValidPropertyIdent__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ValidPropertyIdent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4172:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4173:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4173:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4174:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidPropertyIdentAccess().getHyphenMinusKeyword_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4175:1: ( '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4176:2: '-'
                    {
                    match(input,33,FOLLOW_33_in_rule__ValidPropertyIdent__Group__0__Impl8494); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidPropertyIdentAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__ValidPropertyIdent__Group__0__Impl"


    // $ANTLR start "rule__ValidPropertyIdent__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4187:1: rule__ValidPropertyIdent__Group__1 : rule__ValidPropertyIdent__Group__1__Impl ;
    public final void rule__ValidPropertyIdent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4191:1: ( rule__ValidPropertyIdent__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4192:2: rule__ValidPropertyIdent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValidPropertyIdent__Group__1__Impl_in_rule__ValidPropertyIdent__Group__18527);
            rule__ValidPropertyIdent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidPropertyIdent__Group__1"


    // $ANTLR start "rule__ValidPropertyIdent__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4198:1: rule__ValidPropertyIdent__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__ValidPropertyIdent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4202:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4203:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4203:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4204:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidPropertyIdentAccess().getIDENTTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ValidPropertyIdent__Group__1__Impl8554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidPropertyIdentAccess().getIDENTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__ValidPropertyIdent__Group__1__Impl"


    // $ANTLR start "rule__PseudoClass__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4220:1: rule__PseudoClass__Group_0__0 : rule__PseudoClass__Group_0__0__Impl rule__PseudoClass__Group_0__1 ;
    public final void rule__PseudoClass__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4224:1: ( rule__PseudoClass__Group_0__0__Impl rule__PseudoClass__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4225:2: rule__PseudoClass__Group_0__0__Impl rule__PseudoClass__Group_0__1
            {
            pushFollow(FOLLOW_rule__PseudoClass__Group_0__0__Impl_in_rule__PseudoClass__Group_0__08588);
            rule__PseudoClass__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClass__Group_0__1_in_rule__PseudoClass__Group_0__08591);
            rule__PseudoClass__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group_0__0"


    // $ANTLR start "rule__PseudoClass__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4232:1: rule__PseudoClass__Group_0__0__Impl : ( ':' ) ;
    public final void rule__PseudoClass__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4236:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4237:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4237:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4238:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getColonKeyword_0_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__PseudoClass__Group_0__0__Impl8619); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getColonKeyword_0_0()); 
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
    // $ANTLR end "rule__PseudoClass__Group_0__0__Impl"


    // $ANTLR start "rule__PseudoClass__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4251:1: rule__PseudoClass__Group_0__1 : rule__PseudoClass__Group_0__1__Impl rule__PseudoClass__Group_0__2 ;
    public final void rule__PseudoClass__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4255:1: ( rule__PseudoClass__Group_0__1__Impl rule__PseudoClass__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4256:2: rule__PseudoClass__Group_0__1__Impl rule__PseudoClass__Group_0__2
            {
            pushFollow(FOLLOW_rule__PseudoClass__Group_0__1__Impl_in_rule__PseudoClass__Group_0__18650);
            rule__PseudoClass__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClass__Group_0__2_in_rule__PseudoClass__Group_0__18653);
            rule__PseudoClass__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group_0__1"


    // $ANTLR start "rule__PseudoClass__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4263:1: rule__PseudoClass__Group_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__PseudoClass__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4267:1: ( ( ( ':' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4268:1: ( ( ':' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4268:1: ( ( ':' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4269:1: ( ':' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getColonKeyword_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4270:1: ( ':' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4271:2: ':'
                    {
                    match(input,37,FOLLOW_37_in_rule__PseudoClass__Group_0__1__Impl8682); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getColonKeyword_0_1()); 
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
    // $ANTLR end "rule__PseudoClass__Group_0__1__Impl"


    // $ANTLR start "rule__PseudoClass__Group_0__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4282:1: rule__PseudoClass__Group_0__2 : rule__PseudoClass__Group_0__2__Impl ;
    public final void rule__PseudoClass__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4286:1: ( rule__PseudoClass__Group_0__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4287:2: rule__PseudoClass__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PseudoClass__Group_0__2__Impl_in_rule__PseudoClass__Group_0__28715);
            rule__PseudoClass__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group_0__2"


    // $ANTLR start "rule__PseudoClass__Group_0__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4293:1: rule__PseudoClass__Group_0__2__Impl : ( rulePseudoClassName ) ;
    public final void rule__PseudoClass__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4297:1: ( ( rulePseudoClassName ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4298:1: ( rulePseudoClassName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4298:1: ( rulePseudoClassName )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4299:1: rulePseudoClassName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_rule__PseudoClass__Group_0__2__Impl8742);
            rulePseudoClassName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_0_2()); 
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
    // $ANTLR end "rule__PseudoClass__Group_0__2__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4316:1: rule__PseudoClassFunction__Group__0 : rule__PseudoClassFunction__Group__0__Impl rule__PseudoClassFunction__Group__1 ;
    public final void rule__PseudoClassFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4320:1: ( rule__PseudoClassFunction__Group__0__Impl rule__PseudoClassFunction__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4321:2: rule__PseudoClassFunction__Group__0__Impl rule__PseudoClassFunction__Group__1
            {
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__0__Impl_in_rule__PseudoClassFunction__Group__08777);
            rule__PseudoClassFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__1_in_rule__PseudoClassFunction__Group__08780);
            rule__PseudoClassFunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group__0"


    // $ANTLR start "rule__PseudoClassFunction__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4328:1: rule__PseudoClassFunction__Group__0__Impl : ( ( rule__PseudoClassFunction__NameAssignment_0 ) ) ;
    public final void rule__PseudoClassFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4332:1: ( ( ( rule__PseudoClassFunction__NameAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4333:1: ( ( rule__PseudoClassFunction__NameAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4333:1: ( ( rule__PseudoClassFunction__NameAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4334:1: ( rule__PseudoClassFunction__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4335:1: ( rule__PseudoClassFunction__NameAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4335:2: rule__PseudoClassFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__PseudoClassFunction__NameAssignment_0_in_rule__PseudoClassFunction__Group__0__Impl8807);
            rule__PseudoClassFunction__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__PseudoClassFunction__Group__0__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4345:1: rule__PseudoClassFunction__Group__1 : rule__PseudoClassFunction__Group__1__Impl rule__PseudoClassFunction__Group__2 ;
    public final void rule__PseudoClassFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4349:1: ( rule__PseudoClassFunction__Group__1__Impl rule__PseudoClassFunction__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4350:2: rule__PseudoClassFunction__Group__1__Impl rule__PseudoClassFunction__Group__2
            {
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__1__Impl_in_rule__PseudoClassFunction__Group__18837);
            rule__PseudoClassFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__2_in_rule__PseudoClassFunction__Group__18840);
            rule__PseudoClassFunction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group__1"


    // $ANTLR start "rule__PseudoClassFunction__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4357:1: rule__PseudoClassFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__PseudoClassFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4361:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4362:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4362:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4363:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__PseudoClassFunction__Group__1__Impl8868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__PseudoClassFunction__Group__1__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4376:1: rule__PseudoClassFunction__Group__2 : rule__PseudoClassFunction__Group__2__Impl rule__PseudoClassFunction__Group__3 ;
    public final void rule__PseudoClassFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4380:1: ( rule__PseudoClassFunction__Group__2__Impl rule__PseudoClassFunction__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4381:2: rule__PseudoClassFunction__Group__2__Impl rule__PseudoClassFunction__Group__3
            {
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__2__Impl_in_rule__PseudoClassFunction__Group__28899);
            rule__PseudoClassFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__3_in_rule__PseudoClassFunction__Group__28902);
            rule__PseudoClassFunction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group__2"


    // $ANTLR start "rule__PseudoClassFunction__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4388:1: rule__PseudoClassFunction__Group__2__Impl : ( ( rule__PseudoClassFunction__ParamsAssignment_2 )* ) ;
    public final void rule__PseudoClassFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4392:1: ( ( ( rule__PseudoClassFunction__ParamsAssignment_2 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4393:1: ( ( rule__PseudoClassFunction__ParamsAssignment_2 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4393:1: ( ( rule__PseudoClassFunction__ParamsAssignment_2 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4394:1: ( rule__PseudoClassFunction__ParamsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4395:1: ( rule__PseudoClassFunction__ParamsAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_IDENT||(LA47_0>=RULE_STRING && LA47_0<=RULE_PERCENT)||(LA47_0>=RULE_WS && LA47_0<=RULE_HASHMARK)||LA47_0==RULE_INTEGER||LA47_0==33||LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4395:2: rule__PseudoClassFunction__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PseudoClassFunction__ParamsAssignment_2_in_rule__PseudoClassFunction__Group__2__Impl8929);
            	    rule__PseudoClassFunction__ParamsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_2()); 
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
    // $ANTLR end "rule__PseudoClassFunction__Group__2__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4405:1: rule__PseudoClassFunction__Group__3 : rule__PseudoClassFunction__Group__3__Impl ;
    public final void rule__PseudoClassFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4409:1: ( rule__PseudoClassFunction__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4410:2: rule__PseudoClassFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PseudoClassFunction__Group__3__Impl_in_rule__PseudoClassFunction__Group__38960);
            rule__PseudoClassFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group__3"


    // $ANTLR start "rule__PseudoClassFunction__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4416:1: rule__PseudoClassFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__PseudoClassFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4420:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4421:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4421:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4422:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,43,FOLLOW_43_in_rule__PseudoClassFunction__Group__3__Impl8988); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__PseudoClassFunction__Group__3__Impl"


    // $ANTLR start "rule__Combinator__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4443:1: rule__Combinator__Group__0 : rule__Combinator__Group__0__Impl rule__Combinator__Group__1 ;
    public final void rule__Combinator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4447:1: ( rule__Combinator__Group__0__Impl rule__Combinator__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4448:2: rule__Combinator__Group__0__Impl rule__Combinator__Group__1
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__09027);
            rule__Combinator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__09030);
            rule__Combinator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4455:1: rule__Combinator__Group__0__Impl : ( ( rule__Combinator__Alternatives_0 ) ) ;
    public final void rule__Combinator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4459:1: ( ( ( rule__Combinator__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4460:1: ( ( rule__Combinator__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4460:1: ( ( rule__Combinator__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4461:1: ( rule__Combinator__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinatorAccess().getAlternatives_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4462:1: ( rule__Combinator__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4462:2: rule__Combinator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl9057);
            rule__Combinator__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinatorAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Combinator__Group__0__Impl"


    // $ANTLR start "rule__Combinator__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4472:1: rule__Combinator__Group__1 : rule__Combinator__Group__1__Impl ;
    public final void rule__Combinator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4476:1: ( rule__Combinator__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4477:2: rule__Combinator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__19087);
            rule__Combinator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4483:1: rule__Combinator__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Combinator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4487:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4488:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4488:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4489:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4490:1: ( RULE_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_WS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4490:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl9115); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Combinator__Group__1__Impl"


    // $ANTLR start "rule__SymbolTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4504:1: rule__SymbolTok__Group__0 : rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1 ;
    public final void rule__SymbolTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4508:1: ( rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4509:2: rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolTok__Group__0__Impl_in_rule__SymbolTok__Group__09150);
            rule__SymbolTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymbolTok__Group__1_in_rule__SymbolTok__Group__09153);
            rule__SymbolTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__0"


    // $ANTLR start "rule__SymbolTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4516:1: rule__SymbolTok__Group__0__Impl : ( () ) ;
    public final void rule__SymbolTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4520:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4521:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4521:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4522:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getSymbolTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4523:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4525:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getSymbolTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__0__Impl"


    // $ANTLR start "rule__SymbolTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4535:1: rule__SymbolTok__Group__1 : rule__SymbolTok__Group__1__Impl ;
    public final void rule__SymbolTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4539:1: ( rule__SymbolTok__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4540:2: rule__SymbolTok__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolTok__Group__1__Impl_in_rule__SymbolTok__Group__19211);
            rule__SymbolTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__1"


    // $ANTLR start "rule__SymbolTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4546:1: rule__SymbolTok__Group__1__Impl : ( ( rule__SymbolTok__SymbolAssignment_1 ) ) ;
    public final void rule__SymbolTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4550:1: ( ( ( rule__SymbolTok__SymbolAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4551:1: ( ( rule__SymbolTok__SymbolAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4551:1: ( ( rule__SymbolTok__SymbolAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4552:1: ( rule__SymbolTok__SymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4553:1: ( rule__SymbolTok__SymbolAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4553:2: rule__SymbolTok__SymbolAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolTok__SymbolAssignment_1_in_rule__SymbolTok__Group__1__Impl9238);
            rule__SymbolTok__SymbolAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1()); 
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
    // $ANTLR end "rule__SymbolTok__Group__1__Impl"


    // $ANTLR start "rule__WSTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4567:1: rule__WSTok__Group__0 : rule__WSTok__Group__0__Impl rule__WSTok__Group__1 ;
    public final void rule__WSTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4571:1: ( rule__WSTok__Group__0__Impl rule__WSTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4572:2: rule__WSTok__Group__0__Impl rule__WSTok__Group__1
            {
            pushFollow(FOLLOW_rule__WSTok__Group__0__Impl_in_rule__WSTok__Group__09272);
            rule__WSTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WSTok__Group__1_in_rule__WSTok__Group__09275);
            rule__WSTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__0"


    // $ANTLR start "rule__WSTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4579:1: rule__WSTok__Group__0__Impl : ( () ) ;
    public final void rule__WSTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4583:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4584:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4584:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4585:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokAccess().getWSTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4586:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4588:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokAccess().getWSTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__0__Impl"


    // $ANTLR start "rule__WSTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4598:1: rule__WSTok__Group__1 : rule__WSTok__Group__1__Impl ;
    public final void rule__WSTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4602:1: ( rule__WSTok__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4603:2: rule__WSTok__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WSTok__Group__1__Impl_in_rule__WSTok__Group__19333);
            rule__WSTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__1"


    // $ANTLR start "rule__WSTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4609:1: rule__WSTok__Group__1__Impl : ( RULE_WS ) ;
    public final void rule__WSTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4613:1: ( ( RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4614:1: ( RULE_WS )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4614:1: ( RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4615:1: RULE_WS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
            }
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__WSTok__Group__1__Impl9360); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__WSTok__Group__1__Impl"


    // $ANTLR start "rule__StringTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4630:1: rule__StringTok__Group__0 : rule__StringTok__Group__0__Impl rule__StringTok__Group__1 ;
    public final void rule__StringTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4634:1: ( rule__StringTok__Group__0__Impl rule__StringTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4635:2: rule__StringTok__Group__0__Impl rule__StringTok__Group__1
            {
            pushFollow(FOLLOW_rule__StringTok__Group__0__Impl_in_rule__StringTok__Group__09393);
            rule__StringTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StringTok__Group__1_in_rule__StringTok__Group__09396);
            rule__StringTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__0"


    // $ANTLR start "rule__StringTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4642:1: rule__StringTok__Group__0__Impl : ( () ) ;
    public final void rule__StringTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4646:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4647:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4647:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4648:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getStringTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4649:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4651:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getStringTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__0__Impl"


    // $ANTLR start "rule__StringTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4661:1: rule__StringTok__Group__1 : rule__StringTok__Group__1__Impl ;
    public final void rule__StringTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4665:1: ( rule__StringTok__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4666:2: rule__StringTok__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringTok__Group__1__Impl_in_rule__StringTok__Group__19454);
            rule__StringTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__1"


    // $ANTLR start "rule__StringTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4672:1: rule__StringTok__Group__1__Impl : ( ( rule__StringTok__ValueAssignment_1 ) ) ;
    public final void rule__StringTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4676:1: ( ( ( rule__StringTok__ValueAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4677:1: ( ( rule__StringTok__ValueAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4677:1: ( ( rule__StringTok__ValueAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4678:1: ( rule__StringTok__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getValueAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4679:1: ( rule__StringTok__ValueAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4679:2: rule__StringTok__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringTok__ValueAssignment_1_in_rule__StringTok__Group__1__Impl9481);
            rule__StringTok__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__StringTok__Group__1__Impl"


    // $ANTLR start "rule__FuncTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4693:1: rule__FuncTok__Group__0 : rule__FuncTok__Group__0__Impl rule__FuncTok__Group__1 ;
    public final void rule__FuncTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4697:1: ( rule__FuncTok__Group__0__Impl rule__FuncTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4698:2: rule__FuncTok__Group__0__Impl rule__FuncTok__Group__1
            {
            pushFollow(FOLLOW_rule__FuncTok__Group__0__Impl_in_rule__FuncTok__Group__09515);
            rule__FuncTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FuncTok__Group__1_in_rule__FuncTok__Group__09518);
            rule__FuncTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncTok__Group__0"


    // $ANTLR start "rule__FuncTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4705:1: rule__FuncTok__Group__0__Impl : ( () ) ;
    public final void rule__FuncTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4709:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4710:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4710:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4711:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTokAccess().getFuncTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4712:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4714:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTokAccess().getFuncTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncTok__Group__0__Impl"


    // $ANTLR start "rule__FuncTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4724:1: rule__FuncTok__Group__1 : rule__FuncTok__Group__1__Impl ;
    public final void rule__FuncTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4728:1: ( rule__FuncTok__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4729:2: rule__FuncTok__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FuncTok__Group__1__Impl_in_rule__FuncTok__Group__19576);
            rule__FuncTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncTok__Group__1"


    // $ANTLR start "rule__FuncTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4735:1: rule__FuncTok__Group__1__Impl : ( ( rule__FuncTok__FuncAssignment_1 ) ) ;
    public final void rule__FuncTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4739:1: ( ( ( rule__FuncTok__FuncAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4740:1: ( ( rule__FuncTok__FuncAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4740:1: ( ( rule__FuncTok__FuncAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4741:1: ( rule__FuncTok__FuncAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTokAccess().getFuncAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4742:1: ( rule__FuncTok__FuncAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4742:2: rule__FuncTok__FuncAssignment_1
            {
            pushFollow(FOLLOW_rule__FuncTok__FuncAssignment_1_in_rule__FuncTok__Group__1__Impl9603);
            rule__FuncTok__FuncAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTokAccess().getFuncAssignment_1()); 
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
    // $ANTLR end "rule__FuncTok__Group__1__Impl"


    // $ANTLR start "rule__NumberTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4756:1: rule__NumberTok__Group__0 : rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1 ;
    public final void rule__NumberTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4760:1: ( rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4761:2: rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1
            {
            pushFollow(FOLLOW_rule__NumberTok__Group__0__Impl_in_rule__NumberTok__Group__09637);
            rule__NumberTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumberTok__Group__1_in_rule__NumberTok__Group__09640);
            rule__NumberTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__0"


    // $ANTLR start "rule__NumberTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4768:1: rule__NumberTok__Group__0__Impl : ( () ) ;
    public final void rule__NumberTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4772:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4773:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4773:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4774:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getNumberTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4775:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4777:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getNumberTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__0__Impl"


    // $ANTLR start "rule__NumberTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4787:1: rule__NumberTok__Group__1 : rule__NumberTok__Group__1__Impl rule__NumberTok__Group__2 ;
    public final void rule__NumberTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4791:1: ( rule__NumberTok__Group__1__Impl rule__NumberTok__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4792:2: rule__NumberTok__Group__1__Impl rule__NumberTok__Group__2
            {
            pushFollow(FOLLOW_rule__NumberTok__Group__1__Impl_in_rule__NumberTok__Group__19698);
            rule__NumberTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumberTok__Group__2_in_rule__NumberTok__Group__19701);
            rule__NumberTok__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__1"


    // $ANTLR start "rule__NumberTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4799:1: rule__NumberTok__Group__1__Impl : ( ( rule__NumberTok__NumAssignment_1 ) ) ;
    public final void rule__NumberTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4803:1: ( ( ( rule__NumberTok__NumAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4804:1: ( ( rule__NumberTok__NumAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4804:1: ( ( rule__NumberTok__NumAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4805:1: ( rule__NumberTok__NumAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getNumAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4806:1: ( rule__NumberTok__NumAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4806:2: rule__NumberTok__NumAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberTok__NumAssignment_1_in_rule__NumberTok__Group__1__Impl9728);
            rule__NumberTok__NumAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getNumAssignment_1()); 
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
    // $ANTLR end "rule__NumberTok__Group__1__Impl"


    // $ANTLR start "rule__NumberTok__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4816:1: rule__NumberTok__Group__2 : rule__NumberTok__Group__2__Impl ;
    public final void rule__NumberTok__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4820:1: ( rule__NumberTok__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4821:2: rule__NumberTok__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NumberTok__Group__2__Impl_in_rule__NumberTok__Group__29758);
            rule__NumberTok__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__2"


    // $ANTLR start "rule__NumberTok__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4827:1: rule__NumberTok__Group__2__Impl : ( ( rule__NumberTok__UnitAssignment_2 )? ) ;
    public final void rule__NumberTok__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4831:1: ( ( ( rule__NumberTok__UnitAssignment_2 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4832:1: ( ( rule__NumberTok__UnitAssignment_2 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4832:1: ( ( rule__NumberTok__UnitAssignment_2 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4833:1: ( rule__NumberTok__UnitAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getUnitAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4834:1: ( rule__NumberTok__UnitAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_IDENT) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred63_InternalCssDsl()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4834:2: rule__NumberTok__UnitAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NumberTok__UnitAssignment_2_in_rule__NumberTok__Group__2__Impl9785);
                    rule__NumberTok__UnitAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getUnitAssignment_2()); 
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
    // $ANTLR end "rule__NumberTok__Group__2__Impl"


    // $ANTLR start "rule__IdentifierTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4850:1: rule__IdentifierTok__Group__0 : rule__IdentifierTok__Group__0__Impl rule__IdentifierTok__Group__1 ;
    public final void rule__IdentifierTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4854:1: ( rule__IdentifierTok__Group__0__Impl rule__IdentifierTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4855:2: rule__IdentifierTok__Group__0__Impl rule__IdentifierTok__Group__1
            {
            pushFollow(FOLLOW_rule__IdentifierTok__Group__0__Impl_in_rule__IdentifierTok__Group__09822);
            rule__IdentifierTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdentifierTok__Group__1_in_rule__IdentifierTok__Group__09825);
            rule__IdentifierTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierTok__Group__0"


    // $ANTLR start "rule__IdentifierTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4862:1: rule__IdentifierTok__Group__0__Impl : ( () ) ;
    public final void rule__IdentifierTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4866:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4867:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4867:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4868:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierTokAccess().getIdentifierTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4869:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4871:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierTokAccess().getIdentifierTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierTok__Group__0__Impl"


    // $ANTLR start "rule__IdentifierTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4881:1: rule__IdentifierTok__Group__1 : rule__IdentifierTok__Group__1__Impl ;
    public final void rule__IdentifierTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4885:1: ( rule__IdentifierTok__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4886:2: rule__IdentifierTok__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IdentifierTok__Group__1__Impl_in_rule__IdentifierTok__Group__19883);
            rule__IdentifierTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierTok__Group__1"


    // $ANTLR start "rule__IdentifierTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4892:1: rule__IdentifierTok__Group__1__Impl : ( ( rule__IdentifierTok__IdAssignment_1 ) ) ;
    public final void rule__IdentifierTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4896:1: ( ( ( rule__IdentifierTok__IdAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4897:1: ( ( rule__IdentifierTok__IdAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4897:1: ( ( rule__IdentifierTok__IdAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4898:1: ( rule__IdentifierTok__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierTokAccess().getIdAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4899:1: ( rule__IdentifierTok__IdAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4899:2: rule__IdentifierTok__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__IdentifierTok__IdAssignment_1_in_rule__IdentifierTok__Group__1__Impl9910);
            rule__IdentifierTok__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierTokAccess().getIdAssignment_1()); 
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
    // $ANTLR end "rule__IdentifierTok__Group__1__Impl"


    // $ANTLR start "rule__UrlTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4913:1: rule__UrlTok__Group__0 : rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1 ;
    public final void rule__UrlTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4917:1: ( rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4918:2: rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1
            {
            pushFollow(FOLLOW_rule__UrlTok__Group__0__Impl_in_rule__UrlTok__Group__09944);
            rule__UrlTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UrlTok__Group__1_in_rule__UrlTok__Group__09947);
            rule__UrlTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__0"


    // $ANTLR start "rule__UrlTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4925:1: rule__UrlTok__Group__0__Impl : ( () ) ;
    public final void rule__UrlTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4929:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4930:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4930:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4931:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getUrlTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4932:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4934:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getUrlTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__0__Impl"


    // $ANTLR start "rule__UrlTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4944:1: rule__UrlTok__Group__1 : rule__UrlTok__Group__1__Impl ;
    public final void rule__UrlTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4948:1: ( rule__UrlTok__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4949:2: rule__UrlTok__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UrlTok__Group__1__Impl_in_rule__UrlTok__Group__110005);
            rule__UrlTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__1"


    // $ANTLR start "rule__UrlTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4955:1: rule__UrlTok__Group__1__Impl : ( ( rule__UrlTok__UrlAssignment_1 ) ) ;
    public final void rule__UrlTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4959:1: ( ( ( rule__UrlTok__UrlAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4960:1: ( ( rule__UrlTok__UrlAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4960:1: ( ( rule__UrlTok__UrlAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4961:1: ( rule__UrlTok__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getUrlAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4962:1: ( rule__UrlTok__UrlAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4962:2: rule__UrlTok__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__UrlTok__UrlAssignment_1_in_rule__UrlTok__Group__1__Impl10032);
            rule__UrlTok__UrlAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getUrlAssignment_1()); 
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
    // $ANTLR end "rule__UrlTok__Group__1__Impl"


    // $ANTLR start "rule__ColorTok__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4976:1: rule__ColorTok__Group__0 : rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1 ;
    public final void rule__ColorTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4980:1: ( rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4981:2: rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1
            {
            pushFollow(FOLLOW_rule__ColorTok__Group__0__Impl_in_rule__ColorTok__Group__010066);
            rule__ColorTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorTok__Group__1_in_rule__ColorTok__Group__010069);
            rule__ColorTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__0"


    // $ANTLR start "rule__ColorTok__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4988:1: rule__ColorTok__Group__0__Impl : ( () ) ;
    public final void rule__ColorTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4992:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4993:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4993:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4994:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getColorTokAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4995:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4997:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getColorTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__0__Impl"


    // $ANTLR start "rule__ColorTok__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5007:1: rule__ColorTok__Group__1 : rule__ColorTok__Group__1__Impl rule__ColorTok__Group__2 ;
    public final void rule__ColorTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5011:1: ( rule__ColorTok__Group__1__Impl rule__ColorTok__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5012:2: rule__ColorTok__Group__1__Impl rule__ColorTok__Group__2
            {
            pushFollow(FOLLOW_rule__ColorTok__Group__1__Impl_in_rule__ColorTok__Group__110127);
            rule__ColorTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorTok__Group__2_in_rule__ColorTok__Group__110130);
            rule__ColorTok__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__1"


    // $ANTLR start "rule__ColorTok__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5019:1: rule__ColorTok__Group__1__Impl : ( RULE_HASHMARK ) ;
    public final void rule__ColorTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5023:1: ( ( RULE_HASHMARK ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5024:1: ( RULE_HASHMARK )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5024:1: ( RULE_HASHMARK )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5025:1: RULE_HASHMARK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getHASHMARKTerminalRuleCall_1()); 
            }
            match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_rule__ColorTok__Group__1__Impl10157); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getHASHMARKTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__ColorTok__Group__1__Impl"


    // $ANTLR start "rule__ColorTok__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5036:1: rule__ColorTok__Group__2 : rule__ColorTok__Group__2__Impl ;
    public final void rule__ColorTok__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5040:1: ( rule__ColorTok__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5041:2: rule__ColorTok__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorTok__Group__2__Impl_in_rule__ColorTok__Group__210186);
            rule__ColorTok__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__2"


    // $ANTLR start "rule__ColorTok__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5047:1: rule__ColorTok__Group__2__Impl : ( ( rule__ColorTok__ColorAssignment_2 ) ) ;
    public final void rule__ColorTok__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5051:1: ( ( ( rule__ColorTok__ColorAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5052:1: ( ( rule__ColorTok__ColorAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5052:1: ( ( rule__ColorTok__ColorAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5053:1: ( rule__ColorTok__ColorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getColorAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5054:1: ( rule__ColorTok__ColorAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5054:2: rule__ColorTok__ColorAssignment_2
            {
            pushFollow(FOLLOW_rule__ColorTok__ColorAssignment_2_in_rule__ColorTok__Group__2__Impl10213);
            rule__ColorTok__ColorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getColorAssignment_2()); 
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
    // $ANTLR end "rule__ColorTok__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5072:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5076:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5077:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__010251);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__010254);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5084:1: rule__Function__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5088:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5089:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5089:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5090:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5091:1: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5092:2: '-'
                    {
                    match(input,33,FOLLOW_33_in_rule__Function__Group__0__Impl10283); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5103:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5107:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5108:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__110316);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__110319);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5115:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5119:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5120:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5120:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5121:1: ( rule__Function__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5122:1: ( rule__Function__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5122:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl10346);
            rule__Function__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5132:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5136:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5137:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__210376);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__210379);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5144:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5148:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5149:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5149:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5150:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__Function__Group__2__Impl10407); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5163:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5167:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5168:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__310438);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__310441);
            rule__Function__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5175:1: rule__Function__Group__3__Impl : ( ( ( rule__Function__ParamsAssignment_3 ) ) ( ( rule__Function__ParamsAssignment_3 )* ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5179:1: ( ( ( ( rule__Function__ParamsAssignment_3 ) ) ( ( rule__Function__ParamsAssignment_3 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5180:1: ( ( ( rule__Function__ParamsAssignment_3 ) ) ( ( rule__Function__ParamsAssignment_3 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5180:1: ( ( ( rule__Function__ParamsAssignment_3 ) ) ( ( rule__Function__ParamsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5181:1: ( ( rule__Function__ParamsAssignment_3 ) ) ( ( rule__Function__ParamsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5181:1: ( ( rule__Function__ParamsAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5182:1: ( rule__Function__ParamsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParamsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5183:1: ( rule__Function__ParamsAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5183:2: rule__Function__ParamsAssignment_3
            {
            pushFollow(FOLLOW_rule__Function__ParamsAssignment_3_in_rule__Function__Group__3__Impl10470);
            rule__Function__ParamsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParamsAssignment_3()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5186:1: ( ( rule__Function__ParamsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5187:1: ( rule__Function__ParamsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParamsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5188:1: ( rule__Function__ParamsAssignment_3 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_IDENT||(LA51_0>=RULE_STRING && LA51_0<=RULE_PERCENT)||(LA51_0>=RULE_WS && LA51_0<=RULE_HASHMARK)||LA51_0==RULE_INTEGER||LA51_0==33||LA51_0==44) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5188:2: rule__Function__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Function__ParamsAssignment_3_in_rule__Function__Group__3__Impl10482);
            	    rule__Function__ParamsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParamsAssignment_3()); 
            }

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5199:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5203:1: ( rule__Function__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5204:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__410515);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5210:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5214:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5215:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5215:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5216:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,43,FOLLOW_43_in_rule__Function__Group__4__Impl10543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__URLType__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5239:1: rule__URLType__Group__0 : rule__URLType__Group__0__Impl rule__URLType__Group__1 ;
    public final void rule__URLType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5243:1: ( rule__URLType__Group__0__Impl rule__URLType__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5244:2: rule__URLType__Group__0__Impl rule__URLType__Group__1
            {
            pushFollow(FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__010584);
            rule__URLType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__010587);
            rule__URLType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5251:1: rule__URLType__Group__0__Impl : ( 'url' ) ;
    public final void rule__URLType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5255:1: ( ( 'url' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5256:1: ( 'url' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5256:1: ( 'url' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5257:1: 'url'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__URLType__Group__0__Impl10615); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
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
    // $ANTLR end "rule__URLType__Group__0__Impl"


    // $ANTLR start "rule__URLType__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5270:1: rule__URLType__Group__1 : rule__URLType__Group__1__Impl rule__URLType__Group__2 ;
    public final void rule__URLType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5274:1: ( rule__URLType__Group__1__Impl rule__URLType__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5275:2: rule__URLType__Group__1__Impl rule__URLType__Group__2
            {
            pushFollow(FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__110646);
            rule__URLType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__110649);
            rule__URLType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5282:1: rule__URLType__Group__1__Impl : ( '(' ) ;
    public final void rule__URLType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5286:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5287:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5287:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5288:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__URLType__Group__1__Impl10677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__URLType__Group__1__Impl"


    // $ANTLR start "rule__URLType__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5301:1: rule__URLType__Group__2 : rule__URLType__Group__2__Impl rule__URLType__Group__3 ;
    public final void rule__URLType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5305:1: ( rule__URLType__Group__2__Impl rule__URLType__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5306:2: rule__URLType__Group__2__Impl rule__URLType__Group__3
            {
            pushFollow(FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__210708);
            rule__URLType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__210711);
            rule__URLType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5313:1: rule__URLType__Group__2__Impl : ( ( rule__URLType__UrlAssignment_2 ) ) ;
    public final void rule__URLType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5317:1: ( ( ( rule__URLType__UrlAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5318:1: ( ( rule__URLType__UrlAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5318:1: ( ( rule__URLType__UrlAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5319:1: ( rule__URLType__UrlAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5320:1: ( rule__URLType__UrlAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5320:2: rule__URLType__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl10738);
            rule__URLType__UrlAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 
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
    // $ANTLR end "rule__URLType__Group__2__Impl"


    // $ANTLR start "rule__URLType__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5330:1: rule__URLType__Group__3 : rule__URLType__Group__3__Impl ;
    public final void rule__URLType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5334:1: ( rule__URLType__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5335:2: rule__URLType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__310768);
            rule__URLType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5341:1: rule__URLType__Group__3__Impl : ( ')' ) ;
    public final void rule__URLType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5345:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5346:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5346:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5347:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,43,FOLLOW_43_in_rule__URLType__Group__3__Impl10796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__URLType__Group__3__Impl"


    // $ANTLR start "rule__Stylesheet__CharsetAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5369:1: rule__Stylesheet__CharsetAssignment_0 : ( rulecharset ) ;
    public final void rule__Stylesheet__CharsetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5373:1: ( ( rulecharset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5374:1: ( rulecharset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5374:1: ( rulecharset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5375:1: rulecharset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulecharset_in_rule__Stylesheet__CharsetAssignment_010840);
            rulecharset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Stylesheet__CharsetAssignment_0"


    // $ANTLR start "rule__Stylesheet__ImportsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5384:1: rule__Stylesheet__ImportsAssignment_1 : ( ruleimportExpression ) ;
    public final void rule__Stylesheet__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5388:1: ( ( ruleimportExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5389:1: ( ruleimportExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5389:1: ( ruleimportExpression )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5390:1: ruleimportExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleimportExpression_in_rule__Stylesheet__ImportsAssignment_110871);
            ruleimportExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Stylesheet__ImportsAssignment_1"


    // $ANTLR start "rule__Stylesheet__RulesetAssignment_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5399:1: rule__Stylesheet__RulesetAssignment_2_0 : ( ruleruleset ) ;
    public final void rule__Stylesheet__RulesetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5403:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5404:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5404:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5405:1: ruleruleset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_2_010902);
            ruleruleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Stylesheet__RulesetAssignment_2_0"


    // $ANTLR start "rule__Stylesheet__MediaAssignment_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5414:1: rule__Stylesheet__MediaAssignment_2_1 : ( rulemedia ) ;
    public final void rule__Stylesheet__MediaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5418:1: ( ( rulemedia ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5419:1: ( rulemedia )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5419:1: ( rulemedia )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5420:1: rulemedia
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_2_110933);
            rulemedia();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Stylesheet__MediaAssignment_2_1"


    // $ANTLR start "rule__Stylesheet__PageAssignment_2_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5429:1: rule__Stylesheet__PageAssignment_2_2 : ( rulepage ) ;
    public final void rule__Stylesheet__PageAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5433:1: ( ( rulepage ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5434:1: ( rulepage )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5434:1: ( rulepage )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5435:1: rulepage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_rulepage_in_rule__Stylesheet__PageAssignment_2_210964);
            rulepage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Stylesheet__PageAssignment_2_2"


    // $ANTLR start "rule__Charset__CharsetAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5444:1: rule__Charset__CharsetAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Charset__CharsetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5448:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5449:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5449:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5450:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__CharsetAssignment_110995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Charset__CharsetAssignment_1"


    // $ANTLR start "rule__ImportExpression__ValueAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5459:1: rule__ImportExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__ImportExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5463:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5464:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5464:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5465:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportExpression__ValueAssignment_0_111026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__ImportExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__ImportExpression__MediaListAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5474:1: rule__ImportExpression__MediaListAssignment_1_1 : ( rulemedia_list ) ;
    public final void rule__ImportExpression__MediaListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5478:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5479:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5479:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5480:1: rulemedia_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_rule__ImportExpression__MediaListAssignment_1_111057);
            rulemedia_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__ImportExpression__MediaListAssignment_1_1"


    // $ANTLR start "rule__Page__PseudoPageAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5489:1: rule__Page__PseudoPageAssignment_2 : ( rulepseudo_page ) ;
    public final void rule__Page__PseudoPageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5493:1: ( ( rulepseudo_page ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5494:1: ( rulepseudo_page )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5494:1: ( rulepseudo_page )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5495:1: rulepseudo_page
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulepseudo_page_in_rule__Page__PseudoPageAssignment_211088);
            rulepseudo_page();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Page__PseudoPageAssignment_2"


    // $ANTLR start "rule__Page__DeclarationsAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5504:1: rule__Page__DeclarationsAssignment_4 : ( rulecss_declaration ) ;
    public final void rule__Page__DeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5508:1: ( ( rulecss_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5509:1: ( rulecss_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5509:1: ( rulecss_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5510:1: rulecss_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_rule__Page__DeclarationsAssignment_411119);
            rulecss_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Page__DeclarationsAssignment_4"


    // $ANTLR start "rule__Page__DeclarationsAssignment_5_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5519:1: rule__Page__DeclarationsAssignment_5_1 : ( rulecss_declaration ) ;
    public final void rule__Page__DeclarationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5523:1: ( ( rulecss_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5524:1: ( rulecss_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5524:1: ( rulecss_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5525:1: rulecss_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_rule__Page__DeclarationsAssignment_5_111150);
            rulecss_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Page__DeclarationsAssignment_5_1"


    // $ANTLR start "rule__Media__MedialistAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5534:1: rule__Media__MedialistAssignment_1 : ( rulemedia_list ) ;
    public final void rule__Media__MedialistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5538:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5539:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5539:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5540:1: rulemedia_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_111181);
            rulemedia_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Media__MedialistAssignment_1"


    // $ANTLR start "rule__Media__RulesetsAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5549:1: rule__Media__RulesetsAssignment_3 : ( ruleruleset ) ;
    public final void rule__Media__RulesetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5553:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5554:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5554:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5555:1: ruleruleset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_311212);
            ruleruleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Media__RulesetsAssignment_3"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5564:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5568:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5569:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5569:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5570:1: ruleselector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_011243);
            ruleselector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_0"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5579:1: rule__Ruleset__SelectorsAssignment_1_1 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5583:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5584:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5584:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5585:1: ruleselector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_111274);
            ruleselector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_1_1"


    // $ANTLR start "rule__Ruleset__DeclarationsAssignment_4_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5594:1: rule__Ruleset__DeclarationsAssignment_4_0 : ( rulecss_declaration ) ;
    public final void rule__Ruleset__DeclarationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5598:1: ( ( rulecss_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5599:1: ( rulecss_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5599:1: ( rulecss_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5600:1: rulecss_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_4_011305);
            rulecss_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__Ruleset__DeclarationsAssignment_4_0"


    // $ANTLR start "rule__Selector__SimpleselectorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5609:1: rule__Selector__SimpleselectorsAssignment_0 : ( rulesimple_selector ) ;
    public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5613:1: ( ( rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5614:1: ( rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5614:1: ( rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5615:1: rulesimple_selector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_011336);
            rulesimple_selector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Selector__SimpleselectorsAssignment_0"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5624:1: rule__Selector__CombinatorAssignment_1_0_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5628:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5629:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5629:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5630:1: rulecombinator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_011367);
            rulecombinator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_0_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5639:1: rule__Selector__SelectorAssignment_1_0_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5643:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5644:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5644:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5645:1: ruleselector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_111398);
            ruleselector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__Selector__SelectorAssignment_1_0_1"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5654:1: rule__Selector__CombinatorAssignment_1_1_1 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5658:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5659:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5659:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5660:1: rulecombinator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_111429);
            rulecombinator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_1_1"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_1_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5669:1: rule__Selector__SelectorAssignment_1_1_2 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5673:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5674:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5674:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5675:1: ruleselector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_211460);
            ruleselector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__Selector__SelectorAssignment_1_1_2"


    // $ANTLR start "rule__Simple_selector__ElementAssignment_0_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5684:1: rule__Simple_selector__ElementAssignment_0_0_0 : ( ruleElementSelector ) ;
    public final void rule__Simple_selector__ElementAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5688:1: ( ( ruleElementSelector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5689:1: ( ruleElementSelector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5689:1: ( ruleElementSelector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5690:1: ruleElementSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleElementSelector_in_rule__Simple_selector__ElementAssignment_0_0_011491);
            ruleElementSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
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
    // $ANTLR end "rule__Simple_selector__ElementAssignment_0_0_0"


    // $ANTLR start "rule__Simple_selector__UniversalAssignment_0_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5699:1: rule__Simple_selector__UniversalAssignment_0_0_1 : ( ruleUniversalSelector ) ;
    public final void rule__Simple_selector__UniversalAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5703:1: ( ( ruleUniversalSelector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5704:1: ( ruleUniversalSelector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5704:1: ( ruleUniversalSelector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5705:1: ruleUniversalSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleUniversalSelector_in_rule__Simple_selector__UniversalAssignment_0_0_111522);
            ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
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
    // $ANTLR end "rule__Simple_selector__UniversalAssignment_0_0_1"


    // $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5714:1: rule__Simple_selector__SubSelectorsAssignment_0_1 : ( ruleSubSelector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5718:1: ( ( ruleSubSelector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5719:1: ( ruleSubSelector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5719:1: ( ruleSubSelector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5720:1: ruleSubSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_rule__Simple_selector__SubSelectorsAssignment_0_111553);
            ruleSubSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_0_1"


    // $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5729:1: rule__Simple_selector__SubSelectorsAssignment_1 : ( ruleSubSelector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5733:1: ( ( ruleSubSelector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5734:1: ( ruleSubSelector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5734:1: ( ruleSubSelector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5735:1: ruleSubSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_rule__Simple_selector__SubSelectorsAssignment_111584);
            ruleSubSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_1"


    // $ANTLR start "rule__AttributeSelector__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5744:1: rule__AttributeSelector__NameAssignment_2 : ( RULE_IDENT ) ;
    public final void rule__AttributeSelector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5748:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5749:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5749:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5750:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttributeSelector__NameAssignment_211615); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__AttributeSelector__NameAssignment_2"


    // $ANTLR start "rule__AttributeSelector__OpAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5759:1: rule__AttributeSelector__OpAssignment_3_0 : ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) ) ;
    public final void rule__AttributeSelector__OpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5763:1: ( ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5764:1: ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5764:1: ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5765:1: ( rule__AttributeSelector__OpAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5766:1: ( rule__AttributeSelector__OpAlternatives_3_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5766:2: rule__AttributeSelector__OpAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__AttributeSelector__OpAlternatives_3_0_0_in_rule__AttributeSelector__OpAssignment_3_011646);
            rule__AttributeSelector__OpAlternatives_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0()); 
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
    // $ANTLR end "rule__AttributeSelector__OpAssignment_3_0"


    // $ANTLR start "rule__AttributeSelector__ValueAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5775:1: rule__AttributeSelector__ValueAssignment_3_1 : ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__AttributeSelector__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5779:1: ( ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5780:1: ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5780:1: ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5781:1: ( rule__AttributeSelector__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5782:1: ( rule__AttributeSelector__ValueAlternatives_3_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5782:2: rule__AttributeSelector__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__AttributeSelector__ValueAlternatives_3_1_0_in_rule__AttributeSelector__ValueAssignment_3_111679);
            rule__AttributeSelector__ValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0()); 
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
    // $ANTLR end "rule__AttributeSelector__ValueAssignment_3_1"


    // $ANTLR start "rule__ClassSelector__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5791:1: rule__ClassSelector__NameAssignment_2 : ( RULE_IDENT ) ;
    public final void rule__ClassSelector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5795:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5796:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5796:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5797:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ClassSelector__NameAssignment_211712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ClassSelector__NameAssignment_2"


    // $ANTLR start "rule__ElementSelector__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5806:1: rule__ElementSelector__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ElementSelector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5810:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5811:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5811:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5812:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getNameIDENTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ElementSelector__NameAssignment_111743); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getNameIDENTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ElementSelector__NameAssignment_1"


    // $ANTLR start "rule__UniversalSelector__NamespeceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5821:1: rule__UniversalSelector__NamespeceAssignment_1 : ( rulecss_namespace_prefix ) ;
    public final void rule__UniversalSelector__NamespeceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5825:1: ( ( rulecss_namespace_prefix ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5826:1: ( rulecss_namespace_prefix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5826:1: ( rulecss_namespace_prefix )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5827:1: rulecss_namespace_prefix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getNamespeceCss_namespace_prefixParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_rule__UniversalSelector__NamespeceAssignment_111774);
            rulecss_namespace_prefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getNamespeceCss_namespace_prefixParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__UniversalSelector__NamespeceAssignment_1"


    // $ANTLR start "rule__IdSelector__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5836:1: rule__IdSelector__NameAssignment_2 : ( RULE_IDENT ) ;
    public final void rule__IdSelector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5840:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5841:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5841:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5842:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__IdSelector__NameAssignment_211805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getNameIDENTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__IdSelector__NameAssignment_2"


    // $ANTLR start "rule__Css_declaration__PropertyAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5851:1: rule__Css_declaration__PropertyAssignment_1 : ( rulecss_property ) ;
    public final void rule__Css_declaration__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5855:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5856:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5856:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5857:1: rulecss_property
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulecss_property_in_rule__Css_declaration__PropertyAssignment_111836);
            rulecss_property();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Css_declaration__PropertyAssignment_1"


    // $ANTLR start "rule__Css_declaration__ValueTokensAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5866:1: rule__Css_declaration__ValueTokensAssignment_4 : ( ruleCssTok ) ;
    public final void rule__Css_declaration__ValueTokensAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5870:1: ( ( ruleCssTok ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5871:1: ( ruleCssTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5871:1: ( ruleCssTok )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5872:1: ruleCssTok
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_rule__Css_declaration__ValueTokensAssignment_411867);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Css_declaration__ValueTokensAssignment_4"


    // $ANTLR start "rule__Css_declaration__ImportantAssignment_5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5881:1: rule__Css_declaration__ImportantAssignment_5 : ( RULE_IMPORTANT_SYM ) ;
    public final void rule__Css_declaration__ImportantAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5885:1: ( ( RULE_IMPORTANT_SYM ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5886:1: ( RULE_IMPORTANT_SYM )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5886:1: ( RULE_IMPORTANT_SYM )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5887:1: RULE_IMPORTANT_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_declarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_5_0()); 
            }
            match(input,RULE_IMPORTANT_SYM,FOLLOW_RULE_IMPORTANT_SYM_in_rule__Css_declaration__ImportantAssignment_511898); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_declarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__Css_declaration__ImportantAssignment_5"


    // $ANTLR start "rule__Css_property__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5896:1: rule__Css_property__NameAssignment_1 : ( ruleValidPropertyIdent ) ;
    public final void rule__Css_property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5900:1: ( ( ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5901:1: ( ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5901:1: ( ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5902:1: ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rule__Css_property__NameAssignment_111929);
            ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Css_property__NameAssignment_1"


    // $ANTLR start "rule__PseudoClassName__NameAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5911:1: rule__PseudoClassName__NameAssignment : ( RULE_IDENT ) ;
    public final void rule__PseudoClassName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5915:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5916:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5916:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5917:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassNameAccess().getNameIDENTTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__PseudoClassName__NameAssignment11960); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassNameAccess().getNameIDENTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__PseudoClassName__NameAssignment"


    // $ANTLR start "rule__PseudoClassFunction__NameAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5926:1: rule__PseudoClassFunction__NameAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__PseudoClassFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5930:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5931:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5931:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5932:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getNameIDENTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__PseudoClassFunction__NameAssignment_011991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getNameIDENTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__PseudoClassFunction__NameAssignment_0"


    // $ANTLR start "rule__PseudoClassFunction__ParamsAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5941:1: rule__PseudoClassFunction__ParamsAssignment_2 : ( ruleCssTok ) ;
    public final void rule__PseudoClassFunction__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5945:1: ( ( ruleCssTok ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5946:1: ( ruleCssTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5946:1: ( ruleCssTok )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5947:1: ruleCssTok
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_rule__PseudoClassFunction__ParamsAssignment_212022);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PseudoClassFunction__ParamsAssignment_2"


    // $ANTLR start "rule__SymbolTok__SymbolAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5956:1: rule__SymbolTok__SymbolAssignment_1 : ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) ) ;
    public final void rule__SymbolTok__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5960:1: ( ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5961:1: ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5961:1: ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5962:1: ( rule__SymbolTok__SymbolAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5963:1: ( rule__SymbolTok__SymbolAlternatives_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5963:2: rule__SymbolTok__SymbolAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SymbolTok__SymbolAlternatives_1_0_in_rule__SymbolTok__SymbolAssignment_112053);
            rule__SymbolTok__SymbolAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0()); 
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
    // $ANTLR end "rule__SymbolTok__SymbolAssignment_1"


    // $ANTLR start "rule__StringTok__ValueAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5972:1: rule__StringTok__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringTok__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5976:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5977:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5977:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5978:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringTok__ValueAssignment_112086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getValueSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__StringTok__ValueAssignment_1"


    // $ANTLR start "rule__FuncTok__FuncAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5987:1: rule__FuncTok__FuncAssignment_1 : ( rulefunction ) ;
    public final void rule__FuncTok__FuncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5991:1: ( ( rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5992:1: ( rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5992:1: ( rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5993:1: rulefunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTokAccess().getFuncFunctionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulefunction_in_rule__FuncTok__FuncAssignment_112117);
            rulefunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTokAccess().getFuncFunctionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FuncTok__FuncAssignment_1"


    // $ANTLR start "rule__NumberTok__NumAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6002:1: rule__NumberTok__NumAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__NumberTok__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6006:1: ( ( RULE_INTEGER ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6007:1: ( RULE_INTEGER )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6007:1: ( RULE_INTEGER )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6008:1: RULE_INTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getNumINTEGERTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__NumberTok__NumAssignment_112148); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getNumINTEGERTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__NumberTok__NumAssignment_1"


    // $ANTLR start "rule__NumberTok__UnitAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6017:1: rule__NumberTok__UnitAssignment_2 : ( RULE_IDENT ) ;
    public final void rule__NumberTok__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6021:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6022:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6022:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6023:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getUnitIDENTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__NumberTok__UnitAssignment_212179); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getUnitIDENTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__NumberTok__UnitAssignment_2"


    // $ANTLR start "rule__IdentifierTok__IdAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6032:1: rule__IdentifierTok__IdAssignment_1 : ( ruleValidPropertyIdent ) ;
    public final void rule__IdentifierTok__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6036:1: ( ( ruleValidPropertyIdent ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6037:1: ( ruleValidPropertyIdent )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6037:1: ( ruleValidPropertyIdent )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6038:1: ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierTokAccess().getIdValidPropertyIdentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rule__IdentifierTok__IdAssignment_112210);
            ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierTokAccess().getIdValidPropertyIdentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__IdentifierTok__IdAssignment_1"


    // $ANTLR start "rule__UrlTok__UrlAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6047:1: rule__UrlTok__UrlAssignment_1 : ( ruleURLType ) ;
    public final void rule__UrlTok__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6051:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6052:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6052:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6053:1: ruleURLType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_rule__UrlTok__UrlAssignment_112241);
            ruleURLType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__UrlTok__UrlAssignment_1"


    // $ANTLR start "rule__ColorTok__ColorAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6062:1: rule__ColorTok__ColorAssignment_2 : ( ( rule__ColorTok__ColorAlternatives_2_0 ) ) ;
    public final void rule__ColorTok__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6066:1: ( ( ( rule__ColorTok__ColorAlternatives_2_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6067:1: ( ( rule__ColorTok__ColorAlternatives_2_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6067:1: ( ( rule__ColorTok__ColorAlternatives_2_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6068:1: ( rule__ColorTok__ColorAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getColorAlternatives_2_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6069:1: ( rule__ColorTok__ColorAlternatives_2_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6069:2: rule__ColorTok__ColorAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ColorTok__ColorAlternatives_2_0_in_rule__ColorTok__ColorAssignment_212272);
            rule__ColorTok__ColorAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getColorAlternatives_2_0()); 
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
    // $ANTLR end "rule__ColorTok__ColorAssignment_2"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6078:1: rule__Function__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6082:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6083:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6083:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6084:1: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_112305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__ParamsAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6093:1: rule__Function__ParamsAssignment_3 : ( ruleCssTok ) ;
    public final void rule__Function__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6097:1: ( ( ruleCssTok ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6098:1: ( ruleCssTok )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6098:1: ( ruleCssTok )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6099:1: ruleCssTok
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParamsCssTokParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_rule__Function__ParamsAssignment_312336);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParamsCssTokParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Function__ParamsAssignment_3"


    // $ANTLR start "rule__URLType__UrlAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6108:1: rule__URLType__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__URLType__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6112:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6113:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6113:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6114:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_212367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__URLType__UrlAssignment_2"

    // $ANTLR start synpred63_InternalCssDsl
    public final void synpred63_InternalCssDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4834:2: ( rule__NumberTok__UnitAssignment_2 )
        // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4834:2: rule__NumberTok__UnitAssignment_2
        {
        pushFollow(FOLLOW_rule__NumberTok__UnitAssignment_2_in_synpred63_InternalCssDsl9785);
        rule__NumberTok__UnitAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalCssDsl

    // Delegated rules

    public final boolean synpred63_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\5\uffff\1\11\5\uffff";
    static final String DFA20_minS =
        "\1\4\3\uffff\2\4\5\uffff";
    static final String DFA20_maxS =
        "\1\54\3\uffff\1\4\1\54\5\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\5\1\7\1\10\1\6\1\4";
    static final String DFA20_specialS =
        "\13\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\5\2\uffff\1\3\2\1\1\uffff\1\2\1\10\1\uffff\1\6\22\uffff\1"+
            "\4\12\uffff\1\7",
            "",
            "",
            "",
            "\1\5",
            "\1\11\2\uffff\3\11\1\uffff\4\11\22\uffff\2\11\1\uffff\1\11"+
            "\5\uffff\1\12\2\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1641:1: rule__CssTok__Alternatives : ( ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleFuncTok ) | ( ruleNumberTok ) | ( ruleIdentifierTok ) | ( ruleUrlTok ) | ( ruleColorTok ) );";
        }
    }
    static final String DFA34_eotS =
        "\5\uffff";
    static final String DFA34_eofS =
        "\1\3\4\uffff";
    static final String DFA34_minS =
        "\1\10\1\uffff\1\4\1\uffff\1\4";
    static final String DFA34_maxS =
        "\1\43\1\uffff\1\51\1\uffff\1\51";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA34_specialS =
        "\5\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\2\uffff\1\2\22\uffff\3\1\2\uffff\1\3",
            "",
            "\1\1\6\uffff\1\4\1\1\20\uffff\4\1\2\uffff\1\3\1\uffff\2\1\1"+
            "\uffff\2\1",
            "",
            "\1\1\6\uffff\1\4\1\1\20\uffff\4\1\2\uffff\1\3\1\uffff\2\1\1"+
            "\uffff\2\1"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "3031:1: ( rule__Selector__Alternatives_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0_in_rulecharset160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Alternatives_in_ruleimportExpression220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulepage280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__0_in_rulepseudo_page340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0_in_rulemedia400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0_in_rulemedia_list460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0_in_ruleruleset579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleselector648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelector_in_entryRuleSubSelector735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelector742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSelector__Alternatives_in_ruleSubSelector768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSelector802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__0_in_ruleAttributeSelector828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_entryRuleClassSelector855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSelector862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSelector__Group__0_in_ruleClassSelector888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_entryRuleElementSelector915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementSelector922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementSelector__Group__0_in_ruleElementSelector948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniversalSelector982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniversalSelector__Group__0_in_ruleUniversalSelector1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_entryRuleIdSelector1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdSelector1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdSelector__Group__0_in_ruleIdSelector1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix1095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__0_in_rulecss_namespace_prefix1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__0_in_rulecss_declaration1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0_in_rulecss_property1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidPropertyIdent__Group__0_in_ruleValidPropertyIdent1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_entryRulePseudoClass1346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClass1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClass__Alternatives_in_rulePseudoClass1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName1406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassName1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassName__NameAssignment_in_rulePseudoClassName1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassFunction1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__0_in_rulePseudoClassFunction1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0_in_rulecombinator1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolTok__Group__0_in_ruleSymbolTok1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok1708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WSTok__Group__0_in_ruleWSTok1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringTok__Group__0_in_ruleStringTok1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_entryRuleFuncTok1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncTok1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuncTok__Group__0_in_ruleFuncTok1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__Group__0_in_ruleNumberTok1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_entryRuleIdentifierTok1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierTok1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdentifierTok__Group__0_in_ruleIdentifierTok1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlTok__Group__0_in_ruleUrlTok2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorTok__Group__0_in_ruleColorTok2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssTok__Alternatives_in_ruleCssTok2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0_in_ruleURLType2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__RulesetAssignment_2_0_in_rule__Stylesheet__Alternatives_22357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__MediaAssignment_2_1_in_rule__Stylesheet__Alternatives_22375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__PageAssignment_2_2_in_rule__Stylesheet__Alternatives_22393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Charset__Alternatives_02427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Charset__Alternatives_02447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__0_in_rule__ImportExpression__Alternatives2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__0_in_rule__ImportExpression__Alternatives2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ImportExpression__Alternatives_0_02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImportExpression__Alternatives_0_02553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Alternatives_12588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Alternatives_12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Media__Alternatives_02643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Media__Alternatives_02663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_12697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_12715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2768 = new BitSet(new long[]{0x0000016000001012L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2780 = new BitSet(new long[]{0x0000016000001012L});
    public static final BitSet FOLLOW_rule__Simple_selector__ElementAssignment_0_0_0_in_rule__Simple_selector__Alternatives_0_02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__UniversalAssignment_0_0_1_in_rule__Simple_selector__Alternatives_0_02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_rule__SubSelector__Alternatives2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_rule__SubSelector__Alternatives2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_rule__SubSelector__Alternatives2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_rule__SubSelector__Alternatives2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AttributeSelector__OpAlternatives_3_0_02951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AttributeSelector__OpAlternatives_3_0_02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AttributeSelector__OpAlternatives_3_0_02991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AttributeSelector__OpAlternatives_3_0_03011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rule__AttributeSelector__OpAlternatives_3_0_03030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rule__AttributeSelector__OpAlternatives_3_0_03047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttributeSelector__ValueAlternatives_3_1_03079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeSelector__ValueAlternatives_3_1_03096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_namespace_prefix__Alternatives_03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Css_namespace_prefix__Alternatives_03146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClass__Group_0__0_in_rule__PseudoClass__Alternatives3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_rule__PseudoClass__Alternatives3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Combinator__Alternatives_03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Combinator__Alternatives_03251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Combinator__Alternatives_03271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Unary_operator__Alternatives3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Unary_operator__Alternatives3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__SymbolTok__SymbolAlternatives_1_03361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rule__SymbolTok__SymbolAlternatives_1_03378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_rule__ColorTok__ColorAlternatives_2_03410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ColorTok__ColorAlternatives_2_03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_rule__CssTok__Alternatives3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_rule__CssTok__Alternatives3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_rule__CssTok__Alternatives3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncTok_in_rule__CssTok__Alternatives3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_rule__CssTok__Alternatives3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierTok_in_rule__CssTok__Alternatives3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_rule__CssTok__Alternatives3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_rule__CssTok__Alternatives3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__03609 = new BitSet(new long[]{0x0000136021F81010L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__03612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__CharsetAssignment_0_in_rule__Stylesheet__Group__0__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__13670 = new BitSet(new long[]{0x0000136021F81010L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__13673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__ImportsAssignment_1_in_rule__Stylesheet__Group__1__Impl3700 = new BitSet(new long[]{0x0000100000180002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__23731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_2_in_rule__Stylesheet__Group__2__Impl3758 = new BitSet(new long[]{0x0000036021E01012L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__03795 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__03798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Alternatives_0_in_rule__Charset__Group__0__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__13855 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__CharsetAssignment_1_in_rule__Charset__Group__1__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__23915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Charset__Group__2__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__0__Impl_in_rule__ImportExpression__Group_0__03980 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__1_in_rule__ImportExpression__Group_0__03983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Alternatives_0_0_in_rule__ImportExpression__Group_0__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__1__Impl_in_rule__ImportExpression__Group_0__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__ValueAssignment_0_1_in_rule__ImportExpression__Group_0__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__0__Impl_in_rule__ImportExpression__Group_1__04101 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__1_in_rule__ImportExpression__Group_1__04104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__ImportExpression__Group_1__0__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__1__Impl_in_rule__ImportExpression__Group_1__14160 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__2_in_rule__ImportExpression__Group_1__14163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__MediaListAssignment_1_1_in_rule__ImportExpression__Group_1__1__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__2__Impl_in_rule__ImportExpression__Group_1__24221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ImportExpression__Group_1__2__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__04286 = new BitSet(new long[]{0x0000036021E01010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__04289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__14347 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__14350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Alternatives_1_in_rule__Page__Group__1__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__24407 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__24410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__PseudoPageAssignment_2_in_rule__Page__Group__2__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__34468 = new BitSet(new long[]{0x0000001600000810L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__34471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Page__Group__3__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__44530 = new BitSet(new long[]{0x0000001600000810L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__44533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_4_in_rule__Page__Group__4__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__54591 = new BitSet(new long[]{0x0000001600000810L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__54594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl4621 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__64652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Page__Group__6__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__04725 = new BitSet(new long[]{0x0000000200000810L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__04728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Page__Group_5__0__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__14787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_5_1_in_rule__Page__Group_5__1__Impl4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__0__Impl_in_rule__Pseudo_page__Group__04849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__1_in_rule__Pseudo_page__Group__04852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Pseudo_page__Group__0__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__1__Impl_in_rule__Pseudo_page__Group__14911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pseudo_page__Group__1__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__04971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media__Group__1_in_rule__Media__Group__04974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Alternatives_0_in_rule__Media__Group__0__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__15031 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Media__Group__2_in_rule__Media__Group__15034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__25091 = new BitSet(new long[]{0x0000037020001010L});
    public static final BitSet FOLLOW_rule__Media__Group__3_in_rule__Media__Group__25094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Media__Group__2__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__35153 = new BitSet(new long[]{0x0000037020001010L});
    public static final BitSet FOLLOW_rule__Media__Group__4_in_rule__Media__Group__35156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl5183 = new BitSet(new long[]{0x0000036020001012L});
    public static final BitSet FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__45214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Media__Group__4__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__05283 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__05286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__15342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl5369 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__05404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__05407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__15463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__05523 = new BitSet(new long[]{0x0000000800000900L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__05526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__15583 = new BitSet(new long[]{0x0000000800000900L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__15586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl5613 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__25644 = new BitSet(new long[]{0x0000000800000900L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__25647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Ruleset__Group__2__Impl5675 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__35706 = new BitSet(new long[]{0x0000001200000810L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__35709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Ruleset__Group__3__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__45768 = new BitSet(new long[]{0x0000001200000810L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__5_in_rule__Ruleset__Group__45771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_4__0_in_rule__Ruleset__Group__4__Impl5798 = new BitSet(new long[]{0x0000000200000812L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__5__Impl_in_rule__Ruleset__Group__55829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Ruleset__Group__5__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__05900 = new BitSet(new long[]{0x0000036020001010L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__05903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_4__0__Impl_in_rule__Ruleset__Group_4__06020 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_4__1_in_rule__Ruleset__Group_4__06023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__DeclarationsAssignment_4_0_in_rule__Ruleset__Group_4__0__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_4__1__Impl_in_rule__Ruleset__Group_4__16080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Ruleset__Group_4__1__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__06143 = new BitSet(new long[]{0x00000001C0000800L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__06146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__16203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__06265 = new BitSet(new long[]{0x0000036020001010L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__06268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__16325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__06386 = new BitSet(new long[]{0x00000361E0001010L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__06389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl6419 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl6432 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__16465 = new BitSet(new long[]{0x00000361E0001010L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__2_in_rule__Selector__Group_1_1__16468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_in_rule__Selector__Group_1_1__1__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__2__Impl_in_rule__Selector__Group_1_1__26526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_1_2_in_rule__Selector__Group_1_1__2__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__06589 = new BitSet(new long[]{0x0000016000001010L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__06592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_0_0_in_rule__Simple_selector__Group_0__0__Impl6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__16649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl6676 = new BitSet(new long[]{0x0000016000001012L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__0__Impl_in_rule__AttributeSelector__Group__06711 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__1_in_rule__AttributeSelector__Group__06714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__1__Impl_in_rule__AttributeSelector__Group__16772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__2_in_rule__AttributeSelector__Group__16775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AttributeSelector__Group__1__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__2__Impl_in_rule__AttributeSelector__Group__26834 = new BitSet(new long[]{0x000000801E000060L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__3_in_rule__AttributeSelector__Group__26837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__NameAssignment_2_in_rule__AttributeSelector__Group__2__Impl6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__3__Impl_in_rule__AttributeSelector__Group__36894 = new BitSet(new long[]{0x000000801E000060L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__4_in_rule__AttributeSelector__Group__36897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group_3__0_in_rule__AttributeSelector__Group__3__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group__4__Impl_in_rule__AttributeSelector__Group__46955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__AttributeSelector__Group__4__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group_3__0__Impl_in_rule__AttributeSelector__Group_3__07024 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group_3__1_in_rule__AttributeSelector__Group_3__07027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__OpAssignment_3_0_in_rule__AttributeSelector__Group_3__0__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__Group_3__1__Impl_in_rule__AttributeSelector__Group_3__17084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__ValueAssignment_3_1_in_rule__AttributeSelector__Group_3__1__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSelector__Group__0__Impl_in_rule__ClassSelector__Group__07145 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ClassSelector__Group__1_in_rule__ClassSelector__Group__07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSelector__Group__1__Impl_in_rule__ClassSelector__Group__17206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassSelector__Group__2_in_rule__ClassSelector__Group__17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ClassSelector__Group__1__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSelector__Group__2__Impl_in_rule__ClassSelector__Group__27268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSelector__NameAssignment_2_in_rule__ClassSelector__Group__2__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementSelector__Group__0__Impl_in_rule__ElementSelector__Group__07331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementSelector__Group__1_in_rule__ElementSelector__Group__07334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementSelector__Group__1__Impl_in_rule__ElementSelector__Group__17392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementSelector__NameAssignment_1_in_rule__ElementSelector__Group__1__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniversalSelector__Group__0__Impl_in_rule__UniversalSelector__Group__07453 = new BitSet(new long[]{0x0000020020000010L});
    public static final BitSet FOLLOW_rule__UniversalSelector__Group__1_in_rule__UniversalSelector__Group__07456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniversalSelector__Group__1__Impl_in_rule__UniversalSelector__Group__17514 = new BitSet(new long[]{0x0000020020000010L});
    public static final BitSet FOLLOW_rule__UniversalSelector__Group__2_in_rule__UniversalSelector__Group__17517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniversalSelector__NamespeceAssignment_1_in_rule__UniversalSelector__Group__1__Impl7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniversalSelector__Group__2__Impl_in_rule__UniversalSelector__Group__27575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UniversalSelector__Group__2__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdSelector__Group__0__Impl_in_rule__IdSelector__Group__07640 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__IdSelector__Group__1_in_rule__IdSelector__Group__07643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdSelector__Group__1__Impl_in_rule__IdSelector__Group__17701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IdSelector__Group__2_in_rule__IdSelector__Group__17704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_rule__IdSelector__Group__1__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdSelector__Group__2__Impl_in_rule__IdSelector__Group__27760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdSelector__NameAssignment_2_in_rule__IdSelector__Group__2__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__0__Impl_in_rule__Css_namespace_prefix__Group__07823 = new BitSet(new long[]{0x0000020020000010L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__1_in_rule__Css_namespace_prefix__Group__07826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Alternatives_0_in_rule__Css_namespace_prefix__Group__0__Impl7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_namespace_prefix__Group__1__Impl_in_rule__Css_namespace_prefix__Group__17884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Css_namespace_prefix__Group__1__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__0__Impl_in_rule__Css_declaration__Group__07947 = new BitSet(new long[]{0x0000000200000810L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__1_in_rule__Css_declaration__Group__07950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Css_declaration__Group__0__Impl7978 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__1__Impl_in_rule__Css_declaration__Group__18009 = new BitSet(new long[]{0x0000002000000800L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__2_in_rule__Css_declaration__Group__18012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__PropertyAssignment_1_in_rule__Css_declaration__Group__1__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__2__Impl_in_rule__Css_declaration__Group__28069 = new BitSet(new long[]{0x0000002000000800L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__3_in_rule__Css_declaration__Group__28072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Css_declaration__Group__2__Impl8100 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__3__Impl_in_rule__Css_declaration__Group__38131 = new BitSet(new long[]{0x0000100200185B90L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__4_in_rule__Css_declaration__Group__38134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Css_declaration__Group__3__Impl8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__4__Impl_in_rule__Css_declaration__Group__48193 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__5_in_rule__Css_declaration__Group__48196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__ValueTokensAssignment_4_in_rule__Css_declaration__Group__4__Impl8225 = new BitSet(new long[]{0x0000100200185B92L});
    public static final BitSet FOLLOW_rule__Css_declaration__ValueTokensAssignment_4_in_rule__Css_declaration__Group__4__Impl8237 = new BitSet(new long[]{0x0000100200185B92L});
    public static final BitSet FOLLOW_rule__Css_declaration__Group__5__Impl_in_rule__Css_declaration__Group__58270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_declaration__ImportantAssignment_5_in_rule__Css_declaration__Group__5__Impl8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__08340 = new BitSet(new long[]{0x0000000200000810L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__08343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__18401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__NameAssignment_1_in_rule__Css_property__Group__1__Impl8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidPropertyIdent__Group__0__Impl_in_rule__ValidPropertyIdent__Group__08462 = new BitSet(new long[]{0x0000000200000810L});
    public static final BitSet FOLLOW_rule__ValidPropertyIdent__Group__1_in_rule__ValidPropertyIdent__Group__08465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValidPropertyIdent__Group__0__Impl8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidPropertyIdent__Group__1__Impl_in_rule__ValidPropertyIdent__Group__18527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ValidPropertyIdent__Group__1__Impl8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClass__Group_0__0__Impl_in_rule__PseudoClass__Group_0__08588 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__PseudoClass__Group_0__1_in_rule__PseudoClass__Group_0__08591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PseudoClass__Group_0__0__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClass__Group_0__1__Impl_in_rule__PseudoClass__Group_0__18650 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__PseudoClass__Group_0__2_in_rule__PseudoClass__Group_0__18653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PseudoClass__Group_0__1__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClass__Group_0__2__Impl_in_rule__PseudoClass__Group_0__28715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_rule__PseudoClass__Group_0__2__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__0__Impl_in_rule__PseudoClassFunction__Group__08777 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__1_in_rule__PseudoClassFunction__Group__08780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__NameAssignment_0_in_rule__PseudoClassFunction__Group__0__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__1__Impl_in_rule__PseudoClassFunction__Group__18837 = new BitSet(new long[]{0x0000180200185B90L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__2_in_rule__PseudoClassFunction__Group__18840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PseudoClassFunction__Group__1__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__2__Impl_in_rule__PseudoClassFunction__Group__28899 = new BitSet(new long[]{0x0000180200185B90L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__3_in_rule__PseudoClassFunction__Group__28902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__ParamsAssignment_2_in_rule__PseudoClassFunction__Group__2__Impl8929 = new BitSet(new long[]{0x0000100200185B92L});
    public static final BitSet FOLLOW_rule__PseudoClassFunction__Group__3__Impl_in_rule__PseudoClassFunction__Group__38960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PseudoClassFunction__Group__3__Impl8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__09027 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__09030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__19087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl9115 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__SymbolTok__Group__0__Impl_in_rule__SymbolTok__Group__09150 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__SymbolTok__Group__1_in_rule__SymbolTok__Group__09153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolTok__Group__1__Impl_in_rule__SymbolTok__Group__19211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolTok__SymbolAssignment_1_in_rule__SymbolTok__Group__1__Impl9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WSTok__Group__0__Impl_in_rule__WSTok__Group__09272 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__WSTok__Group__1_in_rule__WSTok__Group__09275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WSTok__Group__1__Impl_in_rule__WSTok__Group__19333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__WSTok__Group__1__Impl9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringTok__Group__0__Impl_in_rule__StringTok__Group__09393 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__StringTok__Group__1_in_rule__StringTok__Group__09396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringTok__Group__1__Impl_in_rule__StringTok__Group__19454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringTok__ValueAssignment_1_in_rule__StringTok__Group__1__Impl9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuncTok__Group__0__Impl_in_rule__FuncTok__Group__09515 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__FuncTok__Group__1_in_rule__FuncTok__Group__09518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuncTok__Group__1__Impl_in_rule__FuncTok__Group__19576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuncTok__FuncAssignment_1_in_rule__FuncTok__Group__1__Impl9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__Group__0__Impl_in_rule__NumberTok__Group__09637 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NumberTok__Group__1_in_rule__NumberTok__Group__09640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__Group__1__Impl_in_rule__NumberTok__Group__19698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NumberTok__Group__2_in_rule__NumberTok__Group__19701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__NumAssignment_1_in_rule__NumberTok__Group__1__Impl9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__Group__2__Impl_in_rule__NumberTok__Group__29758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__UnitAssignment_2_in_rule__NumberTok__Group__2__Impl9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdentifierTok__Group__0__Impl_in_rule__IdentifierTok__Group__09822 = new BitSet(new long[]{0x0000000200000810L});
    public static final BitSet FOLLOW_rule__IdentifierTok__Group__1_in_rule__IdentifierTok__Group__09825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdentifierTok__Group__1__Impl_in_rule__IdentifierTok__Group__19883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdentifierTok__IdAssignment_1_in_rule__IdentifierTok__Group__1__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlTok__Group__0__Impl_in_rule__UrlTok__Group__09944 = new BitSet(new long[]{0x0000100000180000L});
    public static final BitSet FOLLOW_rule__UrlTok__Group__1_in_rule__UrlTok__Group__09947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlTok__Group__1__Impl_in_rule__UrlTok__Group__110005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlTok__UrlAssignment_1_in_rule__UrlTok__Group__1__Impl10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorTok__Group__0__Impl_in_rule__ColorTok__Group__010066 = new BitSet(new long[]{0x0000100200185B90L});
    public static final BitSet FOLLOW_rule__ColorTok__Group__1_in_rule__ColorTok__Group__010069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorTok__Group__1__Impl_in_rule__ColorTok__Group__110127 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__ColorTok__Group__2_in_rule__ColorTok__Group__110130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_rule__ColorTok__Group__1__Impl10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorTok__Group__2__Impl_in_rule__ColorTok__Group__210186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorTok__ColorAssignment_2_in_rule__ColorTok__Group__2__Impl10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__010251 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__010254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function__Group__0__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__110316 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__110319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__210376 = new BitSet(new long[]{0x0000100200185B90L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__210379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Function__Group__2__Impl10407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__310438 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__310441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ParamsAssignment_3_in_rule__Function__Group__3__Impl10470 = new BitSet(new long[]{0x0000100200185B92L});
    public static final BitSet FOLLOW_rule__Function__ParamsAssignment_3_in_rule__Function__Group__3__Impl10482 = new BitSet(new long[]{0x0000100200185B92L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__410515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Function__Group__4__Impl10543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__010584 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__010587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__URLType__Group__0__Impl10615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__110646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__110649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URLType__Group__1__Impl10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__210708 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__210711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl10738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__310768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__URLType__Group__3__Impl10796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rule__Stylesheet__CharsetAssignment_010840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rule__Stylesheet__ImportsAssignment_110871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_2_010902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_2_110933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_rule__Stylesheet__PageAssignment_2_210964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__CharsetAssignment_110995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportExpression__ValueAssignment_0_111026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__ImportExpression__MediaListAssignment_1_111057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rule__Page__PseudoPageAssignment_211088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rule__Page__DeclarationsAssignment_411119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rule__Page__DeclarationsAssignment_5_111150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_111181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_311212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_011243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_111274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_4_011305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_011367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_111398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_111429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_211460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_rule__Simple_selector__ElementAssignment_0_0_011491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_rule__Simple_selector__UniversalAssignment_0_0_111522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rule__Simple_selector__SubSelectorsAssignment_0_111553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rule__Simple_selector__SubSelectorsAssignment_111584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttributeSelector__NameAssignment_211615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__OpAlternatives_3_0_0_in_rule__AttributeSelector__OpAssignment_3_011646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSelector__ValueAlternatives_3_1_0_in_rule__AttributeSelector__ValueAssignment_3_111679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ClassSelector__NameAssignment_211712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ElementSelector__NameAssignment_111743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_rule__UniversalSelector__NamespeceAssignment_111774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__IdSelector__NameAssignment_211805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Css_declaration__PropertyAssignment_111836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_rule__Css_declaration__ValueTokensAssignment_411867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORTANT_SYM_in_rule__Css_declaration__ImportantAssignment_511898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rule__Css_property__NameAssignment_111929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__PseudoClassName__NameAssignment11960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__PseudoClassFunction__NameAssignment_011991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_rule__PseudoClassFunction__ParamsAssignment_212022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolTok__SymbolAlternatives_1_0_in_rule__SymbolTok__SymbolAssignment_112053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringTok__ValueAssignment_112086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__FuncTok__FuncAssignment_112117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__NumberTok__NumAssignment_112148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__NumberTok__UnitAssignment_212179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rule__IdentifierTok__IdAssignment_112210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__UrlTok__UrlAssignment_112241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorTok__ColorAlternatives_2_0_in_rule__ColorTok__ColorAssignment_212272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_112305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_rule__Function__ParamsAssignment_312336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_212367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTok__UnitAssignment_2_in_synpred63_InternalCssDsl9785 = new BitSet(new long[]{0x0000000000000002L});

}