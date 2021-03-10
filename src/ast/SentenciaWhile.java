/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	sentenciaWhile:sentencia -> expr:expresion  contenido:sentencia*

public class SentenciaWhile extends AbstractSentencia {

	public SentenciaWhile(Expresion expr, List<Sentencia> contenido) {
		this.expr = expr;
		this.contenido = contenido;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, contenido);
	}

	public SentenciaWhile(Object expr, Object contenido) {
		this.expr = (Expresion) getAST(expr);
		this.contenido = this.<Sentencia>getAstFromContexts(contenido);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, contenido);
	}

	public Expresion getExpr() {
		return expr;
	}
	public void setExpr(Expresion expr) {
		this.expr = expr;
	}

	public List<Sentencia> getContenido() {
		return contenido;
	}
	public void setContenido(List<Sentencia> contenido) {
		this.contenido = contenido;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expr;
	private List<Sentencia> contenido;

	public String toString() {
       return "{expr:" + getExpr() + ", contenido:" + getContenido() + "}";
   }
}
