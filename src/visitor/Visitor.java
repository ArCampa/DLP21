/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Programa node, Object param);
	public Object visit(VariableDefinida node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(EstructuraDefinida node, Object param);
	public Object visit(VariablesStruct node, Object param);
	public Object visit(MetodoDefinido node, Object param);
	public Object visit(VariablesParametros node, Object param);
	public Object visit(ReturnTipo node, Object param);
	public Object visit(VariablesDefinidas node, Object param);
	public Object visit(TipoInt node, Object param);
	public Object visit(TipoFloat node, Object param);
	public Object visit(TipoChar node, Object param);
	public Object visit(TipoStruct node, Object param);
}
