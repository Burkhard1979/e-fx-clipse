package at.bestsolution.efxclipse.tooling.decora.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDecoraDslLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_XYZW_FIELDS=4;
    public static final int T__66=66;
    public static final int RULE_TILDE=60;
    public static final int RULE_LTEQ=19;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_DISCARD=47;
    public static final int T__63=63;
    public static final int RULE_DO=42;
    public static final int RULE_SEMICOLON=35;
    public static final int RULE_PLUSEQ=33;
    public static final int RULE_RETURN=48;
    public static final int RULE_FOR=43;
    public static final int RULE_OR=27;
    public static final int RULE_AND=25;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=58;
    public static final int RULE_LT=21;
    public static final int RULE_DASHEQ=34;
    public static final int RULE_WHILE=41;
    public static final int RULE_GTEQ=20;
    public static final int RULE_DOT=50;
    public static final int RULE_LEFT_PAREN=7;
    public static final int RULE_GT=22;
    public static final int RULE_RFIELD=51;
    public static final int RULE_SLASHEQ=32;
    public static final int RULE_INC=11;
    public static final int RULE_T_GLUE_BLOCK=49;
    public static final int RULE_STAREQ=31;
    public static final int RULE_FLOATCONSTANT=6;
    public static final int RULE_LEFT_BRACE=37;
    public static final int RULE_BANG=16;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_DEC=12;
    public static final int RULE_CONTINUE=45;
    public static final int RULE_XOR=26;
    public static final int RULE_PLUS=14;
    public static final int RULE_UNROLL=44;
    public static final int RULE_COMMA=13;
    public static final int RULE_EQUAL=30;
    public static final int RULE_COMMENT=56;
    public static final int RULE_RIGHT_FRENCH=59;
    public static final int RULE_LETTER=52;
    public static final int RULE_INTCONSTANT=5;
    public static final int RULE_COLON=29;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STAR=17;
    public static final int T__70=70;
    public static final int RULE_EQEQ=23;
    public static final int RULE_RIGHT_BRACKET=10;
    public static final int RULE_VOID=36;
    public static final int RULE_RIGHT_PAREN=8;
    public static final int RULE_NEQ=24;
    public static final int RULE_RIGHT_BRACE=38;
    public static final int RULE_LINE_COMMENT=57;
    public static final int RULE_LEFT_BRACKET=9;
    public static final int RULE_SLASH=18;
    public static final int T__76=76;
    public static final int RULE_XFIELD=54;
    public static final int RULE_WS=55;
    public static final int T__75=75;
    public static final int RULE_DIGIT=53;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_IF=39;
    public static final int RULE_ELSE=40;
    public static final int RULE_BREAK=46;
    public static final int RULE_DASH=15;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RULE_QUESTION=28;

    // delegates
    // delegators

    public InternalDecoraDslLexer() {;} 
    public InternalDecoraDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDecoraDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g"; }

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:11:7: ( 'const' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:11:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:12:7: ( 'param' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:12:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:13:7: ( 'lowp' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:13:9: 'lowp'
            {
            match("lowp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:14:7: ( 'mediump' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:14:9: 'mediump'
            {
            match("mediump"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:15:7: ( 'highp' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:15:9: 'highp'
            {
            match("highp"); 


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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:16:7: ( 'float2' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:16:9: 'float2'
            {
            match("float2"); 


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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:17:7: ( 'float3' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:17:9: 'float3'
            {
            match("float3"); 


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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:18:7: ( 'float4' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:18:9: 'float4'
            {
            match("float4"); 


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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:19:7: ( 'float' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:19:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:20:7: ( 'int2' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:20:9: 'int2'
            {
            match("int2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:21:7: ( 'int3' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:21:9: 'int3'
            {
            match("int3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:22:7: ( 'int4' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:22:9: 'int4'
            {
            match("int4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:23:7: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:23:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:24:7: ( 'bool2' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:24:9: 'bool2'
            {
            match("bool2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:25:7: ( 'bool3' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:25:9: 'bool3'
            {
            match("bool3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:26:7: ( 'bool4' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:26:9: 'bool4'
            {
            match("bool4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:27:7: ( 'bool' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:27:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:28:7: ( 'sampler' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:28:9: 'sampler'
            {
            match("sampler"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:29:7: ( 'lsampler' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:29:9: 'lsampler'
            {
            match("lsampler"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:30:7: ( 'fsampler' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:30:9: 'fsampler'
            {
            match("fsampler"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:31:7: ( 'true' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:31:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:32:7: ( 'false' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:32:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "RULE_RFIELD"
    public final void mRULE_RFIELD() throws RecognitionException {
        try {
            int _type = RULE_RFIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4373:13: ( ( 'r' | 'g' | 'b' | 'a' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4373:15: ( 'r' | 'g' | 'b' | 'a' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='g'||input.LA(1)=='r' ) {
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
    // $ANTLR end "RULE_RFIELD"

    // $ANTLR start "RULE_XYZW_FIELDS"
    public final void mRULE_XYZW_FIELDS() throws RecognitionException {
        try {
            int _type = RULE_XYZW_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:18: ( ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:20: ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:20: ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='.') ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>='w' && LA1_1<='z')) ) {
                    int LA1_2 = input.LA(3);

                    if ( ((LA1_2>='w' && LA1_2<='z')) ) {
                        int LA1_4 = input.LA(4);

                        if ( ((LA1_4>='w' && LA1_4<='z')) ) {
                            int LA1_6 = input.LA(5);

                            if ( ((LA1_6>='w' && LA1_6<='z')) ) {
                                alt1=1;
                            }
                            else {
                                alt1=2;}
                        }
                        else {
                            alt1=3;}
                    }
                    else {
                        alt1=4;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:21: RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:78: RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:123: RULE_DOT RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4375:156: RULE_DOT RULE_XFIELD
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
            int _type = RULE_XFIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4377:13: ( ( 'x' | 'y' | 'z' | 'w' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4377:15: ( 'x' | 'y' | 'z' | 'w' )
            {
            if ( (input.LA(1)>='w' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_XFIELD"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4379:13: ( ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4379:15: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4381:12: ( '0' .. '9' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4381:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:18: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:20: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:20: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:21: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:25: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:34: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4383:34: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:20: ( ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:22: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:22: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:23: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:23: ( RULE_DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:23: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:39: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:39: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:51: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:55: ( RULE_DIGIT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4385:55: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4387:9: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4387:11: ( ' ' | '\\r' | '\\t' | '\\n' )
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4389:14: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4389:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4389:21: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4389:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4391:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4391:21: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4391:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4391:26: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4391:42: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4391:42: '\\r'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4393:19: ( RULE_LEFT_FRENCH ( . )* RULE_RIGHT_FRENCH )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4393:21: RULE_LEFT_FRENCH ( . )* RULE_RIGHT_FRENCH
            {
            mRULE_LEFT_FRENCH(); 
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4393:38: ( . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='>') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='>') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='=')||(LA11_1>='?' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='=')||(LA11_0>='?' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4393:38: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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

    // $ANTLR start "RULE_STAR"
    public final void mRULE_STAR() throws RecognitionException {
        try {
            int _type = RULE_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4395:11: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4395:13: '*'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4397:12: ( '/' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4397:14: '/'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4399:11: ( '+' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4399:13: '+'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4401:11: ( '-' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4401:13: '-'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4403:9: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4403:11: '<'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4405:9: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4405:11: '>'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4407:11: ( '<=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4407:13: '<='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4409:11: ( '>=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4409:13: '>='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4411:11: ( '==' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4411:13: '=='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4413:10: ( '!=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4413:12: '!='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4415:10: ( '&&' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4415:12: '&&'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4417:10: ( '^^' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4417:12: '^^'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4419:9: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4419:11: '||'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4421:10: ( '++' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4421:12: '++'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4423:10: ( '--' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4423:12: '--'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4425:13: ( '*=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4425:15: '*='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4427:14: ( '/=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4427:16: '/='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4429:13: ( '+=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4429:15: '+='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4431:13: ( '-=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4431:15: '-='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4433:17: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4433:19: '('
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4435:18: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4435:20: ')'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4437:19: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4437:21: '['
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4439:20: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4439:22: ']'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4441:17: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4441:19: '{'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4443:18: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4443:20: '}'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4445:18: ( '<<' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4445:20: '<<'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4447:19: ( '>>' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4447:21: '>>'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4449:10: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4449:12: '.'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4451:12: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4451:14: ','
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4453:12: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4453:14: '='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4455:11: ( '!' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4455:13: '!'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4457:12: ( '~' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4457:14: '~'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4459:15: ( '?' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4459:17: '?'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4461:12: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4461:14: ':'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4463:16: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4463:18: ';'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4465:9: ( 'if' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4465:11: 'if'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4467:11: ( 'else' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4467:13: 'else'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4469:12: ( 'while' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4469:14: 'while'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4471:9: ( 'do' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4471:11: 'do'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4473:10: ( 'for' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4473:12: 'for'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4475:13: ( 'unroll' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4475:15: 'unroll'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4477:15: ( 'continue' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4477:17: 'continue'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4479:12: ( 'break' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4479:14: 'break'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4481:14: ( 'discard' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4481:16: 'discard'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4483:13: ( 'return' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4483:15: 'return'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4485:11: ( 'void' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:4485:13: 'void'
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

    public void mTokens() throws RecognitionException {
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_RFIELD | RULE_XYZW_FIELDS | RULE_XFIELD | RULE_LETTER | RULE_DIGIT | RULE_INTCONSTANT | RULE_FLOATCONSTANT | RULE_WS | RULE_COMMENT | RULE_LINE_COMMENT | RULE_T_GLUE_BLOCK | RULE_STAR | RULE_SLASH | RULE_PLUS | RULE_DASH | RULE_LT | RULE_GT | RULE_LTEQ | RULE_GTEQ | RULE_EQEQ | RULE_NEQ | RULE_AND | RULE_XOR | RULE_OR | RULE_INC | RULE_DEC | RULE_STAREQ | RULE_SLASHEQ | RULE_PLUSEQ | RULE_DASHEQ | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_LEFT_FRENCH | RULE_RIGHT_FRENCH | RULE_DOT | RULE_COMMA | RULE_EQUAL | RULE_BANG | RULE_TILDE | RULE_QUESTION | RULE_COLON | RULE_SEMICOLON | RULE_IF | RULE_ELSE | RULE_WHILE | RULE_DO | RULE_FOR | RULE_UNROLL | RULE_CONTINUE | RULE_BREAK | RULE_DISCARD | RULE_RETURN | RULE_VOID )
        int alt12=79;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:10: T__61
                {
                mT__61(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:16: T__62
                {
                mT__62(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:22: T__63
                {
                mT__63(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:28: T__64
                {
                mT__64(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:34: T__65
                {
                mT__65(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:40: T__66
                {
                mT__66(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:46: T__67
                {
                mT__67(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:52: T__68
                {
                mT__68(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:58: T__69
                {
                mT__69(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:64: T__70
                {
                mT__70(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:70: T__71
                {
                mT__71(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:76: T__72
                {
                mT__72(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:82: T__73
                {
                mT__73(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:88: T__74
                {
                mT__74(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:94: T__75
                {
                mT__75(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:100: T__76
                {
                mT__76(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:106: T__77
                {
                mT__77(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:112: T__78
                {
                mT__78(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:118: T__79
                {
                mT__79(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:124: T__80
                {
                mT__80(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:130: T__81
                {
                mT__81(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:136: T__82
                {
                mT__82(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:142: RULE_RFIELD
                {
                mRULE_RFIELD(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:154: RULE_XYZW_FIELDS
                {
                mRULE_XYZW_FIELDS(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:171: RULE_XFIELD
                {
                mRULE_XFIELD(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:183: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:195: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:206: RULE_INTCONSTANT
                {
                mRULE_INTCONSTANT(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:223: RULE_FLOATCONSTANT
                {
                mRULE_FLOATCONSTANT(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:242: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:250: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:263: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 33 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:281: RULE_T_GLUE_BLOCK
                {
                mRULE_T_GLUE_BLOCK(); 

                }
                break;
            case 34 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:299: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 35 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:309: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 36 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:320: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 37 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:330: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 38 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:340: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 39 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:348: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 40 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:356: RULE_LTEQ
                {
                mRULE_LTEQ(); 

                }
                break;
            case 41 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:366: RULE_GTEQ
                {
                mRULE_GTEQ(); 

                }
                break;
            case 42 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:376: RULE_EQEQ
                {
                mRULE_EQEQ(); 

                }
                break;
            case 43 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:386: RULE_NEQ
                {
                mRULE_NEQ(); 

                }
                break;
            case 44 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:395: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 45 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:404: RULE_XOR
                {
                mRULE_XOR(); 

                }
                break;
            case 46 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:413: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 47 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:421: RULE_INC
                {
                mRULE_INC(); 

                }
                break;
            case 48 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:430: RULE_DEC
                {
                mRULE_DEC(); 

                }
                break;
            case 49 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:439: RULE_STAREQ
                {
                mRULE_STAREQ(); 

                }
                break;
            case 50 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:451: RULE_SLASHEQ
                {
                mRULE_SLASHEQ(); 

                }
                break;
            case 51 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:464: RULE_PLUSEQ
                {
                mRULE_PLUSEQ(); 

                }
                break;
            case 52 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:476: RULE_DASHEQ
                {
                mRULE_DASHEQ(); 

                }
                break;
            case 53 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:488: RULE_LEFT_PAREN
                {
                mRULE_LEFT_PAREN(); 

                }
                break;
            case 54 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:504: RULE_RIGHT_PAREN
                {
                mRULE_RIGHT_PAREN(); 

                }
                break;
            case 55 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:521: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 56 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:539: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 57 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:558: RULE_LEFT_BRACE
                {
                mRULE_LEFT_BRACE(); 

                }
                break;
            case 58 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:574: RULE_RIGHT_BRACE
                {
                mRULE_RIGHT_BRACE(); 

                }
                break;
            case 59 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:591: RULE_LEFT_FRENCH
                {
                mRULE_LEFT_FRENCH(); 

                }
                break;
            case 60 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:608: RULE_RIGHT_FRENCH
                {
                mRULE_RIGHT_FRENCH(); 

                }
                break;
            case 61 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:626: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 62 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:635: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 63 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:646: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 64 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:657: RULE_BANG
                {
                mRULE_BANG(); 

                }
                break;
            case 65 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:667: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 66 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:678: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 67 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:692: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 68 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:703: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 69 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:718: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 70 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:726: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 71 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:736: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 72 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:747: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 73 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:755: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 74 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:764: RULE_UNROLL
                {
                mRULE_UNROLL(); 

                }
                break;
            case 75 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:776: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 76 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:790: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 77 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:801: RULE_DISCARD
                {
                mRULE_DISCARD(); 

                }
                break;
            case 78 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:814: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 79 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:826: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\55\1\74\2\55\1\74\1\100\1\104\1\55\2\106\1\uffff\1\113"+
        "\1\116\1\120\1\123\1\126\1\131\1\133\1\135\16\uffff\1\55\1\uffff"+
        "\2\55\33\uffff\1\146\4\uffff\1\147\27\uffff\1\157\13\uffff\1\165"+
        "\1\171\10\uffff";
    static final String DFA12_eofS =
        "\172\uffff";
    static final String DFA12_minS =
        "\1\11\1\157\1\141\1\157\1\145\1\151\1\141\1\146\1\157\1\141\1\162"+
        "\1\145\1\60\1\150\1\154\2\56\1\uffff\1\52\1\74\1\75\1\53\1\55\3"+
        "\75\16\uffff\1\151\1\uffff\1\156\1\157\2\uffff\1\156\5\uffff\1\157"+
        "\3\uffff\1\164\1\uffff\1\157\14\uffff\1\56\4\uffff\1\0\25\uffff"+
        "\1\163\1\141\1\62\1\154\5\uffff\1\164\4\uffff\2\62\10\uffff";
    static final String DFA12_maxS =
        "\1\176\1\157\1\141\1\163\1\145\1\151\1\163\1\156\1\162\1\141\1\162"+
        "\1\145\1\172\1\150\1\154\2\71\1\uffff\5\75\1\76\2\75\16\uffff\1"+
        "\157\1\uffff\1\156\1\157\2\uffff\1\156\5\uffff\1\157\3\uffff\1\164"+
        "\1\uffff\1\157\14\uffff\1\71\4\uffff\1\uffff\25\uffff\1\164\1\141"+
        "\1\64\1\154\5\uffff\1\164\4\uffff\2\64\10\uffff";
    static final String DFA12_acceptS =
        "\21\uffff\1\36\10\uffff\1\54\1\55\1\56\1\65\1\66\1\67\1\70\1\71"+
        "\1\72\1\76\1\101\1\102\1\103\1\104\1\uffff\1\31\2\uffff\1\27\1\32"+
        "\1\uffff\1\2\1\3\1\23\1\4\1\5\1\uffff\1\24\1\26\1\111\1\uffff\1"+
        "\105\1\uffff\1\114\1\27\1\22\1\25\1\116\1\75\1\30\1\35\1\107\1\31"+
        "\1\106\1\33\1\uffff\1\37\1\40\1\62\1\43\1\uffff\1\50\1\46\1\61\1"+
        "\42\1\57\1\63\1\44\1\60\1\64\1\45\1\51\1\74\1\47\1\52\1\77\1\53"+
        "\1\100\1\110\1\115\1\112\1\117\4\uffff\1\34\1\73\1\41\1\1\1\113"+
        "\1\uffff\1\12\1\13\1\14\1\15\2\uffff\1\16\1\17\1\20\1\21\1\6\1\7"+
        "\1\10\1\11";
    static final String DFA12_specialS =
        "\114\uffff\1\0\55\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\31\2\uffff\1\55\1\uffff\1"+
            "\32\1\uffff\1\35\1\36\1\24\1\25\1\43\1\26\1\14\1\22\1\17\11"+
            "\20\1\46\1\47\1\23\1\30\1\27\1\45\1\uffff\32\55\1\37\1\uffff"+
            "\1\40\1\33\1\55\1\uffff\1\54\1\10\1\1\1\50\1\16\1\6\1\54\1\5"+
            "\1\7\2\55\1\3\1\4\2\55\1\2\1\55\1\13\1\11\1\12\1\52\1\53\1\15"+
            "\3\51\1\41\1\34\1\42\1\44",
            "\1\56",
            "\1\57",
            "\1\60\3\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\66\12\uffff\1\64\2\uffff\1\67\3\uffff\1\65",
            "\1\71\7\uffff\1\70",
            "\1\72\2\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\102\75\uffff\4\101",
            "\1\103",
            "\1\105",
            "\1\102\1\uffff\12\102",
            "\1\102\1\uffff\12\107",
            "",
            "\1\110\4\uffff\1\111\15\uffff\1\112",
            "\1\114\1\115",
            "\1\117",
            "\1\121\21\uffff\1\122",
            "\1\124\17\uffff\1\125",
            "\1\127\1\130",
            "\1\132",
            "\1\134",
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
            "",
            "\1\137\5\uffff\1\136",
            "",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "",
            "\1\145",
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
            "\1\102\1\uffff\12\107",
            "",
            "",
            "",
            "",
            "\0\150",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151\1\152",
            "\1\153",
            "\1\154\1\155\1\156",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "",
            "",
            "",
            "",
            "\1\162\1\163\1\164",
            "\1\166\1\167\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_RFIELD | RULE_XYZW_FIELDS | RULE_XFIELD | RULE_LETTER | RULE_DIGIT | RULE_INTCONSTANT | RULE_FLOATCONSTANT | RULE_WS | RULE_COMMENT | RULE_LINE_COMMENT | RULE_T_GLUE_BLOCK | RULE_STAR | RULE_SLASH | RULE_PLUS | RULE_DASH | RULE_LT | RULE_GT | RULE_LTEQ | RULE_GTEQ | RULE_EQEQ | RULE_NEQ | RULE_AND | RULE_XOR | RULE_OR | RULE_INC | RULE_DEC | RULE_STAREQ | RULE_SLASHEQ | RULE_PLUSEQ | RULE_DASHEQ | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_LEFT_FRENCH | RULE_RIGHT_FRENCH | RULE_DOT | RULE_COMMA | RULE_EQUAL | RULE_BANG | RULE_TILDE | RULE_QUESTION | RULE_COLON | RULE_SEMICOLON | RULE_IF | RULE_ELSE | RULE_WHILE | RULE_DO | RULE_FOR | RULE_UNROLL | RULE_CONTINUE | RULE_BREAK | RULE_DISCARD | RULE_RETURN | RULE_VOID );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( ((LA12_76>='\u0000' && LA12_76<='\uFFFF')) ) {s = 104;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}