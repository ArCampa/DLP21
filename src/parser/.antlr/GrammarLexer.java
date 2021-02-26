// Generated from c:\Users\UO257850\OneDrive - Universidad de Oviedo\clase\DLP\proyecto\DLP21\src\parser\Grammar.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LITENT=9, 
		LITREAL=10, CHAR=11, IDENT=12, LINE_COMMENT=13, MULTILINE_COMMENT=14, 
		WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "LITENT", 
			"LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'char'", "'['", "']'", "'var'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "LITENT", "LITREAL", 
			"CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\6\n>\n\n\r\n\16\n?\3\13\6\13C\n\13\r\13\16\13D"+
		"\3\13\3\13\6\13I\n\13\r\13\16\13J\3\f\3\f\3\f\3\f\3\r\3\r\7\rS\n\r\f\r"+
		"\16\rV\13\r\3\16\3\16\3\16\3\16\7\16\\\n\16\f\16\16\16_\13\16\3\16\5\16"+
		"b\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17j\n\17\f\17\16\17m\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\6\20u\n\20\r\20\16\20v\3\20\3\20\4]k\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\7\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"\2"+
		"\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2"+
		"\5%\3\2\2\2\7+\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\178\3\2"+
		"\2\2\21:\3\2\2\2\23=\3\2\2\2\25B\3\2\2\2\27L\3\2\2\2\31P\3\2\2\2\33W\3"+
		"\2\2\2\35e\3\2\2\2\37t\3\2\2\2!\"\7k\2\2\"#\7p\2\2#$\7v\2\2$\4\3\2\2\2"+
		"%&\7h\2\2&\'\7n\2\2\'(\7q\2\2()\7c\2\2)*\7v\2\2*\6\3\2\2\2+,\7e\2\2,-"+
		"\7j\2\2-.\7c\2\2./\7t\2\2/\b\3\2\2\2\60\61\7]\2\2\61\n\3\2\2\2\62\63\7"+
		"_\2\2\63\f\3\2\2\2\64\65\7x\2\2\65\66\7c\2\2\66\67\7t\2\2\67\16\3\2\2"+
		"\289\7<\2\29\20\3\2\2\2:;\7=\2\2;\22\3\2\2\2<>\t\2\2\2=<\3\2\2\2>?\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@\24\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EF\3\2\2\2FH\7\60\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LM\7)\2\2MN\13\2\2\2NO\7)\2\2O\30\3\2\2"+
		"\2PT\t\3\2\2QS\t\4\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\32\3\2"+
		"\2\2VT\3\2\2\2WX\7\61\2\2XY\7\61\2\2Y]\3\2\2\2Z\\\13\2\2\2[Z\3\2\2\2\\"+
		"_\3\2\2\2]^\3\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\t\5\2\2a`\3\2\2\2"+
		"bc\3\2\2\2cd\b\16\2\2d\34\3\2\2\2ef\7\61\2\2fg\7,\2\2gk\3\2\2\2hj\13\2"+
		"\2\2ih\3\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7,"+
		"\2\2op\7\61\2\2pq\3\2\2\2qr\b\17\2\2r\36\3\2\2\2su\t\6\2\2ts\3\2\2\2u"+
		"v\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\20\2\2y \3\2\2\2\13\2?DJT"+
		"]akv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}