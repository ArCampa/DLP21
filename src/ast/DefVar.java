/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	DefVar:definicion -> text:String  tipo:tipo

public class DefVar extends AbstractDefinicion {

	public DefVar(String text, Tipo tipo) {
		this.text = text;
		this.tipo = tipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public DefVar(Object text, Object tipo) {
		this.text = (text instanceof Token) ? ((Token)text).getText() : (String) text;
		this.tipo = (Tipo) getAST(tipo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(text, tipo);
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String text;
	private Tipo tipo;

	public String toString() {
       return "{text:" + getText() + ", tipo:" + getTipo() + "}";
   }
}
