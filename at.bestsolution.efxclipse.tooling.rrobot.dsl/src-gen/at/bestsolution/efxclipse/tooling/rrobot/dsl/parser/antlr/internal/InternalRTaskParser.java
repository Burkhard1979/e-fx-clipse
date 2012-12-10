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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_DOC", "RULE_STRING", "RULE_ID", "RULE_INLINE_SCRIPT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotTask'", "'{'", "'variables'", "'='", "','", "'}'", "'projects'", "'default'", "'SimpleProject'", "'resources'", "'Folder'", "'children'", "'TemplatedFile'", "'generatorType'", "'DataFile'", "'content'", "'URLFile'", "'uri'", "'DynamicFile'", "'generated-from'", "'by'", "'excluded-if'", "'BundleProject'", "'manifest'", "'build'", "'pluginxml'", "'FeatureProject'", "'feature'", "'lazy'", "'singleton'", "'ManifestFile'", "'bundlename'", "'vendor'", "'activatorClass'", "'exportedPackages'", "'importedPackages'", "'requiredBundles'", "'PluginXMLFile'", "'extensions'", "'BuildProperties'", "'binIncludes'", "'launchable'", "'ProductFileFeaturebase'", "'vmArgs'", "'programArgs'", "'productName'", "'application'", "'version'", "'startconfigurations'", "'features'", "'FeatureFile'", "'featurename'", "'description'", "'copyright'", "'license'", "'license-feature'", "'license-feature-version'", "'plugins'", "'required'", "'included'", "'('", "'['", "')'", "']'", "'id'", "'elements'", "'attributes'", "'LinkedString'", "'unpacked'", "'fragment'", "'ProductStartConfig'", "'autostarted'", "'at'", "'.'", "'-'", "'BOOLEAN'", "'DOUBLE'", "'INT'", "'STRING'", "'none'", "'equivalent'", "'compatible'", "'perfect'", "'greaterOrEqual'"
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_DOC=4;
    public static final int RULE_INLINE_SCRIPT=7;
    public static final int EOF=-1;
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
    public static final int T__13=13;
    public static final int T__96=96;
    public static final int T__95=95;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_INT=8;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;

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

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRobotTask131); 

                	newLeafNode(otherlv_1, grammarAccess.getRobotTaskAccess().getRobotTaskKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRobotTask143); 

                	newLeafNode(otherlv_2, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:1: (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:3: otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask156); 

                        	newLeafNode(otherlv_3, grammarAccess.getRobotTaskAccess().getVariablesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRobotTask168); 

                        	newLeafNode(otherlv_4, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRobotTask180); 

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

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:4: otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRobotTask214); 

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

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask249); 

                        	newLeafNode(otherlv_9, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:151:3: (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:151:5: otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask264); 

                        	newLeafNode(otherlv_10, grammarAccess.getRobotTaskAccess().getProjectsKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRobotTask276); 

                        	newLeafNode(otherlv_11, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRobotTask288); 

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

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:181:4: otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRobotTask322); 

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

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask357); 

                        	newLeafNode(otherlv_16, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask371); 

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

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:286:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVariable520); 

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
            case 21:
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
            case 23:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 31:
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

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleProject1063); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProject1096); 

                	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:511:1: (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:511:3: otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProject1109); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getResourcesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProject1121); 

                        	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProject1133); 

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

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:541:4: otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProject1167); 

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

                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProject1202); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProject1216); 

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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFolder1431); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFolder1464); 

                	newLeafNode(otherlv_3, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:1: (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:3: otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFolder1477); 

                        	newLeafNode(otherlv_4, grammarAccess.getFolderAccess().getChildrenKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFolder1489); 

                        	newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFolder1501); 

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

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:690:4: otherlv_8= ',' ( (lv_children_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFolder1535); 

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

                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFolder1570); 

                        	newLeafNode(otherlv_10, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFolder1584); 

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

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTemplatedFile1676); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTemplatedFile1709); 

                	newLeafNode(otherlv_3, grammarAccess.getTemplatedFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:1: (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:3: otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTemplatedFile1722); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemplatedFileAccess().getGeneratorTypeKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTemplatedFile1734); 

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

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTemplatedFile1769); 

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

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataFile1861); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataFile1894); 

                	newLeafNode(otherlv_3, grammarAccess.getDataFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:856:1: (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:856:3: otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) )
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataFile1907); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataFileAccess().getContentKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataFile1919); 

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

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataFile1954); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:903:1: ruleURLFile returns [EObject current=null] : ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleURLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uri_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:906:28: ( ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:2: () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:908:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURLFileAccess().getURLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleURLFile2046); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleURLFile2079); 

                	newLeafNode(otherlv_3, grammarAccess.getURLFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:939:1: (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:939:3: otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleURLFile2092); 

                        	newLeafNode(otherlv_4, grammarAccess.getURLFileAccess().getUriKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleURLFile2104); 

                        	newLeafNode(otherlv_5, grammarAccess.getURLFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:947:1: ( (lv_uri_6_0= ruleEString ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:948:1: (lv_uri_6_0= ruleEString )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:948:1: (lv_uri_6_0= ruleEString )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:949:3: lv_uri_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getURLFileAccess().getUriEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile2125);
                    lv_uri_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getURLFileRule());
                    	        }
                           		set(
                           			current, 
                           			"uri",
                            		lv_uri_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleURLFile2139); 

                	newLeafNode(otherlv_7, grammarAccess.getURLFileAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:977:1: entryRuleDynamicFile returns [EObject current=null] : iv_ruleDynamicFile= ruleDynamicFile EOF ;
    public final EObject entryRuleDynamicFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:978:2: (iv_ruleDynamicFile= ruleDynamicFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:979:2: iv_ruleDynamicFile= ruleDynamicFile EOF
            {
             newCompositeNode(grammarAccess.getDynamicFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDynamicFile_in_entryRuleDynamicFile2175);
            iv_ruleDynamicFile=ruleDynamicFile();

            state._fsp--;

             current =iv_ruleDynamicFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDynamicFile2185); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:986:1: ruleDynamicFile returns [EObject current=null] : ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:989:28: ( ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:990:1: ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:990:1: ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:990:2: () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:990:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:991:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDynamicFileAccess().getDynamicFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDynamicFile2231); 

                	newLeafNode(otherlv_1, grammarAccess.getDynamicFileAccess().getDynamicFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1000:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1001:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1001:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1002:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDynamicFile2252);
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

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDynamicFile2264); 

                	newLeafNode(otherlv_3, grammarAccess.getDynamicFileAccess().getGeneratedFromKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1022:1: ( (lv_executionURI_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1023:1: (lv_executionURI_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1023:1: (lv_executionURI_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1024:3: lv_executionURI_4_0= RULE_STRING
            {
            lv_executionURI_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDynamicFile2281); 

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

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDynamicFile2298); 

                	newLeafNode(otherlv_5, grammarAccess.getDynamicFileAccess().getByKeyword_5());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1044:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1045:1: (lv_type_6_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1045:1: (lv_type_6_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1046:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDynamicFile2315); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1062:2: (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1062:4: otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )? otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDynamicFile2333); 

                        	newLeafNode(otherlv_7, grammarAccess.getDynamicFileAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1066:1: ( (lv_variables_8_0= ruleVariable ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1067:1: (lv_variables_8_0= ruleVariable )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1067:1: (lv_variables_8_0= ruleVariable )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1068:3: lv_variables_8_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getVariablesVariableParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDynamicFile2354);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1084:2: (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==17) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1084:4: otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) )
                            {
                            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDynamicFile2367); 

                                	newLeafNode(otherlv_9, grammarAccess.getDynamicFileAccess().getCommaKeyword_7_2_0());
                                
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1088:1: ( (lv_variables_10_0= ruleVariable ) )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1089:1: (lv_variables_10_0= ruleVariable )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1089:1: (lv_variables_10_0= ruleVariable )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1090:3: lv_variables_10_0= ruleVariable
                            {
                             
                            	        newCompositeNode(grammarAccess.getDynamicFileAccess().getVariablesVariableParserRuleCall_7_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDynamicFile2388);
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

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDynamicFile2402); 

                        	newLeafNode(otherlv_11, grammarAccess.getDynamicFileAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1110:3: (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1110:5: otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    {
                    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDynamicFile2417); 

                        	newLeafNode(otherlv_12, grammarAccess.getDynamicFileAccess().getExcludedIfKeyword_8_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1114:1: ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1115:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1115:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1116:3: lv_excludeExpression_13_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleDynamicFile2438);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1140:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1141:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1142:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2476);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression2486); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1149:1: ruleBooleanExpression returns [EObject current=null] : (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ReferencingBooleanExpression_0 = null;

        EObject this_InlineBooleanExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1152:28: ( (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1153:1: (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1153:1: (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_INLINE_SCRIPT) ) {
                    alt19=2;
                }
                else if ( (LA19_1==33) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1154:5: this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanExpressionAccess().getReferencingBooleanExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferencingBooleanExpression_in_ruleBooleanExpression2533);
                    this_ReferencingBooleanExpression_0=ruleReferencingBooleanExpression();

                    state._fsp--;

                     
                            current = this_ReferencingBooleanExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1164:5: this_InlineBooleanExpression_1= ruleInlineBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanExpressionAccess().getInlineBooleanExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInlineBooleanExpression_in_ruleBooleanExpression2560);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1180:1: entryRuleReferencingBooleanExpression returns [EObject current=null] : iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF ;
    public final EObject entryRuleReferencingBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencingBooleanExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1181:2: (iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1182:2: iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getReferencingBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferencingBooleanExpression_in_entryRuleReferencingBooleanExpression2595);
            iv_ruleReferencingBooleanExpression=ruleReferencingBooleanExpression();

            state._fsp--;

             current =iv_ruleReferencingBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferencingBooleanExpression2605); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1189:1: ruleReferencingBooleanExpression returns [EObject current=null] : ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleReferencingBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_executionURI_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1192:28: ( ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1193:1: ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1193:1: ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1193:2: ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1193:2: ( (lv_executionURI_0_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1194:1: (lv_executionURI_0_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1194:1: (lv_executionURI_0_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1195:3: lv_executionURI_0_0= RULE_STRING
            {
            lv_executionURI_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2647); 

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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleReferencingBooleanExpression2664); 

                	newLeafNode(otherlv_1, grammarAccess.getReferencingBooleanExpressionAccess().getByKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1215:1: ( (lv_type_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1216:1: (lv_type_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1216:1: (lv_type_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1217:3: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2681); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1241:1: entryRuleInlineBooleanExpression returns [EObject current=null] : iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF ;
    public final EObject entryRuleInlineBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineBooleanExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1242:2: (iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1243:2: iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getInlineBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInlineBooleanExpression_in_entryRuleInlineBooleanExpression2722);
            iv_ruleInlineBooleanExpression=ruleInlineBooleanExpression();

            state._fsp--;

             current =iv_ruleInlineBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineBooleanExpression2732); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1250:1: ruleInlineBooleanExpression returns [EObject current=null] : ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) ) ;
    public final EObject ruleInlineBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_expression_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1253:28: ( ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1254:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1254:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1254:2: ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1254:2: ( (lv_type_0_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1255:1: (lv_type_0_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1255:1: (lv_type_0_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1256:3: lv_type_0_0= RULE_STRING
            {
            lv_type_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInlineBooleanExpression2774); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1272:2: ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1273:1: (lv_expression_1_0= RULE_INLINE_SCRIPT )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1273:1: (lv_expression_1_0= RULE_INLINE_SCRIPT )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1274:3: lv_expression_1_0= RULE_INLINE_SCRIPT
            {
            lv_expression_1_0=(Token)match(input,RULE_INLINE_SCRIPT,FollowSets000.FOLLOW_RULE_INLINE_SCRIPT_in_ruleInlineBooleanExpression2796); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1298:1: entryRuleEByteArray returns [String current=null] : iv_ruleEByteArray= ruleEByteArray EOF ;
    public final String entryRuleEByteArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEByteArray = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1299:2: (iv_ruleEByteArray= ruleEByteArray EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1300:2: iv_ruleEByteArray= ruleEByteArray EOF
            {
             newCompositeNode(grammarAccess.getEByteArrayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_entryRuleEByteArray2838);
            iv_ruleEByteArray=ruleEByteArray();

            state._fsp--;

             current =iv_ruleEByteArray.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEByteArray2849); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1307:1: ruleEByteArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleEByteArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1310:28: (this_EString_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1312:5: this_EString_0= ruleEString
            {
             
                    newCompositeNode(grammarAccess.getEByteArrayAccess().getEStringParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEByteArray2895);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1330:1: entryRuleBundleProject returns [EObject current=null] : iv_ruleBundleProject= ruleBundleProject EOF ;
    public final EObject entryRuleBundleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1331:2: (iv_ruleBundleProject= ruleBundleProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1332:2: iv_ruleBundleProject= ruleBundleProject EOF
            {
             newCompositeNode(grammarAccess.getBundleProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_entryRuleBundleProject2939);
            iv_ruleBundleProject=ruleBundleProject();

            state._fsp--;

             current =iv_ruleBundleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundleProject2949); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1339:1: ruleBundleProject returns [EObject current=null] : ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1342:28: ( ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1343:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1343:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1343:2: () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1343:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1344:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBundleProjectAccess().getBundleProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBundleProject2995); 

                	newLeafNode(otherlv_1, grammarAccess.getBundleProjectAccess().getBundleProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1353:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1354:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1354:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1355:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundleProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundleProject3016);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBundleProject3028); 

                	newLeafNode(otherlv_3, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1375:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1377:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1377:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1378:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1381:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1382:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1382:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1384:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1384:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1385:5: {...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1385:110: ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1386:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1389:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1389:7: {...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1389:16: (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1389:18: otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBundleProject3086); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBundleProjectAccess().getManifestKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBundleProject3098); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1397:1: ( (lv_manifest_7_0= ruleManifestFile ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1398:1: (lv_manifest_7_0= ruleManifestFile )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1398:1: (lv_manifest_7_0= ruleManifestFile )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1399:3: lv_manifest_7_0= ruleManifestFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getManifestManifestFileParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleBundleProject3119);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1422:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1422:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1423:5: {...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1423:110: ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1424:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1427:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1427:7: {...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1427:16: (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1427:18: otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBundleProject3187); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBundleProjectAccess().getBuildKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBundleProject3199); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1435:1: ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1436:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1436:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1437:3: lv_buildProperties_10_0= ruleBuildProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getBuildPropertiesBuildPropertiesParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_ruleBundleProject3220);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1460:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1460:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1461:5: {...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1461:110: ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1462:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1465:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1465:7: {...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1465:16: (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1465:18: otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    {
            	    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBundleProject3288); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBundleProjectAccess().getPluginxmlKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBundleProject3300); 

            	        	newLeafNode(otherlv_12, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1473:1: ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1474:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1474:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1475:3: lv_pluginxml_13_0= rulePluginXMLFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getPluginxmlPluginXMLFileParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleBundleProject3321);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1506:2: (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1506:4: otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}'
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBundleProject3381); 

                        	newLeafNode(otherlv_14, grammarAccess.getBundleProjectAccess().getResourcesKeyword_5_0());
                        
                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBundleProject3393); 

                        	newLeafNode(otherlv_15, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBundleProject3405); 

                        	newLeafNode(otherlv_16, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1518:1: ( (lv_resources_17_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1519:1: (lv_resources_17_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1519:1: (lv_resources_17_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1520:3: lv_resources_17_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject3426);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1536:2: (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1536:4: otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject3439); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getBundleProjectAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1540:1: ( (lv_resources_19_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1541:1: (lv_resources_19_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1541:1: (lv_resources_19_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1542:3: lv_resources_19_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject3460);
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

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject3474); 

                        	newLeafNode(otherlv_20, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject3488); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1574:1: entryRuleFeatureProject returns [EObject current=null] : iv_ruleFeatureProject= ruleFeatureProject EOF ;
    public final EObject entryRuleFeatureProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1575:2: (iv_ruleFeatureProject= ruleFeatureProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1576:2: iv_ruleFeatureProject= ruleFeatureProject EOF
            {
             newCompositeNode(grammarAccess.getFeatureProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject3524);
            iv_ruleFeatureProject=ruleFeatureProject();

            state._fsp--;

             current =iv_ruleFeatureProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureProject3534); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1583:1: ruleFeatureProject returns [EObject current=null] : ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1586:28: ( ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1587:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1587:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1587:2: () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1587:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1588:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureProjectAccess().getFeatureProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleFeatureProject3580); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureProjectAccess().getFeatureProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1597:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1598:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1598:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1599:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeatureProject3601);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureProject3613); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleFeatureProject3625); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureProjectAccess().getFeatureKeyword_4());
                
            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureProject3637); 

                	newLeafNode(otherlv_5, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_5());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1627:1: ( (lv_feature_6_0= ruleFeatureFile ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1628:1: (lv_feature_6_0= ruleFeatureFile )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1628:1: (lv_feature_6_0= ruleFeatureFile )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1629:3: lv_feature_6_0= ruleFeatureFile
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getFeatureFeatureFileParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_ruleFeatureProject3658);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1645:2: (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1645:4: otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}'
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFeatureProject3671); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureProjectAccess().getResourcesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureProject3683); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureProject3695); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1657:1: ( (lv_resources_10_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1658:1: (lv_resources_10_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1658:1: (lv_resources_10_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1659:3: lv_resources_10_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject3716);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1675:2: (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1675:4: otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureProject3729); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getFeatureProjectAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1679:1: ( (lv_resources_12_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1680:1: (lv_resources_12_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1680:1: (lv_resources_12_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1681:3: lv_resources_12_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject3750);
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

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureProject3764); 

                        	newLeafNode(otherlv_13, grammarAccess.getFeatureProjectAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureProject3778); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1713:1: entryRuleManifestFile returns [EObject current=null] : iv_ruleManifestFile= ruleManifestFile EOF ;
    public final EObject entryRuleManifestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1714:2: (iv_ruleManifestFile= ruleManifestFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1715:2: iv_ruleManifestFile= ruleManifestFile EOF
            {
             newCompositeNode(grammarAccess.getManifestFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_entryRuleManifestFile3814);
            iv_ruleManifestFile=ruleManifestFile();

            state._fsp--;

             current =iv_ruleManifestFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManifestFile3824); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1722:1: ruleManifestFile returns [EObject current=null] : ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleManifestFile() throws RecognitionException {
        EObject current = null;

        Token lv_lazy_1_0=null;
        Token lv_singleton_2_0=null;
        Token otherlv_3=null;
        Token lv_symbolicname_4_0=null;
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
        AntlrDatatypeRuleToken lv_version_5_0 = null;

        EObject lv_exportedPackages_21_0 = null;

        EObject lv_exportedPackages_23_0 = null;

        EObject lv_importedPackages_28_0 = null;

        EObject lv_importedPackages_30_0 = null;

        EObject lv_requiredBundles_35_0 = null;

        EObject lv_requiredBundles_37_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1725:28: ( ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1726:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1726:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1726:2: () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1726:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getManifestFileAccess().getManifestFileAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1732:2: ( (lv_lazy_1_0= 'lazy' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1733:1: (lv_lazy_1_0= 'lazy' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1733:1: (lv_lazy_1_0= 'lazy' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1734:3: lv_lazy_1_0= 'lazy'
                    {
                    lv_lazy_1_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleManifestFile3876); 

                            newLeafNode(lv_lazy_1_0, grammarAccess.getManifestFileAccess().getLazyLazyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "lazy", true, "lazy");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1747:3: ( (lv_singleton_2_0= 'singleton' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1748:1: (lv_singleton_2_0= 'singleton' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1748:1: (lv_singleton_2_0= 'singleton' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1749:3: lv_singleton_2_0= 'singleton'
                    {
                    lv_singleton_2_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleManifestFile3908); 

                            newLeafNode(lv_singleton_2_0, grammarAccess.getManifestFileAccess().getSingletonSingletonKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "singleton", true, "singleton");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleManifestFile3934); 

                	newLeafNode(otherlv_3, grammarAccess.getManifestFileAccess().getManifestFileKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1766:1: ( (lv_symbolicname_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1767:1: (lv_symbolicname_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1767:1: (lv_symbolicname_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1768:3: lv_symbolicname_4_0= RULE_STRING
            {
            lv_symbolicname_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3951); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1784:2: ( (lv_version_5_0= ruleVersion ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1785:1: (lv_version_5_0= ruleVersion )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1785:1: (lv_version_5_0= ruleVersion )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1786:3: lv_version_5_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getManifestFileAccess().getVersionVersionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleManifestFile3977);
            lv_version_5_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_5_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1802:2: ( (lv_executionEnvironment_6_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1803:1: (lv_executionEnvironment_6_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1803:1: (lv_executionEnvironment_6_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1804:3: lv_executionEnvironment_6_0= RULE_STRING
            {
            lv_executionEnvironment_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3994); 

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

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile4011); 

                	newLeafNode(otherlv_7, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_7());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1824:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1826:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1826:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1827:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1830:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1831:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1831:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1833:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1833:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1834:5: {...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1834:109: ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1835:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1838:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1838:7: {...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1838:16: (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1838:18: otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleManifestFile4069); 

            	        	newLeafNode(otherlv_9, grammarAccess.getManifestFileAccess().getBundlenameKeyword_8_0_0());
            	        
            	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile4081); 

            	        	newLeafNode(otherlv_10, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1846:1: ( (lv_bundlename_11_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1847:1: (lv_bundlename_11_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1847:1: (lv_bundlename_11_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1848:3: lv_bundlename_11_0= RULE_STRING
            	    {
            	    lv_bundlename_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile4098); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1871:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1871:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1872:5: {...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1872:109: ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1873:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1876:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1876:7: {...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1876:16: (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1876:18: otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleManifestFile4171); 

            	        	newLeafNode(otherlv_12, grammarAccess.getManifestFileAccess().getVendorKeyword_8_1_0());
            	        
            	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile4183); 

            	        	newLeafNode(otherlv_13, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1884:1: ( (lv_vendor_14_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1885:1: (lv_vendor_14_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1885:1: (lv_vendor_14_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1886:3: lv_vendor_14_0= RULE_STRING
            	    {
            	    lv_vendor_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile4200); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1909:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1909:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1910:5: {...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1910:109: ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1911:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1914:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1914:7: {...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1914:16: (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1914:18: otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleManifestFile4273); 

            	        	newLeafNode(otherlv_15, grammarAccess.getManifestFileAccess().getActivatorClassKeyword_8_2_0());
            	        
            	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile4285); 

            	        	newLeafNode(otherlv_16, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1922:1: ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1923:1: (lv_activatorClass_17_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1923:1: (lv_activatorClass_17_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1924:3: lv_activatorClass_17_0= RULE_STRING
            	    {
            	    lv_activatorClass_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile4302); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1955:2: (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1955:4: otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}'
                    {
                    otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleManifestFile4367); 

                        	newLeafNode(otherlv_18, grammarAccess.getManifestFileAccess().getExportedPackagesKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile4379); 

                        	newLeafNode(otherlv_19, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_9_1());
                        
                    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile4391); 

                        	newLeafNode(otherlv_20, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_9_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1967:1: ( (lv_exportedPackages_21_0= ruleExportedPackage ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1968:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1968:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1969:3: lv_exportedPackages_21_0= ruleExportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile4412);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1985:2: (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1985:4: otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4425); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getManifestFileAccess().getCommaKeyword_9_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1989:1: ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1990:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1990:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1991:3: lv_exportedPackages_23_0= ruleExportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile4446);
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

                    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4460); 

                        	newLeafNode(otherlv_24, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_9_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2011:3: (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2011:5: otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}'
                    {
                    otherlv_25=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleManifestFile4475); 

                        	newLeafNode(otherlv_25, grammarAccess.getManifestFileAccess().getImportedPackagesKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile4487); 

                        	newLeafNode(otherlv_26, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_10_1());
                        
                    otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile4499); 

                        	newLeafNode(otherlv_27, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_10_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2023:1: ( (lv_importedPackages_28_0= ruleImportedPackage ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2024:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2024:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2025:3: lv_importedPackages_28_0= ruleImportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile4520);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2041:2: (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==17) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2041:4: otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    {
                    	    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4533); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getManifestFileAccess().getCommaKeyword_10_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2045:1: ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2046:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2046:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2047:3: lv_importedPackages_30_0= ruleImportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile4554);
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

                    otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4568); 

                        	newLeafNode(otherlv_31, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_10_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2067:3: (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2067:5: otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}'
                    {
                    otherlv_32=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleManifestFile4583); 

                        	newLeafNode(otherlv_32, grammarAccess.getManifestFileAccess().getRequiredBundlesKeyword_11_0());
                        
                    otherlv_33=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile4595); 

                        	newLeafNode(otherlv_33, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_11_1());
                        
                    otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile4607); 

                        	newLeafNode(otherlv_34, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_11_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2079:1: ( (lv_requiredBundles_35_0= ruleRequiredBundle ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2080:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2080:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2081:3: lv_requiredBundles_35_0= ruleRequiredBundle
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile4628);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2097:2: (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2097:4: otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    {
                    	    otherlv_36=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile4641); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getManifestFileAccess().getCommaKeyword_11_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2101:1: ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2102:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2102:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2103:3: lv_requiredBundles_37_0= ruleRequiredBundle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile4662);
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

                    otherlv_38=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4676); 

                        	newLeafNode(otherlv_38, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_11_5());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile4690); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2135:1: entryRulePluginXMLFile returns [EObject current=null] : iv_rulePluginXMLFile= rulePluginXMLFile EOF ;
    public final EObject entryRulePluginXMLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginXMLFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2136:2: (iv_rulePluginXMLFile= rulePluginXMLFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2137:2: iv_rulePluginXMLFile= rulePluginXMLFile EOF
            {
             newCompositeNode(grammarAccess.getPluginXMLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile4726);
            iv_rulePluginXMLFile=rulePluginXMLFile();

            state._fsp--;

             current =iv_rulePluginXMLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePluginXMLFile4736); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2144:1: rulePluginXMLFile returns [EObject current=null] : ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2147:28: ( ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2148:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2148:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2148:2: () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2148:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2149:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPluginXMLFileAccess().getPluginXMLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulePluginXMLFile4782); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginXMLFileAccess().getPluginXMLFileKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePluginXMLFile4794); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2162:1: (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2162:3: otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePluginXMLFile4807); 

                        	newLeafNode(otherlv_3, grammarAccess.getPluginXMLFileAccess().getExtensionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePluginXMLFile4819); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginXMLFileAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePluginXMLFile4831); 

                        	newLeafNode(otherlv_5, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2174:1: ( (lv_extensions_6_0= ruleExtension ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2175:1: (lv_extensions_6_0= ruleExtension )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2175:1: (lv_extensions_6_0= ruleExtension )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2176:3: lv_extensions_6_0= ruleExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile4852);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2192:2: (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==17) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2192:4: otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePluginXMLFile4865); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPluginXMLFileAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2196:1: ( (lv_extensions_8_0= ruleExtension ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2197:1: (lv_extensions_8_0= ruleExtension )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2197:1: (lv_extensions_8_0= ruleExtension )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2198:3: lv_extensions_8_0= ruleExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile4886);
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

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePluginXMLFile4900); 

                        	newLeafNode(otherlv_9, grammarAccess.getPluginXMLFileAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePluginXMLFile4914); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2230:1: entryRuleBuildProperties returns [EObject current=null] : iv_ruleBuildProperties= ruleBuildProperties EOF ;
    public final EObject entryRuleBuildProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildProperties = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2231:2: (iv_ruleBuildProperties= ruleBuildProperties EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2232:2: iv_ruleBuildProperties= ruleBuildProperties EOF
            {
             newCompositeNode(grammarAccess.getBuildPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties4950);
            iv_ruleBuildProperties=ruleBuildProperties();

            state._fsp--;

             current =iv_ruleBuildProperties; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuildProperties4960); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2239:1: ruleBuildProperties returns [EObject current=null] : ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2242:28: ( ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2243:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2243:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2243:2: () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2243:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2244:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildPropertiesAccess().getBuildPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleBuildProperties5006); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildPropertiesAccess().getBuildPropertiesKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBuildProperties5018); 

                	newLeafNode(otherlv_2, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2257:1: (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2257:3: otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleBuildProperties5031); 

                        	newLeafNode(otherlv_3, grammarAccess.getBuildPropertiesAccess().getBinIncludesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBuildProperties5043); 

                        	newLeafNode(otherlv_4, grammarAccess.getBuildPropertiesAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBuildProperties5055); 

                        	newLeafNode(otherlv_5, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2269:1: ( (otherlv_6= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2270:1: (otherlv_6= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2270:1: (otherlv_6= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2271:3: otherlv_6= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties5075); 

                    		newLeafNode(otherlv_6, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_3_0()); 
                    	

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2282:2: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==17) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2282:4: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBuildProperties5088); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBuildPropertiesAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2286:1: ( (otherlv_8= RULE_STRING ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2287:1: (otherlv_8= RULE_STRING )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2287:1: (otherlv_8= RULE_STRING )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2288:3: otherlv_8= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties5108); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBuildProperties5122); 

                        	newLeafNode(otherlv_9, grammarAccess.getBuildPropertiesAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBuildProperties5136); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2315:1: entryRuleProductFileFeaturebase returns [EObject current=null] : iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF ;
    public final EObject entryRuleProductFileFeaturebase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFileFeaturebase = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2316:2: (iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2317:2: iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF
            {
             newCompositeNode(grammarAccess.getProductFileFeaturebaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase5172);
            iv_ruleProductFileFeaturebase=ruleProductFileFeaturebase();

            state._fsp--;

             current =iv_ruleProductFileFeaturebase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFileFeaturebase5182); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2324:1: ruleProductFileFeaturebase returns [EObject current=null] : ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2327:28: ( ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2328:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2328:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2328:2: () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2328:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2329:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2334:2: ( (lv_includeLaunchers_1_0= 'launchable' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2335:1: (lv_includeLaunchers_1_0= 'launchable' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2335:1: (lv_includeLaunchers_1_0= 'launchable' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2336:3: lv_includeLaunchers_1_0= 'launchable'
                    {
                    lv_includeLaunchers_1_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleProductFileFeaturebase5234); 

                            newLeafNode(lv_includeLaunchers_1_0, grammarAccess.getProductFileFeaturebaseAccess().getIncludeLaunchersLaunchableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		setWithLastConsumed(current, "includeLaunchers", true, "launchable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleProductFileFeaturebase5260); 

                	newLeafNode(otherlv_2, grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2353:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2354:1: (lv_id_3_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2354:1: (lv_id_3_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2355:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5277); 

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

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase5294); 

                	newLeafNode(otherlv_4, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_4());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2375:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2377:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2377:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2378:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2381:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2382:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2382:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2384:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2384:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2385:5: {...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2385:119: ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2386:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2389:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2389:7: {...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2389:16: (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2389:18: otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleProductFileFeaturebase5352); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProductFileFeaturebaseAccess().getVmArgsKeyword_5_0_0());
            	        
            	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5364); 

            	        	newLeafNode(otherlv_7, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2397:1: ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2398:1: (lv_vmArgs_8_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2398:1: (lv_vmArgs_8_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2399:3: lv_vmArgs_8_0= RULE_STRING
            	    {
            	    lv_vmArgs_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5381); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2422:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2422:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2423:5: {...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2423:119: ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2424:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2427:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2427:7: {...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2427:16: (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2427:18: otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleProductFileFeaturebase5454); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProductFileFeaturebaseAccess().getProgramArgsKeyword_5_1_0());
            	        
            	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5466); 

            	        	newLeafNode(otherlv_10, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2435:1: ( (lv_programArgs_11_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2436:1: (lv_programArgs_11_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2436:1: (lv_programArgs_11_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2437:3: lv_programArgs_11_0= RULE_STRING
            	    {
            	    lv_programArgs_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5483); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2460:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2460:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2461:5: {...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2461:119: ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2462:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2465:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2465:7: {...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2465:16: (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2465:18: otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleProductFileFeaturebase5556); 

            	        	newLeafNode(otherlv_12, grammarAccess.getProductFileFeaturebaseAccess().getProductNameKeyword_5_2_0());
            	        
            	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5568); 

            	        	newLeafNode(otherlv_13, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2473:1: ( (lv_productName_14_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2474:1: (lv_productName_14_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2474:1: (lv_productName_14_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2475:3: lv_productName_14_0= RULE_STRING
            	    {
            	    lv_productName_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5585); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2498:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2498:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2499:5: {...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2499:119: ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2500:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2503:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2503:7: {...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2503:16: (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2503:18: otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleProductFileFeaturebase5658); 

            	        	newLeafNode(otherlv_15, grammarAccess.getProductFileFeaturebaseAccess().getApplicationKeyword_5_3_0());
            	        
            	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5670); 

            	        	newLeafNode(otherlv_16, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_3_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2511:1: ( (lv_application_17_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2512:1: (lv_application_17_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2512:1: (lv_application_17_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2513:3: lv_application_17_0= RULE_STRING
            	    {
            	    lv_application_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5687); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2536:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2536:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2537:5: {...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2537:119: ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2538:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2541:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2541:7: {...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2541:16: (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2541:18: otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) )
            	    {
            	    otherlv_18=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleProductFileFeaturebase5760); 

            	        	newLeafNode(otherlv_18, grammarAccess.getProductFileFeaturebaseAccess().getVersionKeyword_5_4_0());
            	        
            	    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5772); 

            	        	newLeafNode(otherlv_19, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_4_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2549:1: ( (lv_version_20_0= ruleVersion ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2550:1: (lv_version_20_0= ruleVersion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2550:1: (lv_version_20_0= ruleVersion )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2551:3: lv_version_20_0= ruleVersion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getVersionVersionParserRuleCall_5_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleProductFileFeaturebase5793);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2582:2: (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2582:4: otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}'
                    {
                    otherlv_21=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleProductFileFeaturebase5853); 

                        	newLeafNode(otherlv_21, grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5865); 

                        	newLeafNode(otherlv_22, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase5877); 

                        	newLeafNode(otherlv_23, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2594:1: ( (lv_startconfigurations_24_0= ruleProductStartConfig ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2595:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2595:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2596:3: lv_startconfigurations_24_0= ruleProductStartConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5898);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2612:2: (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==17) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2612:4: otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase5911); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2616:1: ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2617:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2617:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2618:3: lv_startconfigurations_26_0= ruleProductStartConfig
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5932);
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

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase5946); 

                        	newLeafNode(otherlv_27, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2638:3: (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==62) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2638:5: otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}'
                    {
                    otherlv_28=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleProductFileFeaturebase5961); 

                        	newLeafNode(otherlv_28, grammarAccess.getProductFileFeaturebaseAccess().getFeaturesKeyword_7_0());
                        
                    otherlv_29=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5973); 

                        	newLeafNode(otherlv_29, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase5985); 

                        	newLeafNode(otherlv_30, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2650:1: ( (lv_features_31_0= ruleProductFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2651:1: (lv_features_31_0= ruleProductFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2651:1: (lv_features_31_0= ruleProductFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2652:3: lv_features_31_0= ruleProductFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase6006);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2668:2: (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==17) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2668:4: otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) )
                    	    {
                    	    otherlv_32=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase6019); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2672:1: ( (lv_features_33_0= ruleProductFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2673:1: (lv_features_33_0= ruleProductFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2673:1: (lv_features_33_0= ruleProductFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2674:3: lv_features_33_0= ruleProductFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase6040);
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

                    otherlv_34=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase6054); 

                        	newLeafNode(otherlv_34, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_35=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase6068); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2706:1: entryRuleFeatureFile returns [EObject current=null] : iv_ruleFeatureFile= ruleFeatureFile EOF ;
    public final EObject entryRuleFeatureFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2707:2: (iv_ruleFeatureFile= ruleFeatureFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2708:2: iv_ruleFeatureFile= ruleFeatureFile EOF
            {
             newCompositeNode(grammarAccess.getFeatureFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile6104);
            iv_ruleFeatureFile=ruleFeatureFile();

            state._fsp--;

             current =iv_ruleFeatureFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureFile6114); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2715:1: ruleFeatureFile returns [EObject current=null] : ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2718:28: ( ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2719:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2719:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2719:2: () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2719:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2720:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureFileAccess().getFeatureFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleFeatureFile6160); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureFileAccess().getFeatureFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2729:1: ( (lv_featureid_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2730:1: (lv_featureid_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2730:1: (lv_featureid_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2731:3: lv_featureid_2_0= RULE_STRING
            {
            lv_featureid_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6177); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile6194); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2751:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2753:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2753:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2754:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2757:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2758:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2758:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2760:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2760:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2761:5: {...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2761:108: ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2762:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2765:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2765:7: {...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2765:16: (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2765:18: otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleFeatureFile6252); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFeatureFileAccess().getVersionKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6264); 

            	        	newLeafNode(otherlv_6, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2773:1: ( (lv_version_7_0= ruleVersion ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2774:1: (lv_version_7_0= ruleVersion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2774:1: (lv_version_7_0= ruleVersion )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2775:3: lv_version_7_0= ruleVersion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile6285);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2798:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2798:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2799:5: {...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2799:108: ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2800:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2803:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2803:7: {...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2803:16: (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2803:18: otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleFeatureFile6353); 

            	        	newLeafNode(otherlv_8, grammarAccess.getFeatureFileAccess().getFeaturenameKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6365); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2811:1: ( (lv_featurename_10_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2812:1: (lv_featurename_10_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2812:1: (lv_featurename_10_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2813:3: lv_featurename_10_0= RULE_STRING
            	    {
            	    lv_featurename_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6382); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2836:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2836:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2837:5: {...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2837:108: ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2838:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2841:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2841:7: {...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2841:16: (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2841:18: otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleFeatureFile6455); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFeatureFileAccess().getVendorKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6467); 

            	        	newLeafNode(otherlv_12, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2849:1: ( (lv_vendor_13_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2850:1: (lv_vendor_13_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2850:1: (lv_vendor_13_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2851:3: lv_vendor_13_0= RULE_STRING
            	    {
            	    lv_vendor_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6484); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2874:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2874:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2875:5: {...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2875:108: ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2876:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2879:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2879:7: {...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2879:16: (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2879:18: otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) )
            	    {
            	    otherlv_14=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleFeatureFile6557); 

            	        	newLeafNode(otherlv_14, grammarAccess.getFeatureFileAccess().getDescriptionKeyword_4_3_0());
            	        
            	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6569); 

            	        	newLeafNode(otherlv_15, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_3_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2887:1: ( (lv_description_16_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2888:1: (lv_description_16_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2888:1: (lv_description_16_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2889:3: lv_description_16_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getDescriptionLinkedStringParserRuleCall_4_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile6590);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2912:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2912:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2913:5: {...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2913:108: ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2914:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2917:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2917:7: {...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2917:16: (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2917:18: otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) )
            	    {
            	    otherlv_17=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFeatureFile6658); 

            	        	newLeafNode(otherlv_17, grammarAccess.getFeatureFileAccess().getCopyrightKeyword_4_4_0());
            	        
            	    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6670); 

            	        	newLeafNode(otherlv_18, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_4_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2925:1: ( (lv_copyright_19_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2926:1: (lv_copyright_19_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2926:1: (lv_copyright_19_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2927:3: lv_copyright_19_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getCopyrightLinkedStringParserRuleCall_4_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile6691);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2950:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2950:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2951:5: {...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2951:108: ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2952:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2955:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2955:7: {...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2955:16: (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2955:18: otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) )
            	    {
            	    otherlv_20=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleFeatureFile6759); 

            	        	newLeafNode(otherlv_20, grammarAccess.getFeatureFileAccess().getLicenseKeyword_4_5_0());
            	        
            	    otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6771); 

            	        	newLeafNode(otherlv_21, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_5_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2963:1: ( (lv_license_22_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2964:1: (lv_license_22_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2964:1: (lv_license_22_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2965:3: lv_license_22_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicenseLinkedStringParserRuleCall_4_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile6792);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2988:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2988:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2989:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2989:108: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2990:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2993:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2993:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2993:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2995:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2995:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2996:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2999:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3000:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3000:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+
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
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3002:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3002:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3003:5: {...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0)");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3003:110: ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3004:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0);
            	    	    	 				
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3007:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3007:7: {...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3007:16: (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3007:18: otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleFeatureFile6905); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getFeatureFileAccess().getLicenseFeatureKeyword_4_6_0_0());
            	    	        
            	    	    otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6917); 

            	    	        	newLeafNode(otherlv_25, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_0_1());
            	    	        
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3015:1: ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3016:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3016:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3017:3: lv_license_feature_26_0= RULE_STRING
            	    	    {
            	    	    lv_license_feature_26_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6934); 

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
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3040:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3040:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3041:5: {...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1)");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3041:110: ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3042:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1);
            	    	    	 				
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3045:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3045:7: {...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3045:16: (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3045:18: otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleFeatureFile7007); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getFeatureFileAccess().getLicenseFeatureVersionKeyword_4_6_1_0());
            	    	        
            	    	    otherlv_28=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile7019); 

            	    	        	newLeafNode(otherlv_28, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_1_1());
            	    	        
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3053:1: ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3054:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3054:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3055:3: lv_license_feature_version_29_0= ruleVersion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicense_feature_versionVersionParserRuleCall_4_6_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile7040);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3101:2: (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3101:4: otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}'
                    {
                    otherlv_30=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleFeatureFile7146); 

                        	newLeafNode(otherlv_30, grammarAccess.getFeatureFileAccess().getPluginsKeyword_5_0());
                        
                    otherlv_31=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile7158); 

                        	newLeafNode(otherlv_31, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_32=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile7170); 

                        	newLeafNode(otherlv_32, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3113:1: ( (lv_plugins_33_0= ruleFeaturePlugin ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3114:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3114:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3115:3: lv_plugins_33_0= ruleFeaturePlugin
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7191);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3131:2: (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==17) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3131:4: otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    {
                    	    otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7204); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getFeatureFileAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3135:1: ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3136:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3136:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3137:3: lv_plugins_35_0= ruleFeaturePlugin
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7225);
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

                    otherlv_36=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7239); 

                        	newLeafNode(otherlv_36, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3157:3: (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3157:5: otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}'
                    {
                    otherlv_37=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleFeatureFile7254); 

                        	newLeafNode(otherlv_37, grammarAccess.getFeatureFileAccess().getRequiredKeyword_6_0());
                        
                    otherlv_38=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile7266); 

                        	newLeafNode(otherlv_38, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_39=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile7278); 

                        	newLeafNode(otherlv_39, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3169:1: ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3170:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3170:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3171:3: lv_requiredfeatures_40_0= ruleRequiredFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7299);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3187:2: (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==17) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3187:4: otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    {
                    	    otherlv_41=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7312); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getFeatureFileAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3191:1: ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3192:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3192:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3193:3: lv_requiredfeatures_42_0= ruleRequiredFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7333);
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

                    otherlv_43=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7347); 

                        	newLeafNode(otherlv_43, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3213:3: (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3213:5: otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}'
                    {
                    otherlv_44=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleFeatureFile7362); 

                        	newLeafNode(otherlv_44, grammarAccess.getFeatureFileAccess().getIncludedKeyword_7_0());
                        
                    otherlv_45=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile7374); 

                        	newLeafNode(otherlv_45, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_46=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile7386); 

                        	newLeafNode(otherlv_46, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3225:1: ( (lv_includedfeatures_47_0= ruleIncludedFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3226:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3226:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3227:3: lv_includedfeatures_47_0= ruleIncludedFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7407);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3243:2: (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==17) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3243:4: otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    {
                    	    otherlv_48=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile7420); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getFeatureFileAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3247:1: ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3248:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3248:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3249:3: lv_includedfeatures_49_0= ruleIncludedFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7441);
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

                    otherlv_50=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7455); 

                        	newLeafNode(otherlv_50, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_51=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile7469); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3281:1: entryRuleImportedPackage returns [EObject current=null] : iv_ruleImportedPackage= ruleImportedPackage EOF ;
    public final EObject entryRuleImportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedPackage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3282:2: (iv_ruleImportedPackage= ruleImportedPackage EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3283:2: iv_ruleImportedPackage= ruleImportedPackage EOF
            {
             newCompositeNode(grammarAccess.getImportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage7505);
            iv_ruleImportedPackage=ruleImportedPackage();

            state._fsp--;

             current =iv_ruleImportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportedPackage7515); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3290:1: ruleImportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3293:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3294:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3294:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3294:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3294:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3295:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportedPackageAccess().getImportedPackageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3300:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3301:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3301:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3302:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportedPackage7566); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3318:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT||(LA58_0>=73 && LA58_0<=74)) ) {
                alt58=1;
            }
            else if ( (LA58_0==17) ) {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==EOF||LA58_2==RULE_INT||(LA58_2>=17 && LA58_2<=18)||(LA58_2>=75 && LA58_2<=76)) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3318:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3318:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_INT||LA53_0==17||LA53_0==73) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3318:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3318:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==73) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3319:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3319:1: (lv_minExclusive_2_0= '(' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3320:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleImportedPackage7591); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3334:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleImportedPackage7623); 

                                	newLeafNode(otherlv_3, grammarAccess.getImportedPackageAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3338:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_INT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3339:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3339:1: (lv_minVersion_4_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3340:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage7645);
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

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImportedPackage7658); 

                        	newLeafNode(otherlv_5, grammarAccess.getImportedPackageAccess().getCommaKeyword_2_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3360:1: ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3360:2: ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3360:2: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_INT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3361:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3361:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3362:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMaxVersionVersionParserRuleCall_2_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage7680);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3378:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==EOF||(LA57_0>=17 && LA57_0<=18)||LA57_0==75) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3378:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3378:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==75) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3379:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3379:1: (lv_maxExclusive_7_0= ')' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3380:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleImportedPackage7700); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3394:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleImportedPackage7732); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3406:1: entryRuleExportedPackage returns [EObject current=null] : iv_ruleExportedPackage= ruleExportedPackage EOF ;
    public final EObject entryRuleExportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportedPackage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3407:2: (iv_ruleExportedPackage= ruleExportedPackage EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3408:2: iv_ruleExportedPackage= ruleExportedPackage EOF
            {
             newCompositeNode(grammarAccess.getExportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage7772);
            iv_ruleExportedPackage=ruleExportedPackage();

            state._fsp--;

             current =iv_ruleExportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExportedPackage7782); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3415:1: ruleExportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleExportedPackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3418:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3419:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3419:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3419:2: () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3419:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3420:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExportedPackageAccess().getExportedPackageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3425:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3426:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3426:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3427:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExportedPackage7833); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3443:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3444:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3444:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3445:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportedPackageAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleExportedPackage7859);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3469:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3470:2: (iv_ruleExtension= ruleExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3471:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension7896);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension7906); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3478:1: ruleExtension returns [EObject current=null] : ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3481:28: ( ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3482:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3482:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3482:2: () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3482:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3483:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtensionAccess().getExtensionAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3488:2: ( (lv_point_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3489:1: (lv_point_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3489:1: (lv_point_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3490:3: lv_point_1_0= RULE_STRING
            {
            lv_point_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension7957); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension7974); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3510:1: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==77) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3510:3: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleExtension7987); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getIdKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension7999); 

                        	newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3518:1: ( (lv_id_5_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3519:1: (lv_id_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3519:1: (lv_id_5_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3520:3: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension8016); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3536:4: (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==78) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3536:6: otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}'
                    {
                    otherlv_6=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleExtension8036); 

                        	newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getElementsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension8048); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension8060); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3548:1: ( (lv_elements_9_0= ruleElement ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3549:1: (lv_elements_9_0= ruleElement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3549:1: (lv_elements_9_0= ruleElement )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3550:3: lv_elements_9_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension8081);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3566:2: (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==17) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3566:4: otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension8094); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3570:1: ( (lv_elements_11_0= ruleElement ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3571:1: (lv_elements_11_0= ruleElement )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3571:1: (lv_elements_11_0= ruleElement )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3572:3: lv_elements_11_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension8115);
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

                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension8129); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension8143); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3604:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3605:2: (iv_ruleElement= ruleElement EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3606:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement8179);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement8189); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3613:1: ruleElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3616:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3617:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3617:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3617:2: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3617:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3618:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementAccess().getElementAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3623:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3624:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3624:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3625:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElement8240); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement8257); 

                	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3645:1: (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==79) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3645:3: otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleElement8270); 

                        	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getAttributesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement8282); 

                        	newLeafNode(otherlv_4, grammarAccess.getElementAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement8294); 

                        	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3657:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3658:1: (lv_attributes_6_0= ruleAttribute )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3658:1: (lv_attributes_6_0= ruleAttribute )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3659:3: lv_attributes_6_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement8315);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3675:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==17) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3675:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement8328); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getElementAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3679:1: ( (lv_attributes_8_0= ruleAttribute ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3680:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3680:1: (lv_attributes_8_0= ruleAttribute )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3681:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement8349);
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

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement8363); 

                        	newLeafNode(otherlv_9, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3701:3: (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==24) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3701:5: otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleElement8378); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementAccess().getChildrenKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement8390); 

                        	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement8402); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3713:1: ( (lv_children_13_0= ruleElement ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3714:1: (lv_children_13_0= ruleElement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3714:1: (lv_children_13_0= ruleElement )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3715:3: lv_children_13_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement8423);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3731:2: (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==17) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3731:4: otherlv_14= ',' ( (lv_children_15_0= ruleElement ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement8436); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getElementAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3735:1: ( (lv_children_15_0= ruleElement ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3736:1: (lv_children_15_0= ruleElement )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3736:1: (lv_children_15_0= ruleElement )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3737:3: lv_children_15_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement8457);
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

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement8471); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement8485); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3769:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3770:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3771:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute8521);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute8531); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3778:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3781:28: ( ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3782:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3782:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3782:2: () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3782:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAttribute8577); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3792:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3793:1: (lv_name_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3793:1: (lv_name_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3794:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute8594); 

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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAttribute8611); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3814:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3815:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3815:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3816:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute8628); 

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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute8645); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3844:1: entryRuleRequiredBundle returns [EObject current=null] : iv_ruleRequiredBundle= ruleRequiredBundle EOF ;
    public final EObject entryRuleRequiredBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBundle = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3845:2: (iv_ruleRequiredBundle= ruleRequiredBundle EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3846:2: iv_ruleRequiredBundle= ruleRequiredBundle EOF
            {
             newCompositeNode(grammarAccess.getRequiredBundleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle8681);
            iv_ruleRequiredBundle=ruleRequiredBundle();

            state._fsp--;

             current =iv_ruleRequiredBundle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredBundle8691); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3853:1: ruleRequiredBundle returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3856:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3857:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3857:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3857:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3857:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3858:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredBundleAccess().getRequiredBundleAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3863:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3864:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3864:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3865:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredBundle8742); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT||(LA73_0>=73 && LA73_0<=74)) ) {
                alt73=1;
            }
            else if ( (LA73_0==17) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==EOF||LA73_2==RULE_INT||(LA73_2>=17 && LA73_2<=18)||(LA73_2>=75 && LA73_2<=76)) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT||LA68_0==17||LA68_0==73) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==73) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3882:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3882:1: (lv_minExclusive_2_0= '(' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3883:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleRequiredBundle8767); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3897:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleRequiredBundle8799); 

                                	newLeafNode(otherlv_3, grammarAccess.getRequiredBundleAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3901:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3902:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3902:1: (lv_minVersion_4_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3903:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle8821);
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

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRequiredBundle8834); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequiredBundleAccess().getCommaKeyword_2_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3923:1: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_INT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3924:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3924:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3925:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMaxVersionVersionParserRuleCall_2_3_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle8855);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3941:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==EOF||(LA72_0>=17 && LA72_0<=18)||LA72_0==75) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3941:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3941:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==75) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3942:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3942:1: (lv_maxExclusive_7_0= ')' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3943:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleRequiredBundle8875); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3957:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleRequiredBundle8907); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3969:1: entryRuleLinkedString returns [EObject current=null] : iv_ruleLinkedString= ruleLinkedString EOF ;
    public final EObject entryRuleLinkedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedString = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3970:2: (iv_ruleLinkedString= ruleLinkedString EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3971:2: iv_ruleLinkedString= ruleLinkedString EOF
            {
             newCompositeNode(grammarAccess.getLinkedStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_entryRuleLinkedString8946);
            iv_ruleLinkedString=ruleLinkedString();

            state._fsp--;

             current =iv_ruleLinkedString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkedString8956); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3978:1: ruleLinkedString returns [EObject current=null] : ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleLinkedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_weburl_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3981:28: ( ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3982:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3982:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3982:2: () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3982:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3983:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkedStringAccess().getLinkedStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleLinkedString9002); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkedStringAccess().getLinkedStringKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3992:1: ( (lv_weburl_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3993:1: (lv_weburl_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3993:1: (lv_weburl_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3994:3: lv_weburl_2_0= RULE_STRING
            {
            lv_weburl_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString9019); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLinkedString9036); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkedStringAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4014:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4015:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4015:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4016:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString9053); 

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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLinkedString9070); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4044:1: entryRuleFeaturePlugin returns [EObject current=null] : iv_ruleFeaturePlugin= ruleFeaturePlugin EOF ;
    public final EObject entryRuleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePlugin = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4045:2: (iv_ruleFeaturePlugin= ruleFeaturePlugin EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4046:2: iv_ruleFeaturePlugin= ruleFeaturePlugin EOF
            {
             newCompositeNode(grammarAccess.getFeaturePluginRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin9106);
            iv_ruleFeaturePlugin=ruleFeaturePlugin();

            state._fsp--;

             current =iv_ruleFeaturePlugin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePlugin9116); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4053:1: ruleFeaturePlugin returns [EObject current=null] : ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        Token lv_unpack_1_0=null;
        Token lv_fragment_2_0=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4056:28: ( ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4057:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4057:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4057:2: () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4057:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4058:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeaturePluginAccess().getFeaturePluginAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4063:2: ( (lv_unpack_1_0= 'unpacked' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==81) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4064:1: (lv_unpack_1_0= 'unpacked' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4064:1: (lv_unpack_1_0= 'unpacked' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4065:3: lv_unpack_1_0= 'unpacked'
                    {
                    lv_unpack_1_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleFeaturePlugin9168); 

                            newLeafNode(lv_unpack_1_0, grammarAccess.getFeaturePluginAccess().getUnpackUnpackedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "unpack", true, "unpacked");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4078:3: ( (lv_fragment_2_0= 'fragment' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==82) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4079:1: (lv_fragment_2_0= 'fragment' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4079:1: (lv_fragment_2_0= 'fragment' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4080:3: lv_fragment_2_0= 'fragment'
                    {
                    lv_fragment_2_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleFeaturePlugin9200); 

                            newLeafNode(lv_fragment_2_0, grammarAccess.getFeaturePluginAccess().getFragmentFragmentKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4093:3: ( (lv_id_3_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4094:1: (lv_id_3_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4094:1: (lv_id_3_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4095:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeaturePlugin9231); 

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

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeaturePlugin9248); 

                	newLeafNode(otherlv_4, grammarAccess.getFeaturePluginAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeaturePlugin9260); 

                	newLeafNode(otherlv_5, grammarAccess.getFeaturePluginAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4127:1: entryRuleRequiredFeature returns [EObject current=null] : iv_ruleRequiredFeature= ruleRequiredFeature EOF ;
    public final EObject entryRuleRequiredFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4128:2: (iv_ruleRequiredFeature= ruleRequiredFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4129:2: iv_ruleRequiredFeature= ruleRequiredFeature EOF
            {
             newCompositeNode(grammarAccess.getRequiredFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature9296);
            iv_ruleRequiredFeature=ruleRequiredFeature();

            state._fsp--;

             current =iv_ruleRequiredFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredFeature9306); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4136:1: ruleRequiredFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) ) ;
    public final EObject ruleRequiredFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Enumerator lv_match_2_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4139:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4140:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4140:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4140:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4140:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredFeatureAccess().getRequiredFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4146:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4147:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4147:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4148:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredFeature9357); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4164:2: ( (lv_match_2_0= ruleMatchRule ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4165:1: (lv_match_2_0= ruleMatchRule )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4165:1: (lv_match_2_0= ruleMatchRule )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4166:3: lv_match_2_0= ruleMatchRule
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getMatchMatchRuleEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchRule_in_ruleRequiredFeature9383);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4182:2: ( (lv_version_3_0= ruleVersion ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4183:1: (lv_version_3_0= ruleVersion )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4183:1: (lv_version_3_0= ruleVersion )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4184:3: lv_version_3_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getVersionVersionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredFeature9404);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4208:1: entryRuleIncludedFeature returns [EObject current=null] : iv_ruleIncludedFeature= ruleIncludedFeature EOF ;
    public final EObject entryRuleIncludedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludedFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4209:2: (iv_ruleIncludedFeature= ruleIncludedFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4210:2: iv_ruleIncludedFeature= ruleIncludedFeature EOF
            {
             newCompositeNode(grammarAccess.getIncludedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature9440);
            iv_ruleIncludedFeature=ruleIncludedFeature();

            state._fsp--;

             current =iv_ruleIncludedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludedFeature9450); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4217:1: ruleIncludedFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleIncludedFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4220:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4221:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4221:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4221:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4221:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4222:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIncludedFeatureAccess().getIncludedFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4227:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4228:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4228:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4229:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludedFeature9501); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4245:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4246:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4246:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4247:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludedFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleIncludedFeature9527);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4271:1: entryRuleProductFeature returns [EObject current=null] : iv_ruleProductFeature= ruleProductFeature EOF ;
    public final EObject entryRuleProductFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4272:2: (iv_ruleProductFeature= ruleProductFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4273:2: iv_ruleProductFeature= ruleProductFeature EOF
            {
             newCompositeNode(grammarAccess.getProductFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_entryRuleProductFeature9564);
            iv_ruleProductFeature=ruleProductFeature();

            state._fsp--;

             current =iv_ruleProductFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFeature9574); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4280:1: ruleProductFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleProductFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4283:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4284:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4284:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4284:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4284:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4285:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFeatureAccess().getProductFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4290:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4291:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4291:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4292:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFeature9625); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4308:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4309:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4309:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4310:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleProductFeature9651);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4334:1: entryRuleProductStartConfig returns [EObject current=null] : iv_ruleProductStartConfig= ruleProductStartConfig EOF ;
    public final EObject entryRuleProductStartConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStartConfig = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4335:2: (iv_ruleProductStartConfig= ruleProductStartConfig EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4336:2: iv_ruleProductStartConfig= ruleProductStartConfig EOF
            {
             newCompositeNode(grammarAccess.getProductStartConfigRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig9688);
            iv_ruleProductStartConfig=ruleProductStartConfig();

            state._fsp--;

             current =iv_ruleProductStartConfig; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductStartConfig9698); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4343:1: ruleProductStartConfig returns [EObject current=null] : ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' ) ;
    public final EObject ruleProductStartConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token lv_autoStart_3_0=null;
        Token otherlv_4=null;
        Token lv_startLevel_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4346:28: ( ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4347:1: ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4347:1: ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4347:2: () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4347:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductStartConfigAccess().getProductStartConfigAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleProductStartConfig9744); 

                	newLeafNode(otherlv_1, grammarAccess.getProductStartConfigAccess().getProductStartConfigKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4357:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4358:1: (lv_id_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4358:1: (lv_id_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4359:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductStartConfig9761); 

            			newLeafNode(lv_id_2_0, grammarAccess.getProductStartConfigAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductStartConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4375:2: ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==84) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4375:3: ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4375:3: ( (lv_autoStart_3_0= 'autostarted' ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4376:1: (lv_autoStart_3_0= 'autostarted' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4376:1: (lv_autoStart_3_0= 'autostarted' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4377:3: lv_autoStart_3_0= 'autostarted'
                    {
                    lv_autoStart_3_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleProductStartConfig9785); 

                            newLeafNode(lv_autoStart_3_0, grammarAccess.getProductStartConfigAccess().getAutoStartAutostartedKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                    	        }
                           		setWithLastConsumed(current, "autoStart", true, "autostarted");
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4390:2: (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==85) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4390:4: otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleProductStartConfig9811); 

                                	newLeafNode(otherlv_4, grammarAccess.getProductStartConfigAccess().getAtKeyword_3_1_0());
                                
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4394:1: ( (lv_startLevel_5_0= RULE_INT ) )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4395:1: (lv_startLevel_5_0= RULE_INT )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4395:1: (lv_startLevel_5_0= RULE_INT )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4396:3: lv_startLevel_5_0= RULE_INT
                            {
                            lv_startLevel_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleProductStartConfig9828); 

                            			newLeafNode(lv_startLevel_5_0, grammarAccess.getProductStartConfigAccess().getStartLevelINTTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"startLevel",
                                    		lv_startLevel_5_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductStartConfig9849); 

                	newLeafNode(otherlv_6, grammarAccess.getProductStartConfigAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductStartConfig9861); 

                	newLeafNode(otherlv_7, grammarAccess.getProductStartConfigAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4428:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4429:2: (iv_ruleVersion= ruleVersion EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4430:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion9898);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion9909); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4437:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4440:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4441:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4441:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4441:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9949); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleVersion9967); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9982); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleVersion10000); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion10015); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4474:1: (kw= '-' this_ID_6= RULE_ID )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==87) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4475:2: kw= '-' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleVersion10034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion10049); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4495:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4497:28: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4498:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4498:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt81=1;
                }
                break;
            case 89:
                {
                alt81=2;
                }
                break;
            case 90:
                {
                alt81=3;
                }
                break;
            case 91:
                {
                alt81=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4498:2: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4498:2: (enumLiteral_0= 'BOOLEAN' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4498:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleType10110); 

                            current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4504:6: (enumLiteral_1= 'DOUBLE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4504:6: (enumLiteral_1= 'DOUBLE' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4504:8: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleType10127); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4510:6: (enumLiteral_2= 'INT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4510:6: (enumLiteral_2= 'INT' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4510:8: enumLiteral_2= 'INT'
                    {
                    enumLiteral_2=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleType10144); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4516:6: (enumLiteral_3= 'STRING' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4516:6: (enumLiteral_3= 'STRING' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4516:8: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleType10161); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4526:1: ruleMatchRule returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) ;
    public final Enumerator ruleMatchRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4528:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4529:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4529:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            int alt82=5;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt82=1;
                }
                break;
            case 93:
                {
                alt82=2;
                }
                break;
            case 94:
                {
                alt82=3;
                }
                break;
            case 95:
                {
                alt82=4;
                }
                break;
            case 96:
                {
                alt82=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4529:2: (enumLiteral_0= 'none' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4529:2: (enumLiteral_0= 'none' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4529:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleMatchRule10206); 

                            current = grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4535:6: (enumLiteral_1= 'equivalent' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4535:6: (enumLiteral_1= 'equivalent' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4535:8: enumLiteral_1= 'equivalent'
                    {
                    enumLiteral_1=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleMatchRule10223); 

                            current = grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4541:6: (enumLiteral_2= 'compatible' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4541:6: (enumLiteral_2= 'compatible' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4541:8: enumLiteral_2= 'compatible'
                    {
                    enumLiteral_2=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleMatchRule10240); 

                            current = grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4547:6: (enumLiteral_3= 'perfect' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4547:6: (enumLiteral_3= 'perfect' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4547:8: enumLiteral_3= 'perfect'
                    {
                    enumLiteral_3=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleMatchRule10257); 

                            current = grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4553:6: (enumLiteral_4= 'greaterOrEqual' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4553:6: (enumLiteral_4= 'greaterOrEqual' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4553:8: enumLiteral_4= 'greaterOrEqual'
                    {
                    enumLiteral_4=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleMatchRule10274); 

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
        public static final BitSet FOLLOW_13_in_ruleRobotTask131 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRobotTask143 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask156 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRobotTask168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRobotTask180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRobotTask201 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleRobotTask214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRobotTask235 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask249 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask264 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRobotTask276 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRobotTask288 = new BitSet(new long[]{0x0000008800200000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask309 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleRobotTask322 = new BitSet(new long[]{0x0000008800200000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask343 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask357 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_DOC_in_ruleVariable459 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleVariable485 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable502 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleVariable520 = new BitSet(new long[]{0x0000000000000020L});
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
        public static final BitSet FOLLOW_21_in_ruleProject1063 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProject1084 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProject1096 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleProject1109 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProject1121 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProject1133 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject1154 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleProject1167 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject1188 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleProject1202 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleProject1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder1375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolder1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFolder1431 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFolder1452 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFolder1464 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleFolder1477 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFolder1489 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFolder1501 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1522 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFolder1535 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1556 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFolder1570 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFolder1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplatedFile1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTemplatedFile1676 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1697 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTemplatedFile1709 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_26_in_ruleTemplatedFile1722 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTemplatedFile1734 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1755 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTemplatedFile1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_entryRuleDataFile1805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataFile1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDataFile1861 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataFile1882 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDataFile1894 = new BitSet(new long[]{0x0000000010040000L});
        public static final BitSet FOLLOW_28_in_ruleDataFile1907 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDataFile1919 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEByteArray_in_ruleDataFile1940 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDataFile1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_entryRuleURLFile1990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLFile2000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleURLFile2046 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile2067 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleURLFile2079 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_30_in_ruleURLFile2092 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleURLFile2104 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile2125 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleURLFile2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDynamicFile_in_entryRuleDynamicFile2175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDynamicFile2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleDynamicFile2231 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDynamicFile2252 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDynamicFile2264 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicFile2281 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleDynamicFile2298 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicFile2315 = new BitSet(new long[]{0x0000000400004002L});
        public static final BitSet FOLLOW_14_in_ruleDynamicFile2333 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDynamicFile2354 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleDynamicFile2367 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDynamicFile2388 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDynamicFile2402 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleDynamicFile2417 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDynamicFile2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2476 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression2486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencingBooleanExpression_in_ruleBooleanExpression2533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineBooleanExpression_in_ruleBooleanExpression2560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencingBooleanExpression_in_entryRuleReferencingBooleanExpression2595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferencingBooleanExpression2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2647 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleReferencingBooleanExpression2664 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineBooleanExpression_in_entryRuleInlineBooleanExpression2722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineBooleanExpression2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInlineBooleanExpression2774 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INLINE_SCRIPT_in_ruleInlineBooleanExpression2796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEByteArray_in_entryRuleEByteArray2838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEByteArray2849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEByteArray2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_entryRuleBundleProject2939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundleProject2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBundleProject2995 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundleProject3016 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBundleProject3028 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_36_in_ruleBundleProject3086 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBundleProject3098 = new BitSet(new long[]{0x00000E0000000000L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleBundleProject3119 = new BitSet(new long[]{0x0000007000440000L});
        public static final BitSet FOLLOW_37_in_ruleBundleProject3187 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBundleProject3199 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_ruleBundleProject3220 = new BitSet(new long[]{0x0000007000440000L});
        public static final BitSet FOLLOW_38_in_ruleBundleProject3288 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBundleProject3300 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleBundleProject3321 = new BitSet(new long[]{0x0000007000440000L});
        public static final BitSet FOLLOW_22_in_ruleBundleProject3381 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBundleProject3393 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBundleProject3405 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject3426 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject3439 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject3460 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject3474 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject3488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject3524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureProject3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleFeatureProject3580 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeatureProject3601 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureProject3613 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleFeatureProject3625 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureProject3637 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_ruleFeatureProject3658 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleFeatureProject3671 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureProject3683 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureProject3695 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject3716 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureProject3729 = new BitSet(new long[]{0x00C40E00AA800000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject3750 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureProject3764 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureProject3778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile3814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile3824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleManifestFile3876 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_42_in_ruleManifestFile3908 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleManifestFile3934 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3951 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleManifestFile3977 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3994 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile4011 = new BitSet(new long[]{0x0000700000000000L});
        public static final BitSet FOLLOW_44_in_ruleManifestFile4069 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile4081 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile4098 = new BitSet(new long[]{0x0003F00000040000L});
        public static final BitSet FOLLOW_45_in_ruleManifestFile4171 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile4183 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile4200 = new BitSet(new long[]{0x0003F00000040000L});
        public static final BitSet FOLLOW_46_in_ruleManifestFile4273 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile4285 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile4302 = new BitSet(new long[]{0x0003F00000040000L});
        public static final BitSet FOLLOW_47_in_ruleManifestFile4367 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile4379 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile4391 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile4412 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4425 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile4446 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4460 = new BitSet(new long[]{0x0003000000040000L});
        public static final BitSet FOLLOW_48_in_ruleManifestFile4475 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile4487 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile4499 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile4520 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4533 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile4554 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4568 = new BitSet(new long[]{0x0002000000040000L});
        public static final BitSet FOLLOW_49_in_ruleManifestFile4583 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile4595 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile4607 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile4628 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile4641 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile4662 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4676 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile4690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile4726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePluginXMLFile4736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulePluginXMLFile4782 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePluginXMLFile4794 = new BitSet(new long[]{0x0008000000040000L});
        public static final BitSet FOLLOW_51_in_rulePluginXMLFile4807 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePluginXMLFile4819 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePluginXMLFile4831 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile4852 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_rulePluginXMLFile4865 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile4886 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_rulePluginXMLFile4900 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePluginXMLFile4914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties4950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuildProperties4960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleBuildProperties5006 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBuildProperties5018 = new BitSet(new long[]{0x0020000000040000L});
        public static final BitSet FOLLOW_53_in_ruleBuildProperties5031 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBuildProperties5043 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBuildProperties5055 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties5075 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleBuildProperties5088 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties5108 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleBuildProperties5122 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBuildProperties5136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase5172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFileFeaturebase5182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleProductFileFeaturebase5234 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleProductFileFeaturebase5260 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5277 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase5294 = new BitSet(new long[]{0x1F00000000000000L});
        public static final BitSet FOLLOW_56_in_ruleProductFileFeaturebase5352 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5364 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5381 = new BitSet(new long[]{0x7F00000000040000L});
        public static final BitSet FOLLOW_57_in_ruleProductFileFeaturebase5454 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5466 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5483 = new BitSet(new long[]{0x7F00000000040000L});
        public static final BitSet FOLLOW_58_in_ruleProductFileFeaturebase5556 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5568 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5585 = new BitSet(new long[]{0x7F00000000040000L});
        public static final BitSet FOLLOW_59_in_ruleProductFileFeaturebase5658 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5670 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase5687 = new BitSet(new long[]{0x7F00000000040000L});
        public static final BitSet FOLLOW_60_in_ruleProductFileFeaturebase5760 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5772 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleProductFileFeaturebase5793 = new BitSet(new long[]{0x7F00000000040000L});
        public static final BitSet FOLLOW_61_in_ruleProductFileFeaturebase5853 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5865 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase5877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5898 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase5911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5932 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase5946 = new BitSet(new long[]{0x4000000000040000L});
        public static final BitSet FOLLOW_62_in_ruleProductFileFeaturebase5961 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5973 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase5985 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase6006 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase6019 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase6040 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase6054 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase6068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile6104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureFile6114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleFeatureFile6160 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6177 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile6194 = new BitSet(new long[]{0x1000200000000000L,0x000000000000003FL});
        public static final BitSet FOLLOW_60_in_ruleFeatureFile6252 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6264 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile6285 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_64_in_ruleFeatureFile6353 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6365 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6382 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_45_in_ruleFeatureFile6455 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6467 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6484 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_65_in_ruleFeatureFile6557 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile6590 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_66_in_ruleFeatureFile6658 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile6691 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_67_in_ruleFeatureFile6759 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile6792 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_68_in_ruleFeatureFile6905 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6917 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6934 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_69_in_ruleFeatureFile7007 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile7019 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile7040 = new BitSet(new long[]{0x1000200000040000L,0x00000000000001FFL});
        public static final BitSet FOLLOW_70_in_ruleFeatureFile7146 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile7158 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile7170 = new BitSet(new long[]{0x0000000000000020L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7191 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7204 = new BitSet(new long[]{0x0000000000000020L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile7225 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7239 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000180L});
        public static final BitSet FOLLOW_71_in_ruleFeatureFile7254 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile7266 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile7278 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7299 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7312 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile7333 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7347 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleFeatureFile7362 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile7374 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile7386 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7407 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile7420 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile7441 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7455 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile7469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage7505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportedPackage7515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportedPackage7566 = new BitSet(new long[]{0x0000000000020102L,0x0000000000000600L});
        public static final BitSet FOLLOW_73_in_ruleImportedPackage7591 = new BitSet(new long[]{0x0000000000020100L});
        public static final BitSet FOLLOW_74_in_ruleImportedPackage7623 = new BitSet(new long[]{0x0000000000020100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage7645 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleImportedPackage7658 = new BitSet(new long[]{0x0000000000000102L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage7680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
        public static final BitSet FOLLOW_75_in_ruleImportedPackage7700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleImportedPackage7732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage7772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExportedPackage7782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExportedPackage7833 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleExportedPackage7859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension7896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension7906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension7957 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension7974 = new BitSet(new long[]{0x0000000000040000L,0x0000000000006000L});
        public static final BitSet FOLLOW_77_in_ruleExtension7987 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtension7999 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension8016 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleExtension8036 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtension8048 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension8060 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension8081 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleExtension8094 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension8115 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleExtension8129 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleExtension8143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement8179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement8189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElement8240 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleElement8257 = new BitSet(new long[]{0x0000000001040000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleElement8270 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement8282 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleElement8294 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement8315 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleElement8328 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement8349 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleElement8363 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleElement8378 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement8390 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleElement8402 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement8423 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleElement8436 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement8457 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleElement8471 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleElement8485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute8521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute8531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleAttribute8577 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute8594 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAttribute8611 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute8628 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute8645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle8681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredBundle8691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredBundle8742 = new BitSet(new long[]{0x0000000000020102L,0x0000000000000600L});
        public static final BitSet FOLLOW_73_in_ruleRequiredBundle8767 = new BitSet(new long[]{0x0000000000020100L});
        public static final BitSet FOLLOW_74_in_ruleRequiredBundle8799 = new BitSet(new long[]{0x0000000000020100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle8821 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRequiredBundle8834 = new BitSet(new long[]{0x0000000000000102L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle8855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
        public static final BitSet FOLLOW_75_in_ruleRequiredBundle8875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleRequiredBundle8907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedString_in_entryRuleLinkedString8946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkedString8956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleLinkedString9002 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString9019 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLinkedString9036 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString9053 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLinkedString9070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin9106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePlugin9116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleFeaturePlugin9168 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleFeaturePlugin9200 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeaturePlugin9231 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeaturePlugin9248 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFeaturePlugin9260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature9296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredFeature9306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredFeature9357 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
        public static final BitSet FOLLOW_ruleMatchRule_in_ruleRequiredFeature9383 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredFeature9404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature9440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludedFeature9450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludedFeature9501 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleIncludedFeature9527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFeature_in_entryRuleProductFeature9564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFeature9574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFeature9625 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleProductFeature9651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig9688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductStartConfig9698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleProductStartConfig9744 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductStartConfig9761 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleProductStartConfig9785 = new BitSet(new long[]{0x0000000000004000L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleProductStartConfig9811 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleProductStartConfig9828 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductStartConfig9849 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleProductStartConfig9861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion9898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion9909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleVersion9967 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleVersion10000 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion10015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_87_in_ruleVersion10034 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion10049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleType10110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleType10127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleType10144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleType10161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleMatchRule10206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleMatchRule10223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleMatchRule10240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleMatchRule10257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleMatchRule10274 = new BitSet(new long[]{0x0000000000000002L});
    }


}