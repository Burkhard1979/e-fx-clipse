package at.bestsolution.efxclipse.tooling.decora.ui.contentassist.antlr.internal; 

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
import at.bestsolution.efxclipse.tooling.decora.services.DecoraDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDecoraDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOT", "RULE_RFIELD", "RULE_XYZW_FIELDS", "RULE_XFIELD", "RULE_LETTER", "RULE_DIGIT", "RULE_INTCONSTANT", "RULE_FLOATCONSTANT", "RULE_WS", "RULE_COMMENT", "RULE_LINE_COMMENT", "RULE_LEFT_FRENCH", "RULE_RIGHT_FRENCH", "RULE_T_GLUE_BLOCK", "RULE_STAR", "RULE_SLASH", "RULE_PLUS", "RULE_DASH", "RULE_LT", "RULE_GT", "RULE_LTEQ", "RULE_GTEQ", "RULE_EQEQ", "RULE_NEQ", "RULE_AND", "RULE_XOR", "RULE_OR", "RULE_INC", "RULE_DEC", "RULE_STAREQ", "RULE_SLASHEQ", "RULE_PLUSEQ", "RULE_DASHEQ", "RULE_LEFT_PAREN", "RULE_RIGHT_PAREN", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_COMMA", "RULE_EQUAL", "RULE_BANG", "RULE_TILDE", "RULE_QUESTION", "RULE_COLON", "RULE_SEMICOLON", "RULE_IF", "RULE_ELSE", "RULE_WHILE", "RULE_DO", "RULE_FOR", "RULE_UNROLL", "RULE_CONTINUE", "RULE_BREAK", "RULE_DISCARD", "RULE_RETURN", "RULE_VOID"
    };
    public static final int RULE_TILDE=46;
    public static final int RULE_XYZW_FIELDS=6;
    public static final int RULE_LTEQ=24;
    public static final int RULE_DISCARD=58;
    public static final int RULE_DO=53;
    public static final int RULE_SEMICOLON=49;
    public static final int RULE_PLUSEQ=35;
    public static final int RULE_RETURN=59;
    public static final int RULE_FOR=54;
    public static final int RULE_OR=30;
    public static final int RULE_AND=28;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=15;
    public static final int RULE_LT=22;
    public static final int RULE_DASHEQ=36;
    public static final int RULE_WHILE=52;
    public static final int RULE_GTEQ=25;
    public static final int RULE_DOT=4;
    public static final int RULE_LEFT_PAREN=37;
    public static final int RULE_GT=23;
    public static final int RULE_RFIELD=5;
    public static final int RULE_SLASHEQ=34;
    public static final int RULE_INC=31;
    public static final int RULE_T_GLUE_BLOCK=17;
    public static final int RULE_FLOATCONSTANT=11;
    public static final int RULE_STAREQ=33;
    public static final int RULE_LEFT_BRACE=41;
    public static final int RULE_BANG=45;
    public static final int RULE_DEC=32;
    public static final int RULE_CONTINUE=56;
    public static final int RULE_XOR=29;
    public static final int RULE_PLUS=20;
    public static final int RULE_UNROLL=55;
    public static final int RULE_COMMA=43;
    public static final int RULE_EQUAL=44;
    public static final int RULE_COMMENT=13;
    public static final int RULE_RIGHT_FRENCH=16;
    public static final int RULE_LETTER=8;
    public static final int RULE_COLON=48;
    public static final int RULE_INTCONSTANT=10;
    public static final int RULE_STAR=18;
    public static final int RULE_EQEQ=26;
    public static final int RULE_VOID=60;
    public static final int RULE_RIGHT_BRACKET=40;
    public static final int RULE_NEQ=27;
    public static final int RULE_RIGHT_PAREN=38;
    public static final int RULE_LINE_COMMENT=14;
    public static final int RULE_RIGHT_BRACE=42;
    public static final int RULE_LEFT_BRACKET=39;
    public static final int RULE_SLASH=19;
    public static final int RULE_WS=12;
    public static final int RULE_XFIELD=7;
    public static final int RULE_DIGIT=9;
    public static final int RULE_IF=50;
    public static final int RULE_BREAK=57;
    public static final int RULE_ELSE=51;
    public static final int RULE_DASH=21;
    public static final int RULE_QUESTION=47;

    // delegates
    // delegators


        public InternalDecoraDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDecoraDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDecoraDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g"; }


     
     	private DecoraDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DecoraDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulefield_selection"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:60:1: entryRulefield_selection : rulefield_selection EOF ;
    public final void entryRulefield_selection() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:61:1: ( rulefield_selection EOF )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:62:1: rulefield_selection EOF
            {
             before(grammarAccess.getField_selectionRule()); 
            pushFollow(FOLLOW_rulefield_selection_in_entryRulefield_selection61);
            rulefield_selection();

            state._fsp--;

             after(grammarAccess.getField_selectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_selection68); 

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
    // $ANTLR end "entryRulefield_selection"


    // $ANTLR start "rulefield_selection"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:69:1: rulefield_selection : ( ( rule__Field_selection__Alternatives ) ) ;
    public final void rulefield_selection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:73:2: ( ( ( rule__Field_selection__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:74:1: ( ( rule__Field_selection__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:74:1: ( ( rule__Field_selection__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:75:1: ( rule__Field_selection__Alternatives )
            {
             before(grammarAccess.getField_selectionAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:76:1: ( rule__Field_selection__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:76:2: rule__Field_selection__Alternatives
            {
            pushFollow(FOLLOW_rule__Field_selection__Alternatives_in_rulefield_selection94);
            rule__Field_selection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getField_selectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefield_selection"


    // $ANTLR start "entryRuleRGBA_FIELDS"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:92:1: entryRuleRGBA_FIELDS : ruleRGBA_FIELDS EOF ;
    public final void entryRuleRGBA_FIELDS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:93:1: ( ruleRGBA_FIELDS EOF )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:94:1: ruleRGBA_FIELDS EOF
            {
             before(grammarAccess.getRGBA_FIELDSRule()); 
            pushFollow(FOLLOW_ruleRGBA_FIELDS_in_entryRuleRGBA_FIELDS125);
            ruleRGBA_FIELDS();

            state._fsp--;

             after(grammarAccess.getRGBA_FIELDSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGBA_FIELDS132); 

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
    // $ANTLR end "entryRuleRGBA_FIELDS"


    // $ANTLR start "ruleRGBA_FIELDS"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:101:1: ruleRGBA_FIELDS : ( ( rule__RGBA_FIELDS__Alternatives ) ) ;
    public final void ruleRGBA_FIELDS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:105:2: ( ( ( rule__RGBA_FIELDS__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:106:1: ( ( rule__RGBA_FIELDS__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:106:1: ( ( rule__RGBA_FIELDS__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:107:1: ( rule__RGBA_FIELDS__Alternatives )
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:108:1: ( rule__RGBA_FIELDS__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:108:2: rule__RGBA_FIELDS__Alternatives
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Alternatives_in_ruleRGBA_FIELDS158);
            rule__RGBA_FIELDS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRGBA_FIELDSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRGBA_FIELDS"


    // $ANTLR start "rule__Field_selection__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:122:1: rule__Field_selection__Alternatives : ( ( ( rule__Field_selection__RAssignment_0 ) ) | ( ( rule__Field_selection__XAssignment_1 ) ) );
    public final void rule__Field_selection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:126:1: ( ( ( rule__Field_selection__RAssignment_0 ) ) | ( ( rule__Field_selection__XAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_XYZW_FIELDS) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:127:1: ( ( rule__Field_selection__RAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:127:1: ( ( rule__Field_selection__RAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:128:1: ( rule__Field_selection__RAssignment_0 )
                    {
                     before(grammarAccess.getField_selectionAccess().getRAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:129:1: ( rule__Field_selection__RAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:129:2: rule__Field_selection__RAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field_selection__RAssignment_0_in_rule__Field_selection__Alternatives196);
                    rule__Field_selection__RAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_selectionAccess().getRAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:133:6: ( ( rule__Field_selection__XAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:133:6: ( ( rule__Field_selection__XAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:134:1: ( rule__Field_selection__XAssignment_1 )
                    {
                     before(grammarAccess.getField_selectionAccess().getXAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:135:1: ( rule__Field_selection__XAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:135:2: rule__Field_selection__XAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_selection__XAssignment_1_in_rule__Field_selection__Alternatives214);
                    rule__Field_selection__XAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_selectionAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Field_selection__Alternatives"


    // $ANTLR start "rule__RGBA_FIELDS__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:146:1: rule__RGBA_FIELDS__Alternatives : ( ( ( rule__RGBA_FIELDS__Group_0__0 ) ) | ( ( rule__RGBA_FIELDS__Group_1__0 ) ) | ( ( rule__RGBA_FIELDS__Group_2__0 ) ) | ( ( rule__RGBA_FIELDS__Group_3__0 ) ) );
    public final void rule__RGBA_FIELDS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:150:1: ( ( ( rule__RGBA_FIELDS__Group_0__0 ) ) | ( ( rule__RGBA_FIELDS__Group_1__0 ) ) | ( ( rule__RGBA_FIELDS__Group_2__0 ) ) | ( ( rule__RGBA_FIELDS__Group_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_RFIELD) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF) ) {
                        alt2=4;
                    }
                    else if ( (LA2_2==RULE_RFIELD) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==EOF) ) {
                            alt2=3;
                        }
                        else if ( (LA2_4==RULE_RFIELD) ) {
                            int LA2_6 = input.LA(5);

                            if ( (LA2_6==EOF) ) {
                                alt2=2;
                            }
                            else if ( (LA2_6==RULE_RFIELD) ) {
                                alt2=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:151:1: ( ( rule__RGBA_FIELDS__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:151:1: ( ( rule__RGBA_FIELDS__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:152:1: ( rule__RGBA_FIELDS__Group_0__0 )
                    {
                     before(grammarAccess.getRGBA_FIELDSAccess().getGroup_0()); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:153:1: ( rule__RGBA_FIELDS__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:153:2: rule__RGBA_FIELDS__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__0_in_rule__RGBA_FIELDS__Alternatives249);
                    rule__RGBA_FIELDS__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRGBA_FIELDSAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:157:6: ( ( rule__RGBA_FIELDS__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:157:6: ( ( rule__RGBA_FIELDS__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:158:1: ( rule__RGBA_FIELDS__Group_1__0 )
                    {
                     before(grammarAccess.getRGBA_FIELDSAccess().getGroup_1()); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:159:1: ( rule__RGBA_FIELDS__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:159:2: rule__RGBA_FIELDS__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__0_in_rule__RGBA_FIELDS__Alternatives267);
                    rule__RGBA_FIELDS__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRGBA_FIELDSAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:163:6: ( ( rule__RGBA_FIELDS__Group_2__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:163:6: ( ( rule__RGBA_FIELDS__Group_2__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:164:1: ( rule__RGBA_FIELDS__Group_2__0 )
                    {
                     before(grammarAccess.getRGBA_FIELDSAccess().getGroup_2()); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:165:1: ( rule__RGBA_FIELDS__Group_2__0 )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:165:2: rule__RGBA_FIELDS__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_2__0_in_rule__RGBA_FIELDS__Alternatives285);
                    rule__RGBA_FIELDS__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRGBA_FIELDSAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:169:6: ( ( rule__RGBA_FIELDS__Group_3__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:169:6: ( ( rule__RGBA_FIELDS__Group_3__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:170:1: ( rule__RGBA_FIELDS__Group_3__0 )
                    {
                     before(grammarAccess.getRGBA_FIELDSAccess().getGroup_3()); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:171:1: ( rule__RGBA_FIELDS__Group_3__0 )
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:171:2: rule__RGBA_FIELDS__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_3__0_in_rule__RGBA_FIELDS__Alternatives303);
                    rule__RGBA_FIELDS__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRGBA_FIELDSAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RGBA_FIELDS__Alternatives"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:183:1: rule__RGBA_FIELDS__Group_0__0 : rule__RGBA_FIELDS__Group_0__0__Impl rule__RGBA_FIELDS__Group_0__1 ;
    public final void rule__RGBA_FIELDS__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:187:1: ( rule__RGBA_FIELDS__Group_0__0__Impl rule__RGBA_FIELDS__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:188:2: rule__RGBA_FIELDS__Group_0__0__Impl rule__RGBA_FIELDS__Group_0__1
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__0__Impl_in_rule__RGBA_FIELDS__Group_0__0335);
            rule__RGBA_FIELDS__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__1_in_rule__RGBA_FIELDS__Group_0__0338);
            rule__RGBA_FIELDS__Group_0__1();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__0"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:195:1: rule__RGBA_FIELDS__Group_0__0__Impl : ( RULE_DOT ) ;
    public final void rule__RGBA_FIELDS__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:199:1: ( ( RULE_DOT ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:200:1: ( RULE_DOT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:200:1: ( RULE_DOT )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:201:1: RULE_DOT
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_0_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_0__0__Impl365); 
             after(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__0__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:212:1: rule__RGBA_FIELDS__Group_0__1 : rule__RGBA_FIELDS__Group_0__1__Impl rule__RGBA_FIELDS__Group_0__2 ;
    public final void rule__RGBA_FIELDS__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:216:1: ( rule__RGBA_FIELDS__Group_0__1__Impl rule__RGBA_FIELDS__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:217:2: rule__RGBA_FIELDS__Group_0__1__Impl rule__RGBA_FIELDS__Group_0__2
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__1__Impl_in_rule__RGBA_FIELDS__Group_0__1394);
            rule__RGBA_FIELDS__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__2_in_rule__RGBA_FIELDS__Group_0__1397);
            rule__RGBA_FIELDS__Group_0__2();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__1"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:224:1: rule__RGBA_FIELDS__Group_0__1__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:228:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:229:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:229:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:230:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_1()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__1__Impl424); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__1__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__2"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:241:1: rule__RGBA_FIELDS__Group_0__2 : rule__RGBA_FIELDS__Group_0__2__Impl rule__RGBA_FIELDS__Group_0__3 ;
    public final void rule__RGBA_FIELDS__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:245:1: ( rule__RGBA_FIELDS__Group_0__2__Impl rule__RGBA_FIELDS__Group_0__3 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:246:2: rule__RGBA_FIELDS__Group_0__2__Impl rule__RGBA_FIELDS__Group_0__3
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__2__Impl_in_rule__RGBA_FIELDS__Group_0__2453);
            rule__RGBA_FIELDS__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__3_in_rule__RGBA_FIELDS__Group_0__2456);
            rule__RGBA_FIELDS__Group_0__3();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__2"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:253:1: rule__RGBA_FIELDS__Group_0__2__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:257:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:258:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:258:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:259:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_2()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__2__Impl483); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__2__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__3"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:270:1: rule__RGBA_FIELDS__Group_0__3 : rule__RGBA_FIELDS__Group_0__3__Impl rule__RGBA_FIELDS__Group_0__4 ;
    public final void rule__RGBA_FIELDS__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:274:1: ( rule__RGBA_FIELDS__Group_0__3__Impl rule__RGBA_FIELDS__Group_0__4 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:275:2: rule__RGBA_FIELDS__Group_0__3__Impl rule__RGBA_FIELDS__Group_0__4
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__3__Impl_in_rule__RGBA_FIELDS__Group_0__3512);
            rule__RGBA_FIELDS__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__4_in_rule__RGBA_FIELDS__Group_0__3515);
            rule__RGBA_FIELDS__Group_0__4();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__3"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:282:1: rule__RGBA_FIELDS__Group_0__3__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:286:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:287:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:287:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:288:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_3()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__3__Impl542); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__3__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__4"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:299:1: rule__RGBA_FIELDS__Group_0__4 : rule__RGBA_FIELDS__Group_0__4__Impl ;
    public final void rule__RGBA_FIELDS__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:303:1: ( rule__RGBA_FIELDS__Group_0__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:304:2: rule__RGBA_FIELDS__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_0__4__Impl_in_rule__RGBA_FIELDS__Group_0__4571);
            rule__RGBA_FIELDS__Group_0__4__Impl();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__4"


    // $ANTLR start "rule__RGBA_FIELDS__Group_0__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:310:1: rule__RGBA_FIELDS__Group_0__4__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:314:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:315:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:315:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:316:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_4()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__4__Impl598); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_0__4__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:337:1: rule__RGBA_FIELDS__Group_1__0 : rule__RGBA_FIELDS__Group_1__0__Impl rule__RGBA_FIELDS__Group_1__1 ;
    public final void rule__RGBA_FIELDS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:341:1: ( rule__RGBA_FIELDS__Group_1__0__Impl rule__RGBA_FIELDS__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:342:2: rule__RGBA_FIELDS__Group_1__0__Impl rule__RGBA_FIELDS__Group_1__1
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__0__Impl_in_rule__RGBA_FIELDS__Group_1__0637);
            rule__RGBA_FIELDS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__1_in_rule__RGBA_FIELDS__Group_1__0640);
            rule__RGBA_FIELDS__Group_1__1();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__0"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:349:1: rule__RGBA_FIELDS__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__RGBA_FIELDS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:353:1: ( ( RULE_DOT ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:354:1: ( RULE_DOT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:354:1: ( RULE_DOT )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:355:1: RULE_DOT
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_1_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_1__0__Impl667); 
             after(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__0__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:366:1: rule__RGBA_FIELDS__Group_1__1 : rule__RGBA_FIELDS__Group_1__1__Impl rule__RGBA_FIELDS__Group_1__2 ;
    public final void rule__RGBA_FIELDS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:370:1: ( rule__RGBA_FIELDS__Group_1__1__Impl rule__RGBA_FIELDS__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:371:2: rule__RGBA_FIELDS__Group_1__1__Impl rule__RGBA_FIELDS__Group_1__2
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__1__Impl_in_rule__RGBA_FIELDS__Group_1__1696);
            rule__RGBA_FIELDS__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__2_in_rule__RGBA_FIELDS__Group_1__1699);
            rule__RGBA_FIELDS__Group_1__2();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__1"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:378:1: rule__RGBA_FIELDS__Group_1__1__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:382:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:383:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:383:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:384:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_1()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_1__1__Impl726); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__1__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:395:1: rule__RGBA_FIELDS__Group_1__2 : rule__RGBA_FIELDS__Group_1__2__Impl rule__RGBA_FIELDS__Group_1__3 ;
    public final void rule__RGBA_FIELDS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:399:1: ( rule__RGBA_FIELDS__Group_1__2__Impl rule__RGBA_FIELDS__Group_1__3 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:400:2: rule__RGBA_FIELDS__Group_1__2__Impl rule__RGBA_FIELDS__Group_1__3
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__2__Impl_in_rule__RGBA_FIELDS__Group_1__2755);
            rule__RGBA_FIELDS__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__3_in_rule__RGBA_FIELDS__Group_1__2758);
            rule__RGBA_FIELDS__Group_1__3();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__2"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:407:1: rule__RGBA_FIELDS__Group_1__2__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:411:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:412:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:412:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:413:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_2()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_1__2__Impl785); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__2__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__3"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:424:1: rule__RGBA_FIELDS__Group_1__3 : rule__RGBA_FIELDS__Group_1__3__Impl ;
    public final void rule__RGBA_FIELDS__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:428:1: ( rule__RGBA_FIELDS__Group_1__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:429:2: rule__RGBA_FIELDS__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_1__3__Impl_in_rule__RGBA_FIELDS__Group_1__3814);
            rule__RGBA_FIELDS__Group_1__3__Impl();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__3"


    // $ANTLR start "rule__RGBA_FIELDS__Group_1__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:435:1: rule__RGBA_FIELDS__Group_1__3__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:439:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:440:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:440:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:441:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_3()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_1__3__Impl841); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_1__3__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_2__0"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:460:1: rule__RGBA_FIELDS__Group_2__0 : rule__RGBA_FIELDS__Group_2__0__Impl rule__RGBA_FIELDS__Group_2__1 ;
    public final void rule__RGBA_FIELDS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:464:1: ( rule__RGBA_FIELDS__Group_2__0__Impl rule__RGBA_FIELDS__Group_2__1 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:465:2: rule__RGBA_FIELDS__Group_2__0__Impl rule__RGBA_FIELDS__Group_2__1
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_2__0__Impl_in_rule__RGBA_FIELDS__Group_2__0878);
            rule__RGBA_FIELDS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_2__1_in_rule__RGBA_FIELDS__Group_2__0881);
            rule__RGBA_FIELDS__Group_2__1();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_2__0"


    // $ANTLR start "rule__RGBA_FIELDS__Group_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:472:1: rule__RGBA_FIELDS__Group_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__RGBA_FIELDS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:476:1: ( ( RULE_DOT ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:477:1: ( RULE_DOT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:477:1: ( RULE_DOT )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:478:1: RULE_DOT
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_2_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_2__0__Impl908); 
             after(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_2__0__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_2__1"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:489:1: rule__RGBA_FIELDS__Group_2__1 : rule__RGBA_FIELDS__Group_2__1__Impl rule__RGBA_FIELDS__Group_2__2 ;
    public final void rule__RGBA_FIELDS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:493:1: ( rule__RGBA_FIELDS__Group_2__1__Impl rule__RGBA_FIELDS__Group_2__2 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:494:2: rule__RGBA_FIELDS__Group_2__1__Impl rule__RGBA_FIELDS__Group_2__2
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_2__1__Impl_in_rule__RGBA_FIELDS__Group_2__1937);
            rule__RGBA_FIELDS__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_2__2_in_rule__RGBA_FIELDS__Group_2__1940);
            rule__RGBA_FIELDS__Group_2__2();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_2__1"


    // $ANTLR start "rule__RGBA_FIELDS__Group_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:501:1: rule__RGBA_FIELDS__Group_2__1__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:505:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:506:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:506:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:507:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_1()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_2__1__Impl967); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_2__1__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_2__2"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:518:1: rule__RGBA_FIELDS__Group_2__2 : rule__RGBA_FIELDS__Group_2__2__Impl ;
    public final void rule__RGBA_FIELDS__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:522:1: ( rule__RGBA_FIELDS__Group_2__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:523:2: rule__RGBA_FIELDS__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_2__2__Impl_in_rule__RGBA_FIELDS__Group_2__2996);
            rule__RGBA_FIELDS__Group_2__2__Impl();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_2__2"


    // $ANTLR start "rule__RGBA_FIELDS__Group_2__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:529:1: rule__RGBA_FIELDS__Group_2__2__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:533:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:534:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:534:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:535:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_2()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_2__2__Impl1023); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_2__2__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:552:1: rule__RGBA_FIELDS__Group_3__0 : rule__RGBA_FIELDS__Group_3__0__Impl rule__RGBA_FIELDS__Group_3__1 ;
    public final void rule__RGBA_FIELDS__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:556:1: ( rule__RGBA_FIELDS__Group_3__0__Impl rule__RGBA_FIELDS__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:557:2: rule__RGBA_FIELDS__Group_3__0__Impl rule__RGBA_FIELDS__Group_3__1
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_3__0__Impl_in_rule__RGBA_FIELDS__Group_3__01058);
            rule__RGBA_FIELDS__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_3__1_in_rule__RGBA_FIELDS__Group_3__01061);
            rule__RGBA_FIELDS__Group_3__1();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_3__0"


    // $ANTLR start "rule__RGBA_FIELDS__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:564:1: rule__RGBA_FIELDS__Group_3__0__Impl : ( RULE_DOT ) ;
    public final void rule__RGBA_FIELDS__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:568:1: ( ( RULE_DOT ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:569:1: ( RULE_DOT )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:569:1: ( RULE_DOT )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:570:1: RULE_DOT
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_3_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_3__0__Impl1088); 
             after(grammarAccess.getRGBA_FIELDSAccess().getDOTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_3__0__Impl"


    // $ANTLR start "rule__RGBA_FIELDS__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:581:1: rule__RGBA_FIELDS__Group_3__1 : rule__RGBA_FIELDS__Group_3__1__Impl ;
    public final void rule__RGBA_FIELDS__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:585:1: ( rule__RGBA_FIELDS__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:586:2: rule__RGBA_FIELDS__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RGBA_FIELDS__Group_3__1__Impl_in_rule__RGBA_FIELDS__Group_3__11117);
            rule__RGBA_FIELDS__Group_3__1__Impl();

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
    // $ANTLR end "rule__RGBA_FIELDS__Group_3__1"


    // $ANTLR start "rule__RGBA_FIELDS__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:592:1: rule__RGBA_FIELDS__Group_3__1__Impl : ( RULE_RFIELD ) ;
    public final void rule__RGBA_FIELDS__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:596:1: ( ( RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:597:1: ( RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:597:1: ( RULE_RFIELD )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:598:1: RULE_RFIELD
            {
             before(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_3_1()); 
            match(input,RULE_RFIELD,FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_3__1__Impl1144); 
             after(grammarAccess.getRGBA_FIELDSAccess().getRFIELDTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGBA_FIELDS__Group_3__1__Impl"


    // $ANTLR start "rule__Field_selection__RAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:615:1: rule__Field_selection__RAssignment_0 : ( ruleRGBA_FIELDS ) ;
    public final void rule__Field_selection__RAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:619:1: ( ( ruleRGBA_FIELDS ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:620:1: ( ruleRGBA_FIELDS )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:620:1: ( ruleRGBA_FIELDS )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:621:1: ruleRGBA_FIELDS
            {
             before(grammarAccess.getField_selectionAccess().getRRGBA_FIELDSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRGBA_FIELDS_in_rule__Field_selection__RAssignment_01183);
            ruleRGBA_FIELDS();

            state._fsp--;

             after(grammarAccess.getField_selectionAccess().getRRGBA_FIELDSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_selection__RAssignment_0"


    // $ANTLR start "rule__Field_selection__XAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:630:1: rule__Field_selection__XAssignment_1 : ( RULE_XYZW_FIELDS ) ;
    public final void rule__Field_selection__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:634:1: ( ( RULE_XYZW_FIELDS ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:635:1: ( RULE_XYZW_FIELDS )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:635:1: ( RULE_XYZW_FIELDS )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:636:1: RULE_XYZW_FIELDS
            {
             before(grammarAccess.getField_selectionAccess().getXXYZW_FIELDSTerminalRuleCall_1_0()); 
            match(input,RULE_XYZW_FIELDS,FOLLOW_RULE_XYZW_FIELDS_in_rule__Field_selection__XAssignment_11214); 
             after(grammarAccess.getField_selectionAccess().getXXYZW_FIELDSTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_selection__XAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulefield_selection_in_entryRulefield_selection61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_selection68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_selection__Alternatives_in_rulefield_selection94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBA_FIELDS_in_entryRuleRGBA_FIELDS125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGBA_FIELDS132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Alternatives_in_ruleRGBA_FIELDS158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_selection__RAssignment_0_in_rule__Field_selection__Alternatives196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_selection__XAssignment_1_in_rule__Field_selection__Alternatives214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__0_in_rule__RGBA_FIELDS__Alternatives249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__0_in_rule__RGBA_FIELDS__Alternatives267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_2__0_in_rule__RGBA_FIELDS__Alternatives285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_3__0_in_rule__RGBA_FIELDS__Alternatives303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__0__Impl_in_rule__RGBA_FIELDS__Group_0__0335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__1_in_rule__RGBA_FIELDS__Group_0__0338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_0__0__Impl365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__1__Impl_in_rule__RGBA_FIELDS__Group_0__1394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__2_in_rule__RGBA_FIELDS__Group_0__1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__1__Impl424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__2__Impl_in_rule__RGBA_FIELDS__Group_0__2453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__3_in_rule__RGBA_FIELDS__Group_0__2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__2__Impl483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__3__Impl_in_rule__RGBA_FIELDS__Group_0__3512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__4_in_rule__RGBA_FIELDS__Group_0__3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__3__Impl542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_0__4__Impl_in_rule__RGBA_FIELDS__Group_0__4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_0__4__Impl598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__0__Impl_in_rule__RGBA_FIELDS__Group_1__0637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__1_in_rule__RGBA_FIELDS__Group_1__0640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_1__0__Impl667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__1__Impl_in_rule__RGBA_FIELDS__Group_1__1696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__2_in_rule__RGBA_FIELDS__Group_1__1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_1__1__Impl726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__2__Impl_in_rule__RGBA_FIELDS__Group_1__2755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__3_in_rule__RGBA_FIELDS__Group_1__2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_1__2__Impl785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_1__3__Impl_in_rule__RGBA_FIELDS__Group_1__3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_1__3__Impl841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_2__0__Impl_in_rule__RGBA_FIELDS__Group_2__0878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_2__1_in_rule__RGBA_FIELDS__Group_2__0881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_2__0__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_2__1__Impl_in_rule__RGBA_FIELDS__Group_2__1937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_2__2_in_rule__RGBA_FIELDS__Group_2__1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_2__1__Impl967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_2__2__Impl_in_rule__RGBA_FIELDS__Group_2__2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_2__2__Impl1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_3__0__Impl_in_rule__RGBA_FIELDS__Group_3__01058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_3__1_in_rule__RGBA_FIELDS__Group_3__01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__RGBA_FIELDS__Group_3__0__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBA_FIELDS__Group_3__1__Impl_in_rule__RGBA_FIELDS__Group_3__11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RFIELD_in_rule__RGBA_FIELDS__Group_3__1__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBA_FIELDS_in_rule__Field_selection__RAssignment_01183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XYZW_FIELDS_in_rule__Field_selection__XAssignment_11214 = new BitSet(new long[]{0x0000000000000002L});

}