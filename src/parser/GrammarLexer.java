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
<<<<<<< HEAD
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, LITENT=35, LITREAL=36, CHAR=37, IDENT=38, 
		LINE_COMMENT=39, MULTILINE_COMMENT=40, WHITESPACE=41;
=======
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LITENT=9, 
		LITREAL=10, CHAR=11, IDENT=12, LINE_COMMENT=13, MULTILINE_COMMENT=14, 
		WHITESPACE=15;
>>>>>>> parent of b826416 (Grammar ready for testing)
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
<<<<<<< HEAD
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "LITENT", "LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
=======
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "LITENT", 
			"LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
>>>>>>> parent of b826416 (Grammar ready for testing)
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
			null, "'int'", "'float'", "'char'", "'['", "']'", "'var'", "':'", "';'", 
			"'struct'", "'{'", "'}'", "'('", "','", "')'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'if'", "'else'", "'while'", "'println'", "'printsp'", "'return'", "'read'"
=======
			null, "'int'", "'float'", "'char'", "'['", "']'", "'var'", "':'", "';'"
>>>>>>> parent of b826416 (Grammar ready for testing)
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
<<<<<<< HEAD
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "LITENT", 
			"LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
=======
			null, null, null, null, null, null, null, null, null, "LITENT", "LITREAL", 
			"CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
>>>>>>> parent of b826416 (Grammar ready for testing)
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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0109\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\6$\u00cd\n$\r$\16$\u00ce\3%\6%\u00d2\n%\r%\16%\u00d3\3%\3%"+
		"\6%\u00d8\n%\r%\16%\u00d9\3&\3&\3&\3&\3\'\3\'\7\'\u00e2\n\'\f\'\16\'\u00e5"+
		"\13\'\3(\3(\3(\3(\7(\u00eb\n(\f(\16(\u00ee\13(\3(\5(\u00f1\n(\3(\3(\3"+
		")\3)\3)\3)\7)\u00f9\n)\f)\16)\u00fc\13)\3)\3)\3)\3)\3)\3*\6*\u0104\n*"+
		"\r*\16*\u0105\3*\3*\4\u00ec\u00fa\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\7\3"+
		"\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"\2\u010f\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3"+
		"\2\2\2\5Y\3\2\2\2\7_\3\2\2\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17l\3\2"+
		"\2\2\21n\3\2\2\2\23p\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3"+
		"\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%"+
		"\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3"+
		"\2\2\2/\u0092\3\2\2\2\61\u0095\3\2\2\2\63\u0098\3\2\2\2\65\u009b\3\2\2"+
		"\2\67\u009e\3\2\2\29\u00a1\3\2\2\2;\u00a4\3\2\2\2=\u00a9\3\2\2\2?\u00af"+
		"\3\2\2\2A\u00b7\3\2\2\2C\u00bf\3\2\2\2E\u00c6\3\2\2\2G\u00cc\3\2\2\2I"+
		"\u00d1\3\2\2\2K\u00db\3\2\2\2M\u00df\3\2\2\2O\u00e6\3\2\2\2Q\u00f4\3\2"+
		"\2\2S\u0103\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\4\3\2\2\2YZ\7h\2\2Z[\7"+
		"n\2\2[\\\7q\2\2\\]\7c\2\2]^\7v\2\2^\6\3\2\2\2_`\7e\2\2`a\7j\2\2ab\7c\2"+
		"\2bc\7t\2\2c\b\3\2\2\2de\7]\2\2e\n\3\2\2\2fg\7_\2\2g\f\3\2\2\2hi\7x\2"+
		"\2ij\7c\2\2jk\7t\2\2k\16\3\2\2\2lm\7<\2\2m\20\3\2\2\2no\7=\2\2o\22\3\2"+
		"\2\2pq\7u\2\2qr\7v\2\2rs\7t\2\2st\7w\2\2tu\7e\2\2uv\7v\2\2v\24\3\2\2\2"+
		"wx\7}\2\2x\26\3\2\2\2yz\7\177\2\2z\30\3\2\2\2{|\7*\2\2|\32\3\2\2\2}~\7"+
		".\2\2~\34\3\2\2\2\177\u0080\7+\2\2\u0080\36\3\2\2\2\u0081\u0082\7?\2\2"+
		"\u0082 \3\2\2\2\u0083\u0084\7-\2\2\u0084\"\3\2\2\2\u0085\u0086\7/\2\2"+
		"\u0086$\3\2\2\2\u0087\u0088\7,\2\2\u0088&\3\2\2\2\u0089\u008a\7\61\2\2"+
		"\u008a(\3\2\2\2\u008b\u008c\7>\2\2\u008c*\3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		",\3\2\2\2\u008f\u0090\7?\2\2\u0090\u0091\7?\2\2\u0091.\3\2\2\2\u0092\u0093"+
		"\7>\2\2\u0093\u0094\7?\2\2\u0094\60\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097"+
		"\7?\2\2\u0097\62\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a\7?\2\2\u009a\64"+
		"\3\2\2\2\u009b\u009c\7(\2\2\u009c\u009d\7(\2\2\u009d\66\3\2\2\2\u009e"+
		"\u009f\7~\2\2\u009f\u00a0\7~\2\2\u00a08\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7h\2\2\u00a3:\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8<\3\2\2\2\u00a9\u00aa\7y\2\2\u00aa"+
		"\u00ab\7j\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae>\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2"+
		"\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6@\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7r\2\2\u00beB\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5D\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7c\2"+
		"\2\u00c9\u00ca\7f\2\2\u00caF\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"H\3\2\2\2\u00d0\u00d2\t\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7"+
		"\7\60\2\2\u00d6\u00d8\t\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00daJ\3\2\2\2\u00db\u00dc\7"+
		")\2\2\u00dc\u00dd\13\2\2\2\u00dd\u00de\7)\2\2\u00deL\3\2\2\2\u00df\u00e3"+
		"\t\3\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4N\3\2\2\2\u00e5\u00e3\3\2\2\2"+
		"\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb"+
		"\13\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1"+
		"\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b(\2\2\u00f3"+
		"P\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6\u00fa\3\2\2\2"+
		"\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\7,\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b)"+
		"\2\2\u0101R\3\2\2\2\u0102\u0104\t\6\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b*\2\2\u0108T\3\2\2\2\13\2\u00ce\u00d3\u00d9\u00e3\u00ec\u00f0"+
		"\u00fa\u0105\3\b\2\2";
=======
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
>>>>>>> parent of b826416 (Grammar ready for testing)
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}