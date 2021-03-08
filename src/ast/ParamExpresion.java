/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	paramExpresion:expresion -> parametro:String*

public class ParamExpresion extends AbstractExpresion {

	public ParamExpresion(List<String> parametro) {
		this.parametro = parametro;
	}

	public ParamExpresion(Object parametro) {
		this.parametro = getTextFromTokens(parametro);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametro);
	}

	public List<String> getParametro() {
		return parametro;
	}
	public void setParametro(List<String> parametro) {
		this.parametro = parametro;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<String> parametro;

	public String toString() {
       return "{parametro:" + getParametro() + "}";
   }
}
