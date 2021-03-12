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
		T__31=32, T__32=33, T__33=34, T__34=35, LITENT=36, LITREAL=37, CHAR=38, 
		IDENT=39, LINE_COMMENT=40, MULTILINE_COMMENT=41, WHITESPACE=42;
	public static final int
		RULE_start = 0, RULE_declaraciones = 1, RULE_variableDefinida = 2, RULE_variable = 3, 
		RULE_tipo = 4, RULE_arrayDefinido = 5, RULE_estructuraDefinida = 6, RULE_variablesStruct = 7, 
		RULE_metodoDefinido = 8, RULE_variablesParametros = 9, RULE_returnTipoOpt = 10, 
		RULE_variablesDefinidas = 11, RULE_expr = 12, RULE_parametrosPasados = 13, 
		RULE_sentencias = 14, RULE_sentencia = 15, RULE_sentenciaCondicional = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaraciones", "variableDefinida", "variable", "tipo", "arrayDefinido", 
			"estructuraDefinida", "variablesStruct", "metodoDefinido", "variablesParametros", 
			"returnTipoOpt", "variablesDefinidas", "expr", "parametrosPasados", "sentencias", 
			"sentencia", "sentenciaCondicional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "':'", "'int'", "'float'", "'char'", "'['", "']'", 
			"'struct'", "'{'", "'}'", "'('", "')'", "','", "'.'", "'*'", "'/'", "'+'", 
			"'-'", "'&&'", "'||'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", 
			"'='", "'println'", "'printsp'", "'read'", "'return'", "'if'", "'else'", 
			"'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"LITENT", "LITREAL", "CHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
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
		public DeclaracionesContext declaraciones;
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
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
			setState(34);
			((StartContext)_localctx).declaraciones = declaraciones();
			setState(35);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Programa (((StartContext)_localctx).declaraciones.list);
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public List<Definicion> list = new ArrayList<Definicion>();;
		public VariableDefinidaContext variableDefinida;
		public EstructuraDefinidaContext estructuraDefinida;
		public MetodoDefinidoContext metodoDefinido;
		public List<VariableDefinidaContext> variableDefinida() {
			return getRuleContexts(VariableDefinidaContext.class);
		}
		public VariableDefinidaContext variableDefinida(int i) {
			return getRuleContext(VariableDefinidaContext.class,i);
		}
		public List<EstructuraDefinidaContext> estructuraDefinida() {
			return getRuleContexts(EstructuraDefinidaContext.class);
		}
		public EstructuraDefinidaContext estructuraDefinida(int i) {
			return getRuleContext(EstructuraDefinidaContext.class,i);
		}
		public List<MetodoDefinidoContext> metodoDefinido() {
			return getRuleContexts(MetodoDefinidoContext.class);
		}
		public MetodoDefinidoContext metodoDefinido(int i) {
			return getRuleContext(MetodoDefinidoContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << IDENT))) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(38);
					((DeclaracionesContext)_localctx).variableDefinida = variableDefinida();
					_localctx.list.add(((DeclaracionesContext)_localctx).variableDefinida.ast);
					}
					break;
				case T__8:
					{
					setState(41);
					((DeclaracionesContext)_localctx).estructuraDefinida = estructuraDefinida();
					_localctx.list.add(((DeclaracionesContext)_localctx).estructuraDefinida.ast);
					}
					break;
				case IDENT:
					{
					setState(44);
					((DeclaracionesContext)_localctx).metodoDefinido = metodoDefinido();
					_localctx.list.add(((DeclaracionesContext)_localctx).metodoDefinido.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
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

	public static class VariableDefinidaContext extends ParserRuleContext {
		public Definicion ast;
		public VariableContext variable;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableDefinidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinida; }
	}

	public final VariableDefinidaContext variableDefinida() throws RecognitionException {
		VariableDefinidaContext _localctx = new VariableDefinidaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDefinida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			((VariableDefinidaContext)_localctx).variable = variable();
			((VariableDefinidaContext)_localctx).ast =  new VariableDefinida(((VariableDefinidaContext)_localctx).variable.ast);
			setState(55);
			match(T__1);
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

	public static class VariableContext extends ParserRuleContext {
		public Variable ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((VariableContext)_localctx).IDENT = match(IDENT);
			setState(58);
			match(T__2);
			setState(59);
			((VariableContext)_localctx).tipo = tipo();
			 ((VariableContext)_localctx).ast =  new Variable(((VariableContext)_localctx).IDENT , ((VariableContext)_localctx).tipo.ast);
					
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
		public ExprContext num;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__3);
				((TipoContext)_localctx).ast =  new TipoInt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__4);
				((TipoContext)_localctx).ast =  new TipoFloat();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__5);
				((TipoContext)_localctx).ast =  new TipoChar();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				((TipoContext)_localctx).IDENT = match(IDENT);
				((TipoContext)_localctx).ast =  new TipoStruct(((TipoContext)_localctx).IDENT);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(T__6);
				setState(71);
				((TipoContext)_localctx).num = expr(0);
				setState(72);
				match(T__7);
				setState(73);
				((TipoContext)_localctx).tipo = tipo();
				((TipoContext)_localctx).ast =  new TipoArray(((TipoContext)_localctx).num.ast, ((TipoContext)_localctx).tipo.ast);
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

	public static class ArrayDefinidoContext extends ParserRuleContext {
		public ArrayDefinido ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ArrayDefinidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefinido; }
	}

	public final ArrayDefinidoContext arrayDefinido() throws RecognitionException {
		ArrayDefinidoContext _localctx = new ArrayDefinidoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDefinido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			((ArrayDefinidoContext)_localctx).IDENT = match(IDENT);
			setState(80);
			match(T__2);
			setState(81);
			((ArrayDefinidoContext)_localctx).tipo = tipo();
			((ArrayDefinidoContext)_localctx).ast =  new ArrayDefinido(((ArrayDefinidoContext)_localctx).IDENT, ((ArrayDefinidoContext)_localctx).tipo.ast);
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

	public static class EstructuraDefinidaContext extends ParserRuleContext {
		public Definicion ast;
		public Token IDENT;
		public VariablesStructContext variablesStruct;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public VariablesStructContext variablesStruct() {
			return getRuleContext(VariablesStructContext.class,0);
		}
		public EstructuraDefinidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraDefinida; }
	}

	public final EstructuraDefinidaContext estructuraDefinida() throws RecognitionException {
		EstructuraDefinidaContext _localctx = new EstructuraDefinidaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_estructuraDefinida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__8);
			setState(85);
			((EstructuraDefinidaContext)_localctx).IDENT = match(IDENT);
			setState(86);
			match(T__9);
			setState(87);
			((EstructuraDefinidaContext)_localctx).variablesStruct = variablesStruct();
			setState(88);
			match(T__10);
			setState(89);
			match(T__1);
			 ((EstructuraDefinidaContext)_localctx).ast =  new EstructuraDefinida(((EstructuraDefinidaContext)_localctx).IDENT, ((EstructuraDefinidaContext)_localctx).variablesStruct.list);
					
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

	public static class VariablesStructContext extends ParserRuleContext {
		public List<Variable> list = new ArrayList<Variable>();;
		public VariableContext variable;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesStruct; }
	}

	public final VariablesStructContext variablesStruct() throws RecognitionException {
		VariablesStructContext _localctx = new VariablesStructContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variablesStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(92);
				((VariablesStructContext)_localctx).variable = variable();
				_localctx.list.add(((VariablesStructContext)_localctx).variable.ast);
				setState(94);
				match(T__1);
				}
				}
				setState(100);
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

	public static class MetodoDefinidoContext extends ParserRuleContext {
		public Definicion ast;
		public VariablesParametrosContext variablesParametros;
		public ReturnTipoOptContext returnTipoOpt;
		public VariablesDefinidasContext variablesDefinidas;
		public SentenciasContext sentencias;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public VariablesParametrosContext variablesParametros() {
			return getRuleContext(VariablesParametrosContext.class,0);
		}
		public ReturnTipoOptContext returnTipoOpt() {
			return getRuleContext(ReturnTipoOptContext.class,0);
		}
		public VariablesDefinidasContext variablesDefinidas() {
			return getRuleContext(VariablesDefinidasContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public MetodoDefinidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoDefinido; }
	}

	public final MetodoDefinidoContext metodoDefinido() throws RecognitionException {
		MetodoDefinidoContext _localctx = new MetodoDefinidoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_metodoDefinido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IDENT);
			setState(102);
			match(T__11);
			setState(103);
			((MetodoDefinidoContext)_localctx).variablesParametros = variablesParametros();
			setState(104);
			match(T__12);
			setState(105);
			((MetodoDefinidoContext)_localctx).returnTipoOpt = returnTipoOpt();
			setState(106);
			match(T__9);
			setState(107);
			((MetodoDefinidoContext)_localctx).variablesDefinidas = variablesDefinidas();
			setState(108);
			((MetodoDefinidoContext)_localctx).sentencias = sentencias();
			setState(109);
			match(T__10);
			 
				if(((MetodoDefinidoContext)_localctx).returnTipoOpt.list.size()==1)
			    { ((MetodoDefinidoContext)_localctx).ast =  new MetodoDefinido(((MetodoDefinidoContext)_localctx).variablesParametros.list, ((MetodoDefinidoContext)_localctx).returnTipoOpt.list.get(0), ((MetodoDefinidoContext)_localctx).variablesDefinidas.list, ((MetodoDefinidoContext)_localctx).sentencias.list);}
			    else
			    {((MetodoDefinidoContext)_localctx).ast =  new MetodoDefinido(((MetodoDefinidoContext)_localctx).variablesParametros.list, null, ((MetodoDefinidoContext)_localctx).variablesDefinidas.list, ((MetodoDefinidoContext)_localctx).sentencias.list);}
					
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

	public static class VariablesParametrosContext extends ParserRuleContext {
		public List<Variable> list = new ArrayList<Variable>();;
		public VariableContext primero;
		public VariableContext variable;
		public VariableContext otro;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesParametros; }
	}

	public final VariablesParametrosContext variablesParametros() throws RecognitionException {
		VariablesParametrosContext _localctx = new VariablesParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variablesParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(112);
				((VariablesParametrosContext)_localctx).primero = ((VariablesParametrosContext)_localctx).variable = variable();
				_localctx.list.add(((VariablesParametrosContext)_localctx).variable.ast);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(114);
					match(T__13);
					setState(115);
					((VariablesParametrosContext)_localctx).otro = ((VariablesParametrosContext)_localctx).variable = variable();
					_localctx.list.add(((VariablesParametrosContext)_localctx).variable.ast);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ReturnTipoOptContext extends ParserRuleContext {
		public List<Tipo> list = new ArrayList<Tipo>();;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ReturnTipoOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTipoOpt; }
	}

	public final ReturnTipoOptContext returnTipoOpt() throws RecognitionException {
		ReturnTipoOptContext _localctx = new ReturnTipoOptContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnTipoOpt);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__2);
				setState(126);
				((ReturnTipoOptContext)_localctx).tipo = tipo();
				_localctx.list.add(((ReturnTipoOptContext)_localctx).tipo.ast);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VariablesDefinidasContext extends ParserRuleContext {
		public List<VariableDefinida> list = new ArrayList<VariableDefinida>();;
		public VariableDefinidaContext variableDefinida;
		public List<VariableDefinidaContext> variableDefinida() {
			return getRuleContexts(VariableDefinidaContext.class);
		}
		public VariableDefinidaContext variableDefinida(int i) {
			return getRuleContext(VariableDefinidaContext.class,i);
		}
		public VariablesDefinidasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesDefinidas; }
	}

	public final VariablesDefinidasContext variablesDefinidas() throws RecognitionException {
		VariablesDefinidasContext _localctx = new VariablesDefinidasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variablesDefinidas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(132);
				((VariablesDefinidasContext)_localctx).variableDefinida = variableDefinida();
				_localctx.list.add((VariableDefinida) ((VariablesDefinidasContext)_localctx).variableDefinida.ast);
						
				}
				}
				setState(139);
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

	public static class ExprContext extends ParserRuleContext {
		public Expresion ast;
		public ExprContext prev;
		public ExprContext id;
		public ExprContext l;
		public ExprContext expr;
		public Token IDENT;
		public Token constante;
		public Token nombre;
		public ParametrosPasadosContext parametrosPasados;
		public Token op;
		public ExprContext r;
		public ExprContext pos;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public ParametrosPasadosContext parametrosPasados() {
			return getRuleContext(ParametrosPasadosContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(141);
				match(T__11);
				setState(142);
				((ExprContext)_localctx).expr = expr(0);
				setState(143);
				match(T__12);
				((ExprContext)_localctx).ast =  new ExpresionParentesis(((ExprContext)_localctx).expr.ast);
				}
				break;
			case 2:
				{
				setState(146);
				((ExprContext)_localctx).IDENT = match(IDENT);
				((ExprContext)_localctx).ast =  new ExpresionIdent(((ExprContext)_localctx).IDENT);
				}
				break;
			case 3:
				{
				setState(148);
				((ExprContext)_localctx).constante = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITENT) | (1L << LITREAL) | (1L << CHAR))) != 0)) ) {
					((ExprContext)_localctx).constante = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ExprContext)_localctx).ast =  new
					ExpresionConstante((((ExprContext)_localctx).constante!=null?((ExprContext)_localctx).constante.getText():null));
				}
				break;
			case 4:
				{
				setState(150);
				((ExprContext)_localctx).nombre = match(IDENT);
				setState(151);
				match(T__11);
				setState(152);
				((ExprContext)_localctx).parametrosPasados = parametrosPasados();
				setState(153);
				match(T__12);
						
					((ExprContext)_localctx).ast =  new ExpresionLlamadaMetodo((((ExprContext)_localctx).nombre!=null?((ExprContext)_localctx).nombre.getText():null), ((ExprContext)_localctx).parametrosPasados.list);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(159);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).ast =  new ExpresionAritmetica(((ExprContext)_localctx).l.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).r.ast); 
						          		
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).ast =  new ExpresionAritmetica(((ExprContext)_localctx).l.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).r.ast); 
						          		
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).ast =  new ExpresionLogica(((ExprContext)_localctx).l.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).r.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(2);
						((ExprContext)_localctx).ast =  new ExpresionLogica(((ExprContext)_localctx).l.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),
						          	((ExprContext)_localctx).r.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.prev = _prevctx;
						_localctx.prev = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(179);
						match(T__14);
						setState(180);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new ExpresionCampoStruct(((ExprContext)_localctx).prev.ast, ((ExprContext)_localctx).IDENT);
						          		
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.id = _prevctx;
						_localctx.id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(183);
						match(T__6);
						setState(184);
						((ExprContext)_localctx).pos = ((ExprContext)_localctx).expr = expr(0);
						setState(185);
						match(T__7);
						((ExprContext)_localctx).ast =  new ExpresionArray(((ExprContext)_localctx).id.ast, ((ExprContext)_localctx).pos.ast);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ParametrosPasadosContext extends ParserRuleContext {
		public List<Expresion> list = new ArrayList<Expresion>();;
		public ExprContext var1;
		public ExprContext varX;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParametrosPasadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosPasados; }
	}

	public final ParametrosPasadosContext parametrosPasados() throws RecognitionException {
		ParametrosPasadosContext _localctx = new ParametrosPasadosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametrosPasados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << LITENT) | (1L << LITREAL) | (1L << CHAR) | (1L << IDENT))) != 0)) {
				{
				setState(193);
				((ParametrosPasadosContext)_localctx).var1 = expr(0);
				  _localctx.list.add(((ParametrosPasadosContext)_localctx).var1.ast);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(195);
					match(T__13);
					setState(196);
					((ParametrosPasadosContext)_localctx).varX = expr(0);
					  _localctx.list.add(((ParametrosPasadosContext)_localctx).varX.ast);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class SentenciasContext extends ParserRuleContext {
		public List<Sentencia> list = new ArrayList<Sentencia>();;
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
		enterRule(_localctx, 28, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << LITENT) | (1L << LITREAL) | (1L << CHAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(206);
				((SentenciasContext)_localctx).sentencia = sentencia();
				_localctx.list.add(((SentenciasContext)_localctx).sentencia.ast);
				}
				}
				setState(213);
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

	public static class SentenciaContext extends ParserRuleContext {
		public Sentencia ast;
		public ExprContext expr;
		public ExprContext l;
		public ExprContext r;
		public SentenciaCondicionalContext sentenciaCondicional;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SentenciaCondicionalContext sentenciaCondicional() {
			return getRuleContext(SentenciaCondicionalContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentencia);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(215);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaExpresion(((SentenciaContext)_localctx).expr.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				((SentenciaContext)_localctx).l = expr(0);
				setState(219);
				match(T__27);
				setState(220);
				((SentenciaContext)_localctx).r = expr(0);
				setState(221);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaAsignacion( ((SentenciaContext)_localctx).l.ast, ((SentenciaContext)_localctx).r.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				((SentenciaContext)_localctx).sentenciaCondicional = sentenciaCondicional();
				((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).sentenciaCondicional.ast;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(229);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaPrint(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(T__30);
				setState(233);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(234);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaRead(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				match(T__31);
				setState(238);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(239);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaReturn(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaPrintVoid();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				match(T__31);
				setState(246);
				expr(0);
				setState(247);
				match(T__1);
				((SentenciaContext)_localctx).ast =  new SentenciaReturnVoid();
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

	public static class SentenciaCondicionalContext extends ParserRuleContext {
		public Sentencia ast;
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
		public SentenciaCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaCondicional; }
	}

	public final SentenciaCondicionalContext sentenciaCondicional() throws RecognitionException {
		SentenciaCondicionalContext _localctx = new SentenciaCondicionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sentenciaCondicional);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__32);
				setState(253);
				match(T__11);
				setState(254);
				((SentenciaCondicionalContext)_localctx).expr = expr(0);
				setState(255);
				match(T__12);
				setState(256);
				match(T__9);
				setState(257);
				((SentenciaCondicionalContext)_localctx).ifTrue = sentencias();
				setState(258);
				match(T__10);
				((SentenciaCondicionalContext)_localctx).ast =  new SentenciaIf(((SentenciaCondicionalContext)_localctx).expr.ast, ((SentenciaCondicionalContext)_localctx).ifTrue.list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(T__32);
				setState(262);
				match(T__11);
				setState(263);
				((SentenciaCondicionalContext)_localctx).expr = expr(0);
				setState(264);
				match(T__12);
				setState(265);
				match(T__9);
				setState(266);
				((SentenciaCondicionalContext)_localctx).ifTrue = sentencias();
				setState(267);
				match(T__10);
				setState(268);
				match(T__33);
				setState(269);
				match(T__9);
				setState(270);
				((SentenciaCondicionalContext)_localctx).ifFalse = sentencias();
				setState(271);
				match(T__10);
				((SentenciaCondicionalContext)_localctx).ast =  new SentenciaIfElse(((SentenciaCondicionalContext)_localctx).expr.ast, ((SentenciaCondicionalContext)_localctx).ifTrue.list, ((SentenciaCondicionalContext)_localctx).ifFalse.list);
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(T__34);
				setState(275);
				match(T__11);
				setState(276);
				((SentenciaCondicionalContext)_localctx).expr = expr(0);
				setState(277);
				match(T__12);
				setState(278);
				match(T__9);
				setState(279);
				((SentenciaCondicionalContext)_localctx).sentencias = sentencias();
				setState(280);
				match(T__10);
				((SentenciaCondicionalContext)_localctx).ast =  new SentenciaWhile(((SentenciaCondicionalContext)_localctx).expr.ast, ((SentenciaCondicionalContext)_localctx).sentencias.list);
						
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16"+
		"\3\65\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tc\n\t\f\t\16\tf\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13y\n\13\f\13\16\13|\13\13\5\13~\n\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0085\n\f\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u009f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00bf\n\16\f\16\16\16\u00c2\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00ca\n\17\f\17\16\17\u00cd\13\17\5\17\u00cf"+
		"\n\17\3\20\3\20\3\20\7\20\u00d4\n\20\f\20\16\20\u00d7\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fd\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011e"+
		"\n\22\3\22\2\3\32\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\b\3\2"+
		"&(\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\35\3\2\37 \2\u012f\2$\3\2\2\2"+
		"\4\63\3\2\2\2\6\66\3\2\2\2\b;\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16V\3\2\2"+
		"\2\20d\3\2\2\2\22g\3\2\2\2\24}\3\2\2\2\26\u0084\3\2\2\2\30\u008b\3\2\2"+
		"\2\32\u009e\3\2\2\2\34\u00ce\3\2\2\2\36\u00d5\3\2\2\2 \u00fc\3\2\2\2\""+
		"\u011d\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\'\b\2\1\2\'\3\3\2\2\2()\5\6\4\2)*"+
		"\b\3\1\2*\62\3\2\2\2+,\5\16\b\2,-\b\3\1\2-\62\3\2\2\2./\5\22\n\2/\60\b"+
		"\3\1\2\60\62\3\2\2\2\61(\3\2\2\2\61+\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66\67\7\3\2\2"+
		"\678\5\b\5\289\b\4\1\29:\7\4\2\2:\7\3\2\2\2;<\7)\2\2<=\7\5\2\2=>\5\n\6"+
		"\2>?\b\5\1\2?\t\3\2\2\2@A\7\6\2\2AO\b\6\1\2BC\7\7\2\2CO\b\6\1\2DE\7\b"+
		"\2\2EO\b\6\1\2FG\7)\2\2GO\b\6\1\2HI\7\t\2\2IJ\5\32\16\2JK\7\n\2\2KL\5"+
		"\n\6\2LM\b\6\1\2MO\3\2\2\2N@\3\2\2\2NB\3\2\2\2ND\3\2\2\2NF\3\2\2\2NH\3"+
		"\2\2\2O\13\3\2\2\2PQ\7\3\2\2QR\7)\2\2RS\7\5\2\2ST\5\n\6\2TU\b\7\1\2U\r"+
		"\3\2\2\2VW\7\13\2\2WX\7)\2\2XY\7\f\2\2YZ\5\20\t\2Z[\7\r\2\2[\\\7\4\2\2"+
		"\\]\b\b\1\2]\17\3\2\2\2^_\5\b\5\2_`\b\t\1\2`a\7\4\2\2ac\3\2\2\2b^\3\2"+
		"\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fd\3\2\2\2gh\7)\2\2hi\7"+
		"\16\2\2ij\5\24\13\2jk\7\17\2\2kl\5\26\f\2lm\7\f\2\2mn\5\30\r\2no\5\36"+
		"\20\2op\7\r\2\2pq\b\n\1\2q\23\3\2\2\2rs\5\b\5\2sz\b\13\1\2tu\7\20\2\2"+
		"uv\5\b\5\2vw\b\13\1\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2}r\3\2\2\2}~\3\2\2\2~\25\3\2\2\2\177\u0080\7\5\2"+
		"\2\u0080\u0081\5\n\6\2\u0081\u0082\b\f\1\2\u0082\u0085\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086"+
		"\u0087\5\6\4\2\u0087\u0088\b\r\1\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\31\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\16\1\2\u008f\u0090\7\16"+
		"\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7\17\2\2\u0092\u0093\b\16\1\2\u0093"+
		"\u009f\3\2\2\2\u0094\u0095\7)\2\2\u0095\u009f\b\16\1\2\u0096\u0097\t\2"+
		"\2\2\u0097\u009f\b\16\1\2\u0098\u0099\7)\2\2\u0099\u009a\7\16\2\2\u009a"+
		"\u009b\5\34\17\2\u009b\u009c\7\17\2\2\u009c\u009d\b\16\1\2\u009d\u009f"+
		"\3\2\2\2\u009e\u008e\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u0098\3\2\2\2\u009f\u00c0\3\2\2\2\u00a0\u00a1\f\6\2\2\u00a1\u00a2\t\3"+
		"\2\2\u00a2\u00a3\5\32\16\7\u00a3\u00a4\b\16\1\2\u00a4\u00bf\3\2\2\2\u00a5"+
		"\u00a6\f\5\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00a8\5\32\16\6\u00a8\u00a9\b"+
		"\16\1\2\u00a9\u00bf\3\2\2\2\u00aa\u00ab\f\4\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		"\u00ad\5\32\16\5\u00ad\u00ae\b\16\1\2\u00ae\u00bf\3\2\2\2\u00af\u00b0"+
		"\f\3\2\2\u00b0\u00b1\t\6\2\2\u00b1\u00b2\5\32\16\4\u00b2\u00b3\b\16\1"+
		"\2\u00b3\u00bf\3\2\2\2\u00b4\u00b5\f\b\2\2\u00b5\u00b6\7\21\2\2\u00b6"+
		"\u00b7\7)\2\2\u00b7\u00bf\b\16\1\2\u00b8\u00b9\f\7\2\2\u00b9\u00ba\7\t"+
		"\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\b\16\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00a0\3\2\2\2\u00be\u00a5\3\2\2\2\u00be\u00aa\3\2"+
		"\2\2\u00be\u00af\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\33\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00cb\b\17\1\2\u00c5"+
		"\u00c6\7\20\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\b\17\1\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c3\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2"+
		"\b\20\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\37\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\7\4\2\2\u00da\u00db\b\21\1"+
		"\2\u00db\u00fd\3\2\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\7\36\2\2\u00de"+
		"\u00df\5\32\16\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\b\21\1\2\u00e1\u00fd"+
		"\3\2\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4\b\21\1\2\u00e4\u00fd\3\2\2\2"+
		"\u00e5\u00e6\t\7\2\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9"+
		"\b\21\1\2\u00e9\u00fd\3\2\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ec\5\32\16\2"+
		"\u00ec\u00ed\7\4\2\2\u00ed\u00ee\b\21\1\2\u00ee\u00fd\3\2\2\2\u00ef\u00f0"+
		"\7\"\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\7\4\2\2\u00f2\u00f3\b\21\1"+
		"\2\u00f3\u00fd\3\2\2\2\u00f4\u00f5\t\7\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00fd"+
		"\b\21\1\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\7\4\2"+
		"\2\u00fa\u00fb\b\21\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00d8\3\2\2\2\u00fc"+
		"\u00dc\3\2\2\2\u00fc\u00e2\3\2\2\2\u00fc\u00e5\3\2\2\2\u00fc\u00ea\3\2"+
		"\2\2\u00fc\u00ef\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd"+
		"!\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\5\32\16"+
		"\2\u0101\u0102\7\17\2\2\u0102\u0103\7\f\2\2\u0103\u0104\5\36\20\2\u0104"+
		"\u0105\7\r\2\2\u0105\u0106\b\22\1\2\u0106\u011e\3\2\2\2\u0107\u0108\7"+
		"#\2\2\u0108\u0109\7\16\2\2\u0109\u010a\5\32\16\2\u010a\u010b\7\17\2\2"+
		"\u010b\u010c\7\f\2\2\u010c\u010d\5\36\20\2\u010d\u010e\7\r\2\2\u010e\u010f"+
		"\7$\2\2\u010f\u0110\7\f\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7\r\2\2"+
		"\u0112\u0113\b\22\1\2\u0113\u011e\3\2\2\2\u0114\u0115\7%\2\2\u0115\u0116"+
		"\7\16\2\2\u0116\u0117\5\32\16\2\u0117\u0118\7\17\2\2\u0118\u0119\7\f\2"+
		"\2\u0119\u011a\5\36\20\2\u011a\u011b\7\r\2\2\u011b\u011c\b\22\1\2\u011c"+
		"\u011e\3\2\2\2\u011d\u00fe\3\2\2\2\u011d\u0107\3\2\2\2\u011d\u0114\3\2"+
		"\2\2\u011e#\3\2\2\2\22\61\63Ndz}\u0084\u008b\u009e\u00be\u00c0\u00cb\u00ce"+
		"\u00d5\u00fc\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}