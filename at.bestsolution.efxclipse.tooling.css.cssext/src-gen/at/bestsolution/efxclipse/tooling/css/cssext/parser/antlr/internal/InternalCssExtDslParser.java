package at.bestsolution.efxclipse.tooling.css.cssext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_JDOC", "RULE_WS", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "'package'", "'{'", "'}'", "'@INT'", "'('", "'->'", "')'", "'@NUM'", "'@STRING'", "'@URL'", "'extends'", "','", "'styleclass'", "'default:'", "';'", "'<'", "'>'", "'='", "'|'", "'||'", "'~'", "'+'", "'?'", "'['", "']'", "'%'", "'substructure'"
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
    public static final int EOF=-1;
    public static final int RULE_REGEX=10;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int RULE_PSEUDO=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=11;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_JDOC=5;
    public static final int RULE_WS=6;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g"; }



     	private CssExtDslGrammarAccess grammarAccess;
     	
        public InternalCssExtDslParser(TokenStream input, CssExtDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CssExtension";	
       	}
       	
       	@Override
       	protected CssExtDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:67:1: entryRuleCssExtension returns [EObject current=null] : iv_ruleCssExtension= ruleCssExtension EOF ;
    public final EObject entryRuleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssExtension = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:68:2: (iv_ruleCssExtension= ruleCssExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:69:2: iv_ruleCssExtension= ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleCssExtension_in_entryRuleCssExtension75);
            iv_ruleCssExtension=ruleCssExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssExtension85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:76:1: ruleCssExtension returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? ) ;
    public final EObject ruleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_packageDef_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleCssExtension131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCssExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:98:3: ( (lv_packageDef_1_0= rulePackageDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:99:1: (lv_packageDef_1_0= rulePackageDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:99:1: (lv_packageDef_1_0= rulePackageDefinition )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:100:3: lv_packageDef_1_0= rulePackageDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackageDefinition_in_ruleCssExtension153);
                    lv_packageDef_1_0=rulePackageDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCssExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"packageDef",
                              		lv_packageDef_1_0, 
                              		"PackageDefinition");
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
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:167:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:168:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:169:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID295);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:176:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:179:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:180:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:195:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:196:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:197:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName401); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:207:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:208:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:208:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:209:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName448);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) && (synpred1_InternalCssExtDsl())) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName476); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName499);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:246:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:247:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:248:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:255:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:258:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:259:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:259:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:260:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:270:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:271:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildCard637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:290:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:291:2: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:292:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDefinition689); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:299:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rules_3_0 = null;

        EObject lv_subpackages_4_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:302:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePackageDefinition726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:307:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:308:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:308:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:309:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDefinition747);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePackageDefinition759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:1: ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )*
            loop5:
            do {
                int alt5=4;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:2: ( (lv_rules_3_0= ruleCSSRuleDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:2: ( (lv_rules_3_0= ruleCSSRuleDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:330:1: (lv_rules_3_0= ruleCSSRuleDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:330:1: (lv_rules_3_0= ruleCSSRuleDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:331:3: lv_rules_3_0= ruleCSSRuleDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition781);
            	    lv_rules_3_0=ruleCSSRuleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_3_0, 
            	              		"CSSRuleDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:348:6: ( (lv_subpackages_4_0= rulePackageDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:348:6: ( (lv_subpackages_4_0= rulePackageDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:349:1: (lv_subpackages_4_0= rulePackageDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:349:1: (lv_subpackages_4_0= rulePackageDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:350:3: lv_subpackages_4_0= rulePackageDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageDefinition_in_rulePackageDefinition808);
            	    lv_subpackages_4_0=rulePackageDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subpackages",
            	              		lv_subpackages_4_0, 
            	              		"PackageDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:367:6: ( (lv_elements_5_0= ruleElementDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:367:6: ( (lv_elements_5_0= ruleElementDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:368:1: (lv_elements_5_0= ruleElementDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:368:1: (lv_elements_5_0= ruleElementDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:369:3: lv_elements_5_0= ruleElementDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementDefinition_in_rulePackageDefinition835);
            	    lv_elements_5_0=ruleElementDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_5_0, 
            	              		"ElementDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_rulePackageDefinition849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:397:1: entryRuleDoku returns [EObject current=null] : iv_ruleDoku= ruleDoku EOF ;
    public final EObject entryRuleDoku() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoku = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:398:2: (iv_ruleDoku= ruleDoku EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:399:2: iv_ruleDoku= ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_entryRuleDoku885);
            iv_ruleDoku=ruleDoku();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoku; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoku895); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:406:1: ruleDoku returns [EObject current=null] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final EObject ruleDoku() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:409:28: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:410:1: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:410:1: ( (lv_content_0_0= RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:411:1: (lv_content_0_0= RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:411:1: (lv_content_0_0= RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:412:3: lv_content_0_0= RULE_JDOC
            {
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_ruleDoku936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_content_0_0, grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDokuRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"content",
                      		lv_content_0_0, 
                      		"JDOC");
              	    
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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:436:1: entryRuleCSSBaseType returns [EObject current=null] : iv_ruleCSSBaseType= ruleCSSBaseType EOF ;
    public final EObject entryRuleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSBaseType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:440:2: (iv_ruleCSSBaseType= ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:441:2: iv_ruleCSSBaseType= ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType982);
            iv_ruleCSSBaseType=ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSBaseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType992); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:451:1: ruleCSSBaseType returns [EObject current=null] : this_CSSType_0= ruleCSSType ;
    public final EObject ruleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject this_CSSType_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:455:28: (this_CSSType_0= ruleCSSType )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:457:5: this_CSSType_0= ruleCSSType
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSType_in_ruleCSSBaseType1042);
            this_CSSType_0=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSType_0; 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:476:1: entryRuleCSSType returns [EObject current=null] : iv_ruleCSSType= ruleCSSType EOF ;
    public final EObject entryRuleCSSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:480:2: (iv_ruleCSSType= ruleCSSType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:481:2: iv_ruleCSSType= ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_entryRuleCSSType1086);
            iv_ruleCSSType=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSType1096); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:491:1: ruleCSSType returns [EObject current=null] : ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) ) ;
    public final EObject ruleCSSType() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_from_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        Token lv_to_10_0=null;
        Token this_WS_11=null;
        Token otherlv_12=null;
        Token this_WS_15=null;
        Token lv_type_16_0=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        Token lv_from_19_0=null;
        Token this_WS_20=null;
        Token otherlv_21=null;
        Token this_WS_22=null;
        Token lv_to_23_0=null;
        Token this_WS_24=null;
        Token otherlv_25=null;
        Token this_WS_27=null;
        Token lv_type_28_0=null;
        Token this_WS_29=null;
        Token lv_type_30_0=null;
        Token this_WS_31=null;
        Token lv_type_32_0=null;
        Token this_WS_33=null;
        Token lv_type_34_0=null;
        Token this_WS_35=null;
        EObject lv_doku_1_0 = null;

        EObject lv_doku_14_0 = null;

        EObject lv_doku_26_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:495:28: ( ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:3: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:497:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:502:2: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_JDOC) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:502:3: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:502:3: ( (lv_doku_1_0= ruleDoku ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:1: (lv_doku_1_0= ruleDoku )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:1: (lv_doku_1_0= ruleDoku )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:504:3: lv_doku_1_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDoku_in_ruleCSSType1157);
                            lv_doku_1_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"doku",
                                      		lv_doku_1_0, 
                                      		"Doku");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:520:2: (this_WS_2= RULE_WS )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==RULE_WS) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:520:3: this_WS_2= RULE_WS
                            	    {
                            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1169); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_2, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:5: ( (lv_type_3_0= '@INT' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:1: (lv_type_3_0= '@INT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:1: (lv_type_3_0= '@INT' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:526:3: lv_type_3_0= '@INT'
                    {
                    lv_type_3_0=(Token)match(input,21,FOLLOW_21_in_ruleCSSType1190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_3_0, grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_3_0, "@INT");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleCSSType1215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:543:1: (this_WS_5= RULE_WS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_WS) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:543:2: this_WS_5= RULE_WS
                    	    {
                    	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1227); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_5, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:547:3: ( (lv_from_6_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:548:1: (lv_from_6_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:548:1: (lv_from_6_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:549:3: lv_from_6_0= RULE_INT
                    {
                    lv_from_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSType1245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_6_0, grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:565:2: (this_WS_7= RULE_WS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_WS) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:565:3: this_WS_7= RULE_WS
                    	    {
                    	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1262); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_7, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleCSSType1275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:573:1: (this_WS_9= RULE_WS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WS) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:573:2: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1287); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_9, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:577:3: ( (lv_to_10_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:578:1: (lv_to_10_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:578:1: (lv_to_10_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:579:3: lv_to_10_0= RULE_INT
                    {
                    lv_to_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSType1305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_10_0, grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_10_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:595:2: (this_WS_11= RULE_WS )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:595:3: this_WS_11= RULE_WS
                    	    {
                    	    this_WS_11=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1322); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_11, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleCSSType1335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:604:6: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:604:6: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:604:7: () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:604:7: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:605:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:610:2: ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_JDOC) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:610:3: ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:610:3: ( (lv_doku_14_0= ruleDoku ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:611:1: (lv_doku_14_0= ruleDoku )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:611:1: (lv_doku_14_0= ruleDoku )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:612:3: lv_doku_14_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDoku_in_ruleCSSType1374);
                            lv_doku_14_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"doku",
                                      		lv_doku_14_0, 
                                      		"Doku");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:628:2: (this_WS_15= RULE_WS )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==RULE_WS) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:628:3: this_WS_15= RULE_WS
                            	    {
                            	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1386); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_15, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:632:5: ( (lv_type_16_0= '@NUM' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:633:1: (lv_type_16_0= '@NUM' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:633:1: (lv_type_16_0= '@NUM' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:634:3: lv_type_16_0= '@NUM'
                    {
                    lv_type_16_0=(Token)match(input,25,FOLLOW_25_in_ruleCSSType1407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_16_0, grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_16_0, "@NUM");
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleCSSType1432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:651:1: (this_WS_18= RULE_WS )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_WS) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:651:2: this_WS_18= RULE_WS
                    	    {
                    	    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1444); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_18, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:655:3: ( (lv_from_19_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:656:1: (lv_from_19_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:656:1: (lv_from_19_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:657:3: lv_from_19_0= RULE_DOUBLE
                    {
                    lv_from_19_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSType1462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_19_0, grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_19_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:673:2: (this_WS_20= RULE_WS )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_WS) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:673:3: this_WS_20= RULE_WS
                    	    {
                    	    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1479); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_20, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,23,FOLLOW_23_in_ruleCSSType1492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:681:1: (this_WS_22= RULE_WS )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:681:2: this_WS_22= RULE_WS
                    	    {
                    	    this_WS_22=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1504); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_22, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:685:3: ( (lv_to_23_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:686:1: (lv_to_23_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:686:1: (lv_to_23_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:687:3: lv_to_23_0= RULE_DOUBLE
                    {
                    lv_to_23_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSType1522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_23_0, grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_23_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:703:2: (this_WS_24= RULE_WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:703:3: this_WS_24= RULE_WS
                    	    {
                    	    this_WS_24=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1539); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_24, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,24,FOLLOW_24_in_ruleCSSType1552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:6: ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:6: ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:7: ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:7: ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_JDOC) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:8: ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:8: ( (lv_doku_26_0= ruleDoku ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:713:1: (lv_doku_26_0= ruleDoku )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:713:1: (lv_doku_26_0= ruleDoku )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:714:3: lv_doku_26_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDoku_in_ruleCSSType1582);
                            lv_doku_26_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"doku",
                                      		lv_doku_26_0, 
                                      		"Doku");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:730:2: (this_WS_27= RULE_WS )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_WS) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:730:3: this_WS_27= RULE_WS
                            	    {
                            	    this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1594); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_27, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_0_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:5: ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) )
                    int alt24=4;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt24=1;
                        }
                        break;
                    case 25:
                        {
                        alt24=2;
                        }
                        break;
                    case 26:
                        {
                        alt24=3;
                        }
                        break;
                    case 27:
                        {
                        alt24=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:6: ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:6: ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:7: ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:7: ( (lv_type_28_0= '@INT' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:735:1: (lv_type_28_0= '@INT' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:735:1: (lv_type_28_0= '@INT' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:736:3: lv_type_28_0= '@INT'
                            {
                            lv_type_28_0=(Token)match(input,21,FOLLOW_21_in_ruleCSSType1617); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_28_0, grammarAccess.getCSSTypeAccess().getTypeINTKeyword_2_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_28_0, "@INT");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:749:2: (this_WS_29= RULE_WS )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_WS) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:749:3: this_WS_29= RULE_WS
                            	    {
                            	    this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1642); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_29, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_0_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:754:6: ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:754:6: ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:754:7: ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:754:7: ( (lv_type_30_0= '@NUM' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:755:1: (lv_type_30_0= '@NUM' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:755:1: (lv_type_30_0= '@NUM' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:756:3: lv_type_30_0= '@NUM'
                            {
                            lv_type_30_0=(Token)match(input,25,FOLLOW_25_in_ruleCSSType1669); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_30_0, grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_2_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_30_0, "@NUM");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:769:2: (this_WS_31= RULE_WS )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==RULE_WS) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:769:3: this_WS_31= RULE_WS
                            	    {
                            	    this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1694); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_31, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:774:6: ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:774:6: ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:774:7: ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:774:7: ( (lv_type_32_0= '@STRING' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:775:1: (lv_type_32_0= '@STRING' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:775:1: (lv_type_32_0= '@STRING' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:776:3: lv_type_32_0= '@STRING'
                            {
                            lv_type_32_0=(Token)match(input,26,FOLLOW_26_in_ruleCSSType1721); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_32_0, grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_2_1_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_32_0, "@STRING");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:789:2: (this_WS_33= RULE_WS )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_WS) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:789:3: this_WS_33= RULE_WS
                            	    {
                            	    this_WS_33=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1746); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_33, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_2_1()); 
                            	          
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
                        case 4 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:794:6: ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:794:6: ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:794:7: ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:794:7: ( (lv_type_34_0= '@URL' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:795:1: (lv_type_34_0= '@URL' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:795:1: (lv_type_34_0= '@URL' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:796:3: lv_type_34_0= '@URL'
                            {
                            lv_type_34_0=(Token)match(input,27,FOLLOW_27_in_ruleCSSType1773); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_34_0, grammarAccess.getCSSTypeAccess().getTypeURLKeyword_2_1_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_34_0, "@URL");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:809:2: (this_WS_35= RULE_WS )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_WS) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:809:3: this_WS_35= RULE_WS
                            	    {
                            	    this_WS_35=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1798); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_35, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_3_1()); 
                            	          
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:824:1: entryRuleElementDefinition returns [EObject current=null] : iv_ruleElementDefinition= ruleElementDefinition EOF ;
    public final EObject entryRuleElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:825:2: (iv_ruleElementDefinition= ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:826:2: iv_ruleElementDefinition= ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition1842);
            iv_ruleElementDefinition=ruleElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition1852); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:833:1: ruleElementDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_styleclass_8_0=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_pseudoClasses_11_0 = null;

        EObject lv_substructures_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:836:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:837:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:837:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:837:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:837:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:838:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:843:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_JDOC) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:844:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:844:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:845:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleElementDefinition1907);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:861:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:862:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:862:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:863:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition1929);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:879:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:879:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleElementDefinition1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:883:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:884:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:884:1: ( ruleQualifiedName )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:885:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition1965);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:898:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==29) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:898:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleElementDefinition1978); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:902:1: ( ( ruleQualifiedName ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:903:1: ( ruleQualifiedName )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:903:1: ( ruleQualifiedName )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:904:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition2001);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:917:6: (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:917:8: otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleElementDefinition2018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:921:1: ( (lv_styleclass_8_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:922:1: (lv_styleclass_8_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:922:1: (lv_styleclass_8_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:923:3: lv_styleclass_8_0= RULE_ID
                    {
                    lv_styleclass_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementDefinition2035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_styleclass_8_0, grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"styleclass",
                              		lv_styleclass_8_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleElementDefinition2054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:943:1: ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )*
            loop30:
            do {
                int alt30=4;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    switch ( input.LA(2) ) {
                    case 44:
                        {
                        alt30=3;
                        }
                        break;
                    case RULE_PSEUDO:
                        {
                        alt30=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt30=1;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ID:
                    {
                    alt30=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt30=2;
                    }
                    break;
                case 44:
                    {
                    alt30=3;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:943:2: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:943:2: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:944:1: (lv_properties_10_0= rulePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:944:1: (lv_properties_10_0= rulePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:945:3: lv_properties_10_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleElementDefinition2076);
            	    lv_properties_10_0=rulePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_10_0, 
            	              		"PropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:962:6: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:962:6: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:963:1: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:963:1: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:964:3: lv_pseudoClasses_11_0= rulePseudoClassDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePseudoClassDefinition_in_ruleElementDefinition2103);
            	    lv_pseudoClasses_11_0=rulePseudoClassDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pseudoClasses",
            	              		lv_pseudoClasses_11_0, 
            	              		"PseudoClassDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:981:6: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:981:6: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:982:1: (lv_substructures_12_0= ruleSubstructure )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:982:1: (lv_substructures_12_0= ruleSubstructure )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:983:3: lv_substructures_12_0= ruleSubstructure
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubstructure_in_ruleElementDefinition2130);
            	    lv_substructures_12_0=ruleSubstructure();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"substructures",
            	              		lv_substructures_12_0, 
            	              		"Substructure");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleElementDefinition2144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1011:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1012:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1013:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition2180);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition2190); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1020:1: rulePropertyDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_3_0 = null;

        EObject lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1023:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1024:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1024:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1024:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1024:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1025:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1030:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_JDOC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1031:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1031:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1032:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePropertyDefinition2245);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1048:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1049:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1049:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1050:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyDefinition2267);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1066:2: ( (lv_rule_3_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1067:1: (lv_rule_3_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1067:1: (lv_rule_3_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1068:3: lv_rule_3_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition2288);
            lv_rule_3_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"rule",
                      		lv_rule_3_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1084:2: (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1084:4: otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePropertyDefinition2301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1088:1: ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1089:1: (lv_default_5_0= ruleCSSDefaultValue )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1089:1: (lv_default_5_0= ruleCSSDefaultValue )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1090:3: lv_default_5_0= ruleCSSDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition2322);
                    lv_default_5_0=ruleCSSDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_5_0, 
                              		"CSSDefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_rulePropertyDefinition2336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1118:1: entryRulePseudoClassDefinition returns [EObject current=null] : iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF ;
    public final EObject entryRulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1119:2: (iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1120:2: iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition2372);
            iv_rulePseudoClassDefinition=rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition2382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1127:1: rulePseudoClassDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) ;
    public final EObject rulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_doku_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1130:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1131:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1131:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1131:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1131:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1132:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1137:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_JDOC) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1138:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1138:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1139:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePseudoClassDefinition2437);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1155:3: ( (lv_name_2_0= RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1156:1: (lv_name_2_0= RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1156:1: (lv_name_2_0= RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1157:3: lv_name_2_0= RULE_PSEUDO
            {
            lv_name_2_0=(Token)match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition2455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoClassDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"PSEUDO");
              	    
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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1181:1: entryRuleCSSRuleRef returns [EObject current=null] : iv_ruleCSSRuleRef= ruleCSSRuleRef EOF ;
    public final EObject entryRuleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1185:2: (iv_ruleCSSRuleRef= ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1186:2: iv_ruleCSSRuleRef= ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef2502);
            iv_ruleCSSRuleRef=ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef2512); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1196:1: ruleCSSRuleRef returns [EObject current=null] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) ;
    public final EObject ruleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_doku_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1200:28: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1201:1: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1201:1: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1201:2: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1201:2: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_JDOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1201:3: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1201:3: ( (lv_doku_0_0= ruleDoku ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1202:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1202:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1203:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleRef2563);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleRefRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1219:2: (this_WS_1= RULE_WS )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_WS) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1219:3: this_WS_1= RULE_WS
                    	    {
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleRef2575); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_1, grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleCSSRuleRef2590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1227:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1228:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1228:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1229:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef2613);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCSSRuleRef2625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3());
                  
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
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1257:1: entryRuleCSSRuleDefinition returns [EObject current=null] : iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF ;
    public final EObject entryRuleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1261:2: (iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1262:2: iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition2671);
            iv_ruleCSSRuleDefinition=ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition2681); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1272:1: ruleCSSRuleDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_func_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1276:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1278:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1283:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_JDOC) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1285:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleDefinition2740);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1301:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1302:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1302:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1303:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleDefinition2762);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleCSSRuleDefinition2774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1323:1: ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_JDOC||LA37_0==RULE_INT||LA37_0==RULE_REGEX||LA37_0==21||(LA37_0>=25 && LA37_0<=27)||LA37_0==29||LA37_0==33||LA37_0==41||LA37_0==43) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==22) ) {
                    alt37=2;
                }
                else if ( ((LA37_2>=RULE_ID && LA37_2<=RULE_JDOC)||LA37_2==RULE_INT||LA37_2==RULE_REGEX||LA37_2==17||LA37_2==21||(LA37_2>=25 && LA37_2<=27)||LA37_2==29||(LA37_2>=32 && LA37_2<=33)||(LA37_2>=36 && LA37_2<=41)||LA37_2==43) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1323:2: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1323:2: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1324:1: (lv_rule_4_0= ruleCSSRuleOr )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1324:1: (lv_rule_4_0= ruleCSSRuleOr )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1325:3: lv_rule_4_0= ruleCSSRuleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition2796);
                    lv_rule_4_0=ruleCSSRuleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_4_0, 
                              		"CSSRuleOr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1342:6: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1342:6: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1343:1: (lv_func_5_0= ruleCSSRuleFunc )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1343:1: (lv_func_5_0= ruleCSSRuleFunc )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1344:3: lv_func_5_0= ruleCSSRuleFunc
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleFunc_in_ruleCSSRuleDefinition2823);
                    lv_func_5_0=ruleCSSRuleFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"func",
                              		lv_func_5_0, 
                              		"CSSRuleFunc");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleCSSRuleDefinition2836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1375:1: entryRuleCSSRuleFunc returns [EObject current=null] : iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF ;
    public final EObject entryRuleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleFunc = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1379:2: (iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1380:2: iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc2882);
            iv_ruleCSSRuleFunc=ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleFunc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleFunc2892); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1390:1: ruleCSSRuleFunc returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) ;
    public final EObject ruleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1394:28: ( ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1395:1: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1395:1: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1395:2: () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1395:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1396:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1401:2: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1402:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1402:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1403:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleCSSRuleFunc2951);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCSSRuleFunc2963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1423:1: (this_WS_3= RULE_WS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1423:2: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleFunc2975); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1427:3: ( (lv_params_4_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1428:1: (lv_params_4_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1428:1: (lv_params_4_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1429:3: lv_params_4_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleFunc2997);
            lv_params_4_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              	        }
                     		set(
                     			current, 
                     			"params",
                      		lv_params_4_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleCSSRuleFunc3009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1460:1: entryRuleCSSRuleOr returns [EObject current=null] : iv_ruleCSSRuleOr= ruleCSSRuleOr EOF ;
    public final EObject entryRuleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1464:2: (iv_ruleCSSRuleOr= ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1465:2: iv_ruleCSSRuleOr= ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr3055);
            iv_ruleCSSRuleOr=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr3065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1475:1: ruleCSSRuleOr returns [EObject current=null] : (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) ;
    public final EObject ruleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleXor_0 = null;

        EObject lv_ors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1479:28: ( (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1480:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1480:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1481:5: this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3116);
            this_CSSRuleXor_0=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleXor_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1489:1: ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1489:2: () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1489:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1490:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1495:2: (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==36) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1495:4: otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleCSSRuleOr3138); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1499:1: ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1500:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1500:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1501:3: lv_ors_3_0= ruleCSSRuleXor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3159);
                    	    lv_ors_3_0=ruleCSSRuleXor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleOrRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ors",
                    	              		lv_ors_3_0, 
                    	              		"CSSRuleXor");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1528:1: entryRuleCSSRuleXor returns [EObject current=null] : iv_ruleCSSRuleXor= ruleCSSRuleXor EOF ;
    public final EObject entryRuleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleXor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1532:2: (iv_ruleCSSRuleXor= ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1533:2: iv_ruleCSSRuleXor= ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor3209);
            iv_ruleCSSRuleXor=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleXor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor3219); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1543:1: ruleCSSRuleXor returns [EObject current=null] : (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) ;
    public final EObject ruleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleConcat_0 = null;

        EObject lv_xors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1547:28: ( (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1548:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1548:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1549:5: this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3270);
            this_CSSRuleConcat_0=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleConcat_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1557:1: ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1557:2: () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1557:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1558:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1563:2: (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==37) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1563:4: otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleCSSRuleXor3292); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1567:1: ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1568:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1568:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1569:3: lv_xors_3_0= ruleCSSRuleConcat
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3313);
                    	    lv_xors_3_0=ruleCSSRuleConcat();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleXorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"xors",
                    	              		lv_xors_3_0, 
                    	              		"CSSRuleConcat");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1596:1: entryRuleCSSRuleConcat returns [EObject current=null] : iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF ;
    public final EObject entryRuleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcat = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1600:2: (iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1601:2: iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat3363);
            iv_ruleCSSRuleConcat=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat3373); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1611:1: ruleCSSRuleConcat returns [EObject current=null] : (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) ;
    public final EObject ruleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject this_CSSRuleConcatWithoutSpace_0 = null;

        EObject lv_conc_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1615:28: ( (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1616:1: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1616:1: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1617:5: this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3424);
            this_CSSRuleConcatWithoutSpace_0=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleConcatWithoutSpace_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1625:1: ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_JDOC)||LA44_0==RULE_INT||LA44_0==RULE_REGEX||LA44_0==21||(LA44_0>=25 && LA44_0<=27)||LA44_0==29||LA44_0==33||LA44_0==41||LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1625:2: () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1625:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1626:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1631:2: ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_JDOC)||LA43_0==RULE_INT||LA43_0==RULE_REGEX||LA43_0==21||(LA43_0>=25 && LA43_0<=27)||LA43_0==29||LA43_0==33||LA43_0==41||LA43_0==43) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1632:1: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1632:1: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1633:3: lv_conc_2_0= ruleCSSRuleConcatWithoutSpace
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3454);
                    	    lv_conc_2_0=ruleCSSRuleConcatWithoutSpace();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleConcatRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"conc",
                    	              		lv_conc_2_0, 
                    	              		"CSSRuleConcatWithoutSpace");
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
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleConcatWithoutSpace"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1660:1: entryRuleCSSRuleConcatWithoutSpace returns [EObject current=null] : iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF ;
    public final EObject entryRuleCSSRuleConcatWithoutSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcatWithoutSpace = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1664:2: (iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1665:2: iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcatWithoutSpace_in_entryRuleCSSRuleConcatWithoutSpace3503);
            iv_ruleCSSRuleConcatWithoutSpace=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcatWithoutSpace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcatWithoutSpace3513); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleConcatWithoutSpace"


    // $ANTLR start "ruleCSSRuleConcatWithoutSpace"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1675:1: ruleCSSRuleConcatWithoutSpace returns [EObject current=null] : (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) ;
    public final EObject ruleCSSRuleConcatWithoutSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRulePostfix_0 = null;

        EObject lv_conc_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1679:28: ( (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1680:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1680:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1681:5: this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3564);
            this_CSSRulePostfix_0=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePostfix_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1689:1: ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1689:2: () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1689:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1690:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1695:2: (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==38) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1695:4: otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCSSRuleConcatWithoutSpace3586); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1699:1: ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1700:1: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1700:1: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1701:3: lv_conc_3_0= ruleCSSRulePostfix
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3607);
                    	    lv_conc_3_0=ruleCSSRulePostfix();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleConcatWithoutSpaceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"conc",
                    	              		lv_conc_3_0, 
                    	              		"CSSRulePostfix");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleConcatWithoutSpace"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1728:1: entryRuleCSSRulePostfix returns [EObject current=null] : iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF ;
    public final EObject entryRuleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePostfix = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1732:2: (iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1733:2: iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix3657);
            iv_ruleCSSRulePostfix=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix3667); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1743:1: ruleCSSRulePostfix returns [EObject current=null] : (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) ;
    public final EObject ruleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_CSSRulePrimary_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1747:28: ( (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1748:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1748:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1749:5: this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix3718);
            this_CSSRulePrimary_0=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1757:1: ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==17||(LA48_0>=39 && LA48_0<=40)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1757:2: () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1757:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1758:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1763:2: ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1764:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1764:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1765:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1765:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case 17:
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
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1766:3: lv_cardinality_2_1= '*'
                            {
                            lv_cardinality_2_1=(Token)match(input,17,FOLLOW_17_in_ruleCSSRulePostfix3747); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_1, grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1778:8: lv_cardinality_2_2= '+'
                            {
                            lv_cardinality_2_2=(Token)match(input,39,FOLLOW_39_in_ruleCSSRulePostfix3776); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_2, grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1790:8: lv_cardinality_2_3= '?'
                            {
                            lv_cardinality_2_3=(Token)match(input,40,FOLLOW_40_in_ruleCSSRulePostfix3805); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_3, grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                              	    
                            }

                            }
                            break;

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
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1816:1: entryRuleCSSRuleBracket returns [EObject current=null] : iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF ;
    public final EObject entryRuleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleBracket = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1820:2: (iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1821:2: iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket3869);
            iv_ruleCSSRuleBracket=ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket3879); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1831:1: ruleCSSRuleBracket returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) ;
    public final EObject ruleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1835:28: ( ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1836:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1836:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1836:2: () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1836:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleCSSRuleBracket3929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1846:1: ( (lv_inner_2_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1847:1: (lv_inner_2_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1847:1: (lv_inner_2_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1848:3: lv_inner_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket3950);
            lv_inner_2_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleBracketRule());
              	        }
                     		set(
                     			current, 
                     			"inner",
                      		lv_inner_2_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleCSSRuleBracket3962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1879:1: entryRuleCSSRulePrimary returns [EObject current=null] : iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF ;
    public final EObject entryRuleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1883:2: (iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1884:2: iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary4008);
            iv_ruleCSSRulePrimary=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary4018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1894:1: ruleCSSRulePrimary returns [EObject current=null] : (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_7_0=null;
        EObject this_CSSRuleRef_0 = null;

        EObject this_CSSRuleBracket_1 = null;

        EObject this_CSSRuleLiteral_2 = null;

        EObject this_CSSRuleSymbol_3 = null;

        EObject this_CSSBaseType_4 = null;

        EObject this_CSSRuleRegex_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1898:28: ( (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1899:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1899:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt49=7;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1900:5: this_CSSRuleRef_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary4069);
                    this_CSSRuleRef_0=ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1910:5: this_CSSRuleBracket_1= ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary4096);
                    this_CSSRuleBracket_1=ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleBracket_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1920:5: this_CSSRuleLiteral_2= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary4123);
                    this_CSSRuleLiteral_2=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1930:5: this_CSSRuleSymbol_3= ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleSymbol_in_ruleCSSRulePrimary4150);
                    this_CSSRuleSymbol_3=ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleSymbol_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1940:5: this_CSSBaseType_4= ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary4177);
                    this_CSSBaseType_4=ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSBaseType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1950:5: this_CSSRuleRegex_5= ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRegex_in_ruleCSSRulePrimary4204);
                    this_CSSRuleRegex_5=ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleRegex_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1959:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1959:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1959:7: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1959:7: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1960:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1965:2: ( (lv_value_7_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1966:1: (lv_value_7_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1966:1: (lv_value_7_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1967:3: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSRulePrimary4236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRulePrimaryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"INT");
                      	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1994:1: entryRuleCSSRuleRegex returns [EObject current=null] : iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF ;
    public final EObject entryRuleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRegex = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1998:2: (iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1999:2: iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex4288);
            iv_ruleCSSRuleRegex=ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRegex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRegex4298); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2009:1: ruleCSSRuleRegex returns [EObject current=null] : ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) ;
    public final EObject ruleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        Token lv_regex_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2013:28: ( ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2014:1: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2014:1: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2014:2: () ( (lv_regex_1_0= RULE_REGEX ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2014:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2020:2: ( (lv_regex_1_0= RULE_REGEX ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2021:1: (lv_regex_1_0= RULE_REGEX )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2021:1: (lv_regex_1_0= RULE_REGEX )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2022:3: lv_regex_1_0= RULE_REGEX
            {
            lv_regex_1_0=(Token)match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_ruleCSSRuleRegex4353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_regex_1_0, grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRegexRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"regex",
                      		lv_regex_1_0, 
                      		"REGEX");
              	    
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
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2049:1: entryRuleCSSRuleLiteral returns [EObject current=null] : iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF ;
    public final EObject entryRuleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2050:2: (iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2051:2: iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral4398);
            iv_ruleCSSRuleLiteral=ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral4408); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:1: ruleCSSRuleLiteral returns [EObject current=null] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_value_3_0=null;
        EObject lv_doku_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2061:28: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:1: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:1: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:2: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2063:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2068:2: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_JDOC) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2068:3: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2068:3: ( (lv_doku_1_0= ruleDoku ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2069:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2069:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2070:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleLiteral4464);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2086:2: (this_WS_2= RULE_WS )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_WS) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2086:3: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleLiteral4476); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_2, grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2090:5: ( (lv_value_3_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2091:1: (lv_value_3_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2091:1: (lv_value_3_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2092:3: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCSSRuleLiteral4496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_3_0, grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2116:1: entryRuleCSSRuleSymbol returns [EObject current=null] : iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF ;
    public final EObject entryRuleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleSymbol = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2117:2: (iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2118:2: iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol4537);
            iv_ruleCSSRuleSymbol=ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleSymbol; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleSymbol4547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2125:1: ruleCSSRuleSymbol returns [EObject current=null] : ( () ( ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) ) ) ) ;
    public final EObject ruleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2128:28: ( ( () ( ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2129:1: ( () ( ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2129:1: ( () ( ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2129:2: () ( ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2129:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2130:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2135:2: ( ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2136:1: ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2136:1: ( (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2137:1: (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2137:1: (lv_symbol_1_1= ',' | lv_symbol_1_2= '%' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            else if ( (LA52_0==43) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2138:3: lv_symbol_1_1= ','
                    {
                    lv_symbol_1_1=(Token)match(input,29,FOLLOW_29_in_ruleCSSRuleSymbol4601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_1_1, grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2150:8: lv_symbol_1_2= '%'
                    {
                    lv_symbol_1_2=(Token)match(input,43,FOLLOW_43_in_ruleCSSRuleSymbol4630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_1_2, grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_1_2, null);
                      	    
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
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2173:1: entryRuleCSSDefaultValue returns [EObject current=null] : iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF ;
    public final EObject entryRuleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSDefaultValue = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2174:2: (iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2175:2: iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue4682);
            iv_ruleCSSDefaultValue=ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue4692); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2182:1: ruleCSSDefaultValue returns [EObject current=null] : ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        Token lv_ival_2_0=null;
        Token lv_dval_3_0=null;
        Token lv_sval_4_0=null;
        EObject lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2185:28: ( ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2186:1: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2186:1: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_JDOC:
                {
                alt53=1;
                }
                break;
            case RULE_INT:
                {
                alt53=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt53=3;
                }
                break;
            case RULE_STRING:
                {
                alt53=4;
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2186:2: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2186:2: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2186:3: () ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2186:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2187:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2192:2: ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2193:1: (lv_val_1_0= ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2193:1: (lv_val_1_0= ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2194:3: lv_val_1_0= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue4748);
                    lv_val_1_0=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_1_0, 
                              		"CSSRuleLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2211:6: ( (lv_ival_2_0= RULE_INT ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2211:6: ( (lv_ival_2_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2212:1: (lv_ival_2_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2212:1: (lv_ival_2_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2213:3: lv_ival_2_0= RULE_INT
                    {
                    lv_ival_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSDefaultValue4772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ival_2_0, grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ival",
                              		lv_ival_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:6: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:6: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2231:1: (lv_dval_3_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2231:1: (lv_dval_3_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2232:3: lv_dval_3_0= RULE_DOUBLE
                    {
                    lv_dval_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSDefaultValue4800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_dval_3_0, grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"dval",
                              		lv_dval_3_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2249:6: ( (lv_sval_4_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2249:6: ( (lv_sval_4_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2250:1: (lv_sval_4_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2250:1: (lv_sval_4_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2251:3: lv_sval_4_0= RULE_STRING
                    {
                    lv_sval_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSSDefaultValue4828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sval_4_0, grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sval",
                              		lv_sval_4_0, 
                              		"STRING");
                      	    
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
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "entryRuleSubstructureSelector"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2275:1: entryRuleSubstructureSelector returns [EObject current=null] : iv_ruleSubstructureSelector= ruleSubstructureSelector EOF ;
    public final EObject entryRuleSubstructureSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructureSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2279:2: (iv_ruleSubstructureSelector= ruleSubstructureSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2280:2: iv_ruleSubstructureSelector= ruleSubstructureSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstructureSelector_in_entryRuleSubstructureSelector4875);
            iv_ruleSubstructureSelector=ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructureSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstructureSelector4885); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubstructureSelector"


    // $ANTLR start "ruleSubstructureSelector"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2290:1: ruleSubstructureSelector returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSubstructureSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2294:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2295:1: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2295:1: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2295:2: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2295:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2296:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2301:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2302:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2302:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2303:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstructureSelector4940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSubstructureSelectorAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstructureSelectorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2319:2: (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2319:4: otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSubstructureSelector4958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2323:1: ( (lv_var_3_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2324:1: (lv_var_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2324:1: (lv_var_3_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2325:3: lv_var_3_0= RULE_ID
                    {
                    lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstructureSelector4975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_var_3_0, grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubstructureSelectorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"var",
                              		lv_var_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleSubstructureSelector4992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2());
                          
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
    // $ANTLR end "ruleSubstructureSelector"


    // $ANTLR start "entryRuleSubstructure"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2356:1: entryRuleSubstructure returns [EObject current=null] : iv_ruleSubstructure= ruleSubstructure EOF ;
    public final EObject entryRuleSubstructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2357:2: (iv_ruleSubstructure= ruleSubstructure EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2358:2: iv_ruleSubstructure= ruleSubstructure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureRule()); 
            }
            pushFollow(FOLLOW_ruleSubstructure_in_entryRuleSubstructure5034);
            iv_ruleSubstructure=ruleSubstructure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstructure5044); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructure"


    // $ANTLR start "ruleSubstructure"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2365:1: ruleSubstructure returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSubstructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_doku_0_0 = null;

        EObject lv_childs_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2368:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2369:1: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2369:1: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2369:2: ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2369:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_JDOC) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2370:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2370:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2371:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleSubstructure5090);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubstructureRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleSubstructure5103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubstructureAccess().getSubstructureKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2391:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2392:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2392:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2393:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstructure5120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstructureRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSubstructure5137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2413:1: ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_JDOC)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2414:1: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2414:1: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2415:3: lv_childs_4_0= ruleSubstructureStyleclass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructure5158);
            	    lv_childs_4_0=ruleSubstructureStyleclass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubstructureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"childs",
            	              		lv_childs_4_0, 
            	              		"SubstructureStyleclass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSubstructure5171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleSubstructure"


    // $ANTLR start "entryRuleSubstructureStyleclass"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2443:1: entryRuleSubstructureStyleclass returns [EObject current=null] : iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF ;
    public final EObject entryRuleSubstructureStyleclass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructureStyleclass = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2444:2: (iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2445:2: iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureStyleclassRule()); 
            }
            pushFollow(FOLLOW_ruleSubstructureStyleclass_in_entryRuleSubstructureStyleclass5207);
            iv_ruleSubstructureStyleclass=ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructureStyleclass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstructureStyleclass5217); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructureStyleclass"


    // $ANTLR start "ruleSubstructureStyleclass"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2452:1: ruleSubstructureStyleclass returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleSubstructureStyleclass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_0_0 = null;

        EObject lv_selectors_3_0 = null;

        EObject lv_childs_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2455:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2456:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2456:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2456:2: ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2456:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_JDOC) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2457:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2457:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2458:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleSubstructureStyleclass5263);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2474:3: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2475:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2475:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2476:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstructureStyleclassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubstructureStyleclass5287);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSubstructureStyleclass5299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2493:1: ( (lv_selectors_3_0= ruleSubstructureSelector ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==EOF||(LA58_2>=RULE_ID && LA58_2<=RULE_JDOC)||(LA58_2>=19 && LA58_2<=20)||LA58_2==41) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2494:1: (lv_selectors_3_0= ruleSubstructureSelector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2494:1: (lv_selectors_3_0= ruleSubstructureSelector )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2495:3: lv_selectors_3_0= ruleSubstructureSelector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubstructureSelector_in_ruleSubstructureStyleclass5320);
            	    lv_selectors_3_0=ruleSubstructureSelector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"selectors",
            	              		lv_selectors_3_0, 
            	              		"SubstructureSelector");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2511:3: (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2511:5: otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSubstructureStyleclass5334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2515:1: ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_JDOC)) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2516:1: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2516:1: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2517:3: lv_childs_5_0= ruleSubstructureStyleclass
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructureStyleclass5355);
                    	    lv_childs_5_0=ruleSubstructureStyleclass();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"childs",
                    	              		lv_childs_5_0, 
                    	              		"SubstructureStyleclass");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleSubstructureStyleclass5368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2());
                          
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
    // $ANTLR end "ruleSubstructureStyleclass"

    // $ANTLR start synpred1_InternalCssExtDsl
    public final void synpred1_InternalCssExtDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:220:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred1_InternalCssExtDsl467); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCssExtDsl

    // Delegated rules

    public final boolean synpred1_InternalCssExtDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssExtDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA5_eotS =
        "\11\uffff";
    static final String DFA5_eofS =
        "\11\uffff";
    static final String DFA5_minS =
        "\1\4\1\uffff\1\4\1\20\1\uffff\1\4\2\uffff\1\20";
    static final String DFA5_maxS =
        "\1\24\1\uffff\1\4\1\43\1\uffff\1\4\2\uffff\1\43";
    static final String DFA5_acceptS =
        "\1\uffff\1\4\2\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA5_specialS =
        "\11\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\2\14\uffff\1\4\1\uffff\1\1",
            "",
            "\1\3",
            "\1\5\2\uffff\1\6\10\uffff\1\6\1\uffff\1\6\4\uffff\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\6\10\uffff\1\6\1\uffff\1\6\4\uffff\1\7"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 329:1: ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )*";
        }
    }
    static final String DFA25_eotS =
        "\10\uffff";
    static final String DFA25_eofS =
        "\2\uffff\2\4\4\uffff";
    static final String DFA25_minS =
        "\1\5\1\6\2\4\1\uffff\1\6\2\uffff";
    static final String DFA25_maxS =
        "\2\33\2\53\1\uffff\1\33\2\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\10\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\17\uffff\1\2\3\uffff\1\3\2\4",
            "\1\5\16\uffff\1\2\3\uffff\1\3\2\4",
            "\4\4\2\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\6\1\uffff\4\4\1"+
            "\uffff\1\4\1\uffff\3\4\2\uffff\10\4",
            "\4\4\2\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\7\1\uffff\4\4\1"+
            "\uffff\1\4\1\uffff\3\4\2\uffff\10\4",
            "",
            "\1\5\16\uffff\1\2\3\uffff\1\3\2\4",
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
            return "496:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) )";
        }
    }
    static final String DFA49_eotS =
        "\12\uffff";
    static final String DFA49_eofS =
        "\12\uffff";
    static final String DFA49_minS =
        "\2\4\7\uffff\1\4";
    static final String DFA49_maxS =
        "\1\53\1\41\7\uffff\1\41";
    static final String DFA49_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA49_specialS =
        "\12\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\4\1\1\1\uffff\1\10\2\uffff\1\7\12\uffff\1\6\3\uffff\3\6\1"+
            "\uffff\1\5\3\uffff\1\2\7\uffff\1\3\1\uffff\1\5",
            "\1\4\1\uffff\1\11\16\uffff\1\6\3\uffff\3\6\5\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\uffff\1\11\16\uffff\1\6\3\uffff\3\6\5\uffff\1\2"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1899:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCssExtension_in_entryRuleCssExtension75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssExtension85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleCssExtension131 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_ruleCssExtension153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName448 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName499 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildCard637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDefinition689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePackageDefinition726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDefinition747 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePackageDefinition759 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition781 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rulePackageDefinition808 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rulePackageDefinition835 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_20_in_rulePackageDefinition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_entryRuleDoku885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoku895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_ruleDoku936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_ruleCSSBaseType1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_entryRuleCSSType1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSType1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSType1157 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1169 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_21_in_ruleCSSType1190 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSType1215 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1227 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSType1245 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1262 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_23_in_ruleCSSType1275 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1287 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSType1305 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1322 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_24_in_ruleCSSType1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSType1374 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1386 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_ruleCSSType1407 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSType1432 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1444 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSType1462 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1479 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_23_in_ruleCSSType1492 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1504 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSType1522 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1539 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_24_in_ruleCSSType1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSType1582 = new BitSet(new long[]{0x000000000E200040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1594 = new BitSet(new long[]{0x000000000E200040L});
    public static final BitSet FOLLOW_21_in_ruleCSSType1617 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1642 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_25_in_ruleCSSType1669 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1694 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_26_in_ruleCSSType1721 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1746 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_27_in_ruleCSSType1773 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1798 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition1842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleElementDefinition1907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition1929 = new BitSet(new long[]{0x0000000050080000L});
    public static final BitSet FOLLOW_28_in_ruleElementDefinition1942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition1965 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_29_in_ruleElementDefinition1978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition2001 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_30_in_ruleElementDefinition2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementDefinition2035 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleElementDefinition2054 = new BitSet(new long[]{0x0000100000100230L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleElementDefinition2076 = new BitSet(new long[]{0x0000100000100230L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_ruleElementDefinition2103 = new BitSet(new long[]{0x0000100000100230L});
    public static final BitSet FOLLOW_ruleSubstructure_in_ruleElementDefinition2130 = new BitSet(new long[]{0x0000100000100230L});
    public static final BitSet FOLLOW_20_in_ruleElementDefinition2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePropertyDefinition2245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyDefinition2267 = new BitSet(new long[]{0x00000A022E2004B0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition2288 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_rulePropertyDefinition2301 = new BitSet(new long[]{0x00000000000009B0L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition2322 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePropertyDefinition2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition2372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePseudoClassDefinition2437 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleRef2563 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleRef2575 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_33_in_ruleCSSRuleRef2590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef2613 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCSSRuleRef2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleDefinition2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleDefinition2762 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCSSRuleDefinition2774 = new BitSet(new long[]{0x00000A022E2004B0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition2796 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_ruleCSSRuleDefinition2823 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCSSRuleDefinition2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleFunc2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCSSRuleFunc2951 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSRuleFunc2963 = new BitSet(new long[]{0x00000A022E2004F0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleFunc2975 = new BitSet(new long[]{0x00000A022E2004F0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleFunc2997 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCSSRuleFunc3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr3055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3116 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleCSSRuleOr3138 = new BitSet(new long[]{0x00000A022E2004B0L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3159 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor3209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3270 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleCSSRuleXor3292 = new BitSet(new long[]{0x00000A022E2004B0L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3313 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat3363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3424 = new BitSet(new long[]{0x00000A022E2004B2L});
    public static final BitSet FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3454 = new BitSet(new long[]{0x00000A022E2004B2L});
    public static final BitSet FOLLOW_ruleCSSRuleConcatWithoutSpace_in_entryRuleCSSRuleConcatWithoutSpace3503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcatWithoutSpace3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3564 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleCSSRuleConcatWithoutSpace3586 = new BitSet(new long[]{0x00000A022E2004B0L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3607 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix3657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix3718 = new BitSet(new long[]{0x0000018000020002L});
    public static final BitSet FOLLOW_17_in_ruleCSSRulePostfix3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCSSRulePostfix3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCSSRulePostfix3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCSSRuleBracket3929 = new BitSet(new long[]{0x00000A022E2004B0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket3950 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCSSRuleBracket3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary4008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_ruleCSSRulePrimary4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_ruleCSSRulePrimary4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSRulePrimary4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRegex4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_ruleCSSRuleRegex4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral4398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleLiteral4464 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleLiteral4476 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCSSRuleLiteral4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol4537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleSymbol4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCSSRuleSymbol4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCSSRuleSymbol4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSDefaultValue4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSDefaultValue4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSSDefaultValue4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstructureSelector_in_entryRuleSubstructureSelector4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstructureSelector4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstructureSelector4940 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleSubstructureSelector4958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstructureSelector4975 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubstructureSelector4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstructure_in_entryRuleSubstructure5034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstructure5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleSubstructure5090 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSubstructure5103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstructure5120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSubstructure5137 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructure5158 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_20_in_ruleSubstructure5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstructureStyleclass_in_entryRuleSubstructureStyleclass5207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstructureStyleclass5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleSubstructureStyleclass5263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubstructureStyleclass5287 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSubstructureStyleclass5299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSubstructureSelector_in_ruleSubstructureStyleclass5320 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_19_in_ruleSubstructureStyleclass5334 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructureStyleclass5355 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_20_in_ruleSubstructureStyleclass5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalCssExtDsl467 = new BitSet(new long[]{0x0000000000000002L});

}