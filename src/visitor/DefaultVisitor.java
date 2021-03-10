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

	//	class MetodoDefinido { List<Variable> parametros;  Tipo retorno;  List<VariableDefinida> variablesDef; }
	public Object visit(MetodoDefinido node, Object param) {
		visitChildren(node.getParametros(), param);
		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);
		visitChildren(node.getVariablesDef(), param);
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

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
