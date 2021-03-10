/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	sentenciaCondicional -> condicional:sentencia

public class SentenciaCondicional extends AbstractAST  {

	public SentenciaCondicional(Sentencia condicional) {
		this.condicional = condicional;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicional);
	}

	public SentenciaCondicional(Object condicional) {
		this.condicional = (Sentencia) getAST(condicional);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicional);
	}

	public Sentencia getCondicional() {
		return condicional;
	}
	public void setCondicional(Sentencia condicional) {
		this.condicional = condicional;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Sentencia condicional;

	public String toString() {
       return "{condicional:" + getCondicional() + "}";
   }
}
