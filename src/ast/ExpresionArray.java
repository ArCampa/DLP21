/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionArray:expresion -> nombreArray:expresion  dim:expresion*

public class ExpresionArray extends AbstractExpresion {

	public ExpresionArray(Expresion nombreArray, List<Expresion> dim) {
		this.nombreArray = nombreArray;
		this.dim = dim;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombreArray, dim);
	}

	public ExpresionArray(Object nombreArray, Object dim) {
		this.nombreArray = (Expresion) getAST(nombreArray);
		this.dim = this.<Expresion>getAstFromContexts(dim);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombreArray, dim);
	}

	public Expresion getNombreArray() {
		return nombreArray;
	}
	public void setNombreArray(Expresion nombreArray) {
		this.nombreArray = nombreArray;
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

	private Expresion nombreArray;
	private List<Expresion> dim;

	public String toString() {
       return "{nombreArray:" + getNombreArray() + ", dim:" + getDim() + "}";
   }
}
