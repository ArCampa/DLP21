/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	sentenciaAsignacion:sentencia -> l:expresion  r:expresion

public class SentenciaAsignacion extends AbstractSentencia {

	public SentenciaAsignacion(Expresion l, Expresion r) {
		this.l = l;
		this.r = r;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(l, r);
	}

	public SentenciaAsignacion(Object l, Object r) {
		this.l = (Expresion) getAST(l);
		this.r = (Expresion) getAST(r);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(l, r);
	}

	public Expresion getL() {
		return l;
	}
	public void setL(Expresion l) {
		this.l = l;
	}

	public Expresion getR() {
		return r;
	}
	public void setR(Expresion r) {
		this.r = r;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion l;
	private Expresion r;

	public String toString() {
       return "{l:" + getL() + ", r:" + getR() + "}";
   }
}
