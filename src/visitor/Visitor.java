/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Programa node, Object param);
	public Object visit(TipoInt node, Object param);
	public Object visit(TipoFloat node, Object param);
	public Object visit(TipoChar node, Object param);
	public Object visit(TipoStruct node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Asignacion node, Object param);
	public Object visit(ExpresionAritmetica node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(IntConstant node, Object param);
	public Object visit(FloatConstant node, Object param);
	public Object visit(CharConstant node, Object param);
	public Object visit(Identificador node, Object param);
}
