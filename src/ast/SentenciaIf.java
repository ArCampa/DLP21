/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	sentenciaIf:sentencia -> expr:expresion  ifTrue:sentencia*

public class SentenciaIf extends AbstractSentencia {

	public SentenciaIf(Expresion expr, List<Sentencia> ifTrue) {
		this.expr = expr;
		this.ifTrue = ifTrue;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, ifTrue);
	}

	public SentenciaIf(Object expr, Object ifTrue) {
		this.expr = (Expresion) getAST(expr);
		this.ifTrue = this.<Sentencia>getAstFromContexts(ifTrue);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, ifTrue);
	}

	public Expresion getExpr() {
		return expr;
	}
	public void setExpr(Expresion expr) {
		this.expr = expr;
	}

	public List<Sentencia> getIfTrue() {
		return ifTrue;
	}
	public void setIfTrue(List<Sentencia> ifTrue) {
		this.ifTrue = ifTrue;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expr;
	private List<Sentencia> ifTrue;

	public String toString() {
       return "{expr:" + getExpr() + ", ifTrue:" + getIfTrue() + "}";
   }
}
