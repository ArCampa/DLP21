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
		T__9=10, T__10=11, T__11=12, LITENT=13, LITREAL=14, CHAR=15, IDENT=16, 
		LINE_COMMENT=17, MULTILINE_COMMENT=18, WHITESPACE=19;
	public static final int
		RULE_start = 0, RULE_declaraciones = 1, RULE_variableDefinida = 2, RULE_variable = 3, 
		RULE_tipo = 4, RULE_estructuraDefinida = 5, RULE_variablesStruct = 6, 
		RULE_metodoDefinido = 7, RULE_variablesParametros = 8, RULE_returnTipo = 9, 
		RULE_variablesDefinidas = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaraciones", "variableDefinida", "variable", "tipo", "estructuraDefinida", 
			"variablesStruct", "metodoDefinido", "variablesParametros", "returnTipo", 
			"variablesDefinidas"
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
			setState(22);
			((StartContext)_localctx).declaraciones = declaraciones();
			setState(23);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << IDENT))) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(26);
					((DeclaracionesContext)_localctx).variableDefinida = variableDefinida();
					_localctx.list.add(((DeclaracionesContext)_localctx).variableDefinida.ast);
					}
					break;
				case T__6:
					{
					setState(29);
					((DeclaracionesContext)_localctx).estructuraDefinida = estructuraDefinida();
					_localctx.list.add(((DeclaracionesContext)_localctx).estructuraDefinida.ast);
					}
					break;
				case IDENT:
					{
					setState(32);
					((DeclaracionesContext)_localctx).metodoDefinido = metodoDefinido();
					_localctx.list.add(((DeclaracionesContext)_localctx).metodoDefinido.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
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
			setState(40);
			match(T__0);
			setState(41);
			((VariableDefinidaContext)_localctx).variable = variable();
			((VariableDefinidaContext)_localctx).ast =  new VariableDefinida(((VariableDefinidaContext)_localctx).variable.ast);
			setState(43);
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
			setState(45);
			((VariableContext)_localctx).IDENT = match(IDENT);
			setState(46);
			match(T__2);
			setState(47);
			((VariableContext)_localctx).tipo = tipo();
			 ((VariableContext)_localctx).ast =  new Variable((((VariableContext)_localctx).IDENT!=null?((VariableContext)_localctx).IDENT.getText():null) , ((VariableContext)_localctx).tipo.ast);
					
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__3);
				((TipoContext)_localctx).ast =  new TipoInt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__4);
				((TipoContext)_localctx).ast =  new TipoFloat();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__5);
				((TipoContext)_localctx).ast =  new TipoChar();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				((TipoContext)_localctx).IDENT = match(IDENT);
				((TipoContext)_localctx).ast =  new TipoStruct((((TipoContext)_localctx).IDENT!=null?((TipoContext)_localctx).IDENT.getText():null));
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
		enterRule(_localctx, 10, RULE_estructuraDefinida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__6);
			setState(61);
			((EstructuraDefinidaContext)_localctx).IDENT = match(IDENT);
			setState(62);
			match(T__7);
			setState(63);
			((EstructuraDefinidaContext)_localctx).variablesStruct = variablesStruct();
			setState(64);
			match(T__8);
			setState(65);
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
		enterRule(_localctx, 12, RULE_variablesStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(68);
				((VariablesStructContext)_localctx).variable = variable();
				_localctx.list.add(((VariablesStructContext)_localctx).variable.ast);
				setState(70);
				match(T__1);
				}
				}
				setState(76);
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
		public ReturnTipoContext returnTipo;
		public VariablesDefinidasContext variablesDefinidas;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public VariablesParametrosContext variablesParametros() {
			return getRuleContext(VariablesParametrosContext.class,0);
		}
		public ReturnTipoContext returnTipo() {
			return getRuleContext(ReturnTipoContext.class,0);
		}
		public VariablesDefinidasContext variablesDefinidas() {
			return getRuleContext(VariablesDefinidasContext.class,0);
		}
		public MetodoDefinidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoDefinido; }
	}

	public final MetodoDefinidoContext metodoDefinido() throws RecognitionException {
		MetodoDefinidoContext _localctx = new MetodoDefinidoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metodoDefinido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IDENT);
			setState(78);
			match(T__9);
			setState(79);
			((MetodoDefinidoContext)_localctx).variablesParametros = variablesParametros();
			setState(80);
			match(T__10);
			setState(81);
			((MetodoDefinidoContext)_localctx).returnTipo = returnTipo();
			setState(82);
			match(T__7);
			setState(83);
			((MetodoDefinidoContext)_localctx).variablesDefinidas = variablesDefinidas();
			setState(84);
			match(T__8);
			 if(((MetodoDefinidoContext)_localctx).returnTipo.list.size()==1)
			    { ((MetodoDefinidoContext)_localctx).ast =  new MetodoDefinido(((MetodoDefinidoContext)_localctx).variablesParametros.list, ((MetodoDefinidoContext)_localctx).returnTipo.list.get(0), ((MetodoDefinidoContext)_localctx).variablesDefinidas.list);}
			    else
			    {((MetodoDefinidoContext)_localctx).ast =  new MetodoDefinido(((MetodoDefinidoContext)_localctx).variablesParametros.list, null, ((MetodoDefinidoContext)_localctx).variablesDefinidas.list);}
					
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
		enterRule(_localctx, 16, RULE_variablesParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(87);
				((VariablesParametrosContext)_localctx).primero = ((VariablesParametrosContext)_localctx).variable = variable();
				_localctx.list.add(((VariablesParametrosContext)_localctx).variable.ast);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(89);
					match(T__11);
					setState(90);
					((VariablesParametrosContext)_localctx).otro = ((VariablesParametrosContext)_localctx).variable = variable();
					_localctx.list.add(((VariablesParametrosContext)_localctx).variable.ast);
					}
					}
					setState(97);
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

	public static class ReturnTipoContext extends ParserRuleContext {
		public List<Tipo> list = new ArrayList<Tipo>();;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ReturnTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTipo; }
	}

	public final ReturnTipoContext returnTipo() throws RecognitionException {
		ReturnTipoContext _localctx = new ReturnTipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnTipo);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__2);
				setState(101);
				((ReturnTipoContext)_localctx).tipo = tipo();
				_localctx.list.add(((ReturnTipoContext)_localctx).tipo.ast);
				}
				break;
			case T__7:
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
		enterRule(_localctx, 20, RULE_variablesDefinidas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(107);
				((VariablesDefinidasContext)_localctx).variableDefinida = variableDefinida();
				_localctx.list.add((VariableDefinida) ((VariablesDefinidasContext)_localctx).variableDefinida.ast);
				}
				}
				setState(114);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3&\n\3\f"+
		"\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13\n\5\ne\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\7\fq\n\f\f\f\16\ft\13\f\3\f\2\2\r\2"+
		"\4\6\b\n\f\16\20\22\24\26\2\2\2u\2\30\3\2\2\2\4\'\3\2\2\2\6*\3\2\2\2\b"+
		"/\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16L\3\2\2\2\20O\3\2\2\2\22d\3\2\2\2\24"+
		"k\3\2\2\2\26r\3\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3\32\33\b\2\1\2\33\3\3"+
		"\2\2\2\34\35\5\6\4\2\35\36\b\3\1\2\36&\3\2\2\2\37 \5\f\7\2 !\b\3\1\2!"+
		"&\3\2\2\2\"#\5\20\t\2#$\b\3\1\2$&\3\2\2\2%\34\3\2\2\2%\37\3\2\2\2%\"\3"+
		"\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\7\3\2\2"+
		"+,\5\b\5\2,-\b\4\1\2-.\7\4\2\2.\7\3\2\2\2/\60\7\22\2\2\60\61\7\5\2\2\61"+
		"\62\5\n\6\2\62\63\b\5\1\2\63\t\3\2\2\2\64\65\7\6\2\2\65=\b\6\1\2\66\67"+
		"\7\7\2\2\67=\b\6\1\289\7\b\2\29=\b\6\1\2:;\7\22\2\2;=\b\6\1\2<\64\3\2"+
		"\2\2<\66\3\2\2\2<8\3\2\2\2<:\3\2\2\2=\13\3\2\2\2>?\7\t\2\2?@\7\22\2\2"+
		"@A\7\n\2\2AB\5\16\b\2BC\7\13\2\2CD\7\4\2\2DE\b\7\1\2E\r\3\2\2\2FG\5\b"+
		"\5\2GH\b\b\1\2HI\7\4\2\2IK\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2M\17\3\2\2\2NL\3\2\2\2OP\7\22\2\2PQ\7\f\2\2QR\5\22\n\2RS\7\r\2\2S"+
		"T\5\24\13\2TU\7\n\2\2UV\5\26\f\2VW\7\13\2\2WX\b\t\1\2X\21\3\2\2\2YZ\5"+
		"\b\5\2Za\b\n\1\2[\\\7\16\2\2\\]\5\b\5\2]^\b\n\1\2^`\3\2\2\2_[\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2dY\3\2\2\2de\3\2\2\2"+
		"e\23\3\2\2\2fg\7\5\2\2gh\5\n\6\2hi\b\13\1\2il\3\2\2\2jl\3\2\2\2kf\3\2"+
		"\2\2kj\3\2\2\2l\25\3\2\2\2mn\5\6\4\2no\b\f\1\2oq\3\2\2\2pm\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2tr\3\2\2\2\n%\'<Ladkr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}