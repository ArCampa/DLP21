/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionConstante:expresion -> constante:String

public class ExpresionConstante extends AbstractExpresion {

	public ExpresionConstante(String constante) {
		this.constante = constante;
	}

	public ExpresionConstante(Object constante) {
		this.constante = (constante instanceof Token) ? ((Token)constante).getText() : (String) constante;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(constante);
	}

	public String getConstante() {
		return constante;
	}
	public void setConstante(String constante) {
		this.constante = constante;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String constante;

	public String toString() {
       return "{constante:" + getConstante() + "}";
   }
}
