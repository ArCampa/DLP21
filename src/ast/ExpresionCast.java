/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionCast:expresion -> type:tipo  ex:expresion

public class ExpresionCast extends AbstractExpresion {

	public ExpresionCast(Tipo type, Expresion ex) {
		this.type = type;
		this.ex = ex;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, ex);
	}

	public ExpresionCast(Object type, Object ex) {
		this.type = (Tipo) getAST(type);
		this.ex = (Expresion) getAST(ex);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, ex);
	}

	public Tipo getType() {
		return type;
	}
	public void setType(Tipo type) {
		this.type = type;
	}

	public Expresion getEx() {
		return ex;
	}
	public void setEx(Expresion ex) {
		this.ex = ex;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Tipo type;
	private Expresion ex;

	public String toString() {
       return "{type:" + getType() + ", ex:" + getEx() + "}";
   }
}
