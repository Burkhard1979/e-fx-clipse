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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotTask'", "'{'", "'projects'", "'='", "','", "'}'", "'SimpleProject'", "'resources'", "'Folder'", "'children'", "'TemplatedFile'", "'generatorType'", "'DataFile'", "'content'", "'URLFile'", "'uri'", "'GeneratorFile'", "'BundleProject'", "'manifest'", "'build'", "'pluginxml'", "'FeatureProject'", "'feature'", "'lazy'", "'singleton'", "'ManifestFile'", "'bundlename'", "'vendor'", "'activatorClass'", "'exportedPackages'", "'importedPackages'", "'requiredBundles'", "'PluginXMLFile'", "'extensions'", "'BuildProperties'", "'binIncludes'", "'launchable'", "'ProductFileFeaturebase'", "'vmArgs'", "'programArgs'", "'productName'", "'application'", "'version'", "'startconfigurations'", "'features'", "'FeatureFile'", "'featurename'", "'description'", "'copyright'", "'license'", "'license-feature'", "'license-feature-version'", "'plugins'", "'required'", "'included'", "'('", "'['", "')'", "']'", "'id'", "'elements'", "'attributes'", "'LinkedString'", "'unpacked'", "'fragment'", "'ProductStartConfig'", "'autostarted'", "'at'", "'.'", "'-'", "'none'", "'equivalent'", "'compatible'", "'perfect'", "'greaterOrEqual'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:77:1: ruleRobotTask returns [EObject current=null] : ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
        EObject lv_projects_6_0 = null;

        EObject lv_projects_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:80:28: ( ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:1: ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:1: ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:2: () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRobotTaskAccess().getRobotTaskAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRobotTask131); 

                	newLeafNode(otherlv_1, grammarAccess.getRobotTaskAccess().getRobotTaskKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRobotTask143); 

                	newLeafNode(otherlv_2, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:1: (otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:3: otherlv_3= 'projects' otherlv_4= '=' otherlv_5= '{' ( (lv_projects_6_0= ruleGenericProject ) ) (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRobotTask156); 

                        	newLeafNode(otherlv_3, grammarAccess.getRobotTaskAccess().getProjectsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRobotTask168); 

                        	newLeafNode(otherlv_4, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRobotTask180); 

                        	newLeafNode(otherlv_5, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:107:1: ( (lv_projects_6_0= ruleGenericProject ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:108:1: (lv_projects_6_0= ruleGenericProject )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:108:1: (lv_projects_6_0= ruleGenericProject )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:109:3: lv_projects_6_0= ruleGenericProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getProjectsGenericProjectParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_ruleRobotTask201);
                    lv_projects_6_0=ruleGenericProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_6_0, 
                            		"GenericProject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:2: (otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:4: otherlv_7= ',' ( (lv_projects_8_0= ruleGenericProject ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask214); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRobotTaskAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:129:1: ( (lv_projects_8_0= ruleGenericProject ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:130:1: (lv_projects_8_0= ruleGenericProject )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:130:1: (lv_projects_8_0= ruleGenericProject )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:131:3: lv_projects_8_0= ruleGenericProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getProjectsGenericProjectParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_ruleRobotTask235);
                    	    lv_projects_8_0=ruleGenericProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_8_0, 
                    	            		"GenericProject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRobotTask249); 

                        	newLeafNode(otherlv_9, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRobotTask263); 

                	newLeafNode(otherlv_10, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleGenericProject"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:163:1: entryRuleGenericProject returns [EObject current=null] : iv_ruleGenericProject= ruleGenericProject EOF ;
    public final EObject entryRuleGenericProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:164:2: (iv_ruleGenericProject= ruleGenericProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:165:2: iv_ruleGenericProject= ruleGenericProject EOF
            {
             newCompositeNode(grammarAccess.getGenericProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_entryRuleGenericProject299);
            iv_ruleGenericProject=ruleGenericProject();

            state._fsp--;

             current =iv_ruleGenericProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericProject309); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:172:1: ruleGenericProject returns [EObject current=null] : (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject ) ;
    public final EObject ruleGenericProject() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_BundleProject_1 = null;

        EObject this_FeatureProject_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:175:28: ( (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:176:1: (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:176:1: (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 32:
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
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:177:5: this_Project_0= ruleProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getProjectParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProject_in_ruleGenericProject356);
                    this_Project_0=ruleProject();

                    state._fsp--;

                     
                            current = this_Project_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:187:5: this_BundleProject_1= ruleBundleProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getBundleProjectParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_ruleGenericProject383);
                    this_BundleProject_1=ruleBundleProject();

                    state._fsp--;

                     
                            current = this_BundleProject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:197:5: this_FeatureProject_2= ruleFeatureProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getFeatureProjectParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_ruleGenericProject410);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:213:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:214:2: (iv_ruleResource= ruleResource EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:215:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResource_in_entryRuleResource445);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResource455); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:222:1: ruleResource returns [EObject current=null] : (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_GeneratorFile_4= ruleGeneratorFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Folder_0 = null;

        EObject this_TemplatedFile_1 = null;

        EObject this_DataFile_2 = null;

        EObject this_URLFile_3 = null;

        EObject this_GeneratorFile_4 = null;

        EObject this_ManifestFile_5 = null;

        EObject this_ProductFileFeaturebase_6 = null;

        EObject this_PluginXMLFile_7 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:225:28: ( (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_GeneratorFile_4= ruleGeneratorFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:226:1: (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_GeneratorFile_4= ruleGeneratorFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:226:1: (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_GeneratorFile_4= ruleGeneratorFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 34:
            case 35:
            case 36:
                {
                alt4=6;
                }
                break;
            case 47:
            case 48:
                {
                alt4=7;
                }
                break;
            case 43:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:227:5: this_Folder_0= ruleFolder
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getFolderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFolder_in_ruleResource502);
                    this_Folder_0=ruleFolder();

                    state._fsp--;

                     
                            current = this_Folder_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:237:5: this_TemplatedFile_1= ruleTemplatedFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getTemplatedFileParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_ruleResource529);
                    this_TemplatedFile_1=ruleTemplatedFile();

                    state._fsp--;

                     
                            current = this_TemplatedFile_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:247:5: this_DataFile_2= ruleDataFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDataFileParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_ruleResource556);
                    this_DataFile_2=ruleDataFile();

                    state._fsp--;

                     
                            current = this_DataFile_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:257:5: this_URLFile_3= ruleURLFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getURLFileParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_ruleResource583);
                    this_URLFile_3=ruleURLFile();

                    state._fsp--;

                     
                            current = this_URLFile_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:267:5: this_GeneratorFile_4= ruleGeneratorFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getGeneratorFileParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneratorFile_in_ruleResource610);
                    this_GeneratorFile_4=ruleGeneratorFile();

                    state._fsp--;

                     
                            current = this_GeneratorFile_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:277:5: this_ManifestFile_5= ruleManifestFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getManifestFileParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleResource637);
                    this_ManifestFile_5=ruleManifestFile();

                    state._fsp--;

                     
                            current = this_ManifestFile_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:287:5: this_ProductFileFeaturebase_6= ruleProductFileFeaturebase
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getProductFileFeaturebaseParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_ruleResource664);
                    this_ProductFileFeaturebase_6=ruleProductFileFeaturebase();

                    state._fsp--;

                     
                            current = this_ProductFileFeaturebase_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:297:5: this_PluginXMLFile_7= rulePluginXMLFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getPluginXMLFileParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleResource691);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:313:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:314:2: (iv_ruleProject= ruleProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:315:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject726);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject736); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:322:1: ruleProject returns [EObject current=null] : ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:325:28: ( ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:326:1: ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:326:1: ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:326:2: () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:326:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:327:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProjectAccess().getProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProject782); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getSimpleProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:336:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:337:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:337:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:338:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProject803);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProject815); 

                	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:358:1: (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:358:3: otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProject828); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getResourcesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProject840); 

                        	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProject852); 

                        	newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:370:1: ( (lv_resources_7_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:371:1: (lv_resources_7_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:371:1: (lv_resources_7_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:372:3: lv_resources_7_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourceParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleProject873);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:388:2: (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:388:4: otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject886); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:392:1: ( (lv_resources_9_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:393:1: (lv_resources_9_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:393:1: (lv_resources_9_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:394:3: lv_resources_9_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourceParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleProject907);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProject921); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProject935); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:426:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:427:2: (iv_ruleEString= ruleEString EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:428:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString972);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString983); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:435:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:438:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:439:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:439:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:439:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1023); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:447:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1049); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:462:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:463:2: (iv_ruleFolder= ruleFolder EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:464:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFolder_in_entryRuleFolder1094);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolder1104); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:471:1: ruleFolder returns [EObject current=null] : ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:474:28: ( ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:475:1: ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:475:1: ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:475:2: () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:475:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:476:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFolderAccess().getFolderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFolder1150); 

                	newLeafNode(otherlv_1, grammarAccess.getFolderAccess().getFolderKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:485:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:486:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:486:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:487:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFolder1171);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFolder1183); 

                	newLeafNode(otherlv_3, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:507:1: (otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:507:3: otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFolder1196); 

                        	newLeafNode(otherlv_4, grammarAccess.getFolderAccess().getChildrenKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFolder1208); 

                        	newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFolder1220); 

                        	newLeafNode(otherlv_6, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:519:1: ( (lv_children_7_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:520:1: (lv_children_7_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:520:1: (lv_children_7_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:521:3: lv_children_7_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFolderAccess().getChildrenResourceParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFolder1241);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:537:2: (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:537:4: otherlv_8= ',' ( (lv_children_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFolder1254); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFolderAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:541:1: ( (lv_children_9_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:542:1: (lv_children_9_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:542:1: (lv_children_9_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:543:3: lv_children_9_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFolderAccess().getChildrenResourceParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFolder1275);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFolder1289); 

                        	newLeafNode(otherlv_10, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFolder1303); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:575:1: entryRuleTemplatedFile returns [EObject current=null] : iv_ruleTemplatedFile= ruleTemplatedFile EOF ;
    public final EObject entryRuleTemplatedFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplatedFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:576:2: (iv_ruleTemplatedFile= ruleTemplatedFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:577:2: iv_ruleTemplatedFile= ruleTemplatedFile EOF
            {
             newCompositeNode(grammarAccess.getTemplatedFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1339);
            iv_ruleTemplatedFile=ruleTemplatedFile();

            state._fsp--;

             current =iv_ruleTemplatedFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplatedFile1349); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:584:1: ruleTemplatedFile returns [EObject current=null] : ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:587:28: ( ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:588:1: ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:588:1: ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:588:2: () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:588:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:589:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemplatedFileAccess().getTemplatedFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTemplatedFile1395); 

                	newLeafNode(otherlv_1, grammarAccess.getTemplatedFileAccess().getTemplatedFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:598:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:599:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:599:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:600:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTemplatedFile1416);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTemplatedFile1428); 

                	newLeafNode(otherlv_3, grammarAccess.getTemplatedFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:620:1: (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:620:3: otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTemplatedFile1441); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemplatedFileAccess().getGeneratorTypeKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTemplatedFile1453); 

                        	newLeafNode(otherlv_5, grammarAccess.getTemplatedFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:628:1: ( (lv_generatorType_6_0= ruleEString ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:629:1: (lv_generatorType_6_0= ruleEString )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:629:1: (lv_generatorType_6_0= ruleEString )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:630:3: lv_generatorType_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getGeneratorTypeEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTemplatedFile1474);
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

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTemplatedFile1488); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:658:1: entryRuleDataFile returns [EObject current=null] : iv_ruleDataFile= ruleDataFile EOF ;
    public final EObject entryRuleDataFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:659:2: (iv_ruleDataFile= ruleDataFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:2: iv_ruleDataFile= ruleDataFile EOF
            {
             newCompositeNode(grammarAccess.getDataFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_entryRuleDataFile1524);
            iv_ruleDataFile=ruleDataFile();

            state._fsp--;

             current =iv_ruleDataFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataFile1534); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:667:1: ruleDataFile returns [EObject current=null] : ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:670:28: ( ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:671:1: ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:671:1: ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:671:2: () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:671:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:672:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataFileAccess().getDataFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDataFile1580); 

                	newLeafNode(otherlv_1, grammarAccess.getDataFileAccess().getDataFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:681:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:682:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:682:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:683:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataFile1601);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataFile1613); 

                	newLeafNode(otherlv_3, grammarAccess.getDataFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:703:1: (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:703:3: otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataFile1626); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataFileAccess().getContentKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataFile1638); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:711:1: ( (lv_content_6_0= ruleEByteArray ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:712:1: (lv_content_6_0= ruleEByteArray )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:712:1: (lv_content_6_0= ruleEByteArray )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:713:3: lv_content_6_0= ruleEByteArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataFileAccess().getContentEByteArrayParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_ruleDataFile1659);
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

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataFile1673); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:741:1: entryRuleURLFile returns [EObject current=null] : iv_ruleURLFile= ruleURLFile EOF ;
    public final EObject entryRuleURLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:742:2: (iv_ruleURLFile= ruleURLFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:743:2: iv_ruleURLFile= ruleURLFile EOF
            {
             newCompositeNode(grammarAccess.getURLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_entryRuleURLFile1709);
            iv_ruleURLFile=ruleURLFile();

            state._fsp--;

             current =iv_ruleURLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLFile1719); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:750:1: ruleURLFile returns [EObject current=null] : ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:753:28: ( ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:754:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:754:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:754:2: () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:754:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:755:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURLFileAccess().getURLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleURLFile1765); 

                	newLeafNode(otherlv_1, grammarAccess.getURLFileAccess().getURLFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:764:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:765:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:765:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:766:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getURLFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile1786);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleURLFile1798); 

                	newLeafNode(otherlv_3, grammarAccess.getURLFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:786:1: (otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:786:3: otherlv_4= 'uri' otherlv_5= '=' ( (lv_uri_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleURLFile1811); 

                        	newLeafNode(otherlv_4, grammarAccess.getURLFileAccess().getUriKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleURLFile1823); 

                        	newLeafNode(otherlv_5, grammarAccess.getURLFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:794:1: ( (lv_uri_6_0= ruleEString ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:795:1: (lv_uri_6_0= ruleEString )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:795:1: (lv_uri_6_0= ruleEString )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:796:3: lv_uri_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getURLFileAccess().getUriEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile1844);
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

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleURLFile1858); 

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


    // $ANTLR start "entryRuleGeneratorFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:824:1: entryRuleGeneratorFile returns [EObject current=null] : iv_ruleGeneratorFile= ruleGeneratorFile EOF ;
    public final EObject entryRuleGeneratorFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:825:2: (iv_ruleGeneratorFile= ruleGeneratorFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:826:2: iv_ruleGeneratorFile= ruleGeneratorFile EOF
            {
             newCompositeNode(grammarAccess.getGeneratorFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneratorFile_in_entryRuleGeneratorFile1894);
            iv_ruleGeneratorFile=ruleGeneratorFile();

            state._fsp--;

             current =iv_ruleGeneratorFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneratorFile1904); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratorFile"


    // $ANTLR start "ruleGeneratorFile"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:833:1: ruleGeneratorFile returns [EObject current=null] : ( () otherlv_1= 'GeneratorFile' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleGeneratorFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:836:28: ( ( () otherlv_1= 'GeneratorFile' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:837:1: ( () otherlv_1= 'GeneratorFile' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:837:1: ( () otherlv_1= 'GeneratorFile' ( (lv_name_2_0= ruleEString ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:837:2: () otherlv_1= 'GeneratorFile' ( (lv_name_2_0= ruleEString ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:837:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:838:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGeneratorFileAccess().getGeneratorFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleGeneratorFile1950); 

                	newLeafNode(otherlv_1, grammarAccess.getGeneratorFileAccess().getGeneratorFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:847:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:848:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:848:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:849:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGeneratorFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGeneratorFile1971);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneratorFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleGeneratorFile"


    // $ANTLR start "entryRuleEByteArray"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:873:1: entryRuleEByteArray returns [String current=null] : iv_ruleEByteArray= ruleEByteArray EOF ;
    public final String entryRuleEByteArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEByteArray = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:874:2: (iv_ruleEByteArray= ruleEByteArray EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:875:2: iv_ruleEByteArray= ruleEByteArray EOF
            {
             newCompositeNode(grammarAccess.getEByteArrayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_entryRuleEByteArray2008);
            iv_ruleEByteArray=ruleEByteArray();

            state._fsp--;

             current =iv_ruleEByteArray.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEByteArray2019); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:882:1: ruleEByteArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleEByteArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:885:28: (this_EString_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:887:5: this_EString_0= ruleEString
            {
             
                    newCompositeNode(grammarAccess.getEByteArrayAccess().getEStringParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEByteArray2065);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:905:1: entryRuleBundleProject returns [EObject current=null] : iv_ruleBundleProject= ruleBundleProject EOF ;
    public final EObject entryRuleBundleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:906:2: (iv_ruleBundleProject= ruleBundleProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:907:2: iv_ruleBundleProject= ruleBundleProject EOF
            {
             newCompositeNode(grammarAccess.getBundleProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_entryRuleBundleProject2109);
            iv_ruleBundleProject=ruleBundleProject();

            state._fsp--;

             current =iv_ruleBundleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundleProject2119); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:914:1: ruleBundleProject returns [EObject current=null] : ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:917:28: ( ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:2: () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:919:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBundleProjectAccess().getBundleProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBundleProject2165); 

                	newLeafNode(otherlv_1, grammarAccess.getBundleProjectAccess().getBundleProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:928:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:929:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:929:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:930:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundleProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundleProject2186);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBundleProject2198); 

                	newLeafNode(otherlv_3, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:950:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:952:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:952:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:953:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:956:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:957:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:957:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:959:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:959:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:960:5: {...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:960:110: ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:961:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:964:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:964:7: {...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:964:16: (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:964:18: otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBundleProject2256); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBundleProjectAccess().getManifestKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBundleProject2268); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:972:1: ( (lv_manifest_7_0= ruleManifestFile ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:973:1: (lv_manifest_7_0= ruleManifestFile )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:973:1: (lv_manifest_7_0= ruleManifestFile )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:974:3: lv_manifest_7_0= ruleManifestFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getManifestManifestFileParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleBundleProject2289);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:997:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:997:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:998:5: {...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:998:110: ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:999:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1002:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1002:7: {...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1002:16: (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1002:18: otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    {
            	    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBundleProject2357); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBundleProjectAccess().getBuildKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBundleProject2369); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1010:1: ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1011:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1011:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1012:3: lv_buildProperties_10_0= ruleBuildProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getBuildPropertiesBuildPropertiesParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_ruleBundleProject2390);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1035:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1035:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1036:5: {...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1036:110: ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1037:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1040:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1040:7: {...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1040:16: (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1040:18: otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    {
            	    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBundleProject2458); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBundleProjectAccess().getPluginxmlKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBundleProject2470); 

            	        	newLeafNode(otherlv_12, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1048:1: ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1049:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1049:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1050:3: lv_pluginxml_13_0= rulePluginXMLFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getPluginxmlPluginXMLFileParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleBundleProject2491);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canLeave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1081:2: (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1081:4: otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}'
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject2551); 

                        	newLeafNode(otherlv_14, grammarAccess.getBundleProjectAccess().getResourcesKeyword_5_0());
                        
                    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBundleProject2563); 

                        	newLeafNode(otherlv_15, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBundleProject2575); 

                        	newLeafNode(otherlv_16, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1093:1: ( (lv_resources_17_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1094:1: (lv_resources_17_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1094:1: (lv_resources_17_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1095:3: lv_resources_17_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject2596);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1111:2: (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1111:4: otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject2609); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getBundleProjectAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1115:1: ( (lv_resources_19_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1116:1: (lv_resources_19_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1116:1: (lv_resources_19_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1117:3: lv_resources_19_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject2630);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBundleProject2644); 

                        	newLeafNode(otherlv_20, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBundleProject2658); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1149:1: entryRuleFeatureProject returns [EObject current=null] : iv_ruleFeatureProject= ruleFeatureProject EOF ;
    public final EObject entryRuleFeatureProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureProject = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1150:2: (iv_ruleFeatureProject= ruleFeatureProject EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1151:2: iv_ruleFeatureProject= ruleFeatureProject EOF
            {
             newCompositeNode(grammarAccess.getFeatureProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject2694);
            iv_ruleFeatureProject=ruleFeatureProject();

            state._fsp--;

             current =iv_ruleFeatureProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureProject2704); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1158:1: ruleFeatureProject returns [EObject current=null] : ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1161:28: ( ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1162:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1162:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1162:2: () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1162:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1163:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureProjectAccess().getFeatureProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFeatureProject2750); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureProjectAccess().getFeatureProjectKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1172:1: ( (lv_name_2_0= ruleEString ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1173:1: (lv_name_2_0= ruleEString )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1173:1: (lv_name_2_0= ruleEString )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1174:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeatureProject2771);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureProject2783); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFeatureProject2795); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureProjectAccess().getFeatureKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureProject2807); 

                	newLeafNode(otherlv_5, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_5());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1202:1: ( (lv_feature_6_0= ruleFeatureFile ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1203:1: (lv_feature_6_0= ruleFeatureFile )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1203:1: (lv_feature_6_0= ruleFeatureFile )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1204:3: lv_feature_6_0= ruleFeatureFile
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getFeatureFeatureFileParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_ruleFeatureProject2828);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1220:2: (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1220:4: otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureProject2841); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureProjectAccess().getResourcesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureProject2853); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureProject2865); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1232:1: ( (lv_resources_10_0= ruleResource ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1233:1: (lv_resources_10_0= ruleResource )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1233:1: (lv_resources_10_0= ruleResource )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1234:3: lv_resources_10_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject2886);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1250:2: (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1250:4: otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureProject2899); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getFeatureProjectAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1254:1: ( (lv_resources_12_0= ruleResource ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1255:1: (lv_resources_12_0= ruleResource )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1255:1: (lv_resources_12_0= ruleResource )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1256:3: lv_resources_12_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject2920);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureProject2934); 

                        	newLeafNode(otherlv_13, grammarAccess.getFeatureProjectAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureProject2948); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1288:1: entryRuleManifestFile returns [EObject current=null] : iv_ruleManifestFile= ruleManifestFile EOF ;
    public final EObject entryRuleManifestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1289:2: (iv_ruleManifestFile= ruleManifestFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1290:2: iv_ruleManifestFile= ruleManifestFile EOF
            {
             newCompositeNode(grammarAccess.getManifestFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_entryRuleManifestFile2984);
            iv_ruleManifestFile=ruleManifestFile();

            state._fsp--;

             current =iv_ruleManifestFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManifestFile2994); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1297:1: ruleManifestFile returns [EObject current=null] : ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1300:28: ( ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1301:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1301:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1301:2: () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= ruleVersion ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1301:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1302:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getManifestFileAccess().getManifestFileAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1307:2: ( (lv_lazy_1_0= 'lazy' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1308:1: (lv_lazy_1_0= 'lazy' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1308:1: (lv_lazy_1_0= 'lazy' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1309:3: lv_lazy_1_0= 'lazy'
                    {
                    lv_lazy_1_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleManifestFile3046); 

                            newLeafNode(lv_lazy_1_0, grammarAccess.getManifestFileAccess().getLazyLazyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "lazy", true, "lazy");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1322:3: ( (lv_singleton_2_0= 'singleton' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1323:1: (lv_singleton_2_0= 'singleton' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1323:1: (lv_singleton_2_0= 'singleton' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1324:3: lv_singleton_2_0= 'singleton'
                    {
                    lv_singleton_2_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleManifestFile3078); 

                            newLeafNode(lv_singleton_2_0, grammarAccess.getManifestFileAccess().getSingletonSingletonKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "singleton", true, "singleton");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleManifestFile3104); 

                	newLeafNode(otherlv_3, grammarAccess.getManifestFileAccess().getManifestFileKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1341:1: ( (lv_symbolicname_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1342:1: (lv_symbolicname_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1342:1: (lv_symbolicname_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1343:3: lv_symbolicname_4_0= RULE_STRING
            {
            lv_symbolicname_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3121); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1359:2: ( (lv_version_5_0= ruleVersion ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1360:1: (lv_version_5_0= ruleVersion )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1360:1: (lv_version_5_0= ruleVersion )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1361:3: lv_version_5_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getManifestFileAccess().getVersionVersionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleManifestFile3147);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1377:2: ( (lv_executionEnvironment_6_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1378:1: (lv_executionEnvironment_6_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1378:1: (lv_executionEnvironment_6_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1379:3: lv_executionEnvironment_6_0= RULE_STRING
            {
            lv_executionEnvironment_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3164); 

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

            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleManifestFile3181); 

                	newLeafNode(otherlv_7, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_7());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1399:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1401:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1401:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1402:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1405:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1406:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1406:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                int LA20_0 = input.LA(1);

                if ( LA20_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
                    alt20=3;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1408:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1408:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1409:5: {...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1409:109: ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1410:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1413:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1413:7: {...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1413:16: (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1413:18: otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleManifestFile3239); 

            	        	newLeafNode(otherlv_9, grammarAccess.getManifestFileAccess().getBundlenameKeyword_8_0_0());
            	        
            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile3251); 

            	        	newLeafNode(otherlv_10, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1421:1: ( (lv_bundlename_11_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1422:1: (lv_bundlename_11_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1422:1: (lv_bundlename_11_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1423:3: lv_bundlename_11_0= RULE_STRING
            	    {
            	    lv_bundlename_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3268); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1446:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1446:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1447:5: {...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1447:109: ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1448:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1451:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1451:7: {...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1451:16: (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1451:18: otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleManifestFile3341); 

            	        	newLeafNode(otherlv_12, grammarAccess.getManifestFileAccess().getVendorKeyword_8_1_0());
            	        
            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile3353); 

            	        	newLeafNode(otherlv_13, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1459:1: ( (lv_vendor_14_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1460:1: (lv_vendor_14_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1460:1: (lv_vendor_14_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1461:3: lv_vendor_14_0= RULE_STRING
            	    {
            	    lv_vendor_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3370); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1484:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1484:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1485:5: {...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1485:109: ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1486:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1489:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1489:7: {...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1489:16: (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1489:18: otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleManifestFile3443); 

            	        	newLeafNode(otherlv_15, grammarAccess.getManifestFileAccess().getActivatorClassKeyword_8_2_0());
            	        
            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile3455); 

            	        	newLeafNode(otherlv_16, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1497:1: ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1498:1: (lv_activatorClass_17_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1498:1: (lv_activatorClass_17_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1499:3: lv_activatorClass_17_0= RULE_STRING
            	    {
            	    lv_activatorClass_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile3472); 

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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8()) ) {
                throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1530:2: (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1530:4: otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}'
                    {
                    otherlv_18=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleManifestFile3537); 

                        	newLeafNode(otherlv_18, grammarAccess.getManifestFileAccess().getExportedPackagesKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile3549); 

                        	newLeafNode(otherlv_19, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_9_1());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleManifestFile3561); 

                        	newLeafNode(otherlv_20, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_9_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1542:1: ( (lv_exportedPackages_21_0= ruleExportedPackage ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1543:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1543:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1544:3: lv_exportedPackages_21_0= ruleExportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile3582);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1560:2: (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1560:4: otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile3595); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getManifestFileAccess().getCommaKeyword_9_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1564:1: ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1565:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1565:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1566:3: lv_exportedPackages_23_0= ruleExportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile3616);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile3630); 

                        	newLeafNode(otherlv_24, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_9_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1586:3: (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1586:5: otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}'
                    {
                    otherlv_25=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleManifestFile3645); 

                        	newLeafNode(otherlv_25, grammarAccess.getManifestFileAccess().getImportedPackagesKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile3657); 

                        	newLeafNode(otherlv_26, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_10_1());
                        
                    otherlv_27=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleManifestFile3669); 

                        	newLeafNode(otherlv_27, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_10_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1598:1: ( (lv_importedPackages_28_0= ruleImportedPackage ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1599:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1599:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1600:3: lv_importedPackages_28_0= ruleImportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile3690);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1616:2: (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1616:4: otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    {
                    	    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile3703); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getManifestFileAccess().getCommaKeyword_10_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1620:1: ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1621:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1621:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1622:3: lv_importedPackages_30_0= ruleImportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile3724);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile3738); 

                        	newLeafNode(otherlv_31, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_10_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1642:3: (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1642:5: otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}'
                    {
                    otherlv_32=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleManifestFile3753); 

                        	newLeafNode(otherlv_32, grammarAccess.getManifestFileAccess().getRequiredBundlesKeyword_11_0());
                        
                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleManifestFile3765); 

                        	newLeafNode(otherlv_33, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_11_1());
                        
                    otherlv_34=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleManifestFile3777); 

                        	newLeafNode(otherlv_34, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_11_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1654:1: ( (lv_requiredBundles_35_0= ruleRequiredBundle ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1655:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1655:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1656:3: lv_requiredBundles_35_0= ruleRequiredBundle
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile3798);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1672:2: (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1672:4: otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    {
                    	    otherlv_36=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile3811); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getManifestFileAccess().getCommaKeyword_11_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1676:1: ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1677:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1677:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1678:3: lv_requiredBundles_37_0= ruleRequiredBundle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile3832);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile3846); 

                        	newLeafNode(otherlv_38, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_11_5());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleManifestFile3860); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1710:1: entryRulePluginXMLFile returns [EObject current=null] : iv_rulePluginXMLFile= rulePluginXMLFile EOF ;
    public final EObject entryRulePluginXMLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginXMLFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1711:2: (iv_rulePluginXMLFile= rulePluginXMLFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1712:2: iv_rulePluginXMLFile= rulePluginXMLFile EOF
            {
             newCompositeNode(grammarAccess.getPluginXMLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile3896);
            iv_rulePluginXMLFile=rulePluginXMLFile();

            state._fsp--;

             current =iv_rulePluginXMLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePluginXMLFile3906); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1719:1: rulePluginXMLFile returns [EObject current=null] : ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1722:28: ( ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1723:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1723:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1723:2: () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1723:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1724:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPluginXMLFileAccess().getPluginXMLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePluginXMLFile3952); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginXMLFileAccess().getPluginXMLFileKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePluginXMLFile3964); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1737:1: (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1737:3: otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePluginXMLFile3977); 

                        	newLeafNode(otherlv_3, grammarAccess.getPluginXMLFileAccess().getExtensionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePluginXMLFile3989); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginXMLFileAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePluginXMLFile4001); 

                        	newLeafNode(otherlv_5, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1749:1: ( (lv_extensions_6_0= ruleExtension ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1750:1: (lv_extensions_6_0= ruleExtension )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1750:1: (lv_extensions_6_0= ruleExtension )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1751:3: lv_extensions_6_0= ruleExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile4022);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1767:2: (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1767:4: otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePluginXMLFile4035); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPluginXMLFileAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1771:1: ( (lv_extensions_8_0= ruleExtension ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1772:1: (lv_extensions_8_0= ruleExtension )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1772:1: (lv_extensions_8_0= ruleExtension )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1773:3: lv_extensions_8_0= ruleExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile4056);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePluginXMLFile4070); 

                        	newLeafNode(otherlv_9, grammarAccess.getPluginXMLFileAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePluginXMLFile4084); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1805:1: entryRuleBuildProperties returns [EObject current=null] : iv_ruleBuildProperties= ruleBuildProperties EOF ;
    public final EObject entryRuleBuildProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildProperties = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1806:2: (iv_ruleBuildProperties= ruleBuildProperties EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1807:2: iv_ruleBuildProperties= ruleBuildProperties EOF
            {
             newCompositeNode(grammarAccess.getBuildPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties4120);
            iv_ruleBuildProperties=ruleBuildProperties();

            state._fsp--;

             current =iv_ruleBuildProperties; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuildProperties4130); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1814:1: ruleBuildProperties returns [EObject current=null] : ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1817:28: ( ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1818:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1818:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1818:2: () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1818:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1819:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildPropertiesAccess().getBuildPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBuildProperties4176); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildPropertiesAccess().getBuildPropertiesKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBuildProperties4188); 

                	newLeafNode(otherlv_2, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1832:1: (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1832:3: otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBuildProperties4201); 

                        	newLeafNode(otherlv_3, grammarAccess.getBuildPropertiesAccess().getBinIncludesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBuildProperties4213); 

                        	newLeafNode(otherlv_4, grammarAccess.getBuildPropertiesAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBuildProperties4225); 

                        	newLeafNode(otherlv_5, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1844:1: ( (otherlv_6= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1845:1: (otherlv_6= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1845:1: (otherlv_6= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1846:3: otherlv_6= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties4245); 

                    		newLeafNode(otherlv_6, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_3_0()); 
                    	

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1857:2: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1857:4: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBuildProperties4258); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBuildPropertiesAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1861:1: ( (otherlv_8= RULE_STRING ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1862:1: (otherlv_8= RULE_STRING )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1862:1: (otherlv_8= RULE_STRING )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1863:3: otherlv_8= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties4278); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBuildProperties4292); 

                        	newLeafNode(otherlv_9, grammarAccess.getBuildPropertiesAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBuildProperties4306); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1890:1: entryRuleProductFileFeaturebase returns [EObject current=null] : iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF ;
    public final EObject entryRuleProductFileFeaturebase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFileFeaturebase = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1891:2: (iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1892:2: iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF
            {
             newCompositeNode(grammarAccess.getProductFileFeaturebaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase4342);
            iv_ruleProductFileFeaturebase=ruleProductFileFeaturebase();

            state._fsp--;

             current =iv_ruleProductFileFeaturebase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFileFeaturebase4352); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1899:1: ruleProductFileFeaturebase returns [EObject current=null] : ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1902:28: ( ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1903:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1903:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1903:2: () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1903:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1904:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1909:2: ( (lv_includeLaunchers_1_0= 'launchable' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1910:1: (lv_includeLaunchers_1_0= 'launchable' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1910:1: (lv_includeLaunchers_1_0= 'launchable' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1911:3: lv_includeLaunchers_1_0= 'launchable'
                    {
                    lv_includeLaunchers_1_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleProductFileFeaturebase4404); 

                            newLeafNode(lv_includeLaunchers_1_0, grammarAccess.getProductFileFeaturebaseAccess().getIncludeLaunchersLaunchableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		setWithLastConsumed(current, "includeLaunchers", true, "launchable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleProductFileFeaturebase4430); 

                	newLeafNode(otherlv_2, grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1928:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1929:1: (lv_id_3_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1929:1: (lv_id_3_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1930:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4447); 

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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProductFileFeaturebase4464); 

                	newLeafNode(otherlv_4, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_4());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1950:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1952:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1952:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1953:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1956:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1957:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1957:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=6;
                int LA32_0 = input.LA(1);

                if ( LA32_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
                    alt32=3;
                }
                else if ( LA32_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
                    alt32=4;
                }
                else if ( LA32_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
                    alt32=5;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1959:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1959:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1960:5: {...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1960:119: ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1961:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1964:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1964:7: {...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1964:16: (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1964:18: otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleProductFileFeaturebase4522); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProductFileFeaturebaseAccess().getVmArgsKeyword_5_0_0());
            	        
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase4534); 

            	        	newLeafNode(otherlv_7, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1972:1: ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1973:1: (lv_vmArgs_8_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1973:1: (lv_vmArgs_8_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1974:3: lv_vmArgs_8_0= RULE_STRING
            	    {
            	    lv_vmArgs_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4551); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1997:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1997:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1998:5: {...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1998:119: ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1999:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2002:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2002:7: {...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2002:16: (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2002:18: otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleProductFileFeaturebase4624); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProductFileFeaturebaseAccess().getProgramArgsKeyword_5_1_0());
            	        
            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase4636); 

            	        	newLeafNode(otherlv_10, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2010:1: ( (lv_programArgs_11_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2011:1: (lv_programArgs_11_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2011:1: (lv_programArgs_11_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2012:3: lv_programArgs_11_0= RULE_STRING
            	    {
            	    lv_programArgs_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4653); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2035:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2035:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2036:5: {...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2036:119: ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2037:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2040:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2040:7: {...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2040:16: (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2040:18: otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleProductFileFeaturebase4726); 

            	        	newLeafNode(otherlv_12, grammarAccess.getProductFileFeaturebaseAccess().getProductNameKeyword_5_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase4738); 

            	        	newLeafNode(otherlv_13, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2048:1: ( (lv_productName_14_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2049:1: (lv_productName_14_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2049:1: (lv_productName_14_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2050:3: lv_productName_14_0= RULE_STRING
            	    {
            	    lv_productName_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4755); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2073:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2073:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2074:5: {...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2074:119: ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2075:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2078:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2078:7: {...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2078:16: (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2078:18: otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleProductFileFeaturebase4828); 

            	        	newLeafNode(otherlv_15, grammarAccess.getProductFileFeaturebaseAccess().getApplicationKeyword_5_3_0());
            	        
            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase4840); 

            	        	newLeafNode(otherlv_16, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_3_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2086:1: ( (lv_application_17_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2087:1: (lv_application_17_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2087:1: (lv_application_17_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2088:3: lv_application_17_0= RULE_STRING
            	    {
            	    lv_application_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4857); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2111:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2111:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2112:5: {...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2112:119: ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2113:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2116:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2116:7: {...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2116:16: (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2116:18: otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= ruleVersion ) )
            	    {
            	    otherlv_18=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleProductFileFeaturebase4930); 

            	        	newLeafNode(otherlv_18, grammarAccess.getProductFileFeaturebaseAccess().getVersionKeyword_5_4_0());
            	        
            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase4942); 

            	        	newLeafNode(otherlv_19, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_4_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2124:1: ( (lv_version_20_0= ruleVersion ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2125:1: (lv_version_20_0= ruleVersion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2125:1: (lv_version_20_0= ruleVersion )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2126:3: lv_version_20_0= ruleVersion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getVersionVersionParserRuleCall_5_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleProductFileFeaturebase4963);
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canLeave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2157:2: (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2157:4: otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}'
                    {
                    otherlv_21=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleProductFileFeaturebase5023); 

                        	newLeafNode(otherlv_21, grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase5035); 

                        	newLeafNode(otherlv_22, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_23=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProductFileFeaturebase5047); 

                        	newLeafNode(otherlv_23, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2169:1: ( (lv_startconfigurations_24_0= ruleProductStartConfig ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2170:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2170:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2171:3: lv_startconfigurations_24_0= ruleProductStartConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5068);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2187:2: (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2187:4: otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase5081); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2191:1: ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2192:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2192:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2193:3: lv_startconfigurations_26_0= ruleProductStartConfig
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5102);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5116); 

                        	newLeafNode(otherlv_27, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2213:3: (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2213:5: otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}'
                    {
                    otherlv_28=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleProductFileFeaturebase5131); 

                        	newLeafNode(otherlv_28, grammarAccess.getProductFileFeaturebaseAccess().getFeaturesKeyword_7_0());
                        
                    otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductFileFeaturebase5143); 

                        	newLeafNode(otherlv_29, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_30=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProductFileFeaturebase5155); 

                        	newLeafNode(otherlv_30, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2225:1: ( (lv_features_31_0= ruleProductFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2226:1: (lv_features_31_0= ruleProductFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2226:1: (lv_features_31_0= ruleProductFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2227:3: lv_features_31_0= ruleProductFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase5176);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2243:2: (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2243:4: otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) )
                    	    {
                    	    otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase5189); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2247:1: ( (lv_features_33_0= ruleProductFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2248:1: (lv_features_33_0= ruleProductFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2248:1: (lv_features_33_0= ruleProductFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2249:3: lv_features_33_0= ruleProductFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase5210);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5224); 

                        	newLeafNode(otherlv_34, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_35=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductFileFeaturebase5238); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2281:1: entryRuleFeatureFile returns [EObject current=null] : iv_ruleFeatureFile= ruleFeatureFile EOF ;
    public final EObject entryRuleFeatureFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureFile = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2282:2: (iv_ruleFeatureFile= ruleFeatureFile EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2283:2: iv_ruleFeatureFile= ruleFeatureFile EOF
            {
             newCompositeNode(grammarAccess.getFeatureFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile5274);
            iv_ruleFeatureFile=ruleFeatureFile();

            state._fsp--;

             current =iv_ruleFeatureFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureFile5284); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2290:1: ruleFeatureFile returns [EObject current=null] : ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2293:28: ( ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2294:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2294:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2294:2: () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2294:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2295:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureFileAccess().getFeatureFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleFeatureFile5330); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureFileAccess().getFeatureFileKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2304:1: ( (lv_featureid_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2305:1: (lv_featureid_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2305:1: (lv_featureid_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2306:3: lv_featureid_2_0= RULE_STRING
            {
            lv_featureid_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile5347); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureFile5364); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2326:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2328:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2328:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2329:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2332:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2333:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2333:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=8;
                int LA38_0 = input.LA(1);

                if ( LA38_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
                    alt38=3;
                }
                else if ( LA38_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
                    alt38=4;
                }
                else if ( LA38_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
                    alt38=5;
                }
                else if ( LA38_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
                    alt38=6;
                }
                else if ( LA38_0 >=61 && LA38_0<=62 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
                    alt38=7;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2335:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2335:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2336:5: {...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2336:108: ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2337:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2340:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2340:7: {...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2340:16: (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2340:18: otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= ruleVersion ) )
            	    {
            	    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleFeatureFile5422); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFeatureFileAccess().getVersionKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile5434); 

            	        	newLeafNode(otherlv_6, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2348:1: ( (lv_version_7_0= ruleVersion ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2349:1: (lv_version_7_0= ruleVersion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2349:1: (lv_version_7_0= ruleVersion )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2350:3: lv_version_7_0= ruleVersion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile5455);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2373:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2373:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2374:5: {...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2374:108: ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2375:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2378:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2378:7: {...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2378:16: (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2378:18: otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleFeatureFile5523); 

            	        	newLeafNode(otherlv_8, grammarAccess.getFeatureFileAccess().getFeaturenameKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile5535); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2386:1: ( (lv_featurename_10_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2387:1: (lv_featurename_10_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2387:1: (lv_featurename_10_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2388:3: lv_featurename_10_0= RULE_STRING
            	    {
            	    lv_featurename_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile5552); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2411:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2411:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2412:5: {...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2412:108: ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2413:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2416:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2416:7: {...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2416:16: (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2416:18: otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFeatureFile5625); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFeatureFileAccess().getVendorKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile5637); 

            	        	newLeafNode(otherlv_12, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2424:1: ( (lv_vendor_13_0= RULE_STRING ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2425:1: (lv_vendor_13_0= RULE_STRING )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2425:1: (lv_vendor_13_0= RULE_STRING )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2426:3: lv_vendor_13_0= RULE_STRING
            	    {
            	    lv_vendor_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile5654); 

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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2449:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2449:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2450:5: {...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2450:108: ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2451:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2454:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2454:7: {...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2454:16: (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2454:18: otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) )
            	    {
            	    otherlv_14=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleFeatureFile5727); 

            	        	newLeafNode(otherlv_14, grammarAccess.getFeatureFileAccess().getDescriptionKeyword_4_3_0());
            	        
            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile5739); 

            	        	newLeafNode(otherlv_15, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_3_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2462:1: ( (lv_description_16_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2463:1: (lv_description_16_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2463:1: (lv_description_16_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2464:3: lv_description_16_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getDescriptionLinkedStringParserRuleCall_4_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile5760);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2487:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2487:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2488:5: {...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2488:108: ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2489:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2492:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2492:7: {...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2492:16: (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2492:18: otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) )
            	    {
            	    otherlv_17=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleFeatureFile5828); 

            	        	newLeafNode(otherlv_17, grammarAccess.getFeatureFileAccess().getCopyrightKeyword_4_4_0());
            	        
            	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile5840); 

            	        	newLeafNode(otherlv_18, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_4_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2500:1: ( (lv_copyright_19_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2501:1: (lv_copyright_19_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2501:1: (lv_copyright_19_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2502:3: lv_copyright_19_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getCopyrightLinkedStringParserRuleCall_4_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile5861);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2525:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2525:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2526:5: {...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2526:108: ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2527:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2530:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2530:7: {...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2530:16: (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2530:18: otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) )
            	    {
            	    otherlv_20=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleFeatureFile5929); 

            	        	newLeafNode(otherlv_20, grammarAccess.getFeatureFileAccess().getLicenseKeyword_4_5_0());
            	        
            	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile5941); 

            	        	newLeafNode(otherlv_21, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_5_1());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2538:1: ( (lv_license_22_0= ruleLinkedString ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2539:1: (lv_license_22_0= ruleLinkedString )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2539:1: (lv_license_22_0= ruleLinkedString )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2540:3: lv_license_22_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicenseLinkedStringParserRuleCall_4_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile5962);
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
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2563:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2563:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2564:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2564:108: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2565:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2568:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2568:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2568:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2570:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2570:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2571:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2574:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2575:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2575:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+
            	    int cnt37=0;
            	    loop37:
            	    do {
            	        int alt37=3;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==61) ) {
            	            int LA37_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	                alt37=1;
            	            }


            	        }
            	        else if ( (LA37_0==62) ) {
            	            int LA37_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	                alt37=2;
            	            }


            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2577:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2577:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2578:5: {...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0)");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2578:110: ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2579:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0);
            	    	    	 				
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2582:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2582:7: {...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2582:16: (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2582:18: otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleFeatureFile6075); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getFeatureFileAccess().getLicenseFeatureKeyword_4_6_0_0());
            	    	        
            	    	    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile6087); 

            	    	        	newLeafNode(otherlv_25, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_0_1());
            	    	        
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2590:1: ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2591:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2591:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2592:3: lv_license_feature_26_0= RULE_STRING
            	    	    {
            	    	    lv_license_feature_26_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile6104); 

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
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2615:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2615:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2616:5: {...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1)");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2616:110: ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2617:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1);
            	    	    	 				
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2620:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2620:7: {...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2620:16: (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2620:18: otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleFeatureFile6177); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getFeatureFileAccess().getLicenseFeatureVersionKeyword_4_6_1_0());
            	    	        
            	    	    otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile6189); 

            	    	        	newLeafNode(otherlv_28, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_1_1());
            	    	        
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2628:1: ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2629:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    {
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2629:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2630:3: lv_license_feature_version_29_0= ruleVersion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicense_feature_versionVersionParserRuleCall_4_6_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile6210);
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
            	    	    if ( cnt37 >= 1 ) break loop37;
            	                EarlyExitException eee =
            	                    new EarlyExitException(37, input);
            	                throw eee;
            	        }
            	        cnt37++;
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2676:2: (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2676:4: otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}'
                    {
                    otherlv_30=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleFeatureFile6316); 

                        	newLeafNode(otherlv_30, grammarAccess.getFeatureFileAccess().getPluginsKeyword_5_0());
                        
                    otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile6328); 

                        	newLeafNode(otherlv_31, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_32=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureFile6340); 

                        	newLeafNode(otherlv_32, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2688:1: ( (lv_plugins_33_0= ruleFeaturePlugin ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2689:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2689:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2690:3: lv_plugins_33_0= ruleFeaturePlugin
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile6361);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2706:2: (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2706:4: otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    {
                    	    otherlv_34=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile6374); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getFeatureFileAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2710:1: ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2711:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2711:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2712:3: lv_plugins_35_0= ruleFeaturePlugin
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile6395);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6409); 

                        	newLeafNode(otherlv_36, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2732:3: (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2732:5: otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}'
                    {
                    otherlv_37=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleFeatureFile6424); 

                        	newLeafNode(otherlv_37, grammarAccess.getFeatureFileAccess().getRequiredKeyword_6_0());
                        
                    otherlv_38=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile6436); 

                        	newLeafNode(otherlv_38, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_39=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureFile6448); 

                        	newLeafNode(otherlv_39, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2744:1: ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2745:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2745:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2746:3: lv_requiredfeatures_40_0= ruleRequiredFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile6469);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2762:2: (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2762:4: otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    {
                    	    otherlv_41=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile6482); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getFeatureFileAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2766:1: ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2767:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2767:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2768:3: lv_requiredfeatures_42_0= ruleRequiredFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile6503);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6517); 

                        	newLeafNode(otherlv_43, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2788:3: (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2788:5: otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}'
                    {
                    otherlv_44=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleFeatureFile6532); 

                        	newLeafNode(otherlv_44, grammarAccess.getFeatureFileAccess().getIncludedKeyword_7_0());
                        
                    otherlv_45=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureFile6544); 

                        	newLeafNode(otherlv_45, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_46=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureFile6556); 

                        	newLeafNode(otherlv_46, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2800:1: ( (lv_includedfeatures_47_0= ruleIncludedFeature ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2801:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2801:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2802:3: lv_includedfeatures_47_0= ruleIncludedFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile6577);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2818:2: (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==15) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2818:4: otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    {
                    	    otherlv_48=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile6590); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getFeatureFileAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2822:1: ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2823:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2823:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2824:3: lv_includedfeatures_49_0= ruleIncludedFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile6611);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6625); 

                        	newLeafNode(otherlv_50, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_51=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureFile6639); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2856:1: entryRuleImportedPackage returns [EObject current=null] : iv_ruleImportedPackage= ruleImportedPackage EOF ;
    public final EObject entryRuleImportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedPackage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2857:2: (iv_ruleImportedPackage= ruleImportedPackage EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2858:2: iv_ruleImportedPackage= ruleImportedPackage EOF
            {
             newCompositeNode(grammarAccess.getImportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage6675);
            iv_ruleImportedPackage=ruleImportedPackage();

            state._fsp--;

             current =iv_ruleImportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportedPackage6685); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2865:1: ruleImportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2868:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2869:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2869:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2869:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2869:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2870:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportedPackageAccess().getImportedPackageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2875:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2876:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2876:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2877:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportedPackage6736); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2893:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT||(LA51_0>=66 && LA51_0<=67)) ) {
                alt51=1;
            }
            else if ( (LA51_0==15) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==EOF||LA51_2==RULE_INT||(LA51_2>=15 && LA51_2<=16)||(LA51_2>=68 && LA51_2<=69)) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2893:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2893:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_INT||LA46_0==15||LA46_0==66) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==67) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2893:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2893:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==66) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2894:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2894:1: (lv_minExclusive_2_0= '(' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2895:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleImportedPackage6761); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2909:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleImportedPackage6793); 

                                	newLeafNode(otherlv_3, grammarAccess.getImportedPackageAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2913:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_INT) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2914:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2914:1: (lv_minVersion_4_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2915:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage6815);
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

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleImportedPackage6828); 

                        	newLeafNode(otherlv_5, grammarAccess.getImportedPackageAccess().getCommaKeyword_2_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2935:1: ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2935:2: ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2935:2: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_INT) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2936:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2936:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2937:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMaxVersionVersionParserRuleCall_2_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage6850);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2953:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==EOF||(LA50_0>=15 && LA50_0<=16)||LA50_0==68) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==69) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2953:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2953:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==68) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2954:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2954:1: (lv_maxExclusive_7_0= ')' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2955:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleImportedPackage6870); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2969:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleImportedPackage6902); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2981:1: entryRuleExportedPackage returns [EObject current=null] : iv_ruleExportedPackage= ruleExportedPackage EOF ;
    public final EObject entryRuleExportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportedPackage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2982:2: (iv_ruleExportedPackage= ruleExportedPackage EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2983:2: iv_ruleExportedPackage= ruleExportedPackage EOF
            {
             newCompositeNode(grammarAccess.getExportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage6942);
            iv_ruleExportedPackage=ruleExportedPackage();

            state._fsp--;

             current =iv_ruleExportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExportedPackage6952); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2990:1: ruleExportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleExportedPackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2993:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2994:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2994:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2994:2: () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2994:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2995:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExportedPackageAccess().getExportedPackageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3000:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3001:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3001:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3002:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExportedPackage7003); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3018:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3019:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3019:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3020:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportedPackageAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleExportedPackage7029);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3044:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3045:2: (iv_ruleExtension= ruleExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3046:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension7066);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension7076); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3053:1: ruleExtension returns [EObject current=null] : ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3056:28: ( ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3057:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3057:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3057:2: () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3057:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3058:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtensionAccess().getExtensionAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3063:2: ( (lv_point_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3064:1: (lv_point_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3064:1: (lv_point_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3065:3: lv_point_1_0= RULE_STRING
            {
            lv_point_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension7127); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtension7144); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3085:1: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3085:3: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleExtension7157); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getIdKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension7169); 

                        	newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3093:1: ( (lv_id_5_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3094:1: (lv_id_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3094:1: (lv_id_5_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3095:3: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension7186); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3111:4: (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==71) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3111:6: otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}'
                    {
                    otherlv_6=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleExtension7206); 

                        	newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getElementsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension7218); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtension7230); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3123:1: ( (lv_elements_9_0= ruleElement ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3124:1: (lv_elements_9_0= ruleElement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3124:1: (lv_elements_9_0= ruleElement )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3125:3: lv_elements_9_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension7251);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3141:2: (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3141:4: otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtension7264); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3145:1: ( (lv_elements_11_0= ruleElement ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3146:1: (lv_elements_11_0= ruleElement )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3146:1: (lv_elements_11_0= ruleElement )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3147:3: lv_elements_11_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension7285);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension7299); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtension7313); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3179:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3180:2: (iv_ruleElement= ruleElement EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3181:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement7349);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement7359); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3188:1: ruleElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3191:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3192:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3192:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3192:2: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3192:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3193:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementAccess().getElementAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3198:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3199:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3199:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3200:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElement7410); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement7427); 

                	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3220:1: (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==72) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3220:3: otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleElement7440); 

                        	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getAttributesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement7452); 

                        	newLeafNode(otherlv_4, grammarAccess.getElementAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement7464); 

                        	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3232:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3233:1: (lv_attributes_6_0= ruleAttribute )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3233:1: (lv_attributes_6_0= ruleAttribute )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3234:3: lv_attributes_6_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement7485);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3250:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3250:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement7498); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getElementAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3254:1: ( (lv_attributes_8_0= ruleAttribute ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3255:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3255:1: (lv_attributes_8_0= ruleAttribute )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3256:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement7519);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement7533); 

                        	newLeafNode(otherlv_9, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3276:3: (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==20) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3276:5: otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElement7548); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementAccess().getChildrenKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement7560); 

                        	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement7572); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3288:1: ( (lv_children_13_0= ruleElement ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3289:1: (lv_children_13_0= ruleElement )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3289:1: (lv_children_13_0= ruleElement )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3290:3: lv_children_13_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement7593);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3306:2: (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3306:4: otherlv_14= ',' ( (lv_children_15_0= ruleElement ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement7606); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getElementAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3310:1: ( (lv_children_15_0= ruleElement ) )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3311:1: (lv_children_15_0= ruleElement )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3311:1: (lv_children_15_0= ruleElement )
                    	    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3312:3: lv_children_15_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement7627);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement7641); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement7655); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3344:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3345:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3346:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute7691);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute7701); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3353:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3356:28: ( ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:2: () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3358:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttribute7747); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3367:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3368:1: (lv_name_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3368:1: (lv_name_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3369:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute7764); 

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

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAttribute7781); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3389:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3390:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3390:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3391:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute7798); 

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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAttribute7815); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3419:1: entryRuleRequiredBundle returns [EObject current=null] : iv_ruleRequiredBundle= ruleRequiredBundle EOF ;
    public final EObject entryRuleRequiredBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBundle = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3420:2: (iv_ruleRequiredBundle= ruleRequiredBundle EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3421:2: iv_ruleRequiredBundle= ruleRequiredBundle EOF
            {
             newCompositeNode(grammarAccess.getRequiredBundleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle7851);
            iv_ruleRequiredBundle=ruleRequiredBundle();

            state._fsp--;

             current =iv_ruleRequiredBundle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredBundle7861); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3428:1: ruleRequiredBundle returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3431:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3432:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3432:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3432:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3432:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredBundleAccess().getRequiredBundleAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3438:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3439:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3439:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3440:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredBundle7912); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3456:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT||(LA66_0>=66 && LA66_0<=67)) ) {
                alt66=1;
            }
            else if ( (LA66_0==15) ) {
                int LA66_2 = input.LA(2);

                if ( (LA66_2==EOF||LA66_2==RULE_INT||(LA66_2>=15 && LA66_2<=16)||(LA66_2>=68 && LA66_2<=69)) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3456:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3456:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_INT||LA61_0==15||LA61_0==66) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==67) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3456:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3456:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==66) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3457:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3457:1: (lv_minExclusive_2_0= '(' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3458:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleRequiredBundle7937); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3472:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleRequiredBundle7969); 

                                	newLeafNode(otherlv_3, grammarAccess.getRequiredBundleAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3476:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_INT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3477:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3477:1: (lv_minVersion_4_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3478:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle7991);
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

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRequiredBundle8004); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequiredBundleAccess().getCommaKeyword_2_2());
                        
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3498:1: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_INT) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3499:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3499:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3500:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMaxVersionVersionParserRuleCall_2_3_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle8025);
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

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3516:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==EOF||(LA65_0>=15 && LA65_0<=16)||LA65_0==68) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==69) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3516:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3516:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==68) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3517:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3517:1: (lv_maxExclusive_7_0= ')' )
                                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3518:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleRequiredBundle8045); 

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
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3532:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleRequiredBundle8077); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3544:1: entryRuleLinkedString returns [EObject current=null] : iv_ruleLinkedString= ruleLinkedString EOF ;
    public final EObject entryRuleLinkedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedString = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3545:2: (iv_ruleLinkedString= ruleLinkedString EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3546:2: iv_ruleLinkedString= ruleLinkedString EOF
            {
             newCompositeNode(grammarAccess.getLinkedStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_entryRuleLinkedString8116);
            iv_ruleLinkedString=ruleLinkedString();

            state._fsp--;

             current =iv_ruleLinkedString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkedString8126); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3553:1: ruleLinkedString returns [EObject current=null] : ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleLinkedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_weburl_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3556:28: ( ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3557:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3557:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3557:2: () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3557:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3558:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkedStringAccess().getLinkedStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleLinkedString8172); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkedStringAccess().getLinkedStringKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3567:1: ( (lv_weburl_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3568:1: (lv_weburl_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3568:1: (lv_weburl_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3569:3: lv_weburl_2_0= RULE_STRING
            {
            lv_weburl_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString8189); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLinkedString8206); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkedStringAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3589:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3590:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3590:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3591:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString8223); 

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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLinkedString8240); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3619:1: entryRuleFeaturePlugin returns [EObject current=null] : iv_ruleFeaturePlugin= ruleFeaturePlugin EOF ;
    public final EObject entryRuleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePlugin = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3620:2: (iv_ruleFeaturePlugin= ruleFeaturePlugin EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3621:2: iv_ruleFeaturePlugin= ruleFeaturePlugin EOF
            {
             newCompositeNode(grammarAccess.getFeaturePluginRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin8276);
            iv_ruleFeaturePlugin=ruleFeaturePlugin();

            state._fsp--;

             current =iv_ruleFeaturePlugin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePlugin8286); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3628:1: ruleFeaturePlugin returns [EObject current=null] : ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        Token lv_unpack_1_0=null;
        Token lv_fragment_2_0=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3631:28: ( ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3632:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3632:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3632:2: () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3632:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3633:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeaturePluginAccess().getFeaturePluginAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3638:2: ( (lv_unpack_1_0= 'unpacked' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==74) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3639:1: (lv_unpack_1_0= 'unpacked' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3639:1: (lv_unpack_1_0= 'unpacked' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3640:3: lv_unpack_1_0= 'unpacked'
                    {
                    lv_unpack_1_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleFeaturePlugin8338); 

                            newLeafNode(lv_unpack_1_0, grammarAccess.getFeaturePluginAccess().getUnpackUnpackedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "unpack", true, "unpacked");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3653:3: ( (lv_fragment_2_0= 'fragment' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==75) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3654:1: (lv_fragment_2_0= 'fragment' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3654:1: (lv_fragment_2_0= 'fragment' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3655:3: lv_fragment_2_0= 'fragment'
                    {
                    lv_fragment_2_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleFeaturePlugin8370); 

                            newLeafNode(lv_fragment_2_0, grammarAccess.getFeaturePluginAccess().getFragmentFragmentKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3668:3: ( (lv_id_3_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3669:1: (lv_id_3_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3669:1: (lv_id_3_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3670:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeaturePlugin8401); 

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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeaturePlugin8418); 

                	newLeafNode(otherlv_4, grammarAccess.getFeaturePluginAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeaturePlugin8430); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3702:1: entryRuleRequiredFeature returns [EObject current=null] : iv_ruleRequiredFeature= ruleRequiredFeature EOF ;
    public final EObject entryRuleRequiredFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3703:2: (iv_ruleRequiredFeature= ruleRequiredFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3704:2: iv_ruleRequiredFeature= ruleRequiredFeature EOF
            {
             newCompositeNode(grammarAccess.getRequiredFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature8466);
            iv_ruleRequiredFeature=ruleRequiredFeature();

            state._fsp--;

             current =iv_ruleRequiredFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredFeature8476); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3711:1: ruleRequiredFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) ) ;
    public final EObject ruleRequiredFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Enumerator lv_match_2_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3714:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3715:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3715:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3715:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3715:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3716:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredFeatureAccess().getRequiredFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3721:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3722:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3722:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3723:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredFeature8527); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3739:2: ( (lv_match_2_0= ruleMatchRule ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3740:1: (lv_match_2_0= ruleMatchRule )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3740:1: (lv_match_2_0= ruleMatchRule )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3741:3: lv_match_2_0= ruleMatchRule
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getMatchMatchRuleEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchRule_in_ruleRequiredFeature8553);
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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3757:2: ( (lv_version_3_0= ruleVersion ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3758:1: (lv_version_3_0= ruleVersion )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3758:1: (lv_version_3_0= ruleVersion )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3759:3: lv_version_3_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getVersionVersionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredFeature8574);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3783:1: entryRuleIncludedFeature returns [EObject current=null] : iv_ruleIncludedFeature= ruleIncludedFeature EOF ;
    public final EObject entryRuleIncludedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludedFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3784:2: (iv_ruleIncludedFeature= ruleIncludedFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3785:2: iv_ruleIncludedFeature= ruleIncludedFeature EOF
            {
             newCompositeNode(grammarAccess.getIncludedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature8610);
            iv_ruleIncludedFeature=ruleIncludedFeature();

            state._fsp--;

             current =iv_ruleIncludedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludedFeature8620); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3792:1: ruleIncludedFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleIncludedFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3795:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3796:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3796:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3796:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3796:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3797:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIncludedFeatureAccess().getIncludedFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3802:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3803:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3803:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3804:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludedFeature8671); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3820:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_INT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3821:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3821:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3822:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludedFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleIncludedFeature8697);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3846:1: entryRuleProductFeature returns [EObject current=null] : iv_ruleProductFeature= ruleProductFeature EOF ;
    public final EObject entryRuleProductFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFeature = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3847:2: (iv_ruleProductFeature= ruleProductFeature EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3848:2: iv_ruleProductFeature= ruleProductFeature EOF
            {
             newCompositeNode(grammarAccess.getProductFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_entryRuleProductFeature8734);
            iv_ruleProductFeature=ruleProductFeature();

            state._fsp--;

             current =iv_ruleProductFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFeature8744); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3855:1: ruleProductFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) ;
    public final EObject ruleProductFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3858:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3859:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3859:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3859:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3859:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3860:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFeatureAccess().getProductFeatureAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3865:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3866:1: (lv_id_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3866:1: (lv_id_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3867:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFeature8795); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3883:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_INT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3884:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3884:1: (lv_version_2_0= ruleVersion )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3885:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleProductFeature8821);
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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3909:1: entryRuleProductStartConfig returns [EObject current=null] : iv_ruleProductStartConfig= ruleProductStartConfig EOF ;
    public final EObject entryRuleProductStartConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStartConfig = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3910:2: (iv_ruleProductStartConfig= ruleProductStartConfig EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3911:2: iv_ruleProductStartConfig= ruleProductStartConfig EOF
            {
             newCompositeNode(grammarAccess.getProductStartConfigRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig8858);
            iv_ruleProductStartConfig=ruleProductStartConfig();

            state._fsp--;

             current =iv_ruleProductStartConfig; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductStartConfig8868); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3918:1: ruleProductStartConfig returns [EObject current=null] : ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3921:28: ( ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3922:1: ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3922:1: ( () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}' )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3922:2: () otherlv_1= 'ProductStartConfig' ( (lv_id_2_0= RULE_STRING ) ) ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )? otherlv_6= '{' otherlv_7= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3922:2: ()
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3923:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductStartConfigAccess().getProductStartConfigAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleProductStartConfig8914); 

                	newLeafNode(otherlv_1, grammarAccess.getProductStartConfigAccess().getProductStartConfigKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3932:1: ( (lv_id_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3933:1: (lv_id_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3933:1: (lv_id_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3934:3: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductStartConfig8931); 

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

            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3950:2: ( ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==77) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3950:3: ( (lv_autoStart_3_0= 'autostarted' ) ) (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3950:3: ( (lv_autoStart_3_0= 'autostarted' ) )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3951:1: (lv_autoStart_3_0= 'autostarted' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3951:1: (lv_autoStart_3_0= 'autostarted' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3952:3: lv_autoStart_3_0= 'autostarted'
                    {
                    lv_autoStart_3_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleProductStartConfig8955); 

                            newLeafNode(lv_autoStart_3_0, grammarAccess.getProductStartConfigAccess().getAutoStartAutostartedKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                    	        }
                           		setWithLastConsumed(current, "autoStart", true, "autostarted");
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3965:2: (otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==78) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3965:4: otherlv_4= 'at' ( (lv_startLevel_5_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleProductStartConfig8981); 

                                	newLeafNode(otherlv_4, grammarAccess.getProductStartConfigAccess().getAtKeyword_3_1_0());
                                
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3969:1: ( (lv_startLevel_5_0= RULE_INT ) )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3970:1: (lv_startLevel_5_0= RULE_INT )
                            {
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3970:1: (lv_startLevel_5_0= RULE_INT )
                            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3971:3: lv_startLevel_5_0= RULE_INT
                            {
                            lv_startLevel_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleProductStartConfig8998); 

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

            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProductStartConfig9019); 

                	newLeafNode(otherlv_6, grammarAccess.getProductStartConfigAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductStartConfig9031); 

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4003:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4004:2: (iv_ruleVersion= ruleVersion EOF )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4005:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion9068);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion9079); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4012:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4015:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4016:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4016:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4016:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9119); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleVersion9137); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9152); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleVersion9170); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion9185); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
                
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4049:1: (kw= '-' this_ID_6= RULE_ID )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==80) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4050:2: kw= '-' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleVersion9204); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion9219); 

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


    // $ANTLR start "ruleMatchRule"
    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4070:1: ruleMatchRule returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) ;
    public final Enumerator ruleMatchRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4072:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) )
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4073:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4073:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            int alt74=5;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt74=1;
                }
                break;
            case 82:
                {
                alt74=2;
                }
                break;
            case 83:
                {
                alt74=3;
                }
                break;
            case 84:
                {
                alt74=4;
                }
                break;
            case 85:
                {
                alt74=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4073:2: (enumLiteral_0= 'none' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4073:2: (enumLiteral_0= 'none' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4073:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleMatchRule9280); 

                            current = grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4079:6: (enumLiteral_1= 'equivalent' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4079:6: (enumLiteral_1= 'equivalent' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4079:8: enumLiteral_1= 'equivalent'
                    {
                    enumLiteral_1=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleMatchRule9297); 

                            current = grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4085:6: (enumLiteral_2= 'compatible' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4085:6: (enumLiteral_2= 'compatible' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4085:8: enumLiteral_2= 'compatible'
                    {
                    enumLiteral_2=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleMatchRule9314); 

                            current = grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4091:6: (enumLiteral_3= 'perfect' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4091:6: (enumLiteral_3= 'perfect' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4091:8: enumLiteral_3= 'perfect'
                    {
                    enumLiteral_3=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleMatchRule9331); 

                            current = grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4097:6: (enumLiteral_4= 'greaterOrEqual' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4097:6: (enumLiteral_4= 'greaterOrEqual' )
                    // ../at.bestsolution.efxclipse.tooling.rrobot.dsl/src-gen/at/bestsolution/efxclipse/tooling/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4097:8: enumLiteral_4= 'greaterOrEqual'
                    {
                    enumLiteral_4=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleMatchRule9348); 

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
        public static final BitSet FOLLOW_11_in_ruleRobotTask131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRobotTask143 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleRobotTask156 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRobotTask168 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRobotTask180 = new BitSet(new long[]{0x0000000110020000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask201 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask214 = new BitSet(new long[]{0x0000000110020000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask235 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRobotTask249 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRobotTask263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericProject_in_entryRuleGenericProject299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericProject309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_ruleGenericProject356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_ruleGenericProject383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_ruleGenericProject410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_entryRuleResource445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResource455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_ruleResource502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_ruleResource529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_ruleResource556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_ruleResource583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratorFile_in_ruleResource610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleResource637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_ruleResource664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleResource691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleProject782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProject803 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProject815 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleProject828 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProject840 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProject852 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject873 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleProject886 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject907 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleProject921 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProject935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder1094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolder1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleFolder1150 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFolder1171 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFolder1183 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleFolder1196 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFolder1208 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFolder1220 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1241 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFolder1254 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1275 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFolder1289 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFolder1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplatedFile1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTemplatedFile1395 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1416 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTemplatedFile1428 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleTemplatedFile1441 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTemplatedFile1453 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1474 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTemplatedFile1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_entryRuleDataFile1524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataFile1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleDataFile1580 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataFile1601 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataFile1613 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_24_in_ruleDataFile1626 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDataFile1638 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEByteArray_in_ruleDataFile1659 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDataFile1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_entryRuleURLFile1709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLFile1719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleURLFile1765 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile1786 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleURLFile1798 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleURLFile1811 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleURLFile1823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile1844 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleURLFile1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratorFile_in_entryRuleGeneratorFile1894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneratorFile1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleGeneratorFile1950 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGeneratorFile1971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEByteArray_in_entryRuleEByteArray2008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEByteArray2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEByteArray2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_entryRuleBundleProject2109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundleProject2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleBundleProject2165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundleProject2186 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBundleProject2198 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleBundleProject2256 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBundleProject2268 = new BitSet(new long[]{0x0000001C00000000L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleBundleProject2289 = new BitSet(new long[]{0x00000000E0050000L});
        public static final BitSet FOLLOW_30_in_ruleBundleProject2357 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBundleProject2369 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_ruleBundleProject2390 = new BitSet(new long[]{0x00000000E0050000L});
        public static final BitSet FOLLOW_31_in_ruleBundleProject2458 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBundleProject2470 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleBundleProject2491 = new BitSet(new long[]{0x00000000E0050000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject2551 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBundleProject2563 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBundleProject2575 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject2596 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject2609 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject2630 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleBundleProject2644 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBundleProject2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject2694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureProject2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFeatureProject2750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeatureProject2771 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureProject2783 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleFeatureProject2795 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureProject2807 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_ruleFeatureProject2828 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureProject2841 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureProject2853 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureProject2865 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject2886 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureProject2899 = new BitSet(new long[]{0x0001881C0AA80000L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject2920 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureProject2934 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureProject2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile2984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleManifestFile3046 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleManifestFile3078 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleManifestFile3104 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3121 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleManifestFile3147 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3164 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleManifestFile3181 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_37_in_ruleManifestFile3239 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile3251 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3268 = new BitSet(new long[]{0x000007E000010000L});
        public static final BitSet FOLLOW_38_in_ruleManifestFile3341 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile3353 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3370 = new BitSet(new long[]{0x000007E000010000L});
        public static final BitSet FOLLOW_39_in_ruleManifestFile3443 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile3455 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile3472 = new BitSet(new long[]{0x000007E000010000L});
        public static final BitSet FOLLOW_40_in_ruleManifestFile3537 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile3549 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleManifestFile3561 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile3582 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile3595 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile3616 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile3630 = new BitSet(new long[]{0x0000060000010000L});
        public static final BitSet FOLLOW_41_in_ruleManifestFile3645 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile3657 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleManifestFile3669 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile3690 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile3703 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile3724 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile3738 = new BitSet(new long[]{0x0000040000010000L});
        public static final BitSet FOLLOW_42_in_ruleManifestFile3753 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleManifestFile3765 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleManifestFile3777 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile3798 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile3811 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile3832 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile3846 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleManifestFile3860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile3896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePluginXMLFile3906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePluginXMLFile3952 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePluginXMLFile3964 = new BitSet(new long[]{0x0000100000010000L});
        public static final BitSet FOLLOW_44_in_rulePluginXMLFile3977 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePluginXMLFile3989 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePluginXMLFile4001 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile4022 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePluginXMLFile4035 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile4056 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_rulePluginXMLFile4070 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePluginXMLFile4084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties4120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuildProperties4130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleBuildProperties4176 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBuildProperties4188 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleBuildProperties4201 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBuildProperties4213 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBuildProperties4225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties4245 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleBuildProperties4258 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties4278 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleBuildProperties4292 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBuildProperties4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase4342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFileFeaturebase4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleProductFileFeaturebase4404 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleProductFileFeaturebase4430 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4447 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProductFileFeaturebase4464 = new BitSet(new long[]{0x003E000000000000L});
        public static final BitSet FOLLOW_49_in_ruleProductFileFeaturebase4522 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase4534 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4551 = new BitSet(new long[]{0x00FE000000010000L});
        public static final BitSet FOLLOW_50_in_ruleProductFileFeaturebase4624 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase4636 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4653 = new BitSet(new long[]{0x00FE000000010000L});
        public static final BitSet FOLLOW_51_in_ruleProductFileFeaturebase4726 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase4738 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4755 = new BitSet(new long[]{0x00FE000000010000L});
        public static final BitSet FOLLOW_52_in_ruleProductFileFeaturebase4828 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase4840 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase4857 = new BitSet(new long[]{0x00FE000000010000L});
        public static final BitSet FOLLOW_53_in_ruleProductFileFeaturebase4930 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase4942 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleProductFileFeaturebase4963 = new BitSet(new long[]{0x00FE000000010000L});
        public static final BitSet FOLLOW_54_in_ruleProductFileFeaturebase5023 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase5035 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProductFileFeaturebase5047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5068 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase5081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase5102 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5116 = new BitSet(new long[]{0x0080000000010000L});
        public static final BitSet FOLLOW_55_in_ruleProductFileFeaturebase5131 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProductFileFeaturebase5143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProductFileFeaturebase5155 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase5176 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase5189 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase5210 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5224 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductFileFeaturebase5238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile5274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureFile5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleFeatureFile5330 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile5347 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureFile5364 = new BitSet(new long[]{0x7E20004000000000L});
        public static final BitSet FOLLOW_53_in_ruleFeatureFile5422 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile5434 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile5455 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_57_in_ruleFeatureFile5523 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile5535 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile5552 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_38_in_ruleFeatureFile5625 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile5637 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile5654 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_58_in_ruleFeatureFile5727 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile5739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile5760 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_59_in_ruleFeatureFile5828 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile5840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile5861 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_60_in_ruleFeatureFile5929 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile5941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile5962 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_61_in_ruleFeatureFile6075 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile6087 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile6104 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_62_in_ruleFeatureFile6177 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile6189 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile6210 = new BitSet(new long[]{0xFE20004000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_63_in_ruleFeatureFile6316 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile6328 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureFile6340 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000C00L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile6361 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile6374 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000C00L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile6395 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6409 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000003L});
        public static final BitSet FOLLOW_64_in_ruleFeatureFile6424 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile6436 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureFile6448 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile6469 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile6482 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile6503 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6517 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleFeatureFile6532 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureFile6544 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureFile6556 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile6577 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile6590 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile6611 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6625 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureFile6639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage6675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportedPackage6685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportedPackage6736 = new BitSet(new long[]{0x0000000000008042L,0x000000000000000CL});
        public static final BitSet FOLLOW_66_in_ruleImportedPackage6761 = new BitSet(new long[]{0x0000000000008040L});
        public static final BitSet FOLLOW_67_in_ruleImportedPackage6793 = new BitSet(new long[]{0x0000000000008040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage6815 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleImportedPackage6828 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage6850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
        public static final BitSet FOLLOW_68_in_ruleImportedPackage6870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleImportedPackage6902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage6942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExportedPackage6952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExportedPackage7003 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleExportedPackage7029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension7066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension7076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension7127 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtension7144 = new BitSet(new long[]{0x0000000000010000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_70_in_ruleExtension7157 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension7169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension7186 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleExtension7206 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension7218 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtension7230 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension7251 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleExtension7264 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension7285 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleExtension7299 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtension7313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement7349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement7359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElement7410 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement7427 = new BitSet(new long[]{0x0000000000110000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleElement7440 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleElement7452 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement7464 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement7485 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleElement7498 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement7519 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleElement7533 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleElement7548 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleElement7560 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement7572 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement7593 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleElement7606 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement7627 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleElement7641 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement7655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute7691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute7701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleAttribute7747 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7764 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAttribute7781 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7798 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAttribute7815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle7851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredBundle7861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredBundle7912 = new BitSet(new long[]{0x0000000000008042L,0x000000000000000CL});
        public static final BitSet FOLLOW_66_in_ruleRequiredBundle7937 = new BitSet(new long[]{0x0000000000008040L});
        public static final BitSet FOLLOW_67_in_ruleRequiredBundle7969 = new BitSet(new long[]{0x0000000000008040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle7991 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRequiredBundle8004 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle8025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
        public static final BitSet FOLLOW_68_in_ruleRequiredBundle8045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleRequiredBundle8077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedString_in_entryRuleLinkedString8116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkedString8126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleLinkedString8172 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString8189 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLinkedString8206 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString8223 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLinkedString8240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin8276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePlugin8286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleFeaturePlugin8338 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleFeaturePlugin8370 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeaturePlugin8401 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeaturePlugin8418 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFeaturePlugin8430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature8466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredFeature8476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredFeature8527 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
        public static final BitSet FOLLOW_ruleMatchRule_in_ruleRequiredFeature8553 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredFeature8574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature8610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludedFeature8620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludedFeature8671 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleIncludedFeature8697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFeature_in_entryRuleProductFeature8734 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFeature8744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFeature8795 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleProductFeature8821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig8858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductStartConfig8868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleProductStartConfig8914 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductStartConfig8931 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleProductStartConfig8955 = new BitSet(new long[]{0x0000000000001000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleProductStartConfig8981 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleProductStartConfig8998 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProductStartConfig9019 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductStartConfig9031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion9068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion9079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleVersion9137 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleVersion9170 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion9185 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleVersion9204 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion9219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleMatchRule9280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleMatchRule9297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleMatchRule9314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleMatchRule9331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleMatchRule9348 = new BitSet(new long[]{0x0000000000000002L});
    }


}