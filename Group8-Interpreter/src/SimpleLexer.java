// Generated from c:\Users\Bob Kyle\Documents\3rd Year\2nd Sem\Group8-Interpreter\Group8-Interpreter\src\Simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, FLOAT=9, 
		CHAR=10, STRING=11, BOOL=12, BEGIN=13, END=14, IDENTIFIER=15, NEWLINE=16, 
		WS=17, COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INT", "FLOAT", 
			"CHAR", "STRING", "BOOL", "BEGIN", "END", "IDENTIFIER", "NEWLINE", "WS", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'INT'", "'FLOAT'", "'CHAR'", "'STRING'", "'BOOL'", 
			null, null, null, null, null, "'BEGIN CODE'", "'END CODE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT", "FLOAT", "CHAR", 
			"STRING", "BOOL", "BEGIN", "END", "IDENTIFIER", "NEWLINE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\6\tH\n\t\r\t\16\tI\3\n\6\nM\n\n\r\n\16\nN\3\n\3\n\7\nS\n\n\f\n\16"+
		"\nV\13\n\3\n\3\n\6\nZ\n\n\r\n\16\n[\5\n^\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\7\ff\n\f\f\f\16\fi\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\rz\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20"+
		"\u0092\n\20\f\20\16\20\u0095\13\20\3\21\5\21\u0098\n\21\3\21\3\21\3\22"+
		"\6\22\u009d\n\22\r\22\16\22\u009e\3\22\3\22\3\23\3\23\7\23\u00a5\n\23"+
		"\f\23\16\23\u00a8\13\23\3\23\3\23\3g\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00b5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t/\3\2\2\2\13\65\3\2\2\2"+
		"\r:\3\2\2\2\17A\3\2\2\2\21G\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27c\3\2\2"+
		"\2\31y\3\2\2\2\33{\3\2\2\2\35\u0086\3\2\2\2\37\u008f\3\2\2\2!\u0097\3"+
		"\2\2\2#\u009c\3\2\2\2%\u00a2\3\2\2\2\'(\7?\2\2(\4\3\2\2\2)*\7.\2\2*\6"+
		"\3\2\2\2+,\7K\2\2,-\7P\2\2-.\7V\2\2.\b\3\2\2\2/\60\7H\2\2\60\61\7N\2\2"+
		"\61\62\7Q\2\2\62\63\7C\2\2\63\64\7V\2\2\64\n\3\2\2\2\65\66\7E\2\2\66\67"+
		"\7J\2\2\678\7C\2\289\7T\2\29\f\3\2\2\2:;\7U\2\2;<\7V\2\2<=\7T\2\2=>\7"+
		"K\2\2>?\7P\2\2?@\7I\2\2@\16\3\2\2\2AB\7D\2\2BC\7Q\2\2CD\7Q\2\2DE\7N\2"+
		"\2E\20\3\2\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\22\3"+
		"\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\7"+
		"\60\2\2QS\t\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U^\3\2\2\2VT"+
		"\3\2\2\2WY\7\60\2\2XZ\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\^\3\2\2\2]L\3\2\2\2]W\3\2\2\2^\24\3\2\2\2_`\7)\2\2`a\13\2\2\2ab\7)\2"+
		"\2b\26\3\2\2\2cg\7$\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2"+
		"\2\2hj\3\2\2\2ig\3\2\2\2jk\7$\2\2k\30\3\2\2\2lm\7$\2\2mn\7V\2\2no\7T\2"+
		"\2op\7W\2\2pq\7G\2\2qz\7$\2\2rs\7$\2\2st\7H\2\2tu\7C\2\2uv\7N\2\2vw\7"+
		"U\2\2wx\7G\2\2xz\7$\2\2yl\3\2\2\2yr\3\2\2\2z\32\3\2\2\2{|\7D\2\2|}\7G"+
		"\2\2}~\7I\2\2~\177\7K\2\2\177\u0080\7P\2\2\u0080\u0081\7\"\2\2\u0081\u0082"+
		"\7E\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7F\2\2\u0084\u0085\7G\2\2\u0085"+
		"\34\3\2\2\2\u0086\u0087\7G\2\2\u0087\u0088\7P\2\2\u0088\u0089\7F\2\2\u0089"+
		"\u008a\7\"\2\2\u008a\u008b\7E\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7F\2"+
		"\2\u008d\u008e\7G\2\2\u008e\36\3\2\2\2\u008f\u0093\t\3\2\2\u0090\u0092"+
		"\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094 \3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\17\2\2"+
		"\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\7\f\2\2\u009a\"\3\2\2\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\b\22\2\2\u00a1$\3\2\2\2\u00a2\u00a6\7%\2\2\u00a3\u00a5"+
		"\n\6\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\23"+
		"\2\2\u00aa&\3\2\2\2\16\2INT[]gy\u0093\u0097\u009e\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}