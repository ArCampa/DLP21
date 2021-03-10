/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionArray:expresion -> nombreArray:expresion  dim:String*

public class ExpresionArray extends AbstractExpresion {

	public ExpresionArray(Expresion nombreArray, List<String> dim) {
		this.nombreArray = nombreArray;
		this.dim = dim;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombreArray);
	}

	public ExpresionArray(Object nombreArray, Object dim) {
		this.nombreArray = (Expresion) getAST(nombreArray);
		this.dim = getTextFromTokens(dim);

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

	private Expresion nombreArray;
	private List<String> dim;

	public String toString() {
       return "{nombreArray:" + getNombreArray() + ", dim:" + getDim() + "}";
   }
}
