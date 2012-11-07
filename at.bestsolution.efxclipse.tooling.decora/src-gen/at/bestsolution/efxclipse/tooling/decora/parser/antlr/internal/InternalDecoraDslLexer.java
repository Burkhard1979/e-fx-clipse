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
    public static final int RULE_TILDE=46;
    public static final int RULE_XYZW_FIELDS=4;
    public static final int RULE_LTEQ=24;
    public static final int RULE_DISCARD=58;
    public static final int RULE_DO=53;
    public static final int RULE_SEMICOLON=49;
    public static final int RULE_PLUSEQ=35;
    public static final int RULE_RETURN=59;
    public static final int RULE_OR=30;
    public static final int RULE_FOR=54;
    public static final int RULE_AND=28;
    public static final int EOF=-1;
    public static final int RULE_LEFT_FRENCH=15;
    public static final int RULE_LT=22;
    public static final int RULE_DASHEQ=36;
    public static final int RULE_WHILE=52;
    public static final int RULE_GTEQ=25;
    public static final int RULE_DOT=5;
    public static final int RULE_LEFT_PAREN=37;
    public static final int RULE_GT=23;
    public static final int RULE_RFIELD=6;
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
    public static final int RULE_RIGHT_BRACKET=40;
    public static final int RULE_VOID=60;
    public static final int RULE_RIGHT_PAREN=38;
    public static final int RULE_NEQ=27;
    public static final int RULE_RIGHT_BRACE=42;
    public static final int RULE_LINE_COMMENT=14;
    public static final int RULE_LEFT_BRACKET=39;
    public static final int RULE_SLASH=19;
    public static final int RULE_XFIELD=7;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=9;
    public static final int RULE_IF=50;
    public static final int RULE_ELSE=51;
    public static final int RULE_BREAK=57;
    public static final int RULE_DASH=21;
    public static final int RULE_QUESTION=47;

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

    // $ANTLR start "RULE_RFIELD"
    public final void mRULE_RFIELD() throws RecognitionException {
        try {
            int _type = RULE_RFIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:258:13: ( ( 'r' | 'g' | 'b' | 'a' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:258:15: ( 'r' | 'g' | 'b' | 'a' )
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:18: ( ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:20: ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:20: ( RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD RULE_XFIELD | RULE_DOT RULE_XFIELD )
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:21: RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:78: RULE_DOT RULE_XFIELD RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:123: RULE_DOT RULE_XFIELD RULE_XFIELD
                    {
                    mRULE_DOT(); 
                    mRULE_XFIELD(); 
                    mRULE_XFIELD(); 

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:260:156: RULE_DOT RULE_XFIELD
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:262:13: ( ( 'x' | 'y' | 'z' | 'w' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:262:15: ( 'x' | 'y' | 'z' | 'w' )
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:264:13: ( ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:264:15: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:266:12: ( '0' .. '9' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:266:14: '0' .. '9'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:18: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:20: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:20: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:21: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:25: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:34: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:268:34: RULE_DIGIT
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:20: ( ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:22: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:22: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* | '.' ( RULE_DIGIT )+ )
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:23: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:23: ( RULE_DIGIT )+
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
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:23: RULE_DIGIT
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:39: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:39: RULE_DIGIT
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
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:51: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:55: ( RULE_DIGIT )+
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
                    	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:270:55: RULE_DIGIT
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:272:9: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:272:11: ( ' ' | '\\r' | '\\t' | '\\n' )
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:274:14: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:274:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:274:21: ( options {greedy=false; } : . )*
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:274:49: .
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:276:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:276:21: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:276:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:276:26: ~ ( ( '\\n' | '\\r' ) )
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

            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:276:42: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:276:42: '\\r'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:278:19: ( RULE_LEFT_FRENCH ( . )* RULE_RIGHT_FRENCH )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:278:21: RULE_LEFT_FRENCH ( . )* RULE_RIGHT_FRENCH
            {
            mRULE_LEFT_FRENCH(); 
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:278:38: ( . )*
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
            	    // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:278:38: .
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:280:11: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:280:13: '*'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:282:12: ( '/' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:282:14: '/'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:284:11: ( '+' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:284:13: '+'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:286:11: ( '-' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:286:13: '-'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:288:9: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:288:11: '<'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:290:9: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:290:11: '>'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:292:11: ( '<=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:292:13: '<='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:294:11: ( '>=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:294:13: '>='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:296:11: ( '==' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:296:13: '=='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:298:10: ( '!=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:298:12: '!='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:300:10: ( '&&' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:300:12: '&&'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:302:10: ( '^^' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:302:12: '^^'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:304:9: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:304:11: '||'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:306:10: ( '++' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:306:12: '++'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:10: ( '--' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:308:12: '--'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:310:13: ( '*=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:310:15: '*='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:312:14: ( '/=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:312:16: '/='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:314:13: ( '+=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:314:15: '+='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:316:13: ( '-=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:316:15: '-='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:318:17: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:318:19: '('
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:320:18: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:320:20: ')'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:322:19: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:322:21: '['
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:324:20: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:324:22: ']'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:326:17: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:326:19: '{'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:328:18: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:328:20: '}'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:330:18: ( '<<' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:330:20: '<<'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:332:19: ( '>>' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:332:21: '>>'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:334:10: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:334:12: '.'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:336:12: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:336:14: ','
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:338:12: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:338:14: '='
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:340:11: ( '!' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:340:13: '!'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:342:12: ( '~' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:342:14: '~'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:344:15: ( '?' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:344:17: '?'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:346:12: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:346:14: ':'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:348:16: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:348:18: ';'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:350:9: ( 'if' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:350:11: 'if'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:352:11: ( 'else' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:352:13: 'else'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:354:12: ( 'while' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:354:14: 'while'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:356:9: ( 'do' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:356:11: 'do'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:10: ( 'for' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:358:12: 'for'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:360:13: ( 'unroll' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:360:15: 'unroll'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:362:15: ( 'continue' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:362:17: 'continue'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:364:12: ( 'break' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:364:14: 'break'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:366:14: ( 'discard' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:366:16: 'discard'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:368:13: ( 'return' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:368:15: 'return'
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
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:370:11: ( 'void' )
            // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:370:13: 'void'
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
        // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:8: ( RULE_RFIELD | RULE_XYZW_FIELDS | RULE_XFIELD | RULE_LETTER | RULE_DIGIT | RULE_INTCONSTANT | RULE_FLOATCONSTANT | RULE_WS | RULE_COMMENT | RULE_LINE_COMMENT | RULE_T_GLUE_BLOCK | RULE_STAR | RULE_SLASH | RULE_PLUS | RULE_DASH | RULE_LT | RULE_GT | RULE_LTEQ | RULE_GTEQ | RULE_EQEQ | RULE_NEQ | RULE_AND | RULE_XOR | RULE_OR | RULE_INC | RULE_DEC | RULE_STAREQ | RULE_SLASHEQ | RULE_PLUSEQ | RULE_DASHEQ | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_LEFT_FRENCH | RULE_RIGHT_FRENCH | RULE_DOT | RULE_COMMA | RULE_EQUAL | RULE_BANG | RULE_TILDE | RULE_QUESTION | RULE_COLON | RULE_SEMICOLON | RULE_IF | RULE_ELSE | RULE_WHILE | RULE_DO | RULE_FOR | RULE_UNROLL | RULE_CONTINUE | RULE_BREAK | RULE_DISCARD | RULE_RETURN | RULE_VOID )
        int alt12=57;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:10: RULE_RFIELD
                {
                mRULE_RFIELD(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:22: RULE_XYZW_FIELDS
                {
                mRULE_XYZW_FIELDS(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:39: RULE_XFIELD
                {
                mRULE_XFIELD(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:51: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:63: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:74: RULE_INTCONSTANT
                {
                mRULE_INTCONSTANT(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:91: RULE_FLOATCONSTANT
                {
                mRULE_FLOATCONSTANT(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:110: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:118: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:131: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:149: RULE_T_GLUE_BLOCK
                {
                mRULE_T_GLUE_BLOCK(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:167: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:177: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:188: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:198: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:208: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:216: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:224: RULE_LTEQ
                {
                mRULE_LTEQ(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:234: RULE_GTEQ
                {
                mRULE_GTEQ(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:244: RULE_EQEQ
                {
                mRULE_EQEQ(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:254: RULE_NEQ
                {
                mRULE_NEQ(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:263: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:272: RULE_XOR
                {
                mRULE_XOR(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:281: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:289: RULE_INC
                {
                mRULE_INC(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:298: RULE_DEC
                {
                mRULE_DEC(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:307: RULE_STAREQ
                {
                mRULE_STAREQ(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:319: RULE_SLASHEQ
                {
                mRULE_SLASHEQ(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:332: RULE_PLUSEQ
                {
                mRULE_PLUSEQ(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:344: RULE_DASHEQ
                {
                mRULE_DASHEQ(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:356: RULE_LEFT_PAREN
                {
                mRULE_LEFT_PAREN(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:372: RULE_RIGHT_PAREN
                {
                mRULE_RIGHT_PAREN(); 

                }
                break;
            case 33 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:389: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 34 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:407: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 35 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:426: RULE_LEFT_BRACE
                {
                mRULE_LEFT_BRACE(); 

                }
                break;
            case 36 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:442: RULE_RIGHT_BRACE
                {
                mRULE_RIGHT_BRACE(); 

                }
                break;
            case 37 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:459: RULE_LEFT_FRENCH
                {
                mRULE_LEFT_FRENCH(); 

                }
                break;
            case 38 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:476: RULE_RIGHT_FRENCH
                {
                mRULE_RIGHT_FRENCH(); 

                }
                break;
            case 39 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:494: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 40 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:503: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 41 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:514: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 42 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:525: RULE_BANG
                {
                mRULE_BANG(); 

                }
                break;
            case 43 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:535: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 44 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:546: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 45 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:560: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 46 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:571: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 47 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:586: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 48 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:594: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 49 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:604: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 50 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:615: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 51 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:623: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 52 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:632: RULE_UNROLL
                {
                mRULE_UNROLL(); 

                }
                break;
            case 53 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:644: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 54 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:658: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 55 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:669: RULE_DISCARD
                {
                mRULE_DISCARD(); 

                }
                break;
            case 56 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:682: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 57 :
                // ../at.bestsolution.efxclipse.tooling.decora/src-gen/at/bestsolution/efxclipse/tooling/decora/parser/antlr/internal/InternalDecoraDsl.g:1:694: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\51\1\52\1\56\1\47\2\60\1\uffff\1\65\1\70\1\72\1\75\1"+
        "\100\1\103\1\105\1\107\16\uffff\2\47\1\uffff\4\47\1\51\13\uffff"+
        "\1\120\4\uffff\1\121\34\uffff";
    static final String DFA12_eofS =
        "\123\uffff";
    static final String DFA12_minS =
        "\1\11\1\162\1\60\1\150\1\146\2\56\1\uffff\1\52\1\74\1\75\1\53\1"+
        "\55\3\75\16\uffff\1\154\1\151\1\uffff\1\157\1\156\2\157\1\145\13"+
        "\uffff\1\56\4\uffff\1\0\34\uffff";
    static final String DFA12_maxS =
        "\1\176\1\162\1\172\1\150\1\146\2\71\1\uffff\5\75\1\76\2\75\16\uffff"+
        "\1\154\1\157\1\uffff\1\157\1\156\2\157\1\145\13\uffff\1\71\4\uffff"+
        "\1\uffff\34\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\10\10\uffff\1\26\1\27\1\30\1\37\1\40\1\41\1\42\1\43\1"+
        "\44\1\50\1\53\1\54\1\55\1\56\2\uffff\1\3\5\uffff\1\1\1\4\1\66\1"+
        "\1\1\47\1\2\1\7\1\61\1\3\1\57\1\5\1\uffff\1\11\1\12\1\34\1\15\1"+
        "\uffff\1\22\1\20\1\33\1\14\1\31\1\35\1\16\1\32\1\36\1\17\1\23\1"+
        "\46\1\21\1\24\1\51\1\25\1\52\1\60\1\62\1\67\1\63\1\64\1\65\1\71"+
        "\1\70\1\6\1\45\1\13";
    static final String DFA12_specialS =
        "\66\uffff\1\0\34\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\7\2\uffff\1\7\22\uffff\1\7\1\17\2\uffff\1\47\1\uffff\1\20"+
            "\1\uffff\1\23\1\24\1\12\1\13\1\31\1\14\1\2\1\10\1\5\11\6\1\34"+
            "\1\35\1\11\1\16\1\15\1\33\1\uffff\32\47\1\25\1\uffff\1\26\1"+
            "\21\1\47\1\uffff\1\46\1\1\1\43\1\37\1\36\1\41\1\46\1\47\1\4"+
            "\10\47\1\45\2\47\1\42\1\44\1\3\3\40\1\27\1\22\1\30\1\32",
            "\1\50",
            "\12\54\75\uffff\4\53",
            "\1\55",
            "\1\57",
            "\1\54\1\uffff\12\54",
            "\1\54\1\uffff\12\61",
            "",
            "\1\62\4\uffff\1\63\15\uffff\1\64",
            "\1\66\1\67",
            "\1\71",
            "\1\73\21\uffff\1\74",
            "\1\76\17\uffff\1\77",
            "\1\101\1\102",
            "\1\104",
            "\1\106",
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
            "\1\110",
            "\1\112\5\uffff\1\111",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
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
            "\1\54\1\uffff\12\61",
            "",
            "",
            "",
            "",
            "\0\122",
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
            return "1:1: Tokens : ( RULE_RFIELD | RULE_XYZW_FIELDS | RULE_XFIELD | RULE_LETTER | RULE_DIGIT | RULE_INTCONSTANT | RULE_FLOATCONSTANT | RULE_WS | RULE_COMMENT | RULE_LINE_COMMENT | RULE_T_GLUE_BLOCK | RULE_STAR | RULE_SLASH | RULE_PLUS | RULE_DASH | RULE_LT | RULE_GT | RULE_LTEQ | RULE_GTEQ | RULE_EQEQ | RULE_NEQ | RULE_AND | RULE_XOR | RULE_OR | RULE_INC | RULE_DEC | RULE_STAREQ | RULE_SLASHEQ | RULE_PLUSEQ | RULE_DASHEQ | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_LEFT_FRENCH | RULE_RIGHT_FRENCH | RULE_DOT | RULE_COMMA | RULE_EQUAL | RULE_BANG | RULE_TILDE | RULE_QUESTION | RULE_COLON | RULE_SEMICOLON | RULE_IF | RULE_ELSE | RULE_WHILE | RULE_DO | RULE_FOR | RULE_UNROLL | RULE_CONTINUE | RULE_BREAK | RULE_DISCARD | RULE_RETURN | RULE_VOID );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( ((LA12_54>='\u0000' && LA12_54<='\uFFFF')) ) {s = 82;}

                        else s = 81;

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