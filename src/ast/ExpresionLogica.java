/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionLogica:expresion -> l:expresion  op:String  r:expresion

public class ExpresionLogica extends AbstractExpresion {

	public ExpresionLogica(Expresion l, String op, Expresion r) {
		this.l = l;
		this.op = op;
		this.r = r;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(l, r);
	}

	public ExpresionLogica(Object l, Object op, Object r) {
		this.l = (Expresion) getAST(l);
		this.op = (op instanceof Token) ? ((Token)op).getText() : (String) op;
		this.r = (Expresion) getAST(r);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(l, op, r);
	}

	public Expresion getL() {
		return l;
	}
	public void setL(Expresion l) {
		this.l = l;
	}

	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
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
	private String op;
	private Expresion r;

	public String toString() {
       return "{l:" + getL() + ", op:" + getOp() + ", r:" + getR() + "}";
   }
}
