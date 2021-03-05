// Generated from c:\Users\UO257850\OneDrive - Universidad de Oviedo\clase\DLP\proyecto\DLP21\src\parser\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, LITENT=35, LITREAL=36, CHAR=37, IDENT=38, 
		LINE_COMMENT=39, MULTILINE_COMMENT=40, WHITESPACE=41;
	public static final int
		RULE_start = 0, RULE_tipo = 1, RULE_defVar = 2, RULE_defStruct = 3, RULE_defFunc = 4, 
		RULE_definicion = 5, RULE_asignacion = 6, RULE_operador = 7, RULE_expr = 8, 
		RULE_condicional = 9, RULE_sentencia = 10, RULE_keyword = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "tipo", "defVar", "defStruct", "defFunc", "definicion", "asignacion", 
			"operador", "expr", "condicional", "sentencia", "keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'char'", "'['", "']'", "'var'", "':'", "';'", 
			"'struct'", "'{'", "'}'", "'('", "','", "')'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'if'", "'else'", "'while'", "'println'", "'printsp'", "'return'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "LITENT", 
			"LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << IDENT))) != 0)) {
				{
				{
				setState(24);
				definicion();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(T__2);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(IDENT);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(T__3);
				setState(37);
				match(LITENT);
				setState(38);
				match(T__4);
				setState(39);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefVarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__5);
			setState(43);
			match(IDENT);
			setState(44);
			match(T__6);
			setState(45);
			tipo();
			setState(46);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__8);
			setState(49);
			match(IDENT);
			setState(50);
			match(T__9);
			setState(51);
			sentencia();
			setState(52);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefFuncContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(IDENT);
			setState(55);
			match(T__11);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(56);
				match(IDENT);
				setState(57);
				match(T__6);
				setState(58);
				tipo();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(59);
					match(T__12);
					setState(60);
					match(IDENT);
					setState(61);
					match(T__6);
					setState(62);
					tipo();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__13);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(74);
				match(T__6);
				setState(75);
				tipo();
				}
			}

			setState(78);
			match(T__9);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
				{
				{
				setState(79);
				sentencia();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncContext defFunc() {
			return getRuleContext(DefFuncContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definicion);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				defVar();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				defFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(IDENT);
				setState(93);
				match(T__14);
				setState(94);
				match(IDENT);
				setState(95);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(IDENT);
				setState(97);
				match(T__14);
				setState(98);
				expr(0);
				setState(99);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(106);
				match(CHAR);
				}
				break;
			case 2:
				{
				setState(107);
				match(LITENT);
				}
				break;
			case 3:
				{
				setState(108);
				match(LITREAL);
				}
				break;
			case 4:
				{
				setState(109);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(110);
				match(T__19);
				setState(111);
				tipo();
				setState(112);
				match(T__20);
				setState(113);
				match(IDENT);
				}
				break;
			case 6:
				{
				setState(115);
				match(T__11);
				setState(116);
				expr(0);
				setState(117);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(119);
				match(IDENT);
				setState(120);
				match(T__11);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__19) | (1L << LITENT) | (1L << LITREAL) | (1L << CHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(121);
					expr(0);
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(122);
						match(T__12);
						setState(123);
						expr(0);
						}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(137);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(138);
					operador();
					setState(139);
					expr(5);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__27);
				setState(147);
				match(T__11);
				setState(148);
				expr(0);
				setState(149);
				match(T__13);
				setState(150);
				match(T__9);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
					{
					{
					setState(151);
					sentencia();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__10);
				setState(158);
				match(T__28);
				setState(159);
				match(T__9);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
					{
					{
					setState(160);
					sentencia();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__10);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__29);
				setState(169);
				match(T__11);
				setState(170);
				expr(0);
				setState(171);
				match(T__13);
				setState(172);
				match(T__9);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
					{
					{
					setState(173);
					sentencia();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentencia);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				defVar();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				asignacion();
				}
				break;
			case T__27:
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				condicional();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				keyword();
				setState(187);
				expr(0);
				setState(188);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6B\n\6\f\6\16\6E\13\6"+
		"\7\6G\n\6\f\6\16\6J\13\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\7\6S\n\6\f\6\16"+
		"\6V\13\6\3\6\3\6\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bh\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n\7\n\u0084"+
		"\n\n\f\n\16\n\u0087\13\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\7\n\u0090\n"+
		"\n\f\n\16\n\u0093\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009b\n\13\f"+
		"\13\16\13\u009e\13\13\3\13\3\13\3\13\3\13\7\13\u00a4\n\13\f\13\16\13\u00a7"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b1\n\13\f\13\16"+
		"\13\u00b4\13\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00c1\n\f\3\r\3\r\3\r\2\3\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4"+
		"\3\2\22\35\3\2!$\2\u00d4\2\35\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\62\3\2\2"+
		"\2\n8\3\2\2\2\f\\\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22\u0089\3\2\2\2\24"+
		"\u00b7\3\2\2\2\26\u00c0\3\2\2\2\30\u00c2\3\2\2\2\32\34\5\f\7\2\33\32\3"+
		"\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2"+
		"\2\2 !\7\2\2\3!\3\3\2\2\2\"+\7\3\2\2#+\7\4\2\2$+\7\5\2\2%+\7(\2\2&\'\7"+
		"\6\2\2\'(\7%\2\2()\7\7\2\2)+\5\4\3\2*\"\3\2\2\2*#\3\2\2\2*$\3\2\2\2*%"+
		"\3\2\2\2*&\3\2\2\2+\5\3\2\2\2,-\7\b\2\2-.\7(\2\2./\7\t\2\2/\60\5\4\3\2"+
		"\60\61\7\n\2\2\61\7\3\2\2\2\62\63\7\13\2\2\63\64\7(\2\2\64\65\7\f\2\2"+
		"\65\66\5\26\f\2\66\67\7\r\2\2\67\t\3\2\2\289\7(\2\29H\7\16\2\2:;\7(\2"+
		"\2;<\7\t\2\2<C\5\4\3\2=>\7\17\2\2>?\7(\2\2?@\7\t\2\2@B\5\4\3\2A=\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F:\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KN\7\20\2\2LM\7\t\2\2MO\5\4"+
		"\3\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\7\f\2\2QS\5\26\f\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\r\2\2X\13\3\2\2\2Y"+
		"]\5\6\4\2Z]\5\b\5\2[]\5\n\6\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\r\3\2"+
		"\2\2^_\7(\2\2_`\7\21\2\2`a\7(\2\2ah\7\n\2\2bc\7(\2\2cd\7\21\2\2de\5\22"+
		"\n\2ef\7\n\2\2fh\3\2\2\2g^\3\2\2\2gb\3\2\2\2h\17\3\2\2\2ij\t\2\2\2j\21"+
		"\3\2\2\2kl\b\n\1\2l\u008a\7\'\2\2m\u008a\7%\2\2n\u008a\7&\2\2o\u008a\7"+
		"(\2\2pq\7\26\2\2qr\5\4\3\2rs\7\27\2\2st\7(\2\2t\u008a\3\2\2\2uv\7\16\2"+
		"\2vw\5\22\n\2wx\7\20\2\2x\u008a\3\2\2\2yz\7(\2\2z\u0085\7\16\2\2{\u0080"+
		"\5\22\n\2|}\7\17\2\2}\177\5\22\n\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"{\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\20\2\2\u0089k\3"+
		"\2\2\2\u0089m\3\2\2\2\u0089n\3\2\2\2\u0089o\3\2\2\2\u0089p\3\2\2\2\u0089"+
		"u\3\2\2\2\u0089y\3\2\2\2\u008a\u0091\3\2\2\2\u008b\u008c\f\6\2\2\u008c"+
		"\u008d\5\20\t\2\u008d\u008e\5\22\n\7\u008e\u0090\3\2\2\2\u008f\u008b\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\23\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\36\2\2\u0095\u0096\7\16"+
		"\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7\20\2\2\u0098\u009c\7\f\2\2\u0099"+
		"\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\r\2\2\u00a0\u00a1\7\37\2\2\u00a1\u00a5\7\f\2\2\u00a2\u00a4\5"+
		"\26\f\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\r"+
		"\2\2\u00a9\u00b8\3\2\2\2\u00aa\u00ab\7 \2\2\u00ab\u00ac\7\16\2\2\u00ac"+
		"\u00ad\5\22\n\2\u00ad\u00ae\7\20\2\2\u00ae\u00b2\7\f\2\2\u00af\u00b1\5"+
		"\26\f\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\r"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u0094\3\2\2\2\u00b7\u00aa\3\2\2\2\u00b8"+
		"\25\3\2\2\2\u00b9\u00c1\5\6\4\2\u00ba\u00c1\5\16\b\2\u00bb\u00c1\5\24"+
		"\13\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\5\22\n\2\u00be\u00bf\7\n\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2"+
		"\2\2\u00c0\u00bc\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c3\t\3\2\2\u00c3\31"+
		"\3\2\2\2\23\35*CHNT\\g\u0080\u0085\u0089\u0091\u009c\u00a5\u00b2\u00b7"+
		"\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}