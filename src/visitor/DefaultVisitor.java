/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Programa { List<Definicion> definiciones; }
	public Object visit(Programa node, Object param) {
		visitChildren(node.getDefiniciones(), param);
		return null;
	}

	//	class TipoSimple { String name;  Tipo tipo; }
	public Object visit(TipoSimple node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class TipoStruct { String name;  List<Definicion> defsNoVar; }
	public Object visit(TipoStruct node, Object param) {
		visitChildren(node.getDefsNoVar(), param);
		return null;
	}

	//	class TipoFuncion { String name;  List<Definicion> params;  Tipo returnType;  List<Sentencia> sentencias; }
	public Object visit(TipoFuncion node, Object param) {
		visitChildren(node.getParams(), param);
		if (node.getReturnType() != null)
			node.getReturnType().accept(this, param);
		visitChildren(node.getSentencias(), param);
		return null;
	}

	//	class TipoFuncionSinRetorno { String name;  List<Definicion> params;  List<Sentencia> sentencias; }
	public Object visit(TipoFuncionSinRetorno node, Object param) {
		visitChildren(node.getParams(), param);
		visitChildren(node.getSentencias(), param);
		return null;
	}

	//	class TipoComplejo { String name;  String estructura; }
	public Object visit(TipoComplejo node, Object param) {
		return null;
	}

	//	class TipoInt {  }
	public Object visit(TipoInt node, Object param) {
		return null;
	}

	//	class TipoChar {  }
	public Object visit(TipoChar node, Object param) {
		return null;
	}

	//	class TipoFloat {  }
	public Object visit(TipoFloat node, Object param) {
		return null;
	}

	//	class Ident {  }
	public Object visit(Ident node, Object param) {
		return null;
	}

	//	class ArithmeticExpresion { Expresion l;  String op;  Expresion r; }
	public Object visit(ArithmeticExpresion node, Object param) {
		if (node.getL() != null)
			node.getL().accept(this, param);
		if (node.getR() != null)
			node.getR().accept(this, param);
		return null;
	}

	//	class ParamExpresion { List<String> parametro; }
	public Object visit(ParamExpresion node, Object param) {
		return null;
	}

	//	class IfStatement { Expresion expr;  List<Sentencia> ifTrue;  List<Sentencia> ifFalse; }
	public Object visit(IfStatement node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		visitChildren(node.getIfTrue(), param);
		visitChildren(node.getIfFalse(), param);
		return null;
	}

	//	class WhileStatement { Expresion expr;  List<Sentencia> code; }
	public Object visit(WhileStatement node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		visitChildren(node.getCode(), param);
		return null;
	}

	//	class Asignacion { Expresion left;  Expresion right; }
	public Object visit(Asignacion node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class PrintStatement { Expresion expr; }
	public Object visit(PrintStatement node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class ReadStatement { Expresion expr; }
	public Object visit(ReadStatement node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class ReturnStatement { Expresion expr; }
	public Object visit(ReturnStatement node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class LlamadaFunc { String nombre;  List<Expresion> params; }
	public Object visit(LlamadaFunc node, Object param) {
		visitChildren(node.getParams(), param);
		return null;
	}

	//	class LlamadaCampo { Expresion estructura;  String nombre; }
	public Object visit(LlamadaCampo node, Object param) {
		if (node.getEstructura() != null)
			node.getEstructura().accept(this, param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
