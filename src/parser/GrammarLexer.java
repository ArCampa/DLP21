// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LITENT=13, LITREAL=14, CHAR=15, IDENT=16, 
		LINE_COMMENT=17, MULTILINE_COMMENT=18, WHITESPACE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "LITENT", "LITREAL", "CHAR", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "':'", "'int'", "'float'", "'char'", "'struct'", 
			"'{'", "'}'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "LITENT", "LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16S\n\16\r\16"+
		"\16\16T\3\17\6\17X\n\17\r\17\16\17Y\3\17\3\17\6\17^\n\17\r\17\16\17_\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\22\3\22\3"+
		"\22\3\22\7\22q\n\22\f\22\16\22t\13\22\3\22\5\22w\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\177\n\23\f\23\16\23\u0082\13\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\6\24\u008a\n\24\r\24\16\24\u008b\3\24\3\24\4r\u0080\2\25\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25\3\2\7\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\3\f\f\5\2"+
		"\13\f\17\17\"\"\2\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2"+
		"\2\7/\3\2\2\2\t\61\3\2\2\2\13\65\3\2\2\2\r;\3\2\2\2\17@\3\2\2\2\21G\3"+
		"\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33R\3\2\2\2\35"+
		"W\3\2\2\2\37a\3\2\2\2!e\3\2\2\2#l\3\2\2\2%z\3\2\2\2\'\u0089\3\2\2\2)*"+
		"\7x\2\2*+\7c\2\2+,\7t\2\2,\4\3\2\2\2-.\7=\2\2.\6\3\2\2\2/\60\7<\2\2\60"+
		"\b\3\2\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\n\3\2\2\2\65\66\7"+
		"h\2\2\66\67\7n\2\2\678\7q\2\289\7c\2\29:\7v\2\2:\f\3\2\2\2;<\7e\2\2<="+
		"\7j\2\2=>\7c\2\2>?\7t\2\2?\16\3\2\2\2@A\7u\2\2AB\7v\2\2BC\7t\2\2CD\7w"+
		"\2\2DE\7e\2\2EF\7v\2\2F\20\3\2\2\2GH\7}\2\2H\22\3\2\2\2IJ\7\177\2\2J\24"+
		"\3\2\2\2KL\7*\2\2L\26\3\2\2\2MN\7+\2\2N\30\3\2\2\2OP\7.\2\2P\32\3\2\2"+
		"\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\34\3\2\2\2VX\t\2"+
		"\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7\60\2\2\\^\t"+
		"\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\36\3\2\2\2ab\7)\2\2b"+
		"c\13\2\2\2cd\7)\2\2d \3\2\2\2ei\t\3\2\2fh\t\4\2\2gf\3\2\2\2hk\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2j\"\3\2\2\2ki\3\2\2\2lm\7\61\2\2mn\7\61\2\2nr\3\2"+
		"\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2rp\3\2\2\2sv\3\2\2\2tr\3"+
		"\2\2\2uw\t\5\2\2vu\3\2\2\2wx\3\2\2\2xy\b\22\2\2y$\3\2\2\2z{\7\61\2\2{"+
		"|\7,\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7,\2\2\u0084\u0085\7\61\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\b\23\2\2\u0087&\3\2\2\2\u0088\u008a\t\6\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\b\24\2\2\u008e(\3\2\2\2\13\2TY_irv\u0080\u008b\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}