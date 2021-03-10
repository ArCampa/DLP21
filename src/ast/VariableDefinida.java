/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	variableDefinida:definicion -> var:variable

public class VariableDefinida extends AbstractDefinicion {

	public VariableDefinida(Variable var) {
		this.var = var;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(var);
	}

	public VariableDefinida(Object var) {
		this.var = (Variable) getAST(var);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(var);
	}

	public Variable getVar() {
		return var;
	}
	public void setVar(Variable var) {
		this.var = var;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Variable var;

	public String toString() {
       return "{var:" + getVar() + "}";
   }
}
