/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	variablesParametros -> variables:variable*

public class VariablesParametros extends AbstractAST  {

	public VariablesParametros(List<Variable> variables) {
		this.variables = variables;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variables);
	}

	public VariablesParametros(Object variables) {
		this.variables = this.<Variable>getAstFromContexts(variables);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variables);
	}

	public List<Variable> getVariables() {
		return variables;
	}
	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Variable> variables;

	public String toString() {
       return "{variables:" + getVariables() + "}";
   }
}
