package at.bestsolution.efxclipse.tooling.rrobot.dsl.parser.antlr.internal; 

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
import at.bestsolution.efxclipse.tooling.rrobot.dsl.services.RTaskGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRTaskParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_DOC", "RULE_STRING", "RULE_ID", "RULE_INLINE_SCRIPT", "RULE_SIGNED_INT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotTask'", "'{'", "'variables'", "'='", "','", "'}'", "'projects'", "'default'", "'SimpleProject'", "'resources'", "'Folder'", "'children'", "'TemplatedFile'", "'generatorType'", "'DataFile'", "'content'", "'URLFile'", "'excluded-if'", "'DynamicFile'", "'generated-from'", "'by'", "'BundleProject'", "'manifest'", "'build'", "'pluginxml'", "'FeatureProject'", "'feature'", "'lazy'", "'singleton'", "'ManifestFile'", "'bundlename'", "'vendor'", "'activatorClass'", "'exportedPackages'", "'importedPackages'", "'requiredBundles'", "'PluginXMLFile'", "'extensions'", "'BuildProperties'", "'binIncludes'", "'launchable'", "'ProductFileFeaturebase'", "'vmArgs'", "'programArgs'", "'productName'", "'application'", "'version'", "'startconfigurations'", "'features'", "'FeatureFile'", "'featurename'", "'description'", "'copyright'", "'license'", "'license-feature'", "'license-feature-version'", "'plugins'", "'required'", "'included'", "'('", "'['", "')'", "']'", "'id'", "'elements'", "'attributes'", "'LinkedString'", "'unpacked'", "'fragment'", "'autostarted'", "'at'", "'.'", "'BOOLEAN'", "'DOUBLE'", "'INT'", "'STRING'", "'none'", "'equivalent'", "'compatible'", "'perfect'", "'greaterOrEqual'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_DOC=4;
    public static final int EOF=-1;
    public static final int RULE_INLINE_SCRIPT=7;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int RULE_SIGNED_INT=8;
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
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalRTaskParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRTaskParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRTaskParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g"; }



     	private RTaskGrammarAccess grammarAccess;
     	
        public InternalRTaskParser(TokenStream input, RTaskGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RobotTask";	
       	}
       	
       	@Override
       	protected RTaskGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRobotTask"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:68:1: entryRuleRobotTask returns [EObject current=null] : iv_ruleRobotTask= ruleRobotTask EOF ;
    public final EObject entryRuleRobotTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotTask = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:69:2: (iv_ruleRobotTask= ruleRobotTask EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:70:2: iv_ruleRobotTask= ruleRobotTask EOF
            {
             newCompositeNode(grammarAccess.getRobotTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRobotTask_in_entryRuleRobotTask75);
            iv_ruleRobotTask=ruleRobotTask();

            state._fsp--;

             current =iv_ruleRobotTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRobotTask85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobotTask"


    // $ANTLR start "ruleRobotTask"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:77:1: ruleRobotTask returns [EObject current=null] : ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleRobotTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_variables_6_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_projects_13_0 = null;

        EObject lv_projects_15_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:80:28: ( ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:1: ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:1: ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:2: () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRobotTaskAccess().getRobotTaskAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRobotTask131); 

                	newLeafNode(otherlv_1, grammarAccess.getRobotTaskAccess().getRobotTaskKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask143); 

                	newLeafNode(otherlv_2, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:1: (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:3: otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRobotTask156); 

                        	newLeafNode(otherlv_3, grammarAccess.getRobotTaskAccess().getVariablesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRobotTask168); 

                        	newLeafNode(otherlv_4, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask180); 

                        	newLeafNode(otherlv_5, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:107:1: ( (lv_variables_6_0= ruleVariable ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:108:1: (lv_variables_6_0= ruleVariable )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:108:1: (lv_variables_6_0= ruleVariable )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:109:3: lv_variables_6_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getVariablesVariableParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRobotTask201);
                    lv_variables_6_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_6_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:2: (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:4: otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask214); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRobotTaskAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:129:1: ( (lv_variables_8_0= ruleVariable ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:130:1: (lv_variables_8_0= ruleVariable )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:130:1: (lv_variables_8_0= ruleVariable )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:131:3: lv_variables_8_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getVariablesVariableParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRobotTask235);
                    	    lv_variables_8_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_8_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask249); 

                        	newLeafNode(otherlv_9, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:151:3: (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:151:5: otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRobotTask264); 

                        	newLeafNode(otherlv_10, grammarAccess.getRobotTaskAccess().getProjectsKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRobotTask276); 

                        	newLeafNode(otherlv_11, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask288); 

                        	newLeafNode(otherlv_12, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:163:1: ( (lv_projects_13_0= ruleGenericProject ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:164:1: (lv_projects_13_0= ruleGenericProject )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:164:1: (lv_projects_13_0= ruleGenericProject )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:165:3: lv_projects_13_0= ruleGenericProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getProjectsGenericProjectParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_ruleRobotTask309);
                    lv_projects_13_0=ruleGenericProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_13_0, 
                            		"GenericProject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:181:2: (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:181:4: otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask322); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getRobotTaskAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:185:1: ( (lv_projects_15_0= ruleGenericProject ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:186:1: (lv_projects_15_0= ruleGenericProject )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:186:1: (lv_projects_15_0= ruleGenericProject )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:187:3: lv_projects_15_0= ruleGenericProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getProjectsGenericProjectParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_ruleRobotTask343);
                    	    lv_projects_15_0=ruleGenericProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_15_0, 
                    	            		"GenericProject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask357); 

                        	newLeafNode(otherlv_16, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask371); 

                	newLeafNode(otherlv_17, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRobotTask"


    // $ANTLR start "entryRuleVariable"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:219:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:220:2: (iv_ruleVariable= ruleVariable EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:221:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable407);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:228:1: ruleVariable returns [EObject current=null] : ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:231:28: ( ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:1: ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:1: ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:2: ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:2: ( (lv_description_0_0= RULE_SL_DOC ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:233:1: (lv_description_0_0= RULE_SL_DOC )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:233:1: (lv_description_0_0= RULE_SL_DOC )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:234:3: lv_description_0_0= RULE_SL_DOC
            {
            lv_description_0_0=(Token)match(input,RULE_SL_DOC,FollowSets000.FOLLOW_RULE_SL_DOC_in_ruleVariable459); 

            			newLeafNode(lv_description_0_0, grammarAccess.getVariableAccess().getDescriptionSL_DOCTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"SL_DOC");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:250:2: ( (lv_type_1_0= ruleType ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:251:1: (lv_type_1_0= ruleType )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:251:1: (lv_type_1_0= ruleType )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:252:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleVariable485);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:268:2: ( (lv_key_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:269:1: (lv_key_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:269:1: (lv_key_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:270:3: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVariable502); 

            			newLeafNode(lv_key_2_0, grammarAccess.getVariableAccess().getKeySTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:286:2: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:286:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariable520); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getDefaultKeyword_3_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:290:1: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:291:1: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:291:1: (lv_defaultValue_4_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:292:3: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVariable537); 

                    			newLeafNode(lv_defaultValue_4_0, grammarAccess.getVariableAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_4_0, 
                            		"STRING");
                    	    

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
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleGenericProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:316:1: entryRuleGenericProject returns [EObject current=null] : iv_ruleGenericProject= ruleGenericProject EOF ;
    public final EObject entryRuleGenericProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:317:2: (iv_ruleGenericProject= ruleGenericProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:318:2: iv_ruleGenericProject= ruleGenericProject EOF
            {
             newCompositeNode(grammarAccess.getGenericProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_entryRuleGenericProject580);
            iv_ruleGenericProject=ruleGenericProject();

            state._fsp--;

             current =iv_ruleGenericProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericProject590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericProject"


    // $ANTLR start "ruleGenericProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:325:1: ruleGenericProject returns [EObject current=null] : (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject ) ;
    public final EObject ruleGenericProject() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_BundleProject_1 = null;

        EObject this_FeatureProject_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:328:28: ( (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:329:1: (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:329:1: (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:330:5: this_Project_0= ruleProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getProjectParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProject_in_ruleGenericProject637);
                    this_Project_0=ruleProject();

                    state._fsp--;

                     
                            current = this_Project_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:340:5: this_BundleProject_1= ruleBundleProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getBundleProjectParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_ruleGenericProject664);
                    this_BundleProject_1=ruleBundleProject();

                    state._fsp--;

                     
                            current = this_BundleProject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:350:5: this_FeatureProject_2= ruleFeatureProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getFeatureProjectParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_ruleGenericProject691);
                    this_FeatureProject_2=ruleFeatureProject();

                    state._fsp--;

                     
                            current = this_FeatureProject_2; 
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
    // $ANTLR end "ruleGenericProject"


    // $ANTLR start "entryRuleResource"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:366:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:367:2: (iv_ruleResource= ruleResource EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:368:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResource_in_entryRuleResource726);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResource736); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:375:1: ruleResource returns [EObject current=null] : (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Folder_0 = null;

        EObject this_TemplatedFile_1 = null;

        EObject this_DataFile_2 = null;

        EObject this_URLFile_3 = null;

        EObject this_DynamicFile_4 = null;

        EObject this_ManifestFile_5 = null;

        EObject this_ProductFileFeaturebase_6 = null;

        EObject this_PluginXMLFile_7 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:378:28: ( (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:379:1: (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:379:1: (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt7=6;
                }
                break;
            case 54:
            case 55:
                {
                alt7=7;
                }
                break;
            case 50:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:380:5: this_Folder_0= ruleFolder
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getFolderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFolder_in_ruleResource783);
                    this_Folder_0=ruleFolder();

                    state._fsp--;

                     
                            current = this_Folder_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:390:5: this_TemplatedFile_1= ruleTemplatedFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getTemplatedFileParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_ruleResource810);
                    this_TemplatedFile_1=ruleTemplatedFile();

                    state._fsp--;

                     
                            current = this_TemplatedFile_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:400:5: this_DataFile_2= ruleDataFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDataFileParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_ruleResource837);
                    this_DataFile_2=ruleDataFile();

                    state._fsp--;

                     
                            current = this_DataFile_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:410:5: this_URLFile_3= ruleURLFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getURLFileParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_ruleResource864);
                    this_URLFile_3=ruleURLFile();

                    state._fsp--;

                     
                            current = this_URLFile_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:420:5: this_DynamicFile_4= ruleDynamicFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDynamicFileParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDynamicFile_in_ruleResource891);
                    this_DynamicFile_4=ruleDynamicFile();

                    state._fsp--;

                     
                            current = this_DynamicFile_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:430:5: this_ManifestFile_5= ruleManifestFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getManifestFileParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleResource918);
                    this_ManifestFile_5=ruleManifestFile();

                    state._fsp--;

                     
                            current = this_ManifestFile_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:440:5: this_ProductFileFeaturebase_6= ruleProductFileFeaturebase
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getProductFileFeaturebaseParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_ruleResource945);
                    this_ProductFileFeaturebase_6=ruleProductFileFeaturebase();

                    state._fsp--;

                     
                            current = this_ProductFileFeaturebase_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:450:5: this_PluginXMLFile_7= rulePluginXMLFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getPluginXMLFileParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleResource972);
                    this_PluginXMLFile_7=rulePluginXMLFile();

                    state._fsp--;

                     
                            current = this_PluginXMLFile_7; 
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:466:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:467:2: (iv_ruleProject= ruleProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:468:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject1007);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject1017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:475:1: ruleProject returns [EObject current=null] : ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_resources_7_0 = null;

        EObject lv_resources_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:478:28: ( ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:479:1: ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:479:1: ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:479:2: () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:479:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:480:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProjectAccess().getProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProject1063); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getSimpleProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:489:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:490:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:490:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:491:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProject1084);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject1096); 

                	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:511:1: (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:511:3: otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleProject1109); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getResourcesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProject1121); 

                        	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject1133); 

                        	newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:523:1: ( (lv_resources_7_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:524:1: (lv_resources_7_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:524:1: (lv_resources_7_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:525:3: lv_resources_7_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourceParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleProject1154);
                    lv_resources_7_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_7_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:541:2: (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:541:4: otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProject1167); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:545:1: ( (lv_resources_9_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:546:1: (lv_resources_9_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:546:1: (lv_resources_9_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:547:3: lv_resources_9_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourceParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleProject1188);
                    	    lv_resources_9_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_9_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProject1202); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProject1216); 

                	newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEString"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:579:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:580:2: (iv_ruleEString= ruleEString EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:581:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1253);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1264); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:588:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:591:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:592:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:592:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:592:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1304); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:600:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1330); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFolder"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:615:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:616:2: (iv_ruleFolder= ruleFolder EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:617:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFolder_in_entryRuleFolder1375);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolder1385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:624:1: ruleFolder returns [EObject current=null] : ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_children_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:627:28: ( ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:628:1: ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:628:1: ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:628:2: () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:628:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:629:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFolderAccess().getFolderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFolder1431); 

                	newLeafNode(otherlv_1, grammarAccess.getFolderAccess().getFolderKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:638:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:639:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:639:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:640:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFolder1452);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFolderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFolder1464); 

                	newLeafNode(otherlv_3, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:1: (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:3: otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFolder1477); 

                        	newLeafNode(otherlv_4, grammarAccess.getFolderAccess().getChildrenKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFolder1489); 

                        	newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFolder1501); 

                        	newLeafNode(otherlv_6, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:672:1: ( (lv_children_7_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:673:1: (lv_children_7_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:673:1: (lv_children_7_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:674:3: lv_children_7_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFolderAccess().getChildrenResourceParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFolder1522);
                    lv_children_7_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFolderRule());
                    	        }
                           		add(
                           			current, 
                           			"children",
                            		lv_children_7_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:690:2: (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:690:4: otherlv_8= ',' ( (lv_children_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFolder1535); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFolderAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:694:1: ( (lv_children_9_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:695:1: (lv_children_9_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:695:1: (lv_children_9_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:696:3: lv_children_9_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFolderAccess().getChildrenResourceParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFolder1556);
                    	    lv_children_9_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFolderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFolder1570); 

                        	newLeafNode(otherlv_10, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFolder1584); 

                	newLeafNode(otherlv_11, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleTemplatedFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:728:1: entryRuleTemplatedFile returns [EObject current=null] : iv_ruleTemplatedFile= ruleTemplatedFile EOF ;
    public final EObject entryRuleTemplatedFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplatedFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:729:2: (iv_ruleTemplatedFile= ruleTemplatedFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:730:2: iv_ruleTemplatedFile= ruleTemplatedFile EOF
            {
             newCompositeNode(grammarAccess.getTemplatedFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1620);
            iv_ruleTemplatedFile=ruleTemplatedFile();

            state._fsp--;

             current =iv_ruleTemplatedFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplatedFile1630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplatedFile"


    // $ANTLR start "ruleTemplatedFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:737:1: ruleTemplatedFile returns [EObject current=null] : ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTemplatedFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_generatorType_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:740:28: ( ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:741:1: ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:741:1: ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:741:2: () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:741:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:742:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemplatedFileAccess().getTemplatedFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTemplatedFile1676); 

                	newLeafNode(otherlv_1, grammarAccess.getTemplatedFileAccess().getTemplatedFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:751:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:752:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:752:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:753:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTemplatedFile1697);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplatedFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTemplatedFile1709); 

                	newLeafNode(otherlv_3, grammarAccess.getTemplatedFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:1: (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:3: otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTemplatedFile1722); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemplatedFileAccess().getGeneratorTypeKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTemplatedFile1734); 

                        	newLeafNode(otherlv_5, grammarAccess.getTemplatedFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:781:1: ( (lv_generatorType_6_0= ruleEString ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:782:1: (lv_generatorType_6_0= ruleEString )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:782:1: (lv_generatorType_6_0= ruleEString )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:783:3: lv_generatorType_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getGeneratorTypeEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTemplatedFile1755);
                    lv_generatorType_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplatedFileRule());
                    	        }
                           		set(
                           			current, 
                           			"generatorType",
                            		lv_generatorType_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTemplatedFile1769); 

                	newLeafNode(otherlv_7, grammarAccess.getTemplatedFileAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTemplatedFile"


    // $ANTLR start "entryRuleDataFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:811:1: entryRuleDataFile returns [EObject current=null] : iv_ruleDataFile= ruleDataFile EOF ;
    public final EObject entryRuleDataFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:812:2: (iv_ruleDataFile= ruleDataFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:813:2: iv_ruleDataFile= ruleDataFile EOF
            {
             newCompositeNode(grammarAccess.getDataFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_entryRuleDataFile1805);
            iv_ruleDataFile=ruleDataFile();

            state._fsp--;

             current =iv_ruleDataFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataFile1815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataFile"


    // $ANTLR start "ruleDataFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:820:1: ruleDataFile returns [EObject current=null] : ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDataFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_content_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:823:28: ( ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:824:1: ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:824:1: ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:824:2: () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:824:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:825:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataFileAccess().getDataFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataFile1861); 

                	newLeafNode(otherlv_1, grammarAccess.getDataFileAccess().getDataFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:834:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:835:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:835:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:836:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataFile1882);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataFile1894); 

                	newLeafNode(otherlv_3, grammarAccess.getDataFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:856:1: (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:856:3: otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) )
                    {
                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataFile1907); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataFileAccess().getContentKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataFile1919); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:864:1: ( (lv_content_6_0= ruleEByteArray ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:865:1: (lv_content_6_0= ruleEByteArray )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:865:1: (lv_content_6_0= ruleEByteArray )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:866:3: lv_content_6_0= ruleEByteArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataFileAccess().getContentEByteArrayParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_ruleDataFile1940);
                    lv_content_6_0=ruleEByteArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataFileRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_6_0, 
                            		"EByteArray");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataFile1954); 

                	newLeafNode(otherlv_7, grammarAccess.getDataFileAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDataFile"


    // $ANTLR start "entryRuleURLFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:894:1: entryRuleURLFile returns [EObject current=null] : iv_ruleURLFile= ruleURLFile EOF ;
    public final EObject entryRuleURLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:895:2: (iv_ruleURLFile= ruleURLFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:896:2: iv_ruleURLFile= ruleURLFile EOF
            {
             newCompositeNode(grammarAccess.getURLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_entryRuleURLFile1990);
            iv_ruleURLFile=ruleURLFile();

            state._fsp--;

             current =iv_ruleURLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLFile2000); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURLFile"


    // $ANTLR start "ruleURLFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:903:1: ruleURLFile returns [EObject current=null] : ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleURLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uri_3_0 = null;

        EObject lv_excludeExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:906:28: ( ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:2: () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:908:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURLFileAccess().getURLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleURLFile2046); 

                	newLeafNode(otherlv_1, grammarAccess.getURLFileAccess().getURLFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:917:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:919:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getURLFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile2067);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURLFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:935:2: ( (lv_uri_3_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:936:1: (lv_uri_3_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:936:1: (lv_uri_3_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:937:3: lv_uri_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getURLFileAccess().getUriEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile2088);
            lv_uri_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURLFileRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:953:2: (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:953:4: otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleURLFile2101); 

                        	newLeafNode(otherlv_4, grammarAccess.getURLFileAccess().getExcludedIfKeyword_4_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:957:1: ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:958:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:958:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:959:3: lv_excludeExpression_5_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getURLFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleURLFile2122);
                    lv_excludeExpression_5_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getURLFileRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_5_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

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
        }
        return current;
    }
    // $ANTLR end "ruleURLFile"


    // $ANTLR start "entryRuleDynamicFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:983:1: entryRuleDynamicFile returns [EObject current=null] : iv_ruleDynamicFile= ruleDynamicFile EOF ;
    public final EObject entryRuleDynamicFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:984:2: (iv_ruleDynamicFile= ruleDynamicFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:985:2: iv_ruleDynamicFile= ruleDynamicFile EOF
            {
             newCompositeNode(grammarAccess.getDynamicFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDynamicFile_in_entryRuleDynamicFile2160);
            iv_ruleDynamicFile=ruleDynamicFile();

            state._fsp--;

             current =iv_ruleDynamicFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDynamicFile2170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicFile"


    // $ANTLR start "ruleDynamicFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:992:1: ruleDynamicFile returns [EObject current=null] : ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleDynamicFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_executionURI_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_variables_10_0 = null;

        EObject lv_excludeExpression_13_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:995:28: ( ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:996:1: ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:996:1: ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:996:2: () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:996:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:997:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDynamicFileAccess().getDynamicFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDynamicFile2216); 

                	newLeafNode(otherlv_1, grammarAccess.getDynamicFileAccess().getDynamicFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1006:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1007:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1007:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1008:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDynamicFile2237);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDynamicFile2249); 

                	newLeafNode(otherlv_3, grammarAccess.getDynamicFileAccess().getGeneratedFromKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1028:1: ( (lv_executionURI_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1029:1: (lv_executionURI_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1029:1: (lv_executionURI_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1030:3: lv_executionURI_4_0= RULE_STRING
            {
            lv_executionURI_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDynamicFile2266); 

            			newLeafNode(lv_executionURI_4_0, grammarAccess.getDynamicFileAccess().getExecutionURISTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"executionURI",
                    		lv_executionURI_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDynamicFile2283); 

                	newLeafNode(otherlv_5, grammarAccess.getDynamicFileAccess().getByKeyword_5());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1050:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1051:1: (lv_type_6_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1051:1: (lv_type_6_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1052:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDynamicFile2300); 

            			newLeafNode(lv_type_6_0, grammarAccess.getDynamicFileAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1068:2: (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1068:4: otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDynamicFile2318); 

                        	newLeafNode(otherlv_7, grammarAccess.getDynamicFileAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1072:1: ( (lv_variables_8_0= ruleVariable ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1073:1: (lv_variables_8_0= ruleVariable )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1073:1: (lv_variables_8_0= ruleVariable )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1074:3: lv_variables_8_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getVariablesVariableParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDynamicFile2339);
                    lv_variables_8_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_8_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1090:2: (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==18) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1090:4: otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) )
                            {
                            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDynamicFile2352); 

                                	newLeafNode(otherlv_9, grammarAccess.getDynamicFileAccess().getCommaKeyword_7_2_0());
                                
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1094:1: ( (lv_variables_10_0= ruleVariable ) )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1095:1: (lv_variables_10_0= ruleVariable )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1095:1: (lv_variables_10_0= ruleVariable )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1096:3: lv_variables_10_0= ruleVariable
                            {
                             
                            	        newCompositeNode(grammarAccess.getDynamicFileAccess().getVariablesVariableParserRuleCall_7_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDynamicFile2373);
                            lv_variables_10_0=ruleVariable();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"variables",
                                    		lv_variables_10_0, 
                                    		"Variable");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDynamicFile2387); 

                        	newLeafNode(otherlv_11, grammarAccess.getDynamicFileAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1116:3: (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1116:5: otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    {
                    otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDynamicFile2402); 

                        	newLeafNode(otherlv_12, grammarAccess.getDynamicFileAccess().getExcludedIfKeyword_8_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1120:1: ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1121:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1121:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1122:3: lv_excludeExpression_13_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleDynamicFile2423);
                    lv_excludeExpression_13_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_13_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

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
        }
        return current;
    }
    // $ANTLR end "ruleDynamicFile"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1146:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1147:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1148:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2461);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression2471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1155:1: ruleBooleanExpression returns [EObject current=null] : (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ReferencingBooleanExpression_0 = null;

        EObject this_InlineBooleanExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1158:28: ( (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1159:1: (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1159:1: (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_INLINE_SCRIPT) ) {
                    alt19=2;
                }
                else if ( (LA19_1==34) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1160:5: this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanExpressionAccess().getReferencingBooleanExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferencingBooleanExpression_in_ruleBooleanExpression2518);
                    this_ReferencingBooleanExpression_0=ruleReferencingBooleanExpression();

                    state._fsp--;

                     
                            current = this_ReferencingBooleanExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1170:5: this_InlineBooleanExpression_1= ruleInlineBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanExpressionAccess().getInlineBooleanExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInlineBooleanExpression_in_ruleBooleanExpression2545);
                    this_InlineBooleanExpression_1=ruleInlineBooleanExpression();

                    state._fsp--;

                     
                            current = this_InlineBooleanExpression_1; 
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleReferencingBooleanExpression"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1186:1: entryRuleReferencingBooleanExpression returns [EObject current=null] : iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF ;
    public final EObject entryRuleReferencingBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencingBooleanExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1187:2: (iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1188:2: iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getReferencingBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferencingBooleanExpression_in_entryRuleReferencingBooleanExpression2580);
            iv_ruleReferencingBooleanExpression=ruleReferencingBooleanExpression();

            state._fsp--;

             current =iv_ruleReferencingBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferencingBooleanExpression2590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferencingBooleanExpression"


    // $ANTLR start "ruleReferencingBooleanExpression"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1195:1: ruleReferencingBooleanExpression returns [EObject current=null] : ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleReferencingBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_executionURI_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1198:28: ( ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1199:1: ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1199:1: ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1199:2: ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1199:2: ( (lv_executionURI_0_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1200:1: (lv_executionURI_0_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1200:1: (lv_executionURI_0_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1201:3: lv_executionURI_0_0= RULE_STRING
            {
            lv_executionURI_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2632); 

            			newLeafNode(lv_executionURI_0_0, grammarAccess.getReferencingBooleanExpressionAccess().getExecutionURISTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencingBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"executionURI",
                    		lv_executionURI_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleReferencingBooleanExpression2649); 

                	newLeafNode(otherlv_1, grammarAccess.getReferencingBooleanExpressionAccess().getByKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1221:1: ( (lv_type_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1222:1: (lv_type_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1222:1: (lv_type_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1223:3: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2666); 

            			newLeafNode(lv_type_2_0, grammarAccess.getReferencingBooleanExpressionAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencingBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
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
        }
        return current;
    }
    // $ANTLR end "ruleReferencingBooleanExpression"


    // $ANTLR start "entryRuleInlineBooleanExpression"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1247:1: entryRuleInlineBooleanExpression returns [EObject current=null] : iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF ;
    public final EObject entryRuleInlineBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineBooleanExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1248:2: (iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1249:2: iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getInlineBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInlineBooleanExpression_in_entryRuleInlineBooleanExpression2707);
            iv_ruleInlineBooleanExpression=ruleInlineBooleanExpression();

            state._fsp--;

             current =iv_ruleInlineBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineBooleanExpression2717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineBooleanExpression"


    // $ANTLR start "ruleInlineBooleanExpression"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1256:1: ruleInlineBooleanExpression returns [EObject current=null] : ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) ) ;
    public final EObject ruleInlineBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_expression_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1259:28: ( ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1260:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1260:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1260:2: ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1260:2: ( (lv_type_0_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1261:1: (lv_type_0_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1261:1: (lv_type_0_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1262:3: lv_type_0_0= RULE_STRING
            {
            lv_type_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInlineBooleanExpression2759); 

            			newLeafNode(lv_type_0_0, grammarAccess.getInlineBooleanExpressionAccess().getTypeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInlineBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1278:2: ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1279:1: (lv_expression_1_0= RULE_INLINE_SCRIPT )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1279:1: (lv_expression_1_0= RULE_INLINE_SCRIPT )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1280:3: lv_expression_1_0= RULE_INLINE_SCRIPT
            {
            lv_expression_1_0=(Token)match(input,RULE_INLINE_SCRIPT,FollowSets000.FOLLOW_RULE_INLINE_SCRIPT_in_ruleInlineBooleanExpression2781); 

            			newLeafNode(lv_expression_1_0, grammarAccess.getInlineBooleanExpressionAccess().getExpressionINLINE_SCRIPTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInlineBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"INLINE_SCRIPT");
            	    

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
    // $ANTLR end "ruleInlineBooleanExpression"


    // $ANTLR start "entryRuleEByteArray"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1304:1: entryRuleEByteArray returns [String current=null] : iv_ruleEByteArray= ruleEByteArray EOF ;
    public final String entryRuleEByteArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEByteArray = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1305:2: (iv_ruleEByteArray= ruleEByteArray EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1306:2: iv_ruleEByteArray= ruleEByteArray EOF
            {
             newCompositeNode(grammarAccess.getEByteArrayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_entryRuleEByteArray2823);
            iv_ruleEByteArray=ruleEByteArray();

            state._fsp--;

             current =iv_ruleEByteArray.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEByteArray2834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEByteArray"


    // $ANTLR start "ruleEByteArray"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1313:1: ruleEByteArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleEByteArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1316:28: (this_EString_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1318:5: this_EString_0= ruleEString
            {
             
                    newCompositeNode(grammarAccess.getEByteArrayAccess().getEStringParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEByteArray2880);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
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
    // $ANTLR end "ruleEByteArray"


    // $ANTLR start "entryRuleBundleProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1336:1: entryRuleBundleProject returns [EObject current=null] : iv_ruleBundleProject= ruleBundleProject EOF ;
    public final EObject entryRuleBundleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1337:2: (iv_ruleBundleProject= ruleBundleProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1338:2: iv_ruleBundleProject= ruleBundleProject EOF
            {
             newCompositeNode(grammarAccess.getBundleProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_entryRuleBundleProject2924);
            iv_ruleBundleProject=ruleBundleProject();

            state._fsp--;

             current =iv_ruleBundleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundleProject2934); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBundleProject"


    // $ANTLR start "ruleBundleProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1345:1: ruleBundleProject returns [EObject current=null] : ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleBundleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_manifest_7_0 = null;

        EObject lv_buildProperties_10_0 = null;

        EObject lv_pluginxml_13_0 = null;

        EObject lv_resources_17_0 = null;

        EObject lv_resources_19_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1348:28: ( ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1349:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1349:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1349:2: () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1349:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1350:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBundleProjectAccess().getBundleProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBundleProject2980); 

                	newLeafNode(otherlv_1, grammarAccess.getBundleProjectAccess().getBundleProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1359:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1360:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1360:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1361:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundleProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundleProject3001);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject3013); 

                	newLeafNode(otherlv_3, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1381:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1383:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1383:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1384:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1387:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1388:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1388:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                int LA20_0 = input.LA(1);

                if ( LA20_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
                    alt20=3;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1390:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1390:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1391:5: {...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1391:110: ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1392:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1395:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1395:7: {...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1395:16: (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1395:18: otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBundleProject3071); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBundleProjectAccess().getManifestKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject3083); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1403:1: ( (lv_manifest_7_0= ruleManifestFile ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1404:1: (lv_manifest_7_0= ruleManifestFile )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1404:1: (lv_manifest_7_0= ruleManifestFile )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1405:3: lv_manifest_7_0= ruleManifestFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getManifestManifestFileParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleBundleProject3104);
            	    lv_manifest_7_0=ruleManifestFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"manifest",
            	            		lv_manifest_7_0, 
            	            		"ManifestFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1428:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1428:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1429:5: {...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1429:110: ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1430:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1433:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1433:7: {...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1433:16: (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1433:18: otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBundleProject3172); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBundleProjectAccess().getBuildKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject3184); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1441:1: ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1442:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1442:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1443:3: lv_buildProperties_10_0= ruleBuildProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getBuildPropertiesBuildPropertiesParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_ruleBundleProject3205);
            	    lv_buildProperties_10_0=ruleBuildProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"buildProperties",
            	            		lv_buildProperties_10_0, 
            	            		"BuildProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1466:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1466:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1467:5: {...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1467:110: ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1468:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1471:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1471:7: {...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1471:16: (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1471:18: otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    {
            	    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBundleProject3273); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBundleProjectAccess().getPluginxmlKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject3285); 

            	        	newLeafNode(otherlv_12, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1479:1: ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1480:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1480:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1481:3: lv_pluginxml_13_0= rulePluginXMLFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getPluginxmlPluginXMLFileParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleBundleProject3306);
            	    lv_pluginxml_13_0=rulePluginXMLFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pluginxml",
            	            		lv_pluginxml_13_0, 
            	            		"PluginXMLFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canLeave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1512:2: (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1512:4: otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBundleProject3366); 

                        	newLeafNode(otherlv_14, grammarAccess.getBundleProjectAccess().getResourcesKeyword_5_0());
                        
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject3378); 

                        	newLeafNode(otherlv_15, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject3390); 

                        	newLeafNode(otherlv_16, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1524:1: ( (lv_resources_17_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1525:1: (lv_resources_17_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1525:1: (lv_resources_17_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1526:3: lv_resources_17_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject3411);
                    lv_resources_17_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_17_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1542:2: (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1542:4: otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject3424); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getBundleProjectAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1546:1: ( (lv_resources_19_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1547:1: (lv_resources_19_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1547:1: (lv_resources_19_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1548:3: lv_resources_19_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject3445);
                    	    lv_resources_19_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_19_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBundleProject3459); 

                        	newLeafNode(otherlv_20, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBundleProject3473); 

                	newLeafNode(otherlv_21, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleBundleProject"


    // $ANTLR start "entryRuleFeatureProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1580:1: entryRuleFeatureProject returns [EObject current=null] : iv_ruleFeatureProject= ruleFeatureProject EOF ;
    public final EObject entryRuleFeatureProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1581:2: (iv_ruleFeatureProject= ruleFeatureProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1582:2: iv_ruleFeatureProject= ruleFeatureProject EOF
            {
             newCompositeNode(grammarAccess.getFeatureProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject3509);
            iv_ruleFeatureProject=ruleFeatureProject();

            state._fsp--;

             current =iv_ruleFeatureProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureProject3519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureProject"


    // $ANTLR start "ruleFeatureProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1589:1: ruleFeatureProject returns [EObject current=null] : ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleFeatureProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_feature_6_0 = null;

        EObject lv_resources_10_0 = null;

        EObject lv_resources_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1592:28: ( ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1593:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1593:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1593:2: () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1593:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1594:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureProjectAccess().getFeatureProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleFeatureProject3565); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureProjectAccess().getFeatureProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1603:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1604:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1604:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1605:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeatureProject3586);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureProject3598); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleFeatureProject3610); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureProjectAccess().getFeatureKeyword_4());
                
            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureProject3622); 

                	newLeafNode(otherlv_5, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_5());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1633:1: ( (lv_feature_6_0= ruleFeatureFile ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1634:1: (lv_feature_6_0= ruleFeatureFile )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1634:1: (lv_feature_6_0= ruleFeatureFile )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1635:3: lv_feature_6_0= ruleFeatureFile
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getFeatureFeatureFileParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_ruleFeatureProject3643);
            lv_feature_6_0=ruleFeatureFile();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
            	        }
                   		set(
                   			current, 
                   			"feature",
                    		lv_feature_6_0, 
                    		"FeatureFile");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1651:2: (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1651:4: otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}'
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFeatureProject3656); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureProjectAccess().getResourcesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureProject3668); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureProject3680); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1663:1: ( (lv_resources_10_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1664:1: (lv_resources_10_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1664:1: (lv_resources_10_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1665:3: lv_resources_10_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject3701);
                    lv_resources_10_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_10_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1681:2: (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1681:4: otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureProject3714); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getFeatureProjectAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1685:1: ( (lv_resources_12_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1686:1: (lv_resources_12_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1686:1: (lv_resources_12_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1687:3: lv_resources_12_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject3735);
                    	    lv_resources_12_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_12_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureProject3749); 

                        	newLeafNode(otherlv_13, grammarAccess.getFeatureProjectAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureProject3763); 

                	newLeafNode(otherlv_14, grammarAccess.getFeatureProjectAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleFeatureProject"


    // $ANTLR start "entryRuleManifestFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1719:1: entryRuleManifestFile returns [EObject current=null] : iv_ruleManifestFile= ruleManifestFile EOF ;
    public final EObject entryRuleManifestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1720:2: (iv_ruleManifestFile= ruleManifestFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1721:2: iv_ruleManifestFile= ruleManifestFile EOF
            {
             newCompositeNode(grammarAccess.getManifestFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_entryRuleManifestFile3799);
            iv_ruleManifestFile=ruleManifestFile();

            state._fsp--;

             current =iv_ruleManifestFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManifestFile3809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManifestFile"


    // $ANTLR start "ruleManifestFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1728:1: ruleManifestFile returns [EObject current=null] : ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleManifestFile() throws RecognitionException {
        EObject current = null;

        Token lv_lazy_1_0=null;
        Token lv_singleton_2_0=null;
        Token otherlv_3=null;
        Token lv_symbolicname_4_0=null;
        Token lv_version_5_0=null;
        Token lv_executionEnvironment_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_bundlename_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_vendor_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_activatorClass_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_exportedPackages_21_0 = null;

        EObject lv_exportedPackages_23_0 = null;

        EObject lv_importedPackages_28_0 = null;

        EObject lv_importedPackages_30_0 = null;

        EObject lv_requiredBundles_35_0 = null;

        EObject lv_requiredBundles_37_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1731:28: ( ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1732:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1732:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1732:2: () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1732:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1733:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getManifestFileAccess().getManifestFileAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1738:2: ( (lv_lazy_1_0= 'lazy' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1739:1: (lv_lazy_1_0= 'lazy' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1739:1: (lv_lazy_1_0= 'lazy' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1740:3: lv_lazy_1_0= 'lazy'
                    {
                    lv_lazy_1_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleManifestFile3861); 

                            newLeafNode(lv_lazy_1_0, grammarAccess.getManifestFileAccess().getLazyLazyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "lazy", true, "lazy");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1753:3: ( (lv_singleton_2_0= 'singleton' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1754:1: (lv_singleton_2_0= 'singleton' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1754:1: (lv_singleton_2_0= 'singleton' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1755:3: lv_singleton_2_0= 'singleton'
                    {
                    lv_singleton_2_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleManifestFile3893); 

                            newLeafNode(lv_singleton_2_0, grammarAccess.getManifestFileAccess().getSingletonSingletonKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "singleton", true, "singleton");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleManifestFile3919); 

                	newLeafNode(otherlv_3, grammarAccess.getManifestFileAccess().getManifestFileKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1772:1: ( (lv_symbolicname_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1773:1: (lv_symbolicname_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1773:1: (lv_symbolicname_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1774:3: lv_symbolicname_4_0= RULE_STRING
            {
            lv_symbolicname_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3936); 

            			newLeafNode(lv_symbolicname_4_0, grammarAccess.getManifestFileAccess().getSymbolicnameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getManifestFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbolicname",
                    		lv_symbolicname_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1790:2: ( (lv_version_5_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1791:1: (lv_version_5_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1791:1: (lv_version_5_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1792:3: lv_version_5_0= RULE_STRING
            {
            lv_version_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3958); 

            			newLeafNode(lv_version_5_0, grammarAccess.getManifestFileAccess().getVersionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getManifestFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1808:2: ( (lv_executionEnvironment_6_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1809:1: (lv_executionEnvironment_6_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1809:1: (lv_executionEnvironment_6_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1810:3: lv_executionEnvironment_6_0= RULE_STRING
            {
            lv_executionEnvironment_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3980); 

            			newLeafNode(lv_executionEnvironment_6_0, grammarAccess.getManifestFileAccess().getExecutionEnvironmentSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getManifestFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"executionEnvironment",
                    		lv_executionEnvironment_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile3997); 

                	newLeafNode(otherlv_7, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_7());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1830:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1832:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1832:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1833:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1836:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1837:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1837:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( LA27_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1839:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1839:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1840:5: {...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1840:109: ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1841:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1844:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1844:7: {...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1844:16: (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1844:18: otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleManifestFile4055); 

            	        	newLeafNode(otherlv_9, grammarAccess.getManifestFileAccess().getBundlenameKeyword_8_0_0());
            	        
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4067); 

            	        	newLeafNode(otherlv_10, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1852:1: ( (lv_bundlename_11_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1853:1: (lv_bundlename_11_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1853:1: (lv_bundlename_11_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1854:3: lv_bundlename_11_0= RULE_STRING
            	    {
            	    lv_bundlename_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile4084); 

            	    			newLeafNode(lv_bundlename_11_0, grammarAccess.getManifestFileAccess().getBundlenameSTRINGTerminalRuleCall_8_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getManifestFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"bundlename",
            	            		lv_bundlename_11_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1877:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1877:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1878:5: {...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1878:109: ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1879:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1882:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1882:7: {...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1882:16: (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1882:18: otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleManifestFile4157); 

            	        	newLeafNode(otherlv_12, grammarAccess.getManifestFileAccess().getVendorKeyword_8_1_0());
            	        
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4169); 

            	        	newLeafNode(otherlv_13, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1890:1: ( (lv_vendor_14_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1891:1: (lv_vendor_14_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1891:1: (lv_vendor_14_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1892:3: lv_vendor_14_0= RULE_STRING
            	    {
            	    lv_vendor_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile4186); 

            	    			newLeafNode(lv_vendor_14_0, grammarAccess.getManifestFileAccess().getVendorSTRINGTerminalRuleCall_8_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getManifestFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"vendor",
            	            		lv_vendor_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1915:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1915:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1916:5: {...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1916:109: ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1917:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1920:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1920:7: {...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1920:16: (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1920:18: otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleManifestFile4259); 

            	        	newLeafNode(otherlv_15, grammarAccess.getManifestFileAccess().getActivatorClassKeyword_8_2_0());
            	        
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4271); 

            	        	newLeafNode(otherlv_16, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1928:1: ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1929:1: (lv_activatorClass_17_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1929:1: (lv_activatorClass_17_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1930:3: lv_activatorClass_17_0= RULE_STRING
            	    {
            	    lv_activatorClass_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile4288); 

            	    			newLeafNode(lv_activatorClass_17_0, grammarAccess.getManifestFileAccess().getActivatorClassSTRINGTerminalRuleCall_8_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getManifestFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"activatorClass",
            	            		lv_activatorClass_17_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8()) ) {
                throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1961:2: (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1961:4: otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}'
                    {
                    otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleManifestFile4353); 

                        	newLeafNode(otherlv_18, grammarAccess.getManifestFileAccess().getExportedPackagesKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4365); 

                        	newLeafNode(otherlv_19, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_9_1());
                        
                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile4377); 

                        	newLeafNode(otherlv_20, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_9_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1973:1: ( (lv_exportedPackages_21_0= ruleExportedPackage ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1974:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1974:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1975:3: lv_exportedPackages_21_0= ruleExportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile4398);
                    lv_exportedPackages_21_0=ruleExportedPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	        }
                           		add(
                           			current, 
                           			"exportedPackages",
                            		lv_exportedPackages_21_0, 
                            		"ExportedPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1991:2: (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1991:4: otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    {
                    	    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4411); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getManifestFileAccess().getCommaKeyword_9_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1995:1: ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1996:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1996:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1997:3: lv_exportedPackages_23_0= ruleExportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile4432);
                    	    lv_exportedPackages_23_0=ruleExportedPackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exportedPackages",
                    	            		lv_exportedPackages_23_0, 
                    	            		"ExportedPackage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile4446); 

                        	newLeafNode(otherlv_24, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_9_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2017:3: (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2017:5: otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}'
                    {
                    otherlv_25=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleManifestFile4461); 

                        	newLeafNode(otherlv_25, grammarAccess.getManifestFileAccess().getImportedPackagesKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4473); 

                        	newLeafNode(otherlv_26, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_10_1());
                        
                    otherlv_27=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile4485); 

                        	newLeafNode(otherlv_27, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_10_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2029:1: ( (lv_importedPackages_28_0= ruleImportedPackage ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2030:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2030:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2031:3: lv_importedPackages_28_0= ruleImportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile4506);
                    lv_importedPackages_28_0=ruleImportedPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	        }
                           		add(
                           			current, 
                           			"importedPackages",
                            		lv_importedPackages_28_0, 
                            		"ImportedPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2047:2: (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==18) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2047:4: otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    {
                    	    otherlv_29=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4519); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getManifestFileAccess().getCommaKeyword_10_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2051:1: ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2052:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2052:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2053:3: lv_importedPackages_30_0= ruleImportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile4540);
                    	    lv_importedPackages_30_0=ruleImportedPackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"importedPackages",
                    	            		lv_importedPackages_30_0, 
                    	            		"ImportedPackage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile4554); 

                        	newLeafNode(otherlv_31, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_10_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2073:3: (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2073:5: otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}'
                    {
                    otherlv_32=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleManifestFile4569); 

                        	newLeafNode(otherlv_32, grammarAccess.getManifestFileAccess().getRequiredBundlesKeyword_11_0());
                        
                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4581); 

                        	newLeafNode(otherlv_33, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_11_1());
                        
                    otherlv_34=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile4593); 

                        	newLeafNode(otherlv_34, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_11_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2085:1: ( (lv_requiredBundles_35_0= ruleRequiredBundle ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2086:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2086:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2087:3: lv_requiredBundles_35_0= ruleRequiredBundle
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile4614);
                    lv_requiredBundles_35_0=ruleRequiredBundle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredBundles",
                            		lv_requiredBundles_35_0, 
                            		"RequiredBundle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2103:2: (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2103:4: otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    {
                    	    otherlv_36=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4627); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getManifestFileAccess().getCommaKeyword_11_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2107:1: ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2108:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2108:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2109:3: lv_requiredBundles_37_0= ruleRequiredBundle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile4648);
                    	    lv_requiredBundles_37_0=ruleRequiredBundle();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredBundles",
                    	            		lv_requiredBundles_37_0, 
                    	            		"RequiredBundle");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile4662); 

                        	newLeafNode(otherlv_38, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_11_5());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile4676); 

                	newLeafNode(otherlv_39, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleManifestFile"


    // $ANTLR start "entryRulePluginXMLFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2141:1: entryRulePluginXMLFile returns [EObject current=null] : iv_rulePluginXMLFile= rulePluginXMLFile EOF ;
    public final EObject entryRulePluginXMLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginXMLFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2142:2: (iv_rulePluginXMLFile= rulePluginXMLFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2143:2: iv_rulePluginXMLFile= rulePluginXMLFile EOF
            {
             newCompositeNode(grammarAccess.getPluginXMLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile4712);
            iv_rulePluginXMLFile=rulePluginXMLFile();

            state._fsp--;

             current =iv_rulePluginXMLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePluginXMLFile4722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginXMLFile"


    // $ANTLR start "rulePluginXMLFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2150:1: rulePluginXMLFile returns [EObject current=null] : ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject rulePluginXMLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_extensions_6_0 = null;

        EObject lv_extensions_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2153:28: ( ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2154:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2154:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2154:2: () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2154:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2155:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPluginXMLFileAccess().getPluginXMLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulePluginXMLFile4768); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginXMLFileAccess().getPluginXMLFileKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePluginXMLFile4780); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2168:1: (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2168:3: otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePluginXMLFile4793); 

                        	newLeafNode(otherlv_3, grammarAccess.getPluginXMLFileAccess().getExtensionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePluginXMLFile4805); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginXMLFileAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePluginXMLFile4817); 

                        	newLeafNode(otherlv_5, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2180:1: ( (lv_extensions_6_0= ruleExtension ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2181:1: (lv_extensions_6_0= ruleExtension )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2181:1: (lv_extensions_6_0= ruleExtension )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2182:3: lv_extensions_6_0= ruleExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile4838);
                    lv_extensions_6_0=ruleExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPluginXMLFileRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_6_0, 
                            		"Extension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2198:2: (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2198:4: otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePluginXMLFile4851); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPluginXMLFileAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2202:1: ( (lv_extensions_8_0= ruleExtension ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2203:1: (lv_extensions_8_0= ruleExtension )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2203:1: (lv_extensions_8_0= ruleExtension )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2204:3: lv_extensions_8_0= ruleExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile4872);
                    	    lv_extensions_8_0=ruleExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPluginXMLFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_8_0, 
                    	            		"Extension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePluginXMLFile4886); 

                        	newLeafNode(otherlv_9, grammarAccess.getPluginXMLFileAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePluginXMLFile4900); 

                	newLeafNode(otherlv_10, grammarAccess.getPluginXMLFileAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePluginXMLFile"


    // $ANTLR start "entryRuleBuildProperties"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2236:1: entryRuleBuildProperties returns [EObject current=null] : iv_ruleBuildProperties= ruleBuildProperties EOF ;
    public final EObject entryRuleBuildProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildProperties = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2237:2: (iv_ruleBuildProperties= ruleBuildProperties EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2238:2: iv_ruleBuildProperties= ruleBuildProperties EOF
            {
             newCompositeNode(grammarAccess.getBuildPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties4936);
            iv_ruleBuildProperties=ruleBuildProperties();

            state._fsp--;

             current =iv_ruleBuildProperties; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuildProperties4946); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildProperties"


    // $ANTLR start "ruleBuildProperties"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2245:1: ruleBuildProperties returns [EObject current=null] : ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleBuildProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2248:28: ( ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2249:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2249:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2249:2: () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2249:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2250:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildPropertiesAccess().getBuildPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleBuildProperties4992); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildPropertiesAccess().getBuildPropertiesKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBuildProperties5004); 

                	newLeafNode(otherlv_2, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2263:1: (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2263:3: otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleBuildProperties5017); 

                        	newLeafNode(otherlv_3, grammarAccess.getBuildPropertiesAccess().getBinIncludesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBuildProperties5029); 

                        	newLeafNode(otherlv_4, grammarAccess.getBuildPropertiesAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBuildProperties5041); 

                        	newLeafNode(otherlv_5, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2275:1: ( (otherlv_6= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2276:1: (otherlv_6= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2276:1: (otherlv_6= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2277:3: otherlv_6= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties5061); 

                    		newLeafNode(otherlv_6, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_3_0()); 
                    	

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2288:2: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2288:4: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBuildProperties5074); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBuildPropertiesAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2292:1: ( (otherlv_8= RULE_STRING ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2293:1: (otherlv_8= RULE_STRING )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2293:1: (otherlv_8= RULE_STRING )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2294:3: otherlv_8= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties5094); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBuildProperties5108); 

                        	newLeafNode(otherlv_9, grammarAccess.getBuildPropertiesAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBuildProperties5122); 

                	newLeafNode(otherlv_10, grammarAccess.getBuildPropertiesAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleBuildProperties"


    // $ANTLR start "entryRuleProductFileFeaturebase"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2321:1: entryRuleProductFileFeaturebase returns [EObject current=null] : iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF ;
    public final EObject entryRuleProductFileFeaturebase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFileFeaturebase = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2322:2: (iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2323:2: iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF
            {
             newCompositeNode(grammarAccess.getProductFileFeaturebaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase5158);
            iv_ruleProductFileFeaturebase=ruleProductFileFeaturebase();

            state._fsp--;

             current =iv_ruleProductFileFeaturebase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFileFeaturebase5168); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductFileFeaturebase"


    // $ANTLR start "ruleProductFileFeaturebase"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2330:1: ruleProductFileFeaturebase returns [EObject current=null] : ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
    public final EObject ruleProductFileFeaturebase() throws RecognitionException {
        EObject current = null;

        Token lv_includeLaunchers_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_vmArgs_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_programArgs_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_productName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_application_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_version_20_0 = null;

        EObject lv_startconfigurations_24_0 = null;

        EObject lv_startconfigurations_26_0 = null;

        EObject lv_features_31_0 = null;

        EObject lv_features_33_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2333:28: ( ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2334:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2334:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2334:2: () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2334:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2335:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2340:2: ( (lv_includeLaunchers_1_0= 'launchable' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2341:1: (lv_includeLaunchers_1_0= 'launchable' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2341:1: (lv_includeLaunchers_1_0= 'launchable' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2342:3: lv_includeLaunchers_1_0= 'launchable'
                    {
                    lv_includeLaunchers_1_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleProductFileFeaturebase5220); 

                            newLeafNode(lv_includeLaunchers_1_0, grammarAccess.getProductFileFeaturebaseAccess().getIncludeLaunchersLaunchableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		setWithLastConsumed(current, "includeLaunchers", true, "launchable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleProductFileFeaturebase5246); 

                	newLeafNode(otherlv_2, grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2359:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2360:1: (lv_id_3_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2360:1: (lv_id_3_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2361:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5263); 

            			newLeafNode(lv_id_3_0, grammarAccess.getProductFileFeaturebaseAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase5280); 

                	newLeafNode(otherlv_4, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_4());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2381:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2383:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2383:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2384:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2387:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2388:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2388:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=6;
                int LA39_0 = input.LA(1);

                if ( LA39_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
                    alt39=3;
                }
                else if ( LA39_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
                    alt39=4;
                }
                else if ( LA39_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
                    alt39=5;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2390:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2390:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2391:5: {...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2391:119: ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2392:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2395:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2395:7: {...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2395:16: (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2395:18: otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleProductFileFeaturebase5338); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProductFileFeaturebaseAccess().getVmArgsKeyword_5_0_0());
            	        
            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5350); 

            	        	newLeafNode(otherlv_7, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2403:1: ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2404:1: (lv_vmArgs_8_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2404:1: (lv_vmArgs_8_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2405:3: lv_vmArgs_8_0= RULE_STRING
            	    {
            	    lv_vmArgs_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5367); 

            	    			newLeafNode(lv_vmArgs_8_0, grammarAccess.getProductFileFeaturebaseAccess().getVmArgsSTRINGTerminalRuleCall_5_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"vmArgs",
            	            		lv_vmArgs_8_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2428:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2428:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2429:5: {...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2429:119: ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2430:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2433:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2433:7: {...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2433:16: (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2433:18: otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleProductFileFeaturebase5440); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProductFileFeaturebaseAccess().getProgramArgsKeyword_5_1_0());
            	        
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5452); 

            	        	newLeafNode(otherlv_10, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2441:1: ( (lv_programArgs_11_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2442:1: (lv_programArgs_11_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2442:1: (lv_programArgs_11_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2443:3: lv_programArgs_11_0= RULE_STRING
            	    {
            	    lv_programArgs_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5469); 

            	    			newLeafNode(lv_programArgs_11_0, grammarAccess.getProductFileFeaturebaseAccess().getProgramArgsSTRINGTerminalRuleCall_5_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"programArgs",
            	            		lv_programArgs_11_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2466:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2466:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2467:5: {...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2467:119: ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2468:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2471:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2471:7: {...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2471:16: (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2471:18: otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleProductFileFeaturebase5542); 

            	        	newLeafNode(otherlv_12, grammarAccess.getProductFileFeaturebaseAccess().getProductNameKeyword_5_2_0());
            	        
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5554); 

            	        	newLeafNode(otherlv_13, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2479:1: ( (lv_productName_14_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2480:1: (lv_productName_14_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2480:1: (lv_productName_14_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2481:3: lv_productName_14_0= RULE_STRING
            	    {
            	    lv_productName_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5571); 

            	    			newLeafNode(lv_productName_14_0, grammarAccess.getProductFileFeaturebaseAccess().getProductNameSTRINGTerminalRuleCall_5_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"productName",
            	            		lv_productName_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2504:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2504:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2505:5: {...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2505:119: ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2506:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2509:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2509:7: {...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2509:16: (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2509:18: otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleProductFileFeaturebase5644); 

            	        	newLeafNode(otherlv_15, grammarAccess.getProductFileFeaturebaseAccess().getApplicationKeyword_5_3_0());
            	        
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5656); 

            	        	newLeafNode(otherlv_16, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_3_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2517:1: ( (lv_application_17_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2518:1: (lv_application_17_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2518:1: (lv_application_17_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2519:3: lv_application_17_0= RULE_STRING
            	    {
            	    lv_application_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5673); 

            	    			newLeafNode(lv_application_17_0, grammarAccess.getProductFileFeaturebaseAccess().getApplicationSTRINGTerminalRuleCall_5_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"application",
            	            		lv_application_17_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2542:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2542:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2543:5: {...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2543:119: ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2544:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2547:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2547:7: {...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2547:16: (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2547:18: otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) )
            	    {
            	    otherlv_18=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleProductFileFeaturebase5746); 

            	        	newLeafNode(otherlv_18, grammarAccess.getProductFileFeaturebaseAccess().getVersionKeyword_5_4_0());
            	        
            	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5758); 

            	        	newLeafNode(otherlv_19, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_4_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2555:1: ( (lv_version_20_0= ruleVersion ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2556:1: (lv_version_20_0= ruleVersion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2556:1: (lv_version_20_0= ruleVersion )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2557:3: lv_version_20_0= ruleVersion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getVersionVersionParserRuleCall_5_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleProductFileFeaturebase5779);
            	    lv_version_20_0=ruleVersion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"version",
            	            		lv_version_20_0, 
            	            		"Version");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canLeave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2588:2: (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2588:4: otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}'
                    {
                    otherlv_21=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleProductFileFeaturebase5839); 

                        	newLeafNode(otherlv_21, grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5851); 

                        	newLeafNode(otherlv_22, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase5863); 

                        	newLeafNode(otherlv_23, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2600:1: ( (lv_startconfigurations_24_0= ruleProductStartConfig ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2601:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2601:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2602:3: lv_startconfigurations_24_0= ruleProductStartConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5884);
                    lv_startconfigurations_24_0=ruleProductStartConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		add(
                           			current, 
                           			"startconfigurations",
                            		lv_startconfigurations_24_0, 
                            		"ProductStartConfig");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2618:2: (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==18) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2618:4: otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase5897); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2622:1: ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2623:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2623:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2624:3: lv_startconfigurations_26_0= ruleProductStartConfig
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5918);
                    	    lv_startconfigurations_26_0=ruleProductStartConfig();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startconfigurations",
                    	            		lv_startconfigurations_26_0, 
                    	            		"ProductStartConfig");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProductFileFeaturebase5932); 

                        	newLeafNode(otherlv_27, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2644:3: (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==62) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2644:5: otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}'
                    {
                    otherlv_28=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleProductFileFeaturebase5947); 

                        	newLeafNode(otherlv_28, grammarAccess.getProductFileFeaturebaseAccess().getFeaturesKeyword_7_0());
                        
                    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5959); 

                        	newLeafNode(otherlv_29, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase5971); 

                        	newLeafNode(otherlv_30, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2656:1: ( (lv_features_31_0= ruleProductFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2657:1: (lv_features_31_0= ruleProductFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2657:1: (lv_features_31_0= ruleProductFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2658:3: lv_features_31_0= ruleProductFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase5992);
                    lv_features_31_0=ruleProductFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_31_0, 
                            		"ProductFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2674:2: (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2674:4: otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) )
                    	    {
                    	    otherlv_32=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase6005); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2678:1: ( (lv_features_33_0= ruleProductFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2679:1: (lv_features_33_0= ruleProductFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2679:1: (lv_features_33_0= ruleProductFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2680:3: lv_features_33_0= ruleProductFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase6026);
                    	    lv_features_33_0=ruleProductFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_33_0, 
                    	            		"ProductFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProductFileFeaturebase6040); 

                        	newLeafNode(otherlv_34, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_35=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProductFileFeaturebase6054); 

                	newLeafNode(otherlv_35, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleProductFileFeaturebase"


    // $ANTLR start "entryRuleFeatureFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2712:1: entryRuleFeatureFile returns [EObject current=null] : iv_ruleFeatureFile= ruleFeatureFile EOF ;
    public final EObject entryRuleFeatureFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2713:2: (iv_ruleFeatureFile= ruleFeatureFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2714:2: iv_ruleFeatureFile= ruleFeatureFile EOF
            {
             newCompositeNode(grammarAccess.getFeatureFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile6090);
            iv_ruleFeatureFile=ruleFeatureFile();

            state._fsp--;

             current =iv_ruleFeatureFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureFile6100); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureFile"


    // $ANTLR start "ruleFeatureFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2721:1: ruleFeatureFile returns [EObject current=null] : ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) ;
    public final EObject ruleFeatureFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_featureid_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_featurename_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_vendor_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_license_feature_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_description_16_0 = null;

        EObject lv_copyright_19_0 = null;

        EObject lv_license_22_0 = null;

        AntlrDatatypeRuleToken lv_license_feature_version_29_0 = null;

        EObject lv_plugins_33_0 = null;

        EObject lv_plugins_35_0 = null;

        EObject lv_requiredfeatures_40_0 = null;

        EObject lv_requiredfeatures_42_0 = null;

        EObject lv_includedfeatures_47_0 = null;

        EObject lv_includedfeatures_49_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2724:28: ( ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2725:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2725:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2725:2: () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2725:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureFileAccess().getFeatureFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleFeatureFile6146); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureFileAccess().getFeatureFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2735:1: ( (lv_featureid_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2736:1: (lv_featureid_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2736:1: (lv_featureid_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2737:3: lv_featureid_2_0= RULE_STRING
            {
            lv_featureid_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6163); 

            			newLeafNode(lv_featureid_2_0, grammarAccess.getFeatureFileAccess().getFeatureidSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureid",
                    		lv_featureid_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile6180); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2757:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2759:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2759:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2760:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2763:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2764:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2764:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=8;
                int LA45_0 = input.LA(1);

                if ( LA45_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
                    alt45=3;
                }
                else if ( LA45_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
                    alt45=4;
                }
                else if ( LA45_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
                    alt45=5;
                }
                else if ( LA45_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
                    alt45=6;
                }
                else if ( LA45_0 >=68 && LA45_0<=69 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
                    alt45=7;
                }


                switch (alt45) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2766:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2766:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2767:5: {...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2767:108: ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2768:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2771:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2771:7: {...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2771:16: (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2771:18: otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleFeatureFile6238); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFeatureFileAccess().getVersionKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6250); 

            	        	newLeafNode(otherlv_6, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2779:1: ( (lv_version_7_0= ruleVersion ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2780:1: (lv_version_7_0= ruleVersion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2780:1: (lv_version_7_0= ruleVersion )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2781:3: lv_version_7_0= ruleVersion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile6271);
            	    lv_version_7_0=ruleVersion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"version",
            	            		lv_version_7_0, 
            	            		"Version");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2804:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2804:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2805:5: {...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2805:108: ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2806:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2809:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2809:7: {...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2809:16: (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2809:18: otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleFeatureFile6339); 

            	        	newLeafNode(otherlv_8, grammarAccess.getFeatureFileAccess().getFeaturenameKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6351); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2817:1: ( (lv_featurename_10_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2818:1: (lv_featurename_10_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2818:1: (lv_featurename_10_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2819:3: lv_featurename_10_0= RULE_STRING
            	    {
            	    lv_featurename_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6368); 

            	    			newLeafNode(lv_featurename_10_0, grammarAccess.getFeatureFileAccess().getFeaturenameSTRINGTerminalRuleCall_4_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"featurename",
            	            		lv_featurename_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2842:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2842:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2843:5: {...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2843:108: ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2844:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2847:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2847:7: {...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2847:16: (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2847:18: otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleFeatureFile6441); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFeatureFileAccess().getVendorKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6453); 

            	        	newLeafNode(otherlv_12, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2855:1: ( (lv_vendor_13_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2856:1: (lv_vendor_13_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2856:1: (lv_vendor_13_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2857:3: lv_vendor_13_0= RULE_STRING
            	    {
            	    lv_vendor_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6470); 

            	    			newLeafNode(lv_vendor_13_0, grammarAccess.getFeatureFileAccess().getVendorSTRINGTerminalRuleCall_4_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"vendor",
            	            		lv_vendor_13_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2880:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2880:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2881:5: {...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2881:108: ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2882:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2885:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2885:7: {...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2885:16: (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2885:18: otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) )
            	    {
            	    otherlv_14=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleFeatureFile6543); 

            	        	newLeafNode(otherlv_14, grammarAccess.getFeatureFileAccess().getDescriptionKeyword_4_3_0());
            	        
            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6555); 

            	        	newLeafNode(otherlv_15, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_3_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2893:1: ( (lv_description_16_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2894:1: (lv_description_16_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2894:1: (lv_description_16_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2895:3: lv_description_16_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getDescriptionLinkedStringParserRuleCall_4_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile6576);
            	    lv_description_16_0=ruleLinkedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_16_0, 
            	            		"LinkedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2918:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2918:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2919:5: {...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2919:108: ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2920:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2923:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2923:7: {...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2923:16: (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2923:18: otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) )
            	    {
            	    otherlv_17=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFeatureFile6644); 

            	        	newLeafNode(otherlv_17, grammarAccess.getFeatureFileAccess().getCopyrightKeyword_4_4_0());
            	        
            	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6656); 

            	        	newLeafNode(otherlv_18, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_4_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2931:1: ( (lv_copyright_19_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2932:1: (lv_copyright_19_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2932:1: (lv_copyright_19_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2933:3: lv_copyright_19_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getCopyrightLinkedStringParserRuleCall_4_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile6677);
            	    lv_copyright_19_0=ruleLinkedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"copyright",
            	            		lv_copyright_19_0, 
            	            		"LinkedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2956:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2956:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2957:5: {...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2957:108: ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2958:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2961:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2961:7: {...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2961:16: (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2961:18: otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) )
            	    {
            	    otherlv_20=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleFeatureFile6745); 

            	        	newLeafNode(otherlv_20, grammarAccess.getFeatureFileAccess().getLicenseKeyword_4_5_0());
            	        
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6757); 

            	        	newLeafNode(otherlv_21, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_5_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2969:1: ( (lv_license_22_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2970:1: (lv_license_22_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2970:1: (lv_license_22_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2971:3: lv_license_22_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicenseLinkedStringParserRuleCall_4_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile6778);
            	    lv_license_22_0=ruleLinkedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"license",
            	            		lv_license_22_0, 
            	            		"LinkedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2994:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2994:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2995:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2995:108: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2996:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2999:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2999:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2999:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3001:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3001:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3002:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3005:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3006:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3006:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+
            	    int cnt44=0;
            	    loop44:
            	    do {
            	        int alt44=3;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==68) ) {
            	            int LA44_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	                alt44=1;
            	            }


            	        }
            	        else if ( (LA44_0==69) ) {
            	            int LA44_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	                alt44=2;
            	            }


            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3008:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3008:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3009:5: {...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0)");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3009:110: ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3010:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0);
            	    	    	 				
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3013:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3013:7: {...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3013:16: (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3013:18: otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleFeatureFile6891); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getFeatureFileAccess().getLicenseFeatureKeyword_4_6_0_0());
            	    	        
            	    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile6903); 

            	    	        	newLeafNode(otherlv_25, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_0_1());
            	    	        
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3021:1: ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3022:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3022:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3023:3: lv_license_feature_26_0= RULE_STRING
            	    	    {
            	    	    lv_license_feature_26_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6920); 

            	    	    			newLeafNode(lv_license_feature_26_0, grammarAccess.getFeatureFileAccess().getLicense_featureSTRINGTerminalRuleCall_4_6_0_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"license_feature",
            	    	            		lv_license_feature_26_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3046:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3046:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3047:5: {...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1)");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3047:110: ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3048:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1);
            	    	    	 				
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3051:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3051:7: {...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3051:16: (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3051:18: otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleFeatureFile6993); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getFeatureFileAccess().getLicenseFeatureVersionKeyword_4_6_1_0());
            	    	        
            	    	    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7005); 

            	    	        	newLeafNode(otherlv_28, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_1_1());
            	    	        
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3059:1: ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3060:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3060:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3061:3: lv_license_feature_version_29_0= ruleVersion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicense_feature_versionVersionParserRuleCall_4_6_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile7026);
            	    	    lv_license_feature_version_29_0=ruleVersion();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	    	        }
            	    	           		set(
            	    	           			current, 
            	    	           			"license_feature_version",
            	    	            		lv_license_feature_version_29_0, 
            	    	            		"Version");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	    	 				

            	    	    }


            	    	    }


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

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6()) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3107:2: (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3107:4: otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}'
                    {
                    otherlv_30=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleFeatureFile7132); 

                        	newLeafNode(otherlv_30, grammarAccess.getFeatureFileAccess().getPluginsKeyword_5_0());
                        
                    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7144); 

                        	newLeafNode(otherlv_31, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile7156); 

                        	newLeafNode(otherlv_32, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3119:1: ( (lv_plugins_33_0= ruleFeaturePlugin ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3120:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3120:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3121:3: lv_plugins_33_0= ruleFeaturePlugin
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7177);
                    lv_plugins_33_0=ruleFeaturePlugin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	        }
                           		add(
                           			current, 
                           			"plugins",
                            		lv_plugins_33_0, 
                            		"FeaturePlugin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3137:2: (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==18) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3137:4: otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    {
                    	    otherlv_34=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7190); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getFeatureFileAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3141:1: ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3142:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3142:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3143:3: lv_plugins_35_0= ruleFeaturePlugin
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7211);
                    	    lv_plugins_35_0=ruleFeaturePlugin();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"plugins",
                    	            		lv_plugins_35_0, 
                    	            		"FeaturePlugin");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile7225); 

                        	newLeafNode(otherlv_36, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3163:3: (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3163:5: otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}'
                    {
                    otherlv_37=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleFeatureFile7240); 

                        	newLeafNode(otherlv_37, grammarAccess.getFeatureFileAccess().getRequiredKeyword_6_0());
                        
                    otherlv_38=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7252); 

                        	newLeafNode(otherlv_38, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_39=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile7264); 

                        	newLeafNode(otherlv_39, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3175:1: ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3176:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3176:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3177:3: lv_requiredfeatures_40_0= ruleRequiredFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7285);
                    lv_requiredfeatures_40_0=ruleRequiredFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredfeatures",
                            		lv_requiredfeatures_40_0, 
                            		"RequiredFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3193:2: (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==18) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3193:4: otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    {
                    	    otherlv_41=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7298); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getFeatureFileAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3197:1: ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3198:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3198:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3199:3: lv_requiredfeatures_42_0= ruleRequiredFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7319);
                    	    lv_requiredfeatures_42_0=ruleRequiredFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredfeatures",
                    	            		lv_requiredfeatures_42_0, 
                    	            		"RequiredFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile7333); 

                        	newLeafNode(otherlv_43, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3219:3: (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3219:5: otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}'
                    {
                    otherlv_44=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleFeatureFile7348); 

                        	newLeafNode(otherlv_44, grammarAccess.getFeatureFileAccess().getIncludedKeyword_7_0());
                        
                    otherlv_45=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7360); 

                        	newLeafNode(otherlv_45, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_46=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile7372); 

                        	newLeafNode(otherlv_46, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3231:1: ( (lv_includedfeatures_47_0= ruleIncludedFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3232:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3232:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3233:3: lv_includedfeatures_47_0= ruleIncludedFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7393);
                    lv_includedfeatures_47_0=ruleIncludedFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	        }
                           		add(
                           			current, 
                           			"includedfeatures",
                            		lv_includedfeatures_47_0, 
                            		"IncludedFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3249:2: (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==18) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3249:4: otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    {
                    	    otherlv_48=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7406); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getFeatureFileAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3253:1: ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3254:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3254:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3255:3: lv_includedfeatures_49_0= ruleIncludedFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7427);
                    	    lv_includedfeatures_49_0=ruleIncludedFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"includedfeatures",
                    	            		lv_includedfeatures_49_0, 
                    	            		"IncludedFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile7441); 

                        	newLeafNode(otherlv_50, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_51=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile7455); 

                	newLeafNode(otherlv_51, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleFeatureFile"


    // $ANTLR start "entryRuleImportedPackage"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3287:1: entryRuleImportedPackage returns [EObject current=null] : iv_ruleImportedPackage= ruleImportedPackage EOF ;
    public final EObject entryRuleImportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedPackage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3288:2: (iv_ruleImportedPackage= ruleImportedPackage EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3289:2: iv_ruleImportedPackage= ruleImportedPackage EOF
            {
             newCompositeNode(grammarAccess.getImportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage7491);
            iv_ruleImportedPackage=ruleImportedPackage();

            state._fsp--;

             current =iv_ruleImportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportedPackage7501); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportedPackage"


    // $ANTLR start "ruleImportedPackage"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3296:1: ruleImportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? ) ;
    public final EObject ruleImportedPackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_minExclusive_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_maxExclusive_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_minVersion_4_0 = null;

        AntlrDatatypeRuleToken lv_maxVersion_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3299:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3300:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3300:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3300:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3300:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportedPackageAccess().getImportedPackageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3306:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3307:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3307:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3308:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportedPackage7552); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImportedPackageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportedPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3324:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT||(LA58_0>=73 && LA58_0<=74)) ) {
                alt58=1;
            }
            else if ( (LA58_0==18) ) {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==EOF||LA58_2==RULE_INT||(LA58_2>=18 && LA58_2<=19)||(LA58_2>=75 && LA58_2<=76)) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3324:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3324:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_INT||LA53_0==18||LA53_0==73) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==74) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3324:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3324:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==73) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3325:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3325:1: (lv_minExclusive_2_0= '(' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3326:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleImportedPackage7577); 

                                            newLeafNode(lv_minExclusive_2_0, grammarAccess.getImportedPackageAccess().getMinExclusiveLeftParenthesisKeyword_2_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getImportedPackageRule());
                                    	        }
                                           		setWithLastConsumed(current, "minExclusive", true, "(");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3340:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleImportedPackage7609); 

                                	newLeafNode(otherlv_3, grammarAccess.getImportedPackageAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3344:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_INT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3345:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3345:1: (lv_minVersion_4_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3346:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage7631);
                            lv_minVersion_4_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImportedPackageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"minVersion",
                                    		lv_minVersion_4_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImportedPackage7644); 

                        	newLeafNode(otherlv_5, grammarAccess.getImportedPackageAccess().getCommaKeyword_2_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3366:1: ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3366:2: ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3366:2: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_INT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3367:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3367:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3368:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMaxVersionVersionParserRuleCall_2_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage7666);
                            lv_maxVersion_6_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImportedPackageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"maxVersion",
                                    		lv_maxVersion_6_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3384:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==EOF||(LA57_0>=18 && LA57_0<=19)||LA57_0==75) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==76) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3384:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3384:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==75) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3385:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3385:1: (lv_maxExclusive_7_0= ')' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3386:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleImportedPackage7686); 

                                            newLeafNode(lv_maxExclusive_7_0, grammarAccess.getImportedPackageAccess().getMaxExclusiveRightParenthesisKeyword_2_3_1_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getImportedPackageRule());
                                    	        }
                                           		setWithLastConsumed(current, "maxExclusive", true, ")");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3400:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleImportedPackage7718); 

                                	newLeafNode(otherlv_8, grammarAccess.getImportedPackageAccess().getRightSquareBracketKeyword_2_3_1_1());
                                

                            }
                            break;

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
        }
        return current;
    }
    // $ANTLR end "ruleImportedPackage"


    // $ANTLR start "entryRuleExportedPackage"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3412:1: entryRuleExportedPackage returns [EObject current=null] : iv_ruleExportedPackage= ruleExportedPackage EOF ;
    public final EObject entryRuleExportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportedPackage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3413:2: (iv_ruleExportedPackage= ruleExportedPackage EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3414:2: iv_ruleExportedPackage= ruleExportedPackage EOF
            {
             newCompositeNode(grammarAccess.getExportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage7758);
            iv_ruleExportedPackage=ruleExportedPackage();

            state._fsp--;

             current =iv_ruleExportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExportedPackage7768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportedPackage"


    // $ANTLR start "ruleExportedPackage"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3421:1: ruleExportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleExportedPackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3424:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3425:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3425:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3425:2: () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3425:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3426:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExportedPackageAccess().getExportedPackageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3431:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3432:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3432:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3433:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExportedPackage7819); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExportedPackageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExportedPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3449:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3450:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3450:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3451:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportedPackageAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleExportedPackage7845);
                    lv_version_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExportedPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"Version");
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
        }
        return current;
    }
    // $ANTLR end "ruleExportedPackage"


    // $ANTLR start "entryRuleExtension"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3475:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3476:2: (iv_ruleExtension= ruleExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3477:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension7882);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension7892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3484:1: ruleExtension returns [EObject current=null] : ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token lv_point_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_elements_9_0 = null;

        EObject lv_elements_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3487:28: ( ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3488:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3488:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3488:2: () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3488:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3489:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtensionAccess().getExtensionAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3494:2: ( (lv_point_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3495:1: (lv_point_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3495:1: (lv_point_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3496:3: lv_point_1_0= RULE_STRING
            {
            lv_point_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension7943); 

            			newLeafNode(lv_point_1_0, grammarAccess.getExtensionAccess().getPointSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtensionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"point",
                    		lv_point_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtension7960); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3516:1: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==77) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3516:3: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleExtension7973); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getIdKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension7985); 

                        	newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3524:1: ( (lv_id_5_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3525:1: (lv_id_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3525:1: (lv_id_5_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3526:3: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension8002); 

                    			newLeafNode(lv_id_5_0, grammarAccess.getExtensionAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3542:4: (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==78) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3542:6: otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}'
                    {
                    otherlv_6=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleExtension8022); 

                        	newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getElementsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension8034); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtension8046); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3554:1: ( (lv_elements_9_0= ruleElement ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3555:1: (lv_elements_9_0= ruleElement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3555:1: (lv_elements_9_0= ruleElement )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3556:3: lv_elements_9_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension8067);
                    lv_elements_9_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_9_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3572:2: (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==18) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3572:4: otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension8080); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3576:1: ( (lv_elements_11_0= ruleElement ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3577:1: (lv_elements_11_0= ruleElement )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3577:1: (lv_elements_11_0= ruleElement )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3578:3: lv_elements_11_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension8101);
                    	    lv_elements_11_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_11_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension8115); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension8129); 

                	newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleElement"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3610:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3611:2: (iv_ruleElement= ruleElement EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3612:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement8165);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement8175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3619:1: ruleElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_children_13_0 = null;

        EObject lv_children_15_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3622:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3623:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3623:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3623:2: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3623:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3624:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementAccess().getElementAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3629:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3630:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3630:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3631:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElement8226); 

            			newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement8243); 

                	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3651:1: (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==79) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3651:3: otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleElement8256); 

                        	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getAttributesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement8268); 

                        	newLeafNode(otherlv_4, grammarAccess.getElementAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement8280); 

                        	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3663:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3664:1: (lv_attributes_6_0= ruleAttribute )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3664:1: (lv_attributes_6_0= ruleAttribute )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3665:3: lv_attributes_6_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement8301);
                    lv_attributes_6_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_6_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3681:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==18) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3681:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement8314); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getElementAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3685:1: ( (lv_attributes_8_0= ruleAttribute ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3686:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3686:1: (lv_attributes_8_0= ruleAttribute )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3687:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement8335);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_8_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement8349); 

                        	newLeafNode(otherlv_9, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3707:3: (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==25) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3707:5: otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleElement8364); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementAccess().getChildrenKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement8376); 

                        	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement8388); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3719:1: ( (lv_children_13_0= ruleElement ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3720:1: (lv_children_13_0= ruleElement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3720:1: (lv_children_13_0= ruleElement )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3721:3: lv_children_13_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement8409);
                    lv_children_13_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"children",
                            		lv_children_13_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3737:2: (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==18) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3737:4: otherlv_14= ',' ( (lv_children_15_0= ruleElement ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement8422); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getElementAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3741:1: ( (lv_children_15_0= ruleElement ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3742:1: (lv_children_15_0= ruleElement )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3742:1: (lv_children_15_0= ruleElement )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3743:3: lv_children_15_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement8443);
                    	    lv_children_15_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_15_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement8457); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement8471); 

                	newLeafNode(otherlv_17, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAttribute"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3775:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3776:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3777:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute8507);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute8517); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3784:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3787:28: ( ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3788:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3788:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3788:2: () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3788:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3789:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAttribute8563); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3798:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3799:1: (lv_name_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3799:1: (lv_name_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3800:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute8580); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute8597); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3820:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3821:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3821:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3822:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute8614); 

            			newLeafNode(lv_value_4_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute8631); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequiredBundle"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3850:1: entryRuleRequiredBundle returns [EObject current=null] : iv_ruleRequiredBundle= ruleRequiredBundle EOF ;
    public final EObject entryRuleRequiredBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBundle = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3851:2: (iv_ruleRequiredBundle= ruleRequiredBundle EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3852:2: iv_ruleRequiredBundle= ruleRequiredBundle EOF
            {
             newCompositeNode(grammarAccess.getRequiredBundleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle8667);
            iv_ruleRequiredBundle=ruleRequiredBundle();

            state._fsp--;

             current =iv_ruleRequiredBundle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredBundle8677); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredBundle"


    // $ANTLR start "ruleRequiredBundle"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3859:1: ruleRequiredBundle returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? ) ;
    public final EObject ruleRequiredBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_minExclusive_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_maxExclusive_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_minVersion_4_0 = null;

        AntlrDatatypeRuleToken lv_maxVersion_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3862:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3863:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3863:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3863:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3863:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3864:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredBundleAccess().getRequiredBundleAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3869:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3870:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3870:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3871:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredBundle8728); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequiredBundleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredBundleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3887:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT||(LA73_0>=73 && LA73_0<=74)) ) {
                alt73=1;
            }
            else if ( (LA73_0==18) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==EOF||LA73_2==RULE_INT||(LA73_2>=18 && LA73_2<=19)||(LA73_2>=75 && LA73_2<=76)) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3887:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3887:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT||LA68_0==18||LA68_0==73) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==74) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3887:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3887:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==73) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3888:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3888:1: (lv_minExclusive_2_0= '(' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3889:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleRequiredBundle8753); 

                                            newLeafNode(lv_minExclusive_2_0, grammarAccess.getRequiredBundleAccess().getMinExclusiveLeftParenthesisKeyword_2_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getRequiredBundleRule());
                                    	        }
                                           		setWithLastConsumed(current, "minExclusive", true, "(");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3903:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleRequiredBundle8785); 

                                	newLeafNode(otherlv_3, grammarAccess.getRequiredBundleAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3907:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3908:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3908:1: (lv_minVersion_4_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3909:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle8807);
                            lv_minVersion_4_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRequiredBundleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"minVersion",
                                    		lv_minVersion_4_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRequiredBundle8820); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequiredBundleAccess().getCommaKeyword_2_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3929:1: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_INT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3930:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3930:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3931:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMaxVersionVersionParserRuleCall_2_3_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle8841);
                            lv_maxVersion_6_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRequiredBundleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"maxVersion",
                                    		lv_maxVersion_6_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3947:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==EOF||(LA72_0>=18 && LA72_0<=19)||LA72_0==75) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==76) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3947:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3947:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==75) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3948:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3948:1: (lv_maxExclusive_7_0= ')' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3949:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleRequiredBundle8861); 

                                            newLeafNode(lv_maxExclusive_7_0, grammarAccess.getRequiredBundleAccess().getMaxExclusiveRightParenthesisKeyword_2_4_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getRequiredBundleRule());
                                    	        }
                                           		setWithLastConsumed(current, "maxExclusive", true, ")");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3963:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleRequiredBundle8893); 

                                	newLeafNode(otherlv_8, grammarAccess.getRequiredBundleAccess().getRightSquareBracketKeyword_2_4_1());
                                

                            }
                            break;

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
        }
        return current;
    }
    // $ANTLR end "ruleRequiredBundle"


    // $ANTLR start "entryRuleLinkedString"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3975:1: entryRuleLinkedString returns [EObject current=null] : iv_ruleLinkedString= ruleLinkedString EOF ;
    public final EObject entryRuleLinkedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedString = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3976:2: (iv_ruleLinkedString= ruleLinkedString EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3977:2: iv_ruleLinkedString= ruleLinkedString EOF
            {
             newCompositeNode(grammarAccess.getLinkedStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_entryRuleLinkedString8932);
            iv_ruleLinkedString=ruleLinkedString();

            state._fsp--;

             current =iv_ruleLinkedString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkedString8942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkedString"


    // $ANTLR start "ruleLinkedString"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3984:1: ruleLinkedString returns [EObject current=null] : ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleLinkedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_weburl_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3987:28: ( ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3988:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3988:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3988:2: () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3988:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3989:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkedStringAccess().getLinkedStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleLinkedString8988); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkedStringAccess().getLinkedStringKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3998:1: ( (lv_weburl_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3999:1: (lv_weburl_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3999:1: (lv_weburl_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4000:3: lv_weburl_2_0= RULE_STRING
            {
            lv_weburl_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString9005); 

            			newLeafNode(lv_weburl_2_0, grammarAccess.getLinkedStringAccess().getWeburlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkedStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weburl",
                    		lv_weburl_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLinkedString9022); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkedStringAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4020:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4021:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4021:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4022:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString9039); 

            			newLeafNode(lv_value_4_0, grammarAccess.getLinkedStringAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkedStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLinkedString9056); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkedStringAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleLinkedString"


    // $ANTLR start "entryRuleFeaturePlugin"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4050:1: entryRuleFeaturePlugin returns [EObject current=null] : iv_ruleFeaturePlugin= ruleFeaturePlugin EOF ;
    public final EObject entryRuleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePlugin = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4051:2: (iv_ruleFeaturePlugin= ruleFeaturePlugin EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4052:2: iv_ruleFeaturePlugin= ruleFeaturePlugin EOF
            {
             newCompositeNode(grammarAccess.getFeaturePluginRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin9092);
            iv_ruleFeaturePlugin=ruleFeaturePlugin();

            state._fsp--;

             current =iv_ruleFeaturePlugin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePlugin9102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeaturePlugin"


    // $ANTLR start "ruleFeaturePlugin"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4059:1: ruleFeaturePlugin returns [EObject current=null] : ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        Token lv_unpack_1_0=null;
        Token lv_fragment_2_0=null;
        Token lv_id_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4062:28: ( ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4063:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4063:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4063:2: () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4063:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4064:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeaturePluginAccess().getFeaturePluginAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4069:2: ( (lv_unpack_1_0= 'unpacked' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==81) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4070:1: (lv_unpack_1_0= 'unpacked' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4070:1: (lv_unpack_1_0= 'unpacked' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4071:3: lv_unpack_1_0= 'unpacked'
                    {
                    lv_unpack_1_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleFeaturePlugin9154); 

                            newLeafNode(lv_unpack_1_0, grammarAccess.getFeaturePluginAccess().getUnpackUnpackedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "unpack", true, "unpacked");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4084:3: ( (lv_fragment_2_0= 'fragment' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==82) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4085:1: (lv_fragment_2_0= 'fragment' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4085:1: (lv_fragment_2_0= 'fragment' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4086:3: lv_fragment_2_0= 'fragment'
                    {
                    lv_fragment_2_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleFeaturePlugin9186); 

                            newLeafNode(lv_fragment_2_0, grammarAccess.getFeaturePluginAccess().getFragmentFragmentKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4099:3: ( (lv_id_3_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4100:1: (lv_id_3_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4100:1: (lv_id_3_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4101:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeaturePlugin9217); 

            			newLeafNode(lv_id_3_0, grammarAccess.getFeaturePluginAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeaturePluginRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
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
        }
        return current;
    }
    // $ANTLR end "ruleFeaturePlugin"


    // $ANTLR start "entryRuleRequiredFeature"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4125:1: entryRuleRequiredFeature returns [EObject current=null] : iv_ruleRequiredFeature= ruleRequiredFeature EOF ;
    public final EObject entryRuleRequiredFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4126:2: (iv_ruleRequiredFeature= ruleRequiredFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4127:2: iv_ruleRequiredFeature= ruleRequiredFeature EOF
            {
             newCompositeNode(grammarAccess.getRequiredFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature9258);
            iv_ruleRequiredFeature=ruleRequiredFeature();

            state._fsp--;

             current =iv_ruleRequiredFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredFeature9268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredFeature"


    // $ANTLR start "ruleRequiredFeature"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4134:1: ruleRequiredFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) ) ;
    public final EObject ruleRequiredFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Enumerator lv_match_2_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4137:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4138:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4138:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4138:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4138:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4139:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredFeatureAccess().getRequiredFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4144:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4145:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4145:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4146:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredFeature9319); 

            			newLeafNode(lv_id_1_0, grammarAccess.getRequiredFeatureAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4162:2: ( (lv_match_2_0= ruleMatchRule ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4163:1: (lv_match_2_0= ruleMatchRule )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4163:1: (lv_match_2_0= ruleMatchRule )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4164:3: lv_match_2_0= ruleMatchRule
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getMatchMatchRuleEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchRule_in_ruleRequiredFeature9345);
            lv_match_2_0=ruleMatchRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"match",
                    		lv_match_2_0, 
                    		"MatchRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4180:2: ( (lv_version_3_0= ruleVersion ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4181:1: (lv_version_3_0= ruleVersion )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4181:1: (lv_version_3_0= ruleVersion )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4182:3: lv_version_3_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getVersionVersionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredFeature9366);
            lv_version_3_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_3_0, 
                    		"Version");
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
    // $ANTLR end "ruleRequiredFeature"


    // $ANTLR start "entryRuleIncludedFeature"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4206:1: entryRuleIncludedFeature returns [EObject current=null] : iv_ruleIncludedFeature= ruleIncludedFeature EOF ;
    public final EObject entryRuleIncludedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludedFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4207:2: (iv_ruleIncludedFeature= ruleIncludedFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4208:2: iv_ruleIncludedFeature= ruleIncludedFeature EOF
            {
             newCompositeNode(grammarAccess.getIncludedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature9402);
            iv_ruleIncludedFeature=ruleIncludedFeature();

            state._fsp--;

             current =iv_ruleIncludedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludedFeature9412); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludedFeature"


    // $ANTLR start "ruleIncludedFeature"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4215:1: ruleIncludedFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleIncludedFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4218:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4219:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4219:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4219:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4219:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4220:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIncludedFeatureAccess().getIncludedFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4225:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4226:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4226:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4227:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludedFeature9463); 

            			newLeafNode(lv_id_1_0, grammarAccess.getIncludedFeatureAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludedFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4243:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4244:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4244:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4245:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludedFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleIncludedFeature9489);
                    lv_version_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIncludedFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"Version");
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
        }
        return current;
    }
    // $ANTLR end "ruleIncludedFeature"


    // $ANTLR start "entryRuleProductFeature"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4269:1: entryRuleProductFeature returns [EObject current=null] : iv_ruleProductFeature= ruleProductFeature EOF ;
    public final EObject entryRuleProductFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4270:2: (iv_ruleProductFeature= ruleProductFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4271:2: iv_ruleProductFeature= ruleProductFeature EOF
            {
             newCompositeNode(grammarAccess.getProductFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_entryRuleProductFeature9526);
            iv_ruleProductFeature=ruleProductFeature();

            state._fsp--;

             current =iv_ruleProductFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFeature9536); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductFeature"


    // $ANTLR start "ruleProductFeature"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4278:1: ruleProductFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleProductFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4281:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4282:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4282:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4282:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4282:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4283:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFeatureAccess().getProductFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4288:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4289:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4289:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4290:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFeature9587); 

            			newLeafNode(lv_id_1_0, grammarAccess.getProductFeatureAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4306:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4307:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4307:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4308:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleProductFeature9613);
                    lv_version_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"Version");
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
        }
        return current;
    }
    // $ANTLR end "ruleProductFeature"


    // $ANTLR start "entryRuleProductStartConfig"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4332:1: entryRuleProductStartConfig returns [EObject current=null] : iv_ruleProductStartConfig= ruleProductStartConfig EOF ;
    public final EObject entryRuleProductStartConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStartConfig = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4333:2: (iv_ruleProductStartConfig= ruleProductStartConfig EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4334:2: iv_ruleProductStartConfig= ruleProductStartConfig EOF
            {
             newCompositeNode(grammarAccess.getProductStartConfigRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig9650);
            iv_ruleProductStartConfig=ruleProductStartConfig();

            state._fsp--;

             current =iv_ruleProductStartConfig; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductStartConfig9660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductStartConfig"


    // $ANTLR start "ruleProductStartConfig"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4341:1: ruleProductStartConfig returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? ) ;
    public final EObject ruleProductStartConfig() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_1=null;
        Token lv_startLevel_4_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4344:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4345:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4345:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4345:2: () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4345:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductStartConfigAccess().getProductStartConfigAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4351:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4352:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4352:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4353:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductStartConfig9711); 

            			newLeafNode(lv_id_1_0, grammarAccess.getProductStartConfigAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductStartConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4369:2: ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==83) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4369:3: ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4369:3: ( (lv_autoStart_2_0= 'autostarted' ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4370:1: (lv_autoStart_2_0= 'autostarted' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4370:1: (lv_autoStart_2_0= 'autostarted' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4371:3: lv_autoStart_2_0= 'autostarted'
                    {
                    lv_autoStart_2_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleProductStartConfig9735); 

                            newLeafNode(lv_autoStart_2_0, grammarAccess.getProductStartConfigAccess().getAutoStartAutostartedKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                    	        }
                           		setWithLastConsumed(current, "autoStart", true, "autostarted");
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4384:2: (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==84) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4384:4: otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) )
                            {
                            otherlv_3=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleProductStartConfig9761); 

                                	newLeafNode(otherlv_3, grammarAccess.getProductStartConfigAccess().getAtKeyword_2_1_0());
                                
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4388:1: ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4389:1: ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4389:1: ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4390:1: (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4390:1: (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==RULE_SIGNED_INT) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==RULE_INT) ) {
                                alt78=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 0, input);

                                throw nvae;
                            }
                            switch (alt78) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4391:3: lv_startLevel_4_1= RULE_SIGNED_INT
                                    {
                                    lv_startLevel_4_1=(Token)match(input,RULE_SIGNED_INT,FollowSets000.FOLLOW_RULE_SIGNED_INT_in_ruleProductStartConfig9780); 

                                    			newLeafNode(lv_startLevel_4_1, grammarAccess.getProductStartConfigAccess().getStartLevelSIGNED_INTTerminalRuleCall_2_1_1_0_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"startLevel",
                                            		lv_startLevel_4_1, 
                                            		"SIGNED_INT");
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4406:8: lv_startLevel_4_2= RULE_INT
                                    {
                                    lv_startLevel_4_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleProductStartConfig9800); 

                                    			newLeafNode(lv_startLevel_4_2, grammarAccess.getProductStartConfigAccess().getStartLevelINTTerminalRuleCall_2_1_1_0_1()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"startLevel",
                                            		lv_startLevel_4_2, 
                                            		"INT");
                                    	    

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

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
        }
        return current;
    }
    // $ANTLR end "ruleProductStartConfig"


    // $ANTLR start "entryRuleVersion"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4432:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4433:2: (iv_ruleVersion= ruleVersion EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4434:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion9849);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion9860); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4441:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4444:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4445:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4445:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4445:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9900); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleVersion9918); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9933); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleVersion9951); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9966); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4478:1: (kw= '.' this_ID_6= RULE_ID )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==85) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4479:2: kw= '.' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleVersion9985); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_5_0()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion10000); 

                    		current.merge(this_ID_6);
                        
                     
                        newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_5_1()); 
                        

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "ruleType"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4499:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4501:28: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4502:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4502:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt82=1;
                }
                break;
            case 87:
                {
                alt82=2;
                }
                break;
            case 88:
                {
                alt82=3;
                }
                break;
            case 89:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4502:2: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4502:2: (enumLiteral_0= 'BOOLEAN' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4502:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleType10061); 

                            current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4508:6: (enumLiteral_1= 'DOUBLE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4508:6: (enumLiteral_1= 'DOUBLE' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4508:8: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleType10078); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4514:6: (enumLiteral_2= 'INT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4514:6: (enumLiteral_2= 'INT' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4514:8: enumLiteral_2= 'INT'
                    {
                    enumLiteral_2=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleType10095); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4520:6: (enumLiteral_3= 'STRING' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4520:6: (enumLiteral_3= 'STRING' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4520:8: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleType10112); 

                            current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleMatchRule"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4530:1: ruleMatchRule returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) ;
    public final Enumerator ruleMatchRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4532:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4533:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4533:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            int alt83=5;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt83=1;
                }
                break;
            case 91:
                {
                alt83=2;
                }
                break;
            case 92:
                {
                alt83=3;
                }
                break;
            case 93:
                {
                alt83=4;
                }
                break;
            case 94:
                {
                alt83=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4533:2: (enumLiteral_0= 'none' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4533:2: (enumLiteral_0= 'none' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4533:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleMatchRule10157); 

                            current = grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4539:6: (enumLiteral_1= 'equivalent' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4539:6: (enumLiteral_1= 'equivalent' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4539:8: enumLiteral_1= 'equivalent'
                    {
                    enumLiteral_1=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleMatchRule10174); 

                            current = grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4545:6: (enumLiteral_2= 'compatible' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4545:6: (enumLiteral_2= 'compatible' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4545:8: enumLiteral_2= 'compatible'
                    {
                    enumLiteral_2=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleMatchRule10191); 

                            current = grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4551:6: (enumLiteral_3= 'perfect' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4551:6: (enumLiteral_3= 'perfect' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4551:8: enumLiteral_3= 'perfect'
                    {
                    enumLiteral_3=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleMatchRule10208); 

                            current = grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4557:6: (enumLiteral_4= 'greaterOrEqual' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4557:6: (enumLiteral_4= 'greaterOrEqual' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4557:8: enumLiteral_4= 'greaterOrEqual'
                    {
                    enumLiteral_4=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleMatchRule10225); 

                            current = grammarAccess.getMatchRuleAccess().getGreaterOrEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMatchRuleAccess().getGreaterOrEqualEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleMatchRule"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRobotTask_in_entryRuleRobotTask75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRobotTask85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRobotTask131 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask143 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_16_in_ruleRobotTask156 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRobotTask168 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRobotTask201 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRobotTask235 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask249 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleRobotTask264 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRobotTask276 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask288 = new BitSet(new long[]{0x0000008800400000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask309 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask322 = new BitSet(new long[]{0x0000008800400000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask343 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask357 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_DOC_in_ruleVariable459 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
        public static final BitSet FOLLOW_ruleType_in_ruleVariable485 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable502 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleVariable520 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericProject_in_entryRuleGenericProject580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericProject590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_ruleGenericProject637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_ruleGenericProject664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_ruleGenericProject691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_entryRuleResource726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResource736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_ruleResource783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_ruleResource810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_ruleResource837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_ruleResource864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDynamicFile_in_ruleResource891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleResource918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_ruleResource945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleResource972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject1007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleProject1063 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProject1084 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject1096 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_23_in_ruleProject1109 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProject1121 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject1133 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject1154 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProject1167 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject1188 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProject1202 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleProject1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder1375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolder1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFolder1431 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFolder1452 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFolder1464 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleFolder1477 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFolder1489 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFolder1501 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1522 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFolder1535 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1556 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFolder1570 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFolder1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplatedFile1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTemplatedFile1676 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1697 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTemplatedFile1709 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_27_in_ruleTemplatedFile1722 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTemplatedFile1734 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1755 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTemplatedFile1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_entryRuleDataFile1805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataFile1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDataFile1861 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataFile1882 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDataFile1894 = new BitSet(new long[]{0x0000000020080000L});
        public static final BitSet FOLLOW_29_in_ruleDataFile1907 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDataFile1919 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEByteArray_in_ruleDataFile1940 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDataFile1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_entryRuleURLFile1990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLFile2000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleURLFile2046 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile2067 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile2088 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleURLFile2101 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleURLFile2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDynamicFile_in_entryRuleDynamicFile2160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDynamicFile2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDynamicFile2216 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDynamicFile2237 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleDynamicFile2249 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicFile2266 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleDynamicFile2283 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicFile2300 = new BitSet(new long[]{0x0000000080008002L});
        public static final BitSet FOLLOW_15_in_ruleDynamicFile2318 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDynamicFile2339 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDynamicFile2352 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDynamicFile2373 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDynamicFile2387 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleDynamicFile2402 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDynamicFile2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencingBooleanExpression_in_ruleBooleanExpression2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineBooleanExpression_in_ruleBooleanExpression2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencingBooleanExpression_in_entryRuleReferencingBooleanExpression2580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferencingBooleanExpression2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2632 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleReferencingBooleanExpression2649 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineBooleanExpression_in_entryRuleInlineBooleanExpression2707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineBooleanExpression2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInlineBooleanExpression2759 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INLINE_SCRIPT_in_ruleInlineBooleanExpression2781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEByteArray_in_entryRuleEByteArray2823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEByteArray2834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEByteArray2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_entryRuleBundleProject2924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundleProject2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBundleProject2980 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundleProject3001 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject3013 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_36_in_ruleBundleProject3071 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject3083 = new BitSet(new long[]{0x00000E0000000000L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleBundleProject3104 = new BitSet(new long[]{0x0000007000880000L});
        public static final BitSet FOLLOW_37_in_ruleBundleProject3172 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject3184 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_ruleBundleProject3205 = new BitSet(new long[]{0x0000007000880000L});
        public static final BitSet FOLLOW_38_in_ruleBundleProject3273 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject3285 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleBundleProject3306 = new BitSet(new long[]{0x0000007000880000L});
        public static final BitSet FOLLOW_23_in_ruleBundleProject3366 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject3378 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject3390 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject3411 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject3424 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject3445 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleBundleProject3459 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBundleProject3473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject3509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureProject3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleFeatureProject3565 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeatureProject3586 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureProject3598 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleFeatureProject3610 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureProject3622 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_ruleFeatureProject3643 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_23_in_ruleFeatureProject3656 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureProject3668 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureProject3680 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject3701 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureProject3714 = new BitSet(new long[]{0x00C40E0155000000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject3735 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureProject3749 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureProject3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile3799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleManifestFile3861 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_42_in_ruleManifestFile3893 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleManifestFile3919 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3936 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3958 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3980 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile3997 = new BitSet(new long[]{0x0000700000000000L});
        public static final BitSet FOLLOW_44_in_ruleManifestFile4055 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4067 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile4084 = new BitSet(new long[]{0x0003F00000080000L});
        public static final BitSet FOLLOW_45_in_ruleManifestFile4157 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4169 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile4186 = new BitSet(new long[]{0x0003F00000080000L});
        public static final BitSet FOLLOW_46_in_ruleManifestFile4259 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4271 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile4288 = new BitSet(new long[]{0x0003F00000080000L});
        public static final BitSet FOLLOW_47_in_ruleManifestFile4353 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4365 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile4377 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile4398 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4411 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile4432 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile4446 = new BitSet(new long[]{0x0003000000080000L});
        public static final BitSet FOLLOW_48_in_ruleManifestFile4461 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4473 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile4485 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile4506 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4519 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile4540 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile4554 = new BitSet(new long[]{0x0002000000080000L});
        public static final BitSet FOLLOW_49_in_ruleManifestFile4569 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4581 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile4593 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile4614 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4627 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile4648 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile4662 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile4676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile4712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePluginXMLFile4722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulePluginXMLFile4768 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePluginXMLFile4780 = new BitSet(new long[]{0x0008000000080000L});
        public static final BitSet FOLLOW_51_in_rulePluginXMLFile4793 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePluginXMLFile4805 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePluginXMLFile4817 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile4838 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_rulePluginXMLFile4851 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile4872 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_rulePluginXMLFile4886 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePluginXMLFile4900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties4936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuildProperties4946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleBuildProperties4992 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBuildProperties5004 = new BitSet(new long[]{0x0020000000080000L});
        public static final BitSet FOLLOW_53_in_ruleBuildProperties5017 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBuildProperties5029 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBuildProperties5041 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties5061 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleBuildProperties5074 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties5094 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleBuildProperties5108 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBuildProperties5122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase5158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFileFeaturebase5168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleProductFileFeaturebase5220 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleProductFileFeaturebase5246 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5263 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase5280 = new BitSet(new long[]{0x1F00000000000000L});
        public static final BitSet FOLLOW_56_in_ruleProductFileFeaturebase5338 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5350 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5367 = new BitSet(new long[]{0x7F00000000080000L});
        public static final BitSet FOLLOW_57_in_ruleProductFileFeaturebase5440 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5452 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5469 = new BitSet(new long[]{0x7F00000000080000L});
        public static final BitSet FOLLOW_58_in_ruleProductFileFeaturebase5542 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5554 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5571 = new BitSet(new long[]{0x7F00000000080000L});
        public static final BitSet FOLLOW_59_in_ruleProductFileFeaturebase5644 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5656 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5673 = new BitSet(new long[]{0x7F00000000080000L});
        public static final BitSet FOLLOW_60_in_ruleProductFileFeaturebase5746 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5758 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleProductFileFeaturebase5779 = new BitSet(new long[]{0x7F00000000080000L});
        public static final BitSet FOLLOW_61_in_ruleProductFileFeaturebase5839 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5851 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase5863 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5884 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase5897 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5918 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProductFileFeaturebase5932 = new BitSet(new long[]{0x4000000000080000L});
        public static final BitSet FOLLOW_62_in_ruleProductFileFeaturebase5947 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5959 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase5971 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase5992 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase6005 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase6026 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProductFileFeaturebase6040 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleProductFileFeaturebase6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile6090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureFile6100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleFeatureFile6146 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6163 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile6180 = new BitSet(new long[]{0x1000200000000000L,0x000000000000003FL});
        public static final BitSet FOLLOW_60_in_ruleFeatureFile6238 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6250 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile6271 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_64_in_ruleFeatureFile6339 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6351 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6368 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_45_in_ruleFeatureFile6441 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6453 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6470 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_65_in_ruleFeatureFile6543 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile6576 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_66_in_ruleFeatureFile6644 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile6677 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_67_in_ruleFeatureFile6745 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile6778 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_68_in_ruleFeatureFile6891 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile6903 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6920 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_69_in_ruleFeatureFile6993 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7005 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile7026 = new BitSet(new long[]{0x1000200000080000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_70_in_ruleFeatureFile7132 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7144 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile7156 = new BitSet(new long[]{0x0000000000000020L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7177 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7190 = new BitSet(new long[]{0x0000000000000020L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7211 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile7225 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000180L});
        public static final BitSet FOLLOW_71_in_ruleFeatureFile7240 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7252 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile7264 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7285 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7298 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7319 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile7333 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleFeatureFile7348 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7360 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile7372 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7393 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7406 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7427 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile7441 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile7455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage7491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportedPackage7501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportedPackage7552 = new BitSet(new long[]{0x0000000000040202L,0x0000000000000600L});
        public static final BitSet FOLLOW_73_in_ruleImportedPackage7577 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_74_in_ruleImportedPackage7609 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage7631 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleImportedPackage7644 = new BitSet(new long[]{0x0000000000000202L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage7666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
        public static final BitSet FOLLOW_75_in_ruleImportedPackage7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleImportedPackage7718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage7758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExportedPackage7768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExportedPackage7819 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleExportedPackage7845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension7882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension7892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension7943 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtension7960 = new BitSet(new long[]{0x0000000000080000L,0x0000000000006000L});
        public static final BitSet FOLLOW_77_in_ruleExtension7973 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleExtension7985 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension8002 = new BitSet(new long[]{0x0000000000080000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleExtension8022 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleExtension8034 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtension8046 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension8067 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleExtension8080 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension8101 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleExtension8115 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtension8129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement8165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement8175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElement8226 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement8243 = new BitSet(new long[]{0x0000000002080000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleElement8256 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleElement8268 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement8280 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement8301 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleElement8314 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement8335 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleElement8349 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleElement8364 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleElement8376 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement8388 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement8409 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleElement8422 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement8443 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleElement8457 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleElement8471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute8507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute8517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAttribute8563 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute8580 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute8597 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute8614 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttribute8631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle8667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredBundle8677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredBundle8728 = new BitSet(new long[]{0x0000000000040202L,0x0000000000000600L});
        public static final BitSet FOLLOW_73_in_ruleRequiredBundle8753 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_74_in_ruleRequiredBundle8785 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle8807 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRequiredBundle8820 = new BitSet(new long[]{0x0000000000000202L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle8841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
        public static final BitSet FOLLOW_75_in_ruleRequiredBundle8861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleRequiredBundle8893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedString_in_entryRuleLinkedString8932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkedString8942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleLinkedString8988 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString9005 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLinkedString9022 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString9039 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLinkedString9056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin9092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePlugin9102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleFeaturePlugin9154 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleFeaturePlugin9186 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeaturePlugin9217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature9258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredFeature9268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredFeature9319 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleMatchRule_in_ruleRequiredFeature9345 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredFeature9366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature9402 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludedFeature9412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludedFeature9463 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleIncludedFeature9489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFeature_in_entryRuleProductFeature9526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFeature9536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFeature9587 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleProductFeature9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig9650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductStartConfig9660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductStartConfig9711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
        public static final BitSet FOLLOW_83_in_ruleProductStartConfig9735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleProductStartConfig9761 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_RULE_SIGNED_INT_in_ruleProductStartConfig9780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleProductStartConfig9800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion9849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion9860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleVersion9918 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleVersion9951 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleVersion9985 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion10000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleType10061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleType10078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleType10095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleType10112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleMatchRule10157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleMatchRule10174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleMatchRule10191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleMatchRule10208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleMatchRule10225 = new BitSet(new long[]{0x0000000000000002L});
    }


}