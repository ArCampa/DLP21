/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	parametrosPasados -> params:expresion*

public class ParametrosPasados extends AbstractAST  {

	public ParametrosPasados(List<Expresion> params) {
		this.params = params;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params);
	}

	public ParametrosPasados(Object params) {
		this.params = this.<Expresion>getAstFromContexts(params);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params);
	}

	public List<Expresion> getParams() {
		return params;
	}
	public void setParams(List<Expresion> params) {
		this.params = params;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Expresion> params;

	public String toString() {
       return "{params:" + getParams() + "}";
   }
}
