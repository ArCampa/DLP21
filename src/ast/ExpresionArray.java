/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionArray:expresion -> id:expresion  pos:expresion

public class ExpresionArray extends AbstractExpresion {

	public ExpresionArray(Expresion id, Expresion pos) {
		this.id = id;
		this.pos = pos;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(id, pos);
	}

	public ExpresionArray(Object id, Object pos) {
		this.id = (Expresion) getAST(id);
		this.pos = (Expresion) getAST(pos);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(id, pos);
	}

	public Expresion getId() {
		return id;
	}
	public void setId(Expresion id) {
		this.id = id;
	}

	public Expresion getPos() {
		return pos;
	}
	public void setPos(Expresion pos) {
		this.pos = pos;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion id;
	private Expresion pos;

	public String toString() {
       return "{id:" + getId() + ", pos:" + getPos() + "}";
   }
}
