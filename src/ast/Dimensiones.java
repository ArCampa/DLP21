/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	dimensiones -> dim:String*

public class Dimensiones extends AbstractAST  {

	public Dimensiones(List<String> dim) {
		this.dim = dim;
	}

	public Dimensiones(Object dim) {
		this.dim = getTextFromTokens(dim);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(dim);
	}

	public List<String> getDim() {
		return dim;
	}
	public void setDim(List<String> dim) {
		this.dim = dim;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<String> dim;

	public String toString() {
       return "{dim:" + getDim() + "}";
   }
}
