package at.bestsolution.efxclipse.tooling.css.cssext.ui.contentassist.antlr.internal; 

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
import at.bestsolution.efxclipse.tooling.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'*'", "'+'", "'?'", "','", "'%'", "'import'", "'.'", "'package'", "'{'", "'}'", "'('", "'->'", "')'", "'extends'", "';'", "'default:'", "'<'", "'>'", "'='", "'|'", "'||'", "'['", "']'", "'int'", "'double'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_REGEX=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=7;
    public static final int RULE_JDOC=6;
    public static final int RULE_WS=5;
    public static final int RULE_PSEUDO=9;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g"; }


     
     	private CssExtDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CssExtDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:61:1: entryRuleCssExtension : ruleCssExtension EOF ;
    public final void entryRuleCssExtension() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:62:1: ( ruleCssExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:63:1: ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleCssExtension_in_entryRuleCssExtension67);
            ruleCssExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssExtension74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:70:1: ruleCssExtension : ( ( rule__CssExtension__Group__0 ) ) ;
    public final void ruleCssExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:74:2: ( ( ( rule__CssExtension__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:75:1: ( ( rule__CssExtension__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:75:1: ( ( rule__CssExtension__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:76:1: ( rule__CssExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:77:1: ( rule__CssExtension__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:77:2: rule__CssExtension__Group__0
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0_in_ruleCssExtension100);
            rule__CssExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getGroup()); 
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
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:90:1: ( ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:105:1: ( rule__Import__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:117:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:118:1: ( ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:119:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID187);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:126:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:130:2: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:131:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:131:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:132:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:146:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName246);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName253); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName279);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:173:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:174:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:175:1: ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard306);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard313); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:182:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:186:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:187:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:187:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:188:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:189:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:189:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard339);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:201:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:202:1: ( rulePackageDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:203:1: rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition366);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDefinition373); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:210:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:214:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:215:1: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:215:1: ( ( rule__PackageDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:216:1: ( rule__PackageDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:217:1: ( rule__PackageDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:217:2: rule__PackageDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__0_in_rulePackageDefinition399);
            rule__PackageDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup()); 
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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:229:1: entryRuleDoku : ruleDoku EOF ;
    public final void entryRuleDoku() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:230:1: ( ruleDoku EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:231:1: ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_entryRuleDoku426);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoku433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:238:1: ruleDoku : ( ( rule__Doku__ContentAssignment ) ) ;
    public final void ruleDoku() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:242:2: ( ( ( rule__Doku__ContentAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:243:1: ( ( rule__Doku__ContentAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:243:1: ( ( rule__Doku__ContentAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:244:1: ( rule__Doku__ContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:245:1: ( rule__Doku__ContentAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:245:2: rule__Doku__ContentAssignment
            {
            pushFollow(FOLLOW_rule__Doku__ContentAssignment_in_ruleDoku459);
            rule__Doku__ContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentAssignment()); 
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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:257:1: entryRuleCSSBaseType : ruleCSSBaseType EOF ;
    public final void entryRuleCSSBaseType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:261:1: ( ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:262:1: ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType491);
            ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType498); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:272:1: ruleCSSBaseType : ( ruleCSSType ) ;
    public final void ruleCSSBaseType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:277:2: ( ( ruleCSSType ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:278:1: ( ruleCSSType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:278:1: ( ruleCSSType )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:279:1: ruleCSSType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_ruleCSSBaseType528);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
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
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:293:1: entryRuleCSSType : ruleCSSType EOF ;
    public final void entryRuleCSSType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:297:1: ( ruleCSSType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:298:1: ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_entryRuleCSSType559);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSType566); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:308:1: ruleCSSType : ( ( rule__CSSType__Alternatives ) ) ;
    public final void ruleCSSType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:313:2: ( ( ( rule__CSSType__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:314:1: ( ( rule__CSSType__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:314:1: ( ( rule__CSSType__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:315:1: ( rule__CSSType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:316:1: ( rule__CSSType__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:316:2: rule__CSSType__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSType__Alternatives_in_ruleCSSType596);
            rule__CSSType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:329:1: entryRuleElementDefinition : ruleElementDefinition EOF ;
    public final void entryRuleElementDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:330:1: ( ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:331:1: ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition623);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition630); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:338:1: ruleElementDefinition : ( ( rule__ElementDefinition__Group__0 ) ) ;
    public final void ruleElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:342:2: ( ( ( rule__ElementDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: ( ( rule__ElementDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: ( ( rule__ElementDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:344:1: ( rule__ElementDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:345:1: ( rule__ElementDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:345:2: rule__ElementDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__0_in_ruleElementDefinition656);
            rule__ElementDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:357:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:358:1: ( rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:359:1: rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition683);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition690); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:366:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:370:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:371:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:371:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:372:1: ( rule__PropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:373:1: ( rule__PropertyDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:373:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition716);
            rule__PropertyDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:385:1: entryRulePseudoClassDefinition : rulePseudoClassDefinition EOF ;
    public final void entryRulePseudoClassDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:386:1: ( rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:387:1: rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition743);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition750); if (state.failed) return ;

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
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:394:1: rulePseudoClassDefinition : ( ( rule__PseudoClassDefinition__Group__0 ) ) ;
    public final void rulePseudoClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:398:2: ( ( ( rule__PseudoClassDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:399:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:399:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:400:1: ( rule__PseudoClassDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:401:1: ( rule__PseudoClassDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:401:2: rule__PseudoClassDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0_in_rulePseudoClassDefinition776);
            rule__PseudoClassDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:413:1: entryRuleCSSRuleId : ruleCSSRuleId EOF ;
    public final void entryRuleCSSRuleId() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:414:1: ( ruleCSSRuleId EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:415:1: ruleCSSRuleId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId803);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleId810); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleId"


    // $ANTLR start "ruleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:422:1: ruleCSSRuleId : ( ( rule__CSSRuleId__NameAssignment ) ) ;
    public final void ruleCSSRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:426:2: ( ( ( rule__CSSRuleId__NameAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:427:1: ( ( rule__CSSRuleId__NameAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:427:1: ( ( rule__CSSRuleId__NameAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:428:1: ( rule__CSSRuleId__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:429:1: ( rule__CSSRuleId__NameAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:429:2: rule__CSSRuleId__NameAssignment
            {
            pushFollow(FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId836);
            rule__CSSRuleId__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleCSSRuleId"


    // $ANTLR start "entryRuleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:441:1: entryRuleCSSRuleRef : ruleCSSRuleRef EOF ;
    public final void entryRuleCSSRuleRef() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:445:1: ( ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:446:1: ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef868);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef875); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:456:1: ruleCSSRuleRef : ( ( rule__CSSRuleRef__Group__0 ) ) ;
    public final void ruleCSSRuleRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:461:2: ( ( ( rule__CSSRuleRef__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:462:1: ( ( rule__CSSRuleRef__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:462:1: ( ( rule__CSSRuleRef__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:463:1: ( rule__CSSRuleRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:464:1: ( rule__CSSRuleRef__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:464:2: rule__CSSRuleRef__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef905);
            rule__CSSRuleRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:477:1: entryRuleCSSRuleDefinition : ruleCSSRuleDefinition EOF ;
    public final void entryRuleCSSRuleDefinition() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:481:1: ( ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:482:1: ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition937);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition944); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:492:1: ruleCSSRuleDefinition : ( ( rule__CSSRuleDefinition__Group__0 ) ) ;
    public final void ruleCSSRuleDefinition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:497:2: ( ( ( rule__CSSRuleDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:498:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:498:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:499:1: ( rule__CSSRuleDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:500:1: ( rule__CSSRuleDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:500:2: rule__CSSRuleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0_in_ruleCSSRuleDefinition974);
            rule__CSSRuleDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:513:1: entryRuleCSSRuleFunc : ruleCSSRuleFunc EOF ;
    public final void entryRuleCSSRuleFunc() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:517:1: ( ruleCSSRuleFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:518:1: ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc1006);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleFunc1013); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:528:1: ruleCSSRuleFunc : ( ( rule__CSSRuleFunc__Group__0 ) ) ;
    public final void ruleCSSRuleFunc() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:533:2: ( ( ( rule__CSSRuleFunc__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:534:1: ( ( rule__CSSRuleFunc__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:534:1: ( ( rule__CSSRuleFunc__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:535:1: ( rule__CSSRuleFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:536:1: ( rule__CSSRuleFunc__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:536:2: rule__CSSRuleFunc__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__0_in_ruleCSSRuleFunc1043);
            rule__CSSRuleFunc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:549:1: entryRuleCSSRuleOr : ruleCSSRuleOr EOF ;
    public final void entryRuleCSSRuleOr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:553:1: ( ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:554:1: ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1075);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr1082); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:564:1: ruleCSSRuleOr : ( ( rule__CSSRuleOr__Group__0 ) ) ;
    public final void ruleCSSRuleOr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:569:2: ( ( ( rule__CSSRuleOr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:570:1: ( ( rule__CSSRuleOr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:570:1: ( ( rule__CSSRuleOr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:571:1: ( rule__CSSRuleOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:572:1: ( rule__CSSRuleOr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:572:2: rule__CSSRuleOr__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr1112);
            rule__CSSRuleOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:585:1: entryRuleCSSRuleXor : ruleCSSRuleXor EOF ;
    public final void entryRuleCSSRuleXor() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:589:1: ( ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:590:1: ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor1144);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor1151); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:600:1: ruleCSSRuleXor : ( ( rule__CSSRuleXor__Group__0 ) ) ;
    public final void ruleCSSRuleXor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:605:2: ( ( ( rule__CSSRuleXor__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:606:1: ( ( rule__CSSRuleXor__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:606:1: ( ( rule__CSSRuleXor__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:607:1: ( rule__CSSRuleXor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:1: ( rule__CSSRuleXor__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:2: rule__CSSRuleXor__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor1181);
            rule__CSSRuleXor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:621:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:625:1: ( ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:626:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1213);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat1220); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:636:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:641:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:642:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:642:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:643:1: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:644:1: ( rule__CSSRuleConcat__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:644:2: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1250);
            rule__CSSRuleConcat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:657:1: entryRuleCSSRulePostfix : ruleCSSRulePostfix EOF ;
    public final void entryRuleCSSRulePostfix() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:661:1: ( ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:662:1: ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1282);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix1289); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:672:1: ruleCSSRulePostfix : ( ( rule__CSSRulePostfix__Group__0 ) ) ;
    public final void ruleCSSRulePostfix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:677:2: ( ( ( rule__CSSRulePostfix__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:678:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:678:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:679:1: ( rule__CSSRulePostfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:680:1: ( rule__CSSRulePostfix__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:680:2: rule__CSSRulePostfix__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1319);
            rule__CSSRulePostfix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:693:1: entryRuleCSSRuleBracket : ruleCSSRuleBracket EOF ;
    public final void entryRuleCSSRuleBracket() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:697:1: ( ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:698:1: ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1351);
            ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket1358); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:708:1: ruleCSSRuleBracket : ( ( rule__CSSRuleBracket__Group__0 ) ) ;
    public final void ruleCSSRuleBracket() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:713:2: ( ( ( rule__CSSRuleBracket__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:714:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:714:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:715:1: ( rule__CSSRuleBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:1: ( rule__CSSRuleBracket__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:2: rule__CSSRuleBracket__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1388);
            rule__CSSRuleBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:729:1: entryRuleCSSRulePrimary : ruleCSSRulePrimary EOF ;
    public final void entryRuleCSSRulePrimary() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:733:1: ( ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:734:1: ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1420);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary1427); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:744:1: ruleCSSRulePrimary : ( ( rule__CSSRulePrimary__Alternatives ) ) ;
    public final void ruleCSSRulePrimary() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:749:2: ( ( ( rule__CSSRulePrimary__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:751:1: ( rule__CSSRulePrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:1: ( rule__CSSRulePrimary__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:2: rule__CSSRulePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1457);
            rule__CSSRulePrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:765:1: entryRuleCSSRuleRegex : ruleCSSRuleRegex EOF ;
    public final void entryRuleCSSRuleRegex() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:769:1: ( ruleCSSRuleRegex EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:770:1: ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex1489);
            ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRegex1496); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:780:1: ruleCSSRuleRegex : ( ( rule__CSSRuleRegex__Group__0 ) ) ;
    public final void ruleCSSRuleRegex() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:785:2: ( ( ( rule__CSSRuleRegex__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:786:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:786:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:787:1: ( rule__CSSRuleRegex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:788:1: ( rule__CSSRuleRegex__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:788:2: rule__CSSRuleRegex__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__0_in_ruleCSSRuleRegex1526);
            rule__CSSRuleRegex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:801:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:802:1: ( ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:803:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1553);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral1560); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:810:1: ruleCSSRuleLiteral : ( ( rule__CSSRuleLiteral__Group__0 ) ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:814:2: ( ( ( rule__CSSRuleLiteral__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:815:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:815:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:816:1: ( rule__CSSRuleLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:817:1: ( rule__CSSRuleLiteral__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:817:2: rule__CSSRuleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__0_in_ruleCSSRuleLiteral1586);
            rule__CSSRuleLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:829:1: entryRuleCSSRuleSymbol : ruleCSSRuleSymbol EOF ;
    public final void entryRuleCSSRuleSymbol() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:830:1: ( ruleCSSRuleSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:831:1: ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol1613);
            ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleSymbol1620); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:838:1: ruleCSSRuleSymbol : ( ( rule__CSSRuleSymbol__Group__0 ) ) ;
    public final void ruleCSSRuleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:842:2: ( ( ( rule__CSSRuleSymbol__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:843:1: ( ( rule__CSSRuleSymbol__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:843:1: ( ( rule__CSSRuleSymbol__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:844:1: ( rule__CSSRuleSymbol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:845:1: ( rule__CSSRuleSymbol__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:845:2: rule__CSSRuleSymbol__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__0_in_ruleCSSRuleSymbol1646);
            rule__CSSRuleSymbol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:857:1: entryRuleCSSDefaultValue : ruleCSSDefaultValue EOF ;
    public final void entryRuleCSSDefaultValue() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:858:1: ( ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:859:1: ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1673);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue1680); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:866:1: ruleCSSDefaultValue : ( ( rule__CSSDefaultValue__Alternatives ) ) ;
    public final void ruleCSSDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:870:2: ( ( ( rule__CSSDefaultValue__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:871:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:871:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:872:1: ( rule__CSSDefaultValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:873:1: ( rule__CSSDefaultValue__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:873:2: rule__CSSDefaultValue__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1706);
            rule__CSSDefaultValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "rule__PackageDefinition__Alternatives_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:885:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );
    public final void rule__PackageDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:889:1: ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:890:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:890:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:891:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:2: rule__PackageDefinition__RulesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31742);
                    rule__PackageDefinition__RulesAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:896:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:896:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:897:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:898:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:898:2: rule__PackageDefinition__SubpackagesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31760);
                    rule__PackageDefinition__SubpackagesAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:902:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:902:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:903:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:2: rule__PackageDefinition__ElementsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31778);
                    rule__PackageDefinition__ElementsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3_2()); 
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
    // $ANTLR end "rule__PackageDefinition__Alternatives_3"


    // $ANTLR start "rule__CSSType__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:913:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) | ( ( rule__CSSType__Group_3__0 ) ) );
    public final void rule__CSSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:917:1: ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) | ( ( rule__CSSType__Group_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_WS)||LA2_1==RULE_INT||LA2_1==RULE_REGEX||(LA2_1>=15 && LA2_1<=19)||LA2_1==27||(LA2_1>=29 && LA2_1<=31)||(LA2_1>=34 && LA2_1<=39)) ) {
                    alt2=3;
                }
                else if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==39) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==25) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_WS)||LA2_2==RULE_INT||LA2_2==RULE_REGEX||(LA2_2>=15 && LA2_2<=19)||LA2_2==27||(LA2_2>=29 && LA2_2<=31)||(LA2_2>=34 && LA2_2<=39)) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:918:1: ( ( rule__CSSType__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:918:1: ( ( rule__CSSType__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:919:1: ( rule__CSSType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:1: ( rule__CSSType__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:2: rule__CSSType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_0__0_in_rule__CSSType__Alternatives1811);
                    rule__CSSType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:924:6: ( ( rule__CSSType__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:924:6: ( ( rule__CSSType__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:925:1: ( rule__CSSType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:926:1: ( rule__CSSType__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:926:2: rule__CSSType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_1__0_in_rule__CSSType__Alternatives1829);
                    rule__CSSType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:930:6: ( ( rule__CSSType__Group_2__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:930:6: ( ( rule__CSSType__Group_2__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:931:1: ( rule__CSSType__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:932:1: ( rule__CSSType__Group_2__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:932:2: rule__CSSType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_2__0_in_rule__CSSType__Alternatives1847);
                    rule__CSSType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:936:6: ( ( rule__CSSType__Group_3__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:936:6: ( ( rule__CSSType__Group_3__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:937:1: ( rule__CSSType__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_3()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:938:1: ( rule__CSSType__Group_3__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:938:2: rule__CSSType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_3__0_in_rule__CSSType__Alternatives1865);
                    rule__CSSType__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_3()); 
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
    // $ANTLR end "rule__CSSType__Alternatives"


    // $ANTLR start "rule__ElementDefinition__Alternatives_5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:947:1: rule__ElementDefinition__Alternatives_5 : ( ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) ) );
    public final void rule__ElementDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:951:1: ( ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_JDOC:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_PSEUDO) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_PSEUDO:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:952:1: ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:952:1: ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:953:1: ( rule__ElementDefinition__PropertiesAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_5_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:954:1: ( rule__ElementDefinition__PropertiesAssignment_5_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:954:2: rule__ElementDefinition__PropertiesAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__PropertiesAssignment_5_0_in_rule__ElementDefinition__Alternatives_51898);
                    rule__ElementDefinition__PropertiesAssignment_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:958:6: ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:958:6: ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:959:1: ( rule__ElementDefinition__PseudoClassesAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_5_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:960:1: ( rule__ElementDefinition__PseudoClassesAssignment_5_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:960:2: rule__ElementDefinition__PseudoClassesAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__PseudoClassesAssignment_5_1_in_rule__ElementDefinition__Alternatives_51916);
                    rule__ElementDefinition__PseudoClassesAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_5_1()); 
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
    // $ANTLR end "rule__ElementDefinition__Alternatives_5"


    // $ANTLR start "rule__CSSRuleDefinition__Alternatives_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:969:1: rule__CSSRuleDefinition__Alternatives_3 : ( ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) ) );
    public final void rule__CSSRuleDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:973:1: ( ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==RULE_REGEX||(LA4_0>=18 && LA4_0<=19)||LA4_0==31||LA4_0==36||(LA4_0>=38 && LA4_0<=39)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==25) ) {
                    alt4=2;
                }
                else if ( (LA4_2==RULE_ID||LA4_2==RULE_INT||LA4_2==RULE_REGEX||(LA4_2>=15 && LA4_2<=19)||LA4_2==29||LA4_2==31||(LA4_2>=34 && LA4_2<=36)||(LA4_2>=38 && LA4_2<=39)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:974:1: ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:974:1: ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:975:1: ( rule__CSSRuleDefinition__RuleAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:976:1: ( rule__CSSRuleDefinition__RuleAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:976:2: rule__CSSRuleDefinition__RuleAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__RuleAssignment_3_0_in_rule__CSSRuleDefinition__Alternatives_31949);
                    rule__CSSRuleDefinition__RuleAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:980:6: ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:980:6: ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:981:1: ( rule__CSSRuleDefinition__FuncAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:1: ( rule__CSSRuleDefinition__FuncAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:2: rule__CSSRuleDefinition__FuncAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__FuncAssignment_3_1_in_rule__CSSRuleDefinition__Alternatives_31967);
                    rule__CSSRuleDefinition__FuncAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_3_1()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Alternatives_3"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:991:1: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfix__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:995:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:1: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:1: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:997:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02001); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1004:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1004:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1005:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02021); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1012:6: ( '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1012:6: ( '?' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1013:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02041); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
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
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"


    // $ANTLR start "rule__CSSRulePrimary__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1025:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) );
    public final void rule__CSSRulePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1029:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 18:
            case 19:
                {
                alt6=4;
                }
                break;
            case 38:
            case 39:
                {
                alt6=5;
                }
                break;
            case RULE_REGEX:
                {
                alt6=6;
                }
                break;
            case RULE_INT:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( ruleCSSRuleRef )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( ruleCSSRuleRef )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1031:1: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives2075);
                    ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1036:6: ( ruleCSSRuleBracket )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1036:6: ( ruleCSSRuleBracket )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1037:1: ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives2092);
                    ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:6: ( ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:6: ( ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1043:1: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimary__Alternatives2109);
                    ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1048:6: ( ruleCSSRuleSymbol )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1048:6: ( ruleCSSRuleSymbol )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1049:1: ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleSymbol_in_rule__CSSRulePrimary__Alternatives2126);
                    ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1054:6: ( ruleCSSBaseType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1054:6: ( ruleCSSBaseType )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1055:1: ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives2143);
                    ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1060:6: ( ruleCSSRuleRegex )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1060:6: ( ruleCSSRuleRegex )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1061:1: ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRegex_in_rule__CSSRulePrimary__Alternatives2160);
                    ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1066:6: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1066:6: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1067:1: ( rule__CSSRulePrimary__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1068:1: ( rule__CSSRulePrimary__Group_6__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1068:2: rule__CSSRulePrimary__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__0_in_rule__CSSRulePrimary__Alternatives2177);
                    rule__CSSRulePrimary__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
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
    // $ANTLR end "rule__CSSRulePrimary__Alternatives"


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAlternatives_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1077:1: rule__CSSRuleSymbol__SymbolAlternatives_1_0 : ( ( ',' ) | ( '%' ) );
    public final void rule__CSSRuleSymbol__SymbolAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1081:1: ( ( ',' ) | ( '%' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1082:1: ( ',' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1082:1: ( ',' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1083:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__CSSRuleSymbol__SymbolAlternatives_1_02211); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:6: ( '%' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:6: ( '%' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1091:1: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_1_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__CSSRuleSymbol__SymbolAlternatives_1_02231); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_1_0_1()); 
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
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAlternatives_1_0"


    // $ANTLR start "rule__CSSDefaultValue__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1103:1: rule__CSSDefaultValue__Alternatives : ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) );
    public final void rule__CSSDefaultValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1107:1: ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1108:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1108:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1109:1: ( rule__CSSDefaultValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1110:1: ( rule__CSSDefaultValue__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1110:2: rule__CSSDefaultValue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__0_in_rule__CSSDefaultValue__Alternatives2265);
                    rule__CSSDefaultValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1114:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1114:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1115:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1116:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1116:2: rule__CSSDefaultValue__IvalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__IvalAssignment_1_in_rule__CSSDefaultValue__Alternatives2283);
                    rule__CSSDefaultValue__IvalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1120:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1120:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1121:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1122:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1122:2: rule__CSSDefaultValue__DvalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__DvalAssignment_2_in_rule__CSSDefaultValue__Alternatives2301);
                    rule__CSSDefaultValue__DvalAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1126:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1126:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1127:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1128:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1128:2: rule__CSSDefaultValue__SvalAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__SvalAssignment_3_in_rule__CSSDefaultValue__Alternatives2319);
                    rule__CSSDefaultValue__SvalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Alternatives"


    // $ANTLR start "rule__CssExtension__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1139:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1143:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1144:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__02350);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__02353);
            rule__CssExtension__Group__1();

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
    // $ANTLR end "rule__CssExtension__Group__0"


    // $ANTLR start "rule__CssExtension__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1151:1: rule__CssExtension__Group__0__Impl : ( ( rule__CssExtension__ImportsAssignment_0 )* ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1155:1: ( ( ( rule__CssExtension__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1156:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1156:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1157:1: ( rule__CssExtension__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1158:1: ( rule__CssExtension__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1158:2: rule__CssExtension__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl2380);
            	    rule__CssExtension__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__CssExtension__Group__0__Impl"


    // $ANTLR start "rule__CssExtension__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1168:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1172:1: ( rule__CssExtension__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1173:2: rule__CssExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__12411);
            rule__CssExtension__Group__1__Impl();

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
    // $ANTLR end "rule__CssExtension__Group__1"


    // $ANTLR start "rule__CssExtension__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1179:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__PackageDefAssignment_1 )? ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1183:1: ( ( ( rule__CssExtension__PackageDefAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1184:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1184:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1185:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1186:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1186:2: rule__CssExtension__PackageDefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl2438);
                    rule__CssExtension__PackageDefAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
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
    // $ANTLR end "rule__CssExtension__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1200:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1204:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1205:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02473);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02476);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1212:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1216:1: ( ( 'import' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1217:1: ( 'import' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1217:1: ( 'import' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1218:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Import__Group__0__Impl2504); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1231:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1235:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1236:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12535);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1242:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1246:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1247:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1247:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1248:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1249:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1249:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2562);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1263:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1267:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1268:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02596);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02599);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1275:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1279:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1280:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1280:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1281:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2626);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1292:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1296:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1297:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12655);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1303:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1307:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1308:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1308:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1309:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1310:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1310:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2682);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1324:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1328:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1329:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02717);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02720);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1336:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1340:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1341:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1341:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1342:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1343:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1344:2: '.'
            {
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2749); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1355:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1359:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1360:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12781);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1366:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1370:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1371:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1371:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1372:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2808);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1387:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1391:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1392:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02841);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02844);
            rule__QualifiedNameWithWildCard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1399:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1403:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1404:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1404:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1405:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2871);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1416:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1420:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1421:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12900);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1427:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1431:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1432:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1432:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1433:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1434:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1434:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2927);
                    rule__QualifiedNameWithWildCard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1448:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1452:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1453:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02962);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02965);
            rule__QualifiedNameWithWildCard__Group_1__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1460:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1464:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1465:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1465:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1466:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2993); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1479:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1483:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1484:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__13024);
            rule__QualifiedNameWithWildCard__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1490:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1494:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1495:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1495:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1496:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl3052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1513:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1517:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1518:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__03087);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__03090);
            rule__PackageDefinition__Group__1();

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
    // $ANTLR end "rule__PackageDefinition__Group__0"


    // $ANTLR start "rule__PackageDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1525:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1529:1: ( ( 'package' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1530:1: ( 'package' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1530:1: ( 'package' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1531:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDefinition__Group__0__Impl3118); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1544:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1548:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1549:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__13149);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__13152);
            rule__PackageDefinition__Group__2();

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
    // $ANTLR end "rule__PackageDefinition__Group__1"


    // $ANTLR start "rule__PackageDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1556:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1560:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1561:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1561:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1562:1: ( rule__PackageDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1563:1: ( rule__PackageDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1563:2: rule__PackageDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl3179);
            rule__PackageDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1573:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1577:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1578:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__23209);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__23212);
            rule__PackageDefinition__Group__3();

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
    // $ANTLR end "rule__PackageDefinition__Group__2"


    // $ANTLR start "rule__PackageDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1585:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1589:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1590:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1590:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1591:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__PackageDefinition__Group__2__Impl3240); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1604:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1608:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1609:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__33271);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__33274);
            rule__PackageDefinition__Group__4();

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
    // $ANTLR end "rule__PackageDefinition__Group__3"


    // $ANTLR start "rule__PackageDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1616:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__Alternatives_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1620:1: ( ( ( rule__PackageDefinition__Alternatives_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1621:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1621:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1622:1: ( rule__PackageDefinition__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1623:1: ( rule__PackageDefinition__Alternatives_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==RULE_JDOC||LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1623:2: rule__PackageDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl3301);
            	    rule__PackageDefinition__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1633:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1637:1: ( rule__PackageDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1638:2: rule__PackageDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__43332);
            rule__PackageDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDefinition__Group__4"


    // $ANTLR start "rule__PackageDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1644:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1648:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1649:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1649:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1650:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__PackageDefinition__Group__4__Impl3360); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__4__Impl"


    // $ANTLR start "rule__CSSType__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1673:1: rule__CSSType__Group_0__0 : rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 ;
    public final void rule__CSSType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1677:1: ( rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1678:2: rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__0__Impl_in_rule__CSSType__Group_0__03401);
            rule__CSSType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__1_in_rule__CSSType__Group_0__03404);
            rule__CSSType__Group_0__1();

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
    // $ANTLR end "rule__CSSType__Group_0__0"


    // $ANTLR start "rule__CSSType__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1685:1: rule__CSSType__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1689:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1690:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1690:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1691:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1692:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1694:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1704:1: rule__CSSType__Group_0__1 : rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 ;
    public final void rule__CSSType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1708:1: ( rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1709:2: rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__1__Impl_in_rule__CSSType__Group_0__13462);
            rule__CSSType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__2_in_rule__CSSType__Group_0__13465);
            rule__CSSType__Group_0__2();

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
    // $ANTLR end "rule__CSSType__Group_0__1"


    // $ANTLR start "rule__CSSType__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1716:1: rule__CSSType__Group_0__1__Impl : ( ( rule__CSSType__TypeAssignment_0_1 ) ) ;
    public final void rule__CSSType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1720:1: ( ( ( rule__CSSType__TypeAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1721:1: ( ( rule__CSSType__TypeAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1721:1: ( ( rule__CSSType__TypeAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1722:1: ( rule__CSSType__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1723:1: ( rule__CSSType__TypeAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1723:2: rule__CSSType__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_0_1_in_rule__CSSType__Group_0__1__Impl3492);
            rule__CSSType__TypeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_1()); 
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
    // $ANTLR end "rule__CSSType__Group_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_0__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1733:1: rule__CSSType__Group_0__2 : rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 ;
    public final void rule__CSSType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1737:1: ( rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1738:2: rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__2__Impl_in_rule__CSSType__Group_0__23522);
            rule__CSSType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__3_in_rule__CSSType__Group_0__23525);
            rule__CSSType__Group_0__3();

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
    // $ANTLR end "rule__CSSType__Group_0__2"


    // $ANTLR start "rule__CSSType__Group_0__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1745:1: rule__CSSType__Group_0__2__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1749:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1750:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1750:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1751:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSType__Group_0__2__Impl3553); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__CSSType__Group_0__2__Impl"


    // $ANTLR start "rule__CSSType__Group_0__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1764:1: rule__CSSType__Group_0__3 : rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 ;
    public final void rule__CSSType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1768:1: ( rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1769:2: rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__3__Impl_in_rule__CSSType__Group_0__33584);
            rule__CSSType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__4_in_rule__CSSType__Group_0__33587);
            rule__CSSType__Group_0__4();

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
    // $ANTLR end "rule__CSSType__Group_0__3"


    // $ANTLR start "rule__CSSType__Group_0__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1776:1: rule__CSSType__Group_0__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1780:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1781:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1781:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1782:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1783:1: ( RULE_WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1783:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__3__Impl3615); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_3()); 
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
    // $ANTLR end "rule__CSSType__Group_0__3__Impl"


    // $ANTLR start "rule__CSSType__Group_0__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1793:1: rule__CSSType__Group_0__4 : rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 ;
    public final void rule__CSSType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1797:1: ( rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1798:2: rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__4__Impl_in_rule__CSSType__Group_0__43646);
            rule__CSSType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__5_in_rule__CSSType__Group_0__43649);
            rule__CSSType__Group_0__5();

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
    // $ANTLR end "rule__CSSType__Group_0__4"


    // $ANTLR start "rule__CSSType__Group_0__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1805:1: rule__CSSType__Group_0__4__Impl : ( ( rule__CSSType__FromAssignment_0_4 ) ) ;
    public final void rule__CSSType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1809:1: ( ( ( rule__CSSType__FromAssignment_0_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1810:1: ( ( rule__CSSType__FromAssignment_0_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1810:1: ( ( rule__CSSType__FromAssignment_0_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1811:1: ( rule__CSSType__FromAssignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_0_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1812:1: ( rule__CSSType__FromAssignment_0_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1812:2: rule__CSSType__FromAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CSSType__FromAssignment_0_4_in_rule__CSSType__Group_0__4__Impl3676);
            rule__CSSType__FromAssignment_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_0_4()); 
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
    // $ANTLR end "rule__CSSType__Group_0__4__Impl"


    // $ANTLR start "rule__CSSType__Group_0__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1822:1: rule__CSSType__Group_0__5 : rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 ;
    public final void rule__CSSType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1826:1: ( rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1827:2: rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__5__Impl_in_rule__CSSType__Group_0__53706);
            rule__CSSType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__6_in_rule__CSSType__Group_0__53709);
            rule__CSSType__Group_0__6();

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
    // $ANTLR end "rule__CSSType__Group_0__5"


    // $ANTLR start "rule__CSSType__Group_0__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1834:1: rule__CSSType__Group_0__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1838:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1839:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1839:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1840:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1841:1: ( RULE_WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1841:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__5__Impl3737); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_5()); 
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
    // $ANTLR end "rule__CSSType__Group_0__5__Impl"


    // $ANTLR start "rule__CSSType__Group_0__6"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1851:1: rule__CSSType__Group_0__6 : rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 ;
    public final void rule__CSSType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1855:1: ( rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1856:2: rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__6__Impl_in_rule__CSSType__Group_0__63768);
            rule__CSSType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__7_in_rule__CSSType__Group_0__63771);
            rule__CSSType__Group_0__7();

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
    // $ANTLR end "rule__CSSType__Group_0__6"


    // $ANTLR start "rule__CSSType__Group_0__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1863:1: rule__CSSType__Group_0__6__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1867:1: ( ( '->' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1868:1: ( '->' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1868:1: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1869:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_6()); 
            }
            match(input,26,FOLLOW_26_in_rule__CSSType__Group_0__6__Impl3799); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_6()); 
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
    // $ANTLR end "rule__CSSType__Group_0__6__Impl"


    // $ANTLR start "rule__CSSType__Group_0__7"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1882:1: rule__CSSType__Group_0__7 : rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 ;
    public final void rule__CSSType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1886:1: ( rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1887:2: rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__7__Impl_in_rule__CSSType__Group_0__73830);
            rule__CSSType__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__8_in_rule__CSSType__Group_0__73833);
            rule__CSSType__Group_0__8();

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
    // $ANTLR end "rule__CSSType__Group_0__7"


    // $ANTLR start "rule__CSSType__Group_0__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1894:1: rule__CSSType__Group_0__7__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1898:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1899:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1899:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1900:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1901:1: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1901:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__7__Impl3861); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_7()); 
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
    // $ANTLR end "rule__CSSType__Group_0__7__Impl"


    // $ANTLR start "rule__CSSType__Group_0__8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1911:1: rule__CSSType__Group_0__8 : rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 ;
    public final void rule__CSSType__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1915:1: ( rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1916:2: rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__8__Impl_in_rule__CSSType__Group_0__83892);
            rule__CSSType__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__9_in_rule__CSSType__Group_0__83895);
            rule__CSSType__Group_0__9();

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
    // $ANTLR end "rule__CSSType__Group_0__8"


    // $ANTLR start "rule__CSSType__Group_0__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1923:1: rule__CSSType__Group_0__8__Impl : ( ( rule__CSSType__ToAssignment_0_8 ) ) ;
    public final void rule__CSSType__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1927:1: ( ( ( rule__CSSType__ToAssignment_0_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1928:1: ( ( rule__CSSType__ToAssignment_0_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1928:1: ( ( rule__CSSType__ToAssignment_0_8 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1929:1: ( rule__CSSType__ToAssignment_0_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_0_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1930:1: ( rule__CSSType__ToAssignment_0_8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1930:2: rule__CSSType__ToAssignment_0_8
            {
            pushFollow(FOLLOW_rule__CSSType__ToAssignment_0_8_in_rule__CSSType__Group_0__8__Impl3922);
            rule__CSSType__ToAssignment_0_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_0_8()); 
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
    // $ANTLR end "rule__CSSType__Group_0__8__Impl"


    // $ANTLR start "rule__CSSType__Group_0__9"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1940:1: rule__CSSType__Group_0__9 : rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 ;
    public final void rule__CSSType__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1944:1: ( rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1945:2: rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__9__Impl_in_rule__CSSType__Group_0__93952);
            rule__CSSType__Group_0__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__10_in_rule__CSSType__Group_0__93955);
            rule__CSSType__Group_0__10();

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
    // $ANTLR end "rule__CSSType__Group_0__9"


    // $ANTLR start "rule__CSSType__Group_0__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1952:1: rule__CSSType__Group_0__9__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1956:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1957:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1957:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1958:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_9()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1959:1: ( RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1959:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__9__Impl3983); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_9()); 
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
    // $ANTLR end "rule__CSSType__Group_0__9__Impl"


    // $ANTLR start "rule__CSSType__Group_0__10"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1969:1: rule__CSSType__Group_0__10 : rule__CSSType__Group_0__10__Impl ;
    public final void rule__CSSType__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1973:1: ( rule__CSSType__Group_0__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1974:2: rule__CSSType__Group_0__10__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__10__Impl_in_rule__CSSType__Group_0__104014);
            rule__CSSType__Group_0__10__Impl();

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
    // $ANTLR end "rule__CSSType__Group_0__10"


    // $ANTLR start "rule__CSSType__Group_0__10__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1980:1: rule__CSSType__Group_0__10__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1984:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1985:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1985:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1986:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_10()); 
            }
            match(input,27,FOLLOW_27_in_rule__CSSType__Group_0__10__Impl4042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_10()); 
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
    // $ANTLR end "rule__CSSType__Group_0__10__Impl"


    // $ANTLR start "rule__CSSType__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2021:1: rule__CSSType__Group_1__0 : rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 ;
    public final void rule__CSSType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2025:1: ( rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2026:2: rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__0__Impl_in_rule__CSSType__Group_1__04095);
            rule__CSSType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__1_in_rule__CSSType__Group_1__04098);
            rule__CSSType__Group_1__1();

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
    // $ANTLR end "rule__CSSType__Group_1__0"


    // $ANTLR start "rule__CSSType__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2033:1: rule__CSSType__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2037:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2038:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2038:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2039:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2040:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2042:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2052:1: rule__CSSType__Group_1__1 : rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 ;
    public final void rule__CSSType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2056:1: ( rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2057:2: rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__1__Impl_in_rule__CSSType__Group_1__14156);
            rule__CSSType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__2_in_rule__CSSType__Group_1__14159);
            rule__CSSType__Group_1__2();

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
    // $ANTLR end "rule__CSSType__Group_1__1"


    // $ANTLR start "rule__CSSType__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2064:1: rule__CSSType__Group_1__1__Impl : ( ( rule__CSSType__TypeAssignment_1_1 ) ) ;
    public final void rule__CSSType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2068:1: ( ( ( rule__CSSType__TypeAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2069:1: ( ( rule__CSSType__TypeAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2069:1: ( ( rule__CSSType__TypeAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2070:1: ( rule__CSSType__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2071:1: ( rule__CSSType__TypeAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2071:2: rule__CSSType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_1_1_in_rule__CSSType__Group_1__1__Impl4186);
            rule__CSSType__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSType__Group_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2081:1: rule__CSSType__Group_1__2 : rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 ;
    public final void rule__CSSType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2085:1: ( rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2086:2: rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__2__Impl_in_rule__CSSType__Group_1__24216);
            rule__CSSType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__3_in_rule__CSSType__Group_1__24219);
            rule__CSSType__Group_1__3();

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
    // $ANTLR end "rule__CSSType__Group_1__2"


    // $ANTLR start "rule__CSSType__Group_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2093:1: rule__CSSType__Group_1__2__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2097:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2098:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2098:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2099:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSType__Group_1__2__Impl4247); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__CSSType__Group_1__2__Impl"


    // $ANTLR start "rule__CSSType__Group_1__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2112:1: rule__CSSType__Group_1__3 : rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 ;
    public final void rule__CSSType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2116:1: ( rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2117:2: rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__3__Impl_in_rule__CSSType__Group_1__34278);
            rule__CSSType__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__4_in_rule__CSSType__Group_1__34281);
            rule__CSSType__Group_1__4();

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
    // $ANTLR end "rule__CSSType__Group_1__3"


    // $ANTLR start "rule__CSSType__Group_1__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2124:1: rule__CSSType__Group_1__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2128:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2129:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2129:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2130:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2131:1: ( RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2131:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__3__Impl4309); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_3()); 
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
    // $ANTLR end "rule__CSSType__Group_1__3__Impl"


    // $ANTLR start "rule__CSSType__Group_1__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2141:1: rule__CSSType__Group_1__4 : rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 ;
    public final void rule__CSSType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2145:1: ( rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2146:2: rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__4__Impl_in_rule__CSSType__Group_1__44340);
            rule__CSSType__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__5_in_rule__CSSType__Group_1__44343);
            rule__CSSType__Group_1__5();

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
    // $ANTLR end "rule__CSSType__Group_1__4"


    // $ANTLR start "rule__CSSType__Group_1__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2153:1: rule__CSSType__Group_1__4__Impl : ( ( rule__CSSType__FromAssignment_1_4 ) ) ;
    public final void rule__CSSType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2157:1: ( ( ( rule__CSSType__FromAssignment_1_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2158:1: ( ( rule__CSSType__FromAssignment_1_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2158:1: ( ( rule__CSSType__FromAssignment_1_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2159:1: ( rule__CSSType__FromAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_1_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2160:1: ( rule__CSSType__FromAssignment_1_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2160:2: rule__CSSType__FromAssignment_1_4
            {
            pushFollow(FOLLOW_rule__CSSType__FromAssignment_1_4_in_rule__CSSType__Group_1__4__Impl4370);
            rule__CSSType__FromAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_1_4()); 
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
    // $ANTLR end "rule__CSSType__Group_1__4__Impl"


    // $ANTLR start "rule__CSSType__Group_1__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2170:1: rule__CSSType__Group_1__5 : rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 ;
    public final void rule__CSSType__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2174:1: ( rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2175:2: rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__5__Impl_in_rule__CSSType__Group_1__54400);
            rule__CSSType__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__6_in_rule__CSSType__Group_1__54403);
            rule__CSSType__Group_1__6();

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
    // $ANTLR end "rule__CSSType__Group_1__5"


    // $ANTLR start "rule__CSSType__Group_1__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2182:1: rule__CSSType__Group_1__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2186:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2187:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2187:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2188:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2189:1: ( RULE_WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2189:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__5__Impl4431); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_5()); 
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
    // $ANTLR end "rule__CSSType__Group_1__5__Impl"


    // $ANTLR start "rule__CSSType__Group_1__6"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2199:1: rule__CSSType__Group_1__6 : rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 ;
    public final void rule__CSSType__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2203:1: ( rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2204:2: rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__6__Impl_in_rule__CSSType__Group_1__64462);
            rule__CSSType__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__7_in_rule__CSSType__Group_1__64465);
            rule__CSSType__Group_1__7();

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
    // $ANTLR end "rule__CSSType__Group_1__6"


    // $ANTLR start "rule__CSSType__Group_1__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2211:1: rule__CSSType__Group_1__6__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2215:1: ( ( '->' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2216:1: ( '->' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2216:1: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2217:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_6()); 
            }
            match(input,26,FOLLOW_26_in_rule__CSSType__Group_1__6__Impl4493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_6()); 
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
    // $ANTLR end "rule__CSSType__Group_1__6__Impl"


    // $ANTLR start "rule__CSSType__Group_1__7"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2230:1: rule__CSSType__Group_1__7 : rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 ;
    public final void rule__CSSType__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2234:1: ( rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2235:2: rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__7__Impl_in_rule__CSSType__Group_1__74524);
            rule__CSSType__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__8_in_rule__CSSType__Group_1__74527);
            rule__CSSType__Group_1__8();

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
    // $ANTLR end "rule__CSSType__Group_1__7"


    // $ANTLR start "rule__CSSType__Group_1__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2242:1: rule__CSSType__Group_1__7__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2246:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2247:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2247:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2248:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2249:1: ( RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2249:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__7__Impl4555); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_7()); 
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
    // $ANTLR end "rule__CSSType__Group_1__7__Impl"


    // $ANTLR start "rule__CSSType__Group_1__8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2259:1: rule__CSSType__Group_1__8 : rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 ;
    public final void rule__CSSType__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2263:1: ( rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2264:2: rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__8__Impl_in_rule__CSSType__Group_1__84586);
            rule__CSSType__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__9_in_rule__CSSType__Group_1__84589);
            rule__CSSType__Group_1__9();

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
    // $ANTLR end "rule__CSSType__Group_1__8"


    // $ANTLR start "rule__CSSType__Group_1__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2271:1: rule__CSSType__Group_1__8__Impl : ( ( rule__CSSType__ToAssignment_1_8 ) ) ;
    public final void rule__CSSType__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2275:1: ( ( ( rule__CSSType__ToAssignment_1_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2276:1: ( ( rule__CSSType__ToAssignment_1_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2276:1: ( ( rule__CSSType__ToAssignment_1_8 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2277:1: ( rule__CSSType__ToAssignment_1_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_1_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2278:1: ( rule__CSSType__ToAssignment_1_8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2278:2: rule__CSSType__ToAssignment_1_8
            {
            pushFollow(FOLLOW_rule__CSSType__ToAssignment_1_8_in_rule__CSSType__Group_1__8__Impl4616);
            rule__CSSType__ToAssignment_1_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_1_8()); 
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
    // $ANTLR end "rule__CSSType__Group_1__8__Impl"


    // $ANTLR start "rule__CSSType__Group_1__9"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2288:1: rule__CSSType__Group_1__9 : rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 ;
    public final void rule__CSSType__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2292:1: ( rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2293:2: rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__9__Impl_in_rule__CSSType__Group_1__94646);
            rule__CSSType__Group_1__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__10_in_rule__CSSType__Group_1__94649);
            rule__CSSType__Group_1__10();

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
    // $ANTLR end "rule__CSSType__Group_1__9"


    // $ANTLR start "rule__CSSType__Group_1__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2300:1: rule__CSSType__Group_1__9__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2304:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2305:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2305:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2306:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_9()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2307:1: ( RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2307:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__9__Impl4677); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_9()); 
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
    // $ANTLR end "rule__CSSType__Group_1__9__Impl"


    // $ANTLR start "rule__CSSType__Group_1__10"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2317:1: rule__CSSType__Group_1__10 : rule__CSSType__Group_1__10__Impl ;
    public final void rule__CSSType__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2321:1: ( rule__CSSType__Group_1__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2322:2: rule__CSSType__Group_1__10__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__10__Impl_in_rule__CSSType__Group_1__104708);
            rule__CSSType__Group_1__10__Impl();

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
    // $ANTLR end "rule__CSSType__Group_1__10"


    // $ANTLR start "rule__CSSType__Group_1__10__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2328:1: rule__CSSType__Group_1__10__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2332:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2333:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2333:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2334:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_10()); 
            }
            match(input,27,FOLLOW_27_in_rule__CSSType__Group_1__10__Impl4736); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_10()); 
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
    // $ANTLR end "rule__CSSType__Group_1__10__Impl"


    // $ANTLR start "rule__CSSType__Group_2__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2369:1: rule__CSSType__Group_2__0 : rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1 ;
    public final void rule__CSSType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2373:1: ( rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2374:2: rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_2__0__Impl_in_rule__CSSType__Group_2__04789);
            rule__CSSType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_2__1_in_rule__CSSType__Group_2__04792);
            rule__CSSType__Group_2__1();

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
    // $ANTLR end "rule__CSSType__Group_2__0"


    // $ANTLR start "rule__CSSType__Group_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2381:1: rule__CSSType__Group_2__0__Impl : ( ( rule__CSSType__TypeAssignment_2_0 ) ) ;
    public final void rule__CSSType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2385:1: ( ( ( rule__CSSType__TypeAssignment_2_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2386:1: ( ( rule__CSSType__TypeAssignment_2_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2386:1: ( ( rule__CSSType__TypeAssignment_2_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2387:1: ( rule__CSSType__TypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2388:1: ( rule__CSSType__TypeAssignment_2_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2388:2: rule__CSSType__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_2_0_in_rule__CSSType__Group_2__0__Impl4819);
            rule__CSSType__TypeAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_0()); 
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
    // $ANTLR end "rule__CSSType__Group_2__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2398:1: rule__CSSType__Group_2__1 : rule__CSSType__Group_2__1__Impl ;
    public final void rule__CSSType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2402:1: ( rule__CSSType__Group_2__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2403:2: rule__CSSType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_2__1__Impl_in_rule__CSSType__Group_2__14849);
            rule__CSSType__Group_2__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_2__1"


    // $ANTLR start "rule__CSSType__Group_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2409:1: rule__CSSType__Group_2__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2413:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2414:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2414:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2415:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2416:1: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2416:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_2__1__Impl4877); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__CSSType__Group_2__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2430:1: rule__CSSType__Group_3__0 : rule__CSSType__Group_3__0__Impl rule__CSSType__Group_3__1 ;
    public final void rule__CSSType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2434:1: ( rule__CSSType__Group_3__0__Impl rule__CSSType__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2435:2: rule__CSSType__Group_3__0__Impl rule__CSSType__Group_3__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_3__0__Impl_in_rule__CSSType__Group_3__04912);
            rule__CSSType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_3__1_in_rule__CSSType__Group_3__04915);
            rule__CSSType__Group_3__1();

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
    // $ANTLR end "rule__CSSType__Group_3__0"


    // $ANTLR start "rule__CSSType__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2442:1: rule__CSSType__Group_3__0__Impl : ( ( rule__CSSType__TypeAssignment_3_0 ) ) ;
    public final void rule__CSSType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2446:1: ( ( ( rule__CSSType__TypeAssignment_3_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2447:1: ( ( rule__CSSType__TypeAssignment_3_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2447:1: ( ( rule__CSSType__TypeAssignment_3_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2448:1: ( rule__CSSType__TypeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2449:1: ( rule__CSSType__TypeAssignment_3_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2449:2: rule__CSSType__TypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_3_0_in_rule__CSSType__Group_3__0__Impl4942);
            rule__CSSType__TypeAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_0()); 
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
    // $ANTLR end "rule__CSSType__Group_3__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2459:1: rule__CSSType__Group_3__1 : rule__CSSType__Group_3__1__Impl ;
    public final void rule__CSSType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2463:1: ( rule__CSSType__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2464:2: rule__CSSType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_3__1__Impl_in_rule__CSSType__Group_3__14972);
            rule__CSSType__Group_3__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3__1"


    // $ANTLR start "rule__CSSType__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2470:1: rule__CSSType__Group_3__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2474:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2475:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2475:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2476:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2477:1: ( RULE_WS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2477:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_3__1__Impl5000); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1()); 
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
    // $ANTLR end "rule__CSSType__Group_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2491:1: rule__ElementDefinition__Group__0 : rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 ;
    public final void rule__ElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2495:1: ( rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2496:2: rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__0__Impl_in_rule__ElementDefinition__Group__05035);
            rule__ElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__1_in_rule__ElementDefinition__Group__05038);
            rule__ElementDefinition__Group__1();

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
    // $ANTLR end "rule__ElementDefinition__Group__0"


    // $ANTLR start "rule__ElementDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2503:1: rule__ElementDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2507:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2508:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2508:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2509:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2510:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2512:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2522:1: rule__ElementDefinition__Group__1 : rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 ;
    public final void rule__ElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2526:1: ( rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2527:2: rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__1__Impl_in_rule__ElementDefinition__Group__15096);
            rule__ElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__2_in_rule__ElementDefinition__Group__15099);
            rule__ElementDefinition__Group__2();

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
    // $ANTLR end "rule__ElementDefinition__Group__1"


    // $ANTLR start "rule__ElementDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2534:1: rule__ElementDefinition__Group__1__Impl : ( ( rule__ElementDefinition__DokuAssignment_1 )? ) ;
    public final void rule__ElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2538:1: ( ( ( rule__ElementDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2539:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2539:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2540:1: ( rule__ElementDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2541:1: ( rule__ElementDefinition__DokuAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_JDOC) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2541:2: rule__ElementDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__DokuAssignment_1_in_rule__ElementDefinition__Group__1__Impl5126);
                    rule__ElementDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
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
    // $ANTLR end "rule__ElementDefinition__Group__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2551:1: rule__ElementDefinition__Group__2 : rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 ;
    public final void rule__ElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2555:1: ( rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2556:2: rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__2__Impl_in_rule__ElementDefinition__Group__25157);
            rule__ElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__3_in_rule__ElementDefinition__Group__25160);
            rule__ElementDefinition__Group__3();

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
    // $ANTLR end "rule__ElementDefinition__Group__2"


    // $ANTLR start "rule__ElementDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2563:1: rule__ElementDefinition__Group__2__Impl : ( ( rule__ElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__ElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2567:1: ( ( ( rule__ElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2568:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2568:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2569:1: ( rule__ElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2570:1: ( rule__ElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2570:2: rule__ElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementDefinition__NameAssignment_2_in_rule__ElementDefinition__Group__2__Impl5187);
            rule__ElementDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__ElementDefinition__Group__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2580:1: rule__ElementDefinition__Group__3 : rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 ;
    public final void rule__ElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2584:1: ( rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2585:2: rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__3__Impl_in_rule__ElementDefinition__Group__35217);
            rule__ElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__4_in_rule__ElementDefinition__Group__35220);
            rule__ElementDefinition__Group__4();

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
    // $ANTLR end "rule__ElementDefinition__Group__3"


    // $ANTLR start "rule__ElementDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2592:1: rule__ElementDefinition__Group__3__Impl : ( ( rule__ElementDefinition__Group_3__0 )? ) ;
    public final void rule__ElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2596:1: ( ( ( rule__ElementDefinition__Group_3__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2597:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2597:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2598:1: ( rule__ElementDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2599:1: ( rule__ElementDefinition__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2599:2: rule__ElementDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__Group_3__0_in_rule__ElementDefinition__Group__3__Impl5247);
                    rule__ElementDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ElementDefinition__Group__3__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2609:1: rule__ElementDefinition__Group__4 : rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 ;
    public final void rule__ElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2613:1: ( rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2614:2: rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__4__Impl_in_rule__ElementDefinition__Group__45278);
            rule__ElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__5_in_rule__ElementDefinition__Group__45281);
            rule__ElementDefinition__Group__5();

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
    // $ANTLR end "rule__ElementDefinition__Group__4"


    // $ANTLR start "rule__ElementDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2621:1: rule__ElementDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__ElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2625:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2626:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2626:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2627:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__ElementDefinition__Group__4__Impl5309); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ElementDefinition__Group__4__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2640:1: rule__ElementDefinition__Group__5 : rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 ;
    public final void rule__ElementDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2644:1: ( rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2645:2: rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__5__Impl_in_rule__ElementDefinition__Group__55340);
            rule__ElementDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__6_in_rule__ElementDefinition__Group__55343);
            rule__ElementDefinition__Group__6();

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
    // $ANTLR end "rule__ElementDefinition__Group__5"


    // $ANTLR start "rule__ElementDefinition__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2652:1: rule__ElementDefinition__Group__5__Impl : ( ( rule__ElementDefinition__Alternatives_5 )* ) ;
    public final void rule__ElementDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2656:1: ( ( ( rule__ElementDefinition__Alternatives_5 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2657:1: ( ( rule__ElementDefinition__Alternatives_5 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2657:1: ( ( rule__ElementDefinition__Alternatives_5 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2658:1: ( rule__ElementDefinition__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getAlternatives_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2659:1: ( rule__ElementDefinition__Alternatives_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==RULE_JDOC||LA26_0==RULE_PSEUDO) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2659:2: rule__ElementDefinition__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__ElementDefinition__Alternatives_5_in_rule__ElementDefinition__Group__5__Impl5370);
            	    rule__ElementDefinition__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getAlternatives_5()); 
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
    // $ANTLR end "rule__ElementDefinition__Group__5__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2669:1: rule__ElementDefinition__Group__6 : rule__ElementDefinition__Group__6__Impl ;
    public final void rule__ElementDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2673:1: ( rule__ElementDefinition__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2674:2: rule__ElementDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__6__Impl_in_rule__ElementDefinition__Group__65401);
            rule__ElementDefinition__Group__6__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group__6"


    // $ANTLR start "rule__ElementDefinition__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2680:1: rule__ElementDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__ElementDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2684:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2685:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2685:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2686:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__ElementDefinition__Group__6__Impl5429); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__ElementDefinition__Group__6__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2713:1: rule__ElementDefinition__Group_3__0 : rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 ;
    public final void rule__ElementDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2717:1: ( rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2718:2: rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__0__Impl_in_rule__ElementDefinition__Group_3__05474);
            rule__ElementDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__1_in_rule__ElementDefinition__Group_3__05477);
            rule__ElementDefinition__Group_3__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__0"


    // $ANTLR start "rule__ElementDefinition__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2725:1: rule__ElementDefinition__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ElementDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2729:1: ( ( 'extends' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2730:1: ( 'extends' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2730:1: ( 'extends' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2731:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__ElementDefinition__Group_3__0__Impl5505); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
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
    // $ANTLR end "rule__ElementDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2744:1: rule__ElementDefinition__Group_3__1 : rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 ;
    public final void rule__ElementDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2748:1: ( rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2749:2: rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__1__Impl_in_rule__ElementDefinition__Group_3__15536);
            rule__ElementDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__2_in_rule__ElementDefinition__Group_3__15539);
            rule__ElementDefinition__Group_3__2();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__1"


    // $ANTLR start "rule__ElementDefinition__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2756:1: rule__ElementDefinition__Group_3__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) ;
    public final void rule__ElementDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2760:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2761:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2761:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2762:1: ( rule__ElementDefinition__SuperAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2763:1: ( rule__ElementDefinition__SuperAssignment_3_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2763:2: rule__ElementDefinition__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__SuperAssignment_3_1_in_rule__ElementDefinition__Group_3__1__Impl5566);
            rule__ElementDefinition__SuperAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
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
    // $ANTLR end "rule__ElementDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2773:1: rule__ElementDefinition__Group_3__2 : rule__ElementDefinition__Group_3__2__Impl ;
    public final void rule__ElementDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2777:1: ( rule__ElementDefinition__Group_3__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2778:2: rule__ElementDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__2__Impl_in_rule__ElementDefinition__Group_3__25596);
            rule__ElementDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__2"


    // $ANTLR start "rule__ElementDefinition__Group_3__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2784:1: rule__ElementDefinition__Group_3__2__Impl : ( ( rule__ElementDefinition__Group_3_2__0 )* ) ;
    public final void rule__ElementDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2788:1: ( ( ( rule__ElementDefinition__Group_3_2__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2789:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2789:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2790:1: ( rule__ElementDefinition__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2791:1: ( rule__ElementDefinition__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2791:2: rule__ElementDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__0_in_rule__ElementDefinition__Group_3__2__Impl5623);
            	    rule__ElementDefinition__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__ElementDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2807:1: rule__ElementDefinition__Group_3_2__0 : rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 ;
    public final void rule__ElementDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2811:1: ( rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2812:2: rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__0__Impl_in_rule__ElementDefinition__Group_3_2__05660);
            rule__ElementDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__1_in_rule__ElementDefinition__Group_3_2__05663);
            rule__ElementDefinition__Group_3_2__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2819:1: rule__ElementDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ElementDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2823:1: ( ( ',' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2824:1: ( ',' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2824:1: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2825:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__ElementDefinition__Group_3_2__0__Impl5691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2838:1: rule__ElementDefinition__Group_3_2__1 : rule__ElementDefinition__Group_3_2__1__Impl ;
    public final void rule__ElementDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2842:1: ( rule__ElementDefinition__Group_3_2__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2843:2: rule__ElementDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__1__Impl_in_rule__ElementDefinition__Group_3_2__15722);
            rule__ElementDefinition__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2849:1: rule__ElementDefinition__Group_3_2__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) ;
    public final void rule__ElementDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2853:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2854:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2854:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2855:1: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2856:1: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2856:2: rule__ElementDefinition__SuperAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__SuperAssignment_3_2_1_in_rule__ElementDefinition__Group_3_2__1__Impl5749);
            rule__ElementDefinition__SuperAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2870:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2874:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2875:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__05783);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__05786);
            rule__PropertyDefinition__Group__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2882:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2886:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2887:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2887:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2888:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2889:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2891:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2901:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2905:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2906:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__15844);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__15847);
            rule__PropertyDefinition__Group__2();

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
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2913:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2917:1: ( ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2918:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2918:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2919:1: ( rule__PropertyDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2920:1: ( rule__PropertyDefinition__DokuAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_JDOC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2920:2: rule__PropertyDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DokuAssignment_1_in_rule__PropertyDefinition__Group__1__Impl5874);
                    rule__PropertyDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2930:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2934:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2935:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__25905);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__25908);
            rule__PropertyDefinition__Group__3();

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
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2942:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2946:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2947:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2947:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2948:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2949:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2949:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl5935);
            rule__PropertyDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2959:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2963:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2964:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35965);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35968);
            rule__PropertyDefinition__Group__4();

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
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2971:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2975:1: ( ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2976:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2976:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2977:1: ( rule__PropertyDefinition__RuleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2978:1: ( rule__PropertyDefinition__RuleAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2978:2: rule__PropertyDefinition__RuleAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__RuleAssignment_3_in_rule__PropertyDefinition__Group__3__Impl5995);
            rule__PropertyDefinition__RuleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2988:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2992:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2993:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__46025);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__46028);
            rule__PropertyDefinition__Group__5();

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
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3000:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3004:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3005:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3005:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3006:1: ( rule__PropertyDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3007:1: ( rule__PropertyDefinition__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3007:2: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl6055);
                    rule__PropertyDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3017:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3021:1: ( rule__PropertyDefinition__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3022:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__56086);
            rule__PropertyDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3028:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3032:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3033:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3033:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3034:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__PropertyDefinition__Group__5__Impl6114); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3059:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3063:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3064:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__06157);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__06160);
            rule__PropertyDefinition__Group_4__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3071:1: rule__PropertyDefinition__Group_4__0__Impl : ( 'default:' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3075:1: ( ( 'default:' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3076:1: ( 'default:' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3076:1: ( 'default:' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3077:1: 'default:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__PropertyDefinition__Group_4__0__Impl6188); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3090:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3094:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3095:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__16219);
            rule__PropertyDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3101:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3105:1: ( ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3106:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3106:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3107:1: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3108:1: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3108:2: rule__PropertyDefinition__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultAssignment_4_1_in_rule__PropertyDefinition__Group_4__1__Impl6246);
            rule__PropertyDefinition__DefaultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3122:1: rule__PseudoClassDefinition__Group__0 : rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 ;
    public final void rule__PseudoClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3126:1: ( rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3127:2: rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__06280);
            rule__PseudoClassDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__06283);
            rule__PseudoClassDefinition__Group__1();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__0"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3134:1: rule__PseudoClassDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PseudoClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3138:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3139:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3139:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3140:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3141:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3143:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3153:1: rule__PseudoClassDefinition__Group__1 : rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 ;
    public final void rule__PseudoClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3157:1: ( rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3158:2: rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__16341);
            rule__PseudoClassDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__2_in_rule__PseudoClassDefinition__Group__16344);
            rule__PseudoClassDefinition__Group__2();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__1"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3165:1: rule__PseudoClassDefinition__Group__1__Impl : ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PseudoClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3169:1: ( ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3170:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3170:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3171:1: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3172:1: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_JDOC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3172:2: rule__PseudoClassDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PseudoClassDefinition__DokuAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl6371);
                    rule__PseudoClassDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__Group__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3182:1: rule__PseudoClassDefinition__Group__2 : rule__PseudoClassDefinition__Group__2__Impl ;
    public final void rule__PseudoClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3186:1: ( rule__PseudoClassDefinition__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3187:2: rule__PseudoClassDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__2__Impl_in_rule__PseudoClassDefinition__Group__26402);
            rule__PseudoClassDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__2"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3193:1: rule__PseudoClassDefinition__Group__2__Impl : ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) ;
    public final void rule__PseudoClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3197:1: ( ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3198:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3198:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3199:1: ( rule__PseudoClassDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3200:1: ( rule__PseudoClassDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3200:2: rule__PseudoClassDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__NameAssignment_2_in_rule__PseudoClassDefinition__Group__2__Impl6429);
            rule__PseudoClassDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3216:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3220:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3221:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__06465);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__06468);
            rule__CSSRuleRef__Group__1();

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
    // $ANTLR end "rule__CSSRuleRef__Group__0"


    // $ANTLR start "rule__CSSRuleRef__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3228:1: rule__CSSRuleRef__Group__0__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3232:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3233:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3233:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3234:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__CSSRuleRef__Group__0__Impl6496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__CSSRuleRef__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3247:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3251:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3252:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__16527);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__16530);
            rule__CSSRuleRef__Group__2();

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
    // $ANTLR end "rule__CSSRuleRef__Group__1"


    // $ANTLR start "rule__CSSRuleRef__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3259:1: rule__CSSRuleRef__Group__1__Impl : ( ( rule__CSSRuleRef__RefAssignment_1 ) ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3263:1: ( ( ( rule__CSSRuleRef__RefAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3264:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3264:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3265:1: ( rule__CSSRuleRef__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3266:1: ( rule__CSSRuleRef__RefAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3266:2: rule__CSSRuleRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl6557);
            rule__CSSRuleRef__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleRef__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3276:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3280:1: ( rule__CSSRuleRef__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3281:2: rule__CSSRuleRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__26587);
            rule__CSSRuleRef__Group__2__Impl();

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
    // $ANTLR end "rule__CSSRuleRef__Group__2"


    // $ANTLR start "rule__CSSRuleRef__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3287:1: rule__CSSRuleRef__Group__2__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3291:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3292:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3292:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3293:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__CSSRuleRef__Group__2__Impl6615); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__CSSRuleRef__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3312:1: rule__CSSRuleDefinition__Group__0 : rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 ;
    public final void rule__CSSRuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3316:1: ( rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3317:2: rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__06652);
            rule__CSSRuleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__06655);
            rule__CSSRuleDefinition__Group__1();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__0"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3324:1: rule__CSSRuleDefinition__Group__0__Impl : ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? ) ;
    public final void rule__CSSRuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3328:1: ( ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3329:1: ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3329:1: ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3330:1: ( rule__CSSRuleDefinition__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3331:1: ( rule__CSSRuleDefinition__DokuAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_JDOC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3331:2: rule__CSSRuleDefinition__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__DokuAssignment_0_in_rule__CSSRuleDefinition__Group__0__Impl6682);
                    rule__CSSRuleDefinition__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3341:1: rule__CSSRuleDefinition__Group__1 : rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 ;
    public final void rule__CSSRuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3345:1: ( rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3346:2: rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__16713);
            rule__CSSRuleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__16716);
            rule__CSSRuleDefinition__Group__2();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__1"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3353:1: rule__CSSRuleDefinition__Group__1__Impl : ( ( rule__CSSRuleDefinition__NameAssignment_1 ) ) ;
    public final void rule__CSSRuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3357:1: ( ( ( rule__CSSRuleDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3358:1: ( ( rule__CSSRuleDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3358:1: ( ( rule__CSSRuleDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3359:1: ( rule__CSSRuleDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3360:1: ( rule__CSSRuleDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3360:2: rule__CSSRuleDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__NameAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl6743);
            rule__CSSRuleDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3370:1: rule__CSSRuleDefinition__Group__2 : rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 ;
    public final void rule__CSSRuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3374:1: ( rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3375:2: rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__26773);
            rule__CSSRuleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__26776);
            rule__CSSRuleDefinition__Group__3();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__2"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3382:1: rule__CSSRuleDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__CSSRuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3386:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3387:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3387:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3388:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__CSSRuleDefinition__Group__2__Impl6804); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3401:1: rule__CSSRuleDefinition__Group__3 : rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 ;
    public final void rule__CSSRuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3405:1: ( rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3406:2: rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__36835);
            rule__CSSRuleDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__36838);
            rule__CSSRuleDefinition__Group__4();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__3"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3413:1: rule__CSSRuleDefinition__Group__3__Impl : ( ( rule__CSSRuleDefinition__Alternatives_3 ) ) ;
    public final void rule__CSSRuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3417:1: ( ( ( rule__CSSRuleDefinition__Alternatives_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3418:1: ( ( rule__CSSRuleDefinition__Alternatives_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3418:1: ( ( rule__CSSRuleDefinition__Alternatives_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3419:1: ( rule__CSSRuleDefinition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3420:1: ( rule__CSSRuleDefinition__Alternatives_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3420:2: rule__CSSRuleDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Alternatives_3_in_rule__CSSRuleDefinition__Group__3__Impl6865);
            rule__CSSRuleDefinition__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3430:1: rule__CSSRuleDefinition__Group__4 : rule__CSSRuleDefinition__Group__4__Impl ;
    public final void rule__CSSRuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3434:1: ( rule__CSSRuleDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3435:2: rule__CSSRuleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__46895);
            rule__CSSRuleDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__4"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3441:1: rule__CSSRuleDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__CSSRuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3445:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3446:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3446:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3447:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__CSSRuleDefinition__Group__4__Impl6923); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3470:1: rule__CSSRuleFunc__Group__0 : rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 ;
    public final void rule__CSSRuleFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3474:1: ( rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3475:2: rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__0__Impl_in_rule__CSSRuleFunc__Group__06964);
            rule__CSSRuleFunc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__1_in_rule__CSSRuleFunc__Group__06967);
            rule__CSSRuleFunc__Group__1();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__0"


    // $ANTLR start "rule__CSSRuleFunc__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3482:1: rule__CSSRuleFunc__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3486:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3487:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3487:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3488:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3489:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3491:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3501:1: rule__CSSRuleFunc__Group__1 : rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 ;
    public final void rule__CSSRuleFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3505:1: ( rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3506:2: rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__1__Impl_in_rule__CSSRuleFunc__Group__17025);
            rule__CSSRuleFunc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__2_in_rule__CSSRuleFunc__Group__17028);
            rule__CSSRuleFunc__Group__2();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__1"


    // $ANTLR start "rule__CSSRuleFunc__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3513:1: rule__CSSRuleFunc__Group__1__Impl : ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) ;
    public final void rule__CSSRuleFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3517:1: ( ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3518:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3518:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3519:1: ( rule__CSSRuleFunc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3520:1: ( rule__CSSRuleFunc__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3520:2: rule__CSSRuleFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__NameAssignment_1_in_rule__CSSRuleFunc__Group__1__Impl7055);
            rule__CSSRuleFunc__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleFunc__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3530:1: rule__CSSRuleFunc__Group__2 : rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 ;
    public final void rule__CSSRuleFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3534:1: ( rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3535:2: rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__2__Impl_in_rule__CSSRuleFunc__Group__27085);
            rule__CSSRuleFunc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__3_in_rule__CSSRuleFunc__Group__27088);
            rule__CSSRuleFunc__Group__3();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__2"


    // $ANTLR start "rule__CSSRuleFunc__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3542:1: rule__CSSRuleFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__CSSRuleFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3546:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3547:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3547:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3548:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSRuleFunc__Group__2__Impl7116); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__CSSRuleFunc__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3561:1: rule__CSSRuleFunc__Group__3 : rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 ;
    public final void rule__CSSRuleFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3565:1: ( rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3566:2: rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__3__Impl_in_rule__CSSRuleFunc__Group__37147);
            rule__CSSRuleFunc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__4_in_rule__CSSRuleFunc__Group__37150);
            rule__CSSRuleFunc__Group__4();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__3"


    // $ANTLR start "rule__CSSRuleFunc__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3573:1: rule__CSSRuleFunc__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3577:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3578:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3578:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3579:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3580:1: ( RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3580:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSRuleFunc__Group__3__Impl7178); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__CSSRuleFunc__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3590:1: rule__CSSRuleFunc__Group__4 : rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 ;
    public final void rule__CSSRuleFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3594:1: ( rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3595:2: rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__4__Impl_in_rule__CSSRuleFunc__Group__47209);
            rule__CSSRuleFunc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__5_in_rule__CSSRuleFunc__Group__47212);
            rule__CSSRuleFunc__Group__5();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__4"


    // $ANTLR start "rule__CSSRuleFunc__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3602:1: rule__CSSRuleFunc__Group__4__Impl : ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) ;
    public final void rule__CSSRuleFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3606:1: ( ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3607:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3607:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3608:1: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3609:1: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3609:2: rule__CSSRuleFunc__ParamsAssignment_4
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__ParamsAssignment_4_in_rule__CSSRuleFunc__Group__4__Impl7239);
            rule__CSSRuleFunc__ParamsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
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
    // $ANTLR end "rule__CSSRuleFunc__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3619:1: rule__CSSRuleFunc__Group__5 : rule__CSSRuleFunc__Group__5__Impl ;
    public final void rule__CSSRuleFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3623:1: ( rule__CSSRuleFunc__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3624:2: rule__CSSRuleFunc__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__5__Impl_in_rule__CSSRuleFunc__Group__57269);
            rule__CSSRuleFunc__Group__5__Impl();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__5"


    // $ANTLR start "rule__CSSRuleFunc__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3630:1: rule__CSSRuleFunc__Group__5__Impl : ( ')' ) ;
    public final void rule__CSSRuleFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3634:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3635:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3635:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3636:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__CSSRuleFunc__Group__5__Impl7297); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__CSSRuleFunc__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3661:1: rule__CSSRuleOr__Group__0 : rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 ;
    public final void rule__CSSRuleOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3665:1: ( rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3666:2: rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__07340);
            rule__CSSRuleOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__07343);
            rule__CSSRuleOr__Group__1();

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
    // $ANTLR end "rule__CSSRuleOr__Group__0"


    // $ANTLR start "rule__CSSRuleOr__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3673:1: rule__CSSRuleOr__Group__0__Impl : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3677:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3678:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3678:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3679:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl7370);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3690:1: rule__CSSRuleOr__Group__1 : rule__CSSRuleOr__Group__1__Impl ;
    public final void rule__CSSRuleOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3694:1: ( rule__CSSRuleOr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3695:2: rule__CSSRuleOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__17399);
            rule__CSSRuleOr__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOr__Group__1"


    // $ANTLR start "rule__CSSRuleOr__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3701:1: rule__CSSRuleOr__Group__1__Impl : ( ( rule__CSSRuleOr__Group_1__0 )? ) ;
    public final void rule__CSSRuleOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3705:1: ( ( ( rule__CSSRuleOr__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3706:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3706:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3707:1: ( rule__CSSRuleOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3708:1: ( rule__CSSRuleOr__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3708:2: rule__CSSRuleOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl7426);
                    rule__CSSRuleOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3722:1: rule__CSSRuleOr__Group_1__0 : rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 ;
    public final void rule__CSSRuleOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3726:1: ( rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3727:2: rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__07461);
            rule__CSSRuleOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__07464);
            rule__CSSRuleOr__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3734:1: rule__CSSRuleOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3738:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3739:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3739:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3740:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3741:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3743:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3753:1: rule__CSSRuleOr__Group_1__1 : rule__CSSRuleOr__Group_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3757:1: ( rule__CSSRuleOr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3758:2: rule__CSSRuleOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__17522);
            rule__CSSRuleOr__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3764:1: rule__CSSRuleOr__Group_1__1__Impl : ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3768:1: ( ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3769:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3769:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3770:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3770:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3771:1: ( rule__CSSRuleOr__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3772:1: ( rule__CSSRuleOr__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3772:2: rule__CSSRuleOr__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7551);
            rule__CSSRuleOr__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3775:1: ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3776:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3777:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3777:2: rule__CSSRuleOr__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7563);
            	    rule__CSSRuleOr__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3792:1: rule__CSSRuleOr__Group_1_1__0 : rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 ;
    public final void rule__CSSRuleOr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3796:1: ( rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3797:2: rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__07600);
            rule__CSSRuleOr__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__07603);
            rule__CSSRuleOr__Group_1_1__1();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3804:1: rule__CSSRuleOr__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3808:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3809:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3809:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3810:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__CSSRuleOr__Group_1_1__0__Impl7631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3823:1: rule__CSSRuleOr__Group_1_1__1 : rule__CSSRuleOr__Group_1_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3827:1: ( rule__CSSRuleOr__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3828:2: rule__CSSRuleOr__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__17662);
            rule__CSSRuleOr__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3834:1: rule__CSSRuleOr__Group_1_1__1__Impl : ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleOr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3838:1: ( ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3839:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3839:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3840:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3841:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3841:2: rule__CSSRuleOr__OrsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl7689);
            rule__CSSRuleOr__OrsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3855:1: rule__CSSRuleXor__Group__0 : rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 ;
    public final void rule__CSSRuleXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3859:1: ( rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3860:2: rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__07723);
            rule__CSSRuleXor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__07726);
            rule__CSSRuleXor__Group__1();

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
    // $ANTLR end "rule__CSSRuleXor__Group__0"


    // $ANTLR start "rule__CSSRuleXor__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3867:1: rule__CSSRuleXor__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3871:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3872:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3872:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3873:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl7753);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3884:1: rule__CSSRuleXor__Group__1 : rule__CSSRuleXor__Group__1__Impl ;
    public final void rule__CSSRuleXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3888:1: ( rule__CSSRuleXor__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3889:2: rule__CSSRuleXor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__17782);
            rule__CSSRuleXor__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXor__Group__1"


    // $ANTLR start "rule__CSSRuleXor__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3895:1: rule__CSSRuleXor__Group__1__Impl : ( ( rule__CSSRuleXor__Group_1__0 )? ) ;
    public final void rule__CSSRuleXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3899:1: ( ( ( rule__CSSRuleXor__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3900:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3900:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3901:1: ( rule__CSSRuleXor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3902:1: ( rule__CSSRuleXor__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3902:2: rule__CSSRuleXor__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl7809);
                    rule__CSSRuleXor__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3916:1: rule__CSSRuleXor__Group_1__0 : rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 ;
    public final void rule__CSSRuleXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3920:1: ( rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3921:2: rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__07844);
            rule__CSSRuleXor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__07847);
            rule__CSSRuleXor__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3928:1: rule__CSSRuleXor__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3932:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3933:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3933:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3934:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3935:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3937:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3947:1: rule__CSSRuleXor__Group_1__1 : rule__CSSRuleXor__Group_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3951:1: ( rule__CSSRuleXor__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3952:2: rule__CSSRuleXor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__17905);
            rule__CSSRuleXor__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3958:1: rule__CSSRuleXor__Group_1__1__Impl : ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3962:1: ( ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3963:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3963:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3964:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3964:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3965:1: ( rule__CSSRuleXor__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3966:1: ( rule__CSSRuleXor__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3966:2: rule__CSSRuleXor__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7934);
            rule__CSSRuleXor__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3969:1: ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3970:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3971:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3971:2: rule__CSSRuleXor__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7946);
            	    rule__CSSRuleXor__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3986:1: rule__CSSRuleXor__Group_1_1__0 : rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 ;
    public final void rule__CSSRuleXor__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3990:1: ( rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3991:2: rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__07983);
            rule__CSSRuleXor__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__07986);
            rule__CSSRuleXor__Group_1_1__1();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3998:1: rule__CSSRuleXor__Group_1_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXor__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4002:1: ( ( '||' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4003:1: ( '||' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4003:1: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4004:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__CSSRuleXor__Group_1_1__0__Impl8014); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4017:1: rule__CSSRuleXor__Group_1_1__1 : rule__CSSRuleXor__Group_1_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4021:1: ( rule__CSSRuleXor__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4022:2: rule__CSSRuleXor__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__18045);
            rule__CSSRuleXor__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4028:1: rule__CSSRuleXor__Group_1_1__1__Impl : ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleXor__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4032:1: ( ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4033:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4033:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4034:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4035:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4035:2: rule__CSSRuleXor__XorsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl8072);
            rule__CSSRuleXor__XorsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4049:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4053:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4054:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__08106);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__08109);
            rule__CSSRuleConcat__Group__1();

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
    // $ANTLR end "rule__CSSRuleConcat__Group__0"


    // $ANTLR start "rule__CSSRuleConcat__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4061:1: rule__CSSRuleConcat__Group__0__Impl : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4065:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4066:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4066:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4067:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl8136);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleConcat__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4078:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4082:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4083:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__18165);
            rule__CSSRuleConcat__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcat__Group__1"


    // $ANTLR start "rule__CSSRuleConcat__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4089:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4093:1: ( ( ( rule__CSSRuleConcat__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4094:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4094:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4095:1: ( rule__CSSRuleConcat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4096:1: ( rule__CSSRuleConcat__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==RULE_INT||LA37_0==RULE_REGEX||(LA37_0>=18 && LA37_0<=19)||LA37_0==31||LA37_0==36||(LA37_0>=38 && LA37_0<=39)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4096:2: rule__CSSRuleConcat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl8192);
                    rule__CSSRuleConcat__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleConcat__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4110:1: rule__CSSRuleConcat__Group_1__0 : rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 ;
    public final void rule__CSSRuleConcat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4114:1: ( rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4115:2: rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__08227);
            rule__CSSRuleConcat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__08230);
            rule__CSSRuleConcat__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4122:1: rule__CSSRuleConcat__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4126:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4127:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4127:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4128:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4129:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4131:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4141:1: rule__CSSRuleConcat__Group_1__1 : rule__CSSRuleConcat__Group_1__1__Impl ;
    public final void rule__CSSRuleConcat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4145:1: ( rule__CSSRuleConcat__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4146:2: rule__CSSRuleConcat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__18288);
            rule__CSSRuleConcat__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4152:1: rule__CSSRuleConcat__Group_1__1__Impl : ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) ;
    public final void rule__CSSRuleConcat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4156:1: ( ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4157:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4157:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4158:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4158:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4159:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4160:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4160:2: rule__CSSRuleConcat__ConcAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8317);
            rule__CSSRuleConcat__ConcAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4163:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4164:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4165:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==RULE_INT||LA38_0==RULE_REGEX||(LA38_0>=18 && LA38_0<=19)||LA38_0==31||LA38_0==36||(LA38_0>=38 && LA38_0<=39)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4165:2: rule__CSSRuleConcat__ConcAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8329);
            	    rule__CSSRuleConcat__ConcAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4180:1: rule__CSSRulePostfix__Group__0 : rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 ;
    public final void rule__CSSRulePostfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4184:1: ( rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4185:2: rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__08366);
            rule__CSSRulePostfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__08369);
            rule__CSSRulePostfix__Group__1();

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
    // $ANTLR end "rule__CSSRulePostfix__Group__0"


    // $ANTLR start "rule__CSSRulePostfix__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4192:1: rule__CSSRulePostfix__Group__0__Impl : ( ruleCSSRulePrimary ) ;
    public final void rule__CSSRulePostfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4196:1: ( ( ruleCSSRulePrimary ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4197:1: ( ruleCSSRulePrimary )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4197:1: ( ruleCSSRulePrimary )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4198:1: ruleCSSRulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl8396);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRulePostfix__Group__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4209:1: rule__CSSRulePostfix__Group__1 : rule__CSSRulePostfix__Group__1__Impl ;
    public final void rule__CSSRulePostfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4213:1: ( rule__CSSRulePostfix__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4214:2: rule__CSSRulePostfix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__18425);
            rule__CSSRulePostfix__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRulePostfix__Group__1"


    // $ANTLR start "rule__CSSRulePostfix__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4220:1: rule__CSSRulePostfix__Group__1__Impl : ( ( rule__CSSRulePostfix__Group_1__0 )? ) ;
    public final void rule__CSSRulePostfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4224:1: ( ( ( rule__CSSRulePostfix__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4225:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4225:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4226:1: ( rule__CSSRulePostfix__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4227:1: ( rule__CSSRulePostfix__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=15 && LA39_0<=17)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4227:2: rule__CSSRulePostfix__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl8452);
                    rule__CSSRulePostfix__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRulePostfix__Group__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4241:1: rule__CSSRulePostfix__Group_1__0 : rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 ;
    public final void rule__CSSRulePostfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4245:1: ( rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4246:2: rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__08487);
            rule__CSSRulePostfix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__08490);
            rule__CSSRulePostfix__Group_1__1();

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4253:1: rule__CSSRulePostfix__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRulePostfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4257:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4258:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4258:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4259:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4260:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4262:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4272:1: rule__CSSRulePostfix__Group_1__1 : rule__CSSRulePostfix__Group_1__1__Impl ;
    public final void rule__CSSRulePostfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4276:1: ( rule__CSSRulePostfix__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4277:2: rule__CSSRulePostfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__18548);
            rule__CSSRulePostfix__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4283:1: rule__CSSRulePostfix__Group_1__1__Impl : ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) ;
    public final void rule__CSSRulePostfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4287:1: ( ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4288:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4288:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4289:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4290:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4290:2: rule__CSSRulePostfix__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl8575);
            rule__CSSRulePostfix__CardinalityAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4304:1: rule__CSSRuleBracket__Group__0 : rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 ;
    public final void rule__CSSRuleBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4308:1: ( rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4309:2: rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__08609);
            rule__CSSRuleBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__08612);
            rule__CSSRuleBracket__Group__1();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__0"


    // $ANTLR start "rule__CSSRuleBracket__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4316:1: rule__CSSRuleBracket__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4320:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4321:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4321:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4322:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4323:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4325:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4335:1: rule__CSSRuleBracket__Group__1 : rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 ;
    public final void rule__CSSRuleBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4339:1: ( rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4340:2: rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__18670);
            rule__CSSRuleBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__18673);
            rule__CSSRuleBracket__Group__2();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__1"


    // $ANTLR start "rule__CSSRuleBracket__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4347:1: rule__CSSRuleBracket__Group__1__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4351:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4352:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4352:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4353:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__CSSRuleBracket__Group__1__Impl8701); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__CSSRuleBracket__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4366:1: rule__CSSRuleBracket__Group__2 : rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 ;
    public final void rule__CSSRuleBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4370:1: ( rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4371:2: rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__28732);
            rule__CSSRuleBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__28735);
            rule__CSSRuleBracket__Group__3();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__2"


    // $ANTLR start "rule__CSSRuleBracket__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4378:1: rule__CSSRuleBracket__Group__2__Impl : ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4382:1: ( ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4383:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4383:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4384:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4385:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4385:2: rule__CSSRuleBracket__InnerAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl8762);
            rule__CSSRuleBracket__InnerAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
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
    // $ANTLR end "rule__CSSRuleBracket__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4395:1: rule__CSSRuleBracket__Group__3 : rule__CSSRuleBracket__Group__3__Impl ;
    public final void rule__CSSRuleBracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4399:1: ( rule__CSSRuleBracket__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4400:2: rule__CSSRuleBracket__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__38792);
            rule__CSSRuleBracket__Group__3__Impl();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__3"


    // $ANTLR start "rule__CSSRuleBracket__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4406:1: rule__CSSRuleBracket__Group__3__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4410:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4411:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4411:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4412:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__CSSRuleBracket__Group__3__Impl8820); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__CSSRuleBracket__Group__3__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4433:1: rule__CSSRulePrimary__Group_6__0 : rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 ;
    public final void rule__CSSRulePrimary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4437:1: ( rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4438:2: rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__0__Impl_in_rule__CSSRulePrimary__Group_6__08859);
            rule__CSSRulePrimary__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__1_in_rule__CSSRulePrimary__Group_6__08862);
            rule__CSSRulePrimary__Group_6__1();

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4445:1: rule__CSSRulePrimary__Group_6__0__Impl : ( () ) ;
    public final void rule__CSSRulePrimary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4449:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4450:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4450:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4451:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4452:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4454:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4464:1: rule__CSSRulePrimary__Group_6__1 : rule__CSSRulePrimary__Group_6__1__Impl ;
    public final void rule__CSSRulePrimary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4468:1: ( rule__CSSRulePrimary__Group_6__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4469:2: rule__CSSRulePrimary__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__1__Impl_in_rule__CSSRulePrimary__Group_6__18920);
            rule__CSSRulePrimary__Group_6__1__Impl();

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4475:1: rule__CSSRulePrimary__Group_6__1__Impl : ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) ;
    public final void rule__CSSRulePrimary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4479:1: ( ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4480:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4480:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4481:1: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4482:1: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4482:2: rule__CSSRulePrimary__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__ValueAssignment_6_1_in_rule__CSSRulePrimary__Group_6__1__Impl8947);
            rule__CSSRulePrimary__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4496:1: rule__CSSRuleRegex__Group__0 : rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 ;
    public final void rule__CSSRuleRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4500:1: ( rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4501:2: rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__0__Impl_in_rule__CSSRuleRegex__Group__08981);
            rule__CSSRuleRegex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__1_in_rule__CSSRuleRegex__Group__08984);
            rule__CSSRuleRegex__Group__1();

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
    // $ANTLR end "rule__CSSRuleRegex__Group__0"


    // $ANTLR start "rule__CSSRuleRegex__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4508:1: rule__CSSRuleRegex__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4512:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4513:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4513:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4514:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4515:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4517:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4527:1: rule__CSSRuleRegex__Group__1 : rule__CSSRuleRegex__Group__1__Impl ;
    public final void rule__CSSRuleRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4531:1: ( rule__CSSRuleRegex__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4532:2: rule__CSSRuleRegex__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__1__Impl_in_rule__CSSRuleRegex__Group__19042);
            rule__CSSRuleRegex__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleRegex__Group__1"


    // $ANTLR start "rule__CSSRuleRegex__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4538:1: rule__CSSRuleRegex__Group__1__Impl : ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) ;
    public final void rule__CSSRuleRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4542:1: ( ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4543:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4543:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4544:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4545:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4545:2: rule__CSSRuleRegex__RegexAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__RegexAssignment_1_in_rule__CSSRuleRegex__Group__1__Impl9069);
            rule__CSSRuleRegex__RegexAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleRegex__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4559:1: rule__CSSRuleLiteral__Group__0 : rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 ;
    public final void rule__CSSRuleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4563:1: ( rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4564:2: rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__0__Impl_in_rule__CSSRuleLiteral__Group__09103);
            rule__CSSRuleLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__1_in_rule__CSSRuleLiteral__Group__09106);
            rule__CSSRuleLiteral__Group__1();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4571:1: rule__CSSRuleLiteral__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4575:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4576:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4576:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4577:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4578:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4580:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4590:1: rule__CSSRuleLiteral__Group__1 : rule__CSSRuleLiteral__Group__1__Impl ;
    public final void rule__CSSRuleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4594:1: ( rule__CSSRuleLiteral__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4595:2: rule__CSSRuleLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__1__Impl_in_rule__CSSRuleLiteral__Group__19164);
            rule__CSSRuleLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4601:1: rule__CSSRuleLiteral__Group__1__Impl : ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) ;
    public final void rule__CSSRuleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4605:1: ( ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4606:1: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4606:1: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4607:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4608:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4608:2: rule__CSSRuleLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Group__1__Impl9191);
            rule__CSSRuleLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4622:1: rule__CSSRuleSymbol__Group__0 : rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 ;
    public final void rule__CSSRuleSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4626:1: ( rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4627:2: rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__0__Impl_in_rule__CSSRuleSymbol__Group__09225);
            rule__CSSRuleSymbol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__1_in_rule__CSSRuleSymbol__Group__09228);
            rule__CSSRuleSymbol__Group__1();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__0"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4634:1: rule__CSSRuleSymbol__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4638:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4639:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4639:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4640:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4641:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4643:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4653:1: rule__CSSRuleSymbol__Group__1 : rule__CSSRuleSymbol__Group__1__Impl ;
    public final void rule__CSSRuleSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4657:1: ( rule__CSSRuleSymbol__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4658:2: rule__CSSRuleSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__1__Impl_in_rule__CSSRuleSymbol__Group__19286);
            rule__CSSRuleSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__1"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4664:1: rule__CSSRuleSymbol__Group__1__Impl : ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) ) ;
    public final void rule__CSSRuleSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4668:1: ( ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4669:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4669:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4670:1: ( rule__CSSRuleSymbol__SymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4671:1: ( rule__CSSRuleSymbol__SymbolAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4671:2: rule__CSSRuleSymbol__SymbolAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__SymbolAssignment_1_in_rule__CSSRuleSymbol__Group__1__Impl9313);
            rule__CSSRuleSymbol__SymbolAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleSymbol__Group__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4685:1: rule__CSSDefaultValue__Group_0__0 : rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 ;
    public final void rule__CSSDefaultValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4689:1: ( rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4690:2: rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__0__Impl_in_rule__CSSDefaultValue__Group_0__09347);
            rule__CSSDefaultValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__1_in_rule__CSSDefaultValue__Group_0__09350);
            rule__CSSDefaultValue__Group_0__1();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4697:1: rule__CSSDefaultValue__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSDefaultValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4701:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4702:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4702:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4703:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4704:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4706:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4716:1: rule__CSSDefaultValue__Group_0__1 : rule__CSSDefaultValue__Group_0__1__Impl ;
    public final void rule__CSSDefaultValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4720:1: ( rule__CSSDefaultValue__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4721:2: rule__CSSDefaultValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__1__Impl_in_rule__CSSDefaultValue__Group_0__19408);
            rule__CSSDefaultValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4727:1: rule__CSSDefaultValue__Group_0__1__Impl : ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) ;
    public final void rule__CSSDefaultValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4731:1: ( ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4732:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4732:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4733:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4734:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4734:2: rule__CSSDefaultValue__ValAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__ValAssignment_0_1_in_rule__CSSDefaultValue__Group_0__1__Impl9435);
            rule__CSSDefaultValue__ValAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1__Impl"


    // $ANTLR start "rule__CssExtension__ImportsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4749:1: rule__CssExtension__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4753:1: ( ( ruleImport ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4754:1: ( ruleImport )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4754:1: ( ruleImport )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4755:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_09474);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CssExtension__ImportsAssignment_0"


    // $ANTLR start "rule__CssExtension__PackageDefAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4764:1: rule__CssExtension__PackageDefAssignment_1 : ( rulePackageDefinition ) ;
    public final void rule__CssExtension__PackageDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4768:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4769:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4769:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4770:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_19505);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CssExtension__PackageDefAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4779:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4783:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4784:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4784:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4785:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_19536);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4794:1: rule__PackageDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4798:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4799:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4799:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4800:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_19567);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PackageDefinition__NameAssignment_1"


    // $ANTLR start "rule__PackageDefinition__RulesAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4809:1: rule__PackageDefinition__RulesAssignment_3_0 : ( ruleCSSRuleDefinition ) ;
    public final void rule__PackageDefinition__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4813:1: ( ( ruleCSSRuleDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4814:1: ( ruleCSSRuleDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4814:1: ( ruleCSSRuleDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4815:1: ruleCSSRuleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_09598);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__PackageDefinition__RulesAssignment_3_0"


    // $ANTLR start "rule__PackageDefinition__SubpackagesAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4824:1: rule__PackageDefinition__SubpackagesAssignment_3_1 : ( rulePackageDefinition ) ;
    public final void rule__PackageDefinition__SubpackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4828:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4829:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4829:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4830:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_19629);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__PackageDefinition__SubpackagesAssignment_3_1"


    // $ANTLR start "rule__PackageDefinition__ElementsAssignment_3_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4839:1: rule__PackageDefinition__ElementsAssignment_3_2 : ( ruleElementDefinition ) ;
    public final void rule__PackageDefinition__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4843:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4844:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4844:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4845:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__PackageDefinition__ElementsAssignment_3_29660);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__PackageDefinition__ElementsAssignment_3_2"


    // $ANTLR start "rule__Doku__ContentAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4854:1: rule__Doku__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Doku__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4858:1: ( ( RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4859:1: ( RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4859:1: ( RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4860:1: RULE_JDOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }
            match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment9691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Doku__ContentAssignment"


    // $ANTLR start "rule__CSSType__TypeAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4869:1: rule__CSSType__TypeAssignment_0_1 : ( ( 'int' ) ) ;
    public final void rule__CSSType__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4873:1: ( ( ( 'int' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4874:1: ( ( 'int' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4874:1: ( ( 'int' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4875:1: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4876:1: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4877:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__CSSType__TypeAssignment_0_19727); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_0_1"


    // $ANTLR start "rule__CSSType__FromAssignment_0_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4892:1: rule__CSSType__FromAssignment_0_4 : ( RULE_INT ) ;
    public final void rule__CSSType__FromAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4896:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4897:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4897:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4898:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSType__FromAssignment_0_49766); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_4_0()); 
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
    // $ANTLR end "rule__CSSType__FromAssignment_0_4"


    // $ANTLR start "rule__CSSType__ToAssignment_0_8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4907:1: rule__CSSType__ToAssignment_0_8 : ( RULE_INT ) ;
    public final void rule__CSSType__ToAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4911:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4912:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4912:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4913:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_8_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSType__ToAssignment_0_89797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_8_0()); 
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
    // $ANTLR end "rule__CSSType__ToAssignment_0_8"


    // $ANTLR start "rule__CSSType__TypeAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4922:1: rule__CSSType__TypeAssignment_1_1 : ( ( 'double' ) ) ;
    public final void rule__CSSType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4926:1: ( ( ( 'double' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4927:1: ( ( 'double' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4927:1: ( ( 'double' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4928:1: ( 'double' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4929:1: ( 'double' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4930:1: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__CSSType__TypeAssignment_1_19833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_1_1"


    // $ANTLR start "rule__CSSType__FromAssignment_1_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4945:1: rule__CSSType__FromAssignment_1_4 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__FromAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4949:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4950:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4950:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4951:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_4_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSType__FromAssignment_1_49872); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_4_0()); 
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
    // $ANTLR end "rule__CSSType__FromAssignment_1_4"


    // $ANTLR start "rule__CSSType__ToAssignment_1_8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4960:1: rule__CSSType__ToAssignment_1_8 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__ToAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4964:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4965:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4965:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4966:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_8_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSType__ToAssignment_1_89903); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_8_0()); 
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
    // $ANTLR end "rule__CSSType__ToAssignment_1_8"


    // $ANTLR start "rule__CSSType__TypeAssignment_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4975:1: rule__CSSType__TypeAssignment_2_0 : ( ( 'int' ) ) ;
    public final void rule__CSSType__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4979:1: ( ( ( 'int' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4980:1: ( ( 'int' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4980:1: ( ( 'int' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4981:1: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4982:1: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4983:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__CSSType__TypeAssignment_2_09939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_2_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4998:1: rule__CSSType__TypeAssignment_3_0 : ( ( 'double' ) ) ;
    public final void rule__CSSType__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5002:1: ( ( ( 'double' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5003:1: ( ( 'double' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5003:1: ( ( 'double' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5004:1: ( 'double' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5005:1: ( 'double' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5006:1: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__CSSType__TypeAssignment_3_09983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_3_0"


    // $ANTLR start "rule__ElementDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5021:1: rule__ElementDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__ElementDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5025:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5026:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5026:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5027:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__ElementDefinition__DokuAssignment_110022);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ElementDefinition__DokuAssignment_1"


    // $ANTLR start "rule__ElementDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5036:1: rule__ElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5040:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5041:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5041:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5042:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__NameAssignment_210053);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ElementDefinition__NameAssignment_2"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5051:1: rule__ElementDefinition__SuperAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5055:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5056:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5056:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5057:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5058:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5059:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_110088);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_1"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5070:1: rule__ElementDefinition__SuperAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5074:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5075:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5075:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5076:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5077:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5078:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_2_110127);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
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
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_2_1"


    // $ANTLR start "rule__ElementDefinition__PropertiesAssignment_5_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5089:1: rule__ElementDefinition__PropertiesAssignment_5_0 : ( rulePropertyDefinition ) ;
    public final void rule__ElementDefinition__PropertiesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5093:1: ( ( rulePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5094:1: ( rulePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5094:1: ( rulePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5095:1: rulePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__ElementDefinition__PropertiesAssignment_5_010162);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_5_0_0()); 
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
    // $ANTLR end "rule__ElementDefinition__PropertiesAssignment_5_0"


    // $ANTLR start "rule__ElementDefinition__PseudoClassesAssignment_5_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5104:1: rule__ElementDefinition__PseudoClassesAssignment_5_1 : ( rulePseudoClassDefinition ) ;
    public final void rule__ElementDefinition__PseudoClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5108:1: ( ( rulePseudoClassDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5109:1: ( rulePseudoClassDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5109:1: ( rulePseudoClassDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5110:1: rulePseudoClassDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_rule__ElementDefinition__PseudoClassesAssignment_5_110193);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__ElementDefinition__PseudoClassesAssignment_5_1"


    // $ANTLR start "rule__PropertyDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5119:1: rule__PropertyDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PropertyDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5123:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5124:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5124:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5125:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_110224);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5134:1: rule__PropertyDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5138:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5139:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5139:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5140:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_210255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__RuleAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5149:1: rule__PropertyDefinition__RuleAssignment_3 : ( ruleCSSRuleOr ) ;
    public final void rule__PropertyDefinition__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5153:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5154:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5154:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5155:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_310286);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__RuleAssignment_3"


    // $ANTLR start "rule__PropertyDefinition__DefaultAssignment_4_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5164:1: rule__PropertyDefinition__DefaultAssignment_4_1 : ( ruleCSSDefaultValue ) ;
    public final void rule__PropertyDefinition__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5168:1: ( ( ruleCSSDefaultValue ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5169:1: ( ruleCSSDefaultValue )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5169:1: ( ruleCSSDefaultValue )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5170:1: ruleCSSDefaultValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_4_110317);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__DefaultAssignment_4_1"


    // $ANTLR start "rule__PseudoClassDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5179:1: rule__PseudoClassDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PseudoClassDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5183:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5184:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5184:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5185:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_110348);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PseudoClassDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5194:1: rule__PseudoClassDefinition__NameAssignment_2 : ( RULE_PSEUDO ) ;
    public final void rule__PseudoClassDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5198:1: ( ( RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5199:1: ( RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5199:1: ( RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5200:1: RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }
            match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_210379); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleId__NameAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5209:1: rule__CSSRuleId__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__CSSRuleId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5213:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5214:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5214:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5215:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment10410);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleId__NameAssignment"


    // $ANTLR start "rule__CSSRuleRef__RefAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5224:1: rule__CSSRuleRef__RefAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5228:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5229:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5229:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5230:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5231:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5232:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_110445);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
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
    // $ANTLR end "rule__CSSRuleRef__RefAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__DokuAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5243:1: rule__CSSRuleDefinition__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleDefinition__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5247:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5248:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5248:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5249:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_010480);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__DokuAssignment_0"


    // $ANTLR start "rule__CSSRuleDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5258:1: rule__CSSRuleDefinition__NameAssignment_1 : ( ruleCSSRuleId ) ;
    public final void rule__CSSRuleDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5262:1: ( ( ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5263:1: ( ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5263:1: ( ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5264:1: ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_110511);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__RuleAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5273:1: rule__CSSRuleDefinition__RuleAssignment_3_0 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleDefinition__RuleAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5277:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5278:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5278:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5279:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RuleAssignment_3_010542);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__RuleAssignment_3_0"


    // $ANTLR start "rule__CSSRuleDefinition__FuncAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5288:1: rule__CSSRuleDefinition__FuncAssignment_3_1 : ( ruleCSSRuleFunc ) ;
    public final void rule__CSSRuleDefinition__FuncAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5292:1: ( ( ruleCSSRuleFunc ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5293:1: ( ruleCSSRuleFunc )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5293:1: ( ruleCSSRuleFunc )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5294:1: ruleCSSRuleFunc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_rule__CSSRuleDefinition__FuncAssignment_3_110573);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__FuncAssignment_3_1"


    // $ANTLR start "rule__CSSRuleFunc__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5303:1: rule__CSSRuleFunc__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__CSSRuleFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5307:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5308:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5308:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5309:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__CSSRuleFunc__NameAssignment_110604);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleFunc__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleFunc__ParamsAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5318:1: rule__CSSRuleFunc__ParamsAssignment_4 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleFunc__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5322:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5323:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5323:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5324:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleFunc__ParamsAssignment_410635);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__CSSRuleFunc__ParamsAssignment_4"


    // $ANTLR start "rule__CSSRuleOr__OrsAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5333:1: rule__CSSRuleOr__OrsAssignment_1_1_1 : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__OrsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5337:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5338:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5338:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5339:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_110666);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleOr__OrsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleXor__XorsAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5348:1: rule__CSSRuleXor__XorsAssignment_1_1_1 : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__XorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5352:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5353:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5353:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5354:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_110697);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleXor__XorsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleConcat__ConcAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5363:1: rule__CSSRuleConcat__ConcAssignment_1_1 : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5367:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5368:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5368:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5369:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_110728);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleConcat__ConcAssignment_1_1"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5378:1: rule__CSSRulePostfix__CardinalityAssignment_1_1 : ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__CSSRulePostfix__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5382:1: ( ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5383:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5383:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5384:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5385:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5385:2: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_110759);
            rule__CSSRulePostfix__CardinalityAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAssignment_1_1"


    // $ANTLR start "rule__CSSRuleBracket__InnerAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5394:1: rule__CSSRuleBracket__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleBracket__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5398:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5399:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5399:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5400:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_210792);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSRuleBracket__InnerAssignment_2"


    // $ANTLR start "rule__CSSRulePrimary__ValueAssignment_6_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5409:1: rule__CSSRulePrimary__ValueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__CSSRulePrimary__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5413:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5414:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5414:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5415:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSRulePrimary__ValueAssignment_6_110823); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__CSSRulePrimary__ValueAssignment_6_1"


    // $ANTLR start "rule__CSSRuleRegex__RegexAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5424:1: rule__CSSRuleRegex__RegexAssignment_1 : ( RULE_REGEX ) ;
    public final void rule__CSSRuleRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5428:1: ( ( RULE_REGEX ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5429:1: ( RULE_REGEX )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5429:1: ( RULE_REGEX )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5430:1: RULE_REGEX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_rule__CSSRuleRegex__RegexAssignment_110854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleRegex__RegexAssignment_1"


    // $ANTLR start "rule__CSSRuleLiteral__ValueAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5439:1: rule__CSSRuleLiteral__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5443:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5444:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5444:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5445:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_110885); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__ValueAssignment_1"


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5454:1: rule__CSSRuleSymbol__SymbolAssignment_1 : ( ( rule__CSSRuleSymbol__SymbolAlternatives_1_0 ) ) ;
    public final void rule__CSSRuleSymbol__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5458:1: ( ( ( rule__CSSRuleSymbol__SymbolAlternatives_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5459:1: ( ( rule__CSSRuleSymbol__SymbolAlternatives_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5459:1: ( ( rule__CSSRuleSymbol__SymbolAlternatives_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5460:1: ( rule__CSSRuleSymbol__SymbolAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAlternatives_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5461:1: ( rule__CSSRuleSymbol__SymbolAlternatives_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5461:2: rule__CSSRuleSymbol__SymbolAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__SymbolAlternatives_1_0_in_rule__CSSRuleSymbol__SymbolAssignment_110916);
            rule__CSSRuleSymbol__SymbolAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAlternatives_1_0()); 
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
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__ValAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5470:1: rule__CSSDefaultValue__ValAssignment_0_1 : ( ruleCSSRuleLiteral ) ;
    public final void rule__CSSDefaultValue__ValAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5474:1: ( ( ruleCSSRuleLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5475:1: ( ruleCSSRuleLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5475:1: ( ruleCSSRuleLiteral )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5476:1: ruleCSSRuleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__ValAssignment_0_110949);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__ValAssignment_0_1"


    // $ANTLR start "rule__CSSDefaultValue__IvalAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5485:1: rule__CSSDefaultValue__IvalAssignment_1 : ( RULE_INT ) ;
    public final void rule__CSSDefaultValue__IvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5489:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5490:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5490:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5491:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__IvalAssignment_110980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__IvalAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__DvalAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5500:1: rule__CSSDefaultValue__DvalAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__CSSDefaultValue__DvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5504:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5505:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5505:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5506:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSDefaultValue__DvalAssignment_211011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__DvalAssignment_2"


    // $ANTLR start "rule__CSSDefaultValue__SvalAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5515:1: rule__CSSDefaultValue__SvalAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CSSDefaultValue__SvalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5519:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5520:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5520:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5521:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__SvalAssignment_311042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__SvalAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\10\uffff";
    static final String DFA1_eofS =
        "\10\uffff";
    static final String DFA1_minS =
        "\2\4\1\25\1\uffff\1\4\2\uffff\1\25";
    static final String DFA1_maxS =
        "\1\26\1\4\1\41\1\uffff\1\4\2\uffff\1\41";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\1\17\uffff\1\3",
            "\1\2",
            "\1\4\1\uffff\1\5\4\uffff\1\5\4\uffff\1\6",
            "",
            "\1\7",
            "",
            "",
            "\1\4\1\uffff\1\5\4\uffff\1\5\4\uffff\1\6"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "885:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleCssExtension_in_entryRuleCssExtension67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssExtension74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0_in_ruleCssExtension100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDefinition373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__0_in_rulePackageDefinition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_entryRuleDoku426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoku433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doku__ContentAssignment_in_ruleDoku459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_ruleCSSBaseType528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_entryRuleCSSType559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSType566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Alternatives_in_ruleCSSType596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__0_in_ruleElementDefinition656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0_in_rulePseudoClassDefinition776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleId810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0_in_ruleCSSRuleDefinition974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleFunc1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__0_in_ruleCSSRuleFunc1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRegex1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__0_in_ruleCSSRuleRegex1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__0_in_ruleCSSRuleLiteral1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleSymbol1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__0_in_ruleCSSRuleSymbol1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__0_in_rule__CSSType__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__0_in_rule__CSSType__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_2__0_in_rule__CSSType__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_3__0_in_rule__CSSType__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__PropertiesAssignment_5_0_in_rule__ElementDefinition__Alternatives_51898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__PseudoClassesAssignment_5_1_in_rule__ElementDefinition__Alternatives_51916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__RuleAssignment_3_0_in_rule__CSSRuleDefinition__Alternatives_31949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__FuncAssignment_3_1_in_rule__CSSRuleDefinition__Alternatives_31967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimary__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_rule__CSSRulePrimary__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_rule__CSSRulePrimary__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__0_in_rule__CSSRulePrimary__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CSSRuleSymbol__SymbolAlternatives_1_02211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CSSRuleSymbol__SymbolAlternatives_1_02231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__0_in_rule__CSSDefaultValue__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__IvalAssignment_1_in_rule__CSSDefaultValue__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__DvalAssignment_2_in_rule__CSSDefaultValue__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__SvalAssignment_3_in_rule__CSSDefaultValue__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__02350 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__02353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl2380 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__12411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Import__Group__0__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02596 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2682 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02841 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02962 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__03087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDefinition__Group__0__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__13149 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__13152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__23209 = new BitSet(new long[]{0x0000000001400050L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__23212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageDefinition__Group__2__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__33271 = new BitSet(new long[]{0x0000000001400050L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__33274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl3301 = new BitSet(new long[]{0x0000000000400052L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__43332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PackageDefinition__Group__4__Impl3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__0__Impl_in_rule__CSSType__Group_0__03401 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__1_in_rule__CSSType__Group_0__03404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__1__Impl_in_rule__CSSType__Group_0__13462 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__2_in_rule__CSSType__Group_0__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_0_1_in_rule__CSSType__Group_0__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__2__Impl_in_rule__CSSType__Group_0__23522 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__3_in_rule__CSSType__Group_0__23525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSType__Group_0__2__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__3__Impl_in_rule__CSSType__Group_0__33584 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__4_in_rule__CSSType__Group_0__33587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__3__Impl3615 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__4__Impl_in_rule__CSSType__Group_0__43646 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__5_in_rule__CSSType__Group_0__43649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__FromAssignment_0_4_in_rule__CSSType__Group_0__4__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__5__Impl_in_rule__CSSType__Group_0__53706 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__6_in_rule__CSSType__Group_0__53709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__5__Impl3737 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__6__Impl_in_rule__CSSType__Group_0__63768 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__7_in_rule__CSSType__Group_0__63771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CSSType__Group_0__6__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__7__Impl_in_rule__CSSType__Group_0__73830 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__8_in_rule__CSSType__Group_0__73833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__7__Impl3861 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__8__Impl_in_rule__CSSType__Group_0__83892 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__9_in_rule__CSSType__Group_0__83895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__ToAssignment_0_8_in_rule__CSSType__Group_0__8__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__9__Impl_in_rule__CSSType__Group_0__93952 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__10_in_rule__CSSType__Group_0__93955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__9__Impl3983 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__10__Impl_in_rule__CSSType__Group_0__104014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CSSType__Group_0__10__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__0__Impl_in_rule__CSSType__Group_1__04095 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__1_in_rule__CSSType__Group_1__04098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__1__Impl_in_rule__CSSType__Group_1__14156 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__2_in_rule__CSSType__Group_1__14159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_1_1_in_rule__CSSType__Group_1__1__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__2__Impl_in_rule__CSSType__Group_1__24216 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__3_in_rule__CSSType__Group_1__24219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSType__Group_1__2__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__3__Impl_in_rule__CSSType__Group_1__34278 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__4_in_rule__CSSType__Group_1__34281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__3__Impl4309 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__4__Impl_in_rule__CSSType__Group_1__44340 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__5_in_rule__CSSType__Group_1__44343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__FromAssignment_1_4_in_rule__CSSType__Group_1__4__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__5__Impl_in_rule__CSSType__Group_1__54400 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__6_in_rule__CSSType__Group_1__54403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__5__Impl4431 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__6__Impl_in_rule__CSSType__Group_1__64462 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__7_in_rule__CSSType__Group_1__64465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CSSType__Group_1__6__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__7__Impl_in_rule__CSSType__Group_1__74524 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__8_in_rule__CSSType__Group_1__74527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__7__Impl4555 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__8__Impl_in_rule__CSSType__Group_1__84586 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__9_in_rule__CSSType__Group_1__84589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__ToAssignment_1_8_in_rule__CSSType__Group_1__8__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__9__Impl_in_rule__CSSType__Group_1__94646 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__10_in_rule__CSSType__Group_1__94649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__9__Impl4677 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__10__Impl_in_rule__CSSType__Group_1__104708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CSSType__Group_1__10__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_2__0__Impl_in_rule__CSSType__Group_2__04789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_2__1_in_rule__CSSType__Group_2__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_2_0_in_rule__CSSType__Group_2__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_2__1__Impl_in_rule__CSSType__Group_2__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_2__1__Impl4877 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_3__0__Impl_in_rule__CSSType__Group_3__04912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_3__1_in_rule__CSSType__Group_3__04915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_3_0_in_rule__CSSType__Group_3__0__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_3__1__Impl_in_rule__CSSType__Group_3__14972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_3__1__Impl5000 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__0__Impl_in_rule__ElementDefinition__Group__05035 = new BitSet(new long[]{0x0000000000400050L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__1_in_rule__ElementDefinition__Group__05038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__1__Impl_in_rule__ElementDefinition__Group__15096 = new BitSet(new long[]{0x0000000000400050L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__2_in_rule__ElementDefinition__Group__15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__DokuAssignment_1_in_rule__ElementDefinition__Group__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__2__Impl_in_rule__ElementDefinition__Group__25157 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__3_in_rule__ElementDefinition__Group__25160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__NameAssignment_2_in_rule__ElementDefinition__Group__2__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__3__Impl_in_rule__ElementDefinition__Group__35217 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__4_in_rule__ElementDefinition__Group__35220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__0_in_rule__ElementDefinition__Group__3__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__4__Impl_in_rule__ElementDefinition__Group__45278 = new BitSet(new long[]{0x0000000001000250L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__5_in_rule__ElementDefinition__Group__45281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ElementDefinition__Group__4__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__5__Impl_in_rule__ElementDefinition__Group__55340 = new BitSet(new long[]{0x0000000001000250L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__6_in_rule__ElementDefinition__Group__55343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Alternatives_5_in_rule__ElementDefinition__Group__5__Impl5370 = new BitSet(new long[]{0x0000000000000252L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__6__Impl_in_rule__ElementDefinition__Group__65401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ElementDefinition__Group__6__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__0__Impl_in_rule__ElementDefinition__Group_3__05474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__1_in_rule__ElementDefinition__Group_3__05477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ElementDefinition__Group_3__0__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__1__Impl_in_rule__ElementDefinition__Group_3__15536 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__2_in_rule__ElementDefinition__Group_3__15539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__SuperAssignment_3_1_in_rule__ElementDefinition__Group_3__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__2__Impl_in_rule__ElementDefinition__Group_3__25596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__0_in_rule__ElementDefinition__Group_3__2__Impl5623 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__0__Impl_in_rule__ElementDefinition__Group_3_2__05660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__1_in_rule__ElementDefinition__Group_3_2__05663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ElementDefinition__Group_3_2__0__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__1__Impl_in_rule__ElementDefinition__Group_3_2__15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__SuperAssignment_3_2_1_in_rule__ElementDefinition__Group_3_2__1__Impl5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__05783 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__05786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__15844 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__15847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DokuAssignment_1_in_rule__PropertyDefinition__Group__1__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__25905 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__25908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35965 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__RuleAssignment_3_in_rule__PropertyDefinition__Group__3__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__46025 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__46028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__56086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PropertyDefinition__Group__5__Impl6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__06157 = new BitSet(new long[]{0x0000000000000990L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__06160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PropertyDefinition__Group_4__0__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__16219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultAssignment_4_1_in_rule__PropertyDefinition__Group_4__1__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__06280 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__06283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__16341 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__2_in_rule__PseudoClassDefinition__Group__16344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__DokuAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__2__Impl_in_rule__PseudoClassDefinition__Group__26402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__NameAssignment_2_in_rule__PseudoClassDefinition__Group__2__Impl6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__06465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__06468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CSSRuleRef__Group__0__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__16527 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__16530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__26587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CSSRuleRef__Group__2__Impl6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__06652 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__06655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__DokuAssignment_0_in_rule__CSSRuleDefinition__Group__0__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__16713 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__16716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__NameAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__26773 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__26776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CSSRuleDefinition__Group__2__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__36835 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__36838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Alternatives_3_in_rule__CSSRuleDefinition__Group__3__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__46895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CSSRuleDefinition__Group__4__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__0__Impl_in_rule__CSSRuleFunc__Group__06964 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__1_in_rule__CSSRuleFunc__Group__06967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__1__Impl_in_rule__CSSRuleFunc__Group__17025 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__2_in_rule__CSSRuleFunc__Group__17028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__NameAssignment_1_in_rule__CSSRuleFunc__Group__1__Impl7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__2__Impl_in_rule__CSSRuleFunc__Group__27085 = new BitSet(new long[]{0x000000D0800C04B0L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__3_in_rule__CSSRuleFunc__Group__27088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSRuleFunc__Group__2__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__3__Impl_in_rule__CSSRuleFunc__Group__37147 = new BitSet(new long[]{0x000000D0800C04B0L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__4_in_rule__CSSRuleFunc__Group__37150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSRuleFunc__Group__3__Impl7178 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__4__Impl_in_rule__CSSRuleFunc__Group__47209 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__5_in_rule__CSSRuleFunc__Group__47212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__ParamsAssignment_4_in_rule__CSSRuleFunc__Group__4__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__5__Impl_in_rule__CSSRuleFunc__Group__57269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CSSRuleFunc__Group__5__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__07340 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__17399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__07461 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__07464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__17522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7551 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7563 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__07600 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__07603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CSSRuleOr__Group_1_1__0__Impl7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__17662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__07723 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__07726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__17782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__07844 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__07847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__17905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7934 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7946 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__07983 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__07986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CSSRuleXor__Group_1_1__0__Impl8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__18045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__08106 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__08109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__18165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__08227 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__08230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__18288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8317 = new BitSet(new long[]{0x000000D0800C0492L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8329 = new BitSet(new long[]{0x000000D0800C0492L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__08366 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__08369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__18425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__08487 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__08490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__18548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__08609 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__08612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__18670 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__18673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CSSRuleBracket__Group__1__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__28732 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__28735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__38792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CSSRuleBracket__Group__3__Impl8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__0__Impl_in_rule__CSSRulePrimary__Group_6__08859 = new BitSet(new long[]{0x000000D0800C0490L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__1_in_rule__CSSRulePrimary__Group_6__08862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__1__Impl_in_rule__CSSRulePrimary__Group_6__18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__ValueAssignment_6_1_in_rule__CSSRulePrimary__Group_6__1__Impl8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__0__Impl_in_rule__CSSRuleRegex__Group__08981 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__1_in_rule__CSSRuleRegex__Group__08984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__1__Impl_in_rule__CSSRuleRegex__Group__19042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__RegexAssignment_1_in_rule__CSSRuleRegex__Group__1__Impl9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__0__Impl_in_rule__CSSRuleLiteral__Group__09103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__1_in_rule__CSSRuleLiteral__Group__09106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__1__Impl_in_rule__CSSRuleLiteral__Group__19164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Group__1__Impl9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__0__Impl_in_rule__CSSRuleSymbol__Group__09225 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__1_in_rule__CSSRuleSymbol__Group__09228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__1__Impl_in_rule__CSSRuleSymbol__Group__19286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__SymbolAssignment_1_in_rule__CSSRuleSymbol__Group__1__Impl9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__0__Impl_in_rule__CSSDefaultValue__Group_0__09347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__1_in_rule__CSSDefaultValue__Group_0__09350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__1__Impl_in_rule__CSSDefaultValue__Group_0__19408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__ValAssignment_0_1_in_rule__CSSDefaultValue__Group_0__1__Impl9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_09474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_19505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_19536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_19567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_09598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_19629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__PackageDefinition__ElementsAssignment_3_29660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CSSType__TypeAssignment_0_19727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSType__FromAssignment_0_49766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSType__ToAssignment_0_89797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CSSType__TypeAssignment_1_19833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSType__FromAssignment_1_49872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSType__ToAssignment_1_89903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CSSType__TypeAssignment_2_09939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CSSType__TypeAssignment_3_09983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__ElementDefinition__DokuAssignment_110022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__NameAssignment_210053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_110088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_2_110127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__ElementDefinition__PropertiesAssignment_5_010162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_rule__ElementDefinition__PseudoClassesAssignment_5_110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_110224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_210255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_310286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_4_110317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_110348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_210379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_110445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_010480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_110511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RuleAssignment_3_010542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_rule__CSSRuleDefinition__FuncAssignment_3_110573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__CSSRuleFunc__NameAssignment_110604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleFunc__ParamsAssignment_410635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_110666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_110697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_110728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_110759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_210792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSRulePrimary__ValueAssignment_6_110823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_rule__CSSRuleRegex__RegexAssignment_110854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_110885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__SymbolAlternatives_1_0_in_rule__CSSRuleSymbol__SymbolAssignment_110916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__ValAssignment_0_110949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__IvalAssignment_110980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSDefaultValue__DvalAssignment_211011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__SvalAssignment_311042 = new BitSet(new long[]{0x0000000000000002L});

}