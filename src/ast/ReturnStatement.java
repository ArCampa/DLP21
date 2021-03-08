/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	returnStatement:sentencia -> expr:expresion

public class ReturnStatement extends AbstractSentencia {

	public ReturnStatement(Expresion expr) {
		this.expr = expr;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr);
	}

	public ReturnStatement(Object expr) {
		this.expr = (Expresion) getAST(expr);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr);
	}

	public Expresion getExpr() {
		return expr;
	}
	public void setExpr(Expresion expr) {
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expr;

	public String toString() {
       return "{expr:" + getExpr() + "}";
   }
}
