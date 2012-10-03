package at.bestsolution.efxclipse.tooling.css.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=5;
    public static final int T__23=23;
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

    public InternalCssDslLexer() {;} 
    public InternalCssDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCssDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:11:7: ( '@charset' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:11:9: '@charset'
            {
            match("@charset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:12:7: ( '@CHARSET' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:12:9: '@CHARSET'
            {
            match("@CHARSET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:13:7: ( '@import' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:13:9: '@import'
            {
            match("@import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:14:7: ( '@IMPORT' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:14:9: '@IMPORT'
            {
            match("@IMPORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:15:7: ( '@page' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:15:9: '@page'
            {
            match("@page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:16:7: ( '@PAGE' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:16:9: '@PAGE'
            {
            match("@PAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:17:7: ( '@media' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:17:9: '@media'
            {
            match("@media"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:18:7: ( '@MEDIA' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:18:9: '@MEDIA'
            {
            match("@MEDIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:19:7: ( '^=' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:19:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:20:7: ( '$=' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:20:9: '$='
            {
            match("$="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:21:7: ( '*=' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:21:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:22:7: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:23:7: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:24:7: ( '+' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:24:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:25:7: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:26:7: ( '~' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:26:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:27:7: ( '-' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:28:7: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:28:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:29:7: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:30:7: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:30:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:31:7: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:32:7: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:33:7: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:34:7: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:35:7: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:35:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:36:7: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:37:7: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:38:7: ( 'url' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:38:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_IMPORTANT_SYM"
    public final void mRULE_IMPORTANT_SYM() throws RecognitionException {
        try {
            int _type = RULE_IMPORTANT_SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6124:20: ( '!important' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6124:22: '!important'
            {
            match("!important"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORTANT_SYM"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6126:14: ( ( '0' .. '9' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6126:16: ( '0' .. '9' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6126:16: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6126:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6128:11: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6128:13: ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6128:13: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6128:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6128:29: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6128:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_HASHMARK"
    public final void mRULE_HASHMARK() throws RecognitionException {
        try {
            int _type = RULE_HASHMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6130:15: ( '#' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6130:17: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASHMARK"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6132:12: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6132:14: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6132:38: ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6134:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6134:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6134:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6136:12: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6136:14: ','
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

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6138:14: ( '%' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6138:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6140:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6140:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6140:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6140:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6142:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6142:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6142:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6144:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INCLUDES"
    public final void mRULE_INCLUDES() throws RecognitionException {
        try {
            int _type = RULE_INCLUDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6146:15: ( '~=' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6146:17: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDES"

    // $ANTLR start "RULE_DASHMATCH"
    public final void mRULE_DASHMATCH() throws RecognitionException {
        try {
            int _type = RULE_DASHMATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6148:16: ( '|=' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:6148:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASHMATCH"

    public void mTokens() throws RecognitionException {
        // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_IMPORTANT_SYM | RULE_INTEGER | RULE_REAL | RULE_HASHMARK | RULE_IDENT | RULE_HEX | RULE_COMMA | RULE_PERCENT | RULE_ML_COMMENT | RULE_WS | RULE_STRING | RULE_INCLUDES | RULE_DASHMATCH )
        int alt11=41;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:178: RULE_IMPORTANT_SYM
                {
                mRULE_IMPORTANT_SYM(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:197: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:210: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:220: RULE_HASHMARK
                {
                mRULE_HASHMARK(); 

                }
                break;
            case 33 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:234: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 34 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:245: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 35 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:254: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 36 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:265: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 37 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:278: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:294: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:302: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:314: RULE_INCLUDES
                {
                mRULE_INCLUDES(); 

                }
                break;
            case 41 :
                // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1:328: RULE_DASHMATCH
                {
                mRULE_DASHMATCH(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\4\uffff\1\50\3\uffff\1\52\7\uffff\1\53\1\56\2\uffff\1\31\1\uffff"+
        "\1\61\1\uffff\1\31\26\uffff\2\31\2\uffff\1\64\1\uffff";
    static final String DFA11_eofS =
        "\65\uffff";
    static final String DFA11_minS =
        "\1\11\1\103\2\uffff\1\75\3\uffff\1\75\7\uffff\1\60\1\75\2\uffff"+
        "\1\60\1\uffff\1\56\1\uffff\1\60\26\uffff\2\60\2\uffff\1\55\1\uffff";
    static final String DFA11_maxS =
        "\1\176\1\160\2\uffff\1\75\3\uffff\1\75\7\uffff\1\71\1\75\2\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\26\uffff\2\172\2\uffff\1\172"+
        "\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\11\1\12\1\uffff\1\14\1\16\1\17\1\uffff\1\21\1\22\1\23"+
        "\1\24\1\25\1\26\1\27\2\uffff\1\32\1\33\1\uffff\1\35\1\uffff\1\40"+
        "\1\uffff\1\41\1\43\1\44\1\45\1\46\1\47\1\1\1\2\1\3\1\4\1\5\1\6\1"+
        "\7\1\10\1\13\1\15\1\50\1\20\1\30\1\37\1\51\1\31\2\uffff\1\36\1\42"+
        "\1\uffff\1\34";
    static final String DFA11_specialS =
        "\65\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\25\1\36\1\27\1\3\1\33\1\uffff"+
            "\1\36\1\22\1\23\1\4\1\6\1\32\1\11\1\20\1\34\12\26\1\15\1\12"+
            "\1\uffff\1\5\1\7\1\uffff\1\1\32\30\1\16\1\uffff\1\17\1\2\1\31"+
            "\1\uffff\24\30\1\24\5\30\1\13\1\21\1\14\1\10",
            "\1\40\5\uffff\1\42\3\uffff\1\46\2\uffff\1\44\22\uffff\1\37"+
            "\5\uffff\1\41\3\uffff\1\45\2\uffff\1\43",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\54",
            "\1\55",
            "",
            "",
            "\12\60\7\uffff\32\60\6\uffff\21\60\1\57\10\60",
            "",
            "\1\54\1\uffff\12\26\7\uffff\32\62\6\uffff\32\62",
            "",
            "\12\60\7\uffff\32\60\6\uffff\32\60",
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
            "\12\60\7\uffff\32\60\6\uffff\13\60\1\63\16\60",
            "\12\60\7\uffff\32\60\6\uffff\32\60",
            "",
            "",
            "\1\31\2\uffff\12\60\7\uffff\32\60\4\uffff\1\31\1\uffff\32\60",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_IMPORTANT_SYM | RULE_INTEGER | RULE_REAL | RULE_HASHMARK | RULE_IDENT | RULE_HEX | RULE_COMMA | RULE_PERCENT | RULE_ML_COMMENT | RULE_WS | RULE_STRING | RULE_INCLUDES | RULE_DASHMATCH );";
        }
    }
 

}