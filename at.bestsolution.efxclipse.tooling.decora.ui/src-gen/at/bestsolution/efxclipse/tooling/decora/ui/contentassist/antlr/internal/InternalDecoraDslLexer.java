package at.bestsolution.efxclipse.tooling.decora.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDecoraDslLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_XYZW_FIELDS=52;
    public static final int RULE_TILDE=57;
    public static final int RULE_LTEQ=27;
    public static final int T__67=67;
    public static final int T__65=65;
    public static final int RULE_DISCARD=49;
    public static final int RULE_DO=44;
    public static final int RULE_SEMICOLON=38;
    public static final int RULE_PLUSEQ=11;
    public static final int RULE_RETURN=50;
    public static final int RULE_OR=35;
    public static final int RULE_FOR=45;
    public static final int RULE_AND=33;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=54;
    public static final int RULE_LT=29;
    public static final int RULE_DASHEQ=12;
    public static final int RULE_WHILE=43;
    public static final int RULE_GTEQ=28;
    public static final int RULE_DOT=56;
    public static final int RULE_RGBA_FIELDS=51;
    public static final int RULE_LEFT_PAREN=15;
    public static final int RULE_GT=30;
    public static final int RULE_RFIELD=58;
    public static final int RULE_SLASHEQ=10;
    public static final int RULE_INC=19;
    public static final int RULE_T_GLUE_BLOCK=53;
    public static final int RULE_STAREQ=9;
    public static final int RULE_FLOATCONSTANT=6;
    public static final int RULE_LEFT_BRACE=39;
    public static final int RULE_BANG=24;
    public static final int RULE_DEC=20;
    public static final int RULE_CONTINUE=47;
    public static final int RULE_XOR=34;
    public static final int RULE_PLUS=22;
    public static final int RULE_UNROLL=46;
    public static final int RULE_COMMA=21;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_EQUAL=8;
    public static final int RULE_COMMENT=63;
    public static final int RULE_RIGHT_FRENCH=55;
    public static final int RULE_LETTER=60;
    public static final int RULE_COLON=37;
    public static final int RULE_INTCONSTANT=5;
    public static final int RULE_TYPE=13;
    public static final int RULE_STAR=25;
    public static final int RULE_EQEQ=31;
    public static final int RULE_RIGHT_BRACKET=18;
    public static final int RULE_VOID=14;
    public static final int RULE_BOOLCONSTANT=7;
    public static final int RULE_NEQ=32;
    public static final int RULE_RIGHT_PAREN=16;
    public static final int RULE_RIGHT_BRACE=40;
    public static final int RULE_LINE_COMMENT=64;
    public static final int RULE_LEFT_BRACKET=17;
    public static final int RULE_SLASH=26;
    public static final int RULE_XFIELD=59;
    public static final int RULE_WS=62;
    public static final int RULE_DIGIT=61;
    public static final int RULE_IF=41;
    public static final int RULE_ELSE=42;
    public static final int RULE_BREAK=48;
    public static final int RULE_DASH=23;
    public static final int RULE_QUESTION=36;

    // delegates
    // delegators

    public InternalDecoraDslLexer() {;} 
    public InternalDecoraDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDecoraDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g"; }

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:11:7: ( 'const' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:11:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:12:7: ( 'param' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:12:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:13:7: ( 'lowp' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:13:9: 'lowp'
            {
            match("lowp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:14:7: ( 'mediump' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:14:9: 'mediump'
            {
            match("mediump"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:15:7: ( 'highp' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:15:9: 'highp'
            {
            match("highp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:11: ( ( 'float2' | 'float3' | 'float4' | 'float' | 'int2' | 'int3' | 'int4' | 'int' | 'bool2' | 'bool3' | 'bool4' | 'bool' | 'sampler' | 'lsampler' | 'fsampler' ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:13: ( 'float2' | 'float3' | 'float4' | 'float' | 'int2' | 'int3' | 'int4' | 'int' | 'bool2' | 'bool3' | 'bool4' | 'bool' | 'sampler' | 'lsampler' | 'fsampler' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:13: ( 'float2' | 'float3' | 'float4' | 'float' | 'int2' | 'int3' | 'int4' | 'int' | 'bool2' | 'bool3' | 'bool4' | 'bool' | 'sampler' | 'lsampler' | 'fsampler' )
            int alt1=15;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:14: 'float2'
                    {
                    match("float2"); 


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:23: 'float3'
                    {
                    match("float3"); 


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:32: 'float4'
                    {
                    match("float4"); 


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:41: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:49: 'int2'
                    {
                    match("int2"); 


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:56: 'int3'
                    {
                    match("int3"); 


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:63: 'int4'
                    {
                    match("int4"); 


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:70: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:76: 'bool2'
                    {
                    match("bool2"); 


                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:84: 'bool3'
                    {
                    match("bool3"); 


                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:92: 'bool4'
                    {
                    match("bool4"); 


                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:100: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:107: 'sampler'
                    {
                    match("sampler"); 


                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:117: 'lsampler'
                    {
                    match("lsampler"); 


                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10342:128: 'fsampler'
                    {
                    match("fsampler"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_BOOLCONSTANT"
    public final void mRULE_BOOLCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_BOOLCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10344:19: ( ( 'true' | 'false' ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10344:21: ( 'true' | 'false' )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10344:21: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10344:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10344:29: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLCONSTANT"

    // $ANTLR start "RULE_STAR"
    public final void mRULE_STAR() throws RecognitionException {
        try {
            int _type = RULE_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10346:11: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10346:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STAR"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10348:12: ( '/' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10348:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10350:11: ( '+' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10350:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10352:11: ( '-' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10352:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10354:9: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10354:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10356:9: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10356:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_LTEQ"
    public final void mRULE_LTEQ() throws RecognitionException {
        try {
            int _type = RULE_LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10358:11: ( '<=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10358:13: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LTEQ"

    // $ANTLR start "RULE_GTEQ"
    public final void mRULE_GTEQ() throws RecognitionException {
        try {
            int _type = RULE_GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10360:11: ( '>=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10360:13: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GTEQ"

    // $ANTLR start "RULE_EQEQ"
    public final void mRULE_EQEQ() throws RecognitionException {
        try {
            int _type = RULE_EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10362:11: ( '==' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10362:13: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQEQ"

    // $ANTLR start "RULE_NEQ"
    public final void mRULE_NEQ() throws RecognitionException {
        try {
            int _type = RULE_NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10364:10: ( '!=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10364:12: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEQ"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10366:10: ( '&&' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10366:12: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_XOR"
    public final void mRULE_XOR() throws RecognitionException {
        try {
            int _type = RULE_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10368:10: ( '^^' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10368:12: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10370:9: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10370:11: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_INC"
    public final void mRULE_INC() throws RecognitionException {
        try {
            int _type = RULE_INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10372:10: ( '++' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10372:12: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INC"

    // $ANTLR start "RULE_DEC"
    public final void mRULE_DEC() throws RecognitionException {
        try {
            int _type = RULE_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10374:10: ( '--' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10374:12: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC"

    // $ANTLR start "RULE_STAREQ"
    public final void mRULE_STAREQ() throws RecognitionException {
        try {
            int _type = RULE_STAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10376:13: ( '*=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10376:15: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STAREQ"

    // $ANTLR start "RULE_SLASHEQ"
    public final void mRULE_SLASHEQ() throws RecognitionException {
        try {
            int _type = RULE_SLASHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10378:14: ( '/=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10378:16: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASHEQ"

    // $ANTLR start "RULE_PLUSEQ"
    public final void mRULE_PLUSEQ() throws RecognitionException {
        try {
            int _type = RULE_PLUSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10380:13: ( '+=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10380:15: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUSEQ"

    // $ANTLR start "RULE_DASHEQ"
    public final void mRULE_DASHEQ() throws RecognitionException {
        try {
            int _type = RULE_DASHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10382:13: ( '-=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10382:15: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASHEQ"

    // $ANTLR start "RULE_LEFT_PAREN"
    public final void mRULE_LEFT_PAREN() throws RecognitionException {
        try {
            int _type = RULE_LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10384:17: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10384:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_PAREN"

    // $ANTLR start "RULE_RIGHT_PAREN"
    public final void mRULE_RIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10386:18: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10386:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_PAREN"

    // $ANTLR start "RULE_LEFT_BRACKET"
    public final void mRULE_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10388:19: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10388:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACKET"

    // $ANTLR start "RULE_RIGHT_BRACKET"
    public final void mRULE_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10390:20: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10390:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACKET"

    // $ANTLR start "RULE_LEFT_BRACE"
    public final void mRULE_LEFT_BRACE() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10392:17: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10392:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACE"

    // $ANTLR start "RULE_RIGHT_BRACE"
    public final void mRULE_RIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10394:18: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10394:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACE"

    // $ANTLR start "RULE_LEFT_FRENCH"
    public final void mRULE_LEFT_FRENCH() throws RecognitionException {
        try {
            int _type = RULE_LEFT_FRENCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10396:18: ( '<<' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10396:20: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_FRENCH"

    // $ANTLR start "RULE_RIGHT_FRENCH"
    public final void mRULE_RIGHT_FRENCH() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_FRENCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10398:19: ( '>>' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10398:21: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_FRENCH"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10400:10: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10400:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10402:12: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10402:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10404:12: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10404:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_BANG"
    public final void mRULE_BANG() throws RecognitionException {
        try {
            int _type = RULE_BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10406:11: ( '!' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10406:13: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BANG"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10408:12: ( '~' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10408:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_QUESTION"
    public final void mRULE_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10410:15: ( '?' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10410:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10412:12: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10412:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10414:16: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10414:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10416:9: ( 'if' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10416:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10418:11: ( 'else' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10418:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10420:12: ( 'while' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10420:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10422:9: ( 'do' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10422:11: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10424:10: ( 'for' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10424:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_UNROLL"
    public final void mRULE_UNROLL() throws RecognitionException {
        try {
            int _type = RULE_UNROLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10426:13: ( 'unroll' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10426:15: 'unroll'
            {
            match("unroll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNROLL"

    // $ANTLR start "RULE_CONTINUE"
    public final void mRULE_CONTINUE() throws RecognitionException {
        try {
            int _type = RULE_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10428:15: ( 'continue' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10428:17: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTINUE"

    // $ANTLR start "RULE_BREAK"
    public final void mRULE_BREAK() throws RecognitionException {
        try {
            int _type = RULE_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10430:12: ( 'break' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10430:14: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BREAK"

    // $ANTLR start "RULE_DISCARD"
    public final void mRULE_DISCARD() throws RecognitionException {
        try {
            int _type = RULE_DISCARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10432:14: ( 'discard' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10432:16: 'discard'
            {
            match("discard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISCARD"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10434:13: ( 'return' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10434:15: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_VOID"
    public final void mRULE_VOID() throws RecognitionException {
        try {
            int _type = RULE_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10436:11: ( 'void' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10436:13: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOID"

    // $ANTLR start "RULE_RGBA_FIELDS"
    public final void mRULE_RGBA_FIELDS() throws RecognitionException {
        try {
            int _type = RULE_RGBA_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:18: ( ( RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:20: ( RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:20: ( RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD RULE_RFIELD | RULE_DOT RULE_RFIELD )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='a' && LA3_1<='b')||LA3_1=='g'||LA3_1=='r') ) {
                    int LA3_2 = input.LA(3);

                    if ( ((LA3_2>='a' && LA3_2<='b')||LA3_2=='g'||LA3_2=='r') ) {
                        int LA3_4 = input.LA(4);

                        if ( ((LA3_4>='a' && LA3_4<='b')||LA3_4=='g'||LA3_4=='r') ) {
                            int LA3_6 = input.LA(5);

                            if ( ((LA3_6>='a' && LA3_6<='b')||LA3_6=='g'||LA3_6=='r') ) {
                                alt3=1;
                            }
                            else {
                                alt3=2;}
                        }
                        else {
                            alt3=3;}
                    }
                    else {
                        alt3=4;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:21: RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD RULE_RFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_RFIELD(); 
                    mRULE_RFIELD(); 
                    mRULE_RFIELD(); 
                    mRULE_RFIELD(); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:78: RULE_DOT RULE_RFIELD RULE_RFIELD RULE_RFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_RFIELD(); 
                    mRULE_RFIELD(); 
                    mRULE_RFIELD(); 

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:123: RULE_DOT RULE_RFIELD RULE_RFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_RFIELD(); 
                    mRULE_RFIELD(); 

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10438:156: RULE_DOT RULE_RFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_RFIELD(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RGBA_FIELDS"

    // $ANTLR start "RULE_RFIELD"
    public final void mRULE_RFIELD() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10440:22: ( ( 'r' | 'g' | 'b' | 'a' ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10440:24: ( 'r' | 'g' | 'b' | 'a' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='g'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RFIELD"

    // $ANTLR start "RULE_XYZW_FIELDS"
    public final void mRULE_XYZW_FIELDS() throws RecognitionException {
        try {
            int _type = RULE_XYZW_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:18: ( ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:20: ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:20: ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='w' && LA4_1<='z')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2>='w' && LA4_2<='z')) ) {
                        int LA4_4 = input.LA(4);

                        if ( ((LA4_4>='w' && LA4_4<='z')) ) {
                            int LA4_6 = input.LA(5);

                            if ( ((LA4_6>='w' && LA4_6<='z')) ) {
                                alt4=1;
                            }
                            else {
                                alt4=2;}
                        }
                        else {
                            alt4=3;}
                    }
                    else {
                        alt4=4;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:21: RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:78: RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:123: RULE_DOT RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10442:156: RULE_DOT RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XYZW_FIELDS"

    // $ANTLR start "RULE_XFIELD"
    public final void mRULE_XFIELD() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10444:22: ( ( 'x' | 'y' | 'z' | 'w' ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10444:24: ( 'x' | 'y' | 'z' | 'w' )
            {
            if ( (input.LA(1)>='w' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_XFIELD"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10446:17: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10446:19: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10446:31: ( RULE_LETTER | RULE_DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10448:22: ( ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10448:24: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10450:21: ( '0' .. '9' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10450:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_INTCONSTANT"
    public final void mRULE_INTCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_INTCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:18: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:20: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:20: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:21: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:25: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:34: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10452:34: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTCONSTANT"

    // $ANTLR start "RULE_FLOATCONSTANT"
    public final void mRULE_FLOATCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_FLOATCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:20: ( ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:22: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:22: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='.') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:23: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:23: ( RULE_DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:23: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:39: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:39: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:51: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:55: ( RULE_DIGIT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10454:55: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATCONSTANT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10456:9: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10456:11: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10458:14: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10458:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10458:21: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10458:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10460:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10460:21: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10460:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10460:26: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10460:42: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10460:42: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT"

    // $ANTLR start "RULE_T_GLUE_BLOCK"
    public final void mRULE_T_GLUE_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_T_GLUE_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10462:19: ( RULE_LEFT_FRENCH ( . )* RULE_RIGHT_FRENCH )
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10462:21: RULE_LEFT_FRENCH ( . )* RULE_RIGHT_FRENCH
            {
            mRULE_LEFT_FRENCH(); 
            // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10462:38: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='>') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='>') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='=')||(LA15_1>='?' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='=')||(LA15_0>='?' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:10462:38: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            mRULE_RIGHT_FRENCH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_GLUE_BLOCK"

    public void mTokens() throws RecognitionException {
        // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | RULE_TYPE | RULE_BOOLCONSTANT | RULE_STAR | RULE_SLASH | RULE_PLUS | RULE_DASH | RULE_LT | RULE_GT | RULE_LTEQ | RULE_GTEQ | RULE_EQEQ | RULE_NEQ | RULE_AND | RULE_XOR | RULE_OR | RULE_INC | RULE_DEC | RULE_STAREQ | RULE_SLASHEQ | RULE_PLUSEQ | RULE_DASHEQ | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_LEFT_FRENCH | RULE_RIGHT_FRENCH | RULE_DOT | RULE_COMMA | RULE_EQUAL | RULE_BANG | RULE_TILDE | RULE_QUESTION | RULE_COLON | RULE_SEMICOLON | RULE_IF | RULE_ELSE | RULE_WHILE | RULE_DO | RULE_FOR | RULE_UNROLL | RULE_CONTINUE | RULE_BREAK | RULE_DISCARD | RULE_RETURN | RULE_VOID | RULE_RGBA_FIELDS | RULE_XYZW_FIELDS | RULE_IDENTIFIER | RULE_INTCONSTANT | RULE_FLOATCONSTANT | RULE_WS | RULE_COMMENT | RULE_LINE_COMMENT | RULE_T_GLUE_BLOCK )
        int alt16=62;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:10: T__65
                {
                mT__65(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:16: T__66
                {
                mT__66(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:22: T__67
                {
                mT__67(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:28: T__68
                {
                mT__68(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:34: T__69
                {
                mT__69(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:40: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:50: RULE_BOOLCONSTANT
                {
                mRULE_BOOLCONSTANT(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:68: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:78: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:89: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:99: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:109: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:117: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:125: RULE_LTEQ
                {
                mRULE_LTEQ(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:135: RULE_GTEQ
                {
                mRULE_GTEQ(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:145: RULE_EQEQ
                {
                mRULE_EQEQ(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:155: RULE_NEQ
                {
                mRULE_NEQ(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:164: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:173: RULE_XOR
                {
                mRULE_XOR(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:182: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:190: RULE_INC
                {
                mRULE_INC(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:199: RULE_DEC
                {
                mRULE_DEC(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:208: RULE_STAREQ
                {
                mRULE_STAREQ(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:220: RULE_SLASHEQ
                {
                mRULE_SLASHEQ(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:233: RULE_PLUSEQ
                {
                mRULE_PLUSEQ(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:245: RULE_DASHEQ
                {
                mRULE_DASHEQ(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:257: RULE_LEFT_PAREN
                {
                mRULE_LEFT_PAREN(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:273: RULE_RIGHT_PAREN
                {
                mRULE_RIGHT_PAREN(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:290: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:308: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:327: RULE_LEFT_BRACE
                {
                mRULE_LEFT_BRACE(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:343: RULE_RIGHT_BRACE
                {
                mRULE_RIGHT_BRACE(); 

                }
                break;
            case 33 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:360: RULE_LEFT_FRENCH
                {
                mRULE_LEFT_FRENCH(); 

                }
                break;
            case 34 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:377: RULE_RIGHT_FRENCH
                {
                mRULE_RIGHT_FRENCH(); 

                }
                break;
            case 35 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:395: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 36 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:404: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 37 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:415: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 38 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:426: RULE_BANG
                {
                mRULE_BANG(); 

                }
                break;
            case 39 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:436: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 40 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:447: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 41 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:461: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 42 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:472: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 43 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:487: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 44 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:495: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 45 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:505: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 46 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:516: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 47 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:524: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 48 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:533: RULE_UNROLL
                {
                mRULE_UNROLL(); 

                }
                break;
            case 49 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:545: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 50 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:559: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 51 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:570: RULE_DISCARD
                {
                mRULE_DISCARD(); 

                }
                break;
            case 52 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:583: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 53 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:595: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;
            case 54 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:605: RULE_RGBA_FIELDS
                {
                mRULE_RGBA_FIELDS(); 

                }
                break;
            case 55 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:622: RULE_XYZW_FIELDS
                {
                mRULE_XYZW_FIELDS(); 

                }
                break;
            case 56 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:639: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 57 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:655: RULE_INTCONSTANT
                {
                mRULE_INTCONSTANT(); 

                }
                break;
            case 58 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:672: RULE_FLOATCONSTANT
                {
                mRULE_FLOATCONSTANT(); 

                }
                break;
            case 59 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:691: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:699: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 61 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:712: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 62 :
                // ../at.bestsolution.efxclipse.tooling.decora.ui/src-gen/at/bestsolution/efxclipse/tooling/decora/ui/contentassist/antlr/internal/InternalDecoraDsl.g:1:730: RULE_T_GLUE_BLOCK
                {
                mRULE_T_GLUE_BLOCK(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\13\uffff\1\21\6\uffff\1\27\1\33\10\uffff";
    static final String DFA1_eofS =
        "\34\uffff";
    static final String DFA1_minS =
        "\1\142\1\154\1\156\1\157\2\uffff\1\157\1\uffff\1\164\1\157\1\141"+
        "\1\62\1\154\1\164\4\uffff\2\62\10\uffff";
    static final String DFA1_maxS =
        "\2\163\1\156\1\157\2\uffff\1\157\1\uffff\1\164\1\157\1\141\1\64"+
        "\1\154\1\164\4\uffff\2\64\10\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\15\1\16\1\uffff\1\17\6\uffff\1\5\1\6\1\7\1\10\2\uffff"+
        "\1\11\1\12\1\13\1\14\1\1\1\2\1\3\1\4";
    static final String DFA1_specialS =
        "\34\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\3\uffff\1\1\2\uffff\1\2\2\uffff\1\5\6\uffff\1\4",
            "\1\6\6\uffff\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\17\1\20",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "",
            "\1\24\1\25\1\26",
            "\1\30\1\31\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "10342:13: ( 'float2' | 'float3' | 'float4' | 'float' | 'int2' | 'int3' | 'int4' | 'int' | 'bool2' | 'bool3' | 'bool4' | 'bool' | 'sampler' | 'lsampler' | 'fsampler' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\12\50\1\75\1\101\1\104\1\107\1\112\1\115\1\117\1\121\11"+
        "\uffff\1\122\5\uffff\6\50\1\uffff\2\135\1\uffff\13\50\1\152\4\50"+
        "\15\uffff\1\157\14\uffff\2\50\1\163\4\50\1\uffff\1\135\11\50\1\u0082"+
        "\1\u0086\1\uffff\4\50\2\uffff\2\50\1\uffff\7\50\1\u0094\6\50\1\uffff"+
        "\3\u0086\1\uffff\1\u0086\2\50\1\u00a0\1\u00a1\4\50\1\u00a6\1\u00a7"+
        "\1\50\1\u00a9\1\uffff\2\50\1\u00ac\1\u0086\1\50\1\u00a0\3\u0086"+
        "\1\u00b1\1\50\2\uffff\1\u00b3\3\50\2\uffff\1\50\1\uffff\2\50\1\uffff"+
        "\3\u0086\1\50\1\uffff\1\50\1\uffff\1\50\1\u00bd\1\u00be\2\50\1\u00c1"+
        "\1\50\1\u0086\1\u00c3\2\uffff\1\u00c4\1\u0086\1\uffff\1\u0086\2"+
        "\uffff";
    static final String DFA16_eofS =
        "\u00c5\uffff";
    static final String DFA16_minS =
        "\1\11\1\157\1\141\1\157\1\145\1\151\1\141\1\146\1\157\1\141\1\162"+
        "\1\75\1\52\1\53\1\55\1\74\3\75\11\uffff\1\60\5\uffff\1\154\1\150"+
        "\1\151\1\156\1\145\1\157\1\uffff\2\56\1\uffff\1\156\1\162\1\167"+
        "\1\141\1\144\1\147\1\157\1\141\1\154\1\162\1\164\1\44\1\157\1\145"+
        "\1\155\1\165\15\uffff\1\0\14\uffff\1\163\1\151\1\44\1\163\1\162"+
        "\1\164\1\151\1\uffff\1\56\1\163\1\141\1\160\1\155\1\151\1\150\1"+
        "\141\1\155\1\163\2\44\1\uffff\1\154\1\141\1\160\1\145\2\uffff\1"+
        "\145\1\154\1\uffff\1\143\1\157\1\165\1\144\1\164\1\151\1\155\1\44"+
        "\1\160\1\165\1\160\1\164\1\160\1\145\1\uffff\3\44\1\uffff\1\44\1"+
        "\153\1\154\2\44\1\145\1\141\1\154\1\162\2\44\1\156\1\44\1\uffff"+
        "\1\154\1\155\2\44\1\154\5\44\1\145\2\uffff\1\44\1\162\1\154\1\156"+
        "\2\uffff\1\165\1\uffff\1\145\1\160\1\uffff\3\44\1\145\1\uffff\1"+
        "\162\1\uffff\1\144\2\44\1\145\1\162\1\44\1\162\2\44\2\uffff\2\44"+
        "\1\uffff\1\44\2\uffff";
    static final String DFA16_maxS =
        "\1\176\1\157\1\141\1\163\1\145\1\151\1\163\1\156\1\162\1\141\1\162"+
        "\5\75\1\76\2\75\11\uffff\1\172\5\uffff\1\154\1\150\1\157\1\156\1"+
        "\145\1\157\1\uffff\2\71\1\uffff\1\156\1\162\1\167\1\141\1\144\1"+
        "\147\1\157\1\141\1\154\1\162\1\164\1\172\1\157\1\145\1\155\1\165"+
        "\15\uffff\1\uffff\14\uffff\1\163\1\151\1\172\1\163\1\162\1\164\1"+
        "\151\1\uffff\1\71\1\164\1\141\1\160\1\155\1\151\1\150\1\141\1\155"+
        "\1\163\2\172\1\uffff\1\154\1\141\1\160\1\145\2\uffff\1\145\1\154"+
        "\1\uffff\1\143\1\157\1\165\1\144\1\164\1\151\1\155\1\172\1\160\1"+
        "\165\1\160\1\164\1\160\1\145\1\uffff\3\172\1\uffff\1\172\1\153\1"+
        "\154\2\172\1\145\1\141\1\154\1\162\2\172\1\156\1\172\1\uffff\1\154"+
        "\1\155\2\172\1\154\5\172\1\145\2\uffff\1\172\1\162\1\154\1\156\2"+
        "\uffff\1\165\1\uffff\1\145\1\160\1\uffff\3\172\1\145\1\uffff\1\162"+
        "\1\uffff\1\144\2\172\1\145\1\162\1\172\1\162\2\172\2\uffff\2\172"+
        "\1\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\23\uffff\1\22\1\23\1\24\1\33\1\34\1\35\1\36\1\37\1\40\1\uffff\1"+
        "\44\1\47\1\50\1\51\1\52\6\uffff\1\70\2\uffff\1\73\20\uffff\1\27"+
        "\1\10\1\30\1\74\1\75\1\11\1\25\1\31\1\12\1\26\1\32\1\13\1\16\1\uffff"+
        "\1\14\1\17\1\42\1\15\1\20\1\45\1\21\1\46\1\43\1\67\1\66\1\72\7\uffff"+
        "\1\71\14\uffff\1\53\4\uffff\1\41\1\76\2\uffff\1\56\16\uffff\1\57"+
        "\3\uffff\1\6\15\uffff\1\3\13\uffff\1\7\1\54\4\uffff\1\65\1\1\1\uffff"+
        "\1\2\2\uffff\1\5\4\uffff\1\62\1\uffff\1\55\11\uffff\1\60\1\64\2"+
        "\uffff\1\4\1\uffff\1\63\1\61";
    static final String DFA16_specialS =
        "\111\uffff\1\0\173\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\22\2\uffff\1\50\1\uffff\1"+
            "\23\1\uffff\1\26\1\27\1\13\1\15\1\35\1\16\1\34\1\14\1\51\11"+
            "\52\1\40\1\41\1\17\1\21\1\20\1\37\1\uffff\32\50\1\30\1\uffff"+
            "\1\31\1\24\1\50\1\uffff\1\50\1\10\1\1\1\44\1\42\1\6\1\50\1\5"+
            "\1\7\2\50\1\3\1\4\2\50\1\2\1\50\1\46\1\11\1\12\1\45\1\47\1\43"+
            "\3\50\1\32\1\25\1\33\1\36",
            "\1\54",
            "\1\55",
            "\1\56\3\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\64\12\uffff\1\62\2\uffff\1\65\3\uffff\1\63",
            "\1\67\7\uffff\1\66",
            "\1\70\2\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\77\4\uffff\1\100\15\uffff\1\76",
            "\1\102\21\uffff\1\103",
            "\1\105\17\uffff\1\106",
            "\1\111\1\110",
            "\1\113\1\114",
            "\1\116",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\125\47\uffff\2\124\4\uffff\1\124\12\uffff\1\124\4\uffff"+
            "\4\123",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\131\5\uffff\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\125\1\uffff\12\125",
            "\1\125\1\uffff\12\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\125\1\uffff\12\136",
            "\1\170\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\2\50\1\u0083\1\u0084\1\u0085\5\50\7\uffff\32"+
            "\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\2\50\1\u009b\1\u009c\1\u009d\5\50\7\uffff\32"+
            "\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009e",
            "\1\u009f",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a8",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\2\50\1\u00ad\1\u00ae\1\u00af\5\50\7\uffff\32"+
            "\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b0",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00b2",
            "",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00bf",
            "\1\u00c0",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00c2",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | RULE_TYPE | RULE_BOOLCONSTANT | RULE_STAR | RULE_SLASH | RULE_PLUS | RULE_DASH | RULE_LT | RULE_GT | RULE_LTEQ | RULE_GTEQ | RULE_EQEQ | RULE_NEQ | RULE_AND | RULE_XOR | RULE_OR | RULE_INC | RULE_DEC | RULE_STAREQ | RULE_SLASHEQ | RULE_PLUSEQ | RULE_DASHEQ | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_LEFT_FRENCH | RULE_RIGHT_FRENCH | RULE_DOT | RULE_COMMA | RULE_EQUAL | RULE_BANG | RULE_TILDE | RULE_QUESTION | RULE_COLON | RULE_SEMICOLON | RULE_IF | RULE_ELSE | RULE_WHILE | RULE_DO | RULE_FOR | RULE_UNROLL | RULE_CONTINUE | RULE_BREAK | RULE_DISCARD | RULE_RETURN | RULE_VOID | RULE_RGBA_FIELDS | RULE_XYZW_FIELDS | RULE_IDENTIFIER | RULE_INTCONSTANT | RULE_FLOATCONSTANT | RULE_WS | RULE_COMMENT | RULE_LINE_COMMENT | RULE_T_GLUE_BLOCK );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_73 = input.LA(1);

                        s = -1;
                        if ( ((LA16_73>='\u0000' && LA16_73<='\uFFFF')) ) {s = 112;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}