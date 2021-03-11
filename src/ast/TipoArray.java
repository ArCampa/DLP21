/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	tipoArray:tipo -> dim:expresion*  type:tipo

public class TipoArray extends AbstractTipo {

	public TipoArray(List<Expresion> dim, Tipo type) {
		this.dim = dim;
		this.type = type;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(dim, type);
	}

	public TipoArray(Object dim, Object type) {
		this.dim = this.<Expresion>getAstFromContexts(dim);
		this.type = (Tipo) getAST(type);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(dim, type);
	}

	public List<Expresion> getDim() {
		return dim;
	}
	public void setDim(List<Expresion> dim) {
		this.dim = dim;
	}

	public Tipo getType() {
		return type;
	}
	public void setType(Tipo type) {
		this.type = type;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Expresion> dim;
	private Tipo type;

	public String toString() {
       return "{dim:" + getDim() + ", type:" + getType() + "}";
   }
}
