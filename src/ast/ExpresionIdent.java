/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionIdent:expresion -> identificador:String

public class ExpresionIdent extends AbstractExpresion {

	public ExpresionIdent(String identificador) {
		this.identificador = identificador;
	}

	public ExpresionIdent(Object identificador) {
		this.identificador = (identificador instanceof Token) ? ((Token)identificador).getText() : (String) identificador;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(identificador);
	}

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String identificador;

	public String toString() {
       return "{identificador:" + getIdentificador() + "}";
   }
}
