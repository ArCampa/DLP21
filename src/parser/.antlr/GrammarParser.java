// Generated from c:\Users\UO257850\OneDrive - Universidad de Oviedo\clase\DLP\proyecto\DLP21\src\parser\Grammar.g4 by ANTLR 4.8

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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((DefinicionContext)_localctx).defVar = defVar();
				 ((DefinicionContext)_localctx).ast =  new DefVar(((DefinicionContext)_localctx).defVar.ast );
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((DefinicionContext)_localctx).defStruct = defStruct();
				 ((DefinicionContext)_localctx).ast =  new DefStruct(((DefinicionContext)_localctx).defStruct.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__0);
				 ((TipoContext)_localctx).ast =  new TipoInt();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__1);
				 ((TipoContext)_localctx).ast =  new TipoFloat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__2);
				 ((TipoContext)_localctx).ast =  new TipoChar();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				((TipoContext)_localctx).IDENT = match(IDENT);
				 ((TipoContext)_localctx).ast =  new tipoStruct((((TipoContext)_localctx).IDENT!=null?((TipoContext)_localctx).IDENT.getText():null));
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__3);
				setState(53);
				match(LITENT);
				setState(54);
				match(T__4);
				setState(55);
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
			setState(60);
			match(T__5);
			setState(61);
			((DefVarContext)_localctx).IDENT = match(IDENT);
			setState(62);
			match(T__6);
			setState(63);
			tipo();
			setState(64);
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
		public SentenciaContext sentencia;
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
		enterRule(_localctx, 10, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__8);
			setState(68);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(69);
			match(T__9);
			setState(70);
			((DefStructContext)_localctx).sentencia = sentencia();
			setState(71);
			match(T__10);
			 ((DefStructContext)_localctx).ast =  new DefStruct((((DefStructContext)_localctx).IDENT!=null?((DefStructContext)_localctx).IDENT.getText():null), ((DefStructContext)_localctx).sentencia.ast); 
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
			setState(74);
			((DefFuncContext)_localctx).funcName = match(IDENT);
			setState(75);
			match(T__11);
			setState(76);
			((DefFuncContext)_localctx).params = params();
			setState(77);
			match(T__12);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(78);
				match(T__6);
				setState(79);
				((DefFuncContext)_localctx).tipo = tipo();
				}
			}

			setState(82);
			match(T__9);
			setState(83);
			((DefFuncContext)_localctx).sentencias = sentencias();
			setState(84);
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
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(87);
				((ParamsContext)_localctx).IDENT = match(IDENT);
				setState(88);
				match(T__6);
				setState(89);
				((ParamsContext)_localctx).tipo = tipo();
				 _localctx.list.add(new Param(((ParamsContext)_localctx).IDENT, ((ParamsContext)_localctx).tipo.ast)); 
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(91);
					match(T__13);
					setState(92);
					((ParamsContext)_localctx).IDENT = match(IDENT);
					setState(93);
					match(T__6);
					setState(94);
					((ParamsContext)_localctx).tipo = tipo();
					 _localctx.list.add(new Param(((ParamsContext)_localctx).IDENT, ((ParamsContext)_localctx).tipo.ast)); 
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(106);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((AsignacionContext)_localctx).left = match(IDENT);
				setState(108);
				match(T__14);
				setState(109);
				((AsignacionContext)_localctx).right = match(IDENT);
				setState(110);
				match(T__7);
				 ((AsignacionContext)_localctx).ast =  new Asignacion( (((AsignacionContext)_localctx).left!=null?((AsignacionContext)_localctx).left.getText():null), (((AsignacionContext)_localctx).right!=null?((AsignacionContext)_localctx).right.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((AsignacionContext)_localctx).IDENT = match(IDENT);
				setState(113);
				match(T__14);
				setState(114);
				expr(0);
				setState(115);
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
			setState(120);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				match(CHAR);
				 ((ExprContext)_localctx).ast =  new CharConstant(&CHAR.text);
				}
				break;
			case 2:
				{
				setState(125);
				match(LITENT);
				 ((ExprContext)_localctx).ast =  new IntConstant(&LITENT.text);
				}
				break;
			case 3:
				{
				setState(127);
				match(LITREAL);
				 ((ExprContext)_localctx).ast =  new FloatConstant(&LITREAL.text);
				}
				break;
			case 4:
				{
				setState(129);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Identificador(&IDENT.text);
				}
				break;
			case 5:
				{
				setState(131);
				match(T__19);
				setState(132);
				((ExprContext)_localctx).tipo = tipo();
				setState(133);
				match(T__20);
				setState(134);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Expresion(((ExprContext)_localctx).tipo.ast, (((ExprContext)_localctx).IDENT!=null?((ExprContext)_localctx).IDENT.getText():null));
				}
				break;
			case 6:
				{
				setState(137);
				match(T__11);
				setState(138);
				expr(0);
				setState(139);
				match(T__12);
				 ((ExprContext)_localctx).ast =  new Expresion(&expr.ast);
				}
				break;
			case 7:
				{
				setState(142);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(143);
				match(T__11);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__19) | (1L << LITENT) | (1L << LITREAL) | (1L << CHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(144);
					expr(0);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(145);
						match(T__13);
						setState(146);
						expr(0);
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
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
					setState(160);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(161);
					((ExprContext)_localctx).operador = operador();
					setState(162);
					((ExprContext)_localctx).r = expr(5);
					 ((ExprContext)_localctx).ast =  new ExpresionAritmetica(&l.ast, (((ExprContext)_localctx).operador!=null?_input.getText(((ExprContext)_localctx).operador.start,((ExprContext)_localctx).operador.stop):null), ((ExprContext)_localctx).r.ast);
					}
					} 
				}
				setState(169);
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__27);
				setState(171);
				match(T__11);
				setState(172);
				((CondicionalContext)_localctx).expr = expr(0);
				setState(173);
				match(T__12);
				setState(174);
				match(T__9);
				setState(175);
				((CondicionalContext)_localctx).ifTrue = sentencias();
				setState(176);
				match(T__10);
				setState(177);
				match(T__28);
				setState(178);
				match(T__9);
				setState(179);
				((CondicionalContext)_localctx).ifFalse = sentencias();
				setState(180);
				match(T__10);
				 ((CondicionalContext)_localctx).ast =  If(((CondicionalContext)_localctx).expr.ast, ((CondicionalContext)_localctx).ifTrue.list, ifFalse.list);
						
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__29);
				setState(184);
				match(T__11);
				setState(185);
				((CondicionalContext)_localctx).expr = expr(0);
				setState(186);
				match(T__12);
				setState(187);
				match(T__9);
				setState(188);
				((CondicionalContext)_localctx).sentencias = sentencias();
				setState(189);
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
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((SentenciaContext)_localctx).defVar = defVar();
				 ((SentenciaContext)_localctx).ast =  new Definicion(((SentenciaContext)_localctx).defVar.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((SentenciaContext)_localctx).asignacion = asignacion();
				 ((SentenciaContext)_localctx).ast =  new Asignacion(((SentenciaContext)_localctx).asignacion.ast);
				}
				break;
			case T__27:
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				((SentenciaContext)_localctx).condicional = condicional();
				 ((SentenciaContext)_localctx).ast =  new Condicional(((SentenciaContext)_localctx).condicional.ast);
				}
				break;
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
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
				setState(204);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(205);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new Print((((SentenciaContext)_localctx).keyword!=null?((SentenciaContext)_localctx).keyword.getText():null), ((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(T__32);
				setState(209);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(210);
				match(T__7);
				 ((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				match(T__33);
				setState(214);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(215);
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
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
				{
				{
				setState(220);
				((SentenciasContext)_localctx).sentencia = sentencia();
				_localctx.list.add(((SentenciasContext)_localctx).sentencia.ast);
				}
				}
				setState(227);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\td\n\t\f\t\16\tg\13\t\7\t"+
		"i\n\t\f\t\16\tl\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ny"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099"+
		"\13\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\f\5\f\u00a1\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16"+
		"\3\17\3\17\3\17\7\17\u00e2\n\17\f\17\16\17\u00e5\13\17\3\17\2\3\26\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\22\35\3\2!\"\2\u00f2\2\36"+
		"\3\2\2\2\4\"\3\2\2\2\6,\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fE\3\2\2\2\16L\3"+
		"\2\2\2\20j\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u00a0\3\2\2\2\30\u00c2\3"+
		"\2\2\2\32\u00dc\3\2\2\2\34\u00e3\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 !\b"+
		"\2\1\2!\3\3\2\2\2\"#\5\6\4\2#$\b\3\1\2$\5\3\2\2\2%&\5\n\6\2&\'\b\4\1\2"+
		"\'-\3\2\2\2()\5\f\7\2)*\b\4\1\2*-\3\2\2\2+-\5\16\b\2,%\3\2\2\2,(\3\2\2"+
		"\2,+\3\2\2\2-\7\3\2\2\2./\7\3\2\2/=\b\5\1\2\60\61\7\4\2\2\61=\b\5\1\2"+
		"\62\63\7\5\2\2\63=\b\5\1\2\64\65\7(\2\2\65=\b\5\1\2\66\67\7\6\2\2\678"+
		"\7%\2\289\7\7\2\29:\5\b\5\2:;\b\5\1\2;=\3\2\2\2<.\3\2\2\2<\60\3\2\2\2"+
		"<\62\3\2\2\2<\64\3\2\2\2<\66\3\2\2\2=\t\3\2\2\2>?\7\b\2\2?@\7(\2\2@A\7"+
		"\t\2\2AB\5\b\5\2BC\7\n\2\2CD\b\6\1\2D\13\3\2\2\2EF\7\13\2\2FG\7(\2\2G"+
		"H\7\f\2\2HI\5\32\16\2IJ\7\r\2\2JK\b\7\1\2K\r\3\2\2\2LM\7(\2\2MN\7\16\2"+
		"\2NO\5\20\t\2OR\7\17\2\2PQ\7\t\2\2QS\5\b\5\2RP\3\2\2\2RS\3\2\2\2ST\3\2"+
		"\2\2TU\7\f\2\2UV\5\34\17\2VW\7\r\2\2WX\b\b\1\2X\17\3\2\2\2YZ\7(\2\2Z["+
		"\7\t\2\2[\\\5\b\5\2\\e\b\t\1\2]^\7\20\2\2^_\7(\2\2_`\7\t\2\2`a\5\b\5\2"+
		"ab\b\t\1\2bd\3\2\2\2c]\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2hY\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\21\3\2\2\2lj\3\2\2"+
		"\2mn\7(\2\2no\7\21\2\2op\7(\2\2pq\7\n\2\2qy\b\n\1\2rs\7(\2\2st\7\21\2"+
		"\2tu\5\26\f\2uv\7\n\2\2vw\b\n\1\2wy\3\2\2\2xm\3\2\2\2xr\3\2\2\2y\23\3"+
		"\2\2\2z{\t\2\2\2{\25\3\2\2\2|}\b\f\1\2}~\7\'\2\2~\u00a1\b\f\1\2\177\u0080"+
		"\7%\2\2\u0080\u00a1\b\f\1\2\u0081\u0082\7&\2\2\u0082\u00a1\b\f\1\2\u0083"+
		"\u0084\7(\2\2\u0084\u00a1\b\f\1\2\u0085\u0086\7\26\2\2\u0086\u0087\5\b"+
		"\5\2\u0087\u0088\7\27\2\2\u0088\u0089\7(\2\2\u0089\u008a\b\f\1\2\u008a"+
		"\u00a1\3\2\2\2\u008b\u008c\7\16\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7"+
		"\17\2\2\u008e\u008f\b\f\1\2\u008f\u00a1\3\2\2\2\u0090\u0091\7(\2\2\u0091"+
		"\u009c\7\16\2\2\u0092\u0097\5\26\f\2\u0093\u0094\7\20\2\2\u0094\u0096"+
		"\5\26\f\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u0092"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0|\3\2\2\2"+
		"\u00a0\177\3\2\2\2\u00a0\u0081\3\2\2\2\u00a0\u0083\3\2\2\2\u00a0\u0085"+
		"\3\2\2\2\u00a0\u008b\3\2\2\2\u00a0\u0090\3\2\2\2\u00a1\u00a9\3\2\2\2\u00a2"+
		"\u00a3\f\6\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\5\26\f\7\u00a5\u00a6"+
		"\b\f\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00ad\7\36\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\5\26\f\2\u00af"+
		"\u00b0\7\17\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3"+
		"\7\r\2\2\u00b3\u00b4\7\37\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\5\34\17"+
		"\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\b\r\1\2\u00b8\u00c3\3\2\2\2\u00b9\u00ba"+
		"\7 \2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5\26\f\2\u00bc\u00bd\7\17\2\2"+
		"\u00bd\u00be\7\f\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1"+
		"\b\r\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c3"+
		"\31\3\2\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\b\16\1\2\u00c6\u00dd\3\2\2"+
		"\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9\b\16\1\2\u00c9\u00dd\3\2\2\2\u00ca"+
		"\u00cb\5\30\r\2\u00cb\u00cc\b\16\1\2\u00cc\u00dd\3\2\2\2\u00cd\u00ce\t"+
		"\3\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\b\16\1\2\u00d1"+
		"\u00dd\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d4\5\26\f\2\u00d4\u00d5\7\n"+
		"\2\2\u00d5\u00d6\b\16\1\2\u00d6\u00dd\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8"+
		"\u00d9\5\26\f\2\u00d9\u00da\7\n\2\2\u00da\u00db\b\16\1\2\u00db\u00dd\3"+
		"\2\2\2\u00dc\u00c4\3\2\2\2\u00dc\u00c7\3\2\2\2\u00dc\u00ca\3\2\2\2\u00dc"+
		"\u00cd\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\33\3\2\2"+
		"\2\u00de\u00df\5\32\16\2\u00df\u00e0\b\17\1\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\35\3\2\2\2\u00e5\u00e3\3\2\2\2\17,<Rejx\u0097\u009c\u00a0\u00a9"+
		"\u00c2\u00dc\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}