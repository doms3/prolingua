// Generated from Prolingua.g4 by ANTLR 4.7
package org.prolingua.pythoninterpreter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProlinguaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TAB=16, SYMBOL=17, 
		RANGE=18, NUM=19, INT=20, STRING=21, LOGIC=22, TRUE=23, FALSE=24, VAR=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "TAB", "SYMBOL", 
		"RANGE", "DIGIT", "NUM", "INT", "STRING", "LOGIC", "TRUE", "FALSE", "VAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "' '", "'if '", "' then'", "'or'", "'otherwise'", "'while'", 
		"' do'", "'print '", "'set '", "' to '", "'for '", "' in '", "'range '", 
		"'\n '", "'\t'", null, null, null, null, null, null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "TAB", "SYMBOL", "RANGE", "NUM", "INT", "STRING", 
		"LOGIC", "TRUE", "FALSE", "VAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ProlinguaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prolingua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u0092\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u009d\n\25\3\26\6\26\u00a0\n\26\r\26\16\26\u00a1\3\27\3\27\7\27\u00a6"+
		"\n\27\f\27\16\27\u00a9\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u00b5\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\6\33\u00c3\n\33\r\33\16\33\u00c4\2\2\34\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\2)\25+\26-\27/\30\61\31\63\32\65\33\3\2\7\6\2\'\',-//\61\61\4\2"+
		">>@@\3\2\62;\3\2$$\3\2c|\2\u00d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2"+
		"\2\59\3\2\2\2\7;\3\2\2\2\t?\3\2\2\2\13E\3\2\2\2\rH\3\2\2\2\17R\3\2\2\2"+
		"\21X\3\2\2\2\23\\\3\2\2\2\25c\3\2\2\2\27h\3\2\2\2\31m\3\2\2\2\33r\3\2"+
		"\2\2\35w\3\2\2\2\37~\3\2\2\2!\u0081\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2"+
		"\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u009f\3\2\2\2-\u00a3\3\2\2\2/\u00b4"+
		"\3\2\2\2\61\u00b6\3\2\2\2\63\u00bb\3\2\2\2\65\u00c2\3\2\2\2\678\7\f\2"+
		"\28\4\3\2\2\29:\7\"\2\2:\6\3\2\2\2;<\7k\2\2<=\7h\2\2=>\7\"\2\2>\b\3\2"+
		"\2\2?@\7\"\2\2@A\7v\2\2AB\7j\2\2BC\7g\2\2CD\7p\2\2D\n\3\2\2\2EF\7q\2\2"+
		"FG\7t\2\2G\f\3\2\2\2HI\7q\2\2IJ\7v\2\2JK\7j\2\2KL\7g\2\2LM\7t\2\2MN\7"+
		"y\2\2NO\7k\2\2OP\7u\2\2PQ\7g\2\2Q\16\3\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2"+
		"\2UV\7n\2\2VW\7g\2\2W\20\3\2\2\2XY\7\"\2\2YZ\7f\2\2Z[\7q\2\2[\22\3\2\2"+
		"\2\\]\7r\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2ab\7\"\2\2b\24\3\2\2\2"+
		"cd\7u\2\2de\7g\2\2ef\7v\2\2fg\7\"\2\2g\26\3\2\2\2hi\7\"\2\2ij\7v\2\2j"+
		"k\7q\2\2kl\7\"\2\2l\30\3\2\2\2mn\7h\2\2no\7q\2\2op\7t\2\2pq\7\"\2\2q\32"+
		"\3\2\2\2rs\7\"\2\2st\7k\2\2tu\7p\2\2uv\7\"\2\2v\34\3\2\2\2wx\7t\2\2xy"+
		"\7c\2\2yz\7p\2\2z{\7i\2\2{|\7g\2\2|}\7\"\2\2}\36\3\2\2\2~\177\7\f\2\2"+
		"\177\u0080\7\"\2\2\u0080 \3\2\2\2\u0081\u0082\7\13\2\2\u0082\"\3\2\2\2"+
		"\u0083\u0084\7?\2\2\u0084\u0092\7?\2\2\u0085\u0086\7#\2\2\u0086\u0092"+
		"\7?\2\2\u0087\u0088\7(\2\2\u0088\u0092\7(\2\2\u0089\u008a\7~\2\2\u008a"+
		"\u0092\7~\2\2\u008b\u0092\t\2\2\2\u008c\u008d\7>\2\2\u008d\u0092\7?\2"+
		"\2\u008e\u0092\t\3\2\2\u008f\u0090\7@\2\2\u0090\u0092\7?\2\2\u0091\u0083"+
		"\3\2\2\2\u0091\u0085\3\2\2\2\u0091\u0087\3\2\2\2\u0091\u0089\3\2\2\2\u0091"+
		"\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092$\3\2\2\2\u0093\u0094\5+\26\2\u0094\u0095\7<\2\2\u0095\u0096"+
		"\5+\26\2\u0096&\3\2\2\2\u0097\u0098\t\4\2\2\u0098(\3\2\2\2\u0099\u009c"+
		"\5+\26\2\u009a\u009b\7\60\2\2\u009b\u009d\5+\26\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d*\3\2\2\2\u009e\u00a0\5\'\24\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		",\3\2\2\2\u00a3\u00a7\7$\2\2\u00a4\u00a6\n\5\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab.\3\2\2\2\u00ac\u00ad"+
		"\7k\2\2\u00ad\u00b5\7u\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7\"\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b5\7v\2"+
		"\2\u00b4\u00ac\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b5\60\3\2\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0\64\3\2\2\2\u00c1\u00c3\t\6\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\66\3\2\2\2\t\2\u0091\u009c\u00a1\u00a7\u00b4\u00c4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}