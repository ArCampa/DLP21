/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	variable -> nombre:String  tipado:tipo

public class Variable extends AbstractAST  {

	public Variable(String nombre, Tipo tipado) {
		this.nombre = nombre;
		this.tipado = tipado;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipado);
	}

	public Variable(Object nombre, Object tipado) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.tipado = (Tipo) getAST(tipado);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, tipado);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipado() {
		return tipado;
	}
	public void setTipado(Tipo tipado) {
		this.tipado = tipado;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private Tipo tipado;

	public String toString() {
       return "{nombre:" + getNombre() + ", tipado:" + getTipado() + "}";
   }
}
