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

	//	class VariableDefinida { Variable var; }
	public Object visit(VariableDefinida node, Object param) {
		if (node.getVar() != null)
			node.getVar().accept(this, param);
		return null;
	}

	//	class Variable { String nombre;  Tipo tipado; }
	public Object visit(Variable node, Object param) {
		if (node.getTipado() != null)
			node.getTipado().accept(this, param);
		return null;
	}

	//	class Dimensiones { List<Expresion> dim; }
	public Object visit(Dimensiones node, Object param) {
		visitChildren(node.getDim(), param);
		return null;
	}

	//	class EstructuraDefinida { String nombre;  List<Variable> variables; }
	public Object visit(EstructuraDefinida node, Object param) {
		visitChildren(node.getVariables(), param);
		return null;
	}

	//	class VariablesStruct { Variable variables; }
	public Object visit(VariablesStruct node, Object param) {
		if (node.getVariables() != null)
			node.getVariables().accept(this, param);
		return null;
	}

	//	class MetodoDefinido { List<Variable> parametros;  Tipo retorno;  List<VariableDefinida> variablesDef;  List<Sentencia> sentenciasEj; }
	public Object visit(MetodoDefinido node, Object param) {
		visitChildren(node.getParametros(), param);
		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);
		visitChildren(node.getVariablesDef(), param);
		visitChildren(node.getSentenciasEj(), param);
		return null;
	}

	//	class VariablesParametros { List<Variable> variables; }
	public Object visit(VariablesParametros node, Object param) {
		visitChildren(node.getVariables(), param);
		return null;
	}

	//	class ReturnTipo { Tipo tipo; }
	public Object visit(ReturnTipo node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class VariablesDefinidas { List<VariablesDefinidas> variablesdefinidas; }
	public Object visit(VariablesDefinidas node, Object param) {
		visitChildren(node.getVariablesdefinidas(), param);
		return null;
	}

	//	class ExpresionParentesis { Expresion expr; }
	public Object visit(ExpresionParentesis node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class ExpresionIdent { String identificador; }
	public Object visit(ExpresionIdent node, Object param) {
		return null;
	}

	//	class ExpresionConstante { String constante; }
	public Object visit(ExpresionConstante node, Object param) {
		return null;
	}

	//	class ExpresionLlamadaMetodo { String nombre;  List<Expresion> parametros; }
	public Object visit(ExpresionLlamadaMetodo node, Object param) {
		visitChildren(node.getParametros(), param);
		return null;
	}

	//	class ExpresionCampoStruct { Expresion nombreStruct;  String campo; }
	public Object visit(ExpresionCampoStruct node, Object param) {
		if (node.getNombreStruct() != null)
			node.getNombreStruct().accept(this, param);
		return null;
	}

	//	class ExpresionArray { Expresion nombreArray;  List<Expresion> dim; }
	public Object visit(ExpresionArray node, Object param) {
		if (node.getNombreArray() != null)
			node.getNombreArray().accept(this, param);
		visitChildren(node.getDim(), param);
		return null;
	}

	//	class ExpresionAritmetica { Expresion l;  String op;  Expresion r; }
	public Object visit(ExpresionAritmetica node, Object param) {
		if (node.getL() != null)
			node.getL().accept(this, param);
		if (node.getR() != null)
			node.getR().accept(this, param);
		return null;
	}

	//	class ExpresionLogica { Expresion l;  String op;  Expresion r; }
	public Object visit(ExpresionLogica node, Object param) {
		if (node.getL() != null)
			node.getL().accept(this, param);
		if (node.getR() != null)
			node.getR().accept(this, param);
		return null;
	}

	//	class ParametrosPasados { List<Expresion> params; }
	public Object visit(ParametrosPasados node, Object param) {
		visitChildren(node.getParams(), param);
		return null;
	}

	//	class SentenciaExpresion { Expresion expr; }
	public Object visit(SentenciaExpresion node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class SentenciaAsignacion { Expresion l;  Expresion r; }
	public Object visit(SentenciaAsignacion node, Object param) {
		if (node.getL() != null)
			node.getL().accept(this, param);
		if (node.getR() != null)
			node.getR().accept(this, param);
		return null;
	}

	//	class SentenciaIf { Expresion expr;  List<Sentencia> ifTrue; }
	public Object visit(SentenciaIf node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		visitChildren(node.getIfTrue(), param);
		return null;
	}

	//	class SentenciaIfElse { Expresion expr;  List<Sentencia> ifTrue;  List<Sentencia> ifFalse; }
	public Object visit(SentenciaIfElse node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		visitChildren(node.getIfTrue(), param);
		visitChildren(node.getIfFalse(), param);
		return null;
	}

	//	class SentenciaWhile { Expresion expr;  List<Sentencia> contenido; }
	public Object visit(SentenciaWhile node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		visitChildren(node.getContenido(), param);
		return null;
	}

	//	class Sentencias { List<Sentencia> list; }
	public Object visit(Sentencias node, Object param) {
		visitChildren(node.getList(), param);
		return null;
	}

	//	class SentenciaCondicional { Sentencia condicional; }
	public Object visit(SentenciaCondicional node, Object param) {
		if (node.getCondicional() != null)
			node.getCondicional().accept(this, param);
		return null;
	}

	//	class SentenciaPrint { Expresion expr; }
	public Object visit(SentenciaPrint node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class SentenciaRead { Expresion expr; }
	public Object visit(SentenciaRead node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class SentenciaReturn { Expresion expr; }
	public Object visit(SentenciaReturn node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class SentenciaPrintVoid {  }
	public Object visit(SentenciaPrintVoid node, Object param) {
		return null;
	}

	//	class SentenciaReturnVoid {  }
	public Object visit(SentenciaReturnVoid node, Object param) {
		return null;
	}

	//	class TipoInt {  }
	public Object visit(TipoInt node, Object param) {
		return null;
	}

	//	class TipoFloat {  }
	public Object visit(TipoFloat node, Object param) {
		return null;
	}

	//	class TipoChar {  }
	public Object visit(TipoChar node, Object param) {
		return null;
	}

	//	class TipoStruct { String nombre; }
	public Object visit(TipoStruct node, Object param) {
		return null;
	}

	//	class TipoArray { List<Expresion> dim;  Tipo type; }
	public Object visit(TipoArray node, Object param) {
		visitChildren(node.getDim(), param);
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
