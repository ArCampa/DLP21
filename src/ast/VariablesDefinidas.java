/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	variablesDefinidas -> variablesdefinidas:variablesDefinidas*

public class VariablesDefinidas extends AbstractAST  {

	public VariablesDefinidas(List<VariablesDefinidas> variablesdefinidas) {
		this.variablesdefinidas = variablesdefinidas;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variablesdefinidas);
	}

	public VariablesDefinidas(Object variablesdefinidas) {
		this.variablesdefinidas = this.<VariablesDefinidas>getAstFromContexts(variablesdefinidas);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variablesdefinidas);
	}

	public List<VariablesDefinidas> getVariablesdefinidas() {
		return variablesdefinidas;
	}
	public void setVariablesdefinidas(List<VariablesDefinidas> variablesdefinidas) {
		this.variablesdefinidas = variablesdefinidas;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<VariablesDefinidas> variablesdefinidas;

	public String toString() {
       return "{variablesdefinidas:" + getVariablesdefinidas() + "}";
   }
}
