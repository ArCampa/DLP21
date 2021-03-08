/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	llamadaCampo:expresion -> estructura:expresion  nombre:String

public class LlamadaCampo extends AbstractExpresion {

	public LlamadaCampo(Expresion estructura, String nombre) {
		this.estructura = estructura;
		this.nombre = nombre;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(estructura);
	}

	public LlamadaCampo(Object estructura, Object nombre) {
		this.estructura = (Expresion) getAST(estructura);
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(estructura, nombre);
	}

	public Expresion getEstructura() {
		return estructura;
	}
	public void setEstructura(Expresion estructura) {
		this.estructura = estructura;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion estructura;
	private String nombre;

	public String toString() {
       return "{estructura:" + getEstructura() + ", nombre:" + getNombre() + "}";
   }
}
