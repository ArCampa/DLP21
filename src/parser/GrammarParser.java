// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

	import ast.*;
	
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		RULE_start = 0, RULE_definiciones = 1, RULE_definicion = 2, RULE_tipo = 3, 
		RULE_defVar = 4, RULE_defStruct = 5, RULE_defFunc = 6, RULE_params = 7, 
		RULE_asignacion = 8, RULE_operador = 9, RULE_expr = 10, RULE_condicional = 11, 
		RULE_sentencia = 12, RULE_sentencias = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "tipo", "defVar", "defStruct", 
			"defFunc", "params", "asignacion", "operador", "expr", "condicional", 
			"sentencia", "sentencias"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'char'", "'['", "']'", "'var'", "':'", "';'", 
			"'struct'", "'{'", "'}'", "'('", "')'", "','", "'='", "'+'", "'-'", "'*'", 
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
		public Programa ast;
		public DefinicionesContext definiciones;
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((StartContext)_localctx).definiciones = definiciones();
			setState(29);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Programa(((StartContext)_localctx).definiciones.list); 
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

	public static class DefinicionesContext extends ParserRuleContext {
		public List<Definicion> list = new ArrayList<Definicion>();
		public DefinicionContext definicion;
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definiciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(32);
			((DefinicionesContext)_localctx).definicion = definicion();
			_localctx.list.add(((DefinicionesContext)_localctx).definicion.ast);
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

	public static class DefinicionContext extends ParserRuleContext {
		public Definicion ast;
		public DefVarContext defVar;
		public DefStructContext defStruct;
		public DefFuncContext defFunc;
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
		enterRule(_localctx, 4, RULE_definicion);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((DefinicionContext)_localctx).defVar = defVar();
				 ((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defVar.ast; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((DefinicionContext)_localctx).defStruct = defStruct();
				 ((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defStruct.ast;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((DefinicionContext)_localctx).defFunc = defFunc();
				 ((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defFunc.ast;
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

	public static class TipoContext extends ParserRuleContext {
		public Tipo ast;
		public Token IDENT;
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
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__0);
				 ((TipoContext)_localctx).ast =  new TipoInt();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(T__1);
				 ((TipoContext)_localctx).ast =  new TipoFloat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(T__2);
				 ((TipoContext)_localctx).ast =  new TipoChar();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				((TipoContext)_localctx).IDENT = match(IDENT);
				 ((TipoContext)_localctx).ast =  new tipoStruct((((TipoContext)_localctx).IDENT!=null?((TipoContext)_localctx).IDENT.getText():null));
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(T__3);
				setState(55);
				match(LITENT);
				setState(56);
				match(T__4);
				setState(57);
				tipo();
				 ((TipoContext)_localctx).ast =  tipo.ast; 
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
		public DefVar ast;
		public Token IDENT;
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
		enterRule(_localctx, 8, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
			((DefVarContext)_localctx).IDENT = match(IDENT);
			setState(64);
			match(T__6);
			setState(65);
			tipo();
			setState(66);
			match(T__7);
			 _localctx.ast = new DefVar( (((DefVarContext)_localctx).IDENT!=null?((DefVarContext)_localctx).IDENT.getText():null), tipo.ast) 
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
		public DefStruct ast;
		public Token IDENT;
		public SentenciasContext sentencias;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__8);
			setState(70);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(71);
			match(T__9);
			setState(72);
			((DefStructContext)_localctx).sentencias = sentencias();
			setState(73);
			match(T__10);
			 ((DefStructContext)_localctx).ast =  new DefStruct((((DefStructContext)_localctx).IDENT!=null?((DefStructContext)_localctx).IDENT.getText():null), ((DefStructContext)_localctx).sentencias.list); 
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
		public DefFunc ast;
		public Token funcName;
		public ParamsContext params;
		public TipoContext tipo;
		public SentenciasContext sentencias;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((DefFuncContext)_localctx).funcName = match(IDENT);
			setState(77);
			match(T__11);
			setState(78);
			((DefFuncContext)_localctx).params = params();
			setState(79);
			match(T__12);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(80);
				match(T__6);
				setState(81);
				((DefFuncContext)_localctx).tipo = tipo();
				}
			}

			setState(84);
			match(T__9);
			setState(85);
			((DefFuncContext)_localctx).sentencias = sentencias();
			setState(86);
			match(T__10);
			 ((DefFuncContext)_localctx).ast =   new DefFunc(((DefFuncContext)_localctx).IDENT, ((DefFuncContext)_localctx).params.list, ((DefFuncContext)_localctx).tipo.ast, ((DefFuncContext)_localctx).sentencias.list); 
					
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

	public static class ParamsContext extends ParserRuleContext {
		public List<Param> list = new ArrayList<Param>();
		public Token IDENT;
		public TipoContext tipo;
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
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(89);
				((ParamsContext)_localctx).IDENT = match(IDENT);
				setState(90);
				match(T__6);
				setState(91);
				((ParamsContext)_localctx).tipo = tipo();
				 _localctx.list.add(new Param(((ParamsContext)_localctx).IDENT, ((ParamsContext)_localctx).tipo.ast)); 
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(93);
					match(T__13);
					setState(94);
					((ParamsContext)_localctx).IDENT = match(IDENT);
					setState(95);
					match(T__6);
					setState(96);
					((ParamsContext)_localctx).tipo = tipo();
					 _localctx.list.add(new Param(((ParamsContext)_localctx).IDENT, ((ParamsContext)_localctx).tipo.ast)); 
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AsignacionContext extends ParserRuleContext {
		public Asignacion ast;
		public Token left;
		public Token right;
		public Token IDENT;
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
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((AsignacionContext)_localctx).left = match(IDENT);
				setState(110);
				match(T__14);
				setState(111);
				((AsignacionContext)_localctx).right = match(IDENT);
				setState(112);
				match(T__7);
				 ((AsignacionContext)_localctx).ast =  new Asignacion( (((AsignacionContext)_localctx).left!=null?((AsignacionContext)_localctx).left.getText():null), (((AsignacionContext)_localctx).right!=null?((AsignacionContext)_localctx).right.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((AsignacionContext)_localctx).IDENT = match(IDENT);
				setState(115);
				match(T__14);
				setState(116);
				expr(0);
				setState(117);
				match(T__7);
				 _localctx.ast = new Asignacion( (((AsignacionContext)_localctx).IDENT!=null?((AsignacionContext)_localctx).IDENT.getText():null), expr.ast) 
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
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		public Expresion ast;
		public ExprContext l;
		public Token IDENT;
		public TipoContext tipo;
		public OperadorContext operador;
		public ExprContext r;
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				match(CHAR);
				 ((ExprContext)_localctx).ast =  new CharConstant(&CHAR.text);
				}
				break;
			case 2:
				{
				setState(127);
				match(LITENT);
				 ((ExprContext)_localctx).ast =  new IntConstant(&LITENT.text);
				}
				break;
			case 3:
				{
				setState(129);
				match(LITREAL);
				 ((ExprContext)_localctx).ast =  new FloatConstant(&LITREAL.text);
				}
				break;
			case 4:
				{
				setState(131);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Identificador(&IDENT.text);
				}
				break;
			case 5:
				{
				setState(133);
				match(T__19);
				setState(134);
				((ExprContext)_localctx).tipo = tipo();
				setState(135);
				match(T__20);
				setState(136);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Expresion(((ExprContext)_localctx).tipo.ast, (((ExprContext)_localctx).IDENT!=null?((ExprContext)_localctx).IDENT.getText():null));
				}
				break;
			case 6:
				{
				setState(139);
				match(T__11);
				setState(140);
				expr(0);
				setState(141);
				match(T__12);
				 ((ExprContext)_localctx).ast =  new Expresion(&expr.ast);
				}
				break;
			case 7:
				{
				setState(144);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(145);
				match(T__11);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__19) | (1L << LITENT) | (1L << LITREAL) | (1L << CHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(146);
					expr(0);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(147);
						match(T__13);
						setState(148);
						expr(0);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(162);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(163);
					((ExprContext)_localctx).operador = operador();
					setState(164);
					((ExprContext)_localctx).r = expr(5);
					 ((ExprContext)_localctx).ast =  new ExpresionAritmetica(&l.ast, (((ExprContext)_localctx).operador!=null?_input.getText(((ExprContext)_localctx).operador.start,((ExprContext)_localctx).operador.stop):null), ((ExprContext)_localctx).r.ast);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public Condicional ast;
		public ExprContext expr;
		public SentenciasContext ifTrue;
		public SentenciasContext ifFalse;
		public SentenciasContext sentencias;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicional);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__27);
				setState(173);
				match(T__11);
				setState(174);
				((CondicionalContext)_localctx).expr = expr(0);
				setState(175);
				match(T__12);
				setState(176);
				match(T__9);
				setState(177);
				((CondicionalContext)_localctx).ifTrue = sentencias();
				setState(178);
				match(T__10);
				setState(179);
				match(T__28);
				setState(180);
				match(T__9);
				setState(181);
				((CondicionalContext)_localctx).ifFalse = sentencias();
				setState(182);
				match(T__10);
				 ((CondicionalContext)_localctx).ast =  If(((CondicionalContext)_localctx).expr.ast, ((CondicionalContext)_localctx).ifTrue.list, ifFalse.list);
						
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__29);
				setState(186);
				match(T__11);
				setState(187);
				((CondicionalContext)_localctx).expr = expr(0);
				setState(188);
				match(T__12);
				setState(189);
				match(T__9);
				setState(190);
				((CondicionalContext)_localctx).sentencias = sentencias();
				setState(191);
				match(T__10);
				 ((CondicionalContext)_localctx).ast =  new While(((CondicionalContext)_localctx).expr.ast, ((CondicionalContext)_localctx).sentencias.list); 
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
		public Sentencia ast;
		public DefVarContext defVar;
		public AsignacionContext asignacion;
		public CondicionalContext condicional;
		public Token keyword;
		public ExprContext expr;
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
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
		enterRule(_localctx, 24, RULE_sentencia);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((SentenciaContext)_localctx).defVar = defVar();
				 ((SentenciaContext)_localctx).ast =  new Definicion(((SentenciaContext)_localctx).defVar.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((SentenciaContext)_localctx).asignacion = asignacion();
				 ((SentenciaContext)_localctx).ast =  new Asignacion(((SentenciaContext)_localctx).asignacion.ast);
				}
				break;
			case T__27:
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				((SentenciaContext)_localctx).condicional = condicional();
				 ((SentenciaContext)_localctx).ast =  new Condicional(((SentenciaContext)_localctx).condicional.ast);
				}
				break;
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((SentenciaContext)_localctx).keyword = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
					((SentenciaContext)_localctx).keyword = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(207);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new Print((((SentenciaContext)_localctx).keyword!=null?((SentenciaContext)_localctx).keyword.getText():null), ((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(T__32);
				setState(211);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(212);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(T__33);
				setState(216);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(217);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expr.ast);
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

	public static class SentenciasContext extends ParserRuleContext {
		public List<Sentencia> list = new ArrayList<Sentencia>();
		public SentenciaContext sentencia;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
				{
				{
				setState(222);
				((SentenciasContext)_localctx).sentencia = sentencia();
				_localctx.list.add(((SentenciasContext)_localctx).sentencia.ast);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bU\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tf\n\t\f\t\16\ti"+
		"\13\t\7\tk\n\t\f\t\16\tn\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n{\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0098\n\f\f"+
		"\f\16\f\u009b\13\f\7\f\u009d\n\f\f\f\16\f\u00a0\13\f\3\f\5\f\u00a3\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00c5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00df\n\16\3\17\3\17\3\17\7\17\u00e4\n\17\f\17\16\17\u00e7\13\17\3\17"+
		"\2\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\22\35\3\2!\"\2"+
		"\u00f4\2\36\3\2\2\2\4\"\3\2\2\2\6.\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fG\3"+
		"\2\2\2\16N\3\2\2\2\20l\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26\u00a2\3\2\2"+
		"\2\30\u00c4\3\2\2\2\32\u00de\3\2\2\2\34\u00e5\3\2\2\2\36\37\5\4\3\2\37"+
		" \7\2\2\3 !\b\2\1\2!\3\3\2\2\2\"#\5\6\4\2#$\b\3\1\2$\5\3\2\2\2%&\5\n\6"+
		"\2&\'\b\4\1\2\'/\3\2\2\2()\5\f\7\2)*\b\4\1\2*/\3\2\2\2+,\5\16\b\2,-\b"+
		"\4\1\2-/\3\2\2\2.%\3\2\2\2.(\3\2\2\2.+\3\2\2\2/\7\3\2\2\2\60\61\7\3\2"+
		"\2\61?\b\5\1\2\62\63\7\4\2\2\63?\b\5\1\2\64\65\7\5\2\2\65?\b\5\1\2\66"+
		"\67\7(\2\2\67?\b\5\1\289\7\6\2\29:\7%\2\2:;\7\7\2\2;<\5\b\5\2<=\b\5\1"+
		"\2=?\3\2\2\2>\60\3\2\2\2>\62\3\2\2\2>\64\3\2\2\2>\66\3\2\2\2>8\3\2\2\2"+
		"?\t\3\2\2\2@A\7\b\2\2AB\7(\2\2BC\7\t\2\2CD\5\b\5\2DE\7\n\2\2EF\b\6\1\2"+
		"F\13\3\2\2\2GH\7\13\2\2HI\7(\2\2IJ\7\f\2\2JK\5\34\17\2KL\7\r\2\2LM\b\7"+
		"\1\2M\r\3\2\2\2NO\7(\2\2OP\7\16\2\2PQ\5\20\t\2QT\7\17\2\2RS\7\t\2\2SU"+
		"\5\b\5\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\f\2\2WX\5\34\17\2XY\7\r\2\2"+
		"YZ\b\b\1\2Z\17\3\2\2\2[\\\7(\2\2\\]\7\t\2\2]^\5\b\5\2^g\b\t\1\2_`\7\20"+
		"\2\2`a\7(\2\2ab\7\t\2\2bc\5\b\5\2cd\b\t\1\2df\3\2\2\2e_\3\2\2\2fi\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2j[\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2m\21\3\2\2\2nl\3\2\2\2op\7(\2\2pq\7\21\2\2qr\7(\2\2rs\7"+
		"\n\2\2s{\b\n\1\2tu\7(\2\2uv\7\21\2\2vw\5\26\f\2wx\7\n\2\2xy\b\n\1\2y{"+
		"\3\2\2\2zo\3\2\2\2zt\3\2\2\2{\23\3\2\2\2|}\t\2\2\2}\25\3\2\2\2~\177\b"+
		"\f\1\2\177\u0080\7\'\2\2\u0080\u00a3\b\f\1\2\u0081\u0082\7%\2\2\u0082"+
		"\u00a3\b\f\1\2\u0083\u0084\7&\2\2\u0084\u00a3\b\f\1\2\u0085\u0086\7(\2"+
		"\2\u0086\u00a3\b\f\1\2\u0087\u0088\7\26\2\2\u0088\u0089\5\b\5\2\u0089"+
		"\u008a\7\27\2\2\u008a\u008b\7(\2\2\u008b\u008c\b\f\1\2\u008c\u00a3\3\2"+
		"\2\2\u008d\u008e\7\16\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\17\2\2\u0090"+
		"\u0091\b\f\1\2\u0091\u00a3\3\2\2\2\u0092\u0093\7(\2\2\u0093\u009e\7\16"+
		"\2\2\u0094\u0099\5\26\f\2\u0095\u0096\7\20\2\2\u0096\u0098\5\26\f\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0094\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\17\2\2\u00a2~\3\2\2\2\u00a2\u0081"+
		"\3\2\2\2\u00a2\u0083\3\2\2\2\u00a2\u0085\3\2\2\2\u00a2\u0087\3\2\2\2\u00a2"+
		"\u008d\3\2\2\2\u00a2\u0092\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\f\6"+
		"\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\5\26\f\7\u00a7\u00a8\b\f\1\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af"+
		"\7\36\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\7\17\2"+
		"\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5\7\r\2\2\u00b5"+
		"\u00b6\7\37\2\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9"+
		"\7\r\2\2\u00b9\u00ba\b\r\1\2\u00ba\u00c5\3\2\2\2\u00bb\u00bc\7 \2\2\u00bc"+
		"\u00bd\7\16\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\17\2\2\u00bf\u00c0"+
		"\7\f\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\b\r\1\2"+
		"\u00c3\u00c5\3\2\2\2\u00c4\u00ae\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c5\31"+
		"\3\2\2\2\u00c6\u00c7\5\n\6\2\u00c7\u00c8\b\16\1\2\u00c8\u00df\3\2\2\2"+
		"\u00c9\u00ca\5\22\n\2\u00ca\u00cb\b\16\1\2\u00cb\u00df\3\2\2\2\u00cc\u00cd"+
		"\5\30\r\2\u00cd\u00ce\b\16\1\2\u00ce\u00df\3\2\2\2\u00cf\u00d0\t\3\2\2"+
		"\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\b\16\1\2\u00d3\u00df"+
		"\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\7\n\2\2\u00d7"+
		"\u00d8\b\16\1\2\u00d8\u00df\3\2\2\2\u00d9\u00da\7$\2\2\u00da\u00db\5\26"+
		"\f\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\b\16\1\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00c6\3\2\2\2\u00de\u00c9\3\2\2\2\u00de\u00cc\3\2\2\2\u00de\u00cf\3\2"+
		"\2\2\u00de\u00d4\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\33\3\2\2\2\u00e0\u00e1"+
		"\5\32\16\2\u00e1\u00e2\b\17\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3\2\2"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\35"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\17.>Tglz\u0099\u009e\u00a2\u00ab\u00c4\u00de"+
		"\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}