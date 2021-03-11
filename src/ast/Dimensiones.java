/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	dimensiones -> dim:expresion*

public class Dimensiones extends AbstractAST  {

	public Dimensiones(List<Expresion> dim) {
		this.dim = dim;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(dim);
	}

	public Dimensiones(Object dim) {
		this.dim = this.<Expresion>getAstFromContexts(dim);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(dim);
	}

	public List<Expresion> getDim() {
		return dim;
	}
	public void setDim(List<Expresion> dim) {
		this.dim = dim;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Expresion> dim;

	public String toString() {
       return "{dim:" + getDim() + "}";
   }
}
