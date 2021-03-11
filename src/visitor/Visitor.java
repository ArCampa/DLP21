/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Programa node, Object param);
	public Object visit(VariableDefinida node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(Dimensiones node, Object param);
	public Object visit(EstructuraDefinida node, Object param);
	public Object visit(VariablesStruct node, Object param);
	public Object visit(MetodoDefinido node, Object param);
	public Object visit(VariablesParametros node, Object param);
	public Object visit(ReturnTipo node, Object param);
	public Object visit(VariablesDefinidas node, Object param);
	public Object visit(ExpresionParentesis node, Object param);
	public Object visit(ExpresionIdent node, Object param);
	public Object visit(ExpresionConstante node, Object param);
	public Object visit(ExpresionLlamadaMetodo node, Object param);
	public Object visit(ExpresionCampoStruct node, Object param);
	public Object visit(ExpresionArray node, Object param);
	public Object visit(ExpresionAritmetica node, Object param);
	public Object visit(ExpresionLogica node, Object param);
	public Object visit(ParametrosPasados node, Object param);
	public Object visit(SentenciaExpresion node, Object param);
	public Object visit(SentenciaAsignacion node, Object param);
	public Object visit(SentenciaIf node, Object param);
	public Object visit(SentenciaIfElse node, Object param);
	public Object visit(SentenciaWhile node, Object param);
	public Object visit(Sentencias node, Object param);
	public Object visit(SentenciaCondicional node, Object param);
	public Object visit(SentenciaPrint node, Object param);
	public Object visit(SentenciaRead node, Object param);
	public Object visit(SentenciaReturn node, Object param);
	public Object visit(SentenciaPrintVoid node, Object param);
	public Object visit(SentenciaReturnVoid node, Object param);
	public Object visit(TipoInt node, Object param);
	public Object visit(TipoFloat node, Object param);
	public Object visit(TipoChar node, Object param);
	public Object visit(TipoStruct node, Object param);
	public Object visit(TipoArray node, Object param);
}
