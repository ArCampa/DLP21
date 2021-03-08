/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Programa node, Object param);
	public Object visit(TipoSimple node, Object param);
	public Object visit(TipoStruct node, Object param);
	public Object visit(TipoFuncion node, Object param);
	public Object visit(TipoFuncionSinRetorno node, Object param);
	public Object visit(TipoComplejo node, Object param);
	public Object visit(TipoInt node, Object param);
	public Object visit(TipoChar node, Object param);
	public Object visit(TipoFloat node, Object param);
	public Object visit(Ident node, Object param);
	public Object visit(ArithmeticExpresion node, Object param);
	public Object visit(ParamExpresion node, Object param);
	public Object visit(IfStatement node, Object param);
	public Object visit(WhileStatement node, Object param);
	public Object visit(Asignacion node, Object param);
	public Object visit(PrintStatement node, Object param);
	public Object visit(ReadStatement node, Object param);
	public Object visit(ReturnStatement node, Object param);
	public Object visit(LlamadaFunc node, Object param);
	public Object visit(LlamadaCampo node, Object param);
}
