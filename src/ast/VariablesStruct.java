/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	variablesStruct -> variables:variable

public class VariablesStruct extends AbstractAST  {

	public VariablesStruct(Variable variables) {
		this.variables = variables;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variables);
	}

	public VariablesStruct(Object variables) {
		this.variables = (Variable) getAST(variables);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variables);
	}

	public Variable getVariables() {
		return variables;
	}
	public void setVariables(Variable variables) {
		this.variables = variables;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Variable variables;

	public String toString() {
       return "{variables:" + getVariables() + "}";
   }
}
