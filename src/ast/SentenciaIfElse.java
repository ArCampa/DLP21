/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	sentenciaIfElse:sentencia -> expr:expresion  ifTrue:sentencia*  ifFalse:sentencia*

public class SentenciaIfElse extends AbstractSentencia {

	public SentenciaIfElse(Expresion expr, List<Sentencia> ifTrue, List<Sentencia> ifFalse) {
		this.expr = expr;
		this.ifTrue = ifTrue;
		this.ifFalse = ifFalse;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, ifTrue, ifFalse);
	}

	public SentenciaIfElse(Object expr, Object ifTrue, Object ifFalse) {
		this.expr = (Expresion) getAST(expr);
		this.ifTrue = this.<Sentencia>getAstFromContexts(ifTrue);
		this.ifFalse = this.<Sentencia>getAstFromContexts(ifFalse);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, ifTrue, ifFalse);
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

	public List<Sentencia> getIfFalse() {
		return ifFalse;
	}
	public void setIfFalse(List<Sentencia> ifFalse) {
		this.ifFalse = ifFalse;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expr;
	private List<Sentencia> ifTrue;
	private List<Sentencia> ifFalse;

	public String toString() {
       return "{expr:" + getExpr() + ", ifTrue:" + getIfTrue() + ", ifFalse:" + getIfFalse() + "}";
   }
}
